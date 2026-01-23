package com.robinhood.android.options.lib.simulatedreturn.header;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsSimulatedReturnProfitLossHeader.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aQ\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"OptionsSimulatedReturnProfitLossHeader", "", "viewState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "isFullyExpanded", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MetricCell", "Landroidx/compose/foundation/layout/RowScope;", AnnotatedPrivateKey.LABEL, "", "value", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "valueColor", "Landroidx/compose/ui/graphics/Color;", "valueTextAlign", "Landroidx/compose/ui/text/style/TextAlign;", "valueFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "MetricCell-lZTUmFU", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/runtime/Composer;II)V", "lib-options-simulated-return_externalDebug", "rowVerticalPadding", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeaderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnProfitLossHeader {

    /* compiled from: OptionsSimulatedReturnProfitLossHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeaderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedChartHeaderState2.values().length];
            try {
                iArr[OptionsSimulatedChartHeaderState2.f4734UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedChartHeaderState2.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCell_lZTUmFU$lambda$4(Row5 row5, String str, String str2, Alignment.Horizontal horizontal, Color color, TextAlign textAlign, FontWeight fontWeight, int i, int i2, Composer composer, int i3) {
        m16958MetricCelllZTUmFU(row5, str, str2, horizontal, color, textAlign, fontWeight, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnProfitLossHeader$lambda$2(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturnProfitLossHeader(optionsSimulatedChartHeaderState, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsSimulatedReturnProfitLossHeader(final OptionsSimulatedChartHeaderState viewState, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float fM21593getSmallD9Ej5fM;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21456getPositive0d7_KjU;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1893311255);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1893311255, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeader (OptionsSimulatedReturnProfitLossHeader.kt:25)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1594027566);
                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1594026544);
                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM21593getSmallD9Ej5fM, null, "rowVerticalPadding", null, composerStartRestartGroup, 384, 10);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), OptionsSimulatedReturnProfitLossHeader$lambda$0(snapshotState4M4812animateDpAsStateAjpBEmI));
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                if (!(viewState instanceof OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader)) {
                    composerStartRestartGroup.startReplaceGroup(-616066397);
                    String strStringResource = StringResources_androidKt.stringResource(C23151R.string.options_profit_and_loss_header_max_profit_label, composerStartRestartGroup, 0);
                    OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader optionsProfitAndLossMetricsHeader = (OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader) viewState;
                    Function1<Resources, String> maxProfit = optionsProfitAndLossMetricsHeader.getMaxProfit();
                    Intrinsics.checkNotNull(resources);
                    m16958MetricCelllZTUmFU(row6, strStringResource, maxProfit.invoke(resources), companion.getStart(), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, composerStartRestartGroup, 3078, 48);
                    m16958MetricCelllZTUmFU(row6, StringResources_androidKt.stringResource(C23151R.string.options_profit_and_loss_header_breakeven_label, composerStartRestartGroup, 0), optionsProfitAndLossMetricsHeader.getBreakeven().invoke(resources), companion.getCenterHorizontally(), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), null, composerStartRestartGroup, 3078, 32);
                    m16958MetricCelllZTUmFU(row6, StringResources_androidKt.stringResource(C23151R.string.options_profit_and_loss_header_max_loss_label, composerStartRestartGroup, 0), optionsProfitAndLossMetricsHeader.getMaxLoss().invoke(resources), companion.getEnd(), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, composerStartRestartGroup, 3078, 48);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (viewState instanceof OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader) {
                    composerStartRestartGroup.startReplaceGroup(-614959418);
                    String strStringResource2 = StringResources_androidKt.stringResource(C23151R.string.options_simulated_return_header_est_profit_loss, composerStartRestartGroup, 0);
                    OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader optionsSimulatedReturnHeader = (OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader) viewState;
                    Function1<Resources, String> tickerText = optionsSimulatedReturnHeader.getTickerText();
                    Intrinsics.checkNotNull(resources);
                    String strInvoke = tickerText.invoke(resources);
                    int i6 = WhenMappings.$EnumSwitchMapping$0[optionsSimulatedReturnHeader.getTickerDirection().ordinal()];
                    if (i6 == 1) {
                        composerStartRestartGroup.startReplaceGroup(672908885);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 2) {
                            composerStartRestartGroup.startReplaceGroup(672905913);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(672911285);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    m16958MetricCelllZTUmFU(row6, strStringResource2, strInvoke, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, FontWeight.INSTANCE.getBold(), composerStartRestartGroup, 1572870, 20);
                    m16958MetricCelllZTUmFU(row6, StringResources_androidKt.stringResource(optionsSimulatedReturnHeader.getEstimatedContractPriceLabelRes(), composerStartRestartGroup, 0), optionsSimulatedReturnHeader.getEstimatedContractPriceValue().invoke(resources), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, composerStartRestartGroup, 6, 52);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(672924241);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsSimulatedReturnProfitLossHeader.OptionsSimulatedReturnProfitLossHeader$lambda$2(viewState, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM21593getSmallD9Ej5fM, null, "rowVerticalPadding", null, composerStartRestartGroup, 384, 10);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), OptionsSimulatedReturnProfitLossHeader$lambda$0(snapshotState4M4812animateDpAsStateAjpBEmI2));
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion3.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                if (!(viewState instanceof OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader)) {
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float OptionsSimulatedReturnProfitLossHeader$lambda$0(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103  */
    /* renamed from: MetricCell-lZTUmFU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m16958MetricCelllZTUmFU(final Row5 row5, final String str, final String str2, Alignment.Horizontal horizontal, Color color, TextAlign textAlign, FontWeight fontWeight, Composer composer, final int i, final int i2) {
        Row5 row52;
        int i3;
        String str3;
        String str4;
        int i4;
        Alignment.Horizontal start;
        int i5;
        Color color2;
        int i6;
        TextAlign textAlign2;
        int i7;
        FontWeight fontWeight2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Alignment.Horizontal horizontal2;
        final Color color3;
        final FontWeight fontWeight3;
        final TextAlign textAlign3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1886813016);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            row52 = row5;
        } else {
            row52 = row5;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            if ((i2 & 2) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                i4 = i2 & 4;
                if (i4 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        start = horizontal;
                        i3 |= composerStartRestartGroup.changed(start) ? 2048 : 1024;
                    }
                    i5 = i2 & 8;
                    if (i5 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            color2 = color;
                            i3 |= composerStartRestartGroup.changed(color2) ? 16384 : 8192;
                        }
                        i6 = i2 & 16;
                        if (i6 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                textAlign2 = textAlign;
                                i3 |= composerStartRestartGroup.changed(textAlign2) ? 131072 : 65536;
                            }
                            i7 = i2 & 32;
                            if (i7 != 0) {
                                if ((1572864 & i) == 0) {
                                    fontWeight2 = fontWeight;
                                    i3 |= composerStartRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                                }
                                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    if (i4 != 0) {
                                        start = Alignment.INSTANCE.getStart();
                                    }
                                    Color color4 = i5 == 0 ? null : color2;
                                    TextAlign textAlign4 = i6 == 0 ? null : textAlign2;
                                    FontWeight fontWeight4 = i7 == 0 ? fontWeight2 : null;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1886813016, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.header.MetricCell (OptionsSimulatedReturnProfitLossHeader.kt:92)");
                                    }
                                    Modifier modifierWeight$default = Row5.weight$default(row52, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    int i8 = i3 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composerStartRestartGroup, ((i8 & 896) >> 3) & 112);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                                    FontWeight fontWeight5 = fontWeight4;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    composer2 = composerStartRestartGroup;
                                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextS(), composer2, i8 & 14, 0, 8186);
                                    Color color5 = color4;
                                    TextAlign textAlign5 = textAlign4;
                                    BentoText2.m20747BentoText38GnDrw(str4, null, color5, null, fontWeight5, null, textAlign5, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i9).getTextS(), composer2, ((i3 >> 6) & 58254) | (3670016 & (i3 << 3)), 0, 8106);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    horizontal2 = start;
                                    color3 = color5;
                                    fontWeight3 = fontWeight5;
                                    textAlign3 = textAlign5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                    horizontal2 = start;
                                    color3 = color2;
                                    textAlign3 = textAlign2;
                                    fontWeight3 = fontWeight2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeaderKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return OptionsSimulatedReturnProfitLossHeader.MetricCell_lZTUmFU$lambda$4(row5, str, str2, horizontal2, color3, textAlign3, fontWeight3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            fontWeight2 = fontWeight;
                            if ((599187 & i3) != 599186) {
                                if (i4 != 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifierWeight$default2 = Row5.weight$default(row52, Modifier.INSTANCE, 1.0f, false, 2, null);
                                int i82 = i3 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composerStartRestartGroup, ((i82 & 896) >> 3) & 112);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                FontWeight fontWeight52 = fontWeight4;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i92 = BentoTheme.$stable;
                                    composer2 = composerStartRestartGroup;
                                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i92).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextS(), composer2, i82 & 14, 0, 8186);
                                    Color color52 = color4;
                                    TextAlign textAlign52 = textAlign4;
                                    BentoText2.m20747BentoText38GnDrw(str4, null, color52, null, fontWeight52, null, textAlign52, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i92).getTextS(), composer2, ((i3 >> 6) & 58254) | (3670016 & (i3 << 3)), 0, 8106);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    horizontal2 = start;
                                    color3 = color52;
                                    fontWeight3 = fontWeight52;
                                    textAlign3 = textAlign52;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        textAlign2 = textAlign;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                        }
                        fontWeight2 = fontWeight;
                        if ((599187 & i3) != 599186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    color2 = color;
                    i6 = i2 & 16;
                    if (i6 != 0) {
                    }
                    textAlign2 = textAlign;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    fontWeight2 = fontWeight;
                    if ((599187 & i3) != 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                start = horizontal;
                i5 = i2 & 8;
                if (i5 == 0) {
                }
                color2 = color;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                textAlign2 = textAlign;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                fontWeight2 = fontWeight;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str2;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            start = horizontal;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            color2 = color;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            textAlign2 = textAlign;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            fontWeight2 = fontWeight;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        if ((i2 & 2) == 0) {
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        start = horizontal;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        color2 = color;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        textAlign2 = textAlign;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        fontWeight2 = fontWeight;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
