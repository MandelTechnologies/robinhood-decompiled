package com.truelayer.payments.p419ui.components.inputs;

import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.p419ui.TrueLayerUI;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextInputWithImage.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TanImage$2$1", m3645f = "TextInputWithImage.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TextInputWithImageKt$TanImage$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    TextInputWithImageKt$TanImage$2$1(Continuation<? super TextInputWithImageKt$TanImage$2$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextInputWithImageKt$TanImage$2$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextInputWithImageKt$TanImage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Failed to load Base64 image", null, null, null, null, 61, null));
        return Unit.INSTANCE;
    }
}
