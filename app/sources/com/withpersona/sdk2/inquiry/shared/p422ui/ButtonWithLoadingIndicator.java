package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiButtonWithLoadingIndicatorBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonWithLoadingIndicator.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "buttonStyleAttr", "<init>", "(Landroid/content/Context;I)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initiate", "()V", "Lcom/google/android/material/button/MaterialButton;", "addButton", "(Ljava/lang/Integer;)Lcom/google/android/material/button/MaterialButton;", "update", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "enabled", "setEnabled", "(Z)V", "isLoading", "setIsLoading", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2UiButtonWithLoadingIndicatorBinding;", "binding", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2UiButtonWithLoadingIndicatorBinding;", "Z", "button", "Lcom/google/android/material/button/MaterialButton;", "getButton", "()Lcom/google/android/material/button/MaterialButton;", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ButtonWithLoadingIndicator extends FrameLayout {
    private final Pi2UiButtonWithLoadingIndicatorBinding binding;
    private final MaterialButton button;
    private boolean isLoading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Pi2UiButtonWithLoadingIndicatorBinding pi2UiButtonWithLoadingIndicatorBindingInflate = Pi2UiButtonWithLoadingIndicatorBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(pi2UiButtonWithLoadingIndicatorBindingInflate, "inflate(...)");
        this.binding = pi2UiButtonWithLoadingIndicatorBindingInflate;
        this.button = addButton(Integer.valueOf(i));
        initiate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Pi2UiButtonWithLoadingIndicatorBinding pi2UiButtonWithLoadingIndicatorBindingInflate = Pi2UiButtonWithLoadingIndicatorBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(pi2UiButtonWithLoadingIndicatorBindingInflate, "inflate(...)");
        this.binding = pi2UiButtonWithLoadingIndicatorBindingInflate;
        this.button = addButton(0);
        initiate();
    }

    private final void initiate() {
        getProgressBar().setIndeterminateTintList(ColorStateList.valueOf(this.button.getCurrentTextColor()));
    }

    private final MaterialButton addButton(Integer buttonStyleAttr) {
        MaterialButton materialButton;
        if (buttonStyleAttr == null || buttonStyleAttr.intValue() == 0) {
            materialButton = new MaterialButton(getContext());
        } else {
            materialButton = new MaterialButton(getContext(), null, buttonStyleAttr.intValue());
        }
        addView(materialButton, 0);
        return materialButton;
    }

    public final MaterialButton getButton() {
        return this.button;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.binding.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        return progressBar;
    }

    public final CharSequence getText() {
        CharSequence text = this.button.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public final void setText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.button.setText(value);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        this.button.setOnClickListener(l);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.button.setEnabled(enabled);
        update();
    }

    public final void setIsLoading(boolean isLoading) {
        if (this.isLoading == isLoading) {
            return;
        }
        this.isLoading = isLoading;
        this.button.setActivated(isLoading);
        update();
    }

    private final void update() {
        if (this.isLoading) {
            this.button.setTextScaleX(0.0f);
            getProgressBar().setVisibility(0);
        } else {
            this.button.setTextScaleX(1.0f);
            getProgressBar().setVisibility(8);
        }
    }
}
