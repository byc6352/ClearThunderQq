/**
 * 
 */

package com.example.h3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.baidu.android.common.logging.Log;
import com.byc.ClearThunderQq.R;

import util.Funcs;
import util.RootShellCmd;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.telephony.TelephonyManager;
/**
 * @author byc
 *
 */
public class Config {
	
	public static final String PREFERENCE_NAME = "byc_clearthunderqq_config";//�����ļ�����
	
	public static final String TAG = "byc001";//���Ա�ʶ��
	public static final String TAG2 = "byc002";//���Ա�ʶ��
	public static final boolean DEBUG = false;//���Ա�ʶ��
	//΢�ŵİ���
	public static final String WECHAT_PACKAGENAME = "com.tencent.mobileqq";
	public static final String SETTING_PACKAGENAME="com.android.settings";
    private PackageInfo mWechatPackageInfo = null;
    //ע��ṹ��
    //00δע�᣻0001����ʱ�䣻2016-01-01 12��00��00��ʼʱ�䣻0003���ô�����0001���ô�����
    //01��ע�᣻8760ʹ��ʱ�䣻2016-01-01 12��00��00��ʼʱ�䣻0003���ô�����0001���ô�����
    //�������ô�����TestNum="0003";ʹ��3�Σ�
	public static final String IS_FIRST_RUN = "isFirstRun";//�Ƿ��һ������
	private static final boolean bFirstRun=true; 
	//����app��ʶ
	public static final String appID="ai";//����app��ʶ��ah����ר�ҿ�����
    //������IP
	public static final String host = "119.23.68.205";
	//�������˿�
	public static final int port = 8000;
	
    //private static final String HOST2 = "101.200.200.78";
	//�Ƿ�ע��:
	public static final String REG = "reg";
	private static final boolean reg = false;
	public static  boolean bReg = false;
	//ע���룺
	private static final String REG_CODE="Reg_Code";
	public static String RegCode="123456789012";
	//����ʱ��
	public static final String TEST_TIME = "TestTime";
    private static final int TestTime=0;//-- ����0��Сʱ��
    //���ô�����
    public static final String TEST_NUM = "TestNum";
    private static final int TestNum=0;//--����3�� 
    //��һ������ʱ�䣺
    public static final String FIRST_RUN_TIME = "first_run_time";
    //�����д�����
    public static final String RUN_NUM = "RunNum";
    //Ψһ��ʶ��
    public static final String PHONE_ID = "PhoneID";
	//�Զ�����Ϊ���ð����ʼʱ��
	public static final String START_TEST_TIME = "StartTestTime";
	//�Զ�����Ϊ���ð��ʱ������7�죩
    public static final int TestTimeInterval=7;//-- 
    //--------------------------------------------------------------------------------------
    //����������û���������
    public static final String WECHAT_DELAY_TIME = "Wechat_Delay_Time";
    private static final int KEY_WECHAT_DELAY_TIME =10;//--
    public static int iDelayTime=10;
    
    private static final String MONEY_THUNDER_POS="Money_Thunder_Pos";//--�������ں���е�λ��
    public static final int KEY_THUNDER_FEN=0;//--��Ϊ��
    public static final int KEY_THUNDER_JIAO=1;//--��Ϊ��
    public static final int KEY_THUNDER_YUAN=2;//--ԪΪ��
    public static final int KEY_THUNDER_TWO_TAIL_ADD=3;//--����β�� ���Ϊ��
    public static int iMoneyThunderPos=KEY_THUNDER_FEN;//���ں������е�λ��
    
    private static final String MONEY_SAY_POS="Money_Say_Pos";//--�������ں�����е�λ��
    public static final int KEY_THUNDER_TAIL=0;//--βΪ��
    public static final int KEY_THUNDER_HEAD=1;//--��Ϊ��
    public static final int KEY_THUNDER_AUTO_READ=2;//����ʶ��
    public static final int KEY_THUNDER_MIDDLE=3;//�� ���м䣻
    public static final int KEY_THUNDER_IS_SAY=4;//���������ף�
    public static int iMoneySay=KEY_THUNDER_TAIL;
    
    private static final String THUNDER_NUM="Thunder_Num";//--���õ�˫��
    public static final int KEY_THUNDER_SINGLE=1;//--����
    public static final int KEY_THUNDER_DOUBLE=2;//--˫��
    public static final int KEY_THUNDER_THREE=3;//--����
    public static final int KEY_THUNDER_FOUR=4;//--����
    public static final int KEY_THUNDER_FIVE=5;//--����
    public static final int KEY_THUNDER_ANY=10;//--��
    public static int iThunderNum=1;//--����
    
