package com.robinhood.android.newsfeed.model;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.newsfeed.api.ApiNewsFeedAssetType;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RelatedAsset.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "", "id", "Ljava/util/UUID;", "symbol", "", "assetType", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedAssetType;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/newsfeed/api/ApiNewsFeedAssetType;)V", "getId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getAssetType", "()Lcom/robinhood/models/newsfeed/api/ApiNewsFeedAssetType;", "getFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "sourceServerValue", "accountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RelatedAsset {
    public static final int $stable = 8;
    private final ApiNewsFeedAssetType assetType;
    private final UUID id;
    private final String symbol;

    /* compiled from: RelatedAsset.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiNewsFeedAssetType.values().length];
            try {
                iArr[ApiNewsFeedAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiNewsFeedAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiNewsFeedAssetType.INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ RelatedAsset copy$default(RelatedAsset relatedAsset, UUID uuid, String str, ApiNewsFeedAssetType apiNewsFeedAssetType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = relatedAsset.id;
        }
        if ((i & 2) != 0) {
            str = relatedAsset.symbol;
        }
        if ((i & 4) != 0) {
            apiNewsFeedAssetType = relatedAsset.assetType;
        }
        return relatedAsset.copy(uuid, str, apiNewsFeedAssetType);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiNewsFeedAssetType getAssetType() {
        return this.assetType;
    }

    public final RelatedAsset copy(UUID id, String symbol, ApiNewsFeedAssetType assetType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return new RelatedAsset(id, symbol, assetType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedAsset)) {
            return false;
        }
        RelatedAsset relatedAsset = (RelatedAsset) other;
        return Intrinsics.areEqual(this.id, relatedAsset.id) && Intrinsics.areEqual(this.symbol, relatedAsset.symbol) && this.assetType == relatedAsset.assetType;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.assetType.hashCode();
    }

    public String toString() {
        return "RelatedAsset(id=" + this.id + ", symbol=" + this.symbol + ", assetType=" + this.assetType + ")";
    }

    public RelatedAsset(UUID id, String symbol, ApiNewsFeedAssetType assetType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.id = id;
        this.symbol = symbol;
        this.assetType = assetType;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final ApiNewsFeedAssetType getAssetType() {
        return this.assetType;
    }

    public final FragmentKey getFragmentKey(String sourceServerValue, String accountNumber) {
        Intrinsics.checkNotNullParameter(sourceServerValue, "sourceServerValue");
        int i = WhenMappings.$EnumSwitchMapping$0[this.assetType.ordinal()];
        if (i == 1) {
            return new LegacyFragmentKey.EquityInstrumentDetail(this.id, null, null, InstrumentDetailSource.Companion.fromServerValue$default(InstrumentDetailSource.INSTANCE, sourceServerValue, null, 2, null), false, 22, null);
        }
        if (i == 2) {
            return new CryptoDetailFragmentKey(this.id, null, false, null, null, null, 62, null);
        }
        if (i != 3) {
            return null;
        }
        return new IndexDetailPageFragmentKey(this.id, accountNumber, IndexDetailPageFragmentKey2.NewsFeed.INSTANCE);
    }
}
