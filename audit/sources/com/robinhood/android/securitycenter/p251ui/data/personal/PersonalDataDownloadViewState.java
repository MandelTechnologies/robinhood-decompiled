package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.udf.UiEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataDownloadViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "", "<init>", "()V", "Default", "Loading", "ChallengeReceived", "Success", "Error", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$ChallengeReceived;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Default;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Error;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Success;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class PersonalDataDownloadViewState {
    public static final int $stable = 0;

    public /* synthetic */ PersonalDataDownloadViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonalDataDownloadViewState() {
    }

    /* compiled from: PersonalDataDownloadViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Default;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Default extends PersonalDataDownloadViewState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }
    }

    /* compiled from: PersonalDataDownloadViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends PersonalDataDownloadViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PersonalDataDownloadViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$ChallengeReceived;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeReceived extends PersonalDataDownloadViewState {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ ChallengeReceived copy$default(ChallengeReceived challengeReceived, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = challengeReceived.challenge;
            }
            return challengeReceived.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final ChallengeReceived copy(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new ChallengeReceived(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChallengeReceived) && Intrinsics.areEqual(this.challenge, ((ChallengeReceived) other).challenge);
        }

        public int hashCode() {
            return this.challenge.hashCode();
        }

        public String toString() {
            return "ChallengeReceived(challenge=" + this.challenge + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeReceived(Challenge challenge) {
            super(null);
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    /* compiled from: PersonalDataDownloadViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Success;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "fileEvent", "Lcom/robinhood/udf/UiEvent;", "Ljava/io/File;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getFileEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends PersonalDataDownloadViewState {
        public static final int $stable = 8;
        private final UiEvent<File> fileEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = success.fileEvent;
            }
            return success.copy(uiEvent);
        }

        public final UiEvent<File> component1() {
            return this.fileEvent;
        }

        public final Success copy(UiEvent<File> fileEvent) {
            Intrinsics.checkNotNullParameter(fileEvent, "fileEvent");
            return new Success(fileEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.fileEvent, ((Success) other).fileEvent);
        }

        public int hashCode() {
            return this.fileEvent.hashCode();
        }

        public String toString() {
            return "Success(fileEvent=" + this.fileEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiEvent<File> fileEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(fileEvent, "fileEvent");
            this.fileEvent = fileEvent;
        }

        public final UiEvent<File> getFileEvent() {
            return this.fileEvent;
        }
    }

    /* compiled from: PersonalDataDownloadViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState$Error;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends PersonalDataDownloadViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
