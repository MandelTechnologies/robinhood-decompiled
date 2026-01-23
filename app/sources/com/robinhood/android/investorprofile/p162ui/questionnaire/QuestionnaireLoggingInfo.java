package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireLoggingInfo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00060\rj\u0002`\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "Landroid/os/Parcelable;", "questionnaireContext", "", "params", "Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;)V", "getQuestionnaireContext", "()Ljava/lang/String;", "getParams", "()Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "toEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "redFlagStatus", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireLoggingInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionnaireLoggingInfo> CREATOR = new Creator();
    private final QuestionnaireLoggingParams params;
    private final String questionnaireContext;

    /* compiled from: QuestionnaireLoggingInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireLoggingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireLoggingInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionnaireLoggingInfo(parcel.readString(), (QuestionnaireLoggingParams) parcel.readParcelable(QuestionnaireLoggingInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireLoggingInfo[] newArray(int i) {
            return new QuestionnaireLoggingInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionnaireLoggingInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QuestionnaireLoggingInfo copy$default(QuestionnaireLoggingInfo questionnaireLoggingInfo, String str, QuestionnaireLoggingParams questionnaireLoggingParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireLoggingInfo.questionnaireContext;
        }
        if ((i & 2) != 0) {
            questionnaireLoggingParams = questionnaireLoggingInfo.params;
        }
        return questionnaireLoggingInfo.copy(str, questionnaireLoggingParams);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestionnaireContext() {
        return this.questionnaireContext;
    }

    /* renamed from: component2, reason: from getter */
    public final QuestionnaireLoggingParams getParams() {
        return this.params;
    }

    public final QuestionnaireLoggingInfo copy(String questionnaireContext, QuestionnaireLoggingParams params) {
        Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
        Intrinsics.checkNotNullParameter(params, "params");
        return new QuestionnaireLoggingInfo(questionnaireContext, params);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireLoggingInfo)) {
            return false;
        }
        QuestionnaireLoggingInfo questionnaireLoggingInfo = (QuestionnaireLoggingInfo) other;
        return Intrinsics.areEqual(this.questionnaireContext, questionnaireLoggingInfo.questionnaireContext) && Intrinsics.areEqual(this.params, questionnaireLoggingInfo.params);
    }

    public int hashCode() {
        return (this.questionnaireContext.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        return "QuestionnaireLoggingInfo(questionnaireContext=" + this.questionnaireContext + ", params=" + this.params + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.questionnaireContext);
        dest.writeParcelable(this.params, flags);
    }

    public QuestionnaireLoggingInfo(String questionnaireContext, QuestionnaireLoggingParams params) {
        Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.questionnaireContext = questionnaireContext;
        this.params = params;
    }

    public /* synthetic */ QuestionnaireLoggingInfo(String str, QuestionnaireLoggingParams questionnaireLoggingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new QuestionnaireLoggingParams(null, null, 3, null) : questionnaireLoggingParams);
    }

    public final String getQuestionnaireContext() {
        return this.questionnaireContext;
    }

    public final QuestionnaireLoggingParams getParams() {
        return this.params;
    }

    public static /* synthetic */ Context toEventContext$default(QuestionnaireLoggingInfo questionnaireLoggingInfo, InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            redFlagStatus = null;
        }
        return questionnaireLoggingInfo.toEventContext(redFlagStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context toEventContext(InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus) {
        return new Context(0, 0, 0, null, null, null, 0 == true ? 1 : 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InvestorProfileQuestionnaireContext(this.questionnaireContext, this.params.getSource(), "", this.params.getAccountType(), redFlagStatus == null ? InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED : redFlagStatus, null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -268435457, -1, -1, -1, 16383, null);
    }
}
