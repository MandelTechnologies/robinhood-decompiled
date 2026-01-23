package com.robinhood.android.rhy.referral.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralOnboardingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "rhyReferralOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyReferralOnboardingDuxo_Factory implements Factory<RhyReferralOnboardingDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<StringPreference> rhyReferralOnboardingDataPref;
    private final Provider<RhyReferralOnboardingStore> rhyReferralOnboardingStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyReferralOnboardingDuxo_Factory create(Provider<RhyReferralOnboardingStore> provider, Provider<StringPreference> provider2, Provider<DuxoBundle> provider3, Provider<SavedStateHandle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RhyReferralOnboardingDuxo newInstance(RhyReferralOnboardingStore rhyReferralOnboardingStore, StringPreference stringPreference, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(rhyReferralOnboardingStore, stringPreference, duxoBundle, savedStateHandle);
    }

    public RhyReferralOnboardingDuxo_Factory(Provider<RhyReferralOnboardingStore> rhyReferralOnboardingStore, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingStore, "rhyReferralOnboardingStore");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyReferralOnboardingStore = rhyReferralOnboardingStore;
        this.rhyReferralOnboardingDataPref = rhyReferralOnboardingDataPref;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public RhyReferralOnboardingDuxo get() {
        Companion companion = INSTANCE;
        RhyReferralOnboardingStore rhyReferralOnboardingStore = this.rhyReferralOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralOnboardingStore, "get(...)");
        StringPreference stringPreference = this.rhyReferralOnboardingDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(rhyReferralOnboardingStore, stringPreference, duxoBundle, savedStateHandle);
    }

    /* compiled from: RhyReferralOnboardingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo_Factory;", "rhyReferralOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyReferralOnboardingDuxo_Factory create(Provider<RhyReferralOnboardingStore> rhyReferralOnboardingStore, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingStore, "rhyReferralOnboardingStore");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RhyReferralOnboardingDuxo_Factory(rhyReferralOnboardingStore, rhyReferralOnboardingDataPref, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final RhyReferralOnboardingDuxo newInstance(RhyReferralOnboardingStore rhyReferralOnboardingStore, StringPreference rhyReferralOnboardingDataPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingStore, "rhyReferralOnboardingStore");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RhyReferralOnboardingDuxo(rhyReferralOnboardingStore, rhyReferralOnboardingDataPref, duxoBundle, savedStateHandle);
        }
    }
}
