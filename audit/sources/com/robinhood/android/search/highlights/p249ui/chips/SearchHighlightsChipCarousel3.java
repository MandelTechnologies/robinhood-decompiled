package com.robinhood.android.search.highlights.p249ui.chips;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import search_coprocessor.p542v1.AssetChipGridDto;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightsChipCarousel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselKt$SearchHighlightsChipCarousel$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchHighlightsChipCarousel3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ AssetChipGridDto $assetChipGrid;
    final /* synthetic */ Context $context;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ ImmutableList3<AssetQuote> $quotes;
    final /* synthetic */ SnapshotState4<SearchHighlightsChipCarouselViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    SearchHighlightsChipCarousel3(ImmutableList3<? extends AssetQuote> immutableList3, SnapshotState4<SearchHighlightsChipCarouselViewState> snapshotState4, EventLogger eventLogger, AssetChipGridDto assetChipGridDto, Navigator navigator, Context context, String str) {
        this.$quotes = immutableList3;
        this.$viewState$delegate = snapshotState4;
        this.$eventLogger = eventLogger;
        this.$assetChipGrid = assetChipGridDto;
        this.$navigator = navigator;
        this.$context = context;
        this.$accountNumber = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(AssetQuote assetQuote, EventLogger eventLogger, AssetChipGridDto assetChipGridDto, Navigator navigator, Context context, String str, SnapshotState4 snapshotState4, AssetQuote quote) {
        String strName;
        Intrinsics.checkNotNullParameter(quote, "quote");
        AssetTypeDto assetTypeDto = SearchHighlightsChipCarousel.SearchHighlightsChipCarousel$lambda$3(snapshotState4).getAssetIdToType().get(assetQuote.getId().toString());
        if (assetTypeDto == null || (strName = assetTypeDto.name()) == null) {
            strName = "Unknown";
        }
        String string2 = assetQuote.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_CHIPS_" + assetChipGridDto.getId() + "_" + strName + "_" + string2, null, 5, null), null, null, false, 57, null);
        if (quote instanceof AssetQuote.Equity) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(((AssetQuote.Equity) quote).getId(), null, str, InstrumentDetailSource.SEARCH_HIGHLIGHTS, false, 18, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
        } else if (quote instanceof AssetQuote.Crypto) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(((AssetQuote.Crypto) quote).getId(), null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039278359, i, -1, "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarousel.<anonymous>.<anonymous> (SearchHighlightsChipCarousel.kt:115)");
        }
        ImmutableList3<AssetQuote> immutableList3 = this.$quotes;
        final SnapshotState4<SearchHighlightsChipCarouselViewState> snapshotState4 = this.$viewState$delegate;
        final EventLogger eventLogger = this.$eventLogger;
        final AssetChipGridDto assetChipGridDto = this.$assetChipGrid;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final String str = this.$accountNumber;
        for (final AssetQuote assetQuote : immutableList3) {
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(assetQuote) | composer.changedInstance(eventLogger) | composer.changedInstance(assetChipGridDto) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselKt$SearchHighlightsChipCarousel$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SearchHighlightsChipCarousel3.invoke$lambda$2$lambda$1$lambda$0(assetQuote, eventLogger, assetChipGridDto, navigator, context, str, snapshotState4, (AssetQuote) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            composer.endReplaceGroup();
            SearchHighlightsChipCarousel.SearchHighlightChip(assetQuote, (Function1) objRememberedValue, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
