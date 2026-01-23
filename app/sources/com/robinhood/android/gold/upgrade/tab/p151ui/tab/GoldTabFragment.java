package com.robinhood.android.gold.upgrade.tab.p151ui.tab;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.gold.contracts.GoldHubFragmentKey;
import com.robinhood.android.gold.contracts.GoldTabFragmentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeFragmentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeTabContract;
import com.robinhood.android.gold.upgrade.tab.p151ui.GoldTabErrorFragment;
import com.robinhood.android.gold.upgrade.tab.p151ui.tab.GoldTabState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* compiled from: GoldTabFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "state", "Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabState;", "getState", "()Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabState;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "showFragmentByState", "showRootFragment", "logAppearChange", "appeared", "", "onUpgradeSuccess", "onUpgradeDataLoadError", "onUpgradeCanceled", "Companion", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldTabFragment extends BaseTabFragment implements GoldUpgradeTabContract.Callback {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldTabFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = DuxosKt.duxo(this, GoldTabDuxo.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldTabDuxo getDuxo() {
        return (GoldTabDuxo) this.duxo.getValue();
    }

    private final GoldTabState getState() {
        return getDuxo().getStateFlow().getValue();
    }

    /* compiled from: GoldTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.ui.tab.GoldTabFragment$onViewCreated$1", m3645f = "GoldTabFragment.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.tab.ui.tab.GoldTabFragment$onViewCreated$1 */
    static final class C181591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C181591(Continuation<? super C181591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldTabFragment.this.new C181591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<GoldTabState> stateFlow = GoldTabFragment.this.getDuxo().getStateFlow();
                final GoldTabFragment goldTabFragment = GoldTabFragment.this;
                FlowCollector<? super GoldTabState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.upgrade.tab.ui.tab.GoldTabFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GoldTabState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(GoldTabState goldTabState, Continuation<? super Unit> continuation) {
                        goldTabFragment.showFragmentByState(goldTabState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C181591(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getRootFragment() != null) {
            handleDeeplink();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        logAppearChange(getState(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFragmentByState(GoldTabState state) {
        Fragment fragmentNewInstance;
        Timber.INSTANCE.mo3350d("Refresh gold tab with state=" + state.getClass().getSimpleName(), new Object[0]);
        if (Intrinsics.areEqual(state, GoldTabState.ShowGoldUpgrade.INSTANCE)) {
            fragmentNewInstance = Navigator.DefaultImpls.createFragment$default(getNavigator(), GoldUpgradeFragmentKey.INSTANCE.defaultForGoldTab(), null, 2, null);
        } else if (Intrinsics.areEqual(state, GoldTabState.ShowGoldHub.INSTANCE)) {
            fragmentNewInstance = Navigator.DefaultImpls.createFragment$default(getNavigator(), new GoldHubFragmentKey(true, null, "gold-tab", 2, null), null, 2, null);
        } else if (Intrinsics.areEqual(state, GoldTabState.Loading.INSTANCE)) {
            fragmentNewInstance = ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.List(true, true, 0, 4, null), null, 2, null));
        } else {
            if (!Intrinsics.areEqual(state, GoldTabState.Error.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentNewInstance = GoldTabErrorFragment.INSTANCE.newInstance();
        }
        logAppearChange(state, true);
        setRootFragmentIfDifferent(fragmentNewInstance);
        notifyFragmentChanged();
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        showFragmentByState(getState());
    }

    private final void logAppearChange(GoldTabState state, boolean appeared) {
        String str;
        Screen.Name name = Screen.Name.GOLD_TAB;
        if (Intrinsics.areEqual(state, GoldTabState.ShowGoldHub.INSTANCE)) {
            str = "gold-hub";
        } else if (Intrinsics.areEqual(state, GoldTabState.ShowGoldUpgrade.INSTANCE)) {
            str = "gold-value-props";
        } else if (Intrinsics.areEqual(state, GoldTabState.Error.INSTANCE)) {
            str = "error";
        } else {
            if (!Intrinsics.areEqual(state, GoldTabState.Loading.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            if (appeared) {
                EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(name, null, str2, null, 10, null), null, null, null, 29, null);
            } else {
                EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(name, null, str2, null, 10, null), null, null, null, 29, null);
            }
        }
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeTabContract.Callback
    public void onUpgradeSuccess() {
        Timber.INSTANCE.mo3350d("onUpgradeSuccess()", new Object[0]);
        showFragmentByState(GoldTabState.Loading.INSTANCE);
        getDuxo().refreshGoldStatus();
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeTabContract.Callback
    public void onUpgradeDataLoadError() {
        showFragmentByState(GoldTabState.Loading.INSTANCE);
        getDuxo().refreshGoldStatus();
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeTabContract.Callback
    public void onUpgradeCanceled() {
        getDuxo().refreshGoldStatus();
    }

    /* compiled from: GoldTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabFragment;", "Lcom/robinhood/android/gold/contracts/GoldTabFragmentKey;", "<init>", "()V", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GoldTabFragment, GoldTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldTabFragmentKey goldTabFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, goldTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldTabFragmentKey getArgs(GoldTabFragment goldTabFragment) {
            return (GoldTabFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, goldTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldTabFragment newInstance(GoldTabFragmentKey goldTabFragmentKey) {
            return (GoldTabFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, goldTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldTabFragment goldTabFragment, GoldTabFragmentKey goldTabFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, goldTabFragment, goldTabFragmentKey);
        }
    }
}
