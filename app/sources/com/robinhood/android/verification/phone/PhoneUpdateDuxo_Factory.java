package com.robinhood.android.verification.phone;

import com.robinhood.android.api.verification.VerificationApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneUpdateDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo;", "verificationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/verification/VerificationApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/verification/phone/PhoneUpdateStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PhoneUpdateDuxo_Factory implements Factory<PhoneUpdateDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PhoneUpdateStateProvider> stateProvider;
    private final Provider<SuvMigrationManager> suvMigrationManager;
    private final Provider<UserStore> userStore;
    private final Provider<VerificationApi> verificationApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PhoneUpdateDuxo_Factory create(Provider<VerificationApi> provider, Provider<UserStore> provider2, Provider<SuvMigrationManager> provider3, Provider<PhoneUpdateStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PhoneUpdateDuxo newInstance(VerificationApi verificationApi, UserStore userStore, SuvMigrationManager suvMigrationManager, PhoneUpdateStateProvider phoneUpdateStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(verificationApi, userStore, suvMigrationManager, phoneUpdateStateProvider, duxoBundle);
    }

    public PhoneUpdateDuxo_Factory(Provider<VerificationApi> verificationApi, Provider<UserStore> userStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<PhoneUpdateStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(verificationApi, "verificationApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.verificationApi = verificationApi;
        this.userStore = userStore;
        this.suvMigrationManager = suvMigrationManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PhoneUpdateDuxo get() {
        Companion companion = INSTANCE;
        VerificationApi verificationApi = this.verificationApi.get();
        Intrinsics.checkNotNullExpressionValue(verificationApi, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        PhoneUpdateStateProvider phoneUpdateStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(phoneUpdateStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(verificationApi, userStore, suvMigrationManager, phoneUpdateStateProvider, duxoBundle);
    }

    /* compiled from: PhoneUpdateDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo_Factory;", "verificationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/verification/VerificationApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/verification/phone/PhoneUpdateStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PhoneUpdateDuxo_Factory create(Provider<VerificationApi> verificationApi, Provider<UserStore> userStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<PhoneUpdateStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(verificationApi, "verificationApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PhoneUpdateDuxo_Factory(verificationApi, userStore, suvMigrationManager, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final PhoneUpdateDuxo newInstance(VerificationApi verificationApi, UserStore userStore, SuvMigrationManager suvMigrationManager, PhoneUpdateStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(verificationApi, "verificationApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PhoneUpdateDuxo(verificationApi, userStore, suvMigrationManager, stateProvider, duxoBundle);
        }
    }
}
