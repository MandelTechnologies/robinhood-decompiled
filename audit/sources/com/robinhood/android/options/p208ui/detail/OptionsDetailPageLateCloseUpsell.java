package com.robinhood.android.options.p208ui.detail;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionsDetailPageLateCloseUpsell.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"OptionsDetailPageLateCloseUpsell", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "onLateCloseUpsellTapped", "Lkotlin/Function0;", "onLateCloseUpsellDismissed", "Lkotlin/Function1;", "Ljava/util/UUID;", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageLateCloseUpsell {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageLateCloseUpsell$lambda$0(OptionsDetailPageBodyState2.Upsell.LateClose lateClose, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        OptionsDetailPageLateCloseUpsell(lateClose, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsDetailPageLateCloseUpsell(final OptionsDetailPageBodyState2.Upsell.LateClose state, final Function0<Unit> onLateCloseUpsellTapped, final Function1<? super UUID, Unit> onLateCloseUpsellDismissed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onLateCloseUpsellTapped, "onLateCloseUpsellTapped");
        Intrinsics.checkNotNullParameter(onLateCloseUpsellDismissed, "onLateCloseUpsellDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-347786782);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLateCloseUpsellTapped) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLateCloseUpsellDismissed) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-347786782, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsell (OptionsDetailPageLateCloseUpsell.kt:38)");
            }
            OptionsDetailPageAnimatedVisibility.OptionsDetailPageAnimatedVisibility(!state.getUpsellDismissed(), null, ComposableLambda3.rememberComposableLambda(-583212147, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt.OptionsDetailPageLateCloseUpsell.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope OptionsDetailPageAnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(OptionsDetailPageAnimatedVisibility, "$this$OptionsDetailPageAnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-583212147, i3, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsell.<anonymous> (OptionsDetailPageLateCloseUpsell.kt:40)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM());
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i4).m21373getBg30d7_KjU());
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    int i5 = CardDefaults.$stable;
                    CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM21371getBg0d7_KjU, jM6725getTransparent0d7_KjU, 0L, 0L, composer2, (i5 << 12) | 48, 12);
                    CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, (i5 << 18) | 6, 62);
                    final Function1<UUID, Unit> function1 = onLateCloseUpsellDismissed;
                    final OptionsDetailPageBodyState2.Upsell.LateClose lateClose = state;
                    final Function0<Unit> function0 = onLateCloseUpsellTapped;
                    CardKt.Card(modifierM5142padding3ABfNKs, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(1972227839, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt.OptionsDetailPageLateCloseUpsell.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer3, int i6) {
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                            final SnapshotState snapshotState;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972227839, i6, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsell.<anonymous>.<anonymous> (OptionsDetailPageLateCloseUpsell.kt:54)");
                            }
                            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                            final Function1<UUID, Unit> function12 = function1;
                            final OptionsDetailPageBodyState2.Upsell.LateClose lateClose2 = lateClose;
                            final Function0<Unit> function02 = function0;
                            composer3.startReplaceGroup(-1003410150);
                            composer3.startReplaceGroup(212064437);
                            composer3.endReplaceGroup();
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer2(density);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                            boolean zChangedInstance = composer3.changedInstance(measurer2);
                            final int i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        snapshotState3.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i7);
                                        snapshotState2.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                            }
                                        }, 4, null);
                                    }
                                };
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                                composer3.updateRememberedValue(objRememberedValue6);
                            } else {
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                            Object objRememberedValue7 = composer3.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                        constraintSetForInlineDsl.setKnownDirty(true);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue7);
                            }
                            final Function0 function03 = (Function0) objRememberedValue7;
                            boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                            Object objRememberedValue8 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue8);
                            }
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierWrapContentHeight$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) throws Resources.NotFoundException {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState3.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                    composer4.startReplaceGroup(-598829940);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    float f = 20;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null);
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composer4.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue9 == companion3.getEmpty()) {
                                        objRememberedValue9 = OptionsDetailPageLateCloseUpsell2.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                    Painter painterPainterResource = PainterResources_androidKt.painterResource(C22993R.drawable.late_close_card_hourglass_background, composer4, 0);
                                    ContentScale fit = ContentScale.INSTANCE.getFit();
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    ImageKt.Image(painterPainterResource, (String) null, modifierConstrainAs, companion4.getCenterEnd(), fit, 0.0f, (ColorFilter) null, composer4, 27696, 96);
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(constraintLayoutBaseScope4Component3);
                                    Object objRememberedValue10 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                        objRememberedValue10 = new OptionsDetailPageLateCloseUpsell3(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierFillMaxHeight$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierConstrainAs2, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21592getMediumD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Instant lateCloseTime = lateClose2.getLateCloseTime();
                                    String easternTimeString = lateCloseTime != null ? Instants2.toEasternTimeString(lateCloseTime) : null;
                                    composer4.startReplaceGroup(1590086490);
                                    if (easternTimeString == null) {
                                        easternTimeString = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_late_close, composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.options_late_close_announcement_card_text, new Object[]{lateClose2.getChainSymbol(), easternTimeString}, composer4, 0), companion2, Color.m6701boximpl(bentoTheme2.getColors(composer4, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i9).getTextL(), composer4, 48, 0, 8184);
                                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C22993R.string.options_late_close_announcement_card_action, composer4, 0);
                                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i9).m21425getFg0d7_KjU();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged3 = composer4.changed(function02);
                                    Object objRememberedValue11 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                        objRememberedValue11 = new OptionsDetailPageLateCloseUpsell4(function02);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue11, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), composer4, 0, 56);
                                    composer4.endNode();
                                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 9, null);
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (objRememberedValue12 == companion3.getEmpty()) {
                                        objRememberedValue12 = OptionsDetailPageLateCloseUpsell5.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                                    BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CLOSE_12);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer4, 0);
                                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer4, i9).m21425getFg0d7_KjU();
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged4 = composer4.changed(function12) | composer4.changedInstance(lateClose2);
                                    Object objRememberedValue13 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue13 == companion3.getEmpty()) {
                                        objRememberedValue13 = new OptionsDetailPageLateCloseUpsell6(function12, lateClose2);
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoIcon2.m20644BentoIconFU0evQE(size12, strStringResource2, jM21425getFg0d7_KjU2, modifierConstrainAs3, (Function0) objRememberedValue13, false, composer4, BentoIcon4.Size12.$stable, 32);
                                    composer4.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                        EffectsKt.SideEffect(function03, composer4, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), measurePolicy, composer3, 48, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageLateCloseUpsell.OptionsDetailPageLateCloseUpsell$lambda$0(state, onLateCloseUpsellTapped, onLateCloseUpsellDismissed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
