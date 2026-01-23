package com.robinhood.android.common.views;

import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.portfolio.position.DisplayPositionListItem;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionListItemViewHolder.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/views/PositionListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Lcom/robinhood/android/common/views/PositionListItemView;", "<init>", "(Lcom/robinhood/android/common/views/PositionListItemView;)V", "getRowView", "()Lcom/robinhood/android/common/views/PositionListItemView;", "setRowView", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PositionListItemViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private PositionListItemView rowView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionListItemViewHolder(PositionListItemView rowView) {
        super(rowView);
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        this.rowView = rowView;
    }

    public final PositionListItemView getRowView() {
        return this.rowView;
    }

    public final void setRowView(PositionListItemView positionListItemView) {
        Intrinsics.checkNotNullParameter(positionListItemView, "<set-?>");
        this.rowView = positionListItemView;
    }

    public final PositionInstrumentType getInstrumentType() {
        PositionsV2.PositionListItemV2 position;
        DisplayPositionListItem positionItem$feature_lib_instrument_row_externalDebug = this.rowView.getPositionItem$feature_lib_instrument_row_externalDebug();
        if (positionItem$feature_lib_instrument_row_externalDebug == null || (position = positionItem$feature_lib_instrument_row_externalDebug.getPosition()) == null) {
            return null;
        }
        return position.getInstrumentType();
    }
}
