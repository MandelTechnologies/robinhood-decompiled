package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditIraDistributionTaxWithholdingViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÂ\u0003J7\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;", "", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "isLoading", "", CreateTransferDuxo.SAVED_STATE_IRA_TAX_WITHHOLDING, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;)V", "getFederalWithholdingPercent", "()Ljava/math/BigDecimal;", "getStateWithholdingPercent", "()Z", "submitAction", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState$SubmitAction;", "getSubmitAction", "()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState$SubmitAction;", "federalAmountText", "Lcom/robinhood/utils/resource/StringResource;", "getFederalAmountText", "()Lcom/robinhood/utils/resource/StringResource;", "stateAmountText", "getStateAmountText", "totalAmountText", "getTotalAmountText", "receivedAmountText", "getReceivedAmountText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "SubmitAction", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EditIraDistributionTaxWithholdingViewState {
    public static final int $stable = 8;
    private final BigDecimal federalWithholdingPercent;
    private final ApiIraDistributionTaxWithholding iraDistributionTaxWithholding;
    private final boolean isLoading;
    private final BigDecimal stateWithholdingPercent;

    public EditIraDistributionTaxWithholdingViewState() {
        this(null, null, false, null, 15, null);
    }

    /* renamed from: component4, reason: from getter */
    private final ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding() {
        return this.iraDistributionTaxWithholding;
    }

    public static /* synthetic */ EditIraDistributionTaxWithholdingViewState copy$default(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = editIraDistributionTaxWithholdingViewState.federalWithholdingPercent;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = editIraDistributionTaxWithholdingViewState.stateWithholdingPercent;
        }
        if ((i & 4) != 0) {
            z = editIraDistributionTaxWithholdingViewState.isLoading;
        }
        if ((i & 8) != 0) {
            apiIraDistributionTaxWithholding = editIraDistributionTaxWithholdingViewState.iraDistributionTaxWithholding;
        }
        return editIraDistributionTaxWithholdingViewState.copy(bigDecimal, bigDecimal2, z, apiIraDistributionTaxWithholding);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getFederalWithholdingPercent() {
        return this.federalWithholdingPercent;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getStateWithholdingPercent() {
        return this.stateWithholdingPercent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final EditIraDistributionTaxWithholdingViewState copy(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent, boolean isLoading, ApiIraDistributionTaxWithholding iraDistributionTaxWithholding) {
        return new EditIraDistributionTaxWithholdingViewState(federalWithholdingPercent, stateWithholdingPercent, isLoading, iraDistributionTaxWithholding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditIraDistributionTaxWithholdingViewState)) {
            return false;
        }
        EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState = (EditIraDistributionTaxWithholdingViewState) other;
        return Intrinsics.areEqual(this.federalWithholdingPercent, editIraDistributionTaxWithholdingViewState.federalWithholdingPercent) && Intrinsics.areEqual(this.stateWithholdingPercent, editIraDistributionTaxWithholdingViewState.stateWithholdingPercent) && this.isLoading == editIraDistributionTaxWithholdingViewState.isLoading && Intrinsics.areEqual(this.iraDistributionTaxWithholding, editIraDistributionTaxWithholdingViewState.iraDistributionTaxWithholding);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.federalWithholdingPercent;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.stateWithholdingPercent;
        int iHashCode2 = (((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = this.iraDistributionTaxWithholding;
        return iHashCode2 + (apiIraDistributionTaxWithholding != null ? apiIraDistributionTaxWithholding.hashCode() : 0);
    }

    public String toString() {
        return "EditIraDistributionTaxWithholdingViewState(federalWithholdingPercent=" + this.federalWithholdingPercent + ", stateWithholdingPercent=" + this.stateWithholdingPercent + ", isLoading=" + this.isLoading + ", iraDistributionTaxWithholding=" + this.iraDistributionTaxWithholding + ")";
    }

    public EditIraDistributionTaxWithholdingViewState(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding) {
        this.federalWithholdingPercent = bigDecimal;
        this.stateWithholdingPercent = bigDecimal2;
        this.isLoading = z;
        this.iraDistributionTaxWithholding = apiIraDistributionTaxWithholding;
    }

    public /* synthetic */ EditIraDistributionTaxWithholdingViewState(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : bigDecimal2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : apiIraDistributionTaxWithholding);
    }

    public final BigDecimal getFederalWithholdingPercent() {
        return this.federalWithholdingPercent;
    }

    public final BigDecimal getStateWithholdingPercent() {
        return this.stateWithholdingPercent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final SubmitAction getSubmitAction() {
        if (this.isLoading || this.federalWithholdingPercent == null || this.stateWithholdingPercent == null) {
            return null;
        }
        return new SubmitAction(this.federalWithholdingPercent, this.stateWithholdingPercent);
    }

    public final StringResource getFederalAmountText() {
        Object objInvoke;
        BigDecimal federal_withholding_amount;
        Money money;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C30065R.string.transfer_ira_tax_withholding_amount_from_percentage;
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = this.iraDistributionTaxWithholding;
        if (apiIraDistributionTaxWithholding == null || (federal_withholding_amount = apiIraDistributionTaxWithholding.getFederal_withholding_amount()) == null || (money = Money3.toMoney(federal_withholding_amount, Currencies.USD)) == null || (objInvoke = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            objInvoke = companion.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return companion.invoke(i, objInvoke);
    }

    public final StringResource getStateAmountText() {
        Object objInvoke;
        BigDecimal state_withholding_amount;
        Money money;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C30065R.string.transfer_ira_tax_withholding_amount_from_percentage;
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = this.iraDistributionTaxWithholding;
        if (apiIraDistributionTaxWithholding == null || (state_withholding_amount = apiIraDistributionTaxWithholding.getState_withholding_amount()) == null || (money = Money3.toMoney(state_withholding_amount, Currencies.USD)) == null || (objInvoke = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            objInvoke = companion.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return companion.invoke(i, objInvoke);
    }

    public final StringResource getTotalAmountText() {
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = this.iraDistributionTaxWithholding;
        if (apiIraDistributionTaxWithholding == null) {
            return StringResource.INSTANCE.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(Money.format$default(Money3.toMoney(apiIraDistributionTaxWithholding.getTotal_withholding_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final StringResource getReceivedAmountText() {
        Object objInvoke;
        BigDecimal amount_received;
        Money money;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C30065R.string.transfer_ira_tax_withholding_amount_received_with_placeholder;
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = this.iraDistributionTaxWithholding;
        if (apiIraDistributionTaxWithholding == null || (amount_received = apiIraDistributionTaxWithholding.getAmount_received()) == null || (money = Money3.toMoney(amount_received, Currencies.USD)) == null || (objInvoke = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            objInvoke = companion.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return companion.invoke(i, objInvoke);
    }

    /* compiled from: EditIraDistributionTaxWithholdingViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState$SubmitAction;", "", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getFederalWithholdingPercent", "()Ljava/math/BigDecimal;", "getStateWithholdingPercent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmitAction {
        public static final int $stable = 8;
        private final BigDecimal federalWithholdingPercent;
        private final BigDecimal stateWithholdingPercent;

        public static /* synthetic */ SubmitAction copy$default(SubmitAction submitAction, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = submitAction.federalWithholdingPercent;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = submitAction.stateWithholdingPercent;
            }
            return submitAction.copy(bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getFederalWithholdingPercent() {
            return this.federalWithholdingPercent;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getStateWithholdingPercent() {
            return this.stateWithholdingPercent;
        }

        public final SubmitAction copy(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
            Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
            Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
            return new SubmitAction(federalWithholdingPercent, stateWithholdingPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitAction)) {
                return false;
            }
            SubmitAction submitAction = (SubmitAction) other;
            return Intrinsics.areEqual(this.federalWithholdingPercent, submitAction.federalWithholdingPercent) && Intrinsics.areEqual(this.stateWithholdingPercent, submitAction.stateWithholdingPercent);
        }

        public int hashCode() {
            return (this.federalWithholdingPercent.hashCode() * 31) + this.stateWithholdingPercent.hashCode();
        }

        public String toString() {
            return "SubmitAction(federalWithholdingPercent=" + this.federalWithholdingPercent + ", stateWithholdingPercent=" + this.stateWithholdingPercent + ")";
        }

        public SubmitAction(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
            Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
            Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
            this.federalWithholdingPercent = federalWithholdingPercent;
            this.stateWithholdingPercent = stateWithholdingPercent;
        }

        public final BigDecimal getFederalWithholdingPercent() {
            return this.federalWithholdingPercent;
        }

        public final BigDecimal getStateWithholdingPercent() {
            return this.stateWithholdingPercent;
        }
    }
}
