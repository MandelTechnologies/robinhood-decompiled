package com.robinhood.android.authlock.biometric;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.authlock.C9622R;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.shared.security.contracts.BiometricChangeLogoutDialogFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BiometricChangeLogoutDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricChangeLogoutDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BiometricChangeLogoutDialogFragment extends GenericComposeDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(BiometricChangeLogoutDialogFragment biometricChangeLogoutDialogFragment, int i, Composer composer, int i2) {
        biometricChangeLogoutDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1838039248);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1838039248, i2, -1, "com.robinhood.android.authlock.biometric.BiometricChangeLogoutDialogFragment.ComposeContent (BiometricChangeLogoutDialogFragment.kt:21)");
            }
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C9622R.string.biometric_change_logout_dialog_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C9622R.string.biometric_change_logout_dialog_message, composerStartRestartGroup, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C9622R.string.biometric_change_logout_dialog_primary_cta, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.authlock.biometric.BiometricChangeLogoutDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BiometricChangeLogoutDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this))) {
                z = true;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.authlock.biometric.BiometricChangeLogoutDialogFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BiometricChangeLogoutDialogFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.authlock.biometric.BiometricChangeLogoutDialogFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BiometricChangeLogoutDialogFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(BiometricChangeLogoutDialogFragment biometricChangeLogoutDialogFragment) {
        biometricChangeLogoutDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(BiometricChangeLogoutDialogFragment biometricChangeLogoutDialogFragment) {
        biometricChangeLogoutDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: BiometricChangeLogoutDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricChangeLogoutDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/authlock/biometric/BiometricChangeLogoutDialogFragment;", "Lcom/robinhood/shared/security/contracts/BiometricChangeLogoutDialogFragmentKey;", "<init>", "()V", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<BiometricChangeLogoutDialogFragment, BiometricChangeLogoutDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public BiometricChangeLogoutDialogFragment createDialogFragment(BiometricChangeLogoutDialogFragmentKey biometricChangeLogoutDialogFragmentKey) {
            return (BiometricChangeLogoutDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, biometricChangeLogoutDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BiometricChangeLogoutDialogFragmentKey getArgs(BiometricChangeLogoutDialogFragment biometricChangeLogoutDialogFragment) {
            return (BiometricChangeLogoutDialogFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, biometricChangeLogoutDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BiometricChangeLogoutDialogFragment newInstance(BiometricChangeLogoutDialogFragmentKey biometricChangeLogoutDialogFragmentKey) {
            return (BiometricChangeLogoutDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, biometricChangeLogoutDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BiometricChangeLogoutDialogFragment biometricChangeLogoutDialogFragment, BiometricChangeLogoutDialogFragmentKey biometricChangeLogoutDialogFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, biometricChangeLogoutDialogFragment, biometricChangeLogoutDialogFragmentKey);
        }
    }
}
