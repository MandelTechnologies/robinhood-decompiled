package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerChartHeader.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerChartHeader", "", "aggregatedGreeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "headerState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onChartHeaderEyebrowClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "(Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerChartHeader {

    /* compiled from: OptionsPortfolioRiskAnalyzerChartHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTheme4.values().length];
            try {
                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerChartHeader$lambda$6(OptionsGreeks optionsGreeks, OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerChartHeader(optionsGreeks, portfolioRiskAnalyzerHeader, optionsPortfolioRiskAnalyzerChartHeaderViewState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerChartHeader(final OptionsGreeks aggregatedGreeks, final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, final OptionsPortfolioRiskAnalyzerChartHeaderViewState viewState, Modifier modifier, final Function1<? super FragmentKey, Unit> onChartHeaderEyebrowClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoTheme bentoTheme;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i5;
        long jM21456getPositive0d7_KjU;
        int i6;
        long jM21456getPositive0d7_KjU2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i7;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(aggregatedGreeks, "aggregatedGreeks");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onChartHeaderEyebrowClicked, "onChartHeaderEyebrowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011821375);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(aggregatedGreeks) : composerStartRestartGroup.changedInstance(aggregatedGreeks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(portfolioRiskAnalyzerHeader) : composerStartRestartGroup.changedInstance(portfolioRiskAnalyzerHeader) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartHeaderEyebrowClicked) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2011821375, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeader (OptionsPortfolioRiskAnalyzerChartHeader.kt:32)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 9) & 14, 1);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 5, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(viewState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerChartHeader.m2254xe929a3ef(viewState, onChartHeaderEyebrowClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                String underlyingSymbol = viewState.getUnderlyingSymbol();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                int i9 = i3;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(underlyingSymbol, modifierM5146paddingqDBjuR0$default2, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8172);
                Intrinsics.checkNotNull(resources);
                String underlyingPriceAndPercentageChangeString = viewState.getUnderlyingPriceAndPercentageChangeString(resources);
                TextStyle textS2 = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                FontWeight bold = companion4.getBold();
                BentoTheme4 underlyingChangeDirection = viewState.getUnderlyingChangeDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i5 = iArr[underlyingChangeDirection.ordinal()];
                if (i5 != 1) {
                    composerStartRestartGroup.startReplaceGroup(2060801731);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 2) {
                        composerStartRestartGroup.startReplaceGroup(2060798563);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(2060803939);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(underlyingPriceAndPercentageChangeString, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup.endNode();
                if (portfolioRiskAnalyzerHeader != null || (strInvoke = portfolioRiskAnalyzerHeader.getTotalReturn().invoke(resources)) == null) {
                    String strInvoke = "";
                }
                BentoText2.m20747BentoText38GnDrw(strInvoke, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8190);
                BentoTheme4 totalReturnDirection = portfolioRiskAnalyzerHeader == null ? portfolioRiskAnalyzerHeader.getTotalReturnDirection() : null;
                i6 = totalReturnDirection != null ? -1 : iArr[totalReturnDirection.ordinal()];
                if (i6 != -1 || i6 == 1) {
                    composerStartRestartGroup.startReplaceGroup(670638143);
                    jM21456getPositive0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i6 != 2) {
                        composerStartRestartGroup.startReplaceGroup(670635083);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(670640095);
                    jM21456getPositive0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = jM21456getPositive0d7_KjU2;
                Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Modifier modifierM5146paddingqDBjuR0$default4 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21597getXxsmallD9Ej5fM(), 0.0f, 11, null);
                BentoTheme4 totalReturnDirection2 = portfolioRiskAnalyzerHeader == null ? portfolioRiskAnalyzerHeader.getTotalReturnDirection() : null;
                i7 = totalReturnDirection2 != null ? -1 : iArr[totalReturnDirection2.ordinal()];
                if (i7 != -1 || i7 == 1) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_16;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_16;
                }
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, j, modifierM5146paddingqDBjuR0$default4, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                BentoText2.m20747BentoText38GnDrw(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getNoSignWithHundredthDecimalPercentFormat(), portfolioRiskAnalyzerHeader == null ? portfolioRiskAnalyzerHeader.getTotalReturnPercentage() : null, null, 2, null), null, Color.m6701boximpl(j), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_chart_header_total_return, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                OptionsPortfolioRiskAnalyzerGreeks.OptionsPortfolioRiskAnalyzerGreeks(aggregatedGreeks, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null), composerStartRestartGroup, OptionsGreeks.$stable | (i9 & 14), 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerChartHeader.OptionsPortfolioRiskAnalyzerChartHeader$lambda$6(aggregatedGreeks, portfolioRiskAnalyzerHeader, viewState, modifier3, onChartHeaderEyebrowClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 9) & 14, 1);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default5 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 5, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(viewState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerChartHeader.m2254xe929a3ef(viewState, onChartHeaderEyebrowClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default5, false, null, null, (Function0) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                        String underlyingSymbol2 = viewState.getUnderlyingSymbol();
                        TextStyle textS3 = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                        FontWeight.Companion companion42 = FontWeight.INSTANCE;
                        int i92 = i3;
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(underlyingSymbol2, modifierM5146paddingqDBjuR0$default22, null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, textS3, composerStartRestartGroup, 24576, 0, 8172);
                        Intrinsics.checkNotNull(resources2);
                        String underlyingPriceAndPercentageChangeString2 = viewState.getUnderlyingPriceAndPercentageChangeString(resources2);
                        TextStyle textS22 = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                        FontWeight bold2 = companion42.getBold();
                        BentoTheme4 underlyingChangeDirection2 = viewState.getUnderlyingChangeDirection();
                        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                        i5 = iArr2[underlyingChangeDirection2.ordinal()];
                        if (i5 != 1) {
                        }
                        BentoText2.m20747BentoText38GnDrw(underlyingPriceAndPercentageChangeString2, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, bold2, null, null, 0, false, 0, 0, null, 0, textS22, composerStartRestartGroup, 24576, 0, 8170);
                        composerStartRestartGroup.endNode();
                        if (portfolioRiskAnalyzerHeader != null) {
                            String strInvoke2 = "";
                            BentoText2.m20747BentoText38GnDrw(strInvoke2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8190);
                            if (portfolioRiskAnalyzerHeader == null) {
                            }
                            if (totalReturnDirection != null) {
                            }
                            if (i6 != -1) {
                                composerStartRestartGroup.startReplaceGroup(670638143);
                                jM21456getPositive0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21456getPositive0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                                long j2 = jM21456getPositive0d7_KjU2;
                                Modifier modifierM5146paddingqDBjuR0$default32 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion5.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default32);
                                Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                    Modifier modifierM5146paddingqDBjuR0$default42 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21597getXxsmallD9Ej5fM(), 0.0f, 11, null);
                                    if (portfolioRiskAnalyzerHeader == null) {
                                    }
                                    if (totalReturnDirection2 != null) {
                                    }
                                    if (i7 != -1) {
                                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_16;
                                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, j2, modifierM5146paddingqDBjuR0$default42, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                                        BentoText2.m20747BentoText38GnDrw(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getNoSignWithHundredthDecimalPercentFormat(), portfolioRiskAnalyzerHeader == null ? portfolioRiskAnalyzerHeader.getTotalReturnPercentage() : null, null, 2, null), null, Color.m6701boximpl(j2), null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_chart_header_total_return, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8188);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.endNode();
                                        OptionsPortfolioRiskAnalyzerGreeks.OptionsPortfolioRiskAnalyzerGreeks(aggregatedGreeks, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null), composerStartRestartGroup, OptionsGreeks.$stable | (i92 & 14), 0);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartHeader$lambda$5$lambda$2$lambda$1 */
    public static final Unit m2254xe929a3ef(OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState, Function1 function1) {
        FragmentKey underlyingDetailPageFragmentKey = optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingDetailPageFragmentKey();
        if (underlyingDetailPageFragmentKey != null) {
            function1.invoke(underlyingDetailPageFragmentKey);
        }
        return Unit.INSTANCE;
    }
}
