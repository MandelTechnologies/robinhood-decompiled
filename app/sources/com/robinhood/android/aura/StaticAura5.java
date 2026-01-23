package com.robinhood.android.aura;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaticAura.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B+\b\u0004\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/aura/StaticAuraType;", "", "colors", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "bitmapResource", "", "<init>", "(Ljava/util/List;I)V", "getColors", "()Ljava/util/List;", "getBitmapResource", "()I", "getRadialGradientCenter", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "getRadialGradientCenter-esNoTWg", "(JF)J", "Negative", "Neutral", "Positive", "PositiveGateway", "Lcom/robinhood/android/aura/StaticAuraType$Negative;", "Lcom/robinhood/android/aura/StaticAuraType$Neutral;", "Lcom/robinhood/android/aura/StaticAuraType$Positive;", "Lcom/robinhood/android/aura/StaticAuraType$PositiveGateway;", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.aura.StaticAuraType, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class StaticAura5 {
    public static final int $stable = 8;
    private final int bitmapResource;
    private final List<Tuples2<Float, Color>> colors;

    public /* synthetic */ StaticAura5(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i);
    }

    /* renamed from: getRadialGradientCenter-esNoTWg, reason: not valid java name */
    public abstract long mo11353getRadialGradientCenteresNoTWg(long size, float radius);

    /* compiled from: StaticAura.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/StaticAuraType$Negative;", "Lcom/robinhood/android/aura/StaticAuraType;", "<init>", "()V", "getRadialGradientCenter", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "", "getRadialGradientCenter-esNoTWg", "(JF)J", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.StaticAuraType$Negative */
    public static final class Negative extends StaticAura5 {
        public static final Negative INSTANCE = new Negative();
        public static final int $stable = 8;

        @Override // com.robinhood.android.aura.StaticAura5
        /* renamed from: getRadialGradientCenter-esNoTWg */
        public long mo11353getRadialGradientCenteresNoTWg(long size, float radius) {
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (size >> 32)) * 0.5f) - (radius * 0.2f);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) * 0.45f;
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        }

        private Negative() {
            super(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.17f), Color.m6701boximpl(Color2.Color(4292411245L))), Tuples4.m3642to(Float.valueOf(0.32f), Color.m6701boximpl(Color2.Color(4294931610L))), Tuples4.m3642to(Float.valueOf(0.64f), Color.m6701boximpl(Color2.Color(4294537291L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4283182494L)))}), C9618R.drawable.negative, null);
        }
    }

    /* compiled from: StaticAura.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/StaticAuraType$Neutral;", "Lcom/robinhood/android/aura/StaticAuraType;", "<init>", "()V", "getRadialGradientCenter", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "", "getRadialGradientCenter-esNoTWg", "(JF)J", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.StaticAuraType$Neutral */
    public static final class Neutral extends StaticAura5 {
        public static final Neutral INSTANCE = new Neutral();
        public static final int $stable = 8;

        @Override // com.robinhood.android.aura.StaticAura5
        /* renamed from: getRadialGradientCenter-esNoTWg */
        public long mo11353getRadialGradientCenteresNoTWg(long size, float radius) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) * 0.29f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) * 0.63f;
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        }

        private Neutral() {
            super(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.49f), Color.m6701boximpl(Color2.Color(4294736623L))), Tuples4.m3642to(Float.valueOf(0.84f), Color.m6701boximpl(Color2.Color(4287781358L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4283334911L)))}), C9618R.drawable.neutral, null);
        }
    }

    /* compiled from: StaticAura.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/StaticAuraType$Positive;", "Lcom/robinhood/android/aura/StaticAuraType;", "<init>", "()V", "getRadialGradientCenter", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "", "getRadialGradientCenter-esNoTWg", "(JF)J", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.StaticAuraType$Positive */
    public static final class Positive extends StaticAura5 {
        public static final Positive INSTANCE = new Positive();
        public static final int $stable = 8;

        @Override // com.robinhood.android.aura.StaticAura5
        /* renamed from: getRadialGradientCenter-esNoTWg */
        public long mo11353getRadialGradientCenteresNoTWg(long size, float radius) {
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (size >> 32)) * 0.5f) - (radius * 0.2f);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) * 0.45f;
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        }

        private Positive() {
            super(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.9f), Color.m6701boximpl(Color2.Color(4292411245L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4278222837L)))}), C9618R.drawable.positive, null);
        }
    }

    /* compiled from: StaticAura.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/StaticAuraType$PositiveGateway;", "Lcom/robinhood/android/aura/StaticAuraType;", "<init>", "()V", "getRadialGradientCenter", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "", "getRadialGradientCenter-esNoTWg", "(JF)J", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.StaticAuraType$PositiveGateway */
    public static final class PositiveGateway extends StaticAura5 {
        public static final PositiveGateway INSTANCE = new PositiveGateway();
        public static final int $stable = 8;

        @Override // com.robinhood.android.aura.StaticAura5
        /* renamed from: getRadialGradientCenter-esNoTWg */
        public long mo11353getRadialGradientCenteresNoTWg(long size, float radius) {
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (size >> 32)) * 0.5f) - (radius * 0.2f);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) * 0.45f;
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        }

        private PositiveGateway() {
            super(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.41f), Color.m6701boximpl(Color2.Color(4292411245L))), Tuples4.m3642to(Float.valueOf(0.61f), Color.m6701boximpl(Color2.Color(4278222837L))), Tuples4.m3642to(Float.valueOf(0.86f), Color.m6701boximpl(Color2.Color(4283182494L)))}), C9618R.drawable.positive_gateway, null);
        }
    }

    private StaticAura5(List<Tuples2<Float, Color>> list, int i) {
        this.colors = list;
        this.bitmapResource = i;
    }

    public final int getBitmapResource() {
        return this.bitmapResource;
    }

    public final List<Tuples2<Float, Color>> getColors() {
        return this.colors;
    }
}
