package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewRdsRadioButton.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioButton;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsSelectionControl;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageRes", "", "getImageRes", "()I", "accessibilityOptions", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "getAccessibilityOptions", "()Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "", "getAccessibilityClassName", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class NewRdsRadioButton extends RdsSelectionControl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRdsRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.RdsSelectionControl
    protected int getImageRes() {
        return C13997R.drawable.radio_button;
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView
    protected AbstractCheckableView.AccessibilityOptions getAccessibilityOptions() {
        return new AbstractCheckableView.AccessibilityOptions(ViewsKt.getString(this, C13997R.string.selected), ViewsKt.getString(this, C13997R.string.unselected));
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView, android.widget.Checkable
    public void toggle() {
        if (getIsChecked()) {
            return;
        }
        super.toggle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = RadioButton.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
