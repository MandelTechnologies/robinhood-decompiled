package com.withpersona.sdk2.inquiry.shared;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SnackBarState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"renderErrorSnackbarIfNeeded", "", "snackbarContainer", "Landroid/view/View;", "error", "", "onDismissed", "Lkotlin/Function0;", "anchorView", "maxLines", "", "duration", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.shared.SnackBarStateKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SnackBarState {
    public static /* synthetic */ void renderErrorSnackbarIfNeeded$default(View view, String str, Function0 function0, View view2, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            view2 = null;
        }
        View view3 = view2;
        if ((i3 & 16) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        renderErrorSnackbarIfNeeded(view, str, function0, view3, i4, i2);
    }

    public static final void renderErrorSnackbarIfNeeded(View snackbarContainer, String str, final Function0<Unit> onDismissed, View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(snackbarContainer, "snackbarContainer");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        if (str == null) {
            return;
        }
        Snackbar snackbarMake = Snackbar.make(snackbarContainer, str, i2);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        snackbarMake.setTextMaxLines(i);
        if (view != null) {
            snackbarMake.setAnchorView(view);
        }
        snackbarMake.addCallback(new Snackbar.Callback() { // from class: com.withpersona.sdk2.inquiry.shared.SnackBarStateKt.renderErrorSnackbarIfNeeded.2
            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(Snackbar transientBottomBar, int event) {
                onDismissed.invoke();
            }
        }).show();
    }
}
