package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerTopNavRowComposable4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotFloatState2 $lazyRowWidthPx$delegate;
    final /* synthetic */ ImmutableList<NavRowItemViewState> $navRowItems;
    final /* synthetic */ Function0<Unit> $onSearchSelected;
    final /* synthetic */ Function1<UUID, Unit> $onUnderlyingIdUpdated;
    final /* synthetic */ UUID $selectedId;
    final /* synthetic */ SnapshotFloatState2 $selectedItemWidthPx$delegate;
    final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerTopNavRowViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    OptionsPortfolioRiskAnalyzerTopNavRowComposable4(LazyListState lazyListState, ImmutableList<NavRowItemViewState> immutableList, UUID uuid, Function1<? super UUID, Unit> function1, SnapshotState4<OptionsPortfolioRiskAnalyzerTopNavRowViewState> snapshotState4, Function0<Unit> function0, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22) {
        this.$lazyListState = lazyListState;
        this.$navRowItems = immutableList;
        this.$selectedId = uuid;
        this.$onUnderlyingIdUpdated = function1;
        this.$viewState$delegate = snapshotState4;
        this.$onSearchSelected = function0;
        this.$lazyRowWidthPx$delegate = snapshotFloatState2;
        this.$selectedItemWidthPx$delegate = snapshotFloatState22;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1787226001, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt:121)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 6, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        LazyListState lazyListState = this.$lazyListState;
        final ImmutableList<NavRowItemViewState> immutableList = this.$navRowItems;
        final UUID uuid = this.$selectedId;
        final Function1<UUID, Unit> function1 = this.$onUnderlyingIdUpdated;
        SnapshotState4<OptionsPortfolioRiskAnalyzerTopNavRowViewState> snapshotState4 = this.$viewState$delegate;
        final Function0<Unit> function0 = this.$onSearchSelected;
        final SnapshotFloatState2 snapshotFloatState2 = this.$lazyRowWidthPx$delegate;
        final SnapshotFloatState2 snapshotFloatState22 = this.$selectedItemWidthPx$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        AnimatedVisibilityKt.AnimatedVisibility(row6, OptionsPortfolioRiskAnalyzerTopNavRowComposable.OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4).getShowSearchIcon(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(1852169131, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility2, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1852169131, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt:132)");
                }
                BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.SEARCH_16);
                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                Color.Companion companion3 = Color.INSTANCE;
                long jM6725getTransparent0d7_KjU = companion3.m6725getTransparent0d7_KjU();
                long jM6725getTransparent0d7_KjU2 = companion3.m6725getTransparent0d7_KjU();
                float f = 5;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, standardSize16, StringResources_androidKt.stringResource(C23462R.string.options_pra_topbar_search_icon_button_description, composer2, 0), TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, PaddingKt.m5138PaddingValuesa9UjIt4(C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(f))), OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_FIXED_SEARCH), null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(16)), false, composer2, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 918552576, 0, 1072);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 1600518, 18);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(2));
        PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(C2002Dp.m7995constructorimpl(1), 0.0f, 2, null);
        Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerTopNavRowComposable4.invoke$lambda$8$lambda$1$lambda$0(snapshotFloatState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierTestTag = TestTag3.testTag(OnGloballyPositionedModifier3.onGloballyPositioned(modifierWeight$default, (Function1) objRememberedValue), "list");
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(immutableList) | composer.changedInstance(uuid) | composer.changed(function1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerTopNavRowComposable4.invoke$lambda$8$lambda$7$lambda$6(immutableList, uuid, function1, snapshotFloatState22, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyRow(modifierTestTag, lazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, composer, 24960, 488);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(final ImmutableList immutableList, final UUID uuid, final Function1 function1, final SnapshotFloatState2 snapshotFloatState2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$invoke$lambda$8$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$invoke$lambda$8$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
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
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final NavRowItemViewState navRowItemViewState = (NavRowItemViewState) immutableList.get(i);
                composer.startReplaceGroup(180277258);
                final boolean zAreEqual = Intrinsics.areEqual(navRowItemViewState.getUnderlyingId(), uuid);
                String str = "item-" + i;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(navRowItemViewState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$1$3$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(navRowItemViewState.getUnderlyingId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(navRowItemViewState) | composer.changedInstance(uuid);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final UUID uuid2 = uuid;
                    final SnapshotFloatState2 snapshotFloatState22 = snapshotFloatState2;
                    objRememberedValue2 = new Function1<LayoutCoordinates, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$1$3$1$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates coordinates) {
                            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                            if (Intrinsics.areEqual(navRowItemViewState.getUnderlyingId(), uuid2)) {
                                snapshotFloatState22.setFloatValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue2);
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(zAreEqual);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$7$1$1$3$1$1$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.setSelected(semantics, zAreEqual);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                OptionsPortfolioRiskAnalyzerTopNavRowComposable.NavRowItemComposable(navRowItemViewState, zAreEqual, function0, TestTag3.testTag(SemanticsModifier6.semantics$default(modifierOnGloballyPositioned, false, (Function1) objRememberedValue3, 1, null), str), composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
