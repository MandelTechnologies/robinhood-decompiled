package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AllocationBar.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/components/AllocationSection;", "", "id", "", "percentage", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getPercentage", "()F", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Ljava/lang/String;FJ)Lcom/robinhood/android/investmentstracker/composables/components/AllocationSection;", "equals", "", "other", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AllocationSection {
    public static final int $stable = 0;
    private final long color;
    private final String id;
    private final float percentage;

    public /* synthetic */ AllocationSection(String str, float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, j);
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ AllocationSection m15579copymxwnekA$default(AllocationSection allocationSection, String str, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allocationSection.id;
        }
        if ((i & 2) != 0) {
            f = allocationSection.percentage;
        }
        if ((i & 4) != 0) {
            j = allocationSection.color;
        }
        return allocationSection.m15581copymxwnekA(str, f, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final AllocationSection m15581copymxwnekA(String id, float percentage, long color) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AllocationSection(id, percentage, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllocationSection)) {
            return false;
        }
        AllocationSection allocationSection = (AllocationSection) other;
        return Intrinsics.areEqual(this.id, allocationSection.id) && Float.compare(this.percentage, allocationSection.percentage) == 0 && Color.m6707equalsimpl0(this.color, allocationSection.color);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Float.hashCode(this.percentage)) * 31) + Color.m6713hashCodeimpl(this.color);
    }

    public String toString() {
        return "AllocationSection(id=" + this.id + ", percentage=" + this.percentage + ", color=" + Color.m6714toStringimpl(this.color) + ")";
    }

    private AllocationSection(String id, float f, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.percentage = f;
        this.color = j;
    }

    public final String getId() {
        return this.id;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m15582getColor0d7_KjU() {
        return this.color;
    }
}
