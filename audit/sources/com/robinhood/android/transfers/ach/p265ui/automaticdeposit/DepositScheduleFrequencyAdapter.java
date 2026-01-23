package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleViewState;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositScheduleFrequencyAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B*\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DepositScheduleFrequencyAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionRowView;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Row;", "onRowClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lkotlin/ParameterName;", "name", "frequency", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;", "setState", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DepositScheduleFrequencyAdapter extends GenericListAdapter<FrequencySelectionRowView, SetDepositScheduleViewState.Row> {
    public static final int $stable = 8;
    private final Function1<ApiDepositSchedule.Frequency, Unit> onRowClicked;
    private SetDepositScheduleViewState.Loaded state;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, SetDepositScheduleViewState.Row row) throws Resources.NotFoundException {
        onBindViewHolder2((GenericViewHolder<? extends FrequencySelectionRowView>) genericViewHolder, row);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DepositScheduleFrequencyAdapter(Function1<? super ApiDepositSchedule.Frequency, Unit> onRowClicked) {
        super(FrequencySelectionRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.DepositScheduleFrequencyAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositScheduleFrequencyAdapter._init_$lambda$0((SetDepositScheduleViewState.Row) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        this.onRowClicked = onRowClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(SetDepositScheduleViewState.Row byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getFrequency();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setState(SetDepositScheduleViewState.Loaded state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        if (getSize() == 0) {
            submitList(SetDepositScheduleViewState.Row.getEntries());
        } else {
            notifyDataSetChanged();
        }
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<? extends FrequencySelectionRowView> holder, final SetDepositScheduleViewState.Row item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        FrequencySelectionRowView frequencySelectionRowView = (FrequencySelectionRowView) holder.getView();
        CharSequence text = frequencySelectionRowView.getResources().getText(item.getTitle());
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        SetDepositScheduleViewState.Loaded loaded = this.state;
        SetDepositScheduleViewState.Loaded loaded2 = null;
        if (loaded == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            loaded = null;
        }
        StringResource depositScheduleDescription = loaded.getDepositScheduleDescription(item.getFrequency());
        Resources resources = frequencySelectionRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        frequencySelectionRowView.bind(text, depositScheduleDescription.getText(resources));
        SetDepositScheduleViewState.Loaded loaded3 = this.state;
        if (loaded3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
        } else {
            loaded2 = loaded3;
        }
        if (loaded2.getSelectedFrequencyRow() == item) {
            frequencySelectionRowView.setTrailingIconResource(C20690R.drawable.ic_rds_checkmark_24dp);
        } else {
            frequencySelectionRowView.setTrailingIconVisibility(4);
        }
        OnClickListeners.onClick(frequencySelectionRowView, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.DepositScheduleFrequencyAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositScheduleFrequencyAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(DepositScheduleFrequencyAdapter depositScheduleFrequencyAdapter, SetDepositScheduleViewState.Row row) {
        depositScheduleFrequencyAdapter.onRowClicked.invoke(row.getFrequency());
        return Unit.INSTANCE;
    }
}
