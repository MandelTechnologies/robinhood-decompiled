package com.robinhood.android.retirement.p239ui.unfunded;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.retirement.dashboard.header.AccountSwitcherExtensions2;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment2;
import com.robinhood.android.retirement.p239ui.RetirementDashboardEvent;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.android.retirement.p239ui.unfunded.UnfundedDashboard;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RetirementDashboardUnfundedFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u001a\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002J\r\u0010,\u001a\u00020 H\u0017¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020 H\u0016J\u0018\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020=H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006@²\u0006\n\u0010A\u001a\u00020=X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment;", "Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "consumeRetirementDashboardEvent", "event", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onRefreshAccountsClicked", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onClickInfoBanner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "onDismissInfoBanner", "bindViewState", "state", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;", "Args", "Companion", "feature-retirement-tab_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementDashboardUnfundedFragment extends GenericRetirementTabFragment implements UnfundedDashboard {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CrossSellLaunchManager crossSellLaunchManager;
    public EventLogger eventLogger;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementDashboardUnfundedDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_DASHBOARD, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment, int i, Composer composer, int i2) {
        retirementDashboardUnfundedFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        UnfundedDashboard.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        UnfundedDashboard.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surfaceDto) {
        UnfundedDashboard.DefaultImpls.showSduiAccountSwitcher(this, surfaceDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementDashboardUnfundedDuxo getDuxo() {
        return (RetirementDashboardUnfundedDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.RETIREMENT_DASHBOARD, null, null, null, null, null, null, null, 508, null);
    }

    /* compiled from: RetirementDashboardUnfundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$1", m3645f = "RetirementDashboardUnfundedFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$1 */
    static final class C272881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272881(Continuation<? super C272881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardUnfundedFragment.this.new C272881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RetirementDashboardUnfundedFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RetirementDashboardUnfundedFragment $tmp0;

            AnonymousClass1(RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment) {
                this.$tmp0 = retirementDashboardUnfundedFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RetirementDashboardUnfundedFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C272881.invokeSuspend$bindViewState(this.$tmp0, retirementDashboardUnfundedViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((RetirementDashboardUnfundedViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RetirementDashboardUnfundedViewState> stateFlow = RetirementDashboardUnfundedFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RetirementDashboardUnfundedFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bindViewState(RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment, RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, Continuation continuation) {
            retirementDashboardUnfundedFragment.bindViewState(retirementDashboardUnfundedViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C272881(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C272892(null), 1, null);
    }

    /* compiled from: RetirementDashboardUnfundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$2", m3645f = "RetirementDashboardUnfundedFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$2 */
    static final class C272892 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272892(Continuation<? super C272892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardUnfundedFragment.this.new C272892(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<RetirementDashboardEvent>> eventFlow = RetirementDashboardUnfundedFragment.this.getDuxo().getEventFlow();
                final RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment = RetirementDashboardUnfundedFragment.this;
                FlowCollector<? super Event<RetirementDashboardEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementDashboardEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementDashboardEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementDashboardEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment2 = retirementDashboardUnfundedFragment;
                            if ((event.getData() instanceof RetirementDashboardEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m18230invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18230invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        retirementDashboardUnfundedFragment2.consumeRetirementDashboardEvent((RetirementDashboardEvent) event.getData());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementDashboardUnfundedViewState ComposeContent$lambda$0(SnapshotState4<RetirementDashboardUnfundedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-371459911);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-371459911, i2, -1, "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.ComposeContent (RetirementDashboardUnfundedFragment.kt:84)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider(this, ((Args) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs(), (ScrollState) null, ComposableLambda3.rememberComposableLambda(-1857571865, true, new Function4<ScrollState, NestedScrollModifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState, NestedScrollModifier nestedScrollModifier, Composer composer2, Integer num) {
                    invoke(scrollState, nestedScrollModifier, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final ScrollState scrollState, final NestedScrollModifier nestedScrollModifier, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(scrollState, "scrollState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1857571865, i3, -1, "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.ComposeContent.<anonymous> (RetirementDashboardUnfundedFragment.kt:90)");
                    }
                    RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment = RetirementDashboardUnfundedFragment.this;
                    String loggingIdentifier = RetirementDashboardUnfundedFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingIdentifier();
                    final RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment2 = RetirementDashboardUnfundedFragment.this;
                    final SnapshotState4<RetirementDashboardUnfundedViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    GenericRetirementTabFragment2.RetirementTheme(retirementDashboardUnfundedFragment, loggingIdentifier, ComposableLambda3.rememberComposableLambda(-777565, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            Modifier modifierNestedScroll$default;
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-777565, i4, -1, "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment.ComposeContent.<anonymous>.<anonymous> (RetirementDashboardUnfundedFragment.kt:93)");
                            }
                            RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewStateComposeContent$lambda$0 = RetirementDashboardUnfundedFragment.ComposeContent$lambda$0(snapshotState4);
                            AccountSelectorTabArgs accountSelectorTabArgs = ((Args) RetirementDashboardUnfundedFragment.INSTANCE.getArgs((Fragment) retirementDashboardUnfundedFragment2)).getAccountSelectorTabArgs();
                            boolean z = accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded();
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
                            UnfundedDashboard2.UnfundedScreen(retirementDashboardUnfundedViewStateComposeContent$lambda$0, retirementDashboardUnfundedFragment2, z, (nestedScrollModifier2 == null || (modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifierFillMaxSize$default, nestedScrollModifier2, null, 2, null)) == null) ? modifierFillMaxSize$default : modifierNestedScroll$default, scrollState, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardUnfundedFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
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

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onClickInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        GenericAction ctaAction = banner.getCtaAction();
        if (ctaAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) ctaAction;
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deeplinkAction.getUri(), null, null, false, null, 60, null);
            getDuxo().tapInfoBanner(banner.getReceiptUuid(), deeplinkAction);
        }
    }

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onDismissInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        RetirementDashboardUnfundedDuxo.dismissInfoBanner$default(getDuxo(), banner.getReceiptUuid(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(RetirementDashboardUnfundedViewState state) {
        if (!Intrinsics.areEqual(getActiveAccountNumber(), state.getActiveAccountNumber())) {
            setActiveAccountNumber(state.getActiveAccountNumber());
            EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, Screen.copy$default(getEventScreen(), null, null, state.getLoggingIdentifier(), null, 11, null), null, null, null, 29, null);
        }
        setActiveBrokerageAccountType(state.getActiveAccountType());
    }

    /* compiled from: RetirementDashboardUnfundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment$Args;", "Landroid/os/Parcelable;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Ljava/lang/String;)V", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final AccountSelectorTabArgs accountSelectorTabArgs;

        /* compiled from: RetirementDashboardUnfundedFragment.kt */
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

        public static /* synthetic */ Args copy$default(Args args, AccountSelectorTabArgs accountSelectorTabArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSelectorTabArgs = args.accountSelectorTabArgs;
            }
            if ((i & 2) != 0) {
                str = args.accountNumber;
            }
            return args.copy(accountSelectorTabArgs, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
            return this.accountSelectorTabArgs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(AccountSelectorTabArgs accountSelectorTabArgs, String accountNumber) {
            return new Args(accountSelectorTabArgs, accountNumber);
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
            return Intrinsics.areEqual(this.accountSelectorTabArgs, args.accountSelectorTabArgs) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
            int iHashCode = (accountSelectorTabArgs == null ? 0 : accountSelectorTabArgs.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(accountSelectorTabArgs=" + this.accountSelectorTabArgs + ", accountNumber=" + this.accountNumber + ")";
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

    /* compiled from: RetirementDashboardUnfundedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment$Args;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementDashboardUnfundedFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementDashboardUnfundedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementDashboardUnfundedFragment newInstance(Args args) {
            return (RetirementDashboardUnfundedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementDashboardUnfundedFragment retirementDashboardUnfundedFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementDashboardUnfundedFragment, args);
        }
    }
}
