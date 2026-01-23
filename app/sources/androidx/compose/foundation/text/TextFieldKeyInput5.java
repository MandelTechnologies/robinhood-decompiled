package androidx.compose.foundation.text;

import androidx.compose.p011ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1$1, reason: use source file name */
/* loaded from: classes4.dex */
/* synthetic */ class TextFieldKeyInput5 extends FunctionReferenceImpl implements Function1<KeyEvent, Boolean> {
    TextFieldKeyInput5(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m5428invokeZmokQxo(keyEvent.getNativeKeyEvent());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m5428invokeZmokQxo(android.view.KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m5426processZmokQxo(keyEvent));
    }
}
