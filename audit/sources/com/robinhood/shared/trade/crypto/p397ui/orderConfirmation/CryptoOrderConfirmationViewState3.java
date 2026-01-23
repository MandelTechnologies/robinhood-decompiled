package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.CryptoConfirmationState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "", "<init>", "()V", "isFullScreen", "", "()Z", "Receipt", "AggressiveRecurringUpsell", "FeeTierStatus", "FeeTierUpgraded", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$AggressiveRecurringUpsell;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierStatus;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierUpgraded;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoOrderConfirmationViewState3 {
    public static final int $stable = 0;
    private final boolean isFullScreen;

    public /* synthetic */ CryptoOrderConfirmationViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderConfirmationViewState3() {
    }

    /* renamed from: isFullScreen, reason: from getter */
    public boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    /* compiled from: CryptoOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "confirmationState", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;", "showPassiveRecurringUpsell", "", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "cryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "primaryButtonAction", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;", "primaryButtonLoading", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;ZLcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;Z)V", "getConfirmationState", "()Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;", "getShowPassiveRecurringUpsell", "()Z", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getPrimaryButtonAction", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;", "getPrimaryButtonLoading", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "PrimaryButtonAction", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent$Receipt, reason: from toString */
    public static final /* data */ class Receipt extends CryptoOrderConfirmationViewState3 {
        public static final int $stable = 8;
        private final CryptoConfirmationState confirmationState;
        private final CryptoOrderContext cryptoOrderContext;
        private final PrimaryButtonAction primaryButtonAction;
        private final boolean primaryButtonLoading;
        private final boolean showPassiveRecurringUpsell;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ Receipt copy$default(Receipt receipt, CryptoConfirmationState cryptoConfirmationState, boolean z, UiCryptoOrder uiCryptoOrder, CryptoOrderContext cryptoOrderContext, PrimaryButtonAction primaryButtonAction, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoConfirmationState = receipt.confirmationState;
            }
            if ((i & 2) != 0) {
                z = receipt.showPassiveRecurringUpsell;
            }
            if ((i & 4) != 0) {
                uiCryptoOrder = receipt.uiCryptoOrder;
            }
            if ((i & 8) != 0) {
                cryptoOrderContext = receipt.cryptoOrderContext;
            }
            if ((i & 16) != 0) {
                primaryButtonAction = receipt.primaryButtonAction;
            }
            if ((i & 32) != 0) {
                z2 = receipt.primaryButtonLoading;
            }
            PrimaryButtonAction primaryButtonAction2 = primaryButtonAction;
            boolean z3 = z2;
            return receipt.copy(cryptoConfirmationState, z, uiCryptoOrder, cryptoOrderContext, primaryButtonAction2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoConfirmationState getConfirmationState() {
            return this.confirmationState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowPassiveRecurringUpsell() {
            return this.showPassiveRecurringUpsell;
        }

        /* renamed from: component3, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* renamed from: component5, reason: from getter */
        public final PrimaryButtonAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getPrimaryButtonLoading() {
            return this.primaryButtonLoading;
        }

        public final Receipt copy(CryptoConfirmationState confirmationState, boolean showPassiveRecurringUpsell, UiCryptoOrder uiCryptoOrder, CryptoOrderContext cryptoOrderContext, PrimaryButtonAction primaryButtonAction, boolean primaryButtonLoading) {
            Intrinsics.checkNotNullParameter(confirmationState, "confirmationState");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            return new Receipt(confirmationState, showPassiveRecurringUpsell, uiCryptoOrder, cryptoOrderContext, primaryButtonAction, primaryButtonLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Receipt)) {
                return false;
            }
            Receipt receipt = (Receipt) other;
            return Intrinsics.areEqual(this.confirmationState, receipt.confirmationState) && this.showPassiveRecurringUpsell == receipt.showPassiveRecurringUpsell && Intrinsics.areEqual(this.uiCryptoOrder, receipt.uiCryptoOrder) && Intrinsics.areEqual(this.cryptoOrderContext, receipt.cryptoOrderContext) && this.primaryButtonAction == receipt.primaryButtonAction && this.primaryButtonLoading == receipt.primaryButtonLoading;
        }

        public int hashCode() {
            int iHashCode = ((this.confirmationState.hashCode() * 31) + Boolean.hashCode(this.showPassiveRecurringUpsell)) * 31;
            UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
            int iHashCode2 = (iHashCode + (uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode())) * 31;
            CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
            return ((((iHashCode2 + (cryptoOrderContext != null ? cryptoOrderContext.hashCode() : 0)) * 31) + this.primaryButtonAction.hashCode()) * 31) + Boolean.hashCode(this.primaryButtonLoading);
        }

        public String toString() {
            return "Receipt(confirmationState=" + this.confirmationState + ", showPassiveRecurringUpsell=" + this.showPassiveRecurringUpsell + ", uiCryptoOrder=" + this.uiCryptoOrder + ", cryptoOrderContext=" + this.cryptoOrderContext + ", primaryButtonAction=" + this.primaryButtonAction + ", primaryButtonLoading=" + this.primaryButtonLoading + ")";
        }

        public final CryptoConfirmationState getConfirmationState() {
            return this.confirmationState;
        }

        public final boolean getShowPassiveRecurringUpsell() {
            return this.showPassiveRecurringUpsell;
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final PrimaryButtonAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        public final boolean getPrimaryButtonLoading() {
            return this.primaryButtonLoading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Receipt(CryptoConfirmationState confirmationState, boolean z, UiCryptoOrder uiCryptoOrder, CryptoOrderContext cryptoOrderContext, PrimaryButtonAction primaryButtonAction, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(confirmationState, "confirmationState");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            this.confirmationState = confirmationState;
            this.showPassiveRecurringUpsell = z;
            this.uiCryptoOrder = uiCryptoOrder;
            this.cryptoOrderContext = cryptoOrderContext;
            this.primaryButtonAction = primaryButtonAction;
            this.primaryButtonLoading = z2;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoOrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "DONE", "CONTINUE_TO_FEE_TIER_STATUS", "CONTINUE_TO_FEE_TIER_UPGRADED", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent$Receipt$PrimaryButtonAction */
        public static final class PrimaryButtonAction {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PrimaryButtonAction[] $VALUES;
            public static final PrimaryButtonAction DONE = new PrimaryButtonAction("DONE", 0);
            public static final PrimaryButtonAction CONTINUE_TO_FEE_TIER_STATUS = new PrimaryButtonAction("CONTINUE_TO_FEE_TIER_STATUS", 1);
            public static final PrimaryButtonAction CONTINUE_TO_FEE_TIER_UPGRADED = new PrimaryButtonAction("CONTINUE_TO_FEE_TIER_UPGRADED", 2);

            private static final /* synthetic */ PrimaryButtonAction[] $values() {
                return new PrimaryButtonAction[]{DONE, CONTINUE_TO_FEE_TIER_STATUS, CONTINUE_TO_FEE_TIER_UPGRADED};
            }

            public static EnumEntries<PrimaryButtonAction> getEntries() {
                return $ENTRIES;
            }

            private PrimaryButtonAction(String str, int i) {
            }

            static {
                PrimaryButtonAction[] primaryButtonActionArr$values = $values();
                $VALUES = primaryButtonActionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(primaryButtonActionArr$values);
            }

            public static PrimaryButtonAction valueOf(String str) {
                return (PrimaryButtonAction) Enum.valueOf(PrimaryButtonAction.class, str);
            }

            public static PrimaryButtonAction[] values() {
                return (PrimaryButtonAction[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CryptoOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$AggressiveRecurringUpsell;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent$AggressiveRecurringUpsell, reason: from toString */
    public static final /* data */ class AggressiveRecurringUpsell extends CryptoOrderConfirmationViewState3 {
        public static final int $stable = 8;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ AggressiveRecurringUpsell copy$default(AggressiveRecurringUpsell aggressiveRecurringUpsell, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = aggressiveRecurringUpsell.uiCryptoOrder;
            }
            return aggressiveRecurringUpsell.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final AggressiveRecurringUpsell copy(UiCryptoOrder uiCryptoOrder) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new AggressiveRecurringUpsell(uiCryptoOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AggressiveRecurringUpsell) && Intrinsics.areEqual(this.uiCryptoOrder, ((AggressiveRecurringUpsell) other).uiCryptoOrder);
        }

        public int hashCode() {
            return this.uiCryptoOrder.hashCode();
        }

        public String toString() {
            return "AggressiveRecurringUpsell(uiCryptoOrder=" + this.uiCryptoOrder + ")";
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AggressiveRecurringUpsell(UiCryptoOrder uiCryptoOrder) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
        }
    }

    /* compiled from: CryptoOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierStatus;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getCanSkipNotificationPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierStatus;", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent$FeeTierStatus, reason: from toString */
    public static final /* data */ class FeeTierStatus extends CryptoOrderConfirmationViewState3 {
        public static final int $stable = 8;
        private final Boolean canSkipNotificationPrompt;
        private final CryptoFeeTierInfo feeTierInfo;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ FeeTierStatus copy$default(FeeTierStatus feeTierStatus, UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = feeTierStatus.uiCryptoOrder;
            }
            if ((i & 2) != 0) {
                cryptoFeeTierInfo = feeTierStatus.feeTierInfo;
            }
            if ((i & 4) != 0) {
                bool = feeTierStatus.canSkipNotificationPrompt;
            }
            return feeTierStatus.copy(uiCryptoOrder, cryptoFeeTierInfo, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        public final FeeTierStatus copy(UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo feeTierInfo, Boolean canSkipNotificationPrompt) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new FeeTierStatus(uiCryptoOrder, feeTierInfo, canSkipNotificationPrompt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeeTierStatus)) {
                return false;
            }
            FeeTierStatus feeTierStatus = (FeeTierStatus) other;
            return Intrinsics.areEqual(this.uiCryptoOrder, feeTierStatus.uiCryptoOrder) && Intrinsics.areEqual(this.feeTierInfo, feeTierStatus.feeTierInfo) && Intrinsics.areEqual(this.canSkipNotificationPrompt, feeTierStatus.canSkipNotificationPrompt);
        }

        public int hashCode() {
            int iHashCode = this.uiCryptoOrder.hashCode() * 31;
            CryptoFeeTierInfo cryptoFeeTierInfo = this.feeTierInfo;
            int iHashCode2 = (iHashCode + (cryptoFeeTierInfo == null ? 0 : cryptoFeeTierInfo.hashCode())) * 31;
            Boolean bool = this.canSkipNotificationPrompt;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "FeeTierStatus(uiCryptoOrder=" + this.uiCryptoOrder + ", feeTierInfo=" + this.feeTierInfo + ", canSkipNotificationPrompt=" + this.canSkipNotificationPrompt + ")";
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeeTierStatus(UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
            this.feeTierInfo = cryptoFeeTierInfo;
            this.canSkipNotificationPrompt = bool;
        }
    }

    /* compiled from: CryptoOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierUpgraded;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getCanSkipNotificationPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isFullScreen", "()Z", "component1", "component2", "component3", "copy", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$FeeTierUpgraded;", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoConfirmationContent$FeeTierUpgraded, reason: from toString */
    public static final /* data */ class FeeTierUpgraded extends CryptoOrderConfirmationViewState3 {
        public static final int $stable = 8;
        private final Boolean canSkipNotificationPrompt;
        private final CryptoFeeTierInfo feeTierInfo;
        private final boolean isFullScreen;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ FeeTierUpgraded copy$default(FeeTierUpgraded feeTierUpgraded, UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = feeTierUpgraded.uiCryptoOrder;
            }
            if ((i & 2) != 0) {
                cryptoFeeTierInfo = feeTierUpgraded.feeTierInfo;
            }
            if ((i & 4) != 0) {
                bool = feeTierUpgraded.canSkipNotificationPrompt;
            }
            return feeTierUpgraded.copy(uiCryptoOrder, cryptoFeeTierInfo, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        public final FeeTierUpgraded copy(UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo feeTierInfo, Boolean canSkipNotificationPrompt) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new FeeTierUpgraded(uiCryptoOrder, feeTierInfo, canSkipNotificationPrompt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeeTierUpgraded)) {
                return false;
            }
            FeeTierUpgraded feeTierUpgraded = (FeeTierUpgraded) other;
            return Intrinsics.areEqual(this.uiCryptoOrder, feeTierUpgraded.uiCryptoOrder) && Intrinsics.areEqual(this.feeTierInfo, feeTierUpgraded.feeTierInfo) && Intrinsics.areEqual(this.canSkipNotificationPrompt, feeTierUpgraded.canSkipNotificationPrompt);
        }

        public int hashCode() {
            int iHashCode = this.uiCryptoOrder.hashCode() * 31;
            CryptoFeeTierInfo cryptoFeeTierInfo = this.feeTierInfo;
            int iHashCode2 = (iHashCode + (cryptoFeeTierInfo == null ? 0 : cryptoFeeTierInfo.hashCode())) * 31;
            Boolean bool = this.canSkipNotificationPrompt;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "FeeTierUpgraded(uiCryptoOrder=" + this.uiCryptoOrder + ", feeTierInfo=" + this.feeTierInfo + ", canSkipNotificationPrompt=" + this.canSkipNotificationPrompt + ")";
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeeTierUpgraded(UiCryptoOrder uiCryptoOrder, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
            this.feeTierInfo = cryptoFeeTierInfo;
            this.canSkipNotificationPrompt = bool;
            this.isFullScreen = true;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationViewState3
        /* renamed from: isFullScreen, reason: from getter */
        public boolean getIsFullScreen() {
            return this.isFullScreen;
        }
    }
}
