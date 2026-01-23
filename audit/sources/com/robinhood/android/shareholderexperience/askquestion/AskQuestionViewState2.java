package com.robinhood.android.shareholderexperience.askquestion;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AskQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent;", "", "Error", "Success", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent$Error;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent$Success;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionEvent, reason: use source file name */
/* loaded from: classes5.dex */
public interface AskQuestionViewState2 {

    /* compiled from: AskQuestionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent$Error;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionEvent$Error */
    public static final class Error implements AskQuestionViewState2 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }

    /* compiled from: AskQuestionViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent$Success;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent;", "shareCopy", "", "<init>", "(Ljava/lang/String;)V", "getShareCopy", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionEvent$Success, reason: from toString */
    public static final /* data */ class Success implements AskQuestionViewState2 {
        public static final int $stable = 0;
        private final String shareCopy;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.shareCopy;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getShareCopy() {
            return this.shareCopy;
        }

        public final Success copy(String shareCopy) {
            return new Success(shareCopy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.shareCopy, ((Success) other).shareCopy);
        }

        public int hashCode() {
            String str = this.shareCopy;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Success(shareCopy=" + this.shareCopy + ")";
        }

        public Success(String str) {
            this.shareCopy = str;
        }

        public final String getShareCopy() {
            return this.shareCopy;
        }
    }
}
