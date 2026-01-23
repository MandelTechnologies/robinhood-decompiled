package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoFeeDefinitionDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionStateProvider;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeDefinitionDuxo extends BaseDuxo<CryptoFeeDefinitionDataState, CryptoFeeDefinitionViewState> implements HasSavedState {
    private final AppType appType;
    private final CurrencyPairV2Store currencyPairStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoFeeDefinitionDuxo(AppType appType, CurrencyPairV2Store currencyPairStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoFeeDefinitionStateProvider stateProvider) {
        CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        if (appType == AppType.RHC) {
            feeStructure = CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.FIXED_RATE;
        } else {
            feeStructure = ((CryptoFeeDefinitionBottomSheetFragment.Args) INSTANCE.getArgs(savedStateHandle)).getFeeStructure();
        }
        super(new CryptoFeeDefinitionDataState.Loading(feeStructure), stateProvider, duxoBundle);
        this.appType = appType;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C401811(null), 3, null);
    }

    /* compiled from: CryptoFeeDefinitionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1", m3645f = "CryptoFeeDefinitionDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1 */
    static final class C401811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401811(Continuation<? super C401811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeDefinitionDuxo.this.new C401811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoFeeDefinitionDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoFeeDefinitionBottomSheetFragment.Args) CryptoFeeDefinitionDuxo.INSTANCE.getArgs(CryptoFeeDefinitionDuxo.this.getSavedStateHandle())).getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoFeeDefinitionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCurrencyPairFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoFeeDefinitionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1$1", m3645f = "CryptoFeeDefinitionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoFeeDefinitionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoFeeDefinitionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoFeeDefinitionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1$1$1", m3645f = "CryptoFeeDefinitionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507641 extends ContinuationImpl7 implements Function2<CryptoFeeDefinitionDataState, Continuation<? super CryptoFeeDefinitionDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoFeeDefinitionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507641(CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo, UiCurrencyPair uiCurrencyPair, Continuation<? super C507641> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoFeeDefinitionDuxo;
                    this.$uiCurrencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507641 c507641 = new C507641(this.this$0, this.$uiCurrencyPair, continuation);
                    c507641.L$0 = obj;
                    return c507641;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoFeeDefinitionDataState cryptoFeeDefinitionDataState, Continuation<? super CryptoFeeDefinitionDataState> continuation) {
                    return ((C507641) create(cryptoFeeDefinitionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoFeeDefinitionDataState cryptoFeeDefinitionDataState = (CryptoFeeDefinitionDataState) this.L$0;
                        AppType appType = this.this$0.appType;
                        UiCurrencyPair uiCurrencyPair = this.$uiCurrencyPair;
                        Companion companion = CryptoFeeDefinitionDuxo.INSTANCE;
                        return new CryptoFeeDefinitionDataState.Loaded(appType, uiCurrencyPair, ((CryptoFeeDefinitionBottomSheetFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getFeeRatio(), ((CryptoFeeDefinitionBottomSheetFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getMinFeeAmount(), ((CryptoFeeDefinitionBottomSheetFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getRobinhoodFeeRatio(), ((CryptoFeeDefinitionBottomSheetFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getExchangeFeeRatio(), ((CryptoFeeDefinitionBottomSheetFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getHasOrderExecutions(), cryptoFeeDefinitionDataState.getFeeStructure());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) this.L$0;
                CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo = this.this$0;
                cryptoFeeDefinitionDuxo.applyMutation(new C507641(cryptoFeeDefinitionDuxo, uiCurrencyPair, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoFeeDefinitionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoFeeDefinitionDuxo, CryptoFeeDefinitionBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoFeeDefinitionBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoFeeDefinitionBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoFeeDefinitionBottomSheetFragment.Args getArgs(CryptoFeeDefinitionDuxo cryptoFeeDefinitionDuxo) {
            return (CryptoFeeDefinitionBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoFeeDefinitionDuxo);
        }
    }
}
