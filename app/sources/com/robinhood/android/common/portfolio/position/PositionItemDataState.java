package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;", "", "positionDetails", "Lcom/robinhood/android/models/portfolio/PositionDetails;", "allowPositionSwipeBehaviors", "", "listItemSwipingBehaviors", "", "Lcom/robinhood/android/models/portfolio/PositionSwipeBehavior;", "usePositionDetailSwipingBehaviors", "swipeTooltip", "Lcom/robinhood/utils/resource/StringResource;", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionDetails;ZLjava/util/List;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;)V", "getPositionDetails", "()Lcom/robinhood/android/models/portfolio/PositionDetails;", "getAllowPositionSwipeBehaviors", "()Z", "getListItemSwipingBehaviors", "()Ljava/util/List;", "getUsePositionDetailSwipingBehaviors", "getSwipeTooltip", "()Lcom/robinhood/utils/resource/StringResource;", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PositionItemDataState {
    public static final int $stable = 8;
    private final boolean allowPositionSwipeBehaviors;
    private final List<PositionSwipeBehavior> listItemSwipingBehaviors;
    private final PositionDetails positionDetails;
    private final SwipeAnimationPreview swipeAnimationPreview;
    private final StringResource swipeTooltip;
    private final boolean usePositionDetailSwipingBehaviors;

    public PositionItemDataState() {
        this(null, false, null, false, null, null, 63, null);
    }

    public static /* synthetic */ PositionItemDataState copy$default(PositionItemDataState positionItemDataState, PositionDetails positionDetails, boolean z, List list, boolean z2, StringResource stringResource, SwipeAnimationPreview swipeAnimationPreview, int i, Object obj) {
        if ((i & 1) != 0) {
            positionDetails = positionItemDataState.positionDetails;
        }
        if ((i & 2) != 0) {
            z = positionItemDataState.allowPositionSwipeBehaviors;
        }
        if ((i & 4) != 0) {
            list = positionItemDataState.listItemSwipingBehaviors;
        }
        if ((i & 8) != 0) {
            z2 = positionItemDataState.usePositionDetailSwipingBehaviors;
        }
        if ((i & 16) != 0) {
            stringResource = positionItemDataState.swipeTooltip;
        }
        if ((i & 32) != 0) {
            swipeAnimationPreview = positionItemDataState.swipeAnimationPreview;
        }
        StringResource stringResource2 = stringResource;
        SwipeAnimationPreview swipeAnimationPreview2 = swipeAnimationPreview;
        return positionItemDataState.copy(positionDetails, z, list, z2, stringResource2, swipeAnimationPreview2);
    }

    /* renamed from: component1, reason: from getter */
    public final PositionDetails getPositionDetails() {
        return this.positionDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowPositionSwipeBehaviors() {
        return this.allowPositionSwipeBehaviors;
    }

    public final List<PositionSwipeBehavior> component3() {
        return this.listItemSwipingBehaviors;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUsePositionDetailSwipingBehaviors() {
        return this.usePositionDetailSwipingBehaviors;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSwipeTooltip() {
        return this.swipeTooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final SwipeAnimationPreview getSwipeAnimationPreview() {
        return this.swipeAnimationPreview;
    }

    public final PositionItemDataState copy(PositionDetails positionDetails, boolean allowPositionSwipeBehaviors, List<PositionSwipeBehavior> listItemSwipingBehaviors, boolean usePositionDetailSwipingBehaviors, StringResource swipeTooltip, SwipeAnimationPreview swipeAnimationPreview) {
        return new PositionItemDataState(positionDetails, allowPositionSwipeBehaviors, listItemSwipingBehaviors, usePositionDetailSwipingBehaviors, swipeTooltip, swipeAnimationPreview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionItemDataState)) {
            return false;
        }
        PositionItemDataState positionItemDataState = (PositionItemDataState) other;
        return Intrinsics.areEqual(this.positionDetails, positionItemDataState.positionDetails) && this.allowPositionSwipeBehaviors == positionItemDataState.allowPositionSwipeBehaviors && Intrinsics.areEqual(this.listItemSwipingBehaviors, positionItemDataState.listItemSwipingBehaviors) && this.usePositionDetailSwipingBehaviors == positionItemDataState.usePositionDetailSwipingBehaviors && Intrinsics.areEqual(this.swipeTooltip, positionItemDataState.swipeTooltip) && Intrinsics.areEqual(this.swipeAnimationPreview, positionItemDataState.swipeAnimationPreview);
    }

    public int hashCode() {
        PositionDetails positionDetails = this.positionDetails;
        int iHashCode = (((positionDetails == null ? 0 : positionDetails.hashCode()) * 31) + Boolean.hashCode(this.allowPositionSwipeBehaviors)) * 31;
        List<PositionSwipeBehavior> list = this.listItemSwipingBehaviors;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.usePositionDetailSwipingBehaviors)) * 31;
        StringResource stringResource = this.swipeTooltip;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
        return iHashCode3 + (swipeAnimationPreview != null ? swipeAnimationPreview.hashCode() : 0);
    }

    public String toString() {
        return "PositionItemDataState(positionDetails=" + this.positionDetails + ", allowPositionSwipeBehaviors=" + this.allowPositionSwipeBehaviors + ", listItemSwipingBehaviors=" + this.listItemSwipingBehaviors + ", usePositionDetailSwipingBehaviors=" + this.usePositionDetailSwipingBehaviors + ", swipeTooltip=" + this.swipeTooltip + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ")";
    }

    public PositionItemDataState(PositionDetails positionDetails, boolean z, List<PositionSwipeBehavior> list, boolean z2, StringResource stringResource, SwipeAnimationPreview swipeAnimationPreview) {
        this.positionDetails = positionDetails;
        this.allowPositionSwipeBehaviors = z;
        this.listItemSwipingBehaviors = list;
        this.usePositionDetailSwipingBehaviors = z2;
        this.swipeTooltip = stringResource;
        this.swipeAnimationPreview = swipeAnimationPreview;
    }

    public /* synthetic */ PositionItemDataState(PositionDetails positionDetails, boolean z, List list, boolean z2, StringResource stringResource, SwipeAnimationPreview swipeAnimationPreview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : positionDetails, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : stringResource, (i & 32) != 0 ? null : swipeAnimationPreview);
    }

    public final PositionDetails getPositionDetails() {
        return this.positionDetails;
    }

    public final boolean getAllowPositionSwipeBehaviors() {
        return this.allowPositionSwipeBehaviors;
    }

    public final List<PositionSwipeBehavior> getListItemSwipingBehaviors() {
        return this.listItemSwipingBehaviors;
    }

    public final boolean getUsePositionDetailSwipingBehaviors() {
        return this.usePositionDetailSwipingBehaviors;
    }

    public final StringResource getSwipeTooltip() {
        return this.swipeTooltip;
    }

    public final SwipeAnimationPreview getSwipeAnimationPreview() {
        return this.swipeAnimationPreview;
    }
}
