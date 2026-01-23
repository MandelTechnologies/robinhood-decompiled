package com.robinhood.shared.login.lib.p385ui;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.login.lib.p385ui.LoginSuvHelpBottomSheetFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: LoginSuvHelpBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginSuvHelpBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LoginSuvHelpBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LoginSuvHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Callbacks;", "", "onForgotPassword", "", "onForgotEmail", "onNeedAccessToOtherAccount", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes21.dex */
    public interface Callbacks {
        void onForgotEmail();

        void onForgotPassword();

        void onNeedAccessToOtherAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment, int i, Composer composer, int i2) {
        loginSuvHelpBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1374032587);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1374032587, i2, -1, "com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.ComposeContent (LoginSuvHelpBottomSheetFragment.kt:21)");
            }
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1140929193, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.ComposeContent.1

                /* compiled from: LoginSuvHelpBottomSheetFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ LoginSuvHelpBottomSheetFragment this$0;

                    AnonymousClass1(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment) {
                        this.this$0 = loginSuvHelpBottomSheetFragment;
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
                            ComposerKt.traceEventStart(285659116, i, -1, "com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (LoginSuvHelpBottomSheetFragment.kt:24)");
                        }
                        LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(loginSuvHelpBottomSheetFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new LoginSuvHelpBottomSheetFragment2(loginSuvHelpBottomSheetFragment);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LoginSuvHelpBottomSheetFragment.C391221.AnonymousClass1.invoke$lambda$2$lambda$1(loginSuvHelpBottomSheetFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LoginSuvHelpBottomSheetFragment.C391221.AnonymousClass1.invoke$lambda$4$lambda$3(loginSuvHelpBottomSheetFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function03 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment4 = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LoginSuvHelpBottomSheetFragment.C391221.AnonymousClass1.invoke$lambda$6$lambda$5(loginSuvHelpBottomSheetFragment4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        LoginSuvHelpBottomSheetComposable.LoginSuvHelpBottomSheetComposable(function0, function02, function03, (Function0) objRememberedValue4, null, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment) {
                        loginSuvHelpBottomSheetFragment.getCallbacks().onForgotPassword();
                        loginSuvHelpBottomSheetFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment) {
                        loginSuvHelpBottomSheetFragment.getCallbacks().onForgotEmail();
                        loginSuvHelpBottomSheetFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment) {
                        loginSuvHelpBottomSheetFragment.getCallbacks().onNeedAccessToOtherAccount();
                        loginSuvHelpBottomSheetFragment.dismiss();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1140929193, i3, -1, "com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.ComposeContent.<anonymous> (LoginSuvHelpBottomSheetFragment.kt:23)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(285659116, true, new AnonymousClass1(LoginSuvHelpBottomSheetFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginSuvHelpBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LoginSuvHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment;", "<init>", "()V", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<LoginSuvHelpBottomSheetFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((LoginSuvHelpBottomSheetFragment) fragment);
        }

        public Void getArgs(LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, loginSuvHelpBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public LoginSuvHelpBottomSheetFragment newInstance() {
            return (LoginSuvHelpBottomSheetFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public LoginSuvHelpBottomSheetFragment newInstance(Void r1) {
            return (LoginSuvHelpBottomSheetFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
