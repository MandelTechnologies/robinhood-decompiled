package com.robinhood.android.rhy.referral.track.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.rhy.contracts.RhyReferralTrackingDetailKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rhy.referral.HasViewedRefereeOfferPref;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsTrackingDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B3\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDataState;", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyReferralEligibilityStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "hasViewedRefereeOfferPref", "Lcom/robinhood/prefs/BooleanPreference;", "stateProvider", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsTrackingDetailDuxo extends BaseDuxo<RhyReferralsTrackingDetailDataState, RhyReferralsTrackingDetailViewState> implements HasSavedState {
    private final BooleanPreference hasViewedRefereeOfferPref;
    private final RhyReferralEligibilityStore rhyReferralEligibilityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralsTrackingDetailDuxo(RhyReferralEligibilityStore rhyReferralEligibilityStore, @HasViewedRefereeOfferPref BooleanPreference hasViewedRefereeOfferPref, RhyReferralsTrackingDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RhyReferralsTrackingDetailDataState(((RhyReferralTrackingDetailKey) INSTANCE.getArgs(savedStateHandle)).getAttribution(), null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.hasViewedRefereeOfferPref = hasViewedRefereeOfferPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (((RhyReferralTrackingDetailKey) INSTANCE.getArgs((HasSavedState) this)).getAttribution().isReferralOfCurrentUser()) {
            this.hasViewedRefereeOfferPref.set(true);
        }
        this.rhyReferralEligibilityStore.refresh(true);
        Observable<RhyReferralEligibility> observableDistinctUntilChanged = this.rhyReferralEligibilityStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsTrackingDetailDuxo.onStart$lambda$0(this.f$0, (RhyReferralEligibility) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralsTrackingDetailDuxo rhyReferralsTrackingDetailDuxo, RhyReferralEligibility rhyReferralEligibility) {
        rhyReferralsTrackingDetailDuxo.applyMutation(new RhyReferralsTrackingDetailDuxo2(rhyReferralEligibility, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralsTrackingDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDuxo;", "Lcom/robinhood/android/rhy/contracts/RhyReferralTrackingDetailKey;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyReferralsTrackingDetailDuxo, RhyReferralTrackingDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralTrackingDetailKey getArgs(SavedStateHandle savedStateHandle) {
            return (RhyReferralTrackingDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralTrackingDetailKey getArgs(RhyReferralsTrackingDetailDuxo rhyReferralsTrackingDetailDuxo) {
            return (RhyReferralTrackingDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, rhyReferralsTrackingDetailDuxo);
        }
    }
}
