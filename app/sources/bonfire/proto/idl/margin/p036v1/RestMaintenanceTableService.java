package bonfire.proto.idl.margin.p036v1;

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

/* compiled from: RestMaintenanceTableService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/RestMaintenanceTableService;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableService;", "retrofit", "Lbonfire/proto/idl/margin/v1/MaintenanceTableServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/margin/v1/MaintenanceTableServiceRetrofit;)V", "GetMaintenanceTable", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "request", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableRequestDto;", "(Lbonfire/proto/idl/margin/v1/GetMaintenanceTableRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestMaintenanceTableService implements MaintenanceTableService {
    private final MaintenanceTableServiceRetrofit retrofit;

    /* compiled from: RestMaintenanceTableService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.margin.v1.RestMaintenanceTableService", m3645f = "RestMaintenanceTableService.kt", m3646l = {20}, m3647m = "GetMaintenanceTable")
    /* renamed from: bonfire.proto.idl.margin.v1.RestMaintenanceTableService$GetMaintenanceTable$1 */
    static final class C44221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44221(Continuation<? super C44221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMaintenanceTableService.this.GetMaintenanceTable((GetMaintenanceTableRequestDto) null, this);
        }
    }

    /* compiled from: RestMaintenanceTableService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.margin.v1.RestMaintenanceTableService", m3645f = "RestMaintenanceTableService.kt", m3646l = {26}, m3647m = "GetMaintenanceTable")
    /* renamed from: bonfire.proto.idl.margin.v1.RestMaintenanceTableService$GetMaintenanceTable$2 */
    static final class C44232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44232(Continuation<? super C44232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMaintenanceTableService.this.GetMaintenanceTable((Request<GetMaintenanceTableRequestDto>) null, this);
        }
    }

    public RestMaintenanceTableService(MaintenanceTableServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.margin.p036v1.MaintenanceTableService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMaintenanceTable(GetMaintenanceTableRequestDto getMaintenanceTableRequestDto, Continuation<? super GetMaintenanceTableResponseDto> continuation) {
        C44221 c44221;
        if (continuation instanceof C44221) {
            c44221 = (C44221) continuation;
            int i = c44221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44221.label = i - Integer.MIN_VALUE;
            } else {
                c44221 = new C44221(continuation);
            }
        }
        Object objGetMaintenanceTable = c44221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMaintenanceTable);
            Request<GetMaintenanceTableRequestDto> request = new Request<>(getMaintenanceTableRequestDto, null, 2, null);
            c44221.label = 1;
            objGetMaintenanceTable = GetMaintenanceTable(request, c44221);
            if (objGetMaintenanceTable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMaintenanceTable);
        }
        return ((Response) objGetMaintenanceTable).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMaintenanceTable(Request<GetMaintenanceTableRequestDto> request, Continuation<? super Response<GetMaintenanceTableResponseDto>> continuation) {
        C44232 c44232;
        if (continuation instanceof C44232) {
            c44232 = (C44232) continuation;
            int i = c44232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44232.label = i - Integer.MIN_VALUE;
            } else {
                c44232 = new C44232(continuation);
            }
        }
        C44232 c442322 = c44232;
        Object objGetMaintenanceTable = c442322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c442322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMaintenanceTable);
            MaintenanceTableServiceRetrofit maintenanceTableServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String sort_by = request.getData().getSort_by();
            String sort_direction = request.getData().getSort_direction();
            c442322.label = 1;
            objGetMaintenanceTable = maintenanceTableServiceRetrofit.GetMaintenanceTable(metadata, account_number, sort_by, sort_direction, c442322);
            if (objGetMaintenanceTable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMaintenanceTable);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMaintenanceTable);
    }
}
