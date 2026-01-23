package com.robinhood.android.common.views;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyRowViewHolder.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Lcom/robinhood/android/common/views/OptionStrategyRowView;", "<init>", "(Lcom/robinhood/android/common/views/OptionStrategyRowView;)V", "getRowView", "()Lcom/robinhood/android/common/views/OptionStrategyRowView;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionStrategyRowViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private final OptionStrategyRowView rowView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyRowViewHolder(OptionStrategyRowView rowView) {
        super(rowView);
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        this.rowView = rowView;
    }

    public final OptionStrategyRowView getRowView() {
        return this.rowView;
    }
}
