package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EquityService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "", "ListEquityEventUpdates", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdatesDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface EquityService {

    /* compiled from: EquityService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.EquityService$DefaultImpls", m3645f = "EquityService.kt", m3646l = {13}, m3647m = "ListEquityEventUpdates")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.EquityService$ListEquityEventUpdates$1 */
    static final class C316431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316431(Continuation<? super C316431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEquityEventUpdates(null, null, this);
        }
    }

    Object ListEquityEventUpdates(ListEquityEventUpdatesRequestDto listEquityEventUpdatesRequestDto, Continuation<? super InstrumentEventUpdatesDto> continuation);

    Object ListEquityEventUpdates(Request<ListEquityEventUpdatesRequestDto> request, Continuation<? super Response<InstrumentEventUpdatesDto>> continuation);

    /* compiled from: EquityService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEquityEventUpdates(EquityService equityService, Request<ListEquityEventUpdatesRequestDto> request, Continuation<? super Response<InstrumentEventUpdatesDto>> continuation) {
            C316431 c316431;
            if (continuation instanceof C316431) {
                c316431 = (C316431) continuation;
                int i = c316431.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c316431.label = i - Integer.MIN_VALUE;
                } else {
                    c316431 = new C316431(continuation);
                }
            }
            Object objListEquityEventUpdates = c316431.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c316431.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEquityEventUpdates);
                ListEquityEventUpdatesRequestDto data = request.getData();
                c316431.label = 1;
                objListEquityEventUpdates = equityService.ListEquityEventUpdates(data, c316431);
                if (objListEquityEventUpdates == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEquityEventUpdates);
            }
            return new Response(objListEquityEventUpdates, null, 2, null);
        }
    }
}
