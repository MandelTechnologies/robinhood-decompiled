package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityProxyVotingRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/PreviewStates;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "voteStatus", "Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getVoteStatus", "()Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final /* data */ class PreviewStates {
    private final StringResource title;
    private final ProxyCommunication.VoteStatus voteStatus;

    public static /* synthetic */ PreviewStates copy$default(PreviewStates previewStates, StringResource stringResource, ProxyCommunication.VoteStatus voteStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = previewStates.title;
        }
        if ((i & 2) != 0) {
            voteStatus = previewStates.voteStatus;
        }
        return previewStates.copy(stringResource, voteStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ProxyCommunication.VoteStatus getVoteStatus() {
        return this.voteStatus;
    }

    public final PreviewStates copy(StringResource title, ProxyCommunication.VoteStatus voteStatus) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(voteStatus, "voteStatus");
        return new PreviewStates(title, voteStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewStates)) {
            return false;
        }
        PreviewStates previewStates = (PreviewStates) other;
        return Intrinsics.areEqual(this.title, previewStates.title) && this.voteStatus == previewStates.voteStatus;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.voteStatus.hashCode();
    }

    public String toString() {
        return "PreviewStates(title=" + this.title + ", voteStatus=" + this.voteStatus + ")";
    }

    public PreviewStates(StringResource title, ProxyCommunication.VoteStatus voteStatus) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(voteStatus, "voteStatus");
        this.title = title;
        this.voteStatus = voteStatus;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ProxyCommunication.VoteStatus getVoteStatus() {
        return this.voteStatus;
    }
}
