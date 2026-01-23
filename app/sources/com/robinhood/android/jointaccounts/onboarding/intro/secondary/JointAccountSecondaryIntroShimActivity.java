package com.robinhood.android.jointaccounts.onboarding.intro.secondary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryIntroShim;
import com.robinhood.android.account.contracts.jointaccounts.LoggedInJointAccountOnboardingSecondaryIntro;
import com.robinhood.android.account.contracts.jointaccounts.UnauthenticatedJointAccountOnboardingSecondaryIntro;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.SecondaryIntroShimEvent;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
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

/* compiled from: JointAccountSecondaryIntroShimActivity.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\t\u0010\u0014\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroShimDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroShimDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "consumeDuxoEvent", "event", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountSecondaryIntroShimActivity extends BaseActivity implements RegionGated {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public JointAccountSecondaryIntroShimActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.$$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, JointAccountSecondaryIntroShimDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JointAccountSecondaryIntroShimDuxo getDuxo() {
        return (JointAccountSecondaryIntroShimDuxo) this.duxo.getValue();
    }

    /* compiled from: JointAccountSecondaryIntroShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroShimActivity$onCreate$1", m3645f = "JointAccountSecondaryIntroShimActivity.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroShimActivity$onCreate$1 */
    static final class C200941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200941(Continuation<? super C200941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSecondaryIntroShimActivity.this.new C200941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(JointAccountSecondaryIntroShimActivity.this.getDuxo().getEventFlow());
                final JointAccountSecondaryIntroShimActivity jointAccountSecondaryIntroShimActivity = JointAccountSecondaryIntroShimActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroShimActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SecondaryIntroShimEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<SecondaryIntroShimEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<SecondaryIntroShimEvent> eventConsumerInvoke;
                        final JointAccountSecondaryIntroShimActivity jointAccountSecondaryIntroShimActivity2 = jointAccountSecondaryIntroShimActivity;
                        if ((event.getData() instanceof SecondaryIntroShimEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroShimActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m15780invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15780invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    jointAccountSecondaryIntroShimActivity2.consumeDuxoEvent((SecondaryIntroShimEvent) event.getData());
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C200941(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeDuxoEvent(SecondaryIntroShimEvent event) {
        if (event instanceof SecondaryIntroShimEvent.LoggedIn) {
            startActivities(new Intent[]{Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, true, 4, null), Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new LoggedInJointAccountOnboardingSecondaryIntro(((SecondaryIntroShimEvent.LoggedIn) event).getInvitationId()), false, false, false, null, false, true, false, false, false, null, false, 8052, null)});
        } else if (event instanceof SecondaryIntroShimEvent.Signup) {
            startActivities(new Intent[]{Navigator.DefaultImpls.createIntent$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, true, 4, null), Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new UnauthenticatedJointAccountOnboardingSecondaryIntro(((SecondaryIntroShimEvent.Signup) event).getInvitationId()), false, false, false, null, false, true, false, false, false, null, false, 7028, null)});
        } else {
            if (!(event instanceof SecondaryIntroShimEvent.Ineligible)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, null, null, 60, null);
        }
        finish();
    }

    /* compiled from: JointAccountSecondaryIntroShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroShimActivity;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingSecondaryIntroShim;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<JointAccountSecondaryIntroShimActivity, JointAccountOnboardingSecondaryIntroShim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public JointAccountOnboardingSecondaryIntroShim getExtras(JointAccountSecondaryIntroShimActivity jointAccountSecondaryIntroShimActivity) {
            return (JointAccountOnboardingSecondaryIntroShim) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, jointAccountSecondaryIntroShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, JointAccountOnboardingSecondaryIntroShim jointAccountOnboardingSecondaryIntroShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, jointAccountOnboardingSecondaryIntroShim);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, JointAccountOnboardingSecondaryIntroShim jointAccountOnboardingSecondaryIntroShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, jointAccountOnboardingSecondaryIntroShim);
        }
    }
}
