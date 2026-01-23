package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireCompletedResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireCompletedResponse;", "", "completed", "", "context", "", "account_number", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getCompleted", "()Z", "getContext", "()Ljava/lang/String;", "getAccount_number", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireCompletedResponse {
    private final String account_number;
    private final boolean completed;
    private final String context;

    public static /* synthetic */ ApiQuestionnaireCompletedResponse copy$default(ApiQuestionnaireCompletedResponse apiQuestionnaireCompletedResponse, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = apiQuestionnaireCompletedResponse.completed;
        }
        if ((i & 2) != 0) {
            str = apiQuestionnaireCompletedResponse.context;
        }
        if ((i & 4) != 0) {
            str2 = apiQuestionnaireCompletedResponse.account_number;
        }
        return apiQuestionnaireCompletedResponse.copy(z, str, str2);
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
    public final String getAccount_number() {
        return this.account_number;
    }

    public final ApiQuestionnaireCompletedResponse copy(boolean completed, String context, String account_number) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ApiQuestionnaireCompletedResponse(completed, context, account_number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireCompletedResponse)) {
            return false;
        }
        ApiQuestionnaireCompletedResponse apiQuestionnaireCompletedResponse = (ApiQuestionnaireCompletedResponse) other;
        return this.completed == apiQuestionnaireCompletedResponse.completed && Intrinsics.areEqual(this.context, apiQuestionnaireCompletedResponse.context) && Intrinsics.areEqual(this.account_number, apiQuestionnaireCompletedResponse.account_number);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.completed) * 31) + this.context.hashCode()) * 31;
        String str = this.account_number;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ApiQuestionnaireCompletedResponse(completed=" + this.completed + ", context=" + this.context + ", account_number=" + this.account_number + ")";
    }

    public ApiQuestionnaireCompletedResponse(boolean z, String context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.completed = z;
        this.context = context;
        this.account_number = str;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccount_number() {
        return this.account_number;
    }
}
