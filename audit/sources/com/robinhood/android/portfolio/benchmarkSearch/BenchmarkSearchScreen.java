package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.android.models.portfolio.BenchmarkingSearchElement;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchStateProvider3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.app.type.AppType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BenchmarkSearchScreen.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a±\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2'\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\u0016\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u001fX\u008a\u008e\u0002"}, m3636d2 = {"BenchmarkSearchScreen", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "state", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onBack", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "Lkotlin/ParameterName;", "name", "benchmarks", "onQueryChanged", "", "onOpenInstrumentDetails", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchElement;", "element", "onSelectionLimited", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MAX_BENCHMARKS", "", "feature-portfolio_externalDebug", "selectedBenchmarks", "Lkotlinx/collections/immutable/ImmutableMap;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreenKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarkSearchScreen {
    public static final int MAX_BENCHMARKS = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchScreen$lambda$12(AppType appType, BenchmarkSearchStateProvider3.Ready ready, SduiActionHandler sduiActionHandler, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BenchmarkSearchScreen(appType, ready, sduiActionHandler, function0, function1, function12, function13, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BenchmarkSearchScreen(final AppType appType, final BenchmarkSearchStateProvider3.Ready state, final SduiActionHandler<? super GenericAction> actionHandler, final Function0<Unit> onBack, final Function1<? super List<BenchmarkSelection>, Unit> onSave, final Function1<? super String, Unit> onQueryChanged, final Function1<? super BenchmarkingSearchElement, Unit> onOpenInstrumentDetails, final Function0<Unit> onSelectionLimited, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Intrinsics.checkNotNullParameter(onQueryChanged, "onQueryChanged");
        Intrinsics.checkNotNullParameter(onOpenInstrumentDetails, "onOpenInstrumentDetails");
        Intrinsics.checkNotNullParameter(onSelectionLimited, "onSelectionLimited");
        Composer composerStartRestartGroup = composer.startRestartGroup(2140389377);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(appType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSave) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQueryChanged) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenInstrumentDetails) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectionLimited) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2140389377, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreen (BenchmarkSearchScreen.kt:37)");
            }
            ImmutableList<BenchmarkSelection> selectedBenchmarks = state.getSelectedBenchmarks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(selectedBenchmarks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ImmutableList<BenchmarkSelection> selectedBenchmarks2 = state.getSelectedBenchmarks();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(selectedBenchmarks2, 10)), 16));
                for (BenchmarkSelection benchmarkSelection : selectedBenchmarks2) {
                    linkedHashMap.put(benchmarkSelection.getId(), benchmarkSelection);
                }
                objRememberedValue = SnapshotState3.mutableStateOf$default(extensions2.toImmutableMap(linkedHashMap), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Collection<BenchmarkSelection> collectionValues = BenchmarkSearchScreen$lambda$2(snapshotState).values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(((BenchmarkSelection) it.next()).getSymbol());
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            boolean zIsSaving = state.isSaving();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | ((57344 & i3) == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkSearchScreen.BenchmarkSearchScreen$lambda$11$lambda$6$lambda$5(onSave, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier5 = modifier4;
            int i5 = i3;
            BenchmarkSearchAppBar.BenchmarkSearchAppBar(modifierM5146paddingqDBjuR0$default, immutableList, zIsSaving, onBack, (Function0) objRememberedValue2, composerStartRestartGroup, i3 & 7168, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BenchmarkSearchTextInput.BenchmarkSearchTextInput(appType, state, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), onQueryChanged, composerStartRestartGroup, (i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i5 >> 6) & 7168), 0);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            BenchmarkingSearchResults searchResults = state.getSearchResults();
            ImmutableMap<String, BenchmarkSelection> immutableMapBenchmarkSearchScreen$lambda$2 = BenchmarkSearchScreen$lambda$2(snapshotState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkSearchScreen.BenchmarkSearchScreen$lambda$11$lambda$8$lambda$7(snapshotState, (BenchmarkSelection) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged4 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkSearchScreen.BenchmarkSearchScreen$lambda$11$lambda$10$lambda$9(snapshotState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BenchmarkSearchResultsColumnKt.BenchmarkSearchResultsColumn(modifierM5146paddingqDBjuR0$default2, searchResults, immutableMapBenchmarkSearchScreen$lambda$2, onOpenInstrumentDetails, function1, (Function1) objRememberedValue4, onSelectionLimited, actionHandler, composerStartRestartGroup, ((i5 >> 9) & 7168) | ((i5 >> 3) & 3670016) | ((i5 << 15) & 29360128), 0);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkSearchScreen.BenchmarkSearchScreen$lambda$12(appType, state, actionHandler, onBack, onSave, onQueryChanged, onOpenInstrumentDetails, onSelectionLimited, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchScreen$lambda$11$lambda$6$lambda$5(Function1 function1, SnapshotState snapshotState) {
        function1.invoke(CollectionsKt.toList(BenchmarkSearchScreen$lambda$2(snapshotState).values()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchScreen$lambda$11$lambda$8$lambda$7(SnapshotState snapshotState, BenchmarkSelection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(extensions2.toImmutableMap(MapsKt.plus(BenchmarkSearchScreen$lambda$2(snapshotState), Tuples4.m3642to(it.getId(), it))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchScreen$lambda$11$lambda$10$lambda$9(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(extensions2.toImmutableMap(MapsKt.minus(BenchmarkSearchScreen$lambda$2(snapshotState), it)));
        return Unit.INSTANCE;
    }

    private static final ImmutableMap<String, BenchmarkSelection> BenchmarkSearchScreen$lambda$2(SnapshotState<ImmutableMap<String, BenchmarkSelection>> snapshotState) {
        return snapshotState.getValue();
    }
}
