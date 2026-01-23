package com.robinhood.android.retirement.p239ui.funded;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.android.retirement.dashboard.header.AccountSwitcherExtensions2;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment2;
import com.robinhood.android.retirement.p239ui.RetirementDashboardEvent;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.android.retirement.p239ui.funded.FundedDashboardCallbacks;
import com.robinhood.android.retirement.p239ui.uninvested.UninvestedBottomSheetFragment;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RetirementDashboardFundedFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002]^B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020FH\u0002J\r\u0010G\u001a\u000209H\u0017¢\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u000209H\u0016J\u0018\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020*2\u0006\u0010O\u001a\u00020PH\u0016J\u0018\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000209H\u0016J\u0010\u0010W\u001a\u0002092\u0006\u0010X\u001a\u00020*H\u0016J\u0018\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u00020P2\u0006\u0010N\u001a\u00020*H\u0016J\b\u0010[\u001a\u000209H\u0016J\b\u0010\\\u001a\u000209H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R/\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00102\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u00105¨\u0006_²\u0006\n\u0010`\u001a\u00020CX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardFundedFragment;", "Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "Lcom/robinhood/android/retirement/ui/funded/FundedDashboardCallbacks;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "screenIdentifier", "getScreenIdentifier", "()Ljava/lang/String;", "setScreenIdentifier", "(Ljava/lang/String;)V", "screenIdentifier$delegate", "Lkotlin/properties/ReadWriteProperty;", "animateScrollToTop", "getAnimateScrollToTop", "setAnimateScrollToTop", "(Z)V", "animateScrollToTop$delegate", "Landroidx/compose/runtime/MutableState;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindViewState", "state", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;", "consumeRetirementDashboardEvent", "event", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onRefreshAccountsClicked", "onAccountSelected", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onUninvestedCtaClicked", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileCta;", "loggingInfo", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "scrollToTop", "onUninvestedBottomSheetDeeplinkHandled", "deeplink", "onContributeClicked", "accountType", "onRetirementOptionsAssetHomeTooltipSeen", "onRetirementOptionsAssetHomeOrTooltipClicked", "Args", "Companion", "feature-retirement-tab_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementDashboardFundedFragment extends GenericRetirementTabFragment implements FundedDashboardCallbacks, Scrollable, RetirementUninvestedModal.Callbacks {
    public static final int $stable = 0;
    public CrossSellLaunchManager crossSellLaunchManager;
    public EventLogger eventLogger;
    public HistoryNavigator historyNavigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RetirementDashboardFundedFragment.class, "screenIdentifier", "getScreenIdentifier()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementDashboardDuxo.class);

    /* renamed from: screenIdentifier$delegate, reason: from kotlin metadata */
    private final Interfaces3 screenIdentifier = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[0]);

    /* renamed from: animateScrollToTop$delegate, reason: from kotlin metadata */
    private final SnapshotState animateScrollToTop = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(RetirementDashboardFundedFragment retirementDashboardFundedFragment, int i, Composer composer, int i2) {
        retirementDashboardFundedFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.retirement.contracts.RetirementUninvestedModal.Callbacks
    public void onUninvestedBottomSheetDeeplinkHandled(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        FundedDashboardCallbacks.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        FundedDashboardCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surfaceDto) {
        FundedDashboardCallbacks.DefaultImpls.showSduiAccountSwitcher(this, surfaceDto);
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

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.RETIREMENT_DASHBOARD;
        String screenIdentifier = getScreenIdentifier();
        if (screenIdentifier == null) {
            screenIdentifier = "";
        }
        return new Screen(name, null, screenIdentifier, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementDashboardDuxo getDuxo() {
        return (RetirementDashboardDuxo) this.duxo.getValue();
    }

    private final String getScreenIdentifier() {
        return (String) this.screenIdentifier.getValue(this, $$delegatedProperties[0]);
    }

    private final void setScreenIdentifier(String str) {
        this.screenIdentifier.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAnimateScrollToTop() {
        return ((Boolean) this.animateScrollToTop.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimateScrollToTop(boolean z) {
        this.animateScrollToTop.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: RetirementDashboardFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$1", m3645f = "RetirementDashboardFundedFragment.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$1 */
    static final class C272191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272191(Continuation<? super C272191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardFundedFragment.this.new C272191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RetirementDashboardFundedFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RetirementDashboardFundedFragment $tmp0;

            AnonymousClass1(RetirementDashboardFundedFragment retirementDashboardFundedFragment) {
                this.$tmp0 = retirementDashboardFundedFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RetirementDashboardFundedFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(RetirementDashboardViewState retirementDashboardViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C272191.invokeSuspend$bindViewState(this.$tmp0, retirementDashboardViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((RetirementDashboardViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RetirementDashboardViewState> stateFlow = RetirementDashboardFundedFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RetirementDashboardFundedFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bindViewState(RetirementDashboardFundedFragment retirementDashboardFundedFragment, RetirementDashboardViewState retirementDashboardViewState, Continuation continuation) {
            retirementDashboardFundedFragment.bindViewState(retirementDashboardViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C272191(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C272202(null), 1, null);
    }

    /* compiled from: RetirementDashboardFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$2", m3645f = "RetirementDashboardFundedFragment.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$2 */
    static final class C272202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272202(Continuation<? super C272202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardFundedFragment.this.new C272202(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<RetirementDashboardEvent>> eventFlow = RetirementDashboardFundedFragment.this.getDuxo().getEventFlow();
                final RetirementDashboardFundedFragment retirementDashboardFundedFragment = RetirementDashboardFundedFragment.this;
                FlowCollector<? super Event<RetirementDashboardEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementDashboardEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementDashboardEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementDashboardEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementDashboardFundedFragment retirementDashboardFundedFragment2 = retirementDashboardFundedFragment;
                            if ((event.getData() instanceof RetirementDashboardEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m18216invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18216invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        retirementDashboardFundedFragment2.consumeRetirementDashboardEvent((RetirementDashboardEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementDashboardViewState ComposeContent$lambda$1(SnapshotState4<RetirementDashboardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(RetirementDashboardViewState state) {
        if (!Intrinsics.areEqual(getActiveAccountNumber(), state.getActiveAccountNumber())) {
            setActiveAccountNumber(state.getActiveAccountNumber());
            CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.RETIREMENT_DASHBOARD, state.getActiveAccountNumber(), null, null, null, null, null, null, 504, null);
        }
        setActiveBrokerageAccountType(state.getActiveBrokerageAccountType());
        if (Intrinsics.areEqual(state.getLoggingIdentifier(), getScreenIdentifier())) {
            return;
        }
        setScreenIdentifier(state.getLoggingIdentifier());
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeRetirementDashboardEvent(RetirementDashboardEvent event) throws Throwable {
        if (event instanceof RetirementDashboardEvent.AccountSwitcherRefreshed) {
            onAccountSwitcherCtaClicked(AccountSwitcherExtensions2.toAccountSwitcherData(((RetirementDashboardEvent.AccountSwitcherRefreshed) event).getAccountSwitcher(), getActiveAccountNumber()));
        } else {
            if (!(event instanceof RetirementDashboardEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            getActivityErrorHandler().accept(((RetirementDashboardEvent.Error) event).getException());
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2130548882);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2130548882, i2, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.ComposeContent (RetirementDashboardFundedFragment.kt:116)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RetirementDashboardFundedFragment2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1241911737);
            if (getAnimateScrollToTop()) {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | (i3 == 4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new RetirementDashboardFundedFragment3(lazyListStateRememberLazyListState, this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider(this, ((Args) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs(), lazyListStateRememberLazyListState, ComposableLambda3.rememberComposableLambda(-1542708847, true, new Function4<LazyListState, NestedScrollModifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.ComposeContent.3
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, NestedScrollModifier nestedScrollModifier, Composer composer2, Integer num) {
                    invoke(lazyListState, nestedScrollModifier, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyListState unused$var$, final NestedScrollModifier nestedScrollModifier, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1542708847, i4, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.ComposeContent.<anonymous> (RetirementDashboardFundedFragment.kt:138)");
                    }
                    RetirementDashboardFundedFragment retirementDashboardFundedFragment = RetirementDashboardFundedFragment.this;
                    String loggingIdentifier = RetirementDashboardFundedFragment.ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingIdentifier();
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final RetirementDashboardFundedFragment retirementDashboardFundedFragment2 = RetirementDashboardFundedFragment.this;
                    final SnapshotState4<RetirementDashboardViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    GenericRetirementTabFragment2.RetirementTheme(retirementDashboardFundedFragment, loggingIdentifier, ComposableLambda3.rememberComposableLambda(314085453, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.ComposeContent.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(314085453, i5, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment.ComposeContent.<anonymous>.<anonymous> (RetirementDashboardFundedFragment.kt:141)");
                            }
                            RetirementDashboardViewState retirementDashboardViewStateComposeContent$lambda$1 = RetirementDashboardFundedFragment.ComposeContent$lambda$1(snapshotState4);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
                            RetirementDashboardKt.RetirementDashboard(companion.then(nestedScrollModifier2 != null ? NestedScrollModifier7.nestedScroll$default(companion, nestedScrollModifier2, null, 2, null) : companion), retirementDashboardViewStateComposeContent$lambda$1, lazyListState, retirementDashboardFundedFragment2, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i3 | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardFundedFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        getDuxo().refreshAccountSwitcher();
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().onRetirementAccountSelected(accountNumber);
        UtilKt.logAccountChange(getEventLogger(), getEventScreen(), accountNumber, getActiveAccountNumber());
    }

    @Override // com.robinhood.android.retirement.lib.UninvestedSection2
    public void onUninvestedCtaClicked(RetirementUninvestedViewModel.MobileCta cta, RetirementUninvestedModal.UninvestedLoggingInfo loggingInfo) {
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        if (cta instanceof RetirementUninvestedViewModel.MobileCta.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((RetirementUninvestedViewModel.MobileCta.Deeplink) cta).getData()), null, null, false, null, 60, null);
            return;
        }
        if (!(cta instanceof RetirementUninvestedViewModel.MobileCta.Modal)) {
            throw new NoWhenBranchMatchedException();
        }
        UninvestedBottomSheetFragment uninvestedBottomSheetFragment = (UninvestedBottomSheetFragment) UninvestedBottomSheetFragment.INSTANCE.newInstance((Parcelable) new RetirementUninvestedModal(((RetirementUninvestedViewModel.MobileCta.Modal) cta).getData(), getEventScreen(), loggingInfo));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        uninvestedBottomSheetFragment.show(childFragmentManager, loggingInfo.getIdentifier());
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        setAnimateScrollToTop(true);
    }

    @Override // com.robinhood.android.retirement.p239ui.funded.RetirementContributeFooterButton2
    public void onContributeClicked(BrokerageAccountType accountType, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CreateRetirementContribution(null, accountNumber, TransferContext.RobinhoodAccountType.INSTANCE.from(accountType), false, false, MAXTransferContext.EntryPoint.RETIREMENT_FUNDED_DASHBOARD, 25, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.retirement.p239ui.funded.RetirementAssetHeaderCallbacks
    public void onRetirementOptionsAssetHomeTooltipSeen() {
        getDuxo().onRetirementOptionsAssetHomeTooltipSeen();
    }

    @Override // com.robinhood.android.retirement.p239ui.funded.RetirementAssetHeaderCallbacks
    public void onRetirementOptionsAssetHomeOrTooltipClicked() {
        getDuxo().onRetirementOptionsAssetHomeOrTooltipClicked();
    }

    /* compiled from: RetirementDashboardFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardFundedFragment$Args;", "Landroid/os/Parcelable;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Ljava/lang/String;)V", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final AccountSelectorTabArgs accountSelectorTabArgs;

        /* compiled from: RetirementDashboardFundedFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AccountSelectorTabArgs) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
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
            dest.writeParcelable(this.accountSelectorTabArgs, flags);
            dest.writeString(this.accountNumber);
        }

        public Args(AccountSelectorTabArgs accountSelectorTabArgs, String str) {
            this.accountSelectorTabArgs = accountSelectorTabArgs;
            this.accountNumber = str;
        }

        public /* synthetic */ Args(AccountSelectorTabArgs accountSelectorTabArgs, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountSelectorTabArgs, str);
        }

        public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
            return this.accountSelectorTabArgs;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RetirementDashboardFundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardFundedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardFundedFragment;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardFundedFragment$Args;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementDashboardFundedFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementDashboardFundedFragment retirementDashboardFundedFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementDashboardFundedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementDashboardFundedFragment newInstance(Args args) {
            return (RetirementDashboardFundedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementDashboardFundedFragment retirementDashboardFundedFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementDashboardFundedFragment, args);
        }
    }
}
