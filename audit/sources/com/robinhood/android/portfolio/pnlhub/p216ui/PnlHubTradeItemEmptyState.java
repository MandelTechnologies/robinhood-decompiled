package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubTradeItemEmptyState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"PnlHubTradeItemEmptyState", "", "chartSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Landroidx/compose/runtime/Composer;I)V", "toEmptyStateString", "", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeItemEmptyStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubTradeItemEmptyState {

    /* compiled from: PnlHubTradeItemEmptyState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeItemEmptyStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTradeItemEmptyState$lambda$1(DisplaySpan displaySpan, int i, Composer composer, int i2) {
        PnlHubTradeItemEmptyState(displaySpan, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PnlHubTradeItemEmptyState(final DisplaySpan chartSpan, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(chartSpan, "chartSpan");
        Composer composerStartRestartGroup = composer.startRestartGroup(541925145);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(chartSpan.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(541925145, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeItemEmptyState (PnlHubTradeItemEmptyState.kt:14)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_empty_state, new Object[]{toEmptyStateString(chartSpan, composerStartRestartGroup, i2 & 14)}, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composer2, 0, 0, 8190);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_closed_trades, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 0, 0, 8186);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeItemEmptyStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubTradeItemEmptyState.PnlHubTradeItemEmptyState$lambda$1(chartSpan, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String toEmptyStateString(DisplaySpan displaySpan, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        composer.startReplaceGroup(1800200968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1800200968, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.toEmptyStateString (PnlHubTradeItemEmptyState.kt:36)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-878686858);
            strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_empty_state_w, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-878684554);
            strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_empty_state_m, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(-878682153);
            strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_empty_state_3m, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 4) {
            composer.startReplaceGroup(-878679880);
            strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_empty_state_ytd, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1469213418);
            composer.endReplaceGroup();
            strStringResource = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }
}
