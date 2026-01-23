package com.robinhood.android.designsystem.textinput;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsGenericTextInput.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H&R\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsGenericTextInput;", "Lcom/google/android/material/textfield/TextInputEditText;", "Lcom/robinhood/android/designsystem/textinput/ValidatingTextInput;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "typedText", "", "getTypedText", "()Ljava/lang/String;", "setTypedText", "(Ljava/lang/String;)V", "isInputMasked", "", "()Z", "setInputMasked", "(Z)V", "useCustomNumpad", "getUseCustomNumpad", "setUseCustomNumpad", "onEnterOrDonePressed", "Lio/reactivex/Observable;", "Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "setTemplate", "", "templateString", "placeholderString", "focusChanges", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class RdsGenericTextInput extends TextInputEditText implements ValidatingTextInput {
    public abstract Observable<Boolean> focusChanges();

    public abstract String getTypedText();

    public abstract boolean getUseCustomNumpad();

    public abstract boolean isInputMasked();

    public abstract Observable<TextViewEditorActionEvent> onEnterOrDonePressed();

    public abstract void setInputMasked(boolean z);

    public abstract void setTemplate(String templateString, String placeholderString);

    public abstract void setTypedText(String str);

    public abstract void setUseCustomNumpad(boolean z);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsGenericTextInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
