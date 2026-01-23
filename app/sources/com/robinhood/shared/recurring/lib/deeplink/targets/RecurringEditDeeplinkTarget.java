package com.robinhood.shared.recurring.lib.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.recurring.p455v1.EditRecurringInvestmentDeeplinkDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringEditDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/recurring/lib/deeplink/targets/RecurringEditDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/recurring/v1/EditRecurringInvestmentDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/recurring/v1/EditRecurringInvestmentDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RecurringEditDeeplinkTarget extends DeeplinkTarget3<EditRecurringInvestmentDeeplinkDto> {
    public static final RecurringEditDeeplinkTarget INSTANCE = new RecurringEditDeeplinkTarget();

    private RecurringEditDeeplinkTarget() {
        super(EditRecurringInvestmentDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(RecurringInvestmentRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(EditRecurringInvestmentDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String id = data.getId();
        if (id != null) {
            try {
                uuid = StringsKt.toUuid(id);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            uuid = null;
        }
        boolean zEquals$default = kotlin.text.StringsKt.equals$default(data.getFrom(), "insights", false, 2, null);
        if (uuid == null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new RecurringHubFragmentKey(null, 1, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new InvestmentScheduleSettingsFragmentKey(uuid, zEquals$default), false, false, false, null, false, true, false, false, false, null, false, 7796, null)};
    }
}
