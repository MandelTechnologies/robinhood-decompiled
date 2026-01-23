package hippo.service.p470v1;

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

/* compiled from: RestBWWorkspaceService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lhippo/service/v1/RestBWWorkspaceService;", "Lhippo/service/v1/BWWorkspaceService;", "Lhippo/service/v1/BWWorkspaceServiceRetrofit;", "retrofit", "<init>", "(Lhippo/service/v1/BWWorkspaceServiceRetrofit;)V", "Lhippo/service/v1/GetAppSettingsRequestDto;", "request", "Lhippo/service/v1/GetAppSettingsResponseDto;", "GetAppSettings", "(Lhippo/service/v1/GetAppSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhippo/service/v1/GetAllLinkingGroupsRequestDto;", "Lhippo/service/v1/GetAllLinkingGroupsResponseDto;", "GetAllLinkingGroups", "(Lhippo/service/v1/GetAllLinkingGroupsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhippo/service/v1/BWWorkspaceServiceRetrofit;", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RestBWWorkspaceService implements BWWorkspaceService {
    private final BWWorkspaceServiceRetrofit retrofit;

    /* compiled from: RestBWWorkspaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestBWWorkspaceService", m3645f = "RestBWWorkspaceService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "GetAllLinkingGroups")
    /* renamed from: hippo.service.v1.RestBWWorkspaceService$GetAllLinkingGroups$1 */
    static final class C451691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451691(Continuation<? super C451691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBWWorkspaceService.this.GetAllLinkingGroups((GetAllLinkingGroupsRequestDto) null, this);
        }
    }

    /* compiled from: RestBWWorkspaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestBWWorkspaceService", m3645f = "RestBWWorkspaceService.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE}, m3647m = "GetAllLinkingGroups")
    /* renamed from: hippo.service.v1.RestBWWorkspaceService$GetAllLinkingGroups$2 */
    static final class C451702 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451702(Continuation<? super C451702> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBWWorkspaceService.this.GetAllLinkingGroups((Request<GetAllLinkingGroupsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBWWorkspaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestBWWorkspaceService", m3645f = "RestBWWorkspaceService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "GetAppSettings")
    /* renamed from: hippo.service.v1.RestBWWorkspaceService$GetAppSettings$1 */
    static final class C451711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451711(Continuation<? super C451711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBWWorkspaceService.this.GetAppSettings((GetAppSettingsRequestDto) null, this);
        }
    }

    /* compiled from: RestBWWorkspaceService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestBWWorkspaceService", m3645f = "RestBWWorkspaceService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "GetAppSettings")
    /* renamed from: hippo.service.v1.RestBWWorkspaceService$GetAppSettings$2 */
    static final class C451722 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451722(Continuation<? super C451722> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBWWorkspaceService.this.GetAppSettings((Request<GetAppSettingsRequestDto>) null, this);
        }
    }

    public RestBWWorkspaceService(BWWorkspaceServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hippo.service.p470v1.BWWorkspaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAppSettings(GetAppSettingsRequestDto getAppSettingsRequestDto, Continuation<? super GetAppSettingsResponseDto> continuation) {
        C451711 c451711;
        if (continuation instanceof C451711) {
            c451711 = (C451711) continuation;
            int i = c451711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451711.label = i - Integer.MIN_VALUE;
            } else {
                c451711 = new C451711(continuation);
            }
        }
        Object objGetAppSettings = c451711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAppSettings);
            Request<GetAppSettingsRequestDto> request = new Request<>(getAppSettingsRequestDto, null, 2, null);
            c451711.label = 1;
            objGetAppSettings = GetAppSettings(request, c451711);
            if (objGetAppSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAppSettings);
        }
        return ((Response) objGetAppSettings).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAppSettings(Request<GetAppSettingsRequestDto> request, Continuation<? super Response<GetAppSettingsResponseDto>> continuation) {
        C451722 c451722;
        if (continuation instanceof C451722) {
            c451722 = (C451722) continuation;
            int i = c451722.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451722.label = i - Integer.MIN_VALUE;
            } else {
                c451722 = new C451722(continuation);
            }
        }
        Object objGetAppSettings = c451722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAppSettings);
            BWWorkspaceServiceRetrofit bWWorkspaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c451722.label = 1;
            objGetAppSettings = bWWorkspaceServiceRetrofit.GetAppSettings(metadata, c451722);
            if (objGetAppSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAppSettings);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAppSettings);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hippo.service.p470v1.BWWorkspaceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAllLinkingGroups(GetAllLinkingGroupsRequestDto getAllLinkingGroupsRequestDto, Continuation<? super GetAllLinkingGroupsResponseDto> continuation) {
        C451691 c451691;
        if (continuation instanceof C451691) {
            c451691 = (C451691) continuation;
            int i = c451691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451691.label = i - Integer.MIN_VALUE;
            } else {
                c451691 = new C451691(continuation);
            }
        }
        Object objGetAllLinkingGroups = c451691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAllLinkingGroups);
            Request<GetAllLinkingGroupsRequestDto> request = new Request<>(getAllLinkingGroupsRequestDto, null, 2, null);
            c451691.label = 1;
            objGetAllLinkingGroups = GetAllLinkingGroups(request, c451691);
            if (objGetAllLinkingGroups == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAllLinkingGroups);
        }
        return ((Response) objGetAllLinkingGroups).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAllLinkingGroups(Request<GetAllLinkingGroupsRequestDto> request, Continuation<? super Response<GetAllLinkingGroupsResponseDto>> continuation) {
        C451702 c451702;
        if (continuation instanceof C451702) {
            c451702 = (C451702) continuation;
            int i = c451702.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451702.label = i - Integer.MIN_VALUE;
            } else {
                c451702 = new C451702(continuation);
            }
        }
        Object objGetAllLinkingGroups = c451702.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451702.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAllLinkingGroups);
            BWWorkspaceServiceRetrofit bWWorkspaceServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c451702.label = 1;
            objGetAllLinkingGroups = bWWorkspaceServiceRetrofit.GetAllLinkingGroups(metadata, c451702);
            if (objGetAllLinkingGroups == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAllLinkingGroups);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAllLinkingGroups);
    }
}
