package com.robinhood.utils.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterlacedDataSource.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002BA\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JS\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/utils/paging/AroundLoad;", "ValueT", "", "before", "", "boundary", "after", "position", "", "totalCount", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;II)V", "getBefore", "()Ljava/util/List;", "getBoundary", "getAfter", "getPosition", "()I", "getTotalCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final /* data */ class AroundLoad<ValueT> {
    private final List<ValueT> after;
    private final List<ValueT> before;
    private final List<ValueT> boundary;
    private final int position;
    private final int totalCount;

    public static /* synthetic */ AroundLoad copy$default(AroundLoad aroundLoad, List list, List list2, List list3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = aroundLoad.before;
        }
        if ((i3 & 2) != 0) {
            list2 = aroundLoad.boundary;
        }
        if ((i3 & 4) != 0) {
            list3 = aroundLoad.after;
        }
        if ((i3 & 8) != 0) {
            i = aroundLoad.position;
        }
        if ((i3 & 16) != 0) {
            i2 = aroundLoad.totalCount;
        }
        int i4 = i2;
        List list4 = list3;
        return aroundLoad.copy(list, list2, list4, i, i4);
    }

    public final List<ValueT> component1() {
        return this.before;
    }

    public final List<ValueT> component2() {
        return this.boundary;
    }

    public final List<ValueT> component3() {
        return this.after;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final AroundLoad<ValueT> copy(List<? extends ValueT> before, List<? extends ValueT> boundary, List<? extends ValueT> after, int position, int totalCount) {
        Intrinsics.checkNotNullParameter(before, "before");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(after, "after");
        return new AroundLoad<>(before, boundary, after, position, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AroundLoad)) {
            return false;
        }
        AroundLoad aroundLoad = (AroundLoad) other;
        return Intrinsics.areEqual(this.before, aroundLoad.before) && Intrinsics.areEqual(this.boundary, aroundLoad.boundary) && Intrinsics.areEqual(this.after, aroundLoad.after) && this.position == aroundLoad.position && this.totalCount == aroundLoad.totalCount;
    }

    public int hashCode() {
        return (((((((this.before.hashCode() * 31) + this.boundary.hashCode()) * 31) + this.after.hashCode()) * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.totalCount);
    }

    public String toString() {
        return "AroundLoad(before=" + this.before + ", boundary=" + this.boundary + ", after=" + this.after + ", position=" + this.position + ", totalCount=" + this.totalCount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AroundLoad(List<? extends ValueT> before, List<? extends ValueT> boundary, List<? extends ValueT> after, int i, int i2) {
        Intrinsics.checkNotNullParameter(before, "before");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(after, "after");
        this.before = before;
        this.boundary = boundary;
        this.after = after;
        this.position = i;
        this.totalCount = i2;
    }

    public final List<ValueT> getBefore() {
        return this.before;
    }

    public final List<ValueT> getBoundary() {
        return this.boundary;
    }

    public final List<ValueT> getAfter() {
        return this.after;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
