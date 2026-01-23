package com.robinhood.shared.crypto.transfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment;
import com.robinhood.shared.crypto.transfer.CryptoTransferEvent;
import com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment;
import com.robinhood.shared.crypto.transfer.util.Sources;
import com.robinhood.utils.extensions.ViewsKt;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0014H\u0016J\u0012\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u0014H\u0002J\t\u00103\u001a\u00020(H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "duxo", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferDuxo;", "getDuxo", "()Lcom/robinhood/shared/crypto/transfer/CryptoTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleEvent", "event", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "handleNavigateUiEvent", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "navigateToSend", "navigateToReceive", "navigateToEnrollment", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "setOrReplaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "exitTransfers", "exitDeeplink", "", "revertFullscreenFlags", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferActivity extends BaseActivity implements EnrollmentParentV2Fragment.Callbacks, CryptoTransferUnifiedParentFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ScreenProtectManager screenProtectManager;

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

    public CryptoTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoTransferDuxo.class);
    }

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoTransferDuxo getDuxo() {
        return (CryptoTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C379251(null), 1, null);
    }

    /* compiled from: CryptoTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.CryptoTransferActivity$onCreate$1", m3645f = "CryptoTransferActivity.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferActivity$onCreate$1 */
    static final class C379251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C379251(Continuation<? super C379251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferActivity.this.new C379251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTransferActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.CryptoTransferActivity$onCreate$1$1", m3645f = "CryptoTransferActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<CryptoTransferEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTransferActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferActivity cryptoTransferActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<CryptoTransferEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final CryptoTransferActivity cryptoTransferActivity = this.this$0;
                    if ((event.getData() instanceof CryptoTransferEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.transfer.CryptoTransferActivity$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                m24991invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m24991invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                cryptoTransferActivity.handleEvent((CryptoTransferEvent) event.getData());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<CryptoTransferEvent>> eventFlow = CryptoTransferActivity.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTransferActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.CRYPTO_TRANSFER);
        screenProtectManager.setFlagSecure(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        toolbar.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(CryptoTransferEvent event) throws Throwable {
        if (event instanceof CryptoTransferEvent.Error) {
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, ((CryptoTransferEvent.Error) event).getError(), true, false, C37934R.id.dialog_id_generic, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 8, null);
        } else if (event instanceof CryptoTransferEvent.Upsell) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((CryptoTransferEvent.Upsell) event).getDeeplink()), null, null, false, null, 60, null);
        } else {
            if (!(event instanceof CryptoTransferEvent.NavigateEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            handleNavigateUiEvent((CryptoTransferEvent.NavigateEvent) event);
        }
    }

    private final void handleNavigateUiEvent(CryptoTransferEvent.NavigateEvent event) {
        if (event instanceof CryptoTransferEvent.NavigateEvent.Loading) {
            setOrReplaceFragment(CryptoTransferConfigLoadingFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferConfigLoadingFragment.Args(Sources.getNavigationType(((CryptoTransferIntentKey) INSTANCE.getExtras((Activity) this)).getSource()))));
            return;
        }
        if (event instanceof CryptoTransferEvent.NavigateEvent.Enrollment) {
            CryptoTransferEvent.NavigateEvent.Enrollment enrollment = (CryptoTransferEvent.NavigateEvent.Enrollment) event;
            setOrReplaceFragment(EnrollmentParentV2Fragment.INSTANCE.newInstance((Parcelable) new EnrollmentParentV2Fragment.Args(enrollment.getEnrollmentState(), enrollment.getAction(), ((CryptoTransferIntentKey) INSTANCE.getExtras((Activity) this)).getExitDeeplinkEnrollmentCompleted())));
            return;
        }
        if (event instanceof CryptoTransferEvent.NavigateEvent.Receive) {
            revertFullscreenFlags();
            setOrReplaceFragment(CryptoTransferUnifiedParentFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferUnifiedParentFragment.Args(((CryptoTransferEvent.NavigateEvent.Receive) event).getCurrencyPairId(), CryptoTransferAction.RECEIVE, null, ((CryptoTransferIntentKey) INSTANCE.getExtras((Activity) this)).getSource(), 4, null)));
        } else if (event instanceof CryptoTransferEvent.NavigateEvent.Send) {
            revertFullscreenFlags();
            CryptoTransferEvent.NavigateEvent.Send send = (CryptoTransferEvent.NavigateEvent.Send) event;
            setOrReplaceFragment(CryptoTransferUnifiedParentFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferUnifiedParentFragment.Args(send.getCurrencyPairId(), CryptoTransferAction.SEND, send.getSendState(), ((CryptoTransferIntentKey) INSTANCE.getExtras((Activity) this)).getSource())));
        } else {
            if (!(event instanceof CryptoTransferEvent.NavigateEvent.Finish)) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    @Override // com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment.Callbacks
    public void navigateToSend() {
        getDuxo().refreshConfiguration();
    }

    @Override // com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment.Callbacks
    public void navigateToReceive() {
        getDuxo().refreshConfiguration();
    }

    @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment.Callbacks
    public void navigateToEnrollment(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action) {
        Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
        Intrinsics.checkNotNullParameter(action, "action");
        setOrReplaceFragment(EnrollmentParentV2Fragment.INSTANCE.newInstance((Parcelable) new EnrollmentParentV2Fragment.Args(enrollmentState, action, ((CryptoTransferIntentKey) INSTANCE.getExtras((Activity) this)).getExitDeeplinkEnrollmentCompleted())));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C37934R.id.dialog_id_generic) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void setOrReplaceFragment(Fragment fragment) {
        if (getCurrentFragment() == null) {
            setFragment(C11048R.id.fragment_container, fragment);
            return;
        }
        boolean z = getCurrentFragment() instanceof CryptoTransferConfigLoadingFragment;
        popLastFragment();
        if (z) {
            replaceFragmentWithoutAnimationAndBackStack(fragment);
        } else {
            replaceFragment(fragment);
        }
    }

    @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment.Callbacks
    public void exitTransfers() {
        finish();
    }

    @Override // com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment.Callbacks
    public void exitTransfers(String exitDeeplink) {
        if (exitDeeplink != null) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(exitDeeplink), null, null, false, null, 60, null);
        }
        finish();
    }

    private final void revertFullscreenFlags() {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ViewsKt.setMarginTop(rhToolbar, 0);
        }
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-1281));
    }

    /* compiled from: CryptoTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferActivity;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoTransferActivity, CryptoTransferIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoTransferIntentKey getExtras(CryptoTransferActivity cryptoTransferActivity) {
            return (CryptoTransferIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoTransferIntentKey cryptoTransferIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoTransferIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoTransferIntentKey cryptoTransferIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoTransferIntentKey);
        }
    }
}
