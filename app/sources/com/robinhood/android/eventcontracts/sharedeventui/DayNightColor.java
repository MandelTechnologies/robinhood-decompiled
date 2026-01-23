package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DayNightColor.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\bJ$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "", "dayColor", "Landroidx/compose/ui/graphics/Color;", "nightColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDayColor-0d7_KjU", "()J", "J", "getNightColor-0d7_KjU", ResourceTypes.COLOR, "isDay", "", "color-vNxB06k", "(Z)J", "getColor", "(Landroidx/compose/runtime/Composer;I)J", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "equals", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayNightColor {
    public static final int $stable = 0;
    private final long dayColor;
    private final long nightColor;

    public /* synthetic */ DayNightColor(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ DayNightColor m14361copyOWjLjI$default(DayNightColor dayNightColor, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dayNightColor.dayColor;
        }
        if ((i & 2) != 0) {
            j2 = dayNightColor.nightColor;
        }
        return dayNightColor.m14365copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayColor() {
        return this.dayColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getNightColor() {
        return this.nightColor;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final DayNightColor m14365copyOWjLjI(long dayColor, long nightColor) {
        return new DayNightColor(dayColor, nightColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayNightColor)) {
            return false;
        }
        DayNightColor dayNightColor = (DayNightColor) other;
        return Color.m6707equalsimpl0(this.dayColor, dayNightColor.dayColor) && Color.m6707equalsimpl0(this.nightColor, dayNightColor.nightColor);
    }

    public int hashCode() {
        return (Color.m6713hashCodeimpl(this.dayColor) * 31) + Color.m6713hashCodeimpl(this.nightColor);
    }

    public String toString() {
        return "DayNightColor(dayColor=" + Color.m6714toStringimpl(this.dayColor) + ", nightColor=" + Color.m6714toStringimpl(this.nightColor) + ")";
    }

    private DayNightColor(long j, long j2) {
        this.dayColor = j;
        this.nightColor = j2;
    }

    /* renamed from: getDayColor-0d7_KjU, reason: not valid java name */
    public final long m14366getDayColor0d7_KjU() {
        return this.dayColor;
    }

    /* renamed from: getNightColor-0d7_KjU, reason: not valid java name */
    public final long m14367getNightColor0d7_KjU() {
        return this.nightColor;
    }

    /* renamed from: color-vNxB06k, reason: not valid java name */
    public final long m14362colorvNxB06k(boolean isDay) {
        return isDay ? this.dayColor : this.nightColor;
    }

    @JvmName
    public final long getColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(36631634, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.DayNightColor.<get-color> (DayNightColor.kt:28)");
        }
        long jM14362colorvNxB06k = m14362colorvNxB06k(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM14362colorvNxB06k;
    }
}
