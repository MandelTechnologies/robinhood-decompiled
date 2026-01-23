package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;", "", "startPrimaryTextColor", "Landroidx/compose/ui/graphics/Color;", "startSecondaryTextColor", "inputTextColor", "placeholderTextColor", "verticalSpacing", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JJJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStartPrimaryTextColor-0d7_KjU", "()J", "J", "getStartSecondaryTextColor-0d7_KjU", "getInputTextColor-0d7_KjU", "getPlaceholderTextColor-0d7_KjU", "getVerticalSpacing-D9Ej5fM", "()F", "F", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-D9Ej5fM", "copy", "copy-hLbrIc0", "(JJJJF)Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderInputRowStyle {
    public static final int $stable = 0;
    private final long inputTextColor;
    private final long placeholderTextColor;
    private final long startPrimaryTextColor;
    private final long startSecondaryTextColor;
    private final float verticalSpacing;

    public /* synthetic */ CryptoOrderInputRowStyle(long j, long j2, long j3, long j4, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, f);
    }

    /* renamed from: copy-hLbrIc0$default, reason: not valid java name */
    public static /* synthetic */ CryptoOrderInputRowStyle m25280copyhLbrIc0$default(CryptoOrderInputRowStyle cryptoOrderInputRowStyle, long j, long j2, long j3, long j4, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cryptoOrderInputRowStyle.startPrimaryTextColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = cryptoOrderInputRowStyle.startSecondaryTextColor;
        }
        return cryptoOrderInputRowStyle.m25286copyhLbrIc0(j5, j2, (i & 4) != 0 ? cryptoOrderInputRowStyle.inputTextColor : j3, (i & 8) != 0 ? cryptoOrderInputRowStyle.placeholderTextColor : j4, (i & 16) != 0 ? cryptoOrderInputRowStyle.verticalSpacing : f);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getStartPrimaryTextColor() {
        return this.startPrimaryTextColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getStartSecondaryTextColor() {
        return this.startSecondaryTextColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getInputTextColor() {
        return this.inputTextColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalSpacing() {
        return this.verticalSpacing;
    }

    /* renamed from: copy-hLbrIc0, reason: not valid java name */
    public final CryptoOrderInputRowStyle m25286copyhLbrIc0(long startPrimaryTextColor, long startSecondaryTextColor, long inputTextColor, long placeholderTextColor, float verticalSpacing) {
        return new CryptoOrderInputRowStyle(startPrimaryTextColor, startSecondaryTextColor, inputTextColor, placeholderTextColor, verticalSpacing, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderInputRowStyle)) {
            return false;
        }
        CryptoOrderInputRowStyle cryptoOrderInputRowStyle = (CryptoOrderInputRowStyle) other;
        return Color.m6707equalsimpl0(this.startPrimaryTextColor, cryptoOrderInputRowStyle.startPrimaryTextColor) && Color.m6707equalsimpl0(this.startSecondaryTextColor, cryptoOrderInputRowStyle.startSecondaryTextColor) && Color.m6707equalsimpl0(this.inputTextColor, cryptoOrderInputRowStyle.inputTextColor) && Color.m6707equalsimpl0(this.placeholderTextColor, cryptoOrderInputRowStyle.placeholderTextColor) && C2002Dp.m7997equalsimpl0(this.verticalSpacing, cryptoOrderInputRowStyle.verticalSpacing);
    }

    public int hashCode() {
        return (((((((Color.m6713hashCodeimpl(this.startPrimaryTextColor) * 31) + Color.m6713hashCodeimpl(this.startSecondaryTextColor)) * 31) + Color.m6713hashCodeimpl(this.inputTextColor)) * 31) + Color.m6713hashCodeimpl(this.placeholderTextColor)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalSpacing);
    }

    public String toString() {
        return "CryptoOrderInputRowStyle(startPrimaryTextColor=" + Color.m6714toStringimpl(this.startPrimaryTextColor) + ", startSecondaryTextColor=" + Color.m6714toStringimpl(this.startSecondaryTextColor) + ", inputTextColor=" + Color.m6714toStringimpl(this.inputTextColor) + ", placeholderTextColor=" + Color.m6714toStringimpl(this.placeholderTextColor) + ", verticalSpacing=" + C2002Dp.m7999toStringimpl(this.verticalSpacing) + ")";
    }

    private CryptoOrderInputRowStyle(long j, long j2, long j3, long j4, float f) {
        this.startPrimaryTextColor = j;
        this.startSecondaryTextColor = j2;
        this.inputTextColor = j3;
        this.placeholderTextColor = j4;
        this.verticalSpacing = f;
    }

    /* renamed from: getStartPrimaryTextColor-0d7_KjU, reason: not valid java name */
    public final long m25289getStartPrimaryTextColor0d7_KjU() {
        return this.startPrimaryTextColor;
    }

    /* renamed from: getStartSecondaryTextColor-0d7_KjU, reason: not valid java name */
    public final long m25290getStartSecondaryTextColor0d7_KjU() {
        return this.startSecondaryTextColor;
    }

    /* renamed from: getInputTextColor-0d7_KjU, reason: not valid java name */
    public final long m25287getInputTextColor0d7_KjU() {
        return this.inputTextColor;
    }

    /* renamed from: getPlaceholderTextColor-0d7_KjU, reason: not valid java name */
    public final long m25288getPlaceholderTextColor0d7_KjU() {
        return this.placeholderTextColor;
    }

    /* renamed from: getVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m25291getVerticalSpacingD9Ej5fM() {
        return this.verticalSpacing;
    }
}
