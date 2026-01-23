package com.robinhood.android.search.highlights.p249ui.market;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.search.highlights.util.SearchHighlightFormatting;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SearchHighlightMarketPerformance.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"SearchHighlightMarketPerformanceByQuote", "", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/redesign/model/AssetQuote;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SearchHighlightDelta", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "(Lcom/robinhood/android/redesign/model/AssetQuote;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "SearchHighlightMarketPerformancePlaceHolder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-search-highlights_externalDebug", "stableWidth", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightMarketPerformance {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightDelta$lambda$8(AssetQuote assetQuote, Modifier modifier, TextStyle textStyle, int i, int i2, Composer composer, int i3) {
        SearchHighlightDelta(assetQuote, modifier, textStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMarketPerformanceByQuote$lambda$1(AssetQuote assetQuote, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightMarketPerformanceByQuote(assetQuote, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMarketPerformancePlaceHolder$lambda$11(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightMarketPerformancePlaceHolder(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightMarketPerformanceByQuote(final AssetQuote assetQuote, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1097909451);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetQuote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1097909451, i3, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceByQuote (SearchHighlightMarketPerformance.kt:34)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1678009102);
                if (assetQuote != null) {
                    WrappedTickerKt.m19244TickerTextFNF3uiM(Modifier.INSTANCE, Money.format$default(assetQuote.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), TickerTextState.Style.REGULAR_MEDIUM_BOLD, composerStartRestartGroup, 3078);
                    SearchHighlightDelta(assetQuote, null, null, composerStartRestartGroup, i3 & 14, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightMarketPerformance.SearchHighlightMarketPerformanceByQuote$lambda$1(assetQuote, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1678009102);
                if (assetQuote != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightDelta(final AssetQuote assetQuote, Modifier modifier, TextStyle textStyle, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        int i4;
        final Modifier modifier3;
        TextStyle textS;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        long jM21452getNegative0d7_KjU;
        final TextStyle textStyle3;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        long jM21452getNegative0d7_KjU2;
        final TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetQuote, "assetQuote");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1758867848);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetQuote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i7 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    textStyle2 = textStyle;
                }
                i3 |= i7;
            } else {
                textStyle2 = textStyle;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        Modifier modifier5 = modifier4;
                        i4 = i3 & (-897);
                        modifier3 = modifier5;
                        textS = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1758867848, i4, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightDelta (SearchHighlightMarketPerformance.kt:57)");
                        }
                        final TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        i5 = i4;
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(!assetQuote.getIsUp() ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                        if (assetQuote.getIsUp()) {
                            composerStartRestartGroup.startReplaceGroup(1288263860);
                            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1288200372);
                            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        TextStyle textStyle5 = textS;
                        boolean z2 = true;
                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21452getNegative0d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                        String formattedPercentChange = SearchHighlightFormatting.getFormattedPercentChange(assetQuote);
                        final int length = formattedPercentChange.length() + 1;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChanged = composerStartRestartGroup.changed(length) | composerStartRestartGroup.changed(textMeasurerRememberTextMeasurer) | composerStartRestartGroup.changed(density);
                        if (((i5 & 896) ^ 384) <= 256) {
                            textStyle3 = textStyle5;
                            if (!composerStartRestartGroup.changed(textStyle3)) {
                            }
                            z = zChanged | z2;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SearchHighlightMarketPerformance.SearchHighlightDelta$lambda$7$lambda$4$lambda$3(length, textMeasurerRememberTextMeasurer, textStyle3, density);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion3, SearchHighlightDelta$lambda$7$lambda$5((SnapshotState4) objRememberedValue), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            if (assetQuote.getIsUp()) {
                                composerStartRestartGroup.startReplaceGroup(184191024);
                                jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i8).m21452getNegative0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(184119600);
                                jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            TextStyle textStyle6 = textStyle3;
                            BentoText2.m20747BentoText38GnDrw(formattedPercentChange, null, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textStyle6, composerStartRestartGroup, 817889280, (i5 << 3) & 7168, 7546);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle4 = textStyle6;
                        } else {
                            textStyle3 = textStyle5;
                        }
                        if ((i5 & 384) != 256) {
                            z2 = false;
                        }
                        z = zChanged | z2;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchHighlightMarketPerformance.SearchHighlightDelta$lambda$7$lambda$4$lambda$3(length, textMeasurerRememberTextMeasurer, textStyle3, density);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(companion3, SearchHighlightDelta$lambda$7$lambda$5((SnapshotState4) objRememberedValue), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor22 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion2.getSetModifier());
                                if (assetQuote.getIsUp()) {
                                }
                                TextStyle textStyle62 = textStyle3;
                                BentoText2.m20747BentoText38GnDrw(formattedPercentChange, null, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textStyle62, composerStartRestartGroup, 817889280, (i5 << 3) & 7168, 7546);
                                composerStartRestartGroup = composerStartRestartGroup;
                                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textStyle4 = textStyle62;
                            }
                        }
                    } else {
                        Modifier modifier6 = modifier4;
                        i4 = i3;
                        modifier3 = modifier6;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                textS = textStyle2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final TextMeasurer textMeasurerRememberTextMeasurer2 = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    i5 = i4;
                    BentoIcon4.Size12 size122 = new BentoIcon4.Size12(!assetQuote.getIsUp() ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                    if (assetQuote.getIsUp()) {
                    }
                    TextStyle textStyle52 = textS;
                    boolean z22 = true;
                    BentoIcon2.m20644BentoIconFU0evQE(size122, null, jM21452getNegative0d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    String formattedPercentChange2 = SearchHighlightFormatting.getFormattedPercentChange(assetQuote);
                    final int length2 = formattedPercentChange2.length() + 1;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(length2) | composerStartRestartGroup.changed(textMeasurerRememberTextMeasurer2) | composerStartRestartGroup.changed(density2);
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    if ((i5 & 384) != 256) {
                    }
                    z = zChanged2 | z22;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                textStyle4 = textStyle2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightMarketPerformance.SearchHighlightDelta$lambda$8(assetQuote, modifier3, textStyle4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float SearchHighlightDelta$lambda$7$lambda$5(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp SearchHighlightDelta$lambda$7$lambda$4$lambda$3(int i, TextMeasurer textMeasurer, TextStyle textStyle, Density density) {
        return C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, StringsKt.repeat("8", i), textStyle, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
    }

    public static final void SearchHighlightMarketPerformancePlaceHolder(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357477319);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357477319, i3, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformancePlaceHolder (SearchHighlightMarketPerformance.kt:120)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal start = companion.getStart();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), start, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 7, null), true, null, 2, null);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw("$---,---.--", modifierBentoPlaceholder$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composerStartRestartGroup, 817913862, 0, 15720);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.STOCK_UP_12), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU(), ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 11, null), true, null, 2, null), null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw("+--.--%", ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889286, 0, 15736);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketPerformanceKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchHighlightMarketPerformance.SearchHighlightMarketPerformancePlaceHolder$lambda$11(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
