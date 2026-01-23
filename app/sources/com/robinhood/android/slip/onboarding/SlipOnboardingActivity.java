package com.robinhood.android.slip.onboarding;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.margin.contracts.SlipOnboardingKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.slip.onboarding.SlipOnboardingEvent;
import com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment;
import com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment;
import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment;
import com.robinhood.android.slip.onboarding.deeplink.SlipDeeplinkTargets4;
import com.robinhood.android.slip.onboarding.eligibilityresult.SlipOnboardingEligibilityResultFragment;
import com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment;
import com.robinhood.android.slip.onboarding.overlay.SlipOnboardingOverlay;
import com.robinhood.android.slip.onboarding.success.SlipOnboardingSuccessFragment;
import com.robinhood.android.slip.onboarding.utils.SLIPContextUtils;
import com.robinhood.android.slip.onboarding.valueprops.SlipOnboardingValuePropsFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireReview;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: SlipOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001UB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0016\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0014\u0010*\u001a\u00020\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010!H\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020.H\u0016J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0016J \u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020\u001cH\u0002J\b\u0010E\u001a\u00020\u001cH\u0002J\u0010\u0010F\u001a\u00020\u001c2\u0006\u00108\u001a\u00020.H\u0002J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020.2\u0006\u0010H\u001a\u00020.H\u0002J\u0018\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u0015H\u0002J\u0010\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020NH\u0002J\t\u0010O\u001a\u00020.H\u0096\u0001R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QX\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingFragment$Callbacks;", "Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Callbacks;", "Lcom/robinhood/android/slip/onboarding/valueprops/SlipOnboardingValuePropsFragment$Callbacks;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Callbacks;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Callbacks;", "Lcom/robinhood/android/slip/onboarding/eligibilityresult/SlipOnboardingEligibilityResultFragment$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "source", "", "getSource", "()Ljava/lang/String;", "investorProfileLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "onEligible", "onConsented", "onEligibilityError", "onChecklistError", "showErrorDialog", "throwable", "", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onSplashContinueClicked", "onSlipValuePropsContinueClicked", "onAllChecksPassed", "isRecommended", "onInvestorProfileConfirmed", "onEligibilityResultContinue", "onAgreementsAccepted", "onAgreementsError", "showSplash", "splash", "Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "showRecommendedFlow", "showValueProps", "valueProps", "Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;", "showInvestorProfile", "showChecklist", "showEligibilityResult", "showAgreements", "isQuickEnrollment", "showUkFlow", "entryPoint", "accountNumber", "showSuccess", "success", "Lcom/robinhood/models/db/SlipOnboarding$SuccessView;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingActivity extends BaseActivity implements RegionGated, SlipOnboardingLoadingFragment.Callbacks, SlipOnboardingSplashFragment.Callbacks, SlipOnboardingValuePropsFragment.Callbacks, SlipOnboardingAgreementsFragment.Callbacks, SlipOnboardingChecklistFragment.Callbacks, SlipOnboardingEligibilityResultFragment.Callbacks, ClientComponentAlertFragment.Callbacks {
    private static final int ERROR_DIALOG_ID = 9001;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> investorProfileLauncher;
    private SLIPContext loggingContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<SlipOnboardingEvent> event) {
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke2;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke3;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke4;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke5;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke6;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke7;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke8;
        EventConsumer<SlipOnboardingEvent> eventConsumerInvoke9;
        if ((event.getData() instanceof SlipOnboardingEvent.ShowSplash) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18941invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18941invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipOnboardingEvent.ShowSplash showSplash = (SlipOnboardingEvent.ShowSplash) event.getData();
                    this.showSplash(showSplash.getSplash(), showSplash.getShowRecommendedFlow(), showSplash.getLoggingContext());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowValueProps) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18942invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18942invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showValueProps(((SlipOnboardingEvent.ShowValueProps) event.getData()).getValueProps());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowInvestorProfile) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18943invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18943invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showInvestorProfile();
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowChecklist) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18944invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18944invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showChecklist();
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowEligibilityResult) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18945invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18945invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showEligibilityResult(((SlipOnboardingEvent.ShowEligibilityResult) event.getData()).isRecommended());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowAgreements) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18946invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18946invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipOnboardingEvent.ShowAgreements showAgreements = (SlipOnboardingEvent.ShowAgreements) event.getData();
                    this.showAgreements(showAgreements.getShowRecommendedFlow(), showAgreements.isQuickEnrollment());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowUkFlow) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18947invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18947invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipOnboardingEvent.ShowUkFlow showUkFlow = (SlipOnboardingEvent.ShowUkFlow) event.getData();
                    this.showUkFlow(showUkFlow.getEntryPoint(), showUkFlow.getAccountNumber());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingEvent.ShowSuccess) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$8
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18948invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18948invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showSuccess(((SlipOnboardingEvent.ShowSuccess) event.getData()).getSuccess());
                }
            });
        }
        if (!(event.getData() instanceof SlipOnboardingEvent.ShowError) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$handleEvent$$inlined$consumeIfType$9
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18949invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18949invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.showErrorDialog(((SlipOnboardingEvent.ShowError) event.getData()).getThrowable());
            }
        });
    }

    public SlipOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, SlipOnboardingDuxo.class);
        this.loggingContext = SLIPContextUtils.createSlipContext$default(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        this.investorProfileLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$investorProfileLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.onInvestorProfileConfirmed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SlipOnboardingDuxo getDuxo() {
        return (SlipOnboardingDuxo) this.duxo.getValue();
    }

    private final String getSource() {
        return ((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$configureToolbar$1$1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                return insets.consumeSystemWindowInsets();
            }
        });
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), SlipOnboardingOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.SLIP_ONBOARDING_LOADING, true);
            setFragment(C11048R.id.fragment_container, SlipOnboardingLoadingFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingLoadingFragment.Args(((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getAccountNumber())));
        } else {
            getDuxo().loadSlipOnboarding(getSource());
        }
        BaseActivity.collectDuxoState$default(this, null, new C285561(null), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C285572(null), 1, null);
    }

    /* compiled from: SlipOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.SlipOnboardingActivity$onCreate$1", m3645f = "SlipOnboardingActivity.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$onCreate$1 */
    static final class C285561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C285561(Continuation<? super C285561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipOnboardingActivity.this.new C285561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SlipOnboardingActivity.this.getDuxo().getStateFlow());
                final SlipOnboardingActivity slipOnboardingActivity = SlipOnboardingActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingActivity.onCreate.1.1
                    public final Object emit(SlipOnboardingViewState slipOnboardingViewState, Continuation<? super Unit> continuation) {
                        slipOnboardingActivity.loggingContext = slipOnboardingViewState.getLoggingContext();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SlipOnboardingViewState) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SlipOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.SlipOnboardingActivity$onCreate$2", m3645f = "SlipOnboardingActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$onCreate$2 */
    static final class C285572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C285572(Continuation<? super C285572> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipOnboardingActivity.this.new C285572(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SlipOnboardingActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingActivity$onCreate$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SlipOnboardingActivity $tmp0;

            AnonymousClass1(SlipOnboardingActivity slipOnboardingActivity) {
                this.$tmp0 = slipOnboardingActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SlipOnboardingActivity.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<SlipOnboardingEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C285572.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<SlipOnboardingEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SlipOnboardingActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SlipOnboardingActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(SlipOnboardingActivity slipOnboardingActivity, Event event, Continuation continuation) {
            slipOnboardingActivity.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment.Callbacks
    public void onEligible() {
        getDuxo().loadSlipOnboarding(getSource());
    }

    @Override // com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment.Callbacks
    public void onConsented() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new LegacyIntentKey.SlipHub(null, 1, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment.Callbacks
    public void onEligibilityError() {
        showErrorDialog(null);
    }

    @Override // com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment.Callbacks
    public void onChecklistError() {
        showErrorDialog(null);
    }

    static /* synthetic */ void showErrorDialog$default(SlipOnboardingActivity slipOnboardingActivity, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        slipOnboardingActivity.showErrorDialog(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorDialog(Throwable throwable) {
        String string2;
        if (throwable == null || (string2 = throwable.getMessage()) == null) {
            string2 = getString(C11048R.string.general_error_summary);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create(this).setId(ERROR_DIALOG_ID).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(string2).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, supportFragmentManager, "error-dialog", false, 4, null).setCancelable(false);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        finish();
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == ERROR_DIALOG_ID) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment.Callbacks
    public void onSplashContinueClicked() {
        getDuxo().onSplashContinueClicked();
    }

    @Override // com.robinhood.android.slip.onboarding.valueprops.SlipOnboardingValuePropsFragment.Callbacks
    public void onSlipValuePropsContinueClicked() {
        getDuxo().onValuePropsContinueClicked();
    }

    @Override // com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment.Callbacks
    public void onAllChecksPassed(boolean isRecommended) {
        getDuxo().onAllChecksPassed(isRecommended);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInvestorProfileConfirmed() {
        getDuxo().onInvestorProfileConfirmed();
    }

    @Override // com.robinhood.android.slip.onboarding.eligibilityresult.SlipOnboardingEligibilityResultFragment.Callbacks
    public void onEligibilityResultContinue() {
        getDuxo().onEligibilityResultContinue();
    }

    @Override // com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.Callbacks
    public void onAgreementsAccepted() {
        getDuxo().clearHomeCardStack();
        getDuxo().refreshFeatureDiscovery();
        getDuxo().onAgreementAccepted();
    }

    @Override // com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.Callbacks
    public void onAgreementsError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        showErrorDialog(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSplash(SlipOnboarding.SplashView splash, boolean showRecommendedFlow, SLIPContext loggingContext) {
        replaceFragmentWithoutBackStack(SlipOnboardingSplashFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingSplashFragment.Args(splash, showRecommendedFlow, loggingContext)));
        IdlingResourceCounters2.setBusy(IdlingResourceType.SLIP_ONBOARDING_LOADING, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showValueProps(SlipOnboarding.ValuePropsView valueProps) {
        replaceFragment(SlipOnboardingValuePropsFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingValuePropsFragment.Args(this.loggingContext, valueProps, ((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getSkipIntro())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInvestorProfile() {
        this.investorProfileLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new QuestionnaireReview(QuestionnaireContexts.SLIP_RECOMMENDATIONS, ((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 7796, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showChecklist() {
        replaceFragment(SlipOnboardingChecklistFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingChecklistFragment.Args(getSource(), ((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getAccountNumber())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEligibilityResult(boolean isRecommended) {
        replaceFragmentWithoutBackStack(SlipOnboardingEligibilityResultFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingEligibilityResultFragment.Args(getSource(), isRecommended)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAgreements(boolean showRecommendedFlow, boolean isQuickEnrollment) {
        SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment = (SlipOnboardingAgreementsFragment) SlipOnboardingAgreementsFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingAgreementsFragment.Args(showRecommendedFlow, this.loggingContext, ((SlipOnboardingKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), isQuickEnrollment));
        if (showRecommendedFlow) {
            replaceFragmentWithoutBackStack(slipOnboardingAgreementsFragment);
        } else {
            replaceFragment(slipOnboardingAgreementsFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUkFlow(String entryPoint, String accountNumber) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-slip-uk-onboarding", null, 2, null), new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).authority(SlipDeeplinkTargets4.INSTANCE.getPath()).appendQueryParameter("entry_point", entryPoint).appendQueryParameter("account_number", accountNumber).build().toString(), null, null, null, 28, null), false, false, false, false, null, true, null, null, 892, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccess(SlipOnboarding.SuccessView success) {
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(SlipOnboardingSuccessFragment.INSTANCE.newInstance((Parcelable) new SlipOnboardingSuccessFragment.Args(success, this.loggingContext, false, 4, null)));
    }

    /* compiled from: SlipOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingActivity;", "Lcom/robinhood/android/margin/contracts/SlipOnboardingKey;", "<init>", "()V", "ERROR_DIALOG_ID", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SlipOnboardingActivity, SlipOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public SlipOnboardingKey getExtras(SlipOnboardingActivity slipOnboardingActivity) {
            return (SlipOnboardingKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, slipOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, SlipOnboardingKey slipOnboardingKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, slipOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, SlipOnboardingKey slipOnboardingKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, slipOnboardingKey);
        }
    }
}
