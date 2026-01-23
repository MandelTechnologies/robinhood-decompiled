package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.models.portfolio.PositionsV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0017\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionRowState;", "", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "displayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/PositionDetails;", "swipingBehaviors", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionSwipeBehavior;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/PositionDetails;Lkotlinx/collections/immutable/ImmutableList;)V", "getPosition", "()Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "getDisplayType", "()Ljava/lang/String;", "getDetails", "()Lcom/robinhood/android/models/portfolio/PositionDetails;", "getSwipingBehaviors", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PositionRowState {
    public static final int $stable = 8;
    private final PositionDetails details;
    private final String displayType;
    private final PositionsV2.PositionListItemV2 position;
    private final ImmutableList<PositionSwipeBehavior> swipingBehaviors;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositionRowState copy$default(PositionRowState positionRowState, PositionsV2.PositionListItemV2 positionListItemV2, String str, PositionDetails positionDetails, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            positionListItemV2 = positionRowState.position;
        }
        if ((i & 2) != 0) {
            str = positionRowState.displayType;
        }
        if ((i & 4) != 0) {
            positionDetails = positionRowState.details;
        }
        if ((i & 8) != 0) {
            immutableList = positionRowState.swipingBehaviors;
        }
        return positionRowState.copy(positionListItemV2, str, positionDetails, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final PositionsV2.PositionListItemV2 getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionDetails getDetails() {
        return this.details;
    }

    public final ImmutableList<PositionSwipeBehavior> component4() {
        return this.swipingBehaviors;
    }

    public final PositionRowState copy(PositionsV2.PositionListItemV2 position, String displayType, PositionDetails details, ImmutableList<PositionSwipeBehavior> swipingBehaviors) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(swipingBehaviors, "swipingBehaviors");
        return new PositionRowState(position, displayType, details, swipingBehaviors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionRowState)) {
            return false;
        }
        PositionRowState positionRowState = (PositionRowState) other;
        return Intrinsics.areEqual(this.position, positionRowState.position) && Intrinsics.areEqual(this.displayType, positionRowState.displayType) && Intrinsics.areEqual(this.details, positionRowState.details) && Intrinsics.areEqual(this.swipingBehaviors, positionRowState.swipingBehaviors);
    }

    public int hashCode() {
        return (((((this.position.hashCode() * 31) + this.displayType.hashCode()) * 31) + this.details.hashCode()) * 31) + this.swipingBehaviors.hashCode();
    }

    public String toString() {
        return "PositionRowState(position=" + this.position + ", displayType=" + this.displayType + ", details=" + this.details + ", swipingBehaviors=" + this.swipingBehaviors + ")";
    }

    public PositionRowState(PositionsV2.PositionListItemV2 position, String displayType, PositionDetails details, ImmutableList<PositionSwipeBehavior> swipingBehaviors) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(swipingBehaviors, "swipingBehaviors");
        this.position = position;
        this.displayType = displayType;
        this.details = details;
        this.swipingBehaviors = swipingBehaviors;
    }

    public final PositionsV2.PositionListItemV2 getPosition() {
        return this.position;
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final PositionDetails getDetails() {
        return this.details;
    }

    public final ImmutableList<PositionSwipeBehavior> getSwipingBehaviors() {
        return this.swipingBehaviors;
    }
}
