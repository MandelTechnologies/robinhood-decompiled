package com.robinhood.android.pictureinpicture.pip.shared;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: ChartDataPerformanceComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"ChartDataPerformanceComposable", "", "displayData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PercentageChangeRow", "displayText", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "(Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Landroidx/compose/runtime/Composer;I)V", "feature-pip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ChartDataPerformanceComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartDataPerformanceComposable$lambda$4(CursorData cursorData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartDataPerformanceComposable(cursorData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PercentageChangeRow$lambda$9(CursorData.SubDisplayText subDisplayText, int i, Composer composer, int i2) {
        PercentageChangeRow(subDisplayText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartDataPerformanceComposable(final com.robinhood.models.serverdriven.experimental.api.CursorData cursorData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        CursorData.DisplayText primaryValue;
        int i5;
        CursorData.SubDisplayText secondaryValue;
        CursorData.SubDisplayText tertiaryValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(153913094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cursorData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(153913094, i4, -1, "com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposable (ChartDataPerformanceComposable.kt:31)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                composerStartRestartGroup.startReplaceGroup(1352349123);
                com.robinhood.android.charts.cursor.CursorData composableModel = cursorData != null ? null : SduiCursorData2.toComposableModel(cursorData, composerStartRestartGroup, i4 & 14);
                composerStartRestartGroup.endReplaceGroup();
                primaryValue = composableModel == null ? composableModel.getPrimaryValue() : null;
                composerStartRestartGroup.startReplaceGroup(1352350484);
                if (primaryValue != null) {
                    i5 = i7;
                } else {
                    i5 = i7;
                    WrappedTickerKt.m19244TickerTextFNF3uiM(Modifier.INSTANCE, primaryValue.getValue(), bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), TickerTextState.Style.REGULAR_MEDIUM_BOLD, composerStartRestartGroup, 3078);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1352362467);
                com.robinhood.android.charts.cursor.CursorData composableModel2 = cursorData != null ? null : SduiCursorData2.toComposableModel(cursorData, composerStartRestartGroup, i4 & 14);
                composerStartRestartGroup.endReplaceGroup();
                secondaryValue = composableModel2 == null ? composableModel2.getSecondaryValue() : null;
                tertiaryValue = composableModel2 != null ? composableModel2.getTertiaryValue() : null;
                composerStartRestartGroup.startReplaceGroup(1352369295);
                if (secondaryValue != null) {
                    PercentageChangeRow(secondaryValue, composerStartRestartGroup, CursorData.SubDisplayText.$stable);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1352372399);
                if (tertiaryValue != null) {
                    PercentageChangeRow(tertiaryValue, composerStartRestartGroup, CursorData.SubDisplayText.$stable);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartDataPerformanceComposable.ChartDataPerformanceComposable$lambda$4(cursorData, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
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
                composerStartRestartGroup.startReplaceGroup(1352349123);
                if (cursorData != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (composableModel == null) {
                }
                composerStartRestartGroup.startReplaceGroup(1352350484);
                if (primaryValue != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1352362467);
                if (cursorData != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (composableModel2 == null) {
                }
                if (composableModel2 != null) {
                }
                composerStartRestartGroup.startReplaceGroup(1352369295);
                if (secondaryValue != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1352372399);
                if (tertiaryValue != null) {
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

    private static final void PercentageChangeRow(final CursorData.SubDisplayText subDisplayText, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1707413213);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subDisplayText) : composerStartRestartGroup.changedInstance(subDisplayText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1707413213, i2, -1, "com.robinhood.android.pictureinpicture.pip.shared.PercentageChangeRow (ChartDataPerformanceComposable.kt:59)");
            }
            int i3 = CursorData.SubDisplayText.$stable;
            int i4 = i2 & 14;
            CursorData.IconDisplayText main = UtilKt.widgetStyle(subDisplayText, composerStartRestartGroup, i3 | i4).getMain();
            CursorData.DisplayText description = UtilKt.widgetStyle(subDisplayText, composerStartRestartGroup, i3 | i4).getDescription();
            Modifier modifierDrawMask = ModifiersKt.drawMask(Modifier.INSTANCE, main.getGradientColorBrush());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(2)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ServerToBentoAssetMapper2.Companion companion2 = ServerToBentoAssetMapper2.INSTANCE;
            Icon icon = main.getIcon();
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion2.fromServerValue(icon != null ? icon.getServerValue() : null);
            composerStartRestartGroup.startReplaceGroup(-2078755675);
            if (serverToBentoAssetMapper2FromServerValue != null) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = ChartDataPerformanceComposable2.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE((BentoIcon4) ((Function1) ((KFunction) objRememberedValue)).invoke(serverToBentoAssetMapper2FromServerValue), null, StaleState2.m12177orStaleek8zF_U(main.m12002getColor0d7_KjU(), composerStartRestartGroup, 0), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
            String widgetPerformanceString = UtilKt.toWidgetPerformanceString(main.getValue());
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            int iM7958getClipgIe3tQ8 = companion3.m7958getClipgIe3tQ8();
            long jM12177orStaleek8zF_U = StaleState2.m12177orStaleek8zF_U(main.m12002getColor0d7_KjU(), composerStartRestartGroup, 0);
            TextStyle style = main.getStyle();
            composerStartRestartGroup.startReplaceGroup(-2078740785);
            if (style == null) {
                style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(widgetPerformanceString, null, Color.m6701boximpl(jM12177orStaleek8zF_U), null, null, null, null, iM7958getClipgIe3tQ8, false, 1, 0, null, 0, style, composerStartRestartGroup, 817889280, 0, 7546);
            composerStartRestartGroup.startReplaceGroup(-2078737334);
            if (description == null) {
                composer2 = composerStartRestartGroup;
            } else {
                int iM7958getClipgIe3tQ82 = companion3.m7958getClipgIe3tQ8();
                String value = description.getValue();
                TextStyle style2 = description.getStyle();
                FontStyle fontStyleM7663getFontStyle4Lr2A7w = style2 != null ? style2.m7663getFontStyle4Lr2A7w() : null;
                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                TextStyle style3 = main.getStyle();
                composerStartRestartGroup.startReplaceGroup(-2078728369);
                if (style3 == null) {
                    style3 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM21425getFg0d7_KjU), fontStyleM7663getFontStyle4Lr2A7w, null, null, null, iM7958getClipgIe3tQ82, false, 1, 0, null, 0, style3, composer2, 817889280, 0, 7538);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartDataPerformanceComposable.PercentageChangeRow$lambda$9(subDisplayText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
