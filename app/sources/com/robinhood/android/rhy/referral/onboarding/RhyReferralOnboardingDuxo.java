package com.robinhood.android.rhy.referral.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.rhyonboarding.contracts.RhyReferralOnboardingKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rhy.referral.RhyReferralOnboardingDataPref;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyReferralOnboardingStore", "Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralOnboardingDuxo extends BaseDuxo4<RhyReferralOnboardingViewState> implements HasSavedState {
    private static final long DELAY_TIME = 2000;
    private final StringPreference rhyReferralOnboardingDataPref;
    private final RhyReferralOnboardingStore rhyReferralOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralOnboardingDuxo(RhyReferralOnboardingStore rhyReferralOnboardingStore, @RhyReferralOnboardingDataPref StringPreference rhyReferralOnboardingDataPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RhyReferralOnboardingViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingStore, "rhyReferralOnboardingStore");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyReferralOnboardingStore = rhyReferralOnboardingStore;
        this.rhyReferralOnboardingDataPref = rhyReferralOnboardingDataPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        String referralCode = ((RhyReferralOnboardingKey) INSTANCE.getArgs((HasSavedState) this)).getReferralCode();
        if (referralCode == null) {
            referralCode = this.rhyReferralOnboardingDataPref.get();
            this.rhyReferralOnboardingDataPref.delete();
        }
        Observable<RhyReferralOnboardingStore4> observableDistinctUntilChanged = this.rhyReferralOnboardingStore.getPostAuthOutAction(referralCode).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservableDelay2.minTimeInFlight$default(observableDistinctUntilChanged, 2000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralOnboardingDuxo.onStart$lambda$1(this.f$0, (RhyReferralOnboardingStore4) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralOnboardingDuxo rhyReferralOnboardingDuxo, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4) {
        rhyReferralOnboardingDuxo.applyMutation(new RhyReferralOnboardingDuxo2(rhyReferralOnboardingStore4, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "Lcom/robinhood/android/rhyonboarding/contracts/RhyReferralOnboardingKey;", "<init>", "()V", "DELAY_TIME", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyReferralOnboardingDuxo, RhyReferralOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralOnboardingKey getArgs(SavedStateHandle savedStateHandle) {
            return (RhyReferralOnboardingKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralOnboardingKey getArgs(RhyReferralOnboardingDuxo rhyReferralOnboardingDuxo) {
            return (RhyReferralOnboardingKey) DuxoCompanion.DefaultImpls.getArgs(this, rhyReferralOnboardingDuxo);
        }
    }
}
