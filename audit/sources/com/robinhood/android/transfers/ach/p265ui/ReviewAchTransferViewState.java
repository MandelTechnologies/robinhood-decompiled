package com.robinhood.android.transfers.ach.p265ui;

import android.content.res.Resources;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAchTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u001d\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fHÂ\u0003Jy\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fHÆ\u0001J\u0013\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R%\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;", "", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "createEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "hasShownPdtWarningEvent", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getPortfolio", "()Lcom/robinhood/models/db/Portfolio;", "getCreateEvent", "()Lcom/robinhood/udf/UiEvent;", "shouldShowPdtWarning", "", "getBankLabelText", "", "res", "Landroid/content/res/Resources;", "getDisclaimerText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReviewAchTransferViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final BigDecimal amount;
    private final UnifiedBalances balances;
    private final UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> createEvent;
    private final ApiAutomaticDeposit.Frequency frequency;
    private final UiEvent<Unit> hasShownPdtWarningEvent;
    private final Portfolio portfolio;
    private final TransferContext transferContext;

    private final UiEvent<Unit> component8() {
        return this.hasShownPdtWarningEvent;
    }

    public static /* synthetic */ ReviewAchTransferViewState copy$default(ReviewAchTransferViewState reviewAchTransferViewState, BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, TransferContext transferContext, AchRelationship achRelationship, UnifiedBalances unifiedBalances, Portfolio portfolio, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = reviewAchTransferViewState.amount;
        }
        if ((i & 2) != 0) {
            frequency = reviewAchTransferViewState.frequency;
        }
        if ((i & 4) != 0) {
            transferContext = reviewAchTransferViewState.transferContext;
        }
        if ((i & 8) != 0) {
            achRelationship = reviewAchTransferViewState.achRelationship;
        }
        if ((i & 16) != 0) {
            unifiedBalances = reviewAchTransferViewState.balances;
        }
        if ((i & 32) != 0) {
            portfolio = reviewAchTransferViewState.portfolio;
        }
        if ((i & 64) != 0) {
            uiEvent = reviewAchTransferViewState.createEvent;
        }
        if ((i & 128) != 0) {
            uiEvent2 = reviewAchTransferViewState.hasShownPdtWarningEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        UnifiedBalances unifiedBalances2 = unifiedBalances;
        Portfolio portfolio2 = portfolio;
        return reviewAchTransferViewState.copy(bigDecimal, frequency, transferContext, achRelationship, unifiedBalances2, portfolio2, uiEvent3, uiEvent4);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferContext getTransferContext() {
        return this.transferContext;
    }

    /* renamed from: component4, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component5, reason: from getter */
    public final UnifiedBalances getBalances() {
        return this.balances;
    }

    /* renamed from: component6, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> component7() {
        return this.createEvent;
    }

    public final ReviewAchTransferViewState copy(BigDecimal amount, ApiAutomaticDeposit.Frequency frequency, TransferContext transferContext, AchRelationship achRelationship, UnifiedBalances balances, Portfolio portfolio, UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> createEvent, UiEvent<Unit> hasShownPdtWarningEvent) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(hasShownPdtWarningEvent, "hasShownPdtWarningEvent");
        return new ReviewAchTransferViewState(amount, frequency, transferContext, achRelationship, balances, portfolio, createEvent, hasShownPdtWarningEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewAchTransferViewState)) {
            return false;
        }
        ReviewAchTransferViewState reviewAchTransferViewState = (ReviewAchTransferViewState) other;
        return Intrinsics.areEqual(this.amount, reviewAchTransferViewState.amount) && this.frequency == reviewAchTransferViewState.frequency && Intrinsics.areEqual(this.transferContext, reviewAchTransferViewState.transferContext) && Intrinsics.areEqual(this.achRelationship, reviewAchTransferViewState.achRelationship) && Intrinsics.areEqual(this.balances, reviewAchTransferViewState.balances) && Intrinsics.areEqual(this.portfolio, reviewAchTransferViewState.portfolio) && Intrinsics.areEqual(this.createEvent, reviewAchTransferViewState.createEvent) && Intrinsics.areEqual(this.hasShownPdtWarningEvent, reviewAchTransferViewState.hasShownPdtWarningEvent);
    }

    public int hashCode() {
        int iHashCode = ((((this.amount.hashCode() * 31) + this.frequency.hashCode()) * 31) + this.transferContext.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        UnifiedBalances unifiedBalances = this.balances;
        int iHashCode3 = (iHashCode2 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        Portfolio portfolio = this.portfolio;
        int iHashCode4 = (iHashCode3 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
        UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> uiEvent = this.createEvent;
        return ((iHashCode4 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + this.hasShownPdtWarningEvent.hashCode();
    }

    public String toString() {
        return "ReviewAchTransferViewState(amount=" + this.amount + ", frequency=" + this.frequency + ", transferContext=" + this.transferContext + ", achRelationship=" + this.achRelationship + ", balances=" + this.balances + ", portfolio=" + this.portfolio + ", createEvent=" + this.createEvent + ", hasShownPdtWarningEvent=" + this.hasShownPdtWarningEvent + ")";
    }

    public ReviewAchTransferViewState(BigDecimal amount, ApiAutomaticDeposit.Frequency frequency, TransferContext transferContext, AchRelationship achRelationship, UnifiedBalances unifiedBalances, Portfolio portfolio, UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> uiEvent, UiEvent<Unit> hasShownPdtWarningEvent) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(hasShownPdtWarningEvent, "hasShownPdtWarningEvent");
        this.amount = amount;
        this.frequency = frequency;
        this.transferContext = transferContext;
        this.achRelationship = achRelationship;
        this.balances = unifiedBalances;
        this.portfolio = portfolio;
        this.createEvent = uiEvent;
        this.hasShownPdtWarningEvent = hasShownPdtWarningEvent;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    public final TransferContext getTransferContext() {
        return this.transferContext;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final UnifiedBalances getBalances() {
        return this.balances;
    }

    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> getCreateEvent() {
        return this.createEvent;
    }

    public /* synthetic */ ReviewAchTransferViewState(BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, TransferContext transferContext, AchRelationship achRelationship, UnifiedBalances unifiedBalances, Portfolio portfolio, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, frequency, transferContext, (i & 8) != 0 ? null : achRelationship, (i & 16) != 0 ? null : unifiedBalances, (i & 32) != 0 ? null : portfolio, (i & 64) != 0 ? null : uiEvent, (i & 128) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent2);
    }

    public final boolean shouldShowPdtWarning() {
        UnifiedBalances unifiedBalances;
        if (this.transferContext.getDirection() != TransferDirection.WITHDRAW || (unifiedBalances = this.balances) == null || this.portfolio == null || !unifiedBalances.getBrokerageBalances().isPatternDayTrader()) {
            return false;
        }
        BigDecimal bigDecimalSubtract = this.portfolio.getEquity().subtract(this.amount);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract.compareTo(Portfolio.MINIMUM_BALANCE_FOR_PDT_EXEMPTION) < 0 && this.hasShownPdtWarningEvent.consume() != null;
    }

    public final String getBankLabelText(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null) {
            return AchTransferStringHelper.getReviewTransferBankHeader(res, this.transferContext.getDirection(), achRelationship);
        }
        return null;
    }

    public final String getDisclaimerText(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        UnifiedBalances unifiedBalances = this.balances;
        if (unifiedBalances == null) {
            return null;
        }
        TransferContext transferContext = this.transferContext;
        return AchTransferStringHelper.getReviewTransferSummary(res, transferContext, unifiedBalances, transferContext.getDirection(), this.frequency, this.amount, this.transferContext.getIsFromOnboardingRadExp());
    }
}
