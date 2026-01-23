package com.robinhood.compose.theme.style;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SegmentedControlStyle.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/SegmentedControlStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "sizing", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "getSizing", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "spacing", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Spacing;", "getSpacing", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Typography;", "Colors", "Sizing", "Spacing", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface SegmentedControlStyle {
    @JvmName
    Colors getColors(Composer composer, int i);

    @JvmName
    Sizing getSizing(Composer composer, int i);

    @JvmName
    Spacing getSpacing(Composer composer, int i);

    @JvmName
    Typography getTypography(Composer composer, int i);

    /* compiled from: SegmentedControlStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u001bJD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "", "segmentBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "segmentForegroundEnabledColor", "segmentForegroundDisabledColor", "containerBackgroundColor", "containerBorderColor", "<init>", "(JJJJLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSegmentBackgroundColor-0d7_KjU", "()J", "J", "getSegmentForegroundEnabledColor-0d7_KjU", "getSegmentForegroundDisabledColor-0d7_KjU", "getContainerBackgroundColor-0d7_KjU", "getContainerBorderColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-QN2ZGVo", "copy", "copy-qa9m3tE", "(JJJJLandroidx/compose/ui/graphics/Color;)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long containerBackgroundColor;
        private final Color containerBorderColor;
        private final long segmentBackgroundColor;
        private final long segmentForegroundDisabledColor;
        private final long segmentForegroundEnabledColor;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, color);
        }

        /* renamed from: copy-qa9m3tE$default, reason: not valid java name */
        public static /* synthetic */ Colors m21930copyqa9m3tE$default(Colors colors, long j, long j2, long j3, long j4, Color color, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.segmentBackgroundColor;
            }
            long j5 = j;
            if ((i & 2) != 0) {
                j2 = colors.segmentForegroundEnabledColor;
            }
            return colors.m21936copyqa9m3tE(j5, j2, (i & 4) != 0 ? colors.segmentForegroundDisabledColor : j3, (i & 8) != 0 ? colors.containerBackgroundColor : j4, (i & 16) != 0 ? colors.containerBorderColor : color);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getSegmentBackgroundColor() {
            return this.segmentBackgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSegmentForegroundEnabledColor() {
            return this.segmentForegroundEnabledColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getSegmentForegroundDisabledColor() {
            return this.segmentForegroundDisabledColor;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getContainerBackgroundColor() {
            return this.containerBackgroundColor;
        }

        /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getContainerBorderColor() {
            return this.containerBorderColor;
        }

        /* renamed from: copy-qa9m3tE, reason: not valid java name */
        public final Colors m21936copyqa9m3tE(long segmentBackgroundColor, long segmentForegroundEnabledColor, long segmentForegroundDisabledColor, long containerBackgroundColor, Color containerBorderColor) {
            return new Colors(segmentBackgroundColor, segmentForegroundEnabledColor, segmentForegroundDisabledColor, containerBackgroundColor, containerBorderColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.segmentBackgroundColor, colors.segmentBackgroundColor) && Color.m6707equalsimpl0(this.segmentForegroundEnabledColor, colors.segmentForegroundEnabledColor) && Color.m6707equalsimpl0(this.segmentForegroundDisabledColor, colors.segmentForegroundDisabledColor) && Color.m6707equalsimpl0(this.containerBackgroundColor, colors.containerBackgroundColor) && Intrinsics.areEqual(this.containerBorderColor, colors.containerBorderColor);
        }

        public int hashCode() {
            int iM6713hashCodeimpl = ((((((Color.m6713hashCodeimpl(this.segmentBackgroundColor) * 31) + Color.m6713hashCodeimpl(this.segmentForegroundEnabledColor)) * 31) + Color.m6713hashCodeimpl(this.segmentForegroundDisabledColor)) * 31) + Color.m6713hashCodeimpl(this.containerBackgroundColor)) * 31;
            Color color = this.containerBorderColor;
            return iM6713hashCodeimpl + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()));
        }

        public String toString() {
            return "Colors(segmentBackgroundColor=" + Color.m6714toStringimpl(this.segmentBackgroundColor) + ", segmentForegroundEnabledColor=" + Color.m6714toStringimpl(this.segmentForegroundEnabledColor) + ", segmentForegroundDisabledColor=" + Color.m6714toStringimpl(this.segmentForegroundDisabledColor) + ", containerBackgroundColor=" + Color.m6714toStringimpl(this.containerBackgroundColor) + ", containerBorderColor=" + this.containerBorderColor + ")";
        }

        private Colors(long j, long j2, long j3, long j4, Color color) {
            this.segmentBackgroundColor = j;
            this.segmentForegroundEnabledColor = j2;
            this.segmentForegroundDisabledColor = j3;
            this.containerBackgroundColor = j4;
            this.containerBorderColor = color;
        }

        /* renamed from: getSegmentBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21939getSegmentBackgroundColor0d7_KjU() {
            return this.segmentBackgroundColor;
        }

        /* renamed from: getSegmentForegroundEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m21941getSegmentForegroundEnabledColor0d7_KjU() {
            return this.segmentForegroundEnabledColor;
        }

        /* renamed from: getSegmentForegroundDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21940getSegmentForegroundDisabledColor0d7_KjU() {
            return this.segmentForegroundDisabledColor;
        }

        /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21937getContainerBackgroundColor0d7_KjU() {
            return this.containerBackgroundColor;
        }

        /* renamed from: getContainerBorderColor-QN2ZGVo, reason: not valid java name */
        public final Color m21938getContainerBorderColorQN2ZGVo() {
            return this.containerBorderColor;
        }
    }

    /* compiled from: SegmentedControlStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "", "segmentMinHeight", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSegmentMinHeight-D9Ej5fM", "()F", "F", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "component1-D9Ej5fM", "component2", "copy", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Shape;)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Sizing {
        public static final int $stable = 0;
        private final float segmentMinHeight;
        private final Shape shape;

        public /* synthetic */ Sizing(float f, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, shape);
        }

        /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
        public static /* synthetic */ Sizing m21942copyD5KLDUw$default(Sizing sizing, float f, Shape shape, int i, Object obj) {
            if ((i & 1) != 0) {
                f = sizing.segmentMinHeight;
            }
            if ((i & 2) != 0) {
                shape = sizing.shape;
            }
            return sizing.m21944copyD5KLDUw(f, shape);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSegmentMinHeight() {
            return this.segmentMinHeight;
        }

        /* renamed from: component2, reason: from getter */
        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: copy-D5KLDUw, reason: not valid java name */
        public final Sizing m21944copyD5KLDUw(float segmentMinHeight, Shape shape) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            return new Sizing(segmentMinHeight, shape, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sizing)) {
                return false;
            }
            Sizing sizing = (Sizing) other;
            return C2002Dp.m7997equalsimpl0(this.segmentMinHeight, sizing.segmentMinHeight) && Intrinsics.areEqual(this.shape, sizing.shape);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.segmentMinHeight) * 31) + this.shape.hashCode();
        }

        public String toString() {
            return "Sizing(segmentMinHeight=" + C2002Dp.m7999toStringimpl(this.segmentMinHeight) + ", shape=" + this.shape + ")";
        }

        private Sizing(float f, Shape shape) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            this.segmentMinHeight = f;
            this.shape = shape;
        }

        /* renamed from: getSegmentMinHeight-D9Ej5fM, reason: not valid java name */
        public final float m21945getSegmentMinHeightD9Ej5fM() {
            return this.segmentMinHeight;
        }

        public final Shape getShape() {
            return this.shape;
        }
    }

    /* compiled from: SegmentedControlStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Spacing;", "", "segmentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "containerPadding", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;)V", "getSegmentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getContainerPadding", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final PaddingValues containerPadding;
        private final PaddingValues segmentPadding;

        public static /* synthetic */ Spacing copy$default(Spacing spacing, PaddingValues paddingValues, PaddingValues paddingValues2, int i, Object obj) {
            if ((i & 1) != 0) {
                paddingValues = spacing.segmentPadding;
            }
            if ((i & 2) != 0) {
                paddingValues2 = spacing.containerPadding;
            }
            return spacing.copy(paddingValues, paddingValues2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaddingValues getSegmentPadding() {
            return this.segmentPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingValues getContainerPadding() {
            return this.containerPadding;
        }

        public final Spacing copy(PaddingValues segmentPadding, PaddingValues containerPadding) {
            Intrinsics.checkNotNullParameter(segmentPadding, "segmentPadding");
            Intrinsics.checkNotNullParameter(containerPadding, "containerPadding");
            return new Spacing(segmentPadding, containerPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return Intrinsics.areEqual(this.segmentPadding, spacing.segmentPadding) && Intrinsics.areEqual(this.containerPadding, spacing.containerPadding);
        }

        public int hashCode() {
            return (this.segmentPadding.hashCode() * 31) + this.containerPadding.hashCode();
        }

        public String toString() {
            return "Spacing(segmentPadding=" + this.segmentPadding + ", containerPadding=" + this.containerPadding + ")";
        }

        public Spacing(PaddingValues segmentPadding, PaddingValues containerPadding) {
            Intrinsics.checkNotNullParameter(segmentPadding, "segmentPadding");
            Intrinsics.checkNotNullParameter(containerPadding, "containerPadding");
            this.segmentPadding = segmentPadding;
            this.containerPadding = containerPadding;
        }

        public final PaddingValues getSegmentPadding() {
            return this.segmentPadding;
        }

        public final PaddingValues getContainerPadding() {
            return this.containerPadding;
        }
    }

    /* compiled from: SegmentedControlStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Typography;", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "fontWeight", "", "selectedFontWeight", "<init>", "(Landroidx/compose/ui/text/TextStyle;II)V", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getFontWeight", "()I", "getSelectedFontWeight", "Landroidx/compose/runtime/State;", "selected", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final int fontWeight;
        private final int selectedFontWeight;
        private final androidx.compose.p011ui.text.TextStyle textStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                textStyle = typography.textStyle;
            }
            if ((i3 & 2) != 0) {
                i = typography.fontWeight;
            }
            if ((i3 & 4) != 0) {
                i2 = typography.selectedFontWeight;
            }
            return typography.copy(textStyle, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFontWeight() {
            return this.fontWeight;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSelectedFontWeight() {
            return this.selectedFontWeight;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle textStyle, int fontWeight, int selectedFontWeight) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            return new Typography(textStyle, fontWeight, selectedFontWeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.textStyle, typography.textStyle) && this.fontWeight == typography.fontWeight && this.selectedFontWeight == typography.selectedFontWeight;
        }

        public int hashCode() {
            return (((this.textStyle.hashCode() * 31) + Integer.hashCode(this.fontWeight)) * 31) + Integer.hashCode(this.selectedFontWeight);
        }

        public String toString() {
            return "Typography(textStyle=" + this.textStyle + ", fontWeight=" + this.fontWeight + ", selectedFontWeight=" + this.selectedFontWeight + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle textStyle, int i, int i2) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.textStyle = textStyle;
            this.fontWeight = i;
            this.selectedFontWeight = i2;
        }

        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final int getFontWeight() {
            return this.fontWeight;
        }

        public final int getSelectedFontWeight() {
            return this.selectedFontWeight;
        }

        public final SnapshotState4<Integer> getFontWeight(boolean z, Composer composer, int i) {
            composer.startReplaceGroup(1105704284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1105704284, i, -1, "com.robinhood.compose.theme.style.SegmentedControlStyle.Typography.getFontWeight (SegmentedControlStyle.kt:55)");
            }
            SnapshotState4<Integer> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Integer.valueOf(z ? this.selectedFontWeight : this.fontWeight), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }
}
