package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BentoTextInput.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000eJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u000eJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u000eJ\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u000eJ\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u000eJ\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u000eJ\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010\u000eJ`\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e¨\u00065"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputColors;", "", "placeholderUnfocused", "Landroidx/compose/ui/graphics/Color;", "placeholderFocused", "error", "background", "borderUnfocused", "borderFocused", "text", "cursor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPlaceholderUnfocused-0d7_KjU", "()J", "J", "getPlaceholderFocused-0d7_KjU", "getError-0d7_KjU", "getBackground-0d7_KjU", "getBorderUnfocused-0d7_KjU", "getBorderFocused-0d7_KjU", "getText-0d7_KjU", "getCursor-0d7_KjU", "placeholder", "hasFocus", "", "placeholder-vNxB06k", "(Z)J", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "copy", "copy-FD3wquc", "(JJJJJJJJ)Lcom/robinhood/compose/bento/component/BentoTextInputColors;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoTextInputColors {
    public static final int $stable = 0;
    private final long background;
    private final long borderFocused;
    private final long borderUnfocused;
    private final long cursor;
    private final long error;
    private final long placeholderFocused;
    private final long placeholderUnfocused;
    private final long text;

    public /* synthetic */ BentoTextInputColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ BentoTextInputColors m20717copyFD3wquc$default(BentoTextInputColors bentoTextInputColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11 = (i & 1) != 0 ? bentoTextInputColors.placeholderUnfocused : j;
        long j12 = (i & 2) != 0 ? bentoTextInputColors.placeholderFocused : j2;
        long j13 = (i & 4) != 0 ? bentoTextInputColors.error : j3;
        long j14 = (i & 8) != 0 ? bentoTextInputColors.background : j4;
        long j15 = (i & 16) != 0 ? bentoTextInputColors.borderUnfocused : j5;
        long j16 = (i & 32) != 0 ? bentoTextInputColors.borderFocused : j6;
        long j17 = (i & 64) != 0 ? bentoTextInputColors.text : j7;
        if ((i & 128) != 0) {
            j9 = bentoTextInputColors.cursor;
            j10 = j11;
        } else {
            j9 = j8;
            j10 = j11;
        }
        return bentoTextInputColors.m20726copyFD3wquc(j10, j12, j13, j14, j15, j16, j17, j9);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlaceholderUnfocused() {
        return this.placeholderUnfocused;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlaceholderFocused() {
        return this.placeholderFocused;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderUnfocused() {
        return this.borderUnfocused;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderFocused() {
        return this.borderFocused;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getText() {
        return this.text;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getCursor() {
        return this.cursor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final BentoTextInputColors m20726copyFD3wquc(long placeholderUnfocused, long placeholderFocused, long error, long background, long borderUnfocused, long borderFocused, long text, long cursor) {
        return new BentoTextInputColors(placeholderUnfocused, placeholderFocused, error, background, borderUnfocused, borderFocused, text, cursor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoTextInputColors)) {
            return false;
        }
        BentoTextInputColors bentoTextInputColors = (BentoTextInputColors) other;
        return Color.m6707equalsimpl0(this.placeholderUnfocused, bentoTextInputColors.placeholderUnfocused) && Color.m6707equalsimpl0(this.placeholderFocused, bentoTextInputColors.placeholderFocused) && Color.m6707equalsimpl0(this.error, bentoTextInputColors.error) && Color.m6707equalsimpl0(this.background, bentoTextInputColors.background) && Color.m6707equalsimpl0(this.borderUnfocused, bentoTextInputColors.borderUnfocused) && Color.m6707equalsimpl0(this.borderFocused, bentoTextInputColors.borderFocused) && Color.m6707equalsimpl0(this.text, bentoTextInputColors.text) && Color.m6707equalsimpl0(this.cursor, bentoTextInputColors.cursor);
    }

    public int hashCode() {
        return (((((((((((((Color.m6713hashCodeimpl(this.placeholderUnfocused) * 31) + Color.m6713hashCodeimpl(this.placeholderFocused)) * 31) + Color.m6713hashCodeimpl(this.error)) * 31) + Color.m6713hashCodeimpl(this.background)) * 31) + Color.m6713hashCodeimpl(this.borderUnfocused)) * 31) + Color.m6713hashCodeimpl(this.borderFocused)) * 31) + Color.m6713hashCodeimpl(this.text)) * 31) + Color.m6713hashCodeimpl(this.cursor);
    }

    public String toString() {
        return "BentoTextInputColors(placeholderUnfocused=" + Color.m6714toStringimpl(this.placeholderUnfocused) + ", placeholderFocused=" + Color.m6714toStringimpl(this.placeholderFocused) + ", error=" + Color.m6714toStringimpl(this.error) + ", background=" + Color.m6714toStringimpl(this.background) + ", borderUnfocused=" + Color.m6714toStringimpl(this.borderUnfocused) + ", borderFocused=" + Color.m6714toStringimpl(this.borderFocused) + ", text=" + Color.m6714toStringimpl(this.text) + ", cursor=" + Color.m6714toStringimpl(this.cursor) + ")";
    }

    private BentoTextInputColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.placeholderUnfocused = j;
        this.placeholderFocused = j2;
        this.error = j3;
        this.background = j4;
        this.borderUnfocused = j5;
        this.borderFocused = j6;
        this.text = j7;
        this.cursor = j8;
    }

    /* renamed from: getPlaceholderUnfocused-0d7_KjU, reason: not valid java name */
    public final long m20733getPlaceholderUnfocused0d7_KjU() {
        return this.placeholderUnfocused;
    }

    /* renamed from: getPlaceholderFocused-0d7_KjU, reason: not valid java name */
    public final long m20732getPlaceholderFocused0d7_KjU() {
        return this.placeholderFocused;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m20731getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m20727getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorderUnfocused-0d7_KjU, reason: not valid java name */
    public final long m20729getBorderUnfocused0d7_KjU() {
        return this.borderUnfocused;
    }

    /* renamed from: getBorderFocused-0d7_KjU, reason: not valid java name */
    public final long m20728getBorderFocused0d7_KjU() {
        return this.borderFocused;
    }

    /* renamed from: getText-0d7_KjU, reason: not valid java name */
    public final long m20734getText0d7_KjU() {
        return this.text;
    }

    /* renamed from: getCursor-0d7_KjU, reason: not valid java name */
    public final long m20730getCursor0d7_KjU() {
        return this.cursor;
    }

    /* renamed from: placeholder-vNxB06k, reason: not valid java name */
    public final long m20735placeholdervNxB06k(boolean hasFocus) {
        return hasFocus ? this.placeholderFocused : this.placeholderUnfocused;
    }
}
