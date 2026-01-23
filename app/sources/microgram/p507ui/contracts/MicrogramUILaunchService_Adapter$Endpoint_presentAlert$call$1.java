package microgram.p507ui.contracts;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.p507ui.contracts.MicrogramUILaunchService_Adapter;

/* compiled from: MicrogramUILaunchService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/ui/contracts/MicrogramUILaunchService_Adapter$Endpoint_presentAlert$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.ui.contracts.MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1", m3645f = "MicrogramUILaunchService_Adapter.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* loaded from: classes14.dex */
final class MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1 extends ContinuationImpl7 implements Function2<MicrogramUILaunchService_Adapter.Endpoint_presentAlert.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MicrogramUILaunchService_Adapter.Endpoint_presentAlert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1(MicrogramUILaunchService_Adapter.Endpoint_presentAlert endpoint_presentAlert, Continuation<? super MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_presentAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1 microgramUILaunchService_Adapter$Endpoint_presentAlert$call$1 = new MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1(this.this$0, continuation);
        microgramUILaunchService_Adapter$Endpoint_presentAlert$call$1.L$0 = obj;
        return microgramUILaunchService_Adapter$Endpoint_presentAlert$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MicrogramUILaunchService_Adapter.Endpoint_presentAlert.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((MicrogramUILaunchService_Adapter$Endpoint_presentAlert$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramUILaunchService_Adapter.Endpoint_presentAlert.Arguments arguments = (MicrogramUILaunchService_Adapter.Endpoint_presentAlert.Arguments) this.L$0;
            MicrogramUILaunchService microgramUILaunchService = this.this$0.service;
            String routerIdentifier = arguments.getRouterIdentifier();
            String encodedAlertContent = arguments.getEncodedAlertContent();
            this.label = 1;
            if (microgramUILaunchService.presentAlert(routerIdentifier, encodedAlertContent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
