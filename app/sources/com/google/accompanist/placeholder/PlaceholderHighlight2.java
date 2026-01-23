package com.google.accompanist.placeholder;

import androidx.compose.animation.core.InfiniteRepeatableSpec;
import com.google.accompanist.placeholder.PlaceholderHighlight;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaceholderHighlight.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/google/accompanist/placeholder/PlaceholderHighlight$Companion;", "Landroidx/compose/ui/graphics/Color;", "highlightColor", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "", "animationSpec", "progressForMaxAlpha", "Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "shimmer-RPmYEkk", "(Lcom/google/accompanist/placeholder/PlaceholderHighlight$Companion;JLandroidx/compose/animation/core/InfiniteRepeatableSpec;F)Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "shimmer", "placeholder_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.accompanist.placeholder.PlaceholderHighlightKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class PlaceholderHighlight2 {
    /* renamed from: shimmer-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ PlaceholderHighlight m9206shimmerRPmYEkk$default(PlaceholderHighlight.Companion companion, long j, InfiniteRepeatableSpec infiniteRepeatableSpec, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            infiniteRepeatableSpec = PlaceholderDefaults.INSTANCE.getShimmerAnimationSpec();
        }
        if ((i & 4) != 0) {
            f = 0.6f;
        }
        return m9205shimmerRPmYEkk(companion, j, infiniteRepeatableSpec, f);
    }

    @Deprecated
    /* renamed from: shimmer-RPmYEkk, reason: not valid java name */
    public static final PlaceholderHighlight m9205shimmerRPmYEkk(PlaceholderHighlight.Companion shimmer, long j, InfiniteRepeatableSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(shimmer, "$this$shimmer");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Shimmer(j, animationSpec, f, null);
    }
}
