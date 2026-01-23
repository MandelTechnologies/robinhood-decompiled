package com.robinhood.android.equityordercontext.microgram;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
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
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextRequestDto;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponseDto;

/* compiled from: RealEquityOrderContextService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityordercontext/microgram/RealEquityOrderContextService;", "Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;", "<init>", "()V", "flow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "setContext", "", "newContext", "(Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StreamOrderContext", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto;", "request", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextRequestDto;", "lib-equity-order-context-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RealEquityOrderContextService implements EquityOrderContextService {
    private final StateFlow2<StreamOrderContextResponse> flow = StateFlow4.MutableStateFlow(new StreamOrderContextResponse(null, null, null, null, null, null, null, false, null, null, null, 2047, null));

    public Flow<Response<StreamOrderContextResponseDto>> StreamOrderContext(Request<StreamOrderContextRequestDto> request) {
        return EquityOrderContextService.DefaultImpls.StreamOrderContext(this, request);
    }

    public final Object setContext(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super Unit> continuation) {
        Object objEmit = this.flow.emit(streamOrderContextResponse, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService
    public Flow<StreamOrderContextResponseDto> StreamOrderContext(StreamOrderContextRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final StateFlow2<StreamOrderContextResponse> stateFlow2 = this.flow;
        return new Flow<StreamOrderContextResponseDto>() { // from class: com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService$StreamOrderContext$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService$StreamOrderContext$$inlined$map$1$2 */
            public static final class C156442<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService$StreamOrderContext$$inlined$map$1$2", m3645f = "RealEquityOrderContextService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService$StreamOrderContext$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C156442.this.emit(null, this);
                    }
                }

                public C156442(FlowCollector flowCollector) {
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
                        StreamOrderContextResponseDto streamOrderContextResponseDtoFromProto = StreamOrderContextResponseDto.INSTANCE.fromProto((StreamOrderContextResponse) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamOrderContextResponseDtoFromProto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super StreamOrderContextResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C156442(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
