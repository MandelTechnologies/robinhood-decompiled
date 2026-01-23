package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/EventRowState;", "", "start", "Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;", "primaryText", "", "secondaryText", "<init>", "(Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;Ljava/lang/String;Ljava/lang/String;)V", "getStart", "()Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Start", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EventRowState {
    public static final int $stable = 8;
    private final String primaryText;
    private final String secondaryText;
    private final Start start;

    public static /* synthetic */ EventRowState copy$default(EventRowState eventRowState, Start start, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            start = eventRowState.start;
        }
        if ((i & 2) != 0) {
            str = eventRowState.primaryText;
        }
        if ((i & 4) != 0) {
            str2 = eventRowState.secondaryText;
        }
        return eventRowState.copy(start, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Start getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final EventRowState copy(Start start, String primaryText, String secondaryText) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new EventRowState(start, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRowState)) {
            return false;
        }
        EventRowState eventRowState = (EventRowState) other;
        return Intrinsics.areEqual(this.start, eventRowState.start) && Intrinsics.areEqual(this.primaryText, eventRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, eventRowState.secondaryText);
    }

    public int hashCode() {
        int iHashCode = ((this.start.hashCode() * 31) + this.primaryText.hashCode()) * 31;
        String str = this.secondaryText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EventRowState(start=" + this.start + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public EventRowState(Start start, String primaryText, String str) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.start = start;
        this.primaryText = primaryText;
        this.secondaryText = str;
    }

    public final Start getStart() {
        return this.start;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* compiled from: EventRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;", "", "TwoLine", "Lcom/robinhood/compose/bento/component/rows/EventRowState$Start$TwoLine;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Start {

        /* compiled from: EventRow.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\b\u0015J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/EventRowState$Start$TwoLine;", "Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;", "text1", "", "text2", "foregroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText1", "()Ljava/lang/String;", "getText2", "getForegroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getBackgroundColor-QN2ZGVo", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "component4-QN2ZGVo", "copy", "copy-Ij2XjQ8", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TwoLine implements Start {
            public static final int $stable = 0;
            private final Color backgroundColor;
            private final Color foregroundColor;
            private final String text1;
            private final String text2;

            public /* synthetic */ TwoLine(String str, String str2, Color color, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, color, color2);
            }

            /* renamed from: copy-Ij2XjQ8$default, reason: not valid java name */
            public static /* synthetic */ TwoLine m21042copyIj2XjQ8$default(TwoLine twoLine, String str, String str2, Color color, Color color2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = twoLine.text1;
                }
                if ((i & 2) != 0) {
                    str2 = twoLine.text2;
                }
                if ((i & 4) != 0) {
                    color = twoLine.foregroundColor;
                }
                if ((i & 8) != 0) {
                    color2 = twoLine.backgroundColor;
                }
                return twoLine.m21045copyIj2XjQ8(str, str2, color, color2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText1() {
                return this.text1;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText2() {
                return this.text2;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getForegroundColor() {
                return this.foregroundColor;
            }

            /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: copy-Ij2XjQ8, reason: not valid java name */
            public final TwoLine m21045copyIj2XjQ8(String text1, String text2, Color foregroundColor, Color backgroundColor) {
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                return new TwoLine(text1, text2, foregroundColor, backgroundColor, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TwoLine)) {
                    return false;
                }
                TwoLine twoLine = (TwoLine) other;
                return Intrinsics.areEqual(this.text1, twoLine.text1) && Intrinsics.areEqual(this.text2, twoLine.text2) && Intrinsics.areEqual(this.foregroundColor, twoLine.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, twoLine.backgroundColor);
            }

            public int hashCode() {
                int iHashCode = ((this.text1.hashCode() * 31) + this.text2.hashCode()) * 31;
                Color color = this.foregroundColor;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                Color color2 = this.backgroundColor;
                return iM6713hashCodeimpl + (color2 != null ? Color.m6713hashCodeimpl(color2.getValue()) : 0);
            }

            public String toString() {
                return "TwoLine(text1=" + this.text1 + ", text2=" + this.text2 + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ")";
            }

            private TwoLine(String text1, String text2, Color color, Color color2) {
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                this.text1 = text1;
                this.text2 = text2;
                this.foregroundColor = color;
                this.backgroundColor = color2;
            }

            public /* synthetic */ TwoLine(String str, String str2, Color color, Color color2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : color2, null);
            }

            public final String getText1() {
                return this.text1;
            }

            public final String getText2() {
                return this.text2;
            }

            /* renamed from: getForegroundColor-QN2ZGVo, reason: not valid java name */
            public final Color m21047getForegroundColorQN2ZGVo() {
                return this.foregroundColor;
            }

            /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
            public final Color m21046getBackgroundColorQN2ZGVo() {
                return this.backgroundColor;
            }
        }
    }
}
