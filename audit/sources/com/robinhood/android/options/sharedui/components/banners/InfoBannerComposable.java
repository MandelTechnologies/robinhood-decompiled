package com.robinhood.android.options.sharedui.components.banners;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground;", "", "<init>", "()V", "toBrush", "Landroidx/compose/ui/graphics/Brush;", "Solid", "LinearGradient", "Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground$LinearGradient;", "Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground$Solid;", "lib-options-shared-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.sharedui.components.banners.BannerBackground, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class InfoBannerComposable {
    public static final int $stable = 0;

    /* compiled from: InfoBannerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.sharedui.components.banners.BannerBackground$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoBannerComposable2.values().length];
            try {
                iArr[InfoBannerComposable2.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBannerComposable2.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InfoBannerComposable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InfoBannerComposable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground$Solid;", "Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground$Solid;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-shared-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.sharedui.components.banners.BannerBackground$Solid, reason: from toString */
    public static final /* data */ class Solid extends InfoBannerComposable {
        public static final int $stable = 0;
        private final long color;

        public /* synthetic */ Solid(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Solid m17008copy8_81llA$default(Solid solid, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = solid.color;
            }
            return solid.m17010copy8_81llA(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Solid m17010copy8_81llA(long color) {
            return new Solid(color, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Solid) && Color.m6707equalsimpl0(this.color, ((Solid) other).color);
        }

        public int hashCode() {
            return Color.m6713hashCodeimpl(this.color);
        }

        public String toString() {
            return "Solid(color=" + Color.m6714toStringimpl(this.color) + ")";
        }

        private Solid(long j) {
            super(null);
            this.color = j;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m17011getColor0d7_KjU() {
            return this.color;
        }
    }

    private InfoBannerComposable() {
    }

    /* compiled from: InfoBannerComposable.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground$LinearGradient;", "Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "orientation", "Lcom/robinhood/android/options/sharedui/components/banners/GradientOrientation;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/options/sharedui/components/banners/GradientOrientation;)V", "getColorStops", "()Ljava/util/List;", "getOrientation", "()Lcom/robinhood/android/options/sharedui/components/banners/GradientOrientation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-shared-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.sharedui.components.banners.BannerBackground$LinearGradient, reason: from toString */
    public static final /* data */ class LinearGradient extends InfoBannerComposable {
        public static final int $stable = 8;
        private final List<Tuples2<Float, Color>> colorStops;
        private final InfoBannerComposable2 orientation;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LinearGradient copy$default(LinearGradient linearGradient, List list, InfoBannerComposable2 infoBannerComposable2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = linearGradient.colorStops;
            }
            if ((i & 2) != 0) {
                infoBannerComposable2 = linearGradient.orientation;
            }
            return linearGradient.copy(list, infoBannerComposable2);
        }

        public final List<Tuples2<Float, Color>> component1() {
            return this.colorStops;
        }

        /* renamed from: component2, reason: from getter */
        public final InfoBannerComposable2 getOrientation() {
            return this.orientation;
        }

        public final LinearGradient copy(List<Tuples2<Float, Color>> colorStops, InfoBannerComposable2 orientation) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            return new LinearGradient(colorStops, orientation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinearGradient)) {
                return false;
            }
            LinearGradient linearGradient = (LinearGradient) other;
            return Intrinsics.areEqual(this.colorStops, linearGradient.colorStops) && this.orientation == linearGradient.orientation;
        }

        public int hashCode() {
            return (this.colorStops.hashCode() * 31) + this.orientation.hashCode();
        }

        public String toString() {
            return "LinearGradient(colorStops=" + this.colorStops + ", orientation=" + this.orientation + ")";
        }

        public final List<Tuples2<Float, Color>> getColorStops() {
            return this.colorStops;
        }

        public /* synthetic */ LinearGradient(List list, InfoBannerComposable2 infoBannerComposable2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? InfoBannerComposable2.HORIZONTAL : infoBannerComposable2);
        }

        public final InfoBannerComposable2 getOrientation() {
            return this.orientation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinearGradient(List<Tuples2<Float, Color>> colorStops, InfoBannerComposable2 orientation) {
            super(null);
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.colorStops = colorStops;
            this.orientation = orientation;
        }
    }

    public final Brush toBrush() {
        if (this instanceof Solid) {
            Solid solid = (Solid) this;
            return Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(solid.m17011getColor0d7_KjU()), Color.m6701boximpl(solid.m17011getColor0d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
        }
        if (!(this instanceof LinearGradient)) {
            throw new NoWhenBranchMatchedException();
        }
        LinearGradient linearGradient = (LinearGradient) this;
        int i = WhenMappings.$EnumSwitchMapping$0[linearGradient.getOrientation().ordinal()];
        if (i == 1) {
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2[] tuples2Arr = (Tuples2[]) linearGradient.getColorStops().toArray(new Tuples2[0]);
            return Brush.Companion.m6677horizontalGradient8A3gB4$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), 0.0f, 0.0f, 0, 14, (Object) null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Brush.Companion companion2 = Brush.INSTANCE;
        Tuples2[] tuples2Arr2 = (Tuples2[]) linearGradient.getColorStops().toArray(new Tuples2[0]);
        return Brush.Companion.m6683verticalGradient8A3gB4$default(companion2, (Tuples2[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length), 0.0f, 0.0f, 0, 14, (Object) null);
    }
}
