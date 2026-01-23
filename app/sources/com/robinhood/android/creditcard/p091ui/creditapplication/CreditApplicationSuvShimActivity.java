package com.robinhood.android.creditcard.p091ui.creditapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.WindowCompat;
import androidx.view.ComponentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.creditcard.contracts.CreditCardApplicationKey;
import com.robinhood.android.creditcard.contracts.CreditCardApplicationSuvKey;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.models.stepupverification.api.ApiVerificationWorkflowPrecheck;
import com.robinhood.android.navigation.IntentResolverCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.api.stepupverification.StepUpVerificationApi;
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

/* compiled from: CreditApplicationSuvShimActivity.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\t\u0010\u001f\u001a\u00020\u0015H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationSuvShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "getSuvWorkflowManager", "()Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "setSuvWorkflowManager", "(Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "getStepUpVerificationApi", "()Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "setStepUpVerificationApi", "(Lcom/robinhood/api/stepupverification/StepUpVerificationApi;)V", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "startSuvPrecheck", "startCreditApplication", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditApplicationSuvShimActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;
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

    public CreditApplicationSuvShimActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher((ComponentActivity) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreditApplicationSuvShimActivity.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreditApplicationSuvShimActivity.launchSuv$lambda$2(this.f$0);
            }
        });
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
    public static final Unit launchSuv$lambda$1(CreditApplicationSuvShimActivity creditApplicationSuvShimActivity) {
        creditApplicationSuvShimActivity.startCreditApplication();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(CreditApplicationSuvShimActivity creditApplicationSuvShimActivity) {
        creditApplicationSuvShimActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, LoadingFragment.INSTANCE.newInstance());
            startSuvPrecheck();
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    /* compiled from: CreditApplicationSuvShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$startSuvPrecheck$1", m3645f = "CreditApplicationSuvShimActivity.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$startSuvPrecheck$1 */
    static final class C122411 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C122411(Continuation<? super C122411> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CreditApplicationSuvShimActivity.this.new C122411(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C122411) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StepUpVerificationApi stepUpVerificationApi = CreditApplicationSuvShimActivity.this.getStepUpVerificationApi();
                ApiVerificationWorkflowPrecheck apiVerificationWorkflowPrecheck = new ApiVerificationWorkflowPrecheck(ApiVerificationWorkflowPrecheck.WorkflowType.RCT_ONBOARDING);
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
        getSuvWorkflowManager().handleRequest(new C122411(null), new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditApplicationSuvShimActivity.startSuvPrecheck$lambda$3(this.f$0, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditApplicationSuvShimActivity.startSuvPrecheck$lambda$4(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationSuvShimActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreditApplicationSuvShimActivity.startSuvPrecheck$lambda$5(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$3(CreditApplicationSuvShimActivity creditApplicationSuvShimActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        creditApplicationSuvShimActivity.startCreditApplication();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$4(CreditApplicationSuvShimActivity creditApplicationSuvShimActivity, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, creditApplicationSuvShimActivity, it, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSuvPrecheck$lambda$5(CreditApplicationSuvShimActivity creditApplicationSuvShimActivity, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        creditApplicationSuvShimActivity.getLifecycleScope().launchWhenCreated(new CreditApplicationSuvShimActivity2(creditApplicationSuvShimActivity, workflowId, z, null));
        return Unit.INSTANCE;
    }

    private final void startCreditApplication() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new CreditCardApplicationKey(), null, false, null, null, 60, null);
        finish();
    }

    /* compiled from: CreditApplicationSuvShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationSuvShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationSuvShimActivity;", "Lcom/robinhood/android/creditcard/contracts/CreditCardApplicationSuvKey;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverCompanion<CreditApplicationSuvShimActivity, CreditCardApplicationSuvKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolverCompanion, com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreditCardApplicationSuvKey creditCardApplicationSuvKey) {
            return IntentResolverCompanion.DefaultImpls.getIntent(this, context, creditCardApplicationSuvKey);
        }
    }
}
