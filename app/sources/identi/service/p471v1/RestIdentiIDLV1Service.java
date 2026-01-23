package identi.service.p471v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionRequestDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionResponseDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestIdentiIDLV1Service.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/RestIdentiIDLV1Service;", "", "Lidenti/service/v1/IdentiIDLV1ServiceRetrofit;", "retrofit", "<init>", "(Lidenti/service/v1/IdentiIDLV1ServiceRetrofit;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "request", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "WorkflowAction", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidenti/service/v1/GetFullNinRequestDto;", "Lidenti/service/v1/GetFullNinResponseDto;", "GetFullNin", "(Lidenti/service/v1/GetFullNinRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidenti/service/v1/IdentiIDLV1ServiceRetrofit;", "identi.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class RestIdentiIDLV1Service {
    private final IdentiIDLV1ServiceRetrofit retrofit;

    /* compiled from: RestIdentiIDLV1Service.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "identi.service.v1.RestIdentiIDLV1Service", m3645f = "RestIdentiIDLV1Service.kt", m3646l = {59}, m3647m = "GetFullNin")
    /* renamed from: identi.service.v1.RestIdentiIDLV1Service$GetFullNin$1 */
    static final class C451991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451991(Continuation<? super C451991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestIdentiIDLV1Service.this.GetFullNin((GetFullNinRequestDto) null, this);
        }
    }

    /* compiled from: RestIdentiIDLV1Service.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "identi.service.v1.RestIdentiIDLV1Service", m3645f = "RestIdentiIDLV1Service.kt", m3646l = {65}, m3647m = "GetFullNin")
    /* renamed from: identi.service.v1.RestIdentiIDLV1Service$GetFullNin$2 */
    static final class C452002 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C452002(Continuation<? super C452002> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestIdentiIDLV1Service.this.GetFullNin((Request<GetFullNinRequestDto>) null, this);
        }
    }

    /* compiled from: RestIdentiIDLV1Service.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "identi.service.v1.RestIdentiIDLV1Service", m3645f = "RestIdentiIDLV1Service.kt", m3646l = {40}, m3647m = "WorkflowAction")
    /* renamed from: identi.service.v1.RestIdentiIDLV1Service$WorkflowAction$1 */
    static final class C452011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C452011(Continuation<? super C452011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestIdentiIDLV1Service.this.WorkflowAction((WorkflowActionRequestDto) null, this);
        }
    }

    /* compiled from: RestIdentiIDLV1Service.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "identi.service.v1.RestIdentiIDLV1Service", m3645f = "RestIdentiIDLV1Service.kt", m3646l = {48}, m3647m = "WorkflowAction")
    /* renamed from: identi.service.v1.RestIdentiIDLV1Service$WorkflowAction$2 */
    static final class C452022 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C452022(Continuation<? super C452022> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestIdentiIDLV1Service.this.WorkflowAction((Request<WorkflowActionRequestDto>) null, this);
        }
    }

    public RestIdentiIDLV1Service(IdentiIDLV1ServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WorkflowAction(WorkflowActionRequestDto workflowActionRequestDto, Continuation<? super WorkflowActionResponseDto> continuation) {
        C452011 c452011;
        if (continuation instanceof C452011) {
            c452011 = (C452011) continuation;
            int i = c452011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c452011.label = i - Integer.MIN_VALUE;
            } else {
                c452011 = new C452011(continuation);
            }
        }
        Object objWorkflowAction = c452011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c452011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWorkflowAction);
            Request<WorkflowActionRequestDto> request = new Request<>(workflowActionRequestDto, null, 2, null);
            c452011.label = 1;
            objWorkflowAction = WorkflowAction(request, c452011);
            if (objWorkflowAction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWorkflowAction);
        }
        return ((Response) objWorkflowAction).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WorkflowAction(Request<WorkflowActionRequestDto> request, Continuation<? super Response<WorkflowActionResponseDto>> continuation) {
        C452022 c452022;
        if (continuation instanceof C452022) {
            c452022 = (C452022) continuation;
            int i = c452022.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c452022.label = i - Integer.MIN_VALUE;
            } else {
                c452022 = new C452022(continuation);
            }
        }
        Object objWorkflowAction = c452022.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c452022.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWorkflowAction);
            IdentiIDLV1ServiceRetrofit identiIDLV1ServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            WorkflowActionRequestDto data = request.getData();
            c452022.label = 1;
            objWorkflowAction = identiIDLV1ServiceRetrofit.WorkflowAction(metadata, id, data, c452022);
            if (objWorkflowAction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWorkflowAction);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objWorkflowAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFullNin(GetFullNinRequestDto getFullNinRequestDto, Continuation<? super GetFullNinResponseDto> continuation) {
        C451991 c451991;
        if (continuation instanceof C451991) {
            c451991 = (C451991) continuation;
            int i = c451991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451991.label = i - Integer.MIN_VALUE;
            } else {
                c451991 = new C451991(continuation);
            }
        }
        Object objGetFullNin = c451991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFullNin);
            Request<GetFullNinRequestDto> request = new Request<>(getFullNinRequestDto, null, 2, null);
            c451991.label = 1;
            objGetFullNin = GetFullNin(request, c451991);
            if (objGetFullNin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFullNin);
        }
        return ((Response) objGetFullNin).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFullNin(Request<GetFullNinRequestDto> request, Continuation<? super Response<GetFullNinResponseDto>> continuation) {
        C452002 c452002;
        if (continuation instanceof C452002) {
            c452002 = (C452002) continuation;
            int i = c452002.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c452002.label = i - Integer.MIN_VALUE;
            } else {
                c452002 = new C452002(continuation);
            }
        }
        Object objGetFullNin = c452002.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c452002.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFullNin);
            IdentiIDLV1ServiceRetrofit identiIDLV1ServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c452002.label = 1;
            objGetFullNin = identiIDLV1ServiceRetrofit.GetFullNin(metadata, c452002);
            if (objGetFullNin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFullNin);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFullNin);
    }
}
