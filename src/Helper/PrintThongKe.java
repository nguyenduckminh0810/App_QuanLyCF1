package Helper;

//import DAO.BanChitietDAO;
import Dao.BanChiTietDAO;
import Dao.HoaDonDAO;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PrintThongKe {

    HoaDonDAO hddao = new HoaDonDAO();
    BanChiTietDAO bctdao = new BanChiTietDAO();
    
    public void xuatpdf_ngay(DefaultTableModel model, DefaultTableModel model1) {

        // Tạo đối tượng Document với kích thước A4 và các lề (margin) cụ thể
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            // Tạo file PDF mới tại đường dẫn cụ thể
            File newFile = new File("E:\\zxcnmo\\App_QuanLyCF\\printthongke\\baocaongay.pdf");
            PdfWriter.getInstance(document, new FileOutputStream(newFile.getAbsoluteFile().getPath()));

            // Mở tài liệu để bắt đầu viết vào
            document.open();

            // Tạo các đối tượng Font với định dạng Arial
            Font f = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f.setSize(16); // Cỡ chữ cho tiêu đề chính
            Font f2 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f2.setSize(12); // Cỡ chữ cho các phần nội dung chính
            Font f3 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f3.setSize(10); // Cỡ chữ cho các phần nội dung phụ
            Font f4 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f4.setSize(14); // Cỡ chữ cho tiêu đề báo cáo
            f4.setColor(BaseColor.RED); // Màu chữ đỏ cho tiêu đề báo cáo

            // Thêm các đoạn văn với thông tin cơ bản
            Paragraph title1 = new Paragraph("Quản lý Coffee", f3);
            title1.setAlignment(Element.ALIGN_LEFT); // Căn trái
            document.add(title1);

            Paragraph title2 = new Paragraph("Địa chỉ: Hải Phòng", f3);
            title2.setAlignment(Element.ALIGN_LEFT); // Căn trái
            document.add(title2);

            Paragraph title3 = new Paragraph("Hotline: 0948341895", f3);
            title3.setAlignment(Element.ALIGN_LEFT); // Căn trái
            document.add(title3);

            // Thêm ngày hiện tại vào báo cáo
            Paragraph title4 = new Paragraph("Ngày: " + Xdate.toString(new Date(), "dd/MM/yyyy"), f3);
            title4.setAlignment(Element.ALIGN_LEFT); // Căn trái
            document.add(title4);

            // Thêm tiêu đề chính cho báo cáo
            Paragraph title5 = new Paragraph("THỐNG KÊ SẢN PHẨM,DOANH THU VÀ ĐƠN HỦY THEO NGÀY", f4);
            title5.setAlignment(Element.ALIGN_CENTER); // Căn giữa
            title5.setSpacingBefore(15); // Khoảng cách trước tiêu đề
            document.add(title5);

            // Tạo bảng để chứa thống kê doanh thu sản phẩm
            PdfPTable t = new PdfPTable(3);
            t.setSpacingBefore(15); // Khoảng cách trước bảng
            t.setSpacingAfter(35); // Khoảng cách sau bảng

            // Thêm tiêu đề cho các cột của bảng doanh thu sản phẩm
            PdfPCell c1 = new PdfPCell(new Phrase("Tên Sp", f2));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Số lượng bán", f2));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Tổng tiền", f2));
            t.addCell(c3);

            // Tạo bảng để chứa thông tin đơn hủy
            PdfPTable t1 = new PdfPTable(3);
            t1.setSpacingBefore(15); // Khoảng cách trước bảng
            t1.setSpacingAfter(35); // Khoảng cách sau bảng

            // Thêm tiêu đề cho các cột của bảng đơn hủy
            PdfPCell c11 = new PdfPCell(new Phrase("Mã NV", f2));
            t1.addCell(c11);
            PdfPCell c22 = new PdfPCell(new Phrase("Số lượng Đơn Hủy", f2));
            t1.addCell(c22);
            PdfPCell c33 = new PdfPCell(new Phrase("Số lượng Sản Phẩm Hủy", f2));
            t1.addCell(c33);

            // Thêm dữ liệu vào bảng doanh thu sản phẩm từ DefaultTableModel model
            for (int i = 0; i < model.getRowCount(); i++) {
                PdfPCell c5 = new PdfPCell(new Phrase(model.getValueAt(i, 0).toString(), f2));
                t.addCell(c5);
                t.addCell(model.getValueAt(i, 1).toString());
                t.addCell(model.getValueAt(i, 2).toString());
            }

            // Thêm dữ liệu vào bảng đơn hủy từ DefaultTableModel model1
            for (int i = 0; i < model1.getRowCount(); i++) {
                PdfPCell c5 = new PdfPCell(new Phrase(model1.getValueAt(i, 0).toString(), f2));
                t1.addCell(c5);
                t1.addCell(model1.getValueAt(i, 1).toString());
                t1.addCell(model1.getValueAt(i, 2).toString());
            }

            // Thêm bảng thống kê doanh thu sản phẩm vào tài liệu
            document.add(t);
            Paragraph title111 = new Paragraph("Doanh Thu Theo Sản Phẩm: ", f3);
            title111.setSpacingBefore(35); // Khoảng cách trước tiêu đề
            document.add(title111);

            // Thêm bảng đơn hủy vào tài liệu
            document.add(t1);
            Paragraph title222 = new Paragraph("Đơn Hủy Và Sản Phẩm Hủy: ", f3);
            title222.setSpacingBefore(15); // Khoảng cách trước tiêu đề
            document.add(title222);

            // Đóng tài liệu sau khi đã thêm tất cả các thành phần
            document.close();
            System.out.println("Write file succes!"); // Thông báo thành công
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông báo lỗi nếu có
        }
    }
    //Tương tự như trên chỉ đổi đường dẫn và 1 số thứ như MM/yyyy...
    public void xuatpdf_thang(DefaultTableModel model, DefaultTableModel model1) {

        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            File newFile = new File("E:\\zxcnmo\\App_QuanLyCF\\printthongke\\baocaothang.pdf");
            PdfWriter.getInstance(document, new FileOutputStream(newFile.getAbsoluteFile().getPath()));
            document.open();
            Font f = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f.setSize(16);
            Font f2 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f2.setSize(12);
            Font f3 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f3.setSize(10);

            Font f4 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f4.setSize(14);
            f4.setColor(BaseColor.RED);
            //f.setStyle(Font.NORMAL);
            Paragraph title1 = new Paragraph("App Quản Lý CF", f3);
            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title1);
            Paragraph title2 = new Paragraph("Hải Phòng", f3);

            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title2);
            Paragraph title3 = new Paragraph("0948341895", f3);
            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title3);
            Paragraph title0 = new Paragraph("Tháng: " + Xdate.toString(new Date(), "MM/yyyy"), f3);
            title0.setAlignment(Element.ALIGN_LEFT);
            document.add(title0);

            Paragraph title4 = new Paragraph("THỐNG KÊ SẢN PHẨM,DOANH THU VÀ ĐƠN HỦY THEO THÁNG", f4);
            //Chapter chapter1 = new Chapter(title1, 1);

            title4.setAlignment(Element.ALIGN_CENTER);
            title4.setSpacingBefore(15);
            document.add(title4);
            PdfPTable a = new PdfPTable(2);
            a.setSpacingBefore(35);

            PdfPTable t = new PdfPTable(3);
            t.setSpacingBefore(15);
            t.setSpacingAfter(35);

            PdfPCell c1 = new PdfPCell(new Phrase("Tên Sp", f2));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Số lượng bán", f2));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Tổng tiền", f2));
            t.addCell(c3);

            PdfPTable t1 = new PdfPTable(3);
            t1.setSpacingBefore(15);
            t1.setSpacingAfter(35);

            PdfPCell c11 = new PdfPCell(new Phrase("Mã NV", f2));
            t1.addCell(c11);
            PdfPCell c22 = new PdfPCell(new Phrase("Số lượng Đơn Hủy", f2));
            t1.addCell(c22);
            PdfPCell c33 = new PdfPCell(new Phrase("Số lượng Sản Phẩm Hủy", f2));
            t1.addCell(c33);

            for (int i = 0; i < model.getRowCount(); i++) {

                PdfPCell c5 = new PdfPCell(new Phrase(model.getValueAt(i, 0).toString(), f2));
                t.addCell(c5);
                t.addCell(model.getValueAt(i, 1).toString());
                t.addCell(model.getValueAt(i, 2).toString());

            }
            for (int i = 0; i < model1.getRowCount(); i++) {

                PdfPCell c5 = new PdfPCell(new Phrase(model1.getValueAt(i, 0).toString(), f2));
                t1.addCell(c5);
                t1.addCell(model1.getValueAt(i, 1).toString());
                t1.addCell(model1.getValueAt(i, 2).toString());

            }
            document.add(a);
            Paragraph title111 = new Paragraph("Doanh Thu Theo Sản Phẩm: ", f3);
            //Chapter chapter1 = new Chapter(title1, 1);

            title111.setSpacingBefore(35);
            document.add(title111);
            document.add(t);
            Paragraph title222 = new Paragraph("Đơn Hủy Và Sản Phẩm Hủy: ", f3);
            //Chapter chapter1 = new Chapter(title1, 1);

            title222.setSpacingBefore(15);
            document.add(title222);
            document.add(t1);


            document.close();
            System.out.println("Write file succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xuatpdf_nam(DefaultTableModel model, DefaultTableModel model1) {

        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            File newFile = new File("E:\\zxcnmo\\App_QuanLyCF\\printthongke\\baocaonam.pdf");
            PdfWriter.getInstance(document, new FileOutputStream(newFile.getAbsoluteFile().getPath()));
            document.open();
            Font f = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f.setSize(16);
            Font f2 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f2.setSize(12);
            Font f3 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f3.setSize(10);

            Font f4 = new Font(BaseFont.createFont("E:\\zxcnmo\\App_QuanLyCF\\font-times-new-roman.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f4.setSize(14);
            f4.setColor(BaseColor.RED);
            //f.setStyle(Font.NORMAL);
            Paragraph title1 = new Paragraph("App Quản Lý Coffee", f3);
            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title1);
            Paragraph title2 = new Paragraph("Hải Phòng", f3);

            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title2);
            Paragraph title3 = new Paragraph("0948341895", f3);
            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_LEFT);
            document.add(title3);

            Paragraph title0 = new Paragraph("Năm: " + Xdate.toString(new Date(), "yyyy"), f3);
            title0.setAlignment(Element.ALIGN_LEFT);
            document.add(title0);

            Paragraph title4 = new Paragraph("THỐNG KÊ SẢN PHẨM,DOANH THU VÀ ĐƠN HỦY THEO NĂM", f4);
            //Chapter chapter1 = new Chapter(title1, 1);

            title4.setAlignment(Element.ALIGN_CENTER);
            title4.setSpacingBefore(15);
            document.add(title4);
            PdfPTable a = new PdfPTable(2);
            a.setSpacingBefore(35);

            PdfPTable t = new PdfPTable(3);
            t.setSpacingBefore(15);
            t.setSpacingAfter(35);

            PdfPCell c1 = new PdfPCell(new Phrase("Tên Sp", f2));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Số lượng bán", f2));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Tổng tiền", f2));
            t.addCell(c3);

            PdfPTable t1 = new PdfPTable(3);
            t1.setSpacingBefore(15);
            t1.setSpacingAfter(35);

            PdfPCell c11 = new PdfPCell(new Phrase("Mã NV", f2));
            t1.addCell(c11);
            PdfPCell c22 = new PdfPCell(new Phrase("Số lượng Đơn Hủy", f2));
            t1.addCell(c22);
            PdfPCell c33 = new PdfPCell(new Phrase("Số lượng Sản Phẩm Hủy", f2));
            t1.addCell(c33);

            for (int i = 0; i < model.getRowCount(); i++) {

                PdfPCell c5 = new PdfPCell(new Phrase(model.getValueAt(i, 0).toString(), f2));
                t.addCell(c5);
                t.addCell(model.getValueAt(i, 1).toString());
                t.addCell(model.getValueAt(i, 2).toString());

            }
            for (int i = 0; i < model1.getRowCount(); i++) {

                PdfPCell c5 = new PdfPCell(new Phrase(model1.getValueAt(i, 0).toString(), f2));
                t1.addCell(c5);
                t1.addCell(model1.getValueAt(i, 1).toString());
                t1.addCell(model1.getValueAt(i, 2).toString());

            }
            document.add(a);
            Paragraph title111 = new Paragraph("Doanh Thu Theo Sản Phẩm: ", f3);
            //Chapter chapter1 = new Chapter(title1, 1);

            title111.setSpacingBefore(35);
            document.add(title111);
            document.add(t);
            Paragraph title222 = new Paragraph("Đơn Hủy Và Sản Phẩm Hủy: ", f3);
            //Chapter chapter1 = new Chapter(title1, 1);

            title222.setSpacingBefore(15);
            document.add(title222);
            document.add(t1);

            document.close();
            System.out.println("Write file succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
