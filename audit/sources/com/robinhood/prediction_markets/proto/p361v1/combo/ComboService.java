package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComboService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;", "", "CreateComboRFQ", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ComboService {

    /* compiled from: ComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.ComboService$DefaultImpls", m3645f = "ComboService.kt", m3646l = {22}, m3647m = "CreateComboRFQ")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.ComboService$CreateComboRFQ$1 */
    static final class C359601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359601(Continuation<? super C359601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateComboRFQ(null, null, this);
        }
    }

    /* compiled from: ComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.ComboService$DefaultImpls", m3645f = "ComboService.kt", m3646l = {34}, m3647m = "GetComboProposals")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.ComboService$GetComboProposals$1 */
    static final class C359611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359611(Continuation<? super C359611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetComboProposals(null, null, this);
        }
    }

    Object CreateComboRFQ(Request<CreateComboRFQRequestDto> request, Continuation<? super Response<CreateComboRFQResponseDto>> continuation);

    Object CreateComboRFQ(CreateComboRFQRequestDto createComboRFQRequestDto, Continuation<? super CreateComboRFQResponseDto> continuation);

    Object GetComboProposals(Request<GetComboProposalsRequestDto> request, Continuation<? super Response<GetComboProposalsResponseDto>> continuation);

    Object GetComboProposals(GetComboProposalsRequestDto getComboProposalsRequestDto, Continuation<? super GetComboProposalsResponseDto> continuation);

    /* compiled from: ComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateComboRFQ(ComboService comboService, Request<CreateComboRFQRequestDto> request, Continuation<? super Response<CreateComboRFQResponseDto>> continuation) {
            C359601 c359601;
            if (continuation instanceof C359601) {
                c359601 = (C359601) continuation;
                int i = c359601.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c359601.label = i - Integer.MIN_VALUE;
                } else {
                    c359601 = new C359601(continuation);
                }
            }
            Object objCreateComboRFQ = c359601.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c359601.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateComboRFQ);
                CreateComboRFQRequestDto data = request.getData();
                c359601.label = 1;
                objCreateComboRFQ = comboService.CreateComboRFQ(data, c359601);
                if (objCreateComboRFQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateComboRFQ);
            }
            return new Response(objCreateComboRFQ, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetComboProposals(ComboService comboService, Request<GetComboProposalsRequestDto> request, Continuation<? super Response<GetComboProposalsResponseDto>> continuation) {
            C359611 c359611;
            if (continuation instanceof C359611) {
                c359611 = (C359611) continuation;
                int i = c359611.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c359611.label = i - Integer.MIN_VALUE;
                } else {
                    c359611 = new C359611(continuation);
                }
            }
            Object objGetComboProposals = c359611.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c359611.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetComboProposals);
                GetComboProposalsRequestDto data = request.getData();
                c359611.label = 1;
                objGetComboProposals = comboService.GetComboProposals(data, c359611);
                if (objGetComboProposals == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetComboProposals);
            }
            return new Response(objGetComboProposals, null, 2, null);
        }
    }
}
