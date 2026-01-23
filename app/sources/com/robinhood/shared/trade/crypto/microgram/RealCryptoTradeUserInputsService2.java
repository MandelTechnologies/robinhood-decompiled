package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import contracts.crypto.trade.proto.p431v1.StreamCryptoTradeUserInputsRequestDto;
import contracts.crypto.trade.proto.p431v1.StreamCryptoTradeUserInputsResponseDto;
import contracts.crypto.trade.proto.p431v1.UserInputsDto;
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

/* compiled from: RealCryptoTradeUserInputsService.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsServiceImpl;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "<init>", "()V", "flow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "setCryptoOrderContext", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StreamCryptoTradeUserInputs", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoTradeUserInputsResponseDto;", "request", "Lcontracts/crypto/trade/proto/v1/StreamCryptoTradeUserInputsRequestDto;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsServiceImpl, reason: use source file name */
/* loaded from: classes12.dex */
public final class RealCryptoTradeUserInputsService2 implements RealCryptoTradeUserInputsService {
    public static final int $stable = 8;
    private final StateFlow2<UserInputsDto> flow = StateFlow4.MutableStateFlow(null);

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService
    public Flow<Response<StreamCryptoTradeUserInputsResponseDto>> StreamCryptoTradeUserInputs(Request<StreamCryptoTradeUserInputsRequestDto> request) {
        return RealCryptoTradeUserInputsService.DefaultImpls.StreamCryptoTradeUserInputs(this, request);
    }

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService
    public Object setCryptoOrderContext(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
        Object objEmit = this.flow.emit(CryptoOrderContexts.getUserInputsDto(cryptoOrderContext), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService, contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService
    public Flow<StreamCryptoTradeUserInputsResponseDto> StreamCryptoTradeUserInputs(StreamCryptoTradeUserInputsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final StateFlow2<UserInputsDto> stateFlow2 = this.flow;
        return new Flow<StreamCryptoTradeUserInputsResponseDto>() { // from class: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsServiceImpl$StreamCryptoTradeUserInputs$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsServiceImpl$StreamCryptoTradeUserInputs$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsServiceImpl$StreamCryptoTradeUserInputs$$inlined$map$1$2", m3645f = "RealCryptoTradeUserInputsService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsServiceImpl$StreamCryptoTradeUserInputs$$inlined$map$1$2$1, reason: invalid class name */
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
                        StreamCryptoTradeUserInputsResponseDto streamCryptoTradeUserInputsResponseDto = new StreamCryptoTradeUserInputsResponseDto((UserInputsDto) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamCryptoTradeUserInputsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super StreamCryptoTradeUserInputsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
