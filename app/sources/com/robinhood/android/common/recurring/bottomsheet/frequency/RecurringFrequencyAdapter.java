package com.robinhood.android.common.recurring.bottomsheet.frequency;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsSelectionRowView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyAdapter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u001e\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsRadioButtonRowView;", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "onRowClicked", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;", "setState", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringFrequencyAdapter extends GenericListAdapter<RdsRadioButtonRowView, RecurringFrequencyBottomSheet.Row> {
    public static final int $stable = 8;
    private final Function1<RecurringFrequencyBottomSheet.Row, Unit> onRowClicked;
    private RecurringFrequencyViewState state;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, RecurringFrequencyBottomSheet.Row row) {
        onBindViewHolder2((GenericViewHolder<? extends RdsRadioButtonRowView>) genericViewHolder, row);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringFrequencyAdapter(Function1<? super RecurringFrequencyBottomSheet.Row, Unit> onRowClicked) {
        super(RdsRadioButtonRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyAdapter._init_$lambda$0((RecurringFrequencyBottomSheet.Row) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        this.onRowClicked = onRowClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(RecurringFrequencyBottomSheet.Row byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getFrequency();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setState(RecurringFrequencyViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        List<RecurringFrequencyBottomSheet.Row> rows = state.getRows();
        if (getSize() != rows.size()) {
            submitList(rows);
        } else {
            notifyDataSetChanged();
        }
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<? extends RdsRadioButtonRowView> holder, final RecurringFrequencyBottomSheet.Row item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) holder.getView();
        rdsRadioButtonRowView.setPrimaryText(rdsRadioButtonRowView.getResources().getText(item.getTitle()));
        Resources resources = rdsRadioButtonRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RecurringFrequencyViewState recurringFrequencyViewState = this.state;
        RecurringFrequencyViewState recurringFrequencyViewState2 = null;
        if (recurringFrequencyViewState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            recurringFrequencyViewState = null;
        }
        rdsRadioButtonRowView.setSecondaryText(item.getFormattedDescription(resources, recurringFrequencyViewState.getNextInvestmentDate()));
        RecurringFrequencyViewState recurringFrequencyViewState3 = this.state;
        if (recurringFrequencyViewState3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
        } else {
            recurringFrequencyViewState2 = recurringFrequencyViewState3;
        }
        rdsRadioButtonRowView.setChecked(recurringFrequencyViewState2.getSelectedRow() == item);
        rdsRadioButtonRowView.onCheckedChange(new Function2() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecurringFrequencyAdapter.onBindViewHolder$lambda$3$lambda$2(this.f$0, item, (RdsSelectionRowView) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3$lambda$2(RecurringFrequencyAdapter recurringFrequencyAdapter, RecurringFrequencyBottomSheet.Row row, RdsSelectionRowView rdsSelectionRowView, boolean z) {
        Intrinsics.checkNotNullParameter(rdsSelectionRowView, "<unused var>");
        if (z) {
            recurringFrequencyAdapter.onRowClicked.invoke(row);
        }
        return Unit.INSTANCE;
    }
}
