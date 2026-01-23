package com.singular.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.robinhood.utils.http.Headers;
import com.singular.sdk.SingularLinkHandler;
import com.singular.sdk.SingularLinkParams;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes12.dex */
public class Utils {
    private static int asidScope;
    private static double asidTimeinterval;
    private static String encryptedApiKey;
    private static final SingularLog logger = SingularLog.getLogger(Utils.class.getSimpleName());
    private static String wrapperName = null;
    private static String wrapperVersion = null;
    private static String imei = null;

    private Utils() {
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().length() == 0;
    }

    static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    static double lagSince(long j) {
        return (getCurrentTimeMillis() - j) * 0.001d;
    }

    static String sha1Hash(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(str2.getBytes("UTF-8"));
            messageDigest.update(str.getBytes("UTF-8"));
            return bytesToHexString(messageDigest.digest());
        } catch (Throwable th) {
            logger.error("error in sha1Hash()", th);
            return null;
        }
    }

    static String bytesToHexString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    static String formatTimestamp(long j) {
        return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(Long.valueOf(j));
    }

    static boolean isGooglePlayServicesAvailable() {
        return SLReflectionUtils.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient") != null;
    }

    private static Object getAdvertisingInfoObject(Context context) throws Exception {
        return SLReflectionUtils.invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static String getPlayStoreAdId(Context context) {
        String str;
        try {
            str = (String) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), "getId", null, new Object[0]);
        } catch (Throwable unused) {
        }
        if (isInvalidDeviceId(str)) {
            return null;
        }
        return str;
    }

    public static boolean isLimitedTrackingEnabled(Context context) {
        try {
            return ((Boolean) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), "isLimitAdTrackingEnabled", null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    static String getAndroidId(Context context) {
        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return !getInvalidDeviceIds().contains(string2) ? string2 : "None";
    }

    static boolean isAmazonAvailable(Context context) throws Settings.SettingNotFoundException {
        try {
            Settings.Secure.getInt(context.getContentResolver(), Constants.AMAZON_LIMIT_AD_TRACKING);
            return true;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    static String getAmazonId(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), Constants.AMAZON_ADVERTISING_ID);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean isAmazonLimitAdTracking(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), Constants.AMAZON_LIMIT_AD_TRACKING) != 0;
    }

    static String getAppSetId(Context context) {
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            final long currentTimeMillis = getCurrentTimeMillis();
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.singular.sdk.internal.Utils.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo2) {
                    int unused = Utils.asidScope = appSetIdInfo2.getScope();
                    linkedBlockingQueue.offer(appSetIdInfo2.getId());
                    double unused2 = Utils.asidTimeinterval = Utils.lagSince(currentTimeMillis);
                }
            });
            String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
            if (isEmptyOrNull(str)) {
                return null;
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double getASIDTimeInterval() {
        return asidTimeinterval;
    }

    public static int getASIDScope() {
        return asidScope;
    }

    public static Set<String> getInvalidDeviceIds() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("0000-0000");
        return hashSet;
    }

    public static boolean isInvalidDeviceId(String str) {
        if (isEmptyOrNull(str)) {
            return false;
        }
        return getInvalidDeviceIds().contains(str) || Pattern.compile("^[0-]+$").matcher(str).matches();
    }

    static NetworkInfo getNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    static boolean isConnectedWifi(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    static boolean isConnectedMobile(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
    }

    static String getConnectionType(Context context) {
        if (isConnectedMobile(context)) {
            return Constants.WWAN;
        }
        isConnectedWifi(context);
        return Constants.WIFI;
    }

    static Locale getLocale(Configuration configuration) {
        Locale localeFromLocaleList = SLReflectionUtils.getLocaleFromLocaleList(configuration);
        return localeFromLocaleList != null ? localeFromLocaleList : SLReflectionUtils.getLocaleFromField(configuration);
    }

    static String[] getSupportedAbis() {
        return SLReflectionUtils.getSupportedAbis();
    }

    static String getCpuAbi() {
        return SLReflectionUtils.getCpuAbi();
    }

    public static void saveCSIReferrer(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_INSTALL_REFERRER, 0).edit();
        editorEdit.putString(Constants.PREF_CSI_REFERRER_KEY, str);
        editorEdit.commit();
    }

    public static String getCSIReferrer(Context context) {
        return context.getSharedPreferences(Constants.PREF_INSTALL_REFERRER, 0).getString(Constants.PREF_CSI_REFERRER_KEY, null);
    }

    static boolean isFirstInstall(Context context) {
        if (context.getSharedPreferences(Constants.PREF_FIRST_INSTALL, 0).getBoolean(Constants.WAS_OPENED_AFTER_INSTALL, false)) {
            return false;
        }
        saveFirstInstallInfo(context);
        return true;
    }

    private static void saveFirstInstallInfo(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_FIRST_INSTALL, 0).edit();
        editorEdit.putBoolean(Constants.WAS_OPENED_AFTER_INSTALL, true);
        editorEdit.commit();
    }

    static UUID getSingularId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_SINGULAR_ID, 0);
        String string2 = sharedPreferences.getString(Constants.PREF_SINGULAR_ID_KEY, null);
        if (string2 != null) {
            return UUID.fromString(string2);
        }
        return createSingularId(sharedPreferences);
    }

    private static UUID createSingularId(SharedPreferences sharedPreferences) {
        UUID uuidRandomUUID = UUID.randomUUID();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(Constants.PREF_SINGULAR_ID_KEY, uuidRandomUUID.toString());
        editorEdit.commit();
        return uuidRandomUUID;
    }

    static long getEventIndex(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_EVENT_INDEX, 0);
        return increaseEventIndex(sharedPreferences, sharedPreferences.getLong(Constants.PREF_EVENT_INDEX_KEY, -1L));
    }

    static long getAdmonEventIndex(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_ADMON_EVENT_INDEX, 0);
        return increaseAdmonEventIndex(sharedPreferences, sharedPreferences.getLong(Constants.PREF_ADMON_EVENT_INDEX_KEY, -1L));
    }

    private static long increaseEventIndex(SharedPreferences sharedPreferences, long j) {
        long j2 = j + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(Constants.PREF_EVENT_INDEX_KEY, j2);
        editorEdit.commit();
        return j2;
    }

    private static long increaseAdmonEventIndex(SharedPreferences sharedPreferences, long j) {
        long j2 = j + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(Constants.PREF_ADMON_EVENT_INDEX_KEY, j2);
        editorEdit.commit();
        return j2;
    }

    public static boolean isLicenseRetrieved(Context context, String str) {
        return context.getSharedPreferences(Constants.LICENSING_API_KEY, 0).getBoolean(str, false);
    }

    public static void saveLicenseInfo(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.LICENSING_API_KEY, 0).edit();
        editorEdit.putBoolean(str, true);
        editorEdit.commit();
    }

    public static String getPlayStoreAdIdByBackupMethod(Context context) {
        String aifa;
        try {
            aifa = ExternalAIFAHelper.getAIFA(context);
        } catch (Throwable unused) {
        }
        if (isInvalidDeviceId(aifa)) {
            return null;
        }
        return aifa;
    }

    static boolean isShortLink(Uri uri) {
        return (isESPLink(uri) || isBrandedLink(uri) || isSingularLinkDomain(uri)) && extractDeepLink(uri) == null;
    }

    static boolean isSingularLinkDomain(Uri uri) {
        return (uri == null || uri.getHost() == null || !uri.getHost().endsWith(Constants.DEFAULT_SINGULAR_LINK_DOMAIN)) ? false : true;
    }

    static String extractDeepLink(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!isESPLink(uri) && !isBrandedLink(uri) && !isSingularLinkDomain(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(Constants.QUERY_ANDROID_DEEPLINK);
        return queryParameter != null ? queryParameter : uri.getQueryParameter(Constants.QUERY_DEEPLINK);
    }

    static String extractPassthroughFromSingularLink(Uri uri) {
        return uri.getQueryParameter(Constants.QUERY_DEEPLINK_PASSTHROUGH);
    }

    static void handleSingularLink(Uri uri) {
        String strExtractDeepLink = extractDeepLink(uri);
        if (strExtractDeepLink != null) {
            handleDeepLink(new SingularLinkParams(strExtractDeepLink, extractPassthroughFromSingularLink(uri), false, uri));
        }
    }

    static boolean handleDeepLink(final SingularLinkParams singularLinkParams) {
        if (SLPushNotificationsManager.getInstance().didAppOpenWithPushNotification().booleanValue()) {
            logger.debug("Push notifications: app was opened with push notification link, skipping deeplink handler invocation.");
            return false;
        }
        final SingularLinkHandler singularLinkHandler = SingularInstance.getInstance().getSingularConfig().linkCallback;
        if (singularLinkParams.getDeeplink() == null || singularLinkHandler == null) {
            return false;
        }
        new Runnable() { // from class: com.singular.sdk.internal.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                singularLinkHandler.onResolved(singularLinkParams);
            }
        }.run();
        return true;
    }

    static boolean validateSingularLink(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return uri.getHost() != null;
    }

    static boolean isOpenedWithDeeplink() {
        return SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink;
    }

    static boolean appMovedToBackground() {
        SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink = false;
        return false;
    }

    public static void setWrapperNameAndVersion(String str, String str2) {
        wrapperName = str;
        wrapperVersion = str2;
    }

    public static String getWrapperName() {
        return wrapperName;
    }

    public static void setImei(String str) {
        imei = str;
    }

    public static String getImei() {
        return imei;
    }

    static String getSdkVersion(SingularInstance singularInstance) {
        String str;
        String str2 = singularInstance.getDeviceInfo().sdkVersion;
        String str3 = wrapperName;
        return (str3 == null || (str = wrapperVersion) == null) ? str2 : String.format("%s-%s/%s", str2, str3, str);
    }

    static boolean isESPLink(Uri uri) {
        if (uri == null || SingularInstance.getInstance() == null || SingularInstance.getInstance().getSingularConfig() == null || SingularInstance.getInstance().getSingularConfig().espDomains == null || SingularInstance.getInstance().getSingularConfig().espDomains.size() == 0) {
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return isUrlInDomains(uri, SingularInstance.getInstance().getSingularConfig().espDomains);
    }

    static boolean isBrandedLink(Uri uri) {
        SingularLog singularLog = logger;
        singularLog.debug("Checking if link is branded link");
        if (uri == null) {
            singularLog.debug("link is null");
            return false;
        }
        if (SingularInstance.getInstance() == null) {
            singularLog.error("Singular instance is null. cannot check branded links");
            return false;
        }
        if (SingularInstance.getInstance().getSingularConfig() == null) {
            singularLog.debug("singular config is null. cannot check branded links");
            return false;
        }
        if (SingularInstance.getInstance().getSingularConfig().brandedDomains == null || SingularInstance.getInstance().getSingularConfig().brandedDomains.size() == 0) {
            singularLog.debug("branded domains is null or empty");
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return isUrlInDomains(uri, SingularInstance.getInstance().getSingularConfig().brandedDomains);
    }

    static Uri resolveESPLink(Uri uri) throws IOException {
        HttpURLConnection httpConnection;
        try {
            URL url = new URL(uri.toString());
            if (url.getProtocol().equalsIgnoreCase(com.adjust.sdk.Constants.SCHEME)) {
                httpConnection = SingularRequestHandler.getHttpsConnection(url);
            } else {
                httpConnection = SingularRequestHandler.getHttpConnection(url);
            }
            httpConnection.setInstanceFollowRedirects(false);
            httpConnection.connect();
            String headerField = httpConnection.getHeaderField(Headers.LOCATION);
            if (headerField == null) {
                return null;
            }
            return Uri.parse(headerField);
        } catch (IOException unused) {
            return null;
        }
    }

    private static boolean isUrlInDomains(Uri uri, List<String> list) {
        for (String str : list) {
            if (uri.getHost() != null && uri.getHost().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) {
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            SingularLog singularLog = logger;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(str);
            sb.append(" was not found in ");
            sb.append(obj != null ? obj.getClass().getName() : null);
            singularLog.debug(sb.toString());
            return null;
        } catch (SecurityException e) {
            logger.debug("Security violation occured ", e);
            return null;
        }
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String formatException(Throwable th) {
        return "Exception: \n" + th.getMessage() + "\nStack trace: \n" + getStackTrace(th);
    }

    public static long incBatchSendId(Context context) {
        long batchSendId = getBatchSendId(context) + 1;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_BATCH_SEND_ID, 0).edit();
            editorEdit.putLong("sendId", batchSendId);
            editorEdit.commit();
            return batchSendId;
        } catch (Throwable th) {
            logger.error(formatException(th));
            return batchSendId;
        }
    }

    static long getBatchSendId(Context context) {
        return context.getSharedPreferences(Constants.PREF_BATCH_SEND_ID, 0).getLong("sendId", 0L);
    }

    public static void saveRetryCountForKey(String str, Context context, int i) {
        try {
            String strGenerateKeyForRetryCountWithKey = generateKeyForRetryCountWithKey(str);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_REQUEST_RETRY_COUNT, 0).edit();
            editorEdit.putInt(strGenerateKeyForRetryCountWithKey, i);
            editorEdit.commit();
        } catch (Throwable th) {
            logger.error(formatException(th));
        }
    }

    public static int getAndIncrementRetryCountForKey(Context context, String str) {
        int i = context.getSharedPreferences(Constants.PREF_REQUEST_RETRY_COUNT, 0).getInt(generateKeyForRetryCountWithKey(str), 0);
        saveRetryCountForKey(str, context, i + 1);
        return i;
    }

    private static String generateKeyForRetryCountWithKey(String str) {
        return "rc-" + str;
    }

    public static void resetRetryCountForKey(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_REQUEST_RETRY_COUNT, 0);
        sharedPreferences.edit().remove(generateKeyForRetryCountWithKey(str)).commit();
    }

    public static String findAndRemoveSuffixFromEncryptedKeys(String str, String str2) {
        return (isEmptyOrNull(str) || isEmptyOrNull(str2) || str.length() < str2.length() || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String xorDecrypt(String str) {
        try {
            byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
            byte[] bArr = new byte[4];
            int length = bArrHexStringToByteArray.length - 4;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrHexStringToByteArray, 0, bArr, 0, 4);
            System.arraycopy(bArrHexStringToByteArray, 4, bArr2, 0, length);
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            }
            return new String(bArr3);
        } catch (Throwable th) {
            formatException(th);
            return null;
        }
    }

    private static byte[] hexStringToByteArray(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        } catch (Throwable th) {
            formatException(th);
            return null;
        }
    }

    public static void setEncryptedApiKey(String str) {
        encryptedApiKey = str;
    }

    public static String getEncryptedApiKey() {
        return encryptedApiKey;
    }
}
