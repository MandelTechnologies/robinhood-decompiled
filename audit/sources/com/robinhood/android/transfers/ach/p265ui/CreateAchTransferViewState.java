package com.robinhood.android.transfers.ach.p265ui;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateAchTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'J\u000e\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÂ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÂ\u0003Js\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferViewState;", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "validationResultEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "showDepositFrequencyButton", "", "isDepositFrequencyButtonClickable", "shouldCleanupOnboardingRecurringContent", "areMarketsOpenExtended", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "depositFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<init>", "(Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/udf/UiEvent;ZZZZLcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getValidationResultEvent", "()Lcom/robinhood/udf/UiEvent;", "getShowDepositFrequencyButton", "()Z", "getShouldCleanupOnboardingRecurringContent", "isCurrentBalanceTextVisible", "recommendedWithdrawalAmountForMargin", "Ljava/math/BigDecimal;", "getRecommendedWithdrawalAmountForMargin", "()Ljava/math/BigDecimal;", "withdrawalLimit", "getWithdrawalLimit", "getCurrentBalanceText", "", "resources", "Landroid/content/res/Resources;", "getAchRelationshipDisplayText", "getAutomaticDepositText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class CreateAchTransferViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final boolean areMarketsOpenExtended;
    private final ApiAutomaticDeposit.Frequency depositFrequency;
    private final boolean isCurrentBalanceTextVisible;
    private final boolean isDepositFrequencyButtonClickable;
    private final boolean shouldCleanupOnboardingRecurringContent;
    private final boolean showDepositFrequencyButton;
    private final TransferDirection transferDirection;
    private final UnifiedBalances unifiedBalances;
    private final UiEvent<CreateAchTransferViewState2> validationResultEvent;

    public CreateAchTransferViewState() {
        this(null, null, null, false, false, false, false, null, null, 511, null);
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getAreMarketsOpenExtended() {
        return this.areMarketsOpenExtended;
    }

    /* renamed from: component8, reason: from getter */
    private final TransferDirection getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component9, reason: from getter */
    private final ApiAutomaticDeposit.Frequency getDepositFrequency() {
        return this.depositFrequency;
    }

    public static /* synthetic */ CreateAchTransferViewState copy$default(CreateAchTransferViewState createAchTransferViewState, UnifiedBalances unifiedBalances, AchRelationship achRelationship, UiEvent uiEvent, boolean z, boolean z2, boolean z3, boolean z4, TransferDirection transferDirection, ApiAutomaticDeposit.Frequency frequency, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedBalances = createAchTransferViewState.unifiedBalances;
        }
        if ((i & 2) != 0) {
            achRelationship = createAchTransferViewState.achRelationship;
        }
        if ((i & 4) != 0) {
            uiEvent = createAchTransferViewState.validationResultEvent;
        }
        if ((i & 8) != 0) {
            z = createAchTransferViewState.showDepositFrequencyButton;
        }
        if ((i & 16) != 0) {
            z2 = createAchTransferViewState.isDepositFrequencyButtonClickable;
        }
        if ((i & 32) != 0) {
            z3 = createAchTransferViewState.shouldCleanupOnboardingRecurringContent;
        }
        if ((i & 64) != 0) {
            z4 = createAchTransferViewState.areMarketsOpenExtended;
        }
        if ((i & 128) != 0) {
            transferDirection = createAchTransferViewState.transferDirection;
        }
        if ((i & 256) != 0) {
            frequency = createAchTransferViewState.depositFrequency;
        }
        TransferDirection transferDirection2 = transferDirection;
        ApiAutomaticDeposit.Frequency frequency2 = frequency;
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z2;
        UiEvent uiEvent2 = uiEvent;
        return createAchTransferViewState.copy(unifiedBalances, achRelationship, uiEvent2, z, z7, z5, z6, transferDirection2, frequency2);
    }

    /* renamed from: component1, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component2, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final UiEvent<CreateAchTransferViewState2> component3() {
        return this.validationResultEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDepositFrequencyButton() {
        return this.showDepositFrequencyButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDepositFrequencyButtonClickable() {
        return this.isDepositFrequencyButtonClickable;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldCleanupOnboardingRecurringContent() {
        return this.shouldCleanupOnboardingRecurringContent;
    }

    public final CreateAchTransferViewState copy(UnifiedBalances unifiedBalances, AchRelationship achRelationship, UiEvent<CreateAchTransferViewState2> validationResultEvent, boolean showDepositFrequencyButton, boolean isDepositFrequencyButtonClickable, boolean shouldCleanupOnboardingRecurringContent, boolean areMarketsOpenExtended, TransferDirection transferDirection, ApiAutomaticDeposit.Frequency depositFrequency) {
        return new CreateAchTransferViewState(unifiedBalances, achRelationship, validationResultEvent, showDepositFrequencyButton, isDepositFrequencyButtonClickable, shouldCleanupOnboardingRecurringContent, areMarketsOpenExtended, transferDirection, depositFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAchTransferViewState)) {
            return false;
        }
        CreateAchTransferViewState createAchTransferViewState = (CreateAchTransferViewState) other;
        return Intrinsics.areEqual(this.unifiedBalances, createAchTransferViewState.unifiedBalances) && Intrinsics.areEqual(this.achRelationship, createAchTransferViewState.achRelationship) && Intrinsics.areEqual(this.validationResultEvent, createAchTransferViewState.validationResultEvent) && this.showDepositFrequencyButton == createAchTransferViewState.showDepositFrequencyButton && this.isDepositFrequencyButtonClickable == createAchTransferViewState.isDepositFrequencyButtonClickable && this.shouldCleanupOnboardingRecurringContent == createAchTransferViewState.shouldCleanupOnboardingRecurringContent && this.areMarketsOpenExtended == createAchTransferViewState.areMarketsOpenExtended && this.transferDirection == createAchTransferViewState.transferDirection && this.depositFrequency == createAchTransferViewState.depositFrequency;
    }

    public int hashCode() {
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode = (unifiedBalances == null ? 0 : unifiedBalances.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        UiEvent<CreateAchTransferViewState2> uiEvent = this.validationResultEvent;
        int iHashCode3 = (((((((((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.showDepositFrequencyButton)) * 31) + Boolean.hashCode(this.isDepositFrequencyButtonClickable)) * 31) + Boolean.hashCode(this.shouldCleanupOnboardingRecurringContent)) * 31) + Boolean.hashCode(this.areMarketsOpenExtended)) * 31;
        TransferDirection transferDirection = this.transferDirection;
        int iHashCode4 = (iHashCode3 + (transferDirection == null ? 0 : transferDirection.hashCode())) * 31;
        ApiAutomaticDeposit.Frequency frequency = this.depositFrequency;
        return iHashCode4 + (frequency != null ? frequency.hashCode() : 0);
    }

    public String toString() {
        return "CreateAchTransferViewState(unifiedBalances=" + this.unifiedBalances + ", achRelationship=" + this.achRelationship + ", validationResultEvent=" + this.validationResultEvent + ", showDepositFrequencyButton=" + this.showDepositFrequencyButton + ", isDepositFrequencyButtonClickable=" + this.isDepositFrequencyButtonClickable + ", shouldCleanupOnboardingRecurringContent=" + this.shouldCleanupOnboardingRecurringContent + ", areMarketsOpenExtended=" + this.areMarketsOpenExtended + ", transferDirection=" + this.transferDirection + ", depositFrequency=" + this.depositFrequency + ")";
    }

    public CreateAchTransferViewState(UnifiedBalances unifiedBalances, AchRelationship achRelationship, UiEvent<CreateAchTransferViewState2> uiEvent, boolean z, boolean z2, boolean z3, boolean z4, TransferDirection transferDirection, ApiAutomaticDeposit.Frequency frequency) {
        this.unifiedBalances = unifiedBalances;
        this.achRelationship = achRelationship;
        this.validationResultEvent = uiEvent;
        this.showDepositFrequencyButton = z;
        this.isDepositFrequencyButtonClickable = z2;
        this.shouldCleanupOnboardingRecurringContent = z3;
        this.areMarketsOpenExtended = z4;
        this.transferDirection = transferDirection;
        this.depositFrequency = frequency;
        this.isCurrentBalanceTextVisible = unifiedBalances != null;
    }

    public /* synthetic */ CreateAchTransferViewState(UnifiedBalances unifiedBalances, AchRelationship achRelationship, UiEvent uiEvent, boolean z, boolean z2, boolean z3, boolean z4, TransferDirection transferDirection, ApiAutomaticDeposit.Frequency frequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unifiedBalances, (i & 2) != 0 ? null : achRelationship, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : transferDirection, (i & 256) != 0 ? null : frequency);
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final UiEvent<CreateAchTransferViewState2> getValidationResultEvent() {
        return this.validationResultEvent;
    }

    public final boolean getShowDepositFrequencyButton() {
        return this.showDepositFrequencyButton;
    }

    public final boolean isDepositFrequencyButtonClickable() {
        return this.isDepositFrequencyButtonClickable;
    }

    public final boolean getShouldCleanupOnboardingRecurringContent() {
        return this.shouldCleanupOnboardingRecurringContent;
    }

    /* renamed from: isCurrentBalanceTextVisible, reason: from getter */
    public final boolean getIsCurrentBalanceTextVisible() {
        return this.isCurrentBalanceTextVisible;
    }

    public final BigDecimal getRecommendedWithdrawalAmountForMargin() {
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        if (unifiedBalances == null || !unifiedBalances.getBrokerageBalances().isGold() || !this.areMarketsOpenExtended) {
            return null;
        }
        GoldWithdrawableCashBreakdown goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown = GoldWithdrawableCashBreakdown2.createGoldWithdrawableCashBreakdown(this.unifiedBalances);
        if (goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.useExcess() || goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.useDistanceFromMin()) {
            return BigDecimals7.safeMultiply(new BigDecimal("0.95"), this.unifiedBalances.getBrokerageBalances().getWithdrawableAmount());
        }
        return null;
    }

    public final BigDecimal getWithdrawalLimit() {
        BrokerageBalances brokerageBalances;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        BigDecimal withdrawableAmount = (unifiedBalances == null || (brokerageBalances = unifiedBalances.getBrokerageBalances()) == null) ? null : brokerageBalances.getWithdrawableAmount();
        AchRelationship achRelationship = this.achRelationship;
        BigDecimal withdrawalLimit = achRelationship != null ? achRelationship.getWithdrawalLimit() : null;
        if (withdrawableAmount == null && withdrawalLimit == null) {
            return null;
        }
        return withdrawableAmount == null ? withdrawalLimit : withdrawalLimit == null ? withdrawableAmount : withdrawableAmount.min(withdrawalLimit);
    }

    public final String getCurrentBalanceText(Resources resources) {
        BigDecimal withdrawalLimit;
        Intrinsics.checkNotNullParameter(resources, "resources");
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        if (unifiedBalances == null) {
            return null;
        }
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(unifiedBalances.getBrokerageBalances().getWithdrawableAmount());
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null && (withdrawalLimit = achRelationship.getWithdrawalLimit()) != null && withdrawalLimit.compareTo(bigDecimalOrZero) < 0) {
            bigDecimalOrZero = withdrawalLimit;
        }
        return resources.getString(C30082R.string.ach_transfer_robinhood_account_balance, Formats.getCurrencyFormat().format(bigDecimalOrZero));
    }

    public final String getAchRelationshipDisplayText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null) {
            return AchRelationships.getAchRelationshipDisplayName(achRelationship, resources);
        }
        return null;
    }

    public final String getAutomaticDepositText(Resources resources) throws Resources.NotFoundException {
        String automaticDepositExplanation;
        Intrinsics.checkNotNullParameter(resources, "resources");
        ApiAutomaticDeposit.Frequency frequency = this.depositFrequency;
        if (frequency != null) {
            if (this.shouldCleanupOnboardingRecurringContent) {
                automaticDepositExplanation = frequency.name().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(automaticDepositExplanation, "toUpperCase(...)");
            } else {
                automaticDepositExplanation = frequency.getIsRecurring() ? AchTransferStringHelper.INSTANCE.getAutomaticDepositExplanation(resources, frequency) : null;
            }
            if (automaticDepositExplanation != null) {
                return automaticDepositExplanation;
            }
        }
        String string2 = resources.getString(C30082R.string.ach_transfer_convert_to_automatic_deposit_action);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
