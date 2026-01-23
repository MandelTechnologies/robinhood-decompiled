package com.robinhood.microgram.pasteboard;

import com.robinhood.microgram.pasteboard.MicrogramPasteboardManager_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramPasteboardManager_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/microgram/pasteboard/MicrogramPasteboardManager_Adapter$Endpoint_setText$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.pasteboard.MicrogramPasteboardManager_Adapter$Endpoint_setText$call$1", m3645f = "MicrogramPasteboardManager_Adapter.kt", m3646l = {78}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.pasteboard.MicrogramPasteboardManager_Adapter$Endpoint_setText$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramPasteboardManager_Adapter5 extends ContinuationImpl7 implements Function2<MicrogramPasteboardManager_Adapter.Endpoint_setText.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MicrogramPasteboardManager_Adapter.Endpoint_setText this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramPasteboardManager_Adapter5(MicrogramPasteboardManager_Adapter.Endpoint_setText endpoint_setText, Continuation<? super MicrogramPasteboardManager_Adapter5> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_setText;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MicrogramPasteboardManager_Adapter5 microgramPasteboardManager_Adapter5 = new MicrogramPasteboardManager_Adapter5(this.this$0, continuation);
        microgramPasteboardManager_Adapter5.L$0 = obj;
        return microgramPasteboardManager_Adapter5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MicrogramPasteboardManager_Adapter.Endpoint_setText.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((MicrogramPasteboardManager_Adapter5) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramPasteboardManager_Adapter.Endpoint_setText.Arguments arguments = (MicrogramPasteboardManager_Adapter.Endpoint_setText.Arguments) this.L$0;
            PasteboardManager pasteboardManager = this.this$0.service;
            String value = arguments.getValue();
            this.label = 1;
            if (pasteboardManager.setText(value, this) == coroutine_suspended) {
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
