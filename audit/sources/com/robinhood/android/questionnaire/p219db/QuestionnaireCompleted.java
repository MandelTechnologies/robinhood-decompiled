package com.robinhood.android.questionnaire.p219db;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireCompleted.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/db/QuestionnaireCompleted;", "", "completed", "", "context", "", "accountNumber", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getCompleted", "()Z", "getContext", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class QuestionnaireCompleted {
    private final String accountNumber;
    private final boolean completed;
    private final String context;

    public static /* synthetic */ QuestionnaireCompleted copy$default(QuestionnaireCompleted questionnaireCompleted, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = questionnaireCompleted.completed;
        }
        if ((i & 2) != 0) {
            str = questionnaireCompleted.context;
        }
        if ((i & 4) != 0) {
            str2 = questionnaireCompleted.accountNumber;
        }
        return questionnaireCompleted.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final QuestionnaireCompleted copy(boolean completed, String context, String accountNumber) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new QuestionnaireCompleted(completed, context, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireCompleted)) {
            return false;
        }
        QuestionnaireCompleted questionnaireCompleted = (QuestionnaireCompleted) other;
        return this.completed == questionnaireCompleted.completed && Intrinsics.areEqual(this.context, questionnaireCompleted.context) && Intrinsics.areEqual(this.accountNumber, questionnaireCompleted.accountNumber);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.completed) * 31) + this.context.hashCode()) * 31;
        String str = this.accountNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "QuestionnaireCompleted(completed=" + this.completed + ", context=" + this.context + ", accountNumber=" + this.accountNumber + ")";
    }

    public QuestionnaireCompleted(boolean z, String context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.completed = z;
        this.context = context;
        this.accountNumber = str;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
