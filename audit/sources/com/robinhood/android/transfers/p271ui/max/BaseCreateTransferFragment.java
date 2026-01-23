package com.robinhood.android.transfers.p271ui.max;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.contracts.TransfersDeepLinkMetadata;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseCreateTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003FGHB\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/H&J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0004J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0004J\u0010\u00106\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0004J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0004J\u001e\u0010:\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>H\u0002J6\u0010?\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "layoutRes", "", "<init>", "(I)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "threeDSCallbacks", "Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "getThreeDSCallbacks", "()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "threeDSCallbacks$delegate", "duxo", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onFrequencySelected", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDialogDismissed", "id", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "bindState", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "onTransferCreateSuccess", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onTransferCreateFailure", "throwable", "", "onTransferAccountsError", "showFrequencyBottomSheet", "key", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;", "onSourceAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "wireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseCreateTransferFragment extends BaseRhBottomSheetDialogHostFragment implements TransferFrequencyBottomSheetCallbacks, ClientComponentAlertFragment.Callbacks {
    private static final String CREATE_TRANSFER_FAILURE_ALERT_TAG = "createTransferFailureAlert";
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: threeDSCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 threeDSCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseCreateTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BaseCreateTransferFragment.class, "threeDSCallbacks", "getThreeDSCallbacks()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", 0))};
    public static final int $stable = 8;

    /* compiled from: BaseCreateTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014H&R(\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Callbacks;", "", "sourceAccountObservable", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "getSourceAccountObservable", "()Lio/reactivex/Observable;", "sinkAccountObservable", "Lcom/robinhood/android/transfers/ui/max/SinkAccountData;", "getSinkAccountObservable", "onTransferCreateSuccess", "", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onShowAccountSelection", "key", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "onLaunchAdvisoryFullWithdrawal", "Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        Observable<SinkAccountData> getSinkAccountObservable();

        Observable<Tuples2<TransferAccount, IraDistributionQuestionnaireResult.IraDistribution>> getSourceAccountObservable();

        void onLaunchAdvisoryFullWithdrawal(AdvisoryFullWithdrawalKey key);

        void onShowAccountSelection(TransferAccountSelectionKey key);

        void onTransferCreateSuccess(PostTransferFlow postTransferFlow);
    }

    public abstract void bindState(CreateTransferViewState state);

    public BaseCreateTransferFragment(int i) {
        super(i);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BaseCreateTransferFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.threeDSCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ThreeDSHostCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment$special$$inlined$hostActivityCallbacks$2
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
        this.duxo = OldDuxos.oldDuxo(this, CreateTransferDuxo.class);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    protected final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    protected final ThreeDSHostCallbacks getThreeDSCallbacks() {
        return (ThreeDSHostCallbacks) this.threeDSCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    protected final CreateTransferDuxo getDuxo() {
        return (CreateTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks
    public void onFrequencySelected(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getDuxo().setFrequency(frequency);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getCallbacks().getSourceAccountObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseCreateTransferFragment.onCreate$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getCallbacks().getSinkAccountObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseCreateTransferFragment.onCreate$lambda$1(this.f$0, (SinkAccountData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BaseCreateTransferFragment baseCreateTransferFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        baseCreateTransferFragment.onSourceAccountSelected((TransferAccount) tuples2.component1(), (IraDistributionQuestionnaireResult.IraDistribution) tuples2.component2());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BaseCreateTransferFragment baseCreateTransferFragment, SinkAccountData sinkAccountData) {
        Intrinsics.checkNotNullParameter(sinkAccountData, "<destruct>");
        baseCreateTransferFragment.onSinkAccountSelected(sinkAccountData.getAccount(), sinkAccountData.getIraContributionInfo(), sinkAccountData.getOutgoingWireRecipientType(), sinkAccountData.getWireRoutingDetails());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<CreateTransferViewState> observableDoOnSubscribe = getDuxo().getStates().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.onStart.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.CREATE_TRANSFER_BUTTON_LOADING, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDoOnSubscribe), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C306292(this));
    }

    /* compiled from: BaseCreateTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment$onStart$2 */
    /* synthetic */ class C306292 extends FunctionReferenceImpl implements Function1<CreateTransferViewState, Unit> {
        C306292(Object obj) {
            super(1, obj, BaseCreateTransferFragment.class, "bindState", "bindState(Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateTransferViewState createTransferViewState) {
            invoke2(createTransferViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CreateTransferViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BaseCreateTransferFragment) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C30383R.id.dialog_id_ach_transfer_pdt_warning) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_DAY_TRADE_WARNING, AnalyticsStrings.BUTTON_PDT_WITHDRAWAL, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        } else if (id == C30065R.id.dialog_id_transfer_accounts_error) {
            super.onDialogDismissed(id);
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.CancelCryptoPendingOrdersAction.INSTANCE)) {
            return false;
        }
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("createTransferFailureAlert");
        ClientComponentAlertFragment clientComponentAlertFragment = fragmentFindFragmentByTag instanceof ClientComponentAlertFragment ? (ClientComponentAlertFragment) fragmentFindFragmentByTag : null;
        if (clientComponentAlertFragment != null) {
            clientComponentAlertFragment.dismiss();
        }
        getDuxo().cancelPendingCryptoOrders();
        return true;
    }

    protected final void onTransferCreateSuccess(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        getCallbacks().onTransferCreateSuccess(postTransferFlow);
    }

    protected final void onTransferCreateFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(((GenericAlertErrorResponse) errorResponseExtractErrorResponse).getAlert(), false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "createTransferFailureAlert");
            return;
        }
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
    }

    protected final void onTransferAccountsError(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, C30065R.id.dialog_id_transfer_accounts_error, null, 40, null);
    }

    protected final void showFrequencyBottomSheet(TransferFrequencyBottomSheetFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), key, null, 2, null).show(getChildFragmentManager(), "transferFrequencyBottomSheet");
    }

    static /* synthetic */ void onSourceAccountSelected$default(BaseCreateTransferFragment baseCreateTransferFragment, TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSourceAccountSelected");
        }
        if ((i & 2) != 0) {
            iraDistribution = null;
        }
        baseCreateTransferFragment.onSourceAccountSelected(transferAccount, iraDistribution);
    }

    private final void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
        getDuxo().setSourceAccount(account, iraDistributionInfo);
    }

    static /* synthetic */ void onSinkAccountSelected$default(BaseCreateTransferFragment baseCreateTransferFragment, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success, int i, Object obj) {
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
        baseCreateTransferFragment.onSinkAccountSelected(transferAccount, iraContribution, recipientType, success);
    }

    private final void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo, RecipientType outgoingWireRecipientType, WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails) {
        getDuxo().setSinkAccount(account, iraContributionInfo, outgoingWireRecipientType, wireRoutingDetails);
    }

    /* compiled from: BaseCreateTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Args;", "Landroid/os/Parcelable;", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final TransfersDeepLinkMetadata deepLinkMetadata;
        private final TransferConfiguration transferConfiguration;

        /* compiled from: BaseCreateTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransfersDeepLinkMetadata) parcel.readParcelable(Args.class.getClassLoader()), (TransferConfiguration) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.deepLinkMetadata, flags);
            dest.writeParcelable(this.transferConfiguration, flags);
        }

        public Args(TransfersDeepLinkMetadata transfersDeepLinkMetadata, TransferConfiguration transferConfiguration) {
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            this.deepLinkMetadata = transfersDeepLinkMetadata;
            this.transferConfiguration = transferConfiguration;
        }

        public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
            return this.deepLinkMetadata;
        }

        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }
    }
}
