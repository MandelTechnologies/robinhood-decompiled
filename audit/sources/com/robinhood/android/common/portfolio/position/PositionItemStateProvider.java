package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.common.portfolio.position.PositionItemState;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.udf.StateProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionItemStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;", "<init>", "()V", "reduce", "dataState", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PositionItemStateProvider implements StateProvider<PositionItemDataState, PositionItemState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PositionItemState reduce(PositionItemDataState dataState) {
        ImmutableList immutableListPersistentListOf;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getPositionDetails() != null) {
            List<PositionSwipeBehavior> swipingBehaviors = dataState.getPositionDetails().getSwipingBehaviors();
            List<PositionSwipeBehavior> list = swipingBehaviors;
            if (list == null || list.isEmpty() || !dataState.getUsePositionDetailSwipingBehaviors()) {
                swipingBehaviors = null;
            }
            if (swipingBehaviors == null) {
                swipingBehaviors = dataState.getListItemSwipingBehaviors();
            }
            if (swipingBehaviors != null && (immutableListPersistentListOf = extensions2.toImmutableList(swipingBehaviors)) != null) {
                if (!dataState.getAllowPositionSwipeBehaviors()) {
                    immutableListPersistentListOf = null;
                }
                if (immutableListPersistentListOf == null) {
                }
            } else {
                immutableListPersistentListOf = extensions2.persistentListOf();
            }
            PositionDetails positionDetails = dataState.getPositionDetails();
            SwipeAnimationPreview swipeAnimationPreview = dataState.getSwipeAnimationPreview();
            if (immutableListPersistentListOf.isEmpty()) {
                swipeAnimationPreview = null;
            }
            return new PositionItemState.Loaded(positionDetails, immutableListPersistentListOf, swipeAnimationPreview, immutableListPersistentListOf.isEmpty() ? null : dataState.getSwipeTooltip());
        }
        return PositionItemState.Loading.INSTANCE;
    }
}
