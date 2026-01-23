package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsTextButtonRowView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsTextButtonRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "buttonText", "getButtonText", "setButtonText", "textContainer", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "button", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "setEnabled", "", "enabled", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsTextButtonRowView extends RdsRippleContainerView {
    private final RdsTextButton button;
    private final RdsRowTextContainerView textContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTextButtonRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_row_text_button, this);
        findViewById(C13997R.id.text_button).setClickable(false);
        View viewFindViewById = findViewById(C13997R.id.text_button_text_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textContainer = (RdsRowTextContainerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.text_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.button = (RdsTextButton) viewFindViewById2;
        int[] RdsTextButtonRowView = C13997R.styleable.RdsTextButtonRowView;
        Intrinsics.checkNotNullExpressionValue(RdsTextButtonRowView, "RdsTextButtonRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsTextButtonRowView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsTextButtonRowView_primaryText));
        setButtonText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsTextButtonRowView_buttonText));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextButtonRowView_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.textContainer.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textContainer.setPrimaryText(charSequence);
    }

    public final CharSequence getButtonText() {
        return this.button.getText();
    }

    public final void setButtonText(CharSequence charSequence) {
        this.button.setText(charSequence);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.button.setEnabled(enabled);
        this.textContainer.isEnabled();
        setClickable(enabled);
    }
}
