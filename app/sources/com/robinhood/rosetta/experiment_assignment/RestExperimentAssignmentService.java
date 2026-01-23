package com.robinhood.rosetta.experiment_assignment;

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

/* compiled from: RestExperimentAssignmentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/RestExperimentAssignmentService;", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;", "retrofit", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceRetrofit;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceRetrofit;)V", "HTTPAssignExternal", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponseDto;", "request", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "(Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RestExperimentAssignmentService implements ExperimentAssignmentService {
    private final ExperimentAssignmentServiceRetrofit retrofit;

    /* compiled from: RestExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService", m3645f = "RestExperimentAssignmentService.kt", m3646l = {17}, m3647m = "HTTPAssignExternal")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService$HTTPAssignExternal$1 */
    static final class C371271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371271(Continuation<? super C371271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestExperimentAssignmentService.this.HTTPAssignExternal((HTTPAssignRequestDto) null, this);
        }
    }

    /* compiled from: RestExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService", m3645f = "RestExperimentAssignmentService.kt", m3646l = {20}, m3647m = "HTTPAssignExternal")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService$HTTPAssignExternal$2 */
    static final class C371282 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371282(Continuation<? super C371282> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestExperimentAssignmentService.this.HTTPAssignExternal((Request<HTTPAssignRequestDto>) null, this);
        }
    }

    /* compiled from: RestExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService", m3645f = "RestExperimentAssignmentService.kt", m3646l = {38}, m3647m = "HTTPAssignExternalVegeta")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService$HTTPAssignExternalVegeta$1 */
    static final class C371291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371291(Continuation<? super C371291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestExperimentAssignmentService.this.HTTPAssignExternalVegeta((HTTPAssignRequestDto) null, this);
        }
    }

    /* compiled from: RestExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService", m3645f = "RestExperimentAssignmentService.kt", m3646l = {41}, m3647m = "HTTPAssignExternalVegeta")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.RestExperimentAssignmentService$HTTPAssignExternalVegeta$2 */
    static final class C371302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371302(Continuation<? super C371302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestExperimentAssignmentService.this.HTTPAssignExternalVegeta((Request<HTTPAssignRequestDto>) null, this);
        }
    }

    public RestExperimentAssignmentService(ExperimentAssignmentServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternal(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation) {
        C371271 c371271;
        if (continuation instanceof C371271) {
            c371271 = (C371271) continuation;
            int i = c371271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371271.label = i - Integer.MIN_VALUE;
            } else {
                c371271 = new C371271(continuation);
            }
        }
        Object objHTTPAssignExternal = c371271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHTTPAssignExternal);
            Request<HTTPAssignRequestDto> request = new Request<>(hTTPAssignRequestDto, null, 2, null);
            c371271.label = 1;
            objHTTPAssignExternal = HTTPAssignExternal(request, c371271);
            if (objHTTPAssignExternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHTTPAssignExternal);
        }
        return ((Response) objHTTPAssignExternal).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternal(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
        C371282 c371282;
        if (continuation instanceof C371282) {
            c371282 = (C371282) continuation;
            int i = c371282.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371282.label = i - Integer.MIN_VALUE;
            } else {
                c371282 = new C371282(continuation);
            }
        }
        Object obj = c371282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371282.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ExperimentAssignmentServiceRetrofit experimentAssignmentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String entity_id = request.getData().getEntity_id();
            List<String> names = request.getData().getNames();
            String entity_type = !Intrinsics.areEqual(request.getData().getEntity_type(), "") ? request.getData().getEntity_type() : null;
            Boolean trigger = !Intrinsics.areEqual(request.getData().getTrigger(), boxing.boxBoolean(false)) ? request.getData().getTrigger() : null;
            Boolean userleap = !Intrinsics.areEqual(request.getData().getUserleap(), boxing.boxBoolean(false)) ? request.getData().getUserleap() : null;
            String platform = !Intrinsics.areEqual(request.getData().getPlatform(), "") ? request.getData().getPlatform() : null;
            String app_version = !Intrinsics.areEqual(request.getData().getApp_version(), "") ? request.getData().getApp_version() : null;
            String os_version = !Intrinsics.areEqual(request.getData().getOs_version(), "") ? request.getData().getOs_version() : null;
            String user_origin = !Intrinsics.areEqual(request.getData().getUser_origin(), "") ? request.getData().getUser_origin() : null;
            Boolean assignment_logging = !Intrinsics.areEqual(request.getData().getAssignment_logging(), boxing.boxBoolean(false)) ? request.getData().getAssignment_logging() : null;
            String account_type = !Intrinsics.areEqual(request.getData().getAccount_type(), "") ? request.getData().getAccount_type() : null;
            Boolean bool = assignment_logging;
            String application = !Intrinsics.areEqual(request.getData().getApplication(), "") ? request.getData().getApplication() : null;
            c371282.label = 1;
            Boolean bool2 = userleap;
            String str = user_origin;
            Object objHTTPAssignExternal = experimentAssignmentServiceRetrofit.HTTPAssignExternal(metadata, entity_id, names, entity_type, trigger, bool2, platform, app_version, os_version, str, bool, account_type, application, c371282);
            if (objHTTPAssignExternal == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objHTTPAssignExternal;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternalVegeta(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation) {
        C371291 c371291;
        if (continuation instanceof C371291) {
            c371291 = (C371291) continuation;
            int i = c371291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371291.label = i - Integer.MIN_VALUE;
            } else {
                c371291 = new C371291(continuation);
            }
        }
        Object objHTTPAssignExternalVegeta = c371291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
            Request<HTTPAssignRequestDto> request = new Request<>(hTTPAssignRequestDto, null, 2, null);
            c371291.label = 1;
            objHTTPAssignExternalVegeta = HTTPAssignExternalVegeta(request, c371291);
            if (objHTTPAssignExternalVegeta == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
        }
        return ((Response) objHTTPAssignExternalVegeta).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternalVegeta(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
        C371302 c371302;
        if (continuation instanceof C371302) {
            c371302 = (C371302) continuation;
            int i = c371302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371302.label = i - Integer.MIN_VALUE;
            } else {
                c371302 = new C371302(continuation);
            }
        }
        Object obj = c371302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ExperimentAssignmentServiceRetrofit experimentAssignmentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String entity_id = request.getData().getEntity_id();
            List<String> names = request.getData().getNames();
            String entity_type = !Intrinsics.areEqual(request.getData().getEntity_type(), "") ? request.getData().getEntity_type() : null;
            Boolean trigger = !Intrinsics.areEqual(request.getData().getTrigger(), boxing.boxBoolean(false)) ? request.getData().getTrigger() : null;
            Boolean userleap = !Intrinsics.areEqual(request.getData().getUserleap(), boxing.boxBoolean(false)) ? request.getData().getUserleap() : null;
            String platform = !Intrinsics.areEqual(request.getData().getPlatform(), "") ? request.getData().getPlatform() : null;
            String app_version = !Intrinsics.areEqual(request.getData().getApp_version(), "") ? request.getData().getApp_version() : null;
            String os_version = !Intrinsics.areEqual(request.getData().getOs_version(), "") ? request.getData().getOs_version() : null;
            String user_origin = !Intrinsics.areEqual(request.getData().getUser_origin(), "") ? request.getData().getUser_origin() : null;
            Boolean assignment_logging = !Intrinsics.areEqual(request.getData().getAssignment_logging(), boxing.boxBoolean(false)) ? request.getData().getAssignment_logging() : null;
            String account_type = !Intrinsics.areEqual(request.getData().getAccount_type(), "") ? request.getData().getAccount_type() : null;
            Boolean bool = assignment_logging;
            String application = !Intrinsics.areEqual(request.getData().getApplication(), "") ? request.getData().getApplication() : null;
            c371302.label = 1;
            Boolean bool2 = userleap;
            String str = user_origin;
            Object objHTTPAssignExternalVegeta = experimentAssignmentServiceRetrofit.HTTPAssignExternalVegeta(metadata, entity_id, names, entity_type, trigger, bool2, platform, app_version, os_version, str, bool, account_type, application, c371302);
            if (objHTTPAssignExternalVegeta == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objHTTPAssignExternalVegeta;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) obj);
    }
}
