package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityProxyVotingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;", "", "Gone", "Loaded", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Gone;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Loaded;", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityProxyVotingViewState {

    /* compiled from: EquityProxyVotingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Gone;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Gone implements EquityProxyVotingViewState {
        public static final int $stable = 0;
        public static final Gone INSTANCE = new Gone();

        public boolean equals(Object other) {
            return this == other || (other instanceof Gone);
        }

        public int hashCode() {
            return 1676163388;
        }

        public String toString() {
            return "Gone";
        }

        private Gone() {
        }
    }

    /* compiled from: EquityProxyVotingViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState$Loaded;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "dateString", "voteStatus", "Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;", "voteEnded", "", "voteUrl", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;ZLjava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDateString", "getVoteStatus", "()Lcom/robinhood/models/db/ProxyCommunication$VoteStatus;", "getVoteEnded", "()Z", "getVoteUrl", "()Ljava/lang/String;", "loggingComponentIdentifier", "getLoggingComponentIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements EquityProxyVotingViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource dateString;
        private final StringResource title;
        private final boolean voteEnded;
        private final ProxyCommunication.VoteStatus voteStatus;
        private final String voteUrl;

        /* compiled from: EquityProxyVotingViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProxyCommunication.VoteStatus.values().length];
                try {
                    iArr[ProxyCommunication.VoteStatus.ONLINE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProxyCommunication.VoteStatus.VOTE_TRANSMISSION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProxyCommunication.VoteStatus.LEGAL_PROXY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProxyCommunication.VoteStatus.NOT_VIEWED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ProxyCommunication.VoteStatus.VIEWED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ProxyCommunication.VoteStatus.WITHDRAWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, StringResource stringResource2, ProxyCommunication.VoteStatus voteStatus, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = loaded.dateString;
            }
            if ((i & 4) != 0) {
                voteStatus = loaded.voteStatus;
            }
            if ((i & 8) != 0) {
                z = loaded.voteEnded;
            }
            if ((i & 16) != 0) {
                str = loaded.voteUrl;
            }
            String str2 = str;
            ProxyCommunication.VoteStatus voteStatus2 = voteStatus;
            return loaded.copy(stringResource, stringResource2, voteStatus2, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getDateString() {
            return this.dateString;
        }

        /* renamed from: component3, reason: from getter */
        public final ProxyCommunication.VoteStatus getVoteStatus() {
            return this.voteStatus;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getVoteEnded() {
            return this.voteEnded;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVoteUrl() {
            return this.voteUrl;
        }

        public final Loaded copy(StringResource title, StringResource dateString, ProxyCommunication.VoteStatus voteStatus, boolean voteEnded, String voteUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            Intrinsics.checkNotNullParameter(voteStatus, "voteStatus");
            Intrinsics.checkNotNullParameter(voteUrl, "voteUrl");
            return new Loaded(title, dateString, voteStatus, voteEnded, voteUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.dateString, loaded.dateString) && this.voteStatus == loaded.voteStatus && this.voteEnded == loaded.voteEnded && Intrinsics.areEqual(this.voteUrl, loaded.voteUrl);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.dateString.hashCode()) * 31) + this.voteStatus.hashCode()) * 31) + Boolean.hashCode(this.voteEnded)) * 31) + this.voteUrl.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", dateString=" + this.dateString + ", voteStatus=" + this.voteStatus + ", voteEnded=" + this.voteEnded + ", voteUrl=" + this.voteUrl + ")";
        }

        public Loaded(StringResource title, StringResource dateString, ProxyCommunication.VoteStatus voteStatus, boolean z, String voteUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            Intrinsics.checkNotNullParameter(voteStatus, "voteStatus");
            Intrinsics.checkNotNullParameter(voteUrl, "voteUrl");
            this.title = title;
            this.dateString = dateString;
            this.voteStatus = voteStatus;
            this.voteEnded = z;
            this.voteUrl = voteUrl;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDateString() {
            return this.dateString;
        }

        public final ProxyCommunication.VoteStatus getVoteStatus() {
            return this.voteStatus;
        }

        public final boolean getVoteEnded() {
            return this.voteEnded;
        }

        public final String getVoteUrl() {
            return this.voteUrl;
        }

        public final String getLoggingComponentIdentifier() {
            if (this.voteEnded) {
                return "VOTING_ENDED";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[this.voteStatus.ordinal()]) {
                case 1:
                case 2:
                    return "VOTED";
                case 3:
                case 4:
                case 5:
                case 6:
                    return "NOT_VOTED";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
