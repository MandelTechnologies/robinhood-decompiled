package billy_mays.service.p023v1;

import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.TransferAccountTypeDto;
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

/* compiled from: RestBillyMaysService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lbilly_mays/service/v1/RestBillyMaysService;", "Lbilly_mays/service/v1/BillyMaysService;", "Lbilly_mays/service/v1/BillyMaysServiceRetrofit;", "retrofit", "<init>", "(Lbilly_mays/service/v1/BillyMaysServiceRetrofit;)V", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;", "request", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "GetGoldEarningsFeatures", "(Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbilly_mays/service/v1/BillyMaysServiceRetrofit;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBillyMaysService implements BillyMaysService {
    private final BillyMaysServiceRetrofit retrofit;

    /* compiled from: RestBillyMaysService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "billy_mays.service.v1.RestBillyMaysService", m3645f = "RestBillyMaysService.kt", m3646l = {36}, m3647m = "GetGoldEarningsFeatures")
    /* renamed from: billy_mays.service.v1.RestBillyMaysService$GetGoldEarningsFeatures$1 */
    static final class C35731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35731(Continuation<? super C35731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBillyMaysService.this.GetGoldEarningsFeatures((GetGoldEarningsFeaturesRequestDto) null, this);
        }
    }

    /* compiled from: RestBillyMaysService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "billy_mays.service.v1.RestBillyMaysService", m3645f = "RestBillyMaysService.kt", m3646l = {42}, m3647m = "GetGoldEarningsFeatures")
    /* renamed from: billy_mays.service.v1.RestBillyMaysService$GetGoldEarningsFeatures$2 */
    static final class C35742 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35742(Continuation<? super C35742> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBillyMaysService.this.GetGoldEarningsFeatures((Request<GetGoldEarningsFeaturesRequestDto>) null, this);
        }
    }

    public RestBillyMaysService(BillyMaysServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // billy_mays.service.p023v1.BillyMaysService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetGoldEarningsFeatures(GetGoldEarningsFeaturesRequestDto getGoldEarningsFeaturesRequestDto, Continuation<? super GetGoldEarningsFeaturesResponseDto> continuation) {
        C35731 c35731;
        if (continuation instanceof C35731) {
            c35731 = (C35731) continuation;
            int i = c35731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35731.label = i - Integer.MIN_VALUE;
            } else {
                c35731 = new C35731(continuation);
            }
        }
        Object objGetGoldEarningsFeatures = c35731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c35731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetGoldEarningsFeatures);
            Request<GetGoldEarningsFeaturesRequestDto> request = new Request<>(getGoldEarningsFeaturesRequestDto, null, 2, null);
            c35731.label = 1;
            objGetGoldEarningsFeatures = GetGoldEarningsFeatures(request, c35731);
            if (objGetGoldEarningsFeatures == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetGoldEarningsFeatures);
        }
        return ((Response) objGetGoldEarningsFeatures).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetGoldEarningsFeatures(Request<GetGoldEarningsFeaturesRequestDto> request, Continuation<? super Response<GetGoldEarningsFeaturesResponseDto>> continuation) {
        C35742 c35742;
        CreateTransferAccountDto sink;
        CreateTransferAccountDto sink2;
        CreateTransferAccountDto sink3;
        CreateTransferAccountDto source;
        CreateTransferAccountDto source2;
        CreateTransferAccountDto source3;
        if (continuation instanceof C35742) {
            c35742 = (C35742) continuation;
            int i = c35742.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35742.label = i - Integer.MIN_VALUE;
            } else {
                c35742 = new C35742(continuation);
            }
        }
        C35742 c357422 = c35742;
        Object objGetGoldEarningsFeatures = c357422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c357422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetGoldEarningsFeatures);
            BillyMaysServiceRetrofit billyMaysServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateTransferAccountDto source4 = request.getData().getSource();
            String access_token = null;
            String id = (Intrinsics.areEqual(source4 != null ? source4.getId() : null, "") || (source3 = request.getData().getSource()) == null) ? null : source3.getId();
            CreateTransferAccountDto source5 = request.getData().getSource();
            TransferAccountTypeDto type2 = source5 != null ? source5.getType() : null;
            TransferAccountTypeDto.Companion companion = TransferAccountTypeDto.INSTANCE;
            TransferAccountTypeDto type3 = (type2 == companion.getZeroValue() || (source2 = request.getData().getSource()) == null) ? null : source2.getType();
            CreateTransferAccountDto source6 = request.getData().getSource();
            String access_token2 = (Intrinsics.areEqual(source6 != null ? source6.getAccess_token() : null, "") || (source = request.getData().getSource()) == null) ? null : source.getAccess_token();
            CreateTransferAccountDto sink4 = request.getData().getSink();
            String id2 = (Intrinsics.areEqual(sink4 != null ? sink4.getId() : null, "") || (sink3 = request.getData().getSink()) == null) ? null : sink3.getId();
            CreateTransferAccountDto sink5 = request.getData().getSink();
            TransferAccountTypeDto type4 = ((sink5 != null ? sink5.getType() : null) == companion.getZeroValue() || (sink2 = request.getData().getSink()) == null) ? null : sink2.getType();
            CreateTransferAccountDto sink6 = request.getData().getSink();
            if (!Intrinsics.areEqual(sink6 != null ? sink6.getAccess_token() : null, "") && (sink = request.getData().getSink()) != null) {
                access_token = sink.getAccess_token();
            }
            c357422.label = 1;
            objGetGoldEarningsFeatures = billyMaysServiceRetrofit.GetGoldEarningsFeatures(metadata, id, type3, access_token2, id2, type4, access_token, c357422);
            if (objGetGoldEarningsFeatures == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetGoldEarningsFeatures);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetGoldEarningsFeatures);
    }
}
