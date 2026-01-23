package com.robinhood.scarlet.util.resource;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayResource.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ArrayResource;", "", "resId", "", "<init>", "(I)V", "getResId", "()I", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ArrayResource {
    public static final int $stable = 0;
    private final int resId;

    public static /* synthetic */ ArrayResource copy$default(ArrayResource arrayResource, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = arrayResource.resId;
        }
        return arrayResource.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    public final ArrayResource copy(int resId) {
        return new ArrayResource(resId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArrayResource) && this.resId == ((ArrayResource) other).resId;
    }

    public int hashCode() {
        return Integer.hashCode(this.resId);
    }

    public ArrayResource(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }

    public String toString() {
        String hexString = Integer.toHexString(this.resId);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = hexString.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return "ArrayResource(0x" + upperCase + ")";
    }
}
