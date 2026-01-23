package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.survey.SurveyYesNoQuestionViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyYesNoQuestionContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentSurveyYesNoQuestionBinding;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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

/* compiled from: SurveyYesNoQuestionFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSurveyYesNoQuestionBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSurveyYesNoQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SurveyYesNoQuestionFragment extends BaseSurveyFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name eventScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyYesNoQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSurveyYesNoQuestionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyYesNoQuestionFragment() {
        super(C39996R.layout.fragment_survey_yes_no_question);
        this.binding = ViewBinding5.viewBinding(this, SurveyYesNoQuestionFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SurveyYesNoQuestionDuxo.class);
        this.eventScreenName = Screen.Name.CX_SURVEY_YES_NO_QUESTION;
    }

    private final FragmentSurveyYesNoQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSurveyYesNoQuestionBinding) value;
    }

    private final SurveyYesNoQuestionDuxo getDuxo() {
        return (SurveyYesNoQuestionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment
    public Screen.Name getEventScreenName() {
        return this.eventScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton surveyYesNoYesBtn = getBinding().surveyYesNoYesBtn;
        Intrinsics.checkNotNullExpressionValue(surveyYesNoYesBtn, "surveyYesNoYesBtn");
        OnClickListeners.onClick(surveyYesNoYesBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyYesNoQuestionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton surveyYesNoNoBtn = getBinding().surveyYesNoNoBtn;
        Intrinsics.checkNotNullExpressionValue(surveyYesNoNoBtn, "surveyYesNoNoBtn");
        OnClickListeners.onClick(surveyYesNoNoBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyYesNoQuestionFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsButton surveyYesNoDismissBtn = getBinding().surveyYesNoDismissBtn;
        Intrinsics.checkNotNullExpressionValue(surveyYesNoDismissBtn, "surveyYesNoDismissBtn");
        OnClickListeners.onClick(surveyYesNoDismissBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyYesNoQuestionFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment) {
        surveyYesNoQuestionFragment.getDuxo().submitAnswer(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment) {
        surveyYesNoQuestionFragment.getDuxo().submitAnswer(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment) {
        surveyYesNoQuestionFragment.logDismissEvent(true);
        surveyYesNoQuestionFragment.getCallbacks().dismissFlow();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyYesNoQuestionFragment.onResume$lambda$6(this.f$0, (SurveyYesNoQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment, SurveyYesNoQuestionViewState state) throws Throwable {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        SurveyYesNoQuestionContext content = state.getContent();
        if (content != null) {
            surveyYesNoQuestionFragment.getBinding().surveyYesNoProgressBar.setProgress(content.getProgressPercentage());
            surveyYesNoQuestionFragment.getBinding().surveyYesNoPog.setPictogram(ContextCompat.getDrawable(surveyYesNoQuestionFragment.requireContext(), content.getPictogram().getResourceId()));
            RhTextView rhTextView = surveyYesNoQuestionFragment.getBinding().surveyYesNoTitleTxt;
            RichText title = content.getTitle();
            Context contextRequireContext = surveyYesNoQuestionFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            rhTextView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
            RdsButton rdsButton = surveyYesNoQuestionFragment.getBinding().surveyYesNoYesBtn;
            rdsButton.setText(content.getYesTitle());
            rdsButton.setIcon(ContextCompat.getDrawable(surveyYesNoQuestionFragment.requireContext(), content.getYesIcon().getResourceId()));
            rdsButton.setLoading(state.getLoadingState() == SurveyYesNoQuestionViewState.LoadingState.LOADING_SELECTED_YES);
            RdsButton rdsButton2 = surveyYesNoQuestionFragment.getBinding().surveyYesNoNoBtn;
            rdsButton2.setText(content.getNoTitle());
            rdsButton2.setIcon(ContextCompat.getDrawable(surveyYesNoQuestionFragment.requireContext(), content.getNoIcon().getResourceId()));
            rdsButton2.setLoading(state.getLoadingState() == SurveyYesNoQuestionViewState.LoadingState.LOADING_SELECTED_NO);
            surveyYesNoQuestionFragment.setQuestionId(content.getQuestionId());
        }
        surveyYesNoQuestionFragment.getBinding().surveyYesNoDismissBtn.setText(state.getDismissButtonText());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            surveyYesNoQuestionFragment.handleError(thConsume);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SurveyYesNoQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyYesNoQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyYesNoQuestionFragment, LegacyFragmentKey.SurveyYesNoQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyYesNoQuestion surveyYesNoQuestion) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyYesNoQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyYesNoQuestion getArgs(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment) {
            return (LegacyFragmentKey.SurveyYesNoQuestion) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyYesNoQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyYesNoQuestionFragment newInstance(LegacyFragmentKey.SurveyYesNoQuestion surveyYesNoQuestion) {
            return (SurveyYesNoQuestionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyYesNoQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyYesNoQuestionFragment surveyYesNoQuestionFragment, LegacyFragmentKey.SurveyYesNoQuestion surveyYesNoQuestion) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyYesNoQuestionFragment, surveyYesNoQuestion);
        }
    }
}
