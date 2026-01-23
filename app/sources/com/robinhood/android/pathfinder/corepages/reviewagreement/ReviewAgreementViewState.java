package com.robinhood.android.pathfinder.corepages.reviewagreement;

import com.robinhood.models.p355ui.pathfinder.contexts.ReviewAgreementContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementViewState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/ReviewAgreementContext;", "sendingInput", "", "agreementState", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/AgreementState;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/ReviewAgreementContext;ZLcom/robinhood/android/pathfinder/corepages/reviewagreement/AgreementState;)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/ReviewAgreementContext;", "getSendingInput", "()Z", "getAgreementState", "()Lcom/robinhood/android/pathfinder/corepages/reviewagreement/AgreementState;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewAgreementViewState {
    public static final int $stable = 8;
    private final ReviewAgreementViewState2 agreementState;
    private final ReviewAgreementContext context;
    private final boolean sendingInput;

    public static /* synthetic */ ReviewAgreementViewState copy$default(ReviewAgreementViewState reviewAgreementViewState, ReviewAgreementContext reviewAgreementContext, boolean z, ReviewAgreementViewState2 reviewAgreementViewState2, int i, Object obj) {
        if ((i & 1) != 0) {
            reviewAgreementContext = reviewAgreementViewState.context;
        }
        if ((i & 2) != 0) {
            z = reviewAgreementViewState.sendingInput;
        }
        if ((i & 4) != 0) {
            reviewAgreementViewState2 = reviewAgreementViewState.agreementState;
        }
        return reviewAgreementViewState.copy(reviewAgreementContext, z, reviewAgreementViewState2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReviewAgreementContext getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    /* renamed from: component3, reason: from getter */
    public final ReviewAgreementViewState2 getAgreementState() {
        return this.agreementState;
    }

    public final ReviewAgreementViewState copy(ReviewAgreementContext context, boolean sendingInput, ReviewAgreementViewState2 agreementState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(agreementState, "agreementState");
        return new ReviewAgreementViewState(context, sendingInput, agreementState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewAgreementViewState)) {
            return false;
        }
        ReviewAgreementViewState reviewAgreementViewState = (ReviewAgreementViewState) other;
        return Intrinsics.areEqual(this.context, reviewAgreementViewState.context) && this.sendingInput == reviewAgreementViewState.sendingInput && this.agreementState == reviewAgreementViewState.agreementState;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + Boolean.hashCode(this.sendingInput)) * 31) + this.agreementState.hashCode();
    }

    public String toString() {
        return "ReviewAgreementViewState(context=" + this.context + ", sendingInput=" + this.sendingInput + ", agreementState=" + this.agreementState + ")";
    }

    public ReviewAgreementViewState(ReviewAgreementContext context, boolean z, ReviewAgreementViewState2 agreementState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(agreementState, "agreementState");
        this.context = context;
        this.sendingInput = z;
        this.agreementState = agreementState;
    }

    public final ReviewAgreementContext getContext() {
        return this.context;
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public /* synthetic */ ReviewAgreementViewState(ReviewAgreementContext reviewAgreementContext, boolean z, ReviewAgreementViewState2 reviewAgreementViewState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reviewAgreementContext, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ReviewAgreementViewState2.REVIEWING : reviewAgreementViewState2);
    }

    public final ReviewAgreementViewState2 getAgreementState() {
        return this.agreementState;
    }
}
