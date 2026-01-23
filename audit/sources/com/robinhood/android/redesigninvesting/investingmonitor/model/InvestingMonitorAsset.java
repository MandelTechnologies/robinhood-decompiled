package com.robinhood.android.redesigninvesting.investingmonitor.model;

import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode4;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorAsset.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J'\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010-\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "", "metadataId", "Ljava/util/UUID;", "curatedListEligibleItem", "Lcom/robinhood/models/ui/CuratedListEligible;", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/CuratedListEligible;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;)V", "getMetadataId", "()Ljava/util/UUID;", "getCuratedListEligibleItem", "()Lcom/robinhood/models/ui/CuratedListEligible;", "getInstrumentType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "displayName", "getDisplayName", "isOptionsStrategy", "", "()Z", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getUiStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "chartInstrumentType", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "getChartInstrumentType", "()Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "intentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "analyticsInstrumentType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getAnalyticsInstrumentType", "()Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestingMonitorAsset {
    public static final String DEEPLINK_SOURCE = "investing-monitor";
    private final Asset.AssetType analyticsInstrumentType;
    private final InstrumentType chartInstrumentType;
    private final CuratedListEligible curatedListEligibleItem;
    private final String displayName;
    private final com.robinhood.models.serverdriven.experimental.api.InstrumentType instrumentType;
    private final FragmentKey intentKey;
    private final boolean isOptionsStrategy;
    private final UUID metadataId;
    private final String symbol;
    private final UiOptionStrategyInfo uiStrategyInfo;
    public static final int $stable = 8;

    /* compiled from: InvestingMonitorAsset.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.robinhood.models.serverdriven.experimental.api.InstrumentType.values().length];
            try {
                iArr[com.robinhood.models.serverdriven.experimental.api.InstrumentType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.robinhood.models.serverdriven.experimental.api.InstrumentType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.robinhood.models.serverdriven.experimental.api.InstrumentType.INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.robinhood.models.serverdriven.experimental.api.InstrumentType.FUTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.robinhood.models.serverdriven.experimental.api.InstrumentType.OPTION_STRATEGY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InvestingMonitorAsset copy$default(InvestingMonitorAsset investingMonitorAsset, UUID uuid, CuratedListEligible curatedListEligible, com.robinhood.models.serverdriven.experimental.api.InstrumentType instrumentType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = investingMonitorAsset.metadataId;
        }
        if ((i & 2) != 0) {
            curatedListEligible = investingMonitorAsset.curatedListEligibleItem;
        }
        if ((i & 4) != 0) {
            instrumentType = investingMonitorAsset.instrumentType;
        }
        return investingMonitorAsset.copy(uuid, curatedListEligible, instrumentType);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getMetadataId() {
        return this.metadataId;
    }

    /* renamed from: component2, reason: from getter */
    public final CuratedListEligible getCuratedListEligibleItem() {
        return this.curatedListEligibleItem;
    }

    /* renamed from: component3, reason: from getter */
    public final com.robinhood.models.serverdriven.experimental.api.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final InvestingMonitorAsset copy(UUID metadataId, CuratedListEligible curatedListEligibleItem, com.robinhood.models.serverdriven.experimental.api.InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(curatedListEligibleItem, "curatedListEligibleItem");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        return new InvestingMonitorAsset(metadataId, curatedListEligibleItem, instrumentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestingMonitorAsset)) {
            return false;
        }
        InvestingMonitorAsset investingMonitorAsset = (InvestingMonitorAsset) other;
        return Intrinsics.areEqual(this.metadataId, investingMonitorAsset.metadataId) && Intrinsics.areEqual(this.curatedListEligibleItem, investingMonitorAsset.curatedListEligibleItem) && this.instrumentType == investingMonitorAsset.instrumentType;
    }

    public int hashCode() {
        return (((this.metadataId.hashCode() * 31) + this.curatedListEligibleItem.hashCode()) * 31) + this.instrumentType.hashCode();
    }

    public String toString() {
        return "InvestingMonitorAsset(metadataId=" + this.metadataId + ", curatedListEligibleItem=" + this.curatedListEligibleItem + ", instrumentType=" + this.instrumentType + ")";
    }

    public InvestingMonitorAsset(UUID metadataId, CuratedListEligible curatedListEligibleItem, com.robinhood.models.serverdriven.experimental.api.InstrumentType instrumentType) {
        InstrumentType instrumentType2;
        FragmentKey optionsDetailPageFragmentKey;
        Asset.AssetType assetType;
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(curatedListEligibleItem, "curatedListEligibleItem");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.metadataId = metadataId;
        this.curatedListEligibleItem = curatedListEligibleItem;
        this.instrumentType = instrumentType;
        this.symbol = curatedListEligibleItem.getCuratedListItem().getDisplaySymbol();
        this.displayName = curatedListEligibleItem.getCuratedListItem().getDisplayName();
        this.isOptionsStrategy = curatedListEligibleItem instanceof OptionStrategyCuratedListEligible;
        OptionStrategyCuratedListEligible optionStrategyCuratedListEligible = curatedListEligibleItem instanceof OptionStrategyCuratedListEligible ? (OptionStrategyCuratedListEligible) curatedListEligibleItem : null;
        this.uiStrategyInfo = optionStrategyCuratedListEligible != null ? optionStrategyCuratedListEligible.getOptionStrategyInfo() : null;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[instrumentType.ordinal()];
        if (i == 1) {
            instrumentType2 = InstrumentType.CRYPTO;
        } else if (i == 2) {
            instrumentType2 = InstrumentType.EQUITY;
        } else if (i == 3) {
            instrumentType2 = InstrumentType.INDEX;
        } else {
            instrumentType2 = InstrumentType.UNKNOWN;
        }
        this.chartInstrumentType = instrumentType2;
        if (curatedListEligibleItem instanceof CryptoCuratedListEligible) {
            optionsDetailPageFragmentKey = new CryptoDetailFragmentKey(metadataId, CollectionsKt.listOf(metadataId), false, null, null, null, 60, null);
        } else if (curatedListEligibleItem instanceof FuturesCuratedListEligible) {
            optionsDetailPageFragmentKey = new FuturesDetailFragmentKey.ByContractId(metadataId, new Screen(Screen.Name.NAME_UNSPECIFIED, null, DEEPLINK_SOURCE, null, 10, null), DEEPLINK_SOURCE);
        } else if (curatedListEligibleItem instanceof IndexCuratedListEligible) {
            optionsDetailPageFragmentKey = new IndexDetailPageFragmentKey(metadataId, (String) null, IndexDetailPageFragmentKey2.Pip.INSTANCE);
        } else if (curatedListEligibleItem instanceof InstrumentCuratedListEligible) {
            optionsDetailPageFragmentKey = new LegacyFragmentKey.EquityInstrumentDetail(metadataId, null, null, InstrumentDetailSource.INVESTING_MONITOR, false, 18, null);
        } else {
            if (!(curatedListEligibleItem instanceof OptionStrategyCuratedListEligible)) {
                throw new NoWhenBranchMatchedException();
            }
            String strategyCode = ((OptionStrategyCuratedListEligible) curatedListEligibleItem).getCuratedListItem().getStrategyCode();
            optionsDetailPageFragmentKey = strategyCode != null ? new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(strategyCode, false, CollectionsKt.listOf(strategyCode), null, OptionsDetailPageLaunchMode4.OTHER, 10, null)) : null;
        }
        this.intentKey = optionsDetailPageFragmentKey;
        int i2 = iArr[instrumentType.ordinal()];
        if (i2 == 1) {
            assetType = Asset.AssetType.CURRENCY_PAIR;
        } else if (i2 == 2) {
            assetType = Asset.AssetType.INSTRUMENT;
        } else if (i2 == 3) {
            assetType = Asset.AssetType.INDEXES;
        } else if (i2 == 4) {
            assetType = Asset.AssetType.FUTURES;
        } else if (i2 == 5) {
            assetType = Asset.AssetType.OPTIONS_CONTRACT;
        } else {
            assetType = Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
        }
        this.analyticsInstrumentType = assetType;
    }

    public final UUID getMetadataId() {
        return this.metadataId;
    }

    public final CuratedListEligible getCuratedListEligibleItem() {
        return this.curatedListEligibleItem;
    }

    public final com.robinhood.models.serverdriven.experimental.api.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: isOptionsStrategy, reason: from getter */
    public final boolean getIsOptionsStrategy() {
        return this.isOptionsStrategy;
    }

    public final UiOptionStrategyInfo getUiStrategyInfo() {
        return this.uiStrategyInfo;
    }

    public final InstrumentType getChartInstrumentType() {
        return this.chartInstrumentType;
    }

    public final FragmentKey getIntentKey() {
        return this.intentKey;
    }

    public final Asset.AssetType getAnalyticsInstrumentType() {
        return this.analyticsInstrumentType;
    }
}
