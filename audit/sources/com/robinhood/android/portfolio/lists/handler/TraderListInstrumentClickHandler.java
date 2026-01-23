package com.robinhood.android.portfolio.lists.handler;

import android.content.Context;
import com.android.shared.portfolio.lists.handler.ListInstrumentClickHandler;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode4;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderListInstrumentClickHandler.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/TraderListInstrumentClickHandler;", "Lcom/android/shared/portfolio/lists/handler/ListInstrumentClickHandler;", "<init>", "()V", "onClick", "", "instrumentId", "Ljava/util/UUID;", "objectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "optionStrategyCode", "", "watchlistItems", "", "", "accountNumber", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TraderListInstrumentClickHandler implements ListInstrumentClickHandler {
    public static final TraderListInstrumentClickHandler INSTANCE = new TraderListInstrumentClickHandler();

    /* compiled from: TraderListInstrumentClickHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListObjectType.values().length];
            try {
                iArr[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CuratedListObjectType.INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CuratedListObjectType.INSTRUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CuratedListObjectType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TraderListInstrumentClickHandler() {
    }

    @Override // com.android.shared.portfolio.lists.handler.ListInstrumentClickHandler
    public void onClick(UUID instrumentId, CuratedListObjectType objectType, Navigator navigator, Context context, PerformanceLogger performanceLogger, String optionStrategyCode, Map<CuratedListObjectType, ? extends List<UUID>> watchlistItems, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
        switch (WhenMappings.$EnumSwitchMapping$0[objectType.ordinal()]) {
            case 1:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(instrumentId, null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 2:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new FuturesDetailFragmentKey.ByContractId(instrumentId, new Screen(Screen.Name.HOME, null, null, null, 14, null), FuturesAnalyticsStrings.ENTRY_POINT_FUTURES_CURATED_LIST), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 3:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new IndexDetailPageFragmentKey(instrumentId, (String) null, IndexDetailPageFragmentKey2.UserList.INSTANCE), false, true, false, null, false, null, false, false, null, null, 4084, null);
                return;
            case 4:
                PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.HOME_INSTRUMENT_ROW_TRADE_BAR;
                PerformanceMetricEventData.Source source = PerformanceMetricEventData.Source.SOURCE_HOME;
                PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, source, instrumentId, null, 8, null);
                InstrumentDetailSource instrumentDetailSource = InstrumentDetailSource.HOME_TAB_LIST;
                List<UUID> listEmptyList = watchlistItems.get(CuratedListObjectType.INSTRUMENT);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(instrumentId, listEmptyList, accountNumber, instrumentDetailSource, false, 16, null), false, true, false, source, false, null, false, false, null, null, 4052, null);
                return;
            case 5:
                if (optionStrategyCode != null) {
                    Navigator.DefaultImpls.showFragment$default(navigator, context, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(optionStrategyCode, false, CollectionsKt.listOf(optionStrategyCode), null, OptionsDetailPageLaunchMode4.HOME, 10, null)), false, true, false, null, false, null, false, false, null, null, 4084, null);
                    return;
                }
                return;
            case 6:
            case 7:
            case 8:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
