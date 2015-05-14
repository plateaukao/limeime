package net.toload.main.hd;

import android.os.Environment;

import java.text.DecimalFormat;

/**
 * Created by Art Hung on 2015/4/24.
 */
public class Lime {

    // Database Setting

    final public static String DATABASE_NAME = "lime.db";
    final public static String DATABASE_DEVICE_FOLDER =  Environment.getDataDirectory() + "/data/net.toload.main.hd/databases";
    final public static String DATABASE_DECOMPRESS_FOLDER_SDCARD = Environment.getExternalStorageDirectory() + "/limehd/databases";
    final public static String DATABASE_FOLDER_EXTERNAL = Environment.getExternalStorageDirectory() + "/limehd/";
    final public static String DATABASE_BACKUP_NAME = "backup.zip";
    final public static String DATABASE_CLOUD_TEMP = "cloudtemp.zip";

    // Input Method Editor Online Database Location
    // https://github.com/hosoyu/LimeStudio/raw/master/Database/array.zip

    public static final String separator = java.io.File.separator;

    public static final String DATABASE_IM_TEMP = "temp.zip";

    public static final String DATABASE_CLOUD_URL_BASED = "https://github.com/hosoyu/LimeStudio/raw/master/Database/";
    public static final String DATABASE_CLOUD_IM_WB = DATABASE_CLOUD_URL_BASED + "wb.zip";
    public static final String DATABASE_CLOUD_IM_WB_KEYBOARD = "wb";

    public static final String DATABASE_CLOUD_IM_PINYINGB = DATABASE_CLOUD_URL_BASED + "pinyingb.zip";
    public static final String DATABASE_CLOUD_IM_PINYINGB_KEYBOARD = "lime";

    public static final String DATABASE_CLOUD_IM_PINYIN = DATABASE_CLOUD_URL_BASED + "pinyin.zip";
    public static final String DATABASE_CLOUD_IM_PINYIN_KEYBOARD = "lime";

    public static final String DATABASE_CLOUD_IM_PHONETICCOMPLETE = DATABASE_CLOUD_URL_BASED + "phoneticcomplete.zip";
    public static final String DATABASE_CLOUD_IM_PHONETICCOMPLETE_KEYBOARD = "phonetic";

    public static final String DATABASE_CLOUD_IM_PHONETIC = DATABASE_CLOUD_URL_BASED + "phonetic.zip";
    public static final String DATABASE_CLOUD_IM_PHONETIC_KEYBOARD = "phonetic";

    public static final String DATABASE_CLOUD_IM_EZ = DATABASE_CLOUD_URL_BASED + "ez.zip";
    public static final String DATABASE_CLOUD_IM_EZ_KEYBOARD = "ez";

    public static final String DATABASE_CLOUD_IM_ECJHK = DATABASE_CLOUD_URL_BASED + "ecjhkzip";
    public static final String DATABASE_CLOUD_IM_ECJHK_KEYBOARD = "cj";

    public static final String DATABASE_CLOUD_IM_ECJ = DATABASE_CLOUD_URL_BASED + "ecj.zip";
    public static final String DATABASE_CLOUD_IM_ECJ_KEYBOARD = "cj";

    public static final String DATABASE_CLOUD_IM_DAYI = DATABASE_CLOUD_URL_BASED + "dayi.zip";
    public static final String DATABASE_CLOUD_IM_DAYI_KEYBOARD = "dayisym";

    public static final String DATABASE_CLOUD_IM_CJHK = DATABASE_CLOUD_URL_BASED + "cjhk.zip";
    public static final String DATABASE_CLOUD_IM_CJHK_KEYBOARD = "cj";

    public static final String DATABASE_CLOUD_IM_SCJ = DATABASE_CLOUD_URL_BASED + "scj.zip";
    public static final String DATABASE_CLOUD_IM_SCJ_KEYBOARD = "limenum";

    public static final String DATABASE_CLOUD_IM_CJ5 = DATABASE_CLOUD_URL_BASED + "cj5.zip";
    public static final String DATABASE_CLOUD_IM_CJ5_KEYBOARD = "cj";

    public static final String DATABASE_CLOUD_IM_CJ = DATABASE_CLOUD_URL_BASED + "cj.zip";
    public static final String DATABASE_CLOUD_IM_CJ_KEYBOARD = "cj";

