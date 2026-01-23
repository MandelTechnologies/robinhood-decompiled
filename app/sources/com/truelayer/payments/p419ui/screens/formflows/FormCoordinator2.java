package com.truelayer.payments.p419ui.screens.formflows;

import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FormCoordinator.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$4$1", m3645f = "FormCoordinator.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$4$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FormCoordinator2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoreError $it;
    final /* synthetic */ PaymentContext $paymentContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormCoordinator2(CoreError coreError, PaymentContext paymentContext, Continuation<? super FormCoordinator2> continuation) {
        super(2, continuation);
        this.$it = coreError;
        this.$paymentContext = paymentContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormCoordinator2(this.$it, this.$paymentContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormCoordinator2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, AnalyticsExtensions3.toAnalyticsError(this.$it, this.$paymentContext), 1, null));
        return Unit.INSTANCE;
    }
}