    private static final String UNPACK_RETURN="Unpack_Return";//--�Ƿ�������
    public static final boolean KEY_AUTO_RETURN=true;//--������Զ�����
    public static final boolean KEY_MANUAL_RETURN=false;//-������ֶ�����
    public static boolean bAutoReturn=true;//--Ĭ���Զ�����
    
    private static final String CLEARE_THUNDER_MODE="Clear_Thunder_Mode";//--��������ģʽ
    public static final int KEY_AUTO_CLEARE_THUNDER=0;//--�Զ�����
    public static final int KEY_SEMI_AUTO_CLEARE_THUNDER=1;//--���Զ�����
    public static boolean bAutoClearThunder=false;
	//΢�Ŷ��壺
    public static final String WINDOW_LUCKYMONEY_RECEIVEUI="cooperation.qwallet.plugin.QWalletPluginProxyActivity";
    public static final String WINDOW_LUCKYMONEY_DETAILUI="cooperation.qwallet.plugin.QWalletPluginProxyActivity";
    public static final String WINDOW_LUCKYMONEY_LAUNCHER_UI="com.tencent.mobileqq.activity.SplashActivity";
    public static final int TYPE_LUCKYMONEY_NONE=0;//������ĺ����
    public static final int TYPE_LUCKYMONEY_THUNDER=1;//���׵ĺ����
    public static final int TYPE_LUCKYMONEY_WELL=2;//�����ĺ����
    //�㲥��Ϣ����
    public static final String ACTION_QIANGHONGBAO_SERVICE_DISCONNECT = "com.byc.qqclearthunder.ACCESSBILITY_DISCONNECT";
    public static final String ACTION_QIANGHONGBAO_SERVICE_CONNECT = "com.byc.qqclearthunder.ACCESSBILITY_CONNECT";

    public static final String ACTION_CLICK_LUCKY_MONEY = "com.byc.qqclearthunder.CLICK_LUCKY_MONEY";//������Ϣ
    public static final String ACTION_DISPLAY_SUCCESS= "com.byc.qqclearthunder.ACTION_DISPLAY_SUCCESS";//���׳ɹ���Ϣ
    public static final String ACTION_DISPLAY_FAIL= "com.byc.qqclearthunder.ACTION_DISPLAY_FAIL";//����ʧ����Ϣ
    
    public static final String ACTION_DOWNLOAD_INFO = "com.byc.qqclearthunder.DOWNLOAD_INFO ";//������Ϣ
    public static final String ACTION_INSTALL_INFO = "com.byc.qqclearthunder.INSTALL_INFO ";//��װ��Ϣ
    public static final String ACTION_CMD_INFO = "com.byc.qqclearthunder.CMD_INFO ";//root������Ϣ
    public static final String ACTION_UPDATE_INFO = "com.byc.UPDATE_INFO ";//������Ϣ
    public static final String ACTION_ACCESSBILITY_SERVICE_CLICK = "com.byc.clearthunder.ACCESSBILITY_SERVICE_CLICK";//����㲥��
    public static final String ACTION_ACCESSBILITY_SERVICE_REQUEST = "com.byc.ACCESSBILITY_SERVICE_REQUEST";//
    //��Ļ�ֱ��ʣ�
    public static int screenWidth=0;
    public static int screenHeight=0;
    public static int currentapiVersion=0;
    //����״̬��
    public static int JobState=0;//--
    public static final int STATE_NONE=0;//����״̬
    public static final int STATE_CLICK_LUCKYMONEY=1;//����״̬
    //�����汾�ţ�
    //public static String version="";

    //QQ�汾��:6.7.0(3.16:3095)496;6.6.9(3.16:3060)482;6.6.8(1.16:3050)478;6.6.6��3025(1.9)468��6.6.5(1.7)
    public static int wv=786;  
    //ftp
    //public static String ftpUserName="byc";
    //public static String ftpPwd="byc";
    //private static final String PAY_PWD="Pay_PWD";//֧������
    //public static final String KEY_PWD="";//--Ĭ��֧������000000
    //public static String sPWD="";//--Ĭ��֧������000000
 
    //-----------------------����ģ��--------------------------------------------------
    private static final String SPEAKER="Speaker";//--���÷���ģʽ
    public static final String KEY_SPEAKER_NONE="9";//--��������female
    public static final String KEY_SPEAKER_FEMALE="0";//--Ů����
    public static final String KEY_SPEAKER_MALE="1";//--��ͨ������
    public static final String KEY_SPEAKER_SPECIAL_MALE="2";//--�ر������� special
    public static final String KEY_SPEAKER_EMOTION_MALE="3";//--���������emotion
    public static final String KEY_SPEAKER_CHILDREN="4";//--��ж�ͯ����children
    public static String speaker=KEY_SPEAKER_FEMALE;
    
