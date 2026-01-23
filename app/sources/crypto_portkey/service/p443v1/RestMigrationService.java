package crypto_portkey.service.p443v1;

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

/* compiled from: RestMigrationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/RestMigrationService;", "Lcrypto_portkey/service/v1/MigrationService;", "Lcrypto_portkey/service/v1/MigrationServiceRetrofit;", "retrofit", "<init>", "(Lcrypto_portkey/service/v1/MigrationServiceRetrofit;)V", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequestDto;", "request", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "ProcessMigrationAuthed", "(Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedRequestDto;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "CheckMigrationEligibilityAuthed", "(Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_portkey/service/v1/MigrationServiceRetrofit;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RestMigrationService implements MigrationService {
    private final MigrationServiceRetrofit retrofit;

    /* compiled from: RestMigrationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_portkey.service.v1.RestMigrationService", m3645f = "RestMigrationService.kt", m3646l = {108}, m3647m = "CheckMigrationEligibilityAuthed")
    /* renamed from: crypto_portkey.service.v1.RestMigrationService$CheckMigrationEligibilityAuthed$1 */
    static final class C444571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C444571(Continuation<? super C444571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMigrationService.this.CheckMigrationEligibilityAuthed((CheckMigrationEligibilityAuthedRequestDto) null, this);
        }
    }

    /* compiled from: RestMigrationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_portkey.service.v1.RestMigrationService", m3645f = "RestMigrationService.kt", m3646l = {114}, m3647m = "CheckMigrationEligibilityAuthed")
    /* renamed from: crypto_portkey.service.v1.RestMigrationService$CheckMigrationEligibilityAuthed$2 */
    static final class C444582 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C444582(Continuation<? super C444582> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMigrationService.this.CheckMigrationEligibilityAuthed((Request<CheckMigrationEligibilityAuthedRequestDto>) null, this);
        }
    }

    /* compiled from: RestMigrationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_portkey.service.v1.RestMigrationService", m3645f = "RestMigrationService.kt", m3646l = {53}, m3647m = "ProcessMigrationAuthed")
    /* renamed from: crypto_portkey.service.v1.RestMigrationService$ProcessMigrationAuthed$1 */
    static final class C444591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C444591(Continuation<? super C444591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMigrationService.this.ProcessMigrationAuthed((ProcessMigrationAuthedRequestDto) null, this);
        }
    }

    /* compiled from: RestMigrationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_portkey.service.v1.RestMigrationService", m3645f = "RestMigrationService.kt", m3646l = {59}, m3647m = "ProcessMigrationAuthed")
    /* renamed from: crypto_portkey.service.v1.RestMigrationService$ProcessMigrationAuthed$2 */
    static final class C444602 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C444602(Continuation<? super C444602> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMigrationService.this.ProcessMigrationAuthed((Request<ProcessMigrationAuthedRequestDto>) null, this);
        }
    }

    public RestMigrationService(MigrationServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_portkey.service.p443v1.MigrationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ProcessMigrationAuthed(ProcessMigrationAuthedRequestDto processMigrationAuthedRequestDto, Continuation<? super ProcessMigrationAuthedResponseDto> continuation) {
        C444591 c444591;
        if (continuation instanceof C444591) {
            c444591 = (C444591) continuation;
            int i = c444591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c444591.label = i - Integer.MIN_VALUE;
            } else {
                c444591 = new C444591(continuation);
            }
        }
        Object objProcessMigrationAuthed = c444591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c444591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objProcessMigrationAuthed);
            Request<ProcessMigrationAuthedRequestDto> request = new Request<>(processMigrationAuthedRequestDto, null, 2, null);
            c444591.label = 1;
            objProcessMigrationAuthed = ProcessMigrationAuthed(request, c444591);
            if (objProcessMigrationAuthed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objProcessMigrationAuthed);
        }
        return ((Response) objProcessMigrationAuthed).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ProcessMigrationAuthed(Request<ProcessMigrationAuthedRequestDto> request, Continuation<? super Response<ProcessMigrationAuthedResponseDto>> continuation) {
        C444602 c444602;
        if (continuation instanceof C444602) {
            c444602 = (C444602) continuation;
            int i = c444602.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c444602.label = i - Integer.MIN_VALUE;
            } else {
                c444602 = new C444602(continuation);
            }
        }
        Object objProcessMigrationAuthed = c444602.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c444602.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objProcessMigrationAuthed);
            MigrationServiceRetrofit migrationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String partner = request.getData().getPartner();
            ProcessMigrationAuthedRequestDto data = request.getData();
            c444602.label = 1;
            objProcessMigrationAuthed = migrationServiceRetrofit.ProcessMigrationAuthed(metadata, partner, data, c444602);
            if (objProcessMigrationAuthed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objProcessMigrationAuthed);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objProcessMigrationAuthed);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_portkey.service.p443v1.MigrationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CheckMigrationEligibilityAuthed(CheckMigrationEligibilityAuthedRequestDto checkMigrationEligibilityAuthedRequestDto, Continuation<? super CheckMigrationEligibilityAuthedResponseDto> continuation) {
        C444571 c444571;
        if (continuation instanceof C444571) {
            c444571 = (C444571) continuation;
            int i = c444571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c444571.label = i - Integer.MIN_VALUE;
            } else {
                c444571 = new C444571(continuation);
            }
        }
        Object objCheckMigrationEligibilityAuthed = c444571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c444571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckMigrationEligibilityAuthed);
            Request<CheckMigrationEligibilityAuthedRequestDto> request = new Request<>(checkMigrationEligibilityAuthedRequestDto, null, 2, null);
            c444571.label = 1;
            objCheckMigrationEligibilityAuthed = CheckMigrationEligibilityAuthed(request, c444571);
            if (objCheckMigrationEligibilityAuthed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckMigrationEligibilityAuthed);
        }
        return ((Response) objCheckMigrationEligibilityAuthed).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CheckMigrationEligibilityAuthed(Request<CheckMigrationEligibilityAuthedRequestDto> request, Continuation<? super Response<CheckMigrationEligibilityAuthedResponseDto>> continuation) {
        C444582 c444582;
        if (continuation instanceof C444582) {
            c444582 = (C444582) continuation;
            int i = c444582.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c444582.label = i - Integer.MIN_VALUE;
            } else {
                c444582 = new C444582(continuation);
            }
        }
        Object objCheckMigrationEligibilityAuthed = c444582.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c444582.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckMigrationEligibilityAuthed);
            MigrationServiceRetrofit migrationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String partner = request.getData().getPartner();
            c444582.label = 1;
            objCheckMigrationEligibilityAuthed = migrationServiceRetrofit.CheckMigrationEligibilityAuthed(metadata, partner, c444582);
            if (objCheckMigrationEligibilityAuthed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckMigrationEligibilityAuthed);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCheckMigrationEligibilityAuthed);
    }
}
