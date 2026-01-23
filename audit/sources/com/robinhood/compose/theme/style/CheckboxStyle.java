package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CheckboxStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CheckboxStyle;", "", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedColor-0d7_KjU", "()J", "J", "getUncheckedColor-0d7_KjU", "getCheckmarkColor-0d7_KjU", "getDisabledCheckedColor-0d7_KjU", "getDisabledUncheckedColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/compose/theme/style/CheckboxStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CheckboxStyle {
    public static final int $stable = 0;
    private final long checkedColor;
    private final long checkmarkColor;
    private final long disabledCheckedColor;
    private final long disabledUncheckedColor;
    private final long uncheckedColor;

    public /* synthetic */ CheckboxStyle(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ CheckboxStyle m21730copyt635Npw$default(CheckboxStyle checkboxStyle, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkboxStyle.checkedColor;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j2 = checkboxStyle.uncheckedColor;
        }
        return checkboxStyle.m21736copyt635Npw(j6, j2, (i & 4) != 0 ? checkboxStyle.checkmarkColor : j3, (i & 8) != 0 ? checkboxStyle.disabledCheckedColor : j4, (i & 16) != 0 ? checkboxStyle.disabledUncheckedColor : j5);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedColor() {
        return this.checkedColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedColor() {
        return this.uncheckedColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckmarkColor() {
        return this.checkmarkColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedColor() {
        return this.disabledCheckedColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedColor() {
        return this.disabledUncheckedColor;
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final CheckboxStyle m21736copyt635Npw(long checkedColor, long uncheckedColor, long checkmarkColor, long disabledCheckedColor, long disabledUncheckedColor) {
        return new CheckboxStyle(checkedColor, uncheckedColor, checkmarkColor, disabledCheckedColor, disabledUncheckedColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxStyle)) {
            return false;
        }
        CheckboxStyle checkboxStyle = (CheckboxStyle) other;
        return Color.m6707equalsimpl0(this.checkedColor, checkboxStyle.checkedColor) && Color.m6707equalsimpl0(this.uncheckedColor, checkboxStyle.uncheckedColor) && Color.m6707equalsimpl0(this.checkmarkColor, checkboxStyle.checkmarkColor) && Color.m6707equalsimpl0(this.disabledCheckedColor, checkboxStyle.disabledCheckedColor) && Color.m6707equalsimpl0(this.disabledUncheckedColor, checkboxStyle.disabledUncheckedColor);
    }

    public int hashCode() {
        return (((((((Color.m6713hashCodeimpl(this.checkedColor) * 31) + Color.m6713hashCodeimpl(this.uncheckedColor)) * 31) + Color.m6713hashCodeimpl(this.checkmarkColor)) * 31) + Color.m6713hashCodeimpl(this.disabledCheckedColor)) * 31) + Color.m6713hashCodeimpl(this.disabledUncheckedColor);
    }

    public String toString() {
        return "CheckboxStyle(checkedColor=" + Color.m6714toStringimpl(this.checkedColor) + ", uncheckedColor=" + Color.m6714toStringimpl(this.uncheckedColor) + ", checkmarkColor=" + Color.m6714toStringimpl(this.checkmarkColor) + ", disabledCheckedColor=" + Color.m6714toStringimpl(this.disabledCheckedColor) + ", disabledUncheckedColor=" + Color.m6714toStringimpl(this.disabledUncheckedColor) + ")";
    }

    private CheckboxStyle(long j, long j2, long j3, long j4, long j5) {
        this.checkedColor = j;
        this.uncheckedColor = j2;
        this.checkmarkColor = j3;
        this.disabledCheckedColor = j4;
        this.disabledUncheckedColor = j5;
    }

    /* renamed from: getCheckedColor-0d7_KjU, reason: not valid java name */
    public final long m21737getCheckedColor0d7_KjU() {
        return this.checkedColor;
    }

    /* renamed from: getUncheckedColor-0d7_KjU, reason: not valid java name */
    public final long m21741getUncheckedColor0d7_KjU() {
        return this.uncheckedColor;
    }

    /* renamed from: getCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m21738getCheckmarkColor0d7_KjU() {
        return this.checkmarkColor;
    }

    /* renamed from: getDisabledCheckedColor-0d7_KjU, reason: not valid java name */
    public final long m21739getDisabledCheckedColor0d7_KjU() {
        return this.disabledCheckedColor;
    }

    /* renamed from: getDisabledUncheckedColor-0d7_KjU, reason: not valid java name */
    public final long m21740getDisabledUncheckedColor0d7_KjU() {
        return this.disabledUncheckedColor;
    }
}
