package com.robinhood.android.investmentstracker.composables;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "", "NavigateToTransfers", "Plaid", "OldPlaid", "NavigateToAccountsList", "Deeplink", "SetupExoPlayer", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$Deeplink;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$NavigateToAccountsList;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$NavigateToTransfers;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$OldPlaid;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$Plaid;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$SetupExoPlayer;", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InvestmentsTrackerEvent {

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$NavigateToTransfers;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTransfers implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        public static final NavigateToTransfers INSTANCE = new NavigateToTransfers();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToTransfers);
        }

        public int hashCode() {
            return -242242714;
        }

        public String toString() {
            return "NavigateToTransfers";
        }

        private NavigateToTransfers() {
        }
    }

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$Plaid;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "useUpdateMode", "", "institutionId", "", "<init>", "(ZLjava/lang/String;)V", "getUseUpdateMode", "()Z", "getInstitutionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Plaid implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        private final String institutionId;
        private final boolean useUpdateMode;

        /* JADX WARN: Multi-variable type inference failed */
        public Plaid() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Plaid copy$default(Plaid plaid, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = plaid.useUpdateMode;
            }
            if ((i & 2) != 0) {
                str = plaid.institutionId;
            }
            return plaid.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseUpdateMode() {
            return this.useUpdateMode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInstitutionId() {
            return this.institutionId;
        }

        public final Plaid copy(boolean useUpdateMode, String institutionId) {
            return new Plaid(useUpdateMode, institutionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plaid)) {
                return false;
            }
            Plaid plaid = (Plaid) other;
            return this.useUpdateMode == plaid.useUpdateMode && Intrinsics.areEqual(this.institutionId, plaid.institutionId);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.useUpdateMode) * 31;
            String str = this.institutionId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Plaid(useUpdateMode=" + this.useUpdateMode + ", institutionId=" + this.institutionId + ")";
        }

        public Plaid(boolean z, String str) {
            this.useUpdateMode = z;
            this.institutionId = str;
        }

        public /* synthetic */ Plaid(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }

        public final boolean getUseUpdateMode() {
            return this.useUpdateMode;
        }

        public final String getInstitutionId() {
            return this.institutionId;
        }
    }

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$OldPlaid;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "<init>", "()V", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OldPlaid implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        public static final OldPlaid INSTANCE = new OldPlaid();

        private OldPlaid() {
        }
    }

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$NavigateToAccountsList;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "<init>", "()V", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToAccountsList implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        public static final NavigateToAccountsList INSTANCE = new NavigateToAccountsList();

        private NavigateToAccountsList() {
        }
    }

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$Deeplink;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "uri", "", "<init>", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        private final String uri;

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplink.uri;
            }
            return deeplink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final Deeplink copy(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Deeplink(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && Intrinsics.areEqual(this.uri, ((Deeplink) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "Deeplink(uri=" + this.uri + ")";
        }

        public Deeplink(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    /* compiled from: InvestmentsTrackerEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent$SetupExoPlayer;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "firstUrl", "", "secondUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstUrl", "()Ljava/lang/String;", "getSecondUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SetupExoPlayer implements InvestmentsTrackerEvent {
        public static final int $stable = 0;
        private final String firstUrl;
        private final String secondUrl;

        public static /* synthetic */ SetupExoPlayer copy$default(SetupExoPlayer setupExoPlayer, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupExoPlayer.firstUrl;
            }
            if ((i & 2) != 0) {
                str2 = setupExoPlayer.secondUrl;
            }
            return setupExoPlayer.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstUrl() {
            return this.firstUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecondUrl() {
            return this.secondUrl;
        }

        public final SetupExoPlayer copy(String firstUrl, String secondUrl) {
            Intrinsics.checkNotNullParameter(firstUrl, "firstUrl");
            Intrinsics.checkNotNullParameter(secondUrl, "secondUrl");
            return new SetupExoPlayer(firstUrl, secondUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupExoPlayer)) {
                return false;
            }
            SetupExoPlayer setupExoPlayer = (SetupExoPlayer) other;
            return Intrinsics.areEqual(this.firstUrl, setupExoPlayer.firstUrl) && Intrinsics.areEqual(this.secondUrl, setupExoPlayer.secondUrl);
        }

        public int hashCode() {
            return (this.firstUrl.hashCode() * 31) + this.secondUrl.hashCode();
        }

        public String toString() {
            return "SetupExoPlayer(firstUrl=" + this.firstUrl + ", secondUrl=" + this.secondUrl + ")";
        }

        public SetupExoPlayer(String firstUrl, String secondUrl) {
            Intrinsics.checkNotNullParameter(firstUrl, "firstUrl");
            Intrinsics.checkNotNullParameter(secondUrl, "secondUrl");
            this.firstUrl = firstUrl;
            this.secondUrl = secondUrl;
        }

        public final String getFirstUrl() {
            return this.firstUrl;
        }

        public final String getSecondUrl() {
            return this.secondUrl;
        }
    }
}
