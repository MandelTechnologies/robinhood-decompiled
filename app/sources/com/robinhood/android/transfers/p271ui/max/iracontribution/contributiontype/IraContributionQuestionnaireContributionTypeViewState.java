package com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype;

import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: IraContributionQuestionnaireContributionTypeViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J%\u0010\u001b\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bHÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\t\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R-\u0010\u0007\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;", "", "rows", "", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeRow;", "isLoading", "", "success", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "error", "", "<init>", "(Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getSuccess", "()Lcom/robinhood/udf/UiEvent;", "getError", "rowStates", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState$RowState;", "getRowStates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "RowState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IraContributionQuestionnaireContributionTypeViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;
    private final List<ApiIraContributionQuestionnaire.ContributionTypeRow> rows;
    private final UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> success;

    /* compiled from: IraContributionQuestionnaireContributionTypeViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IraContributionType.values().length];
            try {
                iArr[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IraContributionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IraContributionQuestionnaireContributionTypeViewState() {
        this(null, false, null, null, 15, null);
    }

    private final List<ApiIraContributionQuestionnaire.ContributionTypeRow> component1() {
        return this.rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IraContributionQuestionnaireContributionTypeViewState copy$default(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iraContributionQuestionnaireContributionTypeViewState.rows;
        }
        if ((i & 2) != 0) {
            z = iraContributionQuestionnaireContributionTypeViewState.isLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = iraContributionQuestionnaireContributionTypeViewState.success;
        }
        if ((i & 8) != 0) {
            uiEvent2 = iraContributionQuestionnaireContributionTypeViewState.error;
        }
        return iraContributionQuestionnaireContributionTypeViewState.copy(list, z, uiEvent, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> component3() {
        return this.success;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final IraContributionQuestionnaireContributionTypeViewState copy(List<ApiIraContributionQuestionnaire.ContributionTypeRow> rows, boolean isLoading, UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> success, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new IraContributionQuestionnaireContributionTypeViewState(rows, isLoading, success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IraContributionQuestionnaireContributionTypeViewState)) {
            return false;
        }
        IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState = (IraContributionQuestionnaireContributionTypeViewState) other;
        return Intrinsics.areEqual(this.rows, iraContributionQuestionnaireContributionTypeViewState.rows) && this.isLoading == iraContributionQuestionnaireContributionTypeViewState.isLoading && Intrinsics.areEqual(this.success, iraContributionQuestionnaireContributionTypeViewState.success) && Intrinsics.areEqual(this.error, iraContributionQuestionnaireContributionTypeViewState.error);
    }

    public int hashCode() {
        int iHashCode = ((this.rows.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> uiEvent = this.success;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "IraContributionQuestionnaireContributionTypeViewState(rows=" + this.rows + ", isLoading=" + this.isLoading + ", success=" + this.success + ", error=" + this.error + ")";
    }

    public IraContributionQuestionnaireContributionTypeViewState(List<ApiIraContributionQuestionnaire.ContributionTypeRow> rows, boolean z, UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> uiEvent, UiEvent<Throwable> uiEvent2) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.isLoading = z;
        this.success = uiEvent;
        this.error = uiEvent2;
    }

    public /* synthetic */ IraContributionQuestionnaireContributionTypeViewState(List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> getSuccess() {
        return this.success;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final List<RowState> getRowStates() {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.rows), new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(IraContributionQuestionnaireContributionTypeViewState._get_rowStates_$lambda$0((ApiIraContributionQuestionnaire.ContributionTypeRow) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireContributionTypeViewState._get_rowStates_$lambda$1(this.f$0, (ApiIraContributionQuestionnaire.ContributionTypeRow) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_rowStates_$lambda$0(ApiIraContributionQuestionnaire.ContributionTypeRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        int i = WhenMappings.$EnumSwitchMapping$0[row.getContribution_type().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowState _get_rowStates_$lambda$1(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, ApiIraContributionQuestionnaire.ContributionTypeRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new RowState(it, !iraContributionQuestionnaireContributionTypeViewState.isLoading);
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState$RowState;", "", "row", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeRow;", "isRowEnabled", "", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeRow;Z)V", "getRow", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeRow;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowState {
        public static final int $stable = 8;
        private final boolean isRowEnabled;
        private final ApiIraContributionQuestionnaire.ContributionTypeRow row;

        public static /* synthetic */ RowState copy$default(RowState rowState, ApiIraContributionQuestionnaire.ContributionTypeRow contributionTypeRow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                contributionTypeRow = rowState.row;
            }
            if ((i & 2) != 0) {
                z = rowState.isRowEnabled;
            }
            return rowState.copy(contributionTypeRow, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraContributionQuestionnaire.ContributionTypeRow getRow() {
            return this.row;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRowEnabled() {
            return this.isRowEnabled;
        }

        public final RowState copy(ApiIraContributionQuestionnaire.ContributionTypeRow row, boolean isRowEnabled) {
            Intrinsics.checkNotNullParameter(row, "row");
            return new RowState(row, isRowEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowState)) {
                return false;
            }
            RowState rowState = (RowState) other;
            return Intrinsics.areEqual(this.row, rowState.row) && this.isRowEnabled == rowState.isRowEnabled;
        }

        public int hashCode() {
            return (this.row.hashCode() * 31) + Boolean.hashCode(this.isRowEnabled);
        }

        public String toString() {
            return "RowState(row=" + this.row + ", isRowEnabled=" + this.isRowEnabled + ")";
        }

        public RowState(ApiIraContributionQuestionnaire.ContributionTypeRow row, boolean z) {
            Intrinsics.checkNotNullParameter(row, "row");
            this.row = row;
            this.isRowEnabled = z;
        }

        public final ApiIraContributionQuestionnaire.ContributionTypeRow getRow() {
            return this.row;
        }

        public final boolean isRowEnabled() {
            return this.isRowEnabled;
        }
    }
}
