package com.robinhood.shared.education.order;

import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003Jg\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/education/order/AnimationColorOverrides;", "", "foregroundColor", "", "primaryColor", "primaryColorLight", "primaryGradient", "", "foregroundGradient", "primaryGradientStopLimit", "foregroundGradientStopLimit", "<init>", "(IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getForegroundColor", "()I", "getPrimaryColor", "getPrimaryColorLight", "getPrimaryGradient", "()Ljava/util/List;", "getForegroundGradient", "getPrimaryGradientStopLimit", "getForegroundGradientStopLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class AnimationColorOverrides {
    public static final int $stable = 8;
    private final int foregroundColor;
    private final List<Integer> foregroundGradient;
    private final List<Integer> foregroundGradientStopLimit;
    private final int primaryColor;
    private final int primaryColorLight;
    private final List<Integer> primaryGradient;
    private final List<Integer> primaryGradientStopLimit;

    public AnimationColorOverrides() {
        this(0, 0, 0, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ AnimationColorOverrides copy$default(AnimationColorOverrides animationColorOverrides, int i, int i2, int i3, List list, List list2, List list3, List list4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = animationColorOverrides.foregroundColor;
        }
        if ((i4 & 2) != 0) {
            i2 = animationColorOverrides.primaryColor;
        }
        if ((i4 & 4) != 0) {
            i3 = animationColorOverrides.primaryColorLight;
        }
        if ((i4 & 8) != 0) {
            list = animationColorOverrides.primaryGradient;
        }
        if ((i4 & 16) != 0) {
            list2 = animationColorOverrides.foregroundGradient;
        }
        if ((i4 & 32) != 0) {
            list3 = animationColorOverrides.primaryGradientStopLimit;
        }
        if ((i4 & 64) != 0) {
            list4 = animationColorOverrides.foregroundGradientStopLimit;
        }
        List list5 = list3;
        List list6 = list4;
        List list7 = list2;
        int i5 = i3;
        return animationColorOverrides.copy(i, i2, i5, list, list7, list5, list6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrimaryColorLight() {
        return this.primaryColorLight;
    }

    public final List<Integer> component4() {
        return this.primaryGradient;
    }

    public final List<Integer> component5() {
        return this.foregroundGradient;
    }

    public final List<Integer> component6() {
        return this.primaryGradientStopLimit;
    }

    public final List<Integer> component7() {
        return this.foregroundGradientStopLimit;
    }

    public final AnimationColorOverrides copy(int foregroundColor, int primaryColor, int primaryColorLight, List<Integer> primaryGradient, List<Integer> foregroundGradient, List<Integer> primaryGradientStopLimit, List<Integer> foregroundGradientStopLimit) {
        Intrinsics.checkNotNullParameter(primaryGradient, "primaryGradient");
        Intrinsics.checkNotNullParameter(foregroundGradient, "foregroundGradient");
        Intrinsics.checkNotNullParameter(primaryGradientStopLimit, "primaryGradientStopLimit");
        Intrinsics.checkNotNullParameter(foregroundGradientStopLimit, "foregroundGradientStopLimit");
        return new AnimationColorOverrides(foregroundColor, primaryColor, primaryColorLight, primaryGradient, foregroundGradient, primaryGradientStopLimit, foregroundGradientStopLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationColorOverrides)) {
            return false;
        }
        AnimationColorOverrides animationColorOverrides = (AnimationColorOverrides) other;
        return this.foregroundColor == animationColorOverrides.foregroundColor && this.primaryColor == animationColorOverrides.primaryColor && this.primaryColorLight == animationColorOverrides.primaryColorLight && Intrinsics.areEqual(this.primaryGradient, animationColorOverrides.primaryGradient) && Intrinsics.areEqual(this.foregroundGradient, animationColorOverrides.foregroundGradient) && Intrinsics.areEqual(this.primaryGradientStopLimit, animationColorOverrides.primaryGradientStopLimit) && Intrinsics.areEqual(this.foregroundGradientStopLimit, animationColorOverrides.foregroundGradientStopLimit);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.foregroundColor) * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.primaryColorLight)) * 31) + this.primaryGradient.hashCode()) * 31) + this.foregroundGradient.hashCode()) * 31) + this.primaryGradientStopLimit.hashCode()) * 31) + this.foregroundGradientStopLimit.hashCode();
    }

    public String toString() {
        return "AnimationColorOverrides(foregroundColor=" + this.foregroundColor + ", primaryColor=" + this.primaryColor + ", primaryColorLight=" + this.primaryColorLight + ", primaryGradient=" + this.primaryGradient + ", foregroundGradient=" + this.foregroundGradient + ", primaryGradientStopLimit=" + this.primaryGradientStopLimit + ", foregroundGradientStopLimit=" + this.foregroundGradientStopLimit + ")";
    }

    public AnimationColorOverrides(int i, int i2, int i3, List<Integer> primaryGradient, List<Integer> foregroundGradient, List<Integer> primaryGradientStopLimit, List<Integer> foregroundGradientStopLimit) {
        Intrinsics.checkNotNullParameter(primaryGradient, "primaryGradient");
        Intrinsics.checkNotNullParameter(foregroundGradient, "foregroundGradient");
        Intrinsics.checkNotNullParameter(primaryGradientStopLimit, "primaryGradientStopLimit");
        Intrinsics.checkNotNullParameter(foregroundGradientStopLimit, "foregroundGradientStopLimit");
        this.foregroundColor = i;
        this.primaryColor = i2;
        this.primaryColorLight = i3;
        this.primaryGradient = primaryGradient;
        this.foregroundGradient = foregroundGradient;
        this.primaryGradientStopLimit = primaryGradientStopLimit;
        this.foregroundGradientStopLimit = foregroundGradientStopLimit;
    }

    public final int getForegroundColor() {
        return this.foregroundColor;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getPrimaryColorLight() {
        return this.primaryColorLight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    public /* synthetic */ AnimationColorOverrides(int i, int i2, int i3, List list, List list2, List list3, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        if ((i4 & 8) != 0) {
            list = new ArrayList(3);
            for (int i5 = 0; i5 < 3; i5++) {
                list.add(0);
            }
        }
        if ((i4 & 16) != 0) {
            list2 = new ArrayList(3);
            for (int i6 = 0; i6 < 3; i6++) {
                list2.add(0);
            }
        }
        if ((i4 & 32) != 0) {
            list3 = new ArrayList(4);
            for (int i7 = 0; i7 < 4; i7++) {
                list3.add(0);
            }
        }
        if ((i4 & 64) != 0) {
            list4 = new ArrayList(4);
            for (int i8 = 0; i8 < 4; i8++) {
                list4.add(0);
            }
        }
        List list5 = list4;
        this(i, i2, i3, list, list2, list3, list5);
    }

    public final List<Integer> getPrimaryGradient() {
        return this.primaryGradient;
    }

    public final List<Integer> getForegroundGradient() {
        return this.foregroundGradient;
    }

    public final List<Integer> getPrimaryGradientStopLimit() {
        return this.primaryGradientStopLimit;
    }

    public final List<Integer> getForegroundGradientStopLimit() {
        return this.foregroundGradientStopLimit;
    }
}
