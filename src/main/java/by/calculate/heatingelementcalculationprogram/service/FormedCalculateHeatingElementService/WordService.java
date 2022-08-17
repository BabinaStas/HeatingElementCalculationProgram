package by.calculate.heatingelementcalculationprogram.service.FormedCalculateHeatingElementService;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

import static org.apache.poi.xwpf.usermodel.ParagraphAlignment.CENTER;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

public class WordService {

    public static void getWord(List<String> listOfFormedCalculateForm) throws FileNotFoundException {

        File file = new File("resource\\printCalculation.docx");
        XWPFDocument document = new XWPFDocument();
        addTitle(document);
        addBodyText(document,listOfFormedCalculateForm);
        addTable(document, listOfFormedCalculateForm);


        try (FileOutputStream wordStream = new FileOutputStream(file)){
            document.write(wordStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void addTitle(XWPFDocument document) {
        XWPFParagraph titleParagraph = document.createParagraph();
        titleParagraph.setAlignment(CENTER);
        XWPFRun paragraphConfig = titleParagraph.createRun();
        paragraphConfig.setBold(true);
        paragraphConfig.setFontSize(16);
        paragraphConfig.setColor("000000");
        paragraphConfig.setFontFamily("Times New Roman");
        paragraphConfig.setText("Расчет для основного производства");
    }

    private static void addBodyText(XWPFDocument document, List<String> listOfFormedCalculateForm) {
        XWPFParagraph bodyParagraph = document.createParagraph();
        bodyParagraph.setAlignment(CENTER);
        XWPFRun bodyParagraphConfig = bodyParagraph.createRun();
        bodyParagraphConfig.setFontSize(16);
        bodyParagraphConfig.setFontFamily("Times New Roman");
        bodyParagraphConfig.setText("ТЭН - "
                + listOfFormedCalculateForm.get(0) + " "
                + listOfFormedCalculateForm.get(1) + " "
                + listOfFormedCalculateForm.get(2)
                + " / "
                + listOfFormedCalculateForm.get(3) + " "
                + listOfFormedCalculateForm.get(4) + " "
                + listOfFormedCalculateForm.get(5) + "\n"
                + "Дата: " + listOfFormedCalculateForm.get(13) + " "
                + "Заказчик: " + listOfFormedCalculateForm.get(7) + " "
                + "Вид производства: " + listOfFormedCalculateForm.get(8) + " "
                + "Колиество в заказе: " + listOfFormedCalculateForm.get(6) + " "
                + "Номер заказа: " + listOfFormedCalculateForm.get(9) + " ");
    }

    private static void addTable(XWPFDocument document, List<String> listOfFormedCalculateForm) {
        XWPFTable table = document.createTable();

        CTTblWidth widthRepr = table.getCTTbl().getTblPr().addNewTblW();
        widthRepr.setType(STTblWidth.DXA);
        widthRepr.setW(BigInteger.valueOf(6000));

        table.setInsideVBorder(XWPFTable.XWPFBorderType.SINGLE, 10, 0, "000000");
        table.setInsideHBorder(XWPFTable.XWPFBorderType.SINGLE, 10, 0, "000000");

        List<XWPFTableRow> rows = table.getRows();
        XWPFTableCell cell_0_0 = rows.get(0).getCell(0);
        cell_0_0.setText("Вид переклаза");
        XWPFTableCell cell_0_1 = rows.get(0).createCell();
        cell_0_1.setText(listOfFormedCalculateForm.get(14));


        table.createRow();
        XWPFTableCell cell_1_0 = rows.get(1).getCell(0);
        cell_1_0.setText("Материал сплава спирали");
        XWPFTableCell cell_1_1 = rows.get(1).getCell(1);
        cell_1_1.setText(listOfFormedCalculateForm.get(15));

        table.createRow();
        XWPFTableCell cell_2_0 = rows.get(2).getCell(0);
        cell_2_0.setText("Диаметр оправки, мм");
        XWPFTableCell cell_2_1 = rows.get(2).getCell(1);
        cell_2_1.setText(listOfFormedCalculateForm.get(16));

        table.createRow();
        XWPFTableCell cell_3_0 = rows.get(3).getCell(0);
        cell_3_0.setText("Диаметр проволоки, мм");
        XWPFTableCell cell_3_1 = rows.get(3).getCell(1);
        cell_3_1.setText(listOfFormedCalculateForm.get(10));

        table.createRow();
        XWPFTableCell cell_4_0 = rows.get(4).getCell(0);
        cell_4_0.setText("Шпилька (длинна загатовки), мм");
        XWPFTableCell cell_4_1 = rows.get(4).getCell(1);
        cell_4_1.setText(listOfFormedCalculateForm.get(25));

        table.createRow();
        XWPFTableCell cell_5_0 = rows.get(5).getCell(0);
        cell_5_0.setText("Сопротивление нагревательного элемента, Ом");
        XWPFTableCell cell_5_1 = rows.get(5).getCell(1);
        cell_5_1.setText(listOfFormedCalculateForm.get(26));

        table.createRow();
        XWPFTableCell cell_6_0 = rows.get(6).getCell(0);
        cell_6_0.setText("Допускайемый интервал сопротивления н.э., Ом");
        XWPFTableCell cell_6_1 = rows.get(6).getCell(1);
        cell_6_1.setText(listOfFormedCalculateForm.get(27));

        table.createRow();
        XWPFTableCell cell_7_0 = rows.get(7).getCell(0);
        cell_7_0.setText("Длинна сжатой спирали, мм");
        XWPFTableCell cell_7_1 = rows.get(7).getCell(1);
        cell_7_1.setText(listOfFormedCalculateForm.get(28));

        table.createRow();
        XWPFTableCell cell_8_0 = rows.get(8).getCell(0);
        cell_8_0.setText("Общая длинна проволоки, мм");
        XWPFTableCell cell_8_1 = rows.get(8).getCell(1);
        cell_8_1.setText(listOfFormedCalculateForm.get(29));

        table.createRow();
        XWPFTableCell cell_9_0 = rows.get(9).getCell(0);
        cell_9_0.setText("Длинна активной части, см");
        XWPFTableCell cell_9_1 = rows.get(9).getCell(1);
        cell_9_1.setText(listOfFormedCalculateForm.get(30));

        table.createRow();
        XWPFTableCell cell_10_0 = rows.get(10).getCell(0);
        cell_10_0.setText("Удельная нагрузка на проволку, Вт/см2");
        XWPFTableCell cell_10_1 = rows.get(10).getCell(1);
        cell_10_1.setText(listOfFormedCalculateForm.get(17));

        table.createRow();
        XWPFTableCell cell_11_0 = rows.get(11).getCell(0);
        cell_11_0.setText("Диаметр трубы, мм");
        XWPFTableCell cell_11_1 = rows.get(11).getCell(1);
        cell_11_1.setText(listOfFormedCalculateForm.get(23));

        table.createRow();
        XWPFTableCell cell_12_0 = rows.get(12).getCell(0);
        cell_12_0.setText("Толщена стенки трубы, мм");
        XWPFTableCell cell_12_1 = rows.get(12).getCell(1);
        cell_12_1.setText(listOfFormedCalculateForm.get(24));

        table.createRow();
        XWPFTableCell cell_13_0 = rows.get(13).getCell(0);
        cell_13_0.setText("Длинна заготовки трубы, мм");
        XWPFTableCell cell_13_1 = rows.get(13).getCell(1);
        cell_13_1.setText(listOfFormedCalculateForm.get(31));

        table.createRow();
        XWPFTableCell cell_14_0 = rows.get(14).getCell(0);
        cell_14_0.setText("Коэффициент удлиннения трубы при обжатии");
        XWPFTableCell cell_14_1 = rows.get(14).getCell(1);
        cell_14_1.setText(listOfFormedCalculateForm.get(11));

        table.createRow();
        XWPFTableCell cell_15_0 = rows.get(15).getCell(0);
        cell_15_0.setText("Коэффициент приведения спирали при включении");
        XWPFTableCell cell_15_1 = rows.get(15).getCell(1);
        cell_15_1.setText(listOfFormedCalculateForm.get(12));

        table.createRow();
        XWPFTableCell cell_16_0 = rows.get(16).getCell(0);
        cell_16_0.setText("ГОСТ");
        XWPFTableCell cell_16_1 = rows.get(16).getCell(1);
        cell_16_1.setText(listOfFormedCalculateForm.get(18));

        table.createRow();
        XWPFTableCell cell_17_0 = rows.get(17).getCell(0);
        cell_17_0.setText("Тип контактной шпильки верх");
        XWPFTableCell cell_17_1 = rows.get(17).getCell(1);
        cell_17_1.setText(listOfFormedCalculateForm.get(19));

        table.createRow();
        XWPFTableCell cell_18_0 = rows.get(18).getCell(0);
        cell_18_0.setText("Тип контактной шпильки низ");
        XWPFTableCell cell_18_1 = rows.get(18).getCell(1);
        cell_18_1.setText(listOfFormedCalculateForm.get(20));

        table.createRow();
        XWPFTableCell cell_19_0 = rows.get(19).getCell(0);
        cell_19_0.setText("Вылет верх");
        XWPFTableCell cell_19_1 = rows.get(19).getCell(1);
        cell_19_1.setText(listOfFormedCalculateForm.get(21));

        table.createRow();
        XWPFTableCell cell_20_0 = rows.get(20).getCell(0);
        cell_20_0.setText("Вылет низ");
        XWPFTableCell cell_20_1 = rows.get(20).getCell(1);
        cell_20_1.setText(listOfFormedCalculateForm.get(22));
    }
}
