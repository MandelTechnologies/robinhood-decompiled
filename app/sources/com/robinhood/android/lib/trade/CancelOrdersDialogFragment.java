package com.robinhood.android.lib.trade;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CancelOrdersDialogFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "callbacks", "Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "orderRhIds", "", "Ljava/util/UUID;", "getOrderRhIds", "()Ljava/util/List;", "orderRhIds$delegate", "Lkotlin/Lazy;", "analyticsButtonGroupName", "", "getAnalyticsButtonGroupName", "()Ljava/lang/String;", "analyticsButtonGroupName$delegate", "analyticsPositiveButtonName", "getAnalyticsPositiveButtonName", "analyticsPositiveButtonName$delegate", "analyticsNegativeButtonName", "getAnalyticsNegativeButtonName", "analyticsNegativeButtonName$delegate", "onPositiveButtonClick", "", "onNegativeButtonClick", "Callbacks", "Builder", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CancelOrdersDialogFragment extends RhDialogFragment {
    public static final String EXTRA_ANALYTICS_BUTTON_GROUP_NAME = "rhAnalyticsButtonGroupName";
    public static final String EXTRA_ANALYTICS_NEGATIVE_BUTTON_NAME = "rhAnalyticsNegativeButtonName";
    public static final String EXTRA_ANALYTICS_POSITIVE_BUTTON_NAME = "rhAnalyticsPositiveButtonName";
    public static final String EXTRA_ORDER_RHIDS = "rhOrderRhIds";
    public OrderStore orderStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CancelOrdersDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.lib.trade.CancelOrdersDialogFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });

    /* renamed from: orderRhIds$delegate, reason: from kotlin metadata */
    private final Lazy orderRhIds = Fragments2.argument(this, EXTRA_ORDER_RHIDS);

    /* renamed from: analyticsButtonGroupName$delegate, reason: from kotlin metadata */
    private final Lazy analyticsButtonGroupName = Fragments2.argument(this, EXTRA_ANALYTICS_BUTTON_GROUP_NAME);

    /* renamed from: analyticsPositiveButtonName$delegate, reason: from kotlin metadata */
    private final Lazy analyticsPositiveButtonName = Fragments2.argument(this, EXTRA_ANALYTICS_POSITIVE_BUTTON_NAME);

    /* renamed from: analyticsNegativeButtonName$delegate, reason: from kotlin metadata */
    private final Lazy analyticsNegativeButtonName = Fragments2.argument(this, EXTRA_ANALYTICS_NEGATIVE_BUTTON_NAME);

    /* compiled from: CancelOrdersDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Callbacks;", "", "onCancelOrdersDialogDismissed", "", "onCancelOrdersSuccess", "onCancelOrdersError", "throwable", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCancelOrdersDialogDismissed();

        void onCancelOrdersError(Throwable throwable);

        void onCancelOrdersSuccess();
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final List<UUID> getOrderRhIds() {
        return (List) this.orderRhIds.getValue();
    }

    private final String getAnalyticsButtonGroupName() {
        return (String) this.analyticsButtonGroupName.getValue();
    }

    private final String getAnalyticsPositiveButtonName() {
        return (String) this.analyticsPositiveButtonName.getValue();
    }

    private final String getAnalyticsNegativeButtonName() {
        return (String) this.analyticsNegativeButtonName.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), getAnalyticsButtonGroupName(), getAnalyticsPositiveButtonName(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TextView positiveBtn = getPositiveBtn();
        if (positiveBtn != null) {
            positiveBtn.setEnabled(false);
        }
        TextView positiveBtn2 = getPositiveBtn();
        RdsButton rdsButton = positiveBtn2 instanceof RdsButton ? (RdsButton) positiveBtn2 : null;
        if (rdsButton != null) {
            rdsButton.setLoading(true);
        }
        TextView negativeBtn = getNegativeBtn();
        if (negativeBtn != null) {
            negativeBtn.setEnabled(false);
        }
        Completable completableFlatMapCompletable = Observable.fromIterable(getOrderRhIds()).flatMapCompletable(new Function() { // from class: com.robinhood.android.lib.trade.CancelOrdersDialogFragment.onPositiveButtonClick.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID orderRhId) {
                Intrinsics.checkNotNullParameter(orderRhId, "orderRhId");
                return CancelOrdersDialogFragment.this.getOrderStore().cancelOrder(orderRhId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableFlatMapCompletable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.lib.trade.CancelOrdersDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelOrdersDialogFragment.onPositiveButtonClick$lambda$0(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.lib.trade.CancelOrdersDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelOrdersDialogFragment.onPositiveButtonClick$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositiveButtonClick$lambda$0(CancelOrdersDialogFragment cancelOrdersDialogFragment) {
        cancelOrdersDialogFragment.dismiss();
        cancelOrdersDialogFragment.getCallbacks().onCancelOrdersSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositiveButtonClick$lambda$1(CancelOrdersDialogFragment cancelOrdersDialogFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cancelOrdersDialogFragment.dismiss();
        cancelOrdersDialogFragment.getCallbacks().onCancelOrdersError(throwable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), getAnalyticsButtonGroupName(), getAnalyticsNegativeButtonName(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        dismiss();
        getCallbacks().onCancelOrdersDialogDismissed();
    }

    /* compiled from: CancelOrdersDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "setOrderRhIds", "orderRhIds", "", "Ljava/io/Serializable;", "setAnalyticsButtonGroupName", "buttonGroupName", "", "setAnalyticsPositiveButtonName", "positiveButtonName", "setAnalyticsNegativeButtonName", "negativeButtonName", "createDialogFragment", "Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = 8;
        private final Fragment targetedFragment;

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Fragment targetedFragment) {
            Intrinsics.checkNotNullParameter(targetedFragment, "targetedFragment");
            Context contextRequireContext = targetedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            super(contextRequireContext);
            this.targetedFragment = targetedFragment;
        }

        public final Builder setOrderRhIds(List<? extends Serializable> orderRhIds) {
            Intrinsics.checkNotNullParameter(orderRhIds, "orderRhIds");
            Bundles.putSerializableList(getDialogArgs(), CancelOrdersDialogFragment.EXTRA_ORDER_RHIDS, orderRhIds);
            return this;
        }

        public final Builder setAnalyticsButtonGroupName(String buttonGroupName) {
            getDialogArgs().putString(CancelOrdersDialogFragment.EXTRA_ANALYTICS_BUTTON_GROUP_NAME, buttonGroupName);
            return this;
        }

        public final Builder setAnalyticsPositiveButtonName(String positiveButtonName) {
            getDialogArgs().putString(CancelOrdersDialogFragment.EXTRA_ANALYTICS_POSITIVE_BUTTON_NAME, positiveButtonName);
            return this;
        }

        public final Builder setAnalyticsNegativeButtonName(String negativeButtonName) {
            getDialogArgs().putString(CancelOrdersDialogFragment.EXTRA_ANALYTICS_NEGATIVE_BUTTON_NAME, negativeButtonName);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public CancelOrdersDialogFragment createDialogFragment() {
            CancelOrdersDialogFragment cancelOrdersDialogFragment = new CancelOrdersDialogFragment();
            cancelOrdersDialogFragment.setTargetFragment(this.targetedFragment, 0);
            setLayoutRes(C13997R.layout.dialog_fragment_design_system);
            return cancelOrdersDialogFragment;
        }
    }

    /* compiled from: CancelOrdersDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_ORDER_RHIDS", "", "EXTRA_ANALYTICS_BUTTON_GROUP_NAME", "EXTRA_ANALYTICS_POSITIVE_BUTTON_NAME", "EXTRA_ANALYTICS_NEGATIVE_BUTTON_NAME", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/trade/CancelOrdersDialogFragment$Builder;", "targetFragment", "Landroidx/fragment/app/Fragment;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder create(Fragment targetFragment) {
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Preconditions.checkImplementsInterface(targetFragment, Callbacks.class);
            return new Builder(targetFragment);
        }
    }
}
