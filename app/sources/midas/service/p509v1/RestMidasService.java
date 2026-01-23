package midas.service.p509v1;

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

/* compiled from: RestMidasService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmidas/service/v1/RestMidasService;", "Lmidas/service/v1/MidasService;", "Lmidas/service/v1/MidasServiceRetrofit;", "retrofit", "<init>", "(Lmidas/service/v1/MidasServiceRetrofit;)V", "Lmidas/service/v1/SwitchPlansContentRequestDto;", "request", "Lmidas/service/v1/SwitchPlansContentResponseDto;", "SwitchPlansContent", "(Lmidas/service/v1/SwitchPlansContentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmidas/service/v1/MidasServiceRetrofit;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RestMidasService implements MidasService {
    private final MidasServiceRetrofit retrofit;

    /* compiled from: RestMidasService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "midas.service.v1.RestMidasService", m3645f = "RestMidasService.kt", m3646l = {51}, m3647m = "SwitchPlansContent")
    /* renamed from: midas.service.v1.RestMidasService$SwitchPlansContent$1 */
    static final class C470021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470021(Continuation<? super C470021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMidasService.this.SwitchPlansContent((SwitchPlansContentRequestDto) null, this);
        }
    }

    /* compiled from: RestMidasService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "midas.service.v1.RestMidasService", m3645f = "RestMidasService.kt", m3646l = {57}, m3647m = "SwitchPlansContent")
    /* renamed from: midas.service.v1.RestMidasService$SwitchPlansContent$2 */
    static final class C470032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470032(Continuation<? super C470032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMidasService.this.SwitchPlansContent((Request<SwitchPlansContentRequestDto>) null, this);
        }
    }

    public RestMidasService(MidasServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // midas.service.p509v1.MidasService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SwitchPlansContent(SwitchPlansContentRequestDto switchPlansContentRequestDto, Continuation<? super SwitchPlansContentResponseDto> continuation) {
        C470021 c470021;
        if (continuation instanceof C470021) {
            c470021 = (C470021) continuation;
            int i = c470021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470021.label = i - Integer.MIN_VALUE;
            } else {
                c470021 = new C470021(continuation);
            }
        }
        Object objSwitchPlansContent = c470021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSwitchPlansContent);
            Request<SwitchPlansContentRequestDto> request = new Request<>(switchPlansContentRequestDto, null, 2, null);
            c470021.label = 1;
            objSwitchPlansContent = SwitchPlansContent(request, c470021);
            if (objSwitchPlansContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSwitchPlansContent);
        }
        return ((Response) objSwitchPlansContent).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SwitchPlansContent(Request<SwitchPlansContentRequestDto> request, Continuation<? super Response<SwitchPlansContentResponseDto>> continuation) {
        C470032 c470032;
        if (continuation instanceof C470032) {
            c470032 = (C470032) continuation;
            int i = c470032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470032.label = i - Integer.MIN_VALUE;
            } else {
                c470032 = new C470032(continuation);
            }
        }
        C470032 c4700322 = c470032;
        Object objSwitchPlansContent = c4700322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4700322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSwitchPlansContent);
            MidasServiceRetrofit midasServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = request.getData().getRhs_account_number();
            String feature = request.getData().getFeature();
            String logging_source = request.getData().getLogging_source();
            c4700322.label = 1;
            objSwitchPlansContent = midasServiceRetrofit.SwitchPlansContent(metadata, rhs_account_number, feature, logging_source, c4700322);
            if (objSwitchPlansContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSwitchPlansContent);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSwitchPlansContent);
    }
}
