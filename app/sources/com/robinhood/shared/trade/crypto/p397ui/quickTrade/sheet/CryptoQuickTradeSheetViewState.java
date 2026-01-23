package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoQuickTradeSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003JW\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;", "", "inputStageHeader", "Lcom/robinhood/utils/resource/StringResource;", "orderTypeDropdownSelectorState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;", "inputStageRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow;", "disclosureVisible", "", "actionBarState", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "tradeStage", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;)V", "getInputStageHeader", "()Lcom/robinhood/utils/resource/StringResource;", "getOrderTypeDropdownSelectorState", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;", "getInputStageRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosureVisible", "()Z", "getActionBarState", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getTradeStage", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "TradeStage", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoQuickTradeSheetViewState {
    public static final int $stable = CryptoOrderAnimatedBentoNumpadState.$stable | StringResource.$stable;
    private final ActionViewState actionBarState;
    private final boolean disclosureVisible;
    private final StringResource inputStageHeader;
    private final ImmutableList<CryptoQuickTradeRow> inputStageRows;
    private final CryptoOrderAnimatedBentoNumpadState numpadState;
    private final CryptoQuickTradeDropdownState orderTypeDropdownSelectorState;
    private final TradeStage tradeStage;

    public static /* synthetic */ CryptoQuickTradeSheetViewState copy$default(CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState, StringResource stringResource, CryptoQuickTradeDropdownState cryptoQuickTradeDropdownState, ImmutableList immutableList, boolean z, ActionViewState actionViewState, CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, TradeStage tradeStage, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoQuickTradeSheetViewState.inputStageHeader;
        }
        if ((i & 2) != 0) {
            cryptoQuickTradeDropdownState = cryptoQuickTradeSheetViewState.orderTypeDropdownSelectorState;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoQuickTradeSheetViewState.inputStageRows;
        }
        if ((i & 8) != 0) {
            z = cryptoQuickTradeSheetViewState.disclosureVisible;
        }
        if ((i & 16) != 0) {
            actionViewState = cryptoQuickTradeSheetViewState.actionBarState;
        }
        if ((i & 32) != 0) {
            cryptoOrderAnimatedBentoNumpadState = cryptoQuickTradeSheetViewState.numpadState;
        }
        if ((i & 64) != 0) {
            tradeStage = cryptoQuickTradeSheetViewState.tradeStage;
        }
        CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState2 = cryptoOrderAnimatedBentoNumpadState;
        TradeStage tradeStage2 = tradeStage;
        ActionViewState actionViewState2 = actionViewState;
        ImmutableList immutableList2 = immutableList;
        return cryptoQuickTradeSheetViewState.copy(stringResource, cryptoQuickTradeDropdownState, immutableList2, z, actionViewState2, cryptoOrderAnimatedBentoNumpadState2, tradeStage2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getInputStageHeader() {
        return this.inputStageHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoQuickTradeDropdownState getOrderTypeDropdownSelectorState() {
        return this.orderTypeDropdownSelectorState;
    }

    public final ImmutableList<CryptoQuickTradeRow> component3() {
        return this.inputStageRows;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisclosureVisible() {
        return this.disclosureVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionViewState getActionBarState() {
        return this.actionBarState;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    /* renamed from: component7, reason: from getter */
    public final TradeStage getTradeStage() {
        return this.tradeStage;
    }

    public final CryptoQuickTradeSheetViewState copy(StringResource inputStageHeader, CryptoQuickTradeDropdownState orderTypeDropdownSelectorState, ImmutableList<? extends CryptoQuickTradeRow> inputStageRows, boolean disclosureVisible, ActionViewState actionBarState, CryptoOrderAnimatedBentoNumpadState numpadState, TradeStage tradeStage) {
        Intrinsics.checkNotNullParameter(orderTypeDropdownSelectorState, "orderTypeDropdownSelectorState");
        Intrinsics.checkNotNullParameter(inputStageRows, "inputStageRows");
        Intrinsics.checkNotNullParameter(actionBarState, "actionBarState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(tradeStage, "tradeStage");
        return new CryptoQuickTradeSheetViewState(inputStageHeader, orderTypeDropdownSelectorState, inputStageRows, disclosureVisible, actionBarState, numpadState, tradeStage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoQuickTradeSheetViewState)) {
            return false;
        }
        CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState = (CryptoQuickTradeSheetViewState) other;
        return Intrinsics.areEqual(this.inputStageHeader, cryptoQuickTradeSheetViewState.inputStageHeader) && Intrinsics.areEqual(this.orderTypeDropdownSelectorState, cryptoQuickTradeSheetViewState.orderTypeDropdownSelectorState) && Intrinsics.areEqual(this.inputStageRows, cryptoQuickTradeSheetViewState.inputStageRows) && this.disclosureVisible == cryptoQuickTradeSheetViewState.disclosureVisible && Intrinsics.areEqual(this.actionBarState, cryptoQuickTradeSheetViewState.actionBarState) && Intrinsics.areEqual(this.numpadState, cryptoQuickTradeSheetViewState.numpadState) && this.tradeStage == cryptoQuickTradeSheetViewState.tradeStage;
    }

    public int hashCode() {
        StringResource stringResource = this.inputStageHeader;
        return ((((((((((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.orderTypeDropdownSelectorState.hashCode()) * 31) + this.inputStageRows.hashCode()) * 31) + Boolean.hashCode(this.disclosureVisible)) * 31) + this.actionBarState.hashCode()) * 31) + this.numpadState.hashCode()) * 31) + this.tradeStage.hashCode();
    }

    public String toString() {
        return "CryptoQuickTradeSheetViewState(inputStageHeader=" + this.inputStageHeader + ", orderTypeDropdownSelectorState=" + this.orderTypeDropdownSelectorState + ", inputStageRows=" + this.inputStageRows + ", disclosureVisible=" + this.disclosureVisible + ", actionBarState=" + this.actionBarState + ", numpadState=" + this.numpadState + ", tradeStage=" + this.tradeStage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoQuickTradeSheetViewState(StringResource stringResource, CryptoQuickTradeDropdownState orderTypeDropdownSelectorState, ImmutableList<? extends CryptoQuickTradeRow> inputStageRows, boolean z, ActionViewState actionBarState, CryptoOrderAnimatedBentoNumpadState numpadState, TradeStage tradeStage) {
        Intrinsics.checkNotNullParameter(orderTypeDropdownSelectorState, "orderTypeDropdownSelectorState");
        Intrinsics.checkNotNullParameter(inputStageRows, "inputStageRows");
        Intrinsics.checkNotNullParameter(actionBarState, "actionBarState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(tradeStage, "tradeStage");
        this.inputStageHeader = stringResource;
        this.orderTypeDropdownSelectorState = orderTypeDropdownSelectorState;
        this.inputStageRows = inputStageRows;
        this.disclosureVisible = z;
        this.actionBarState = actionBarState;
        this.numpadState = numpadState;
        this.tradeStage = tradeStage;
    }

    public final StringResource getInputStageHeader() {
        return this.inputStageHeader;
    }

    public final CryptoQuickTradeDropdownState getOrderTypeDropdownSelectorState() {
        return this.orderTypeDropdownSelectorState;
    }

    public final ImmutableList<CryptoQuickTradeRow> getInputStageRows() {
        return this.inputStageRows;
    }

    public final boolean getDisclosureVisible() {
        return this.disclosureVisible;
    }

    public final ActionViewState getActionBarState() {
        return this.actionBarState;
    }

    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final TradeStage getTradeStage() {
        return this.tradeStage;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoQuickTradeSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "SUBMITTING", "RECEIPT", "UPSELL", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TradeStage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TradeStage[] $VALUES;
        public static final TradeStage INPUT = new TradeStage("INPUT", 0);
        public static final TradeStage SUBMITTING = new TradeStage("SUBMITTING", 1);
        public static final TradeStage RECEIPT = new TradeStage("RECEIPT", 2);
        public static final TradeStage UPSELL = new TradeStage("UPSELL", 3);

        private static final /* synthetic */ TradeStage[] $values() {
            return new TradeStage[]{INPUT, SUBMITTING, RECEIPT, UPSELL};
        }

        public static EnumEntries<TradeStage> getEntries() {
            return $ENTRIES;
        }

        private TradeStage(String str, int i) {
        }

        static {
            TradeStage[] tradeStageArr$values = $values();
            $VALUES = tradeStageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tradeStageArr$values);
        }

        public static TradeStage valueOf(String str) {
            return (TradeStage) Enum.valueOf(TradeStage.class, str);
        }

        public static TradeStage[] values() {
            return (TradeStage[]) $VALUES.clone();
        }
    }
}
