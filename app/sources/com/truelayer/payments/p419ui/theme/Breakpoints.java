package com.truelayer.payments.p419ui.theme;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Breakpoints.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/Breakpoints;", "", "small", "Landroidx/compose/ui/Modifier;", "medium", "large", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "getLarge", "()Landroidx/compose/ui/Modifier;", "getMedium", "getSmall", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Breakpoints {
    public static final int $stable = 0;
    private final Modifier large;
    private final Modifier medium;
    private final Modifier small;

    public Breakpoints() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Breakpoints copy$default(Breakpoints breakpoints, Modifier modifier, Modifier modifier2, Modifier modifier3, int i, Object obj) {
        if ((i & 1) != 0) {
            modifier = breakpoints.small;
        }
        if ((i & 2) != 0) {
            modifier2 = breakpoints.medium;
        }
        if ((i & 4) != 0) {
            modifier3 = breakpoints.large;
        }
        return breakpoints.copy(modifier, modifier2, modifier3);
    }

    /* renamed from: component1, reason: from getter */
    public final Modifier getSmall() {
        return this.small;
    }

    /* renamed from: component2, reason: from getter */
    public final Modifier getMedium() {
        return this.medium;
    }

    /* renamed from: component3, reason: from getter */
    public final Modifier getLarge() {
        return this.large;
    }

    public final Breakpoints copy(Modifier small, Modifier medium, Modifier large) {
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        return new Breakpoints(small, medium, large);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Breakpoints)) {
            return false;
        }
        Breakpoints breakpoints = (Breakpoints) other;
        return Intrinsics.areEqual(this.small, breakpoints.small) && Intrinsics.areEqual(this.medium, breakpoints.medium) && Intrinsics.areEqual(this.large, breakpoints.large);
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Breakpoints(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ")";
    }

    public Breakpoints(Modifier small, Modifier medium, Modifier large) {
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Breakpoints(Modifier modifier, Modifier modifier2, Modifier modifier3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        modifier = (i & 1) != 0 ? Modifier.INSTANCE : modifier;
        modifier2 = (i & 2) != 0 ? modifier : modifier2;
        this(modifier, modifier2, (i & 4) != 0 ? modifier2 : modifier3);
    }

    public final Modifier getSmall() {
        return this.small;
    }

    public final Modifier getMedium() {
        return this.medium;
    }

    public final Modifier getLarge() {
        return this.large;
    }
}
