package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.singular.sdk.internal.Constants;
import com.stripe.android.core.utils.ContextUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FraudDetectionDataRequestParamsFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002J#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0002R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "packageName", "", "versionName", "timeZone", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "androidVersionString", "screen", "createFirstMap", "", "createParams", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "createParams$payments_core_release", "createSecondMap", "createValueMap", "value", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class FraudDetectionDataRequestParamsFactory {
    private final String androidVersionString;
    private final DisplayMetrics displayMetrics;
    private final String packageName;
    private final String screen;
    private final String timeZone;
    private final String versionName;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FraudDetectionDataRequestParamsFactory(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.displayMetrics = displayMetrics;
        this.packageName = packageName;
        this.versionName = str;
        this.timeZone = timeZone;
        this.screen = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.androidVersionString = "Android " + Build.VERSION.RELEASE + PlaceholderUtils.XXShortPlaceholderText + Build.VERSION.CODENAME + PlaceholderUtils.XXShortPlaceholderText + Build.VERSION.SDK_INT;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FraudDetectionDataRequestParamsFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        String packageName = context.getPackageName();
        packageName = packageName == null ? "" : packageName;
        PackageInfo packageInfo = ContextUtils.INSTANCE.getPackageInfo(context);
        this(displayMetrics, packageName, packageInfo != null ? packageInfo.versionName : null, Companion.createTimezone());
    }

    public final /* synthetic */ Map createParams$payments_core_release(FraudDetectionData fraudDetectionData) {
        return MapsKt.mapOf(Tuples4.m3642to(DocUploadParentFragment.V2_TAG, 1), Tuples4.m3642to("tag", "20.50.0"), Tuples4.m3642to("src", "android-sdk"), Tuples4.m3642to(Constants.RequestParamsKeys.DEVELOPER_API_KEY, createFirstMap()), Tuples4.m3642to("b", createSecondMap(fraudDetectionData)));
    }

    private final Map<String, Object> createFirstMap() {
        String string2 = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return MapsKt.mapOf(Tuples4.m3642to("c", createValueMap(string2)), Tuples4.m3642to("d", createValueMap(this.androidVersionString)), Tuples4.m3642to("f", createValueMap(this.screen)), Tuples4.m3642to("g", createValueMap(this.timeZone)));
    }

    private final Map<String, Object> createSecondMap(FraudDetectionData fraudDetectionData) {
        String muid = fraudDetectionData != null ? fraudDetectionData.getMuid() : null;
        if (muid == null) {
            muid = "";
        }
        Tuples2 tuples2M3642to = Tuples4.m3642to("d", muid);
        String sid = fraudDetectionData != null ? fraudDetectionData.getSid() : null;
        Map mapMapOf = MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, sid != null ? sid : ""), Tuples4.m3642to(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, this.packageName), Tuples4.m3642to("o", Build.VERSION.RELEASE), Tuples4.m3642to(Constants.RequestParamsKeys.PLATFORM_KEY, Integer.valueOf(Build.VERSION.SDK_INT)), Tuples4.m3642to("q", Build.MANUFACTURER), Tuples4.m3642to(Constants.REVENUE_AMOUNT_KEY, Build.BRAND), Tuples4.m3642to(Constants.RequestParamsKeys.SESSION_ID_KEY, Build.MODEL), Tuples4.m3642to("t", Build.TAGS));
        String str = this.versionName;
        Map mapMapOf2 = str != null ? MapsKt.mapOf(Tuples4.m3642to("l", str)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapMapOf2);
    }

    private final Map<String, Object> createValueMap(String value) {
        return MapsKt.mapOf(Tuples4.m3642to("v", value));
    }

    /* compiled from: FraudDetectionDataRequestParamsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory$Companion;", "", "()V", "createTimezone", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createTimezone() {
            int iConvert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (iConvert % 60 == 0) {
                return String.valueOf(iConvert / 60);
            }
            String string2 = new BigDecimal(iConvert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }
}
