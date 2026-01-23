package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoPog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", "", "<init>", "()V", "BrushOverride", "ColorOverride", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride$BrushOverride;", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride$ColorOverride;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class BentoPogBackgroundOverride {
    public static final int $stable = 0;

    public /* synthetic */ BentoPogBackgroundOverride(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BentoPogBackgroundOverride() {
    }

    /* compiled from: BentoPog.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride$BrushOverride;", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", "brush", "Landroidx/compose/ui/graphics/Brush;", "<init>", "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrushOverride extends BentoPogBackgroundOverride {
        public static final int $stable = 0;
        private final Brush brush;

        public static /* synthetic */ BrushOverride copy$default(BrushOverride brushOverride, Brush brush, int i, Object obj) {
            if ((i & 1) != 0) {
                brush = brushOverride.brush;
            }
            return brushOverride.copy(brush);
        }

        /* renamed from: component1, reason: from getter */
        public final Brush getBrush() {
            return this.brush;
        }

        public final BrushOverride copy(Brush brush) {
            Intrinsics.checkNotNullParameter(brush, "brush");
            return new BrushOverride(brush);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrushOverride) && Intrinsics.areEqual(this.brush, ((BrushOverride) other).brush);
        }

        public int hashCode() {
            return this.brush.hashCode();
        }

        public String toString() {
            return "BrushOverride(brush=" + this.brush + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrushOverride(Brush brush) {
            super(null);
            Intrinsics.checkNotNullParameter(brush, "brush");
            this.brush = brush;
        }

        public final Brush getBrush() {
            return this.brush;
        }
    }

    /* compiled from: BentoPog.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride$ColorOverride;", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride$ColorOverride;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ColorOverride extends BentoPogBackgroundOverride {
        public static final int $stable = 0;
        private final long color;

        public /* synthetic */ ColorOverride(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ ColorOverride m20657copy8_81llA$default(ColorOverride colorOverride, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colorOverride.color;
            }
            return colorOverride.m20659copy8_81llA(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final ColorOverride m20659copy8_81llA(long color) {
            return new ColorOverride(color, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ColorOverride) && Color.m6707equalsimpl0(this.color, ((ColorOverride) other).color);
        }

        public int hashCode() {
            return Color.m6713hashCodeimpl(this.color);
        }

        public String toString() {
            return "ColorOverride(color=" + Color.m6714toStringimpl(this.color) + ")";
        }

        private ColorOverride(long j) {
            super(null);
            this.color = j;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m20660getColor0d7_KjU() {
            return this.color;
        }
    }
}
