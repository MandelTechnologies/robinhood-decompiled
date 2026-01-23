package com.robinhood.android.trade.equity.p261ui.preipo;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.FragmentOrderPreIpoBidPriceBinding;
import com.robinhood.android.util.PriceTextWatcher;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.directipo.models.p292db.IpoQuotes;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p408rx.transformer.CharSequenceToBigDecimalTransformer;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: OrderPreIpoBidPriceFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0003&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPreIpoBidPriceBinding;", "getViewBinding", "()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPreIpoBidPriceBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setViewState", "viewState", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceViewState;", "onBackPressed", "", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderPreIpoBidPriceFragment extends NoTitleToolbarFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderPreIpoBidPriceFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPreIpoBidPriceBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OrderPreIpoBidPriceFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderPreIpoBidPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Callbacks;", "", "onPreIpoBidPriceFragmentFinished", "", "limitPrice", "Ljava/math/BigDecimal;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPreIpoBidPriceFragmentFinished(BigDecimal limitPrice);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public OrderPreIpoBidPriceFragment() {
        super(C29365R.layout.fragment_order_pre_ipo_bid_price);
        this.duxo = OldDuxos.oldDuxo(this, OrderPreIpoBidPriceDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, OrderPreIpoBidPriceFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.PRE_IPO_BID;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final OrderPreIpoBidPriceDuxo getDuxo() {
        return (OrderPreIpoBidPriceDuxo) this.duxo.getValue();
    }

    private final FragmentOrderPreIpoBidPriceBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderPreIpoBidPriceBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout root = getViewBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentOrderPreIpoBidPriceBinding viewBinding = getViewBinding();
        viewBinding.priceEdt.addTextChangedListener(new PriceTextWatcher());
        viewBinding.orderPriceTitleTxt.setText(C29365R.string.order_create_advanced_ipo_bid_label);
        viewBinding.orderPricePromptTxt.setText(C29365R.string.order_create_advanced_ipo_bid_prompt);
        viewBinding.numpad.useDefaultKeyHandler();
        viewBinding.numpad.setTransitionName(getString(C20649R.string.order_create_advanced_numpad_transition_name));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RhEditText priceEdt = getViewBinding().priceEdt;
        Intrinsics.checkNotNullExpressionValue(priceEdt, "priceEdt");
        Observable<R> observableCompose = RxTextView.textChanges(priceEdt).compose(CharSequenceToBigDecimalTransformer.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableCompose, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C295861(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C295872(this));
    }

    /* compiled from: OrderPreIpoBidPriceFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment$onResume$1 */
    /* synthetic */ class C295861 extends FunctionReferenceImpl implements Function1<Optional<? extends BigDecimal>, Unit> {
        C295861(Object obj) {
            super(1, obj, OrderPreIpoBidPriceDuxo.class, "updatePrice", "updatePrice(Lcom/robinhood/utils/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<? extends BigDecimal> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<? extends BigDecimal> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderPreIpoBidPriceDuxo) this.receiver).updatePrice(p0);
        }
    }

    /* compiled from: OrderPreIpoBidPriceFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment$onResume$2 */
    /* synthetic */ class C295872 extends FunctionReferenceImpl implements Function1<OrderPreIpoBidPriceViewState, Unit> {
        C295872(Object obj) {
            super(1, obj, OrderPreIpoBidPriceFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderPreIpoBidPriceViewState orderPreIpoBidPriceViewState) {
            invoke2(orderPreIpoBidPriceViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderPreIpoBidPriceViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderPreIpoBidPriceFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setViewState(final OrderPreIpoBidPriceViewState viewState) {
        String string2;
        getViewBinding().numpad.setOnButtonClick(new Function0() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderPreIpoBidPriceFragment.setViewState$lambda$2(viewState, this);
            }
        });
        IpoQuote ipoQuote = viewState.getIpoQuote();
        if (ipoQuote != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            string2 = IpoQuotes.getFormattedAmount(ipoQuote, resources);
            if (string2 == null) {
                string2 = getString(C41827R.string.general_label_n_a);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        }
        getViewBinding().currentPriceTxt.setText(getString(C29365R.string.order_create_advanced_current_estimated_ipo_price, string2));
        Instrument instrument = viewState.getInstrument();
        if (instrument != null) {
            getViewBinding().orderPriceTitleTxt.setText(getString(C29365R.string.order_create_advanced_ipo_bid_label_format, instrument.getSymbol()));
        }
        getViewBinding().numpad.setButtonEnabled(viewState.getNumpadButtonEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$2(OrderPreIpoBidPriceViewState orderPreIpoBidPriceViewState, OrderPreIpoBidPriceFragment orderPreIpoBidPriceFragment) {
        BigDecimal price = orderPreIpoBidPriceViewState.getPrice();
        if (price != null) {
            orderPreIpoBidPriceFragment.getCallbacks().onPreIpoBidPriceFragmentFinished(price);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: OrderPreIpoBidPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: OrderPreIpoBidPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
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
            dest.writeSerializable(this.instrumentId);
        }

        public Args(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: OrderPreIpoBidPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderPreIpoBidPriceFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OrderPreIpoBidPriceFragment orderPreIpoBidPriceFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderPreIpoBidPriceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderPreIpoBidPriceFragment newInstance(Args args) {
            return (OrderPreIpoBidPriceFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderPreIpoBidPriceFragment orderPreIpoBidPriceFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderPreIpoBidPriceFragment, args);
        }
    }
}
