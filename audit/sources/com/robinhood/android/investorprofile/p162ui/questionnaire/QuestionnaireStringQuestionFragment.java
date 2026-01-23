package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.databinding.FragmentQuestionnaireStringQuestionBinding;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireStringQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002>?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000204H\u0016J\b\u00108\u001a\u000204H\u0016J\u001a\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0015\u0010&\u001a\u00060'j\u0002`(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireStringQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/investorprofile/databinding/FragmentQuestionnaireStringQuestionBinding;", "getBinding", "()Lcom/robinhood/android/investorprofile/databinding/FragmentQuestionnaireStringQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "callbacks$delegate", "maxLength", "", "getMaxLength", "()I", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireStringQuestionFragment extends BaseFragment implements AutoLoggableFragment, QuestionableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireStringQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/investorprofile/databinding/FragmentQuestionnaireStringQuestionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(QuestionnaireStringQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment
    public boolean isAccountBasedQuestion() {
        return QuestionableFragment.DefaultImpls.isAccountBasedQuestion(this);
    }

    public QuestionnaireStringQuestionFragment() {
        super(C19641R.layout.fragment_questionnaire_string_question);
        this.binding = ViewBinding5.viewBinding(this, QuestionnaireStringQuestionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireStringQuestionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final FragmentQuestionnaireStringQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionnaireStringQuestionBinding) value;
    }

    private final QuestionFragmentCallbacks<ContextualQuestionInfo> getCallbacks() {
        return (QuestionFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final int getMaxLength() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getStringQuestion().getContent().getMaxLength();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.INVESTOR_PROFILE_QUESTION, null, ((Args) INSTANCE.getArgs((Fragment) this)).getStringQuestion().getKey(), null, 10, null);
    }

    public final Context getEventContext() {
        return QuestionnaireLoggingInfo.toEventContext$default(((Args) INSTANCE.getArgs((Fragment) this)).getLoggingInfo(), null, 1, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, getEventContext(), null, null, 109, null);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionableFragment
    public UiQuestionnaireQuestion.Supported getQuestion() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getStringQuestion();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText editTxt = getBinding().editTxt;
        Intrinsics.checkNotNullExpressionValue(editTxt, "editTxt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(editTxt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireStringQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionnaireStringQuestionFragment.onResume$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RdsTextInputEditText editTxt2 = getBinding().editTxt;
        Intrinsics.checkNotNullExpressionValue(editTxt2, "editTxt");
        ContextsUiExtensions.showKeyboard$default(contextRequireContext, editTxt2, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(final QuestionnaireStringQuestionFragment questionnaireStringQuestionFragment, final CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        questionnaireStringQuestionFragment.getBinding().continueBtn.setEnabled(input.length() > 0 && input.length() <= questionnaireStringQuestionFragment.getMaxLength());
        if (input.length() > 0) {
            RdsButton continueBtn = questionnaireStringQuestionFragment.getBinding().continueBtn;
            Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
            OnClickListeners.onClick(continueBtn, new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireStringQuestionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuestionnaireStringQuestionFragment.onResume$lambda$1$lambda$0(this.f$0, input);
                }
            });
        } else {
            questionnaireStringQuestionFragment.getBinding().continueBtn.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1$lambda$0(QuestionnaireStringQuestionFragment questionnaireStringQuestionFragment, CharSequence charSequence) {
        QuestionFragmentCallbacks<ContextualQuestionInfo> callbacks = questionnaireStringQuestionFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onQuestionAnswered(((Args) companion.getArgs((Fragment) questionnaireStringQuestionFragment)).getContextualQuestionInfo(), new QuestionnaireAnswer.StringAnswer(((Args) companion.getArgs((Fragment) questionnaireStringQuestionFragment)).getStringQuestion(), false, charSequence.toString(), 2, null));
        EventLogger.DefaultImpls.logTap$default(questionnaireStringQuestionFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, questionnaireStringQuestionFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, questionnaireStringQuestionFragment.getEventContext(), false, 40, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentQuestionnaireStringQuestionBinding binding = getBinding();
        RhTextView rhTextView = binding.titleTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getStringQuestion().getTitle());
        binding.subtitleTxt.setSpannableString(new SpannableString(getMarkwon().toMarkdown(((Args) companion.getArgs((Fragment) this)).getStringQuestion().getSubtitle())));
        binding.editTxt.setHint(((Args) companion.getArgs((Fragment) this)).getStringQuestion().getContent().getPlaceholder());
        String disclosureMarkdown = ((Args) companion.getArgs((Fragment) this)).getStringQuestion().getDisclosureMarkdown();
        if (disclosureMarkdown != null) {
            RhTextView disclosureTxt = binding.disclosureTxt;
            Intrinsics.checkNotNullExpressionValue(disclosureTxt, "disclosureTxt");
            TextViewsKt.setVisibilityText(disclosureTxt, getMarkwon().toMarkdown(disclosureMarkdown));
        }
        binding.inputLayout.setCounterMaxLength(getMaxLength());
    }

    /* compiled from: QuestionnaireStringQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireStringQuestionFragment$Args;", "Landroid/os/Parcelable;", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "contextualQuestionInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "stringQuestion", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;)V", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getContextualQuestionInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "getStringQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource accountDisplayName;
        private final ContextualQuestionInfo contextualQuestionInfo;
        private final QuestionnaireLoggingInfo loggingInfo;
        private final UiQuestionnaireQuestion.StringQuestion stringQuestion;

        /* compiled from: QuestionnaireStringQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StringResource) parcel.readParcelable(Args.class.getClassLoader()), (ContextualQuestionInfo) parcel.readParcelable(Args.class.getClassLoader()), (UiQuestionnaireQuestion.StringQuestion) parcel.readParcelable(Args.class.getClassLoader()), QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.StringQuestion stringQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = args.accountDisplayName;
            }
            if ((i & 2) != 0) {
                contextualQuestionInfo = args.contextualQuestionInfo;
            }
            if ((i & 4) != 0) {
                stringQuestion = args.stringQuestion;
            }
            if ((i & 8) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            return args.copy(stringResource, contextualQuestionInfo, stringQuestion, questionnaireLoggingInfo);
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
        public final UiQuestionnaireQuestion.StringQuestion getStringQuestion() {
            return this.stringQuestion;
        }

        /* renamed from: component4, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        public final Args copy(StringResource accountDisplayName, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.StringQuestion stringQuestion, QuestionnaireLoggingInfo loggingInfo) {
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(stringQuestion, "stringQuestion");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(accountDisplayName, contextualQuestionInfo, stringQuestion, loggingInfo);
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
            return Intrinsics.areEqual(this.accountDisplayName, args.accountDisplayName) && Intrinsics.areEqual(this.contextualQuestionInfo, args.contextualQuestionInfo) && Intrinsics.areEqual(this.stringQuestion, args.stringQuestion) && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo);
        }

        public int hashCode() {
            StringResource stringResource = this.accountDisplayName;
            return ((((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.contextualQuestionInfo.hashCode()) * 31) + this.stringQuestion.hashCode()) * 31) + this.loggingInfo.hashCode();
        }

        public String toString() {
            return "Args(accountDisplayName=" + this.accountDisplayName + ", contextualQuestionInfo=" + this.contextualQuestionInfo + ", stringQuestion=" + this.stringQuestion + ", loggingInfo=" + this.loggingInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountDisplayName, flags);
            dest.writeParcelable(this.contextualQuestionInfo, flags);
            dest.writeParcelable(this.stringQuestion, flags);
            this.loggingInfo.writeToParcel(dest, flags);
        }

        public Args(StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.StringQuestion stringQuestion, QuestionnaireLoggingInfo loggingInfo) {
            Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
            Intrinsics.checkNotNullParameter(stringQuestion, "stringQuestion");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.accountDisplayName = stringResource;
            this.contextualQuestionInfo = contextualQuestionInfo;
            this.stringQuestion = stringQuestion;
            this.loggingInfo = loggingInfo;
        }

        public /* synthetic */ Args(StringResource stringResource, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.StringQuestion stringQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stringResource, contextualQuestionInfo, stringQuestion, questionnaireLoggingInfo);
        }

        public final StringResource getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public final ContextualQuestionInfo getContextualQuestionInfo() {
            return this.contextualQuestionInfo;
        }

        public final UiQuestionnaireQuestion.StringQuestion getStringQuestion() {
            return this.stringQuestion;
        }

        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }
    }

    /* compiled from: QuestionnaireStringQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireStringQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireStringQuestionFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireStringQuestionFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireStringQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(QuestionnaireStringQuestionFragment questionnaireStringQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireStringQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireStringQuestionFragment newInstance(Args args) {
            return (QuestionnaireStringQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireStringQuestionFragment questionnaireStringQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireStringQuestionFragment, args);
        }
    }
}
