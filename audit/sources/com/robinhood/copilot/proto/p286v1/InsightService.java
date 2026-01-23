package com.robinhood.copilot.proto.p286v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InsightService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightService;", "", "GetInsights", "Lcom/robinhood/copilot/proto/v1/GetInsightsResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateInsights", "Lcom/robinhood/copilot/proto/v1/CreateInsightsResponseDto;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLatestInsight", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface InsightService {

    /* compiled from: InsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.InsightService$DefaultImpls", m3645f = "InsightService.kt", m3646l = {37}, m3647m = "CreateInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.InsightService$CreateInsights$1 */
    static final class C329091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329091(Continuation<? super C329091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateInsights(null, null, this);
        }
    }

    /* compiled from: InsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.InsightService$DefaultImpls", m3645f = "InsightService.kt", m3646l = {27}, m3647m = "GetInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.InsightService$GetInsights$1 */
    static final class C329101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329101(Continuation<? super C329101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetInsights(null, null, this);
        }
    }

    /* compiled from: InsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.InsightService$DefaultImpls", m3645f = "InsightService.kt", m3646l = {47}, m3647m = "GetLatestInsight")
    /* renamed from: com.robinhood.copilot.proto.v1.InsightService$GetLatestInsight$1 */
    static final class C329111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329111(Continuation<? super C329111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetLatestInsight(null, null, this);
        }
    }

    Object CreateInsights(CreateInsightsRequestDto createInsightsRequestDto, Continuation<? super CreateInsightsResponseDto> continuation);

    Object CreateInsights(Request<CreateInsightsRequestDto> request, Continuation<? super Response<CreateInsightsResponseDto>> continuation);

    Object GetInsights(GetInsightsRequestDto getInsightsRequestDto, Continuation<? super GetInsightsResponseDto> continuation);

    Object GetInsights(Request<GetInsightsRequestDto> request, Continuation<? super Response<GetInsightsResponseDto>> continuation);

    Object GetLatestInsight(GetLatestInsightRequestDto getLatestInsightRequestDto, Continuation<? super GetLatestInsightResponseDto> continuation);

    Object GetLatestInsight(Request<GetLatestInsightRequestDto> request, Continuation<? super Response<GetLatestInsightResponseDto>> continuation);

    /* compiled from: InsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetInsights(InsightService insightService, Request<GetInsightsRequestDto> request, Continuation<? super Response<GetInsightsResponseDto>> continuation) {
            C329101 c329101;
            if (continuation instanceof C329101) {
                c329101 = (C329101) continuation;
                int i = c329101.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c329101.label = i - Integer.MIN_VALUE;
                } else {
                    c329101 = new C329101(continuation);
                }
            }
            Object objGetInsights = c329101.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c329101.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetInsights);
                GetInsightsRequestDto data = request.getData();
                c329101.label = 1;
                objGetInsights = insightService.GetInsights(data, c329101);
                if (objGetInsights == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetInsights);
            }
            return new Response(objGetInsights, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateInsights(InsightService insightService, Request<CreateInsightsRequestDto> request, Continuation<? super Response<CreateInsightsResponseDto>> continuation) {
            C329091 c329091;
            if (continuation instanceof C329091) {
                c329091 = (C329091) continuation;
                int i = c329091.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c329091.label = i - Integer.MIN_VALUE;
                } else {
                    c329091 = new C329091(continuation);
                }
            }
            Object objCreateInsights = c329091.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c329091.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateInsights);
                CreateInsightsRequestDto data = request.getData();
                c329091.label = 1;
                objCreateInsights = insightService.CreateInsights(data, c329091);
                if (objCreateInsights == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateInsights);
            }
            return new Response(objCreateInsights, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetLatestInsight(InsightService insightService, Request<GetLatestInsightRequestDto> request, Continuation<? super Response<GetLatestInsightResponseDto>> continuation) {
            C329111 c329111;
            if (continuation instanceof C329111) {
                c329111 = (C329111) continuation;
                int i = c329111.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c329111.label = i - Integer.MIN_VALUE;
                } else {
                    c329111 = new C329111(continuation);
                }
            }
            Object objGetLatestInsight = c329111.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c329111.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetLatestInsight);
                GetLatestInsightRequestDto data = request.getData();
                c329111.label = 1;
                objGetLatestInsight = insightService.GetLatestInsight(data, c329111);
                if (objGetLatestInsight == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetLatestInsight);
            }
            return new Response(objGetLatestInsight, null, 2, null);
        }
    }
}
