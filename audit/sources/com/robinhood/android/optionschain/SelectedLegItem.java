package com.robinhood.android.optionschain;

import android.content.res.Resources;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.common.OptionLegBundles;
import com.robinhood.models.Decimals4;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectedLegItem.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBE\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003JG\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionschain/SelectedLegItem;", "", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "priceText", "", "showDivider", "", "showRatio", "showRemoveLegBtn", "<init>", "(Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;Ljava/lang/String;ZZZ)V", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "isLastItem", "optionQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "(Lcom/robinhood/android/common/options/OptionDefaultPricingState;ZLcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;Lcom/robinhood/models/db/OptionInstrumentQuote;ZZ)V", "getOptionLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getOptionOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "getPriceText", "()Ljava/lang/String;", "getShowDivider", "()Z", "getShowRatio", "getShowRemoveLegBtn", "fragmentKey", "Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "getFragmentKey", "()Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "getTitleString", "resources", "Landroid/content/res/Resources;", "getSubtitleString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectedLegItem {
    public static final int $stable = 8;
    private final OptionStatisticsFragmentKey fragmentKey;
    private final OptionLegBundle optionLegBundle;
    private final OptionOrderIntentKey optionOrderIntentKey;
    private final String priceText;
    private final boolean showDivider;
    private final boolean showRatio;
    private final boolean showRemoveLegBtn;
    private final UiOptionChain uiOptionChain;

    public static /* synthetic */ SelectedLegItem copy$default(SelectedLegItem selectedLegItem, OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            optionLegBundle = selectedLegItem.optionLegBundle;
        }
        if ((i & 2) != 0) {
            optionOrderIntentKey = selectedLegItem.optionOrderIntentKey;
        }
        if ((i & 4) != 0) {
            str = selectedLegItem.priceText;
        }
        if ((i & 8) != 0) {
            z = selectedLegItem.showDivider;
        }
        if ((i & 16) != 0) {
            z2 = selectedLegItem.showRatio;
        }
        if ((i & 32) != 0) {
            z3 = selectedLegItem.showRemoveLegBtn;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return selectedLegItem.copy(optionLegBundle, optionOrderIntentKey, str, z, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionLegBundle getOptionLegBundle() {
        return this.optionLegBundle;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionOrderIntentKey getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowRatio() {
        return this.showRatio;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowRemoveLegBtn() {
        return this.showRemoveLegBtn;
    }

    public final SelectedLegItem copy(OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, String priceText, boolean showDivider, boolean showRatio, boolean showRemoveLegBtn) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        Intrinsics.checkNotNullParameter(optionOrderIntentKey, "optionOrderIntentKey");
        return new SelectedLegItem(optionLegBundle, optionOrderIntentKey, priceText, showDivider, showRatio, showRemoveLegBtn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedLegItem)) {
            return false;
        }
        SelectedLegItem selectedLegItem = (SelectedLegItem) other;
        return Intrinsics.areEqual(this.optionLegBundle, selectedLegItem.optionLegBundle) && Intrinsics.areEqual(this.optionOrderIntentKey, selectedLegItem.optionOrderIntentKey) && Intrinsics.areEqual(this.priceText, selectedLegItem.priceText) && this.showDivider == selectedLegItem.showDivider && this.showRatio == selectedLegItem.showRatio && this.showRemoveLegBtn == selectedLegItem.showRemoveLegBtn;
    }

    public int hashCode() {
        int iHashCode = ((this.optionLegBundle.hashCode() * 31) + this.optionOrderIntentKey.hashCode()) * 31;
        String str = this.priceText;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showDivider)) * 31) + Boolean.hashCode(this.showRatio)) * 31) + Boolean.hashCode(this.showRemoveLegBtn);
    }

    public String toString() {
        return "SelectedLegItem(optionLegBundle=" + this.optionLegBundle + ", optionOrderIntentKey=" + this.optionOrderIntentKey + ", priceText=" + this.priceText + ", showDivider=" + this.showDivider + ", showRatio=" + this.showRatio + ", showRemoveLegBtn=" + this.showRemoveLegBtn + ")";
    }

    public SelectedLegItem(OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        Intrinsics.checkNotNullParameter(optionOrderIntentKey, "optionOrderIntentKey");
        this.optionLegBundle = optionLegBundle;
        this.optionOrderIntentKey = optionOrderIntentKey;
        this.priceText = str;
        this.showDivider = z;
        this.showRatio = z2;
        this.showRemoveLegBtn = z3;
        this.fragmentKey = new OptionStatisticsFragmentKey(optionLegBundle, optionOrderIntentKey, OptionStatisticsTradableState.NotAvailable.INSTANCE, null, false, 24, null);
        this.uiOptionChain = optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
    }

    public final OptionLegBundle getOptionLegBundle() {
        return this.optionLegBundle;
    }

    public final OptionOrderIntentKey getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    public final String getPriceText() {
        return this.priceText;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final boolean getShowRatio() {
        return this.showRatio;
    }

    public final boolean getShowRemoveLegBtn() {
        return this.showRemoveLegBtn;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectedLegItem(OptionDefaultPricingState optionDefaultPricingState, boolean z, OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, OptionInstrumentQuote optionInstrumentQuote, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        Intrinsics.checkNotNullParameter(optionOrderIntentKey, "optionOrderIntentKey");
        String str = null;
        if (optionInstrumentQuote != null) {
            OrderSide optionSide = optionLegBundle.getOptionConfigurationBundle().getOptionSide();
            BigDecimal multiplier = optionSide.getDirection().getMultiplier();
            Decimals4 price$default = OptionInstrumentQuote.getPrice$default(optionInstrumentQuote, optionDefaultPricingState != null ? optionDefaultPricingState.getOverallDefaultPricingType() : null, optionSide, false, 4, null);
            BigDecimal bigDecimalMultiply = BigDecimals7.orZero(price$default != null ? price$default.getUnsignedValue() : null).multiply(multiplier);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            str = Formats.getPriceFormat().format(bigDecimalMultiply);
        }
        this(optionLegBundle, optionOrderIntentKey, str, !z, z2, z3);
    }

    public final OptionStatisticsFragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    public final String getTitleString(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionInstruments.getInstrumentDetailRowTitleString(this.optionLegBundle.getOptionInstrument(), resources, this.uiOptionChain.getUnderlyingType());
    }

    public final String getSubtitleString(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionLegBundles.getShoppingCartSubtitle(this.optionLegBundle, resources, this.uiOptionChain.getOptionChain().getSettleOnOpen());
    }
}
