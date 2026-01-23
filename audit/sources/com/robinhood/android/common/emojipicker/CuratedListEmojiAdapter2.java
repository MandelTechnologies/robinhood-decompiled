package com.robinhood.android.common.emojipicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListEmojiAdapter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/EmojiItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "defaultTopSpacing", "", "getTopPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.emojipicker.EmojiItemDecoration, reason: use source file name */
/* loaded from: classes2.dex */
public final class CuratedListEmojiAdapter2 extends PaddingItemDecoration {
    public static final int $stable = PaddingItemDecoration.$stable;
    private final int defaultTopSpacing;

    public CuratedListEmojiAdapter2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultTopSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
    protected int getTopPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (adapter.getItemViewType(position) != 0) {
            return super.getTopPadding(adapter, position);
        }
        if (position == 0) {
            return 0;
        }
        return this.defaultTopSpacing;
    }
}
