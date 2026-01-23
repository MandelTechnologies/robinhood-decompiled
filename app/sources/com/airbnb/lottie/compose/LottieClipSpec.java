package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.Marker;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LottieClipSpec.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\n\u0010\b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "Frame", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public abstract class LottieClipSpec {
    public static final int $stable = 0;

    public /* synthetic */ LottieClipSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getMaxProgress$lottie_compose_release(LottieComposition composition);

    public abstract float getMinProgress$lottie_compose_release(LottieComposition composition);

    private LottieClipSpec() {
    }

    /* compiled from: LottieClipSpec.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "", "maxInclusive", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMin", "()Ljava/lang/Integer;", "getMax", "Z", "getMaxInclusive", "()Z", "actualMaxFrame", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Frame extends LottieClipSpec {
        public static final int $stable = 0;
        private final Integer actualMaxFrame;
        private final Integer max;
        private final boolean maxInclusive;
        private final Integer min;

        public Frame() {
            this(null, null, false, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.areEqual(this.min, frame.min) && Intrinsics.areEqual(this.max, frame.max) && this.maxInclusive == frame.maxInclusive;
        }

        public int hashCode() {
            Integer num = this.min;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxInclusive);
        }

        public String toString() {
            return "Frame(min=" + this.min + ", max=" + this.max + ", maxInclusive=" + this.maxInclusive + ")";
        }

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? true : z);
        }

        public Frame(Integer num, Integer num2, boolean z) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z;
            if (num2 == null) {
                num2 = null;
            } else if (!z) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.actualMaxFrame = num2;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            if (this.min == null) {
                return 0.0f;
            }
            return RangesKt.coerceIn(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            if (this.actualMaxFrame == null) {
                return 1.0f;
            }
            return RangesKt.coerceIn(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "<init>", "(FF)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMin", "()F", "getMax", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Progress extends LottieClipSpec {
        public static final int $stable = 0;
        private final float max;
        private final float min;

        /* JADX WARN: Illegal instructions before constructor call */
        public Progress() {
            float f = 0.0f;
            this(f, f, 3, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.min, progress.min) == 0 && Float.compare(this.max, progress.max) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.min) * 31) + Float.hashCode(this.max);
        }

        public String toString() {
            return "Progress(min=" + this.min + ", max=" + this.max + ")";
        }

        public /* synthetic */ Progress(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 1.0f : f2);
        }

        public Progress(float f, float f2) {
            super(null);
            this.min = f;
            this.max = f2;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.max;
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "", "maxInclusive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMin", "getMax", "Z", "getMaxInclusive", "()Z", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Markers extends LottieClipSpec {
        public static final int $stable = 0;
        private final String max;
        private final boolean maxInclusive;
        private final String min;

        public Markers() {
            this(null, null, false, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Markers)) {
                return false;
            }
            Markers markers = (Markers) other;
            return Intrinsics.areEqual(this.min, markers.min) && Intrinsics.areEqual(this.max, markers.max) && this.maxInclusive == markers.maxInclusive;
        }

        public int hashCode() {
            String str = this.min;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.max;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxInclusive);
        }

        public String toString() {
            return "Markers(min=" + this.min + ", max=" + this.max + ", maxInclusive=" + this.maxInclusive + ")";
        }

        public /* synthetic */ Markers(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }

        public Markers(String str, String str2, boolean z) {
            super(null);
            this.min = str;
            this.max = str2;
            this.maxInclusive = z;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.min;
            if (str == null) {
                return 0.0f;
            }
            Marker marker = composition.getMarker(str);
            return RangesKt.coerceIn((marker != null ? marker.startFrame : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.max;
            if (str == null) {
                return 1.0f;
            }
            int i = this.maxInclusive ? 0 : -1;
            Marker marker = composition.getMarker(str);
            return RangesKt.coerceIn((marker != null ? marker.startFrame + i : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }
    }
}
