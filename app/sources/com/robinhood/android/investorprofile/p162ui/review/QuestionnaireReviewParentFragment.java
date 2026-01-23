package com.robinhood.android.investorprofile.p162ui.review;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.questionnaire.api.ReviewPageType;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireReview;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireReviewParentFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmSuccessful", "redirectUrl", "", "onQuestionSelected", "answer", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireReviewParentFragment extends BaseFragment implements QuestionnaireReviewFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public QuestionnaireReviewParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = C11048R.id.fragment_container;
        QuestionnaireReviewFragment.Companion companion = QuestionnaireReviewFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        setFragment(i, companion.newInstance((Parcelable) new QuestionnaireReviewFragment.Args(((Args) companion2.getArgs((Fragment) this)).getQuestionnaireContext(), ((Args) companion2.getArgs((Fragment) this)).getReviewPageType(), ((Args) companion2.getArgs((Fragment) this)).getLoggingInfo(), ((Args) companion2.getArgs((Fragment) this)).getApplicationId(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber())));
    }

    @Override // com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment.Callbacks
    public void onConfirmSuccessful(String redirectUrl) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
        if (redirectUrl != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(redirectUrl), null, null, false, null, 60, null);
        }
    }

    @Override // com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment.Callbacks
    public void onQuestionSelected(UiQuestionnaireReview.QuestionAnswer answer, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        String questionnaireContext = ((Args) companion.getArgs((Fragment) this)).getQuestionnaireContext();
        String accountNumber = ((Args) companion.getArgs((Fragment) this)).getAccountNumber();
        String key = answer.getKey();
        UiQuestionnaireReview.Answer answer2 = answer.getAnswer();
        String questionId = answer2 != null ? answer2.getQuestionId() : null;
        UiQuestionnaireReview.Answer answer3 = answer.getAnswer();
        QuestionnaireQuestion questionnaireQuestion = new QuestionnaireQuestion(key, answer3 != null ? answer3.getValue() : null, questionId);
        ReviewQueryParams reviewQueryParams = new ReviewQueryParams(((Args) companion.getArgs((Fragment) this)).getQuestionnaireContext(), ((Args) companion.getArgs((Fragment) this)).getReviewPageType(), ((Args) companion.getArgs((Fragment) this)).getApplicationId(), ((Args) companion.getArgs((Fragment) this)).getAccountNumber());
        UUID applicationId = ((Args) companion.getArgs((Fragment) this)).getApplicationId();
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Questionnaire(false, questionnaireContext, accountNumber, applicationId != null ? applicationId.toString() : null, null, questionnaireQuestion, false, false, false, false, false, ((Args) companion.getArgs((Fragment) this)).getLoggingInfo().getParams(), reviewQueryParams, true, false, false, false, false, null, questionGraph, 509904, null), null, false, null, null, 60, null);
    }

    /* compiled from: QuestionnaireReviewParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewParentFragment$Args;", "Landroid/os/Parcelable;", "questionnaireContext", "", "accountNumber", "reviewPageType", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "applicationId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ReviewPageType;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Ljava/util/UUID;)V", "getQuestionnaireContext", "()Ljava/lang/String;", "getAccountNumber", "getReviewPageType", "()Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getApplicationId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID applicationId;
        private final QuestionnaireLoggingInfo loggingInfo;
        private final String questionnaireContext;
        private final ReviewPageType reviewPageType;

        /* compiled from: QuestionnaireReviewParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReviewPageType.valueOf(parcel.readString()), QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, ReviewPageType reviewPageType, QuestionnaireLoggingInfo questionnaireLoggingInfo, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.questionnaireContext;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 4) != 0) {
                reviewPageType = args.reviewPageType;
            }
            if ((i & 8) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            if ((i & 16) != 0) {
                uuid = args.applicationId;
            }
            UUID uuid2 = uuid;
            ReviewPageType reviewPageType2 = reviewPageType;
            return args.copy(str, str2, reviewPageType2, questionnaireLoggingInfo, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuestionnaireContext() {
            return this.questionnaireContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final ReviewPageType getReviewPageType() {
            return this.reviewPageType;
        }

        /* renamed from: component4, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final Args copy(String questionnaireContext, String accountNumber, ReviewPageType reviewPageType, QuestionnaireLoggingInfo loggingInfo, UUID applicationId) {
            Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(questionnaireContext, accountNumber, reviewPageType, loggingInfo, applicationId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.questionnaireContext, args.questionnaireContext) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.reviewPageType == args.reviewPageType && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo) && Intrinsics.areEqual(this.applicationId, args.applicationId);
        }

        public int hashCode() {
            int iHashCode = this.questionnaireContext.hashCode() * 31;
            String str = this.accountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ReviewPageType reviewPageType = this.reviewPageType;
            int iHashCode3 = (((iHashCode2 + (reviewPageType == null ? 0 : reviewPageType.hashCode())) * 31) + this.loggingInfo.hashCode()) * 31;
            UUID uuid = this.applicationId;
            return iHashCode3 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Args(questionnaireContext=" + this.questionnaireContext + ", accountNumber=" + this.accountNumber + ", reviewPageType=" + this.reviewPageType + ", loggingInfo=" + this.loggingInfo + ", applicationId=" + this.applicationId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.questionnaireContext);
            dest.writeString(this.accountNumber);
            ReviewPageType reviewPageType = this.reviewPageType;
            if (reviewPageType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(reviewPageType.name());
            }
            this.loggingInfo.writeToParcel(dest, flags);
            dest.writeSerializable(this.applicationId);
        }

        public Args(String questionnaireContext, String str, ReviewPageType reviewPageType, QuestionnaireLoggingInfo loggingInfo, UUID uuid) {
            Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.questionnaireContext = questionnaireContext;
            this.accountNumber = str;
            this.reviewPageType = reviewPageType;
            this.loggingInfo = loggingInfo;
            this.applicationId = uuid;
        }

        public /* synthetic */ Args(String str, String str2, ReviewPageType reviewPageType, QuestionnaireLoggingInfo questionnaireLoggingInfo, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : reviewPageType, questionnaireLoggingInfo, (i & 16) != 0 ? null : uuid);
        }

        public final String getQuestionnaireContext() {
            return this.questionnaireContext;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ReviewPageType getReviewPageType() {
            return this.reviewPageType;
        }

        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }
    }

    /* compiled from: QuestionnaireReviewParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireReview;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewParentFragment;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewParentFragment$Args;", "<init>", "()V", "createFragment", "key", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<QuestionnaireReview>, FragmentWithArgsCompanion<QuestionnaireReviewParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(QuestionnaireReviewParentFragment questionnaireReviewParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireReviewParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireReviewParentFragment newInstance(Args args) {
            return (QuestionnaireReviewParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireReviewParentFragment questionnaireReviewParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireReviewParentFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public QuestionnaireReviewParentFragment createFragment(QuestionnaireReview key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (QuestionnaireReviewParentFragment) newInstance((Parcelable) new Args(key.getContext(), key.getAccountNumber(), key.getReviewPageType(), new QuestionnaireLoggingInfo(key.getContext(), key.getLoggingParams()), key.getApplicationId()));
        }
    }
}
