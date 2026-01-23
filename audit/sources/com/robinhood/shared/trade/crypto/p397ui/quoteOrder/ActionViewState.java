package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActionViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "", "isReviewVisible", "", "isSellAllVisible", "isQuickTradeVisible", "isButtonEnabled", "Empty", "Review", "Continue", "Submit", "SwipeToSubmit", "SellAll", "BuyMax", "QuickTrades", "QuickTrade", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$BuyMax;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Continue;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Empty;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Review;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$SellAll;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Submit;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$SwipeToSubmit;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ActionViewState {

    /* compiled from: ActionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean isButtonEnabled(ActionViewState actionViewState) {
            return true;
        }

        public static boolean isQuickTradeVisible(ActionViewState actionViewState) {
            return false;
        }

        public static boolean isReviewVisible(ActionViewState actionViewState) {
            return false;
        }

        public static boolean isSellAllVisible(ActionViewState actionViewState) {
            return false;
        }
    }

    boolean isButtonEnabled();

    boolean isQuickTradeVisible();

    boolean isReviewVisible();

    boolean isSellAllVisible();

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Empty;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements ActionViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 349404932;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return DefaultImpls.isButtonEnabled(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return DefaultImpls.isReviewVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Review;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "isEnabled", "", "<init>", "(Z)V", "()Z", "isReviewVisible", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "analyticsIdentifier", "", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Review implements ActionViewState {
        public static final int $stable = 0;
        private final String analyticsIdentifier = "review";
        private final boolean isEnabled;

        public static /* synthetic */ Review copy$default(Review review, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = review.isEnabled;
            }
            return review.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final Review copy(boolean isEnabled) {
            return new Review(isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Review) && this.isEnabled == ((Review) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return true;
        }

        public String toString() {
            return "Review(isEnabled=" + this.isEnabled + ")";
        }

        public Review(boolean z) {
            this.isEnabled = z;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return DefaultImpls.isButtonEnabled(this);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        public final StringResource getButtonText() {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Continue;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "isRecurring", "", "isContinueButtonEnabled", "<init>", "(ZZ)V", "()Z", "isReviewVisible", "isButtonEnabled", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "analyticsIdentifier", "", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Continue implements ActionViewState {
        public static final int $stable = 0;
        private final String analyticsIdentifier;
        private final boolean isContinueButtonEnabled;
        private final boolean isRecurring;

        public static /* synthetic */ Continue copy$default(Continue r0, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.isRecurring;
            }
            if ((i & 2) != 0) {
                z2 = r0.isContinueButtonEnabled;
            }
            return r0.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecurring() {
            return this.isRecurring;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final Continue copy(boolean isRecurring, boolean isContinueButtonEnabled) {
            return new Continue(isRecurring, isContinueButtonEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Continue)) {
                return false;
            }
            Continue r5 = (Continue) other;
            return this.isRecurring == r5.isRecurring && this.isContinueButtonEnabled == r5.isContinueButtonEnabled;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isRecurring) * 31) + Boolean.hashCode(this.isContinueButtonEnabled);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return true;
        }

        public String toString() {
            return "Continue(isRecurring=" + this.isRecurring + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ")";
        }

        public Continue(boolean z, boolean z2) {
            this.isRecurring = z;
            this.isContinueButtonEnabled = z2;
            this.analyticsIdentifier = "continue";
        }

        public /* synthetic */ Continue(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? true : z2);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        public final boolean isRecurring() {
            return this.isRecurring;
        }

        public final boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final StringResource getButtonText() {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$Submit;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "isEnabled", "", "<init>", "(Z)V", "()Z", "isReviewVisible", "isButtonEnabled", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "analyticsIdentifier", "", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submit implements ActionViewState {
        public static final int $stable = 0;
        private final String analyticsIdentifier = "submit";
        private final boolean isEnabled;

        public static /* synthetic */ Submit copy$default(Submit submit, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = submit.isEnabled;
            }
            return submit.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final Submit copy(boolean isEnabled) {
            return new Submit(isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Submit) && this.isEnabled == ((Submit) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return true;
        }

        public String toString() {
            return "Submit(isEnabled=" + this.isEnabled + ")";
        }

        public Submit(boolean z) {
            this.isEnabled = z;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return this.isEnabled;
        }

        public final StringResource getButtonText() {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_submit, new Object[0]);
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$SwipeToSubmit;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "isEnabled", "", "<init>", "(Z)V", "()Z", "isReviewVisible", "isButtonEnabled", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "analyticsIdentifier", "", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SwipeToSubmit implements ActionViewState {
        public static final int $stable = 0;
        private final String analyticsIdentifier = "swipe-to-submit";
        private final boolean isEnabled;

        public static /* synthetic */ SwipeToSubmit copy$default(SwipeToSubmit swipeToSubmit, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = swipeToSubmit.isEnabled;
            }
            return swipeToSubmit.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final SwipeToSubmit copy(boolean isEnabled) {
            return new SwipeToSubmit(isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SwipeToSubmit) && this.isEnabled == ((SwipeToSubmit) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return true;
        }

        public String toString() {
            return "SwipeToSubmit(isEnabled=" + this.isEnabled + ")";
        }

        public SwipeToSubmit(boolean z) {
            this.isEnabled = z;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return this.isEnabled;
        }

        public final StringResource getButtonText() {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_quick_trade_swipe_to_submit, new Object[0]);
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$SellAll;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "<init>", "()V", "isSellAllVisible", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "equals", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SellAll implements ActionViewState {
        public static final int $stable = 0;
        public static final SellAll INSTANCE = new SellAll();
        public static final int index = 1;

        public boolean equals(Object other) {
            return this == other || (other instanceof SellAll);
        }

        public int hashCode() {
            return 77824230;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return true;
        }

        public String toString() {
            return "SellAll";
        }

        private SellAll() {
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return DefaultImpls.isButtonEnabled(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return DefaultImpls.isReviewVisible(this);
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$BuyMax;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "<init>", "()V", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "equals", "", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BuyMax implements ActionViewState {
        public static final int $stable = 0;
        public static final BuyMax INSTANCE = new BuyMax();
        public static final int index = 1;

        public boolean equals(Object other) {
            return this == other || (other instanceof BuyMax);
        }

        public int hashCode() {
            return -2131618265;
        }

        public String toString() {
            return "BuyMax";
        }

        private BuyMax() {
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return DefaultImpls.isButtonEnabled(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return DefaultImpls.isQuickTradeVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return DefaultImpls.isReviewVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        public final StringResource getButtonText() {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_quick_trade_buy_max_button, new Object[0]);
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\u0006H\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "quickTrades", "", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", "isRoundedRectangleShape", "", "<init>", "(Ljava/util/List;Z)V", "getQuickTrades", "()Ljava/util/List;", "()Z", "isQuickTradeVisible", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuickTrades implements ActionViewState {
        public static final int $stable = 8;
        private final boolean isRoundedRectangleShape;
        private final List<QuickTrade> quickTrades;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickTrades copy$default(QuickTrades quickTrades, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = quickTrades.quickTrades;
            }
            if ((i & 2) != 0) {
                z = quickTrades.isRoundedRectangleShape;
            }
            return quickTrades.copy(list, z);
        }

        public final List<QuickTrade> component1() {
            return this.quickTrades;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRoundedRectangleShape() {
            return this.isRoundedRectangleShape;
        }

        public final QuickTrades copy(List<? extends QuickTrade> quickTrades, boolean isRoundedRectangleShape) {
            Intrinsics.checkNotNullParameter(quickTrades, "quickTrades");
            return new QuickTrades(quickTrades, isRoundedRectangleShape);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickTrades)) {
                return false;
            }
            QuickTrades quickTrades = (QuickTrades) other;
            return Intrinsics.areEqual(this.quickTrades, quickTrades.quickTrades) && this.isRoundedRectangleShape == quickTrades.isRoundedRectangleShape;
        }

        public int hashCode() {
            return (this.quickTrades.hashCode() * 31) + Boolean.hashCode(this.isRoundedRectangleShape);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isQuickTradeVisible() {
            return true;
        }

        public String toString() {
            return "QuickTrades(quickTrades=" + this.quickTrades + ", isRoundedRectangleShape=" + this.isRoundedRectangleShape + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QuickTrades(List<? extends QuickTrade> quickTrades, boolean z) {
            Intrinsics.checkNotNullParameter(quickTrades, "quickTrades");
            this.quickTrades = quickTrades;
            this.isRoundedRectangleShape = z;
        }

        public /* synthetic */ QuickTrades(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isButtonEnabled() {
            return DefaultImpls.isButtonEnabled(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isReviewVisible() {
            return DefaultImpls.isReviewVisible(this);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState
        public boolean isSellAllVisible() {
            return DefaultImpls.isSellAllVisible(this);
        }

        public final List<QuickTrade> getQuickTrades() {
            return this.quickTrades;
        }

        public final boolean isRoundedRectangleShape() {
            return this.isRoundedRectangleShape;
        }
    }

    /* compiled from: ActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000b2\u00020\u0001:\u0004\b\t\n\u000bJ\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getIndex", "()I", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "AmountQuote", "SellAll", "BuyMax", "Companion", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$AmountQuote;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$BuyMax;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$SellAll;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface QuickTrade {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        StringResource getButtonText();

        int getIndex();

        /* compiled from: ActionViewState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$AmountQuote;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "inputAmount", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "formattedInputAmount", "Lcom/robinhood/utils/resource/StringResource;", "isRecurringOrder", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;Lcom/robinhood/utils/resource/StringResource;ZI)V", "getInputAmount", "()Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "getFormattedInputAmount", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getIndex", "()I", "getButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AmountQuote implements QuickTrade {
            public static final int $stable = 8;
            private final Currency currency;
            private final StringResource formattedInputAmount;
            private final int index;
            private final InputAmount inputAmount;
            private final boolean isRecurringOrder;

            /* renamed from: component1, reason: from getter */
            private final Currency getCurrency() {
                return this.currency;
            }

            public static /* synthetic */ AmountQuote copy$default(AmountQuote amountQuote, Currency currency, InputAmount inputAmount, StringResource stringResource, boolean z, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    currency = amountQuote.currency;
                }
                if ((i2 & 2) != 0) {
                    inputAmount = amountQuote.inputAmount;
                }
                if ((i2 & 4) != 0) {
                    stringResource = amountQuote.formattedInputAmount;
                }
                if ((i2 & 8) != 0) {
                    z = amountQuote.isRecurringOrder;
                }
                if ((i2 & 16) != 0) {
                    i = amountQuote.index;
                }
                int i3 = i;
                StringResource stringResource2 = stringResource;
                return amountQuote.copy(currency, inputAmount, stringResource2, z, i3);
            }

            /* renamed from: component2, reason: from getter */
            public final InputAmount getInputAmount() {
                return this.inputAmount;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getFormattedInputAmount() {
                return this.formattedInputAmount;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsRecurringOrder() {
                return this.isRecurringOrder;
            }

            /* renamed from: component5, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final AmountQuote copy(Currency currency, InputAmount inputAmount, StringResource formattedInputAmount, boolean isRecurringOrder, int index) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
                return new AmountQuote(currency, inputAmount, formattedInputAmount, isRecurringOrder, index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AmountQuote)) {
                    return false;
                }
                AmountQuote amountQuote = (AmountQuote) other;
                return Intrinsics.areEqual(this.currency, amountQuote.currency) && Intrinsics.areEqual(this.inputAmount, amountQuote.inputAmount) && Intrinsics.areEqual(this.formattedInputAmount, amountQuote.formattedInputAmount) && this.isRecurringOrder == amountQuote.isRecurringOrder && this.index == amountQuote.index;
            }

            public int hashCode() {
                int iHashCode = ((this.currency.hashCode() * 31) + this.inputAmount.hashCode()) * 31;
                StringResource stringResource = this.formattedInputAmount;
                return ((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isRecurringOrder)) * 31) + Integer.hashCode(this.index);
            }

            public String toString() {
                return "AmountQuote(currency=" + this.currency + ", inputAmount=" + this.inputAmount + ", formattedInputAmount=" + this.formattedInputAmount + ", isRecurringOrder=" + this.isRecurringOrder + ", index=" + this.index + ")";
            }

            public AmountQuote(Currency currency, InputAmount inputAmount, StringResource stringResource, boolean z, int i) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
                this.currency = currency;
                this.inputAmount = inputAmount;
                this.formattedInputAmount = stringResource;
                this.isRecurringOrder = z;
                this.index = i;
            }

            public /* synthetic */ AmountQuote(Currency currency, InputAmount inputAmount, StringResource stringResource, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(currency, inputAmount, (i2 & 4) != 0 ? null : stringResource, z, i);
            }

            public final InputAmount getInputAmount() {
                return this.inputAmount;
            }

            public final StringResource getFormattedInputAmount() {
                return this.formattedInputAmount;
            }

            public final boolean isRecurringOrder() {
                return this.isRecurringOrder;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public int getIndex() {
                return this.index;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public StringResource getButtonText() {
                StringResource stringResource = this.formattedInputAmount;
                if (stringResource != null) {
                    return stringResource;
                }
                StringResource.Companion companion = StringResource.INSTANCE;
                InputAmount inputAmount = this.inputAmount;
                return companion.invoke(inputAmount.format(CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, this.currency, inputAmount.getAmount(), false, false, 0, 0, false, false, null, null, false, null, false, false, false, false, 65532, null)));
            }
        }

        /* compiled from: ActionViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$SellAll;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(I)V", "getIndex", "()I", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SellAll implements QuickTrade {
            public static final int $stable = 0;
            private final int index;

            public static /* synthetic */ SellAll copy$default(SellAll sellAll, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = sellAll.index;
                }
                return sellAll.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final SellAll copy(int index) {
                return new SellAll(index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SellAll) && this.index == ((SellAll) other).index;
            }

            public int hashCode() {
                return Integer.hashCode(this.index);
            }

            public String toString() {
                return "SellAll(index=" + this.index + ")";
            }

            public SellAll(int i) {
                this.index = i;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public int getIndex() {
                return this.index;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public StringResource getButtonText() {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_quote_order_sell_all, new Object[0]);
            }
        }

        /* compiled from: ActionViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$BuyMax;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(I)V", "getIndex", "()I", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BuyMax implements QuickTrade {
            public static final int $stable = 0;
            private final int index;

            public static /* synthetic */ BuyMax copy$default(BuyMax buyMax, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = buyMax.index;
                }
                return buyMax.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final BuyMax copy(int index) {
                return new BuyMax(index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BuyMax) && this.index == ((BuyMax) other).index;
            }

            public int hashCode() {
                return Integer.hashCode(this.index);
            }

            public String toString() {
                return "BuyMax(index=" + this.index + ")";
            }

            public BuyMax(int i) {
                this.index = i;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public int getIndex() {
                return this.index;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrade
            public StringResource getButtonText() {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_quick_trade_buy_max_button_short, new Object[0]);
            }
        }

        /* compiled from: ActionViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$Companion;", "", "<init>", "()V", "getSellFractionQuickTrade", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$AmountQuote;", "context", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "fraction", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* compiled from: ActionViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoInputMode.values().length];
                    try {
                        iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public final AmountQuote getSellFractionQuickTrade(CryptoOrderContext context, CryptoInputMode inputMode, int fraction, int index) {
                Currency quoteCurrencyForCost;
                BigDecimal bigDecimalSafeDivide$default;
                BigDecimal bigDecimalMultiply;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                int i = WhenMappings.$EnumSwitchMapping$0[inputMode.ordinal()];
                if (i == 1) {
                    quoteCurrencyForCost = context.getRequestContext().getCurrencyPair().getQuoteCurrencyForCost();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quoteCurrencyForCost = context.getRequestContext().getCurrencyPair().getAssetCurrencyForCost();
                }
                Currency currency = quoteCurrencyForCost;
                UiCryptoHolding holding = context.getRequestContext().getHolding();
                BigDecimal quantityAvailable = holding != null ? holding.getQuantityAvailable() : null;
                BigDecimal decimalValue = context.getRequestContext().getQuote().getAskPrice().getDecimalValue();
                if (quantityAvailable == null || (bigDecimalMultiply = quantityAvailable.multiply(decimalValue)) == null || (bigDecimalSafeDivide$default = BigDecimals7.safeDivide$default(bigDecimalMultiply, new BigDecimal(fraction), 0, null, 4, null)) == null) {
                    bigDecimalSafeDivide$default = BigDecimal.ZERO;
                }
                InputAmount.Companion companion = InputAmount.INSTANCE;
                Intrinsics.checkNotNull(bigDecimalSafeDivide$default);
                return new AmountQuote(currency, companion.fromAmount(bigDecimalSafeDivide$default), null, false, index, 4, null);
            }
        }
    }
}
