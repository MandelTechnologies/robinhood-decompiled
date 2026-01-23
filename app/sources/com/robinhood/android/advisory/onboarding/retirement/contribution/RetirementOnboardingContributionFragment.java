package com.robinhood.android.advisory.onboarding.retirement.contribution;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.compose.BackHandler;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionEvent;
import com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contributions.AccountSelectionData;
import com.robinhood.android.retirement.contributions.ContributionEditMode;
import com.robinhood.android.retirement.contributions.ContributionEditModeState;
import com.robinhood.android.retirement.contributions.ContributionFooterState;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.android.retirement.contributions.ContributionReviewCallbacks;
import com.robinhood.android.retirement.contributions.ContributionReviewModeState;
import com.robinhood.android.retirement.contributions.ContributionSink;
import com.robinhood.android.retirement.contributions.RetirementContributionScreen;
import com.robinhood.android.transfers.contracts.CreateRetirementContributionsDialogFragmentKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireContract;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionContract;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionResult;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Year;

/* compiled from: RetirementOnboardingContributionFragment.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003VWUB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010\u0007J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u0007J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b1\u0010'J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b7\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\u0002068\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u00108R.\u0010L\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020J K*\n\u0012\u0004\u0012\u00020J\u0018\u00010I0I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR.\u0010O\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020N K*\n\u0012\u0004\u0012\u00020N\u0018\u00010I0I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Z²\u0006\f\u0010Y\u001a\u00020X8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;", "Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent;", "event", "", "handleEvent", "(Lcom/robinhood/android/udf/event/Event;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "chip", "onChipPressed", "(Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;)V", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onKeyPressed", "(Landroid/view/KeyEvent;)V", "onEditContinueClicked", "onAmountClicked", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "onFrequencyClicked", "(Lcom/robinhood/models/api/bonfire/TransferFrequency;)V", "Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", WebsocketGatewayConstants.DATA_KEY, "onSourceAccountClicked", "(Lcom/robinhood/android/retirement/contributions/AccountSelectionData;)V", "onTaxYearClicked", "Ljava/math/BigDecimal;", "amount", "j$/time/Year", "taxYear", "onUntilMaxClicked", "(Ljava/math/BigDecimal;Lj$/time/Year;)V", "onFrequencySelected", "onGoldSelectionRowClicked", "onSinkAccountClicked", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "sink", "onContributionTypeClicked", "(Lcom/robinhood/android/retirement/contributions/ContributionSink;)V", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Callbacks;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDuxo;", "duxo", "toolbarVisible", "Z", "getToolbarVisible", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "kotlin.jvm.PlatformType", "transferAccountSelectionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "iraContributionQuestionnaireLauncher", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionViewState;", "viewState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RetirementOnboardingContributionFragment extends GenericComposeFragment implements ContributionReviewCallbacks, ContributionEditMode, TransferFrequencyBottomSheetCallbacks, RegionGated {
    public static final int $stable = 0;
    private static final String ContributionLimitsTag = "onboarding_contribution_limits";
    private static final String FrequencySelectionTag = "onboarding_contribution_frequency_selection";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementOnboardingContributionDuxo.class);
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> iraContributionQuestionnaireLauncher;
    private final boolean toolbarVisible;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferAccountSelectionKey>> transferAccountSelectionLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementOnboardingContributionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RetirementOnboardingContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Callbacks;", "", "onFirstTimeContributionConfigured", "", "applicationId", "Ljava/util/UUID;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFirstTimeContributionConfigured(UUID applicationId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment, int i, Composer composer, int i2) {
        retirementOnboardingContributionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onContributionTypeClicked(ContributionSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onGoldSelectionRowClicked() {
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onSinkAccountClicked(AccountSelectionData data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<RetirementOnboardingContributionEvent> event) {
        EventConsumer<RetirementOnboardingContributionEvent> eventConsumerInvoke;
        EventConsumer<RetirementOnboardingContributionEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof RetirementOnboardingContributionEvent.LaunchTaxYear) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11122invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11122invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW), Boolean.TRUE), null, false, 6, null);
                }
            });
        }
        if (!(event.getData() instanceof RetirementOnboardingContributionEvent.PushToAgreements) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11123invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11123invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getCallbacks().onFirstTimeContributionConfigured(((RetirementOnboardingContributionFragment.Args) RetirementOnboardingContributionFragment.INSTANCE.getArgs((Fragment) this)).getApplicationId());
            }
        });
    }

    public RetirementOnboardingContributionFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferAccountSelectionKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TransferAccountSelectionContract(new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$transferAccountSelectionLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferAccountSelectionResult transferAccountSelectionResult) {
                if (transferAccountSelectionResult instanceof TransferAccountSelectionResult.Source) {
                    this.this$0.getDuxo().setSourceAccount(((TransferAccountSelectionResult.Source) transferAccountSelectionResult).getAccount());
                } else {
                    if (transferAccountSelectionResult instanceof TransferAccountSelectionResult.Sink) {
                        throw new IllegalStateException("Changing sink account in retirement onboarding is forbidden");
                    }
                    if (transferAccountSelectionResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transferAccountSelectionLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new IraContributionQuestionnaireContract(new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$iraContributionQuestionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraContributionQuestionnaireResult iraContributionQuestionnaireResult) {
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.UpdateTaxYear) {
                    this.this$0.getDuxo().setTaxYear(((IraContributionQuestionnaireResult.UpdateTaxYear) iraContributionQuestionnaireResult).getTaxYear());
                } else {
                    if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution) {
                        throw new IllegalStateException("Changing contribution type in retirement onboarding is forbidden");
                    }
                    if (iraContributionQuestionnaireResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.iraContributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementOnboardingContributionDuxo getDuxo() {
        return (RetirementOnboardingContributionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementOnboardingContributionViewState ComposeContent$lambda$4(SnapshotState4<RetirementOnboardingContributionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C90721(null), 1, null);
    }

    /* compiled from: RetirementOnboardingContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$onViewCreated$1", m3645f = "RetirementOnboardingContributionFragment.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$onViewCreated$1 */
    static final class C90721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C90721(Continuation<? super C90721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementOnboardingContributionFragment.this.new C90721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C90721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RetirementOnboardingContributionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RetirementOnboardingContributionFragment $tmp0;

            AnonymousClass1(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment) {
                this.$tmp0 = retirementOnboardingContributionFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RetirementOnboardingContributionFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<RetirementOnboardingContributionEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C90721.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<RetirementOnboardingContributionEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RetirementOnboardingContributionFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RetirementOnboardingContributionFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment, Event event, Continuation continuation) {
            retirementOnboardingContributionFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-112505120);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112505120, i2, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent (RetirementOnboardingContributionFragment.kt:131)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            boolean z = !ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).isInEditMode();
            RetirementOnboardingContributionDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RetirementOnboardingContributionFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(z, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 0, 0);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(41804789, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(41804789, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.<anonymous> (RetirementOnboardingContributionFragment.kt:138)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    final SnapshotState4<RetirementOnboardingContributionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    final RetirementOnboardingContributionFragment retirementOnboardingContributionFragment = this;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-43966031, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-43966031, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.<anonymous>.<anonymous> (RetirementOnboardingContributionFragment.kt:142)");
                            }
                            final SnapshotState4<RetirementOnboardingContributionViewState> snapshotState42 = snapshotState4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-441185692, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-441185692, i6, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RetirementOnboardingContributionFragment.kt:144)");
                                    }
                                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f);
                                    BentoText2.m20747BentoText38GnDrw(RetirementOnboardingContributionFragment.ComposeContent$lambda$4(snapshotState42).getTitle(), modifierFillMaxWidth, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextL(), composer4, 48, 0, 8124);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(-673603184, true, new AnonymousClass2(retirementOnboardingContributionFragment), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RetirementOnboardingContributionFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$ComposeContent$2$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ RetirementOnboardingContributionFragment this$0;

                            AnonymousClass2(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment) {
                                this.this$0 = retirementOnboardingContributionFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-673603184, i, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RetirementOnboardingContributionFragment.kt:152)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.this$0);
                                final RetirementOnboardingContributionFragment retirementOnboardingContributionFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$ComposeContent$2$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RetirementOnboardingContributionFragment.C90702.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(retirementOnboardingContributionFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment) {
                                retirementOnboardingContributionFragment.requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54);
                    final RetirementOnboardingContributionFragment retirementOnboardingContributionFragment2 = this;
                    final SnapshotState4<RetirementOnboardingContributionViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-132693050, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.2.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-132693050, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.ComposeContent.<anonymous>.<anonymous> (RetirementOnboardingContributionFragment.kt:160)");
                            }
                            RetirementOnboardingContributionViewState retirementOnboardingContributionViewStateComposeContent$lambda$4 = RetirementOnboardingContributionFragment.ComposeContent$lambda$4(snapshotState42);
                            RetirementOnboardingContributionFragment retirementOnboardingContributionFragment3 = retirementOnboardingContributionFragment2;
                            RetirementOnboardingContributionDuxo duxo2 = retirementOnboardingContributionFragment3.getDuxo();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(duxo2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new RetirementOnboardingContributionFragment3(duxo2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            RetirementContributionScreen.RetirementContributionScreen(retirementOnboardingContributionViewStateComposeContent$lambda$4, retirementOnboardingContributionFragment3, retirementOnboardingContributionFragment3, (Function0) ((KFunction) objRememberedValue2), PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, composer3, ContributionFooterState.$stable | ContributionProgressRingState.$stable | ContributionReviewModeState.$stable | ContributionEditModeState.$stable, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementOnboardingContributionFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
    public void onChipPressed(KeypadChip chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        getDuxo().onChipPressed(chip);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
    public void onKeyPressed(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getDuxo().consumeKeyEvent(event);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
    public void onEditContinueClicked() {
        getDuxo().onEditContinueClicked();
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onAmountClicked() {
        getDuxo().moveToEditMode();
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onFrequencyClicked(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new TransferFrequencyBottomSheetFragmentKey(false, frequency, null, 4, null), null, 2, null).show(getChildFragmentManager(), FrequencySelectionTag);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onSourceAccountClicked(AccountSelectionData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferAccountSelectionKey>> activityResultLauncher = this.transferAccountSelectionLauncher;
        TransferAccountDirection transferAccountDirection = TransferAccountDirection.SOURCE;
        List<TransferAccount> accounts2 = data.getAccounts();
        TransferAccount sourceAccount = data.getSourceAccount();
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new TransferAccountSelectionKey(null, transferAccountDirection, accounts2, sourceAccount != null ? sourceAccount.getId() : null, true, data.getSourceAccount(), IraContributionType.ONE_TIME_CONTRIBUTION, true, data.getMatchRateTypeOverride(), null, null, null, null, null, null, null, 65025, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onTaxYearClicked() {
        NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW), Boolean.TRUE), null, false, 6, null);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
    public void onUntilMaxClicked(BigDecimal amount, Year taxYear) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Navigator navigator = getNavigator();
        String string2 = amount.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new CreateRetirementContributionsDialogFragmentKey(string2, taxYear.getValue(), false, 4, null), null, 2, null).show(getChildFragmentManager(), ContributionLimitsTag);
    }

    @Override // com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks
    public void onFrequencySelected(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getDuxo().setFrequency(frequency);
    }

    /* compiled from: RetirementOnboardingContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Args;", "Landroid/os/Parcelable;", "applicationId", "Ljava/util/UUID;", "contributionYears", "", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "minimumContribution", "Lcom/robinhood/models/util/Money;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getApplicationId", "()Ljava/util/UUID;", "getContributionYears", "()Ljava/util/List;", "getMinimumContribution", "()Lcom/robinhood/models/util/Money;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final UUID applicationId;
        private final List<ContributionYear> contributionYears;
        private final Money minimumContribution;
        private final String source;

        /* compiled from: RetirementOnboardingContributionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(uuid, arrayList, (Money) parcel.readParcelable(Args.class.getClassLoader()), BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, List list, Money money, BrokerageAccountType brokerageAccountType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.applicationId;
            }
            if ((i & 2) != 0) {
                list = args.contributionYears;
            }
            if ((i & 4) != 0) {
                money = args.minimumContribution;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = args.accountType;
            }
            if ((i & 16) != 0) {
                str = args.source;
            }
            String str2 = str;
            Money money2 = money;
            return args.copy(uuid, list, money2, brokerageAccountType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final List<ContributionYear> component2() {
            return this.contributionYears;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getMinimumContribution() {
            return this.minimumContribution;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(UUID applicationId, List<ContributionYear> contributionYears, Money minimumContribution, BrokerageAccountType accountType, String source) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
            Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new Args(applicationId, contributionYears, minimumContribution, accountType, source);
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
            return Intrinsics.areEqual(this.applicationId, args.applicationId) && Intrinsics.areEqual(this.contributionYears, args.contributionYears) && Intrinsics.areEqual(this.minimumContribution, args.minimumContribution) && this.accountType == args.accountType && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((((((this.applicationId.hashCode() * 31) + this.contributionYears.hashCode()) * 31) + this.minimumContribution.hashCode()) * 31) + this.accountType.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(applicationId=" + this.applicationId + ", contributionYears=" + this.contributionYears + ", minimumContribution=" + this.minimumContribution + ", accountType=" + this.accountType + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.applicationId);
            List<ContributionYear> list = this.contributionYears;
            dest.writeInt(list.size());
            Iterator<ContributionYear> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.minimumContribution, flags);
            dest.writeString(this.accountType.name());
            dest.writeString(this.source);
        }

        public Args(UUID applicationId, List<ContributionYear> contributionYears, Money minimumContribution, BrokerageAccountType accountType, String str) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
            Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.applicationId = applicationId;
            this.contributionYears = contributionYears;
            this.minimumContribution = minimumContribution;
            this.accountType = accountType;
            this.source = str;
        }

        public /* synthetic */ Args(UUID uuid, List list, Money money, BrokerageAccountType brokerageAccountType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, list, money, brokerageAccountType, (i & 16) != 0 ? null : str);
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final List<ContributionYear> getContributionYears() {
            return this.contributionYears;
        }

        public final Money getMinimumContribution() {
            return this.minimumContribution;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: RetirementOnboardingContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Args;", "<init>", "()V", "FrequencySelectionTag", "", "ContributionLimitsTag", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementOnboardingContributionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementOnboardingContributionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementOnboardingContributionFragment newInstance(Args args) {
            return (RetirementOnboardingContributionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementOnboardingContributionFragment retirementOnboardingContributionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementOnboardingContributionFragment, args);
        }
    }
}
