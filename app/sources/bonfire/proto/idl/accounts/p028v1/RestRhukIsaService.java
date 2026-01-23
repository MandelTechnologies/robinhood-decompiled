package bonfire.proto.idl.accounts.p028v1;

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

/* compiled from: RestRhukIsaService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/RestRhukIsaService;", "Lbonfire/proto/idl/accounts/v1/RhukIsaService;", "Lbonfire/proto/idl/accounts/v1/RhukIsaServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/accounts/v1/RhukIsaServiceRetrofit;)V", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;", "request", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;", "GetIsaBonusPromotion", "(Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;", "IsUserEligibleForAccount", "(Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/RhukIsaServiceRetrofit;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestRhukIsaService implements RhukIsaService {
    private final RhukIsaServiceRetrofit retrofit;

    /* compiled from: RestRhukIsaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestRhukIsaService", m3645f = "RestRhukIsaService.kt", m3646l = {17}, m3647m = "GetIsaBonusPromotion")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestRhukIsaService$GetIsaBonusPromotion$1 */
    static final class C38211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38211(Continuation<? super C38211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRhukIsaService.this.GetIsaBonusPromotion((GetIsaBonusPromotionRequestDto) null, this);
        }
    }

    /* compiled from: RestRhukIsaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestRhukIsaService", m3645f = "RestRhukIsaService.kt", m3646l = {20}, m3647m = "GetIsaBonusPromotion")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestRhukIsaService$GetIsaBonusPromotion$2 */
    static final class C38222 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38222(Continuation<? super C38222> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRhukIsaService.this.GetIsaBonusPromotion((Request<GetIsaBonusPromotionRequestDto>) null, this);
        }
    }

    /* compiled from: RestRhukIsaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestRhukIsaService", m3645f = "RestRhukIsaService.kt", m3646l = {35}, m3647m = "IsUserEligibleForAccount")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestRhukIsaService$IsUserEligibleForAccount$1 */
    static final class C38231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38231(Continuation<? super C38231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRhukIsaService.this.IsUserEligibleForAccount((IsUserEligibleForAccountRequestDto) null, this);
        }
    }

    /* compiled from: RestRhukIsaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestRhukIsaService", m3645f = "RestRhukIsaService.kt", m3646l = {38}, m3647m = "IsUserEligibleForAccount")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestRhukIsaService$IsUserEligibleForAccount$2 */
    static final class C38242 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38242(Continuation<? super C38242> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRhukIsaService.this.IsUserEligibleForAccount((Request<IsUserEligibleForAccountRequestDto>) null, this);
        }
    }

    public RestRhukIsaService(RhukIsaServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.RhukIsaService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetIsaBonusPromotion(GetIsaBonusPromotionRequestDto getIsaBonusPromotionRequestDto, Continuation<? super GetIsaBonusPromotionResponseDto> continuation) {
        C38211 c38211;
        if (continuation instanceof C38211) {
            c38211 = (C38211) continuation;
            int i = c38211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38211.label = i - Integer.MIN_VALUE;
            } else {
                c38211 = new C38211(continuation);
            }
        }
        Object objGetIsaBonusPromotion = c38211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetIsaBonusPromotion);
            Request<GetIsaBonusPromotionRequestDto> request = new Request<>(getIsaBonusPromotionRequestDto, null, 2, null);
            c38211.label = 1;
            objGetIsaBonusPromotion = GetIsaBonusPromotion(request, c38211);
            if (objGetIsaBonusPromotion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetIsaBonusPromotion);
        }
        return ((Response) objGetIsaBonusPromotion).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetIsaBonusPromotion(Request<GetIsaBonusPromotionRequestDto> request, Continuation<? super Response<GetIsaBonusPromotionResponseDto>> continuation) {
        C38222 c38222;
        if (continuation instanceof C38222) {
            c38222 = (C38222) continuation;
            int i = c38222.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38222.label = i - Integer.MIN_VALUE;
            } else {
                c38222 = new C38222(continuation);
            }
        }
        Object objGetIsaBonusPromotion = c38222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetIsaBonusPromotion);
            RhukIsaServiceRetrofit rhukIsaServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c38222.label = 1;
            objGetIsaBonusPromotion = rhukIsaServiceRetrofit.GetIsaBonusPromotion(metadata, c38222);
            if (objGetIsaBonusPromotion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetIsaBonusPromotion);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetIsaBonusPromotion);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.RhukIsaService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IsUserEligibleForAccount(IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto, Continuation<? super IsUserEligibleForAccountResponseDto> continuation) {
        C38231 c38231;
        if (continuation instanceof C38231) {
            c38231 = (C38231) continuation;
            int i = c38231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38231.label = i - Integer.MIN_VALUE;
            } else {
                c38231 = new C38231(continuation);
            }
        }
        Object objIsUserEligibleForAccount = c38231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsUserEligibleForAccount);
            Request<IsUserEligibleForAccountRequestDto> request = new Request<>(isUserEligibleForAccountRequestDto, null, 2, null);
            c38231.label = 1;
            objIsUserEligibleForAccount = IsUserEligibleForAccount(request, c38231);
            if (objIsUserEligibleForAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsUserEligibleForAccount);
        }
        return ((Response) objIsUserEligibleForAccount).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IsUserEligibleForAccount(Request<IsUserEligibleForAccountRequestDto> request, Continuation<? super Response<IsUserEligibleForAccountResponseDto>> continuation) {
        C38242 c38242;
        if (continuation instanceof C38242) {
            c38242 = (C38242) continuation;
            int i = c38242.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38242.label = i - Integer.MIN_VALUE;
            } else {
                c38242 = new C38242(continuation);
            }
        }
        Object objIsUserEligibleForAccount = c38242.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38242.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsUserEligibleForAccount);
            RhukIsaServiceRetrofit rhukIsaServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            IsUserEligibleForAccountRequestDto data = request.getData();
            c38242.label = 1;
            objIsUserEligibleForAccount = rhukIsaServiceRetrofit.IsUserEligibleForAccount(metadata, data, c38242);
            if (objIsUserEligibleForAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsUserEligibleForAccount);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objIsUserEligibleForAccount);
    }
}
