package com.google.accompanist.placeholder;

import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Placeholder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
final class PlaceholderKt$placeholder$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ long $color;
    final /* synthetic */ Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> $contentFadeTransitionSpec;
    final /* synthetic */ PlaceholderHighlight $highlight;
    final /* synthetic */ Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> $placeholderFadeTransitionSpec;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlaceholderKt$placeholder$4(Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function32, PlaceholderHighlight placeholderHighlight, boolean z, long j, Shape shape) {
        super(3);
        this.$placeholderFadeTransitionSpec = function3;
        this.$contentFadeTransitionSpec = function32;
        this.$highlight = placeholderHighlight;
        this.$visible = z;
        this.$color = j;
        this.$shape = shape;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    private static final void invoke$lambda$5(SnapshotState<Float> snapshotState, float f) {
        snapshotState.setValue(Float.valueOf(f));
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-1214629560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1214629560, i, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:137)");
        }
        composer2.startReplaceableGroup(804161266);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Ref();
            composer2.updateRememberedValue(objRememberedValue);
        }
        final Ref ref = (Ref) objRememberedValue;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161321);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Ref();
            composer2.updateRememberedValue(objRememberedValue2);
        }
        final Ref ref2 = (Ref) objRememberedValue2;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161379);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Ref();
            composer2.updateRememberedValue(objRememberedValue3);
        }
        final Ref ref3 = (Ref) objRememberedValue3;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161492);
        Object objRememberedValue4 = composer2.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer2.updateRememberedValue(objRememberedValue4);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161591);
        boolean z = this.$visible;
        Object objRememberedValue5 = composer2.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new MutableTransitionState(Boolean.valueOf(z));
            composer2.updateRememberedValue(objRememberedValue5);
        }
        MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue5;
        composer2.endReplaceableGroup();
        mutableTransitionState.setTargetState(Boolean.valueOf(this.$visible));
        Transition transitionUpdateTransition = TransitionKt.updateTransition(mutableTransitionState, "placeholder_crossfade", composer2, MutableTransitionState.$stable | 48, 0);
        Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = this.$placeholderFadeTransitionSpec;
        composer2.startReplaceableGroup(-1338768149);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composer2.startReplaceableGroup(-142660079);
        boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composer2.startReplaceableGroup(-2085173843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
        }
        float f = zBooleanValue ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f);
        boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composer2.startReplaceableGroup(-2085173843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
        }
        float f2 = zBooleanValue2 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        final SnapshotState4 snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), function3.invoke(transitionUpdateTransition.getSegment(), composer2, 0), vectorConverter, "placeholder_fade", composer2, 196608);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> function32 = this.$contentFadeTransitionSpec;
        composer2.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composer2.startReplaceableGroup(-142660079);
        boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composer2.startReplaceableGroup(992792551);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
        }
        float f3 = zBooleanValue3 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float fValueOf2 = Float.valueOf(f3);
        boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composer2.startReplaceableGroup(992792551);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
        }
        float f4 = zBooleanValue4 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        final SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), function32.invoke(transitionUpdateTransition.getSegment(), composer2, 0), vectorConverter2, "content_fade", composer2, 196608);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        PlaceholderHighlight placeholderHighlight = this.$highlight;
        InfiniteRepeatableSpec<Float> animationSpec = placeholderHighlight != null ? placeholderHighlight.getAnimationSpec() : null;
        composer2.startReplaceableGroup(804162378);
        if (animationSpec != null && (this.$visible || invoke$lambda$9(snapshotState4CreateTransitionAnimation) >= 0.01f)) {
            SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composer2, 0, 1), 0.0f, 1.0f, animationSpec, null, composer, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            composer2 = composer;
            invoke$lambda$5(snapshotState, snapshotState4AnimateFloat.getValue().floatValue());
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804162715);
        Object objRememberedValue6 = composer2.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = AndroidPaint_androidKt.Paint();
            composer2.updateRememberedValue(objRememberedValue6);
        }
        final Paint paint = (Paint) objRememberedValue6;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804162740);
        boolean zChanged = composer2.changed(this.$color) | composer2.changed(this.$shape) | composer2.changed(this.$highlight);
        final Shape shape = this.$shape;
        final long j = this.$color;
        final PlaceholderHighlight placeholderHighlight2 = this.$highlight;
        Object objRememberedValue7 = composer2.rememberedValue();
        if (zChanged || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = DrawModifierKt.drawWithContent(composed, new Function1<ContentDrawScope, Unit>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$4$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope drawWithContent) {
                    ContentDrawScope contentDrawScope;
                    Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                    float fInvoke$lambda$11 = PlaceholderKt$placeholder$4.invoke$lambda$11(snapshotState4CreateTransitionAnimation2);
                    if (0.01f <= fInvoke$lambda$11 && fInvoke$lambda$11 <= 0.99f) {
                        paint.setAlpha(PlaceholderKt$placeholder$4.invoke$lambda$11(snapshotState4CreateTransitionAnimation2));
                        Paint paint2 = paint;
                        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
                        canvas.saveLayer(SizeKt.m6592toRectuvyYCjk(drawWithContent.mo6963getSizeNHjbRc()), paint2);
                        drawWithContent.drawContent();
                        canvas.restore();
                    } else if (PlaceholderKt$placeholder$4.invoke$lambda$11(snapshotState4CreateTransitionAnimation2) >= 0.99f) {
                        drawWithContent.drawContent();
                    }
                    float fInvoke$lambda$9 = PlaceholderKt$placeholder$4.invoke$lambda$9(snapshotState4CreateTransitionAnimation);
                    if (0.01f > fInvoke$lambda$9 || fInvoke$lambda$9 > 0.99f) {
                        contentDrawScope = drawWithContent;
                        if (PlaceholderKt$placeholder$4.invoke$lambda$9(snapshotState4CreateTransitionAnimation) >= 0.99f) {
                            ref3.setValue(PlaceholderKt.m9208drawPlaceholderhpmOzss(contentDrawScope, shape, j, placeholderHighlight2, PlaceholderKt$placeholder$4.invoke$lambda$4(snapshotState), ref3.getValue(), ref2.getValue(), ref.getValue()));
                        }
                    } else {
                        paint.setAlpha(PlaceholderKt$placeholder$4.invoke$lambda$9(snapshotState4CreateTransitionAnimation));
                        Paint paint3 = paint;
                        Ref<Outline> ref4 = ref3;
                        Shape shape2 = shape;
                        long j2 = j;
                        PlaceholderHighlight placeholderHighlight3 = placeholderHighlight2;
                        Ref<LayoutDirection> ref5 = ref2;
                        Ref<Size> ref6 = ref;
                        SnapshotState<Float> snapshotState2 = snapshotState;
                        Canvas canvas2 = drawWithContent.getDrawContext().getCanvas();
                        canvas2.saveLayer(SizeKt.m6592toRectuvyYCjk(drawWithContent.mo6963getSizeNHjbRc()), paint3);
                        contentDrawScope = drawWithContent;
                        ref4.setValue(PlaceholderKt.m9208drawPlaceholderhpmOzss(contentDrawScope, shape2, j2, placeholderHighlight3, PlaceholderKt$placeholder$4.invoke$lambda$4(snapshotState2), ref4.getValue(), ref5.getValue(), ref6.getValue()));
                        canvas2.restore();
                    }
                    ref.setValue(Size.m6574boximpl(contentDrawScope.mo6963getSizeNHjbRc()));
                    ref2.setValue(contentDrawScope.getLayoutDirection());
                }
            });
            composer2.updateRememberedValue(objRememberedValue7);
        }
        Modifier modifier = (Modifier) objRememberedValue7;
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$9(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$11(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
