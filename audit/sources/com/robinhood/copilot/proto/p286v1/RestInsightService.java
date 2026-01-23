package com.robinhood.copilot.proto.p286v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RestInsightService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/RestInsightService;", "Lcom/robinhood/copilot/proto/v1/InsightService;", "retrofit", "Lcom/robinhood/copilot/proto/v1/InsightServiceRetrofit;", "<init>", "(Lcom/robinhood/copilot/proto/v1/InsightServiceRetrofit;)V", "GetInsights", "Lcom/robinhood/copilot/proto/v1/GetInsightsResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateInsights", "Lcom/robinhood/copilot/proto/v1/CreateInsightsResponseDto;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLatestInsight", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class RestInsightService implements InsightService {
    private final InsightServiceRetrofit retrofit;

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {46}, m3647m = "CreateInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$CreateInsights$1 */
    static final class C329261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329261(Continuation<? super C329261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.CreateInsights((CreateInsightsRequestDto) null, this);
        }
    }

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {52}, m3647m = "CreateInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$CreateInsights$2 */
    static final class C329272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329272(Continuation<? super C329272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.CreateInsights((Request<CreateInsightsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {23}, m3647m = "GetInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$GetInsights$1 */
    static final class C329281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329281(Continuation<? super C329281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.GetInsights((GetInsightsRequestDto) null, this);
        }
    }

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {31}, m3647m = "GetInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$GetInsights$2 */
    static final class C329292 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329292(Continuation<? super C329292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.GetInsights((Request<GetInsightsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {62}, m3647m = "GetLatestInsight")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$GetLatestInsight$1 */
    static final class C329301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329301(Continuation<? super C329301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.GetLatestInsight((GetLatestInsightRequestDto) null, this);
        }
    }

    /* compiled from: RestInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestInsightService", m3645f = "RestInsightService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "GetLatestInsight")
    /* renamed from: com.robinhood.copilot.proto.v1.RestInsightService$GetLatestInsight$2 */
    static final class C329312 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329312(Continuation<? super C329312> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInsightService.this.GetLatestInsight((Request<GetLatestInsightRequestDto>) null, this);
        }
    }

    public RestInsightService(InsightServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetInsights(GetInsightsRequestDto getInsightsRequestDto, Continuation<? super GetInsightsResponseDto> continuation) {
        C329281 c329281;
        if (continuation instanceof C329281) {
            c329281 = (C329281) continuation;
            int i = c329281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329281.label = i - Integer.MIN_VALUE;
            } else {
                c329281 = new C329281(continuation);
            }
        }
        Object objGetInsights = c329281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetInsights);
            Request<GetInsightsRequestDto> request = new Request<>(getInsightsRequestDto, null, 2, null);
            c329281.label = 1;
            objGetInsights = GetInsights(request, c329281);
            if (objGetInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetInsights);
        }
        return ((Response) objGetInsights).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetInsights(Request<GetInsightsRequestDto> request, Continuation<? super Response<GetInsightsResponseDto>> continuation) {
        C329292 c329292;
        if (continuation instanceof C329292) {
            c329292 = (C329292) continuation;
            int i = c329292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329292.label = i - Integer.MIN_VALUE;
            } else {
                c329292 = new C329292(continuation);
            }
        }
        C329292 c3292922 = c329292;
        Object objGetInsights = c3292922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3292922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetInsights);
            InsightServiceRetrofit insightServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String instrument_id = request.getData().getInstrument_id();
            List<InsightCategoryDto> categories = request.getData().getCategories();
            Instant start_date = request.getData().getStart_date();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant start_date2 = !Intrinsics.areEqual(start_date, instantOfEpochSecond) ? request.getData().getStart_date() : null;
            Instant end_date = request.getData().getEnd_date();
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            Instant end_date2 = !Intrinsics.areEqual(end_date, instantOfEpochSecond2) ? request.getData().getEnd_date() : null;
            Integer numBoxInt = request.getData().getPage_offset() != 0 ? boxing.boxInt(request.getData().getPage_offset()) : null;
            Integer numBoxInt2 = request.getData().getPage_size() != 0 ? boxing.boxInt(request.getData().getPage_size()) : null;
            c3292922.label = 1;
            objGetInsights = insightServiceRetrofit.GetInsights(metadata, instrument_id, categories, start_date2, end_date2, numBoxInt, numBoxInt2, c3292922);
            if (objGetInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetInsights);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetInsights);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateInsights(CreateInsightsRequestDto createInsightsRequestDto, Continuation<? super CreateInsightsResponseDto> continuation) {
        C329261 c329261;
        if (continuation instanceof C329261) {
            c329261 = (C329261) continuation;
            int i = c329261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329261.label = i - Integer.MIN_VALUE;
            } else {
                c329261 = new C329261(continuation);
            }
        }
        Object objCreateInsights = c329261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateInsights);
            Request<CreateInsightsRequestDto> request = new Request<>(createInsightsRequestDto, null, 2, null);
            c329261.label = 1;
            objCreateInsights = CreateInsights(request, c329261);
            if (objCreateInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateInsights);
        }
        return ((Response) objCreateInsights).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateInsights(Request<CreateInsightsRequestDto> request, Continuation<? super Response<CreateInsightsResponseDto>> continuation) {
        C329272 c329272;
        if (continuation instanceof C329272) {
            c329272 = (C329272) continuation;
            int i = c329272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329272.label = i - Integer.MIN_VALUE;
            } else {
                c329272 = new C329272(continuation);
            }
        }
        Object objCreateInsights = c329272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateInsights);
            InsightServiceRetrofit insightServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateInsightsRequestDto data = request.getData();
            c329272.label = 1;
            objCreateInsights = insightServiceRetrofit.CreateInsights(metadata, data, c329272);
            if (objCreateInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateInsights);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateInsights);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLatestInsight(GetLatestInsightRequestDto getLatestInsightRequestDto, Continuation<? super GetLatestInsightResponseDto> continuation) {
        C329301 c329301;
        if (continuation instanceof C329301) {
            c329301 = (C329301) continuation;
            int i = c329301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329301.label = i - Integer.MIN_VALUE;
            } else {
                c329301 = new C329301(continuation);
            }
        }
        Object objGetLatestInsight = c329301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLatestInsight);
            Request<GetLatestInsightRequestDto> request = new Request<>(getLatestInsightRequestDto, null, 2, null);
            c329301.label = 1;
            objGetLatestInsight = GetLatestInsight(request, c329301);
            if (objGetLatestInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetLatestInsight);
        }
        return ((Response) objGetLatestInsight).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLatestInsight(Request<GetLatestInsightRequestDto> request, Continuation<? super Response<GetLatestInsightResponseDto>> continuation) {
        C329312 c329312;
        if (continuation instanceof C329312) {
            c329312 = (C329312) continuation;
            int i = c329312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329312.label = i - Integer.MIN_VALUE;
            } else {
                c329312 = new C329312(continuation);
            }
        }
        Object objGetLatestInsight = c329312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLatestInsight);
            InsightServiceRetrofit insightServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String instrument_id = request.getData().getInstrument_id();
            c329312.label = 1;
            objGetLatestInsight = insightServiceRetrofit.GetLatestInsight(metadata, instrument_id, c329312);
            if (objGetLatestInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetLatestInsight);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetLatestInsight);
    }
}
