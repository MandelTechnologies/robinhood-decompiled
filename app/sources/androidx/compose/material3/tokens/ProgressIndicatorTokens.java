package androidx.compose.material3.tokens;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgressIndicatorTokens.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001d\u0010\u001f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u001d\u0010!\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m3636d2 = {"Landroidx/compose/material3/tokens/ProgressIndicatorTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/ui/unit/Dp;", "ActiveThickness", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveTrackSpace", "getActiveTrackSpace-D9Ej5fM", "StopColor", "getStopColor", "StopShape", "getStopShape-D9Ej5fM", "StopSize", "getStopSize-D9Ej5fM", "TrackColor", "getTrackColor", "TrackShape", "getTrackShape", "TrackThickness", "getTrackThickness-D9Ej5fM", "Size", "getSize-D9Ej5fM", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveShape;
    private static final float ActiveThickness;
    private static final float ActiveTrackSpace;
    public static final ProgressIndicatorTokens INSTANCE = new ProgressIndicatorTokens();
    private static final float Size;
    private static final ColorSchemeKeyTokens StopColor;
    private static final float StopShape;
    private static final float StopSize;
    private static final ColorSchemeKeyTokens TrackColor;
    private static final ShapeKeyTokens TrackShape;
    private static final float TrackThickness;

    private ProgressIndicatorTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveShape = shapeKeyTokens;
        float f = (float) 4.0d;
        ActiveThickness = C2002Dp.m7995constructorimpl(f);
        ActiveTrackSpace = C2002Dp.m7995constructorimpl(f);
        StopColor = colorSchemeKeyTokens;
        StopShape = C2002Dp.m7995constructorimpl(f);
        StopSize = C2002Dp.m7995constructorimpl(f);
        TrackColor = ColorSchemeKeyTokens.SecondaryContainer;
        TrackShape = shapeKeyTokens;
        TrackThickness = C2002Dp.m7995constructorimpl(f);
        Size = C2002Dp.m7995constructorimpl((float) 48.0d);
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveTrackSpace-D9Ej5fM, reason: not valid java name */
    public final float m6278getActiveTrackSpaceD9Ej5fM() {
        return ActiveTrackSpace;
    }

    /* renamed from: getStopSize-D9Ej5fM, reason: not valid java name */
    public final float m6280getStopSizeD9Ej5fM() {
        return StopSize;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    /* renamed from: getTrackThickness-D9Ej5fM, reason: not valid java name */
    public final float m6281getTrackThicknessD9Ej5fM() {
        return TrackThickness;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m6279getSizeD9Ej5fM() {
        return Size;
    }
}
