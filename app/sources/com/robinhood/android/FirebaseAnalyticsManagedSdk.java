package com.robinhood.android;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.webkit.WebViewCompat;
import com.google.firebase.analytics.ConsentBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.android.gdpr.GdprConsentCategory;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FirebaseAnalyticsManagedSdk.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "context", "Landroid/content/Context;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "<init>", "(Landroid/content/Context;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;)V", "name", "", "getName", "()Ljava/lang/String;", "consentCategory", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "getConsentCategory", "()Lcom/robinhood/android/gdpr/GdprConsentCategory;", "onAppInitialized", "", "app", "Landroid/app/Application;", "updateConsentStatus", "isEnabled", "", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FirebaseAnalyticsManagedSdk implements GdprManagedSdk {
    private final Context context;
    private final FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider;

    public FirebaseAnalyticsManagedSdk(Context context, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        this.context = context;
        this.firebaseAppInstanceIdProvider = firebaseAppInstanceIdProvider;
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public String getName() {
        return "FirebaseAnalytics";
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public GdprConsentCategory getConsentCategory() {
        return GdprConsentCategory.MARKETING;
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        try {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.context);
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
            PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(this.context);
            firebaseAnalytics.setUserProperty("webview_version", currentWebViewPackage != null ? currentWebViewPackage.versionName : null);
        } catch (Exception e) {
            CrashReporter.INSTANCE.reportNonFatal(new Throwable("Webview version get failed: " + e.getMessage()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
        }
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void updateConsentStatus(boolean isEnabled) {
        FirebaseAnalytics.ConsentStatus consentStatus;
        if (isEnabled) {
            consentStatus = FirebaseAnalytics.ConsentStatus.GRANTED;
        } else {
            consentStatus = FirebaseAnalytics.ConsentStatus.DENIED;
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.context);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        if (isEnabled) {
            firebaseAnalytics.setAnalyticsCollectionEnabled(true);
        }
        ConsentBuilder consentBuilder = new ConsentBuilder();
        consentBuilder.setAnalyticsStorage(consentStatus);
        consentBuilder.setAdStorage(consentStatus);
        consentBuilder.setAdUserData(consentStatus);
        consentBuilder.setAdPersonalization(consentStatus);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
        firebaseAnalytics.setUserProperty("allow_personalized_ads", String.valueOf(isEnabled));
        this.firebaseAppInstanceIdProvider.refreshFirebaseAppInstanceId();
    }
}
