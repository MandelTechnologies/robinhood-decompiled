package com.robinhood.prediction_markets.proto.p361v1.combo;

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

/* compiled from: RestComboService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/RestComboService;", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;", "retrofit", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceRetrofit;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceRetrofit;)V", "CreateComboRFQ", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RestComboService implements ComboService {
    private final ComboServiceRetrofit retrofit;

    /* compiled from: RestComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.RestComboService", m3645f = "RestComboService.kt", m3646l = {20}, m3647m = "CreateComboRFQ")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.RestComboService$CreateComboRFQ$1 */
    static final class C359731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359731(Continuation<? super C359731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestComboService.this.CreateComboRFQ((CreateComboRFQRequestDto) null, this);
        }
    }

    /* compiled from: RestComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.RestComboService", m3645f = "RestComboService.kt", m3646l = {26}, m3647m = "CreateComboRFQ")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.RestComboService$CreateComboRFQ$2 */
    static final class C359742 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359742(Continuation<? super C359742> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestComboService.this.CreateComboRFQ((Request<CreateComboRFQRequestDto>) null, this);
        }
    }

    /* compiled from: RestComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.RestComboService", m3645f = "RestComboService.kt", m3646l = {37}, m3647m = "GetComboProposals")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.RestComboService$GetComboProposals$1 */
    static final class C359751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359751(Continuation<? super C359751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestComboService.this.GetComboProposals((GetComboProposalsRequestDto) null, this);
        }
    }

    /* compiled from: RestComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.RestComboService", m3645f = "RestComboService.kt", m3646l = {44}, m3647m = "GetComboProposals")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.RestComboService$GetComboProposals$2 */
    static final class C359762 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359762(Continuation<? super C359762> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestComboService.this.GetComboProposals((Request<GetComboProposalsRequestDto>) null, this);
        }
    }

    public RestComboService(ComboServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateComboRFQ(CreateComboRFQRequestDto createComboRFQRequestDto, Continuation<? super CreateComboRFQResponseDto> continuation) {
        C359731 c359731;
        if (continuation instanceof C359731) {
            c359731 = (C359731) continuation;
            int i = c359731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359731.label = i - Integer.MIN_VALUE;
            } else {
                c359731 = new C359731(continuation);
            }
        }
        Object objCreateComboRFQ = c359731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateComboRFQ);
            Request<CreateComboRFQRequestDto> request = new Request<>(createComboRFQRequestDto, null, 2, null);
            c359731.label = 1;
            objCreateComboRFQ = CreateComboRFQ(request, c359731);
            if (objCreateComboRFQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateComboRFQ);
        }
        return ((Response) objCreateComboRFQ).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateComboRFQ(Request<CreateComboRFQRequestDto> request, Continuation<? super Response<CreateComboRFQResponseDto>> continuation) {
        C359742 c359742;
        if (continuation instanceof C359742) {
            c359742 = (C359742) continuation;
            int i = c359742.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359742.label = i - Integer.MIN_VALUE;
            } else {
                c359742 = new C359742(continuation);
            }
        }
        Object objCreateComboRFQ = c359742.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359742.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateComboRFQ);
            ComboServiceRetrofit comboServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateComboRFQRequestDto data = request.getData();
            c359742.label = 1;
            objCreateComboRFQ = comboServiceRetrofit.CreateComboRFQ(metadata, data, c359742);
            if (objCreateComboRFQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateComboRFQ);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateComboRFQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetComboProposals(GetComboProposalsRequestDto getComboProposalsRequestDto, Continuation<? super GetComboProposalsResponseDto> continuation) {
        C359751 c359751;
        if (continuation instanceof C359751) {
            c359751 = (C359751) continuation;
            int i = c359751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359751.label = i - Integer.MIN_VALUE;
            } else {
                c359751 = new C359751(continuation);
            }
        }
        Object objGetComboProposals = c359751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetComboProposals);
            Request<GetComboProposalsRequestDto> request = new Request<>(getComboProposalsRequestDto, null, 2, null);
            c359751.label = 1;
            objGetComboProposals = GetComboProposals(request, c359751);
            if (objGetComboProposals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetComboProposals);
        }
        return ((Response) objGetComboProposals).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetComboProposals(Request<GetComboProposalsRequestDto> request, Continuation<? super Response<GetComboProposalsResponseDto>> continuation) {
        C359762 c359762;
        if (continuation instanceof C359762) {
            c359762 = (C359762) continuation;
            int i = c359762.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359762.label = i - Integer.MIN_VALUE;
            } else {
                c359762 = new C359762(continuation);
            }
        }
        Object objGetComboProposals = c359762.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359762.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetComboProposals);
            ComboServiceRetrofit comboServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rfq_id = !Intrinsics.areEqual(request.getData().getRfq_id(), "") ? request.getData().getRfq_id() : null;
            c359762.label = 1;
            objGetComboProposals = comboServiceRetrofit.GetComboProposals(metadata, rfq_id, c359762);
            if (objGetComboProposals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetComboProposals);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetComboProposals);
    }
}
