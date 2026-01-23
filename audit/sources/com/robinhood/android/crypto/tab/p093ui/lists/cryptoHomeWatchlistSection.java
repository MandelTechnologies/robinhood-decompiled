package com.robinhood.android.crypto.tab.p093ui.lists;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: cryptoHomeWatchlistSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class cryptoHomeWatchlistSection {
    public static final cryptoHomeWatchlistSection INSTANCE = new cryptoHomeWatchlistSection();
    private static Function3<CuratedListState.Loaded, Composer, Integer, Unit> lambda$462236283 = ComposableLambda3.composableLambdaInstance(462236283, false, new Function3<CuratedListState.Loaded, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistSectionKt$lambda$462236283$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListState.Loaded loaded, Composer composer, Integer num) {
            invoke(loaded, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(CuratedListState.Loaded it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462236283, i, -1, "com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistSectionKt.lambda$462236283.<anonymous> (cryptoHomeWatchlistSection.kt:32)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            CryptoHomeWatchlistTitle.CryptoHomeWatchlistTitle(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Row5, Composer, Integer, Unit> lambda$369857483 = ComposableLambda3.composableLambdaInstance(369857483, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistSectionKt$lambda$369857483$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 curatedList, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(curatedList, "$this$curatedList");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(369857483, i, -1, "com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistSectionKt.lambda$369857483.<anonymous> (cryptoHomeWatchlistSection.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRASH_24), StringResources_androidKt.stringResource(C13013R.string.crypto_home_watchlist_deletion_icon_content_description, composer, 0), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 2, null), null, false, composer, BentoIcon4.Size24.$stable, 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<Row5, Composer, Integer, Unit> getLambda$369857483$feature_crypto_tab_externalDebug() {
        return lambda$369857483;
    }

    public final Function3<CuratedListState.Loaded, Composer, Integer, Unit> getLambda$462236283$feature_crypto_tab_externalDebug() {
        return lambda$462236283;
    }
}
