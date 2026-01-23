package contracts.crypto.rewards.proto.p430v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: CryptoRewardsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¢\u0006\u0004\b\u0003\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "GetHomeRewardsButton", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "", "request", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "GetCryptoDetailRewardButton", "(Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "contracts.crypto.rewards.proto.v1.CryptoRewardsService")
/* loaded from: classes18.dex */
public interface CryptoRewardsService {

    /* compiled from: CryptoRewardsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "contracts.crypto.rewards.proto.v1.CryptoRewardsService$DefaultImpls", m3645f = "CryptoRewardsService.kt", m3646l = {35}, m3647m = "GetCryptoDetailRewardButton")
    /* renamed from: contracts.crypto.rewards.proto.v1.CryptoRewardsService$GetCryptoDetailRewardButton$1 */
    static final class C438741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C438741(Continuation<? super C438741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCryptoDetailRewardButton(null, null, this);
        }
    }

    /* compiled from: CryptoRewardsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "contracts.crypto.rewards.proto.v1.CryptoRewardsService$DefaultImpls", m3645f = "CryptoRewardsService.kt", m3646l = {25}, m3647m = "GetHomeRewardsButton")
    /* renamed from: contracts.crypto.rewards.proto.v1.CryptoRewardsService$GetHomeRewardsButton$1 */
    static final class C438751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C438751(Continuation<? super C438751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetHomeRewardsButton(null, null, this);
        }
    }

    Object GetCryptoDetailRewardButton(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation);

    Object GetHomeRewardsButton(Request<Unit> request, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation);

    Object GetHomeRewardsButton(Continuation<? super GetHomeRewardsButtonResponseDto> continuation);

    /* compiled from: CryptoRewardsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetHomeRewardsButton(CryptoRewardsService cryptoRewardsService, Request<Unit> request, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation) {
            C438751 c438751;
            if (continuation instanceof C438751) {
                c438751 = (C438751) continuation;
                int i = c438751.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c438751.label = i - Integer.MIN_VALUE;
                } else {
                    c438751 = new C438751(continuation);
                }
            }
            Object objGetHomeRewardsButton = c438751.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c438751.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetHomeRewardsButton);
                c438751.label = 1;
                objGetHomeRewardsButton = cryptoRewardsService.GetHomeRewardsButton(c438751);
                if (objGetHomeRewardsButton == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetHomeRewardsButton);
            }
            return new Response(objGetHomeRewardsButton, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCryptoDetailRewardButton(CryptoRewardsService cryptoRewardsService, Request<GetCryptoDetailRewardButtonRequestDto> request, Continuation<? super Response<GetCryptoDetailRewardButtonResponseDto>> continuation) {
            C438741 c438741;
            if (continuation instanceof C438741) {
                c438741 = (C438741) continuation;
                int i = c438741.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c438741.label = i - Integer.MIN_VALUE;
                } else {
                    c438741 = new C438741(continuation);
                }
            }
            Object objGetCryptoDetailRewardButton = c438741.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c438741.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCryptoDetailRewardButton);
                GetCryptoDetailRewardButtonRequestDto data = request.getData();
                c438741.label = 1;
                objGetCryptoDetailRewardButton = cryptoRewardsService.GetCryptoDetailRewardButton(data, c438741);
                if (objGetCryptoDetailRewardButton == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCryptoDetailRewardButton);
            }
            return new Response(objGetCryptoDetailRewardButton, null, 2, null);
        }
    }
}
