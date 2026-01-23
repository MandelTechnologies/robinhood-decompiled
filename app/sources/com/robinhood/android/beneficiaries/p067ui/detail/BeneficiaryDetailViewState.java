package com.robinhood.android.beneficiaries.p067ui.detail;

import com.robinhood.android.beneficiaries.models.api.SduiResponse;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;", "", "beneficiaryDetail", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail;", "isDeleteBeneficiaryLoading", "", "showRemoveAllAlertDialog", "showRemoveConfirmationDialog", "isContingentBeneficiaryExperiment", "<init>", "(Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail;ZZZZ)V", "getBeneficiaryDetail", "()Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail;", "()Z", "getShowRemoveAllAlertDialog", "getShowRemoveConfirmationDialog", "isLoading", "sduiResponse", "Lcom/robinhood/android/beneficiaries/models/api/SduiResponse;", "getSduiResponse", "()Lcom/robinhood/android/beneficiaries/models/api/SduiResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryDetailViewState {
    public static final int $stable = 8;
    private final BeneficiaryDetail beneficiaryDetail;
    private final boolean isContingentBeneficiaryExperiment;
    private final boolean isDeleteBeneficiaryLoading;
    private final boolean isLoading;
    private final SduiResponse sduiResponse;
    private final boolean showRemoveAllAlertDialog;
    private final boolean showRemoveConfirmationDialog;

    public BeneficiaryDetailViewState() {
        this(null, false, false, false, false, 31, null);
    }

    public static /* synthetic */ BeneficiaryDetailViewState copy$default(BeneficiaryDetailViewState beneficiaryDetailViewState, BeneficiaryDetail beneficiaryDetail, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryDetail = beneficiaryDetailViewState.beneficiaryDetail;
        }
        if ((i & 2) != 0) {
            z = beneficiaryDetailViewState.isDeleteBeneficiaryLoading;
        }
        if ((i & 4) != 0) {
            z2 = beneficiaryDetailViewState.showRemoveAllAlertDialog;
        }
        if ((i & 8) != 0) {
            z3 = beneficiaryDetailViewState.showRemoveConfirmationDialog;
        }
        if ((i & 16) != 0) {
            z4 = beneficiaryDetailViewState.isContingentBeneficiaryExperiment;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return beneficiaryDetailViewState.copy(beneficiaryDetail, z, z6, z3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryDetail getBeneficiaryDetail() {
        return this.beneficiaryDetail;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeleteBeneficiaryLoading() {
        return this.isDeleteBeneficiaryLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowRemoveAllAlertDialog() {
        return this.showRemoveAllAlertDialog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowRemoveConfirmationDialog() {
        return this.showRemoveConfirmationDialog;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }

    public final BeneficiaryDetailViewState copy(BeneficiaryDetail beneficiaryDetail, boolean isDeleteBeneficiaryLoading, boolean showRemoveAllAlertDialog, boolean showRemoveConfirmationDialog, boolean isContingentBeneficiaryExperiment) {
        return new BeneficiaryDetailViewState(beneficiaryDetail, isDeleteBeneficiaryLoading, showRemoveAllAlertDialog, showRemoveConfirmationDialog, isContingentBeneficiaryExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryDetailViewState)) {
            return false;
        }
        BeneficiaryDetailViewState beneficiaryDetailViewState = (BeneficiaryDetailViewState) other;
        return Intrinsics.areEqual(this.beneficiaryDetail, beneficiaryDetailViewState.beneficiaryDetail) && this.isDeleteBeneficiaryLoading == beneficiaryDetailViewState.isDeleteBeneficiaryLoading && this.showRemoveAllAlertDialog == beneficiaryDetailViewState.showRemoveAllAlertDialog && this.showRemoveConfirmationDialog == beneficiaryDetailViewState.showRemoveConfirmationDialog && this.isContingentBeneficiaryExperiment == beneficiaryDetailViewState.isContingentBeneficiaryExperiment;
    }

    public int hashCode() {
        BeneficiaryDetail beneficiaryDetail = this.beneficiaryDetail;
        return ((((((((beneficiaryDetail == null ? 0 : beneficiaryDetail.hashCode()) * 31) + Boolean.hashCode(this.isDeleteBeneficiaryLoading)) * 31) + Boolean.hashCode(this.showRemoveAllAlertDialog)) * 31) + Boolean.hashCode(this.showRemoveConfirmationDialog)) * 31) + Boolean.hashCode(this.isContingentBeneficiaryExperiment);
    }

    public String toString() {
        return "BeneficiaryDetailViewState(beneficiaryDetail=" + this.beneficiaryDetail + ", isDeleteBeneficiaryLoading=" + this.isDeleteBeneficiaryLoading + ", showRemoveAllAlertDialog=" + this.showRemoveAllAlertDialog + ", showRemoveConfirmationDialog=" + this.showRemoveConfirmationDialog + ", isContingentBeneficiaryExperiment=" + this.isContingentBeneficiaryExperiment + ")";
    }

    public BeneficiaryDetailViewState(BeneficiaryDetail beneficiaryDetail, boolean z, boolean z2, boolean z3, boolean z4) {
        BeneficiaryDetail.ViewModel viewModel;
        List<UIComponent<GenericAction>> components;
        this.beneficiaryDetail = beneficiaryDetail;
        this.isDeleteBeneficiaryLoading = z;
        this.showRemoveAllAlertDialog = z2;
        this.showRemoveConfirmationDialog = z3;
        this.isContingentBeneficiaryExperiment = z4;
        this.isLoading = beneficiaryDetail == null || z;
        this.sduiResponse = (beneficiaryDetail == null || (viewModel = beneficiaryDetail.getViewModel()) == null || (components = viewModel.getComponents()) == null) ? null : new SduiResponse(components);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryDetailViewState(com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L15
            r5 = r0
        L15:
            r7 = r7 & 16
            if (r7 == 0) goto L20
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L26
        L20:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L26:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailViewState.<init>(com.robinhood.android.beneficiaries.models.db.BeneficiaryDetail, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BeneficiaryDetail getBeneficiaryDetail() {
        return this.beneficiaryDetail;
    }

    public final boolean isDeleteBeneficiaryLoading() {
        return this.isDeleteBeneficiaryLoading;
    }

    public final boolean getShowRemoveAllAlertDialog() {
        return this.showRemoveAllAlertDialog;
    }

    public final boolean getShowRemoveConfirmationDialog() {
        return this.showRemoveConfirmationDialog;
    }

    public final boolean isContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final SduiResponse getSduiResponse() {
        return this.sduiResponse;
    }
}
