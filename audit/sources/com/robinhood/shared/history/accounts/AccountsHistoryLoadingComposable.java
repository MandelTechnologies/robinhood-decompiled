package com.robinhood.shared.history.accounts;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountsHistoryLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"AccountsHistoryLoadingComposable", "", "loading", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-accounts-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryLoadingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AccountsHistoryLoadingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountsHistoryLoadingComposable$lambda$0(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountsHistoryLoadingComposable(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AccountsHistoryLoadingComposable(boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1227858243);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227858243, i3, -1, "com.robinhood.shared.history.accounts.AccountsHistoryLoadingComposable (AccountsHistoryLoadingComposable.kt:20)");
            }
            z2 = z;
            LocalShowPlaceholder.Loadable(z2, modifier2, null, AccountsHistoryLoadingComposable2.INSTANCE.getLambda$1388598995$feature_accounts_history_externalDebug(), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountsHistoryLoadingComposable.AccountsHistoryLoadingComposable$lambda$0(z2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
