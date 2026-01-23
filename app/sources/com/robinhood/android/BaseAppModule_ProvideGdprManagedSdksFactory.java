package com.robinhood.android;

import com.robinhood.adjust.AdjustManagedSdk;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.referral.branch.BranchManagedSdk;
import com.robinhood.shared.common.singular.SingularManagedSdk;
import com.robinhood.userleap.UserLeapManagedSdk;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAppModule_ProvideGdprManagedSdksFactory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/BaseAppModule_ProvideGdprManagedSdksFactory;", "Ldagger/internal/Factory;", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "Lkotlin/jvm/JvmSuppressWildcards;", "adjustManagedSdk", "Ljavax/inject/Provider;", "Lcom/robinhood/adjust/AdjustManagedSdk;", "branchManagedSdk", "Lcom/robinhood/referral/branch/BranchManagedSdk;", "userLeapManagedSdk", "Lcom/robinhood/userleap/UserLeapManagedSdk;", "firebaseAnalyticsSdk", "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "singularManagedSdk", "Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "bitdriftCaptureManagedSdk", "Lcom/robinhood/android/BitdriftCaptureManagedSdk;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BaseAppModule_ProvideGdprManagedSdksFactory implements Factory<Set<GdprManagedSdk>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdjustManagedSdk> adjustManagedSdk;
    private final Provider<BitdriftCaptureManagedSdk> bitdriftCaptureManagedSdk;
    private final Provider<BranchManagedSdk> branchManagedSdk;
    private final Provider<FirebaseAnalyticsManagedSdk> firebaseAnalyticsSdk;
    private final Provider<SingularManagedSdk> singularManagedSdk;
    private final Provider<UserLeapManagedSdk> userLeapManagedSdk;

    @JvmStatic
    public static final BaseAppModule_ProvideGdprManagedSdksFactory create(Provider<AdjustManagedSdk> provider, Provider<BranchManagedSdk> provider2, Provider<UserLeapManagedSdk> provider3, Provider<FirebaseAnalyticsManagedSdk> provider4, Provider<SingularManagedSdk> provider5, Provider<BitdriftCaptureManagedSdk> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final Set<GdprManagedSdk> provideGdprManagedSdks(AdjustManagedSdk adjustManagedSdk, BranchManagedSdk branchManagedSdk, UserLeapManagedSdk userLeapManagedSdk, FirebaseAnalyticsManagedSdk firebaseAnalyticsManagedSdk, SingularManagedSdk singularManagedSdk, BitdriftCaptureManagedSdk bitdriftCaptureManagedSdk) {
        return INSTANCE.provideGdprManagedSdks(adjustManagedSdk, branchManagedSdk, userLeapManagedSdk, firebaseAnalyticsManagedSdk, singularManagedSdk, bitdriftCaptureManagedSdk);
    }

    public BaseAppModule_ProvideGdprManagedSdksFactory(Provider<AdjustManagedSdk> adjustManagedSdk, Provider<BranchManagedSdk> branchManagedSdk, Provider<UserLeapManagedSdk> userLeapManagedSdk, Provider<FirebaseAnalyticsManagedSdk> firebaseAnalyticsSdk, Provider<SingularManagedSdk> singularManagedSdk, Provider<BitdriftCaptureManagedSdk> bitdriftCaptureManagedSdk) {
        Intrinsics.checkNotNullParameter(adjustManagedSdk, "adjustManagedSdk");
        Intrinsics.checkNotNullParameter(branchManagedSdk, "branchManagedSdk");
        Intrinsics.checkNotNullParameter(userLeapManagedSdk, "userLeapManagedSdk");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSdk, "firebaseAnalyticsSdk");
        Intrinsics.checkNotNullParameter(singularManagedSdk, "singularManagedSdk");
        Intrinsics.checkNotNullParameter(bitdriftCaptureManagedSdk, "bitdriftCaptureManagedSdk");
        this.adjustManagedSdk = adjustManagedSdk;
        this.branchManagedSdk = branchManagedSdk;
        this.userLeapManagedSdk = userLeapManagedSdk;
        this.firebaseAnalyticsSdk = firebaseAnalyticsSdk;
        this.singularManagedSdk = singularManagedSdk;
        this.bitdriftCaptureManagedSdk = bitdriftCaptureManagedSdk;
    }

    @Override // javax.inject.Provider
    public Set<GdprManagedSdk> get() {
        Companion companion = INSTANCE;
        AdjustManagedSdk adjustManagedSdk = this.adjustManagedSdk.get();
        Intrinsics.checkNotNullExpressionValue(adjustManagedSdk, "get(...)");
        BranchManagedSdk branchManagedSdk = this.branchManagedSdk.get();
        Intrinsics.checkNotNullExpressionValue(branchManagedSdk, "get(...)");
        UserLeapManagedSdk userLeapManagedSdk = this.userLeapManagedSdk.get();
        Intrinsics.checkNotNullExpressionValue(userLeapManagedSdk, "get(...)");
        FirebaseAnalyticsManagedSdk firebaseAnalyticsManagedSdk = this.firebaseAnalyticsSdk.get();
        Intrinsics.checkNotNullExpressionValue(firebaseAnalyticsManagedSdk, "get(...)");
        SingularManagedSdk singularManagedSdk = this.singularManagedSdk.get();
        Intrinsics.checkNotNullExpressionValue(singularManagedSdk, "get(...)");
        BitdriftCaptureManagedSdk bitdriftCaptureManagedSdk = this.bitdriftCaptureManagedSdk.get();
        Intrinsics.checkNotNullExpressionValue(bitdriftCaptureManagedSdk, "get(...)");
        return companion.provideGdprManagedSdks(adjustManagedSdk, branchManagedSdk, userLeapManagedSdk, firebaseAnalyticsManagedSdk, singularManagedSdk, bitdriftCaptureManagedSdk);
    }

    /* compiled from: BaseAppModule_ProvideGdprManagedSdksFactory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007JC\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/BaseAppModule_ProvideGdprManagedSdksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/BaseAppModule_ProvideGdprManagedSdksFactory;", "adjustManagedSdk", "Ljavax/inject/Provider;", "Lcom/robinhood/adjust/AdjustManagedSdk;", "branchManagedSdk", "Lcom/robinhood/referral/branch/BranchManagedSdk;", "userLeapManagedSdk", "Lcom/robinhood/userleap/UserLeapManagedSdk;", "firebaseAnalyticsSdk", "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "singularManagedSdk", "Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "bitdriftCaptureManagedSdk", "Lcom/robinhood/android/BitdriftCaptureManagedSdk;", "provideGdprManagedSdks", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "Lkotlin/jvm/JvmSuppressWildcards;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseAppModule_ProvideGdprManagedSdksFactory create(Provider<AdjustManagedSdk> adjustManagedSdk, Provider<BranchManagedSdk> branchManagedSdk, Provider<UserLeapManagedSdk> userLeapManagedSdk, Provider<FirebaseAnalyticsManagedSdk> firebaseAnalyticsSdk, Provider<SingularManagedSdk> singularManagedSdk, Provider<BitdriftCaptureManagedSdk> bitdriftCaptureManagedSdk) {
            Intrinsics.checkNotNullParameter(adjustManagedSdk, "adjustManagedSdk");
            Intrinsics.checkNotNullParameter(branchManagedSdk, "branchManagedSdk");
            Intrinsics.checkNotNullParameter(userLeapManagedSdk, "userLeapManagedSdk");
            Intrinsics.checkNotNullParameter(firebaseAnalyticsSdk, "firebaseAnalyticsSdk");
            Intrinsics.checkNotNullParameter(singularManagedSdk, "singularManagedSdk");
            Intrinsics.checkNotNullParameter(bitdriftCaptureManagedSdk, "bitdriftCaptureManagedSdk");
            return new BaseAppModule_ProvideGdprManagedSdksFactory(adjustManagedSdk, branchManagedSdk, userLeapManagedSdk, firebaseAnalyticsSdk, singularManagedSdk, bitdriftCaptureManagedSdk);
        }

        @JvmStatic
        public final Set<GdprManagedSdk> provideGdprManagedSdks(AdjustManagedSdk adjustManagedSdk, BranchManagedSdk branchManagedSdk, UserLeapManagedSdk userLeapManagedSdk, FirebaseAnalyticsManagedSdk firebaseAnalyticsSdk, SingularManagedSdk singularManagedSdk, BitdriftCaptureManagedSdk bitdriftCaptureManagedSdk) {
            Intrinsics.checkNotNullParameter(adjustManagedSdk, "adjustManagedSdk");
            Intrinsics.checkNotNullParameter(branchManagedSdk, "branchManagedSdk");
            Intrinsics.checkNotNullParameter(userLeapManagedSdk, "userLeapManagedSdk");
            Intrinsics.checkNotNullParameter(firebaseAnalyticsSdk, "firebaseAnalyticsSdk");
            Intrinsics.checkNotNullParameter(singularManagedSdk, "singularManagedSdk");
            Intrinsics.checkNotNullParameter(bitdriftCaptureManagedSdk, "bitdriftCaptureManagedSdk");
            Object objCheckNotNull = Preconditions.checkNotNull(BaseAppModule.INSTANCE.provideGdprManagedSdks(adjustManagedSdk, branchManagedSdk, userLeapManagedSdk, firebaseAnalyticsSdk, singularManagedSdk, bitdriftCaptureManagedSdk), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Set) objCheckNotNull;
        }
    }
}
