package com.robinhood.android;

import android.content.Context;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirebaseAnalyticsManagedSdk_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/FirebaseAnalyticsManagedSdk_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FirebaseAnalyticsManagedSdk_Factory implements Factory<FirebaseAnalyticsManagedSdk> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> context;
    private final Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider;

    @JvmStatic
    public static final FirebaseAnalyticsManagedSdk_Factory create(Provider<Context> provider, Provider<FirebaseAppInstanceIdProvider> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FirebaseAnalyticsManagedSdk newInstance(Context context, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider) {
        return INSTANCE.newInstance(context, firebaseAppInstanceIdProvider);
    }

    public FirebaseAnalyticsManagedSdk_Factory(Provider<Context> context, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        this.context = context;
        this.firebaseAppInstanceIdProvider = firebaseAppInstanceIdProvider;
    }

    @Override // javax.inject.Provider
    public FirebaseAnalyticsManagedSdk get() {
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider = this.firebaseAppInstanceIdProvider.get();
        Intrinsics.checkNotNullExpressionValue(firebaseAppInstanceIdProvider, "get(...)");
        return companion.newInstance(context, firebaseAppInstanceIdProvider);
    }

    /* compiled from: FirebaseAnalyticsManagedSdk_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/FirebaseAnalyticsManagedSdk_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "newInstance", "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FirebaseAnalyticsManagedSdk_Factory create(Provider<Context> context, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
            return new FirebaseAnalyticsManagedSdk_Factory(context, firebaseAppInstanceIdProvider);
        }

        @JvmStatic
        public final FirebaseAnalyticsManagedSdk newInstance(Context context, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
            return new FirebaseAnalyticsManagedSdk(context, firebaseAppInstanceIdProvider);
        }
    }
}
