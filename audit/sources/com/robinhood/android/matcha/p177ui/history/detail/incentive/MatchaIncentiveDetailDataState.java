package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import com.robinhood.models.p320db.matcha.MatchaIncentive;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveDetailDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;", "", "incentive", "Lcom/robinhood/models/db/matcha/MatchaIncentive;", "transfer", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "incentives", "", "isMatchaIncentivesExperimentMember", "", "incentivesSummary", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaIncentive;Lcom/robinhood/models/db/matcha/MatchaTransfer;Ljava/util/List;ZLcom/robinhood/models/db/matcha/MatchaIncentivesSummary;)V", "getIncentive", "()Lcom/robinhood/models/db/matcha/MatchaIncentive;", "getTransfer", "()Lcom/robinhood/models/db/matcha/MatchaTransfer;", "getIncentives", "()Ljava/util/List;", "()Z", "getIncentivesSummary", "()Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaIncentiveDetailDataState {
    public static final int $stable = 8;
    private final MatchaIncentive incentive;
    private final List<MatchaIncentive> incentives;
    private final MatchaIncentivesSummary incentivesSummary;
    private final boolean isMatchaIncentivesExperimentMember;
    private final MatchaTransfer transfer;

    public MatchaIncentiveDetailDataState() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ MatchaIncentiveDetailDataState copy$default(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState, MatchaIncentive matchaIncentive, MatchaTransfer matchaTransfer, List list, boolean z, MatchaIncentivesSummary matchaIncentivesSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            matchaIncentive = matchaIncentiveDetailDataState.incentive;
        }
        if ((i & 2) != 0) {
            matchaTransfer = matchaIncentiveDetailDataState.transfer;
        }
        if ((i & 4) != 0) {
            list = matchaIncentiveDetailDataState.incentives;
        }
        if ((i & 8) != 0) {
            z = matchaIncentiveDetailDataState.isMatchaIncentivesExperimentMember;
        }
        if ((i & 16) != 0) {
            matchaIncentivesSummary = matchaIncentiveDetailDataState.incentivesSummary;
        }
        MatchaIncentivesSummary matchaIncentivesSummary2 = matchaIncentivesSummary;
        List list2 = list;
        return matchaIncentiveDetailDataState.copy(matchaIncentive, matchaTransfer, list2, z, matchaIncentivesSummary2);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchaIncentive getIncentive() {
        return this.incentive;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchaTransfer getTransfer() {
        return this.transfer;
    }

    public final List<MatchaIncentive> component3() {
        return this.incentives;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    /* renamed from: component5, reason: from getter */
    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final MatchaIncentiveDetailDataState copy(MatchaIncentive incentive, MatchaTransfer transfer, List<MatchaIncentive> incentives, boolean isMatchaIncentivesExperimentMember, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentives, "incentives");
        return new MatchaIncentiveDetailDataState(incentive, transfer, incentives, isMatchaIncentivesExperimentMember, incentivesSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaIncentiveDetailDataState)) {
            return false;
        }
        MatchaIncentiveDetailDataState matchaIncentiveDetailDataState = (MatchaIncentiveDetailDataState) other;
        return Intrinsics.areEqual(this.incentive, matchaIncentiveDetailDataState.incentive) && Intrinsics.areEqual(this.transfer, matchaIncentiveDetailDataState.transfer) && Intrinsics.areEqual(this.incentives, matchaIncentiveDetailDataState.incentives) && this.isMatchaIncentivesExperimentMember == matchaIncentiveDetailDataState.isMatchaIncentivesExperimentMember && Intrinsics.areEqual(this.incentivesSummary, matchaIncentiveDetailDataState.incentivesSummary);
    }

    public int hashCode() {
        MatchaIncentive matchaIncentive = this.incentive;
        int iHashCode = (matchaIncentive == null ? 0 : matchaIncentive.hashCode()) * 31;
        MatchaTransfer matchaTransfer = this.transfer;
        int iHashCode2 = (((((iHashCode + (matchaTransfer == null ? 0 : matchaTransfer.hashCode())) * 31) + this.incentives.hashCode()) * 31) + Boolean.hashCode(this.isMatchaIncentivesExperimentMember)) * 31;
        MatchaIncentivesSummary matchaIncentivesSummary = this.incentivesSummary;
        return iHashCode2 + (matchaIncentivesSummary != null ? matchaIncentivesSummary.hashCode() : 0);
    }

    public String toString() {
        return "MatchaIncentiveDetailDataState(incentive=" + this.incentive + ", transfer=" + this.transfer + ", incentives=" + this.incentives + ", isMatchaIncentivesExperimentMember=" + this.isMatchaIncentivesExperimentMember + ", incentivesSummary=" + this.incentivesSummary + ")";
    }

    public MatchaIncentiveDetailDataState(MatchaIncentive matchaIncentive, MatchaTransfer matchaTransfer, List<MatchaIncentive> incentives, boolean z, MatchaIncentivesSummary matchaIncentivesSummary) {
        Intrinsics.checkNotNullParameter(incentives, "incentives");
        this.incentive = matchaIncentive;
        this.transfer = matchaTransfer;
        this.incentives = incentives;
        this.isMatchaIncentivesExperimentMember = z;
        this.incentivesSummary = matchaIncentivesSummary;
    }

    public final MatchaIncentive getIncentive() {
        return this.incentive;
    }

    public final MatchaTransfer getTransfer() {
        return this.transfer;
    }

    public /* synthetic */ MatchaIncentiveDetailDataState(MatchaIncentive matchaIncentive, MatchaTransfer matchaTransfer, List list, boolean z, MatchaIncentivesSummary matchaIncentivesSummary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : matchaIncentive, (i & 2) != 0 ? null : matchaTransfer, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : matchaIncentivesSummary);
    }

    public final List<MatchaIncentive> getIncentives() {
        return this.incentives;
    }

    public final boolean isMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }
}
