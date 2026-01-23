package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionItemState;", "", "Loading", "Loaded", "Lcom/robinhood/android/common/portfolio/position/PositionItemState$Loaded;", "Lcom/robinhood/android/common/portfolio/position/PositionItemState$Loading;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface PositionItemState {

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionItemState$Loading;", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements PositionItemState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -548362669;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionItemState$Loaded;", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/PositionDetails;", "swipingBehaviors", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionSwipeBehavior;", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "swipeTooltip", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionDetails;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lcom/robinhood/utils/resource/StringResource;)V", "getDetails", "()Lcom/robinhood/android/models/portfolio/PositionDetails;", "getSwipingBehaviors", "()Lkotlinx/collections/immutable/ImmutableList;", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "getSwipeTooltip", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements PositionItemState {
        public static final int $stable = 8;
        private final PositionDetails details;
        private final SwipeAnimationPreview swipeAnimationPreview;
        private final StringResource swipeTooltip;
        private final ImmutableList<PositionSwipeBehavior> swipingBehaviors;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, PositionDetails positionDetails, ImmutableList immutableList, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                positionDetails = loaded.details;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.swipingBehaviors;
            }
            if ((i & 4) != 0) {
                swipeAnimationPreview = loaded.swipeAnimationPreview;
            }
            if ((i & 8) != 0) {
                stringResource = loaded.swipeTooltip;
            }
            return loaded.copy(positionDetails, immutableList, swipeAnimationPreview, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionDetails getDetails() {
            return this.details;
        }

        public final ImmutableList<PositionSwipeBehavior> component2() {
            return this.swipingBehaviors;
        }

        /* renamed from: component3, reason: from getter */
        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }

        public final Loaded copy(PositionDetails details, ImmutableList<PositionSwipeBehavior> swipingBehaviors, SwipeAnimationPreview swipeAnimationPreview, StringResource swipeTooltip) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(swipingBehaviors, "swipingBehaviors");
            return new Loaded(details, swipingBehaviors, swipeAnimationPreview, swipeTooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.details, loaded.details) && Intrinsics.areEqual(this.swipingBehaviors, loaded.swipingBehaviors) && Intrinsics.areEqual(this.swipeAnimationPreview, loaded.swipeAnimationPreview) && Intrinsics.areEqual(this.swipeTooltip, loaded.swipeTooltip);
        }

        public int hashCode() {
            int iHashCode = ((this.details.hashCode() * 31) + this.swipingBehaviors.hashCode()) * 31;
            SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
            int iHashCode2 = (iHashCode + (swipeAnimationPreview == null ? 0 : swipeAnimationPreview.hashCode())) * 31;
            StringResource stringResource = this.swipeTooltip;
            return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(details=" + this.details + ", swipingBehaviors=" + this.swipingBehaviors + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ", swipeTooltip=" + this.swipeTooltip + ")";
        }

        public Loaded(PositionDetails details, ImmutableList<PositionSwipeBehavior> swipingBehaviors, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(swipingBehaviors, "swipingBehaviors");
            this.details = details;
            this.swipingBehaviors = swipingBehaviors;
            this.swipeAnimationPreview = swipeAnimationPreview;
            this.swipeTooltip = stringResource;
        }

        public final PositionDetails getDetails() {
            return this.details;
        }

        public final ImmutableList<PositionSwipeBehavior> getSwipingBehaviors() {
            return this.swipingBehaviors;
        }

        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }
    }
}
