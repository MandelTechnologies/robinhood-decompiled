package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposable;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoTradingOptionsInstrumentRowState3;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoExploreSearchItems.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m3636d2 = {"searchItems", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "viewState", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;", "bentoColors", "Lcom/robinhood/compose/bento/theme/BentoColors;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoExploreSearchItems {
    public static final void searchItems(LazyListScope lazyListScope, final Context context, final Navigator navigator, CryptoExploreViewState viewState, BentoColors bentoColors) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(bentoColors, "bentoColors");
        if (viewState.isSearchLoading()) {
            InstrumentListItemComposable.loadingLazyInstruments(lazyListScope, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, bentoColors.m21371getBg0d7_KjU(), null, 2, null), 15);
            return;
        }
        ImmutableList<CryptoTradingOptions.TradingOptionItem> searchOptionItems = viewState.getSearchOptionItems();
        if (searchOptionItems == null || searchOptionItems.isEmpty()) {
            return;
        }
        final ImmutableList<CryptoTradingOptions.TradingOptionItem> searchOptionItems2 = viewState.getSearchOptionItems();
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoExploreSearchItems.searchItems$lambda$0((CryptoTradingOptions.TradingOptionItem) obj);
            }
        };
        final CryptoExploreSearchItemsKt$searchItems$$inlined$items$default$1 cryptoExploreSearchItemsKt$searchItems$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$searchItems$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CryptoTradingOptions.TradingOptionItem tradingOptionItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CryptoTradingOptions.TradingOptionItem) obj);
            }
        };
        lazyListScope.items(searchOptionItems2.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$searchItems$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(searchOptionItems2.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$searchItems$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return cryptoExploreSearchItemsKt$searchItems$$inlined$items$default$1.invoke(searchOptionItems2.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$searchItems$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final CryptoTradingOptions.TradingOptionItem tradingOptionItem = (CryptoTradingOptions.TradingOptionItem) searchOptionItems2.get(i);
                composer.startReplaceGroup(1003938902);
                InstrumentRowState instrumentRowState = CryptoTradingOptionsInstrumentRowState3.toInstrumentRowState(tradingOptionItem, true, false, composer, 432, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(tradingOptionItem);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Navigator navigator2 = navigator;
                    final Context context2 = context;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreSearchItemsKt$searchItems$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(tradingOptionItem.getDeeplink()), null, null, false, null, 60, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InstrumentRow5.InstrumentRow(AutomationTestTagModifierExt.automationTestTag(LazyItemScope.animateItem$default(lazyItemScope, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, 7, null), "ResultInstrumentRow"), instrumentRowState, null, null, composer, InstrumentRowState.$stable << 3, 12);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object searchItems$lambda$0(CryptoTradingOptions.TradingOptionItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSubtitle();
    }
}
