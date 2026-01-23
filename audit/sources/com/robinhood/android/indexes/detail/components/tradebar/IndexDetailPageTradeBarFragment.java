package com.robinhood.android.indexes.detail.components.tradebar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.detail.C18813R;
import com.robinhood.android.indexes.detail.IndexDetailPageLoggings;
import com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarStates3;
import com.robinhood.android.indexes.detail.databinding.IncludeIndexDetailPageTradeBarBinding;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IndexDetailPageTradeBarFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003?@AB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\t\u00108\u001a\u000209H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$Listener;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "getDuxo", "()Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/indexes/detail/databinding/IncludeIndexDetailPageTradeBarBinding;", "getBinding", "()Lcom/robinhood/android/indexes/detail/databinding/IncludeIndexDetailPageTradeBarBinding;", "binding$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "bind", "state", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarViewState;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onRefreshAccountsClicked", "onActionClicked", "action", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "onTradeClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexDetailPageTradeBarFragment extends BaseFragment implements RegionGated, AbstractTradeBarOverlayView.Listener, AccountSwitcherCallbacks2 {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IndexDetailPageTradeBarFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(IndexDetailPageTradeBarFragment.class, "binding", "getBinding()Lcom/robinhood/android/indexes/detail/databinding/IncludeIndexDetailPageTradeBarBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Callbacks;", "", "onTradeBarHeightUpdated", "", "newHeight", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTradeBarHeightUpdated(int newHeight);
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
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

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onTradeClicked() {
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    public IndexDetailPageTradeBarFragment() {
        super(C18813R.layout.include_index_detail_page_trade_bar);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, IndexDetailPageTradeBarDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, IndexDetailPageTradeBarFragment2.INSTANCE);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final IndexDetailPageTradeBarDuxo getDuxo() {
        return (IndexDetailPageTradeBarDuxo) this.duxo.getValue();
    }

    private final IncludeIndexDetailPageTradeBarBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeIndexDetailPageTradeBarBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getDuxo().setAccountNumber(((Args) INSTANCE.getArgs((Fragment) this)).getInitialAccountNumber());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().buySellOverlay.hideTradeTxtShadow();
        getBinding().buySellOverlay.setListener(this);
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().buySellOverlay.footerHeight(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexDetailPageTradeBarFragment.onViewCreated$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C188792(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C188803(null), 1, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexDetailPageTradeBarFragment.onViewCreated$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment, int i) {
        indexDetailPageTradeBarFragment.getCallbacks().onTradeBarHeightUpdated(i);
        View tradeBarTopDivider = indexDetailPageTradeBarFragment.getBinding().tradeBarTopDivider;
        Intrinsics.checkNotNullExpressionValue(tradeBarTopDivider, "tradeBarTopDivider");
        tradeBarTopDivider.setVisibility(0);
        View tradeBarTopDivider2 = indexDetailPageTradeBarFragment.getBinding().tradeBarTopDivider;
        Intrinsics.checkNotNullExpressionValue(tradeBarTopDivider2, "tradeBarTopDivider");
        ViewsKt.setMargins(tradeBarTopDivider2, 0, 0, 0, i);
        return Unit.INSTANCE;
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$2", m3645f = "IndexDetailPageTradeBarFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$2 */
    static final class C188792 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188792(Continuation<? super C188792> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarFragment.this.new C188792(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IndexDetailPageTradeBarFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ IndexDetailPageTradeBarFragment $tmp0;

            AnonymousClass1(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment) {
                this.$tmp0 = indexDetailPageTradeBarFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, IndexDetailPageTradeBarFragment.class, "bind", "bind(Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(IndexDetailPageTradeBarViewState indexDetailPageTradeBarViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C188792.invokeSuspend$bind(this.$tmp0, indexDetailPageTradeBarViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((IndexDetailPageTradeBarViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<IndexDetailPageTradeBarViewState> stateFlow = IndexDetailPageTradeBarFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageTradeBarFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment, IndexDetailPageTradeBarViewState indexDetailPageTradeBarViewState, Continuation continuation) {
            indexDetailPageTradeBarFragment.bind(indexDetailPageTradeBarViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$3", m3645f = "IndexDetailPageTradeBarFragment.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$3 */
    static final class C188803 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188803(Continuation<? super C188803> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarFragment.this.new C188803(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188803) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(IndexDetailPageTradeBarFragment.this.getDuxo().getEventFlow());
                final IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment = IndexDetailPageTradeBarFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment.onViewCreated.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<IndexDetailPageTradeBarStates3>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<IndexDetailPageTradeBarStates3> event, Continuation<? super Unit> continuation) {
                        EventConsumer<IndexDetailPageTradeBarStates3> eventConsumerInvoke;
                        final IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment2 = indexDetailPageTradeBarFragment;
                        if ((event.getData() instanceof IndexDetailPageTradeBarStates3.AccountSwitcherRefreshed) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onViewCreated$3$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m15307invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15307invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IndexDetailPageTradeBarStates3.AccountSwitcherRefreshed accountSwitcherRefreshed = (IndexDetailPageTradeBarStates3.AccountSwitcherRefreshed) event.getData();
                                    Either<AccountSwitcherData, Throwable> result = accountSwitcherRefreshed.getResult();
                                    if (result instanceof Either.Left) {
                                        indexDetailPageTradeBarFragment2.onAccountSwitcherCtaClicked((AccountSwitcherData) ((Either.Left) accountSwitcherRefreshed.getResult()).getValue());
                                    } else {
                                        if (!(result instanceof Either.Right)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        AbsErrorHandler.handleError$default(indexDetailPageTradeBarFragment2.getActivityErrorHandler(), (Throwable) ((Either.Right) accountSwitcherRefreshed.getResult()).getValue(), false, 2, null);
                                    }
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment, DayNightOverlay dayNightOverlay) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        TradeBarOverlayView buySellOverlay = indexDetailPageTradeBarFragment.getBinding().buySellOverlay;
        Intrinsics.checkNotNullExpressionValue(buySellOverlay, "buySellOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(buySellOverlay), dayNightOverlay, null, 2, null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i2 == 1) {
            i = C20690R.color.mobius_background_3_day;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20690R.color.mobius_background_3_night;
        }
        indexDetailPageTradeBarFragment.getBinding().tradeBarTopDivider.setBackgroundColor(indexDetailPageTradeBarFragment.getResources().getColor(i, indexDetailPageTradeBarFragment.requireBaseActivity().getTheme()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(IndexDetailPageTradeBarViewState state) {
        TradeBarOverlayView buySellOverlay = getBinding().buySellOverlay;
        Intrinsics.checkNotNullExpressionValue(buySellOverlay, "buySellOverlay");
        buySellOverlay.setActions(CollectionsKt.listOfNotNull(state.getTradeOptionsAction()));
        buySellOverlay.setInfoState(TradeBarOverlayView.InfoState.ACCOUNT_SWITCHER);
        IndexAccountSwitcherState accountSwitcherState = state.getAccountSwitcherState();
        if (accountSwitcherState != null) {
            buySellOverlay.getAccountSwitcherBtn().bind(accountSwitcherState, this, true);
        }
        buySellOverlay.refreshPanelVisibility(!buySellOverlay.getActions().isEmpty());
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiAccountSwitcherBottomSheetFragmentKey(surface), null, 2, null).show(getChildFragmentManager(), "sdui-account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().setAccountNumber(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        getDuxo().refreshAccountSwitcher();
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onActionClicked$1", m3645f = "IndexDetailPageTradeBarFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$onActionClicked$1 */
    static final class C188781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188781(Continuation<? super C188781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarFragment.this.new C188781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                IntentKey tradeOptionsIntentKey = IndexDetailPageTradeBarFragment.this.getDuxo().getStateFlow().getValue().getTradeOptionsIntentKey();
                if (tradeOptionsIntentKey != null) {
                    IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment = IndexDetailPageTradeBarFragment.this;
                    EventLogger eventLogger = indexDetailPageTradeBarFragment.getEventLogger();
                    Companion companion = IndexDetailPageTradeBarFragment.INSTANCE;
                    IndexDetailPageLoggings.logIndexDetailPageTradeBarTap(eventLogger, tradeOptionsIntentKey, ((Args) companion.getArgs((Fragment) indexDetailPageTradeBarFragment)).getIndexId(), ((Args) companion.getArgs((Fragment) indexDetailPageTradeBarFragment)).getSource().getEntryPointIdentifier());
                    Navigator navigator = indexDetailPageTradeBarFragment.getNavigator();
                    Context contextRequireContext = indexDetailPageTradeBarFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, tradeOptionsIntentKey, null, false, null, null, 60, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onActionClicked(AbstractTradeBarOverlayView.ExpandAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C188781(null), 3, null);
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Args;", "Landroid/os/Parcelable;", "indexId", "Ljava/util/UUID;", "source", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "initialAccountNumber", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;Ljava/lang/String;)V", "getIndexId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "getInitialAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID indexId;
        private final String initialAccountNumber;
        private final IndexDetailPageFragmentKey2 source;

        /* compiled from: IndexDetailPageTradeBarFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (IndexDetailPageFragmentKey2) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.indexId;
            }
            if ((i & 2) != 0) {
                indexDetailPageFragmentKey2 = args.source;
            }
            if ((i & 4) != 0) {
                str = args.initialAccountNumber;
            }
            return args.copy(uuid, indexDetailPageFragmentKey2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getIndexId() {
            return this.indexId;
        }

        /* renamed from: component2, reason: from getter */
        public final IndexDetailPageFragmentKey2 getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final Args copy(UUID indexId, IndexDetailPageFragmentKey2 source, String initialAccountNumber) {
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            return new Args(indexId, source, initialAccountNumber);
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
            return Intrinsics.areEqual(this.indexId, args.indexId) && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.initialAccountNumber, args.initialAccountNumber);
        }

        public int hashCode() {
            return (((this.indexId.hashCode() * 31) + this.source.hashCode()) * 31) + this.initialAccountNumber.hashCode();
        }

        public String toString() {
            return "Args(indexId=" + this.indexId + ", source=" + this.source + ", initialAccountNumber=" + this.initialAccountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.indexId);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.initialAccountNumber);
        }

        public Args(UUID indexId, IndexDetailPageFragmentKey2 source, String initialAccountNumber) {
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            this.indexId = indexId;
            this.source = source;
            this.initialAccountNumber = initialAccountNumber;
        }

        public final UUID getIndexId() {
            return this.indexId;
        }

        public final IndexDetailPageFragmentKey2 getSource() {
            return this.source;
        }

        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }
    }

    /* compiled from: IndexDetailPageTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IndexDetailPageTradeBarFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, indexDetailPageTradeBarFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndexDetailPageTradeBarFragment newInstance(Args args) {
            return (IndexDetailPageTradeBarFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndexDetailPageTradeBarFragment indexDetailPageTradeBarFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, indexDetailPageTradeBarFragment, args);
        }
    }
}
