package com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear;

import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.TaxYearViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxYearDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearDataState;", "", "viewModel", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;", "selectionStyle", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "selectedYear", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "yearSelectedEvent", "Lcom/robinhood/udf/UiEvent;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;Lcom/robinhood/udf/UiEvent;)V", "getViewModel", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;", "getSelectionStyle", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "getSelectedYear", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "getYearSelectedEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TaxYearDataState {
    private final ApiIraContributionQuestionnaire.TaxYearRow selectedYear;
    private final IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle;
    private final ApiIraContributionQuestionnaire.TaxYearViewModel viewModel;
    private final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> yearSelectedEvent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<TaxYearDataState, TaxYearViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.TaxYearDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final TaxYearViewState reduce(TaxYearDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            String title = dataState.getViewModel().getTitle();
            String subtitle = dataState.getViewModel().getSubtitle();
            MarkdownWithTrailingAction<GenericAction> disclosure_markdown = dataState.getViewModel().getDisclosure_markdown();
            List<ApiIraContributionQuestionnaire.TaxYearRow> rows = dataState.getViewModel().getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            for (ApiIraContributionQuestionnaire.TaxYearRow taxYearRow : rows) {
                arrayList.add(new TaxYearViewState.SelectionRow(taxYearRow, Intrinsics.areEqual(taxYearRow, dataState.getSelectedYear())));
            }
            return new TaxYearViewState(title, subtitle, disclosure_markdown, arrayList, dataState.getSelectionStyle(), dataState.getYearSelectedEvent(), dataState.getSelectionStyle() == IraContributionQuestionnaireLaunchMode.SelectionStyle.RADIO_BUTTON ? new TaxYearViewState.ContinueAction(dataState.getSelectedYear()) : null);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxYearDataState copy$default(TaxYearDataState taxYearDataState, ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            taxYearViewModel = taxYearDataState.viewModel;
        }
        if ((i & 2) != 0) {
            selectionStyle = taxYearDataState.selectionStyle;
        }
        if ((i & 4) != 0) {
            taxYearRow = taxYearDataState.selectedYear;
        }
        if ((i & 8) != 0) {
            uiEvent = taxYearDataState.yearSelectedEvent;
        }
        return taxYearDataState.copy(taxYearViewModel, selectionStyle, taxYearRow, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiIraContributionQuestionnaire.TaxYearViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
        return this.selectionStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiIraContributionQuestionnaire.TaxYearRow getSelectedYear() {
        return this.selectedYear;
    }

    public final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> component4() {
        return this.yearSelectedEvent;
    }

    public final TaxYearDataState copy(ApiIraContributionQuestionnaire.TaxYearViewModel viewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, ApiIraContributionQuestionnaire.TaxYearRow selectedYear, UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> yearSelectedEvent) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
        Intrinsics.checkNotNullParameter(selectedYear, "selectedYear");
        return new TaxYearDataState(viewModel, selectionStyle, selectedYear, yearSelectedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxYearDataState)) {
            return false;
        }
        TaxYearDataState taxYearDataState = (TaxYearDataState) other;
        return Intrinsics.areEqual(this.viewModel, taxYearDataState.viewModel) && this.selectionStyle == taxYearDataState.selectionStyle && Intrinsics.areEqual(this.selectedYear, taxYearDataState.selectedYear) && Intrinsics.areEqual(this.yearSelectedEvent, taxYearDataState.yearSelectedEvent);
    }

    public int hashCode() {
        int iHashCode = ((((this.viewModel.hashCode() * 31) + this.selectionStyle.hashCode()) * 31) + this.selectedYear.hashCode()) * 31;
        UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> uiEvent = this.yearSelectedEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "TaxYearDataState(viewModel=" + this.viewModel + ", selectionStyle=" + this.selectionStyle + ", selectedYear=" + this.selectedYear + ", yearSelectedEvent=" + this.yearSelectedEvent + ")";
    }

    public TaxYearDataState(ApiIraContributionQuestionnaire.TaxYearViewModel viewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, ApiIraContributionQuestionnaire.TaxYearRow selectedYear, UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> uiEvent) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
        Intrinsics.checkNotNullParameter(selectedYear, "selectedYear");
        this.viewModel = viewModel;
        this.selectionStyle = selectionStyle;
        this.selectedYear = selectedYear;
        this.yearSelectedEvent = uiEvent;
    }

    public /* synthetic */ TaxYearDataState(ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(taxYearViewModel, selectionStyle, taxYearRow, (i & 8) != 0 ? null : uiEvent);
    }

    public final ApiIraContributionQuestionnaire.TaxYearViewModel getViewModel() {
        return this.viewModel;
    }

    public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
        return this.selectionStyle;
    }

    public final ApiIraContributionQuestionnaire.TaxYearRow getSelectedYear() {
        return this.selectedYear;
    }

    public final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> getYearSelectedEvent() {
        return this.yearSelectedEvent;
    }

    /* compiled from: TaxYearDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearDataState$Companion;", "", "<init>", "()V", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearDataState;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateProvider<TaxYearDataState, TaxYearViewState> getStateProvider() {
            return TaxYearDataState.StateProvider;
        }
    }
}
