package com.robinhood.android.investorprofile.p162ui.questionnaire.graph;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireGraphArgs.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003J\t\u00109\u001a\u00020\u0012HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u00ad\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0006\u0010=\u001a\u00020>J\u0013\u0010?\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020>HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010)R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireGraphArgs;", "Landroid/os/Parcelable;", "context", "", "accountNumber", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "applicationId", "referenceKey", "graph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "graphRoot", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "selectedQuestion", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "skipSplashScreen", "", "skipCompletedScreen", "isBlocking", "showProgressBar", "progressBarData", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;ZZZZLcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getApplicationId", "getReferenceKey", "getGraph", "()Ljava/util/Map;", "getGraphRoot", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getSelectedQuestion", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "getSkipSplashScreen", "()Z", "getSkipCompletedScreen", "getShowProgressBar", "getProgressBarData", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireGraphArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionnaireGraphArgs> CREATOR = new Creator();
    private final StringResource accountDisplayName;
    private final String accountNumber;
    private final String applicationId;
    private final String context;
    private final Map<String, UiQuestionnaireQuestion.Supported> graph;
    private final String graphRoot;
    private final boolean isBlocking;
    private final QuestionnaireLoggingInfo loggingInfo;
    private final QuestionnaireProgressBarData progressBarData;
    private final String referenceKey;
    private final QuestionnaireQuestion selectedQuestion;
    private final boolean showProgressBar;
    private final boolean skipCompletedScreen;
    private final boolean skipSplashScreen;

    /* compiled from: QuestionnaireGraphArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireGraphArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireGraphArgs createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            StringResource stringResource = (StringResource) parcel.readParcelable(QuestionnaireGraphArgs.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(QuestionnaireGraphArgs.class.getClassLoader()));
            }
            String string6 = parcel.readString();
            QuestionnaireLoggingInfo questionnaireLoggingInfoCreateFromParcel = QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel);
            QuestionnaireQuestion questionnaireQuestion = (QuestionnaireQuestion) parcel.readParcelable(QuestionnaireGraphArgs.class.getClassLoader());
            boolean z3 = true;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z2 = z;
            } else {
                z2 = z;
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new QuestionnaireGraphArgs(string2, string3, stringResource, string4, string5, linkedHashMap, string6, questionnaireLoggingInfoCreateFromParcel, questionnaireQuestion, z4, z3, z, z2, (QuestionnaireProgressBarData) parcel.readParcelable(QuestionnaireGraphArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireGraphArgs[] newArray(int i) {
            return new QuestionnaireGraphArgs[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSkipSplashScreen() {
        return this.skipSplashScreen;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSkipCompletedScreen() {
        return this.skipCompletedScreen;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsBlocking() {
        return this.isBlocking;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* renamed from: component14, reason: from getter */
    public final QuestionnaireProgressBarData getProgressBarData() {
        return this.progressBarData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReferenceKey() {
        return this.referenceKey;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> component6() {
        return this.graph;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGraphRoot() {
        return this.graphRoot;
    }

    /* renamed from: component8, reason: from getter */
    public final QuestionnaireLoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final QuestionnaireQuestion getSelectedQuestion() {
        return this.selectedQuestion;
    }

    public final QuestionnaireGraphArgs copy(String context, String accountNumber, StringResource accountDisplayName, String applicationId, String referenceKey, Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, String graphRoot, QuestionnaireLoggingInfo loggingInfo, QuestionnaireQuestion selectedQuestion, boolean skipSplashScreen, boolean skipCompletedScreen, boolean isBlocking, boolean showProgressBar, QuestionnaireProgressBarData progressBarData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graphRoot, "graphRoot");
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        return new QuestionnaireGraphArgs(context, accountNumber, accountDisplayName, applicationId, referenceKey, graph, graphRoot, loggingInfo, selectedQuestion, skipSplashScreen, skipCompletedScreen, isBlocking, showProgressBar, progressBarData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireGraphArgs)) {
            return false;
        }
        QuestionnaireGraphArgs questionnaireGraphArgs = (QuestionnaireGraphArgs) other;
        return Intrinsics.areEqual(this.context, questionnaireGraphArgs.context) && Intrinsics.areEqual(this.accountNumber, questionnaireGraphArgs.accountNumber) && Intrinsics.areEqual(this.accountDisplayName, questionnaireGraphArgs.accountDisplayName) && Intrinsics.areEqual(this.applicationId, questionnaireGraphArgs.applicationId) && Intrinsics.areEqual(this.referenceKey, questionnaireGraphArgs.referenceKey) && Intrinsics.areEqual(this.graph, questionnaireGraphArgs.graph) && Intrinsics.areEqual(this.graphRoot, questionnaireGraphArgs.graphRoot) && Intrinsics.areEqual(this.loggingInfo, questionnaireGraphArgs.loggingInfo) && Intrinsics.areEqual(this.selectedQuestion, questionnaireGraphArgs.selectedQuestion) && this.skipSplashScreen == questionnaireGraphArgs.skipSplashScreen && this.skipCompletedScreen == questionnaireGraphArgs.skipCompletedScreen && this.isBlocking == questionnaireGraphArgs.isBlocking && this.showProgressBar == questionnaireGraphArgs.showProgressBar && Intrinsics.areEqual(this.progressBarData, questionnaireGraphArgs.progressBarData);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.accountDisplayName;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str2 = this.applicationId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referenceKey;
        int iHashCode5 = (((((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.graph.hashCode()) * 31) + this.graphRoot.hashCode()) * 31) + this.loggingInfo.hashCode()) * 31;
        QuestionnaireQuestion questionnaireQuestion = this.selectedQuestion;
        int iHashCode6 = (((((((((iHashCode5 + (questionnaireQuestion == null ? 0 : questionnaireQuestion.hashCode())) * 31) + Boolean.hashCode(this.skipSplashScreen)) * 31) + Boolean.hashCode(this.skipCompletedScreen)) * 31) + Boolean.hashCode(this.isBlocking)) * 31) + Boolean.hashCode(this.showProgressBar)) * 31;
        QuestionnaireProgressBarData questionnaireProgressBarData = this.progressBarData;
        return iHashCode6 + (questionnaireProgressBarData != null ? questionnaireProgressBarData.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireGraphArgs(context=" + this.context + ", accountNumber=" + this.accountNumber + ", accountDisplayName=" + this.accountDisplayName + ", applicationId=" + this.applicationId + ", referenceKey=" + this.referenceKey + ", graph=" + this.graph + ", graphRoot=" + this.graphRoot + ", loggingInfo=" + this.loggingInfo + ", selectedQuestion=" + this.selectedQuestion + ", skipSplashScreen=" + this.skipSplashScreen + ", skipCompletedScreen=" + this.skipCompletedScreen + ", isBlocking=" + this.isBlocking + ", showProgressBar=" + this.showProgressBar + ", progressBarData=" + this.progressBarData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.accountDisplayName, flags);
        dest.writeString(this.applicationId);
        dest.writeString(this.referenceKey);
        Map<String, UiQuestionnaireQuestion.Supported> map = this.graph;
        dest.writeInt(map.size());
        for (Map.Entry<String, UiQuestionnaireQuestion.Supported> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
        dest.writeString(this.graphRoot);
        this.loggingInfo.writeToParcel(dest, flags);
        dest.writeParcelable(this.selectedQuestion, flags);
        dest.writeInt(this.skipSplashScreen ? 1 : 0);
        dest.writeInt(this.skipCompletedScreen ? 1 : 0);
        dest.writeInt(this.isBlocking ? 1 : 0);
        dest.writeInt(this.showProgressBar ? 1 : 0);
        dest.writeParcelable(this.progressBarData, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionnaireGraphArgs(String context, String str, StringResource stringResource, String str2, String str3, Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, String graphRoot, QuestionnaireLoggingInfo loggingInfo, QuestionnaireQuestion questionnaireQuestion, boolean z, boolean z2, boolean z3, boolean z4, QuestionnaireProgressBarData questionnaireProgressBarData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graphRoot, "graphRoot");
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        this.context = context;
        this.accountNumber = str;
        this.accountDisplayName = stringResource;
        this.applicationId = str2;
        this.referenceKey = str3;
        this.graph = graph;
        this.graphRoot = graphRoot;
        this.loggingInfo = loggingInfo;
        this.selectedQuestion = questionnaireQuestion;
        this.skipSplashScreen = z;
        this.skipCompletedScreen = z2;
        this.isBlocking = z3;
        this.showProgressBar = z4;
        this.progressBarData = questionnaireProgressBarData;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getReferenceKey() {
        return this.referenceKey;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> getGraph() {
        return this.graph;
    }

    public final String getGraphRoot() {
        return this.graphRoot;
    }

    public final QuestionnaireLoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    public final QuestionnaireQuestion getSelectedQuestion() {
        return this.selectedQuestion;
    }

    public final boolean getSkipSplashScreen() {
        return this.skipSplashScreen;
    }

    public final boolean getSkipCompletedScreen() {
        return this.skipCompletedScreen;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final QuestionnaireProgressBarData getProgressBarData() {
        return this.progressBarData;
    }
}