    public static final String DATABASE_CLOUD_IM_ARRAY10 = DATABASE_CLOUD_URL_BASED + "array10.zip";
    public static final String DATABASE_CLOUD_IM_ARRAY10_KEYBOARD = "phonenum";

    public static final String DATABASE_CLOUD_IM_ARRAY = DATABASE_CLOUD_URL_BASED + "array.zip";
    public static final String DATABASE_CLOUD_IM_ARRAY_KEYBOARD = "arraynum";

    // Database Tables and columns

    public static final String DB_TABLE_IMTABLE2 = "imtable2";
    public static final String DB_TABLE_IMTABLE3 = "imtable3";
    public static final String DB_TABLE_IMTABLE4 = "imtable4";
    public static final String DB_TABLE_IMTABLE5 = "imtable5";
    public static final String DB_TABLE_IMTABLE6 = "imtable6";
    public static final String DB_TABLE_IMTABLE7 = "imtable7";
    public static final String DB_TABLE_IMTABLE8 = "imtable8";
    public static final String DB_TABLE_IMTABLE9 = "imtable9";
    public static final String DB_TABLE_IMTABLE10 = "imtable10";

    public static final String DB_TABLE_ARRAY = "array";
    public static final String DB_TABLE_ARRAY10 = "array10";
    public static final String DB_TABLE_CJ = "cj";
    public static final String DB_TABLE_CJ5 = "cj5";
    public static final String DB_TABLE_CUSTOM = "custom";
    public static final String DB_TABLE_DAYI = "dayi";
    public static final String DB_TABLE_ECJ = "ecj";
    public static final String DB_TABLE_EZ = "ez";
    public static final String DB_TABLE_HS = "hs";
    public static final String DB_TABLE_PHONETIC = "phonetic";
    public static final String DB_TABLE_PINYIN = "pinyin";
    public static final String DB_TABLE_SCJ = "scj";
    public static final String DB_TABLE_WB = "wb";
    
    public static final String IM_ARRAY = "array";
    public static final String IM_ARRAY10 = "array10";
    public static final String IM_CJ = "cj";
    public static final String IM_CJHK = "cjhk";
    public static final String IM_CJ5 = "cj5";
    public static final String IM_CUSTOM = "custom";
    public static final String IM_DAYI = "dayi";
    public static final String IM_ECJ = "ecj";
    public static final String IM_ECJHK = "ecjhk";
    public static final String IM_EZ = "ez";
    public static final String IM_HS = "hs";
    public static final String IM_PHONETIC = "phonetic";
    public static final String IM_PHONETIC_ADV = "phoneticadv";
    public static final String IM_PINYIN = "pinyin";
    public static final String IM_PINYINGB = "pinyin";
    public static final String IM_SCJ = "scj";
    public static final String IM_WB = "wb";


    public static final String DB_COLUMN_ID = "_id";

    public static final String DB_COLUMN_CODE = "code";
    public static final String DB_COLUMN_CODE3R = "code3r";
    public static final String DB_COLUMN_WORD = "word";
    public static final String DB_COLUMN_RELATED = "related";
    public static final String DB_COLUMN_SCORE = "score";
    public static final String DB_COLUMN_BASESCORE = "basescore";

    public static final String DB_IM = "im";
    public static final String DB_IM_COLUMN_ID = "_id";
    public static final String DB_IM_COLUMN_CODE = "code";
    public static final String DB_IM_COLUMN_TITLE = "title";
    public static final String DB_IM_COLUMN_DESC = "desc";
    public static final String DB_IM_COLUMN_KEYBOARD = "keyboard";
    public static final String DB_IM_COLUMN_DISABLE = "disable";
    public static final String DB_IM_COLUMN_SELKEY = "selkey";
    public static final String DB_IM_COLUMN_ENDKEY = "endkey";
    public static final String DB_IM_COLUMN_SPACESTYLE = "spacestyle";


    public static final String DB_RELATED = "related";
    public static final String DB_RELATED_COLUMN_ID = "_id";
    public static final String DB_RELATED_COLUMN_PWORD = "pword";
    public static final String DB_RELATED_COLUMN_CWORD = "cword";
    public static final String DB_RELATED_COLUMN_SCORE = "score";

