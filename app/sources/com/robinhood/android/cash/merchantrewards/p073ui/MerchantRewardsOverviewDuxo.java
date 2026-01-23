package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.merchantrewards.p073ui.MerchantRewardsOverviewDuxo;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.MerchantRewardUserStateStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.P2pUpsellExperiment;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MerchantRewardUserState;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: MerchantRewardsOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;", "merchantRewardUserStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;)V", "", "onStart", "()V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "offer", "radTransferComplete", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardsOverviewDuxo extends OldBaseDuxo<MerchantRewardsOverviewViewState> implements HasSavedState {
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private final MerchantOfferStore merchantOfferStore;
    private final MerchantRewardUserStateStore merchantRewardUserStateStore;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;
    private final RhyReferralEligibilityStore rhyReferralEligibilityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final Clock getClock() {
        return this.clock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardsOverviewDuxo(ExperimentsStore experimentsStore, MerchantOfferStore merchantOfferStore, MerchantRewardUserStateStore merchantRewardUserStateStore, RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, SavedStateHandle savedStateHandle, Clock clock) {
        super(new MerchantRewardsOverviewViewState(null, null, null, null, null, null, null, null, null, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(merchantRewardUserStateStore, "merchantRewardUserStateStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.experimentsStore = experimentsStore;
        this.merchantOfferStore = merchantOfferStore;
        this.merchantRewardUserStateStore = merchantRewardUserStateStore;
        this.rhyAccountStore = rhyAccountStore;
        this.minervaAccountStore = minervaAccountStore;
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.merchantOfferStore.refresh(true);
        Observable<List<MerchantOfferV2>> observableDistinctUntilChanged = this.merchantOfferStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
        Observable<RhyReferralEligibility> observableDistinctUntilChanged2 = this.rhyReferralEligibilityStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$3(this.f$0, (RhyReferralEligibility) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{P2pUpsellExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<MerchantRewardUserState> observableDistinctUntilChanged3 = this.merchantRewardUserStateStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$7(this.f$0, (MerchantRewardUserState) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).doOnNext(new C101635()).switchMap(new Function() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MinervaAccount>> apply(RhyAccount spendingAccount) {
                Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
                return MerchantRewardsOverviewDuxo.this.minervaAccountStore.streamRhyMinervaAccountOptional(spendingAccount.getId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$9(this.f$0, (Optional) obj);
            }
        });
        UUID offerId = ((LegacyFragmentKey.RhyMerchantRewardsOverview) INSTANCE.getArgs((HasSavedState) this)).getOfferId();
        if (offerId != null) {
            this.merchantOfferStore.refresh(offerId, true);
            LifecycleHost.DefaultImpls.bind$default(this, this.merchantOfferStore.stream(offerId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewDuxo.onStart$lambda$12$lambda$11(this.f$0, (MerchantOfferV2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, final List list) {
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$1$lambda$0(list, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$1$lambda$0(List list, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, list, null, null, null, null, null, null, null, null, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, final RhyReferralEligibility rhyReferralEligibility) {
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$3$lambda$2(rhyReferralEligibility, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$3$lambda$2(RhyReferralEligibility rhyReferralEligibility, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, rhyReferralEligibility, null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, final boolean z) {
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$5$lambda$4(z, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$5$lambda$4(boolean z, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, null, null, null, null, null, Boolean.valueOf(z), null, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, final MerchantRewardUserState merchantRewardUserState) {
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$7$lambda$6(merchantRewardUserState, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$7$lambda$6(MerchantRewardUserState merchantRewardUserState, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, new MerchantRewardsStateWrapper(merchantRewardUserState), null, null, null, null, null, null, 507, null);
    }

    /* compiled from: MerchantRewardsOverviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$onStart$5 */
    static final class C101635<T> implements Consumer {
        C101635() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final RhyAccount rhyAccount) {
            MerchantRewardsOverviewDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$onStart$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewDuxo.C101635.accept$lambda$0(rhyAccount, (MerchantRewardsOverviewViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MerchantRewardsOverviewViewState accept$lambda$0(RhyAccount rhyAccount, MerchantRewardsOverviewViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, null, null, null, rhyAccount, null, null, null, 479, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, Optional optional) {
        final MinervaAccount minervaAccount = (MinervaAccount) optional.component1();
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$9$lambda$8(minervaAccount, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$9$lambda$8(MinervaAccount minervaAccount, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, null, null, null, null, minervaAccount, null, null, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12$lambda$11(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo, final MerchantOfferV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        merchantRewardsOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.onStart$lambda$12$lambda$11$lambda$10(it, (MerchantRewardsOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState onStart$lambda$12$lambda$11$lambda$10(MerchantOfferV2 merchantOfferV2, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, null, merchantOfferV2, null, null, null, null, null, 503, null);
    }

    public final void radTransferComplete(final MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewDuxo.radTransferComplete$lambda$13(offer, (MerchantRewardsOverviewViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOverviewViewState radTransferComplete$lambda$13(MerchantOfferV2 merchantOfferV2, MerchantRewardsOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantRewardsOverviewViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(merchantOfferV2), null, null, null, null, 495, null);
    }

    /* compiled from: MerchantRewardsOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOverview;", "<init>", "()V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MerchantRewardsOverviewDuxo, LegacyFragmentKey.RhyMerchantRewardsOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOverview getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.RhyMerchantRewardsOverview) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOverview getArgs(MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxo) {
            return (LegacyFragmentKey.RhyMerchantRewardsOverview) DuxoCompanion.DefaultImpls.getArgs(this, merchantRewardsOverviewDuxo);
        }
    }
}
