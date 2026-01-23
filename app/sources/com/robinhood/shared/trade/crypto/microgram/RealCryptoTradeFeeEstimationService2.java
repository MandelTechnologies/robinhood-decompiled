package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamCryptoTradeFeeEstimationAmountRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamCryptoTradeFeeEstimationAmountResponseDto;

/* compiled from: RealCryptoTradeFeeEstimationService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationServiceImpl;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "<init>", "()V", "flow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "setUiFeeEstimation", "", "uiFeeEstimation", "(Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StreamCryptoTradeFeeEstimationAmount", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountRequestDto;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationServiceImpl, reason: use source file name */
/* loaded from: classes12.dex */
public final class RealCryptoTradeFeeEstimationService2 implements RealCryptoTradeFeeEstimationService {
    public static final int $stable = 8;
    private final StateFlow2<UiFeeEstimation> flow = StateFlow4.MutableStateFlow(null);

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService
    public Flow<Response<StreamCryptoTradeFeeEstimationAmountResponseDto>> StreamCryptoTradeFeeEstimationAmount(Request<StreamCryptoTradeFeeEstimationAmountRequestDto> request) {
        return RealCryptoTradeFeeEstimationService.DefaultImpls.StreamCryptoTradeFeeEstimationAmount(this, request);
    }

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService
    public Object setUiFeeEstimation(UiFeeEstimation uiFeeEstimation, Continuation<? super Unit> continuation) {
        Object objEmit = this.flow.emit(uiFeeEstimation, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService, microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradeFeeEstimationService
    public Flow<StreamCryptoTradeFeeEstimationAmountResponseDto> StreamCryptoTradeFeeEstimationAmount(StreamCryptoTradeFeeEstimationAmountRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final StateFlow2<UiFeeEstimation> stateFlow2 = this.flow;
        return new Flow<StreamCryptoTradeFeeEstimationAmountResponseDto>() { // from class: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationServiceImpl$StreamCryptoTradeFeeEstimationAmount$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationServiceImpl$StreamCryptoTradeFeeEstimationAmount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationServiceImpl$StreamCryptoTradeFeeEstimationAmount$$inlined$map$1$2", m3645f = "RealCryptoTradeFeeEstimationService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationServiceImpl$StreamCryptoTradeFeeEstimationAmount$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BigDecimal minFeeAmount;
                    BigDecimal feeRatio;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UiFeeEstimation uiFeeEstimation = (UiFeeEstimation) obj;
                        IdlDecimal idlDecimal = null;
                        IdlDecimal idlDecimal2 = (uiFeeEstimation == null || (feeRatio = uiFeeEstimation.getFeeRatio()) == null) ? null : IdlDecimal2.toIdlDecimal(feeRatio);
                        if (uiFeeEstimation != null && (minFeeAmount = uiFeeEstimation.getMinFeeAmount()) != null) {
                            idlDecimal = IdlDecimal2.toIdlDecimal(minFeeAmount);
                        }
                        StreamCryptoTradeFeeEstimationAmountResponseDto streamCryptoTradeFeeEstimationAmountResponseDto = new StreamCryptoTradeFeeEstimationAmountResponseDto(idlDecimal2, idlDecimal);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamCryptoTradeFeeEstimationAmountResponseDto, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super StreamCryptoTradeFeeEstimationAmountResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
