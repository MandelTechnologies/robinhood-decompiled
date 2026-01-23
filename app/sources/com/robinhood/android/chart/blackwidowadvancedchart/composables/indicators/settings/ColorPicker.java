package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ColorPicker.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"ColorPicker", "", "lineColor", "Landroidx/compose/ui/graphics/Color;", "opacity", "", "availableColorPickerColors", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "onLineColorSelected", "Lkotlin/Function1;", "onOpacityUpdated", "ColorPicker-euL9pac", "(JLjava/lang/Double;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ColorPickerPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ColorPicker {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorPickerPreview$lambda$8(int i, Composer composer, int i2) {
        ColorPickerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorPicker_euL9pac$lambda$7(long j, Double d, ImmutableList immutableList, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        m11912ColorPickereuL9pac(j, d, immutableList, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: ColorPicker-euL9pac, reason: not valid java name */
    public static final void m11912ColorPickereuL9pac(final long j, final Double d, final ImmutableList<ThemedColorDto> availableColorPickerColors, final Function1<? super ThemedColorDto, Unit> onLineColorSelected, final Function1<? super Double, Unit> onOpacityUpdated, Composer composer, final int i) {
        int i2;
        boolean z;
        boolean z2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(onLineColorSelected, "onLineColorSelected");
        Intrinsics.checkNotNullParameter(onOpacityUpdated, "onOpacityUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(655167724);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(availableColorPickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLineColorSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOpacityUpdated) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(655167724, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPicker (ColorPicker.kt:39)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            GridCells.Fixed fixed = new GridCells.Fixed(8);
            Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i5 = i3 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(availableColorPickerColors) | (i5 == 4) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = true;
                z2 = false;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ColorPicker.ColorPicker_euL9pac$lambda$6$lambda$3$lambda$2(availableColorPickerColors, j, hapticFeedback, onLineColorSelected, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                z = true;
                z2 = false;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierM5144paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, spaceEvenly, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 1572864, 0, 924);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-771978425);
            if (d != null) {
                float fDoubleValue = (float) d.doubleValue();
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer2.changedInstance(hapticFeedback);
                if ((i3 & 57344) != 16384) {
                    z = z2;
                }
                boolean z3 = zChangedInstance2 | z;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ColorPicker.ColorPicker_euL9pac$lambda$6$lambda$5$lambda$4(hapticFeedback, onOpacityUpdated, ((Float) obj).floatValue());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                OpacitySlider4.m11926OpacitySlider3JVO9M(j, fDoubleValue, (Function1) objRememberedValue2, composer2, i5);
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ColorPicker.ColorPicker_euL9pac$lambda$7(j, d, availableColorPickerColors, onLineColorSelected, onOpacityUpdated, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorPicker_euL9pac$lambda$6$lambda$5$lambda$4(HapticFeedback hapticFeedback, Function1 function1, float f) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
        function1.invoke(Double.valueOf(MathKt.roundToInt(f * 100) / 100.0d));
        return Unit.INSTANCE;
    }

    private static final void ColorPickerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1692558474);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692558474, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerPreview (ColorPicker.kt:91)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ColorPicker3.INSTANCE.m1787x1258b246(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ColorPicker.ColorPickerPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorPicker_euL9pac$lambda$6$lambda$3$lambda$2(final ImmutableList immutableList, final long j, final HapticFeedback hapticFeedback, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C10804xe54040d2 c10804xe54040d2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$ColorPicker_euL9pac$lambda$6$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ThemedColorDto themedColorDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ThemedColorDto) obj);
            }
        };
        LazyVerticalGrid.items(immutableList.size(), null, null, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$ColorPicker_euL9pac$lambda$6$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c10804xe54040d2.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$ColorPicker_euL9pac$lambda$6$lambda$3$lambda$2$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                float fM7995constructorimpl;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                final ThemedColorDto themedColorDto = (ThemedColorDto) immutableList.get(i);
                composer.startReplaceGroup(-856471411);
                Modifier.Companion companion = Modifier.INSTANCE;
                if (Color.m6707equalsimpl0(j, PlotSettingsKt.toBwComposeColor(themedColorDto, composer, 0))) {
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(4);
                } else {
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 0.5d);
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5162requiredSize3ABfNKs(BorderKt.m4876borderxT4_qwU(companion, fM7995constructorimpl, bentoTheme.getColors(composer, i4).m21427getFg30d7_KjU(), RoundedCornerShape2.getCircleShape()), bentoTheme.getSpacing(composer, i4).m21591getLargeD9Ej5fM()), PlotSettingsKt.toBwComposeColor(themedColorDto, composer, 0), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape());
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changed(function1) | composer.changedInstance(themedColorDto);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final HapticFeedback hapticFeedback2 = hapticFeedback;
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ColorPickerKt$ColorPicker$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            hapticFeedback2.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                            function12.invoke(themedColorDto);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null), composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
