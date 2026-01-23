package com.robinhood.android.charts.overlay;

import androidx.compose.p011ui.unit.IntOffset;
import com.robinhood.android.charts.RectExtensions;
import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OverlayPosition.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/charts/overlay/OverlayPosition;", "", "point", "Lcom/robinhood/android/charts/model/Point;", "horizontalAlignment", "Lcom/robinhood/android/charts/overlay/OverlayPosition$HorizontalAlignment;", "verticalAlignment", "Lcom/robinhood/android/charts/overlay/OverlayPosition$VerticalAlignment;", "<init>", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/overlay/OverlayPosition$HorizontalAlignment;Lcom/robinhood/android/charts/overlay/OverlayPosition$VerticalAlignment;)V", "getPoint", "()Lcom/robinhood/android/charts/model/Point;", "getHorizontalAlignment", "()Lcom/robinhood/android/charts/overlay/OverlayPosition$HorizontalAlignment;", "getVerticalAlignment", "()Lcom/robinhood/android/charts/overlay/OverlayPosition$VerticalAlignment;", "getAlignedOffset", "Landroidx/compose/ui/unit/IntOffset;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "elementSize", "getAlignedOffset-emnUabE", "(JJ)J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HorizontalAlignment", "VerticalAlignment", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class OverlayPosition {
    public static final int $stable = 0;
    private final HorizontalAlignment horizontalAlignment;
    private final Point point;
    private final VerticalAlignment verticalAlignment;

    /* compiled from: OverlayPosition.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ OverlayPosition copy$default(OverlayPosition overlayPosition, Point point, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            point = overlayPosition.point;
        }
        if ((i & 2) != 0) {
            horizontalAlignment = overlayPosition.horizontalAlignment;
        }
        if ((i & 4) != 0) {
            verticalAlignment = overlayPosition.verticalAlignment;
        }
        return overlayPosition.copy(point, horizontalAlignment, verticalAlignment);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getPoint() {
        return this.point;
    }

    /* renamed from: component2, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: component3, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final OverlayPosition copy(Point point, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        return new OverlayPosition(point, horizontalAlignment, verticalAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayPosition)) {
            return false;
        }
        OverlayPosition overlayPosition = (OverlayPosition) other;
        return Intrinsics.areEqual(this.point, overlayPosition.point) && this.horizontalAlignment == overlayPosition.horizontalAlignment && this.verticalAlignment == overlayPosition.verticalAlignment;
    }

    public int hashCode() {
        return (((this.point.hashCode() * 31) + this.horizontalAlignment.hashCode()) * 31) + this.verticalAlignment.hashCode();
    }

    public String toString() {
        return "OverlayPosition(point=" + this.point + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ")";
    }

    public OverlayPosition(Point point, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.point = point;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OverlayPosition.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/charts/overlay/OverlayPosition$HorizontalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HorizontalAlignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HorizontalAlignment[] $VALUES;
        public static final HorizontalAlignment LEFT = new HorizontalAlignment("LEFT", 0);
        public static final HorizontalAlignment RIGHT = new HorizontalAlignment("RIGHT", 1);
        public static final HorizontalAlignment CENTER = new HorizontalAlignment("CENTER", 2);

        private static final /* synthetic */ HorizontalAlignment[] $values() {
            return new HorizontalAlignment[]{LEFT, RIGHT, CENTER};
        }

        public static EnumEntries<HorizontalAlignment> getEntries() {
            return $ENTRIES;
        }

        private HorizontalAlignment(String str, int i) {
        }

        static {
            HorizontalAlignment[] horizontalAlignmentArr$values = $values();
            $VALUES = horizontalAlignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(horizontalAlignmentArr$values);
        }

        public static HorizontalAlignment valueOf(String str) {
            return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
        }

        public static HorizontalAlignment[] values() {
            return (HorizontalAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OverlayPosition.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/charts/overlay/OverlayPosition$VerticalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "CENTER", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerticalAlignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerticalAlignment[] $VALUES;
        public static final VerticalAlignment TOP = new VerticalAlignment("TOP", 0);
        public static final VerticalAlignment BOTTOM = new VerticalAlignment("BOTTOM", 1);
        public static final VerticalAlignment CENTER = new VerticalAlignment("CENTER", 2);

        private static final /* synthetic */ VerticalAlignment[] $values() {
            return new VerticalAlignment[]{TOP, BOTTOM, CENTER};
        }

        public static EnumEntries<VerticalAlignment> getEntries() {
            return $ENTRIES;
        }

        private VerticalAlignment(String str, int i) {
        }

        static {
            VerticalAlignment[] verticalAlignmentArr$values = $values();
            $VALUES = verticalAlignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(verticalAlignmentArr$values);
        }

        public static VerticalAlignment valueOf(String str) {
            return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
        }

        public static VerticalAlignment[] values() {
            return (VerticalAlignment[]) $VALUES.clone();
        }
    }

    /* renamed from: getAlignedOffset-emnUabE, reason: not valid java name */
    public final long m12111getAlignedOffsetemnUabE(long bounds, long elementSize) {
        int iM8038getXimpl;
        int iM8039getYimpl;
        int iM8039getYimpl2;
        int i;
        int iM8038getXimpl2;
        int i2;
        long jM11983getTranslationaZF9jCo = RectExtensions.m11983getTranslationaZF9jCo(bounds, this.point.getX(), this.point.getY());
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.horizontalAlignment.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                iM8038getXimpl2 = IntOffset.m8038getXimpl(jM11983getTranslationaZF9jCo);
                i2 = (int) (elementSize >> 32);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iM8038getXimpl2 = IntOffset.m8038getXimpl(jM11983getTranslationaZF9jCo);
                i2 = ((int) (elementSize >> 32)) / 2;
            }
            iM8038getXimpl = iM8038getXimpl2 - i2;
        } else {
            iM8038getXimpl = IntOffset.m8038getXimpl(jM11983getTranslationaZF9jCo);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$1[this.verticalAlignment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                iM8039getYimpl2 = IntOffset.m8039getYimpl(jM11983getTranslationaZF9jCo);
                i = (int) (elementSize & 4294967295L);
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iM8039getYimpl2 = IntOffset.m8039getYimpl(jM11983getTranslationaZF9jCo);
                i = ((int) (elementSize & 4294967295L)) / 2;
            }
            iM8039getYimpl = iM8039getYimpl2 - i;
        } else {
            iM8039getYimpl = IntOffset.m8039getYimpl(jM11983getTranslationaZF9jCo);
        }
        return IntOffset.m8033constructorimpl((iM8038getXimpl << 32) | (iM8039getYimpl & 4294967295L));
    }
}
