package com.robinhood.android.trade.options;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.view.LoadingView;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.options.extensions.OptionOrderSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import rosetta.option.OptionOrderFormSource;

/* compiled from: ReplaceOptionOrderDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0002QRB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020BH\u0014J\b\u0010H\u001a\u00020BH\u0002J\b\u0010I\u001a\u00020BH\u0002J\b\u0010J\u001a\u00020BH\u0002J\t\u0010K\u001a\u000205H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\b?\u00102R\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "loadingView", "Lcom/robinhood/android/common/view/LoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/view/LoadingView;", "loadingView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "getOptionChainStore", "()Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "setOptionChainStore", "(Lcom/robinhood/librobinhood/data/store/OptionChainStore;)V", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "getOptionRemoveReplaceOrderConfirmationStore", "()Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "setOptionRemoveReplaceOrderConfirmationStore", "(Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/TraderEventLogger;)V", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "Ljava/util/UUID;", "getOptionOrderId", "()Ljava/util/UUID;", "optionOrderId$delegate", "Lkotlin/Lazy;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber$delegate", ReplaceOptionOrderDialogFragment.EXTRA_FINISH_ACTIVITY, "", "getFinishActivity", "()Z", "finishActivity$delegate", "source", "Lrosetta/option/OptionOrderFormSource;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "source$delegate", "chainSymbol", "getChainSymbol", "chainSymbol$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClick", "launchOrderActivity", "showHasFillsDialog", "showErrorDialog", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Builder", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReplaceOptionOrderDialogFragment extends RhDialogFragment implements RegionGated {
    public static final String EXTRA_ACCOUNT_NUMBER = "accountNumber";
    public static final String EXTRA_CHAIN_SYMBOL = "extraChainSymbol";
    private static final String EXTRA_FINISH_ACTIVITY = "finishActivity";
    public static final String EXTRA_ORDER_ID = "optionOrderId";
    public static final String EXTRA_SOURCE = "extraSource";
    public TraderEventLogger eventLogger;
    public Navigator navigator;
    public OptionChainStore optionChainStore;
    public OptionOrderStore optionOrderStore;
    public OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReplaceOptionOrderDialogFragment.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/view/LoadingView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView = bindView(C11048R.id.loading_view);

    /* renamed from: optionOrderId$delegate, reason: from kotlin metadata */
    private final Lazy optionOrderId = Fragments2.argument(this, EXTRA_ORDER_ID);

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Fragments2.argument(this, "accountNumber");

    /* renamed from: finishActivity$delegate, reason: from kotlin metadata */
    private final Lazy finishActivity = Fragments2.argument(this, EXTRA_FINISH_ACTIVITY);

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source = Fragments2.argument(this, EXTRA_SOURCE);

    /* renamed from: chainSymbol$delegate, reason: from kotlin metadata */
    private final Lazy chainSymbol = Fragments2.argument(this, EXTRA_CHAIN_SYMBOL);

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final LoadingView getLoadingView() {
        return (LoadingView) this.loadingView.getValue(this, $$delegatedProperties[0]);
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
    }

    public final OptionChainStore getOptionChainStore() {
        OptionChainStore optionChainStore = this.optionChainStore;
        if (optionChainStore != null) {
            return optionChainStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionChainStore");
        return null;
    }

    public final void setOptionChainStore(OptionChainStore optionChainStore) {
        Intrinsics.checkNotNullParameter(optionChainStore, "<set-?>");
        this.optionChainStore = optionChainStore;
    }

    public final OptionRemoveReplaceOrderConfirmationStore getOptionRemoveReplaceOrderConfirmationStore() {
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.optionRemoveReplaceOrderConfirmationStore;
        if (optionRemoveReplaceOrderConfirmationStore != null) {
            return optionRemoveReplaceOrderConfirmationStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionRemoveReplaceOrderConfirmationStore");
        return null;
    }

    public final void setOptionRemoveReplaceOrderConfirmationStore(OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "<set-?>");
        this.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final TraderEventLogger getEventLogger() {
        TraderEventLogger traderEventLogger = this.eventLogger;
        if (traderEventLogger != null) {
            return traderEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "<set-?>");
        this.eventLogger = traderEventLogger;
    }

    private final UUID getOptionOrderId() {
        return (UUID) this.optionOrderId.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final boolean getFinishActivity() {
        return ((Boolean) this.finishActivity.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderFormSource getSource() {
        return (OptionOrderFormSource) this.source.getValue();
    }

    private final String getChainSymbol() {
        return (String) this.chainSymbol.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getOptionRemoveReplaceOrderConfirmationStore().markReplaceOrderConfirmationDialogShown();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        getLoadingView().show();
        TraderEventLogger eventLogger = getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.CANCEL_ORDER;
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(getSource());
        String string2 = getOptionOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(eventLogger, orderFormStep, null, new OptionOrderMeta(null, null, null, metaSource, getChainSymbol(), string2, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Observable observableOnErrorResumeNext = ObservablesAndroid.observeOnMainThread(getOptionOrderStore().cancelOptionOrderAndPoll(getOptionOrderId(), getAccountNumber())).doOnError(new Consumer() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment.onPositiveButtonClick.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                ReplaceOptionOrderDialogFragment.this.dismiss();
            }
        }).onErrorResumeNext(Fragments2.getActivityErrorHandler(this));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReplaceOptionOrderDialogFragment.onPositiveButtonClick$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositiveButtonClick$lambda$0(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, Optional optional) {
        OrderState state;
        OptionOrder optionOrder = (OptionOrder) optional.component1();
        if ((optionOrder != null ? optionOrder.getState() : null) == OrderState.CANCELED) {
            replaceOptionOrderDialogFragment.launchOrderActivity();
        } else if (optionOrder == null || (state = optionOrder.getState()) == null || !state.hasExecutions()) {
            replaceOptionOrderDialogFragment.getLoadingView().hide();
            replaceOptionOrderDialogFragment.showErrorDialog();
        } else {
            replaceOptionOrderDialogFragment.showHasFillsDialog();
        }
        return Unit.INSTANCE;
    }

    private final void launchOrderActivity() {
        getOptionOrderStore().refresh(false, getOptionOrderId());
        Observable observableTake = getOptionOrderStore().getOptionOrder(getOptionOrderId()).switchMap(new Function() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment.launchOrderActivity.1

            /* compiled from: ReplaceOptionOrderDialogFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment$launchOrderActivity$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionChain.UnderlyingType.values().length];
                    try {
                        iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionOrderIntentKey.FromOptionOrderBundle> apply(final UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                int i = WhenMappings.$EnumSwitchMapping$0[order.getUnderlyingType().ordinal()];
                if (i == 1) {
                    Observable observableCombineLatest = Observables.INSTANCE.combineLatest(ObservablesKt.filterIsPresent(ReplaceOptionOrderDialogFragment.this.getOptionChainStore().getStreamActiveUiOptionUnderlierByOptionChain().asObservable(order.getOptionChain().getId())), ReplaceOptionOrderDialogFragment.this.getOptionChainStore().getStreamUiOptionChain().asObservable(order.getOptionChain().getId()));
                    final ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment = ReplaceOptionOrderDialogFragment.this;
                    return observableCombineLatest.map(new Function() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment.launchOrderActivity.1.1
                        @Override // io.reactivex.functions.Function
                        public final OptionOrderIntentKey.FromOptionOrderBundle apply(Tuples2<UiOptionUnderlier, UiOptionChain> tuples2) {
                            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                            UiOptionUnderlier uiOptionUnderlierComponent1 = tuples2.component1();
                            UiOptionChain uiOptionChainComponent2 = tuples2.component2();
                            UiOptionOrder uiOptionOrder = order;
                            Intrinsics.checkNotNull(uiOptionOrder);
                            return new OptionOrderIntentKey.FromOptionOrderBundle(null, order.getAccountNumber(), OptionBundles.toOrderBundle(uiOptionOrder, uiOptionUnderlierComponent1.getInstrument().getId(), uiOptionChainComponent2), order, null, null, null, false, false, order.getOptionOrder().getSource() == OptionOrder.FormSource.STRATEGY_ROLL, null, replaceOptionOrderDialogFragment.getSource(), null, null, 13809, null);
                        }
                    });
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Observable<UiOptionChain> observableAsObservable = ReplaceOptionOrderDialogFragment.this.getOptionChainStore().getStreamUiOptionChain().asObservable(order.getOptionChain().getId());
                final ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment2 = ReplaceOptionOrderDialogFragment.this;
                return observableAsObservable.map(new Function() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment.launchOrderActivity.1.2
                    @Override // io.reactivex.functions.Function
                    public final OptionOrderIntentKey.FromOptionOrderBundle apply(UiOptionChain uiOptionChain) {
                        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                        UiOptionOrder uiOptionOrder = order;
                        Intrinsics.checkNotNull(uiOptionOrder);
                        return new OptionOrderIntentKey.FromOptionOrderBundle(null, order.getAccountNumber(), OptionBundles.toOrderBundle(uiOptionOrder, null, uiOptionChain), order, null, null, null, false, false, order.getOptionOrder().getSource() == OptionOrder.FormSource.STRATEGY_ROLL, null, replaceOptionOrderDialogFragment2.getSource(), null, null, 13809, null);
                    }
                });
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReplaceOptionOrderDialogFragment.launchOrderActivity$lambda$1(this.f$0, (OptionOrderIntentKey.FromOptionOrderBundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOrderActivity$lambda$1(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        FragmentActivity fragmentActivityRequireActivity = replaceOptionOrderDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (replaceOptionOrderDialogFragment.getFinishActivity()) {
            fragmentActivityRequireActivity.finish();
        } else {
            replaceOptionOrderDialogFragment.dismiss();
        }
        Navigator navigator = replaceOptionOrderDialogFragment.getNavigator();
        Context contextRequireContext = replaceOptionOrderDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fromOptionOrderBundle);
        fragmentActivityRequireActivity.startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, fromOptionOrderBundle, null, false, 12, null));
        return Unit.INSTANCE;
    }

    private final void showHasFillsDialog() {
        dismiss();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(fragmentActivityRequireActivity).setMessage(C29757R.string.replace_option_order_fill_error_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setId(C29757R.id.dialog_id_fill_error);
        FragmentManager supportFragmentManager = fragmentActivityRequireActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, supportFragmentManager, "fillError", false, 4, null);
    }

    private final void showErrorDialog() {
        dismiss();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(fragmentActivityRequireActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setId(C29757R.id.dialog_id_cancel_sent);
        FragmentManager supportFragmentManager = fragmentActivityRequireActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, supportFragmentManager, "cancelSent", false, 4, null);
    }

    /* compiled from: ReplaceOptionOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new ReplaceOptionOrderDialogFragment();
        }
    }

    /* compiled from: ReplaceOptionOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ReplaceOptionOrder;", "<init>", "()V", "EXTRA_ORDER_ID", "", "EXTRA_ACCOUNT_NUMBER", "EXTRA_SOURCE", "EXTRA_CHAIN_SYMBOL", "EXTRA_FINISH_ACTIVITY", "show", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "accountNumber", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "Ljava/util/UUID;", ReplaceOptionOrderDialogFragment.EXTRA_FINISH_ACTIVITY, "", "source", "Lrosetta/option/OptionOrderFormSource;", "chainSymbol", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.ReplaceOptionOrder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhDialogFragment show(Context context, FragmentManager fragmentManager, String accountNumber, UUID optionOrderId, boolean finishActivity, OptionOrderFormSource source, String chainSymbol) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
            RhDialogFragment.Builder negativeButton = new Builder(context).setLayoutRes(C11048R.layout.replace_option_order_dialog_fragment).setId(C29757R.id.dialog_id_replace_order).setTitle(C29757R.string.replace_option_order_dialog_title, new Object[0]).setMessage(C29757R.string.replace_option_order_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C29757R.string.replace_option_order_go_back_action, new Object[0]);
            Bundle dialogArgs = negativeButton.getDialogArgs();
            dialogArgs.putSerializable(ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, optionOrderId);
            dialogArgs.putSerializable("accountNumber", accountNumber);
            dialogArgs.putBoolean(ReplaceOptionOrderDialogFragment.EXTRA_FINISH_ACTIVITY, finishActivity);
            dialogArgs.putSerializable(ReplaceOptionOrderDialogFragment.EXTRA_SOURCE, source);
            dialogArgs.putSerializable(ReplaceOptionOrderDialogFragment.EXTRA_CHAIN_SYMBOL, chainSymbol);
            return RhDialogFragment.Builder.show$default(negativeButton, fragmentManager, "replaceOptionOrderDialog", false, 4, null);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.ReplaceOptionOrder key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return ReplaceOptionOrderDialogFragment.INSTANCE.show(key.getContext(), key.getSupportFragmentManager(), key.getAccountNumber(), key.getOptionOrderId(), key.getFinishActivity(), key.getSource(), key.getChainSymbol());
        }
    }
}
