package Helper;

import Dao.BanChiTietDAO;
import Dao.HoaDonDAO;
import Entity.HoaDonEntity;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author admin
 */
public class PrintPDF {

    HoaDonDAO hddao = new HoaDonDAO();
    BanChiTietDAO bctdao = new BanChiTietDAO();
    Locale vn = new Locale("vi", "VN");

    //NumberFormat nbf = 
    public void a(DefaultTableModel model, int mahd, int tienkh, int tienthoi) {
        // Lấy thông tin hóa đơn từ cơ sở dữ liệu bằng cách sử dụng mã hóa đơn
        HoaDonEntity hd = hddao.selectById(mahd);

        // Tạo đối tượng Document với kích thước A4 và các lề (margin) cụ thể
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            // Tạo file PDF mới với tên dựa trên mã hóa đơn
            File newFile = new File("E:\\zxcnmo\\App_QuanLyCF\\printhoadon\\HoaDon_" + mahd + ".pdf");
            PdfWriter.getInstance(document, new FileOutputStream(newFile.getAbsoluteFile().getPath()));

            // Mở tài liệu để bắt đầu viết vào
            document.open();

            // Tạo font với định dạng Times New Roman
            Font f = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f.setSize(16); // Cỡ chữ cho tiêu đề chính
            Font f2 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f2.setSize(14); // Cỡ chữ cho các phần nội dung

            // Thêm tiêu đề cho tài liệu
            Paragraph title1 = new Paragraph("Quản lý Coffee", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new CMYKColor(0, 255, 255, 17)));
            title1.setAlignment(Element.ALIGN_CENTER); // Căn giữa tiêu đề
            document.add(title1); // Thêm tiêu đề vào tài liệu

            // Tạo bảng để chứa thông tin hóa đơn
            PdfPTable a = new PdfPTable(2);
            a.setSpacingBefore(35); // Khoảng cách trước bảng

            // Thêm các ô vào bảng với thông tin địa chỉ, người tạo, mã đơn và ngày tạo
            PdfPCell a8 = new PdfPCell(new Phrase("Địa chỉ: Hải Phòng.", f2));
            a.addCell(a8).setBorder(0); // Ô không có viền
            PdfPCell a7 = new PdfPCell(new Phrase("", f2));
            a.addCell(a7).setBorder(0);
            PdfPCell a1 = new PdfPCell(new Phrase("Người tạo: " + Auth.user.getTenNV(), f2));
            a.addCell(a1).setBorder(0);
            PdfPCell a6 = new PdfPCell(new Phrase("", f2));
            a.addCell(a6).setBorder(0);
            PdfPCell a2 = new PdfPCell(new Phrase("Mã đơn: " + hd.getIdHoaDon(), f2));
            a.addCell(a2).setBorder(0);
            PdfPCell a3 = new PdfPCell(new Phrase("", f2));
            a.addCell(a3).setBorder(0);
            PdfPCell a4 = new PdfPCell(new Phrase("Ngày tạo: " + bctdao.selectByIdHD(mahd).get(0).getThoidiemCoNguoi(), f2));
            a.addCell(a4).setBorder(0);
            PdfPCell a5 = new PdfPCell(new Phrase(hd.getNgayTao() + "", f2));
            a.addCell(a5).setBorder(0);

            // Thêm bảng thông tin vào tài liệu
            document.add(a);

            // Tạo bảng để chứa các chi tiết của hóa đơn
            PdfPTable t = new PdfPTable(5);
            t.setSpacingBefore(35); // Khoảng cách trước bảng
            t.setSpacingAfter(35); // Khoảng cách sau bảng

            // Thêm tiêu đề cho các cột của bảng
            PdfPCell c1 = new PdfPCell(new Phrase("Mặt hàng", f));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Số lượng", f));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Giá (VND)", f));
            t.addCell(c3);
            PdfPCell c0 = new PdfPCell(new Phrase("Size", f));
            t.addCell(c0);
            PdfPCell c4 = new PdfPCell(new Phrase("Thành tiền", f));
            t.addCell(c4);

            // Thêm dữ liệu của hóa đơn vào bảng
            for (int i = 0; i < model.getRowCount(); i++) {
                if (mahd == Integer.parseInt(model.getValueAt(i, 0).toString())) {
                    PdfPCell c5 = new PdfPCell(new Phrase(model.getValueAt(i, 2).toString(), f2));
                    t.addCell(c5);
                    t.addCell(model.getValueAt(i, 3).toString());
                    t.addCell(model.getValueAt(i, 4).toString());
                    t.addCell(model.getValueAt(i, 5).toString());
                    t.addCell(model.getValueAt(i, 7).toString());
                }
            }

            // Thêm bảng chi tiết hóa đơn vào tài liệu
            document.add(t);

            // Tạo bảng để chứa thông tin thanh toán
            PdfPTable b = new PdfPTable(2);
            PdfPCell b1 = new PdfPCell(new Phrase("Tổng tiền: ", f2));
            b.addCell(b1).setBorder(0); // Ô không có viền
            PdfPCell b2 = new PdfPCell(new Phrase("" + NumberFormat.getInstance().format(hd.getThanhTien()) + " VND", f2));
            b.addCell(b2).setBorder(0);
            PdfPCell b3 = new PdfPCell(new Phrase("Tiền khách trả: ", f2));
            b.addCell(b3).setBorder(0);
            PdfPCell b4 = new PdfPCell(new Phrase("" + NumberFormat.getInstance().format(tienkh) + " VND", f2));
            b.addCell(b4).setBorder(0);

            // Thêm bảng thông tin thanh toán vào tài liệu
            document.add(b);

            // Đóng tài liệu sau khi đã thêm tất cả các thành phần
            document.close();
            System.out.println("Write file succes!"); // Thông báo thành công
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông báo lỗi nếu có
        }
    }
}
