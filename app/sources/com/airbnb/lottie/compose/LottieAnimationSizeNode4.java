package com.airbnb.lottie.compose;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LottieAnimationSizeNode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "width", "height", "lottieSize", "(Landroidx/compose/ui/Modifier;II)Landroidx/compose/ui/Modifier;", "lottie-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.airbnb.lottie.compose.LottieAnimationSizeNodeKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class LottieAnimationSizeNode4 {
    public static final Modifier lottieSize(Modifier modifier, int i, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new LottieAnimationSizeElement(i, i2));
    }
}
