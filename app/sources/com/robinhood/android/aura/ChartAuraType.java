package com.robinhood.android.aura;

import android.animation.ArgbEvaluator;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ChartAuraType.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B+\b\u0004\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/aura/ChartAuraType;", "", "colors", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "staticAngleInDegrees", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;F)V", "getColors", "()Lkotlinx/collections/immutable/ImmutableList;", "getStaticAngleInDegrees", "()F", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "getColorAt", "pointProgress", "getColorAt-vNxB06k", "(F)J", "Positive", "Neutral", "Negative", "Lcom/robinhood/android/aura/ChartAuraType$Negative;", "Lcom/robinhood/android/aura/ChartAuraType$Neutral;", "Lcom/robinhood/android/aura/ChartAuraType$Positive;", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class ChartAuraType {
    public static final int $stable = 8;
    private final ArgbEvaluator argbEvaluator;
    private final ImmutableList<Tuples2<Float, Color>> colors;
    private final float staticAngleInDegrees;

    public /* synthetic */ ChartAuraType(ImmutableList immutableList, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getColorAt_vNxB06k$lambda$0(float f, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        float fFloatValue = ((Number) tuples2.component1()).floatValue() - f;
        if (fFloatValue < 0.0f) {
            return -1;
        }
        return fFloatValue == 0.0f ? 0 : 1;
    }

    private ChartAuraType(ImmutableList<Tuples2<Float, Color>> immutableList, float f) {
        this.colors = immutableList;
        this.staticAngleInDegrees = f;
        this.argbEvaluator = new ArgbEvaluator();
    }

    public final ImmutableList<Tuples2<Float, Color>> getColors() {
        return this.colors;
    }

    public final float getStaticAngleInDegrees() {
        return this.staticAngleInDegrees;
    }

    /* renamed from: getColorAt-vNxB06k, reason: not valid java name */
    public final long m11344getColorAtvNxB06k(final float pointProgress) {
        Tuples2<Float, Color> tuples2;
        if (pointProgress <= 0.0f) {
            return this.colors.get(0).getSecond().getValue();
        }
        if (pointProgress >= 1.0f) {
            return ((Color) ((Tuples2) CollectionsKt.last((List) this.colors)).getSecond()).getValue();
        }
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.colors, 0, 0, new Function1() { // from class: com.robinhood.android.aura.ChartAuraType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ChartAuraType.getColorAt_vNxB06k$lambda$0(pointProgress, (Tuples2) obj));
            }
        }, 3, (Object) null);
        if (iBinarySearch$default < 0) {
            int i = -iBinarySearch$default;
            int i2 = i - 2;
            int i3 = i - 1;
            if (i2 >= 0) {
                tuples2 = this.colors.get(i2);
            } else {
                tuples2 = this.colors.get(0);
            }
            if (i3 >= this.colors.size()) {
                return tuples2.getSecond().getValue();
            }
            Tuples2<Float, Color> tuples22 = this.colors.get(i3);
            if (Intrinsics.areEqual(tuples2, tuples22)) {
                return tuples2.getSecond().getValue();
            }
            Object objEvaluate = this.argbEvaluator.evaluate((pointProgress - tuples2.getFirst().floatValue()) / (tuples22.getFirst().floatValue() - tuples2.getFirst().floatValue()), Integer.valueOf(Color2.m6735toArgb8_81llA(tuples2.getSecond().getValue())), Integer.valueOf(Color2.m6735toArgb8_81llA(tuples22.getSecond().getValue())));
            Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            return Color2.Color(((Integer) objEvaluate).intValue());
        }
        return this.colors.get(iBinarySearch$default).getSecond().getValue();
    }

    /* compiled from: ChartAuraType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/ChartAuraType$Positive;", "Lcom/robinhood/android/aura/ChartAuraType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Positive extends ChartAuraType {
        public static final Positive INSTANCE = new Positive();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Positive);
        }

        public int hashCode() {
            return 1428712867;
        }

        public String toString() {
            return "Positive";
        }

        private Positive() {
            super(extensions2.persistentListOf(Tuples4.m3642to(Float.valueOf(0.3f), Color.m6701boximpl(Color2.Color(4283182494L))), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(Color2.Color(4278222837L))), Tuples4.m3642to(Float.valueOf(0.8f), Color.m6701boximpl(Color2.Color(4292411245L)))), 45.0f, null);
        }
    }

    /* compiled from: ChartAuraType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/ChartAuraType$Neutral;", "Lcom/robinhood/android/aura/ChartAuraType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Neutral extends ChartAuraType {
        public static final Neutral INSTANCE = new Neutral();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Neutral);
        }

        public int hashCode() {
            return -489018147;
        }

        public String toString() {
            return "Neutral";
        }

        private Neutral() {
            super(extensions2.persistentListOf(Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4283334911L))), Tuples4.m3642to(Float.valueOf(0.2f), Color.m6701boximpl(Color2.Color(4287781358L))), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color2.Color(4294736591L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4293764607L)))), 45.0f, null);
        }
    }

    /* compiled from: ChartAuraType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/aura/ChartAuraType$Negative;", "Lcom/robinhood/android/aura/ChartAuraType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Negative extends ChartAuraType {
        public static final Negative INSTANCE = new Negative();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return 1602019295;
        }

        public String toString() {
            return "Negative";
        }

        private Negative() {
            super(extensions2.persistentListOf(Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4294954605L))), Tuples4.m3642to(Float.valueOf(0.15f), Color.m6701boximpl(Color2.Color(4294931610L))), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color2.Color(4294537291L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4283182494L)))), 320.0f, null);
        }
    }
}
