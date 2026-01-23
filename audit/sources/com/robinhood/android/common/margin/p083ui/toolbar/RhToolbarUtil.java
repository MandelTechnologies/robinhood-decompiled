package com.robinhood.android.common.margin.p083ui.toolbar;

import android.view.View;
import android.widget.TextView;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhToolbarUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"setCenteredTitle", "", "Lcom/robinhood/android/common/ui/view/RhToolbar;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "title", "", "feature-lib-margin_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.toolbar.RhToolbarUtilKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhToolbarUtil {
    public static final void setCenteredTitle(RhToolbar rhToolbar, int i) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        String string2 = ViewsKt.getString(rhToolbar, i);
        View viewAddCustomView$default = RhToolbar.addCustomView$default(rhToolbar, C11223R.layout.include_margin_upgrade_toolbar_title, true, 0, 4, null);
        Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewAddCustomView$default).setText(string2);
    }

    public static final void setCenteredTitle(RhToolbar rhToolbar, String title) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        View viewAddCustomView$default = RhToolbar.addCustomView$default(rhToolbar, C11223R.layout.include_margin_upgrade_toolbar_title, true, 0, 4, null);
        Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewAddCustomView$default).setText(title);
    }
}
