package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ReturnsComparisonContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SelectedBenchmarkChipsRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SelectedBenchmarkChipsRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectedBenchmarks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "onDeselect", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "benchmarkId", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SelectedBenchmarkChipsRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedBenchmarkChipsRow$lambda$4(Modifier modifier, ImmutableList immutableList, Function1 function1, int i, int i2, Composer composer, int i3) {
        SelectedBenchmarkChipsRow(modifier, immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SelectedBenchmarkChipsRow(Modifier modifier, final ImmutableList<BenchmarkSelection> selectedBenchmarks, final Function1<? super String, Unit> onDeselect, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Intrinsics.checkNotNullParameter(selectedBenchmarks, "selectedBenchmarks");
        Intrinsics.checkNotNullParameter(onDeselect, "onDeselect");
        Composer composerStartRestartGroup = composer.startRestartGroup(160409523);
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
            i3 |= composerStartRestartGroup.changedInstance(selectedBenchmarks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeselect) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160409523, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRow (SelectedBenchmarkChipsRow.kt:27)");
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectedBenchmarks) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectedBenchmarkChipsRow.SelectedBenchmarkChipsRow$lambda$3$lambda$2(selectedBenchmarks, userInteractionEventDescriptor, onDeselect, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(modifier2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectedBenchmarkChipsRow.SelectedBenchmarkChipsRow$lambda$4(modifier3, selectedBenchmarks, onDeselect, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedBenchmarkChipsRow$lambda$3$lambda$2(final ImmutableList immutableList, final UserInteractionEventDescriptor userInteractionEventDescriptor, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function12 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectedBenchmarkChipsRow.SelectedBenchmarkChipsRow$lambda$3$lambda$2$lambda$0((BenchmarkSelection) obj);
            }
        };
        final C25607x856466e3 c25607x856466e3 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BenchmarkSelection benchmarkSelection) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BenchmarkSelection) obj);
            }
        };
        LazyRow.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$lambda$3$lambda$2$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function12.invoke(immutableList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$lambda$3$lambda$2$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c25607x856466e3.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final BenchmarkSelection benchmarkSelection = (BenchmarkSelection) immutableList.get(i);
                composer.startReplaceGroup(-1409471399);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, userInteractionEventDescriptor.getScreen(), null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext()), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReturnsComparisonContext(benchmarkSelection.getSymbol(), "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1073741825, -1, -1, 16383, null), new Component(Component.ComponentType.CHIP, "search-chip", null, 4, null), null, 37, null);
                final Function1 function13 = function1;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(-1347027494, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1347027494, i4, -1, "com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectedBenchmarkChipsRow.kt:51)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, false, false, true, false, null, 111, null), "benchmark-selection-chip_" + benchmarkSelection.getId());
                        String symbol = benchmarkSelection.getSymbol();
                        BentoChip2.Accessory.Action.TrailingIcon trailingIcon = new BentoChip2.Accessory.Action.TrailingIcon(ServerToBentoAssetMapper2.CLOSE_12, null, 2, null);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(function13) | composer2.changedInstance(benchmarkSelection);
                        final Function1<String, Unit> function14 = function13;
                        final BenchmarkSelection benchmarkSelection2 = benchmarkSelection;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.SelectedBenchmarkChipsRowKt$SelectedBenchmarkChipsRow$1$1$2$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function14.invoke(benchmarkSelection2.getId());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoChip.BentoActionChip((Function0) objRememberedValue, modifierTestTag, false, trailingIcon, symbol, composer2, BentoChip2.Accessory.Action.TrailingIcon.$stable << 9, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SelectedBenchmarkChipsRow$lambda$3$lambda$2$lambda$0(BenchmarkSelection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }
}
