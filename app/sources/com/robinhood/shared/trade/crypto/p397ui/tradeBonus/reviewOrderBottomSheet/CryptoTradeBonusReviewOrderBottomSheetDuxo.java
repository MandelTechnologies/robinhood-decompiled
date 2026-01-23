package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDataState;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetFragment;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoTradeBonusReviewOrderBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetStateProvider;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeBonusReviewOrderBottomSheetDuxo extends BaseDuxo<CryptoTradeBonusReviewOrderBottomSheetDataState, CryptoTradeBonusReviewOrderBottomSheetViewState> implements HasSavedState {
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTradeBonusReviewOrderBottomSheetDuxo(CryptoOrderContextFactory cryptoOrderContextFactory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoTradeBonusReviewOrderBottomSheetStateProvider stateProvider) {
        super(CryptoTradeBonusReviewOrderBottomSheetDataState.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1", m3645f = "CryptoTradeBonusReviewOrderBottomSheetDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1 */
    static final class C408511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C408511(Continuation<? super C408511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradeBonusReviewOrderBottomSheetDuxo.this.new C408511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C408511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderContextFactory cryptoOrderContextFactory = CryptoTradeBonusReviewOrderBottomSheetDuxo.this.cryptoOrderContextFactory;
                Screen.Name name = Screen.Name.CRYPTO_ORDER_REVIEW;
                Companion companion = CryptoTradeBonusReviewOrderBottomSheetDuxo.INSTANCE;
                String string2 = ((CryptoTradeBonusReviewOrderBottomSheetFragment.Args) companion.getArgs((HasSavedState) CryptoTradeBonusReviewOrderBottomSheetDuxo.this)).getStaticInputs().getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Screen screen = new Screen(name, null, string2, null, 10, null);
                StaticInputs staticInputs = ((CryptoTradeBonusReviewOrderBottomSheetFragment.Args) companion.getArgs((HasSavedState) CryptoTradeBonusReviewOrderBottomSheetDuxo.this)).getStaticInputs();
                Observable<RequestInputs> observableJust = Observable.just(((CryptoTradeBonusReviewOrderBottomSheetFragment.Args) companion.getArgs((HasSavedState) CryptoTradeBonusReviewOrderBottomSheetDuxo.this)).getRequestInputs());
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.create(screen, staticInputs, observableJust)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTradeBonusReviewOrderBottomSheetDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1$1", m3645f = "CryptoTradeBonusReviewOrderBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTradeBonusReviewOrderBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTradeBonusReviewOrderBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1$1$1", m3645f = "CryptoTradeBonusReviewOrderBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508191 extends ContinuationImpl7 implements Function2<CryptoTradeBonusReviewOrderBottomSheetDataState, Continuation<? super CryptoTradeBonusReviewOrderBottomSheetDataState>, Object> {
                final /* synthetic */ CryptoOrderContext $cryptoOrderContext;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508191(CryptoOrderContext cryptoOrderContext, Continuation<? super C508191> continuation) {
                    super(2, continuation);
                    this.$cryptoOrderContext = cryptoOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508191 c508191 = new C508191(this.$cryptoOrderContext, continuation);
                    c508191.L$0 = obj;
                    return c508191;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTradeBonusReviewOrderBottomSheetDataState cryptoTradeBonusReviewOrderBottomSheetDataState, Continuation<? super CryptoTradeBonusReviewOrderBottomSheetDataState> continuation) {
                    return ((C508191) create(cryptoTradeBonusReviewOrderBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoTradeBonusReviewOrderBottomSheetDataState cryptoTradeBonusReviewOrderBottomSheetDataState = (CryptoTradeBonusReviewOrderBottomSheetDataState) this.L$0;
                    if (cryptoTradeBonusReviewOrderBottomSheetDataState instanceof CryptoTradeBonusReviewOrderBottomSheetDataState.Loading) {
                        return new CryptoTradeBonusReviewOrderBottomSheetDataState.Loaded(this.$cryptoOrderContext);
                    }
                    if (cryptoTradeBonusReviewOrderBottomSheetDataState instanceof CryptoTradeBonusReviewOrderBottomSheetDataState.Loaded) {
                        return ((CryptoTradeBonusReviewOrderBottomSheetDataState.Loaded) cryptoTradeBonusReviewOrderBottomSheetDataState).copy(this.$cryptoOrderContext);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C508191((CryptoOrderContext) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C408511(null), 3, null);
    }

    /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTradeBonusReviewOrderBottomSheetDuxo, CryptoTradeBonusReviewOrderBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradeBonusReviewOrderBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTradeBonusReviewOrderBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradeBonusReviewOrderBottomSheetFragment.Args getArgs(CryptoTradeBonusReviewOrderBottomSheetDuxo cryptoTradeBonusReviewOrderBottomSheetDuxo) {
            return (CryptoTradeBonusReviewOrderBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTradeBonusReviewOrderBottomSheetDuxo);
        }
    }
}
