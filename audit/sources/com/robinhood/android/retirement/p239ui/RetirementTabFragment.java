package com.robinhood.android.retirement.p239ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementDashboardState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.RetirementDashboardAccessManager;
import com.robinhood.android.retirement.RetirementDashboardAccessManager2;
import com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignupFragmentKey;
import com.robinhood.android.retirement.contracts.RetirementTabFragmentKey;
import com.robinhood.android.retirement.p239ui.error.RetirementDashboardErrorFragment;
import com.robinhood.android.retirement.p239ui.error.RetirementDashboardErrorReason;
import com.robinhood.android.retirement.p239ui.funded.RetirementDashboardFundedFragment;
import com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpFragment;
import com.robinhood.android.retirement.p239ui.unfunded.RetirementDashboardUnfundedFragment;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RetirementTabFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001TB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020\nH\u0014J\b\u0010D\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020\nH\u0016J\u0010\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020.H\u0016J\u0012\u0010H\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010J\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020'H\u0002J\t\u0010N\u001a\u00020\u001fH\u0096\u0001R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001e\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u001e\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b0\u00101\"\u0004\b2\u00103R/\u00105\u001a\u0004\u0018\u00010.2\b\u0010\u001e\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0014\u00109\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorFragment$Callbacks;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Callbacks;", "Lcom/robinhood/android/retirement/RetirementTabFragmentDeepLinkProps;", "<init>", "()V", "showRootFragmentRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "retirementDashboardAccessManager", "Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;", "getRetirementDashboardAccessManager", "()Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;", "setRetirementDashboardAccessManager", "(Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;)V", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "getRetirementAccountSwitcherStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "setRetirementAccountSwitcherStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "<set-?>", "", "accessStateLoaded", "getAccessStateLoaded", "()Z", "setAccessStateLoaded", "(Z)V", "accessStateLoaded$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "pendingAccessState", "getPendingAccessState", "()Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "setPendingAccessState", "(Lcom/robinhood/android/retirement/RetirementDashboardAccessState;)V", "pendingAccessState$delegate", "", "pendingAccountNumber", "getPendingAccountNumber", "()Ljava/lang/String;", "setPendingAccountNumber", "(Ljava/lang/String;)V", "pendingAccountNumber$delegate", "pendingFirstSwipey", "getPendingFirstSwipey", "setPendingFirstSwipey", "pendingFirstSwipey$delegate", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "showRootFragment", "onRetryLoadDashboardState", "onSignUpLoadError", "setAccountNumber", "accountNumber", "setEntryPoint", "entryPoint", "setFirstSwipey", "firstSwipey", "setFragmentForAccessState", "state", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementTabFragment extends BaseTabFragment implements RegionGated, RetirementDashboardErrorFragment.Callbacks, RetirementSignUpFragment.Callbacks, RetirementTabFragmentDeepLinkProps {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accessStateLoaded$delegate, reason: from kotlin metadata */
    private final Interfaces3 accessStateLoaded;

    /* renamed from: pendingAccessState$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingAccessState;

    /* renamed from: pendingAccountNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingAccountNumber;

    /* renamed from: pendingFirstSwipey$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingFirstSwipey;
    public RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    public RetirementDashboardAccessManager retirementDashboardAccessManager;
    private final PublishRelay<Unit> showRootFragmentRelay;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RetirementTabFragment.class, "accessStateLoaded", "getAccessStateLoaded()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RetirementTabFragment.class, "pendingAccessState", "getPendingAccessState()Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RetirementTabFragment.class, "pendingAccountNumber", "getPendingAccountNumber()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RetirementTabFragment.class, "pendingFirstSwipey", "getPendingFirstSwipey()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RetirementTabFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRetirementDashboardState.State.values().length];
            try {
                iArr[ApiRetirementDashboardState.State.SIGNUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.SIGNUP_SCROLLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.SIGNUP_SCROLLING_ACHROMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.UNFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.FUNDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.WAITLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiRetirementDashboardState.State.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
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

    public RetirementTabFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.showRootFragmentRelay = publishRelayCreate;
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.accessStateLoaded = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[0]);
        this.pendingAccessState = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[1]);
        this.pendingAccountNumber = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[2]);
        this.pendingFirstSwipey = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[3]);
        this.useDesignSystemToolbar = true;
    }

    public final RetirementDashboardAccessManager getRetirementDashboardAccessManager() {
        RetirementDashboardAccessManager retirementDashboardAccessManager = this.retirementDashboardAccessManager;
        if (retirementDashboardAccessManager != null) {
            return retirementDashboardAccessManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirementDashboardAccessManager");
        return null;
    }

    public final void setRetirementDashboardAccessManager(RetirementDashboardAccessManager retirementDashboardAccessManager) {
        Intrinsics.checkNotNullParameter(retirementDashboardAccessManager, "<set-?>");
        this.retirementDashboardAccessManager = retirementDashboardAccessManager;
    }

    public final RetirementAccountSwitcherStore getRetirementAccountSwitcherStore() {
        RetirementAccountSwitcherStore retirementAccountSwitcherStore = this.retirementAccountSwitcherStore;
        if (retirementAccountSwitcherStore != null) {
            return retirementAccountSwitcherStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirementAccountSwitcherStore");
        return null;
    }

    public final void setRetirementAccountSwitcherStore(RetirementAccountSwitcherStore retirementAccountSwitcherStore) {
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "<set-?>");
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final boolean getAccessStateLoaded() {
        return ((Boolean) this.accessStateLoaded.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setAccessStateLoaded(boolean z) {
        this.accessStateLoaded.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final RetirementDashboardAccessManager2 getPendingAccessState() {
        return (RetirementDashboardAccessManager2) this.pendingAccessState.getValue(this, $$delegatedProperties[1]);
    }

    private final void setPendingAccessState(RetirementDashboardAccessManager2 retirementDashboardAccessManager2) {
        this.pendingAccessState.setValue(this, $$delegatedProperties[1], retirementDashboardAccessManager2);
    }

    private final String getPendingAccountNumber() {
        return (String) this.pendingAccountNumber.getValue(this, $$delegatedProperties[2]);
    }

    private final void setPendingAccountNumber(String str) {
        this.pendingAccountNumber.setValue(this, $$delegatedProperties[2], str);
    }

    private final String getPendingFirstSwipey() {
        return (String) this.pendingFirstSwipey.getValue(this, $$delegatedProperties[3]);
    }

    private final void setPendingFirstSwipey(String str) {
        this.pendingFirstSwipey.setValue(this, $$delegatedProperties[3], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        String accountNumber = ((RetirementTabFragmentKey) companion.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber != null) {
            setAccountNumber(accountNumber);
        }
        String entryPoint = ((RetirementTabFragmentKey) companion.getArgs((Fragment) this)).getEntryPoint();
        if (entryPoint != null) {
            setEntryPoint(entryPoint);
        }
        Observable<R> observableSwitchMap = this.showRootFragmentRelay.switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.RetirementTabFragment.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RetirementDashboardAccessManager2> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RetirementTabFragment.this.getRetirementDashboardAccessManager().streamRetirementDashboardAccessState().distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.RetirementTabFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementTabFragment.onCreate$lambda$3(this.f$0, (RetirementDashboardAccessManager2) obj);
            }
        });
        if (savedInstanceState == null) {
            setRootFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Hero(true, false, null, 6, null), ShimmerLoadingFragment.Args.NavButtonType.NONE)));
        }
        showRootFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RetirementTabFragment retirementTabFragment, RetirementDashboardAccessManager2 retirementDashboardAccessManager2) {
        if (retirementTabFragment.getChildFragmentManager().isStateSaved()) {
            retirementTabFragment.setPendingAccessState(retirementDashboardAccessManager2);
        } else {
            Intrinsics.checkNotNull(retirementDashboardAccessManager2);
            retirementTabFragment.setFragmentForAccessState(retirementDashboardAccessManager2);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RetirementDashboardAccessManager2 pendingAccessState = getPendingAccessState();
        if (pendingAccessState != null) {
            setPendingAccessState(null);
            setFragmentForAccessState(pendingAccessState);
        }
        String pendingAccountNumber = getPendingAccountNumber();
        if (pendingAccountNumber != null) {
            setPendingAccountNumber(null);
            getRetirementAccountSwitcherStore().setActiveRetirementAccountNumber(pendingAccountNumber);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getRootFragment() != null && getAccessStateLoaded()) {
            handleDeeplink();
        }
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.FIVE_SEC_RETIREMENT_TAB);
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        this.showRootFragmentRelay.accept(Unit.INSTANCE);
    }

    @Override // com.robinhood.android.retirement.ui.error.RetirementDashboardErrorFragment.Callbacks
    public void onRetryLoadDashboardState() {
        setRootFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Hero(true, false, null, 6, null), null, 2, null)));
        showRootFragment();
    }

    @Override // com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.Callbacks
    public void onSignUpLoadError() {
        popNearestParentBackStack();
        setRootFragment(RetirementSignUpFragment.INSTANCE.newInstance((Parcelable) new RetirementSignupFragmentKey(getPendingFirstSwipey())));
        showRootFragment();
    }

    @Override // com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps
    public void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (this.retirementAccountSwitcherStore != null) {
            getRetirementAccountSwitcherStore().setActiveRetirementAccountNumber(accountNumber);
        } else {
            setPendingAccountNumber(accountNumber);
        }
    }

    @Override // com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps
    public void setEntryPoint(String entryPoint) {
        if (entryPoint != null) {
            RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(entryPoint);
        }
    }

    @Override // com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps
    public void setFirstSwipey(String firstSwipey) {
        setPendingFirstSwipey(firstSwipey);
    }

    private final void setFragmentForAccessState(RetirementDashboardAccessManager2 state) {
        Fragment fragmentNewInstance;
        if (Intrinsics.areEqual(state, RetirementDashboardAccessManager2.UnableToLoad.INSTANCE)) {
            fragmentNewInstance = RetirementDashboardErrorFragment.INSTANCE.newInstance((Parcelable) RetirementDashboardErrorReason.FailedToLoad);
        } else {
            if (!(state instanceof RetirementDashboardAccessManager2.HasAccess)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[((RetirementDashboardAccessManager2.HasAccess) state).getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    fragmentNewInstance = RetirementSignUpFragment.INSTANCE.newInstance((Parcelable) new RetirementSignupFragmentKey(getPendingFirstSwipey()));
                    break;
                case 4:
                    RetirementDashboardUnfundedFragment.Companion companion = RetirementDashboardUnfundedFragment.INSTANCE;
                    Companion companion2 = INSTANCE;
                    fragmentNewInstance = companion.newInstance((Parcelable) new RetirementDashboardUnfundedFragment.Args(((RetirementTabFragmentKey) companion2.getArgs((Fragment) this)).getAccountSelectorTabArgs(), ((RetirementTabFragmentKey) companion2.getArgs((Fragment) this)).getAccountNumber()));
                    break;
                case 5:
                    RetirementDashboardFundedFragment.Companion companion3 = RetirementDashboardFundedFragment.INSTANCE;
                    Companion companion4 = INSTANCE;
                    fragmentNewInstance = companion3.newInstance((Parcelable) new RetirementDashboardFundedFragment.Args(((RetirementTabFragmentKey) companion4.getArgs((Fragment) this)).getAccountSelectorTabArgs(), ((RetirementTabFragmentKey) companion4.getArgs((Fragment) this)).getAccountNumber()));
                    break;
                case 6:
                case 7:
                    fragmentNewInstance = RetirementDashboardErrorFragment.INSTANCE.newInstance((Parcelable) RetirementDashboardErrorReason.UpdateApp);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        setRootFragmentIfDifferent(fragmentNewInstance);
        notifyFragmentChanged();
        handleDeeplink();
        setAccessStateLoaded(true);
    }

    /* compiled from: RetirementTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/RetirementTabFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementTabFragmentKey;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RetirementTabFragment, RetirementTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RetirementTabFragmentKey retirementTabFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, retirementTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementTabFragmentKey getArgs(RetirementTabFragment retirementTabFragment) {
            return (RetirementTabFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, retirementTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementTabFragment newInstance(RetirementTabFragmentKey retirementTabFragmentKey) {
            return (RetirementTabFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementTabFragment retirementTabFragment, RetirementTabFragmentKey retirementTabFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, retirementTabFragment, retirementTabFragmentKey);
        }
    }
}
