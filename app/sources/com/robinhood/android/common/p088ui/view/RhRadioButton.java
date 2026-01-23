package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.FixedAppCompatRadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhRadioButton.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhRadioButton;", "Landroidx/appcompat/widget/FixedAppCompatRadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCheckedChangedListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnCheckedChangeListener", "", "listener", "setCheckedProgrammatically", "checked", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhRadioButton extends FixedAppCompatRadioButton {
    public static final int $stable = 8;
    private CompoundButton.OnCheckedChangeListener onCheckedChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.robinhood.android.common.ui.view.RhRadioButton.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = RhRadioButton.this.onCheckedChangedListener;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.onCheckedChangedListener = listener;
    }

    public final void setCheckedProgrammatically(boolean checked) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangedListener;
        this.onCheckedChangedListener = null;
        setChecked(checked);
        this.onCheckedChangedListener = onCheckedChangeListener;
    }
}
