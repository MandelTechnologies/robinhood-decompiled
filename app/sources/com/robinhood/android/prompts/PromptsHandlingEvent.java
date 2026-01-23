package com.robinhood.android.prompts;

import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsHandlingEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "", "Finished", "Error", "RequestBiometrics", "ShowDeniedBottomSheet", "ShowNextChallenge", "Lcom/robinhood/android/prompts/PromptsHandlingEvent$Error;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent$Finished;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent$RequestBiometrics;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent$ShowDeniedBottomSheet;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent$ShowNextChallenge;", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PromptsHandlingEvent {

    /* compiled from: PromptsHandlingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent$Finished;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finished implements PromptsHandlingEvent {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finished);
        }

        public int hashCode() {
            return -1952990713;
        }

        public String toString() {
            return "Finished";
        }

        private Finished() {
        }
    }

    /* compiled from: PromptsHandlingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent$Error;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements PromptsHandlingEvent {
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

    /* compiled from: PromptsHandlingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent$RequestBiometrics;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestBiometrics implements PromptsHandlingEvent {
        public static final int $stable = 0;
        public static final RequestBiometrics INSTANCE = new RequestBiometrics();

        public boolean equals(Object other) {
            return this == other || (other instanceof RequestBiometrics);
        }

        public int hashCode() {
            return 585904309;
        }

        public String toString() {
            return "RequestBiometrics";
        }

        private RequestBiometrics() {
        }
    }

    /* compiled from: PromptsHandlingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent$ShowDeniedBottomSheet;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDeniedBottomSheet implements PromptsHandlingEvent {
        public static final int $stable = 0;
        public static final ShowDeniedBottomSheet INSTANCE = new ShowDeniedBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowDeniedBottomSheet);
        }

        public int hashCode() {
            return 1422525031;
        }

        public String toString() {
            return "ShowDeniedBottomSheet";
        }

        private ShowDeniedBottomSheet() {
        }
    }

    /* compiled from: PromptsHandlingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingEvent$ShowNextChallenge;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "handlingInfo", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "<init>", "(Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;)V", "getHandlingInfo", "()Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNextChallenge implements PromptsHandlingEvent {
        public static final int $stable = 8;
        private final PromptsHandlingInfo handlingInfo;

        public static /* synthetic */ ShowNextChallenge copy$default(ShowNextChallenge showNextChallenge, PromptsHandlingInfo promptsHandlingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                promptsHandlingInfo = showNextChallenge.handlingInfo;
            }
            return showNextChallenge.copy(promptsHandlingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final PromptsHandlingInfo getHandlingInfo() {
            return this.handlingInfo;
        }

        public final ShowNextChallenge copy(PromptsHandlingInfo handlingInfo) {
            Intrinsics.checkNotNullParameter(handlingInfo, "handlingInfo");
            return new ShowNextChallenge(handlingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowNextChallenge) && Intrinsics.areEqual(this.handlingInfo, ((ShowNextChallenge) other).handlingInfo);
        }

        public int hashCode() {
            return this.handlingInfo.hashCode();
        }

        public String toString() {
            return "ShowNextChallenge(handlingInfo=" + this.handlingInfo + ")";
        }

        public ShowNextChallenge(PromptsHandlingInfo handlingInfo) {
            Intrinsics.checkNotNullParameter(handlingInfo, "handlingInfo");
            this.handlingInfo = handlingInfo;
        }

        public final PromptsHandlingInfo getHandlingInfo() {
            return this.handlingInfo;
        }
    }
}
