package com.robinhood.shared.tradeladder.p398ui.ladder.shared.style;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010\u001aJ'\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b(\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b*\u0010\u001aJ'\u0010+\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018H\u0007¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b.\u0010\u0015J\u0010\u0010/\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b0\u0010\u0015J\u0010\u00101\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b2\u0010\u0015J\u0010\u00103\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b4\u0010\u0015J\u0010\u00105\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b6\u0010\u0015J\u0010\u00107\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b8\u0010\u0015J\u0010\u00109\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b:\u0010\u0015J\u0010\u0010;\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b<\u0010\u0015J\u0010\u0010=\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b>\u0010\u0015J\u0010\u0010?\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b@\u0010\u0015J\u0010\u0010A\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bB\u0010\u0015J\u0010\u0010C\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bD\u0010\u0015J\u0010\u0010E\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bF\u0010\u0015J\u0010\u0010G\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bH\u0010\u0015J\u009c\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0013\u0010L\u001a\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020QHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006R"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LadderMarketOrderFormStyle;", "", "startTextEnabledColor", "Landroidx/compose/ui/graphics/Color;", "startTextDisabledColor", "endTextEnabledColor", "endTextDisabledColor", "textBackgroundColor", "buttonNonLoadingBorderColor", "startSubmitEnabledColor", "startSubmitDisabledColor", "endSubmitEnabledColor", "endSubmitDisabledColor", "startSubmitEnabledBackgroundColor", "startSubmitDisabledBackgroundColor", "endSubmitEnabledBackgroundColor", "endSubmitDisabledBackgroundColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getButtonNonLoadingBorderColor-0d7_KjU", "()J", "startTextColor", "isEnabled", "", "startTextColor-vNxB06k", "(Z)J", "endTextColor", "endTextColor-vNxB06k", "startSubmitTextColor", "startSubmitTextColor-vNxB06k", "endSubmitTextColor", "endSubmitTextColor-vNxB06k", "textColor", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "isSubmitButton", "textColor-XeAY9LY", "(ZLcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Z)J", "startSubmitBackgroundColor", "startSubmitBackgroundColor-vNxB06k", "endSubmitBackgroundColor", "endSubmitBackgroundColor-vNxB06k", "backgroundColor", "backgroundColor-XeAY9LY", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "component9", "component9-0d7_KjU", "component10", "component10-0d7_KjU", "component11", "component11-0d7_KjU", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "copy", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LadderMarketOrderFormStyle;", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderMarketOrderFormStyle {
    public static final int $stable = 0;
    private final long buttonNonLoadingBorderColor;
    private final long endSubmitDisabledBackgroundColor;
    private final long endSubmitDisabledColor;
    private final long endSubmitEnabledBackgroundColor;
    private final long endSubmitEnabledColor;
    private final long endTextDisabledColor;
    private final long endTextEnabledColor;
    private final long startSubmitDisabledBackgroundColor;
    private final long startSubmitDisabledColor;
    private final long startSubmitEnabledBackgroundColor;
    private final long startSubmitEnabledColor;
    private final long startTextDisabledColor;
    private final long startTextEnabledColor;
    private final long textBackgroundColor;

    /* compiled from: LadderStyle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LadderMarketOrderFormStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartTextEnabledColor() {
        return this.startTextEnabledColor;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndSubmitDisabledColor() {
        return this.endSubmitDisabledColor;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartSubmitEnabledBackgroundColor() {
        return this.startSubmitEnabledBackgroundColor;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartSubmitDisabledBackgroundColor() {
        return this.startSubmitDisabledBackgroundColor;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndSubmitEnabledBackgroundColor() {
        return this.endSubmitEnabledBackgroundColor;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndSubmitDisabledBackgroundColor() {
        return this.endSubmitDisabledBackgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartTextDisabledColor() {
        return this.startTextDisabledColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndTextEnabledColor() {
        return this.endTextEnabledColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndTextDisabledColor() {
        return this.endTextDisabledColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    private final long getTextBackgroundColor() {
        return this.textBackgroundColor;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartSubmitEnabledColor() {
        return this.startSubmitEnabledColor;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    private final long getStartSubmitDisabledColor() {
        return this.startSubmitDisabledColor;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    private final long getEndSubmitEnabledColor() {
        return this.endSubmitEnabledColor;
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ LadderMarketOrderFormStyle m26227copydVHXu7A$default(LadderMarketOrderFormStyle ladderMarketOrderFormStyle, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i, Object obj) {
        long j15;
        long j16;
        long j17 = (i & 1) != 0 ? ladderMarketOrderFormStyle.startTextEnabledColor : j;
        long j18 = (i & 2) != 0 ? ladderMarketOrderFormStyle.startTextDisabledColor : j2;
        long j19 = (i & 4) != 0 ? ladderMarketOrderFormStyle.endTextEnabledColor : j3;
        long j20 = (i & 8) != 0 ? ladderMarketOrderFormStyle.endTextDisabledColor : j4;
        long j21 = (i & 16) != 0 ? ladderMarketOrderFormStyle.textBackgroundColor : j5;
        long j22 = (i & 32) != 0 ? ladderMarketOrderFormStyle.buttonNonLoadingBorderColor : j6;
        long j23 = (i & 64) != 0 ? ladderMarketOrderFormStyle.startSubmitEnabledColor : j7;
        long j24 = j17;
        long j25 = (i & 128) != 0 ? ladderMarketOrderFormStyle.startSubmitDisabledColor : j8;
        long j26 = (i & 256) != 0 ? ladderMarketOrderFormStyle.endSubmitEnabledColor : j9;
        long j27 = (i & 512) != 0 ? ladderMarketOrderFormStyle.endSubmitDisabledColor : j10;
        long j28 = (i & 1024) != 0 ? ladderMarketOrderFormStyle.startSubmitEnabledBackgroundColor : j11;
        long j29 = (i & 2048) != 0 ? ladderMarketOrderFormStyle.startSubmitDisabledBackgroundColor : j12;
        long j30 = (i & 4096) != 0 ? ladderMarketOrderFormStyle.endSubmitEnabledBackgroundColor : j13;
        if ((i & 8192) != 0) {
            j16 = j30;
            j15 = ladderMarketOrderFormStyle.endSubmitDisabledBackgroundColor;
        } else {
            j15 = j14;
            j16 = j30;
        }
        return ladderMarketOrderFormStyle.m26230copydVHXu7A(j24, j18, j19, j20, j21, j22, j23, j25, j26, j27, j28, j29, j16, j15);
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getButtonNonLoadingBorderColor() {
        return this.buttonNonLoadingBorderColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final LadderMarketOrderFormStyle m26230copydVHXu7A(long startTextEnabledColor, long startTextDisabledColor, long endTextEnabledColor, long endTextDisabledColor, long textBackgroundColor, long buttonNonLoadingBorderColor, long startSubmitEnabledColor, long startSubmitDisabledColor, long endSubmitEnabledColor, long endSubmitDisabledColor, long startSubmitEnabledBackgroundColor, long startSubmitDisabledBackgroundColor, long endSubmitEnabledBackgroundColor, long endSubmitDisabledBackgroundColor) {
        return new LadderMarketOrderFormStyle(startTextEnabledColor, startTextDisabledColor, endTextEnabledColor, endTextDisabledColor, textBackgroundColor, buttonNonLoadingBorderColor, startSubmitEnabledColor, startSubmitDisabledColor, endSubmitEnabledColor, endSubmitDisabledColor, startSubmitEnabledBackgroundColor, startSubmitDisabledBackgroundColor, endSubmitEnabledBackgroundColor, endSubmitDisabledBackgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderMarketOrderFormStyle)) {
            return false;
        }
        LadderMarketOrderFormStyle ladderMarketOrderFormStyle = (LadderMarketOrderFormStyle) other;
        return Color.m6707equalsimpl0(this.startTextEnabledColor, ladderMarketOrderFormStyle.startTextEnabledColor) && Color.m6707equalsimpl0(this.startTextDisabledColor, ladderMarketOrderFormStyle.startTextDisabledColor) && Color.m6707equalsimpl0(this.endTextEnabledColor, ladderMarketOrderFormStyle.endTextEnabledColor) && Color.m6707equalsimpl0(this.endTextDisabledColor, ladderMarketOrderFormStyle.endTextDisabledColor) && Color.m6707equalsimpl0(this.textBackgroundColor, ladderMarketOrderFormStyle.textBackgroundColor) && Color.m6707equalsimpl0(this.buttonNonLoadingBorderColor, ladderMarketOrderFormStyle.buttonNonLoadingBorderColor) && Color.m6707equalsimpl0(this.startSubmitEnabledColor, ladderMarketOrderFormStyle.startSubmitEnabledColor) && Color.m6707equalsimpl0(this.startSubmitDisabledColor, ladderMarketOrderFormStyle.startSubmitDisabledColor) && Color.m6707equalsimpl0(this.endSubmitEnabledColor, ladderMarketOrderFormStyle.endSubmitEnabledColor) && Color.m6707equalsimpl0(this.endSubmitDisabledColor, ladderMarketOrderFormStyle.endSubmitDisabledColor) && Color.m6707equalsimpl0(this.startSubmitEnabledBackgroundColor, ladderMarketOrderFormStyle.startSubmitEnabledBackgroundColor) && Color.m6707equalsimpl0(this.startSubmitDisabledBackgroundColor, ladderMarketOrderFormStyle.startSubmitDisabledBackgroundColor) && Color.m6707equalsimpl0(this.endSubmitEnabledBackgroundColor, ladderMarketOrderFormStyle.endSubmitEnabledBackgroundColor) && Color.m6707equalsimpl0(this.endSubmitDisabledBackgroundColor, ladderMarketOrderFormStyle.endSubmitDisabledBackgroundColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Color.m6713hashCodeimpl(this.startTextEnabledColor) * 31) + Color.m6713hashCodeimpl(this.startTextDisabledColor)) * 31) + Color.m6713hashCodeimpl(this.endTextEnabledColor)) * 31) + Color.m6713hashCodeimpl(this.endTextDisabledColor)) * 31) + Color.m6713hashCodeimpl(this.textBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.buttonNonLoadingBorderColor)) * 31) + Color.m6713hashCodeimpl(this.startSubmitEnabledColor)) * 31) + Color.m6713hashCodeimpl(this.startSubmitDisabledColor)) * 31) + Color.m6713hashCodeimpl(this.endSubmitEnabledColor)) * 31) + Color.m6713hashCodeimpl(this.endSubmitDisabledColor)) * 31) + Color.m6713hashCodeimpl(this.startSubmitEnabledBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.startSubmitDisabledBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.endSubmitEnabledBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.endSubmitDisabledBackgroundColor);
    }

    public String toString() {
        return "LadderMarketOrderFormStyle(startTextEnabledColor=" + Color.m6714toStringimpl(this.startTextEnabledColor) + ", startTextDisabledColor=" + Color.m6714toStringimpl(this.startTextDisabledColor) + ", endTextEnabledColor=" + Color.m6714toStringimpl(this.endTextEnabledColor) + ", endTextDisabledColor=" + Color.m6714toStringimpl(this.endTextDisabledColor) + ", textBackgroundColor=" + Color.m6714toStringimpl(this.textBackgroundColor) + ", buttonNonLoadingBorderColor=" + Color.m6714toStringimpl(this.buttonNonLoadingBorderColor) + ", startSubmitEnabledColor=" + Color.m6714toStringimpl(this.startSubmitEnabledColor) + ", startSubmitDisabledColor=" + Color.m6714toStringimpl(this.startSubmitDisabledColor) + ", endSubmitEnabledColor=" + Color.m6714toStringimpl(this.endSubmitEnabledColor) + ", endSubmitDisabledColor=" + Color.m6714toStringimpl(this.endSubmitDisabledColor) + ", startSubmitEnabledBackgroundColor=" + Color.m6714toStringimpl(this.startSubmitEnabledBackgroundColor) + ", startSubmitDisabledBackgroundColor=" + Color.m6714toStringimpl(this.startSubmitDisabledBackgroundColor) + ", endSubmitEnabledBackgroundColor=" + Color.m6714toStringimpl(this.endSubmitEnabledBackgroundColor) + ", endSubmitDisabledBackgroundColor=" + Color.m6714toStringimpl(this.endSubmitDisabledBackgroundColor) + ")";
    }

    private LadderMarketOrderFormStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.startTextEnabledColor = j;
        this.startTextDisabledColor = j2;
        this.endTextEnabledColor = j3;
        this.endTextDisabledColor = j4;
        this.textBackgroundColor = j5;
        this.buttonNonLoadingBorderColor = j6;
        this.startSubmitEnabledColor = j7;
        this.startSubmitDisabledColor = j8;
        this.endSubmitEnabledColor = j9;
        this.endSubmitDisabledColor = j10;
        this.startSubmitEnabledBackgroundColor = j11;
        this.startSubmitDisabledBackgroundColor = j12;
        this.endSubmitEnabledBackgroundColor = j13;
        this.endSubmitDisabledBackgroundColor = j14;
    }

    /* renamed from: getButtonNonLoadingBorderColor-0d7_KjU, reason: not valid java name */
    public final long m26234getButtonNonLoadingBorderColor0d7_KjU() {
        return this.buttonNonLoadingBorderColor;
    }

    /* renamed from: startTextColor-vNxB06k, reason: not valid java name */
    public final long m26237startTextColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.startTextEnabledColor : this.startTextDisabledColor;
    }

    /* renamed from: endTextColor-vNxB06k, reason: not valid java name */
    public final long m26233endTextColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.endTextEnabledColor : this.endTextDisabledColor;
    }

    /* renamed from: startSubmitTextColor-vNxB06k, reason: not valid java name */
    public final long m26236startSubmitTextColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.startSubmitEnabledColor : this.startSubmitDisabledColor;
    }

    /* renamed from: endSubmitTextColor-vNxB06k, reason: not valid java name */
    public final long m26232endSubmitTextColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.endSubmitEnabledColor : this.endSubmitDisabledColor;
    }

    /* renamed from: textColor-XeAY9LY, reason: not valid java name */
    public final long m26238textColorXeAY9LY(boolean isEnabled, Side side, boolean isSubmitButton) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            if (isSubmitButton) {
                return m26236startSubmitTextColorvNxB06k(isEnabled);
            }
            return m26237startTextColorvNxB06k(isEnabled);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (isSubmitButton) {
            return m26232endSubmitTextColorvNxB06k(isEnabled);
        }
        return m26233endTextColorvNxB06k(isEnabled);
    }

    /* renamed from: startSubmitBackgroundColor-vNxB06k, reason: not valid java name */
    public final long m26235startSubmitBackgroundColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.startSubmitEnabledBackgroundColor : this.startSubmitDisabledBackgroundColor;
    }

    /* renamed from: endSubmitBackgroundColor-vNxB06k, reason: not valid java name */
    public final long m26231endSubmitBackgroundColorvNxB06k(boolean isEnabled) {
        return isEnabled ? this.endSubmitEnabledBackgroundColor : this.endSubmitDisabledBackgroundColor;
    }

    /* renamed from: backgroundColor-XeAY9LY, reason: not valid java name */
    public final long m26228backgroundColorXeAY9LY(boolean isEnabled, Side side, boolean isSubmitButton) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            if (isSubmitButton) {
                return m26235startSubmitBackgroundColorvNxB06k(isEnabled);
            }
            return this.textBackgroundColor;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (isSubmitButton) {
            return m26231endSubmitBackgroundColorvNxB06k(isEnabled);
        }
        return this.textBackgroundColor;
    }
}
