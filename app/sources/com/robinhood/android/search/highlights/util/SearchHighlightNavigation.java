package com.robinhood.android.search.highlights.util;

import android.content.Context;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import search_coprocessor.p542v1.AssetDto;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightNavigation.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\u000e"}, m3636d2 = {"navigateToDetailPage", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lsearch_coprocessor/v1/AssetDto;", "uuid", "Ljava/util/UUID;", "accountNumber", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.util.SearchHighlightNavigationKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightNavigation {

    /* compiled from: SearchHighlightNavigation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.highlights.util.SearchHighlightNavigationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetTypeDto.values().length];
            try {
                iArr[AssetTypeDto.TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetTypeDto.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetTypeDto.CRYPTOCURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetTypeDto.FUTURES_PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetTypeDto.FUTURES_CONTRACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetTypeDto.INDEX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void navigateToDetailPage(AssetDto item, UUID uuid, String str, Navigator navigator, Context context) {
        TabFragmentKey equityInstrumentDetail;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        TabFragmentKey indexDetailPageFragmentKey = null;
        switch (WhenMappings.$EnumSwitchMapping$0[item.getAsset_type().ordinal()]) {
            case 1:
                if (indexDetailPageFragmentKey == null) {
                    Navigator.DefaultImpls.showFragment$default(navigator, context, indexDetailPageFragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
                    return;
                }
                return;
            case 2:
                equityInstrumentDetail = new LegacyFragmentKey.EquityInstrumentDetail(uuid, null, str, InstrumentDetailSource.SEARCH_HIGHLIGHTS, false, 18, null);
                indexDetailPageFragmentKey = equityInstrumentDetail;
                if (indexDetailPageFragmentKey == null) {
                }
                break;
            case 3:
                equityInstrumentDetail = new CryptoDetailFragmentKey(uuid, null, false, null, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT, null, 46, null);
                indexDetailPageFragmentKey = equityInstrumentDetail;
                if (indexDetailPageFragmentKey == null) {
                }
                break;
            case 4:
                equityInstrumentDetail = new FuturesDetailFragmentKey.ByProductId(uuid, null, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT);
                indexDetailPageFragmentKey = equityInstrumentDetail;
                if (indexDetailPageFragmentKey == null) {
                }
                break;
            case 5:
                equityInstrumentDetail = new FuturesDetailFragmentKey.ByContractId(uuid, null, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT);
                indexDetailPageFragmentKey = equityInstrumentDetail;
                if (indexDetailPageFragmentKey == null) {
                }
                break;
            case 6:
                indexDetailPageFragmentKey = new IndexDetailPageFragmentKey(uuid, str, IndexDetailPageFragmentKey2.SearchHighlight.INSTANCE);
                if (indexDetailPageFragmentKey == null) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void navigateToDetailPage(Navigator navigator, Context context, AssetQuote assetQuote, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetQuote, "assetQuote");
        if (assetQuote instanceof AssetQuote.Equity) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(((AssetQuote.Equity) assetQuote).getId(), null, str, InstrumentDetailSource.SEARCH_HIGHLIGHTS, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
    }
}
