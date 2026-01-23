package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcEquityService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "grpcClient", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;)V", "ListEquityEventUpdates", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdatesDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GrpcEquityService implements EquityService {
    private final EquityServiceClient grpcClient;

    /* compiled from: GrpcEquityService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcEquityService", m3645f = "GrpcEquityService.kt", m3646l = {17}, m3647m = "ListEquityEventUpdates")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcEquityService$ListEquityEventUpdates$1 */
    static final class C316901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316901(Continuation<? super C316901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcEquityService.this.ListEquityEventUpdates((ListEquityEventUpdatesRequestDto) null, this);
        }
    }

    public GrpcEquityService(EquityServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.EquityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEquityEventUpdates(ListEquityEventUpdatesRequestDto listEquityEventUpdatesRequestDto, Continuation<? super InstrumentEventUpdatesDto> continuation) {
        C316901 c316901;
        if (continuation instanceof C316901) {
            c316901 = (C316901) continuation;
            int i = c316901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316901.label = i - Integer.MIN_VALUE;
            } else {
                c316901 = new C316901(continuation);
            }
        }
        Object objListEquityEventUpdates = c316901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEquityEventUpdates);
            Request<ListEquityEventUpdatesRequestDto> request = new Request<>(listEquityEventUpdatesRequestDto, null, 2, null);
            c316901.label = 1;
            objListEquityEventUpdates = ListEquityEventUpdates(request, c316901);
            if (objListEquityEventUpdates == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEquityEventUpdates);
        }
        return ((Response) objListEquityEventUpdates).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.EquityService
    public Object ListEquityEventUpdates(Request<ListEquityEventUpdatesRequestDto> request, Continuation<? super Response<InstrumentEventUpdatesDto>> continuation) {
        return Response2.handleGrpcCall(request, InstrumentEventUpdatesDto.INSTANCE, this.grpcClient.ListEquityEventUpdates(), continuation);
    }
}
