package com.robinhood.android.transfers.ach.p265ui;

import android.view.View;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.transfers.ach.C30082R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositToolBarExtension.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"setRecurringDepositToolBar", "", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.RecurringDepositToolBarExtensionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositToolBarExtension {
    public static final void setRecurringDepositToolBar(RhToolbar rhToolbar) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        rhToolbar.setTitle(C30082R.string.recurring_deposit_transfer_title);
        View viewAddCustomView$default = RhToolbar.addCustomView$default(rhToolbar, C30082R.layout.include_transfer_toolbar_centered_title, true, 0, 4, null);
        Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewAddCustomView$default).setText(rhToolbar.getTitle());
    }
}
