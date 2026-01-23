package com.robinhood.android.optionschain;

import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainListView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\fHÆ\u0003J\u0086\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainAdapterData;", "", "accountIsMargin", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "optionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "optionConfigurationBundle", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "watchlistItemStates", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/ui/OptionConfigurationBundle;Lcom/robinhood/models/ui/UiOptionChain;Ljava/util/List;)V", "getAccountIsMargin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getDefaultPricingType", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getFeatureSet", "()Ljava/util/Set;", "getOptionInstruments", "()Ljava/util/List;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "getOptionConfigurationBundle", "()Lcom/robinhood/models/ui/OptionConfigurationBundle;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getWatchlistItemStates", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/ui/OptionConfigurationBundle;Lcom/robinhood/models/ui/UiOptionChain;Ljava/util/List;)Lcom/robinhood/android/optionschain/OptionChainAdapterData;", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final /* data */ class OptionChainAdapterData {
    private final Boolean accountIsMargin;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final OptionSettings.DefaultPricingSetting defaultPricingType;
    private final Set<OptionChainLaunchMode.Feature> featureSet;
    private final OptionConfigurationBundle optionConfigurationBundle;
    private final List<OptionInstrument> optionInstruments;
    private final UiOptionChain uiOptionChain;
    private final UnderlyingQuote underlyingQuote;
    private final List<OptionWatchlistItemState> watchlistItemStates;

    public static /* synthetic */ OptionChainAdapterData copy$default(OptionChainAdapterData optionChainAdapterData, Boolean bool, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set set, List list, UnderlyingQuote underlyingQuote, OptionConfigurationBundle optionConfigurationBundle, UiOptionChain uiOptionChain, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = optionChainAdapterData.accountIsMargin;
        }
        if ((i & 2) != 0) {
            optionCurrentOrNextMarketDates = optionChainAdapterData.currentOrNextMarketDates;
        }
        if ((i & 4) != 0) {
            defaultPricingSetting = optionChainAdapterData.defaultPricingType;
        }
        if ((i & 8) != 0) {
            set = optionChainAdapterData.featureSet;
        }
        if ((i & 16) != 0) {
            list = optionChainAdapterData.optionInstruments;
        }
        if ((i & 32) != 0) {
            underlyingQuote = optionChainAdapterData.underlyingQuote;
        }
        if ((i & 64) != 0) {
            optionConfigurationBundle = optionChainAdapterData.optionConfigurationBundle;
        }
        if ((i & 128) != 0) {
            uiOptionChain = optionChainAdapterData.uiOptionChain;
        }
        if ((i & 256) != 0) {
            list2 = optionChainAdapterData.watchlistItemStates;
        }
        UiOptionChain uiOptionChain2 = uiOptionChain;
        List list3 = list2;
        UnderlyingQuote underlyingQuote2 = underlyingQuote;
        OptionConfigurationBundle optionConfigurationBundle2 = optionConfigurationBundle;
        List list4 = list;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = defaultPricingSetting;
        return optionChainAdapterData.copy(bool, optionCurrentOrNextMarketDates, defaultPricingSetting2, set, list4, underlyingQuote2, optionConfigurationBundle2, uiOptionChain2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAccountIsMargin() {
        return this.accountIsMargin;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public final Set<OptionChainLaunchMode.Feature> component4() {
        return this.featureSet;
    }

    public final List<OptionInstrument> component5() {
        return this.optionInstruments;
    }

    /* renamed from: component6, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    /* renamed from: component8, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final List<OptionWatchlistItemState> component9() {
        return this.watchlistItemStates;
    }

    public final OptionChainAdapterData copy(Boolean accountIsMargin, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingType, Set<? extends OptionChainLaunchMode.Feature> featureSet, List<OptionInstrument> optionInstruments, UnderlyingQuote underlyingQuote, OptionConfigurationBundle optionConfigurationBundle, UiOptionChain uiOptionChain, List<? extends OptionWatchlistItemState> watchlistItemStates) {
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(watchlistItemStates, "watchlistItemStates");
        return new OptionChainAdapterData(accountIsMargin, currentOrNextMarketDates, defaultPricingType, featureSet, optionInstruments, underlyingQuote, optionConfigurationBundle, uiOptionChain, watchlistItemStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainAdapterData)) {
            return false;
        }
        OptionChainAdapterData optionChainAdapterData = (OptionChainAdapterData) other;
        return Intrinsics.areEqual(this.accountIsMargin, optionChainAdapterData.accountIsMargin) && Intrinsics.areEqual(this.currentOrNextMarketDates, optionChainAdapterData.currentOrNextMarketDates) && this.defaultPricingType == optionChainAdapterData.defaultPricingType && Intrinsics.areEqual(this.featureSet, optionChainAdapterData.featureSet) && Intrinsics.areEqual(this.optionInstruments, optionChainAdapterData.optionInstruments) && Intrinsics.areEqual(this.underlyingQuote, optionChainAdapterData.underlyingQuote) && Intrinsics.areEqual(this.optionConfigurationBundle, optionChainAdapterData.optionConfigurationBundle) && Intrinsics.areEqual(this.uiOptionChain, optionChainAdapterData.uiOptionChain) && Intrinsics.areEqual(this.watchlistItemStates, optionChainAdapterData.watchlistItemStates);
    }

    public int hashCode() {
        Boolean bool = this.accountIsMargin;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
        int iHashCode3 = (((((iHashCode2 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + this.featureSet.hashCode()) * 31) + this.optionInstruments.hashCode()) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        int iHashCode4 = (iHashCode3 + (underlyingQuote == null ? 0 : underlyingQuote.hashCode())) * 31;
        OptionConfigurationBundle optionConfigurationBundle = this.optionConfigurationBundle;
        int iHashCode5 = (iHashCode4 + (optionConfigurationBundle == null ? 0 : optionConfigurationBundle.hashCode())) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        return ((iHashCode5 + (uiOptionChain != null ? uiOptionChain.hashCode() : 0)) * 31) + this.watchlistItemStates.hashCode();
    }

    public String toString() {
        return "OptionChainAdapterData(accountIsMargin=" + this.accountIsMargin + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", defaultPricingType=" + this.defaultPricingType + ", featureSet=" + this.featureSet + ", optionInstruments=" + this.optionInstruments + ", underlyingQuote=" + this.underlyingQuote + ", optionConfigurationBundle=" + this.optionConfigurationBundle + ", uiOptionChain=" + this.uiOptionChain + ", watchlistItemStates=" + this.watchlistItemStates + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionChainAdapterData(Boolean bool, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set<? extends OptionChainLaunchMode.Feature> featureSet, List<OptionInstrument> optionInstruments, UnderlyingQuote underlyingQuote, OptionConfigurationBundle optionConfigurationBundle, UiOptionChain uiOptionChain, List<? extends OptionWatchlistItemState> watchlistItemStates) {
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(watchlistItemStates, "watchlistItemStates");
        this.accountIsMargin = bool;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.defaultPricingType = defaultPricingSetting;
        this.featureSet = featureSet;
        this.optionInstruments = optionInstruments;
        this.underlyingQuote = underlyingQuote;
        this.optionConfigurationBundle = optionConfigurationBundle;
        this.uiOptionChain = uiOptionChain;
        this.watchlistItemStates = watchlistItemStates;
    }

    public final Boolean getAccountIsMargin() {
        return this.accountIsMargin;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public final Set<OptionChainLaunchMode.Feature> getFeatureSet() {
        return this.featureSet;
    }

    public final List<OptionInstrument> getOptionInstruments() {
        return this.optionInstruments;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final List<OptionWatchlistItemState> getWatchlistItemStates() {
        return this.watchlistItemStates;
    }
}
