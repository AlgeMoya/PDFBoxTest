package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // PDF 문서 객체 생성
        PDDocument document = new PDDocument();

        try {
            // PDF 파일 경로
            String fileName = "C:/Users/User/Desktop/my_doc.pdf";
            File source = new File(fileName);

            // PDFBox 설정
            document = PDDocument.load(source);
            PDFTextStripper stripper = new PDFTextStripper();

            // 텍스트 추출
            // String text = new PDFTextStripper().getText(pdfDoc);
            String extractText = stripper.getText(document);
            
            // 문서 저장 ==> 저장후 출력문으로 확인
            // document.save("C:/Users/User/Desktop/my_doc.pdf");
            // System.out.println("PDF created / PDF 생성됨");
            System.out.println("PDF 내용 불러옴");
            System.out.println(extractText);

            // 문서 닫기
            document.close();


            // 공백 제거
            // extractText = extractText.trim().replace(" ", "");

            // 특정 문자 추출 (예제: 이메일)
            // Set<String> emails = new HashSet<>();

            /*
            // 이메일 정규식
            String regEx = "^[a-zA-Z0-9]+\@[a-zA-Z]+\.[a-zA-Z]+$";

            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(extractText);
             */

            /*
            // 추출한 텍스트에서 정규식에 의한 특정 문자 추출
            while (matcher.find()) {
                emails.add(matcher.group());
            }
            */

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}