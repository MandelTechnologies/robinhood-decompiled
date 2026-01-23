package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import coil.compose.SingletonAsyncImage;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.supporthub.AssignedAgent;
import com.robinhood.models.p355ui.supporthub.GetSupportAction;
import com.robinhood.models.p355ui.supporthub.SupportRow;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class SupportHubComposableKt$AssignedAgent$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AssignedAgent $agent;
    final /* synthetic */ Function1<GetSupportAction, Unit> $onClickCta;

    /* JADX WARN: Multi-variable type inference failed */
    SupportHubComposableKt$AssignedAgent$1$1(AssignedAgent assignedAgent, Function1<? super GetSupportAction, Unit> function1) {
        this.$agent = assignedAgent;
        this.$onClickCta = function1;
    }

    public final void invoke(Composer composer, int i) {
        final SnapshotState snapshotState;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState2;
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1091819596, i, -1, "com.robinhood.android.support.supporthub.AssignedAgent.<anonymous>.<anonymous> (SupportHubComposable.kt:756)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 7, null);
        final AssignedAgent assignedAgent = this.$agent;
        final Function1<GetSupportAction, Unit> function1 = this.$onClickCta;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
        composer2.startReplaceGroup(-1003410150);
        composer2.startReplaceGroup(212064437);
        composer2.endReplaceGroup();
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Measurer2(density);
            composer2.updateRememberedValue(objRememberedValue);
        }
        final Measurer2 measurer2 = (Measurer2) objRememberedValue;
        Object objRememberedValue2 = composer2.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composer2.updateRememberedValue(objRememberedValue2);
        }
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        Object objRememberedValue3 = composer2.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
        Object objRememberedValue4 = composer2.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
            composer2.updateRememberedValue(objRememberedValue4);
        }
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
        Object objRememberedValue5 = composer2.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer2.updateRememberedValue(objRememberedValue5);
        }
        final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue5;
        boolean zChangedInstance = composer2.changedInstance(measurer2);
        final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        boolean zChanged = zChangedInstance | composer2.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
        Object objRememberedValue6 = composer2.rememberedValue();
        if (zChanged || objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$invoke$lambda$8$$inlined$ConstraintLayout$2
                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    snapshotState4.getValue();
                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i3);
                    snapshotState3.getValue();
                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                    final Measurer2 measurer22 = measurer2;
                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$invoke$lambda$8$$inlined$ConstraintLayout$2.1
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
            snapshotState = snapshotState4;
            constraintSetForInlineDsl = constraintSetForInlineDsl2;
            snapshotState2 = snapshotState3;
            composer2.updateRememberedValue(objRememberedValue6);
        } else {
            snapshotState = snapshotState4;
            constraintSetForInlineDsl = constraintSetForInlineDsl2;
            snapshotState2 = snapshotState3;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
        Object objRememberedValue7 = composer2.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$invoke$lambda$8$$inlined$ConstraintLayout$3
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
                    snapshotState2.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                    constraintSetForInlineDsl.setKnownDirty(true);
                }
            };
            composer2.updateRememberedValue(objRememberedValue7);
        }
        final Function0 function0 = (Function0) objRememberedValue7;
        boolean zChangedInstance2 = composer2.changedInstance(measurer2);
        Object objRememberedValue8 = composer2.rememberedValue();
        if (zChangedInstance2 || objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$invoke$lambda$8$$inlined$ConstraintLayout$4
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
            composer2.updateRememberedValue(objRememberedValue8);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$invoke$lambda$8$$inlined$ConstraintLayout$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(1070661473);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, 0.0f, 2, null);
                    constraintLayoutScope2.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer3.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer3.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new SupportHubComposableKt$AssignedAgent$1$1$1$1$1$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component2);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                    String title = assignedAgent.getTitle();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(title, modifierConstrainAs, null, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i5).getTextL(), composer3, 24576, 0, 8172);
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged3 = composer3.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer3.changed(constraintLayoutBaseScope4Component1);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new SupportHubComposableKt$AssignedAgent$1$1$1$1$2$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component1);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    composer3.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(assignedAgent.getSubtitle(), constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), Color.m6701boximpl(bentoTheme2.getColors(composer3, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i5).getTextM(), composer3, 0, 0, 8184);
                    Modifier modifierTestTag = TestTag3.testTag(companion4, "AssignedAgentAvatar");
                    composer3.startReplaceGroup(-1746271574);
                    boolean zChanged4 = composer3.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new SupportHubComposableKt$AssignedAgent$1$1$1$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    composer3.endReplaceGroup();
                    SingletonAsyncImage.m9119AsyncImagegl8XCv8(new ImageRequest.Builder((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(assignedAgent.getImageUrl()).build(), null, Background3.m4872backgroundbw27NRU$default(Clip.clip(AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(constraintLayoutScope2.constrainAs(modifierTestTag, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), 0.0f, C2002Dp.m7995constructorimpl(60), 1, null), 1.0f, false, 2, null), RoundedCornerShape2.getCircleShape()), bentoTheme2.getColors(composer3, i5).m21372getBg20d7_KjU(), null, 2, null), null, null, Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer3, 1769520, 0, 3992);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, composer2, 54), measurePolicy, composer2, 48, 0);
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1921041150);
        int i4 = 0;
        for (Object obj : assignedAgent.getActions()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final SupportRow supportRow = (SupportRow) obj;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(function1) | composer2.changedInstance(supportRow);
            Object objRememberedValue9 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.support.supporthub.SupportHubComposableKt$AssignedAgent$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportHubComposableKt$AssignedAgent$1$1.invoke$lambda$8$lambda$7$lambda$5$lambda$4(function1, supportRow);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue9);
            }
            composer2.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue9, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(supportRow.getPrimaryLabel(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null), composer2, 24576, 0, 8174);
            composer.endNode();
            composer2 = composer;
            i4 = i5;
            function1 = function1;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$5$lambda$4(Function1 function1, SupportRow supportRow) {
        function1.invoke(supportRow.getAction());
        return Unit.INSTANCE;
    }
}
