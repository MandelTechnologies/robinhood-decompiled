package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.SelectionMagnifier;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectionMagnifier.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "platformMagnifier", "animatedSelectionMagnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "targetCalculation", "Landroidx/compose/runtime/State;", "rememberAnimatedMagnifierPosition", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "J", "getOffsetDisplacementThreshold", "()J", "Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "targetValue", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt, reason: use source file name */
/* loaded from: classes.dex */
public final class SelectionMagnifier {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVectors3 UnspecifiedAnimationVector2D = new AnimationVectors3(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVectors3> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<Offset, AnimationVectors3>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(Offset offset) {
            return m5514invokek4lQ0M(offset.getPackedValue());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVectors3 m5514invokek4lQ0M(long j) {
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                return SelectionMagnifier.UnspecifiedAnimationVector2D;
            }
            return new AnimationVectors3(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Function1<AnimationVectors3, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVectors3 animationVectors3) {
            return Offset.m6534boximpl(m5515invoketuRUvjQ(animationVectors3));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m5515invoketuRUvjQ(AnimationVectors3 animationVectors3) {
            float v1 = animationVectors3.getV1();
            float v2 = animationVectors3.getV2();
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L));
        }
    });

    static {
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L));
        OffsetDisplacementThreshold = jM6535constructorimpl;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m6534boximpl(jM6535constructorimpl), 3, null);
    }

    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    /* compiled from: SelectionMagnifier.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1 */
    static final class C14361 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function0<Offset> $magnifierCenter;
        final /* synthetic */ Function1<Function0<Offset>, Modifier> $platformMagnifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14361(Function0<Offset> function0, Function1<? super Function0<Offset>, ? extends Modifier> function1) {
            super(3);
            this.$magnifierCenter = function0;
            this.$platformMagnifier = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
            composer.startReplaceGroup(759876635);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
            }
            final SnapshotState4 snapshotState4RememberAnimatedMagnifierPosition = SelectionMagnifier.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
            Function1<Function0<Offset>, Modifier> function1 = this.$platformMagnifier;
            boolean zChanged = composer.changed(snapshotState4RememberAnimatedMagnifierPosition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m6534boximpl(m5516invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m5516invokeF1C5BW0() {
                        return SelectionMagnifier.C14361.invoke$lambda$0(snapshotState4RememberAnimatedMagnifierPosition);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierInvoke = function1.invoke((Function0) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierInvoke;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$0(SnapshotState4<Offset> snapshotState4) {
            return snapshotState4.getValue().getPackedValue();
        }
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, Function0<Offset> function0, Function1<? super Function0<Offset>, ? extends Modifier> function1) {
        return ComposedModifier2.composed$default(modifier, null, new C14361(function0, function1), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState4<Offset> rememberAnimatedMagnifierPosition(Function0<Offset> function0, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            Object animatable = new Animatable(Offset.m6534boximpl(rememberAnimatedMagnifierPosition$lambda$1(snapshotState4)), UnspecifiedSafeOffsetVectorConverter, Offset.m6534boximpl(OffsetDisplacementThreshold), null, 8, null);
            composer.updateRememberedValue(animatable);
            objRememberedValue2 = animatable;
        }
        Animatable animatable2 = (Animatable) objRememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean zChangedInstance = composer.changedInstance(animatable2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new SelectionMagnifier5(snapshotState4, animatable2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
        SnapshotState4<Offset> snapshotState4AsState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4AsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(SnapshotState4<Offset> snapshotState4) {
        return snapshotState4.getValue().getPackedValue();
    }
}
