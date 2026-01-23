package com.robinhood.android.transfers.p271ui.max.posttransfer;

import android.R;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.ScaleXY;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferIraContributionCelebrationKey;
import com.robinhood.android.transfers.databinding.FragmentIraContributionCelebrationBinding;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferToolbarButton;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: TransferIraContributionCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016J\u001a\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J \u00100\u001a\u00020&2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002052\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u000202H\u0016J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0002J\"\u0010>\u001a\u00020&*\u00020?2\u0006\u0010@\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020&0CH\u0002J\u001c\u0010D\u001a\u00020&*\u00020?2\u0006\u0010E\u001a\u0002022\u0006\u0010F\u001a\u000202H\u0002J\u001c\u0010G\u001a\u00020&*\u00020?2\u0006\u0010E\u001a\u0002022\u0006\u0010H\u001a\u00020AH\u0002R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferIraContributionCelebrationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentIraContributionCelebrationBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionCelebrationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/transfers/contracts/TransferIraContributionCelebrationKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/contracts/TransferIraContributionCelebrationKey$Callbacks;", "callbacks$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setLottieAndAnimation", "contribution", "", "contributionPlusMatch", "skipRingAnimation", "", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onUninvestedBottomSheetDeeplinkHandled", "deeplink", "onUninvestedCtaClicked", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileCta;", "oneTimeAnimationUpdateListener", "Lcom/airbnb/lottie/LottieAnimationView;", "animatedFractionThreshold", "", "onAnimationUpdateAfterThreshold", "Lkotlin/Function0;", "setLayerText", "layerName", "text", "updateLayerScale", "scaleMultiplier", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferIraContributionCelebrationFragment extends BaseFragment implements ClientComponentButtonView.Callbacks, RetirementUninvestedModal.Callbacks, AutoLoggableFragment {
    private static final long ANIM_DURATION_MS = 600;
    private static final int DESCALE_TEXT_LENGTH_THRESHOLD = 4;
    private static final float LOTTIE_DESCALE_BASE_MULTIPLIER = 0.075f;
    private final SduiActionHandler<GenericAction> actionHandler;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferIraContributionCelebrationFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionCelebrationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferIraContributionCelebrationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/contracts/TransferIraContributionCelebrationKey$Callbacks;", 0))};

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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public TransferIraContributionCelebrationFragment() {
        super(C30065R.layout.fragment_ira_contribution_celebration);
        this.actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$actionHandler$1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof GenericAction.Dismiss) {
                    this.this$0.getCallbacks().onContinueClick();
                    return true;
                }
                if (!(action instanceof GenericAction.Deeplink)) {
                    return false;
                }
                Navigator navigator = this.this$0.getNavigator();
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), Boolean.FALSE, null, false, null, 56, null);
                return true;
            }
        };
        this.binding = ViewBinding5.viewBinding(this, TransferIraContributionCelebrationFragment3.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(TransferIraContributionCelebrationKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof TransferIraContributionCelebrationKey.Callbacks)) {
                    parentFragment = null;
                }
                TransferIraContributionCelebrationKey.Callbacks callbacks = (TransferIraContributionCelebrationKey.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TransferIraContributionCelebrationKey.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ENOKI_CONTRIBUTION_CELEBRATION, null, ((TransferIraContributionCelebrationKey) INSTANCE.getArgs((Fragment) this)).getIraContributionCelebration().getLoggingIdentifier(), null, 10, null);
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final FragmentIraContributionCelebrationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentIraContributionCelebrationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferIraContributionCelebrationKey.Callbacks getCallbacks() {
        return (TransferIraContributionCelebrationKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
        RdsTextButton rdsTextButton = (RdsTextButton) toolbar.findViewById(C30065R.id.ira_contribution_celebration_toolbar_button_container);
        final UiPostTransferToolbarButton toolbarButton = ((TransferIraContributionCelebrationKey) INSTANCE.getArgs((Fragment) this)).getIraContributionCelebration().getToolbarButton();
        if (rdsTextButton != null || toolbarButton == null) {
            return;
        }
        RdsTextButton rdsTextButton2 = (RdsTextButton) RhToolbar.addCustomView$default(toolbar, C30065R.layout.include_ira_contribution_celebration_toolbar_button, false, 0, 6, null).findViewById(C30065R.id.ira_contribution_celebration_toolbar_button);
        rdsTextButton2.setText(toolbarButton.getTitle());
        Intrinsics.checkNotNull(rdsTextButton2);
        OnClickListeners.onClick(rdsTextButton2, new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferIraContributionCelebrationFragment.configureToolbar$lambda$2$lambda$0(this.f$0, toolbarButton);
            }
        });
        ViewsKt.eventData$default(rdsTextButton2, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferIraContributionCelebrationFragment.configureToolbar$lambda$2$lambda$1(toolbarButton, this);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$2$lambda$0(TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment, UiPostTransferToolbarButton uiPostTransferToolbarButton) {
        transferIraContributionCelebrationFragment.actionHandler.mo15941handle(uiPostTransferToolbarButton.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor configureToolbar$lambda$2$lambda$1(UiPostTransferToolbarButton uiPostTransferToolbarButton, TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment) {
        return new UserInteractionEventDescriptor(uiPostTransferToolbarButton.getLoggingIdentifier(), transferIraContributionCelebrationFragment.getEventScreen(), null, null, new Component(Component.ComponentType.BUTTON, uiPostTransferToolbarButton.getLoggingIdentifier(), null, 4, null), null, 44, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(requireToolbar()), DayNightOverlay.DAY, null, 2, null);
        requireToolbar().setColorControlNormalOverride(ThemeAttributes.INSTANCE.getCOLOR_BLACK());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireToolbar().setColorControlNormalOverride(null);
        getUserLeapManager().setPendingSurvey(Survey.RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentIraContributionCelebrationBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Companion companion = INSTANCE;
        ApiPostTransferPage.IraContributionCelebration.BackgroundType backgroundType = ((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getBackgroundType();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        root.setBackground(BackgroundTypes.getBackgroundDrawable(backgroundType, contextRequireContext));
        ConstraintLayout root2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root2);
        setLottieAndAnimation(((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getContributionAmountFormatted(), ((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getTotalAmountFormatted(), ((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getSkipRingAnimation());
        binding.title.setText(((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getTitle());
        binding.subtitle.setText(getMarkwon().toMarkdown(((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getSubtitleMarkdown()));
        RhTextView rhTextView = binding.disclosure;
        String disclosureMarkdown = ((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getDisclosureMarkdown();
        rhTextView.setText(disclosureMarkdown != null ? getMarkwon().toMarkdown(disclosureMarkdown) : null);
        binding.primaryCta.bind(ServerDrivenButton.INSTANCE.from(((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getPrimaryButton()));
        binding.primaryCta.setCallbacks(this);
        final RetirementUninvestedViewModel.MobileCta investCtaButton = ((TransferIraContributionCelebrationKey) companion.getArgs((Fragment) this)).getIraContributionCelebration().getInvestCtaButton();
        if (investCtaButton != null) {
            binding.investCta.setText(investCtaButton.getTitle());
            RdsButton investCta = binding.investCta;
            Intrinsics.checkNotNullExpressionValue(investCta, "investCta");
            investCta.setVisibility(0);
            RdsButton investCta2 = binding.investCta;
            Intrinsics.checkNotNullExpressionValue(investCta2, "investCta");
            OnClickListeners.onClick(investCta2, new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferIraContributionCelebrationFragment.onViewCreated$lambda$6$lambda$5$lambda$3(this.f$0, investCtaButton);
                }
            });
            RdsButton investCta3 = binding.investCta;
            Intrinsics.checkNotNullExpressionValue(investCta3, "investCta");
            ViewsKt.eventData$default(investCta3, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferIraContributionCelebrationFragment.onViewCreated$lambda$6$lambda$5$lambda$4(investCtaButton);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5$lambda$3(TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment, RetirementUninvestedViewModel.MobileCta mobileCta) {
        transferIraContributionCelebrationFragment.onUninvestedCtaClicked(mobileCta);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$5$lambda$4(RetirementUninvestedViewModel.MobileCta mobileCta) {
        return new UserInteractionEventDescriptor(mobileCta.getLoggingIdentifier(), null, null, null, new Component(Component.ComponentType.BUTTON, mobileCta.getLoggingIdentifier(), null, 4, null), null, 46, null);
    }

    private final void setLottieAndAnimation(String contribution, String contributionPlusMatch, boolean skipRingAnimation) {
        final LottieAnimationView lottieAnimationView = getBinding().lottie;
        lottieAnimationView.setAnimation(C30065R.raw.ira_contribution_celebration);
        Intrinsics.checkNotNull(lottieAnimationView);
        setLayerText(lottieAnimationView, "Contributions", contribution);
        setLayerText(lottieAnimationView, "Contributions-Split", contribution);
        setLayerText(lottieAnimationView, "ENOKI", contributionPlusMatch);
        if (skipRingAnimation) {
            lottieAnimationView.setMinProgress(0.26f);
        }
        final float fMax = Math.max(contributionPlusMatch.length() - 4, 0) * LOTTIE_DESCALE_BASE_MULTIPLIER;
        final float f = skipRingAnimation ? 0.0f : 0.125f;
        final float f2 = skipRingAnimation ? 0.2f : 0.325f;
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$setLottieAndAnimation$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                float animatedFraction = animator.getAnimatedFraction();
                float f3 = f;
                if (f3 > animatedFraction || animatedFraction > f2) {
                    return;
                }
                float animatedFraction2 = (((f3 * (-1)) + animator.getAnimatedFraction()) + 1.0f) - fMax;
                TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment = this;
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView2);
                transferIraContributionCelebrationFragment.updateLayerScale(lottieAnimationView2, "(SCALE-CTRL)_Contributions", animatedFraction2);
                TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment2 = this;
                LottieAnimationView lottieAnimationView3 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView3);
                transferIraContributionCelebrationFragment2.updateLayerScale(lottieAnimationView3, "(SCALE-CTRL)_Contributions-Split", animatedFraction2);
                TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment3 = this;
                LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView4);
                transferIraContributionCelebrationFragment3.updateLayerScale(lottieAnimationView4, "(SCALE-CTRL)_ENOKI", animatedFraction2);
            }
        });
        LinearLayout linearLayout = getBinding().bottomContentContainer;
        linearLayout.setAlpha(0.0f);
        linearLayout.setScaleX(1.25f);
        linearLayout.setScaleY(1.25f);
        linearLayout.setTranslationY(60.0f);
        oneTimeAnimationUpdateListener(lottieAnimationView, skipRingAnimation ? 0.0f : 0.125f, new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferIraContributionCelebrationFragment.setLottieAndAnimation$lambda$9$lambda$8(this.f$0);
            }
        });
        lottieAnimationView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLottieAndAnimation$lambda$9$lambda$8(TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment) {
        transferIraContributionCelebrationFragment.getBinding().bottomContentContainer.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(600L).start();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        com.robinhood.models.serverdriven.p347db.GenericAction typedAction = button.getTypedAction();
        if (typedAction instanceof GenericAction.DismissAction) {
            getCallbacks().onContinueClick();
            return true;
        }
        if (!(typedAction instanceof GenericAction.DeeplinkAction)) {
            return false;
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 60, null);
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.retirement.contracts.RetirementUninvestedModal.Callbacks
    public void onUninvestedBottomSheetDeeplinkHandled(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        requireActivity().finish();
    }

    private final void onUninvestedCtaClicked(RetirementUninvestedViewModel.MobileCta cta) {
        if (cta instanceof RetirementUninvestedViewModel.MobileCta.Deeplink) {
            requireActivity().finish();
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((RetirementUninvestedViewModel.MobileCta.Deeplink) cta).getData()), null, null, false, null, 60, null);
            return;
        }
        if (!(cta instanceof RetirementUninvestedViewModel.MobileCta.Modal)) {
            throw new NoWhenBranchMatchedException();
        }
        RetirementUninvestedViewModel.MobileCta.Modal modal = (RetirementUninvestedViewModel.MobileCta.Modal) cta;
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new RetirementUninvestedModal(modal.getData(), getEventScreen(), new RetirementUninvestedModal.UninvestedLoggingInfo(modal.getLoggingIdentifier(), null, null, null, 14, null)), null, 2, null).show(getChildFragmentManager(), modal.getLoggingIdentifier());
    }

    private final void oneTimeAnimationUpdateListener(final LottieAnimationView lottieAnimationView, final float f, final Function0<Unit> function0) {
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment.oneTimeAnimationUpdateListener.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (animator.getAnimatedFraction() >= f) {
                    lottieAnimationView.removeUpdateListener(this);
                    function0.invoke();
                }
            }
        });
    }

    private final void setLayerText(LottieAnimationView lottieAnimationView, String str, final String str2) {
        lottieAnimationView.addValueCallback(new KeyPath("**", str), (KeyPath) LottieProperty.TEXT, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment.setLayerText.1
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
                return getValue((LottieFrameInfo<CharSequence>) lottieFrameInfo);
            }

            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final CharSequence getValue(LottieFrameInfo<CharSequence> lottieFrameInfo) {
                return str2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerScale(LottieAnimationView lottieAnimationView, String str, final float f) {
        lottieAnimationView.addValueCallback(new KeyPath("**", str), (KeyPath) LottieProperty.TRANSFORM_SCALE, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.TransferIraContributionCelebrationFragment.updateLayerScale.1
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
                return getValue((LottieFrameInfo<ScaleXY>) lottieFrameInfo);
            }

            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ScaleXY getValue(LottieFrameInfo<ScaleXY> lottieFrameInfo) {
                return new ScaleXY(lottieFrameInfo.getStartValue().getScaleX() * f, lottieFrameInfo.getStartValue().getScaleY() * f);
            }
        });
    }

    /* compiled from: TransferIraContributionCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferIraContributionCelebrationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferIraContributionCelebrationFragment;", "Lcom/robinhood/android/transfers/contracts/TransferIraContributionCelebrationKey;", "<init>", "()V", "ANIM_DURATION_MS", "", "LOTTIE_DESCALE_BASE_MULTIPLIER", "", "DESCALE_TEXT_LENGTH_THRESHOLD", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TransferIraContributionCelebrationFragment, TransferIraContributionCelebrationKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TransferIraContributionCelebrationKey transferIraContributionCelebrationKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, transferIraContributionCelebrationKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransferIraContributionCelebrationKey getArgs(TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment) {
            return (TransferIraContributionCelebrationKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transferIraContributionCelebrationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferIraContributionCelebrationFragment newInstance(TransferIraContributionCelebrationKey transferIraContributionCelebrationKey) {
            return (TransferIraContributionCelebrationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transferIraContributionCelebrationKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferIraContributionCelebrationFragment transferIraContributionCelebrationFragment, TransferIraContributionCelebrationKey transferIraContributionCelebrationKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transferIraContributionCelebrationFragment, transferIraContributionCelebrationKey);
        }
    }
}
