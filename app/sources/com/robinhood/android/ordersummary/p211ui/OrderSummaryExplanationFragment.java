package com.robinhood.android.ordersummary.p211ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.nbbo.NbboAnalytics;
import com.robinhood.android.ordersummary.C25242R;
import com.robinhood.android.ordersummary.databinding.FragmentOrderSummaryExplanationBinding;
import com.robinhood.android.ordersummary.p211ui.OrderSummarySectionView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.ordersummary.models.api.ApiSection;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderSummaryExplanationFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationDuxo;", "getDuxo", "()Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBindings", "Lcom/robinhood/android/ordersummary/databinding/FragmentOrderSummaryExplanationBinding;", "getViewBindings", "()Lcom/robinhood/android/ordersummary/databinding/FragmentOrderSummaryExplanationBinding;", "viewBindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sectionsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView;", "Lcom/robinhood/ordersummary/models/api/ApiSection;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onLinkClicked", "setViewState", "state", "Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationViewState;", "Companion", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OrderSummaryExplanationFragment extends BaseFragment implements OrderSummarySectionView.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderSummaryExplanationFragment.class, "viewBindings", "getViewBindings()Lcom/robinhood/android/ordersummary/databinding/FragmentOrderSummaryExplanationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final GenericListAdapter<OrderSummarySectionView, ApiSection> sectionsAdapter;
    private final boolean useDesignSystemToolbar;

    /* renamed from: viewBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBindings;

    public OrderSummaryExplanationFragment() {
        super(C25242R.layout.fragment_order_summary_explanation);
        this.duxo = OldDuxos.oldDuxo(this, OrderSummaryExplanationDuxo.class);
        this.viewBindings = ViewBinding5.viewBinding(this, OrderSummaryExplanationFragment2.INSTANCE);
        this.sectionsAdapter = GenericListAdapter.INSTANCE.m2985of(C25242R.layout.include_order_summary_section, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderSummaryExplanationFragment.sectionsAdapter$lambda$0(this.f$0, (OrderSummarySectionView) obj, (ApiSection) obj2);
            }
        });
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

    private final OrderSummaryExplanationDuxo getDuxo() {
        return (OrderSummaryExplanationDuxo) this.duxo.getValue();
    }

    private final FragmentOrderSummaryExplanationBinding getViewBindings() {
        Object value = this.viewBindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderSummaryExplanationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sectionsAdapter$lambda$0(OrderSummaryExplanationFragment orderSummaryExplanationFragment, OrderSummarySectionView of, ApiSection section) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(section, "section");
        of.bind(section);
        of.setCallbacks(orderSummaryExplanationFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getViewBindings().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.sectionsAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<OrderSummaryExplanationViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C252471(this));
    }

    /* compiled from: OrderSummaryExplanationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationFragment$onResume$1 */
    /* synthetic */ class C252471 extends FunctionReferenceImpl implements Function1<OrderSummaryExplanationViewState, Unit> {
        C252471(Object obj) {
            super(1, obj, OrderSummaryExplanationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderSummaryExplanationViewState orderSummaryExplanationViewState) {
            invoke2(orderSummaryExplanationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderSummaryExplanationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderSummaryExplanationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.ordersummary.ui.OrderSummarySectionView.Callbacks
    public void onLinkClicked() {
        UUID loggingIdentifier = ((LegacyFragmentKey.OrderSummaryExplanation) INSTANCE.getArgs((Fragment) this)).getLoggingIdentifier();
        if (loggingIdentifier != null) {
            NbboAnalytics.INSTANCE.logNbboExplanationDialogLinkTap(getEventLogger(), loggingIdentifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(OrderSummaryExplanationViewState state) {
        this.sectionsAdapter.submitList(state.getSections());
    }

    /* compiled from: OrderSummaryExplanationFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderSummaryExplanation;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderSummaryExplanationFragment, LegacyFragmentKey.OrderSummaryExplanation>, FragmentResolver<LegacyFragmentKey.OrderSummaryExplanation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.OrderSummaryExplanation getArgs(OrderSummaryExplanationFragment orderSummaryExplanationFragment) {
            return (LegacyFragmentKey.OrderSummaryExplanation) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderSummaryExplanationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderSummaryExplanationFragment newInstance(LegacyFragmentKey.OrderSummaryExplanation orderSummaryExplanation) {
            return (OrderSummaryExplanationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, orderSummaryExplanation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderSummaryExplanationFragment orderSummaryExplanationFragment, LegacyFragmentKey.OrderSummaryExplanation orderSummaryExplanation) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderSummaryExplanationFragment, orderSummaryExplanation);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.OrderSummaryExplanation key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
