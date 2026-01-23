package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderBottomBarState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: TradeLadderBottomBar.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderBottomBar5 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public TradeLadderBottomBar5() {
        Parameters parameters = new Parameters(null, false, true, false, false, true, false, false);
        Parameters parameters2 = new Parameters(null, false, false, false, false, false, false, false);
        Parameters parameters3 = new Parameters(null, false, true, true, false, true, true, true);
        boolean z = false;
        Parameters parameters4 = new Parameters(null, false, true, false, true, true, false, true);
        boolean z2 = false;
        Parameters parameters5 = new Parameters(null, false, false, false, true, false, false, true);
        boolean z3 = false;
        boolean z4 = false;
        Parameters parameters6 = new Parameters(null, true, false, false, z, z2, z3, z4, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        boolean z5 = false;
        boolean z6 = false;
        this.values = SequencesKt.sequenceOf(parameters, parameters2, parameters3, parameters4, parameters5, parameters6, new Parameters(new TradeLadderBottomBarState.HelperTextState.Summary(StringResource.INSTANCE.invoke("Once executed, the transaction may not be undone. Your order will be routed to partner exchanges. Fee (0.85%): $8.50  [View disclosures]()")), false, z5, z, z2, z3, z4, z6, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new Parameters(TradeLadderBottomBarState.HelperTextState.FetchingData.INSTANCE, z5, z, z2, z3, z4, z6, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: TradeLadderBottomBar.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarPreviewParameterProvider$Parameters;", "", "helperTextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "isQuantitySelectorOpen", "", "buyEnabled", "buyLoading", "buyIsSubmitButton", "sellEnabled", "sellLoading", "sellIsSubmitButton", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;ZZZZZZZ)V", "getHelperTextState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "()Z", "getBuyEnabled", "getBuyLoading", "getBuyIsSubmitButton", "getSellEnabled", "getSellLoading", "getSellIsSubmitButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 0;
        private final boolean buyEnabled;
        private final boolean buyIsSubmitButton;
        private final boolean buyLoading;
        private final TradeLadderBottomBarState.HelperTextState helperTextState;
        private final boolean isQuantitySelectorOpen;
        private final boolean sellEnabled;
        private final boolean sellIsSubmitButton;
        private final boolean sellLoading;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, TradeLadderBottomBarState.HelperTextState helperTextState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
            if ((i & 1) != 0) {
                helperTextState = parameters.helperTextState;
            }
            if ((i & 2) != 0) {
                z = parameters.isQuantitySelectorOpen;
            }
            if ((i & 4) != 0) {
                z2 = parameters.buyEnabled;
            }
            if ((i & 8) != 0) {
                z3 = parameters.buyLoading;
            }
            if ((i & 16) != 0) {
                z4 = parameters.buyIsSubmitButton;
            }
            if ((i & 32) != 0) {
                z5 = parameters.sellEnabled;
            }
            if ((i & 64) != 0) {
                z6 = parameters.sellLoading;
            }
            if ((i & 128) != 0) {
                z7 = parameters.sellIsSubmitButton;
            }
            boolean z8 = z6;
            boolean z9 = z7;
            boolean z10 = z4;
            boolean z11 = z5;
            return parameters.copy(helperTextState, z, z2, z3, z10, z11, z8, z9);
        }

        /* renamed from: component1, reason: from getter */
        public final TradeLadderBottomBarState.HelperTextState getHelperTextState() {
            return this.helperTextState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsQuantitySelectorOpen() {
            return this.isQuantitySelectorOpen;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getBuyEnabled() {
            return this.buyEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getBuyLoading() {
            return this.buyLoading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getBuyIsSubmitButton() {
            return this.buyIsSubmitButton;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSellEnabled() {
            return this.sellEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getSellLoading() {
            return this.sellLoading;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getSellIsSubmitButton() {
            return this.sellIsSubmitButton;
        }

        public final Parameters copy(TradeLadderBottomBarState.HelperTextState helperTextState, boolean isQuantitySelectorOpen, boolean buyEnabled, boolean buyLoading, boolean buyIsSubmitButton, boolean sellEnabled, boolean sellLoading, boolean sellIsSubmitButton) {
            return new Parameters(helperTextState, isQuantitySelectorOpen, buyEnabled, buyLoading, buyIsSubmitButton, sellEnabled, sellLoading, sellIsSubmitButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.helperTextState, parameters.helperTextState) && this.isQuantitySelectorOpen == parameters.isQuantitySelectorOpen && this.buyEnabled == parameters.buyEnabled && this.buyLoading == parameters.buyLoading && this.buyIsSubmitButton == parameters.buyIsSubmitButton && this.sellEnabled == parameters.sellEnabled && this.sellLoading == parameters.sellLoading && this.sellIsSubmitButton == parameters.sellIsSubmitButton;
        }

        public int hashCode() {
            TradeLadderBottomBarState.HelperTextState helperTextState = this.helperTextState;
            return ((((((((((((((helperTextState == null ? 0 : helperTextState.hashCode()) * 31) + Boolean.hashCode(this.isQuantitySelectorOpen)) * 31) + Boolean.hashCode(this.buyEnabled)) * 31) + Boolean.hashCode(this.buyLoading)) * 31) + Boolean.hashCode(this.buyIsSubmitButton)) * 31) + Boolean.hashCode(this.sellEnabled)) * 31) + Boolean.hashCode(this.sellLoading)) * 31) + Boolean.hashCode(this.sellIsSubmitButton);
        }

        public String toString() {
            return "Parameters(helperTextState=" + this.helperTextState + ", isQuantitySelectorOpen=" + this.isQuantitySelectorOpen + ", buyEnabled=" + this.buyEnabled + ", buyLoading=" + this.buyLoading + ", buyIsSubmitButton=" + this.buyIsSubmitButton + ", sellEnabled=" + this.sellEnabled + ", sellLoading=" + this.sellLoading + ", sellIsSubmitButton=" + this.sellIsSubmitButton + ")";
        }

        public Parameters(TradeLadderBottomBarState.HelperTextState helperTextState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.helperTextState = helperTextState;
            this.isQuantitySelectorOpen = z;
            this.buyEnabled = z2;
            this.buyLoading = z3;
            this.buyIsSubmitButton = z4;
            this.sellEnabled = z5;
            this.sellLoading = z6;
            this.sellIsSubmitButton = z7;
        }

        public /* synthetic */ Parameters(TradeLadderBottomBarState.HelperTextState helperTextState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(helperTextState, z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7);
        }

        public final TradeLadderBottomBarState.HelperTextState getHelperTextState() {
            return this.helperTextState;
        }

        public final boolean isQuantitySelectorOpen() {
            return this.isQuantitySelectorOpen;
        }

        public final boolean getBuyEnabled() {
            return this.buyEnabled;
        }

        public final boolean getBuyLoading() {
            return this.buyLoading;
        }

        public final boolean getBuyIsSubmitButton() {
            return this.buyIsSubmitButton;
        }

        public final boolean getSellEnabled() {
            return this.sellEnabled;
        }

        public final boolean getSellLoading() {
            return this.sellLoading;
        }

        public final boolean getSellIsSubmitButton() {
            return this.sellIsSubmitButton;
        }
    }
}
