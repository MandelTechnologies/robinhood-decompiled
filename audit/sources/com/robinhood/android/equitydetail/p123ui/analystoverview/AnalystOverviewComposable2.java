package com.robinhood.android.equitydetail.p123ui.analystoverview;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnalystOverviewComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, m3636d2 = {"NewIndicatorTestTag", "", "getNewIndicatorTestTag$annotations", "()V", "getNewIndicatorTestTag", "()Ljava/lang/String;", "NewIndicator", "", "(Landroidx/compose/runtime/Composer;I)V", "AnalystOverviewComposable", "analystOverviewData", "Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewData;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewCallbacks;", "(Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewData;Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewCallbacks;Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AnalystOverviewComposable2 {
    private static final String NewIndicatorTestTag = "newIndicator";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystOverviewComposable$lambda$9(AnalystOverviewData analystOverviewData, AnalystOverviewComposable analystOverviewComposable, int i, Composer composer, int i2) {
        AnalystOverviewComposable(analystOverviewData, analystOverviewComposable, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewIndicator$lambda$2(int i, Composer composer, int i2) {
        NewIndicator(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getNewIndicatorTestTag$annotations() {
    }

    public static final String getNewIndicatorTestTag() {
        return NewIndicatorTestTag;
    }

    private static final void NewIndicator(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554168);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554168, i, -1, "com.robinhood.android.equitydetail.ui.analystoverview.NewIndicator (AnalystOverviewComposable.kt:32)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            final long solLight = bentoTheme.getColors(composerStartRestartGroup, i2).getSolLight();
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(6)), NewIndicatorTestTag);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(solLight);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnalystOverviewComposable2.NewIndicator$lambda$1$lambda$0(solLight, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierTestTag, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalystOverviewComposable2.NewIndicator$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewIndicator$lambda$1$lambda$0(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    public static final void AnalystOverviewComposable(final AnalystOverviewData analystOverviewData, final AnalystOverviewComposable callbacks, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        boolean z;
        String str;
        int i3;
        ?? r3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(analystOverviewData, "analystOverviewData");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-585819125);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(analystOverviewData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-585819125, i2, -1, "com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposable (AnalystOverviewComposable.kt:48)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            StringResource title = analystOverviewData.getTitle();
            composerStartRestartGroup.startReplaceGroup(-532689812);
            String string2 = title == null ? null : StringResource2.getString(title, composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-532689056);
            if (string2 == null) {
                i3 = i2;
                z = true;
                str = null;
                companion = companion2;
                r3 = 0;
            } else {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                companion = companion2;
                z = true;
                str = null;
                i3 = i2;
                String str2 = string2;
                r3 = 0;
                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource updatedAtText = analystOverviewData.getUpdatedAtText();
            composerStartRestartGroup.startReplaceGroup(-532676756);
            String string3 = updatedAtText == null ? str : StringResource2.getString(updatedAtText, composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-532675844);
            if (string3 != null) {
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r3);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-758504528);
                if (analystOverviewData.getShowNewDot()) {
                    NewIndicator(composerStartRestartGroup, r3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i5).getTextS(), composer3, 0, 0, 8186);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            SdpDataRow.m13861EvenlyWeightedSdpDataGridoilTxCY(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), analystOverviewData.getDataRows(), 0, null, null, composerStartRestartGroup, 0, 28);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(analystOverviewData) | (((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? z : r3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalystOverviewComposable2.AnalystOverviewComposable$lambda$8$lambda$7$lambda$6(callbacks, analystOverviewData);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(C15314R.string.instrument_detail_full_analyst_report, composerStartRestartGroup, r3), null, null, null, false, null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.analystoverview.AnalystOverviewComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalystOverviewComposable2.AnalystOverviewComposable$lambda$9(analystOverviewData, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystOverviewComposable$lambda$8$lambda$7$lambda$6(AnalystOverviewComposable analystOverviewComposable, AnalystOverviewData analystOverviewData) {
        analystOverviewComposable.handleFullReportTap(analystOverviewData.getInstrument().getId());
        return Unit.INSTANCE;
    }
}
