package com.robinhood.android.matcha.p177ui.incentives;

import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentivesLearnMoreDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDataState;", "", "incentivesSummary", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "footerContext", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;)V", "getIncentivesSummary", "()Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "getFooterContext", "()Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaIncentivesLearnMoreDataState {
    public static final int $stable = 8;
    private final MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext;
    private final MatchaIncentivesSummary incentivesSummary;

    public static /* synthetic */ MatchaIncentivesLearnMoreDataState copy$default(MatchaIncentivesLearnMoreDataState matchaIncentivesLearnMoreDataState, MatchaIncentivesSummary matchaIncentivesSummary, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext, int i, Object obj) {
        if ((i & 1) != 0) {
            matchaIncentivesSummary = matchaIncentivesLearnMoreDataState.incentivesSummary;
        }
        if ((i & 2) != 0) {
            footerContext = matchaIncentivesLearnMoreDataState.footerContext;
        }
        return matchaIncentivesLearnMoreDataState.copy(matchaIncentivesSummary, footerContext);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchaIncentiveLearnMoreFragmentKey.FooterContext getFooterContext() {
        return this.footerContext;
    }

    public final MatchaIncentivesLearnMoreDataState copy(MatchaIncentivesSummary incentivesSummary, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext) {
        Intrinsics.checkNotNullParameter(footerContext, "footerContext");
        return new MatchaIncentivesLearnMoreDataState(incentivesSummary, footerContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaIncentivesLearnMoreDataState)) {
            return false;
        }
        MatchaIncentivesLearnMoreDataState matchaIncentivesLearnMoreDataState = (MatchaIncentivesLearnMoreDataState) other;
        return Intrinsics.areEqual(this.incentivesSummary, matchaIncentivesLearnMoreDataState.incentivesSummary) && this.footerContext == matchaIncentivesLearnMoreDataState.footerContext;
    }

    public int hashCode() {
        MatchaIncentivesSummary matchaIncentivesSummary = this.incentivesSummary;
        return ((matchaIncentivesSummary == null ? 0 : matchaIncentivesSummary.hashCode()) * 31) + this.footerContext.hashCode();
    }

    public String toString() {
        return "MatchaIncentivesLearnMoreDataState(incentivesSummary=" + this.incentivesSummary + ", footerContext=" + this.footerContext + ")";
    }

    public MatchaIncentivesLearnMoreDataState(MatchaIncentivesSummary matchaIncentivesSummary, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext) {
        Intrinsics.checkNotNullParameter(footerContext, "footerContext");
        this.incentivesSummary = matchaIncentivesSummary;
        this.footerContext = footerContext;
    }

    public /* synthetic */ MatchaIncentivesLearnMoreDataState(MatchaIncentivesSummary matchaIncentivesSummary, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : matchaIncentivesSummary, footerContext);
    }

    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final MatchaIncentiveLearnMoreFragmentKey.FooterContext getFooterContext() {
        return this.footerContext;
    }
}
