package com.robinhood.trader.singpass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SingpassRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey2;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey3;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.trader.i18n.contracts.SingpassWebviewIntentKey;
import com.robinhood.trader.singpass.SingpassWebviewDuxo2;
import java.util.Set;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SingpassWebviewActivity.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010(\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/trader/singpass/SingpassWebviewActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "duxo", "Lcom/robinhood/trader/singpass/SingpassWebviewDuxo;", "getDuxo", "()Lcom/robinhood/trader/singpass/SingpassWebviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/trader/singpass/SingpassWebviewEvent;", "resumeOdyssey", "webviewLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "launchSingpass", "showErrorDialog", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-singpass_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SingpassWebviewActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public TargetBackend targetBackend;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RhWebIntentKey>> webviewLauncher;

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

    public SingpassWebviewActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SingpassRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, SingpassWebviewDuxo.class);
        this.webviewLauncher = registerForActivityResult(new RhWebIntentKey2(new Function0() { // from class: com.robinhood.trader.singpass.SingpassWebviewActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.trader.singpass.SingpassWebviewActivity$webviewLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(RhWebIntentKey3 rhWebIntentKey3) {
                if (rhWebIntentKey3 instanceof RhWebIntentKey3.Continue) {
                    this.this$0.setFragment(C11048R.id.fragment_container, SingpassRetrievingFragment.Companion.newInstance());
                    this.this$0.getDuxo().pollSingpassResult();
                } else {
                    this.this$0.finish();
                }
            }
        });
    }

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingpassWebviewDuxo getDuxo() {
        return (SingpassWebviewDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        initEdgeToEdge(false);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, SingpassLoadingFragment.INSTANCE.newInstance());
            getDuxo().checkInitialSingpassResult();
        }
        BaseActivity.collectDuxoState$default(this, null, new C417571(null), 1, null);
    }

    /* compiled from: SingpassWebviewActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.singpass.SingpassWebviewActivity$onCreate$1", m3645f = "SingpassWebviewActivity.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.singpass.SingpassWebviewActivity$onCreate$1 */
    static final class C417571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C417571(Continuation<? super C417571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingpassWebviewActivity.this.new C417571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C417571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<SingpassWebviewDuxo2>> eventFlow = SingpassWebviewActivity.this.getDuxo().getEventFlow();
                final SingpassWebviewActivity singpassWebviewActivity = SingpassWebviewActivity.this;
                FlowCollector<? super Event<SingpassWebviewDuxo2>> flowCollector = new FlowCollector() { // from class: com.robinhood.trader.singpass.SingpassWebviewActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SingpassWebviewDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<SingpassWebviewDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<SingpassWebviewDuxo2> eventConsumerInvoke;
                        if (event != null) {
                            final SingpassWebviewActivity singpassWebviewActivity2 = singpassWebviewActivity;
                            if ((event.getData() instanceof SingpassWebviewDuxo2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.trader.singpass.SingpassWebviewActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m26544invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m26544invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        singpassWebviewActivity2.handleEvent((SingpassWebviewDuxo2) event.getData());
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
    public final void handleEvent(SingpassWebviewDuxo2 event) {
        if (event instanceof SingpassWebviewDuxo2.ResumeOdyssey) {
            resumeOdyssey();
        } else if (event instanceof SingpassWebviewDuxo2.LaunchSingpass) {
            launchSingpass();
        } else {
            if (!(event instanceof SingpassWebviewDuxo2.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            showErrorDialog();
        }
    }

    private final void resumeOdyssey() {
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        Navigator.DefaultImpls.startActivity$default(navigator, this, new GenericSdFlowIntentKey(((SingpassWebviewIntentKey) companion.getExtras((Activity) this)).getEndpoint(), false, null, null, null, null, false, ((SingpassWebviewIntentKey) companion.getExtras((Activity) this)).getCompletionCheckpoint(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, null), null, false, null, null, 60, null);
        finish();
    }

    private final void launchSingpass() {
        NavigationActivityResultContract3.launch$default(this.webviewLauncher, SingpassIntentKeyGenerator.generateSingpassRhWebIntentKey(getTargetBackend()), null, false, 6, null);
    }

    private final void showErrorDialog() {
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setId(C41751R.id.dialog_id_singpass_upstream_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.general_error_summary, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "singpassUpstreamError", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C41751R.id.dialog_id_singpass_upstream_error) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: SingpassWebviewActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/trader/singpass/SingpassWebviewActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/trader/singpass/SingpassWebviewActivity;", "Lcom/robinhood/trader/i18n/contracts/SingpassWebviewIntentKey;", "<init>", "()V", "feature-singpass_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SingpassWebviewActivity, SingpassWebviewIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public SingpassWebviewIntentKey getExtras(SingpassWebviewActivity singpassWebviewActivity) {
            return (SingpassWebviewIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, singpassWebviewActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, SingpassWebviewIntentKey singpassWebviewIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, singpassWebviewIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, SingpassWebviewIntentKey singpassWebviewIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, singpassWebviewIntentKey);
        }
    }
}
