package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyFreeFormQuestionContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentSurveyFreeformQuestionBinding;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
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
import kotlin.text.StringsKt;

/* compiled from: SurveyFreeFormQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSurveyFreeformQuestionBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSurveyFreeformQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "charLimit", "", "charLimitErrorText", "", "eventScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "submitInput", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SurveyFreeFormQuestionFragment extends BaseSurveyFragment {
    private static final String CHAR_LIMIT_ERROR_MAX_TEXT_COUNT = "{{max_text_count}}";
    private static final String CHAR_LIMIT_ERROR_TEXT_COUNT = "{{text_count}}";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private int charLimit;
    private String charLimitErrorText;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name eventScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyFreeFormQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSurveyFreeformQuestionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$1(int i) {
        return i == 6;
    }

    public SurveyFreeFormQuestionFragment() {
        super(C39996R.layout.fragment_survey_freeform_question);
        this.binding = ViewBinding5.viewBinding(this, SurveyFreeFormQuestionFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SurveyFreeFormQuestionDuxo.class);
        this.charLimit = 1000;
        this.charLimitErrorText = "";
        this.eventScreenName = Screen.Name.CX_SURVEY_FREE_FORM_QUESTION;
    }

    private final FragmentSurveyFreeformQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSurveyFreeformQuestionBinding) value;
    }

    private final SurveyFreeFormQuestionDuxo getDuxo() {
        return (SurveyFreeFormQuestionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment
    public Screen.Name getEventScreenName() {
        return this.eventScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton surveyFreeformContinueBtn = getBinding().surveyFreeformContinueBtn;
        Intrinsics.checkNotNullExpressionValue(surveyFreeformContinueBtn, "surveyFreeformContinueBtn");
        OnClickListeners.onClick(surveyFreeformContinueBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyFreeFormQuestionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsTextInputEditText surveyFreeformEditTxt = getBinding().surveyFreeformEditTxt;
        Intrinsics.checkNotNullExpressionValue(surveyFreeformEditTxt, "surveyFreeformEditTxt");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxTextView.editorActions(surveyFreeformEditTxt, new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SurveyFreeFormQuestionFragment.onViewCreated$lambda$1(((Integer) obj).intValue()));
            }
        })), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyFreeFormQuestionFragment.onViewCreated$lambda$2(this.f$0, view, ((Integer) obj).intValue());
            }
        });
        RdsTextInputEditText surveyFreeformEditTxt2 = getBinding().surveyFreeformEditTxt;
        Intrinsics.checkNotNullExpressionValue(surveyFreeformEditTxt2, "surveyFreeformEditTxt");
        Observable<R> map = RxTextView.textChanges(surveyFreeformEditTxt2).map(new Function() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment.onViewCreated.4
            @Override // io.reactivex.functions.Function
            public final Integer apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.length());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyFreeFormQuestionFragment.onViewCreated$lambda$3(this.f$0, (Integer) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().surveyFreeformEditTxt.focusChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyFreeFormQuestionFragment.onViewCreated$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment) {
        surveyFreeFormQuestionFragment.submitInput();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment, View view, int i) {
        Context contextRequireContext = surveyFreeFormQuestionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ContextSystemServices.getInputMethodManager(contextRequireContext).hideSoftInputFromWindow(view.getWindowToken(), 0);
        surveyFreeFormQuestionFragment.submitInput();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment, Integer num) {
        boolean z = num.intValue() > surveyFreeFormQuestionFragment.charLimit;
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformContinueBtn.setEnabled(!z);
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformEditTxtContainer.setErrorText(z ? StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(surveyFreeFormQuestionFragment.charLimitErrorText, CHAR_LIMIT_ERROR_TEXT_COUNT, num.toString(), false, 4, (Object) null), CHAR_LIMIT_ERROR_MAX_TEXT_COUNT, String.valueOf(surveyFreeFormQuestionFragment.charLimit), false, 4, (Object) null), "\\", "", false, 4, (Object) null) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment, boolean z) {
        EventLogger eventLogger = surveyFreeFormQuestionFragment.getEventLogger();
        Screen screen = new Screen(surveyFreeFormQuestionFragment.getEventScreenName(), null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null);
        String string2 = surveyFreeFormQuestionFragment.getCallbacks().getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, new InAppSurvey(string2, surveyFreeFormQuestionFragment.getQuestionId(), null, null, Booleans2.toProtobuf(Boolean.valueOf(z)), null, null, 108, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyFreeFormQuestionFragment.onStart$lambda$5(this.f$0, (SurveyFreeFormQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment, SurveyFreeFormQuestionViewState state) throws Throwable {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        SurveyFreeFormQuestionContext content = state.getContent();
        if (content == null) {
            return Unit.INSTANCE;
        }
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformProgressBar.setProgress(content.getProgressPercentage());
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformPog.setPictogram(ContextCompat.getDrawable(surveyFreeFormQuestionFragment.requireContext(), content.getPictogram().getResourceId()));
        RhTextView rhTextView = surveyFreeFormQuestionFragment.getBinding().surveyFreeformTitleTxt;
        RichText title = content.getTitle();
        Context contextRequireContext = surveyFreeFormQuestionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformEditTxt.setHint(content.getFormHint());
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformContinueBtn.setText(content.getConfirmButtonTitle());
        surveyFreeFormQuestionFragment.getBinding().surveyFreeformContinueBtn.setLoading(state.isLoading());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            surveyFreeFormQuestionFragment.handleError(thConsume);
        }
        surveyFreeFormQuestionFragment.charLimit = content.getFormLengthLimit();
        surveyFreeFormQuestionFragment.charLimitErrorText = state.getCharLimitText();
        surveyFreeFormQuestionFragment.setQuestionId(content.getQuestionId());
        return Unit.INSTANCE;
    }

    private final void submitInput() {
        getDuxo().submitInput(String.valueOf(getBinding().surveyFreeformEditTxt.getText()));
    }

    /* compiled from: SurveyFreeFormQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyFreeFormQuestion;", "<init>", "()V", "CHAR_LIMIT_ERROR_TEXT_COUNT", "", "CHAR_LIMIT_ERROR_MAX_TEXT_COUNT", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyFreeFormQuestionFragment, LegacyFragmentKey.SurveyFreeFormQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyFreeFormQuestion surveyFreeFormQuestion) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyFreeFormQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyFreeFormQuestion getArgs(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment) {
            return (LegacyFragmentKey.SurveyFreeFormQuestion) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyFreeFormQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyFreeFormQuestionFragment newInstance(LegacyFragmentKey.SurveyFreeFormQuestion surveyFreeFormQuestion) {
            return (SurveyFreeFormQuestionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyFreeFormQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyFreeFormQuestionFragment surveyFreeFormQuestionFragment, LegacyFragmentKey.SurveyFreeFormQuestion surveyFreeFormQuestion) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyFreeFormQuestionFragment, surveyFreeFormQuestion);
        }
    }
}
