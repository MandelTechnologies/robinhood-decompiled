package com.robinhood.android.rhyrewards.p246ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.P2pUpsellExperiment;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MerchantRewardsOfferDetailsDuxo extends BaseDuxo4<MerchantRewardsOfferDetailsViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final MerchantOfferStore merchantOfferStore;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MerchantRewardsOfferDetailsDuxo(ExperimentsStore experimentsStore, MerchantOfferStore merchantOfferStore, RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new MerchantRewardsOfferDetailsViewState(((MerchantRewardsOfferDetailsBottomSheet.Args) companion.getArgs(savedStateHandle)).getMerchantOffer(), ((MerchantRewardsOfferDetailsBottomSheet.Args) companion.getArgs(savedStateHandle)).getShowViewAllOffersButton(), null, null, null, null, 60, null), duxoBundle);
        this.experimentsStore = experimentsStore;
        this.merchantOfferStore = merchantOfferStore;
        this.rhyAccountStore = rhyAccountStore;
        this.minervaAccountStore = minervaAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{P2pUpsellExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOfferDetailsDuxo.onStart$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        MerchantOfferStore merchantOfferStore = this.merchantOfferStore;
        Companion companion = INSTANCE;
        merchantOfferStore.refresh(((MerchantRewardsOfferDetailsBottomSheet.Args) companion.getArgs((HasSavedState) this)).getMerchantOffer().getId(), true);
        Observable<MerchantOfferV2> observableDistinctUntilChanged = this.merchantOfferStore.stream(((MerchantRewardsOfferDetailsBottomSheet.Args) companion.getArgs((HasSavedState) this)).getMerchantOffer().getId()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOfferDetailsDuxo.onStart$lambda$1(this.f$0, (MerchantOfferV2) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).doOnNext(new Consumer() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo.onStart.3

            /* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$3$1", m3645f = "MerchantRewardsOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MerchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState>, Object> {
                final /* synthetic */ RhyAccount $spendingAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RhyAccount rhyAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$spendingAccount = rhyAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$spendingAccount, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState> continuation) {
                    return ((AnonymousClass1) create(merchantRewardsOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MerchantRewardsOfferDetailsViewState.copy$default((MerchantRewardsOfferDetailsViewState) this.L$0, null, false, this.$spendingAccount, null, null, null, 59, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(RhyAccount rhyAccount) {
                MerchantRewardsOfferDetailsDuxo.this.applyMutation(new AnonymousClass1(rhyAccount, null));
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MinervaAccount>> apply(RhyAccount spendingAccount) {
                Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
                return MerchantRewardsOfferDetailsDuxo.this.minervaAccountStore.streamRhyMinervaAccountOptional(spendingAccount.getId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOfferDetailsDuxo.onStart$lambda$2(this.f$0, (Optional) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C276906(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MerchantRewardsOfferDetailsDuxo merchantRewardsOfferDetailsDuxo, boolean z) {
        merchantRewardsOfferDetailsDuxo.applyMutation(new MerchantRewardsOfferDetailsDuxo2(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MerchantRewardsOfferDetailsDuxo merchantRewardsOfferDetailsDuxo, MerchantOfferV2 merchantOfferV2) {
        merchantRewardsOfferDetailsDuxo.applyMutation(new MerchantRewardsOfferDetailsDuxo3(merchantOfferV2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(MerchantRewardsOfferDetailsDuxo merchantRewardsOfferDetailsDuxo, Optional optional) {
        merchantRewardsOfferDetailsDuxo.applyMutation(new MerchantRewardsOfferDetailsDuxo4((MinervaAccount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$6", m3645f = "MerchantRewardsOfferDetailsDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$6 */
    static final class C276906 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C276906(Continuation<? super C276906> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantRewardsOfferDetailsDuxo.this.new C276906(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276906) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MerchantOfferStore merchantOfferStore = MerchantRewardsOfferDetailsDuxo.this.merchantOfferStore;
                UUID id = ((MerchantRewardsOfferDetailsBottomSheet.Args) MerchantRewardsOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) MerchantRewardsOfferDetailsDuxo.this)).getMerchantOffer().getId();
                this.label = 1;
                obj = merchantOfferStore.streamBanner(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MerchantRewardsOfferDetailsDuxo.this.applyMutation(new AnonymousClass1((MerchantOfferBanner) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$6$1", m3645f = "MerchantRewardsOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MerchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState>, Object> {
            final /* synthetic */ MerchantOfferBanner $banner;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MerchantOfferBanner merchantOfferBanner, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$banner = merchantOfferBanner;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$banner, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState> continuation) {
                return ((AnonymousClass1) create(merchantRewardsOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MerchantRewardsOfferDetailsViewState.copy$default((MerchantRewardsOfferDetailsViewState) this.L$0, null, false, null, null, null, this.$banner, 31, null);
            }
        }
    }

    /* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsDuxo;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Args;", "<init>", "()V", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MerchantRewardsOfferDetailsDuxo, MerchantRewardsOfferDetailsBottomSheet.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MerchantRewardsOfferDetailsBottomSheet.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MerchantRewardsOfferDetailsBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MerchantRewardsOfferDetailsBottomSheet.Args getArgs(MerchantRewardsOfferDetailsDuxo merchantRewardsOfferDetailsDuxo) {
            return (MerchantRewardsOfferDetailsBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, merchantRewardsOfferDetailsDuxo);
        }
    }
}
