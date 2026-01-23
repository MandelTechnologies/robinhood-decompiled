package com.robinhood.android.beneficiaries.p067ui.individualflow.relationship;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRelationshipViewModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryCreateRelationshipViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'Bk\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u001e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\bHÆ\u0003Jm\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R'\u0010\u0007\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState;", "", "rows", "", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel$RelationshipRow;", "isLoading", "", "success", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Pair;", "", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "error", "", "validationError", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getSuccess", "()Lcom/robinhood/udf/UiEvent;", "getError", "getValidationError", "rowStates", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState$RowState;", "getRowStates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "RowState", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateRelationshipViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;
    private final List<ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow> rows;
    private final UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> success;
    private final UiEvent<GenericAlertContent<GenericAction>> validationError;

    public BeneficiaryCreateRelationshipViewState() {
        this(null, false, null, null, null, 31, null);
    }

    private final List<ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow> component1() {
        return this.rows;
    }

    public static /* synthetic */ BeneficiaryCreateRelationshipViewState copy$default(BeneficiaryCreateRelationshipViewState beneficiaryCreateRelationshipViewState, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = beneficiaryCreateRelationshipViewState.rows;
        }
        if ((i & 2) != 0) {
            z = beneficiaryCreateRelationshipViewState.isLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = beneficiaryCreateRelationshipViewState.success;
        }
        if ((i & 8) != 0) {
            uiEvent2 = beneficiaryCreateRelationshipViewState.error;
        }
        if ((i & 16) != 0) {
            uiEvent3 = beneficiaryCreateRelationshipViewState.validationError;
        }
        UiEvent uiEvent4 = uiEvent3;
        UiEvent uiEvent5 = uiEvent;
        return beneficiaryCreateRelationshipViewState.copy(list, z, uiEvent5, uiEvent2, uiEvent4);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> component3() {
        return this.success;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final UiEvent<GenericAlertContent<GenericAction>> component5() {
        return this.validationError;
    }

    public final BeneficiaryCreateRelationshipViewState copy(List<ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow> rows, boolean isLoading, UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> success, UiEvent<Throwable> error, UiEvent<GenericAlertContent<GenericAction>> validationError) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new BeneficiaryCreateRelationshipViewState(rows, isLoading, success, error, validationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateRelationshipViewState)) {
            return false;
        }
        BeneficiaryCreateRelationshipViewState beneficiaryCreateRelationshipViewState = (BeneficiaryCreateRelationshipViewState) other;
        return Intrinsics.areEqual(this.rows, beneficiaryCreateRelationshipViewState.rows) && this.isLoading == beneficiaryCreateRelationshipViewState.isLoading && Intrinsics.areEqual(this.success, beneficiaryCreateRelationshipViewState.success) && Intrinsics.areEqual(this.error, beneficiaryCreateRelationshipViewState.error) && Intrinsics.areEqual(this.validationError, beneficiaryCreateRelationshipViewState.validationError);
    }

    public int hashCode() {
        int iHashCode = ((this.rows.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> uiEvent = this.success;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<GenericAlertContent<GenericAction>> uiEvent3 = this.validationError;
        return iHashCode3 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateRelationshipViewState(rows=" + this.rows + ", isLoading=" + this.isLoading + ", success=" + this.success + ", error=" + this.error + ", validationError=" + this.validationError + ")";
    }

    public BeneficiaryCreateRelationshipViewState(List<ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow> rows, boolean z, UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<GenericAlertContent<GenericAction>> uiEvent3) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.isLoading = z;
        this.success = uiEvent;
        this.error = uiEvent2;
        this.validationError = uiEvent3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryCreateRelationshipViewState(java.util.List r2, boolean r3, com.robinhood.udf.UiEvent r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto Ld
            r3 = 0
        Ld:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L13
            r4 = r0
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            r5 = r0
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateRelationshipViewState.<init>(java.util.List, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> getSuccess() {
        return this.success;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final UiEvent<GenericAlertContent<GenericAction>> getValidationError() {
        return this.validationError;
    }

    public final List<RowState> getRowStates() {
        List<ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow> list = this.rows;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RowState((ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow) it.next(), !this.isLoading));
        }
        return arrayList;
    }

    /* compiled from: BeneficiaryCreateRelationshipViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState$RowState;", "", "row", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel$RelationshipRow;", "isRowEnabled", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel$RelationshipRow;Z)V", "getRow", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel$RelationshipRow;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowState {
        public static final int $stable = 8;
        private final boolean isRowEnabled;
        private final ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow row;

        public static /* synthetic */ RowState copy$default(RowState rowState, ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow relationshipRow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                relationshipRow = rowState.row;
            }
            if ((i & 2) != 0) {
                z = rowState.isRowEnabled;
            }
            return rowState.copy(relationshipRow, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow getRow() {
            return this.row;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRowEnabled() {
            return this.isRowEnabled;
        }

        public final RowState copy(ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow row, boolean isRowEnabled) {
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

        public RowState(ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow row, boolean z) {
            Intrinsics.checkNotNullParameter(row, "row");
            this.row = row;
            this.isRowEnabled = z;
        }

        public final ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow getRow() {
            return this.row;
        }

        public final boolean isRowEnabled() {
            return this.isRowEnabled;
        }
    }
}
