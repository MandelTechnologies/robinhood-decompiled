package com.robinhood.android.equityscreener.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerIndicators.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"ScreenerIndicators", "", "modifier", "Landroidx/compose/ui/Modifier;", "indicators", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "onAddFilterClick", "Lkotlin/Function0;", "onFilterClick", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.ScreenerIndicatorsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerIndicators {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIndicators$lambda$4(Modifier modifier, List list, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        ScreenerIndicators(modifier, list, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ScreenerIndicators(Modifier modifier, final List<ScreenerIndicator> indicators, final Function0<Unit> onAddFilterClick, final Function1<? super String, Unit> onFilterClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoChip2.Accessory.Selection trailingCount;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(onAddFilterClick, "onAddFilterClick");
        Intrinsics.checkNotNullParameter(onFilterClick, "onFilterClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1881090388);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(indicators) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddFilterClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFilterClick) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1881090388, i5, -1, "com.robinhood.android.equityscreener.table.ScreenerIndicators (ScreenerIndicators.kt:20)");
            }
            if (indicators.isEmpty()) {
                trailingCount = new BentoChip2.Accessory.Selection.LeadingIcon(ServerToBentoAssetMapper2.CONTROLS_16, null, 2, null);
            } else {
                trailingCount = new BentoChip2.Accessory.Selection.Dual.TrailingCount(ServerToBentoAssetMapper2.CONTROLS_16, indicators.size(), true, null, 8, null);
            }
            boolean z = false;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceGroup(-1494980269);
            String strStringResource = indicators.isEmpty() ? StringResources_androidKt.stringResource(C15652R.string.screener_table_add_filter, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoChip.BentoSelectionChip(onAddFilterClick, modifierM5146paddingqDBjuR0$default, false, false, trailingCount, strStringResource, composerStartRestartGroup, ((i5 >> 6) & 14) | (BentoChip2.Accessory.Selection.$stable << 12), 12);
            composerStartRestartGroup.startReplaceGroup(-1494974793);
            for (final ScreenerIndicator screenerIndicator : indicators) {
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                String title = screenerIndicator.getTitle();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i5 & 7168) == 2048 ? true : z) | composerStartRestartGroup.changedInstance(screenerIndicator);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.table.ScreenerIndicatorsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ScreenerIndicators.ScreenerIndicators$lambda$3$lambda$2$lambda$1$lambda$0(onFilterClick, screenerIndicator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                BentoChip.BentoSelectionChip((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, false, false, null, title, composer2, 0, 28);
                z = z;
                composerStartRestartGroup = composer2;
                modifier4 = modifier4;
            }
            modifier3 = modifier4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.table.ScreenerIndicatorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerIndicators.ScreenerIndicators$lambda$4(modifier5, indicators, onAddFilterClick, onFilterClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIndicators$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, ScreenerIndicator screenerIndicator) {
        function1.invoke(screenerIndicator.getKey());
        return Unit.INSTANCE;
    }
}
