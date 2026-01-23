package com.robinhood.android.jointaccounts.onboarding.shim;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountsShim;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimEvent;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: JointAccountsShimActivity.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "handleEvent", "event", "Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountsShimActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

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

    public JointAccountsShimActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.$$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, JointAccountsShimDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JointAccountsShimDuxo getDuxo() {
        return (JointAccountsShimDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C201721(null), 1, null);
    }

    /* compiled from: JointAccountsShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimActivity$onCreate$1", m3645f = "JointAccountsShimActivity.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimActivity$onCreate$1 */
    static final class C201721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201721(Continuation<? super C201721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountsShimActivity.this.new C201721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(JointAccountsShimActivity.this.getDuxo().getEventFlow());
                final JointAccountsShimActivity jointAccountsShimActivity = JointAccountsShimActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<JointAccountsShimEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<JointAccountsShimEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<JointAccountsShimEvent> eventConsumerInvoke;
                        final JointAccountsShimActivity jointAccountsShimActivity2 = jointAccountsShimActivity;
                        if ((event.getData() instanceof JointAccountsShimEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m15791invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15791invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    jointAccountsShimActivity2.handleEvent((JointAccountsShimEvent) event.getData());
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

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(JointAccountsShimEvent event) throws Throwable {
        TabLinkIntentKey.Home.Dashboard dashboard;
        if (event instanceof JointAccountsShimEvent.Dashboard) {
            JointAccountsShimEvent.Dashboard dashboard2 = (JointAccountsShimEvent.Dashboard) event;
            if (dashboard2 instanceof JointAccountsShimEvent.Dashboard.AccountNumber) {
                dashboard = new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.Account(((JointAccountsShimEvent.Dashboard.AccountNumber) event).getAccountNumber()));
            } else {
                if (!(dashboard2 instanceof JointAccountsShimEvent.Dashboard.ApplicationId)) {
                    throw new NoWhenBranchMatchedException();
                }
                dashboard = new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.PendingApplication(((JointAccountsShimEvent.Dashboard.ApplicationId) event).getApplicationId(), BrokerageAccountType.JOINT_TENANCY_WITH_ROS));
            }
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, dashboard, null, false, 12, null);
            intentCreateIntent$default.addFlags(131072);
            startActivity(intentCreateIntent$default);
            finish();
            return;
        }
        if (event instanceof JointAccountsShimEvent.SignUp) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new JointAccountOnboardingPrimaryIntro(((JointAccountsShim) INSTANCE.getExtras((Activity) this)).getSource(), null, 2, null), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
            finish();
        } else {
            if (!(event instanceof JointAccountsShimEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, ((JointAccountsShimEvent.Error) event).getThrowable(), true, false, 0, null, 56, null);
        }
    }

    /* compiled from: JointAccountsShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimActivity;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountsShim;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<JointAccountsShimActivity, JointAccountsShim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public JointAccountsShim getExtras(JointAccountsShimActivity jointAccountsShimActivity) {
            return (JointAccountsShim) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, jointAccountsShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, JointAccountsShim jointAccountsShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, jointAccountsShim);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, JointAccountsShim jointAccountsShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, jointAccountsShim);
        }
    }
}
