package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.databinding.FragmentCancelOrderDialogBinding;
import com.robinhood.android.directipo.allocation.p104ui.CancelIpoOrderDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.trading.contracts.CancelIpoOrderDialogKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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

/* compiled from: CancelIpoOrderDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "binding", "Lcom/robinhood/android/directipo/allocation/databinding/FragmentCancelOrderDialogBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/databinding/FragmentCancelOrderDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", "callbacks$delegate", "subtitleText", "", "getSubtitleText", "()Ljava/lang/String;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "cancelOrder", "handleResultState", "result", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;", "Result", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class CancelIpoOrderDialogFragment extends BaseDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public SharedEventLogger eventLogger;
    public OrderStore orderStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CancelIpoOrderDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/databinding/FragmentCancelOrderDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CancelIpoOrderDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CancelIpoOrderDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CancelIpoOrderDialogKey.Source.values().length];
            try {
                iArr2[CancelIpoOrderDialogKey.Source.ORDER_ENTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CancelIpoOrderDialogKey.Source.ORDER_DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public CancelIpoOrderDialogFragment() {
        super(C14171R.layout.fragment_cancel_order_dialog);
        this.binding = ViewBinding5.viewBinding(this, CancelIpoOrderDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CancelIpoOrderDialogKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
    }

    private final FragmentCancelOrderDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCancelOrderDialogBinding) value;
    }

    private final CancelIpoOrderDialogKey.Callbacks getCallbacks() {
        return (CancelIpoOrderDialogKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final String getSubtitleText() throws Resources.NotFoundException {
        int i;
        Resources resources = getResources();
        Companion companion = INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getOrderSide().ordinal()];
        if (i2 == 1) {
            i = C14171R.plurals.cancel_order_dialog_subtitle_buy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C14171R.plurals.cancel_order_dialog_subtitle_sell;
        }
        String quantityString = resources.getQuantityString(i, ((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getSharesQuantity().intValue(), Formats.getIntegerFormat().format(((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getSharesQuantity()), ((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getSymbol());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton cancelOrderBtn = getBinding().cancelOrderBtn;
        Intrinsics.checkNotNullExpressionValue(cancelOrderBtn, "cancelOrderBtn");
        OnClickListeners.onClick(cancelOrderBtn, new Function0() { // from class: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelIpoOrderDialogFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsButton dismissBtn = getBinding().dismissBtn;
        Intrinsics.checkNotNullExpressionValue(dismissBtn, "dismissBtn");
        OnClickListeners.onClick(dismissBtn, new Function0() { // from class: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelIpoOrderDialogFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        getBinding().subtitle.setText(getSubtitleText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CancelIpoOrderDialogFragment cancelIpoOrderDialogFragment) {
        cancelIpoOrderDialogFragment.cancelOrder();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CancelIpoOrderDialogFragment cancelIpoOrderDialogFragment) {
        cancelIpoOrderDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    private final void cancelOrder() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$1[((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getSource().ordinal()];
        if (i == 1) {
            getEventLogger().logCancelOrderEvent(((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getOrderId(), ((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getBrokerageAccountType());
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Observable<R> map = getOrderStore().cancelOrderAndPoll(((CancelIpoOrderDialogKey) companion.getArgs((Fragment) this)).getOrderId()).map(new Function() { // from class: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$cancelOrder$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Order order = (Order) ((Optional) it).component1();
                return Optional3.asOptional(new CancelIpoOrderDialogFragment.Result.Success((order != null ? order.getState() : null) == EquityOrderState.CANCELED));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CancelIpoOrderDialogFragment$cancelOrder$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableOnErrorReturn = ObservablesKt.filterIsPresent(map).startWith((Observable) Result.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment.cancelOrder.2
            @Override // io.reactivex.functions.Function
            public final Result.Error apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Result.Error(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableOnErrorReturn), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141983(this));
    }

    /* compiled from: CancelIpoOrderDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$cancelOrder$3 */
    /* synthetic */ class C141983 extends FunctionReferenceImpl implements Function1<Result, Unit> {
        C141983(Object obj) {
            super(1, obj, CancelIpoOrderDialogFragment.class, "handleResultState", "handleResultState(Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result result) throws Throwable {
            invoke2(result);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Result p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CancelIpoOrderDialogFragment) this.receiver).handleResultState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResultState(Result result) throws Throwable {
        if (Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            getBinding().cancelOrderBtn.setLoading(true);
            return;
        }
        if (result instanceof Result.Success) {
            if (((Result.Success) result).getIsCancelled()) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_CANCELLED, true);
                getCallbacks().onOrderCancelled();
                dismiss();
                return;
            }
            return;
        }
        if (!(result instanceof Result.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        getBinding().cancelOrderBtn.setLoading(false);
        Fragments2.getActivityErrorHandler(this).invoke2(((Result.Error) result).getThrowable());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CancelIpoOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Error;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Loading;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Success;", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class Result {
        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CancelIpoOrderDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Loading;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 223565970;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: CancelIpoOrderDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Success;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;", "isCancelled", "", "<init>", "(Z)V", "()Z", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends Result {
            public static final int $stable = 0;
            private final boolean isCancelled;

            public Success(boolean z) {
                super(null);
                this.isCancelled = z;
            }

            /* renamed from: isCancelled, reason: from getter */
            public final boolean getIsCancelled() {
                return this.isCancelled;
            }
        }

        /* compiled from: CancelIpoOrderDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result$Error;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: CancelIpoOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/ui/CancelIpoOrderDialogFragment;", "Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey;", "<init>", "()V", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<CancelIpoOrderDialogFragment, CancelIpoOrderDialogKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public CancelIpoOrderDialogFragment createDialogFragment(CancelIpoOrderDialogKey cancelIpoOrderDialogKey) {
            return (CancelIpoOrderDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, cancelIpoOrderDialogKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CancelIpoOrderDialogKey getArgs(CancelIpoOrderDialogFragment cancelIpoOrderDialogFragment) {
            return (CancelIpoOrderDialogKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cancelIpoOrderDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CancelIpoOrderDialogFragment newInstance(CancelIpoOrderDialogKey cancelIpoOrderDialogKey) {
            return (CancelIpoOrderDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cancelIpoOrderDialogKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CancelIpoOrderDialogFragment cancelIpoOrderDialogFragment, CancelIpoOrderDialogKey cancelIpoOrderDialogKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cancelIpoOrderDialogFragment, cancelIpoOrderDialogKey);
        }
    }
}
