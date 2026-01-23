package com.robinhood.tooltips;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.tooltips.TooltipData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TooltipData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005$%&'(B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData;", "", "id", "", "text", "", "target", "Lcom/robinhood/tooltips/TooltipData$Target;", "layout", "Lcom/robinhood/tooltips/TooltipData$Layout;", "behavior", "Lcom/robinhood/tooltips/TooltipData$Behavior;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/robinhood/tooltips/TooltipData$Target;Lcom/robinhood/tooltips/TooltipData$Layout;Lcom/robinhood/tooltips/TooltipData$Behavior;)V", "getId", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "getTarget", "()Lcom/robinhood/tooltips/TooltipData$Target;", "getLayout", "()Lcom/robinhood/tooltips/TooltipData$Layout;", "getBehavior", "()Lcom/robinhood/tooltips/TooltipData$Behavior;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Target", "Layout", "Behavior", "Dimensions", "Coordinates", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TooltipData {
    public static final int $stable = 8;
    private final Behavior behavior;
    private final String id;
    private final Layout layout;
    private final Target target;
    private final CharSequence text;

    public static /* synthetic */ TooltipData copy$default(TooltipData tooltipData, String str, CharSequence charSequence, Target target, Layout layout, Behavior behavior, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tooltipData.id;
        }
        if ((i & 2) != 0) {
            charSequence = tooltipData.text;
        }
        if ((i & 4) != 0) {
            target = tooltipData.target;
        }
        if ((i & 8) != 0) {
            layout = tooltipData.layout;
        }
        if ((i & 16) != 0) {
            behavior = tooltipData.behavior;
        }
        Behavior behavior2 = behavior;
        Target target2 = target;
        return tooltipData.copy(str, charSequence, target2, layout, behavior2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Target getTarget() {
        return this.target;
    }

    /* renamed from: component4, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    /* renamed from: component5, reason: from getter */
    public final Behavior getBehavior() {
        return this.behavior;
    }

    public final TooltipData copy(String id, CharSequence text, Target target, Layout layout, Behavior behavior) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return new TooltipData(id, text, target, layout, behavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipData)) {
            return false;
        }
        TooltipData tooltipData = (TooltipData) other;
        return Intrinsics.areEqual(this.id, tooltipData.id) && Intrinsics.areEqual(this.text, tooltipData.text) && Intrinsics.areEqual(this.target, tooltipData.target) && Intrinsics.areEqual(this.layout, tooltipData.layout) && Intrinsics.areEqual(this.behavior, tooltipData.behavior);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
        Target target = this.target;
        return ((((iHashCode + (target == null ? 0 : target.hashCode())) * 31) + this.layout.hashCode()) * 31) + this.behavior.hashCode();
    }

    public String toString() {
        String str = this.id;
        CharSequence charSequence = this.text;
        return "TooltipData(id=" + str + ", text=" + ((Object) charSequence) + ", target=" + this.target + ", layout=" + this.layout + ", behavior=" + this.behavior + ")";
    }

    public TooltipData(String id, CharSequence text, Target target, Layout layout, Behavior behavior) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.id = id;
        this.text = text;
        this.target = target;
        this.layout = layout;
        this.behavior = behavior;
    }

    public final String getId() {
        return this.id;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final Target getTarget() {
        return this.target;
    }

    public /* synthetic */ TooltipData(String str, CharSequence charSequence, Target target, Layout layout, Behavior behavior, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? null : target, (i & 8) != 0 ? new Layout(null, 0.0f, null, null, 15, null) : layout, (i & 16) != 0 ? new Behavior(null, null, null, null, 15, null) : behavior);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final Behavior getBehavior() {
        return this.behavior;
    }

    /* compiled from: TooltipData.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData$Target;", "", "coordinates", "Lcom/robinhood/tooltips/TooltipData$Coordinates;", "dimensions", "Lcom/robinhood/tooltips/TooltipData$Dimensions;", "<init>", "(Lcom/robinhood/tooltips/TooltipData$Coordinates;Lcom/robinhood/tooltips/TooltipData$Dimensions;)V", "getCoordinates", "()Lcom/robinhood/tooltips/TooltipData$Coordinates;", "getDimensions", "()Lcom/robinhood/tooltips/TooltipData$Dimensions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Target {
        public static final int $stable = 0;
        private final Coordinates coordinates;
        private final Dimensions dimensions;

        public static /* synthetic */ Target copy$default(Target target, Coordinates coordinates, Dimensions dimensions, int i, Object obj) {
            if ((i & 1) != 0) {
                coordinates = target.coordinates;
            }
            if ((i & 2) != 0) {
                dimensions = target.dimensions;
            }
            return target.copy(coordinates, dimensions);
        }

        /* renamed from: component1, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component2, reason: from getter */
        public final Dimensions getDimensions() {
            return this.dimensions;
        }

        public final Target copy(Coordinates coordinates, Dimensions dimensions) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(dimensions, "dimensions");
            return new Target(coordinates, dimensions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return Intrinsics.areEqual(this.coordinates, target.coordinates) && Intrinsics.areEqual(this.dimensions, target.dimensions);
        }

        public int hashCode() {
            return (this.coordinates.hashCode() * 31) + this.dimensions.hashCode();
        }

        public String toString() {
            return "Target(coordinates=" + this.coordinates + ", dimensions=" + this.dimensions + ")";
        }

        public Target(Coordinates coordinates, Dimensions dimensions) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(dimensions, "dimensions");
            this.coordinates = coordinates;
            this.dimensions = dimensions;
        }

        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        public final Dimensions getDimensions() {
            return this.dimensions;
        }
    }

    /* compiled from: TooltipData.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData$Layout;", "", "nibDirection", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "offsetY", "", "boundaryViewTags", "", "", "canvasTag", "<init>", "(Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;FLjava/util/Set;Ljava/lang/String;)V", "getNibDirection", "()Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "getOffsetY", "()F", "getBoundaryViewTags", "()Ljava/util/Set;", "getCanvasTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Layout {
        public static final int $stable = 8;
        private final Set<String> boundaryViewTags;
        private final String canvasTag;
        private final RdsTooltipView.NibDirection nibDirection;
        private final float offsetY;

        public Layout() {
            this(null, 0.0f, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Layout copy$default(Layout layout, RdsTooltipView.NibDirection nibDirection, float f, Set set, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                nibDirection = layout.nibDirection;
            }
            if ((i & 2) != 0) {
                f = layout.offsetY;
            }
            if ((i & 4) != 0) {
                set = layout.boundaryViewTags;
            }
            if ((i & 8) != 0) {
                str = layout.canvasTag;
            }
            return layout.copy(nibDirection, f, set, str);
        }

        /* renamed from: component1, reason: from getter */
        public final RdsTooltipView.NibDirection getNibDirection() {
            return this.nibDirection;
        }

        /* renamed from: component2, reason: from getter */
        public final float getOffsetY() {
            return this.offsetY;
        }

        public final Set<String> component3() {
            return this.boundaryViewTags;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCanvasTag() {
            return this.canvasTag;
        }

        public final Layout copy(RdsTooltipView.NibDirection nibDirection, float offsetY, Set<String> boundaryViewTags, String canvasTag) {
            Intrinsics.checkNotNullParameter(boundaryViewTags, "boundaryViewTags");
            return new Layout(nibDirection, offsetY, boundaryViewTags, canvasTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) other;
            return this.nibDirection == layout.nibDirection && Float.compare(this.offsetY, layout.offsetY) == 0 && Intrinsics.areEqual(this.boundaryViewTags, layout.boundaryViewTags) && Intrinsics.areEqual(this.canvasTag, layout.canvasTag);
        }

        public int hashCode() {
            RdsTooltipView.NibDirection nibDirection = this.nibDirection;
            int iHashCode = (((((nibDirection == null ? 0 : nibDirection.hashCode()) * 31) + Float.hashCode(this.offsetY)) * 31) + this.boundaryViewTags.hashCode()) * 31;
            String str = this.canvasTag;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Layout(nibDirection=" + this.nibDirection + ", offsetY=" + this.offsetY + ", boundaryViewTags=" + this.boundaryViewTags + ", canvasTag=" + this.canvasTag + ")";
        }

        public Layout(RdsTooltipView.NibDirection nibDirection, float f, Set<String> boundaryViewTags, String str) {
            Intrinsics.checkNotNullParameter(boundaryViewTags, "boundaryViewTags");
            this.nibDirection = nibDirection;
            this.offsetY = f;
            this.boundaryViewTags = boundaryViewTags;
            this.canvasTag = str;
        }

        public final RdsTooltipView.NibDirection getNibDirection() {
            return this.nibDirection;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        public /* synthetic */ Layout(RdsTooltipView.NibDirection nibDirection, float f, Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nibDirection, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : str);
        }

        public final Set<String> getBoundaryViewTags() {
            return this.boundaryViewTags;
        }

        public final String getCanvasTag() {
            return this.canvasTag;
        }
    }

    /* compiled from: TooltipData.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013BI\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#Jr\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\t\u0010\u001cR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData$Behavior;", "", "priority", "", "onClick", "Lkotlin/Function0;", "", "shownPref", "Lcom/robinhood/prefs/BooleanPreference;", "isActive", "", "onAppear", "Lkotlin/Function1;", "Landroid/view/View;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle;", "displayTime", "", "<init>", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/robinhood/prefs/BooleanPreference;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/Lifecycle;Ljava/lang/Long;)V", "(Ljava/lang/Boolean;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getShownPref", "()Lcom/robinhood/prefs/BooleanPreference;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnAppear", "()Lkotlin/jvm/functions/Function1;", "getLifecycleOwner", "()Landroidx/lifecycle/Lifecycle;", "getDisplayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/robinhood/prefs/BooleanPreference;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/Lifecycle;Ljava/lang/Long;)Lcom/robinhood/tooltips/TooltipData$Behavior;", "equals", "other", "hashCode", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Behavior {
        public static final int $stable = 8;
        private final Long displayTime;
        private final Boolean isActive;
        private final Lifecycle lifecycleOwner;
        private final Function1<View, Unit> onAppear;
        private final Function0<Unit> onClick;
        private final Integer priority;
        private final BooleanPreference shownPref;

        public Behavior() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public static /* synthetic */ Behavior copy$default(Behavior behavior, Integer num, Function0 function0, BooleanPreference booleanPreference, Boolean bool, Function1 function1, Lifecycle lifecycle, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                num = behavior.priority;
            }
            if ((i & 2) != 0) {
                function0 = behavior.onClick;
            }
            if ((i & 4) != 0) {
                booleanPreference = behavior.shownPref;
            }
            if ((i & 8) != 0) {
                bool = behavior.isActive;
            }
            if ((i & 16) != 0) {
                function1 = behavior.onAppear;
            }
            if ((i & 32) != 0) {
                lifecycle = behavior.lifecycleOwner;
            }
            if ((i & 64) != 0) {
                l = behavior.displayTime;
            }
            Lifecycle lifecycle2 = lifecycle;
            Long l2 = l;
            Function1 function12 = function1;
            BooleanPreference booleanPreference2 = booleanPreference;
            return behavior.copy(num, function0, booleanPreference2, bool, function12, lifecycle2, l2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        public final Function0<Unit> component2() {
            return this.onClick;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanPreference getShownPref() {
            return this.shownPref;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsActive() {
            return this.isActive;
        }

        public final Function1<View, Unit> component5() {
            return this.onAppear;
        }

        /* renamed from: component6, reason: from getter */
        public final Lifecycle getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getDisplayTime() {
            return this.displayTime;
        }

        public final Behavior copy(Integer priority, Function0<Unit> onClick, BooleanPreference shownPref, Boolean isActive, Function1<? super View, Unit> onAppear, Lifecycle lifecycleOwner, Long displayTime) {
            Intrinsics.checkNotNullParameter(onAppear, "onAppear");
            return new Behavior(priority, onClick, shownPref, isActive, onAppear, lifecycleOwner, displayTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Behavior)) {
                return false;
            }
            Behavior behavior = (Behavior) other;
            return Intrinsics.areEqual(this.priority, behavior.priority) && Intrinsics.areEqual(this.onClick, behavior.onClick) && Intrinsics.areEqual(this.shownPref, behavior.shownPref) && Intrinsics.areEqual(this.isActive, behavior.isActive) && Intrinsics.areEqual(this.onAppear, behavior.onAppear) && Intrinsics.areEqual(this.lifecycleOwner, behavior.lifecycleOwner) && Intrinsics.areEqual(this.displayTime, behavior.displayTime);
        }

        public int hashCode() {
            Integer num = this.priority;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Function0<Unit> function0 = this.onClick;
            int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
            BooleanPreference booleanPreference = this.shownPref;
            int iHashCode3 = (iHashCode2 + (booleanPreference == null ? 0 : booleanPreference.hashCode())) * 31;
            Boolean bool = this.isActive;
            int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.onAppear.hashCode()) * 31;
            Lifecycle lifecycle = this.lifecycleOwner;
            int iHashCode5 = (iHashCode4 + (lifecycle == null ? 0 : lifecycle.hashCode())) * 31;
            Long l = this.displayTime;
            return iHashCode5 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            return "Behavior(priority=" + this.priority + ", onClick=" + this.onClick + ", shownPref=" + this.shownPref + ", isActive=" + this.isActive + ", onAppear=" + this.onAppear + ", lifecycleOwner=" + this.lifecycleOwner + ", displayTime=" + this.displayTime + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Behavior(Integer num, Function0<Unit> function0, BooleanPreference booleanPreference, Boolean bool, Function1<? super View, Unit> onAppear, Lifecycle lifecycle, Long l) {
            Intrinsics.checkNotNullParameter(onAppear, "onAppear");
            this.priority = num;
            this.onClick = function0;
            this.shownPref = booleanPreference;
            this.isActive = bool;
            this.onAppear = onAppear;
            this.lifecycleOwner = lifecycle;
            this.displayTime = l;
        }

        public final Integer getPriority() {
            return this.priority;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final BooleanPreference getShownPref() {
            return this.shownPref;
        }

        public final Boolean isActive() {
            return this.isActive;
        }

        public /* synthetic */ Behavior(Integer num, Function0 function0, BooleanPreference booleanPreference, Boolean bool, Function1 function1, Lifecycle lifecycle, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : booleanPreference, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? new Function1() { // from class: com.robinhood.tooltips.TooltipData$Behavior$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipData.Behavior._init_$lambda$0((View) obj);
                }
            } : function1, (i & 32) != 0 ? null : lifecycle, (i & 64) != 0 ? null : l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public final Function1<View, Unit> getOnAppear() {
            return this.onAppear;
        }

        public final Lifecycle getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final Long getDisplayTime() {
            return this.displayTime;
        }

        public /* synthetic */ Behavior(Boolean bool, Long l, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? new Function1() { // from class: com.robinhood.tooltips.TooltipData$Behavior$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipData.Behavior._init_$lambda$1((View) obj);
                }
            } : function1, (i & 8) != 0 ? null : function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Behavior(Boolean bool, Long l, Function1<? super View, Unit> onAppear, Function0<Unit> function0) {
            this(null, function0, null, bool, onAppear, null, l, 33, null);
            Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        }
    }

    /* compiled from: TooltipData.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData$Dimensions;", "", "height", "", "width", "<init>", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dimensions {
        public static final int $stable = 0;
        private final int height;
        private final int width;

        public static /* synthetic */ Dimensions copy$default(Dimensions dimensions, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = dimensions.height;
            }
            if ((i3 & 2) != 0) {
                i2 = dimensions.width;
            }
            return dimensions.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public final Dimensions copy(int height, int width) {
            return new Dimensions(height, width);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dimensions)) {
                return false;
            }
            Dimensions dimensions = (Dimensions) other;
            return this.height == dimensions.height && this.width == dimensions.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
        }

        public String toString() {
            return "Dimensions(height=" + this.height + ", width=" + this.width + ")";
        }

        public Dimensions(int i, int i2) {
            this.height = i;
            this.width = i2;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    /* compiled from: TooltipData.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipData$Coordinates;", "", "x", "", "y", "<init>", "(FF)V", "", "(II)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Coordinates {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = coordinates.x;
            }
            if ((i & 2) != 0) {
                f2 = coordinates.y;
            }
            return coordinates.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final Coordinates copy(float x, float y) {
            return new Coordinates(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coordinates)) {
                return false;
            }
            Coordinates coordinates = (Coordinates) other;
            return Float.compare(this.x, coordinates.x) == 0 && Float.compare(this.y, coordinates.y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public String toString() {
            return "Coordinates(x=" + this.x + ", y=" + this.y + ")";
        }

        public Coordinates(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public Coordinates(int i, int i2) {
            this(i, i2);
        }
    }
}
