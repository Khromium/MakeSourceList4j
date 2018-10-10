package NitTokyo;

import org.mozilla.universalchardet.UniversalDetector;

/**
 * 文字コードを判定するクラス.
 *
 * @author Administrator
 */
public class FileCharDetector {

    private String file;

    // コンストラクタ
    public FileCharDetector(String file) {
        this.file = file;
    }

    public String detector() throws java.io.IOException {
        byte[] buf = new byte[4096];
        String fileName = this.file;
        java.io.FileInputStream fis = new java.io.FileInputStream(fileName);

        // 文字コード判定ライブラリの実装
        UniversalDetector detector = new UniversalDetector(null);

        // 判定開始
        int nread;
        while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
            detector.handleData(buf, 0, nread);
        }
        // 判定終了
        detector.dataEnd();

        // 文字コード判定
        String encType = detector.getDetectedCharset();


        // 判定の初期化
        detector.reset();

        return encType;
    }
}