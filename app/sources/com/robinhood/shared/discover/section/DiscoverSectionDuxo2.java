package com.robinhood.shared.discover.section;

import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoverSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"cryptoTradingAssetType", "Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "getCryptoTradingAssetType", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;)Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "tradingOptionsLocation", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;", "getTradingOptionsLocation", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;)Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "lib-discover_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.discover.section.DiscoverSectionDuxoKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DiscoverSectionDuxo2 {

    /* compiled from: DiscoverSectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.discover.section.DiscoverSectionDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoExploreState3.values().length];
            try {
                iArr[CryptoExploreState3.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoExploreState3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoExploreState3.TOKENIZED_STOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoExploreState3.TOKENIZED_ETF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoExploreState4.values().length];
            try {
                iArr2[CryptoExploreState4.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoExploreState4.DAILY_MOVERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CryptoExploreState4.COIN_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoExploreState4.DISCOVER_CHIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CryptoExploreState4.DISCOVER_CARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CryptoExploreState4.CHP_CHIPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CryptoTradingAssetType getCryptoTradingAssetType(CryptoExploreState3 cryptoExploreState3) {
        Intrinsics.checkNotNullParameter(cryptoExploreState3, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoExploreState3.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(cryptoExploreState3);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return CryptoTradingAssetType.CRYPTO;
        }
        if (i == 3) {
            return CryptoTradingAssetType.TOKENIZED_STOCKS;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoTradingAssetType.TOKENIZED_ETFS;
    }

    public static final CryptoTradingOptionsLocation getTradingOptionsLocation(CryptoExploreState4 cryptoExploreState4) {
        Intrinsics.checkNotNullParameter(cryptoExploreState4, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[cryptoExploreState4.ordinal()]) {
            case 1:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(cryptoExploreState4);
                throw new ExceptionsH();
            case 2:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(cryptoExploreState4);
                throw new ExceptionsH();
            case 3:
                return CryptoTradingOptionsLocation.COIN_LIST;
            case 4:
                return CryptoTradingOptionsLocation.EXPLORE_CHIPS;
            case 5:
                return CryptoTradingOptionsLocation.DISCOVER_CARDS;
            case 6:
                return CryptoTradingOptionsLocation.CHP_CHIPS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
