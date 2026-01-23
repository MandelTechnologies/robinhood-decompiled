package com.robinhood.android.recurring.hub.p225ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.recurring.hub.C26221R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentsStatsView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/ui/RecurringInvestmentsStatsView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/recurring/hub/ui/UiInvestmentSchedules;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "totalInvestedRow", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getTotalInvestedRow", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "totalInvestedRow$delegate", "Lkotlin/properties/ReadOnlyProperty;", "nextInvestmentDateRow", "getNextInvestmentDateRow", "nextInvestmentDateRow$delegate", "activeRow", "getActiveRow", "activeRow$delegate", "pausedRow", "getPausedRow", "pausedRow$delegate", "bind", "", "state", "Companion", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecurringInvestmentsStatsView extends LinearLayout implements Bindable<UiInvestmentSchedules> {

    /* renamed from: activeRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 activeRow;

    /* renamed from: nextInvestmentDateRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 nextInvestmentDateRow;

    /* renamed from: pausedRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 pausedRow;

    /* renamed from: totalInvestedRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalInvestedRow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsStatsView.class, "totalInvestedRow", "getTotalInvestedRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsStatsView.class, "nextInvestmentDateRow", "getNextInvestmentDateRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsStatsView.class, "activeRow", "getActiveRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsStatsView.class, "pausedRow", "getPausedRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentsStatsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.totalInvestedRow = BindViewDelegate2.bindView$default(this, C26221R.id.total_invested_row, null, 2, null);
        this.nextInvestmentDateRow = BindViewDelegate2.bindView$default(this, C26221R.id.next_investment_date_row, null, 2, null);
        this.activeRow = BindViewDelegate2.bindView$default(this, C26221R.id.active_row, null, 2, null);
        this.pausedRow = BindViewDelegate2.bindView$default(this, C26221R.id.paused_row, null, 2, null);
        setOrientation(1);
        ViewGroups.inflate(this, C26221R.layout.merge_recurring_investments_stats, true);
    }

    private final RdsDataRowView getTotalInvestedRow() {
        return (RdsDataRowView) this.totalInvestedRow.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getNextInvestmentDateRow() {
        return (RdsDataRowView) this.nextInvestmentDateRow.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getActiveRow() {
        return (RdsDataRowView) this.activeRow.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getPausedRow() {
        return (RdsDataRowView) this.pausedRow.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiInvestmentSchedules state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getTotalInvestedRow().setValueText(state.getTotalInvested());
        RdsDataRowView nextInvestmentDateRow = getNextInvestmentDateRow();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        nextInvestmentDateRow.setValueText(state.nextInvestmentDateFormatted(resources));
        getActiveRow().setValueText(Formats.getIntegerFormat().format(Integer.valueOf(state.getTotalActive())));
        getPausedRow().setValueText(Formats.getIntegerFormat().format(Integer.valueOf(state.getTotalPaused())));
    }

    /* compiled from: RecurringInvestmentsStatsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/ui/RecurringInvestmentsStatsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/recurring/hub/ui/RecurringInvestmentsStatsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RecurringInvestmentsStatsView> {
        private final /* synthetic */ Inflater<RecurringInvestmentsStatsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RecurringInvestmentsStatsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RecurringInvestmentsStatsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C26221R.layout.include_recurring_investments_stats);
        }
    }
}
