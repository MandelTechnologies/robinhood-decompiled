package com.airbnb.lottie.compose;

import androidx.compose.runtime.SnapshotState4;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;

/* compiled from: LottieAnimationState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005¨\u0006\u001c"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationState;", "Landroidx/compose/runtime/State;", "", "", "isPlaying", "()Z", "getProgress", "()F", "progress", "", "getIteration", "()I", "iteration", "getIterations", "iterations", "getReverseOnRepeat", "reverseOnRepeat", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getSpeed", "speed", "Lcom/airbnb/lottie/LottieComposition;", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "composition", "isAtEnd", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface LottieAnimationState extends SnapshotState4<Float> {
    LottieClipSpec getClipSpec();

    LottieComposition getComposition();

    int getIteration();

    int getIterations();

    float getProgress();

    boolean getReverseOnRepeat();

    float getSpeed();

    boolean isAtEnd();

    boolean isPlaying();
}
