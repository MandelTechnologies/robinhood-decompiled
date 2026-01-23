package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShapeTokens.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, m3636d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLarge", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLargeTop", "getCornerExtraLargeTop", "CornerExtraSmall", "getCornerExtraSmall", "CornerExtraSmallTop", "getCornerExtraSmallTop", "CornerFull", "getCornerFull", "CornerLarge", "getCornerLarge", "CornerLargeEnd", "getCornerLargeEnd", "CornerLargeTop", "getCornerLargeTop", "CornerMedium", "getCornerMedium", "Landroidx/compose/ui/graphics/Shape;", "CornerNone", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerSmall", "getCornerSmall", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShapeTokens {
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    public static final ShapeTokens INSTANCE = new ShapeTokens();
    private static final RoundedCornerShape CornerFull = RoundedCornerShape2.getCircleShape();
    private static final RoundedCornerShape CornerMedium = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl((float) 12.0d));
    private static final Shape CornerNone = RectangleShape2.getRectangleShape();
    private static final RoundedCornerShape CornerSmall = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl((float) 8.0d));

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }

    static {
        float f = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f));
        float f2 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2));
        float f3 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f3));
        CornerExtraSmallTop = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2));
        float f4 = (float) 16.0d;
        CornerLarge = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f4));
        CornerLargeEnd = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f2));
        CornerLargeTop = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2));
    }
}
