package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Questionnaire.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bå\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0012HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003Jë\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0001J\u0006\u0010P\u001a\u00020QJ\u0013\u0010R\u001a\u00020\u00042\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020QHÖ\u0001J\t\u0010V\u001a\u00020\u0006HÖ\u0001J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020QR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "isBlocking", "", "context", "", "accountNumber", "applicationId", "referenceKey", "investorProfileQuestion", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "fromGold", "skipSplashScreens", "skipCompletedScreen", "skipSubmitData", "showReviewScreen", "loggingParams", "Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "reviewQueryParams", "Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "includeQuestionsAlreadyAnswered", "showProgressBar", "showExistingAnswer", "useCloseButtonForReview", "useInfoGatherFlow", "progressBarData", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;ZZZZZLcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;ZZZZZLcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;Ljava/util/Map;)V", "()Z", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getApplicationId", "getReferenceKey", "getInvestorProfileQuestion", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "getFromGold", "getSkipSplashScreens", "getSkipCompletedScreen", "getSkipSubmitData", "getShowReviewScreen", "getLoggingParams", "()Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "getReviewQueryParams", "()Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "getIncludeQuestionsAlreadyAnswered", "getShowProgressBar", "getShowExistingAnswer", "getUseCloseButtonForReview", "getUseInfoGatherFlow", "getProgressBarData", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "getQuestionGraph", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Questionnaire implements IntentKey, Parcelable {
    public static final Parcelable.Creator<Questionnaire> CREATOR = new Creator();
    private final String accountNumber;
    private final String applicationId;
    private final String context;
    private final boolean fromGold;
    private final boolean includeQuestionsAlreadyAnswered;
    private final QuestionnaireQuestion investorProfileQuestion;
    private final boolean isBlocking;
    private final QuestionnaireLoggingParams loggingParams;
    private final QuestionnaireProgressBarData progressBarData;
    private final Map<String, UiQuestionnaireQuestion.Supported> questionGraph;
    private final String referenceKey;
    private final ReviewQueryParams reviewQueryParams;
    private final boolean showExistingAnswer;
    private final boolean showProgressBar;
    private final boolean showReviewScreen;
    private final boolean skipCompletedScreen;
    private final boolean skipSplashScreens;
    private final boolean skipSubmitData;
    private final boolean useCloseButtonForReview;
    private final boolean useInfoGatherFlow;

    /* compiled from: Questionnaire.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Questionnaire> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Questionnaire createFromParcel(Parcel parcel) {
            QuestionnaireLoggingParams questionnaireLoggingParams;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            QuestionnaireQuestion questionnaireQuestionCreateFromParcel = parcel.readInt() == 0 ? null : QuestionnaireQuestion.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            QuestionnaireLoggingParams questionnaireLoggingParams2 = (QuestionnaireLoggingParams) parcel.readParcelable(Questionnaire.class.getClassLoader());
            ReviewQueryParams reviewQueryParams = (ReviewQueryParams) parcel.readParcelable(Questionnaire.class.getClassLoader());
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            QuestionnaireProgressBarData questionnaireProgressBarDataCreateFromParcel = parcel.readInt() == 0 ? null : QuestionnaireProgressBarData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                questionnaireLoggingParams = questionnaireLoggingParams2;
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                questionnaireLoggingParams = questionnaireLoggingParams2;
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(Questionnaire.class.getClassLoader()));
                    i2++;
                    reviewQueryParams = reviewQueryParams;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Questionnaire(z, string2, string3, string4, string5, questionnaireQuestionCreateFromParcel, z2, z3, z4, z5, z6, questionnaireLoggingParams, reviewQueryParams, z7, z8, z9, z10, z11, questionnaireProgressBarDataCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Questionnaire[] newArray(int i) {
            return new Questionnaire[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str) {
        this(z, context, str, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2) {
        this(z, context, str, str2, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048560, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3) {
        this(z, context, str, str2, str3, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048544, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion) {
        this(z, context, str, str2, str3, questionnaireQuestion, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048512, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048448, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, false, false, false, null, null, false, false, false, false, false, null, null, 1048320, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, false, false, null, null, false, false, false, false, false, null, null, 1048064, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, false, null, null, false, false, false, false, false, null, null, 1047552, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, null, null, false, false, false, false, false, null, null, 1046528, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, null, false, false, false, false, false, null, null, 1044480, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, false, false, false, false, false, null, null, 1040384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, false, false, false, false, null, null, 1032192, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, z8, false, false, false, null, null, 1015808, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, z8, z9, false, false, null, null, 983040, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, z8, z9, z10, false, null, null, 917504, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, z8, z9, z10, z11, null, null, 786432, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, QuestionnaireProgressBarData questionnaireProgressBarData) {
        this(z, context, str, str2, str3, questionnaireQuestion, z2, z3, z4, z5, z6, loggingParams, reviewQueryParams, z7, z8, z9, z10, z11, questionnaireProgressBarData, null, 524288, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }

    public static /* synthetic */ Questionnaire copy$default(Questionnaire questionnaire, boolean z, String str, String str2, String str3, String str4, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams questionnaireLoggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, QuestionnaireProgressBarData questionnaireProgressBarData, Map map, int i, Object obj) {
        Map map2;
        QuestionnaireProgressBarData questionnaireProgressBarData2;
        boolean z12 = (i & 1) != 0 ? questionnaire.isBlocking : z;
        String str5 = (i & 2) != 0 ? questionnaire.context : str;
        String str6 = (i & 4) != 0 ? questionnaire.accountNumber : str2;
        String str7 = (i & 8) != 0 ? questionnaire.applicationId : str3;
        String str8 = (i & 16) != 0 ? questionnaire.referenceKey : str4;
        QuestionnaireQuestion questionnaireQuestion2 = (i & 32) != 0 ? questionnaire.investorProfileQuestion : questionnaireQuestion;
        boolean z13 = (i & 64) != 0 ? questionnaire.fromGold : z2;
        boolean z14 = (i & 128) != 0 ? questionnaire.skipSplashScreens : z3;
        boolean z15 = (i & 256) != 0 ? questionnaire.skipCompletedScreen : z4;
        boolean z16 = (i & 512) != 0 ? questionnaire.skipSubmitData : z5;
        boolean z17 = (i & 1024) != 0 ? questionnaire.showReviewScreen : z6;
        QuestionnaireLoggingParams questionnaireLoggingParams2 = (i & 2048) != 0 ? questionnaire.loggingParams : questionnaireLoggingParams;
        ReviewQueryParams reviewQueryParams2 = (i & 4096) != 0 ? questionnaire.reviewQueryParams : reviewQueryParams;
        boolean z18 = (i & 8192) != 0 ? questionnaire.includeQuestionsAlreadyAnswered : z7;
        boolean z19 = z12;
        boolean z20 = (i & 16384) != 0 ? questionnaire.showProgressBar : z8;
        boolean z21 = (i & 32768) != 0 ? questionnaire.showExistingAnswer : z9;
        boolean z22 = (i & 65536) != 0 ? questionnaire.useCloseButtonForReview : z10;
        boolean z23 = (i & 131072) != 0 ? questionnaire.useInfoGatherFlow : z11;
        QuestionnaireProgressBarData questionnaireProgressBarData3 = (i & 262144) != 0 ? questionnaire.progressBarData : questionnaireProgressBarData;
        if ((i & 524288) != 0) {
            questionnaireProgressBarData2 = questionnaireProgressBarData3;
            map2 = questionnaire.questionGraph;
        } else {
            map2 = map;
            questionnaireProgressBarData2 = questionnaireProgressBarData3;
        }
        return questionnaire.copy(z19, str5, str6, str7, str8, questionnaireQuestion2, z13, z14, z15, z16, z17, questionnaireLoggingParams2, reviewQueryParams2, z18, z20, z21, z22, z23, questionnaireProgressBarData2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBlocking() {
        return this.isBlocking;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSkipSubmitData() {
        return this.skipSubmitData;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowReviewScreen() {
        return this.showReviewScreen;
    }

    /* renamed from: component12, reason: from getter */
    public final QuestionnaireLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    /* renamed from: component13, reason: from getter */
    public final ReviewQueryParams getReviewQueryParams() {
        return this.reviewQueryParams;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIncludeQuestionsAlreadyAnswered() {
        return this.includeQuestionsAlreadyAnswered;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowExistingAnswer() {
        return this.showExistingAnswer;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getUseCloseButtonForReview() {
        return this.useCloseButtonForReview;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getUseInfoGatherFlow() {
        return this.useInfoGatherFlow;
    }

    /* renamed from: component19, reason: from getter */
    public final QuestionnaireProgressBarData getProgressBarData() {
        return this.progressBarData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> component20() {
        return this.questionGraph;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReferenceKey() {
        return this.referenceKey;
    }

    /* renamed from: component6, reason: from getter */
    public final QuestionnaireQuestion getInvestorProfileQuestion() {
        return this.investorProfileQuestion;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFromGold() {
        return this.fromGold;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSkipSplashScreens() {
        return this.skipSplashScreens;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getSkipCompletedScreen() {
        return this.skipCompletedScreen;
    }

    public final Questionnaire copy(boolean isBlocking, String context, String accountNumber, String applicationId, String referenceKey, QuestionnaireQuestion investorProfileQuestion, boolean fromGold, boolean skipSplashScreens, boolean skipCompletedScreen, boolean skipSubmitData, boolean showReviewScreen, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean includeQuestionsAlreadyAnswered, boolean showProgressBar, boolean showExistingAnswer, boolean useCloseButtonForReview, boolean useInfoGatherFlow, QuestionnaireProgressBarData progressBarData, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        return new Questionnaire(isBlocking, context, accountNumber, applicationId, referenceKey, investorProfileQuestion, fromGold, skipSplashScreens, skipCompletedScreen, skipSubmitData, showReviewScreen, loggingParams, reviewQueryParams, includeQuestionsAlreadyAnswered, showProgressBar, showExistingAnswer, useCloseButtonForReview, useInfoGatherFlow, progressBarData, questionGraph);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Questionnaire)) {
            return false;
        }
        Questionnaire questionnaire = (Questionnaire) other;
        return this.isBlocking == questionnaire.isBlocking && Intrinsics.areEqual(this.context, questionnaire.context) && Intrinsics.areEqual(this.accountNumber, questionnaire.accountNumber) && Intrinsics.areEqual(this.applicationId, questionnaire.applicationId) && Intrinsics.areEqual(this.referenceKey, questionnaire.referenceKey) && Intrinsics.areEqual(this.investorProfileQuestion, questionnaire.investorProfileQuestion) && this.fromGold == questionnaire.fromGold && this.skipSplashScreens == questionnaire.skipSplashScreens && this.skipCompletedScreen == questionnaire.skipCompletedScreen && this.skipSubmitData == questionnaire.skipSubmitData && this.showReviewScreen == questionnaire.showReviewScreen && Intrinsics.areEqual(this.loggingParams, questionnaire.loggingParams) && Intrinsics.areEqual(this.reviewQueryParams, questionnaire.reviewQueryParams) && this.includeQuestionsAlreadyAnswered == questionnaire.includeQuestionsAlreadyAnswered && this.showProgressBar == questionnaire.showProgressBar && this.showExistingAnswer == questionnaire.showExistingAnswer && this.useCloseButtonForReview == questionnaire.useCloseButtonForReview && this.useInfoGatherFlow == questionnaire.useInfoGatherFlow && Intrinsics.areEqual(this.progressBarData, questionnaire.progressBarData) && Intrinsics.areEqual(this.questionGraph, questionnaire.questionGraph);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isBlocking) * 31) + this.context.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referenceKey;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        QuestionnaireQuestion questionnaireQuestion = this.investorProfileQuestion;
        int iHashCode5 = (((((((((((((iHashCode4 + (questionnaireQuestion == null ? 0 : questionnaireQuestion.hashCode())) * 31) + Boolean.hashCode(this.fromGold)) * 31) + Boolean.hashCode(this.skipSplashScreens)) * 31) + Boolean.hashCode(this.skipCompletedScreen)) * 31) + Boolean.hashCode(this.skipSubmitData)) * 31) + Boolean.hashCode(this.showReviewScreen)) * 31) + this.loggingParams.hashCode()) * 31;
        ReviewQueryParams reviewQueryParams = this.reviewQueryParams;
        int iHashCode6 = (((((((((((iHashCode5 + (reviewQueryParams == null ? 0 : reviewQueryParams.hashCode())) * 31) + Boolean.hashCode(this.includeQuestionsAlreadyAnswered)) * 31) + Boolean.hashCode(this.showProgressBar)) * 31) + Boolean.hashCode(this.showExistingAnswer)) * 31) + Boolean.hashCode(this.useCloseButtonForReview)) * 31) + Boolean.hashCode(this.useInfoGatherFlow)) * 31;
        QuestionnaireProgressBarData questionnaireProgressBarData = this.progressBarData;
        int iHashCode7 = (iHashCode6 + (questionnaireProgressBarData == null ? 0 : questionnaireProgressBarData.hashCode())) * 31;
        Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Questionnaire(isBlocking=" + this.isBlocking + ", context=" + this.context + ", accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", referenceKey=" + this.referenceKey + ", investorProfileQuestion=" + this.investorProfileQuestion + ", fromGold=" + this.fromGold + ", skipSplashScreens=" + this.skipSplashScreens + ", skipCompletedScreen=" + this.skipCompletedScreen + ", skipSubmitData=" + this.skipSubmitData + ", showReviewScreen=" + this.showReviewScreen + ", loggingParams=" + this.loggingParams + ", reviewQueryParams=" + this.reviewQueryParams + ", includeQuestionsAlreadyAnswered=" + this.includeQuestionsAlreadyAnswered + ", showProgressBar=" + this.showProgressBar + ", showExistingAnswer=" + this.showExistingAnswer + ", useCloseButtonForReview=" + this.useCloseButtonForReview + ", useInfoGatherFlow=" + this.useInfoGatherFlow + ", progressBarData=" + this.progressBarData + ", questionGraph=" + this.questionGraph + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isBlocking ? 1 : 0);
        dest.writeString(this.context);
        dest.writeString(this.accountNumber);
        dest.writeString(this.applicationId);
        dest.writeString(this.referenceKey);
        QuestionnaireQuestion questionnaireQuestion = this.investorProfileQuestion;
        if (questionnaireQuestion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            questionnaireQuestion.writeToParcel(dest, flags);
        }
        dest.writeInt(this.fromGold ? 1 : 0);
        dest.writeInt(this.skipSplashScreens ? 1 : 0);
        dest.writeInt(this.skipCompletedScreen ? 1 : 0);
        dest.writeInt(this.skipSubmitData ? 1 : 0);
        dest.writeInt(this.showReviewScreen ? 1 : 0);
        dest.writeParcelable(this.loggingParams, flags);
        dest.writeParcelable(this.reviewQueryParams, flags);
        dest.writeInt(this.includeQuestionsAlreadyAnswered ? 1 : 0);
        dest.writeInt(this.showProgressBar ? 1 : 0);
        dest.writeInt(this.showExistingAnswer ? 1 : 0);
        dest.writeInt(this.useCloseButtonForReview ? 1 : 0);
        dest.writeInt(this.useInfoGatherFlow ? 1 : 0);
        QuestionnaireProgressBarData questionnaireProgressBarData = this.progressBarData;
        if (questionnaireProgressBarData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            questionnaireProgressBarData.writeToParcel(dest, flags);
        }
        Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, UiQuestionnaireQuestion.Supported> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Questionnaire(boolean z, String context, String str, String str2, String str3, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams loggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, QuestionnaireProgressBarData questionnaireProgressBarData, Map<String, ? extends UiQuestionnaireQuestion.Supported> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        this.isBlocking = z;
        this.context = context;
        this.accountNumber = str;
        this.applicationId = str2;
        this.referenceKey = str3;
        this.investorProfileQuestion = questionnaireQuestion;
        this.fromGold = z2;
        this.skipSplashScreens = z3;
        this.skipCompletedScreen = z4;
        this.skipSubmitData = z5;
        this.showReviewScreen = z6;
        this.loggingParams = loggingParams;
        this.reviewQueryParams = reviewQueryParams;
        this.includeQuestionsAlreadyAnswered = z7;
        this.showProgressBar = z8;
        this.showExistingAnswer = z9;
        this.useCloseButtonForReview = z10;
        this.useInfoGatherFlow = z11;
        this.progressBarData = questionnaireProgressBarData;
        this.questionGraph = map;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getReferenceKey() {
        return this.referenceKey;
    }

    public final QuestionnaireQuestion getInvestorProfileQuestion() {
        return this.investorProfileQuestion;
    }

    public final boolean getFromGold() {
        return this.fromGold;
    }

    public final boolean getSkipSplashScreens() {
        return this.skipSplashScreens;
    }

    public final boolean getSkipCompletedScreen() {
        return this.skipCompletedScreen;
    }

    public final boolean getSkipSubmitData() {
        return this.skipSubmitData;
    }

    public final boolean getShowReviewScreen() {
        return this.showReviewScreen;
    }

    public /* synthetic */ Questionnaire(boolean z, String str, String str2, String str3, String str4, QuestionnaireQuestion questionnaireQuestion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, QuestionnaireLoggingParams questionnaireLoggingParams, ReviewQueryParams reviewQueryParams, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, QuestionnaireProgressBarData questionnaireProgressBarData, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : questionnaireQuestion, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? new QuestionnaireLoggingParams(null, null, 3, null) : questionnaireLoggingParams, (i & 4096) != 0 ? null : reviewQueryParams, (i & 8192) != 0 ? false : z7, (i & 16384) != 0 ? false : z8, (32768 & i) != 0 ? false : z9, (65536 & i) != 0 ? true : z10, (131072 & i) != 0 ? false : z11, (262144 & i) != 0 ? null : questionnaireProgressBarData, (i & 524288) != 0 ? null : map);
    }

    public final QuestionnaireLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final ReviewQueryParams getReviewQueryParams() {
        return this.reviewQueryParams;
    }

    public final boolean getIncludeQuestionsAlreadyAnswered() {
        return this.includeQuestionsAlreadyAnswered;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final boolean getShowExistingAnswer() {
        return this.showExistingAnswer;
    }

    public final boolean getUseCloseButtonForReview() {
        return this.useCloseButtonForReview;
    }

    public final boolean getUseInfoGatherFlow() {
        return this.useInfoGatherFlow;
    }

    public final QuestionnaireProgressBarData getProgressBarData() {
        return this.progressBarData;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> getQuestionGraph() {
        return this.questionGraph;
    }
}
