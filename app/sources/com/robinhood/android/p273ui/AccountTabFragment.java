package com.robinhood.android.p273ui;

import android.os.Bundle;
import com.robinhood.android.banking.microgram.Applications;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.transfers.contracts.InvestmentsTrackerKey;
import com.robinhood.android.transfers.contracts.experiments.InvestmentsTrackerExperiment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.PackagePreloader;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: AccountTabFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/ui/AccountTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "getPackagePreloader", "()Lmicrogram/android/PackagePreloader;", "setPackagePreloader", "(Lmicrogram/android/PackagePreloader;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showRootFragment", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AccountTabFragment extends BaseTabFragment {
    public ExperimentsStore experimentsStore;
    public PackagePreloader packagePreloader;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountTabFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final PackagePreloader getPackagePreloader() {
        PackagePreloader packagePreloader = this.packagePreloader;
        if (packagePreloader != null) {
            return packagePreloader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("packagePreloader");
        return null;
    }

    public final void setPackagePreloader(PackagePreloader packagePreloader) {
        Intrinsics.checkNotNullParameter(packagePreloader, "<set-?>");
        this.packagePreloader = packagePreloader;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C312621(null), 3, null);
        if (savedInstanceState == null) {
            showRootFragment();
        }
    }

    /* compiled from: AccountTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.AccountTabFragment$onCreate$1", m3645f = "AccountTabFragment.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.AccountTabFragment$onCreate$1 */
    static final class C312621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C312621(Continuation<? super C312621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountTabFragment.this.new C312621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PackagePreloader packagePreloader = AccountTabFragment.this.getPackagePreloader();
                RemoteMicrogramApplication transferHubRedesignApplication = Applications.getTransferHubRedesignApplication();
                this.label = 1;
                if (packagePreloader.mo28945preloadgIAlus(transferHubRedesignApplication, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getRootFragment() != null) {
            handleDeeplink();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        final IdlingResourceType idlingResourceType = IdlingResourceType.ACCOUNT_TAB_FRAGMENT_EXPERIMENT;
        IdlingResourceCounters2.setBusy(idlingResourceType, true);
        Single singleFirstOrError = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{InvestmentsTrackerExperiment.INSTANCE}, false, null, 6, null).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.AccountTabFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabFragment.showRootFragment$lambda$0(this.f$0, idlingResourceType, (Boolean) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRootFragment$lambda$0(AccountTabFragment accountTabFragment, IdlingResourceType idlingResourceType, Boolean bool) {
        FragmentKey investmentsTrackerKey;
        if (bool.booleanValue()) {
            investmentsTrackerKey = new InvestmentsTrackerKey();
        } else {
            investmentsTrackerKey = LegacyFragmentKey.AccountCenter.INSTANCE;
        }
        accountTabFragment.setRootFragment(Navigator.DefaultImpls.createFragment$default(accountTabFragment.getNavigator(), investmentsTrackerKey, null, 2, null));
        accountTabFragment.notifyFragmentChanged();
        accountTabFragment.handleDeeplink();
        IdlingResourceCounters2.setBusy(idlingResourceType, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AccountTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ui/AccountTabFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/ui/AccountTabFragment;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AccountTabFragment newInstance() {
            return new AccountTabFragment();
        }
    }
}
