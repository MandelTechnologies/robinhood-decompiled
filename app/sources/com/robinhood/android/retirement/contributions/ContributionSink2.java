package com.robinhood.android.retirement.contributions;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.account.strings.AccountNamingUtils;
import com.robinhood.android.retirement.contributions.ContributionSink;
import com.robinhood.android.transfers.lib.TransferAccounts4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContributionSink.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"ContributionSinkRow", "", "sink", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "onClick", "Lkotlin/Function0;", "enabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/contributions/ContributionSink;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.contributions.ContributionSinkKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionSink2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionSinkRow$lambda$0(ContributionSink contributionSink, Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionSinkRow(contributionSink, function0, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionSinkRow(final ContributionSink sink, final Function0<Unit> onClick, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        String investingName;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1905443244);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(sink) : composerStartRestartGroup.changedInstance(sink) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1905443244, i3, -1, "com.robinhood.android.retirement.contributions.ContributionSinkRow (ContributionSink.kt:27)");
                }
                if (!(sink instanceof ContributionSink.Account)) {
                    composerStartRestartGroup.startReplaceGroup(-1474878946);
                    StringResource labelText = TransferAccounts4.getLabelText(((ContributionSink.Account) sink).getAccount());
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    investingName = labelText.getText(resources).toString();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(sink instanceof ContributionSink.PendingAccount)) {
                        composerStartRestartGroup.startReplaceGroup(-1474883722);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1474876970);
                    ContributionSink.PendingAccount pendingAccount = (ContributionSink.PendingAccount) sink;
                    investingName = AccountNamingUtils.getInvestingName(pendingAccount.getAccountType(), pendingAccount.getManagementType(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                boolean z3 = sink instanceof ContributionSink.PendingAccount;
                ContributionReviewRow.ContributionReviewRow(modifier2, StringResources_androidKt.stringResource(C26981R.string.create_contribution_to_label, composerStartRestartGroup, 0), investingName, z2, !z3 ? null : onClick, z3, false, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 << 3) & 7168), 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionSinkKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionSink2.ContributionSinkRow$lambda$0(sink, onClick, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(sink instanceof ContributionSink.Account)) {
            }
            boolean z32 = sink instanceof ContributionSink.PendingAccount;
            ContributionReviewRow.ContributionReviewRow(modifier2, StringResources_androidKt.stringResource(C26981R.string.create_contribution_to_label, composerStartRestartGroup, 0), investingName, z2, !z32 ? null : onClick, z32, false, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 << 3) & 7168), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
