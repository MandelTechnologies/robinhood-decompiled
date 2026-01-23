package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartTypeDto;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ChartTypeRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"ChartTypeRow", "", "selectedType", "", "types", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartTypeDto;", "onChartTypeSelected", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ChartTypePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "localSelectedType", "loadingImage", "", "selected"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartTypeRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTypePreview$lambda$16(int i, Composer composer, int i2) {
        ChartTypePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTypeRow$lambda$15(String str, ImmutableList immutableList, Function1 function1, int i, Composer composer, int i2) {
        ChartTypeRow(str, immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChartTypeRow(final String selectedType, final ImmutableList<ChartTypeDto> types, final Function1<? super String, Unit> onChartTypeSelected, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(onChartTypeSelected, "onChartTypeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(122145767);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(selectedType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(types) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onChartTypeSelected) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(122145767, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRow (ChartTypeRow.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(selectedType, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(types) | composerStartRestartGroup.changed(snapshotState) | ((i2 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartTypeRow.ChartTypeRow$lambda$14$lambda$13(types, snapshotState, onChartTypeSelected, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartTypeRow.ChartTypeRow$lambda$15(selectedType, types, onChartTypeSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTypeRow$lambda$14$lambda$13(final ImmutableList immutableList, final SnapshotState snapshotState, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        ChartTypeRow5 chartTypeRow5 = ChartTypeRow5.INSTANCE;
        LazyListScope.item$default(LazyRow, null, null, chartTypeRow5.m1762xedf9da70(), 3, null);
        final Function1 function12 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$3((ChartTypeDto) obj);
            }
        };
        final C10695xae84633f c10695xae84633f = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$lambda$14$lambda$13$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ChartTypeDto chartTypeDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ChartTypeDto) obj);
            }
        };
        LazyRow.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$lambda$14$lambda$13$$inlined$items$default$2
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
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$lambda$14$lambda$13$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c10695xae84633f.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$lambda$14$lambda$13$$inlined$items$default$4
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
                long jM21371getBg0d7_KjU;
                long jM21373getBg30d7_KjU;
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
                final ChartTypeDto chartTypeDto = (ChartTypeDto) immutableList.get(i);
                composer.startReplaceGroup(-201998246);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composer.endReplaceGroup();
                Object objChartTypeRow$lambda$1 = ChartTypeRow.ChartTypeRow$lambda$1(snapshotState);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(objChartTypeRow$lambda$1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    final SnapshotState snapshotState3 = snapshotState;
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$1$1$2$selected$2$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(Intrinsics.areEqual(ChartTypeRow.ChartTypeRow$lambda$1(snapshotState3), chartTypeDto.getValue()));
                        }
                    });
                    composer.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composer.endReplaceGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(84), 0.0f, 2, null);
                if (ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$8(snapshotState4)) {
                    composer.startReplaceGroup(-201661494);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-201579189);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composer.endReplaceGroup();
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierM5176widthInVpY3zN4$default, jM21371getBg0d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                if (ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$8(snapshotState4)) {
                    composer.startReplaceGroup(-201290486);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i4).m21427getFg30d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-201208150);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i4).m21373getBg30d7_KjU();
                    composer.endReplaceGroup();
                }
                Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(modifierM4871backgroundbw27NRU, fM7995constructorimpl, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()));
                composer.startReplaceGroup(-1746271574);
                boolean zChanged2 = composer.changed(snapshotState) | composer.changedInstance(chartTypeDto) | composer.changed(function1);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    final Function1 function13 = function1;
                    final SnapshotState snapshotState5 = snapshotState;
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState5.setValue(chartTypeDto.getValue());
                            function13.invoke(chartTypeDto.getValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SelectableGroup.selectableGroup(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue3, 7, null)), Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$5(snapshotState2), null, 2, null);
                String png_icon = chartTypeDto.getPng_icon();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1<AsyncImagePainter.State.Success, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$ChartTypeRow$1$1$2$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AsyncImagePainter.State.Success success) {
                            invoke2(success);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AsyncImagePainter.State.Success it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$6(snapshotState2, false);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                ImageKt.Image(SingletonAsyncImagePainter.m9121rememberAsyncImagePainterHtA5bXE(png_icon, null, null, null, null, (Function1) objRememberedValue4, null, null, 0, null, composer, 196608, 990), (String) null, modifierBentoPlaceholder$default, (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), 0, 2, null), composer, 24624, 40);
                BentoText2.m20747BentoText38GnDrw(chartTypeDto.getLabel(), companion2, Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU()), null, ChartTypeRow.ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$8(snapshotState4) ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, null, composer, 48, 0, 16360);
                composer.endNode();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyRow, null, null, chartTypeRow5.m1763xc9eb3c8e(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ChartTypeRow$lambda$14$lambda$13$lambda$3(ChartTypeDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue() + it.getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChartTypeRow$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartTypeRow$lambda$14$lambda$13$lambda$12$lambda$8(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final void ChartTypePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-355293305);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-355293305, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypePreview (ChartTypeRow.kt:126)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ChartTypeRow5.INSTANCE.m1761x328ffd43(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartTypeRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartTypeRow.ChartTypePreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
