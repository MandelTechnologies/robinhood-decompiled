package com.stripe.android.core.networking;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.utils.PluginDetector;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AnalyticsRequestFactory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000eH\u0000¢\u0006\u0002\b\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e*\u00020\u0012H\u0002R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "", "packageManager", "Landroid/content/pm/PackageManager;", "packageInfo", "Landroid/content/pm/PackageInfo;", "packageName", "", "publishableKeyProvider", "Ljavax/inject/Provider;", "networkTypeProvider", "pluginTypeProvider", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "appDataParams", "", "appDataParams$stripe_core_release", "createParams", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "createRequest", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "additionalParams", "getAppName", "", "networkType", "pluginType", "standardParams", "params", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public class AnalyticsRequestFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEVICE_TYPE;
    private static final Provider<String> PLUGIN_TYPE_PROVIDER;
    private static volatile UUID sessionId;
    private final Provider<String> networkTypeProvider;
    private final PackageInfo packageInfo;
    private final PackageManager packageManager;
    private final String packageName;
    private final Provider<String> pluginTypeProvider;
    private final Provider<String> publishableKeyProvider;

    public AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Provider<String> networkTypeProvider, Provider<String> pluginTypeProvider) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(networkTypeProvider, "networkTypeProvider");
        Intrinsics.checkNotNullParameter(pluginTypeProvider, "pluginTypeProvider");
        this.packageManager = packageManager;
        this.packageInfo = packageInfo;
        this.packageName = packageName;
        this.publishableKeyProvider = publishableKeyProvider;
        this.networkTypeProvider = networkTypeProvider;
        this.pluginTypeProvider = pluginTypeProvider;
    }

    public /* synthetic */ AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Provider provider3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, provider2, (i & 32) != 0 ? PLUGIN_TYPE_PROVIDER : provider3);
    }

    public final AnalyticsRequest createRequest(AnalyticsRequestFactory2 event, Map<String, ? extends Object> additionalParams) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        return new AnalyticsRequest(MapsKt.plus(createParams(event), additionalParams), RequestHeadersFactory.Analytics.INSTANCE.create());
    }

    private final Map<String, Object> createParams(AnalyticsRequestFactory2 event) {
        return MapsKt.plus(MapsKt.plus(standardParams(), appDataParams$stripe_core_release()), params(event));
    }

    private final Map<String, String> params(AnalyticsRequestFactory2 analyticsRequestFactory2) {
        return MapsKt.mapOf(Tuples4.m3642to("event", analyticsRequestFactory2.getEventName()));
    }

    private final Map<String, Object> standardParams() {
        Object objM28550constructorimpl;
        Tuples2 tuples2M3642to = Tuples4.m3642to("analytics_ua", "analytics.stripe_android-1.0");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(this.publishableKeyProvider.get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = "pk_undefined";
        }
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to("publishable_key", objM28550constructorimpl), Tuples4.m3642to("os_name", Build.VERSION.CODENAME), Tuples4.m3642to("os_release", Build.VERSION.RELEASE), Tuples4.m3642to("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), Tuples4.m3642to("device_type", DEVICE_TYPE), Tuples4.m3642to("bindings_version", "20.50.0"), Tuples4.m3642to("is_development", Boolean.FALSE), Tuples4.m3642to("session_id", sessionId), Tuples4.m3642to("locale", Locale.getDefault().toString())), networkType()), pluginType());
    }

    private final Map<String, String> networkType() {
        String str = this.networkTypeProvider.get();
        return str == null ? MapsKt.emptyMap() : MapsKt.mapOf(Tuples4.m3642to("network_type", str));
    }

    private final Map<String, String> pluginType() {
        Map<String, String> mapMapOf;
        String str = this.pluginTypeProvider.get();
        return (str == null || (mapMapOf = MapsKt.mapOf(Tuples4.m3642to("plugin_type", str))) == null) ? MapsKt.emptyMap() : mapMapOf;
    }

    public final Map<String, Object> appDataParams$stripe_core_release() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.packageManager;
        if (packageManager != null && (packageInfo = this.packageInfo) != null) {
            return MapsKt.mapOf(Tuples4.m3642to("app_name", getAppName(packageInfo, packageManager)), Tuples4.m3642to("app_version", Integer.valueOf(this.packageInfo.versionCode)));
        }
        return MapsKt.emptyMap();
    }

    private final CharSequence getAppName(PackageInfo packageInfo, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        CharSequence charSequence = null;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(packageManager);
        if (charSequenceLoadLabel != null && !StringsKt.isBlank(charSequenceLoadLabel)) {
            charSequence = charSequenceLoadLabel;
        }
        return charSequence == null ? this.packageName : charSequence;
    }

    /* compiled from: AnalyticsRequestFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;", "", "<init>", "()V", "Ljava/util/UUID;", "id", "", "setSessionId", "(Ljava/util/UUID;)V", "", "ANALYTICS_NAME", "Ljava/lang/String;", "ANALYTICS_PREFIX", "ANALYTICS_UA", "ANALYTICS_VERSION", "DEVICE_TYPE", "Ljavax/inject/Provider;", "PLUGIN_TYPE_PROVIDER", "Ljavax/inject/Provider;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setSessionId(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            AnalyticsRequestFactory.sessionId = id;
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        sessionId = uuidRandomUUID;
        DEVICE_TYPE = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        PLUGIN_TYPE_PROVIDER = new Provider() { // from class: com.stripe.android.core.networking.AnalyticsRequestFactory$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                return AnalyticsRequestFactory.PLUGIN_TYPE_PROVIDER$lambda$3();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PLUGIN_TYPE_PROVIDER$lambda$3() {
        return PluginDetector.INSTANCE.getPluginType();
    }
}
