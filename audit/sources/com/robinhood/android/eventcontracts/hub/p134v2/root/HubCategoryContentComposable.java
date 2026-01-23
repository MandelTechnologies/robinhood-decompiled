package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentComposable4;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubCategoryContentComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"HubCategoryContentComposable", "", "presentNodeId", "Ljava/util/UUID;", "displayLayoutType", "Lcom/robinhood/android/models/event/db/predictionmarkets/DisplayLayoutType;", "key", "", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/predictionmarkets/DisplayLayoutType;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubCategoryContentComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubCategoryContentComposable$lambda$0(UUID uuid, EcHubNavNode2 ecHubNavNode2, String str, int i, int i2, Composer composer, int i3) {
        HubCategoryContentComposable(uuid, ecHubNavNode2, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HubCategoryContentComposable(UUID presentNodeId, final EcHubNavNode2 displayLayoutType, String str, Composer composer, final int i, final int i2) {
        int i3;
        UUID uuid;
        final String str2;
        Intrinsics.checkNotNullParameter(presentNodeId, "presentNodeId");
        Intrinsics.checkNotNullParameter(displayLayoutType, "displayLayoutType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-382966282);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(presentNodeId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(displayLayoutType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            uuid = presentNodeId;
            str2 = str;
        } else {
            if (i4 != 0) {
                str = "HubCategoryContentComposable";
            }
            String str3 = str;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382966282, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentComposable (HubCategoryContentComposable.kt:12)");
            }
            if (displayLayoutType != EcHubNavNode2.LIST && displayLayoutType != EcHubNavNode2.UNKNOWN) {
                throw new NoWhenBranchMatchedException();
            }
            uuid = presentNodeId;
            HubDefaultCategoryContentComposable4.HubDefaultCategoryContentComposable(str3, uuid, null, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 << 3) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final UUID uuid2 = uuid;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubCategoryContentComposable.HubCategoryContentComposable$lambda$0(uuid2, displayLayoutType, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
