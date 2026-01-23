package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireSectionCoverBinding;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnairePage;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireViewState;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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

/* compiled from: RecommendationsQuestionnaireSectionCoverFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0003)*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001dH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireSectionCoverBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireSectionCoverBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Callbacks;", "callbacks$delegate", "progressPercentageText", "Landroid/widget/TextView;", "getProgressPercentageText", "()Landroid/widget/TextView;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showDisclosureAlertSheet", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "onContinuePressed", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireSectionCoverFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireSectionCoverFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireSectionCoverBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireSectionCoverFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float LOTTIE_ANIMATION_SPEED = 2.0f;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean excludeFromAutoScreenDisappearEventLogging;

    /* compiled from: RecommendationsQuestionnaireSectionCoverFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Callbacks;", "", "onContinuePressed", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinuePressed();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public RecommendationsQuestionnaireSectionCoverFragment() {
        super(C25978R.layout.fragment_recommendations_questionnaire_section_cover);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsQuestionnaireSectionCoverFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.excludeFromAutoScreenDisappearEventLogging = true;
    }

    private final FragmentRecommendationsQuestionnaireSectionCoverBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsQuestionnaireSectionCoverBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getProgressPercentageText() {
        return (TextView) requireToolbar().findViewById(C25978R.id.progress_percentage_txt);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RECS_INVESTOR_PROFILE_SECTION_COVER, null, ((Args) INSTANCE.getArgs((Fragment) this)).getCoverPage().getLoggingIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentRecommendationsQuestionnaireSectionCoverBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RhTextView rhTextView = binding.title;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getCoverPage().getTitle());
        binding.description.setText(((Args) companion.getArgs((Fragment) this)).getCoverPage().getDescription());
        final UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo = ((Args) companion.getArgs((Fragment) this)).getCoverPage().getDisclosureInfo();
        if (disclosureInfo != null) {
            RhTextView disclosure = binding.disclosure;
            Intrinsics.checkNotNullExpressionValue(disclosure, "disclosure");
            TextViewsKt.setVisibilityText(disclosure, disclosureInfo.getTitle());
            RhTextView disclosure2 = binding.disclosure;
            Intrinsics.checkNotNullExpressionValue(disclosure2, "disclosure");
            OnClickListeners.onClick(disclosure2, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsQuestionnaireSectionCoverFragment.onViewCreated$lambda$3$lambda$0(this.f$0, disclosureInfo);
                }
            });
        } else {
            RhTextView disclosure3 = binding.disclosure;
            Intrinsics.checkNotNullExpressionValue(disclosure3, "disclosure");
            disclosure3.setVisibility(8);
        }
        binding.continueBtn.setText(((Args) companion.getArgs((Fragment) this)).getCoverPage().getContinueButtonTitle());
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        ViewsKt.eventData$default(continueBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireSectionCoverFragment.onViewCreated$lambda$3$lambda$1();
            }
        }, 1, null);
        RdsButton continueBtn2 = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        OnClickListeners.onClick(continueBtn2, new RecommendationsQuestionnaireSectionCoverFragment3(this));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireSectionCoverFragment.onViewCreated$lambda$3$lambda$2(binding, (DayNightOverlay) obj);
            }
        });
        if (((Args) companion.getArgs((Fragment) this)).getTransitionInfo().getMinProgress() == ((Args) companion.getArgs((Fragment) this)).getTransitionInfo().getMaxProgress()) {
            binding.lottieView.setProgress(((Args) companion.getArgs((Fragment) this)).getTransitionInfo().getMinProgress());
            return;
        }
        binding.lottieView.setMinAndMaxProgress(((Args) companion.getArgs((Fragment) this)).getTransitionInfo().getMinProgress(), ((Args) companion.getArgs((Fragment) this)).getTransitionInfo().getMaxProgress());
        binding.lottieView.setSpeed(2.0f);
        binding.lottieView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$0(RecommendationsQuestionnaireSectionCoverFragment recommendationsQuestionnaireSectionCoverFragment, UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo) {
        recommendationsQuestionnaireSectionCoverFragment.showDisclosureAlertSheet(disclosureInfo.getAlert());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$1() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(FragmentRecommendationsQuestionnaireSectionCoverBinding fragmentRecommendationsQuestionnaireSectionCoverBinding, DayNightOverlay it) {
        int i;
        Intrinsics.checkNotNullParameter(it, "it");
        LottieUrl lottieUrl = DayNightChanges.isDay(it) ? LottieUrl.RECS_PROGRESSION_ORB_DAY : LottieUrl.RECS_PROGRESSION_ORB_NIGHT;
        LottieAnimationView lottieView = fragmentRecommendationsQuestionnaireSectionCoverBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        LottieAnimationViewsKt.setRemoteUrl(lottieView, lottieUrl);
        if (DayNightChanges.isDay(it)) {
            i = C25978R.drawable.recs_podium_only_cropped_day;
        } else {
            i = C25978R.drawable.recs_podium_only_cropped_night;
        }
        fragmentRecommendationsQuestionnaireSectionCoverBinding.podiumStatic.setImageResource(i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        TextView progressPercentageText;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getProgressPercentageText() == null) {
            RhToolbar.addCustomView$default(toolbar, C25978R.layout.include_questionnaire_section_cover_toolbar_content, true, 0, 4, null);
        }
        int maxProgressPercentageRounded = ((Args) INSTANCE.getArgs((Fragment) this)).getTransitionInfo().getMaxProgressPercentageRounded();
        if (maxProgressPercentageRounded <= 0 || (progressPercentageText = getProgressPercentageText()) == null) {
            return;
        }
        progressPercentageText.setText(getString(C25978R.string.recommendations_questionnaire_section_cover_progress, Integer.valueOf(maxProgressPercentageRounded)));
    }

    private final void showDisclosureAlertSheet(GenericAlert alert) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(alert, true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "recs-questionnaire-disclosure-banner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContinuePressed() {
        RhToolbar rhToolbar = getRhToolbar();
        ViewGroup viewGroup = rhToolbar != null ? (ViewGroup) rhToolbar.findViewById(C25978R.id.section_cover_toolbar_content) : null;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        getCallbacks().onContinuePressed();
    }

    /* compiled from: RecommendationsQuestionnaireSectionCoverFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Args;", "Landroid/os/Parcelable;", "coverPage", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "transitionInfo", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "<init>", "(Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;)V", "getCoverPage", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "getTransitionInfo", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RecommendationsQuestionnairePage.SectionCoverPage coverPage;
        private final RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo;

        /* compiled from: RecommendationsQuestionnaireSectionCoverFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(RecommendationsQuestionnairePage.SectionCoverPage.CREATOR.createFromParcel(parcel), RecommendationsQuestionnaireViewState.TransitionInfo.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RecommendationsQuestionnairePage.SectionCoverPage sectionCoverPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                sectionCoverPage = args.coverPage;
            }
            if ((i & 2) != 0) {
                transitionInfo = args.transitionInfo;
            }
            return args.copy(sectionCoverPage, transitionInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final RecommendationsQuestionnairePage.SectionCoverPage getCoverPage() {
            return this.coverPage;
        }

        /* renamed from: component2, reason: from getter */
        public final RecommendationsQuestionnaireViewState.TransitionInfo getTransitionInfo() {
            return this.transitionInfo;
        }

        public final Args copy(RecommendationsQuestionnairePage.SectionCoverPage coverPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
            Intrinsics.checkNotNullParameter(coverPage, "coverPage");
            Intrinsics.checkNotNullParameter(transitionInfo, "transitionInfo");
            return new Args(coverPage, transitionInfo);
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
            return Intrinsics.areEqual(this.coverPage, args.coverPage) && Intrinsics.areEqual(this.transitionInfo, args.transitionInfo);
        }

        public int hashCode() {
            return (this.coverPage.hashCode() * 31) + this.transitionInfo.hashCode();
        }

        public String toString() {
            return "Args(coverPage=" + this.coverPage + ", transitionInfo=" + this.transitionInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.coverPage.writeToParcel(dest, flags);
            this.transitionInfo.writeToParcel(dest, flags);
        }

        public Args(RecommendationsQuestionnairePage.SectionCoverPage coverPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
            Intrinsics.checkNotNullParameter(coverPage, "coverPage");
            Intrinsics.checkNotNullParameter(transitionInfo, "transitionInfo");
            this.coverPage = coverPage;
            this.transitionInfo = transitionInfo;
        }

        public final RecommendationsQuestionnairePage.SectionCoverPage getCoverPage() {
            return this.coverPage;
        }

        public final RecommendationsQuestionnaireViewState.TransitionInfo getTransitionInfo() {
            return this.transitionInfo;
        }
    }

    /* compiled from: RecommendationsQuestionnaireSectionCoverFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Args;", "<init>", "()V", "LOTTIE_ANIMATION_SPEED", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsQuestionnaireSectionCoverFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsQuestionnaireSectionCoverFragment recommendationsQuestionnaireSectionCoverFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsQuestionnaireSectionCoverFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsQuestionnaireSectionCoverFragment newInstance(Args args) {
            return (RecommendationsQuestionnaireSectionCoverFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsQuestionnaireSectionCoverFragment recommendationsQuestionnaireSectionCoverFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsQuestionnaireSectionCoverFragment, args);
        }
    }
}
