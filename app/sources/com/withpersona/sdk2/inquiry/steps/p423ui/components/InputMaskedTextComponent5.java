package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskTextWatcher;", "Landroid/text/TextWatcher;", "mask", "", "<init>", "(Ljava/lang/String;)V", "isRunning", "", "isDeleting", "beforeTextChanged", "", "charSequence", "", "start", "", "count", "after", "onTextChanged", "before", "afterTextChanged", "editable", "Landroid/text/Editable;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskTextWatcher, reason: use source file name */
/* loaded from: classes18.dex */
final class InputMaskedTextComponent5 implements TextWatcher {
    private boolean isDeleting;
    private boolean isRunning;
    private final String mask;

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public InputMaskedTextComponent5(String mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.mask = mask;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.isDeleting = count > after;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        if (this.isRunning || this.isDeleting) {
            return;
        }
        this.isRunning = true;
        InputMaskedTextComponent2.format(editable, this.mask);
        this.isRunning = false;
    }
}
