package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.ComponentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.models.stepupverification.api.ApiVerificationWorkflowPrecheck;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.api.stepupverification.StepUpVerificationApi;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyUpgradeSuvShimActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\t\u0010%\u001a\u00020\u001bH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "getSuvWorkflowManager", "()Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "setSuvWorkflowManager", "(Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "getStepUpVerificationApi", "()Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "setStepUpVerificationApi", "(Lcom/robinhood/api/stepupverification/StepUpVerificationApi;)V", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "startSuvPrecheck", "startRhyUpgradeActivity", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyUpgradeSuvShimActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public ExperimentsStore experimentsStore;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public StepUpVerificationApi stepUpVerificationApi;
    public SuvWorkflowManager suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyUpgradeSuvShimActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher((ComponentActivity) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyUpgradeSuvShimActivity.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyUpgradeSuvShimActivity.launchSuv$lambda$2(this.f$0);
            }
        });
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

    public final SuvWorkflowManager getSuvWorkflowManager() {
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager;
        if (suvWorkflowManager != null) {
            return suvWorkflowManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suvWorkflowManager");
        return null;
    }

    public final void setSuvWorkflowManager(SuvWorkflowManager suvWorkflowManager) {
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "<set-?>");
        this.suvWorkflowManager = suvWorkflowManager;
    }

    public final StepUpVerificationApi getStepUpVerificationApi() {
        StepUpVerificationApi stepUpVerificationApi = this.stepUpVerificationApi;
        if (stepUpVerificationApi != null) {
            return stepUpVerificationApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stepUpVerificationApi");
        return null;
    }

    public final void setStepUpVerificationApi(StepUpVerificationApi stepUpVerificationApi) {
        Intrinsics.checkNotNullParameter(stepUpVerificationApi, "<set-?>");
        this.stepUpVerificationApi = stepUpVerificationApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity) {
        rhyUpgradeSuvShimActivity.startRhyUpgradeActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity) {
        rhyUpgradeSuvShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Hero(true, false, null, 6, null), null, 2, 0 == true ? 1 : 0)));
            LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{RhySuvKillswitchExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyUpgradeSuvShimActivity.onCreate$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, boolean z) {
        if (z) {
            rhyUpgradeSuvShimActivity.startRhyUpgradeActivity();
        } else {
            rhyUpgradeSuvShimActivity.startSuvPrecheck();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    /* compiled from: RhyUpgradeSuvShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$startSuvPrecheck$1", m3645f = "RhyUpgradeSuvShimActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$startSuvPrecheck$1 */
    static final class C103131 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C103131(Continuation<? super C103131> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RhyUpgradeSuvShimActivity.this.new C103131(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C103131) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StepUpVerificationApi stepUpVerificationApi = RhyUpgradeSuvShimActivity.this.getStepUpVerificationApi();
                ApiVerificationWorkflowPrecheck apiVerificationWorkflowPrecheck = new ApiVerificationWorkflowPrecheck(ApiVerificationWorkflowPrecheck.WorkflowType.RHY_ONBOARDING);
                this.label = 1;
                if (stepUpVerificationApi.verificationWorkflowPrecheck(apiVerificationWorkflowPrecheck, this) == coroutine_suspended) {
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

    private final void startSuvPrecheck() {
        getSuvWorkflowManager().handleRequest(new C103131(null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyUpgradeSuvShimActivity.startSuvPrecheck$lambda$4(this.f$0, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyUpgradeSuvShimActivity.startSuvPrecheck$lambda$5(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyUpgradeSuvShimActivity.startSuvPrecheck$lambda$6(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$4(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyUpgradeSuvShimActivity.startRhyUpgradeActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$5(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, rhyUpgradeSuvShimActivity, it, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$6(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        rhyUpgradeSuvShimActivity.getLifecycleScope().launchWhenCreated(new RhyUpgradeSuvShimActivity2(rhyUpgradeSuvShimActivity, workflowId, z, null));
        return Unit.INSTANCE;
    }

    private final void startRhyUpgradeActivity() {
        startActivity(OdysseyRhyUpgradeActivity.INSTANCE.getIntentWithExtras(this, INSTANCE.getExtras((Activity) this)));
        overridePendingTransition(0, 0);
        finish();
    }

    /* compiled from: RhyUpgradeSuvShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity;", "Lcom/robinhood/android/rhyonboarding/contracts/RhyUpgradeKey;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RhyUpgradeSuvShimActivity, RhyUpgradeKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RhyUpgradeKey getExtras(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity) {
            return (RhyUpgradeKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rhyUpgradeSuvShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RhyUpgradeKey rhyUpgradeKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rhyUpgradeKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RhyUpgradeKey rhyUpgradeKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rhyUpgradeKey);
        }
    }
}
