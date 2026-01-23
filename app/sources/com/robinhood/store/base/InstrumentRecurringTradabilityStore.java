package com.robinhood.store.base;

import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentRecurringTradabilityStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "", "streamRecurringInstrumentTradable", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "instrumentId", "Ljava/util/UUID;", "streamRecurringInstrumentTradableByAssetType", "assetType", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore$AssetType;", "AssetType", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface InstrumentRecurringTradabilityStore {
    Flow<InstrumentRecurringTradability> streamRecurringInstrumentTradable(UUID instrumentId);

    Flow<InstrumentRecurringTradability> streamRecurringInstrumentTradableByAssetType(AssetType assetType, UUID instrumentId);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstrumentRecurringTradabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore$AssetType;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetType[] $VALUES;
        public static final AssetType CRYPTO = new AssetType("CRYPTO", 0);

        private static final /* synthetic */ AssetType[] $values() {
            return new AssetType[]{CRYPTO};
        }

        public static EnumEntries<AssetType> getEntries() {
            return $ENTRIES;
        }

        private AssetType(String str, int i) {
        }

        static {
            AssetType[] assetTypeArr$values = $values();
            $VALUES = assetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
        }

        public static AssetType valueOf(String str) {
            return (AssetType) Enum.valueOf(AssetType.class, str);
        }

        public static AssetType[] values() {
            return (AssetType[]) $VALUES.clone();
        }
    }
}
