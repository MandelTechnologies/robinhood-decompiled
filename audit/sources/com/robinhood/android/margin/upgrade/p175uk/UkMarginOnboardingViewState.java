package com.robinhood.android.margin.upgrade.p175uk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkMarginOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingViewState;", "", "shouldShowMarginKnowledgeTest", "", "<init>", "(Ljava/lang/Boolean;)V", "getShouldShowMarginKnowledgeTest", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UkMarginOnboardingViewState {
    public static final int $stable = 0;
    private final Boolean shouldShowMarginKnowledgeTest;

    /* JADX WARN: Multi-variable type inference failed */
    public UkMarginOnboardingViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UkMarginOnboardingViewState copy$default(UkMarginOnboardingViewState ukMarginOnboardingViewState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = ukMarginOnboardingViewState.shouldShowMarginKnowledgeTest;
        }
        return ukMarginOnboardingViewState.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShouldShowMarginKnowledgeTest() {
        return this.shouldShowMarginKnowledgeTest;
    }

    public final UkMarginOnboardingViewState copy(Boolean shouldShowMarginKnowledgeTest) {
        return new UkMarginOnboardingViewState(shouldShowMarginKnowledgeTest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UkMarginOnboardingViewState) && Intrinsics.areEqual(this.shouldShowMarginKnowledgeTest, ((UkMarginOnboardingViewState) other).shouldShowMarginKnowledgeTest);
    }

    public int hashCode() {
        Boolean bool = this.shouldShowMarginKnowledgeTest;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "UkMarginOnboardingViewState(shouldShowMarginKnowledgeTest=" + this.shouldShowMarginKnowledgeTest + ")";
    }

    public UkMarginOnboardingViewState(Boolean bool) {
        this.shouldShowMarginKnowledgeTest = bool;
    }

    public /* synthetic */ UkMarginOnboardingViewState(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public final Boolean getShouldShowMarginKnowledgeTest() {
        return this.shouldShowMarginKnowledgeTest;
    }
}
