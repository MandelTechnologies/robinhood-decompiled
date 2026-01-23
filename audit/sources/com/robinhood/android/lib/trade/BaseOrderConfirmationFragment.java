package com.robinhood.android.lib.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BaseOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u00102\u001a\u0002032\u0006\u00104\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001dJ\u0015\u00105\u001a\u0002032\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\b\u00106\u001a\u000203H\u0016J&\u0010B\u001a\u0004\u0018\u00010\u00102\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\t2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u000203H\u0016J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u000208H\u0016J\u001d\u0010K\u001a\u0002032\u0006\u00104\u001a\u00028\u00002\u0006\u0010J\u001a\u000208H\u0002¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u000208H\u0016R!\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u0012\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0015\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u0012\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0019\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8gX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0012\u0010/\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00107\u001a\u000208X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R+\u0010<\u001a\u0002082\u0006\u0010;\u001a\u0002088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b=\u0010:\"\u0004\b>\u0010?¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "OrderT", "", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "getRoot$annotations", "getRoot", "()Landroid/view/ViewGroup;", "root$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loadingView", "Landroid/view/View;", "getLoadingView$annotations", "getLoadingView", "()Landroid/view/View;", "loadingView$delegate", "confirmationContainer", "getConfirmationContainer$annotations", "getConfirmationContainer", "confirmationContainer$delegate", "confirmedOrder", "getConfirmedOrder", "()Ljava/lang/Object;", "setConfirmedOrder", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "getPltManager", "()Lcom/robinhood/android/plt/contract/PltManager;", "setPltManager", "(Lcom/robinhood/android/plt/contract/PltManager;)V", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "orderManager", "getOrderManager", "()Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "onOrderReceived", "", Card.Icon.ORDER, "onOrderUpdated", "onConfirmationShown", "usePrimaryBackground", "", "getUsePrimaryBackground", "()Z", "<set-?>", "hasShownConfirmation", "getHasShownConfirmation", "setHasShownConfirmation", "(Z)V", "hasShownConfirmation$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "animateConfirmationAppearance", "showConfirmationAppearanceAnimation", "showConfirmation", "(Ljava/lang/Object;Z)V", "onBackPressed", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class BaseOrderConfirmationFragment<OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseOrderConfirmationFragment.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderConfirmationFragment.class, "loadingView", "getLoadingView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderConfirmationFragment.class, "confirmationContainer", "getConfirmationContainer()Landroid/view/View;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseOrderConfirmationFragment.class, "hasShownConfirmation", "getHasShownConfirmation()Z", 0))};
    public static final int $stable = 8;
    public CardManager cardManager;

    /* renamed from: confirmationContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 confirmationContainer;
    private OrderT confirmedOrder;

    /* renamed from: hasShownConfirmation$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasShownConfirmation;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;
    public PltManager pltManager;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;
    private final boolean usePrimaryBackground;

    protected static /* synthetic */ void getConfirmationContainer$annotations() {
    }

    protected static /* synthetic */ void getLoadingView$annotations() {
    }

    protected static /* synthetic */ void getRoot$annotations() {
    }

    public abstract int getConfirmationLayoutId();

    public abstract OrderManagerT getOrderManager();

    public void onConfirmationShown() {
    }

    public abstract void onOrderReceived(OrderT order);

    public void onOrderUpdated(OrderT order) {
        Intrinsics.checkNotNullParameter(order, "order");
    }

    public BaseOrderConfirmationFragment() {
        super(0);
        this.root = bindView(C20649R.id.content_root);
        this.loadingView = bindView(C20649R.id.loading_view);
        this.confirmationContainer = bindView(C20649R.id.order_confirmation_layout_container);
        this.usePrimaryBackground = true;
        this.hasShownConfirmation = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue(this, $$delegatedProperties[0]);
    }

    protected final View getLoadingView() {
        return (View) this.loadingView.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View getConfirmationContainer() {
        return (View) this.confirmationContainer.getValue(this, $$delegatedProperties[2]);
    }

    public final OrderT getConfirmedOrder() {
        return this.confirmedOrder;
    }

    public final void setConfirmedOrder(OrderT ordert) {
        this.confirmedOrder = ordert;
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    public final PltManager getPltManager() {
        PltManager pltManager = this.pltManager;
        if (pltManager != null) {
            return pltManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pltManager");
        return null;
    }

    public final void setPltManager(PltManager pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "<set-?>");
        this.pltManager = pltManager;
    }

    public boolean getUsePrimaryBackground() {
        return this.usePrimaryBackground;
    }

    private final boolean getHasShownConfirmation() {
        return ((Boolean) this.hasShownConfirmation.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    private final void setHasShownConfirmation(boolean z) {
        this.hasShownConfirmation.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C20649R.layout.fragment_base_order_confirmation, container, false);
        inflater.inflate(getConfirmationLayoutId(), (ViewGroup) viewInflate.findViewById(C20649R.id.order_confirmation_layout_container));
        if (!getUsePrimaryBackground()) {
            viewInflate.findViewById(C20649R.id.content_root).setBackground(null);
        }
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        RhToolbar rhToolbar;
        super.onResume();
        Observable observableDoOnEach = OrderSubmissionManager.orderStateChanges$default(getOrderManager(), null, 1, null).doOnEach(new Consumer(this) { // from class: com.robinhood.android.lib.trade.BaseOrderConfirmationFragment.onResume.1
            final /* synthetic */ BaseOrderConfirmationFragment<OrderT, OrderManagerT> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Notification<? extends OrderSubmissionManager.Result<? extends Object, ? extends Object>> notification) {
                OrderSubmissionManager.Result<? extends Object, ? extends Object> value = notification.getValue();
                if (value instanceof OrderSubmissionManager.Result.Sending) {
                    this.this$0.getPltManager().onElementLoadStarted("BaseOrderConfirmation-OrderSubmitting");
                } else {
                    if (!(value instanceof OrderSubmissionManager.Result.Failure) && !(value instanceof OrderSubmissionManager.Result.Submitted) && value != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.getPltManager().onElementLoadEnded("BaseOrderConfirmation-OrderSubmitting");
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnEach, "doOnEach(...)");
        Observable observableOfType = observableDoOnEach.ofType(OrderSubmissionManager.Result.Submitted.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableOfType), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.trade.BaseOrderConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseOrderConfirmationFragment.onResume$lambda$0(this.f$0, (OrderSubmissionManager.Result.Submitted) obj);
            }
        });
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity == null || (rhToolbar = baseActivity.getRhToolbar()) == null) {
            return;
        }
        rhToolbar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onResume$lambda$0(BaseOrderConfirmationFragment baseOrderConfirmationFragment, OrderSubmissionManager.Result.Submitted result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = result.getHasTriggeredConfirmation() && !baseOrderConfirmationFragment.getHasShownConfirmation();
        if (result.getTriggersConfirmation() || z) {
            boolean z2 = !baseOrderConfirmationFragment.getHasShownConfirmation();
            baseOrderConfirmationFragment.setHasShownConfirmation(true);
            baseOrderConfirmationFragment.showConfirmation(result.getData(), z2);
        } else {
            baseOrderConfirmationFragment.onOrderUpdated(result.getData());
        }
        return Unit.INSTANCE;
    }

    public void animateConfirmationAppearance(boolean showConfirmationAppearanceAnimation) {
        Context context = getContext();
        if (context == null || Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.FALSE)) {
            return;
        }
        View confirmationContainer = getConfirmationContainer();
        confirmationContainer.setVisibility(0);
        if (showConfirmationAppearanceAnimation) {
            confirmationContainer.setTranslationY(-getRoot().getHeight());
            confirmationContainer.animate().translationY(0.0f).withEndAction(new Runnable(this) { // from class: com.robinhood.android.lib.trade.BaseOrderConfirmationFragment$animateConfirmationAppearance$1$1
                final /* synthetic */ BaseOrderConfirmationFragment<OrderT, OrderManagerT> this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.onConfirmationShown();
                }
            });
        } else {
            onConfirmationShown();
        }
    }

    private final void showConfirmation(OrderT order, final boolean showConfirmationAppearanceAnimation) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        this.confirmedOrder = order;
        getCardManager().invalidateCardsBestEffort();
        final View loadingView = getLoadingView();
        loadingView.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.robinhood.android.lib.trade.BaseOrderConfirmationFragment.showConfirmation.1
            @Override // java.lang.Runnable
            public final void run() {
                loadingView.setVisibility(8);
            }
        }).start();
        final ViewGroup root = getRoot();
        OneShotPreDrawListener.add(root, new Runnable() { // from class: com.robinhood.android.lib.trade.BaseOrderConfirmationFragment$showConfirmation$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.animateConfirmationAppearance(showConfirmationAppearanceAnimation);
            }
        });
        onOrderReceived(order);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.confirmedOrder == null) {
            return true;
        }
        requireActivity().finish();
        return true;
    }
}
