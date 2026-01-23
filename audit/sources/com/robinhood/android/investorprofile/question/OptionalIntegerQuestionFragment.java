package com.robinhood.android.investorprofile.question;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
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
import com.robinhood.android.questionnaire.p220ui.OptionalIntegerQuestionAnswer;
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

/* compiled from: OptionalIntegerQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u0015\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onOptionalIntegerQuestionAnswered", "answer", "Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OptionalIntegerQuestionFragment extends GenericComposeFragment implements OptionalIntegerQuestionScreen, QuestionableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionalIntegerQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OptionalIntegerQuestionFragment optionalIntegerQuestionFragment, int i, Composer composer, int i2) {
        optionalIntegerQuestionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
        Composer composerStartRestartGroup = composer.startRestartGroup(2099469986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2099469986, i2, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment.ComposeContent (OptionalIntegerQuestionFragment.kt:39)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(-615427230, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-615427230, i3, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment.ComposeContent.<anonymous> (OptionalIntegerQuestionFragment.kt:41)");
                    }
                    Companion companion = OptionalIntegerQuestionFragment.INSTANCE;
                    UiQuestionnaireQuestion.OptionalIntegerQuestion question = ((Args) companion.getArgs((Fragment) OptionalIntegerQuestionFragment.this)).getQuestion();
                    QuestionnaireLoggingInfo loggingInfo = ((Args) companion.getArgs((Fragment) OptionalIntegerQuestionFragment.this)).getLoggingInfo();
                    final OptionalIntegerQuestionFragment optionalIntegerQuestionFragment = OptionalIntegerQuestionFragment.this;
                    InvestorProfileComponents3.InvestorProfileQuestionContainer(question, loggingInfo, ComposableLambda3.rememberComposableLambda(-418948037, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(-418948037, i4, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment.ComposeContent.<anonymous>.<anonymous> (OptionalIntegerQuestionFragment.kt:45)");
                            }
                            Companion companion2 = OptionalIntegerQuestionFragment.INSTANCE;
                            OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen(((Args) companion2.getArgs((Fragment) optionalIntegerQuestionFragment)).getQuestion(), ((Args) companion2.getArgs((Fragment) optionalIntegerQuestionFragment)).getExistingAnswer(), optionalIntegerQuestionFragment, null, null, composer3, 0, 24);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionalIntegerQuestionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreen
    public void onOptionalIntegerQuestionAnswered(OptionalIntegerQuestionAnswer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        QuestionFragmentCallbacks<ContextualQuestionInfo> callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onQuestionAnswered(((Args) companion.getArgs((Fragment) this)).getContextualQuestionInfo(), new QuestionnaireAnswer.OptionalIntegerAnswer(((Args) companion.getArgs((Fragment) this)).getQuestion(), false, answer, 2, null));
    }

    /* compiled from: OptionalIntegerQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionFragment$Args;", "Landroid/os/Parcelable;", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "contextualQuestionInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "existingAnswer", "Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;)V", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getContextualQuestionInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getExistingAnswer", "()Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource accountDisplayName;
        private final ContextualQuestionInfo contextualQuestionInfo;
        private final OptionalIntegerQuestionAnswer existingAnswer;
        private final QuestionnaireLoggingInfo loggingInfo;
        private final UiQuestionnaireQuestion.OptionalIntegerQuestion question;

        /* compiled from: OptionalIntegerQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StringResource) parcel.readParcelable(Args.class.getClassLoader()), (ContextualQuestionInfo) parcel.readParcelable(Args.class.getClassLoader()), (UiQuestionnaireQuestion.OptionalIntegerQuestion) parcel.readParcelable(Args.class.getClassLoader()), QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel), (OptionalIntegerQuestionAnswer) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = args.accountDisplayName;
            }
            if ((i & 2) != 0) {
                contextualQuestionInfo = args.contextualQuestionInfo;
            }
            if ((i & 4) != 0) {
                optionalIntegerQuestion = args.question;
            }
            if ((i & 8) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            if ((i & 16) != 0) {
                optionalIntegerQuestionAnswer = args.existingAnswer;
            }
            OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer2 = optionalIntegerQuestionAnswer;
            UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion2 = optionalIntegerQuestion;
            return args.copy(stringResource, contextualQuestionInfo, optionalIntegerQuestion2, questionnaireLoggingInfo, optionalIntegerQuestionAnswer2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getAccountDisplayName() {
            return this.accountDisplayName;
        }

        /* renamed from: component2, reason: from getter */
        public final ContextualQuestionInfo getContextualQuestionInfo() {
            return this.contextualQuestionInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final UiQuestionnaireQuestion.OptionalIntegerQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component4, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionalIntegerQuestionAnswer getExistingAnswer() {
            return this.existingAnswer;
        }

        public final Args copy(StringResource accountDisplayName, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.OptionalIntegerQuestion question, QuestionnaireLoggingInfo loggingInfo, OptionalIntegerQuestionAnswer existingAnswer) {
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(accountDisplayName, contextualQuestionInfo, question, loggingInfo, existingAnswer);
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
            return Intrinsics.areEqual(this.accountDisplayName, args.accountDisplayName) && Intrinsics.areEqual(this.contextualQuestionInfo, args.contextualQuestionInfo) && Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo) && Intrinsics.areEqual(this.existingAnswer, args.existingAnswer);
        }

        public int hashCode() {
            StringResource stringResource = this.accountDisplayName;
            int iHashCode = (((((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.contextualQuestionInfo.hashCode()) * 31) + this.question.hashCode()) * 31) + this.loggingInfo.hashCode()) * 31;
            OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer = this.existingAnswer;
            return iHashCode + (optionalIntegerQuestionAnswer != null ? optionalIntegerQuestionAnswer.hashCode() : 0);
        }

        public String toString() {
            return "Args(accountDisplayName=" + this.accountDisplayName + ", contextualQuestionInfo=" + this.contextualQuestionInfo + ", question=" + this.question + ", loggingInfo=" + this.loggingInfo + ", existingAnswer=" + this.existingAnswer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountDisplayName, flags);
            dest.writeParcelable(this.contextualQuestionInfo, flags);
            dest.writeParcelable(this.question, flags);
            this.loggingInfo.writeToParcel(dest, flags);
            dest.writeParcelable(this.existingAnswer, flags);
        }

        public Args(StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.OptionalIntegerQuestion question, QuestionnaireLoggingInfo loggingInfo, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer) {
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.accountDisplayName = stringResource;
            this.contextualQuestionInfo = contextualQuestionInfo;
            this.question = question;
            this.loggingInfo = loggingInfo;
            this.existingAnswer = optionalIntegerQuestionAnswer;
        }

        public /* synthetic */ Args(StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stringResource, contextualQuestionInfo, optionalIntegerQuestion, questionnaireLoggingInfo, optionalIntegerQuestionAnswer);
        }

        public final StringResource getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public final ContextualQuestionInfo getContextualQuestionInfo() {
            return this.contextualQuestionInfo;
        }

        public final UiQuestionnaireQuestion.OptionalIntegerQuestion getQuestion() {
            return this.question;
        }

        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        public final OptionalIntegerQuestionAnswer getExistingAnswer() {
            return this.existingAnswer;
        }
    }

    /* compiled from: OptionalIntegerQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionFragment;", "Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionalIntegerQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionalIntegerQuestionFragment optionalIntegerQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionalIntegerQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionalIntegerQuestionFragment newInstance(Args args) {
            return (OptionalIntegerQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionalIntegerQuestionFragment optionalIntegerQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionalIntegerQuestionFragment, args);
        }
    }
}
