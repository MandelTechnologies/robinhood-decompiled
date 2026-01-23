package com.robinhood.shared.tradeladder.p398ui.ladder.shared.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001EBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u0002H\u0012H\u0003¢\u0006\u0002\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010\u001fJ\u001f\u0010&\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b-\u0010\u000fJ\u0010\u0010.\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b/\u0010\u000fJ\u0010\u00100\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b1\u0010\u000fJ\u0010\u00102\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b3\u0010\u000fJ\u0010\u00104\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b5\u0010\u000fJ\u0010\u00106\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b7\u0010\u000fJ\u0010\u00108\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b9\u0010\u000fJ\u0010\u0010:\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u0010\u000fJ`\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle;", "", "startTextColor", "Landroidx/compose/ui/graphics/Color;", "endTextColor", "startBackgroundColor", "endBackgroundColor", "startBottomBackgroundColor", "endBottomBackgroundColor", "topLoadingBackgroundColor", "bottomLoadingBackgroundColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getTopLoadingBackgroundColor-0d7_KjU", "()J", "getBottomLoadingBackgroundColor-0d7_KjU", "pick", "T", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "start", "end", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "isOutlined", "", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;)Z", "topBackgroundColor", "side", "visualState", "topBackgroundColor-WaAFU9c", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;)J", "bottomBackgroundColor", "bottomBackgroundColor-WaAFU9c", "contentColor", "contentColor-WaAFU9c", "textColor", "textColor-WaAFU9c", "iconTint", "iconTint-WaAFU9c", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderWidth-u2uoSUM", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;)F", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "copy", "copy-FD3wquc", "(JJJJJJJJ)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle;", "equals", "other", "hashCode", "", "toString", "", "PillVisualState", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class PillStyle {
    public static final int $stable = 0;
    private final long bottomLoadingBackgroundColor;
    private final long endBackgroundColor;
    private final long endBottomBackgroundColor;
    private final long endTextColor;
    private final long startBackgroundColor;
    private final long startBottomBackgroundColor;
    private final long startTextColor;
    private final long topLoadingBackgroundColor;

    public /* synthetic */ PillStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartTextColor() {
        return this.startTextColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndTextColor() {
        return this.endTextColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartBackgroundColor() {
        return this.startBackgroundColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndBackgroundColor() {
        return this.endBackgroundColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartBottomBackgroundColor() {
        return this.startBottomBackgroundColor;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndBottomBackgroundColor() {
        return this.endBottomBackgroundColor;
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ PillStyle m26259copyFD3wquc$default(PillStyle pillStyle, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11 = (i & 1) != 0 ? pillStyle.startTextColor : j;
        long j12 = (i & 2) != 0 ? pillStyle.endTextColor : j2;
        long j13 = (i & 4) != 0 ? pillStyle.startBackgroundColor : j3;
        long j14 = (i & 8) != 0 ? pillStyle.endBackgroundColor : j4;
        long j15 = (i & 16) != 0 ? pillStyle.startBottomBackgroundColor : j5;
        long j16 = (i & 32) != 0 ? pillStyle.endBottomBackgroundColor : j6;
        long j17 = (i & 64) != 0 ? pillStyle.topLoadingBackgroundColor : j7;
        if ((i & 128) != 0) {
            j9 = pillStyle.bottomLoadingBackgroundColor;
            j10 = j11;
        } else {
            j9 = j8;
            j10 = j11;
        }
        return pillStyle.m26265copyFD3wquc(j10, j12, j13, j14, j15, j16, j17, j9);
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getTopLoadingBackgroundColor() {
        return this.topLoadingBackgroundColor;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getBottomLoadingBackgroundColor() {
        return this.bottomLoadingBackgroundColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final PillStyle m26265copyFD3wquc(long startTextColor, long endTextColor, long startBackgroundColor, long endBackgroundColor, long startBottomBackgroundColor, long endBottomBackgroundColor, long topLoadingBackgroundColor, long bottomLoadingBackgroundColor) {
        return new PillStyle(startTextColor, endTextColor, startBackgroundColor, endBackgroundColor, startBottomBackgroundColor, endBottomBackgroundColor, topLoadingBackgroundColor, bottomLoadingBackgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PillStyle)) {
            return false;
        }
        PillStyle pillStyle = (PillStyle) other;
        return Color.m6707equalsimpl0(this.startTextColor, pillStyle.startTextColor) && Color.m6707equalsimpl0(this.endTextColor, pillStyle.endTextColor) && Color.m6707equalsimpl0(this.startBackgroundColor, pillStyle.startBackgroundColor) && Color.m6707equalsimpl0(this.endBackgroundColor, pillStyle.endBackgroundColor) && Color.m6707equalsimpl0(this.startBottomBackgroundColor, pillStyle.startBottomBackgroundColor) && Color.m6707equalsimpl0(this.endBottomBackgroundColor, pillStyle.endBottomBackgroundColor) && Color.m6707equalsimpl0(this.topLoadingBackgroundColor, pillStyle.topLoadingBackgroundColor) && Color.m6707equalsimpl0(this.bottomLoadingBackgroundColor, pillStyle.bottomLoadingBackgroundColor);
    }

    public int hashCode() {
        return (((((((((((((Color.m6713hashCodeimpl(this.startTextColor) * 31) + Color.m6713hashCodeimpl(this.endTextColor)) * 31) + Color.m6713hashCodeimpl(this.startBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.endBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.startBottomBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.endBottomBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.topLoadingBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.bottomLoadingBackgroundColor);
    }

    public String toString() {
        return "PillStyle(startTextColor=" + Color.m6714toStringimpl(this.startTextColor) + ", endTextColor=" + Color.m6714toStringimpl(this.endTextColor) + ", startBackgroundColor=" + Color.m6714toStringimpl(this.startBackgroundColor) + ", endBackgroundColor=" + Color.m6714toStringimpl(this.endBackgroundColor) + ", startBottomBackgroundColor=" + Color.m6714toStringimpl(this.startBottomBackgroundColor) + ", endBottomBackgroundColor=" + Color.m6714toStringimpl(this.endBottomBackgroundColor) + ", topLoadingBackgroundColor=" + Color.m6714toStringimpl(this.topLoadingBackgroundColor) + ", bottomLoadingBackgroundColor=" + Color.m6714toStringimpl(this.bottomLoadingBackgroundColor) + ")";
    }

    private PillStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.startTextColor = j;
        this.endTextColor = j2;
        this.startBackgroundColor = j3;
        this.endBackgroundColor = j4;
        this.startBottomBackgroundColor = j5;
        this.endBottomBackgroundColor = j6;
        this.topLoadingBackgroundColor = j7;
        this.bottomLoadingBackgroundColor = j8;
    }

    /* renamed from: getTopLoadingBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m26267getTopLoadingBackgroundColor0d7_KjU() {
        return this.topLoadingBackgroundColor;
    }

    /* renamed from: getBottomLoadingBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m26266getBottomLoadingBackgroundColor0d7_KjU() {
        return this.bottomLoadingBackgroundColor;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LadderStyle.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "OUTLINED", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PillVisualState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PillVisualState[] $VALUES;
        public static final PillVisualState ACTIVE = new PillVisualState("ACTIVE", 0);
        public static final PillVisualState OUTLINED = new PillVisualState("OUTLINED", 1);

        private static final /* synthetic */ PillVisualState[] $values() {
            return new PillVisualState[]{ACTIVE, OUTLINED};
        }

        public static EnumEntries<PillVisualState> getEntries() {
            return $ENTRIES;
        }

        private PillVisualState(String str, int i) {
        }

        static {
            PillVisualState[] pillVisualStateArr$values = $values();
            $VALUES = pillVisualStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pillVisualStateArr$values);
        }

        public static PillVisualState valueOf(String str) {
            return (PillVisualState) Enum.valueOf(PillVisualState.class, str);
        }

        public static PillVisualState[] values() {
            return (PillVisualState[]) $VALUES.clone();
        }
    }

    private final <T> T pick(Side side, T t, T t2) {
        return side == Side.START ? t : t2;
    }

    public final boolean isOutlined(PillVisualState pillVisualState) {
        Intrinsics.checkNotNullParameter(pillVisualState, "<this>");
        return pillVisualState == PillVisualState.OUTLINED;
    }

    /* renamed from: topBackgroundColor-WaAFU9c, reason: not valid java name */
    public final long m26270topBackgroundColorWaAFU9c(Side side, PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        if (isOutlined(visualState)) {
            return ((Color) pick(side, Color.m6701boximpl(this.startTextColor), Color.m6701boximpl(this.endTextColor))).getValue();
        }
        return ((Color) pick(side, Color.m6701boximpl(this.startBackgroundColor), Color.m6701boximpl(this.endBackgroundColor))).getValue();
    }

    /* renamed from: bottomBackgroundColor-WaAFU9c, reason: not valid java name */
    public final long m26261bottomBackgroundColorWaAFU9c(Side side, PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        if (isOutlined(visualState)) {
            return ((Color) pick(side, Color.m6701boximpl(this.startTextColor), Color.m6701boximpl(this.endTextColor))).getValue();
        }
        return ((Color) pick(side, Color.m6701boximpl(this.startBottomBackgroundColor), Color.m6701boximpl(this.endBottomBackgroundColor))).getValue();
    }

    /* renamed from: contentColor-WaAFU9c, reason: not valid java name */
    public final long m26264contentColorWaAFU9c(Side side, PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        if (isOutlined(visualState)) {
            return ((Color) pick(side, Color.m6701boximpl(this.startBackgroundColor), Color.m6701boximpl(this.endBackgroundColor))).getValue();
        }
        return ((Color) pick(side, Color.m6701boximpl(this.startTextColor), Color.m6701boximpl(this.endTextColor))).getValue();
    }

    /* renamed from: textColor-WaAFU9c, reason: not valid java name */
    public final long m26269textColorWaAFU9c(Side side, PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        return m26264contentColorWaAFU9c(side, visualState);
    }

    /* renamed from: iconTint-WaAFU9c, reason: not valid java name */
    public final long m26268iconTintWaAFU9c(Side side, PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        return m26264contentColorWaAFU9c(side, visualState);
    }

    /* renamed from: borderWidth-u2uoSUM, reason: not valid java name */
    public final float m26260borderWidthu2uoSUM(PillVisualState visualState) {
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        return C2002Dp.m7995constructorimpl(isOutlined(visualState) ? 1 : 0);
    }
}
