package microgram.p507ui.contracts;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.p507ui.contracts.AppRouterExampleService_Adapter;

/* compiled from: AppRouterExampleService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.ui.contracts.AppRouterExampleService_Adapter$Endpoint_launchAlert$call$1", m3645f = "AppRouterExampleService_Adapter.kt", m3646l = {81}, m3647m = "invokeSuspend")
/* renamed from: microgram.ui.contracts.AppRouterExampleService_Adapter$Endpoint_launchAlert$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class AppRouterExampleService_Adapter2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppRouterExampleService_Adapter.Endpoint_launchAlert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppRouterExampleService_Adapter2(AppRouterExampleService_Adapter.Endpoint_launchAlert endpoint_launchAlert, Continuation<? super AppRouterExampleService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_launchAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppRouterExampleService_Adapter2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((AppRouterExampleService_Adapter2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RouterService routerService = this.this$0.service;
            this.label = 1;
            if (routerService.launchAlert(this) == coroutine_suspended) {
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
