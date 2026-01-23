package com.robinhood.android.acatsin.util;

import android.view.View;
import android.widget.TextView;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhToolbars.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"setCenteredTitle", "", "Lcom/robinhood/android/common/ui/view/RhToolbar;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "title", "", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.RhToolbarsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class RhToolbars {
    public static final void setCenteredTitle(RhToolbar rhToolbar, int i) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        CharSequence text = rhToolbar.getResources().getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        setCenteredTitle(rhToolbar, text);
    }

    public static final void setCenteredTitle(RhToolbar rhToolbar, CharSequence title) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = (TextView) rhToolbar.getToolbar().findViewById(C7686R.id.steps_label_txt);
        if (textView == null) {
            View viewAddCustomView$default = RhToolbar.addCustomView$default(rhToolbar, C7686R.layout.include_toolbar_steps_label, true, 0, 4, null);
            Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) viewAddCustomView$default;
        }
        textView.setText(title);
    }
}
