package com.truelayer.payments.analytics.events;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.os.LocaleListCompat;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.truelayer.payments.analytics.BuildConfig;
import com.truelayer.payments.analytics.events.NetworkEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: AppAnalytics.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!Bu\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AppAnalytics;", "", "context", "Landroid/content/Context;", Auth.DEVELOPER_NAME, "", "sdkVersion", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "device", "osVersion", "appName", "appVersion", "screenResolution", "Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "countryCode", "deviceMainLanguage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getAppVersion", "getClientId", "getCountryCode", "getDevice", "getDeviceId", "getDeviceMainLanguage", "locales", "", "getLocales", "()Ljava/util/List;", "getOsVersion", "getScreenResolution", "()Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "getSdkVersion", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AppAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String appName;
    private final String appVersion;
    private final String clientId;
    private final String countryCode;
    private final String device;
    private final String deviceId;
    private final String deviceMainLanguage;
    private final String osVersion;
    private final NetworkEvent.ScreenResolution screenResolution;
    private final String sdkVersion;

    public AppAnalytics(Context context, String str, String sdkVersion, String deviceId, String device, String osVersion, String appName, String appVersion, NetworkEvent.ScreenResolution screenResolution, String countryCode, String deviceMainLanguage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(deviceMainLanguage, "deviceMainLanguage");
        this.clientId = str;
        this.sdkVersion = sdkVersion;
        this.deviceId = deviceId;
        this.device = device;
        this.osVersion = osVersion;
        this.appName = appName;
        this.appVersion = appVersion;
        this.screenResolution = screenResolution;
        this.countryCode = countryCode;
        this.deviceMainLanguage = deviceMainLanguage;
    }

    public final String getClientId() {
        return this.clientId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppAnalytics(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, NetworkEvent.ScreenResolution screenResolution, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Context context2;
        String deviceId;
        String str10;
        String str11;
        String str12 = (i & 2) != 0 ? null : str;
        String str13 = (i & 4) != 0 ? BuildConfig.PAYMENT_SDK_VERSION_NAME : str2;
        if ((i & 8) != 0) {
            context2 = context;
            deviceId = INSTANCE.getDeviceId(context2);
        } else {
            context2 = context;
            deviceId = str3;
        }
        if ((i & 16) != 0) {
            str10 = Build.MANUFACTURER + PlaceholderUtils.XXShortPlaceholderText + Build.BRAND + PlaceholderUtils.XXShortPlaceholderText + Build.MODEL;
        } else {
            str10 = str4;
        }
        String strValueOf = (i & 32) != 0 ? String.valueOf(Build.VERSION.SDK_INT) : str5;
        String strApplicationName = (i & 64) != 0 ? AppAnalytics2.applicationName(context2) : str6;
        String strApplicationVersion = (i & 128) != 0 ? AppAnalytics2.applicationVersion(context2) : str7;
        NetworkEvent.ScreenResolution screenResolution2 = (i & 256) != 0 ? AppAnalytics2.screenResolution(context2) : screenResolution;
        String countyCode = (i & 512) != 0 ? INSTANCE.getCountyCode() : str8;
        if ((i & 1024) != 0) {
            String languageTag = Locale.getDefault().toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
            String str14 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) languageTag, new String[]{"-"}, false, 0, 6, (Object) null));
            str11 = str14 == null ? "unset" : str14;
        } else {
            str11 = str9;
        }
        this(context2, str12, str13, deviceId, str10, strValueOf, strApplicationName, strApplicationVersion, screenResolution2, countyCode, str11);
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final NetworkEvent.ScreenResolution getScreenResolution() {
        return this.screenResolution;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDeviceMainLanguage() {
        return this.deviceMainLanguage;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> getLocales() {
        String str;
        String languageTag;
        LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
        Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
        int size = adjustedDefault.size();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.until(0, size).iterator();
        while (it.hasNext()) {
            Locale locale = adjustedDefault.get(((PrimitiveIterators6) it).nextInt());
            if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
                str = "";
            } else {
                Intrinsics.checkNotNull(languageTag);
                List listSplit$default = StringsKt.split$default((CharSequence) languageTag, new String[]{"-"}, false, 0, 6, (Object) null);
                if (listSplit$default == null || (str = (String) CollectionsKt.firstOrNull(listSplit$default)) == null) {
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* compiled from: AppAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AppAnalytics$Companion;", "", "()V", "getCountyCode", "", "getDeviceId", "context", "Landroid/content/Context;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getCountyCode() throws MissingResourceException {
            try {
                String iSO3Country = Locale.getDefault().getISO3Country();
                if (StringsKt.isBlank(iSO3Country)) {
                    iSO3Country = "unset";
                }
                Intrinsics.checkNotNull(iSO3Country);
                return iSO3Country;
            } catch (MissingResourceException unused) {
                return "unset";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getDeviceId(Context context) {
            String string2;
            synchronized (this) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("PaymentAnalytics", 0);
                string2 = sharedPreferences.getString(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, null);
                if (string2 == null) {
                    Companion companion = AppAnalytics.INSTANCE;
                    string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, string2);
                    editorEdit.apply();
                }
            }
            return string2;
        }
    }
}