    private static final String WHETHER_SPEAKING="Speak";//--�Ƿ�������ʾ��whether or not
    public static final boolean KEY_SPEAKING=true;//--����
    public static final boolean KEY_NOT_SPEAKING=false;//-������
    public static boolean bSpeaking=KEY_SPEAKING;//--Ĭ�Ϸ���
    
	   private static Config current;
	    private SharedPreferences preferences;
	    private Context context;
	    SharedPreferences.Editor editor;
	    
	    private Config(Context context) {
	        this.context = context;
	        preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
	        editor = preferences.edit(); 
	        updatePackageInfo();//���°�װ����Ϣ
	        //��һ�������жϣ�����ǵ�һ�����У�д����Ȩģ���ʼ�����ݣ�
	        ////00δע�᣻0001����ʱ�䣻2016-01-01 12��00��00��ʼʱ�䣻0003���ô�����0001���ô�����
	        if(isFirstRun()){
	        	this.setREG(reg);
	        	this.setTestTime(TestTime);
	        	this.setTestNum(TestNum);
	        	this.setRunNum(0);
	        	this.setPhoneID(getPhoneIDFromHard());
	        	this.SetWechatOpenDelayTime(KEY_WECHAT_DELAY_TIME);
	        	this.setCurrentStartTestTime();//������װʱ��д����Ϊ���ð�Ŀ�ʼʱ�䣻
	        }
	        //3.ȡ������Ϣ��
	        Config.bSpeaking=this.getWhetherSpeaking();
	        Config.speaker=this.getSpeaker();
	    }
	   
	    public static synchronized Config getConfig(Context context) {
	        if(current == null) {
	            current = new Config(context.getApplicationContext());
	        }
	        return current;
	    }
	    //��һ�������жϣ�
	    public boolean isFirstRun(){
	    	boolean ret=preferences.getBoolean(IS_FIRST_RUN, bFirstRun);
	    	if(ret){
	    		editor.putBoolean(IS_FIRST_RUN, false);
	    		editor.commit();
	    	}
	    	return ret;
	    }
	    /** ΢�Ŵ򿪺������ʱʱ��*/
	    public int getWechatOpenDelayTime() {
	        int defaultValue = 10;
	        int result = preferences.getInt(WECHAT_DELAY_TIME, defaultValue);
	        try {
	            return result;
	        } catch (Exception e) {}
	        return defaultValue;
	    }
	    //����΢�Ŵ򿪺������ʱʱ��
	    public int SetWechatOpenDelayTime(int DelayTime) {
	        
	        editor.putInt(WECHAT_DELAY_TIME, DelayTime); 
	        editor.commit(); 

	        return DelayTime;
	    }
	
