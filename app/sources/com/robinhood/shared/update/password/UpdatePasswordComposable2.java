package com.robinhood.shared.update.password;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.update.password.UpdatePasswordComposable2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdatePasswordComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u008d\u0001\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0001\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0003H\u0002¨\u0006\u001a²\u0006\n\u0010\u000e\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"UpdatePasswordComposable", "", "isLoading", "", "currentPasswordError", "", "newPasswordError", "confirmNewPasswordError", "onForgotPasswordClicked", "Lkotlin/Function0;", "onSubmitClicked", "Lkotlin/Function3;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "UpdatePasswordForm", "currentPassword", "newPassword", "confirmNewPassword", "onCurrentPasswordChanged", "Lkotlin/Function1;", "onNewPasswordChanged", "onConfirmNewPasswordChanged", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "toTrailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "toVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "feature-update-password_externalDebug", "currentPasswordVisible", "newPasswordVisible", "confirmNewPasswordVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UpdatePasswordComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordComposable$lambda$12(boolean z, String str, String str2, String str3, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        UpdatePasswordComposable(z, str, str2, str3, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordForm$lambda$35(String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, Composer composer, int i2) {
        UpdatePasswordForm(str, str2, str3, str4, str5, str6, function1, function12, function13, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdatePasswordComposable(final boolean z, final String str, final String str2, final String str3, final Function0<Unit> onForgotPasswordClicked, final Function3<? super String, ? super String, ? super String, Unit> onSubmitClicked, Composer composer, final int i) {
        int i2;
        String str4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onForgotPasswordClicked, "onForgotPasswordClicked");
        Intrinsics.checkNotNullParameter(onSubmitClicked, "onSubmitClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1421551132);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str;
            i2 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onForgotPasswordClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSubmitClicked) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421551132, i2, -1, "com.robinhood.shared.update.password.UpdatePasswordComposable (UpdatePasswordComposable.kt:36)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordComposable$lambda$1$lambda$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordComposable$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordComposable$lambda$9$lambda$8();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), false, ComposableLambda3.rememberComposableLambda(-849497071, true, new C412161(onSubmitClicked, snapshotState, snapshotState2, snapshotState3, z), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-535071996, true, new C412172(str4, str2, str3, snapshotState, snapshotState2, snapshotState3, onForgotPasswordClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePasswordComposable2.UpdatePasswordComposable$lambda$12(z, str, str2, str3, onForgotPasswordClicked, onSubmitClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordComposable$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordComposable$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordComposable$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* compiled from: UpdatePasswordComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$1 */
    static final class C412161 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $confirmNewPassword$delegate;
        final /* synthetic */ SnapshotState<String> $currentPassword$delegate;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ SnapshotState<String> $newPassword$delegate;
        final /* synthetic */ Function3<String, String, String, Unit> $onSubmitClicked;

        /* JADX WARN: Multi-variable type inference failed */
        C412161(Function3<? super String, ? super String, ? super String, Unit> function3, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, boolean z) {
            this.$onSubmitClicked = function3;
            this.$currentPassword$delegate = snapshotState;
            this.$newPassword$delegate = snapshotState2;
            this.$confirmNewPassword$delegate = snapshotState3;
            this.$isLoading = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-849497071, i2, -1, "com.robinhood.shared.update.password.UpdatePasswordComposable.<anonymous> (UpdatePasswordComposable.kt:44)");
            }
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$onSubmitClicked) | composer.changed(this.$currentPassword$delegate) | composer.changed(this.$newPassword$delegate) | composer.changed(this.$confirmNewPassword$delegate);
            final Function3<String, String, String, Unit> function3 = this.$onSubmitClicked;
            final SnapshotState<String> snapshotState = this.$currentPassword$delegate;
            final SnapshotState<String> snapshotState2 = this.$newPassword$delegate;
            final SnapshotState<String> snapshotState3 = this.$confirmNewPassword$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.C412161.invoke$lambda$1$lambda$0(function3, snapshotState, snapshotState2, snapshotState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_action_submit, composer, 0), this.$isLoading, null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 99);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function3 function3, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3) {
            function3.invoke(UpdatePasswordComposable2.UpdatePasswordComposable$lambda$2(snapshotState), UpdatePasswordComposable2.UpdatePasswordComposable$lambda$6(snapshotState2), UpdatePasswordComposable2.UpdatePasswordComposable$lambda$10(snapshotState3));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UpdatePasswordComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$2 */
    static final class C412172 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $confirmNewPassword$delegate;
        final /* synthetic */ String $confirmNewPasswordError;
        final /* synthetic */ SnapshotState<String> $currentPassword$delegate;
        final /* synthetic */ String $currentPasswordError;
        final /* synthetic */ SnapshotState<String> $newPassword$delegate;
        final /* synthetic */ String $newPasswordError;
        final /* synthetic */ Function0<Unit> $onForgotPasswordClicked;

        C412172(String str, String str2, String str3, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, Function0<Unit> function0) {
            this.$currentPasswordError = str;
            this.$newPasswordError = str2;
            this.$confirmNewPasswordError = str3;
            this.$currentPassword$delegate = snapshotState;
            this.$newPassword$delegate = snapshotState2;
            this.$confirmNewPassword$delegate = snapshotState3;
            this.$onForgotPasswordClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535071996, i, -1, "com.robinhood.shared.update.password.UpdatePasswordComposable.<anonymous> (UpdatePasswordComposable.kt:51)");
            }
            String strUpdatePasswordComposable$lambda$2 = UpdatePasswordComposable2.UpdatePasswordComposable$lambda$2(this.$currentPassword$delegate);
            String strUpdatePasswordComposable$lambda$6 = UpdatePasswordComposable2.UpdatePasswordComposable$lambda$6(this.$newPassword$delegate);
            String strUpdatePasswordComposable$lambda$10 = UpdatePasswordComposable2.UpdatePasswordComposable$lambda$10(this.$confirmNewPassword$delegate);
            String str = this.$currentPasswordError;
            String str2 = this.$newPasswordError;
            String str3 = this.$confirmNewPasswordError;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$currentPassword$delegate);
            final SnapshotState<String> snapshotState = this.$currentPassword$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePasswordComposable2.C412172.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$newPassword$delegate);
            final SnapshotState<String> snapshotState2 = this.$newPassword$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePasswordComposable2.C412172.invoke$lambda$3$lambda$2(snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(this.$confirmNewPassword$delegate);
            final SnapshotState<String> snapshotState3 = this.$confirmNewPassword$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$UpdatePasswordComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePasswordComposable2.C412172.invoke$lambda$5$lambda$4(snapshotState3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            UpdatePasswordComposable2.UpdatePasswordForm(strUpdatePasswordComposable$lambda$2, strUpdatePasswordComposable$lambda$6, strUpdatePasswordComposable$lambda$10, str, str2, str3, function1, function12, (Function1) objRememberedValue3, this.$onForgotPasswordClicked, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdatePasswordComposable2.UpdatePasswordComposable$lambda$3(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdatePasswordComposable2.UpdatePasswordComposable$lambda$7(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdatePasswordComposable2.UpdatePasswordComposable$lambda$11(snapshotState, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordForm(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super String, Unit> function13, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(999522152);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999522152, i2, -1, "com.robinhood.shared.update.password.UpdatePasswordForm (UpdatePasswordComposable.kt:78)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$14$lambda$13();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$18$lambda$17();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$22$lambda$21();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41211R.string.update_password_title, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            String strStringResource = StringResources_androidKt.stringResource(C41211R.string.update_password_current_password_placeholder, composerStartRestartGroup, 0);
            BentoTextInput8.Message.Error error = str4 != null ? new BentoTextInput8.Message.Error(str4) : null;
            BentoTextInput8.Icon.Size24 trailingIcon = toTrailingIcon(UpdatePasswordForm$lambda$15(snapshotState));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$34$lambda$27$lambda$26(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, companion4.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null);
            VisualTransformation visualTransformation = toVisualTransformation(UpdatePasswordForm$lambda$15(snapshotState));
            int i5 = BentoTextInput8.Message.Error.$stable;
            int i6 = BentoTextInput8.Icon.Size24.$stable;
            BentoTextInput4.BentoTextInput(str, function1, null, null, strStringResource, null, error, null, trailingIcon, (Function0) objRememberedValue4, keyboardOptions, null, visualTransformation, false, false, composerStartRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | (i5 << 18) | (i6 << 24), 6, 26796);
            String strStringResource2 = StringResources_androidKt.stringResource(C41211R.string.update_password_new_password_placeholder, composerStartRestartGroup, 0);
            BentoTextInput8.Message.Error error2 = str5 != null ? new BentoTextInput8.Message.Error(str5) : null;
            BentoTextInput8.Icon.Size24 trailingIcon2 = toTrailingIcon(UpdatePasswordForm$lambda$19(snapshotState2));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$34$lambda$30$lambda$29(snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(str2, function12, null, null, strStringResource2, null, error2, null, trailingIcon2, (Function0) objRememberedValue5, new KeyboardOptions(0, null, companion4.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null), null, toVisualTransformation(UpdatePasswordForm$lambda$19(snapshotState2)), false, false, composerStartRestartGroup, ((i4 >> 3) & 14) | ((i4 >> 18) & 112) | (i5 << 18) | (i6 << 24), 6, 26796);
            String strStringResource3 = StringResources_androidKt.stringResource(C41211R.string.update_password_confirm_new_password_placeholder, composerStartRestartGroup, 0);
            BentoTextInput8.Message.Error error3 = str6 != null ? new BentoTextInput8.Message.Error(str6) : null;
            BentoTextInput8.Icon.Size24 trailingIcon3 = toTrailingIcon(UpdatePasswordForm$lambda$23(snapshotState3));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable2.UpdatePasswordForm$lambda$34$lambda$33$lambda$32(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(str3, function13, null, null, strStringResource3, null, error3, null, trailingIcon3, (Function0) objRememberedValue6, new KeyboardOptions(0, null, companion4.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null), null, toVisualTransformation(UpdatePasswordForm$lambda$23(snapshotState3)), false, false, composerStartRestartGroup, ((i4 >> 6) & 14) | ((i4 >> 21) & 112) | (i5 << 18) | (i6 << 24), 6, 26796);
            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C41211R.string.update_password_forgot_password, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 1, null), null, null, false, null, composerStartRestartGroup, (i4 >> 27) & 14, 120);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePasswordComposable2.UpdatePasswordForm$lambda$35(str, str2, str3, str4, str5, str6, function1, function12, function13, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordForm$lambda$14$lambda$13() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void UpdatePasswordForm$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordForm$lambda$18$lambda$17() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void UpdatePasswordForm$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdatePasswordForm$lambda$22$lambda$21() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void UpdatePasswordForm$lambda$24(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdatePasswordComposable$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdatePasswordComposable$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdatePasswordComposable$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean UpdatePasswordForm$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean UpdatePasswordForm$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean UpdatePasswordForm$lambda$23(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordForm$lambda$34$lambda$27$lambda$26(SnapshotState snapshotState) {
        UpdatePasswordForm$lambda$16(snapshotState, !UpdatePasswordForm$lambda$15(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordForm$lambda$34$lambda$30$lambda$29(SnapshotState snapshotState) {
        UpdatePasswordForm$lambda$20(snapshotState, !UpdatePasswordForm$lambda$19(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$11(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$3(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$7(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordForm$lambda$34$lambda$33$lambda$32(SnapshotState snapshotState) {
        UpdatePasswordForm$lambda$24(snapshotState, !UpdatePasswordForm$lambda$23(snapshotState));
        return Unit.INSTANCE;
    }

    public static final BentoTextInput8.Icon.Size24 toTrailingIcon(boolean z) {
        return new BentoTextInput8.Icon.Size24(z ? ServerToBentoAssetMapper2.EYE_24 : ServerToBentoAssetMapper2.EYE_CLOSED_24, null, null, 6, null);
    }

    private static final VisualTransformation toVisualTransformation(boolean z) {
        return z ? VisualTransformation.INSTANCE.getNone() : new VisualTransformation2((char) 0, 1, null);
    }
}
