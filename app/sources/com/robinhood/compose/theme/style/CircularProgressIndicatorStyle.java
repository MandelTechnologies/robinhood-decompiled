package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CircularProgressIndicatorStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CircularProgressIndicatorStyle {
    public static final int $stable = 0;
    private final long color;

    public /* synthetic */ CircularProgressIndicatorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ CircularProgressIndicatorStyle m21742copy8_81llA$default(CircularProgressIndicatorStyle circularProgressIndicatorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = circularProgressIndicatorStyle.color;
        }
        return circularProgressIndicatorStyle.m21744copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final CircularProgressIndicatorStyle m21744copy8_81llA(long color) {
        return new CircularProgressIndicatorStyle(color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CircularProgressIndicatorStyle) && Color.m6707equalsimpl0(this.color, ((CircularProgressIndicatorStyle) other).color);
    }

    public int hashCode() {
        return Color.m6713hashCodeimpl(this.color);
    }

    public String toString() {
        return "CircularProgressIndicatorStyle(color=" + Color.m6714toStringimpl(this.color) + ")";
    }

    private CircularProgressIndicatorStyle(long j) {
        this.color = j;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m21745getColor0d7_KjU() {
        return this.color;
    }
}
