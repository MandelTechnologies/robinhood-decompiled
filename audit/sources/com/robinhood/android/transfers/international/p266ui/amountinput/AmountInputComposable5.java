package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputComposable4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AmountInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1$2", m3645f = "AmountInputComposable.kt", m3646l = {376}, m3647m = "emit")
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1$2$emit$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AmountInputComposable5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AmountInputComposable4.C303392<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmountInputComposable5(AmountInputComposable4.C303392<? super T> c303392, Continuation<? super AmountInputComposable5> continuation) {
        super(continuation);
        this.this$0 = c303392;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (Continuation<? super Unit>) this);
    }
}
