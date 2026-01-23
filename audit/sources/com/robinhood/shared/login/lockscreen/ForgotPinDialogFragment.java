package com.robinhood.shared.login.lockscreen;

import android.app.Application;
import android.content.Context;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.DeviceSecurityConfig;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ForgotPinDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "authManagerLazy", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManagerLazy", "()Ldagger/Lazy;", "setAuthManagerLazy", "(Ldagger/Lazy;)V", "sheriffLazy", "Lcom/robinhood/api/retrofit/Sheriff;", "getSheriffLazy", "setSheriffLazy", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "app", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "setApp", "(Landroid/app/Application;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onResetPinClicked", "onError", "Lkotlin/Function0;", "Companion", "feature-login_externalRelease", "isLoading", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ForgotPinDialogFragment extends GenericComposeDialogFragment {
    public Application app;
    public Lazy<AuthManager> authManagerLazy;
    public PinManager pinManager;
    public Lazy<Sheriff> sheriffLazy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(ForgotPinDialogFragment forgotPinDialogFragment, int i, Composer composer, int i2) {
        forgotPinDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final Lazy<AuthManager> getAuthManagerLazy() {
        Lazy<AuthManager> lazy = this.authManagerLazy;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManagerLazy");
        return null;
    }

    public final void setAuthManagerLazy(Lazy<AuthManager> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.authManagerLazy = lazy;
    }

    public final Lazy<Sheriff> getSheriffLazy() {
        Lazy<Sheriff> lazy = this.sheriffLazy;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sheriffLazy");
        return null;
    }

    public final void setSheriffLazy(Lazy<Sheriff> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.sheriffLazy = lazy;
    }

    public final PinManager getPinManager() {
        PinManager pinManager = this.pinManager;
        if (pinManager != null) {
            return pinManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pinManager");
        return null;
    }

    public final void setPinManager(PinManager pinManager) {
        Intrinsics.checkNotNullParameter(pinManager, "<set-?>");
        this.pinManager = pinManager;
    }

    public final Application getApp() {
        Application application = this.app;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app");
        return null;
    }

    public final void setApp(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        this.app = application;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2010875729);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2010875729, i2, -1, "com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment.ComposeContent (ForgotPinDialogFragment.kt:37)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-375878153, true, new C391271((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ForgotPinDialogFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ForgotPinDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$ComposeContent$1 */
    static final class C391271 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $isLoading$delegate;

        C391271(SnapshotState<Boolean> snapshotState) {
            this.$isLoading$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-375878153, i, -1, "com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment.ComposeContent.<anonymous> (ForgotPinDialogFragment.kt:40)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C39089R.string.dialog_title_forgot_pin, composer, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39089R.string.dialog_message_forgot_pin, composer, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C39089R.string.dialog_primary_cta_forgot_pin, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(ForgotPinDialogFragment.this);
            final ForgotPinDialogFragment forgotPinDialogFragment = ForgotPinDialogFragment.this;
            final SnapshotState<Boolean> snapshotState = this.$isLoading$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ForgotPinDialogFragment.C391271.invoke$lambda$2$lambda$1(forgotPinDialogFragment, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue, null, null, null, ForgotPinDialogFragment.ComposeContent$lambda$1(this.$isLoading$delegate), 28, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(ForgotPinDialogFragment.this);
            final ForgotPinDialogFragment forgotPinDialogFragment2 = ForgotPinDialogFragment.this;
            final SnapshotState<Boolean> snapshotState2 = this.$isLoading$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ForgotPinDialogFragment.C391271.invoke$lambda$4$lambda$3(forgotPinDialogFragment2, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(ForgotPinDialogFragment forgotPinDialogFragment, final SnapshotState snapshotState) {
            ForgotPinDialogFragment.ComposeContent$lambda$2(snapshotState, true);
            forgotPinDialogFragment.onResetPinClicked(new Function0() { // from class: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ForgotPinDialogFragment.C391271.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            ForgotPinDialogFragment.ComposeContent$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(ForgotPinDialogFragment forgotPinDialogFragment, SnapshotState snapshotState) {
            if (!ForgotPinDialogFragment.ComposeContent$lambda$1(snapshotState)) {
                forgotPinDialogFragment.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ForgotPinDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$onResetPinClicked$1", m3645f = "ForgotPinDialogFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lockscreen.ForgotPinDialogFragment$onResetPinClicked$1 */
    static final class C391281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C391281(Function0<Unit> function0, Continuation<? super C391281> continuation) {
            super(2, continuation);
            this.$onError = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ForgotPinDialogFragment.this.new C391281(this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Sheriff sheriff = ForgotPinDialogFragment.this.getSheriffLazy().get();
                    DeviceSecurityConfig deviceSecurityConfig = new DeviceSecurityConfig("rh_pin");
                    this.label = 1;
                    obj = sheriff.deviceSecurityConfigUpdated(deviceSecurityConfig, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ForgotPinDialogFragment.this.getPinManager().disablePin();
                AuthManager authManager = ForgotPinDialogFragment.this.getAuthManagerLazy().get();
                Context contextRequireContext = ForgotPinDialogFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                AuthManager.DefaultImpls.initiateLogout$default(authManager, contextRequireContext, LogoutType.OTHER, "", false, null, "pin_reset", 24, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Toast.makeText(ForgotPinDialogFragment.this.getApp(), C11048R.string.general_error_summary, 1).show();
                this.$onError.invoke();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResetPinClicked(Function0<Unit> onError) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C391281(onError, null), 3, null);
    }

    /* compiled from: ForgotPinDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment;", "<init>", "()V", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<ForgotPinDialogFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((ForgotPinDialogFragment) fragment);
        }

        public Void getArgs(ForgotPinDialogFragment forgotPinDialogFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, forgotPinDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public ForgotPinDialogFragment newInstance() {
            return (ForgotPinDialogFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public ForgotPinDialogFragment newInstance(Void r1) {
            return (ForgotPinDialogFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
