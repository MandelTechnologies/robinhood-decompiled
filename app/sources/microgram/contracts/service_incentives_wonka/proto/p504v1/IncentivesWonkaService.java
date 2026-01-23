package microgram.contracts.service_incentives_wonka.proto.p504v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: IncentivesWonkaService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;", "request", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedResponseDto;", "PromotionUnlocked", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferResponseDto;", "ContinueTransfer", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowResponseDto;", "ExitTransferFlow", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_incentives_wonka.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService")
/* loaded from: classes14.dex */
public interface IncentivesWonkaService {

    /* compiled from: IncentivesWonkaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$DefaultImpls", m3645f = "IncentivesWonkaService.kt", m3646l = {34}, m3647m = "ContinueTransfer")
    /* renamed from: microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$ContinueTransfer$1 */
    static final class C467661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C467661(Continuation<? super C467661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ContinueTransfer(null, null, this);
        }
    }

    /* compiled from: IncentivesWonkaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$DefaultImpls", m3645f = "IncentivesWonkaService.kt", m3646l = {44}, m3647m = "ExitTransferFlow")
    /* renamed from: microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$ExitTransferFlow$1 */
    static final class C467671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C467671(Continuation<? super C467671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ExitTransferFlow(null, null, this);
        }
    }

    /* compiled from: IncentivesWonkaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$DefaultImpls", m3645f = "IncentivesWonkaService.kt", m3646l = {24}, m3647m = "PromotionUnlocked")
    /* renamed from: microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService$PromotionUnlocked$1 */
    static final class C467681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C467681(Continuation<? super C467681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.PromotionUnlocked(null, null, this);
        }
    }

    Object ContinueTransfer(ContinueTransferRequestDto continueTransferRequestDto, Continuation<? super ContinueTransferResponseDto> continuation);

    Object ExitTransferFlow(ExitTransferFlowRequestDto exitTransferFlowRequestDto, Continuation<? super ExitTransferFlowResponseDto> continuation);

    Object PromotionUnlocked(PromotionUnlockedRequestDto promotionUnlockedRequestDto, Continuation<? super PromotionUnlockedResponseDto> continuation);

    /* compiled from: IncentivesWonkaService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object PromotionUnlocked(IncentivesWonkaService incentivesWonkaService, Request<PromotionUnlockedRequestDto> request, Continuation<? super Response<PromotionUnlockedResponseDto>> continuation) {
            C467681 c467681;
            if (continuation instanceof C467681) {
                c467681 = (C467681) continuation;
                int i = c467681.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c467681.label = i - Integer.MIN_VALUE;
                } else {
                    c467681 = new C467681(continuation);
                }
            }
            Object objPromotionUnlocked = c467681.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c467681.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPromotionUnlocked);
                PromotionUnlockedRequestDto data = request.getData();
                c467681.label = 1;
                objPromotionUnlocked = incentivesWonkaService.PromotionUnlocked(data, c467681);
                if (objPromotionUnlocked == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPromotionUnlocked);
            }
            return new Response(objPromotionUnlocked, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ContinueTransfer(IncentivesWonkaService incentivesWonkaService, Request<ContinueTransferRequestDto> request, Continuation<? super Response<ContinueTransferResponseDto>> continuation) {
            C467661 c467661;
            if (continuation instanceof C467661) {
                c467661 = (C467661) continuation;
                int i = c467661.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c467661.label = i - Integer.MIN_VALUE;
                } else {
                    c467661 = new C467661(continuation);
                }
            }
            Object objContinueTransfer = c467661.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c467661.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objContinueTransfer);
                ContinueTransferRequestDto data = request.getData();
                c467661.label = 1;
                objContinueTransfer = incentivesWonkaService.ContinueTransfer(data, c467661);
                if (objContinueTransfer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objContinueTransfer);
            }
            return new Response(objContinueTransfer, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ExitTransferFlow(IncentivesWonkaService incentivesWonkaService, Request<ExitTransferFlowRequestDto> request, Continuation<? super Response<ExitTransferFlowResponseDto>> continuation) {
            C467671 c467671;
            if (continuation instanceof C467671) {
                c467671 = (C467671) continuation;
                int i = c467671.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c467671.label = i - Integer.MIN_VALUE;
                } else {
                    c467671 = new C467671(continuation);
                }
            }
            Object objExitTransferFlow = c467671.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c467671.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExitTransferFlow);
                ExitTransferFlowRequestDto data = request.getData();
                c467671.label = 1;
                objExitTransferFlow = incentivesWonkaService.ExitTransferFlow(data, c467671);
                if (objExitTransferFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExitTransferFlow);
            }
            return new Response(objExitTransferFlow, null, 2, null);
        }
    }
}
