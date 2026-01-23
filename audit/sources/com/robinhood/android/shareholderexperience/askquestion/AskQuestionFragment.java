package com.robinhood.android.shareholderexperience.askquestion;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.ShareholderLogger;
import com.robinhood.android.shareholderexperience.askquestion.AskQuestionViewState2;
import com.robinhood.android.shareholderexperience.databinding.FragmentAskQuestionBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: AskQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\b\u0010 \u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "shareholderLogger", "Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "getShareholderLogger", "()Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "setShareholderLogger", "(Lcom/robinhood/android/shareholderexperience/ShareholderLogger;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentAskQuestionBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentAskQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setState", "state", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionViewState;", "doOnError", "doOnSuccess", "event", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent$Success;", "toggleGuidelines", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AskQuestionFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ShareholderLogger shareholderLogger;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AskQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentAskQuestionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AskQuestionFragment() {
        super(C28477R.layout.fragment_ask_question);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AskQuestionFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AskQuestionDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    public final ShareholderLogger getShareholderLogger() {
        ShareholderLogger shareholderLogger = this.shareholderLogger;
        if (shareholderLogger != null) {
            return shareholderLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareholderLogger");
        return null;
    }

    public final void setShareholderLogger(ShareholderLogger shareholderLogger) {
        Intrinsics.checkNotNullParameter(shareholderLogger, "<set-?>");
        this.shareholderLogger = shareholderLogger;
    }

    private final FragmentAskQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAskQuestionBinding) value;
    }

    private final AskQuestionDuxo getDuxo() {
        return (AskQuestionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ShareholderLogger shareholderLogger = getShareholderLogger();
        Lifecycle lifecycle = getLifecycle();
        Screen.Name name = Screen.Name.SHAREHOLDER_ASK_A_QUESTION;
        Companion companion = INSTANCE;
        ShareholderLogger.initialize$default(shareholderLogger, lifecycle, name, ((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((Fragment) this)).getInstrumentId(), ((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((Fragment) this)).getEventSlug(), null, 16, null);
        final FragmentAskQuestionBinding binding = getBinding();
        ConstraintLayout constraintLayout = binding.askQuestionConstraintLayout;
        constraintLayout.setLayoutTransition(new LayoutTransition());
        constraintLayout.getLayoutTransition().enableTransitionType(4);
        RhTextView askQuestionGuidelinesHeader = binding.askQuestionGuidelinesHeader;
        Intrinsics.checkNotNullExpressionValue(askQuestionGuidelinesHeader, "askQuestionGuidelinesHeader");
        OnClickListeners.onClick(askQuestionGuidelinesHeader, new AskQuestionFragment3(this));
        RdsTextInputEditText askQuestionTextInput = binding.askQuestionTextInput;
        Intrinsics.checkNotNullExpressionValue(askQuestionTextInput, "askQuestionTextInput");
        askQuestionTextInput.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$onViewCreated$lambda$3$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                CharSequence charSequenceTrim;
                binding.askQuestionSubmitButton.setEnabled(((s == null || (charSequenceTrim = StringsKt.trim(s)) == null) ? 0 : charSequenceTrim.length()) > 0);
            }
        });
        RdsButton askQuestionSubmitButton = binding.askQuestionSubmitButton;
        Intrinsics.checkNotNullExpressionValue(askQuestionSubmitButton, "askQuestionSubmitButton");
        OnClickListeners.onClick(askQuestionSubmitButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AskQuestionFragment.onViewCreated$lambda$3$lambda$2(this.f$0, binding);
            }
        });
        binding.askQuestionTextInput.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$onViewCreated$1$5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() != 8) {
                    return false;
                }
                view2.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(AskQuestionFragment askQuestionFragment, FragmentAskQuestionBinding fragmentAskQuestionBinding) {
        String string2;
        ShareholderLogger.logTap$default(askQuestionFragment.getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.SUBMIT, null, null, 12, null);
        AskQuestionDuxo duxo = askQuestionFragment.getDuxo();
        Editable text = fragmentAskQuestionBinding.askQuestionTextInput.getText();
        if (text == null || (string2 = text.toString()) == null) {
            return Unit.INSTANCE;
        }
        duxo.submitQuestion(string2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C284911(this));
    }

    /* compiled from: AskQuestionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$onStart$1 */
    /* synthetic */ class C284911 extends FunctionReferenceImpl implements Function1<AskQuestionViewState, Unit> {
        C284911(Object obj) {
            super(1, obj, AskQuestionFragment.class, "setState", "setState(Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AskQuestionViewState askQuestionViewState) {
            invoke2(askQuestionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AskQuestionViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AskQuestionFragment) this.receiver).setState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(AskQuestionViewState state) {
        UiEvent<AskQuestionViewState2> event = state.getEvent();
        AskQuestionViewState2 askQuestionViewState2Consume = event != null ? event.consume() : null;
        if (askQuestionViewState2Consume instanceof AskQuestionViewState2.Error) {
            doOnError();
        } else if (askQuestionViewState2Consume instanceof AskQuestionViewState2.Success) {
            doOnSuccess((AskQuestionViewState2.Success) askQuestionViewState2Consume);
        } else if (askQuestionViewState2Consume != null) {
            throw new NoWhenBranchMatchedException();
        }
        QaEventMetadata.AskQuestionInfo askQuestionInfo = state.getAskQuestionInfo();
        if (askQuestionInfo == null) {
            return;
        }
        RhToolbar rhToolbar = requireBaseActivity().getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(rhToolbar.getResources().getQuantityString(C28477R.plurals.ask_question_toolbar_text, askQuestionInfo.getMaxQuestions(), Integer.valueOf(askQuestionInfo.getQuestionsAsked()), Integer.valueOf(askQuestionInfo.getMaxQuestions())));
        }
        FragmentAskQuestionBinding binding = getBinding();
        binding.askQuestionHeader.setText(askQuestionInfo.getTitle());
        binding.askQuestionTextInput.setHint(askQuestionInfo.getFormPlaceholder());
        String string2 = getString(C28477R.string.ask_question_subtitle_text, askQuestionInfo.getUserName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        binding.askQuestionSubtitle.setText(HtmlCompat.fromHtml$default(string2, 0, 2, null), TextView.BufferType.SPANNABLE);
        RdsInfoBannerView rdsInfoBannerView = binding.askQuestionGuidelines;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsInfoBannerView.setText(state.mergeGuidelines(contextRequireContext));
    }

    private final void doOnError() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setTitle(C28477R.string.question_error_dialog_title, new Object[0]).setMessage(C28477R.string.question_error_dialog_message, new Object[0]).setPositiveButton(C28477R.string.ask_question_error_dialog_action, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "alert", false, 4, null);
    }

    private final void doOnSuccess(AskQuestionViewState2.Success event) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ShareholderQuestionSubmitted(event.getShareCopy()), false, false, false, false, null, false, null, null, 1020, null);
        requireBaseActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleGuidelines() {
        FragmentAskQuestionBinding binding = getBinding();
        binding.askQuestionGuidelineDrawable.animate().rotation(binding.askQuestionGuidelineDrawable.getRotation() + 180.0f).setDuration(350L);
        RdsInfoBannerView askQuestionGuidelines = binding.askQuestionGuidelines;
        Intrinsics.checkNotNullExpressionValue(askQuestionGuidelines, "askQuestionGuidelines");
        RdsInfoBannerView askQuestionGuidelines2 = binding.askQuestionGuidelines;
        Intrinsics.checkNotNullExpressionValue(askQuestionGuidelines2, "askQuestionGuidelines");
        askQuestionGuidelines.setVisibility(askQuestionGuidelines2.getVisibility() == 0 ? 8 : 0);
    }

    /* compiled from: AskQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderAskQuestion;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AskQuestionFragment, LegacyFragmentKey.ShareholderAskQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderAskQuestion shareholderAskQuestion) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderAskQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderAskQuestion getArgs(AskQuestionFragment askQuestionFragment) {
            return (LegacyFragmentKey.ShareholderAskQuestion) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, askQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AskQuestionFragment newInstance(LegacyFragmentKey.ShareholderAskQuestion shareholderAskQuestion) {
            return (AskQuestionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderAskQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AskQuestionFragment askQuestionFragment, LegacyFragmentKey.ShareholderAskQuestion shareholderAskQuestion) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, askQuestionFragment, shareholderAskQuestion);
        }
    }
}
