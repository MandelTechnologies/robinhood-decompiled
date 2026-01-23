package com.robinhood.android.creditcard.p091ui.post.signup;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;", "", "screen", "Lcom/robinhood/android/creditcard/ui/post/signup/Screen;", "loading", "", "referralsBlocked", "inBlockGoldFlowExperiment", "hasInvite", "goldSubscriptionState", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "user", "Lcom/robinhood/models/db/sheriff/User;", "<init>", "(Lcom/robinhood/android/creditcard/ui/post/signup/Screen;ZZZZLcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;Lcom/robinhood/models/db/sheriff/User;)V", "getScreen", "()Lcom/robinhood/android/creditcard/ui/post/signup/Screen;", "getLoading", "()Z", "getReferralsBlocked", "getInBlockGoldFlowExperiment", "getHasInvite", "getGoldSubscriptionState", "()Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PostSignUpAddToWaitlistState {
    public static final int $stable = 8;
    private final GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState;
    private final boolean hasInvite;
    private final boolean inBlockGoldFlowExperiment;
    private final boolean loading;
    private final boolean referralsBlocked;
    private final PostSignUpAddToWaitlistDuxo9 screen;
    private final User user;

    public PostSignUpAddToWaitlistState() {
        this(null, false, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ PostSignUpAddToWaitlistState copy$default(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, PostSignUpAddToWaitlistDuxo9 postSignUpAddToWaitlistDuxo9, boolean z, boolean z2, boolean z3, boolean z4, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            postSignUpAddToWaitlistDuxo9 = postSignUpAddToWaitlistState.screen;
        }
        if ((i & 2) != 0) {
            z = postSignUpAddToWaitlistState.loading;
        }
        if ((i & 4) != 0) {
            z2 = postSignUpAddToWaitlistState.referralsBlocked;
        }
        if ((i & 8) != 0) {
            z3 = postSignUpAddToWaitlistState.inBlockGoldFlowExperiment;
        }
        if ((i & 16) != 0) {
            z4 = postSignUpAddToWaitlistState.hasInvite;
        }
        if ((i & 32) != 0) {
            goldSubscriptionState = postSignUpAddToWaitlistState.goldSubscriptionState;
        }
        if ((i & 64) != 0) {
            user = postSignUpAddToWaitlistState.user;
        }
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState2 = goldSubscriptionState;
        User user2 = user;
        boolean z5 = z4;
        boolean z6 = z2;
        return postSignUpAddToWaitlistState.copy(postSignUpAddToWaitlistDuxo9, z, z6, z3, z5, goldSubscriptionState2, user2);
    }

    /* renamed from: component1, reason: from getter */
    public final PostSignUpAddToWaitlistDuxo9 getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getReferralsBlocked() {
        return this.referralsBlocked;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInBlockGoldFlowExperiment() {
        return this.inBlockGoldFlowExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasInvite() {
        return this.hasInvite;
    }

    /* renamed from: component6, reason: from getter */
    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    /* renamed from: component7, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final PostSignUpAddToWaitlistState copy(PostSignUpAddToWaitlistDuxo9 screen, boolean loading, boolean referralsBlocked, boolean inBlockGoldFlowExperiment, boolean hasInvite, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, User user) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(goldSubscriptionState, "goldSubscriptionState");
        return new PostSignUpAddToWaitlistState(screen, loading, referralsBlocked, inBlockGoldFlowExperiment, hasInvite, goldSubscriptionState, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpAddToWaitlistState)) {
            return false;
        }
        PostSignUpAddToWaitlistState postSignUpAddToWaitlistState = (PostSignUpAddToWaitlistState) other;
        return this.screen == postSignUpAddToWaitlistState.screen && this.loading == postSignUpAddToWaitlistState.loading && this.referralsBlocked == postSignUpAddToWaitlistState.referralsBlocked && this.inBlockGoldFlowExperiment == postSignUpAddToWaitlistState.inBlockGoldFlowExperiment && this.hasInvite == postSignUpAddToWaitlistState.hasInvite && this.goldSubscriptionState == postSignUpAddToWaitlistState.goldSubscriptionState && Intrinsics.areEqual(this.user, postSignUpAddToWaitlistState.user);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.screen.hashCode() * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.referralsBlocked)) * 31) + Boolean.hashCode(this.inBlockGoldFlowExperiment)) * 31) + Boolean.hashCode(this.hasInvite)) * 31) + this.goldSubscriptionState.hashCode()) * 31;
        User user = this.user;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        return "PostSignUpAddToWaitlistState(screen=" + this.screen + ", loading=" + this.loading + ", referralsBlocked=" + this.referralsBlocked + ", inBlockGoldFlowExperiment=" + this.inBlockGoldFlowExperiment + ", hasInvite=" + this.hasInvite + ", goldSubscriptionState=" + this.goldSubscriptionState + ", user=" + this.user + ")";
    }

    public PostSignUpAddToWaitlistState(PostSignUpAddToWaitlistDuxo9 screen, boolean z, boolean z2, boolean z3, boolean z4, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, User user) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(goldSubscriptionState, "goldSubscriptionState");
        this.screen = screen;
        this.loading = z;
        this.referralsBlocked = z2;
        this.inBlockGoldFlowExperiment = z3;
        this.hasInvite = z4;
        this.goldSubscriptionState = goldSubscriptionState;
        this.user = user;
    }

    public /* synthetic */ PostSignUpAddToWaitlistState(PostSignUpAddToWaitlistDuxo9 postSignUpAddToWaitlistDuxo9, boolean z, boolean z2, boolean z3, boolean z4, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PostSignUpAddToWaitlistDuxo9.INTRO : postSignUpAddToWaitlistDuxo9, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? GoldSubscriptionStore.GoldSubscriptionState.INELIGIBLE_FOR_GOLD : goldSubscriptionState, (i & 64) != 0 ? null : user);
    }

    public final PostSignUpAddToWaitlistDuxo9 getScreen() {
        return this.screen;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getReferralsBlocked() {
        return this.referralsBlocked;
    }

    public final boolean getInBlockGoldFlowExperiment() {
        return this.inBlockGoldFlowExperiment;
    }

    public final boolean getHasInvite() {
        return this.hasInvite;
    }

    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    public final User getUser() {
        return this.user;
    }
}
