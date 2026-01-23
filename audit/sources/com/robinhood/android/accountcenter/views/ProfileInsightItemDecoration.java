package com.robinhood.android.accountcenter.views;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileInsightItemDecoration.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0014J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileInsightItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediumSpacing", "", "sidePadding", "getLeftPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "getRightPadding", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ProfileInsightItemDecoration extends PaddingItemDecoration {
    public static final int $stable = PaddingItemDecoration.$stable;
    private final int mediumSpacing;
    private final int sidePadding;

    public ProfileInsightItemDecoration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mediumSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        this.sidePadding = context.getResources().getDimensionPixelSize(C8293R.dimen.insight_item_side_padding);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
    protected int getLeftPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (position == 0) {
            return this.mediumSpacing;
        }
        return 0;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
    protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (position == adapter.getSize() - 1) {
            return this.mediumSpacing;
        }
        return this.sidePadding;
    }
}
