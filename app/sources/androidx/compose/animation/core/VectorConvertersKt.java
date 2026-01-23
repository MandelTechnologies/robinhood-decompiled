package androidx.compose.animation.core;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp3;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: VectorConverters.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f\" \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\f\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\f\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0006*\u00020#8F¢\u0006\u0006\u001a\u0004\b \u0010$\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0006*\u00020%8F¢\u0006\u0006\u001a\u0004\b \u0010&\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0006*\u00020'8F¢\u0006\u0006\u001a\u0004\b \u0010(\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0006*\u00020)8F¢\u0006\u0006\u001a\u0004\b \u0010*\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0006*\u00020+8F¢\u0006\u0006\u001a\u0004\b \u0010,\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0006*\u00020-8F¢\u0006\u0006\u001a\u0004\b \u0010.\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b \u00100\"!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0006*\u0002018F¢\u0006\u0006\u001a\u0004\b \u00102¨\u00063"}, m3636d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/TwoWayConverter;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "", "IntToVector", "Landroidx/compose/ui/unit/Dp;", "DpToVector", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpOffsetToVector", "Landroidx/compose/ui/geometry/Size;", "SizeToVector", "Landroidx/compose/ui/geometry/Offset;", "OffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntSize;", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "RectToVector", "Lkotlin/Float$Companion;", "getVectorConverter", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVectors2> FloatToVector = TwoWayConverter(new Function1<Float, AnimationVectors2>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVectors2 invoke(float f) {
            return new AnimationVectors2(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors2 invoke(Float f) {
            return invoke(f.floatValue());
        }
    }, new Function1<AnimationVectors2, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(AnimationVectors2 animationVectors2) {
            return Float.valueOf(animationVectors2.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVectors2> IntToVector = TwoWayConverter(new Function1<Integer, AnimationVectors2>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVectors2 invoke(int i) {
            return new AnimationVectors2(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors2 invoke(Integer num) {
            return invoke(num.intValue());
        }
    }, new Function1<AnimationVectors2, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(AnimationVectors2 animationVectors2) {
            return Integer.valueOf((int) animationVectors2.getValue());
        }
    });
    private static final TwoWayConverter<C2002Dp, AnimationVectors2> DpToVector = TwoWayConverter(new Function1<C2002Dp, AnimationVectors2>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors2 invoke(C2002Dp c2002Dp) {
            return m4836invoke0680j_4(c2002Dp.getValue());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVectors2 m4836invoke0680j_4(float f) {
            return new AnimationVectors2(f);
        }
    }, new Function1<AnimationVectors2, C2002Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C2002Dp invoke(AnimationVectors2 animationVectors2) {
            return C2002Dp.m7993boximpl(m4837invokeu2uoSUM(animationVectors2));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m4837invokeu2uoSUM(AnimationVectors2 animationVectors2) {
            return C2002Dp.m7995constructorimpl(animationVectors2.getValue());
        }
    });
    private static final TwoWayConverter<Dp3, AnimationVectors3> DpOffsetToVector = TwoWayConverter(new Function1<Dp3, AnimationVectors3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(Dp3 dp3) {
            return m4834invokejoFl9I(dp3.getPackedValue());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVectors3 m4834invokejoFl9I(long j) {
            return new AnimationVectors3(Dp3.m8012getXD9Ej5fM(j), Dp3.m8013getYD9Ej5fM(j));
        }
    }, new Function1<AnimationVectors3, Dp3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Dp3 invoke(AnimationVectors3 animationVectors3) {
            return Dp3.m8008boximpl(m4835invokegVRvYmI(animationVectors3));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m4835invokegVRvYmI(AnimationVectors3 animationVectors3) {
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(animationVectors3.getV1());
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(animationVectors3.getV2());
            return Dp3.m8009constructorimpl((Float.floatToRawIntBits(fM7995constructorimpl) << 32) | (Float.floatToRawIntBits(fM7995constructorimpl2) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Size, AnimationVectors3> SizeToVector = TwoWayConverter(new Function1<Size, AnimationVectors3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(Size size) {
            return m4844invokeuvyYCjk(size.getPackedValue());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVectors3 m4844invokeuvyYCjk(long j) {
            return new AnimationVectors3(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Function1<AnimationVectors3, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Size invoke(AnimationVectors3 animationVectors3) {
            return Size.m6574boximpl(m4845invoke7Ah8Wj8(animationVectors3));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m4845invoke7Ah8Wj8(AnimationVectors3 animationVectors3) {
            float v1 = animationVectors3.getV1();
            float v2 = animationVectors3.getV2();
            return Size.m6575constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Offset, AnimationVectors3> OffsetToVector = TwoWayConverter(new Function1<Offset, AnimationVectors3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(Offset offset) {
            return m4842invokek4lQ0M(offset.getPackedValue());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVectors3 m4842invokek4lQ0M(long j) {
            return new AnimationVectors3(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Function1<AnimationVectors3, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVectors3 animationVectors3) {
            return Offset.m6534boximpl(m4843invoketuRUvjQ(animationVectors3));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m4843invoketuRUvjQ(AnimationVectors3 animationVectors3) {
            float v1 = animationVectors3.getV1();
            float v2 = animationVectors3.getV2();
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVectors3> IntOffsetToVector = TwoWayConverter(new Function1<IntOffset, AnimationVectors3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(IntOffset intOffset) {
            return m4838invokegyyYBs(intOffset.getPackedValue());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVectors3 m4838invokegyyYBs(long j) {
            return new AnimationVectors3(IntOffset.m8038getXimpl(j), IntOffset.m8039getYimpl(j));
        }
    }, new Function1<AnimationVectors3, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVectors3 animationVectors3) {
            return IntOffset.m8030boximpl(m4839invokeBjo55l4(animationVectors3));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m4839invokeBjo55l4(AnimationVectors3 animationVectors3) {
            return IntOffset.m8033constructorimpl((Math.round(animationVectors3.getV1()) << 32) | (Math.round(animationVectors3.getV2()) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVectors3> IntSizeToVector = TwoWayConverter(new Function1<IntSize, AnimationVectors3>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVectors3 invoke(IntSize intSize) {
            return m4840invokeozmzZPI(intSize.getPackedValue());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVectors3 m4840invokeozmzZPI(long j) {
            return new AnimationVectors3((int) (j >> 32), (int) (j & 4294967295L));
        }
    }, new Function1<AnimationVectors3, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(AnimationVectors3 animationVectors3) {
            return IntSize.m8055boximpl(m4841invokeYEO4UFw(animationVectors3));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m4841invokeYEO4UFw(AnimationVectors3 animationVectors3) {
            int iRound = Math.round(animationVectors3.getV1());
            if (iRound < 0) {
                iRound = 0;
            }
            return IntSize.m8056constructorimpl(((Math.round(animationVectors3.getV2()) >= 0 ? r7 : 0) & 4294967295L) | (iRound << 32));
        }
    });
    private static final TwoWayConverter<Rect, AnimationVectors5> RectToVector = TwoWayConverter(new Function1<Rect, AnimationVectors5>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // kotlin.jvm.functions.Function1
        public final AnimationVectors5 invoke(Rect rect) {
            return new AnimationVectors5(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new Function1<AnimationVectors5, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Rect invoke(AnimationVectors5 animationVectors5) {
            return new Rect(animationVectors5.getV1(), animationVectors5.getV2(), animationVectors5.getV3(), animationVectors5.getV4());
        }
    });

    public static final <T, V extends AnimationVectors> TwoWayConverter<T, V> TwoWayConverter(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        return new TwoWayConverterImpl(function1, function12);
    }

    public static final TwoWayConverter<Float, AnimationVectors2> getVectorConverter(FloatCompanionObject floatCompanionObject) {
        return FloatToVector;
    }

    public static final TwoWayConverter<Integer, AnimationVectors2> getVectorConverter(IntCompanionObject intCompanionObject) {
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVectors5> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<C2002Dp, AnimationVectors2> getVectorConverter(C2002Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<Dp3, AnimationVectors3> getVectorConverter(Dp3.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVectors3> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVectors3> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVectors3> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVectors3> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