    public static final String DB_KEYBOARD = "keyboard";
    public static final String DB_KEYBOARD_COLUMN_ID = "_id";
    public static final String DB_KEYBOARD_COLUMN_CODE = "code";
    public static final String DB_KEYBOARD_COLUMN_NAME = "name";
    public static final String DB_KEYBOARD_COLUMN_DESC = "desc";
    public static final String DB_KEYBOARD_COLUMN_TYPE = "type";
    public static final String DB_KEYBOARD_COLUMN_IMAGE = "image";
    public static final String DB_KEYBOARD_COLUMN_IMKB = "imkb";
    public static final String DB_KEYBOARD_COLUMN_IMSHIFTKB = "imshiftkb";
    public static final String DB_KEYBOARD_COLUMN_ENGKB = "engkb";
    public static final String DB_KEYBOARD_COLUMN_ENGSHIFTKB = "engshiftkb";
    public static final String DB_KEYBOARD_COLUMN_SYMBOLKB = "symbolkb";
    public static final String DB_KEYBOARD_COLUMN_SYMBOLSHIFTKB = "symbolshiftkb";
    public static final String DB_KEYBOARD_COLUMN_DEFAULTKB = "defaultkb";
    public static final String DB_KEYBOARD_COLUMN_DEFAULTSHIFTKB = "defaultshiftkb";
    public static final String DB_KEYBOARD_COLUMN_EXTENDEDKB = "extendedkb";
    public static final String DB_KEYBOARD_COLUMN_EXTENDEDSHIFTKB = "extendedshiftkb";
    public static final String DB_KEYBOARD_COLUMN_DISABLE = "disable";
    public static final String DB_TOTAL_COUNT ="count";

    public static final String IM_TYPE_NAME = "name";
    public static final String IM_TYPE_SOURCE = "source";
    public static final String IM_TYPE_AMOUNT = "amount";
    public static final String IM_TYPE_IMPORT = "import";
    public static final String IM_TYPE_KEYBOARD = "keyboard";

    public static final int IM_MANAGE_DISPLAY_AMOUNT = 100;

    // Cloud Backup/Restore
    // Dropbox
    public static final String DATABASE_DOWNLOAD_STATUS = "database_download_status";


    public final static String ACCOUNT_PREFS_NAME = "prefs";
    public final static String ACCESS_KEY_NAME = "ACCESS_KEY";
    public final static String ACCESS_SECRET_NAME = "ACCESS_SECRET";

    public static final String BACKUP = "backup";
    public static final String RESTORE = "restore";

    public static final String GOOGLE = "GOOGLE";
    public static final String GOOGLE_ACCOUNT_NAME = "GOOGLE_ACCOUNT_NAME";
    public static final String GOOGLE_BACKUP_FILENAME = "limedatabasebackup.zip";

    public static final String LOCAL = "LOCAL";

    public static final String DROPBOX = "DROPBOX";
    public static final String DROPBOX_TYPE = "DROPBOX_TYPE";
    // old dropbox key paris
    public final static String DROPBOX_APP_KEY = "keuuzhfc6efjf6t";
    public final static String DROPBOX_APP_SECRET = "4y8fy4rqk8rofd8";

    //public static final String DROPBOX_APP_KEY = "1a85ahrq8uh60r7";
    //public static final String DROPBOX_APP_SECRET = "l3yyjll7ef3vfb3";
    public static final String DROPBOX_ACCESS_TOKEN = "DROPBOX_ACCESS_TOKEN";
    public static final String DROPBOX_REQUEST_FLAG = "DROPBOX_REQUEST_FLAG";

    public static final String DEVICE = "device";
    public static final int GOOGLE_RETRIEVE_MAXIMUM = 500;
    public static final float HALF_ALPHA_VALUE = .5f;
    public static final float NORMAL_ALPHA_VALUE = 1f;

    // AD
    public static final String VPON_BANNER_ID = "8a8081824cfe92fa014d3707f493630b";

    // Payment

    public static final String PAYMENT_FLAG = "PAYMENT_FLAG";

    // Global Utility Methods

    public static String format(int number){
        try {
            DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,##0");
            return df.format(number);
        }catch(Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    public static String formatSqlValue(String value){
        if(value != null) {
            value = value.replaceAll("\"", "\"\"");
            value = value.replaceAll("'", "\\\'");
            return value;
        }else{
            return "";
        }
    }

}
