package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireConfirmRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireConfirmRequest;", "", "context", "", "account_number", "user_answers", "", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContext", "()Ljava/lang/String;", "getAccount_number", "getUser_answers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireConfirmRequest {
    private final String account_number;
    private final String context;
    private final List<UUID> user_answers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiQuestionnaireConfirmRequest copy$default(ApiQuestionnaireConfirmRequest apiQuestionnaireConfirmRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiQuestionnaireConfirmRequest.context;
        }
        if ((i & 2) != 0) {
            str2 = apiQuestionnaireConfirmRequest.account_number;
        }
        if ((i & 4) != 0) {
            list = apiQuestionnaireConfirmRequest.user_answers;
        }
        return apiQuestionnaireConfirmRequest.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<UUID> component3() {
        return this.user_answers;
    }

    public final ApiQuestionnaireConfirmRequest copy(String context, String account_number, List<UUID> user_answers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_answers, "user_answers");
        return new ApiQuestionnaireConfirmRequest(context, account_number, user_answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireConfirmRequest)) {
            return false;
        }
        ApiQuestionnaireConfirmRequest apiQuestionnaireConfirmRequest = (ApiQuestionnaireConfirmRequest) other;
        return Intrinsics.areEqual(this.context, apiQuestionnaireConfirmRequest.context) && Intrinsics.areEqual(this.account_number, apiQuestionnaireConfirmRequest.account_number) && Intrinsics.areEqual(this.user_answers, apiQuestionnaireConfirmRequest.user_answers);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.account_number;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.user_answers.hashCode();
    }

    public String toString() {
        return "ApiQuestionnaireConfirmRequest(context=" + this.context + ", account_number=" + this.account_number + ", user_answers=" + this.user_answers + ")";
    }

    public ApiQuestionnaireConfirmRequest(String context, String str, List<UUID> user_answers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_answers, "user_answers");
        this.context = context;
        this.account_number = str;
        this.user_answers = user_answers;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<UUID> getUser_answers() {
        return this.user_answers;
    }
}
