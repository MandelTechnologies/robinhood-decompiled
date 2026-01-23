package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartLayerDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRow5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: LayerGroupRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\bX\u008a\u0084\u0002"}, m3636d2 = {"LayerGroupRow", "", "layers", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartLayerDto;", "onLayerGroupSelected", "Lkotlin/Function2;", "", "", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PreviewLayerGroupRow", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "visible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LayerGroupRow5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LayerGroupRow$lambda$0(ImmutableList immutableList, Function2 function2, int i, Composer composer, int i2) {
        LayerGroupRow(immutableList, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLayerGroupRow$lambda$1(int i, Composer composer, int i2) {
        PreviewLayerGroupRow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: LayerGroupRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1 */
    static final class C107261 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<ChartLayerDto> $layers;
        final /* synthetic */ Function2<String, Boolean, Unit> $onLayerGroupSelected;

        /* JADX WARN: Multi-variable type inference failed */
        C107261(ImmutableList<ChartLayerDto> immutableList, Function2<? super String, ? super Boolean, Unit> function2) {
            this.$layers = immutableList;
            this.$onLayerGroupSelected = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004728980, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRow.<anonymous> (LayerGroupRow.kt:42)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING(), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$layers) | composer.changed(this.$onLayerGroupSelected);
            final ImmutableList<ChartLayerDto> immutableList = this.$layers;
            final Function2<String, Boolean, Unit> function2 = this.$onLayerGroupSelected;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LayerGroupRow5.C107261.invoke$lambda$7$lambda$6(immutableList, function2, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyRow(modifierM5146paddingqDBjuR0$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 6, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(final ImmutableList immutableList, final Function2 function2, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LayerGroupRow layerGroupRow = LayerGroupRow.INSTANCE;
            LazyListScope.item$default(LazyRow, null, null, layerGroupRow.m1764x9bb68f18(), 3, null);
            final C10722xfb3d4dc0 c10722xfb3d4dc0 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1$invoke$lambda$7$lambda$6$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ChartLayerDto chartLayerDto) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ChartLayerDto) obj);
                }
            };
            LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1$invoke$lambda$7$lambda$6$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c10722xfb3d4dc0.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1$invoke$lambda$7$lambda$6$$inlined$items$default$4
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
                    long jM21373getBg30d7_KjU;
                    long jM21371getBg0d7_KjU;
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
                    FontWeight w400;
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
                    final ChartLayerDto chartLayerDto = (ChartLayerDto) immutableList.get(i);
                    composer.startReplaceGroup(1199949291);
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(chartLayerDto);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(chartLayerDto.is_visible()), null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composer.endReplaceGroup();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    if (LayerGroupRow5.C107261.invoke$lambda$7$lambda$6$lambda$5$lambda$1(snapshotState)) {
                        composer.startReplaceGroup(1200112784);
                        jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1200203056);
                        jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
                        composer.endReplaceGroup();
                    }
                    float f = 20;
                    Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(companion, fM7995constructorimpl, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
                    if (LayerGroupRow5.C107261.invoke$lambda$7$lambda$6$lambda$5$lambda$1(snapshotState)) {
                        composer.startReplaceGroup(1200510576);
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1200600817);
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                        composer.endReplaceGroup();
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierClip, jM21371getBg0d7_KjU, null, 2, null);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChanged2 = composer.changed(function2) | composer.changedInstance(chartLayerDto) | composer.changed(snapshotState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function2 function22 = function2;
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$LayerGroupRow$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function22.invoke(chartLayerDto.getValue(), Boolean.valueOf(!LayerGroupRow5.C107261.invoke$lambda$7$lambda$6$lambda$5$lambda$1(snapshotState)));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue2, 7, null));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSelectableGroup);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (LayerGroupRow5.C107261.invoke$lambda$7$lambda$6$lambda$5$lambda$1(snapshotState)) {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.EYE_16;
                    } else {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.EYE_CLOSED_16;
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                    String label = chartLayerDto.getLabel();
                    TextStyle textM = bentoTheme.getTypography(composer, i4).getTextM();
                    if (LayerGroupRow5.C107261.invoke$lambda$7$lambda$6$lambda$5$lambda$1(snapshotState)) {
                        w400 = FontWeight.INSTANCE.getBold();
                    } else {
                        w400 = FontWeight.INSTANCE.getW400();
                    }
                    BentoText2.m20747BentoText38GnDrw(label, null, null, null, w400, null, null, 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8174);
                    composer.endNode();
                    composer.endNode();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(LazyRow, null, null, layerGroupRow.m1765x6e94abce(), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }
    }

    public static final void LayerGroupRow(final ImmutableList<ChartLayerDto> layers, final Function2<? super String, ? super Boolean, Unit> onLayerGroupSelected, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(onLayerGroupSelected, "onLayerGroupSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2105620097);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(layers) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLayerGroupSelected) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2105620097, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRow (LayerGroupRow.kt:40)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1004728980, true, new C107261(layers, onLayerGroupSelected), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LayerGroupRow5.LayerGroupRow$lambda$0(layers, onLayerGroupSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLayerGroupRow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(940931149);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(940931149, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.PreviewLayerGroupRow (LayerGroupRow.kt:117)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, LayerGroupRow.INSTANCE.m1766xc67be4d5(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.LayerGroupRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LayerGroupRow5.PreviewLayerGroupRow$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
