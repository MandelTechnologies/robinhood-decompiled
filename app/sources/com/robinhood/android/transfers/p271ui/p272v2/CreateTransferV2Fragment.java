package com.robinhood.android.transfers.p271ui.p272v2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.TransferActionDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.contracts.ClawbackGracePeriod;
import com.robinhood.android.acats.contracts.GracePeriodOptInResult;
import com.robinhood.android.acats.contracts.GracePeriodOptInResult2;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhAchromaticDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentiveCancellationDialogData;
import com.robinhood.android.incentives.wonka.TransferInteractionHandler;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.CreateTransferCallbacks;
import com.robinhood.android.lib.transfers.TransferFragmentExtensions;
import com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.retirement.contracts.RetirementEnokiInfo;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireContract;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.LimitsHubDetails;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.TransfersDeepLinkMetadata;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.lib.validation.IraDistributionCheck;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireActivity;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Event;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Fragment;
import com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertArgs;
import com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks;
import com.robinhood.android.transfers.util.PreCreateLoggingEvents;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.DeepLinkContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Intents;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CreateTransferV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002pqB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010G\u001a\u00020=2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020=H\u0016J\u001a\u0010K\u001a\u00020=2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\r\u0010P\u001a\u00020=H\u0017¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020=H\u0016J\b\u0010S\u001a\u00020\u001cH\u0016J\u001a\u0010T\u001a\u00020\u001c2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010OH\u0016J\u001a\u0010X\u001a\u00020\u001c2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010OH\u0016J\"\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u00020V2\u0006\u0010[\u001a\u00020V2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\"\u0010^\u001a\u00020\u001c2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010O2\u0006\u0010_\u001a\u00020`H\u0016J\u0018\u0010a\u001a\u00020=2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020cH\u0016J\b\u0010e\u001a\u00020=H\u0016J\u0010\u0010f\u001a\u00020=2\u0006\u0010g\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020=2\u0006\u0010j\u001a\u00020\u001cH\u0016J\u0018\u0010k\u001a\u00020=2\u0006\u0010j\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020mH\u0016J\b\u0010n\u001a\u00020=H\u0016J\b\u0010o\u001a\u00020=H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b7\u00108R \u0010:\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020=0;X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020A B*\n\u0012\u0004\u0012\u00020A\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D B*\n\u0012\u0004\u0012\u00020D\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010E\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010F0F0?X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006r²\u0006\n\u0010s\u001a\u00020tX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", "Lcom/robinhood/android/incentives/wonka/TransferInteractionHandler;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "getWonkaServiceManager", "()Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "setWonkaServiceManager", "(Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "duxo", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "duxo$delegate", "callbacks", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "threeDSCallbacks", "Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "getThreeDSCallbacks", "()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "threeDSCallbacks$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "iraContributionQuestionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "kotlin.jvm.PlatformType", "gracePeriodOptInLauncher", "Lcom/robinhood/android/acats/contracts/ClawbackGracePeriod;", "iraDistributionQuestionnaireLauncher", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDestroy", "onBackPressed", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onLinkTextClicked", "url", "", "onEditIraDistributionTaxWithholding", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "onEditIraDistributionWithdrawalAmount", "onFrequencySelected", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onDismiss", "leavingEditMode", "onAlertSelected", "action", "Lbff_money_movement/service/v1/TransferActionDto;", "onTransferContinueRequested", "onTransferExitRequested", "Callbacks", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferV2Fragment extends GenericComposeFragment implements AutoLoggableFragment, IraDistributionTaxWithholdingBottomSheetFragment.Callbacks, TransferFrequencyBottomSheetCallbacks, ValidationAlertCallbacks, TransferInteractionHandler {
    public static final int DEBIT_CARD_LINKING_REQUEST_CODE = 56709;
    public static final String DEPOSIT_INCENTIVE_CANCEL_DIALOG_DATA = "deposit_incentive_cancel_dialog_data";
    public static final String TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG = "deposit_incentive_cancellation_dialog";
    public static final String TAG_IRA_DISTRIBUTION_TAX_WITHHOLDING = "ira-distribution-tax-withholding";
    public EventLogger eventLogger;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ClawbackGracePeriod>> gracePeriodOptInLauncher;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> iraContributionQuestionnaireLauncher;
    private final ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> iraDistributionQuestionnaireLauncher;
    public Markwon markwon;
    public WonkaServiceManager wonkaServiceManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateTransferV2Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(CreateTransferV2Fragment.class, "threeDSCallbacks", "getThreeDSCallbacks()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID = -362611377;
    private static final StateFlow2<UiEvent<String>> multiTransferFlowEventFlow = StateFlow4.MutableStateFlow(null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Fragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Fragment.screenEventContext_delegate$lambda$2(this.f$0);
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CreateTransferV2Duxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateTransferV2Fragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: threeDSCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 threeDSCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ThreeDSHostCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ThreeDSHostCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Fragment.launchSuv$lambda$4(this.f$0);
        }
    }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Fragment.launchSuv$lambda$5(this.f$0);
        }
    });

    /* compiled from: CreateTransferV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Callbacks;", "Lcom/robinhood/android/lib/transfers/CreateTransferCallbacks;", "onShowFragment", "", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends CreateTransferCallbacks {
        void onShowFragment(FragmentKey key);
    }

    /* compiled from: CreateTransferV2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$26(CreateTransferV2Fragment createTransferV2Fragment, int i, Composer composer, int i2) {
        createTransferV2Fragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final CreateTransferV2ViewState ComposeContent$lambda$13(SnapshotState4<CreateTransferV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public CreateTransferV2Fragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new IraContributionQuestionnaireContract(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$iraContributionQuestionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraContributionQuestionnaireResult iraContributionQuestionnaireResult) {
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.UpdateTaxYear) {
                    this.this$0.getDuxo().setTaxYear((IraContributionQuestionnaireResult.UpdateTaxYear) iraContributionQuestionnaireResult);
                } else if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution) {
                    this.this$0.getDuxo().onContributionQuestionnaireFinished((IraContributionQuestionnaireResult.IraContribution) iraContributionQuestionnaireResult);
                } else if (iraContributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.iraContributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ClawbackGracePeriod>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new GracePeriodOptInResult2(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$gracePeriodOptInLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GracePeriodOptInResult gracePeriodOptInResult) {
                if (gracePeriodOptInResult instanceof GracePeriodOptInResult.OptIn) {
                    CreateTransferV2Duxo.createTransfer$default(this.this$0.getDuxo(), true, false, Boolean.TRUE, 2, null);
                } else if (gracePeriodOptInResult instanceof GracePeriodOptInResult.OptOut) {
                    CreateTransferV2Duxo.createTransfer$default(this.this$0.getDuxo(), true, false, Boolean.FALSE, 2, null);
                } else if (gracePeriodOptInResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.gracePeriodOptInLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(IraDistributionQuestionnaireActivity.ResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$iraDistributionQuestionnaireLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraDistributionQuestionnaireResult iraDistributionQuestionnaireResult) {
                if (iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.IraDistribution) {
                    this.this$0.getDuxo().onDistributionQuestionnaireFinished((IraDistributionQuestionnaireResult.IraDistribution) iraDistributionQuestionnaireResult);
                } else if (iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.UpdateDistributionType) {
                    this.this$0.getDuxo().onIraDistributionTypeUpdate(((IraDistributionQuestionnaireResult.UpdateDistributionType) iraDistributionQuestionnaireResult).getDistributionType());
                } else if (iraDistributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.iraDistributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult3;
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

    public final WonkaServiceManager getWonkaServiceManager() {
        WonkaServiceManager wonkaServiceManager = this.wonkaServiceManager;
        if (wonkaServiceManager != null) {
            return wonkaServiceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wonkaServiceManager");
        return null;
    }

    public final void setWonkaServiceManager(WonkaServiceManager wonkaServiceManager) {
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "<set-?>");
        this.wonkaServiceManager = wonkaServiceManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.robinhood.rosetta.eventlogging.Context screenEventContext_delegate$lambda$2(CreateTransferV2Fragment createTransferV2Fragment) {
        TransfersDeepLinkMetadata deepLinkMetadata = ((TransferV2) INSTANCE.getArgs((Fragment) createTransferV2Fragment)).getDeepLinkMetadata();
        if (deepLinkMetadata == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - deepLinkMetadata.getStartTime();
        String string2 = deepLinkMetadata.getDeepLinkUri().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new DeepLinkContext(jCurrentTimeMillis, string2, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -65537, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateTransferV2Duxo getDuxo() {
        return (CreateTransferV2Duxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreeDSHostCallbacks getThreeDSCallbacks() {
        return (ThreeDSHostCallbacks) this.threeDSCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$4(CreateTransferV2Fragment createTransferV2Fragment) {
        CreateTransferV2Duxo.createTransfer$default(createTransferV2Fragment.getDuxo(), false, false, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$5(CreateTransferV2Fragment createTransferV2Fragment) {
        createTransferV2Fragment.getDuxo().onVerificationResultNotApproved();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        int i;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        int i2 = WhenMappings.$EnumSwitchMapping$0[((TransferV2) INSTANCE.getArgs((Fragment) this)).getDirection().ordinal()];
        if (i2 == 1) {
            i = C8331R.string.transfer_deposit_label;
        } else if (i2 == 2) {
            i = C8331R.string.transfer_withdrawal_label;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C8331R.string.transfer_inter_entity_label;
        }
        toolbar.setTitle(getText(i));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UiEvent<String> value = multiTransferFlowEventFlow.getValue();
        if (value != null) {
            value.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Fragment.onResume$lambda$10(this.f$0, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(CreateTransferV2Fragment createTransferV2Fragment, String signal) {
        Intrinsics.checkNotNullParameter(signal, "signal");
        if (Intrinsics.areEqual(signal, "should-exit")) {
            createTransferV2Fragment.requireActivity().finish();
        }
        StateFlow2<UiEvent<String>> stateFlow2 = multiTransferFlowEventFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), null)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UiEvent<Unit> threeDSCancelationEvent = getThreeDSCallbacks().getThreeDSCancelationEvent();
        if (threeDSCancelationEvent != null) {
            threeDSCancelationEvent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Fragment.onViewCreated$lambda$11(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> threeDSCompletionEvent = getThreeDSCallbacks().getThreeDSCompletionEvent();
        if (threeDSCompletionEvent != null) {
            threeDSCompletionEvent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Fragment.onViewCreated$lambda$12(this.f$0, (Unit) obj);
                }
            });
        }
        BaseFragment.collectDuxoState$default(this, null, new C312173(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(CreateTransferV2Fragment createTransferV2Fragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferV2Fragment.getDuxo().invalidateCurrentTransfer();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(CreateTransferV2Fragment createTransferV2Fragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        CreateTransferV2Duxo.createTransfer$default(createTransferV2Fragment.getDuxo(), false, true, null, 5, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3", m3645f = "CreateTransferV2Fragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3 */
    static final class C312173 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C312173(Continuation<? super C312173> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Fragment.this.new C312173(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312173) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CreateTransferV2Fragment.this.getDuxo().getEventFlow());
                final CreateTransferV2Fragment createTransferV2Fragment = CreateTransferV2Fragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment.onViewCreated.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CreateTransferV2Event>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CreateTransferV2Event> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke2;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke3;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke4;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke5;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke6;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke7;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke8;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke9;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke10;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke11;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke12;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke13;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke14;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke15;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke16;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke17;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke18;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke19;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke20;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke21;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke22;
                        EventConsumer<CreateTransferV2Event> eventConsumerInvoke23;
                        final CreateTransferV2Fragment createTransferV2Fragment2 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.CreateTransferError) && (eventConsumerInvoke23 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke23.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m19983invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19983invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TransferFragmentExtensions.handleCreateTransferError(createTransferV2Fragment2, ((CreateTransferV2Event.CreateTransferError) event.getData()).getThrowable());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment3 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.Deeplink) && (eventConsumerInvoke22 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke22.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19994invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19994invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Uri uri = ((CreateTransferV2Event.Deeplink) event.getData()).getUri();
                                    Navigator navigator = createTransferV2Fragment3.getNavigator();
                                    Context contextRequireContext = createTransferV2Fragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment4 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ShowValidationAlert) && (eventConsumerInvoke21 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke21.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19999invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19999invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CreateTransferV2Event.ShowValidationAlert showValidationAlert = (CreateTransferV2Event.ShowValidationAlert) event.getData();
                                    Navigator.DefaultImpls.createDialogFragment$default(createTransferV2Fragment4.getNavigator(), new ValidationAlertArgs(showValidationAlert.getAlertContent(), showValidationAlert.getLeavingEditMode()), null, 2, null).show(createTransferV2Fragment4.getChildFragmentManager(), "validationAlert");
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment5 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.EditIraDistributionType) && (eventConsumerInvoke20 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke20.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20000invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20000invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    createTransferV2Fragment5.iraDistributionQuestionnaireLauncher.launch(((CreateTransferV2Event.EditIraDistributionType) event.getData()).getLaunchMode());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment6 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.EditIraDistributionTaxWithholding) && (eventConsumerInvoke19 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke19.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20001invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20001invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IraDistributionTaxWithholdingBottomSheetFragment iraDistributionTaxWithholdingBottomSheetFragment = (IraDistributionTaxWithholdingBottomSheetFragment) IraDistributionTaxWithholdingBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CreateTransferV2Event.EditIraDistributionTaxWithholding) event.getData()).getArgs());
                                    FragmentManager childFragmentManager = createTransferV2Fragment6.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    iraDistributionTaxWithholdingBottomSheetFragment.show(childFragmentManager, CreateTransferV2Fragment.TAG_IRA_DISTRIBUTION_TAX_WITHHOLDING);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment7 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.Finish) && (eventConsumerInvoke18 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke18.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$6
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20002invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20002invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    createTransferV2Fragment7.requireActivity().finish();
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment8 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.FrequencySelection) && (eventConsumerInvoke17 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke17.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$7
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20003invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20003invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.createDialogFragment$default(createTransferV2Fragment8.getNavigator(), ((CreateTransferV2Event.FrequencySelection) event.getData()).getKey(), null, 2, null).show(createTransferV2Fragment8.getChildFragmentManager(), "transferFrequencyBottomSheet");
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment9 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.IraContributionQuestionnaire) && (eventConsumerInvoke16 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke16.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$8
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20004invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20004invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NavigationActivityResultContract3.launch$default(createTransferV2Fragment9.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(((CreateTransferV2Event.IraContributionQuestionnaire) event.getData()).getLaunchMode(), null, 2, null), null, false, 6, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment10 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.IraDistributionQuestionnaire) && (eventConsumerInvoke15 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke15.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$9
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20005invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20005invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    createTransferV2Fragment10.iraDistributionQuestionnaireLauncher.launch(((CreateTransferV2Event.IraDistributionQuestionnaire) event.getData()).getLaunchMode());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment11 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.PrecreateAssetRetention) && (eventConsumerInvoke14 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke14.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$10
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19984invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19984invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AssetRetentionUpsellContent assetRetentionContent = ((CreateTransferV2Event.PrecreateAssetRetention) event.getData()).getAssetRetentionContent();
                                    createTransferV2Fragment11.getWonkaServiceManager().enableMicrogramInteractions(createTransferV2Fragment11.getLifecycleScope(), createTransferV2Fragment11);
                                    Navigator navigator = createTransferV2Fragment11.getNavigator();
                                    Context contextRequireContext = createTransferV2Fragment11.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(assetRetentionContent.getDeeplink()), null, null, false, null, 60, null);
                                    createTransferV2Fragment11.getWonkaServiceManager().markAssetRetentionPromotionSeen(assetRetentionContent.getRetentionPeriodKey());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment12 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.Precreate) && (eventConsumerInvoke13 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke13.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$11
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19985invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19985invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CreateTransferV2Event.Precreate precreate = (CreateTransferV2Event.Precreate) event.getData();
                                    AlertAction<DisplayRTPUpsellAction> alertActionComponent1 = precreate.component1();
                                    final PreCreatePopupType type2 = precreate.getType();
                                    PreCreateLoggingEvents.logPreCreateBottomSheetAppeared(createTransferV2Fragment12.getEventLogger(), type2, createTransferV2Fragment12.getEventScreen().getName());
                                    CreateTransferV2Fragment createTransferV2Fragment13 = createTransferV2Fragment12;
                                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                                    FragmentManager childFragmentManager = createTransferV2Fragment13.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    Markwon markwon = createTransferV2Fragment12.getMarkwon();
                                    GenericAlertContent<ActionT> alert = alertActionComponent1.getAlert();
                                    final CreateTransferV2Fragment createTransferV2Fragment14 = createTransferV2Fragment12;
                                    SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$11$1
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                        public final boolean mo15941handle(DisplayRTPUpsellAction action) {
                                            Intrinsics.checkNotNullParameter(action, "action");
                                            createTransferV2Fragment14.setSheetListener(null);
                                            if (action instanceof DisplayRTPUpsellAction.RtpUpsellSwitchToRtp) {
                                                createTransferV2Fragment14.getDuxo().onAchTransferOptionSelected(AchTransferOption.INSTANT);
                                                return true;
                                            }
                                            if (action instanceof DisplayRTPUpsellAction.RtpUpsellProceedWithRegularTransfer) {
                                                PreCreateLoggingEvents.logPreCreateBottomSheetClick(createTransferV2Fragment14.getEventLogger(), type2, UserInteractionEventData.Action.SECONDARY_CTA, createTransferV2Fragment14.getEventScreen().getName());
                                                CreateTransferV2Duxo.createTransfer$default(createTransferV2Fragment14.getDuxo(), false, false, null, 7, null);
                                                return true;
                                            }
                                            if (action instanceof DisplayRTPUpsellAction.Confirm) {
                                                PreCreateLoggingEvents.logPreCreateBottomSheetClick(createTransferV2Fragment14.getEventLogger(), type2, UserInteractionEventData.Action.CONTINUE, createTransferV2Fragment14.getEventScreen().getName());
                                                CreateTransferV2Duxo.createTransfer$default(createTransferV2Fragment14.getDuxo(), false, false, null, 7, null);
                                                return true;
                                            }
                                            if (action instanceof DisplayRTPUpsellAction.Dismiss) {
                                                PreCreateLoggingEvents.logPreCreateBottomSheetClick(createTransferV2Fragment14.getEventLogger(), type2, UserInteractionEventData.Action.DISMISS, createTransferV2Fragment14.getEventScreen().getName());
                                                return true;
                                            }
                                            if (!(action instanceof DisplayRTPUpsellAction.Deeplink)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PreCreateLoggingEvents.logPreCreateBottomSheetClick(createTransferV2Fragment14.getEventLogger(), type2, UserInteractionEventData.Action.VIEW_DEEPLINK, createTransferV2Fragment14.getEventScreen().getName());
                                            Navigator navigator = createTransferV2Fragment14.getNavigator();
                                            Context contextRequireContext = createTransferV2Fragment14.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((DisplayRTPUpsellAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                                            return true;
                                        }
                                    };
                                    final CreateTransferV2Fragment createTransferV2Fragment15 = createTransferV2Fragment12;
                                    createTransferV2Fragment13.setSheetListener(sduiAlert.sheetListener(childFragmentManager, markwon, alert, sduiActionHandler, (Function0<Unit>) new Function0<Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$11$2
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            PreCreateLoggingEvents.logPreCreateBottomSheetClick(createTransferV2Fragment15.getEventLogger(), type2, UserInteractionEventData.Action.DISMISS, createTransferV2Fragment15.getEventScreen().getName());
                                        }
                                    }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return SduiAlert.sheetListener$lambda$16((String) obj2);
                                        }
                                    } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return SduiAlert.sheetListener$lambda$17((String) obj2);
                                        }
                                    } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment13 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.Success) && (eventConsumerInvoke12 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke12.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$12
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19986invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19986invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PostTransferFlow postTransferFlow = ((CreateTransferV2Event.Success) event.getData()).getPostTransferFlow();
                                    Set of = SetsKt.setOf(MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT);
                                    CreateTransferV2Fragment.Companion companion = CreateTransferV2Fragment.INSTANCE;
                                    if (of.contains(((TransferV2) companion.getArgs((Fragment) createTransferV2Fragment13)).getTransferConfiguration().getEntryPoint())) {
                                        StateFlow2<UiEvent<String>> multiTransferFlowEventFlow = companion.getMultiTransferFlowEventFlow();
                                        while (!multiTransferFlowEventFlow.compareAndSet(multiTransferFlowEventFlow.getValue(), new UiEvent<>("should-exit"))) {
                                        }
                                    }
                                    createTransferV2Fragment13.getCallbacks().onTransferSuccess(postTransferFlow);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment14 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ValidationError) && (eventConsumerInvoke11 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke11.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$13
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19987invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19987invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ((CreateTransferV2Event.ValidationError) event.getData()).getValidationFailure().showAlert(createTransferV2Fragment14.requireBaseActivity(), createTransferV2Fragment14.getEventLogger());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment15 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.VerificationWorkflow) && (eventConsumerInvoke10 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke10.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$14
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19988invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19988invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CreateTransferV2Event.VerificationWorkflow verificationWorkflow = (CreateTransferV2Event.VerificationWorkflow) event.getData();
                                    createTransferV2Fragment15.launchSuv.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.getIsMigrated()));
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment16 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.LaunchDialog) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$15
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19989invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19989invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.createDialogFragment$default(createTransferV2Fragment16.getNavigator(), ((CreateTransferV2Event.LaunchDialog) event.getData()).getKey(), null, 2, null).show(createTransferV2Fragment16.getChildFragmentManager(), "accountSelectionDialog");
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment17 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ShowActivity) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$16
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19990invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19990invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IntentKey key = ((CreateTransferV2Event.ShowActivity) event.getData()).getKey();
                                    Navigator navigator = createTransferV2Fragment17.getNavigator();
                                    Context contextRequireContext = createTransferV2Fragment17.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, key, null, false, null, null, 60, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment18 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.StartActivityForResult) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$17
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19991invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19991invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CreateTransferV2Event.StartActivityForResult startActivityForResult = (CreateTransferV2Event.StartActivityForResult) event.getData();
                                    Navigator.DefaultImpls.startActivityForResult$default(createTransferV2Fragment18.getNavigator(), (Fragment) createTransferV2Fragment18, startActivityForResult.getKey(), startActivityForResult.getRequestCode(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment19 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ShowFragment) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$18
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19992invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19992invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    createTransferV2Fragment19.getCallbacks().onShowFragment(((CreateTransferV2Event.ShowFragment) event.getData()).getKey());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment20 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ShowDepositIncentiveCancellationAlert) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$19
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19993invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19993invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CreateTransferV2Event.ShowDepositIncentiveCancellationAlert showDepositIncentiveCancellationAlert = (CreateTransferV2Event.ShowDepositIncentiveCancellationAlert) event.getData();
                                    RhAchromaticDialogFragment.Companion companion = RhAchromaticDialogFragment.INSTANCE;
                                    Context contextRequireContext = createTransferV2Fragment20.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    RhDialogFragment.Builder id = companion.create(contextRequireContext).setTitle(showDepositIncentiveCancellationAlert.getData().getTitle()).setMessage(showDepositIncentiveCancellationAlert.getData().getMessage()).setPositiveButton(showDepositIncentiveCancellationAlert.getData().getPrimaryButtonText()).setNegativeButton(showDepositIncentiveCancellationAlert.getData().getSecondaryButtonText()).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(CreateTransferV2Fragment.INSTANCE.m2551x4d4d67fe());
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable(CreateTransferV2Fragment.DEPOSIT_INCENTIVE_CANCEL_DIALOG_DATA, showDepositIncentiveCancellationAlert.getData());
                                    RhDialogFragment.Builder passthroughArgs = id.setPassthroughArgs(bundle);
                                    FragmentManager childFragmentManager = createTransferV2Fragment20.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, CreateTransferV2Fragment.TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG, false, 4, null);
                                    EventLogger.DefaultImpls.logAppear$default(createTransferV2Fragment20.getEventLogger(), null, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, showDepositIncentiveCancellationAlert.getData().getLoggingIdentifier(), null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AlertContext(showDepositIncentiveCancellationAlert.getData().getTitle(), showDepositIncentiveCancellationAlert.getData().getMessage(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2097153, -1, -1, -1, 16383, null), 9, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment21 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ThreeDSVerification) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$20
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19995invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19995invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    createTransferV2Fragment21.getThreeDSCallbacks().onThreeDSRequested(((CreateTransferV2Event.ThreeDSVerification) event.getData()).getThreeDSRedirectUrl());
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment22 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.AddNewAccount) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$21
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19996invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19996invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator navigator = createTransferV2Fragment22.getNavigator();
                                    Context contextRequireContext = createTransferV2Fragment22.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION, true), null, false, null, null, 60, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment23 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.SendWireTransfer) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$22
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19997invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19997invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator navigator = createTransferV2Fragment23.getNavigator();
                                    Context contextRequireContext = createTransferV2Fragment23.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED, WiresContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION), null, false, null, null, 60, null);
                                }
                            });
                        }
                        final CreateTransferV2Fragment createTransferV2Fragment24 = createTransferV2Fragment;
                        if ((event.getData() instanceof CreateTransferV2Event.ShowClawbackGracePeriodContent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$onViewCreated$3$1$emit$$inlined$consumeIfType$23
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19998invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19998invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NavigationActivityResultContract3.launch$default(createTransferV2Fragment24.gracePeriodOptInLauncher, new ClawbackGracePeriod(((CreateTransferV2Event.ShowClawbackGracePeriodContent) event.getData()).getContent()), null, false, 6, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770933351);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770933351, i2, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment.ComposeContent (CreateTransferV2Fragment.kt:485)");
            }
            CreateTransferV2ViewState createTransferV2ViewStateComposeContent$lambda$13 = ComposeContent$lambda$13(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            CreateTransferV2Duxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CreateTransferV2Fragment$ComposeContent$1$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo2 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CreateTransferV2Fragment$ComposeContent$2$1(duxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo3 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new CreateTransferV2Fragment$ComposeContent$3$1(duxo3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo4 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new CreateTransferV2Fragment$ComposeContent$4$1(duxo4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo5 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo5);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new CreateTransferV2Fragment$ComposeContent$5$1(duxo5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo6 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(duxo6);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new CreateTransferV2Fragment$ComposeContent$6$1(duxo6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            KFunction kFunction6 = (KFunction) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo7 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(duxo7);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new CreateTransferV2Fragment$ComposeContent$7$1(duxo7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            KFunction kFunction7 = (KFunction) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Duxo duxo8 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(duxo8);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new CreateTransferV2Fragment$ComposeContent$8$1(duxo8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            KFunction kFunction8 = (KFunction) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Navigator navigator = getNavigator();
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            Function0 function0 = (Function0) kFunction;
            Function0 function02 = (Function0) kFunction2;
            Function0 function03 = (Function0) kFunction3;
            Function1 function1 = (Function1) kFunction4;
            Function1 function12 = (Function1) kFunction5;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferV2Fragment.ComposeContent$lambda$23$lambda$22(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function04 = (Function0) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            Function0 function05 = (Function0) kFunction6;
            Function1 function13 = (Function1) kFunction7;
            Function1 function14 = (Function1) kFunction8;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferV2Fragment.ComposeContent$lambda$25$lambda$24(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferV2Composable3.CreateTransferV2Composable(createTransferV2ViewStateComposeContent$lambda$13, function0, function02, function03, function1, function12, function04, function05, function13, function14, (Function0) objRememberedValue10, childFragmentManager, navigator, modifierNavigationBarsPadding, composerStartRestartGroup, 0, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTransferV2Fragment.ComposeContent$lambda$26(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23$lambda$22(CreateTransferV2Fragment createTransferV2Fragment) {
        Navigator.DefaultImpls.startActivityForResult$default(createTransferV2Fragment.getNavigator(), (Fragment) createTransferV2Fragment, (IntentKey) new LegacyIntentKey.DebitCardLinking(new DebitCardLinkingConfiguration.Standard(true, false, PaymentLinkingContext.EntryPoint.TRANSFERS_V2_REVIEW, null, 8, null)), DEBIT_CARD_LINKING_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$25$lambda$24(CreateTransferV2Fragment createTransferV2Fragment) {
        createTransferV2Fragment.getDuxo().rothInformationErrorTextClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getWonkaServiceManager().disableMicrogramInteractions();
        super.onDestroy();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().onBackPressed();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.INCOMING_WIRE, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell", null, 4, null), null, null, false, 56, null);
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.INCOMING, WiresContext.EntryPoint.LIMITS_HUB_ERROR), null, false, null, null, 60, null);
            return true;
        }
        if (id == C30383R.id.dialog_id_limits_hub_check_failure) {
            getDuxo().switchToEditMode();
            return true;
        }
        if (id == C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_deposit) {
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new Wires(WiresContext.WiresDirection.INCOMING, null, 2, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_withdrawal) {
            Navigator navigator3 = getNavigator();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator3, contextRequireContext3, new Wires(WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED, null, 2, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C30383R.id.dialog_id_ira_contribution_exceeded) {
            Navigator navigator4 = getNavigator();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            Navigators3.showContactSupportTriageFragment$default(navigator4, contextRequireContext4, "149", false, 4, null);
            return true;
        }
        if (id != C30383R.id.dialog_id_ira_distribution_enoki_removal && id != C30383R.id.dialog_id_ira_distribution_pre_review) {
            if (id == C30383R.id.dialog_id_gold_apy_min_deposit_min_amount) {
                getDuxo().switchToEditMode();
                return true;
            }
            if (id != TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID) {
                return super.onPositiveButtonClicked(id, passthroughArgs);
            }
            if (passthroughArgs == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData = (DepositIncentiveCancellationDialogData) passthroughArgs.getParcelable(DEPOSIT_INCENTIVE_CANCEL_DIALOG_DATA);
            if (depositIncentiveCancellationDialogData != null) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CANCEL_TRANSFER, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, depositIncentiveCancellationDialogData.getLoggingIdentifier(), null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AlertContext(depositIncentiveCancellationDialogData.getTitle(), depositIncentiveCancellationDialogData.getMessage(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2097153, -1, -1, -1, 16383, null), false, 40, null);
                Unit unit = Unit.INSTANCE;
            }
            requireActivity().finish();
            return true;
        }
        if (passthroughArgs == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Component.ComponentType componentType = Component.ComponentType.ALERT;
        String string2 = passthroughArgs.getString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER);
        if (string2 != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
            if (id == C30383R.id.dialog_id_ira_distribution_enoki_removal) {
                getDuxo().overrideDistributionEnokiRemovalAlert();
            } else {
                if (id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                    throw new IllegalStateException(("Unexpected distribution dialog id: " + id).toString());
                }
                getDuxo().overrideDistributionPreReviewAlert();
            }
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id != C30383R.id.dialog_id_ira_distribution_enoki_removal && id != C30383R.id.dialog_id_ira_distribution_pre_review) {
            if (id == C30383R.id.dialog_id_ira_contribution_no_enoki) {
                getDuxo().overrideNoEnokiAlert();
                return true;
            }
            if (id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell", null, 4, null), null, null, false, 56, null);
                return true;
            }
            if (id == C30383R.id.dialog_id_gold_apy_min_deposit_min_amount) {
                getDuxo().overrideGoldApyMinDepositAlert();
                return true;
            }
            if (id != TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID) {
                return super.onNegativeButtonClicked(id, passthroughArgs);
            }
            if (passthroughArgs == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData = (DepositIncentiveCancellationDialogData) passthroughArgs.getParcelable(DEPOSIT_INCENTIVE_CANCEL_DIALOG_DATA);
            if (depositIncentiveCancellationDialogData != null) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, depositIncentiveCancellationDialogData.getLoggingIdentifier(), null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AlertContext(depositIncentiveCancellationDialogData.getTitle(), depositIncentiveCancellationDialogData.getMessage(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2097153, -1, -1, -1, 16383, null), false, 40, null);
                Unit unit = Unit.INSTANCE;
            }
            return true;
        }
        if (passthroughArgs == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component.ComponentType componentType = Component.ComponentType.ALERT;
        String string2 = passthroughArgs.getString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER);
        if (string2 != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
            if (id == C30383R.id.dialog_id_ira_distribution_enoki_removal) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new RetirementEnokiInfo(null, 1, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            } else if (id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                throw new IllegalStateException(("Unexpected distribution dialog id: " + id).toString());
            }
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 56709 && resultCode == -1) {
            CreateTransferV2Duxo duxo = getDuxo();
            UUID uuid = data != null ? (UUID) Intents.getSerializable(data, "instrumentId") : null;
            if (uuid == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            CreateTransferV2Duxo.onToAccountSelected$default(duxo, string2, null, 2, null);
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (id == C30383R.id.dialog_id_limits_hub_check_failure || id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell || id == C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_deposit || id == C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_withdrawal || id == C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_inter_entity || id == C30383R.id.dialog_id_limits_hub_check_failure_amount_no_op) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_LIMIT_HUB, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "limit_alert_link", null, 4, null), null, null, false, 56, null);
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, LimitsHubDetails.INSTANCE, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            return true;
        }
        return super.onLinkTextClicked(id, passthroughArgs, url);
    }

    @Override // com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.Callbacks
    public void onEditIraDistributionTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        getDuxo().overrideIraDistributionTaxWithholding(federalWithholdingPercent, stateWithholdingPercent);
    }

    @Override // com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.Callbacks
    public void onEditIraDistributionWithdrawalAmount() {
        getDuxo().switchToEditMode();
    }

    @Override // com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks
    public void onFrequencySelected(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getDuxo().onFrequencyChange(frequency);
    }

    @Override // com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks
    public void onDismiss(boolean leavingEditMode) {
        getDuxo().validationAlertDismissed(leavingEditMode);
    }

    @Override // com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks
    public void onAlertSelected(boolean leavingEditMode, TransferActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getDuxo().alertActionSelected(action, leavingEditMode);
    }

    @Override // com.robinhood.android.incentives.wonka.TransferInteractionHandler
    public void onTransferContinueRequested() {
        CreateTransferV2Duxo.createTransfer$default(getDuxo(), false, false, null, 7, null);
    }

    @Override // com.robinhood.android.incentives.wonka.TransferInteractionHandler
    public void onTransferExitRequested() {
        requireActivity().finish();
    }

    /* compiled from: CreateTransferV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment;", "Lcom/robinhood/android/transfers/contracts/TransferV2;", "<init>", "()V", "DEBIT_CARD_LINKING_REQUEST_CODE", "", "TAG_IRA_DISTRIBUTION_TAX_WITHHOLDING", "", "TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG", "TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID", "getTAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID$feature_transfers_externalRelease", "()I", "DEPOSIT_INCENTIVE_CANCEL_DIALOG_DATA", "multiTransferFlowEventFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/udf/UiEvent;", "getMultiTransferFlowEventFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreateTransferV2Fragment, TransferV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransferV2 getArgs(CreateTransferV2Fragment createTransferV2Fragment) {
            return (TransferV2) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createTransferV2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateTransferV2Fragment newInstance(TransferV2 transferV2) {
            return (CreateTransferV2Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, transferV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateTransferV2Fragment createTransferV2Fragment, TransferV2 transferV2) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createTransferV2Fragment, transferV2);
        }

        /* renamed from: getTAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID$feature_transfers_externalRelease */
        public final int m2551x4d4d67fe() {
            return CreateTransferV2Fragment.TAG_DEPOSIT_INCENTIVE_CANCELLATION_DIALOG_ID;
        }

        public final StateFlow2<UiEvent<String>> getMultiTransferFlowEventFlow() {
            return CreateTransferV2Fragment.multiTransferFlowEventFlow;
        }
    }
}
