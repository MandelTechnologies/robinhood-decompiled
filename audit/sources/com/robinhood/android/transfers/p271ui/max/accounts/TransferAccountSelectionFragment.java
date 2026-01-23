package com.robinhood.android.transfers.p271ui.max.accounts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.retirement.contracts.RetirementEnokiInfo;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.GoldApyBoostMinDepositContext;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireContract;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityIntentKey;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.contracts.wires.WireAccountCreation;
import com.robinhood.android.transfers.databinding.FragmentTransferAccountSelectionBinding;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogFragment;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountSelectionFragment;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsAdapter;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireActivity;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;

/* compiled from: TransferAccountSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002YZB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\u0012\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0017J\b\u0010A\u001a\u00020>H\u0016J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010M\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0002J\u0012\u0010N\u001a\u00020/2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010O\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010P\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\"\u0010S\u001a\u00020/2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R(\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( )*\n\u0012\u0004\u0012\u00020(\u0018\u00010'0'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010+0+0&X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020- )*\n\u0012\u0004\u0012\u00020-\u0018\u00010'0'0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentTransferAccountSelectionBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentTransferAccountSelectionBinding;", "binding$delegate", "adapter", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter;", "iraContributionQuestionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "kotlin.jvm.PlatformType", "iraDistributionQuestionnaireLauncher", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "wireRoutingDetailsInputLauncher", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputActivityIntentKey;", "createOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "bind", "state", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onBackPressed", "onAccountDeleted", "accountId", "", "onAccountDeletionError", "throwable", "", "onSelectionChanged", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "handleGoldApyBoostErrorEvent", "onAddAccountClicked", "onDeleteAccount", "onBannerClicked", "genericAction", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Callbacks", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferAccountSelectionFragment extends BaseFragment implements ConfirmDeleteDialogFragment.Callbacks, TransferAccountsAdapter.Callbacks {
    private static final int REQUEST_CODE_LINKING_FLOW = 2019;
    private static final int REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT = 2021;
    private static final int REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT_FOR_REVAMP = 2025;
    private TransferAccountsAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> iraContributionQuestionnaireLauncher;
    private final ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> iraDistributionQuestionnaireLauncher;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<WireRoutingDetailsInputActivityIntentKey>> wireRoutingDetailsInputLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferAccountSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(TransferAccountSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentTransferAccountSelectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferAccountSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public TransferAccountSelectionFragment() {
        super(C30065R.layout.fragment_transfer_account_selection);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TransferAccountSelectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, TransferAccountsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, TransferAccountSelectionFragment2.INSTANCE);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new IraContributionQuestionnaireContract(new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$iraContributionQuestionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraContributionQuestionnaireResult iraContributionQuestionnaireResult) {
                if (((TransferAccountSelectionKey) TransferAccountSelectionFragment.INSTANCE.getArgs((Fragment) this.this$0)).getDirection() != TransferAccountDirection.SINK) {
                    throw new IllegalStateException("IRA contribution questionnaire is only valid for sink account selection");
                }
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.UpdateTaxYear) {
                    throw new IllegalStateException(("Unexpected result for IRA questionnaire when selecting an IRA account: " + iraContributionQuestionnaireResult).toString());
                }
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution) {
                    IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) iraContributionQuestionnaireResult;
                    this.this$0.getCallbacks().onSinkAccountSelected(iraContribution.getAccount(), iraContribution);
                } else if (iraContributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.iraContributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(IraDistributionQuestionnaireActivity.ResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$iraDistributionQuestionnaireLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraDistributionQuestionnaireResult iraDistributionQuestionnaireResult) {
                if (((TransferAccountSelectionKey) TransferAccountSelectionFragment.INSTANCE.getArgs((Fragment) this.this$0)).getDirection() != TransferAccountDirection.SOURCE) {
                    throw new IllegalStateException("IRA distribution questionnaire is only valid for source account selection");
                }
                if (iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.IraDistribution) {
                    IraDistributionQuestionnaireResult.IraDistribution iraDistribution = (IraDistributionQuestionnaireResult.IraDistribution) iraDistributionQuestionnaireResult;
                    this.this$0.getCallbacks().onSourceAccountSelected(iraDistribution.getTransferAccount(), iraDistribution);
                } else if (!(iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.UpdateDistributionType)) {
                    if (iraDistributionQuestionnaireResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException(("Unexpected result for IRA questionnaire when selecting an IRA account: " + iraDistributionQuestionnaireResult).toString());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.iraDistributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<WireRoutingDetailsInputActivityIntentKey>> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new WireRoutingDetailsInputActivityResultContract(new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$wireRoutingDetailsInputLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(WireRoutingDetailsInputActivityResultContract3 wireRoutingDetailsInputActivityResultContract3) {
                TransferAccountSelectionFragment.Companion companion = TransferAccountSelectionFragment.INSTANCE;
                if (!Intrinsics.areEqual(((TransferAccountSelectionKey) companion.getArgs((Fragment) this.this$0)).isOutgoingWire(), Boolean.TRUE) || ((TransferAccountSelectionKey) companion.getArgs((Fragment) this.this$0)).getDirection() != TransferAccountDirection.SINK) {
                    throw new IllegalStateException("Wire routing details input is only valid for outgoing wire sink account selection");
                }
                if (wireRoutingDetailsInputActivityResultContract3 instanceof WireRoutingDetailsInputActivityResultContract3.Success) {
                    WireRoutingDetailsInputActivityResultContract3.Success success = (WireRoutingDetailsInputActivityResultContract3.Success) wireRoutingDetailsInputActivityResultContract3;
                    TransferAccountSelectionFragment.Callbacks.DefaultImpls.onSinkAccountSelected$default(this.this$0.getCallbacks(), success.getTransferAccount(), null, null, success, 6, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.wireRoutingDetailsInputLauncher = activityResultLauncherRegisterForActivityResult3;
    }

    /* compiled from: TransferAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J6\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "", "onSourceAccountSelected", "", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "wireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "onUkAddAccountSelected", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo);

        void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo, RecipientType outgoingWireRecipientType, WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails);

        void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo);

        void onUkAddAccountSelected(TransferAccount account);

        /* compiled from: TransferAccountSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onSinkAccountSelected(Callbacks callbacks, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success) {
            }

            public static void onUkAddAccountSelected(Callbacks callbacks, TransferAccount transferAccount) {
            }

            public static /* synthetic */ void onSourceAccountSelected$default(Callbacks callbacks, TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSourceAccountSelected");
                }
                if ((i & 2) != 0) {
                    iraDistribution = null;
                }
                callbacks.onSourceAccountSelected(transferAccount, iraDistribution);
            }

            public static /* synthetic */ void onSinkAccountSelected$default(Callbacks callbacks, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSinkAccountSelected");
                }
                if ((i & 2) != 0) {
                    iraContribution = null;
                }
                callbacks.onSinkAccountSelected(transferAccount, iraContribution);
            }

            public static /* synthetic */ void onSinkAccountSelected$default(Callbacks callbacks, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSinkAccountSelected");
                }
                if ((i & 2) != 0) {
                    iraContribution = null;
                }
                if ((i & 4) != 0) {
                    recipientType = null;
                }
                if ((i & 8) != 0) {
                    success = null;
                }
                callbacks.onSinkAccountSelected(transferAccount, iraContribution, recipientType, success);
            }
        }
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferAccountsDuxo getDuxo() {
        return (TransferAccountsDuxo) this.duxo.getValue();
    }

    private final FragmentTransferAccountSelectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferAccountSelectionBinding) value;
    }

    /* compiled from: TransferAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1", m3645f = "TransferAccountSelectionFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1 */
    static final class C307111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MenuInflater $inflater;
        final /* synthetic */ Menu $menu;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307111(Menu menu, MenuInflater menuInflater, Continuation<? super C307111> continuation) {
            super(2, continuation);
            this.$menu = menu;
            this.$inflater = menuInflater;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferAccountSelectionFragment.this.new C307111(this.$menu, this.$inflater, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<TransferAccountsViewState> stateFlow = TransferAccountSelectionFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<MenuState>() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MenuState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$invokeSuspend$$inlined$map$1$2", m3645f = "TransferAccountSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                MenuState menuState = ((TransferAccountsViewState) obj).getMenuState();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(menuState, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$menu, this.$inflater, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: TransferAccountSelectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "menuState", "Lcom/robinhood/android/transfers/ui/max/accounts/MenuState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$2", m3645f = "TransferAccountSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$createOptionsMenu$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MenuState, Continuation<? super Unit>, Object> {
            final /* synthetic */ MenuInflater $inflater;
            final /* synthetic */ Menu $menu;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Menu menu, MenuInflater menuInflater, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$menu = menu;
                this.$inflater = menuInflater;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$menu, this.$inflater, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MenuState menuState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(menuState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MenuState menuState = (MenuState) this.L$0;
                this.$menu.clear();
                if (menuState != null) {
                    Integer numBoxInt = boxing.boxInt(menuState.getMenuRes());
                    this.$inflater.inflate(numBoxInt.intValue(), this.$menu);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        BaseFragment.collectDuxoState$default(this, null, new C307111(menu, inflater, null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        TransferAccountSelectionKey transferAccountSelectionKey = (TransferAccountSelectionKey) INSTANCE.getArgs((Fragment) this);
        TransferAccountsAdapter transferAccountsAdapter = new TransferAccountsAdapter(getEventLogger(), this, true, transferAccountSelectionKey.getDirection(), transferAccountSelectionKey.getEventContext());
        this.adapter = transferAccountsAdapter;
        transferAccountsAdapter.setSelectedItemId(transferAccountSelectionKey.getSelectedAccountId());
        getBinding().accountsRecyclerView.setItemAnimator(null);
        RecyclerView accountsRecyclerView = getBinding().accountsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(accountsRecyclerView, "accountsRecyclerView");
        TransferAccountsAdapter transferAccountsAdapter2 = this.adapter;
        if (transferAccountsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            transferAccountsAdapter2 = null;
        }
        bindAdapter(accountsRecyclerView, transferAccountsAdapter2);
        RdsRowView rdsRowView = getBinding().wiresUpsellRow;
        Intrinsics.checkNotNull(rdsRowView);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountSelectionFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
        RhTextView enokiInfo = getBinding().enokiInfo;
        Intrinsics.checkNotNullExpressionValue(enokiInfo, "enokiInfo");
        OnClickListeners.onClick(enokiInfo, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountSelectionFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C307143(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3$lambda$2(TransferAccountSelectionFragment transferAccountSelectionFragment) {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(transferAccountSelectionFragment.getEventLogger(), null, new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, objArr2, null, objArr, 14, null), new Component(Component.ComponentType.WIRE_UPSELL, null, null, 6, null), null, null, false, 57, null);
        Navigator navigator = transferAccountSelectionFragment.getNavigator();
        Context contextRequireContext = transferAccountSelectionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED, WiresContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(TransferAccountSelectionFragment transferAccountSelectionFragment) {
        Navigator navigator = transferAccountSelectionFragment.getNavigator();
        Context contextRequireContext = transferAccountSelectionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new RetirementEnokiInfo(null, 1, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* compiled from: TransferAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$onViewCreated$3", m3645f = "TransferAccountSelectionFragment.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$onViewCreated$3 */
    static final class C307143 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307143(Continuation<? super C307143> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferAccountSelectionFragment.this.new C307143(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307143) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TransferAccountsViewState> stateFlow = TransferAccountSelectionFragment.this.getDuxo().getStateFlow();
                final TransferAccountSelectionFragment transferAccountSelectionFragment = TransferAccountSelectionFragment.this;
                FlowCollector<? super TransferAccountsViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.onViewCreated.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TransferAccountsViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(TransferAccountsViewState transferAccountsViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                        transferAccountSelectionFragment.bind(transferAccountsViewState);
                        if (transferAccountsViewState.isWiresUpsellVisible()) {
                            Object[] objArr = 0 == true ? 1 : 0;
                            Object[] objArr2 = 0 == true ? 1 : 0;
                            EventLogger.DefaultImpls.logAppear$default(transferAccountSelectionFragment.getEventLogger(), null, new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, objArr2, null, objArr, 14, null), new Component(Component.ComponentType.WIRE_UPSELL, null, null, 6, null), null, null, 25, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TransferAccountsViewState state) throws Resources.NotFoundException {
        CharSequence text;
        getBinding().titleTxt.setText(state.getTitleTextResId());
        TransferAccountsAdapter transferAccountsAdapter = this.adapter;
        if (transferAccountsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            transferAccountsAdapter = null;
        }
        transferAccountsAdapter.submitList(state.getRowItems());
        LinearLayout wiresUpsell = getBinding().wiresUpsell;
        Intrinsics.checkNotNullExpressionValue(wiresUpsell, "wiresUpsell");
        wiresUpsell.setVisibility(state.isWiresUpsellVisible() ? 0 : 8);
        RhTextView enokiInfo = getBinding().enokiInfo;
        Intrinsics.checkNotNullExpressionValue(enokiInfo, "enokiInfo");
        StringResource enokiText = state.getEnokiText();
        if (enokiText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = enokiText.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(enokiInfo, text);
        RichText subtitleRichText = state.getSubtitleRichText();
        if (subtitleRichText != null) {
            RhTextView subtitleTxt = getBinding().subtitleTxt;
            Intrinsics.checkNotNullExpressionValue(subtitleTxt, "subtitleTxt");
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            TextViewsKt.setVisibilityText(subtitleTxt, IconExtensions.toSpannableString$default(subtitleRichText, contextRequireContext, null, false, null, 14, null));
        }
        if (state.getNavigateBackWithTransferAccountResult() != null) {
            getCallbacks().onSinkAccountSelected(state.getNavigateBackWithTransferAccountResult(), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C30065R.id.action_edit) {
            getDuxo().updateEditingState(true);
            return true;
        }
        if (itemId == C30065R.id.action_done) {
            getDuxo().updateEditingState(false);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        TransferAccountsViewState value = getDuxo().getStateFlow().getValue();
        if (value.getResetAccountSelectionOnBackPressed()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((TransferAccountSelectionKey) INSTANCE.getArgs((Fragment) this)).getDirection().ordinal()];
            if (i == 1) {
                getCallbacks().onSourceAccountSelected(null, null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Callbacks.DefaultImpls.onSinkAccountSelected$default(getCallbacks(), null, null, value.getOutgoingWireRecipientType(), null, 8, null);
            }
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogFragment.Callbacks
    public void onAccountDeleted(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        getDuxo().accountDeleted(accountId);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogFragment.Callbacks
    public void onAccountDeletionError(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter.Callbacks
    public void onSelectionChanged(TransferAccount account, RecipientType outgoingWireRecipientType) {
        Intrinsics.checkNotNullParameter(account, "account");
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((TransferAccountSelectionKey) companion.getArgs((Fragment) this)).getDirection().ordinal()];
        if (i == 1) {
            GoldApyBoostMinDepositContext goldApyMinDepositContext = ((TransferAccountSelectionKey) companion.getArgs((Fragment) this)).getGoldApyMinDepositContext();
            if (goldApyMinDepositContext != null && goldApyMinDepositContext.isValidContext()) {
                z = true;
            }
            if (z && !account.isExternal()) {
                handleGoldApyBoostErrorEvent(account);
                return;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$1[account.getType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.iraDistributionQuestionnaireLauncher.launch(new IraDistributionQuestionnaireLaunchMode.FullQuestionnaire(account));
                return;
            } else {
                Callbacks.DefaultImpls.onSourceAccountSelected$default(getCallbacks(), account, null, 2, null);
                return;
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[account.getType().ordinal()];
        if (i3 == 1 || i3 == 2) {
            if (((TransferAccountSelectionKey) companion.getArgs((Fragment) this)).getFromRetirementContributionsV2()) {
                Callbacks.DefaultImpls.onSinkAccountSelected$default(getCallbacks(), account, null, null, null, 8, null);
                return;
            } else {
                NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.FullQuestionnaire(account), null, 2, null), null, false, 6, null);
                return;
            }
        }
        if (i3 == 3) {
            if (Intrinsics.areEqual(((TransferAccountSelectionKey) companion.getArgs((Fragment) this)).isOutgoingWire(), Boolean.TRUE)) {
                TransferAccountAdditionalData additionalData = account.getAdditionalData();
                if (additionalData != null ? Intrinsics.areEqual(additionalData.hasOutgoingWireDetails(), Boolean.FALSE) : false) {
                    ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<WireRoutingDetailsInputActivityIntentKey>> activityResultLauncher = this.wireRoutingDetailsInputLauncher;
                    com.robinhood.rosetta.eventlogging.Context eventContext = ((TransferAccountSelectionKey) companion.getArgs((Fragment) this)).getEventContext();
                    NavigationActivityResultContract3.launch$default(activityResultLauncher, new WireRoutingDetailsInputActivityIntentKey(account, eventContext != null ? eventContext.getWires_context() : null, false, 4, null), null, false, 6, null);
                    return;
                }
            }
            Callbacks.DefaultImpls.onSinkAccountSelected$default(getCallbacks(), account, null, 2, null);
            return;
        }
        getCallbacks().onSinkAccountSelected(account, null, outgoingWireRecipientType, null);
    }

    private final void handleGoldApyBoostErrorEvent(TransferAccount account) {
        GoldApyBoostMinDepositContext goldApyMinDepositContext = ((TransferAccountSelectionKey) INSTANCE.getArgs((Fragment) this)).getGoldApyMinDepositContext();
        Double minDepositRate = goldApyMinDepositContext != null ? goldApyMinDepositContext.getMinDepositRate() : null;
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C30383R.id.dialog_id_gold_apy_min_deposit_source_account).setTitle(getString(C30383R.string.apy_boost_min_deposit_source_account_title, minDepositRate)).setMessage(C30383R.string.apy_boost_min_deposit_source_account_message, account.getAccountName()).setPositiveButton(C30383R.string.apy_boost_min_deposit_source_account_primary_button, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "gold_apy_boost_source_account", false, 4, null);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter.Callbacks
    public void onAddAccountClicked(RecipientType outgoingWireRecipientType) {
        if (outgoingWireRecipientType != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivityForResult(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new WireAccountCreation(outgoingWireRecipientType), false, false, false, null, false, true, false, false, false, null, false, 7796, null), REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT_FOR_REVAMP);
            return;
        }
        if (getDuxo().getStateFlow().getValue().getInFirstPartyOutgoingWireMode()) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new WireRoutingDetailsInputActivityIntentKey(null, null, true), REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else if (Intrinsics.areEqual(((TransferAccountSelectionKey) INSTANCE.getArgs((Fragment) this)).getUseUkAddAccountExperience(), Boolean.TRUE)) {
            getCallbacks().onUkAddAccountSelected(null);
        } else {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION, true), REQUEST_CODE_LINKING_FLOW, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter.Callbacks
    public void onDeleteAccount(TransferAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        ConfirmDeleteDialogFragment.Companion companion = ConfirmDeleteDialogFragment.INSTANCE;
        RecipientType outgoingWireRecipientType = ((TransferAccountSelectionKey) INSTANCE.getArgs((Fragment) this)).getOutgoingWireRecipientType();
        if (outgoingWireRecipientType != null) {
            ConfirmDeleteDialogFragment confirmDeleteDialogFragment = (ConfirmDeleteDialogFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(companion, new ConfirmDeleteDialogFragment.Args(outgoingWireRecipientType, account.getAccountId()), 0, 2, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            confirmDeleteDialogFragment.show(childFragmentManager, "confirm_delete_dialog");
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter.Callbacks
    public void onBannerClicked(GenericAction genericAction) {
        if (genericAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
            return;
        }
        throw new IllegalStateException("Only deep link action is expected for banner clicks!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Parcelable parcelable;
        if (requestCode == REQUEST_CODE_LINKING_FLOW && resultCode == -1) {
            getDuxo().forceRefreshAccounts();
            return;
        }
        if (requestCode == REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT && resultCode == -1) {
            getDuxo().accountSelected(data != null ? data.getStringExtra("id") : null);
            return;
        }
        if (requestCode != REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT_FOR_REVAMP || resultCode != -1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (data != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) data.getParcelableExtra(WireAccountCreation.WireAccountResultKey, DidLinkAccountRequestDto.class);
            } else {
                ?? parcelableExtra = data.getParcelableExtra(WireAccountCreation.WireAccountResultKey);
                parcelable = (DidLinkAccountRequestDto) (parcelableExtra instanceof DidLinkAccountRequestDto ? parcelableExtra : null);
            }
            DidLinkAccountRequestDto didLinkAccountRequestDto = (DidLinkAccountRequestDto) parcelable;
            if (didLinkAccountRequestDto != null) {
                getDuxo().wireAccountCreated(didLinkAccountRequestDto);
            }
        }
    }

    /* compiled from: TransferAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "<init>", "()V", "REQUEST_CODE_LINKING_FLOW", "", "REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT", "REQUEST_CODE_WIRE_LINK_NEW_ACCOUNT_FOR_REVAMP", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferAccountSelectionFragment, TransferAccountSelectionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransferAccountSelectionKey getArgs(TransferAccountSelectionFragment transferAccountSelectionFragment) {
            return (TransferAccountSelectionKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferAccountSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferAccountSelectionFragment newInstance(TransferAccountSelectionKey transferAccountSelectionKey) {
            return (TransferAccountSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, transferAccountSelectionKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferAccountSelectionFragment transferAccountSelectionFragment, TransferAccountSelectionKey transferAccountSelectionKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferAccountSelectionFragment, transferAccountSelectionKey);
        }
    }
}
