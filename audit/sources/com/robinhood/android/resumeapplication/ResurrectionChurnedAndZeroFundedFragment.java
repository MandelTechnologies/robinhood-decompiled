package com.robinhood.android.resumeapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.resumeapplication.databinding.FragmentResurrectionChurnedAndZeroFundedBinding;
import com.robinhood.models.api.bonfire.FundingUpsellContent;
import com.robinhood.models.api.bonfire.FundingUpsellValueProps;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.api.bonfire.ResumeApplicationTakeoverLoggingInfo;
import com.robinhood.models.serverdriven.experimental.api.FundAccountAction;
import com.robinhood.models.serverdriven.experimental.api.ResumeApplicationChurnedAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Clock;

/* compiled from: ResurrectionChurnedAndZeroFundedFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0003./0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001e\u0010)\u001a\u00020!*\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020!H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/resumeapplication/databinding/FragmentResurrectionChurnedAndZeroFundedBinding;", "getBinding", "()Lcom/robinhood/android/resumeapplication/databinding/FragmentResurrectionChurnedAndZeroFundedBinding;", "binding$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindContent", "Lcom/robinhood/android/resumeapplication/ResumeApplicationTimelineRowView;", "content", "Lcom/robinhood/models/api/bonfire/FundingUpsellValueProps;", "playAnimation", "Callbacks", "Args", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ResurrectionChurnedAndZeroFundedFragment extends BaseFragment implements AutoLoggableFragment {
    public static final String FUND_ACCOUNT_BUTTON_IDENTIFIER = "resurrections_v1_fund_account_button";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ResurrectionChurnedAndZeroFundedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ResurrectionChurnedAndZeroFundedFragment.class, "binding", "getBinding()Lcom/robinhood/android/resumeapplication/databinding/FragmentResurrectionChurnedAndZeroFundedBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ResurrectionChurnedAndZeroFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Callbacks;", "", "onFundAccountOnly", "", "onDetermineResurrectionUpsell", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/ResumeApplicationChurnedAction;", "onFundAccountCancel", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onDetermineResurrectionUpsell(ResumeApplicationChurnedAction action);

        void onFundAccountCancel();

        void onFundAccountOnly();
    }

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

    public ResurrectionChurnedAndZeroFundedFragment() {
        super(C26935R.layout.fragment_resurrection_churned_and_zero_funded);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, ResurrectionChurnedAndZeroFundedFragment2.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Context getEventContext() {
        Companion companion = INSTANCE;
        String str = null;
        return new Context(0, 0, 0, null, null, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ResumeApplicationTakeoverContext(((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getSeenResurrectionCount() == 0 ? 0L : Clock.systemDefaultZone().millis() - ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getMsLastResurrectionSeen(), ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getSeenResurrectionCount(), null, str, null, 28, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -268435457, -1, 16383, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RESUME_APPLICATION_V1_TAKEOVER, null, ((Args) INSTANCE.getArgs((Fragment) this)).getVariant().getServerValue(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, getEventContext(), null, null, 109, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentResurrectionChurnedAndZeroFundedBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentResurrectionChurnedAndZeroFundedBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), ResumeApplicationOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        List<FundingUpsellValueProps> valueProps;
        List<FundingUpsellValueProps> valueProps2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26678getAllXedK2Rk());
        RhTextView rhTextView = getBinding().resumeApplicationFundTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getTitle());
        getBinding().resumeApplicationFundSubtitle.setText(((Args) companion.getArgs((Fragment) this)).getSubtitle());
        RdsButton resumeApplicationFundPrimaryCta = getBinding().resumeApplicationFundPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(resumeApplicationFundPrimaryCta, "resumeApplicationFundPrimaryCta");
        FundingUpsellValueProps fundingUpsellValueProps = null;
        ViewsKt.eventData$default(resumeApplicationFundPrimaryCta, false, new Function0() { // from class: com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResurrectionChurnedAndZeroFundedFragment.onViewCreated$lambda$0(this.f$0);
            }
        }, 1, null);
        RdsButton resumeApplicationFundPrimaryCta2 = getBinding().resumeApplicationFundPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(resumeApplicationFundPrimaryCta2, "resumeApplicationFundPrimaryCta");
        OnClickListeners.onClick(resumeApplicationFundPrimaryCta2, new Function0() { // from class: com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResurrectionChurnedAndZeroFundedFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        ResumeApplicationTimelineRowView resumeApplicationFundTimelineFirstRow = getBinding().resumeApplicationFundTimelineFirstRow;
        Intrinsics.checkNotNullExpressionValue(resumeApplicationFundTimelineFirstRow, "resumeApplicationFundTimelineFirstRow");
        FundingUpsellContent fundingUpsellContent = ((Args) companion.getArgs((Fragment) this)).getFundingUpsellContent();
        FundingUpsellValueProps fundingUpsellValueProps2 = (fundingUpsellContent == null || (valueProps2 = fundingUpsellContent.getValueProps()) == null) ? null : (FundingUpsellValueProps) CollectionsKt.getOrNull(valueProps2, 0);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        bindContent(resumeApplicationFundTimelineFirstRow, fundingUpsellValueProps2, contextRequireContext);
        ResumeApplicationTimelineRowView resumeApplicationFundTimelineSecondRow = getBinding().resumeApplicationFundTimelineSecondRow;
        Intrinsics.checkNotNullExpressionValue(resumeApplicationFundTimelineSecondRow, "resumeApplicationFundTimelineSecondRow");
        FundingUpsellContent fundingUpsellContent2 = ((Args) companion.getArgs((Fragment) this)).getFundingUpsellContent();
        if (fundingUpsellContent2 != null && (valueProps = fundingUpsellContent2.getValueProps()) != null) {
            fundingUpsellValueProps = (FundingUpsellValueProps) CollectionsKt.getOrNull(valueProps, 1);
        }
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        bindContent(resumeApplicationFundTimelineSecondRow, fundingUpsellValueProps, contextRequireContext2);
        ImageView resumeApplicationFundCloseButton = getBinding().resumeApplicationFundCloseButton;
        Intrinsics.checkNotNullExpressionValue(resumeApplicationFundCloseButton, "resumeApplicationFundCloseButton");
        OnClickListeners.onClick(resumeApplicationFundCloseButton, new Function0() { // from class: com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResurrectionChurnedAndZeroFundedFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RichText disclosure = ((Args) companion.getArgs((Fragment) this)).getDisclosure();
        if (disclosure != null) {
            RhTextView resumeApplicationFundDisclaimer = getBinding().resumeApplicationFundDisclaimer;
            Intrinsics.checkNotNullExpressionValue(resumeApplicationFundDisclaimer, "resumeApplicationFundDisclaimer");
            RichTextExtensions.setRichText(resumeApplicationFundDisclaimer, disclosure);
        }
        playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$0(ResurrectionChurnedAndZeroFundedFragment resurrectionChurnedAndZeroFundedFragment) {
        return new UserInteractionEventDescriptor(null, resurrectionChurnedAndZeroFundedFragment.getEventScreen(), null, resurrectionChurnedAndZeroFundedFragment.getEventContext(), new Component(Component.ComponentType.BUTTON, FUND_ACCOUNT_BUTTON_IDENTIFIER, null, 4, null), null, 37, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ResurrectionChurnedAndZeroFundedFragment resurrectionChurnedAndZeroFundedFragment) {
        if (((Args) INSTANCE.getArgs((Fragment) resurrectionChurnedAndZeroFundedFragment)).getVariant() == ResumeApplicationResponse8.CHURNED_ZERO_M3A) {
            resurrectionChurnedAndZeroFundedFragment.getCallbacks().onDetermineResurrectionUpsell(new ResumeApplicationChurnedAction.FundAccountAction(new FundAccountAction(OnboardingUpsellIntentKey.RESURRECTIONS_M2_UPSELL)));
        } else {
            resurrectionChurnedAndZeroFundedFragment.getCallbacks().onFundAccountOnly();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ResurrectionChurnedAndZeroFundedFragment resurrectionChurnedAndZeroFundedFragment) {
        resurrectionChurnedAndZeroFundedFragment.getCallbacks().onFundAccountCancel();
        return Unit.INSTANCE;
    }

    private final void bindContent(ResumeApplicationTimelineRowView resumeApplicationTimelineRowView, FundingUpsellValueProps fundingUpsellValueProps, android.content.Context context) {
        if (fundingUpsellValueProps == null) {
            return;
        }
        resumeApplicationTimelineRowView.setTitleText(fundingUpsellValueProps.getTitle());
        resumeApplicationTimelineRowView.setSubtitleText(fundingUpsellValueProps.getSubtitle());
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(fundingUpsellValueProps.getPog());
        Integer numValueOf = serverToBentoAssetMapper3FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper3FromServerValue.getResourceId()) : null;
        if (numValueOf != null) {
            resumeApplicationTimelineRowView.setPictogram(context.getDrawable(numValueOf.intValue()));
        }
        resumeApplicationTimelineRowView.setCompleted(fundingUpsellValueProps.isCompleted());
    }

    private final void playAnimation() {
        getBinding().getRoot().transitionToState(C26935R.id.resume_application_fund_animation_shown);
    }

    /* compiled from: ResurrectionChurnedAndZeroFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Args;", "Landroid/os/Parcelable;", "variant", "Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "title", "", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "fundingUpsellContent", "Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "takeoverLoggingInfo", "Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "<init>", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/api/bonfire/FundingUpsellContent;Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;)V", "getVariant", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosure", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getFundingUpsellContent", "()Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "getTakeoverLoggingInfo", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RichText disclosure;
        private final FundingUpsellContent fundingUpsellContent;
        private final String subtitle;
        private final ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo;
        private final String title;
        private final ResumeApplicationResponse8 variant;

        /* compiled from: ResurrectionChurnedAndZeroFundedFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ResumeApplicationResponse8.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (RichText) parcel.readParcelable(Args.class.getClassLoader()), (FundingUpsellContent) parcel.readParcelable(Args.class.getClassLoader()), (ResumeApplicationTakeoverLoggingInfo) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ResumeApplicationResponse8 resumeApplicationResponse8, String str, String str2, RichText richText, FundingUpsellContent fundingUpsellContent, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                resumeApplicationResponse8 = args.variant;
            }
            if ((i & 2) != 0) {
                str = args.title;
            }
            if ((i & 4) != 0) {
                str2 = args.subtitle;
            }
            if ((i & 8) != 0) {
                richText = args.disclosure;
            }
            if ((i & 16) != 0) {
                fundingUpsellContent = args.fundingUpsellContent;
            }
            if ((i & 32) != 0) {
                resumeApplicationTakeoverLoggingInfo = args.takeoverLoggingInfo;
            }
            FundingUpsellContent fundingUpsellContent2 = fundingUpsellContent;
            ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo2 = resumeApplicationTakeoverLoggingInfo;
            return args.copy(resumeApplicationResponse8, str, str2, richText, fundingUpsellContent2, resumeApplicationTakeoverLoggingInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final ResumeApplicationResponse8 getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final RichText getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final FundingUpsellContent getFundingUpsellContent() {
            return this.fundingUpsellContent;
        }

        /* renamed from: component6, reason: from getter */
        public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
            return this.takeoverLoggingInfo;
        }

        public final Args copy(ResumeApplicationResponse8 variant, String title, String subtitle, RichText disclosure, FundingUpsellContent fundingUpsellContent, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
            return new Args(variant, title, subtitle, disclosure, fundingUpsellContent, takeoverLoggingInfo);
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
            return this.variant == args.variant && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.subtitle, args.subtitle) && Intrinsics.areEqual(this.disclosure, args.disclosure) && Intrinsics.areEqual(this.fundingUpsellContent, args.fundingUpsellContent) && Intrinsics.areEqual(this.takeoverLoggingInfo, args.takeoverLoggingInfo);
        }

        public int hashCode() {
            int iHashCode = ((((this.variant.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            RichText richText = this.disclosure;
            int iHashCode2 = (iHashCode + (richText == null ? 0 : richText.hashCode())) * 31;
            FundingUpsellContent fundingUpsellContent = this.fundingUpsellContent;
            return ((iHashCode2 + (fundingUpsellContent != null ? fundingUpsellContent.hashCode() : 0)) * 31) + this.takeoverLoggingInfo.hashCode();
        }

        public String toString() {
            return "Args(variant=" + this.variant + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ", fundingUpsellContent=" + this.fundingUpsellContent + ", takeoverLoggingInfo=" + this.takeoverLoggingInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.variant.name());
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.disclosure, flags);
            dest.writeParcelable(this.fundingUpsellContent, flags);
            dest.writeParcelable(this.takeoverLoggingInfo, flags);
        }

        public Args(ResumeApplicationResponse8 variant, String title, String subtitle, RichText richText, FundingUpsellContent fundingUpsellContent, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
            this.variant = variant;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosure = richText;
            this.fundingUpsellContent = fundingUpsellContent;
            this.takeoverLoggingInfo = takeoverLoggingInfo;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Args(ResumeApplicationResponse8 resumeApplicationResponse8, String str, String str2, RichText richText, FundingUpsellContent fundingUpsellContent, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo2;
            FundingUpsellContent fundingUpsellContent2;
            richText = (i & 8) != 0 ? null : richText;
            if ((i & 16) != 0) {
                resumeApplicationTakeoverLoggingInfo2 = resumeApplicationTakeoverLoggingInfo;
                fundingUpsellContent2 = null;
            } else {
                resumeApplicationTakeoverLoggingInfo2 = resumeApplicationTakeoverLoggingInfo;
                fundingUpsellContent2 = fundingUpsellContent;
            }
            this(resumeApplicationResponse8, str, str2, richText, fundingUpsellContent2, resumeApplicationTakeoverLoggingInfo2);
        }

        public final ResumeApplicationResponse8 getVariant() {
            return this.variant;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final RichText getDisclosure() {
            return this.disclosure;
        }

        public final FundingUpsellContent getFundingUpsellContent() {
            return this.fundingUpsellContent;
        }

        public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
            return this.takeoverLoggingInfo;
        }
    }

    /* compiled from: ResurrectionChurnedAndZeroFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment;", "Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Args;", "<init>", "()V", "FUND_ACCOUNT_BUTTON_IDENTIFIER", "", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ResurrectionChurnedAndZeroFundedFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ResurrectionChurnedAndZeroFundedFragment resurrectionChurnedAndZeroFundedFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, resurrectionChurnedAndZeroFundedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ResurrectionChurnedAndZeroFundedFragment newInstance(Args args) {
            return (ResurrectionChurnedAndZeroFundedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ResurrectionChurnedAndZeroFundedFragment resurrectionChurnedAndZeroFundedFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, resurrectionChurnedAndZeroFundedFragment, args);
        }
    }
}
