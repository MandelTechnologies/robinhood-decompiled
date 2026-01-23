package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.ColorResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdtHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"AdtHeader", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.AdtHeaderComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AdtHeaderComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdtHeader$lambda$1(int i, Composer composer, int i2) {
        AdtHeader(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AdtHeader(Composer composer, final int i) {
        Composer composer2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Composer composerStartRestartGroup = composer.startRestartGroup(318624280);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(318624280, i, -1, "com.robinhood.android.trade.equity.ui.configuration.selection.AdtHeader (AdtHeaderComposable.kt:14)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i2).getIsDay();
            Brush.Companion companion = Brush.INSTANCE;
            Brush brushM6677horizontalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion, new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(ColorResources_androidKt.colorResource(C29365R.color.adt_gradient_color_1, composerStartRestartGroup, 0))), Tuples4.m3642to(Float.valueOf(0.77f), Color.m6701boximpl(ColorResources_androidKt.colorResource(C29365R.color.adt_gradient_color_2, composerStartRestartGroup, 0))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(ColorResources_androidKt.colorResource(C29365R.color.adt_gradient_color_3, composerStartRestartGroup, 0)))}, 0.0f, 0.0f, 0, 14, (Object) null);
            Brush brushM6677horizontalGradient8A3gB4$default2 = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion, new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(ColorResources_androidKt.colorResource(C29365R.color.twenty_four_hour_market_button_color_1_night, composerStartRestartGroup, 0))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(ColorResources_androidKt.colorResource(C29365R.color.twenty_four_hour_market_button_color_2, composerStartRestartGroup, 0)))}, 0.0f, 0.0f, 0, 14, (Object) null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29365R.string.order_type_limit_24_hour_market_header_sep, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getTextS(), composerStartRestartGroup, 0, 0, 8188);
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29365R.string.order_type_limit_24_hour_market_header, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7654copyNs73l9s$default(bentoTheme.getTypography(composerStartRestartGroup, i2).getTextS(), isDay ? brushM6677horizontalGradient8A3gB4$default : brushM6677horizontalGradient8A3gB4$default2, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composer2, 0, 0, 8190);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.AdtHeaderComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdtHeaderComposable.AdtHeader$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
