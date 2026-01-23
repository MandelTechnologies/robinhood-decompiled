package com.robinhood.android.tradinghourvisual.lib.p263ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes9.dex */
public final class C29958xe6326d5d extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ float $bottomTextMargin$inlined;
    final /* synthetic */ float $boundaryBarWidth$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ Density $density$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ImmutableList $gradient$inlined;
    final /* synthetic */ boolean $isSelectedMarketHoursNull$inlined;
    final /* synthetic */ SnapshotState4 $leftAnimatedProgress$delegate$inlined;
    final /* synthetic */ ImmutableList $leftBoundaryText$inlined;
    final /* synthetic */ ImmutableList $leftEdgeText$inlined;
    final /* synthetic */ SnapshotState $leftTextColumnWidth$inlined;
    final /* synthetic */ int $numPegs$inlined;
    final /* synthetic */ float $pegHeight$inlined;
    final /* synthetic */ float $pegWidth$inlined;
    final /* synthetic */ float $pixelInDp$inlined;
    final /* synthetic */ SnapshotState4 $rightAnimatedProgress$delegate$inlined;
    final /* synthetic */ ImmutableList $rightBoundaryText$inlined;
    final /* synthetic */ ImmutableList $rightEdgeText$inlined;
    final /* synthetic */ SnapshotState $rightTextColumnWidth$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ float $textToColumnSpacing$inlined;
    final /* synthetic */ float $topVerticalBarHeight$inlined;
    final /* synthetic */ float $totalWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29958xe6326d5d(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, float f, SnapshotState snapshotState5, boolean z, ImmutableList immutableList, float f2, Density density, ImmutableList immutableList2, float f3, float f4, float f5, ImmutableList immutableList3, float f6, ImmutableList immutableList4, ImmutableList immutableList5, SnapshotState4 snapshotState42, SnapshotState4 snapshotState43, int i, float f7, float f8) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$leftTextColumnWidth$inlined = snapshotState4;
        this.$totalWidth$inlined = f;
        this.$rightTextColumnWidth$inlined = snapshotState5;
        this.$isSelectedMarketHoursNull$inlined = z;
        this.$leftBoundaryText$inlined = immutableList;
        this.$textToColumnSpacing$inlined = f2;
        this.$density$inlined = density;
        this.$rightBoundaryText$inlined = immutableList2;
        this.$boundaryBarWidth$inlined = f3;
        this.$topVerticalBarHeight$inlined = f4;
        this.$bottomTextMargin$inlined = f5;
        this.$gradient$inlined = immutableList3;
        this.$pixelInDp$inlined = f6;
        this.$leftEdgeText$inlined = immutableList4;
        this.$rightEdgeText$inlined = immutableList5;
        this.$leftAnimatedProgress$delegate$inlined = snapshotState42;
        this.$rightAnimatedProgress$delegate$inlined = snapshotState43;
        this.$numPegs$inlined = i;
        this.$pegWidth$inlined = f7;
        this.$pegHeight$inlined = f8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
        ConstraintLayoutScope constraintLayoutScope;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        int i2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        boolean zChanged4;
        Object objRememberedValue4;
        boolean zChanged5;
        Object objRememberedValue5;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer.startReplaceGroup(2101160121);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(this.$leftAnimatedProgress$delegate$inlined));
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart2 = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(this.$rightAnimatedProgress$delegate$inlined));
        float value = (((C2002Dp) this.$leftTextColumnWidth$inlined.getValue()).getValue() / 2.0f) / this.$totalWidth$inlined;
        float value2 = 1 - ((((C2002Dp) this.$rightTextColumnWidth$inlined.getValue()).getValue() / 2.0f) / this.$totalWidth$inlined);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart3 = constraintLayoutScope2.createGuidelineFromStart(Math.max(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(this.$leftAnimatedProgress$delegate$inlined), value));
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart4 = constraintLayoutScope2.createGuidelineFromStart(Math.min(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(this.$rightAnimatedProgress$delegate$inlined), value2));
        composer.startReplaceGroup(-624937487);
        if (this.$isSelectedMarketHoursNull$inlined) {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component6;
            verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            i2 = -1633490746;
            verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
        } else {
            ImmutableList immutableList = this.$leftBoundaryText$inlined;
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(this.$textToColumnSpacing$inlined);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged6 = composer.changed(verticalAnchorCreateGuidelineFromStart3) | composer.changed(constraintLayoutBaseScope4Component7);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6) {
                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
            } else {
                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue6);
                composer.startReplaceGroup(-1633490746);
                zChanged = composer.changed(this.$density$inlined);
                objRememberedValue = composer.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(this.$leftTextColumnWidth$inlined, this.$density$inlined);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                i2 = -1633490746;
                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue), null, null, composer, 48, 48);
                ImmutableList immutableList2 = this.$rightBoundaryText$inlined;
                Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(this.$textToColumnSpacing$inlined);
                composer.startReplaceGroup(-1633490746);
                zChanged2 = composer.changed(verticalAnchorCreateGuidelineFromStart4) | composer.changed(constraintLayoutBaseScope4Component8);
                objRememberedValue2 = composer.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                constraintLayoutScope = constraintLayoutScope2;
                Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue2);
                composer.startReplaceGroup(-1633490746);
                zChanged3 = composer.changed(this.$density$inlined);
                objRememberedValue3 = composer.rememberedValue();
                if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(this.$rightTextColumnWidth$inlined, this.$density$inlined);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList2, centerHorizontally2, horizontalOrVerticalM5089spacedBy0680j_42, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs2, (Function1) objRememberedValue3), null, null, composer, 48, 48);
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, this.$boundaryBarWidth$inlined), this.$topVerticalBarHeight$inlined);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null, 2, null);
                composer.startReplaceGroup(-1746271574);
                verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                zChanged4 = composer.changed(verticalAnchor2) | composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
                objRememberedValue4 = composer.rememberedValue();
                if (!zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                BoxKt.Box(TestTag3.testTag(constraintLayoutScope.constrainAs(modifierM4872backgroundbw27NRU$default, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue4), Tags.LEFT_EDGE_BAR.getString()), composer, 0);
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, this.$boundaryBarWidth$inlined), this.$topVerticalBarHeight$inlined), bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null, 2, null);
                composer.startReplaceGroup(-1746271574);
                verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                zChanged5 = composer.changed(verticalAnchor) | composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
                objRememberedValue5 = composer.rememberedValue();
                if (!zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                BoxKt.Box(TestTag3.testTag(constraintLayoutScope.constrainAs(modifierM4872backgroundbw27NRU$default2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue5), Tags.RIGHT_EDGE_BAR.getString()), composer, 0);
            }
            objRememberedValue6 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$1$1(verticalAnchorCreateGuidelineFromStart3, constraintLayoutBaseScope4Component7);
            composer.updateRememberedValue(objRememberedValue6);
            composer.endReplaceGroup();
            Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue6);
            composer.startReplaceGroup(-1633490746);
            zChanged = composer.changed(this.$density$inlined);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(this.$leftTextColumnWidth$inlined, this.$density$inlined);
                composer.updateRememberedValue(objRememberedValue);
                composer.endReplaceGroup();
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                i2 = -1633490746;
                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs3, (Function1) objRememberedValue), null, null, composer, 48, 48);
                ImmutableList immutableList22 = this.$rightBoundaryText$inlined;
                Alignment.Horizontal centerHorizontally22 = companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_422 = arrangement.m5089spacedBy0680j_4(this.$textToColumnSpacing$inlined);
                composer.startReplaceGroup(-1633490746);
                zChanged2 = composer.changed(verticalAnchorCreateGuidelineFromStart4) | composer.changed(constraintLayoutBaseScope4Component8);
                objRememberedValue2 = composer.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                    composer.updateRememberedValue(objRememberedValue2);
                    composer.endReplaceGroup();
                    constraintLayoutScope = constraintLayoutScope2;
                    Modifier modifierConstrainAs22 = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue2);
                    composer.startReplaceGroup(-1633490746);
                    zChanged3 = composer.changed(this.$density$inlined);
                    objRememberedValue3 = composer.rememberedValue();
                    if (!zChanged3) {
                        objRememberedValue3 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(this.$rightTextColumnWidth$inlined, this.$density$inlined);
                        composer.updateRememberedValue(objRememberedValue3);
                        composer.endReplaceGroup();
                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList22, centerHorizontally22, horizontalOrVerticalM5089spacedBy0680j_422, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs22, (Function1) objRememberedValue3), null, null, composer, 48, 48);
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, this.$boundaryBarWidth$inlined), this.$topVerticalBarHeight$inlined);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i32 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs2, bentoTheme2.getColors(composer, i32).m21425getFg0d7_KjU(), null, 2, null);
                        composer.startReplaceGroup(-1746271574);
                        verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                        constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                        zChanged4 = composer.changed(verticalAnchor2) | composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
                        objRememberedValue4 = composer.rememberedValue();
                        if (!zChanged4) {
                            objRememberedValue4 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
                            composer.updateRememberedValue(objRememberedValue4);
                            composer.endReplaceGroup();
                            BoxKt.Box(TestTag3.testTag(constraintLayoutScope.constrainAs(modifierM4872backgroundbw27NRU$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue4), Tags.LEFT_EDGE_BAR.getString()), composer, 0);
                            Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, this.$boundaryBarWidth$inlined), this.$topVerticalBarHeight$inlined), bentoTheme2.getColors(composer, i32).m21425getFg0d7_KjU(), null, 2, null);
                            composer.startReplaceGroup(-1746271574);
                            verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                            zChanged5 = composer.changed(verticalAnchor) | composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
                            objRememberedValue5 = composer.rememberedValue();
                            if (!zChanged5) {
                                objRememberedValue5 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
                                composer.updateRememberedValue(objRememberedValue5);
                                composer.endReplaceGroup();
                                BoxKt.Box(TestTag3.testTag(constraintLayoutScope.constrainAs(modifierM4872backgroundbw27NRU$default22, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue5), Tags.RIGHT_EDGE_BAR.getString()), composer, 0);
                            }
                        }
                    }
                }
            }
        }
        composer.endReplaceGroup();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
        int i4 = BentoTheme.$stable;
        Modifier modifierBorder$default = BorderKt.border$default(Background3.background$default(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, this.$gradient$inlined, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), BorderStroke2.m4886BorderStrokecXLIe8U(this.$pixelInDp$inlined, bentoTheme3.getColors(composer, i4).m21425getFg0d7_KjU()), null, 2, null);
        composer.startReplaceGroup(i2);
        boolean zChanged7 = composer.changed(verticalAnchor2) | composer.changed(verticalAnchor);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue7 = new C29964xd11e65b9(verticalAnchor2, verticalAnchor);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs4 = constraintLayoutScope.constrainAs(modifierBorder$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue7);
        Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
        composer.startReplaceGroup(i2);
        boolean zChanged8 = composer.changed(verticalAnchor2) | composer.changed(verticalAnchor);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue8 = new C29965xf4740c42(verticalAnchor2, verticalAnchor);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs5 = constraintLayoutScope.constrainAs(modifierM5156height3ABfNKs3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue8);
        if (this.$isSelectedMarketHoursNull$inlined) {
            modifierConstrainAs4 = modifierConstrainAs5;
        }
        BoxKt.Box(modifierConstrainAs4, composer, 0);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged9 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue9 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$7$1(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs6 = constraintLayoutScope.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope42, (Function1) objRememberedValue9);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer, 6);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierConstrainAs6);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        composer.startReplaceGroup(-1520526513);
        for (int i5 = 0; i5 < this.$numPegs$inlined; i5++) {
            BoxKt.Box(TestTag3.testTag(row6.align(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, this.$pegWidth$inlined), this.$pegHeight$inlined), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, 2, null), Alignment.INSTANCE.getBottom()), Tags.PEG.getString()), composer, 0);
        }
        composer.endReplaceGroup();
        composer.endNode();
        Alignment.Companion companion5 = Alignment.INSTANCE;
        Alignment.Horizontal start = companion5.getStart();
        Arrangement arrangement2 = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_43 = arrangement2.m5089spacedBy0680j_4(this.$textToColumnSpacing$inlined);
        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        long jM21427getFg30d7_KjU = bentoTheme4.getColors(composer, i6).m21427getFg30d7_KjU();
        Modifier.Companion companion6 = Modifier.INSTANCE;
        composer.startReplaceGroup(i2);
        boolean zChanged10 = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue10 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$9$1(constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs7 = constraintLayoutScope.constrainAs(companion6, constraintLayoutBaseScope43, (Function1) objRememberedValue10);
        TextAlign.Companion companion7 = TextAlign.INSTANCE;
        TextToColumnComposable.m19504TextToColumnrX12GvU(this.$leftEdgeText$inlined, start, horizontalOrVerticalM5089spacedBy0680j_43, modifierConstrainAs7, Color.m6701boximpl(jM21427getFg30d7_KjU), TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), composer, 48, 0);
        Alignment.Horizontal end = companion5.getEnd();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_44 = arrangement2.m5089spacedBy0680j_4(this.$textToColumnSpacing$inlined);
        long jM21427getFg30d7_KjU2 = bentoTheme4.getColors(composer, i6).m21427getFg30d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged11 = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(this.$bottomTextMargin$inlined);
        Object objRememberedValue11 = composer.rememberedValue();
        if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue11 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$10$1(constraintLayoutBaseScope4Component1, this.$bottomTextMargin$inlined);
            composer.updateRememberedValue(objRememberedValue11);
        }
        composer.endReplaceGroup();
        TextToColumnComposable.m19504TextToColumnrX12GvU(this.$rightEdgeText$inlined, end, horizontalOrVerticalM5089spacedBy0680j_44, constraintLayoutScope.constrainAs(companion6, constraintLayoutBaseScope4, (Function1) objRememberedValue11), Color.m6701boximpl(jM21427getFg30d7_KjU2), TextAlign.m7912boximpl(companion7.m7920getEnde0LSkKk()), composer, 48, 0);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue12 = new Function0<Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope3.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue12);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue12, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
