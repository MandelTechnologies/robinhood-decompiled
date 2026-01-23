package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FlatCashbackOnboardingFlowDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDuxo;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowViewState;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;)V", "loadEligibleOffers", "", "context", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackOnboardingFlowDuxo extends BaseFlatCashbackDuxo<List<? extends MerchantOfferV2>, FlatCashbackOnboardingFlowViewState> {
    public static final int $stable = 8;
    private final MerchantOfferStore merchantOfferStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatCashbackOnboardingFlowDuxo(MerchantOfferStore merchantOfferStore, FlatCashbackOnboardingFlowStateProvider stateProvider, DuxoBundle duxoBundle, RealProductMarketingStore realProductMarketingStore) {
        super(realProductMarketingStore, stateProvider, duxoBundle, new BaseFlatCashbackDataState(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        this.merchantOfferStore = merchantOfferStore;
    }

    /* compiled from: FlatCashbackOnboardingFlowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1", m3645f = "FlatCashbackOnboardingFlowDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1 */
    static final class C100791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C100791(String str, Continuation<? super C100791> continuation) {
            super(2, continuation);
            this.$context = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlatCashbackOnboardingFlowDuxo.this.new C100791(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<MerchantOfferV2>> trialEligibleOffers = FlatCashbackOnboardingFlowDuxo.this.merchantOfferStore.getTrialEligibleOffers(this.$context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FlatCashbackOnboardingFlowDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(trialEligibleOffers, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FlatCashbackOnboardingFlowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1$1", m3645f = "FlatCashbackOnboardingFlowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends MerchantOfferV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FlatCashbackOnboardingFlowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FlatCashbackOnboardingFlowDuxo flatCashbackOnboardingFlowDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = flatCashbackOnboardingFlowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends MerchantOfferV2> list, Continuation<? super Unit> continuation) {
                return invoke2((List<MerchantOfferV2>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<MerchantOfferV2> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FlatCashbackOnboardingFlowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1$1$1", m3645f = "FlatCashbackOnboardingFlowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackOnboardingFlowDuxo$loadEligibleOffers$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496451 extends ContinuationImpl7 implements Function2<BaseFlatCashbackDataState<List<? extends MerchantOfferV2>>, Continuation<? super BaseFlatCashbackDataState<List<? extends MerchantOfferV2>>>, Object> {
                final /* synthetic */ List<MerchantOfferV2> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496451(List<MerchantOfferV2> list, Continuation<? super C496451> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496451 c496451 = new C496451(this.$it, continuation);
                    c496451.L$0 = obj;
                    return c496451;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(BaseFlatCashbackDataState<List<MerchantOfferV2>> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<List<MerchantOfferV2>>> continuation) {
                    return ((C496451) create(baseFlatCashbackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(BaseFlatCashbackDataState<List<? extends MerchantOfferV2>> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<List<? extends MerchantOfferV2>>> continuation) {
                    return invoke2((BaseFlatCashbackDataState<List<MerchantOfferV2>>) baseFlatCashbackDataState, (Continuation<? super BaseFlatCashbackDataState<List<MerchantOfferV2>>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BaseFlatCashbackDataState.copy$default((BaseFlatCashbackDataState) this.L$0, null, null, this.$it, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496451((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void loadEligibleOffers(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getLifecycleScope().launchWhenStarted(new C100791(context, null));
    }
}
