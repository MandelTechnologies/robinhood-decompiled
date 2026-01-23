package com.robinhood.shared.recurring.p392ui.insights;

import android.content.Context;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconWithAction;
import com.robinhood.models.serverdriven.experimental.api.RecurringInsightsVisualization;
import com.robinhood.models.serverdriven.experimental.api.RecurringInsightsVisualizationData;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiRecurringInsightsVisualization.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0003¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\u00142\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0003¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"barFullHeight", "", "barWidth", "", "defaultMargin", "VisualizationTestTag", "", "SduiRecurringInsightsVisualization", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/RecurringInsightsVisualization;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/RecurringInsightsVisualization;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiRecurringInsightsVisualizationTitleSubtitle", "(Lcom/robinhood/models/serverdriven/experimental/api/RecurringInsightsVisualization;Landroidx/compose/runtime/Composer;I)V", "SduiRecurringInsightsVisualizationTitle", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/serverdriven/experimental/api/RecurringInsightsVisualizationData;", "(Lcom/robinhood/models/serverdriven/experimental/api/RecurringInsightsVisualizationData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiRecurringInsightsVisualizationBars", "dpToFloat", "context", "Landroid/content/Context;", "dpValue", "lib-recurring-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SduiRecurringInsightsVisualization2 {
    public static final String VisualizationTestTag = "visualization_test_tag";
    private static final int barFullHeight = 122;
    private static final float barWidth = 124.0f;
    private static final float defaultMargin = 24.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualization$lambda$1(RecurringInsightsVisualization recurringInsightsVisualization, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiRecurringInsightsVisualization(recurringInsightsVisualization, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationBars$lambda$10(RecurringInsightsVisualization recurringInsightsVisualization, int i, Composer composer, int i2) {
        SduiRecurringInsightsVisualizationBars(recurringInsightsVisualization, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationBars$lambda$14(RecurringInsightsVisualization recurringInsightsVisualization, int i, Composer composer, int i2) {
        SduiRecurringInsightsVisualizationBars(recurringInsightsVisualization, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationBars$lambda$9(RecurringInsightsVisualization recurringInsightsVisualization, int i, Composer composer, int i2) {
        SduiRecurringInsightsVisualizationBars(recurringInsightsVisualization, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationTitle$lambda$8(RecurringInsightsVisualizationData recurringInsightsVisualizationData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiRecurringInsightsVisualizationTitle(recurringInsightsVisualizationData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationTitleSubtitle$lambda$6(RecurringInsightsVisualization recurringInsightsVisualization, int i, Composer composer, int i2) {
        SduiRecurringInsightsVisualizationTitleSubtitle(recurringInsightsVisualization, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @SduiComposable
    public static final <ActionT extends Parcelable> void SduiRecurringInsightsVisualization(final RecurringInsightsVisualization<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-405383837);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405383837, i3, -1, "com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualization (SduiRecurringInsightsVisualization.kt:47)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i5 = i3 & 14;
            SduiRecurringInsightsVisualizationTitleSubtitle(component, composerStartRestartGroup, i5);
            SduiRecurringInsightsVisualizationBars(component, composerStartRestartGroup, i5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualization$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final <ActionT extends Parcelable> void SduiRecurringInsightsVisualizationTitleSubtitle(final RecurringInsightsVisualization<? extends ActionT> recurringInsightsVisualization, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-678865042);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(recurringInsightsVisualization) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678865042, i2, -1, "com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationTitleSubtitle (SduiRecurringInsightsVisualization.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(445729407);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            float f = 2;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue() + C2002Dp.m7995constructorimpl(barWidth)) + C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - C2002Dp.m7995constructorimpl(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue() * f)) - C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(barWidth) * f)));
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            SduiRecurringInsightsVisualizationTitle(recurringInsightsVisualization.getFirst_data(), null, composerStartRestartGroup, 0, 2);
            SduiMarkdownText2.SduiMarkdownText(recurringInsightsVisualization.getFirst_data().getSubtitle(), null, null, 0, 0, composerStartRestartGroup, 0, 30);
            composerStartRestartGroup.endNode();
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            SduiRecurringInsightsVisualizationTitle(recurringInsightsVisualization.getSecond_data(), null, composerStartRestartGroup, 0, 2);
            SduiMarkdownText2.SduiMarkdownText(recurringInsightsVisualization.getSecond_data().getSubtitle(), null, null, 0, 0, composerStartRestartGroup, 0, 30);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationTitleSubtitle$lambda$6(recurringInsightsVisualization, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT extends Parcelable> void SduiRecurringInsightsVisualizationTitle(final RecurringInsightsVisualizationData<? extends ActionT> recurringInsightsVisualizationData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        BentoIcon4 bentoIcon;
        Icon icon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(802392467);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(recurringInsightsVisualizationData) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(802392467, i3, -1, "com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationTitle (SduiRecurringInsightsVisualization.kt:86)");
                }
                IconWithAction<ActionT> title_icon = recurringInsightsVisualizationData.getTitle_icon();
                Modifier modifierThen = modifier3.then(UtilKt.onClickModifierWithNoIndication(title_icon == null ? title_icon.getAction() : null, composerStartRestartGroup, 0));
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer2 = composerStartRestartGroup;
                SduiMarkdownText2.SduiMarkdownText(recurringInsightsVisualizationData.getTitle(), null, null, 0, 0, composer2, 0, 30);
                IconWithAction<ActionT> title_icon2 = recurringInsightsVisualizationData.getTitle_icon();
                bentoIcon = (title_icon2 != null || (icon = title_icon2.getIcon()) == null) ? null : SduiIcon2.toBentoIcon(icon);
                composer2.startReplaceGroup(795774678);
                if (bentoIcon != null) {
                    BentoIcon4 bentoIcon4 = bentoIcon;
                    String icon_alt_text = title_icon2.getIcon_alt_text();
                    ThemedColor icon_color_override = title_icon2.getIcon_color_override();
                    composer2.startReplaceGroup(795780767);
                    Color composeColor = icon_color_override != null ? SduiColors2.toComposeColor(icon_color_override, composer2, 0) : null;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(795779830);
                    long jM21425getFg0d7_KjU = composeColor == null ? bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU() : composeColor.getValue();
                    composer2.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon4, icon_alt_text, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.$stable, 56);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationTitle$lambda$8(recurringInsightsVisualizationData, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            IconWithAction<ActionT> title_icon3 = recurringInsightsVisualizationData.getTitle_icon();
            Modifier modifierThen2 = modifier3.then(UtilKt.onClickModifierWithNoIndication(title_icon3 == null ? title_icon3.getAction() : null, composerStartRestartGroup, 0));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                composer2 = composerStartRestartGroup;
                SduiMarkdownText2.SduiMarkdownText(recurringInsightsVisualizationData.getTitle(), null, null, 0, 0, composer2, 0, 30);
                IconWithAction<ActionT> title_icon22 = recurringInsightsVisualizationData.getTitle_icon();
                if (title_icon22 != null) {
                    composer2.startReplaceGroup(795774678);
                    if (bentoIcon != null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final <ActionT extends Parcelable> void SduiRecurringInsightsVisualizationBars(final RecurringInsightsVisualization<? extends ActionT> recurringInsightsVisualization, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(167665724);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(recurringInsightsVisualization) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(167665724, i2, -1, "com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationBars (SduiRecurringInsightsVisualization.kt:110)");
            }
            Float accurate_size = recurringInsightsVisualization.getFirst_data().getAccurate_size();
            if (accurate_size == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationBars$lambda$9(recurringInsightsVisualization, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            float fFloatValue = accurate_size.floatValue();
            Float accurate_size2 = recurringInsightsVisualization.getSecond_data().getAccurate_size();
            if (accurate_size2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationBars$lambda$10(recurringInsightsVisualization, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            float fFloatValue2 = accurate_size2.floatValue();
            ThemedColor color = recurringInsightsVisualization.getFirst_data().getColor();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(color, bentoTheme.getColors(composerStartRestartGroup, i3).getPrimeLight(), composerStartRestartGroup, 0, 0);
            final long jM18896toComposeColorDefaultediJQMabo2 = SduiColors2.m18896toComposeColorDefaultediJQMabo(recurringInsightsVisualization.getFirst_data().getStroke_color(), bentoTheme.getColors(composerStartRestartGroup, i3).getBiome(), composerStartRestartGroup, 0, 0);
            final long jM18896toComposeColorDefaultediJQMabo3 = SduiColors2.m18896toComposeColorDefaultediJQMabo(recurringInsightsVisualization.getSecond_data().getColor(), bentoTheme.getColors(composerStartRestartGroup, i3).getPrimeLight(), composerStartRestartGroup, 0, 0);
            final long jM18896toComposeColorDefaultediJQMabo4 = SduiColors2.m18896toComposeColorDefaultediJQMabo(recurringInsightsVisualization.getSecond_data().getStroke_color(), bentoTheme.getColors(composerStartRestartGroup, i3).getBiome(), composerStartRestartGroup, 0, 0);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            float f = 122;
            final float fDpToFloat = dpToFloat(context, fFloatValue * f);
            final float fDpToFloat2 = dpToFloat(context, fFloatValue2 * f);
            final long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-2081961811);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            final float fDpToFloat3 = dpToFloat(context, barWidth);
            final float f2 = (fMo5013toDpu2uoSUM - 48.0f) - 248.0f;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f)), VisualizationTestTag);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(fDpToFloat) | composerStartRestartGroup.changed(fDpToFloat3) | composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changed(fDpToFloat2) | composerStartRestartGroup.changed(jM18896toComposeColorDefaultediJQMabo) | composerStartRestartGroup.changed(jM18896toComposeColorDefaultediJQMabo2) | composerStartRestartGroup.changed(jM18896toComposeColorDefaultediJQMabo3) | composerStartRestartGroup.changed(jM18896toComposeColorDefaultediJQMabo4) | composerStartRestartGroup.changed(jM21425getFg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationBars$lambda$13$lambda$12(context, fDpToFloat, fDpToFloat3, f2, fDpToFloat2, jM18896toComposeColorDefaultediJQMabo, jM18896toComposeColorDefaultediJQMabo2, jM18896toComposeColorDefaultediJQMabo3, jM18896toComposeColorDefaultediJQMabo4, jM21425getFg0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierTestTag, (Function1) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.SduiRecurringInsightsVisualizationKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiRecurringInsightsVisualization2.SduiRecurringInsightsVisualizationBars$lambda$14(recurringInsightsVisualization, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecurringInsightsVisualizationBars$lambda$13$lambda$12(Context context, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, long j5, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fDpToFloat = dpToFloat(context, defaultMargin);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) - f;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fDpToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        float fDpToFloat2 = dpToFloat(context, f3 + 148.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) - f4;
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fDpToFloat2) << 32));
        long jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j, jM6535constructorimpl, jM6575constructorimpl, 0.0f, null, null, 0, 120, null);
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j2, jM6535constructorimpl, jM6575constructorimpl, 0.0f, new Stroke(dpToFloat(context, 1.0f), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j3, jM6535constructorimpl2, jM6575constructorimpl2, 0.0f, null, null, 0, 120, null);
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j4, jM6535constructorimpl2, jM6575constructorimpl2, 0.0f, new Stroke(dpToFloat(context, 1.0f), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j5, jM6535constructorimpl3, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)), dpToFloat(context, 1.0f), 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    private static final float dpToFloat(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
