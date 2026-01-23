package com.robinhood.android.investorprofile.p162ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.questionnaire.api.ReviewPageType;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireReviewFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionnaireReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Callbacks;", "", "onConfirmSuccessful", "", "redirectUrl", "", "onQuestionSelected", "answer", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmSuccessful(String redirectUrl);

        void onQuestionSelected(UiQuestionnaireReview.QuestionAnswer answer, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(QuestionnaireReviewFragment questionnaireReviewFragment, int i, Composer composer, int i2) {
        questionnaireReviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1188286976);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188286976, i2, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment.ComposeContent (QuestionnaireReviewFragment.kt:34)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-141524664, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-141524664, i3, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment.ComposeContent.<anonymous> (QuestionnaireReviewFragment.kt:36)");
                    }
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                    QuestionnaireLoggingInfo loggingInfo = ((Args) QuestionnaireReviewFragment.INSTANCE.getArgs((Fragment) QuestionnaireReviewFragment.this)).getLoggingInfo();
                    Callbacks callbacks = QuestionnaireReviewFragment.this.getCallbacks();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(callbacks);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new QuestionnaireReviewFragment2(callbacks);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue;
                    composer2.endReplaceGroup();
                    Callbacks callbacks2 = QuestionnaireReviewFragment.this.getCallbacks();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(callbacks2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new QuestionnaireReviewFragment3(callbacks2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                    composer2.endReplaceGroup();
                    ActivityErrorHandler activityErrorHandler = QuestionnaireReviewFragment.this.getActivityErrorHandler();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(activityErrorHandler);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new QuestionnaireReviewFragment4(activityErrorHandler);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    QuestionnaireReviewScreen4.QuestionnaireReviewScreen(loggingInfo, (Function2) kFunction, (Function1) kFunction2, (Function1) objRememberedValue3, modifierNavigationBarsPadding, null, composer2, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireReviewFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: QuestionnaireReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Args;", "Landroid/os/Parcelable;", "context", "", "reviewPageType", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "applicationId", "Ljava/util/UUID;", "accountNumber", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ReviewPageType;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Ljava/util/UUID;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getReviewPageType", "()Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getApplicationId", "()Ljava/util/UUID;", "getAccountNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID applicationId;
        private final String context;
        private final QuestionnaireLoggingInfo loggingInfo;
        private final ReviewPageType reviewPageType;

        /* compiled from: QuestionnaireReviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : ReviewPageType.valueOf(parcel.readString()), QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, ReviewPageType reviewPageType, QuestionnaireLoggingInfo questionnaireLoggingInfo, UUID uuid, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.context;
            }
            if ((i & 2) != 0) {
                reviewPageType = args.reviewPageType;
            }
            if ((i & 4) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            if ((i & 8) != 0) {
                uuid = args.applicationId;
            }
            if ((i & 16) != 0) {
                str2 = args.accountNumber;
            }
            String str3 = str2;
            QuestionnaireLoggingInfo questionnaireLoggingInfo2 = questionnaireLoggingInfo;
            return args.copy(str, reviewPageType, questionnaireLoggingInfo2, uuid, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final ReviewPageType getReviewPageType() {
            return this.reviewPageType;
        }

        /* renamed from: component3, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String context, ReviewPageType reviewPageType, QuestionnaireLoggingInfo loggingInfo, UUID applicationId, String accountNumber) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(context, reviewPageType, loggingInfo, applicationId, accountNumber);
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
            return Intrinsics.areEqual(this.context, args.context) && this.reviewPageType == args.reviewPageType && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo) && Intrinsics.areEqual(this.applicationId, args.applicationId) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            ReviewPageType reviewPageType = this.reviewPageType;
            int iHashCode2 = (((iHashCode + (reviewPageType == null ? 0 : reviewPageType.hashCode())) * 31) + this.loggingInfo.hashCode()) * 31;
            UUID uuid = this.applicationId;
            int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(context=" + this.context + ", reviewPageType=" + this.reviewPageType + ", loggingInfo=" + this.loggingInfo + ", applicationId=" + this.applicationId + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.context);
            ReviewPageType reviewPageType = this.reviewPageType;
            if (reviewPageType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(reviewPageType.name());
            }
            this.loggingInfo.writeToParcel(dest, flags);
            dest.writeSerializable(this.applicationId);
            dest.writeString(this.accountNumber);
        }

        public Args(String context, ReviewPageType reviewPageType, QuestionnaireLoggingInfo loggingInfo, UUID uuid, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.context = context;
            this.reviewPageType = reviewPageType;
            this.loggingInfo = loggingInfo;
            this.applicationId = uuid;
            this.accountNumber = str;
        }

        public /* synthetic */ Args(String str, ReviewPageType reviewPageType, QuestionnaireLoggingInfo questionnaireLoggingInfo, UUID uuid, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : reviewPageType, questionnaireLoggingInfo, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : str2);
        }

        public final String getContext() {
            return this.context;
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

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: QuestionnaireReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireReviewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(QuestionnaireReviewFragment questionnaireReviewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireReviewFragment newInstance(Args args) {
            return (QuestionnaireReviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireReviewFragment questionnaireReviewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireReviewFragment, args);
        }
    }
}
