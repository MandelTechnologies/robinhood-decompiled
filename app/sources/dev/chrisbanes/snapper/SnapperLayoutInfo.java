package dev.chrisbanes.snapper;

import androidx.compose.animation.core.DecayAnimationSpec;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: SnapperFlingBehavior.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "", "<init>", "()V", "", "velocity", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "maximumFlingDistance", "", "determineTargetIndex", "(FLandroidx/compose/animation/core/DecayAnimationSpec;F)I", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "distanceToIndexSnap", "(I)I", "", "canScrollTowardsStart", "()Z", "canScrollTowardsEnd", "getStartScrollOffset", "()I", "startScrollOffset", "getEndScrollOffset", "endScrollOffset", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "getCurrentItem", "()Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "currentItem", "getTotalItemsCount", "totalItemsCount", "lib_release"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class SnapperLayoutInfo {
    public abstract boolean canScrollTowardsEnd();

    public abstract boolean canScrollTowardsStart();

    public abstract int determineTargetIndex(float velocity, DecayAnimationSpec<Float> decayAnimationSpec, float maximumFlingDistance);

    public abstract int distanceToIndexSnap(int index);

    public abstract SnapperLayoutItemInfo getCurrentItem();

    public abstract int getEndScrollOffset();

    public abstract int getStartScrollOffset();

    public abstract int getTotalItemsCount();
}
