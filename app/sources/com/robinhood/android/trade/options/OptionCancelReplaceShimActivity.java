package com.robinhood.android.trade.options;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionCancelReplaceIntentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionCancelReplaceShimActivity.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00013B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020 H\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\"H\u0016J\t\u0010-\u001a\u00020+H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "cancelReplaceStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "getCancelReplaceStore", "()Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "setCancelReplaceStore", "(Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;)V", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "setPositionStore", "(Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "getPositionsV2Store", "()Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "setPositionsV2Store", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "cancelOrder", "replaceOrderWithoutDialog", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "onDialogDismissed", "id", "", "onNegativeButtonClicked", "", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionCancelReplaceShimActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, RhDialogFragment.OnClickListener, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public OptionRemoveReplaceOrderConfirmationStore cancelReplaceStore;
    public OptionOrderStore optionOrderStore;
    public PositionStore positionStore;
    public PositionsV2Store positionsV2Store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionCancelReplaceShimActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionCancelReplaceIntentKey.LaunchMode.values().length];
            try {
                iArr[OptionCancelReplaceIntentKey.LaunchMode.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionCancelReplaceIntentKey.LaunchMode.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionCancelReplaceShimActivity() {
        super(C11048R.layout.transparent_activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    }

    public final OptionRemoveReplaceOrderConfirmationStore getCancelReplaceStore() {
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.cancelReplaceStore;
        if (optionRemoveReplaceOrderConfirmationStore != null) {
            return optionRemoveReplaceOrderConfirmationStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cancelReplaceStore");
        return null;
    }

    public final void setCancelReplaceStore(OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "<set-?>");
        this.cancelReplaceStore = optionRemoveReplaceOrderConfirmationStore;
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

    public final PositionStore getPositionStore() {
        PositionStore positionStore = this.positionStore;
        if (positionStore != null) {
            return positionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionStore");
        return null;
    }

    public final void setPositionStore(PositionStore positionStore) {
        Intrinsics.checkNotNullParameter(positionStore, "<set-?>");
        this.positionStore = positionStore;
    }

    public final PositionsV2Store getPositionsV2Store() {
        PositionsV2Store positionsV2Store = this.positionsV2Store;
        if (positionsV2Store != null) {
            return positionsV2Store;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionsV2Store");
        return null;
    }

    public final void setPositionsV2Store(PositionsV2Store positionsV2Store) {
        Intrinsics.checkNotNullParameter(positionsV2Store, "<set-?>");
        this.positionsV2Store = positionsV2Store;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(DesignSystemLegacyShim.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[((OptionCancelReplaceIntentKey) companion.getExtras((Activity) this)).getLaunchMode().ordinal()];
            if (i == 1) {
                cancelOrder();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Observable<UiOptionOrder> observableTake = getOptionOrderStore().getOptionOrder(((OptionCancelReplaceIntentKey) companion.getExtras((Activity) this)).getOptionOrderId()).take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionCancelReplaceShimActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionCancelReplaceShimActivity.onCreate$lambda$0(this.f$0, (UiOptionOrder) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNull(uiOptionOrder);
        optionCancelReplaceShimActivity.replaceOrderWithoutDialog(uiOptionOrder);
        return Unit.INSTANCE;
    }

    private final void cancelOrder() {
        OptionOrderStore optionOrderStore = getOptionOrderStore();
        Companion companion = INSTANCE;
        Observable<Optional<OptionOrder>> observableDoOnNext = optionOrderStore.cancelOptionOrderAndPoll(((OptionCancelReplaceIntentKey) companion.getExtras((Activity) this)).getOptionOrderId(), ((OptionCancelReplaceIntentKey) companion.getExtras((Activity) this)).getAccountNumber()).doOnNext(new Consumer() { // from class: com.robinhood.android.trade.options.OptionCancelReplaceShimActivity.cancelOrder.1

            /* compiled from: OptionCancelReplaceShimActivity.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionCancelReplaceShimActivity$cancelOrder$1$1", m3645f = "OptionCancelReplaceShimActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, 76}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.OptionCancelReplaceShimActivity$cancelOrder$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ OptionCancelReplaceShimActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionCancelReplaceShimActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
                
                    if (r7.refreshPositions(r1, r3, r4, r6) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PositionsV2Store positionsV2Store = this.this$0.getPositionsV2Store();
                        String accountNumber = ((OptionCancelReplaceIntentKey) OptionCancelReplaceShimActivity.INSTANCE.getExtras((Activity) this.this$0)).getAccountNumber();
                        PositionInstrumentType positionInstrumentType = PositionInstrumentType.OPTIONS_PENDING;
                        PositionsLocation positionsLocation = PositionsLocation.ASSET_HOME;
                        this.label = 1;
                        if (positionsV2Store.refreshPositions(accountNumber, positionInstrumentType, positionsLocation, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    PositionsV2Store positionsV2Store2 = this.this$0.getPositionsV2Store();
                    String accountNumber2 = ((OptionCancelReplaceIntentKey) OptionCancelReplaceShimActivity.INSTANCE.getExtras((Activity) this.this$0)).getAccountNumber();
                    PositionInstrumentType positionInstrumentType2 = PositionInstrumentType.OPTIONS_PENDING;
                    PositionsLocation positionsLocation2 = PositionsLocation.RETIREMENT_TAB;
                    this.label = 2;
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<OptionOrder> optional) {
                OptionCancelReplaceShimActivity.this.getPositionStore().refreshAccount(((OptionCancelReplaceIntentKey) OptionCancelReplaceShimActivity.INSTANCE.getExtras((Activity) OptionCancelReplaceShimActivity.this)).getAccountNumber(), true);
                BuildersKt__Builders_commonKt.launch$default(OptionCancelReplaceShimActivity.this.getLifecycleScope(), null, null, new AnonymousClass1(OptionCancelReplaceShimActivity.this, null), 3, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        Observable observableOnErrorResumeNext = ObservableDelay2.minTimeInFlight$default(observableDoOnNext, 1000L, null, 2, null).onErrorResumeNext(getActivityErrorHandler());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionCancelReplaceShimActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionCancelReplaceShimActivity.cancelOrder$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrder$lambda$1(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, Optional optional) {
        OptionOrder optionOrder = (OptionOrder) optional.component1();
        if ((optionOrder != null ? optionOrder.getState() : null) == OrderState.CANCELED) {
            Snackbars.show(optionCancelReplaceShimActivity, "Order canceled", 0);
            optionCancelReplaceShimActivity.finish();
        } else {
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(optionCancelReplaceShimActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setId(C29757R.id.dialog_id_cancel_sent);
            FragmentManager supportFragmentManager = optionCancelReplaceShimActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final void replaceOrderWithoutDialog(final UiOptionOrder uiOptionOrder) {
        LifecycleHost.DefaultImpls.bind$default(this, getCancelReplaceStore().maybeCancelAndGetOrderBundle(uiOptionOrder), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionCancelReplaceShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionCancelReplaceShimActivity.replaceOrderWithoutDialog$lambda$2(this.f$0, uiOptionOrder, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceOrderWithoutDialog$lambda$2(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, UiOptionOrder uiOptionOrder, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionOrderBundle optionOrderBundle = (OptionOrderBundle) optional.component1();
        if (optionOrderBundle != null) {
            optionCancelReplaceShimActivity.finish();
            Navigator navigator = optionCancelReplaceShimActivity.getNavigator();
            OptionOrderFormSource optionOrderFormSource = OptionOrderFormSource.ORDER_DETAIL;
            Navigator.DefaultImpls.startActivity$default(navigator, optionCancelReplaceShimActivity, new OptionOrderIntentKey.FromOptionOrderBundle(null, uiOptionOrder.getAccountNumber(), optionOrderBundle, uiOptionOrder, null, null, null, false, false, uiOptionOrder.getOptionOrder().getSource() == OptionOrder.FormSource.STRATEGY_ROLL, null, optionOrderFormSource, null, null, 13809, null), null, false, null, null, 60, null);
        } else {
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(optionCancelReplaceShimActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setId(C29757R.id.dialog_id_cancel_sent);
            FragmentManager supportFragmentManager = optionCancelReplaceShimActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C29757R.id.dialog_id_fill_error || id == C29757R.id.dialog_id_cancel_sent) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29757R.id.dialog_id_replace_order) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: OptionCancelReplaceShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity;", "Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionCancelReplaceShimActivity, OptionCancelReplaceIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionCancelReplaceIntentKey getExtras(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity) {
            return (OptionCancelReplaceIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionCancelReplaceShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionCancelReplaceIntentKey optionCancelReplaceIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionCancelReplaceIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionCancelReplaceIntentKey optionCancelReplaceIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionCancelReplaceIntentKey);
        }
    }
}
