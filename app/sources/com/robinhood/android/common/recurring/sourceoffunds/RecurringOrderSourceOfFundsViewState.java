package com.robinhood.android.common.recurring.sourceoffunds;

import android.content.res.Resources;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: RecurringOrderSourceOfFundsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004VWXYB\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CJ\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010N\u001a\u00020\u0018HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0099\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010Q\u001a\u00020<2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020\u0018HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010-\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b.\u0010%R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00058F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010=R\u0014\u0010>\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState;", "", "instrumentBuyingPower", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$BuyingPower;", "linkedAchRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "Ljava/util/UUID;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "result", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "accountNumber", "<init>", "(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$BuyingPower;Ljava/util/List;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;Ljava/lang/String;Ljava/lang/String;)V", "getInvestmentSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getActionType", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "getSourceOfFunds", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getAchRelationshipId", "()Ljava/util/UUID;", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "getResult", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "getLoggingSource", "()Ljava/lang/String;", "getAccountNumber", "investmentScheduleId", "getInvestmentScheduleId", "fundingSources", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource;", "getFundingSources", "()Ljava/util/List;", "continueButtonState", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "getContinueButtonState", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "isMarginInvestingEnabled", "", "()Z", "updatePending", "getUpdatePending", "getDisclaimerText", "", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "InvestmentScheduleUpdate", "FundingSource", "ContinueButtonState", "UpdateInvestmentScheduleResult", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderSourceOfFundsViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID achRelationshipId;
    private final RecurringOrderActionType actionType;
    private final InvestmentScheduleAmount.Dollar amount;
    private final FundingSource.BuyingPower instrumentBuyingPower;
    private final InvestmentSchedule investmentSchedule;
    private final InvestmentTarget investmentTarget;
    private final List<AchRelationship> linkedAchRelationships;
    private final RecurringContext loggingContext;
    private final String loggingSource;
    private final MarginSettings marginSettings;
    private final UpdateInvestmentScheduleResult result;
    private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;

    /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final FundingSource.BuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    private final List<AchRelationship> component2() {
        return this.linkedAchRelationships;
    }

    /* renamed from: component3, reason: from getter */
    private final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public static /* synthetic */ RecurringOrderSourceOfFundsViewState copy$default(RecurringOrderSourceOfFundsViewState recurringOrderSourceOfFundsViewState, FundingSource.BuyingPower buyingPower, List list, MarginSettings marginSettings, InvestmentSchedule investmentSchedule, InvestmentTarget investmentTarget, RecurringOrderActionType recurringOrderActionType, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, InvestmentScheduleAmount.Dollar dollar, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            buyingPower = recurringOrderSourceOfFundsViewState.instrumentBuyingPower;
        }
        if ((i & 2) != 0) {
            list = recurringOrderSourceOfFundsViewState.linkedAchRelationships;
        }
        if ((i & 4) != 0) {
            marginSettings = recurringOrderSourceOfFundsViewState.marginSettings;
        }
        if ((i & 8) != 0) {
            investmentSchedule = recurringOrderSourceOfFundsViewState.investmentSchedule;
        }
        if ((i & 16) != 0) {
            investmentTarget = recurringOrderSourceOfFundsViewState.investmentTarget;
        }
        if ((i & 32) != 0) {
            recurringOrderActionType = recurringOrderSourceOfFundsViewState.actionType;
        }
        if ((i & 64) != 0) {
            sourceOfFunds = recurringOrderSourceOfFundsViewState.sourceOfFunds;
        }
        if ((i & 128) != 0) {
            uuid = recurringOrderSourceOfFundsViewState.achRelationshipId;
        }
        if ((i & 256) != 0) {
            dollar = recurringOrderSourceOfFundsViewState.amount;
        }
        if ((i & 512) != 0) {
            updateInvestmentScheduleResult = recurringOrderSourceOfFundsViewState.result;
        }
        if ((i & 1024) != 0) {
            str = recurringOrderSourceOfFundsViewState.loggingSource;
        }
        if ((i & 2048) != 0) {
            str2 = recurringOrderSourceOfFundsViewState.accountNumber;
        }
        String str3 = str;
        String str4 = str2;
        InvestmentScheduleAmount.Dollar dollar2 = dollar;
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult2 = updateInvestmentScheduleResult;
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2 = sourceOfFunds;
        UUID uuid2 = uuid;
        InvestmentTarget investmentTarget2 = investmentTarget;
        RecurringOrderActionType recurringOrderActionType2 = recurringOrderActionType;
        return recurringOrderSourceOfFundsViewState.copy(buyingPower, list, marginSettings, investmentSchedule, investmentTarget2, recurringOrderActionType2, sourceOfFunds2, uuid2, dollar2, updateInvestmentScheduleResult2, str3, str4);
    }

    /* renamed from: component10, reason: from getter */
    public final UpdateInvestmentScheduleResult getResult() {
        return this.result;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /* renamed from: component6, reason: from getter */
    public final RecurringOrderActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* renamed from: component8, reason: from getter */
    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    /* renamed from: component9, reason: from getter */
    public final InvestmentScheduleAmount.Dollar getAmount() {
        return this.amount;
    }

    public final RecurringOrderSourceOfFundsViewState copy(FundingSource.BuyingPower instrumentBuyingPower, List<AchRelationship> linkedAchRelationships, MarginSettings marginSettings, InvestmentSchedule investmentSchedule, InvestmentTarget investmentTarget, RecurringOrderActionType actionType, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, InvestmentScheduleAmount.Dollar amount, UpdateInvestmentScheduleResult result, String loggingSource, String accountNumber) {
        Intrinsics.checkNotNullParameter(linkedAchRelationships, "linkedAchRelationships");
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        return new RecurringOrderSourceOfFundsViewState(instrumentBuyingPower, linkedAchRelationships, marginSettings, investmentSchedule, investmentTarget, actionType, sourceOfFunds, achRelationshipId, amount, result, loggingSource, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderSourceOfFundsViewState)) {
            return false;
        }
        RecurringOrderSourceOfFundsViewState recurringOrderSourceOfFundsViewState = (RecurringOrderSourceOfFundsViewState) other;
        return Intrinsics.areEqual(this.instrumentBuyingPower, recurringOrderSourceOfFundsViewState.instrumentBuyingPower) && Intrinsics.areEqual(this.linkedAchRelationships, recurringOrderSourceOfFundsViewState.linkedAchRelationships) && Intrinsics.areEqual(this.marginSettings, recurringOrderSourceOfFundsViewState.marginSettings) && Intrinsics.areEqual(this.investmentSchedule, recurringOrderSourceOfFundsViewState.investmentSchedule) && Intrinsics.areEqual(this.investmentTarget, recurringOrderSourceOfFundsViewState.investmentTarget) && Intrinsics.areEqual(this.actionType, recurringOrderSourceOfFundsViewState.actionType) && this.sourceOfFunds == recurringOrderSourceOfFundsViewState.sourceOfFunds && Intrinsics.areEqual(this.achRelationshipId, recurringOrderSourceOfFundsViewState.achRelationshipId) && Intrinsics.areEqual(this.amount, recurringOrderSourceOfFundsViewState.amount) && Intrinsics.areEqual(this.result, recurringOrderSourceOfFundsViewState.result) && Intrinsics.areEqual(this.loggingSource, recurringOrderSourceOfFundsViewState.loggingSource) && Intrinsics.areEqual(this.accountNumber, recurringOrderSourceOfFundsViewState.accountNumber);
    }

    public int hashCode() {
        FundingSource.BuyingPower buyingPower = this.instrumentBuyingPower;
        int iHashCode = (((buyingPower == null ? 0 : buyingPower.hashCode()) * 31) + this.linkedAchRelationships.hashCode()) * 31;
        MarginSettings marginSettings = this.marginSettings;
        int iHashCode2 = (iHashCode + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        int iHashCode3 = (((iHashCode2 + (investmentSchedule == null ? 0 : investmentSchedule.hashCode())) * 31) + this.investmentTarget.hashCode()) * 31;
        RecurringOrderActionType recurringOrderActionType = this.actionType;
        int iHashCode4 = (iHashCode3 + (recurringOrderActionType == null ? 0 : recurringOrderActionType.hashCode())) * 31;
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        int iHashCode5 = (iHashCode4 + (sourceOfFunds == null ? 0 : sourceOfFunds.hashCode())) * 31;
        UUID uuid = this.achRelationshipId;
        int iHashCode6 = (iHashCode5 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        InvestmentScheduleAmount.Dollar dollar = this.amount;
        int iHashCode7 = (iHashCode6 + (dollar == null ? 0 : dollar.hashCode())) * 31;
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult = this.result;
        int iHashCode8 = (((iHashCode7 + (updateInvestmentScheduleResult == null ? 0 : updateInvestmentScheduleResult.hashCode())) * 31) + this.loggingSource.hashCode()) * 31;
        String str = this.accountNumber;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RecurringOrderSourceOfFundsViewState(instrumentBuyingPower=" + this.instrumentBuyingPower + ", linkedAchRelationships=" + this.linkedAchRelationships + ", marginSettings=" + this.marginSettings + ", investmentSchedule=" + this.investmentSchedule + ", investmentTarget=" + this.investmentTarget + ", actionType=" + this.actionType + ", sourceOfFunds=" + this.sourceOfFunds + ", achRelationshipId=" + this.achRelationshipId + ", amount=" + this.amount + ", result=" + this.result + ", loggingSource=" + this.loggingSource + ", accountNumber=" + this.accountNumber + ")";
    }

    public RecurringOrderSourceOfFundsViewState(FundingSource.BuyingPower buyingPower, List<AchRelationship> linkedAchRelationships, MarginSettings marginSettings, InvestmentSchedule investmentSchedule, InvestmentTarget investmentTarget, RecurringOrderActionType recurringOrderActionType, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, InvestmentScheduleAmount.Dollar dollar, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String loggingSource, String str) {
        RecurringContext.FlowType flowType;
        RecurringContext.EntryPoint entryPoint;
        Intrinsics.checkNotNullParameter(linkedAchRelationships, "linkedAchRelationships");
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        this.instrumentBuyingPower = buyingPower;
        this.linkedAchRelationships = linkedAchRelationships;
        this.marginSettings = marginSettings;
        this.investmentSchedule = investmentSchedule;
        this.investmentTarget = investmentTarget;
        this.actionType = recurringOrderActionType;
        this.sourceOfFunds = sourceOfFunds;
        this.achRelationshipId = uuid;
        this.amount = dollar;
        this.result = updateInvestmentScheduleResult;
        this.loggingSource = loggingSource;
        this.accountNumber = str;
        if (getInvestmentScheduleId() != null) {
            flowType = RecurringContext.FlowType.EDIT;
        } else {
            flowType = RecurringContext.FlowType.CREATE;
        }
        RecurringContext.RecurringFundsSource protobuf = Recurring2.toProtobuf(sourceOfFunds);
        RecurringContext.ScheduleFrequency protobuf2 = Recurring2.toProtobuf(investmentSchedule != null ? investmentSchedule.getFrequency() : null);
        if (!StringsKt.isBlank(loggingSource)) {
            entryPoint = RecurringContext.EntryPoint.COMMS;
        } else {
            entryPoint = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        this.loggingContext = new RecurringContext(flowType, entryPoint, loggingSource, protobuf2, protobuf, 0.0d, Recurring2.toProtobuf(investmentTarget.getTargetType()), null, 0.0d, null, null, 1952, null);
    }

    public /* synthetic */ RecurringOrderSourceOfFundsViewState(FundingSource.BuyingPower buyingPower, List list, MarginSettings marginSettings, InvestmentSchedule investmentSchedule, InvestmentTarget investmentTarget, RecurringOrderActionType recurringOrderActionType, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, InvestmentScheduleAmount.Dollar dollar, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : buyingPower, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : marginSettings, (i & 8) != 0 ? null : investmentSchedule, investmentTarget, (i & 32) != 0 ? null : recurringOrderActionType, (i & 64) != 0 ? null : sourceOfFunds, (i & 128) != 0 ? null : uuid, (i & 256) != 0 ? null : dollar, (i & 512) != 0 ? null : updateInvestmentScheduleResult, (i & 1024) != 0 ? "" : str, str2);
    }

    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    public final RecurringOrderActionType getActionType() {
        return this.actionType;
    }

    public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    public final InvestmentScheduleAmount.Dollar getAmount() {
        return this.amount;
    }

    public final UpdateInvestmentScheduleResult getResult() {
        return this.result;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getInvestmentScheduleId() {
        RecurringOrderActionType recurringOrderActionType = this.actionType;
        if (recurringOrderActionType instanceof RecurringOrderActionType.Edit) {
            return ((RecurringOrderActionType.Edit) recurringOrderActionType).getInvestmentScheduleId();
        }
        if (Intrinsics.areEqual(recurringOrderActionType, RecurringOrderActionType.Create.INSTANCE) || recurringOrderActionType == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<FundingSource> getFundingSources() {
        return SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.plus((Sequence<? extends FundingSource.BuyingPower>) SequencesKt.map(CollectionsKt.asSequence(this.linkedAchRelationships), RecurringOrderSourceOfFundsViewState2.INSTANCE), this.instrumentBuyingPower)));
    }

    public final ContinueButtonState getContinueButtonState() {
        ContinueButtonState complete;
        Object next;
        if (this.actionType != null && this.sourceOfFunds != null) {
            if (getUpdatePending()) {
                return ContinueButtonState.Loading.INSTANCE;
            }
            RecurringOrderActionType recurringOrderActionType = this.actionType;
            if (Intrinsics.areEqual(recurringOrderActionType, RecurringOrderActionType.Create.INSTANCE)) {
                complete = new ContinueButtonState.Complete(this.amount, this.sourceOfFunds, this.achRelationshipId, this.accountNumber);
            } else {
                if (!(recurringOrderActionType instanceof RecurringOrderActionType.Edit)) {
                    throw new NoWhenBranchMatchedException();
                }
                complete = ContinueButtonState.UpdateInvestmentSchedule.INSTANCE;
            }
            ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.sourceOfFunds;
            int i = sourceOfFunds == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return isMarginInvestingEnabled() ? ContinueButtonState.ShowMarginLimitDialog.INSTANCE : complete;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Direct deposit is not supported here!");
            }
            Iterator<T> it = this.linkedAchRelationships.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AchRelationship) next).getId(), this.achRelationshipId)) {
                    break;
                }
            }
            AchRelationship achRelationship = (AchRelationship) next;
            return (achRelationship != null ? achRelationship.getBankAccountType() : null) == ApiAchRelationship.BankAccountType.SAVINGS ? ContinueButtonState.ShowWithdrawalLimitDialog.INSTANCE : complete;
        }
        return ContinueButtonState.Disabled.INSTANCE;
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    private final boolean isMarginInvestingEnabled() {
        MarginSettings marginSettings = this.marginSettings;
        return marginSettings != null && marginSettings.isMarginInvestingEnabled();
    }

    private final boolean getUpdatePending() {
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult = this.result;
        if (Intrinsics.areEqual(updateInvestmentScheduleResult, UpdateInvestmentScheduleResult.Loading.INSTANCE)) {
            return true;
        }
        if ((updateInvestmentScheduleResult instanceof UpdateInvestmentScheduleResult.Success) || (updateInvestmentScheduleResult instanceof UpdateInvestmentScheduleResult.Failure) || updateInvestmentScheduleResult == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence getDisclaimerText(Resources resources) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(resources, "resources");
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        int i = sourceOfFunds == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.ordinal()];
        if (i == -1) {
            numValueOf = null;
        } else if (i == 1) {
            numValueOf = Integer.valueOf(this.investmentTarget.isCrypto() ? C11595R.string.crypto_recurring_source_of_funds_ach_disclaimer : C11595R.string.equity_recurring_source_of_funds_ach_disclaimer);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Direct deposit is not supported here!");
            }
            if (this.investmentTarget.isCrypto()) {
                numValueOf = Integer.valueOf(C11595R.string.recurring_source_of_funds_crypto_buying_power_disclaimer);
            } else if (getInvestmentScheduleId() == null) {
                numValueOf = Integer.valueOf(C11595R.string.recurring_backup_payment_method_notification);
            }
        }
        if (numValueOf != null) {
            return resources.getString(numValueOf.intValue());
        }
        return null;
    }

    /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$InvestmentScheduleUpdate;", "", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "getSourceOfFunds", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getAchRelationshipId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvestmentScheduleUpdate {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID achRelationshipId;
        private final InvestmentScheduleAmount.Dollar amount;
        private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;

        public static /* synthetic */ InvestmentScheduleUpdate copy$default(InvestmentScheduleUpdate investmentScheduleUpdate, InvestmentScheduleAmount.Dollar dollar, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                dollar = investmentScheduleUpdate.amount;
            }
            if ((i & 2) != 0) {
                sourceOfFunds = investmentScheduleUpdate.sourceOfFunds;
            }
            if ((i & 4) != 0) {
                uuid = investmentScheduleUpdate.achRelationshipId;
            }
            if ((i & 8) != 0) {
                str = investmentScheduleUpdate.accountNumber;
            }
            return investmentScheduleUpdate.copy(dollar, sourceOfFunds, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InvestmentScheduleUpdate copy(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber) {
            Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
            return new InvestmentScheduleUpdate(amount, sourceOfFunds, achRelationshipId, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvestmentScheduleUpdate)) {
                return false;
            }
            InvestmentScheduleUpdate investmentScheduleUpdate = (InvestmentScheduleUpdate) other;
            return Intrinsics.areEqual(this.amount, investmentScheduleUpdate.amount) && this.sourceOfFunds == investmentScheduleUpdate.sourceOfFunds && Intrinsics.areEqual(this.achRelationshipId, investmentScheduleUpdate.achRelationshipId) && Intrinsics.areEqual(this.accountNumber, investmentScheduleUpdate.accountNumber);
        }

        public int hashCode() {
            InvestmentScheduleAmount.Dollar dollar = this.amount;
            int iHashCode = (((dollar == null ? 0 : dollar.hashCode()) * 31) + this.sourceOfFunds.hashCode()) * 31;
            UUID uuid = this.achRelationshipId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InvestmentScheduleUpdate(amount=" + this.amount + ", sourceOfFunds=" + this.sourceOfFunds + ", achRelationshipId=" + this.achRelationshipId + ", accountNumber=" + this.accountNumber + ")";
        }

        public InvestmentScheduleUpdate(InvestmentScheduleAmount.Dollar dollar, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, String str) {
            Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
            this.amount = dollar;
            this.sourceOfFunds = sourceOfFunds;
            this.achRelationshipId = uuid;
            this.accountNumber = str;
        }

        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource;", "", "<init>", "()V", "Ach", "BuyingPower", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$Ach;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$BuyingPower;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class FundingSource {
        public static final int $stable = 0;

        public /* synthetic */ FundingSource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FundingSource() {
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$Ach;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ach extends FundingSource {
            public static final int $stable = 8;
            private final AchRelationship achRelationship;

            public static /* synthetic */ Ach copy$default(Ach ach, AchRelationship achRelationship, int i, Object obj) {
                if ((i & 1) != 0) {
                    achRelationship = ach.achRelationship;
                }
                return ach.copy(achRelationship);
            }

            /* renamed from: component1, reason: from getter */
            public final AchRelationship getAchRelationship() {
                return this.achRelationship;
            }

            public final Ach copy(AchRelationship achRelationship) {
                Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                return new Ach(achRelationship);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ach) && Intrinsics.areEqual(this.achRelationship, ((Ach) other).achRelationship);
            }

            public int hashCode() {
                return this.achRelationship.hashCode();
            }

            public String toString() {
                return "Ach(achRelationship=" + this.achRelationship + ")";
            }

            public final AchRelationship getAchRelationship() {
                return this.achRelationship;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ach(AchRelationship achRelationship) {
                super(null);
                Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                this.achRelationship = achRelationship;
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource$BuyingPower;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource;", "amount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BuyingPower extends FundingSource {
            public static final int $stable = 8;
            private final Money amount;

            public static /* synthetic */ BuyingPower copy$default(BuyingPower buyingPower, Money money, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = buyingPower.amount;
                }
                return buyingPower.copy(money);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getAmount() {
                return this.amount;
            }

            public final BuyingPower copy(Money amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new BuyingPower(amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BuyingPower) && Intrinsics.areEqual(this.amount, ((BuyingPower) other).amount);
            }

            public int hashCode() {
                return this.amount.hashCode();
            }

            public String toString() {
                return "BuyingPower(amount=" + this.amount + ")";
            }

            public final Money getAmount() {
                return this.amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyingPower(Money amount) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.amount = amount;
            }
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "", "<init>", "()V", "isLoading", "", "()Z", "isEnabled", "Disabled", "Loading", "Complete", "UpdateInvestmentSchedule", "ShowWithdrawalLimitDialog", "ShowMarginLimitDialog", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Complete;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Disabled;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Loading;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$ShowMarginLimitDialog;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$ShowWithdrawalLimitDialog;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$UpdateInvestmentSchedule;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContinueButtonState {
        public static final int $stable = 0;

        public /* synthetic */ ContinueButtonState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContinueButtonState() {
        }

        public final boolean isLoading() {
            if (Intrinsics.areEqual(this, Loading.INSTANCE)) {
                return true;
            }
            if (Intrinsics.areEqual(this, Disabled.INSTANCE) || (this instanceof Complete) || Intrinsics.areEqual(this, UpdateInvestmentSchedule.INSTANCE) || Intrinsics.areEqual(this, ShowWithdrawalLimitDialog.INSTANCE) || Intrinsics.areEqual(this, ShowMarginLimitDialog.INSTANCE)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean isEnabled() {
            if (Intrinsics.areEqual(this, Loading.INSTANCE) || Intrinsics.areEqual(this, Disabled.INSTANCE)) {
                return false;
            }
            if ((this instanceof Complete) || Intrinsics.areEqual(this, UpdateInvestmentSchedule.INSTANCE) || Intrinsics.areEqual(this, ShowWithdrawalLimitDialog.INSTANCE) || Intrinsics.areEqual(this, ShowMarginLimitDialog.INSTANCE)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Disabled;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Disabled extends ContinueButtonState {
            public static final int $stable = 0;
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Loading;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends ContinueButtonState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$Complete;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "getSourceOfFunds", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getAchRelationshipId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Complete extends ContinueButtonState {
            public static final int $stable = 8;
            private final String accountNumber;
            private final UUID achRelationshipId;
            private final InvestmentScheduleAmount.Dollar amount;
            private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;

            public static /* synthetic */ Complete copy$default(Complete complete, InvestmentScheduleAmount.Dollar dollar, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    dollar = complete.amount;
                }
                if ((i & 2) != 0) {
                    sourceOfFunds = complete.sourceOfFunds;
                }
                if ((i & 4) != 0) {
                    uuid = complete.achRelationshipId;
                }
                if ((i & 8) != 0) {
                    str = complete.accountNumber;
                }
                return complete.copy(dollar, sourceOfFunds, uuid, str);
            }

            /* renamed from: component1, reason: from getter */
            public final InvestmentScheduleAmount.Dollar getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
                return this.sourceOfFunds;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getAchRelationshipId() {
                return this.achRelationshipId;
            }

            /* renamed from: component4, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final Complete copy(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber) {
                Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
                return new Complete(amount, sourceOfFunds, achRelationshipId, accountNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.amount, complete.amount) && this.sourceOfFunds == complete.sourceOfFunds && Intrinsics.areEqual(this.achRelationshipId, complete.achRelationshipId) && Intrinsics.areEqual(this.accountNumber, complete.accountNumber);
            }

            public int hashCode() {
                InvestmentScheduleAmount.Dollar dollar = this.amount;
                int iHashCode = (((dollar == null ? 0 : dollar.hashCode()) * 31) + this.sourceOfFunds.hashCode()) * 31;
                UUID uuid = this.achRelationshipId;
                int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
                String str = this.accountNumber;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Complete(amount=" + this.amount + ", sourceOfFunds=" + this.sourceOfFunds + ", achRelationshipId=" + this.achRelationshipId + ", accountNumber=" + this.accountNumber + ")";
            }

            public final InvestmentScheduleAmount.Dollar getAmount() {
                return this.amount;
            }

            public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
                return this.sourceOfFunds;
            }

            public final UUID getAchRelationshipId() {
                return this.achRelationshipId;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Complete(InvestmentScheduleAmount.Dollar dollar, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
                this.amount = dollar;
                this.sourceOfFunds = sourceOfFunds;
                this.achRelationshipId = uuid;
                this.accountNumber = str;
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$UpdateInvestmentSchedule;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class UpdateInvestmentSchedule extends ContinueButtonState {
            public static final int $stable = 0;
            public static final UpdateInvestmentSchedule INSTANCE = new UpdateInvestmentSchedule();

            private UpdateInvestmentSchedule() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$ShowWithdrawalLimitDialog;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowWithdrawalLimitDialog extends ContinueButtonState {
            public static final int $stable = 0;
            public static final ShowWithdrawalLimitDialog INSTANCE = new ShowWithdrawalLimitDialog();

            private ShowWithdrawalLimitDialog() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState$ShowMarginLimitDialog;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowMarginLimitDialog extends ContinueButtonState {
            public static final int $stable = 0;
            public static final ShowMarginLimitDialog INSTANCE = new ShowMarginLimitDialog();

            private ShowMarginLimitDialog() {
                super(null);
            }
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Failure;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Loading;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Success;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class UpdateInvestmentScheduleResult {
        public static final int $stable = 0;

        public /* synthetic */ UpdateInvestmentScheduleResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UpdateInvestmentScheduleResult() {
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Loading;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends UpdateInvestmentScheduleResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Success;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$InvestmentScheduleUpdate;", "showSnackbar", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Z)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getShowSnackbar", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends UpdateInvestmentScheduleResult {
            public static final int $stable = 8;
            private final UiEvent<InvestmentScheduleUpdate> event;
            private final boolean showSnackbar;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, UiEvent uiEvent, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiEvent = success.event;
                }
                if ((i & 2) != 0) {
                    z = success.showSnackbar;
                }
                return success.copy(uiEvent, z);
            }

            public final UiEvent<InvestmentScheduleUpdate> component1() {
                return this.event;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowSnackbar() {
                return this.showSnackbar;
            }

            public final Success copy(UiEvent<InvestmentScheduleUpdate> event, boolean showSnackbar) {
                Intrinsics.checkNotNullParameter(event, "event");
                return new Success(event, showSnackbar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.event, success.event) && this.showSnackbar == success.showSnackbar;
            }

            public int hashCode() {
                return (this.event.hashCode() * 31) + Boolean.hashCode(this.showSnackbar);
            }

            public String toString() {
                return "Success(event=" + this.event + ", showSnackbar=" + this.showSnackbar + ")";
            }

            public /* synthetic */ Success(UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiEvent, (i & 2) != 0 ? false : z);
            }

            public final UiEvent<InvestmentScheduleUpdate> getEvent() {
                return this.event;
            }

            public final boolean getShowSnackbar() {
                return this.showSnackbar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UiEvent<InvestmentScheduleUpdate> event, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
                this.showSnackbar = z;
            }
        }

        /* compiled from: RecurringOrderSourceOfFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult$Failure;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends UpdateInvestmentScheduleResult {
            public static final int $stable = 8;
            private final UiEvent<Throwable> event;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Failure copy$default(Failure failure, UiEvent uiEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiEvent = failure.event;
                }
                return failure.copy(uiEvent);
            }

            public final UiEvent<Throwable> component1() {
                return this.event;
            }

            public final Failure copy(UiEvent<Throwable> event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return new Failure(event);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.event, ((Failure) other).event);
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return "Failure(event=" + this.event + ")";
            }

            public final UiEvent<Throwable> getEvent() {
                return this.event;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(UiEvent<Throwable> event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }
        }
    }
}
