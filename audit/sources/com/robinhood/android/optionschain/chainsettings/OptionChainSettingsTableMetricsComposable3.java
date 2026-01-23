package com.robinhood.android.optionschain.chainsettings;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.optionsstring.sbschain.OptionSideBySideChainMetricStrings;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionChainSettingsTableMetricsComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\\\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"optionChainSettingsTableMetricsSection", "", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "viewState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricViewState;", "showAllTableMetrics", "", "onEnabledTableMetricsReordered", "Lkotlin/Function2;", "", "onTableMetricCheckboxChecked", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "onShowAll", "Lkotlin/Function0;", "TableMetricsSectionHeader", "(Landroidx/compose/runtime/Composer;I)V", "TableMetricRow", "rowState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricRowViewState;", "isDragItem", "onCheckboxChecked", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricRowViewState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TABLE_METRIC_REORDERABLE_LIST_KEY_PREFIX", "", "TABLE_METRIC_COLLAPSED_NUM_OF_ROWS", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsTableMetricsComposable3 {
    private static final int TABLE_METRIC_COLLAPSED_NUM_OF_ROWS = 4;
    private static final String TABLE_METRIC_REORDERABLE_LIST_KEY_PREFIX = "table_metric_reorderable_list";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableMetricRow$lambda$9(OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState, boolean z, Function2 function2, int i, Composer composer, int i2) {
        TableMetricRow(optionChainSettingsTableMetricRowViewState, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableMetricsSectionHeader$lambda$4(int i, Composer composer, int i2) {
        TableMetricsSectionHeader(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void optionChainSettingsTableMetricsSection(ReorderableLazyListScope reorderableLazyListScope, OptionChainSettingsTableMetricViewState viewState, boolean z, final Function2<? super Integer, ? super Integer, Unit> onEnabledTableMetricsReordered, final Function2<? super OptionSideBySideChainMetric, ? super Boolean, Unit> onTableMetricCheckboxChecked, final Function0<Unit> onShowAll) {
        Iterable iterableTake;
        Iterable iterableEmptyList;
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onEnabledTableMetricsReordered, "onEnabledTableMetricsReordered");
        Intrinsics.checkNotNullParameter(onTableMetricCheckboxChecked, "onTableMetricCheckboxChecked");
        Intrinsics.checkNotNullParameter(onShowAll, "onShowAll");
        if (z) {
            iterableTake = viewState.getEnabledTableRows();
        } else {
            iterableTake = CollectionsKt.take(viewState.getEnabledTableRows(), 4);
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(iterableTake);
        if (z) {
            iterableEmptyList = viewState.getDisabledTableRows();
        } else {
            iterableEmptyList = 4 <= viewState.getEnabledTableRows().size() ? CollectionsKt.emptyList() : CollectionsKt.take(viewState.getDisabledTableRows(), 4 - viewState.getEnabledTableRows().size());
        }
        final ImmutableList3 persistentList2 = extensions2.toPersistentList(iterableEmptyList);
        LazyListScope.item$default(reorderableLazyListScope, null, null, OptionChainSettingsTableMetricsComposable.INSTANCE.m17171getLambda$673694458$feature_options_chain_externalDebug(), 3, null);
        ReorderableLazyListScope.DefaultImpls.reorderableItems$default(reorderableLazyListScope, persistentList, TABLE_METRIC_REORDERABLE_LIST_KEY_PREFIX, new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionChainSettingsTableMetricsComposable3.optionChainSettingsTableMetricsSection$lambda$0(((Integer) obj).intValue(), (OptionChainSettingsTableMetricRowViewState) obj2);
            }
        }, null, new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionChainSettingsTableMetricsComposable3.optionChainSettingsTableMetricsSection$lambda$2(onEnabledTableMetricsReordered, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, false, false, ComposableLambda3.composableLambdaInstance(799193061, true, new Function6<LazyItemScope, OptionChainSettingsTableMetricRowViewState, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt.optionChainSettingsTableMetricsSection.4
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState, Integer num, Boolean bool, Composer composer, Integer num2) {
                invoke(lazyItemScope, optionChainSettingsTableMetricRowViewState, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope reorderableItems, OptionChainSettingsTableMetricRowViewState item, int i, boolean z2, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                Intrinsics.checkNotNullParameter(item, "item");
                if ((i2 & 48) == 0) {
                    i3 = (composer.changed(item) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 3072) == 0) {
                    i3 |= composer.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 9233) == 9232 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(799193061, i3, -1, "com.robinhood.android.optionschain.chainsettings.optionChainSettingsTableMetricsSection.<anonymous> (OptionChainSettingsTableMetricsComposable.kt:53)");
                }
                OptionChainSettingsTableMetricsComposable3.TableMetricRow(item, z2, onTableMetricCheckboxChecked, composer, ((i3 >> 6) & 112) | ((i3 >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 424, null);
        LazyListScope.items$default(reorderableLazyListScope, persistentList2.size(), null, null, ComposableLambda3.composableLambdaInstance(-1080860785, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt.optionChainSettingsTableMetricsSection.5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1080860785, i2, -1, "com.robinhood.android.optionschain.chainsettings.optionChainSettingsTableMetricsSection.<anonymous> (OptionChainSettingsTableMetricsComposable.kt:60)");
                }
                OptionChainSettingsTableMetricsComposable3.TableMetricRow(persistentList2.get(i), false, onTableMetricCheckboxChecked, composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        if (z) {
            return;
        }
        LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1943026977, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt.optionChainSettingsTableMetricsSection.6
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943026977, i, -1, "com.robinhood.android.optionschain.chainsettings.optionChainSettingsTableMetricsSection.<anonymous> (OptionChainSettingsTableMetricsComposable.kt:68)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                BentoTextButton2.m20715BentoTextButtonPIknLig(onShowAll, StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_show_all_button, composer, 0), modifierM5146paddingqDBjuR0$default, null, null, false, null, composer, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String optionChainSettingsTableMetricsSection$lambda$0(int i, OptionChainSettingsTableMetricRowViewState item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getMetric().name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit optionChainSettingsTableMetricsSection$lambda$2(Function2 function2, int i, int i2) {
        function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TableMetricsSectionHeader(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1939797487);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1939797487, i, -1, "com.robinhood.android.optionschain.chainsettings.TableMetricsSectionHeader (OptionChainSettingsTableMetricsComposable.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i2).m21425getFg0d7_KjU();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metrics_section_title, composerStartRestartGroup, 0), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getTextM(), composer2, 24576, 0, 8168);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsTableMetricsComposable3.TableMetricsSectionHeader$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TableMetricRow(final OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState, final boolean z, final Function2<? super OptionSideBySideChainMetric, ? super Boolean, Unit> function2, Composer composer, final int i) {
        int i2;
        long jM21373getBg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757466655);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionChainSettingsTableMetricRowViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757466655, i2, -1, "com.robinhood.android.optionschain.chainsettings.TableMetricRow (OptionChainSettingsTableMetricsComposable.kt:99)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            int i4 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DRAG_24);
            if (optionChainSettingsTableMetricRowViewState.getEnabled()) {
                composerStartRestartGroup.startReplaceGroup(1067366603);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1067432106);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21373getBg30d7_KjU, companion, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 3120, 48);
            Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            OptionSideBySideChainMetric metric = optionChainSettingsTableMetricRowViewState.getMetric();
            Intrinsics.checkNotNull(resources);
            BentoText2.m20747BentoText38GnDrw(OptionSideBySideChainMetricStrings.getOptionSideBySideChainMetricLongString(metric, resources), modifierWeight$default, null, null, null, null, null, 0, false, 1, 0, null, 0, textM, composerStartRestartGroup, 805306368, 0, 7676);
            boolean enabled = optionChainSettingsTableMetricRowViewState.getEnabled();
            Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsTableMetricsComposable3.TableMetricRow$lambda$8$lambda$7$lambda$6$lambda$5(function2, optionChainSettingsTableMetricRowViewState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, enabled, false, colorM6701boximpl, (Function1) objRememberedValue, composerStartRestartGroup, 0, 5);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(121448649);
            if (!z) {
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsTableMetricsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsTableMetricsComposable3.TableMetricRow$lambda$9(optionChainSettingsTableMetricRowViewState, z, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableMetricRow$lambda$8$lambda$7$lambda$6$lambda$5(Function2 function2, OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState, boolean z) {
        function2.invoke(optionChainSettingsTableMetricRowViewState.getMetric(), Boolean.valueOf(!optionChainSettingsTableMetricRowViewState.getEnabled()));
        return Unit.INSTANCE;
    }
}
