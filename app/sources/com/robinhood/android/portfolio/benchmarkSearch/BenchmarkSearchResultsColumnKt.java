package com.robinhood.android.portfolio.benchmarkSearch;

import android.content.res.Resources;
import android.text.Spanned;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.returns.ReturnsHubScreen4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.android.models.portfolio.BenchmarkSelection2;
import com.robinhood.android.models.portfolio.BenchmarkingSearchElement;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.BenchmarkingSearchSection;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.BentoSpannedText4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ReturnsComparisonContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BenchmarkSearchResultsColumn.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aº\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\b2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aw\u0010 \u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b$\u0010%¨\u0006'²\u0006\f\u0010&\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "searchResults", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "selectedBenchmarks", "Lkotlin/Function1;", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchElement;", "Lkotlin/ParameterName;", "name", "element", "", "onOpenInstrumentDetails", ReturnsHubScreen4.LOGGING_IDENTIFIER_BENCHMARK_INFO_ICON, "onSelect", "benchmarkId", "onDeselect", "Lkotlin/Function0;", "onSelectionLimited", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "actionHandler", "BenchmarkSearchResultsColumn", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "selectedBenchmarkSymbols", "", "isSelected", "isSelectable", "onOpenInstrument", "ElementRow", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/portfolio/BenchmarkingSearchElement;Lkotlinx/collections/immutable/ImmutableList;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onClickOverride", "content", "ProvideClickOverrideSpannedTextProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "hasSelections", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BenchmarkSearchResultsColumnKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchResultsColumn$lambda$16(Modifier modifier, BenchmarkingSearchResults benchmarkingSearchResults, ImmutableMap immutableMap, Function1 function1, Function1 function12, Function1 function13, Function0 function0, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        BenchmarkSearchResultsColumn(modifier, benchmarkingSearchResults, immutableMap, function1, function12, function13, function0, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElementRow$lambda$24(Modifier modifier, BenchmarkingSearchElement benchmarkingSearchElement, ImmutableList immutableList, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        ElementRow(modifier, benchmarkingSearchElement, immutableList, z, z2, function0, function02, function03, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideClickOverrideSpannedTextProvider$lambda$25(Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        ProvideClickOverrideSpannedTextProvider(function0, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BenchmarkSearchResultsColumn(Modifier modifier, final BenchmarkingSearchResults searchResults, final ImmutableMap<String, BenchmarkSelection> selectedBenchmarks, final Function1<? super BenchmarkingSearchElement, Unit> onOpenInstrumentDetails, final Function1<? super BenchmarkSelection, Unit> onSelect, final Function1<? super String, Unit> onDeselect, final Function0<Unit> onSelectionLimited, final SduiActionHandler<? super GenericAction> actionHandler, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(selectedBenchmarks, "selectedBenchmarks");
        Intrinsics.checkNotNullParameter(onOpenInstrumentDetails, "onOpenInstrumentDetails");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onDeselect, "onDeselect");
        Intrinsics.checkNotNullParameter(onSelectionLimited, "onSelectionLimited");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1232139712);
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
            i3 |= composerStartRestartGroup.changedInstance(searchResults) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(selectedBenchmarks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenInstrumentDetails) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelect) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeselect) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectionLimited) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1232139712, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumn (BenchmarkSearchResultsColumn.kt:66)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BenchmarkSearchResultsColumnKt.BenchmarkSearchResultsColumn$lambda$1$lambda$0(selectedBenchmarks));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean zBenchmarkSearchResultsColumn$lambda$2 = BenchmarkSearchResultsColumn$lambda$2(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(zBenchmarkSearchResultsColumn$lambda$2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Boolean.valueOf(BenchmarkSearchResultsColumn$lambda$2(snapshotState4) && lazyListStateRememberLazyListState.getFirstVisibleItemIndex() == 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Boolean bool = (Boolean) objRememberedValue2;
            boolean zBooleanValue = bool.booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1(zBooleanValue, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            String query = searchResults.getQuery();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$2$1(lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(query, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectedBenchmarks) | ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(searchResults) | composerStartRestartGroup.changedInstance(actionHandler) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkSearchResultsColumnKt.BenchmarkSearchResultsColumn$lambda$15$lambda$14(selectedBenchmarks, searchResults, onDeselect, actionHandler, onOpenInstrumentDetails, onSelect, onSelectionLimited, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue5 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier4 = modifier2;
            LazyDslKt.LazyColumn(modifier4, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer2, i3 & 14, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkSearchResultsColumnKt.BenchmarkSearchResultsColumn$lambda$16(modifier3, searchResults, selectedBenchmarks, onOpenInstrumentDetails, onSelect, onDeselect, onSelectionLimited, actionHandler, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BenchmarkSearchResultsColumn$lambda$1$lambda$0(ImmutableMap immutableMap) {
        return !immutableMap.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchResultsColumn$lambda$15$lambda$14(ImmutableMap immutableMap, BenchmarkingSearchResults benchmarkingSearchResults, Function1 function1, SduiActionHandler sduiActionHandler, final Function1 function12, final Function1 function13, final Function0 function0, LazyListScope LazyColumn) {
        final ImmutableMap immutableMap2;
        final Function1 function14;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (immutableMap.isEmpty()) {
            immutableMap2 = immutableMap;
            function14 = function1;
        } else {
            immutableMap2 = immutableMap;
            function14 = function1;
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(959521552, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$3$1$1
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
                        ComposerKt.traceEventStart(959521552, i, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumn.<anonymous>.<anonymous>.<anonymous> (BenchmarkSearchResultsColumn.kt:86)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 1);
                    ImmutableMap<String, BenchmarkSelection> immutableMap3 = immutableMap2;
                    Function1<String, Unit> function15 = function14;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21622defaultHorizontalPaddingWMci_g0);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.benchmark_search_selected, composer, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
                    SelectedBenchmarkChipsRow.SelectedBenchmarkChipsRow(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), extensions2.toImmutableList(immutableMap3.values()), function15, composer, 0, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        for (BenchmarkingSearchSection benchmarkingSearchSection : benchmarkingSearchResults.getSections()) {
            ImmutableList<UIComponent<GenericAction>> headers = benchmarkingSearchSection.getHeaders();
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            SduiColumns.sduiItems(LazyColumn, headers, GenericAction.class, null, sduiActionHandler, horizontalPadding);
            final ImmutableList<BenchmarkingSearchElement> items = benchmarkingSearchSection.getItems();
            final Function2 function2 = new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkSearchResultsColumnKt.m2372x2b272b62(((Integer) obj).intValue(), (BenchmarkingSearchElement) obj2);
                }
            };
            LazyColumn.items(items.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$lambda$15$lambda$14$lambda$13$$inlined$itemsIndexed$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function2.invoke(Integer.valueOf(i), items.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$lambda$15$lambda$14$lambda$13$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    items.get(i);
                    return null;
                }
            }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$lambda$15$lambda$14$lambda$13$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws Resources.NotFoundException {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    boolean z = false;
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    final BenchmarkingSearchElement benchmarkingSearchElement = (BenchmarkingSearchElement) items.get(i);
                    composer.startReplaceGroup(-458124154);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer.startReplaceGroup(-280590803);
                    if (i > 0) {
                        Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), composer, 0, 2);
                    }
                    composer.endReplaceGroup();
                    boolean zContainsKey = immutableMap2.containsKey(benchmarkingSearchElement.getId());
                    Iterable iterableValues = immutableMap2.values();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableValues, 10));
                    Iterator it = iterableValues.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BenchmarkSelection) it.next()).getSymbol());
                    }
                    ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                    if (!zContainsKey && immutableMap2.size() < 3) {
                        z = true;
                    }
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function12) | composer.changedInstance(benchmarkingSearchElement);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function15 = function12;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$3$1$2$2$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function15.invoke(benchmarkingSearchElement);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function02 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(function13) | composer.changedInstance(benchmarkingSearchElement);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function16 = function13;
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$3$1$2$2$1$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function16.invoke(BenchmarkSelection2.toSelectionModel$default(benchmarkingSearchElement, false, 1, null));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function03 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged3 = composer.changed(function14) | composer.changedInstance(benchmarkingSearchElement);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = function14;
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$3$1$2$2$1$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function17.invoke(benchmarkingSearchElement.getId());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    BenchmarkSearchResultsColumnKt.ElementRow(companion, benchmarkingSearchElement, immutableList, zContainsKey, z, function02, function03, (Function0) objRememberedValue3, function0, composer, 6, 0);
                    composer.endNode();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            SduiColumns.sduiItems(LazyColumn, benchmarkingSearchSection.getFooters(), GenericAction.class, null, sduiActionHandler, horizontalPadding);
            immutableMap2 = immutableMap;
            function14 = function1;
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BenchmarkSearchResultsColumnKt.INSTANCE.getLambda$63927243$feature_portfolio_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    private static final boolean BenchmarkSearchResultsColumn$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BenchmarkSearchResultsColumn$lambda$15$lambda$14$lambda$13$lambda$6 */
    public static final Object m2372x2b272b62(int i, BenchmarkingSearchElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElementRow(Modifier modifier, final BenchmarkingSearchElement benchmarkingSearchElement, final ImmutableList<String> immutableList, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Modifier modifier2;
        int i3;
        ImmutableList<String> immutableList2;
        Function0<Unit> function05;
        Function0<Unit> function06;
        boolean zChangedInstance;
        int i4;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        int i5;
        int i6;
        int i7;
        final EventLogger eventLogger;
        int i8;
        int i9;
        BentoTheme bentoTheme;
        int i10;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance2;
        Object objRememberedValue;
        BentoIconButton4.Icon.StandardSize16 standardSize16;
        ServerToBentoAssetMapper2 iconAsset;
        boolean z3;
        String strStringResource;
        long jM21456getPositive0d7_KjU;
        boolean zChangedInstance3;
        Object objRememberedValue2;
        BentoIconButton4.Icon.StandardSize16 standardSize162;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1011841864);
        int i11 = i2 & 1;
        if (i11 != 0) {
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
            i3 |= composerStartRestartGroup.changedInstance(benchmarkingSearchElement) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                immutableList2 = immutableList;
                i3 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    function05 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function05) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else {
                    if ((12582912 & i) == 0) {
                        function06 = function03;
                        i3 |= composerStartRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((100663296 & i) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1011841864, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.ElementRow (BenchmarkSearchResultsColumn.kt:153)");
                            }
                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            int i12 = i3 & 7168;
                            int i13 = i3 & 29360128;
                            int i14 = i3 & 896;
                            int i15 = 57344 & i3;
                            int i16 = i3 & 3670016;
                            int i17 = i3 & 234881024;
                            zChangedInstance = (i14 != 256) | (i13 != 8388608) | (i12 != 2048) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement) | (i15 != 16384) | (i16 != 1048576) | (i17 != 67108864);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                i4 = i15;
                                if (objRememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                    userInteractionEventDescriptor = userInteractionEventDescriptor2;
                                    i5 = i3;
                                    i6 = i16;
                                    i7 = i17;
                                    eventLogger = current;
                                    i8 = i4;
                                    i9 = i12;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier5 = modifier4;
                                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue3, 7, null), C2002Dp.m7995constructorimpl(0), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 10, null);
                                bentoTheme = BentoTheme.INSTANCE;
                                i10 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM5146paddingqDBjuR0$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                final Row6 row6 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance2 = ((i5 & 458752) != 131072) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BenchmarkSearchResultsColumnKt.ElementRow$lambda$23$lambda$20$lambda$19(function0, eventLogger, userInteractionEventDescriptor, benchmarkingSearchElement);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ProvideClickOverrideSpannedTextProvider((Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1070525154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$ElementRow$2$2
                                    public final void invoke(Composer composer3, int i18) {
                                        if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1070525154, i18, -1, "com.robinhood.android.portfolio.benchmarkSearch.ElementRow.<anonymous>.<anonymous> (BenchmarkSearchResultsColumn.kt:221)");
                                        }
                                        ImmutableList<UIComponent<GenericAction>> displayComponents = benchmarkingSearchElement.getDisplayComponents();
                                        Modifier modifierWeight$default = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        composer3.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(displayComponents, GenericAction.class, modifierWeight$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663296, 0);
                                        composer3.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "search-row-add-icon_" + benchmarkingSearchElement.getId());
                                if (!z) {
                                    iconAsset = UtilKt.getIconAsset(benchmarkingSearchElement.getSelectedIcon());
                                    if (iconAsset == null) {
                                        iconAsset = ServerToBentoAssetMapper2.CHECKBOX_FILLED_16;
                                    }
                                } else {
                                    iconAsset = UtilKt.getIconAsset(benchmarkingSearchElement.getInactiveNonSelected());
                                    if (iconAsset == null) {
                                        iconAsset = ServerToBentoAssetMapper2.BUBBLE_PLUS_16;
                                    }
                                }
                                standardSize16 = new BentoIconButton4.Icon.StandardSize16(iconAsset);
                                if (z) {
                                    z3 = false;
                                    if (z2) {
                                        composerStartRestartGroup.startReplaceGroup(-529429632);
                                        strStringResource = StringResources_androidKt.stringResource(C25550R.string.benchmark_search_select_row, new Object[]{benchmarkingSearchElement.getSymbol()}, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(767640802);
                                        composerStartRestartGroup.endReplaceGroup();
                                        strStringResource = "";
                                    }
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-529432926);
                                    z3 = false;
                                    strStringResource = StringResources_androidKt.stringResource(C25550R.string.benchmark_search_deselect_row, new Object[]{benchmarkingSearchElement.getSymbol()}, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                String str = strStringResource;
                                if (!z || z2) {
                                    composerStartRestartGroup.startReplaceGroup(-529422940);
                                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21456getPositive0d7_KjU();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-529421921);
                                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21427getFg30d7_KjU();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance3 = (i9 != 2048 ? true : z3) | (i13 != 8388608 ? true : z3) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i14 != 256 ? true : z3) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement) | (i8 != 16384 ? true : z3) | (i6 != 1048576 ? true : z3) | (i7 != 67108864 ? true : z3);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    standardSize162 = standardSize16;
                                    Object obj = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BenchmarkSearchResultsColumnKt.ElementRow$lambda$23$lambda$22$lambda$21(z, function03, immutableList, benchmarkingSearchElement, z2, function02, function04, eventLogger, userInteractionEventDescriptor);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(obj);
                                    objRememberedValue2 = obj;
                                } else {
                                    standardSize162 = standardSize16;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize162, str, modifierTestTag, null, false, Color.m6701boximpl(jM21456getPositive0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, true, composer2, BentoIconButton4.Icon.StandardSize16.$stable << 3, 6, 816);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                            } else {
                                i4 = i15;
                            }
                            final Function0<Unit> function07 = function06;
                            userInteractionEventDescriptor = userInteractionEventDescriptor2;
                            i5 = i3;
                            final Function0<Unit> function08 = function05;
                            i6 = i16;
                            i7 = i17;
                            eventLogger = current;
                            i8 = i4;
                            i9 = i12;
                            final ImmutableList<String> immutableList3 = immutableList2;
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BenchmarkSearchResultsColumnKt.ElementRow$lambda$18$lambda$17(z, function07, immutableList3, benchmarkingSearchElement, z2, function08, function04, eventLogger, userInteractionEventDescriptor);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue3, 7, null), C2002Dp.m7995constructorimpl(0), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 10, null);
                            bentoTheme = BentoTheme.INSTANCE;
                            i10 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM5146paddingqDBjuR0$default2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                final Row5 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance2 = ((i5 & 458752) != 131072) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BenchmarkSearchResultsColumnKt.ElementRow$lambda$23$lambda$20$lambda$19(function0, eventLogger, userInteractionEventDescriptor, benchmarkingSearchElement);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceGroup();
                                    ProvideClickOverrideSpannedTextProvider((Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1070525154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$ElementRow$2$2
                                        public final void invoke(Composer composer3, int i18) {
                                            if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1070525154, i18, -1, "com.robinhood.android.portfolio.benchmarkSearch.ElementRow.<anonymous>.<anonymous> (BenchmarkSearchResultsColumn.kt:221)");
                                            }
                                            ImmutableList<UIComponent<GenericAction>> displayComponents = benchmarkingSearchElement.getDisplayComponents();
                                            Modifier modifierWeight$default = Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null);
                                            composer3.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(displayComponents, GenericAction.class, modifierWeight$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663296, 0);
                                            composer3.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                    Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "search-row-add-icon_" + benchmarkingSearchElement.getId());
                                    if (!z) {
                                    }
                                    standardSize16 = new BentoIconButton4.Icon.StandardSize16(iconAsset);
                                    if (z) {
                                    }
                                    String str2 = strStringResource;
                                    if (z) {
                                        composerStartRestartGroup.startReplaceGroup(-529422940);
                                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21456getPositive0d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                        long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU();
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        zChangedInstance3 = (i9 != 2048 ? true : z3) | (i13 != 8388608 ? true : z3) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i14 != 256 ? true : z3) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement) | (i8 != 16384 ? true : z3) | (i6 != 1048576 ? true : z3) | (i7 != 67108864 ? true : z3);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance3) {
                                            standardSize162 = standardSize16;
                                            Object obj2 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return BenchmarkSearchResultsColumnKt.ElementRow$lambda$23$lambda$22$lambda$21(z, function03, immutableList, benchmarkingSearchElement, z2, function02, function04, eventLogger, userInteractionEventDescriptor);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(obj2);
                                            objRememberedValue2 = obj2;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composer2 = composerStartRestartGroup;
                                            BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize162, str2, modifierTestTag2, null, false, Color.m6701boximpl(jM21456getPositive0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU2), null, null, true, composer2, BentoIconButton4.Icon.StandardSize16.$stable << 3, 6, 816);
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    return BenchmarkSearchResultsColumnKt.ElementRow$lambda$24(modifier3, benchmarkingSearchElement, immutableList, z, z2, function0, function02, function03, function04, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    if ((i3 & 38347923) == 38347922) {
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i122 = i3 & 7168;
                        if (i122 != 2048) {
                        }
                        int i132 = i3 & 29360128;
                        int i142 = i3 & 896;
                        int i152 = 57344 & i3;
                        int i162 = i3 & 3670016;
                        int i172 = i3 & 234881024;
                        zChangedInstance = (i142 != 256) | (i132 != 8388608) | (i122 != 2048) | composerStartRestartGroup.changedInstance(current2) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor22) | composerStartRestartGroup.changedInstance(benchmarkingSearchElement) | (i152 != 16384) | (i162 != 1048576) | (i172 != 67108864);
                        Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                        }
                        final Function0 function072 = function06;
                        userInteractionEventDescriptor = userInteractionEventDescriptor22;
                        i5 = i3;
                        final Function0 function082 = function05;
                        i6 = i162;
                        i7 = i172;
                        eventLogger = current2;
                        i8 = i4;
                        i9 = i122;
                        final ImmutableList immutableList32 = immutableList2;
                        objRememberedValue32 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BenchmarkSearchResultsColumnKt.ElementRow$lambda$18$lambda$17(z, function072, immutableList32, benchmarkingSearchElement, z2, function082, function04, eventLogger, userInteractionEventDescriptor);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier522 = modifier4;
                        Modifier modifierM5146paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue32, 7, null), C2002Dp.m7995constructorimpl(0), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 10, null);
                        bentoTheme = BentoTheme.INSTANCE;
                        i10 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default22 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM5146paddingqDBjuR0$default22, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default22);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function06 = function03;
                if ((i2 & 256) != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function05 = function02;
            if ((i2 & 128) != 0) {
            }
            function06 = function03;
            if ((i2 & 256) != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        immutableList2 = immutableList;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        function05 = function02;
        if ((i2 & 128) != 0) {
        }
        function06 = function03;
        if ((i2 & 256) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void ElementRow$logToggle(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventData.Action action, List<String> list) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "search-row-add-icon", null, 4, null), null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext()), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReturnsComparisonContext(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1073741825, -1, -1, 16383, null), false, 40, null);
    }

    private static final void ElementRow$toggleSelection(boolean z, Function0<Unit> function0, ImmutableList<String> immutableList, BenchmarkingSearchElement benchmarkingSearchElement, boolean z2, Function0<Unit> function02, Function0<Unit> function03, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        if (z) {
            function0.invoke();
            ElementRow$logToggle(eventLogger, userInteractionEventDescriptor, UserInteractionEventData.Action.TOGGLE_OFF, CollectionsKt.minus(immutableList, benchmarkingSearchElement.getSymbol()));
        } else if (z2) {
            function02.invoke();
            ElementRow$logToggle(eventLogger, userInteractionEventDescriptor, UserInteractionEventData.Action.TOGGLE_ON, CollectionsKt.plus((Collection<? extends String>) immutableList, benchmarkingSearchElement.getSymbol()));
        } else {
            function03.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElementRow$lambda$18$lambda$17(boolean z, Function0 function0, ImmutableList immutableList, BenchmarkingSearchElement benchmarkingSearchElement, boolean z2, Function0 function02, Function0 function03, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        ElementRow$toggleSelection(z, function0, immutableList, benchmarkingSearchElement, z2, function02, function03, eventLogger, userInteractionEventDescriptor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElementRow$lambda$23$lambda$20$lambda$19(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BenchmarkingSearchElement benchmarkingSearchElement) {
        function0.invoke();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null), null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext()), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReturnsComparisonContext(benchmarkingSearchElement.getSymbol(), "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1073741825, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElementRow$lambda$23$lambda$22$lambda$21(boolean z, Function0 function0, ImmutableList immutableList, BenchmarkingSearchElement benchmarkingSearchElement, boolean z2, Function0 function02, Function0 function03, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        ElementRow$toggleSelection(z, function0, immutableList, benchmarkingSearchElement, z2, function02, function03, eventLogger, userInteractionEventDescriptor);
        return Unit.INSTANCE;
    }

    private static final void ProvideClickOverrideSpannedTextProvider(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(161310261);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(161310261, i2, -1, "com.robinhood.android.portfolio.benchmarkSearch.ProvideClickOverrideSpannedTextProvider (BenchmarkSearchResultsColumn.kt:262)");
            }
            final BentoSpannedText4 bentoSpannedText4 = (BentoSpannedText4) composerStartRestartGroup.consume(BentoSpannedText.getLocalSpannedTextProvider());
            CompositionLocal3.CompositionLocalProvider(BentoSpannedText.getLocalSpannedTextProvider().provides(new BentoSpannedText4() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$ProvideClickOverrideSpannedTextProvider$clickOverrideSpannedTextProvider$1
                @Override // com.robinhood.compose.bento.component.text.BentoSpannedText4
                /* renamed from: SpannedText-gPmlwdY */
                public void mo13684SpannedTextgPmlwdY(Spanned spanned, Modifier modifier, Color color, Color color2, int i3, Integer num, int i4, int i5, Function0<Unit> function02, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(spanned, "spanned");
                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                    composer2.startReplaceGroup(1868122532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1868122532, i6, -1, "com.robinhood.android.portfolio.benchmarkSearch.ProvideClickOverrideSpannedTextProvider.<no name provided>.SpannedText (BenchmarkSearchResultsColumn.kt:277)");
                    }
                    bentoSpannedText4.mo13684SpannedTextgPmlwdY(spanned, modifier, color, color2, i3, num, i4, i5, function0, composer2, i6 & 33554430);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                }
            }), ComposableLambda3.rememberComposableLambda(450890485, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt.ProvideClickOverrideSpannedTextProvider.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(450890485, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.ProvideClickOverrideSpannedTextProvider.<anonymous> (BenchmarkSearchResultsColumn.kt:293)");
                    }
                    function2.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkSearchResultsColumnKt.ProvideClickOverrideSpannedTextProvider$lambda$25(function0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
