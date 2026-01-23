package com.robinhood.utils.compose.keyboard;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DisableKeyboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.keyboard.DisableKeyboardKt$DisableSoftKeyboard$1$1", m3645f = "DisableKeyboard.kt", m3646l = {26, 30}, m3647m = "interceptStartInputMethod")
/* renamed from: com.robinhood.utils.compose.keyboard.DisableKeyboardKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DisableKeyboard3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DisableKeyboard2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisableKeyboard3(DisableKeyboard2 disableKeyboard2, Continuation<? super DisableKeyboard3> continuation) {
        super(continuation);
        this.this$0 = disableKeyboard2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.interceptStartInputMethod(null, null, this);
    }
}
