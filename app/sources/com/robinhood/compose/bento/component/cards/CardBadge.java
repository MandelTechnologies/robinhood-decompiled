package com.robinhood.compose.bento.component.cards;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCardBadge.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/CardBadge;", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "<init>", "(Ljava/lang/String;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTextColor-0d7_KjU", "()J", "J", "getBackgroundColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-WkMS-hQ", "(Ljava/lang/String;JJ)Lcom/robinhood/compose/bento/component/cards/CardBadge;", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardBadge {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final String text;
    private final long textColor;

    public /* synthetic */ CardBadge(String str, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2);
    }

    /* renamed from: copy-WkMS-hQ$default, reason: not valid java name */
    public static /* synthetic */ CardBadge m20880copyWkMShQ$default(CardBadge cardBadge, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardBadge.text;
        }
        if ((i & 2) != 0) {
            j = cardBadge.textColor;
        }
        if ((i & 4) != 0) {
            j2 = cardBadge.backgroundColor;
        }
        return cardBadge.m20883copyWkMShQ(str, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-WkMS-hQ, reason: not valid java name */
    public final CardBadge m20883copyWkMShQ(String text, long textColor, long backgroundColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new CardBadge(text, textColor, backgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBadge)) {
            return false;
        }
        CardBadge cardBadge = (CardBadge) other;
        return Intrinsics.areEqual(this.text, cardBadge.text) && Color.m6707equalsimpl0(this.textColor, cardBadge.textColor) && Color.m6707equalsimpl0(this.backgroundColor, cardBadge.backgroundColor);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Color.m6713hashCodeimpl(this.textColor)) * 31) + Color.m6713hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "CardBadge(text=" + this.text + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
    }

    private CardBadge(String text, long j, long j2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textColor = j;
        this.backgroundColor = j2;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m20885getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m20884getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }
}
