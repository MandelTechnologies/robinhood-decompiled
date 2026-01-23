package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireSubmitRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitRequest;", "", "context", "", "account_number", "application_id", "reference_key", "question_responses", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionAnswer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContext", "()Ljava/lang/String;", "getAccount_number", "getApplication_id", "getReference_key", "getQuestion_responses", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireSubmitRequest {
    private final String account_number;
    private final String application_id;
    private final String context;
    private final List<ApiQuestionAnswer> question_responses;
    private final String reference_key;

    public static /* synthetic */ ApiQuestionnaireSubmitRequest copy$default(ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiQuestionnaireSubmitRequest.context;
        }
        if ((i & 2) != 0) {
            str2 = apiQuestionnaireSubmitRequest.account_number;
        }
        if ((i & 4) != 0) {
            str3 = apiQuestionnaireSubmitRequest.application_id;
        }
        if ((i & 8) != 0) {
            str4 = apiQuestionnaireSubmitRequest.reference_key;
        }
        if ((i & 16) != 0) {
            list = apiQuestionnaireSubmitRequest.question_responses;
        }
        List list2 = list;
        String str5 = str3;
        return apiQuestionnaireSubmitRequest.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplication_id() {
        return this.application_id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReference_key() {
        return this.reference_key;
    }

    public final List<ApiQuestionAnswer> component5() {
        return this.question_responses;
    }

    public final ApiQuestionnaireSubmitRequest copy(String context, String account_number, String application_id, String reference_key, List<ApiQuestionAnswer> question_responses) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question_responses, "question_responses");
        return new ApiQuestionnaireSubmitRequest(context, account_number, application_id, reference_key, question_responses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireSubmitRequest)) {
            return false;
        }
        ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest = (ApiQuestionnaireSubmitRequest) other;
        return Intrinsics.areEqual(this.context, apiQuestionnaireSubmitRequest.context) && Intrinsics.areEqual(this.account_number, apiQuestionnaireSubmitRequest.account_number) && Intrinsics.areEqual(this.application_id, apiQuestionnaireSubmitRequest.application_id) && Intrinsics.areEqual(this.reference_key, apiQuestionnaireSubmitRequest.reference_key) && Intrinsics.areEqual(this.question_responses, apiQuestionnaireSubmitRequest.question_responses);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.account_number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.application_id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reference_key;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.question_responses.hashCode();
    }

    public String toString() {
        return "ApiQuestionnaireSubmitRequest(context=" + this.context + ", account_number=" + this.account_number + ", application_id=" + this.application_id + ", reference_key=" + this.reference_key + ", question_responses=" + this.question_responses + ")";
    }

    public ApiQuestionnaireSubmitRequest(String context, String str, String str2, String str3, List<ApiQuestionAnswer> question_responses) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question_responses, "question_responses");
        this.context = context;
        this.account_number = str;
        this.application_id = str2;
        this.reference_key = str3;
        this.question_responses = question_responses;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    public final String getReference_key() {
        return this.reference_key;
    }

    public final List<ApiQuestionAnswer> getQuestion_responses() {
        return this.question_responses;
    }
}
