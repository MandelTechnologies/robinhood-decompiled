package com.robinhood.android.designsystem.textinput;

import android.content.res.Resources;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsTextInputViewOutlineProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsTextInputViewOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsTextInputViewOutlineProvider extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(C13997R.dimen.text_input_shadow_inset);
        outline.setRoundRect(dimensionPixelOffset, view.getResources().getDimensionPixelOffset(C13997R.dimen.text_input_shadow_inset_top), view.getWidth() - dimensionPixelOffset, view.getHeight() - dimensionPixelOffset, view.getResources().getDimensionPixelOffset(C13997R.dimen.text_input_corner_radius));
    }
}
