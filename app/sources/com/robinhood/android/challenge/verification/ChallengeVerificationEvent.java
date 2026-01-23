package com.robinhood.android.challenge.verification;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogInfo;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationEvent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "", "ChallengeVerified", "ContactSupport", "Dialog", "Error", "Fallback", "Resend", "Submit", "UpdatePhone", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$ChallengeVerified;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$ContactSupport;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Dialog;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Error;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Fallback;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Resend;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Submit;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$UpdatePhone;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ChallengeVerificationEvent {

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$ChallengeVerified;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeVerified implements ChallengeVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;

        public static /* synthetic */ ChallengeVerified copy$default(ChallengeVerified challengeVerified, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = challengeVerified.challengeId;
            }
            return challengeVerified.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final ChallengeVerified copy(UUID challengeId) {
            return new ChallengeVerified(challengeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChallengeVerified) && Intrinsics.areEqual(this.challengeId, ((ChallengeVerified) other).challengeId);
        }

        public int hashCode() {
            UUID uuid = this.challengeId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "ChallengeVerified(challengeId=" + this.challengeId + ")";
        }

        public ChallengeVerified(UUID uuid) {
            this.challengeId = uuid;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$ContactSupport;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "isLoggedIn", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContactSupport implements ChallengeVerificationEvent {
        public static final int $stable = 0;
        private final boolean isLoggedIn;

        public static /* synthetic */ ContactSupport copy$default(ContactSupport contactSupport, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contactSupport.isLoggedIn;
            }
            return contactSupport.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        public final ContactSupport copy(boolean isLoggedIn) {
            return new ContactSupport(isLoggedIn);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContactSupport) && this.isLoggedIn == ((ContactSupport) other).isLoggedIn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoggedIn);
        }

        public String toString() {
            return "ContactSupport(isLoggedIn=" + this.isLoggedIn + ")";
        }

        public ContactSupport(boolean z) {
            this.isLoggedIn = z;
        }

        public final boolean isLoggedIn() {
            return this.isLoggedIn;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Dialog;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "<init>", "(Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;)V", "getInfo", "()Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dialog implements ChallengeVerificationEvent {
        public static final int $stable = 8;
        private final ChallengeDialogInfo info;

        public static /* synthetic */ Dialog copy$default(Dialog dialog, ChallengeDialogInfo challengeDialogInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                challengeDialogInfo = dialog.info;
            }
            return dialog.copy(challengeDialogInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ChallengeDialogInfo getInfo() {
            return this.info;
        }

        public final Dialog copy(ChallengeDialogInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new Dialog(info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dialog) && Intrinsics.areEqual(this.info, ((Dialog) other).info);
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        public String toString() {
            return "Dialog(info=" + this.info + ")";
        }

        public Dialog(ChallengeDialogInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final ChallengeDialogInfo getInfo() {
            return this.info;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Error;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements ChallengeVerificationEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Fallback;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Fallback implements ChallengeVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;

        public static /* synthetic */ Fallback copy$default(Fallback fallback, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = fallback.challengeId;
            }
            return fallback.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final Fallback copy(UUID challengeId) {
            return new Fallback(challengeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fallback) && Intrinsics.areEqual(this.challengeId, ((Fallback) other).challengeId);
        }

        public int hashCode() {
            UUID uuid = this.challengeId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "Fallback(challengeId=" + this.challengeId + ")";
        }

        public Fallback(UUID uuid) {
            this.challengeId = uuid;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Resend;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Resend implements ChallengeVerificationEvent {
        public static final int $stable = 0;
        public static final Resend INSTANCE = new Resend();

        public boolean equals(Object other) {
            return this == other || (other instanceof Resend);
        }

        public int hashCode() {
            return 1164152185;
        }

        public String toString() {
            return "Resend";
        }

        private Resend() {
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$Submit;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "code", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getChallengeId", "()Ljava/util/UUID;", "getCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submit implements ChallengeVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;
        private final String code;

        public static /* synthetic */ Submit copy$default(Submit submit, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = submit.challengeId;
            }
            if ((i & 2) != 0) {
                str = submit.code;
            }
            return submit.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Submit copy(UUID challengeId, String code) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            Intrinsics.checkNotNullParameter(code, "code");
            return new Submit(challengeId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.areEqual(this.challengeId, submit.challengeId) && Intrinsics.areEqual(this.code, submit.code);
        }

        public int hashCode() {
            return (this.challengeId.hashCode() * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Submit(challengeId=" + this.challengeId + ", code=" + this.code + ")";
        }

        public Submit(UUID challengeId, String code) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            Intrinsics.checkNotNullParameter(code, "code");
            this.challengeId = challengeId;
            this.code = code;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* compiled from: ChallengeVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent$UpdatePhone;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdatePhone implements ChallengeVerificationEvent {
        public static final int $stable = 0;
        public static final UpdatePhone INSTANCE = new UpdatePhone();

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdatePhone);
        }

        public int hashCode() {
            return 1011367847;
        }

        public String toString() {
            return "UpdatePhone";
        }

        private UpdatePhone() {
        }
    }
}
