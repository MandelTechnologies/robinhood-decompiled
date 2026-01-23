package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.idl.IdlDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import nummus.p512v1.NummusService;
import nummus.p512v1.TaxLotsForOrderRequestDto;
import nummus.p512v1.TaxLotsForOrderResponseDto;

/* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState;", "nummusService", "Lnummus/v1/NummusService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsStateProvider;", "<init>", "(Lnummus/v1/NummusService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "requestNextPageJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "fetchNextPage", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderDetailTaxLotsDuxo extends BaseDuxo<CryptoOrderDetailTaxLotsDataState, CryptoOrderDetailTaxLotsViewState> implements HasSavedState {
    private final NummusService nummusService;
    private Job requestNextPageJob;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderDetailTaxLotsDuxo(NummusService nummusService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoOrderDetailTaxLotsStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new CryptoOrderDetailTaxLotsDataState(((CryptoOrderDetailTaxLotsFragmentKey) companion.getArgs(savedStateHandle)).getAssetCurrency(), ((CryptoOrderDetailTaxLotsFragmentKey) companion.getArgs(savedStateHandle)).getQuoteCurrencyForPrice(), null, null, null, null, 60, null), stateProvider, duxoBundle);
        this.nummusService = nummusService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$onCreate$1", m3645f = "CryptoOrderDetailTaxLotsDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$onCreate$1 */
    static final class C404441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404441(Continuation<? super C404441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailTaxLotsDuxo.this.new C404441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NummusService nummusService = CryptoOrderDetailTaxLotsDuxo.this.nummusService;
                String string2 = ((CryptoOrderDetailTaxLotsFragmentKey) CryptoOrderDetailTaxLotsDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDetailTaxLotsDuxo.this)).getOrderUuid().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                TaxLotsForOrderRequestDto taxLotsForOrderRequestDto = new TaxLotsForOrderRequestDto(string2, null, null, 4, null);
                this.label = 1;
                obj = nummusService.TaxLotsForOrder(taxLotsForOrderRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoOrderDetailTaxLotsDuxo.this.applyMutation(new AnonymousClass1((TaxLotsForOrderResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$onCreate$1$1", m3645f = "CryptoOrderDetailTaxLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderDetailTaxLotsDataState, Continuation<? super CryptoOrderDetailTaxLotsDataState>, Object> {
            final /* synthetic */ TaxLotsForOrderResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxLotsForOrderResponseDto taxLotsForOrderResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = taxLotsForOrderResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState, Continuation<? super CryptoOrderDetailTaxLotsDataState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderDetailTaxLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState = (CryptoOrderDetailTaxLotsDataState) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(this.$response.is_confirmed());
                IdlDecimal total_gain_loss_amount = this.$response.getTotal_gain_loss_amount();
                return CryptoOrderDetailTaxLotsDataState.copy$default(cryptoOrderDetailTaxLotsDataState, null, null, boolBoxBoolean, total_gain_loss_amount != null ? total_gain_loss_amount.toBigDecimalOrThrow() : null, this.$response.getOrder_tax_lot_details(), this.$response.getNext(), 3, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenStarted(new C404441(null));
    }

    public final void fetchNextPage() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailTaxLotsDuxo.fetchNextPage$lambda$0(this.f$0, (CryptoOrderDetailTaxLotsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchNextPage$lambda$0(CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo, CryptoOrderDetailTaxLotsDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (cryptoOrderDetailTaxLotsDuxo.requestNextPageJob != null) {
            return Unit.INSTANCE;
        }
        cryptoOrderDetailTaxLotsDuxo.requestNextPageJob = BuildersKt__Builders_commonKt.launch$default(cryptoOrderDetailTaxLotsDuxo.getLifecycleScope(), null, null, new CryptoOrderDetailTaxLotsDuxo2(cryptoOrderDetailTaxLotsDuxo, it, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsFragmentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderDetailTaxLotsDuxo, CryptoOrderDetailTaxLotsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderDetailTaxLotsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderDetailTaxLotsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderDetailTaxLotsFragmentKey getArgs(CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo) {
            return (CryptoOrderDetailTaxLotsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderDetailTaxLotsDuxo);
        }
    }
}
