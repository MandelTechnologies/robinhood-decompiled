package com.robinhood.android.common.recurring.sourceoffunds;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.databinding.FragmentEquityRecurringSourceOfFundsBinding;
import com.robinhood.android.common.recurring.extension.AchRelationships2;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsViewState;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.sequences.SequencesKt;

/* compiled from: RecurringOrderSourceOfFundsFragment.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0003XYZB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\"\u0010/\u001a\u00020'2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020'H\u0016J\u0018\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201H\u0016J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020'H\u0002J\u001a\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010B\u001a\u00020!2\u0006\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010.H\u0016J\b\u0010C\u001a\u00020!H\u0016J\u0010\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020FH\u0002J*\u0010G\u001a\u00020'2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u0002J\u0010\u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020'H\u0002J\u0010\u0010S\u001a\u00020'2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010T\u001a\u00020'H\u0002J\b\u0010U\u001a\u00020'H\u0002J\b\u0010V\u001a\u00020'H\u0002J\b\u0010W\u001a\u00020'H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentEquityRecurringSourceOfFundsBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentEquityRecurringSourceOfFundsBinding;", "binding$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "isCrypto", "", "()Z", "isCryptoOrder", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onCheckedChanged", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "checkedId", "showWithdrawalLimitDialog", "showMarginLimitDialog", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "onBackPressed", "setViewState", "viewState", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState;", "bindRadioGroup", "achRelationshipId", "Ljava/util/UUID;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "fundingSources", "", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$FundingSource;", "setContinueButtonState", "state", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;", "showBackupRemovedSnackbar", "logSourceOfFundsSelected", "logAddAccountSelected", "logAddAccountSuccess", "logBackTapped", "logContinueTapped", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderSourceOfFundsFragment extends BaseFragment implements LegacyRdsRadioGroup.OnCheckedChangeListener {
    private static final int REQUEST_CODE_IAV_FLOW = 2002;
    private static final String RESULT_EXTRA_ACH_RELATIONSHIP = "achRelationship";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderSourceOfFundsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderSourceOfFundsFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentEquityRecurringSourceOfFundsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "", "onSourceOfFundsSelectionComplete", "", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "Ljava/util/UUID;", "accountNumber", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSourceOfFundsSelectionComplete(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber);
    }

    public RecurringOrderSourceOfFundsFragment() {
        super(C11595R.layout.fragment_equity_recurring_source_of_funds);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderSourceOfFundsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderSourceOfFundsFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RecurringOrderSourceOfFundsDuxo getDuxo() {
        return (RecurringOrderSourceOfFundsDuxo) this.duxo.getValue();
    }

    private final FragmentEquityRecurringSourceOfFundsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEquityRecurringSourceOfFundsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_PAYMENT_METHOD.toString();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().isCrypto();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderSourceOfFundsFragment.onAttach$lambda$1$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        putAchromaticOverlay(scarletContextWrapper2);
        setScarletContextWrapper(scarletContextWrapper2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().sourceOfFundsRadioGroup.setOnCheckedChangeListener(this);
        RdsRowView sourceOfFundsAddAccount = getBinding().sourceOfFundsAddAccount;
        Intrinsics.checkNotNullExpressionValue(sourceOfFundsAddAccount, "sourceOfFundsAddAccount");
        OnClickListeners.onClick(sourceOfFundsAddAccount, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderSourceOfFundsFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        RecurringOrderActionType actionType = ((Args) INSTANCE.getArgs((Fragment) this)).getActionType();
        getBinding().sourceOfFundsTitleTxt.setText(actionType.getTitleTxtResId());
        getBinding().sourceOfFundsSelectedBtn.setText(actionType.getDoneButtonResId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment) {
        recurringOrderSourceOfFundsFragment.logAddAccountSelected();
        Navigator.DefaultImpls.startActivityForResult$default(recurringOrderSourceOfFundsFragment.getNavigator(), (Fragment) recurringOrderSourceOfFundsFragment, (IntentKey) new CreateIavRelationshipIntentKey(IavSource.RECURRING, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), REQUEST_CODE_IAV_FLOW, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_IAV_FLOW && resultCode == -1) {
            AchRelationship achRelationship = data != null ? (AchRelationship) data.getParcelableExtra(RESULT_EXTRA_ACH_RELATIONSHIP) : null;
            if (achRelationship != null) {
                getDuxo().setSourceOfFunds(ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP, achRelationship.getId());
                logAddAccountSuccess();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117271(this));
        Observable<RecurringOrderSourceOfFundsViewState> states = getDuxo().getStates();
        final C117282 c117282 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.onResume.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RecurringOrderSourceOfFundsViewState) obj).getContinueButtonState();
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c117282) { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c117282, "function");
                this.function = c117282;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117293(this));
        Observable<RecurringOrderSourceOfFundsViewState> states2 = getDuxo().getStates();
        final C117304 c117304 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.onResume.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RecurringOrderSourceOfFundsViewState) obj).getFundingSources();
            }
        };
        Observable<RecurringOrderSourceOfFundsViewState> observableDistinctUntilChanged2 = states2.distinctUntilChanged(new Function(c117304) { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c117304, "function");
                this.function = c117304;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.onResume$lambda$4(this.f$0, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
    }

    /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$onResume$1 */
    /* synthetic */ class C117271 extends FunctionReferenceImpl implements Function1<RecurringOrderSourceOfFundsViewState, Unit> {
        C117271(Object obj) {
            super(1, obj, RecurringOrderSourceOfFundsFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderSourceOfFundsViewState recurringOrderSourceOfFundsViewState) {
            invoke2(recurringOrderSourceOfFundsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderSourceOfFundsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderSourceOfFundsFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$onResume$3 */
    /* synthetic */ class C117293 extends FunctionReferenceImpl implements Function1<RecurringOrderSourceOfFundsViewState.ContinueButtonState, Unit> {
        C117293(Object obj) {
            super(1, obj, RecurringOrderSourceOfFundsFragment.class, "setContinueButtonState", "setContinueButtonState(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$ContinueButtonState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderSourceOfFundsViewState.ContinueButtonState continueButtonState) {
            invoke2(continueButtonState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderSourceOfFundsViewState.ContinueButtonState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderSourceOfFundsFragment) this.receiver).setContinueButtonState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringOrderSourceOfFundsViewState recurringOrderSourceOfFundsViewState) {
        recurringOrderSourceOfFundsFragment.bindRadioGroup(recurringOrderSourceOfFundsViewState.getAchRelationshipId(), recurringOrderSourceOfFundsViewState.getSourceOfFunds(), recurringOrderSourceOfFundsViewState.getFundingSources());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
        Intrinsics.checkNotNullParameter(group, "group");
        if (checkedId == -1) {
            getDuxo().setSourceOfFunds(null, null);
            return;
        }
        Object tag = ((LegacyRdsRadioButton) group.findViewById(checkedId)).getTag(C11595R.id.tag_ach_relationship_id);
        UUID uuid = tag instanceof UUID ? (UUID) tag : null;
        if (uuid == null) {
            sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
        } else {
            sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP;
        }
        getDuxo().setSourceOfFunds(sourceOfFunds, uuid);
        logSourceOfFundsSelected(sourceOfFunds);
    }

    private final void showWithdrawalLimitDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C11595R.id.dialog_id_source_of_funds_savings_withdrawal_alert).setUseDesignSystemOverlay(true).setTitle(C11595R.string.equity_recurring_source_of_funds_savings_withdrawal_limit_title, new Object[0]).setMessage(C11595R.string.f4017xdb1e6930, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11595R.string.f4018xb2a27160, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "savings_withdrawal_limit_alert", false, 4, null);
    }

    private final void showMarginLimitDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C11595R.id.dialog_id_source_of_funds_buying_power_margin_alert).setUseDesignSystemOverlay(true).setTitle(C11595R.string.equity_recurring_source_of_funds_buying_power_margin_alert_title, new Object[0]).setMessage(C11595R.string.f4015x569efff, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11595R.string.f4016xc8d5cdab, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "buying_power_margin_alert", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_source_of_funds_savings_withdrawal_alert || id == C11595R.id.dialog_id_source_of_funds_buying_power_margin_alert) {
            getDuxo().updateSourceOfFundsSelection();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_source_of_funds_savings_withdrawal_alert || id == C11595R.id.dialog_id_source_of_funds_buying_power_margin_alert) {
            getDuxo().setSourceOfFunds(null, null);
            getBinding().sourceOfFundsRadioGroup.clearCheck();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        logBackTapped();
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecurringOrderSourceOfFundsViewState viewState) {
        RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult result = viewState.getResult();
        if (result != null && !Intrinsics.areEqual(result, RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Loading.INSTANCE)) {
            if (result instanceof RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success) {
                RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success success = (RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success) result;
                RecurringOrderSourceOfFundsViewState.InvestmentScheduleUpdate investmentScheduleUpdateConsume = success.getEvent().consume();
                if (investmentScheduleUpdateConsume != null) {
                    if (success.getShowSnackbar()) {
                        showBackupRemovedSnackbar();
                    }
                    getCallbacks().onSourceOfFundsSelectionComplete(investmentScheduleUpdateConsume.getAmount(), investmentScheduleUpdateConsume.getSourceOfFunds(), investmentScheduleUpdateConsume.getAchRelationshipId(), investmentScheduleUpdateConsume.getAccountNumber());
                }
            } else {
                if (!(result instanceof RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable thConsume = ((RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Failure) result).getEvent().consume();
                if (thConsume != null) {
                    AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
                }
            }
        }
        RhTextView sourceOfFundsDisclaimerTxt = getBinding().sourceOfFundsDisclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(sourceOfFundsDisclaimerTxt, "sourceOfFundsDisclaimerTxt");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        TextViewsKt.setVisibilityText(sourceOfFundsDisclaimerTxt, viewState.getDisclaimerText(resources));
    }

    private final void bindRadioGroup(final UUID achRelationshipId, final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, List<? extends RecurringOrderSourceOfFundsViewState.FundingSource> fundingSources) {
        final LegacyRdsRadioGroup sourceOfFundsRadioGroup = getBinding().sourceOfFundsRadioGroup;
        Intrinsics.checkNotNullExpressionValue(sourceOfFundsRadioGroup, "sourceOfFundsRadioGroup");
        sourceOfFundsRadioGroup.removeAllViews();
        sourceOfFundsRadioGroup.setOnCheckedChangeListener(null);
        Iterator itIterator2 = SequencesKt.map(CollectionsKt.asSequence(fundingSources), new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.bindRadioGroup$lambda$7(sourceOfFundsRadioGroup, this, achRelationshipId, sourceOfFunds, (RecurringOrderSourceOfFundsViewState.FundingSource) obj);
            }
        }).iterator2();
        while (itIterator2.hasNext()) {
            sourceOfFundsRadioGroup.addView((LegacyRdsRadioButton) itIterator2.next());
        }
        sourceOfFundsRadioGroup.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyRdsRadioButton bindRadioGroup$lambda$7(LegacyRdsRadioGroup legacyRdsRadioGroup, RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, RecurringOrderSourceOfFundsViewState.FundingSource fundingSource) throws Resources.NotFoundException {
        int i;
        String string2;
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        LegacyRdsRadioButton legacyRdsRadioButtonInflate = LegacyRdsRadioButton.INSTANCE.inflate((ViewGroup) legacyRdsRadioGroup);
        legacyRdsRadioButtonInflate.setId(View.generateViewId());
        if (fundingSource instanceof RecurringOrderSourceOfFundsViewState.FundingSource.Ach) {
            AchRelationship achRelationship = ((RecurringOrderSourceOfFundsViewState.FundingSource.Ach) fundingSource).getAchRelationship();
            legacyRdsRadioButtonInflate.setPrimaryText(achRelationship.getBankAccountNickname());
            Resources resources = recurringOrderSourceOfFundsFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            legacyRdsRadioButtonInflate.setSecondaryText(AchRelationships2.getAccountString(achRelationship, resources));
            legacyRdsRadioButtonInflate.setTag(C11595R.id.tag_ach_relationship_id, achRelationship.getId());
            legacyRdsRadioButtonInflate.setChecked(Intrinsics.areEqual(achRelationship.getId(), uuid));
            return legacyRdsRadioButtonInflate;
        }
        if (!(fundingSource instanceof RecurringOrderSourceOfFundsViewState.FundingSource.BuyingPower)) {
            throw new NoWhenBranchMatchedException();
        }
        Money amount = ((RecurringOrderSourceOfFundsViewState.FundingSource.BuyingPower) fundingSource).getAmount();
        boolean zIsCryptoOrder = recurringOrderSourceOfFundsFragment.isCryptoOrder();
        Resources resources2 = recurringOrderSourceOfFundsFragment.getResources();
        if (zIsCryptoOrder) {
            i = C11595R.string.equity_recurring_source_of_funds_crypto_buying_power;
        } else {
            i = C11595R.string.equity_recurring_source_of_funds_buying_power;
        }
        legacyRdsRadioButtonInflate.setPrimaryText(resources2.getString(i));
        if (amount.isNegative()) {
            string2 = recurringOrderSourceOfFundsFragment.getResources().getString(C11595R.string.equity_recurring_source_of_funds_negative_buying_power_desc);
        } else {
            string2 = recurringOrderSourceOfFundsFragment.getResources().getString(C11595R.string.equity_recurring_source_of_funds_buying_power_desc, Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        legacyRdsRadioButtonInflate.setSecondaryText(string2);
        legacyRdsRadioButtonInflate.setChecked(sourceOfFunds == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER);
        return legacyRdsRadioButtonInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContinueButtonState(final RecurringOrderSourceOfFundsViewState.ContinueButtonState state) {
        RdsButton rdsButton = getBinding().sourceOfFundsSelectedBtn;
        rdsButton.setEnabled(state.isEnabled());
        rdsButton.setLoading(state.isLoading());
        if (Intrinsics.areEqual(state, RecurringOrderSourceOfFundsViewState.ContinueButtonState.Disabled.INSTANCE) || Intrinsics.areEqual(state, RecurringOrderSourceOfFundsViewState.ContinueButtonState.Loading.INSTANCE)) {
            rdsButton.setOnClickListener(null);
            return;
        }
        if (state instanceof RecurringOrderSourceOfFundsViewState.ContinueButtonState.Complete) {
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderSourceOfFundsFragment.setContinueButtonState$lambda$13$lambda$9(this.f$0, state);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(state, RecurringOrderSourceOfFundsViewState.ContinueButtonState.UpdateInvestmentSchedule.INSTANCE)) {
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderSourceOfFundsFragment.setContinueButtonState$lambda$13$lambda$10(this.f$0);
                }
            });
        } else if (Intrinsics.areEqual(state, RecurringOrderSourceOfFundsViewState.ContinueButtonState.ShowWithdrawalLimitDialog.INSTANCE)) {
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderSourceOfFundsFragment.setContinueButtonState$lambda$13$lambda$11(this.f$0);
                }
            });
        } else {
            if (!Intrinsics.areEqual(state, RecurringOrderSourceOfFundsViewState.ContinueButtonState.ShowMarginLimitDialog.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderSourceOfFundsFragment.setContinueButtonState$lambda$13$lambda$12(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$13$lambda$9(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringOrderSourceOfFundsViewState.ContinueButtonState continueButtonState) {
        recurringOrderSourceOfFundsFragment.logContinueTapped();
        RecurringOrderSourceOfFundsViewState.ContinueButtonState.Complete complete = (RecurringOrderSourceOfFundsViewState.ContinueButtonState.Complete) continueButtonState;
        recurringOrderSourceOfFundsFragment.getCallbacks().onSourceOfFundsSelectionComplete(complete.getAmount(), complete.getSourceOfFunds(), complete.getAchRelationshipId(), complete.getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$13$lambda$10(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment) {
        recurringOrderSourceOfFundsFragment.logContinueTapped();
        recurringOrderSourceOfFundsFragment.getDuxo().updateSourceOfFundsSelection();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$13$lambda$11(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment) {
        recurringOrderSourceOfFundsFragment.logContinueTapped();
        recurringOrderSourceOfFundsFragment.showWithdrawalLimitDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$13$lambda$12(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment) {
        recurringOrderSourceOfFundsFragment.logContinueTapped();
        if (recurringOrderSourceOfFundsFragment.isCryptoOrder()) {
            recurringOrderSourceOfFundsFragment.getDuxo().updateSourceOfFundsSelection();
        } else {
            recurringOrderSourceOfFundsFragment.showMarginLimitDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showBackupRemovedSnackbar() {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C11595R.string.recurring_backup_payment_removed_snackbar, -1).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp).show();
    }

    private final void logSourceOfFundsSelected(final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds) {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.logSourceOfFundsSelected.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderSourceOfFundsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.logSourceOfFundsSelected$lambda$14(sourceOfFunds, this, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logSourceOfFundsSelected$lambda$14(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringContext recurringContext) {
        RecurringContext.RecurringFundsSource protobuf = Recurring2.toProtobuf(sourceOfFunds);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Screen screen = null;
        String str6 = null;
        Asset asset = null;
        com.robinhood.rosetta.eventlogging.List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        EventLogger.DefaultImpls.logTap$default(recurringOrderSourceOfFundsFragment.getEventLogger(), UserInteractionEventData.Action.SELECT_PAYMENT_METHOD, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_PAYMENT_METHOD_ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, null, str, null, str2, productTag, i4, str3, str4, str5, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, new RecurringContext(recurringContext.getFlow_type(), recurringContext.getEntry_point(), recurringContext.getReferrer(), recurringContext.getFrequency(), protobuf, 0.0d, Recurring2.toProtobuf(((Args) INSTANCE.getArgs((Fragment) recurringOrderSourceOfFundsFragment)).getInvestmentTarget().getTargetType()), null, 0.0d, null, null, 1952, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logAddAccountSelected() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.logAddAccountSelected.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderSourceOfFundsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.logAddAccountSelected$lambda$15(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAddAccountSelected$lambda$15(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logTap$default(recurringOrderSourceOfFundsFragment.getEventLogger(), UserInteractionEventData.Action.ADD_PAYMENT_METHOD, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.ADD_ACCOUNT, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logAddAccountSuccess() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.logAddAccountSuccess.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderSourceOfFundsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.logAddAccountSuccess$lambda$16(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAddAccountSuccess$lambda$16(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logTap$default(recurringOrderSourceOfFundsFragment.getEventLogger(), UserInteractionEventData.Action.ADD_PAYMENT_METHOD_SUCCESS, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.ADD_ACCOUNT, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logBackTapped() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.logBackTapped.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderSourceOfFundsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.logBackTapped$lambda$17(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBackTapped$lambda$17(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logTap$default(recurringOrderSourceOfFundsFragment.getEventLogger(), UserInteractionEventData.Action.BACK, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logContinueTapped() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.logContinueTapped.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderSourceOfFundsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsFragment.logContinueTapped$lambda$18(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logContinueTapped$lambda$18(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logTap$default(recurringOrderSourceOfFundsFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Args;", "Landroid/os/Parcelable;", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "fromInsights", "", "accountNumber", "<init>", "(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Ljava/lang/String;ZLjava/lang/String;)V", "getActionType", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "getLoggingSource", "()Ljava/lang/String;", "getFromInsights", "()Z", "getAccountNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final RecurringOrderActionType actionType;
        private final InvestmentScheduleAmount.Dollar amount;
        private final boolean fromInsights;
        private final InvestmentTarget investmentTarget;
        private final String loggingSource;

        /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((RecurringOrderActionType) parcel.readParcelable(Args.class.getClassLoader()), (InvestmentTarget) parcel.readParcelable(Args.class.getClassLoader()), (InvestmentScheduleAmount.Dollar) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RecurringOrderActionType recurringOrderActionType, InvestmentTarget investmentTarget, InvestmentScheduleAmount.Dollar dollar, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                recurringOrderActionType = args.actionType;
            }
            if ((i & 2) != 0) {
                investmentTarget = args.investmentTarget;
            }
            if ((i & 4) != 0) {
                dollar = args.amount;
            }
            if ((i & 8) != 0) {
                str = args.loggingSource;
            }
            if ((i & 16) != 0) {
                z = args.fromInsights;
            }
            if ((i & 32) != 0) {
                str2 = args.accountNumber;
            }
            boolean z2 = z;
            String str3 = str2;
            return args.copy(recurringOrderActionType, investmentTarget, dollar, str, z2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final RecurringOrderActionType getActionType() {
            return this.actionType;
        }

        /* renamed from: component2, reason: from getter */
        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        /* renamed from: component3, reason: from getter */
        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLoggingSource() {
            return this.loggingSource;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getFromInsights() {
            return this.fromInsights;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(RecurringOrderActionType actionType, InvestmentTarget investmentTarget, InvestmentScheduleAmount.Dollar amount, String loggingSource, boolean fromInsights, String accountNumber) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            return new Args(actionType, investmentTarget, amount, loggingSource, fromInsights, accountNumber);
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
            return Intrinsics.areEqual(this.actionType, args.actionType) && Intrinsics.areEqual(this.investmentTarget, args.investmentTarget) && Intrinsics.areEqual(this.amount, args.amount) && Intrinsics.areEqual(this.loggingSource, args.loggingSource) && this.fromInsights == args.fromInsights && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.actionType.hashCode() * 31) + this.investmentTarget.hashCode()) * 31;
            InvestmentScheduleAmount.Dollar dollar = this.amount;
            int iHashCode2 = (((((iHashCode + (dollar == null ? 0 : dollar.hashCode())) * 31) + this.loggingSource.hashCode()) * 31) + Boolean.hashCode(this.fromInsights)) * 31;
            String str = this.accountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(actionType=" + this.actionType + ", investmentTarget=" + this.investmentTarget + ", amount=" + this.amount + ", loggingSource=" + this.loggingSource + ", fromInsights=" + this.fromInsights + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.actionType, flags);
            dest.writeParcelable(this.investmentTarget, flags);
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.loggingSource);
            dest.writeInt(this.fromInsights ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public Args(RecurringOrderActionType actionType, InvestmentTarget investmentTarget, InvestmentScheduleAmount.Dollar dollar, String loggingSource, boolean z, String str) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            this.actionType = actionType;
            this.investmentTarget = investmentTarget;
            this.amount = dollar;
            this.loggingSource = loggingSource;
            this.fromInsights = z;
            this.accountNumber = str;
        }

        public final RecurringOrderActionType getActionType() {
            return this.actionType;
        }

        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        public /* synthetic */ Args(RecurringOrderActionType recurringOrderActionType, InvestmentTarget investmentTarget, InvestmentScheduleAmount.Dollar dollar, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(recurringOrderActionType, investmentTarget, (i & 4) != 0 ? null : dollar, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, str2);
        }

        public final String getLoggingSource() {
            return this.loggingSource;
        }

        public final boolean getFromInsights() {
            return this.fromInsights;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Args;", "<init>", "()V", "REQUEST_CODE_IAV_FLOW", "", "RESULT_EXTRA_ACH_RELATIONSHIP", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Deprecated
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderSourceOfFundsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderSourceOfFundsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderSourceOfFundsFragment newInstance(Args args) {
            return (RecurringOrderSourceOfFundsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderSourceOfFundsFragment recurringOrderSourceOfFundsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderSourceOfFundsFragment, args);
        }
    }
}
