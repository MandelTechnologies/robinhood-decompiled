package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountDetailState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailViewState;", "", "content", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "<init>", "(Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getContent", "()Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpFundAccountDetailViewState {
    public static final int $stable = 8;
    private final PostSignUpFundAccountDetailContent content;
    private final Context context;

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpFundAccountDetailViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PostSignUpFundAccountDetailViewState copy$default(PostSignUpFundAccountDetailViewState postSignUpFundAccountDetailViewState, PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            postSignUpFundAccountDetailContent = postSignUpFundAccountDetailViewState.content;
        }
        if ((i & 2) != 0) {
            context = postSignUpFundAccountDetailViewState.context;
        }
        return postSignUpFundAccountDetailViewState.copy(postSignUpFundAccountDetailContent, context);
    }

    /* renamed from: component1, reason: from getter */
    public final PostSignUpFundAccountDetailContent getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final PostSignUpFundAccountDetailViewState copy(PostSignUpFundAccountDetailContent content, Context context) {
        return new PostSignUpFundAccountDetailViewState(content, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpFundAccountDetailViewState)) {
            return false;
        }
        PostSignUpFundAccountDetailViewState postSignUpFundAccountDetailViewState = (PostSignUpFundAccountDetailViewState) other;
        return Intrinsics.areEqual(this.content, postSignUpFundAccountDetailViewState.content) && Intrinsics.areEqual(this.context, postSignUpFundAccountDetailViewState.context);
    }

    public int hashCode() {
        PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent = this.content;
        int iHashCode = (postSignUpFundAccountDetailContent == null ? 0 : postSignUpFundAccountDetailContent.hashCode()) * 31;
        Context context = this.context;
        return iHashCode + (context != null ? context.hashCode() : 0);
    }

    public String toString() {
        return "PostSignUpFundAccountDetailViewState(content=" + this.content + ", context=" + this.context + ")";
    }

    public PostSignUpFundAccountDetailViewState(PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent, Context context) {
        this.content = postSignUpFundAccountDetailContent;
        this.context = context;
    }

    public /* synthetic */ PostSignUpFundAccountDetailViewState(PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : postSignUpFundAccountDetailContent, (i & 2) != 0 ? null : context);
    }

    public final PostSignUpFundAccountDetailContent getContent() {
        return this.content;
    }

    public final Context getContext() {
        return this.context;
    }
}
