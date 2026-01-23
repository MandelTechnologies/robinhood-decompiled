package com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear;

import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxYearViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState;", "", "title", "", "subtitle", "disclosureMarkdown", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "selectionRows", "", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$SelectionRow;", "selectionStyle", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "yearSelectedEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "continueAction", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$ContinueAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;Ljava/util/List;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$ContinueAction;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosureMarkdown", "()Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;", "getSelectionRows", "()Ljava/util/List;", "getSelectionStyle", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "getYearSelectedEvent", "()Lcom/robinhood/udf/UiEvent;", "getContinueAction", "()Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$ContinueAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", EquityOrderFormRowState2.SelectionRowTestTag, "ContinueAction", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TaxYearViewState {
    public static final int $stable = 8;
    private final ContinueAction continueAction;
    private final MarkdownWithTrailingAction<GenericAction> disclosureMarkdown;
    private final List<SelectionRow> selectionRows;
    private final IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle;
    private final String subtitle;
    private final String title;
    private final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> yearSelectedEvent;

    public static /* synthetic */ TaxYearViewState copy$default(TaxYearViewState taxYearViewState, String str, String str2, MarkdownWithTrailingAction markdownWithTrailingAction, List list, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, UiEvent uiEvent, ContinueAction continueAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxYearViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = taxYearViewState.subtitle;
        }
        if ((i & 4) != 0) {
            markdownWithTrailingAction = taxYearViewState.disclosureMarkdown;
        }
        if ((i & 8) != 0) {
            list = taxYearViewState.selectionRows;
        }
        if ((i & 16) != 0) {
            selectionStyle = taxYearViewState.selectionStyle;
        }
        if ((i & 32) != 0) {
            uiEvent = taxYearViewState.yearSelectedEvent;
        }
        if ((i & 64) != 0) {
            continueAction = taxYearViewState.continueAction;
        }
        UiEvent uiEvent2 = uiEvent;
        ContinueAction continueAction2 = continueAction;
        IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle2 = selectionStyle;
        MarkdownWithTrailingAction markdownWithTrailingAction2 = markdownWithTrailingAction;
        return taxYearViewState.copy(str, str2, markdownWithTrailingAction2, list, selectionStyle2, uiEvent2, continueAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final MarkdownWithTrailingAction<GenericAction> component3() {
        return this.disclosureMarkdown;
    }

    public final List<SelectionRow> component4() {
        return this.selectionRows;
    }

    /* renamed from: component5, reason: from getter */
    public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
        return this.selectionStyle;
    }

    public final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> component6() {
        return this.yearSelectedEvent;
    }

    /* renamed from: component7, reason: from getter */
    public final ContinueAction getContinueAction() {
        return this.continueAction;
    }

    public final TaxYearViewState copy(String title, String subtitle, MarkdownWithTrailingAction<? extends GenericAction> disclosureMarkdown, List<SelectionRow> selectionRows, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> yearSelectedEvent, ContinueAction continueAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(selectionRows, "selectionRows");
        Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
        return new TaxYearViewState(title, subtitle, disclosureMarkdown, selectionRows, selectionStyle, yearSelectedEvent, continueAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxYearViewState)) {
            return false;
        }
        TaxYearViewState taxYearViewState = (TaxYearViewState) other;
        return Intrinsics.areEqual(this.title, taxYearViewState.title) && Intrinsics.areEqual(this.subtitle, taxYearViewState.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, taxYearViewState.disclosureMarkdown) && Intrinsics.areEqual(this.selectionRows, taxYearViewState.selectionRows) && this.selectionStyle == taxYearViewState.selectionStyle && Intrinsics.areEqual(this.yearSelectedEvent, taxYearViewState.yearSelectedEvent) && Intrinsics.areEqual(this.continueAction, taxYearViewState.continueAction);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.disclosureMarkdown.hashCode()) * 31) + this.selectionRows.hashCode()) * 31) + this.selectionStyle.hashCode()) * 31;
        UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> uiEvent = this.yearSelectedEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        ContinueAction continueAction = this.continueAction;
        return iHashCode3 + (continueAction != null ? continueAction.hashCode() : 0);
    }

    public String toString() {
        return "TaxYearViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", selectionRows=" + this.selectionRows + ", selectionStyle=" + this.selectionStyle + ", yearSelectedEvent=" + this.yearSelectedEvent + ", continueAction=" + this.continueAction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxYearViewState(String title, String str, MarkdownWithTrailingAction<? extends GenericAction> disclosureMarkdown, List<SelectionRow> selectionRows, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> uiEvent, ContinueAction continueAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(selectionRows, "selectionRows");
        Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
        this.title = title;
        this.subtitle = str;
        this.disclosureMarkdown = disclosureMarkdown;
        this.selectionRows = selectionRows;
        this.selectionStyle = selectionStyle;
        this.yearSelectedEvent = uiEvent;
        this.continueAction = continueAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final MarkdownWithTrailingAction<GenericAction> getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final List<SelectionRow> getSelectionRows() {
        return this.selectionRows;
    }

    public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
        return this.selectionStyle;
    }

    public final UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> getYearSelectedEvent() {
        return this.yearSelectedEvent;
    }

    public final ContinueAction getContinueAction() {
        return this.continueAction;
    }

    /* compiled from: TaxYearViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$SelectionRow;", "", "taxYear", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "isChecked", "", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;Z)V", "getTaxYear", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectionRow {
        public static final int $stable = 8;
        private final boolean isChecked;
        private final ApiIraContributionQuestionnaire.TaxYearRow taxYear;

        public static /* synthetic */ SelectionRow copy$default(SelectionRow selectionRow, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                taxYearRow = selectionRow.taxYear;
            }
            if ((i & 2) != 0) {
                z = selectionRow.isChecked;
            }
            return selectionRow.copy(taxYearRow, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraContributionQuestionnaire.TaxYearRow getTaxYear() {
            return this.taxYear;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final SelectionRow copy(ApiIraContributionQuestionnaire.TaxYearRow taxYear, boolean isChecked) {
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            return new SelectionRow(taxYear, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionRow)) {
                return false;
            }
            SelectionRow selectionRow = (SelectionRow) other;
            return Intrinsics.areEqual(this.taxYear, selectionRow.taxYear) && this.isChecked == selectionRow.isChecked;
        }

        public int hashCode() {
            return (this.taxYear.hashCode() * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "SelectionRow(taxYear=" + this.taxYear + ", isChecked=" + this.isChecked + ")";
        }

        public SelectionRow(ApiIraContributionQuestionnaire.TaxYearRow taxYear, boolean z) {
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            this.taxYear = taxYear;
            this.isChecked = z;
        }

        public final ApiIraContributionQuestionnaire.TaxYearRow getTaxYear() {
            return this.taxYear;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }
    }

    /* compiled from: TaxYearViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$ContinueAction;", "", "taxYear", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;)V", "getTaxYear", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueAction {
        public static final int $stable = 8;
        private final ApiIraContributionQuestionnaire.TaxYearRow taxYear;

        public static /* synthetic */ ContinueAction copy$default(ContinueAction continueAction, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow, int i, Object obj) {
            if ((i & 1) != 0) {
                taxYearRow = continueAction.taxYear;
            }
            return continueAction.copy(taxYearRow);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraContributionQuestionnaire.TaxYearRow getTaxYear() {
            return this.taxYear;
        }

        public final ContinueAction copy(ApiIraContributionQuestionnaire.TaxYearRow taxYear) {
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            return new ContinueAction(taxYear);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContinueAction) && Intrinsics.areEqual(this.taxYear, ((ContinueAction) other).taxYear);
        }

        public int hashCode() {
            return this.taxYear.hashCode();
        }

        public String toString() {
            return "ContinueAction(taxYear=" + this.taxYear + ")";
        }

        public ContinueAction(ApiIraContributionQuestionnaire.TaxYearRow taxYear) {
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            this.taxYear = taxYear;
        }

        public final ApiIraContributionQuestionnaire.TaxYearRow getTaxYear() {
            return this.taxYear;
        }
    }
}
