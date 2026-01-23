package com.robinhood.android.cash.flat.cashback.p071ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.flat.cashback.p071ui.FlatCashbackInstantAccessFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.TrialRequest;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDuxo;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FlatCashbackInstantAccessDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005:\u0001%B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "reload", "loadContent", "handleTrialActivation", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "trialRequest", "Lcom/robinhood/android/cash/flat/cashback/ui/TrialRequest;", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Lcom/robinhood/android/cash/flat/cashback/ui/TrialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkTrialEligibility", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activateTrial", "offerId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleIneligible", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackInstantAccessDuxo extends BaseDuxo<FlatCashbackInstantAccessDataState, BaseFlatCashbackViewState<FlatCashbackInstantAccessViewState>> implements HasSavedState {
    private final MerchantOfferStore merchantOfferStore;
    private final RealProductMarketingStore realProductMarketingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrialRequest2.values().length];
            try {
                iArr[TrialRequest2.RECURRING_ACH_DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrialRequest2.AUTOMATIC_DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrialRequest2.MANUAL_DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {82}, m3647m = "activateTrial")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$activateTrial$1 */
    static final class C100691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C100691(Continuation<? super C100691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlatCashbackInstantAccessDuxo.this.activateTrial(null, this);
        }
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {70, 76}, m3647m = "checkTrialEligibility")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$checkTrialEligibility$1 */
    static final class C100711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C100711(Continuation<? super C100711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlatCashbackInstantAccessDuxo.this.checkTrialEligibility(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatCashbackInstantAccessDuxo(MerchantOfferStore merchantOfferStore, RealProductMarketingStore realProductMarketingStore, FlatCashbackInstantAccessStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new FlatCashbackInstantAccessDataState(((FlatCashbackInstantAccessFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAccessSource(), null, null, null, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.merchantOfferStore = merchantOfferStore;
        this.realProductMarketingStore = realProductMarketingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loadContent();
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$reload$1", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$reload$1 */
    static final class C100741 extends ContinuationImpl7 implements Function2<FlatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState>, Object> {
        int label;

        C100741(Continuation<? super C100741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlatCashbackInstantAccessDuxo.this.new C100741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState> continuation) {
            return ((C100741) create(flatCashbackInstantAccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new FlatCashbackInstantAccessDataState(((FlatCashbackInstantAccessFragment.Args) FlatCashbackInstantAccessDuxo.INSTANCE.getArgs((HasSavedState) FlatCashbackInstantAccessDuxo.this)).getAccessSource(), null, null, null, 14, null);
        }
    }

    public final void reload() {
        applyMutation(new C100741(null));
        loadContent();
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {44, 46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1 */
    static final class C100731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C100731(Continuation<? super C100731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlatCashbackInstantAccessDuxo.this.new C100731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r1.handleTrialActivation(r12, r4, r11) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            C100731 c100731;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    c100731 = this;
                    FlatCashbackInstantAccessDuxo.this.applyMutation(new AnonymousClass2(th, null));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                c100731 = this;
            } else {
                ResultKt.throwOnFailure(obj);
                try {
                    RealProductMarketingStore realProductMarketingStore = FlatCashbackInstantAccessDuxo.this.realProductMarketingStore;
                    this.label = 1;
                    c100731 = this;
                    try {
                        obj = ContentStore.DefaultImpls.load$default(realProductMarketingStore, BaseFlatCashbackDuxo.CONTENTFUL_ID, null, c100731, 2, null);
                        if (obj == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th2 = th4;
                        th = th2;
                        FlatCashbackInstantAccessDuxo.this.applyMutation(new AnonymousClass2(th, null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    c100731 = this;
                    th = th2;
                    FlatCashbackInstantAccessDuxo.this.applyMutation(new AnonymousClass2(th, null));
                    return Unit.INSTANCE;
                }
            }
            ProductMarketingContent productMarketingContent = (ProductMarketingContent) obj;
            FlatCashbackInstantAccessDuxo.this.applyMutation(new AnonymousClass1(productMarketingContent, null));
            FlatCashbackInstantAccessDuxo flatCashbackInstantAccessDuxo = FlatCashbackInstantAccessDuxo.this;
            TrialRequest trialRequest = ((FlatCashbackInstantAccessFragment.Args) FlatCashbackInstantAccessDuxo.INSTANCE.getArgs((HasSavedState) flatCashbackInstantAccessDuxo)).getTrialRequest();
            c100731.label = 2;
        }

        /* compiled from: FlatCashbackInstantAccessDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1$1", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState>, Object> {
            final /* synthetic */ ProductMarketingContent $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProductMarketingContent productMarketingContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = productMarketingContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState> continuation) {
                return ((AnonymousClass1) create(flatCashbackInstantAccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FlatCashbackInstantAccessDataState.copy$default((FlatCashbackInstantAccessDataState) this.L$0, null, this.$content, null, null, 13, null);
            }
        }

        /* compiled from: FlatCashbackInstantAccessDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1$2", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$loadContent$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FlatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f3937$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3937$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3937$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState> continuation) {
                return ((AnonymousClass2) create(flatCashbackInstantAccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FlatCashbackInstantAccessDataState.copy$default((FlatCashbackInstantAccessDataState) this.L$0, null, null, this.f3937$t, null, 11, null);
            }
        }
    }

    private final void loadContent() {
        getLifecycleScope().launchWhenStarted(new C100731(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleTrialActivation(ProductMarketingContent productMarketingContent, TrialRequest trialRequest, Continuation<? super Unit> continuation) {
        if (trialRequest instanceof TrialRequest.Eligible) {
            Object objActivateTrial = activateTrial(((TrialRequest.Eligible) trialRequest).getOfferId(), continuation);
            return objActivateTrial == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objActivateTrial : Unit.INSTANCE;
        }
        if (trialRequest instanceof TrialRequest.Ineligible) {
            handleIneligible();
            return Unit.INSTANCE;
        }
        if (trialRequest != null) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCheckTrialEligibility = checkTrialEligibility(productMarketingContent, continuation);
        return objCheckTrialEligibility == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCheckTrialEligibility : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (handleTrialActivation(r6, r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkTrialEligibility(ProductMarketingContent productMarketingContent, Continuation<? super Unit> continuation) {
        C100711 c100711;
        if (continuation instanceof C100711) {
            c100711 = (C100711) continuation;
            int i = c100711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c100711.label = i - Integer.MIN_VALUE;
            } else {
                c100711 = new C100711(continuation);
            }
        }
        Object objSingle = c100711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c100711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSingle);
            int i3 = WhenMappings.$EnumSwitchMapping$0[((FlatCashbackInstantAccessFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccessSource().ordinal()];
            if (i3 == 1) {
                handleIneligible();
                return Unit.INSTANCE;
            }
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Flow<List<MerchantOfferV2>> trialEligibleOffers = this.merchantOfferStore.getTrialEligibleOffers(TrialRequest3.DD_CONTEXT);
            c100711.L$0 = productMarketingContent;
            c100711.label = 1;
            objSingle = FlowKt.single(trialEligibleOffers, c100711);
            if (objSingle != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSingle);
            return Unit.INSTANCE;
        }
        productMarketingContent = (ProductMarketingContent) c100711.L$0;
        ResultKt.throwOnFailure(objSingle);
        MerchantOfferV2 trialOffer = TrialRequest3.getTrialOffer(productMarketingContent, (List) objSingle);
        TrialRequest trialEligibility = TrialRequest3.getTrialEligibility(trialOffer != null ? trialOffer.getId() : null, ((FlatCashbackInstantAccessFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccessSource());
        c100711.L$0 = null;
        c100711.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object activateTrial(UUID uuid, Continuation<? super Unit> continuation) {
        C100691 c100691;
        if (continuation instanceof C100691) {
            c100691 = (C100691) continuation;
            int i = c100691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c100691.label = i - Integer.MIN_VALUE;
            } else {
                c100691 = new C100691(continuation);
            }
        }
        Object obj = c100691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c100691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MerchantOfferStore merchantOfferStore = this.merchantOfferStore;
            c100691.label = 1;
            if (merchantOfferStore.activateTrial(uuid, c100691) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C100702(null));
        return Unit.INSTANCE;
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$activateTrial$2", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$activateTrial$2 */
    static final class C100702 extends ContinuationImpl7 implements Function2<FlatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C100702(Continuation<? super C100702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100702 c100702 = new C100702(continuation);
            c100702.L$0 = obj;
            return c100702;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState> continuation) {
            return ((C100702) create(flatCashbackInstantAccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FlatCashbackInstantAccessDataState.copy$default((FlatCashbackInstantAccessDataState) this.L$0, null, null, null, FlatCashbackInstantAccessDataState2.ACTIVE, 7, null);
        }
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$handleIneligible$1", m3645f = "FlatCashbackInstantAccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessDuxo$handleIneligible$1 */
    static final class C100721 extends ContinuationImpl7 implements Function2<FlatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C100721(Continuation<? super C100721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100721 c100721 = new C100721(continuation);
            c100721.L$0 = obj;
            return c100721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, Continuation<? super FlatCashbackInstantAccessDataState> continuation) {
            return ((C100721) create(flatCashbackInstantAccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FlatCashbackInstantAccessDataState.copy$default((FlatCashbackInstantAccessDataState) this.L$0, null, null, null, FlatCashbackInstantAccessDataState2.INELIGIBLE, 7, null);
        }
    }

    private final void handleIneligible() {
        applyMutation(new C100721(null));
    }

    /* compiled from: FlatCashbackInstantAccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessFragment$Args;", "<init>", "()V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FlatCashbackInstantAccessDuxo, FlatCashbackInstantAccessFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FlatCashbackInstantAccessFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FlatCashbackInstantAccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FlatCashbackInstantAccessFragment.Args getArgs(FlatCashbackInstantAccessDuxo flatCashbackInstantAccessDuxo) {
            return (FlatCashbackInstantAccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, flatCashbackInstantAccessDuxo);
        }
    }
}
