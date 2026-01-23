package com.robinhood.android.crypto.gifting.details.p092ui;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailsItemListDecorator.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/ui/DetailsItemListDecorator;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getBottomPadding", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DetailsItemListDecorator extends PaddingItemDecoration {
    public static final int $stable = 8;
    private final Resources resources;

    public DetailsItemListDecorator(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
    protected int getBottomPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (position == 0) {
            return this.resources.getDimensionPixelSize(C13997R.dimen.rds_spacing_xlarge);
        }
        return position == adapter.getSize() + (-1) ? this.resources.getDimensionPixelSize(C13997R.dimen.rds_spacing_xxlarge) : super.getBottomPadding(adapter, position);
    }
}
