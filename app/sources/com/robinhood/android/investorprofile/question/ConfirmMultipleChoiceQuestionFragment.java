package com.robinhood.android.investorprofile.question;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionFragmentCallbacks;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
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
import kotlin.reflect.KProperty;

/* compiled from: ConfirmMultipleChoiceQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u0015\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionableFragment;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionCallbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onConfirmMultipleChoiceQuestionAnswered", "answer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$MultipleChoiceAnswer;", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ConfirmMultipleChoiceQuestionFragment extends GenericComposeFragment implements QuestionableFragment, ConfirmMultipleChoiceQuestionScreen {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ConfirmMultipleChoiceQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ConfirmMultipleChoiceQuestionFragment confirmMultipleChoiceQuestionFragment, int i, Composer composer, int i2) {
        confirmMultipleChoiceQuestionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment
    public boolean isAccountBasedQuestion() {
        return QuestionableFragment.DefaultImpls.isAccountBasedQuestion(this);
    }

    private final QuestionFragmentCallbacks<ContextualQuestionInfo> getCallbacks() {
        return (QuestionFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment
    public UiQuestionnaireQuestion.Supported getQuestion() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getQuestion();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (isAccountBasedQuestion()) {
            StringResource accountDisplayName = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountDisplayName();
            if (accountDisplayName != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = accountDisplayName.getText(resources);
            } else {
                text = null;
            }
            toolbar.setTitle(text);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1049004164);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1049004164, i2, -1, "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment.ComposeContent (ConfirmMultipleChoiceQuestionFragment.kt:44)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(144591932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(144591932, i3, -1, "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment.ComposeContent.<anonymous> (ConfirmMultipleChoiceQuestionFragment.kt:46)");
                    }
                    Companion companion = ConfirmMultipleChoiceQuestionFragment.INSTANCE;
                    UiQuestionnaireQuestion.MultipleChoiceQuestion question = ((Args) companion.getArgs((Fragment) ConfirmMultipleChoiceQuestionFragment.this)).getQuestion();
                    QuestionnaireLoggingInfo loggingInfo = ((Args) companion.getArgs((Fragment) ConfirmMultipleChoiceQuestionFragment.this)).getLoggingInfo();
                    final ConfirmMultipleChoiceQuestionFragment confirmMultipleChoiceQuestionFragment = ConfirmMultipleChoiceQuestionFragment.this;
                    InvestorProfileComponents3.InvestorProfileQuestionContainer(question, loggingInfo, ComposableLambda3.rememberComposableLambda(2023282581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2023282581, i4, -1, "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment.ComposeContent.<anonymous>.<anonymous> (ConfirmMultipleChoiceQuestionFragment.kt:50)");
                            }
                            Companion companion2 = ConfirmMultipleChoiceQuestionFragment.INSTANCE;
                            ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen(((Args) companion2.getArgs((Fragment) confirmMultipleChoiceQuestionFragment)).getAccountNumber(), ((Args) companion2.getArgs((Fragment) confirmMultipleChoiceQuestionFragment)).getQuestionnaireContext(), ((Args) companion2.getArgs((Fragment) confirmMultipleChoiceQuestionFragment)).getQuestion(), ((Args) companion2.getArgs((Fragment) confirmMultipleChoiceQuestionFragment)).getShowExistingAnswer(), WindowInsetsPadding6.windowInsetsPadding(Modifier.INSTANCE, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer3, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), confirmMultipleChoiceQuestionFragment, null, composer3, 0, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmMultipleChoiceQuestionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreen
    public void onConfirmMultipleChoiceQuestionAnswered(QuestionnaireAnswer.MultipleChoiceAnswer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        getCallbacks().onQuestionAnswered(((Args) INSTANCE.getArgs((Fragment) this)).getContextualQuestionInfo(), answer);
    }

    /* compiled from: ConfirmMultipleChoiceQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JS\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionFragment$Args;", "Landroid/os/Parcelable;", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "accountNumber", "", "questionnaireContext", "contextualQuestionInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "showExistingAnswer", "", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;ZLcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;)V", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountNumber", "()Ljava/lang/String;", "getQuestionnaireContext", "getContextualQuestionInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getShowExistingAnswer", "()Z", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource accountDisplayName;
        private final String accountNumber;
        private final ContextualQuestionInfo contextualQuestionInfo;
        private final QuestionnaireLoggingInfo loggingInfo;
        private final UiQuestionnaireQuestion.MultipleChoiceQuestion question;
        private final String questionnaireContext;
        private final boolean showExistingAnswer;

        /* compiled from: ConfirmMultipleChoiceQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StringResource) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readString(), (ContextualQuestionInfo) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, (UiQuestionnaireQuestion.MultipleChoiceQuestion) parcel.readParcelable(Args.class.getClassLoader()), QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, StringResource stringResource, String str, String str2, ContextualQuestionInfo contextualQuestionInfo, boolean z, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = args.accountDisplayName;
            }
            if ((i & 2) != 0) {
                str = args.accountNumber;
            }
            if ((i & 4) != 0) {
                str2 = args.questionnaireContext;
            }
            if ((i & 8) != 0) {
                contextualQuestionInfo = args.contextualQuestionInfo;
            }
            if ((i & 16) != 0) {
                z = args.showExistingAnswer;
            }
            if ((i & 32) != 0) {
                multipleChoiceQuestion = args.question;
            }
            if ((i & 64) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion2 = multipleChoiceQuestion;
            QuestionnaireLoggingInfo questionnaireLoggingInfo2 = questionnaireLoggingInfo;
            boolean z2 = z;
            String str3 = str2;
            return args.copy(stringResource, str, str3, contextualQuestionInfo, z2, multipleChoiceQuestion2, questionnaireLoggingInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getAccountDisplayName() {
            return this.accountDisplayName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getQuestionnaireContext() {
            return this.questionnaireContext;
        }

        /* renamed from: component4, reason: from getter */
        public final ContextualQuestionInfo getContextualQuestionInfo() {
            return this.contextualQuestionInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowExistingAnswer() {
            return this.showExistingAnswer;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component7, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        public final Args copy(StringResource accountDisplayName, String accountNumber, String questionnaireContext, ContextualQuestionInfo contextualQuestionInfo, boolean showExistingAnswer, UiQuestionnaireQuestion.MultipleChoiceQuestion question, QuestionnaireLoggingInfo loggingInfo) {
            Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(accountDisplayName, accountNumber, questionnaireContext, contextualQuestionInfo, showExistingAnswer, question, loggingInfo);
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
            return Intrinsics.areEqual(this.accountDisplayName, args.accountDisplayName) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.questionnaireContext, args.questionnaireContext) && Intrinsics.areEqual(this.contextualQuestionInfo, args.contextualQuestionInfo) && this.showExistingAnswer == args.showExistingAnswer && Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo);
        }

        public int hashCode() {
            StringResource stringResource = this.accountDisplayName;
            int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
            String str = this.accountNumber;
            return ((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.questionnaireContext.hashCode()) * 31) + this.contextualQuestionInfo.hashCode()) * 31) + Boolean.hashCode(this.showExistingAnswer)) * 31) + this.question.hashCode()) * 31) + this.loggingInfo.hashCode();
        }

        public String toString() {
            return "Args(accountDisplayName=" + this.accountDisplayName + ", accountNumber=" + this.accountNumber + ", questionnaireContext=" + this.questionnaireContext + ", contextualQuestionInfo=" + this.contextualQuestionInfo + ", showExistingAnswer=" + this.showExistingAnswer + ", question=" + this.question + ", loggingInfo=" + this.loggingInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountDisplayName, flags);
            dest.writeString(this.accountNumber);
            dest.writeString(this.questionnaireContext);
            dest.writeParcelable(this.contextualQuestionInfo, flags);
            dest.writeInt(this.showExistingAnswer ? 1 : 0);
            dest.writeParcelable(this.question, flags);
            this.loggingInfo.writeToParcel(dest, flags);
        }

        public Args(StringResource stringResource, String str, String questionnaireContext, ContextualQuestionInfo contextualQuestionInfo, boolean z, UiQuestionnaireQuestion.MultipleChoiceQuestion question, QuestionnaireLoggingInfo loggingInfo) {
            Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.accountDisplayName = stringResource;
            this.accountNumber = str;
            this.questionnaireContext = questionnaireContext;
            this.contextualQuestionInfo = contextualQuestionInfo;
            this.showExistingAnswer = z;
            this.question = question;
            this.loggingInfo = loggingInfo;
        }

        public /* synthetic */ Args(StringResource stringResource, String str, String str2, ContextualQuestionInfo contextualQuestionInfo, boolean z, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stringResource, str, str2, contextualQuestionInfo, z, multipleChoiceQuestion, questionnaireLoggingInfo);
        }

        public final StringResource getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getQuestionnaireContext() {
            return this.questionnaireContext;
        }

        public final ContextualQuestionInfo getContextualQuestionInfo() {
            return this.contextualQuestionInfo;
        }

        public final boolean getShowExistingAnswer() {
            return this.showExistingAnswer;
        }

        public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }

        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }
    }

    /* compiled from: ConfirmMultipleChoiceQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionFragment;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ConfirmMultipleChoiceQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ConfirmMultipleChoiceQuestionFragment confirmMultipleChoiceQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, confirmMultipleChoiceQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ConfirmMultipleChoiceQuestionFragment newInstance(Args args) {
            return (ConfirmMultipleChoiceQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ConfirmMultipleChoiceQuestionFragment confirmMultipleChoiceQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, confirmMultipleChoiceQuestionFragment, args);
        }
    }
}
