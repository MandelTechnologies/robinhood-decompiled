package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: CryptoQuickTradeSwipeToSubmit.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeSwipeToSubmit4 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animTargetOffset;
    final /* synthetic */ Density $density;
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ SnapshotFloatState2 $knobOffsetPx$delegate;
    final /* synthetic */ float $knobSize;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ SnapshotState<Boolean> $submitted$delegate;
    final /* synthetic */ float $trackHeight;
    final /* synthetic */ String $trackText;

    CryptoQuickTradeSwipeToSubmit4(Density density, Animatable<Float, AnimationVectors2> animatable, float f, Function0<Unit> function0, float f2, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotFloatState2 snapshotFloatState2, String str) {
        this.$density = density;
        this.$animTargetOffset = animatable;
        this.$knobSize = f;
        this.$onSubmit = function0;
        this.$trackHeight = f2;
        this.$submitted$delegate = snapshotState;
        this.$isDragging$delegate = snapshotState2;
        this.$knobOffsetPx$delegate = snapshotFloatState2;
        this.$trackText = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$9$lambda$8(int i, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((i << 32) | (0 & 4294967295L)));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
        invoke(boxWithConstraints4, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1931424784, i2, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmit.<anonymous> (CryptoQuickTradeSwipeToSubmit.kt:72)");
        }
        float fMo5016toPx0680j_4 = this.$density.mo5016toPx0680j_4(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM());
        float fMo5016toPx0680j_42 = this.$density.mo5016toPx0680j_4(this.$knobSize);
        final float fMo5016toPx0680j_43 = this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(this.$trackHeight - this.$knobSize)) / 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((fMo5016toPx0680j_4 - fMo5016toPx0680j_42) - fMo5016toPx0680j_43, fMo5016toPx0680j_43);
        int iRoundToInt = CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$1(this.$submitted$delegate) ? MathKt.roundToInt(fCoerceAtLeast) : CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$8(this.$isDragging$delegate) ? MathKt.roundToInt(this.$knobOffsetPx$delegate.getFloatValue()) : MathKt.roundToInt(this.$animTargetOffset.getValue().floatValue());
        float f = 1 - ((iRoundToInt / fCoerceAtLeast) * 4);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i4 = BentoTheme.$stable;
        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxSize$default, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(999)));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment center = companion2.getCenter();
        String str = this.$trackText;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4871backgroundbw27NRU);
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
        final int i5 = iRoundToInt;
        BentoText2.m20747BentoText38GnDrw(str, Alpha.alpha(companion, RangesKt.coerceIn(f, 0.0f, 1.0f)), Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextM(), composer, 24576, 0, 8168);
        composer.endNode();
        Modifier modifierAlign = BoxWithConstraints.align(SizeKt.m5169size3ABfNKs(companion, this.$knobSize), companion2.getCenterStart());
        Orientation orientation = Orientation.Horizontal;
        boolean z = !CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$1(this.$submitted$delegate);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(fMo5016toPx0680j_43) | composer.changed(fCoerceAtLeast);
        final SnapshotFloatState2 snapshotFloatState2 = this.$knobOffsetPx$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeSwipeToSubmit4.invoke$lambda$5$lambda$4(fMo5016toPx0680j_43, fCoerceAtLeast, snapshotFloatState2, ((Float) obj).floatValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue, composer, 0);
        composer.startReplaceGroup(5004770);
        SnapshotState<Boolean> snapshotState = this.$isDragging$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new CryptoQuickTradeSwipeToSubmit5(snapshotState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function3 function3 = (Function3) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = composer.changed(fCoerceAtLeast) | composer.changed(this.$onSubmit) | composer.changedInstance(this.$animTargetOffset) | composer.changed(fMo5016toPx0680j_43);
        Function0<Unit> function0 = this.$onSubmit;
        Animatable<Float, AnimationVectors2> animatable = this.$animTargetOffset;
        SnapshotState<Boolean> snapshotState2 = this.$isDragging$delegate;
        SnapshotFloatState2 snapshotFloatState22 = this.$knobOffsetPx$delegate;
        SnapshotState<Boolean> snapshotState3 = this.$submitted$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
            i3 = 5004770;
            CryptoQuickTradeSwipeToSubmit6 cryptoQuickTradeSwipeToSubmit6 = new CryptoQuickTradeSwipeToSubmit6(fCoerceAtLeast, function0, animatable, fMo5016toPx0680j_43, snapshotState2, snapshotFloatState22, snapshotState3, null);
            composer.updateRememberedValue(cryptoQuickTradeSwipeToSubmit6);
            objRememberedValue3 = cryptoQuickTradeSwipeToSubmit6;
        } else {
            i3 = 5004770;
        }
        composer.endReplaceGroup();
        Modifier modifierDraggable$default = DraggableKt.draggable$default(modifierAlign, draggableStateRememberDraggableState, orientation, z, null, false, function3, (Function3) objRememberedValue3, false, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, null);
        composer.startReplaceGroup(i3);
        boolean zChanged3 = composer.changed(i5);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion4.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeSwipeToSubmit4.invoke$lambda$9$lambda$8(i5, (Density) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(OffsetKt.offset(modifierDraggable$default, (Function1) objRememberedValue4), bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU(), RoundedCornerShape2.getCircleShape());
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4871backgroundbw27NRU2);
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "Slide", bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(float f, float f2, SnapshotFloatState2 snapshotFloatState2, float f3) {
        snapshotFloatState2.setFloatValue(RangesKt.coerceIn(snapshotFloatState2.getFloatValue() + f3, f, f2));
        return Unit.INSTANCE;
    }
}
