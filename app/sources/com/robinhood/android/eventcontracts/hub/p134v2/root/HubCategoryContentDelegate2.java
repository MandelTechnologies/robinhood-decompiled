package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HubCategoryContentDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"BindNodeId", "", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentDelegate;", "nodeId", "Ljava/util/UUID;", "(Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentDelegate;Ljava/util/UUID;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentDelegateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubCategoryContentDelegate2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BindNodeId$lambda$1(HubCategoryContentDelegate hubCategoryContentDelegate, UUID uuid, int i, Composer composer, int i2) {
        BindNodeId(hubCategoryContentDelegate, uuid, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BindNodeId(final HubCategoryContentDelegate hubCategoryContentDelegate, final UUID nodeId, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(hubCategoryContentDelegate, "<this>");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124517653);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(hubCategoryContentDelegate) : composerStartRestartGroup.changedInstance(hubCategoryContentDelegate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(nodeId) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124517653, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.root.BindNodeId (HubCategoryContentDelegate.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(hubCategoryContentDelegate))) | composerStartRestartGroup.changedInstance(nodeId);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new HubCategoryContentDelegate3(hubCategoryContentDelegate, nodeId, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(hubCategoryContentDelegate, nodeId, (Function2) objRememberedValue, composerStartRestartGroup, i2 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentDelegateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubCategoryContentDelegate2.BindNodeId$lambda$1(hubCategoryContentDelegate, nodeId, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
