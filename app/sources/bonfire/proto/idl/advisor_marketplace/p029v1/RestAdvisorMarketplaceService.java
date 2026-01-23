package bonfire.proto.idl.advisor_marketplace.p029v1;

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

/* compiled from: RestAdvisorMarketplaceService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/RestAdvisorMarketplaceService;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceRetrofit;)V", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateRequestDto;", "request", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateResponseDto;", "GetAdvisorDashboardState", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "GetAdvisorMatches", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowResponseDto;", "GetScheduleMeetingFlow", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "GetMeetingsHub", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceRetrofit;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestAdvisorMarketplaceService implements AdvisorMarketplaceService {
    private final AdvisorMarketplaceServiceRetrofit retrofit;

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {20}, m3647m = "GetAdvisorDashboardState")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetAdvisorDashboardState$1 */
    static final class C39131 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39131(Continuation<? super C39131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetAdvisorDashboardState((GetAdvisorDashboardStateRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {26}, m3647m = "GetAdvisorDashboardState")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetAdvisorDashboardState$2 */
    static final class C39142 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39142(Continuation<? super C39142> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetAdvisorDashboardState((Request<GetAdvisorDashboardStateRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {35}, m3647m = "GetAdvisorMatches")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetAdvisorMatches$1 */
    static final class C39151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39151(Continuation<? super C39151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetAdvisorMatches((GetAdvisorMatchesRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {41}, m3647m = "GetAdvisorMatches")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetAdvisorMatches$2 */
    static final class C39162 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39162(Continuation<? super C39162> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetAdvisorMatches((Request<GetAdvisorMatchesRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {116}, m3647m = "GetMeetingsHub")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetMeetingsHub$1 */
    static final class C39171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39171(Continuation<? super C39171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetMeetingsHub((GetMeetingsHubRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "GetMeetingsHub")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetMeetingsHub$2 */
    static final class C39182 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39182(Continuation<? super C39182> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetMeetingsHub((Request<GetMeetingsHubRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {84}, m3647m = "GetScheduleMeetingFlow")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetScheduleMeetingFlow$1 */
    static final class C39191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39191(Continuation<? super C39191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetScheduleMeetingFlow((GetScheduleMeetingFlowRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisorMarketplaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService", m3645f = "RestAdvisorMarketplaceService.kt", m3646l = {90}, m3647m = "GetScheduleMeetingFlow")
    /* renamed from: bonfire.proto.idl.advisor_marketplace.v1.RestAdvisorMarketplaceService$GetScheduleMeetingFlow$2 */
    static final class C39202 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39202(Continuation<? super C39202> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisorMarketplaceService.this.GetScheduleMeetingFlow((Request<GetScheduleMeetingFlowRequestDto>) null, this);
        }
    }

    public RestAdvisorMarketplaceService(AdvisorMarketplaceServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorDashboardState(GetAdvisorDashboardStateRequestDto getAdvisorDashboardStateRequestDto, Continuation<? super GetAdvisorDashboardStateResponseDto> continuation) {
        C39131 c39131;
        if (continuation instanceof C39131) {
            c39131 = (C39131) continuation;
            int i = c39131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39131.label = i - Integer.MIN_VALUE;
            } else {
                c39131 = new C39131(continuation);
            }
        }
        Object objGetAdvisorDashboardState = c39131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorDashboardState);
            Request<GetAdvisorDashboardStateRequestDto> request = new Request<>(getAdvisorDashboardStateRequestDto, null, 2, null);
            c39131.label = 1;
            objGetAdvisorDashboardState = GetAdvisorDashboardState(request, c39131);
            if (objGetAdvisorDashboardState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorDashboardState);
        }
        return ((Response) objGetAdvisorDashboardState).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorDashboardState(Request<GetAdvisorDashboardStateRequestDto> request, Continuation<? super Response<GetAdvisorDashboardStateResponseDto>> continuation) {
        C39142 c39142;
        if (continuation instanceof C39142) {
            c39142 = (C39142) continuation;
            int i = c39142.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39142.label = i - Integer.MIN_VALUE;
            } else {
                c39142 = new C39142(continuation);
            }
        }
        Object objGetAdvisorDashboardState = c39142.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39142.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorDashboardState);
            AdvisorMarketplaceServiceRetrofit advisorMarketplaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c39142.label = 1;
            objGetAdvisorDashboardState = advisorMarketplaceServiceRetrofit.GetAdvisorDashboardState(metadata, c39142);
            if (objGetAdvisorDashboardState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorDashboardState);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisorDashboardState);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorMatches(GetAdvisorMatchesRequestDto getAdvisorMatchesRequestDto, Continuation<? super GetAdvisorMatchesResponseDto> continuation) {
        C39151 c39151;
        if (continuation instanceof C39151) {
            c39151 = (C39151) continuation;
            int i = c39151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39151.label = i - Integer.MIN_VALUE;
            } else {
                c39151 = new C39151(continuation);
            }
        }
        Object objGetAdvisorMatches = c39151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorMatches);
            Request<GetAdvisorMatchesRequestDto> request = new Request<>(getAdvisorMatchesRequestDto, null, 2, null);
            c39151.label = 1;
            objGetAdvisorMatches = GetAdvisorMatches(request, c39151);
            if (objGetAdvisorMatches == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorMatches);
        }
        return ((Response) objGetAdvisorMatches).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorMatches(Request<GetAdvisorMatchesRequestDto> request, Continuation<? super Response<GetAdvisorMatchesResponseDto>> continuation) {
        C39162 c39162;
        if (continuation instanceof C39162) {
            c39162 = (C39162) continuation;
            int i = c39162.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39162.label = i - Integer.MIN_VALUE;
            } else {
                c39162 = new C39162(continuation);
            }
        }
        Object objGetAdvisorMatches = c39162.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39162.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorMatches);
            AdvisorMarketplaceServiceRetrofit advisorMarketplaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c39162.label = 1;
            objGetAdvisorMatches = advisorMarketplaceServiceRetrofit.GetAdvisorMatches(metadata, c39162);
            if (objGetAdvisorMatches == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorMatches);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisorMatches);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetScheduleMeetingFlow(GetScheduleMeetingFlowRequestDto getScheduleMeetingFlowRequestDto, Continuation<? super GetScheduleMeetingFlowResponseDto> continuation) {
        C39191 c39191;
        if (continuation instanceof C39191) {
            c39191 = (C39191) continuation;
            int i = c39191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39191.label = i - Integer.MIN_VALUE;
            } else {
                c39191 = new C39191(continuation);
            }
        }
        Object objGetScheduleMeetingFlow = c39191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
            Request<GetScheduleMeetingFlowRequestDto> request = new Request<>(getScheduleMeetingFlowRequestDto, null, 2, null);
            c39191.label = 1;
            objGetScheduleMeetingFlow = GetScheduleMeetingFlow(request, c39191);
            if (objGetScheduleMeetingFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
        }
        return ((Response) objGetScheduleMeetingFlow).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetScheduleMeetingFlow(Request<GetScheduleMeetingFlowRequestDto> request, Continuation<? super Response<GetScheduleMeetingFlowResponseDto>> continuation) {
        C39202 c39202;
        if (continuation instanceof C39202) {
            c39202 = (C39202) continuation;
            int i = c39202.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39202.label = i - Integer.MIN_VALUE;
            } else {
                c39202 = new C39202(continuation);
            }
        }
        Object objGetScheduleMeetingFlow = c39202.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39202.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
            AdvisorMarketplaceServiceRetrofit advisorMarketplaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String advisor_id = !Intrinsics.areEqual(request.getData().getAdvisor_id(), "") ? request.getData().getAdvisor_id() : null;
            c39202.label = 1;
            objGetScheduleMeetingFlow = advisorMarketplaceServiceRetrofit.GetScheduleMeetingFlow(metadata, advisor_id, c39202);
            if (objGetScheduleMeetingFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetScheduleMeetingFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMeetingsHub(GetMeetingsHubRequestDto getMeetingsHubRequestDto, Continuation<? super GetMeetingsHubResponseDto> continuation) {
        C39171 c39171;
        if (continuation instanceof C39171) {
            c39171 = (C39171) continuation;
            int i = c39171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39171.label = i - Integer.MIN_VALUE;
            } else {
                c39171 = new C39171(continuation);
            }
        }
        Object objGetMeetingsHub = c39171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMeetingsHub);
            Request<GetMeetingsHubRequestDto> request = new Request<>(getMeetingsHubRequestDto, null, 2, null);
            c39171.label = 1;
            objGetMeetingsHub = GetMeetingsHub(request, c39171);
            if (objGetMeetingsHub == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMeetingsHub);
        }
        return ((Response) objGetMeetingsHub).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMeetingsHub(Request<GetMeetingsHubRequestDto> request, Continuation<? super Response<GetMeetingsHubResponseDto>> continuation) {
        C39182 c39182;
        if (continuation instanceof C39182) {
            c39182 = (C39182) continuation;
            int i = c39182.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39182.label = i - Integer.MIN_VALUE;
            } else {
                c39182 = new C39182(continuation);
            }
        }
        Object objGetMeetingsHub = c39182.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39182.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMeetingsHub);
            AdvisorMarketplaceServiceRetrofit advisorMarketplaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c39182.label = 1;
            objGetMeetingsHub = advisorMarketplaceServiceRetrofit.GetMeetingsHub(metadata, c39182);
            if (objGetMeetingsHub == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMeetingsHub);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMeetingsHub);
    }
}
