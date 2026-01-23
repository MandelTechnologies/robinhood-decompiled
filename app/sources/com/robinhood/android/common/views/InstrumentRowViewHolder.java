package com.robinhood.android.common.views;

import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRowViewHolder.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Lcom/robinhood/android/common/views/InstrumentRowView;", "<init>", "(Lcom/robinhood/android/common/views/InstrumentRowView;)V", "getRowView", "()Lcom/robinhood/android/common/views/InstrumentRowView;", "setRowView", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "hasPositionIncludingPending", "", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentRowViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private InstrumentRowView rowView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentRowViewHolder(InstrumentRowView rowView) {
        super(rowView);
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        this.rowView = rowView;
    }

    public final InstrumentRowView getRowView() {
        return this.rowView;
    }

    public final void setRowView(InstrumentRowView instrumentRowView) {
        Intrinsics.checkNotNullParameter(instrumentRowView, "<set-?>");
        this.rowView = instrumentRowView;
    }

    public final UUID getInstrumentId() {
        return this.rowView.getInstrumentId();
    }

    public final String getAccountNumber() {
        return this.rowView.getAccountNumber();
    }

    public final boolean hasPositionIncludingPending() {
        return this.rowView.getHasPositionIncludingPending();
    }
}
