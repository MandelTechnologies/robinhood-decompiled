package gold.proto.p464v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestGoldService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lgold/proto/v1/RestGoldService;", "Lgold/proto/v1/GoldService;", "Lgold/proto/v1/GoldServiceRetrofit;", "retrofit", "<init>", "(Lgold/proto/v1/GoldServiceRetrofit;)V", "Lgold/proto/v1/GetSageFlowRequestDto;", "request", "Lgold/proto/v1/GetSageFlowResponseDto;", "GetSageFlow", "(Lgold/proto/v1/GetSageFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/CreateSageApplicationRequestDto;", "Lgold/proto/v1/CreateSageApplicationResponseDto;", "CreateSageApplication", "(Lgold/proto/v1/CreateSageApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/GetSageRateRequestDto;", "Lgold/proto/v1/GetSageRateResponseDto;", "GetSageRate", "(Lgold/proto/v1/GetSageRateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/GoldServiceRetrofit;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RestGoldService implements GoldService {
    private final GoldServiceRetrofit retrofit;

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {52}, m3647m = "CreateSageApplication")
    /* renamed from: gold.proto.v1.RestGoldService$CreateSageApplication$1 */
    static final class C449271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449271(Continuation<? super C449271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.CreateSageApplication((CreateSageApplicationRequestDto) null, this);
        }
    }

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {58}, m3647m = "CreateSageApplication")
    /* renamed from: gold.proto.v1.RestGoldService$CreateSageApplication$2 */
    static final class C449282 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449282(Continuation<? super C449282> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.CreateSageApplication((Request<CreateSageApplicationRequestDto>) null, this);
        }
    }

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {36}, m3647m = "GetSageFlow")
    /* renamed from: gold.proto.v1.RestGoldService$GetSageFlow$1 */
    static final class C449291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449291(Continuation<? super C449291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.GetSageFlow((GetSageFlowRequestDto) null, this);
        }
    }

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {42}, m3647m = "GetSageFlow")
    /* renamed from: gold.proto.v1.RestGoldService$GetSageFlow$2 */
    static final class C449302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449302(Continuation<? super C449302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.GetSageFlow((Request<GetSageFlowRequestDto>) null, this);
        }
    }

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "GetSageRate")
    /* renamed from: gold.proto.v1.RestGoldService$GetSageRate$1 */
    static final class C449311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449311(Continuation<? super C449311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.GetSageRate((GetSageRateRequestDto) null, this);
        }
    }

    /* compiled from: RestGoldService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "gold.proto.v1.RestGoldService", m3645f = "RestGoldService.kt", m3646l = {74}, m3647m = "GetSageRate")
    /* renamed from: gold.proto.v1.RestGoldService$GetSageRate$2 */
    static final class C449322 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C449322(Continuation<? super C449322> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestGoldService.this.GetSageRate((Request<GetSageRateRequestDto>) null, this);
        }
    }

    public RestGoldService(GoldServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // gold.proto.p464v1.GoldService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSageFlow(GetSageFlowRequestDto getSageFlowRequestDto, Continuation<? super GetSageFlowResponseDto> continuation) {
        C449291 c449291;
        if (continuation instanceof C449291) {
            c449291 = (C449291) continuation;
            int i = c449291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449291.label = i - Integer.MIN_VALUE;
            } else {
                c449291 = new C449291(continuation);
            }
        }
        Object objGetSageFlow = c449291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSageFlow);
            Request<GetSageFlowRequestDto> request = new Request<>(getSageFlowRequestDto, null, 2, null);
            c449291.label = 1;
            objGetSageFlow = GetSageFlow(request, c449291);
            if (objGetSageFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSageFlow);
        }
        return ((Response) objGetSageFlow).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSageFlow(Request<GetSageFlowRequestDto> request, Continuation<? super Response<GetSageFlowResponseDto>> continuation) {
        C449302 c449302;
        if (continuation instanceof C449302) {
            c449302 = (C449302) continuation;
            int i = c449302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449302.label = i - Integer.MIN_VALUE;
            } else {
                c449302 = new C449302(continuation);
            }
        }
        Object objGetSageFlow = c449302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSageFlow);
            GoldServiceRetrofit goldServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String source = request.getData().getSource();
            c449302.label = 1;
            objGetSageFlow = goldServiceRetrofit.GetSageFlow(metadata, source, c449302);
            if (objGetSageFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSageFlow);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSageFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // gold.proto.p464v1.GoldService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateSageApplication(CreateSageApplicationRequestDto createSageApplicationRequestDto, Continuation<? super CreateSageApplicationResponseDto> continuation) {
        C449271 c449271;
        if (continuation instanceof C449271) {
            c449271 = (C449271) continuation;
            int i = c449271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449271.label = i - Integer.MIN_VALUE;
            } else {
                c449271 = new C449271(continuation);
            }
        }
        Object objCreateSageApplication = c449271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateSageApplication);
            Request<CreateSageApplicationRequestDto> request = new Request<>(createSageApplicationRequestDto, null, 2, null);
            c449271.label = 1;
            objCreateSageApplication = CreateSageApplication(request, c449271);
            if (objCreateSageApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateSageApplication);
        }
        return ((Response) objCreateSageApplication).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateSageApplication(Request<CreateSageApplicationRequestDto> request, Continuation<? super Response<CreateSageApplicationResponseDto>> continuation) {
        C449282 c449282;
        if (continuation instanceof C449282) {
            c449282 = (C449282) continuation;
            int i = c449282.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449282.label = i - Integer.MIN_VALUE;
            } else {
                c449282 = new C449282(continuation);
            }
        }
        Object objCreateSageApplication = c449282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449282.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateSageApplication);
            GoldServiceRetrofit goldServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateSageApplicationRequestDto data = request.getData();
            c449282.label = 1;
            objCreateSageApplication = goldServiceRetrofit.CreateSageApplication(metadata, data, c449282);
            if (objCreateSageApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateSageApplication);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateSageApplication);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // gold.proto.p464v1.GoldService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSageRate(GetSageRateRequestDto getSageRateRequestDto, Continuation<? super GetSageRateResponseDto> continuation) {
        C449311 c449311;
        if (continuation instanceof C449311) {
            c449311 = (C449311) continuation;
            int i = c449311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449311.label = i - Integer.MIN_VALUE;
            } else {
                c449311 = new C449311(continuation);
            }
        }
        Object objGetSageRate = c449311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSageRate);
            Request<GetSageRateRequestDto> request = new Request<>(getSageRateRequestDto, null, 2, null);
            c449311.label = 1;
            objGetSageRate = GetSageRate(request, c449311);
            if (objGetSageRate == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSageRate);
        }
        return ((Response) objGetSageRate).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSageRate(Request<GetSageRateRequestDto> request, Continuation<? super Response<GetSageRateResponseDto>> continuation) {
        C449322 c449322;
        if (continuation instanceof C449322) {
            c449322 = (C449322) continuation;
            int i = c449322.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c449322.label = i - Integer.MIN_VALUE;
            } else {
                c449322 = new C449322(continuation);
            }
        }
        Object objGetSageRate = c449322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c449322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSageRate);
            GoldServiceRetrofit goldServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c449322.label = 1;
            objGetSageRate = goldServiceRetrofit.GetSageRate(metadata, c449322);
            if (objGetSageRate == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSageRate);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSageRate);
    }
}
