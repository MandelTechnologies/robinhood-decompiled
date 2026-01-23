package microgram.contracts.gold_live_event.proto.p490v1;

import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
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

/* compiled from: EventHostService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventHostService;", "", "Lmicrogram/contracts/gold_live_event/proto/v1/DismissRequestDto;", "request", "Lmicrogram/contracts/gold_live_event/proto/v1/DismissResponseDto;", BentoAlertSheet6.button2Title, "(Lmicrogram/contracts/gold_live_event/proto/v1/DismissRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentResponseDto;", "ReloadExperiment", "(Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.gold_live_event.proto.v1.EventHostService")
/* loaded from: classes14.dex */
public interface EventHostService {

    /* compiled from: EventHostService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.gold_live_event.proto.v1.EventHostService$DefaultImpls", m3645f = "EventHostService.kt", m3646l = {21}, m3647m = BentoAlertSheet6.button2Title)
    /* renamed from: microgram.contracts.gold_live_event.proto.v1.EventHostService$Dismiss$1 */
    static final class C465651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C465651(Continuation<? super C465651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.Dismiss(null, null, this);
        }
    }

    /* compiled from: EventHostService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.gold_live_event.proto.v1.EventHostService$DefaultImpls", m3645f = "EventHostService.kt", m3646l = {31}, m3647m = "ReloadExperiment")
    /* renamed from: microgram.contracts.gold_live_event.proto.v1.EventHostService$ReloadExperiment$1 */
    static final class C465661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C465661(Continuation<? super C465661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ReloadExperiment(null, null, this);
        }
    }

    Object Dismiss(DismissRequestDto dismissRequestDto, Continuation<? super DismissResponseDto> continuation);

    Object ReloadExperiment(ReloadExperimentRequestDto reloadExperimentRequestDto, Continuation<? super ReloadExperimentResponseDto> continuation);

    /* compiled from: EventHostService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object Dismiss(EventHostService eventHostService, Request<DismissRequestDto> request, Continuation<? super Response<DismissResponseDto>> continuation) {
            C465651 c465651;
            if (continuation instanceof C465651) {
                c465651 = (C465651) continuation;
                int i = c465651.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c465651.label = i - Integer.MIN_VALUE;
                } else {
                    c465651 = new C465651(continuation);
                }
            }
            Object objDismiss = c465651.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c465651.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDismiss);
                DismissRequestDto data = request.getData();
                c465651.label = 1;
                objDismiss = eventHostService.Dismiss(data, c465651);
                if (objDismiss == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDismiss);
            }
            return new Response(objDismiss, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ReloadExperiment(EventHostService eventHostService, Request<ReloadExperimentRequestDto> request, Continuation<? super Response<ReloadExperimentResponseDto>> continuation) {
            C465661 c465661;
            if (continuation instanceof C465661) {
                c465661 = (C465661) continuation;
                int i = c465661.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c465661.label = i - Integer.MIN_VALUE;
                } else {
                    c465661 = new C465661(continuation);
                }
            }
            Object objReloadExperiment = c465661.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c465661.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objReloadExperiment);
                ReloadExperimentRequestDto data = request.getData();
                c465661.label = 1;
                objReloadExperiment = eventHostService.ReloadExperiment(data, c465661);
                if (objReloadExperiment == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReloadExperiment);
            }
            return new Response(objReloadExperiment, null, 2, null);
        }
    }
}
