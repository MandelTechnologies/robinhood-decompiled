package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeLadderBottomBar.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003!\"#B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState;", "", "buyButtonState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$LadderTradeButtonState;", "sellButtonState", "quantityButtonState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$QuantityButtonState;", "helperTextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "isQuantitySelectorOpen", "", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$LadderTradeButtonState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$LadderTradeButtonState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$QuantityButtonState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;Z)V", "getBuyButtonState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$LadderTradeButtonState;", "getSellButtonState", "getQuantityButtonState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$QuantityButtonState;", "getHelperTextState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "LadderTradeButtonState", "QuantityButtonState", "HelperTextState", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TradeLadderBottomBarState {
    public static final int $stable = StringResource.$stable;
    private final LadderTradeButtonState buyButtonState;
    private final HelperTextState helperTextState;
    private final boolean isQuantitySelectorOpen;
    private final QuantityButtonState quantityButtonState;
    private final LadderTradeButtonState sellButtonState;

    public static /* synthetic */ TradeLadderBottomBarState copy$default(TradeLadderBottomBarState tradeLadderBottomBarState, LadderTradeButtonState ladderTradeButtonState, LadderTradeButtonState ladderTradeButtonState2, QuantityButtonState quantityButtonState, HelperTextState helperTextState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ladderTradeButtonState = tradeLadderBottomBarState.buyButtonState;
        }
        if ((i & 2) != 0) {
            ladderTradeButtonState2 = tradeLadderBottomBarState.sellButtonState;
        }
        if ((i & 4) != 0) {
            quantityButtonState = tradeLadderBottomBarState.quantityButtonState;
        }
        if ((i & 8) != 0) {
            helperTextState = tradeLadderBottomBarState.helperTextState;
        }
        if ((i & 16) != 0) {
            z = tradeLadderBottomBarState.isQuantitySelectorOpen;
        }
        boolean z2 = z;
        QuantityButtonState quantityButtonState2 = quantityButtonState;
        return tradeLadderBottomBarState.copy(ladderTradeButtonState, ladderTradeButtonState2, quantityButtonState2, helperTextState, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final LadderTradeButtonState getBuyButtonState() {
        return this.buyButtonState;
    }

    /* renamed from: component2, reason: from getter */
    public final LadderTradeButtonState getSellButtonState() {
        return this.sellButtonState;
    }

    /* renamed from: component3, reason: from getter */
    public final QuantityButtonState getQuantityButtonState() {
        return this.quantityButtonState;
    }

    /* renamed from: component4, reason: from getter */
    public final HelperTextState getHelperTextState() {
        return this.helperTextState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsQuantitySelectorOpen() {
        return this.isQuantitySelectorOpen;
    }

    public final TradeLadderBottomBarState copy(LadderTradeButtonState buyButtonState, LadderTradeButtonState sellButtonState, QuantityButtonState quantityButtonState, HelperTextState helperTextState, boolean isQuantitySelectorOpen) {
        Intrinsics.checkNotNullParameter(buyButtonState, "buyButtonState");
        Intrinsics.checkNotNullParameter(sellButtonState, "sellButtonState");
        Intrinsics.checkNotNullParameter(quantityButtonState, "quantityButtonState");
        return new TradeLadderBottomBarState(buyButtonState, sellButtonState, quantityButtonState, helperTextState, isQuantitySelectorOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeLadderBottomBarState)) {
            return false;
        }
        TradeLadderBottomBarState tradeLadderBottomBarState = (TradeLadderBottomBarState) other;
        return Intrinsics.areEqual(this.buyButtonState, tradeLadderBottomBarState.buyButtonState) && Intrinsics.areEqual(this.sellButtonState, tradeLadderBottomBarState.sellButtonState) && Intrinsics.areEqual(this.quantityButtonState, tradeLadderBottomBarState.quantityButtonState) && Intrinsics.areEqual(this.helperTextState, tradeLadderBottomBarState.helperTextState) && this.isQuantitySelectorOpen == tradeLadderBottomBarState.isQuantitySelectorOpen;
    }

    public int hashCode() {
        int iHashCode = ((((this.buyButtonState.hashCode() * 31) + this.sellButtonState.hashCode()) * 31) + this.quantityButtonState.hashCode()) * 31;
        HelperTextState helperTextState = this.helperTextState;
        return ((iHashCode + (helperTextState == null ? 0 : helperTextState.hashCode())) * 31) + Boolean.hashCode(this.isQuantitySelectorOpen);
    }

    public String toString() {
        return "TradeLadderBottomBarState(buyButtonState=" + this.buyButtonState + ", sellButtonState=" + this.sellButtonState + ", quantityButtonState=" + this.quantityButtonState + ", helperTextState=" + this.helperTextState + ", isQuantitySelectorOpen=" + this.isQuantitySelectorOpen + ")";
    }

    public TradeLadderBottomBarState(LadderTradeButtonState buyButtonState, LadderTradeButtonState sellButtonState, QuantityButtonState quantityButtonState, HelperTextState helperTextState, boolean z) {
        Intrinsics.checkNotNullParameter(buyButtonState, "buyButtonState");
        Intrinsics.checkNotNullParameter(sellButtonState, "sellButtonState");
        Intrinsics.checkNotNullParameter(quantityButtonState, "quantityButtonState");
        this.buyButtonState = buyButtonState;
        this.sellButtonState = sellButtonState;
        this.quantityButtonState = quantityButtonState;
        this.helperTextState = helperTextState;
        this.isQuantitySelectorOpen = z;
    }

    public final LadderTradeButtonState getBuyButtonState() {
        return this.buyButtonState;
    }

    public final LadderTradeButtonState getSellButtonState() {
        return this.sellButtonState;
    }

    public final QuantityButtonState getQuantityButtonState() {
        return this.quantityButtonState;
    }

    public final HelperTextState getHelperTextState() {
        return this.helperTextState;
    }

    public final boolean isQuantitySelectorOpen() {
        return this.isQuantitySelectorOpen;
    }

    /* compiled from: TradeLadderBottomBar.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$LadderTradeButtonState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "enabled", "", "clickThrough", "loading", "isSubmitButton", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZZZ)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getEnabled", "()Z", "getClickThrough", "getLoading", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LadderTradeButtonState {
        public static final int $stable = StringResource.$stable;
        private final boolean clickThrough;
        private final boolean enabled;
        private final boolean isSubmitButton;
        private final boolean loading;
        private final StringResource text;

        public static /* synthetic */ LadderTradeButtonState copy$default(LadderTradeButtonState ladderTradeButtonState, StringResource stringResource, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = ladderTradeButtonState.text;
            }
            if ((i & 2) != 0) {
                z = ladderTradeButtonState.enabled;
            }
            if ((i & 4) != 0) {
                z2 = ladderTradeButtonState.clickThrough;
            }
            if ((i & 8) != 0) {
                z3 = ladderTradeButtonState.loading;
            }
            if ((i & 16) != 0) {
                z4 = ladderTradeButtonState.isSubmitButton;
            }
            boolean z5 = z4;
            boolean z6 = z2;
            return ladderTradeButtonState.copy(stringResource, z, z6, z3, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getClickThrough() {
            return this.clickThrough;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSubmitButton() {
            return this.isSubmitButton;
        }

        public final LadderTradeButtonState copy(StringResource text, boolean enabled, boolean clickThrough, boolean loading, boolean isSubmitButton) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LadderTradeButtonState(text, enabled, clickThrough, loading, isSubmitButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderTradeButtonState)) {
                return false;
            }
            LadderTradeButtonState ladderTradeButtonState = (LadderTradeButtonState) other;
            return Intrinsics.areEqual(this.text, ladderTradeButtonState.text) && this.enabled == ladderTradeButtonState.enabled && this.clickThrough == ladderTradeButtonState.clickThrough && this.loading == ladderTradeButtonState.loading && this.isSubmitButton == ladderTradeButtonState.isSubmitButton;
        }

        public int hashCode() {
            return (((((((this.text.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.clickThrough)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.isSubmitButton);
        }

        public String toString() {
            return "LadderTradeButtonState(text=" + this.text + ", enabled=" + this.enabled + ", clickThrough=" + this.clickThrough + ", loading=" + this.loading + ", isSubmitButton=" + this.isSubmitButton + ")";
        }

        public LadderTradeButtonState(StringResource text, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.enabled = z;
            this.clickThrough = z2;
            this.loading = z3;
            this.isSubmitButton = z4;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getClickThrough() {
            return this.clickThrough;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final boolean isSubmitButton() {
            return this.isSubmitButton;
        }
    }

    /* compiled from: TradeLadderBottomBar.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$QuantityButtonState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "enabled", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuantityButtonState {
        public static final int $stable = StringResource.$stable;
        private final boolean enabled;
        private final StringResource text;

        public static /* synthetic */ QuantityButtonState copy$default(QuantityButtonState quantityButtonState, StringResource stringResource, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = quantityButtonState.text;
            }
            if ((i & 2) != 0) {
                z = quantityButtonState.enabled;
            }
            return quantityButtonState.copy(stringResource, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final QuantityButtonState copy(StringResource text, boolean enabled) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new QuantityButtonState(text, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityButtonState)) {
                return false;
            }
            QuantityButtonState quantityButtonState = (QuantityButtonState) other;
            return Intrinsics.areEqual(this.text, quantityButtonState.text) && this.enabled == quantityButtonState.enabled;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "QuantityButtonState(text=" + this.text + ", enabled=" + this.enabled + ")";
        }

        public QuantityButtonState(StringResource text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.enabled = z;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: TradeLadderBottomBar.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "", "<init>", "()V", "FetchingData", "Summary", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState$FetchingData;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState$Summary;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class HelperTextState {
        public static final int $stable = 0;

        public /* synthetic */ HelperTextState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: TradeLadderBottomBar.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState$FetchingData;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FetchingData extends HelperTextState {
            public static final int $stable = 0;
            public static final FetchingData INSTANCE = new FetchingData();

            public boolean equals(Object other) {
                return this == other || (other instanceof FetchingData);
            }

            public int hashCode() {
                return 791210570;
            }

            public String toString() {
                return "FetchingData";
            }

            private FetchingData() {
                super(null);
            }
        }

        private HelperTextState() {
        }

        /* compiled from: TradeLadderBottomBar.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState$Summary;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", InstantRetirementAgreementComponents.MarkdownTag, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getMarkdown", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Summary extends HelperTextState {
            public static final int $stable = StringResource.$stable;
            private final StringResource markdown;

            public static /* synthetic */ Summary copy$default(Summary summary, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = summary.markdown;
                }
                return summary.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getMarkdown() {
                return this.markdown;
            }

            public final Summary copy(StringResource markdown) {
                Intrinsics.checkNotNullParameter(markdown, "markdown");
                return new Summary(markdown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Summary) && Intrinsics.areEqual(this.markdown, ((Summary) other).markdown);
            }

            public int hashCode() {
                return this.markdown.hashCode();
            }

            public String toString() {
                return "Summary(markdown=" + this.markdown + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Summary(StringResource markdown) {
                super(null);
                Intrinsics.checkNotNullParameter(markdown, "markdown");
                this.markdown = markdown;
            }

            public final StringResource getMarkdown() {
                return this.markdown;
            }
        }
    }
}
