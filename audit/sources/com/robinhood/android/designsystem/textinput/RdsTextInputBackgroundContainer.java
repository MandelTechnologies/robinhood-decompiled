package com.robinhood.android.designsystem.textinput;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsTextInputBackgroundContainer.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsTextInputBackgroundContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "isError", "isError$lib_design_system_externalDebug", "()Z", "setError$lib_design_system_externalDebug", "(Z)V", "onCreateDrawableState", "", "extraSpace", "", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsTextInputBackgroundContainer extends LinearLayout {
    private static final int[] STATE_ERROR = {C13997R.attr.state_error};
    private boolean isError;

    public /* synthetic */ RdsTextInputBackgroundContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTextInputBackgroundContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOutlineProvider(new RdsTextInputViewOutlineProvider());
    }

    /* renamed from: isError$lib_design_system_externalDebug, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public final void setError$lib_design_system_externalDebug(boolean z) {
        this.isError = z;
        refreshDrawableState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (this.isError) {
            int[] iArrMergeDrawableStates = View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), STATE_ERROR);
            Intrinsics.checkNotNull(iArrMergeDrawableStates);
            return iArrMergeDrawableStates;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace);
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }
}
