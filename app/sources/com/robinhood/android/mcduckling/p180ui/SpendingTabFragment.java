package com.robinhood.android.mcduckling.p180ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.McDucklingTabFragmentDeepLinkProps;
import com.robinhood.android.cash.contracts.SpendingTab;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.navigation.McDucklingWaitlistSource;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistFragmentKey;
import com.robinhood.android.mcduckling.CashManagementAccessManager;
import com.robinhood.android.mcduckling.CashManagementAccessManager4;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpConfirmationContract;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract;
import com.robinhood.android.rhy.waitlist.lib.prefs.RhyWaitlistFullscreenAnimationSeenPref;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.McDucklingBadgeStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: SpendingTabFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001XB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010=\u001a\u00020%2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020%H\u0016J\b\u0010A\u001a\u00020%H\u0016J\u0010\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u000201H\u0002J\b\u0010G\u001a\u00020%H\u0014J\b\u0010H\u001a\u00020%H\u0002J\u0010\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020?H\u0016J\b\u0010K\u001a\u00020%H\u0016J\b\u0010L\u001a\u00020%H\u0016J\"\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020O2\b\u0010Q\u001a\u0004\u0018\u00010DH\u0016J\t\u0010R\u001a\u00020:H\u0096\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010+\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u001e0\u001e0$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0/X\u0082\u0004¢\u0006\u0002\n\u0000R/\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u0001018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00109\u001a\u00020:X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001c\u0010B\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010D0D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TX\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Callbacks;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Callbacks;", "Lcom/robinhood/McDucklingTabFragmentDeepLinkProps;", "<init>", "()V", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "getCashManagementAccessManager", "()Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "setCashManagementAccessManager", "(Lcom/robinhood/android/mcduckling/CashManagementAccessManager;)V", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "getMcDucklingBadgeStore", "()Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "setMcDucklingBadgeStore", "(Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;)V", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldResetCashTabPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldResetCashTabPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "rhyWaitlistFullscreenAnimationSeenPref", "getRhyWaitlistFullscreenAnimationSeenPref", "setRhyWaitlistFullscreenAnimationSeenPref", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "showCardActionsFromLink", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "getShowCardActionsFromLink", "()Lio/reactivex/subjects/BehaviorSubject;", "setShowCardActionsFromLink", "(Lio/reactivex/subjects/BehaviorSubject;)V", "scrollToFromLink", "getScrollToFromLink", "setScrollToFromLink", "showRootFragmentRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "<set-?>", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "pendingAccessState", "getPendingAccessState", "()Lcom/robinhood/android/mcduckling/CashTabAccessState;", "setPendingAccessState", "(Lcom/robinhood/android/mcduckling/CashTabAccessState;)V", "pendingAccessState$delegate", "Lkotlin/properties/ReadWriteProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "launchRhyWaitlist", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "setFragmentForAccessState", "accessState", "showRootFragment", "setupDeepLinkListeners", "onSaveInstanceState", "outState", "onWaitlistJoined", "onWaitlistDone", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-tab-spending_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SpendingTabFragment extends BaseTabFragment implements RegionGated, RhyWaitlistSignUpContract.Callbacks, RhyWaitlistSignUpConfirmationContract.Callbacks, McDucklingTabFragmentDeepLinkProps {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SpendingTabFragment.class, "pendingAccessState", "getPendingAccessState()Lcom/robinhood/android/mcduckling/CashTabAccessState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_CODE_ONBOARDING = 1;
    private static final String SAVE_SOURCE = "source";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public CashManagementAccessManager cashManagementAccessManager;
    private final ActivityResultLauncher<Intent> launchRhyWaitlist;
    public McDucklingBadgeStore mcDucklingBadgeStore;

    /* renamed from: pendingAccessState$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingAccessState;

    @RhyWaitlistFullscreenAnimationSeenPref
    public BooleanPreference rhyWaitlistFullscreenAnimationSeenPref;
    private BehaviorSubject<String> scrollToFromLink;

    @ShouldResetCashTabPref
    public BooleanPreference shouldResetCashTabPref;
    private BehaviorSubject<Unit> showCardActionsFromLink;
    private final PublishRelay<Unit> showRootFragmentRelay;
    private String source;
    private final boolean useDesignSystemToolbar;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public SpendingTabFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.source = McDucklingWaitlistSource.SOURCE_CASH_MANAGEMENT_TAB;
        BehaviorSubject<Unit> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.showCardActionsFromLink = behaviorSubjectCreate;
        BehaviorSubject<String> behaviorSubjectCreate2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate2, "create(...)");
        this.scrollToFromLink = behaviorSubjectCreate2;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.showRootFragmentRelay = publishRelayCreate;
        this.pendingAccessState = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
        this.useDesignSystemToolbar = true;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment$launchRhyWaitlist$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.showRootFragment();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launchRhyWaitlist = activityResultLauncherRegisterForActivityResult;
    }

    public final CashManagementAccessManager getCashManagementAccessManager() {
        CashManagementAccessManager cashManagementAccessManager = this.cashManagementAccessManager;
        if (cashManagementAccessManager != null) {
            return cashManagementAccessManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cashManagementAccessManager");
        return null;
    }

    public final void setCashManagementAccessManager(CashManagementAccessManager cashManagementAccessManager) {
        Intrinsics.checkNotNullParameter(cashManagementAccessManager, "<set-?>");
        this.cashManagementAccessManager = cashManagementAccessManager;
    }

    public final McDucklingBadgeStore getMcDucklingBadgeStore() {
        McDucklingBadgeStore mcDucklingBadgeStore = this.mcDucklingBadgeStore;
        if (mcDucklingBadgeStore != null) {
            return mcDucklingBadgeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mcDucklingBadgeStore");
        return null;
    }

    public final void setMcDucklingBadgeStore(McDucklingBadgeStore mcDucklingBadgeStore) {
        Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "<set-?>");
        this.mcDucklingBadgeStore = mcDucklingBadgeStore;
    }

    public final BooleanPreference getShouldResetCashTabPref() {
        BooleanPreference booleanPreference = this.shouldResetCashTabPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldResetCashTabPref");
        return null;
    }

    public final void setShouldResetCashTabPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldResetCashTabPref = booleanPreference;
    }

    public final BooleanPreference getRhyWaitlistFullscreenAnimationSeenPref() {
        BooleanPreference booleanPreference = this.rhyWaitlistFullscreenAnimationSeenPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyWaitlistFullscreenAnimationSeenPref");
        return null;
    }

    public final void setRhyWaitlistFullscreenAnimationSeenPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.rhyWaitlistFullscreenAnimationSeenPref = booleanPreference;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public String getSource() {
        return this.source;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public BehaviorSubject<Unit> getShowCardActionsFromLink() {
        return this.showCardActionsFromLink;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public void setShowCardActionsFromLink(BehaviorSubject<Unit> behaviorSubject) {
        Intrinsics.checkNotNullParameter(behaviorSubject, "<set-?>");
        this.showCardActionsFromLink = behaviorSubject;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public BehaviorSubject<String> getScrollToFromLink() {
        return this.scrollToFromLink;
    }

    @Override // com.robinhood.McDucklingTabFragmentDeepLinkProps
    public void setScrollToFromLink(BehaviorSubject<String> behaviorSubject) {
        Intrinsics.checkNotNullParameter(behaviorSubject, "<set-?>");
        this.scrollToFromLink = behaviorSubject;
    }

    private final CashManagementAccessManager4 getPendingAccessState() {
        return (CashManagementAccessManager4) this.pendingAccessState.getValue(this, $$delegatedProperties[0]);
    }

    private final void setPendingAccessState(CashManagementAccessManager4 cashManagementAccessManager4) {
        this.pendingAccessState.setValue(this, $$delegatedProperties[0], cashManagementAccessManager4);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable<R> observableSwitchMap = this.showRootFragmentRelay.switchMap(new Function() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CashManagementAccessManager4> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SpendingTabFragment.this.getCashManagementAccessManager().streamCashTabAccessState(((SpendingTab) SpendingTabFragment.INSTANCE.getArgs((Fragment) SpendingTabFragment.this)).getAccountSelectorTabArgs()).distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpendingTabFragment.onCreate$lambda$0(this.f$0, (CashManagementAccessManager4) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpendingTabFragment.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        if (savedInstanceState != null) {
            String string2 = savedInstanceState.getString("source");
            if (string2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            setSource(string2);
        } else {
            setRootFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(ShimmerLoaderType.Boxes.INSTANCE, ShimmerLoadingFragment.Args.NavButtonType.NONE)));
        }
        showRootFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SpendingTabFragment spendingTabFragment, CashManagementAccessManager4 cashManagementAccessManager4) {
        if (spendingTabFragment.getChildFragmentManager().isStateSaved()) {
            spendingTabFragment.setPendingAccessState(cashManagementAccessManager4);
        } else {
            Intrinsics.checkNotNull(cashManagementAccessManager4);
            spendingTabFragment.setFragmentForAccessState(cashManagementAccessManager4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SpendingTabFragment spendingTabFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbsErrorHandler.handleError$default(spendingTabFragment.getActivityErrorHandler(), it, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        super.handleDeeplink();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        CashManagementAccessManager4 pendingAccessState = getPendingAccessState();
        if (pendingAccessState != null) {
            setPendingAccessState(null);
            setFragmentForAccessState(pendingAccessState);
        }
        Observable<Boolean> observableFilter = getShouldResetCashTabPref().getChanges().distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpendingTabFragment.onStart$lambda$2(this.f$0, (Boolean) obj);
            }
        });
        getMcDucklingBadgeStore().visitedMcDucklingTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SpendingTabFragment spendingTabFragment, Boolean bool) {
        spendingTabFragment.getShouldResetCashTabPref().set(false);
        spendingTabFragment.getCashManagementAccessManager().refresh(true);
        spendingTabFragment.resetAndShowRootFragment();
        return Unit.INSTANCE;
    }

    private final void setFragmentForAccessState(CashManagementAccessManager4 accessState) {
        Fragment fragmentCreateFragment$default = null;
        if (accessState instanceof CashManagementAccessManager4.RhyOverview) {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), ((CashManagementAccessManager4.RhyOverview) accessState).getFragmentKey(), null, 2, null);
        } else if (accessState instanceof CashManagementAccessManager4.RhyWaitlist) {
            CashManagementAccessManager4.RhyWaitlist rhyWaitlist = (CashManagementAccessManager4.RhyWaitlist) accessState;
            if ((rhyWaitlist.getFragmentKey() instanceof RhyWaitlistSignUpContract.Key) && !getRhyWaitlistFullscreenAnimationSeenPref().get()) {
                ActivityResultLauncher<Intent> activityResultLauncher = this.launchRhyWaitlist;
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, LegacyIntentKey.RhyWaitlist.INSTANCE, null, false, 12, null));
            } else {
                fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), rhyWaitlist.getFragmentKey(), null, 2, null);
            }
        } else if (accessState instanceof CashManagementAccessManager4.RhyFullScreenInfo) {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.RhyFullScreenInfo(((CashManagementAccessManager4.RhyFullScreenInfo) accessState).getInfo()), null, 2, null);
        } else if (accessState instanceof CashManagementAccessManager4.RhyPendingScreenInfo) {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.RhyPendingScreen(((CashManagementAccessManager4.RhyPendingScreenInfo) accessState).getInfo()), null, 2, null);
        } else if (accessState instanceof CashManagementAccessManager4.RhyOnboarding) {
            CashManagementAccessManager4.RhyOnboarding rhyOnboarding = (CashManagementAccessManager4.RhyOnboarding) accessState;
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.RhyOnboardingIntro(rhyOnboarding.getContent(), rhyOnboarding.getHasClosedCashManagementBanner()), null, 2, null);
        } else {
            if (!(accessState instanceof CashManagementAccessManager4.CreditCardWaitlist)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new CreditCardWaitlistFragmentKey(true, getSource(), ((SpendingTab) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs()), null, 2, null);
        }
        if (fragmentCreateFragment$default != null) {
            setRootFragmentIfDifferent(fragmentCreateFragment$default);
            notifyFragmentChanged();
            handleDeeplink();
            setupDeepLinkListeners();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        this.showRootFragmentRelay.accept(Unit.INSTANCE);
    }

    private final void setupDeepLinkListeners() {
        bind(getShowCardActionsFromLink(), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.ui.SpendingTabFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpendingTabFragment.setupDeepLinkListeners$lambda$4(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupDeepLinkListeners$lambda$4(SpendingTabFragment spendingTabFragment, Unit unit) {
        spendingTabFragment.popEntireFragmentBackstack(true);
        BuildersKt__Builders_commonKt.launch$default(spendingTabFragment.getLifecycleScope(), null, null, new SpendingTabFragment3(null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("source", getSource());
    }

    @Override // com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract.Callbacks
    public void onWaitlistJoined() {
        popEntireFragmentBackstack(true);
        replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), RhyWaitlistSignUpConfirmationContract.Key.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.android.rhy.contracts.RhyWaitlistSignUpConfirmationContract.Callbacks
    public void onWaitlistDone() {
        popEntireFragmentBackstack(true);
        replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.RhyWaitlistComingSoon.INSTANCE, null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == -1) {
            getCashManagementAccessManager().refresh(true);
            setRootFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(ShimmerLoaderType.Boxes.INSTANCE, null, 2, null)));
            showRootFragment();
        }
    }

    /* compiled from: SpendingTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment;", "Lcom/robinhood/android/cash/contracts/SpendingTab;", "<init>", "()V", "SAVE_SOURCE", "", "REQUEST_CODE_ONBOARDING", "", "feature-tab-spending_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SpendingTabFragment, SpendingTab> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SpendingTab spendingTab) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, spendingTab);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SpendingTab getArgs(SpendingTabFragment spendingTabFragment) {
            return (SpendingTab) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, spendingTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SpendingTabFragment newInstance(SpendingTab spendingTab) {
            return (SpendingTabFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, spendingTab);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SpendingTabFragment spendingTabFragment, SpendingTab spendingTab) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, spendingTabFragment, spendingTab);
        }
    }
}
