package com.robinhood.utils.compose.keyboard;

import androidx.compose.p011ui.platform.PlatformTextInputInterceptor;
import androidx.compose.p011ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p011ui.platform.PlatformTextInputSession;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: DisableKeyboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.keyboard.DisableKeyboardKt$DisableSoftKeyboard$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DisableKeyboard2 implements PlatformTextInputInterceptor {
    final /* synthetic */ boolean $disable;

    DisableKeyboard2(boolean z) {
        this.$disable = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r7.startInputMethod(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (kotlinx.coroutines.DelayKt.awaitCancellation(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.platform.PlatformTextInputInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object interceptStartInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSession platformTextInputSession, Continuation<?> continuation) {
        DisableKeyboard3 disableKeyboard3;
        if (continuation instanceof DisableKeyboard3) {
            disableKeyboard3 = (DisableKeyboard3) continuation;
            int i = disableKeyboard3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                disableKeyboard3.label = i - Integer.MIN_VALUE;
            } else {
                disableKeyboard3 = new DisableKeyboard3(this, continuation);
            }
        }
        Object obj = disableKeyboard3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = disableKeyboard3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$disable) {
                disableKeyboard3.label = 1;
            } else {
                disableKeyboard3.label = 2;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            throw new ExceptionsH();
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        throw new ExceptionsH();
    }
}
