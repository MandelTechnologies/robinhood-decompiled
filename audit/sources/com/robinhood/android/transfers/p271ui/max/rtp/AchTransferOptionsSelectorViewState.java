package com.robinhood.android.transfers.p271ui.max.rtp;

import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.ServiceFeeParamsState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AchTransferOptionsSelectorViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorViewState;", "", "selectedAchTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "bundle", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;", "<init>", "(Lcom/robinhood/android/lib/transfers/AchTransferOption;Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;)V", "getSelectedAchTransferOption$feature_transfers_externalRelease", "()Lcom/robinhood/android/lib/transfers/AchTransferOption;", "isRtpEligible", "", "()Z", "isTransferOverLimit", "achTransferOption", "getAchTransferOption", "isVisible", "isAchTransferOptionStandardSelected", "isAchTransferOptionInstantSelected", "isAchTransferOptionInstantEnabled", "achTransferOptionInstantSecondaryText", "Lcom/robinhood/utils/resource/StringResource;", "getAchTransferOptionInstantSecondaryText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component1$feature_transfers_externalRelease", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class AchTransferOptionsSelectorViewState {
    public static final int $stable = 8;
    private final AchTransferOption achTransferOption;
    private final AchTransferOptionsSelectorBundle bundle;
    private final boolean isTransferOverLimit;
    private final AchTransferOption selectedAchTransferOption;

    /* JADX WARN: Multi-variable type inference failed */
    public AchTransferOptionsSelectorViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component2, reason: from getter */
    private final AchTransferOptionsSelectorBundle getBundle() {
        return this.bundle;
    }

    public static /* synthetic */ AchTransferOptionsSelectorViewState copy$default(AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState, AchTransferOption achTransferOption, AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, int i, Object obj) {
        if ((i & 1) != 0) {
            achTransferOption = achTransferOptionsSelectorViewState.selectedAchTransferOption;
        }
        if ((i & 2) != 0) {
            achTransferOptionsSelectorBundle = achTransferOptionsSelectorViewState.bundle;
        }
        return achTransferOptionsSelectorViewState.copy(achTransferOption, achTransferOptionsSelectorBundle);
    }

    /* renamed from: component1$feature_transfers_externalRelease, reason: from getter */
    public final AchTransferOption getSelectedAchTransferOption() {
        return this.selectedAchTransferOption;
    }

    public final AchTransferOptionsSelectorViewState copy(AchTransferOption selectedAchTransferOption, AchTransferOptionsSelectorBundle bundle) {
        return new AchTransferOptionsSelectorViewState(selectedAchTransferOption, bundle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchTransferOptionsSelectorViewState)) {
            return false;
        }
        AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState = (AchTransferOptionsSelectorViewState) other;
        return this.selectedAchTransferOption == achTransferOptionsSelectorViewState.selectedAchTransferOption && Intrinsics.areEqual(this.bundle, achTransferOptionsSelectorViewState.bundle);
    }

    public int hashCode() {
        AchTransferOption achTransferOption = this.selectedAchTransferOption;
        int iHashCode = (achTransferOption == null ? 0 : achTransferOption.hashCode()) * 31;
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = this.bundle;
        return iHashCode + (achTransferOptionsSelectorBundle != null ? achTransferOptionsSelectorBundle.hashCode() : 0);
    }

    public String toString() {
        return "AchTransferOptionsSelectorViewState(selectedAchTransferOption=" + this.selectedAchTransferOption + ", bundle=" + this.bundle + ")";
    }

    public AchTransferOptionsSelectorViewState(AchTransferOption achTransferOption, AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle) {
        ApiAmountLimit dailyLimits;
        BigDecimal total_amount;
        this.selectedAchTransferOption = achTransferOption;
        this.bundle = achTransferOptionsSelectorBundle;
        boolean z = false;
        if (achTransferOptionsSelectorBundle != null && (dailyLimits = achTransferOptionsSelectorBundle.getDailyLimits()) != null && (total_amount = dailyLimits.getTotal_amount()) != null && total_amount.compareTo(achTransferOptionsSelectorBundle.getAmount()) < 0) {
            z = true;
        }
        this.isTransferOverLimit = z;
        this.achTransferOption = isAchTransferOptionInstantEnabled() ? achTransferOption : AchTransferOption.STANDARD;
    }

    public /* synthetic */ AchTransferOptionsSelectorViewState(AchTransferOption achTransferOption, AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : achTransferOption, (i & 2) != 0 ? null : achTransferOptionsSelectorBundle);
    }

    public final AchTransferOption getSelectedAchTransferOption$feature_transfers_externalRelease() {
        return this.selectedAchTransferOption;
    }

    private final boolean isRtpEligible() {
        TransferAccount sinkAccount;
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = this.bundle;
        ApiTransferAccount.TransferAccountType type2 = null;
        if (!TransferAccounts2.isRtpEligibleSource(achTransferOptionsSelectorBundle != null ? achTransferOptionsSelectorBundle.getSourceAccount() : null)) {
            return false;
        }
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle2 = this.bundle;
        if (achTransferOptionsSelectorBundle2 != null && (sinkAccount = achTransferOptionsSelectorBundle2.getSinkAccount()) != null) {
            type2 = sinkAccount.getType();
        }
        return type2 == ApiTransferAccount.TransferAccountType.ACH && TransferAccounts2.isRtpEligible(this.bundle.getSinkAccount());
    }

    public final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    public final boolean isVisible() {
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = this.bundle;
        return (achTransferOptionsSelectorBundle != null ? achTransferOptionsSelectorBundle.getMode() : null) == CreateTransferViewState.Mode.REVIEW && isRtpEligible() && this.bundle.getServiceFee() != null && (this.bundle.getServiceFeeParamsState() instanceof ServiceFeeParamsState.Loaded);
    }

    public final boolean isAchTransferOptionStandardSelected() {
        return this.achTransferOption == AchTransferOption.STANDARD;
    }

    public final boolean isAchTransferOptionInstantSelected() {
        return this.achTransferOption == AchTransferOption.INSTANT;
    }

    public final boolean isAchTransferOptionInstantEnabled() {
        return !this.isTransferOverLimit;
    }

    public final StringResource getAchTransferOptionInstantSecondaryText() {
        if (this.isTransferOverLimit) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C30065R.string.transfer_account_limit_template;
            AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = this.bundle;
            Intrinsics.checkNotNull(achTransferOptionsSelectorBundle);
            ApiAmountLimit dailyLimits = achTransferOptionsSelectorBundle.getDailyLimits();
            Intrinsics.checkNotNull(dailyLimits);
            return companion.invoke(i, Money.format$default(Money3.toMoney(dailyLimits.getTotal_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle2 = this.bundle;
        if ((achTransferOptionsSelectorBundle2 != null ? achTransferOptionsSelectorBundle2.getServiceFee() : null) != null) {
            return StringResource.INSTANCE.invoke(C30065R.string.transfer_account_fee_template, Money.format$default(Money3.toMoney(this.bundle.getServiceFee().getService_fee(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return null;
    }
}