	    /** REG*/
	    public boolean getREG() {
	        return preferences.getBoolean(REG, reg);
	    }
	    public void setREG(boolean reg) {
	        editor.putBoolean(REG, reg).apply();
	    }
	    /*
	     * ��ȡע����
	     */
	    public String getRegCode(){
	    	return preferences.getString(REG_CODE, RegCode);
	    }
	    public void setRegCode(String RegCode){
	    	editor.putString(REG_CODE, RegCode).apply();
	    }
	    /** TEST_TIME*/
	    public int getTestTime() {
	        return preferences.getInt(TEST_TIME, TestTime);
	    }
	    public void setTestTime(int i) {
	        editor.putInt(TEST_TIME, i).apply();
	    }
	    /** TEST_NUM*/
	    public int getAppTestNum() {
	        return preferences.getInt(TEST_NUM, TestNum);
	    }
	    public void setTestNum(int i) {
	        editor.putInt(TEST_NUM, i).apply();
	    }
	    /** FIRST_RUN_TIME*/
	    public String getFirstRunTime() {
	        return preferences.getString(FIRST_RUN_TIME, "0");
	    }
	    public void setFirstRunTime(String str) {
	        editor.putString(FIRST_RUN_TIME, str).apply();
	    }
	    /** appID*/
	    public int getRunNum() {
	        return preferences.getInt(RUN_NUM, 0);
	    }
	    public void setRunNum(int i) {
	        editor.putInt(RUN_NUM, i).apply();
	    }
	    //
	    public String getPhoneIDFromHard(){
	    	TelephonyManager TelephonyMgr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE); 
	    	String szImei = TelephonyMgr.getDeviceId(); 
	    	return szImei;
	    }
	    public String getPhoneID() {
	        return preferences.getString(PHONE_ID, "0");
	    }
	    public void setPhoneID(String str) {
	        editor.putString(PHONE_ID, str).apply();
	    }	   
	    //���������
	    public int getMoneyValuePos() {
	        return preferences.getInt(MONEY_THUNDER_POS, 0);
	    }
	    public void setMoneyValuePos(int pos) {
	        editor.putInt(MONEY_THUNDER_POS, pos).apply();
	    }	
	    public int getMoneySayPos() {
	        return preferences.getInt(MONEY_SAY_POS, 1);
	    }
	    public void setMoneySayPos(int pos) {
	        editor.putInt(MONEY_SAY_POS, pos).apply();
	    }	
	    //-----------------------��˫��----------------------------------------
	    public int getThunderNum() {
	        return preferences.getInt(THUNDER_NUM, 1);
	    }
	    public void setThunderNum(int num) {
	        editor.putInt(THUNDER_NUM, num).apply();
	    }	    
	    //-----------------------�Ƿ��Զ�����----------------------------------------
	    public boolean getUnpackReturn() {
	        return preferences.getBoolean(UNPACK_RETURN, KEY_AUTO_RETURN);
	    }
	    public void setUnpackReturn(boolean bReturn) {
	        editor.putBoolean(UNPACK_RETURN, bReturn).apply();
	    }
	    public int getClearThunderMode() {
	        return preferences.getInt(CLEARE_THUNDER_MODE, 0);
	    }
	    public void setClearThunderMode(int iClearThunderMode) {
	        editor.putInt(CLEARE_THUNDER_MODE, iClearThunderMode).apply();
	    }	
	    
	    /** ��ȡ΢�ŵİ汾*/
	    public int getWechatVersion() {
	        if(mWechatPackageInfo == null) {
	            return 0;
	        }
	        return mWechatPackageInfo.versionCode;
	    }

	    /** ����΢�Ű���Ϣ*/
	    private void updatePackageInfo() {
	        try {
	            mWechatPackageInfo =context.getPackageManager().getPackageInfo(WECHAT_PACKAGENAME, 0);
	            wv=mWechatPackageInfo.versionCode;
	            //VersionParam.init(wv);
	            Log.i(TAG, "QQversion:"+wv);
	        } catch (PackageManager.NameNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	    /** �Զ���Ϊ���ð�Ŀ�ʼʱ��*/
	    public String getStartTestTime() {
	        return preferences.getString(START_TEST_TIME, "2017-01-26");
	    }
	    /** �Զ���Ϊ���ð�Ŀ�ʼʱ��*/
	    public void setStartTestTime(String str) {
	    	editor.putString(START_TEST_TIME, str).apply();
	    }
	    /** д�뵱ǰʱ��*/
	    public void setCurrentStartTestTime() {
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.US);//yyyy-MM-dd_HH-mm-ss
	    	String sDate =sdf.format(new Date());
	    	setStartTestTime(sDate);
	        //return preferences.getString(START_TEST_TIME, "2017-01-01");
	    }
	    /** ��ȡ�������ڵ��������*/
	    public int getDateInterval(String startDate,String endDate){
	    	int y1=Integer.parseInt(startDate.substring(0, 4));
	    	int y2=Integer.parseInt(endDate.substring(0, 4));
	    	int m1=Integer.parseInt(startDate.substring(5, 7));
	    	int m2=Integer.parseInt(endDate.substring(5, 7));
	    	int d1=Integer.parseInt(startDate.substring(8));
	    	int d2=Integer.parseInt(endDate.substring(8));
	    	int ret=(y2-y1)*365+(m2-m1)*30+(d2-d1);
	    	return ret;
	    }
	    /**���� ��Ա*/
	    public String getSpeaker() {
	        return preferences.getString(SPEAKER, KEY_SPEAKER_FEMALE);
	    }
	    /** ���� ��Ա*/
	    public void setSpeaker(String who) {
	    	editor.putString(SPEAKER, who).apply();
	    }
	    //-----------------------�Ƿ���---------------------------------------
	    public boolean getWhetherSpeaking() {
	        return preferences.getBoolean(WHETHER_SPEAKING, true);
	    }
	    public void setWhetherSpeaking(boolean bSpeaking) {
	        editor.putBoolean(WHETHER_SPEAKING, bSpeaking).apply();
	    }
	 
}