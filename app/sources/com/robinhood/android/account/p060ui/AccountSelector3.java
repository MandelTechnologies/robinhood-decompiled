package com.robinhood.android.account.p060ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelector.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AccountSelector", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/account/ui/AccountSelectorState;", "callbacks", "Lcom/robinhood/android/account/ui/AccountSelectorCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/AccountSelectorState;Lcom/robinhood/android/account/ui/AccountSelectorCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-account-overview_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountSelectorKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountSelector3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelector$lambda$2(Modifier modifier, AccountSelectorState accountSelectorState, AccountSelector2 accountSelector2, int i, int i2, Composer composer, int i3) {
        AccountSelector(modifier, accountSelectorState, accountSelector2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AccountSelector(Modifier modifier, final AccountSelectorState state, final AccountSelector2 callbacks, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1896170839);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1896170839, i3, -1, "com.robinhood.android.account.ui.AccountSelector (AccountSelector.kt:31)");
            }
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, i3 & 14, 2);
            modifier = modifier2;
            String string2 = StringResource2.getString(state.getDisplayName().getShort().getTitle(), composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountSelectorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelector3.AccountSelector$lambda$1$lambda$0(callbacks, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoChip.BentoDropdownChip((Function0) objRememberedValue, modifierM21622defaultHorizontalPaddingWMci_g0, false, null, string2, composerStartRestartGroup, 0, 12);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier3 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountSelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelector3.AccountSelector$lambda$2(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelector$lambda$1$lambda$0(AccountSelector2 accountSelector2, AccountSelectorState accountSelectorState) {
        accountSelector2.onAccountSelectionDropdownClicked(accountSelectorState);
        return Unit.INSTANCE;
    }
}
