package com.robinhood.android.options.comboorders.detail.components.actionrows;

import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ComboOrderDetailActionRowsViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsViewState;", "", "actionRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getActionRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailActionRowsViewState {
    public static final int $stable = 8;
    private final ImmutableList<ActionRow> actionRows;
    private final Context eventContext;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComboOrderDetailActionRowsViewState copy$default(ComboOrderDetailActionRowsViewState comboOrderDetailActionRowsViewState, ImmutableList immutableList, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = comboOrderDetailActionRowsViewState.actionRows;
        }
        if ((i & 2) != 0) {
            context = comboOrderDetailActionRowsViewState.eventContext;
        }
        return comboOrderDetailActionRowsViewState.copy(immutableList, context);
    }

    public final ImmutableList<ActionRow> component1() {
        return this.actionRows;
    }

    /* renamed from: component2, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    public final ComboOrderDetailActionRowsViewState copy(ImmutableList<ActionRow> actionRows, Context eventContext) {
        Intrinsics.checkNotNullParameter(actionRows, "actionRows");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        return new ComboOrderDetailActionRowsViewState(actionRows, eventContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailActionRowsViewState)) {
            return false;
        }
        ComboOrderDetailActionRowsViewState comboOrderDetailActionRowsViewState = (ComboOrderDetailActionRowsViewState) other;
        return Intrinsics.areEqual(this.actionRows, comboOrderDetailActionRowsViewState.actionRows) && Intrinsics.areEqual(this.eventContext, comboOrderDetailActionRowsViewState.eventContext);
    }

    public int hashCode() {
        return (this.actionRows.hashCode() * 31) + this.eventContext.hashCode();
    }

    public String toString() {
        return "ComboOrderDetailActionRowsViewState(actionRows=" + this.actionRows + ", eventContext=" + this.eventContext + ")";
    }

    public ComboOrderDetailActionRowsViewState(ImmutableList<ActionRow> actionRows, Context eventContext) {
        Intrinsics.checkNotNullParameter(actionRows, "actionRows");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        this.actionRows = actionRows;
        this.eventContext = eventContext;
    }

    public final ImmutableList<ActionRow> getActionRows() {
        return this.actionRows;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }
}
