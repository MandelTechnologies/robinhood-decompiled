package com.robinhood.android.account.strings;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountNamingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"getInvestingName", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "lib-account-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.strings.AccountNamingUtilsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNamingUtils {
    public static final String getInvestingName(BrokerageAccountType brokerageAccountType, ManagementType managementType, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        composer.startReplaceGroup(698513426);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(698513426, i, -1, "com.robinhood.android.account.strings.getInvestingName (AccountNamingUtils.kt:11)");
        }
        DisplayName displayName = AccountDisplayNames.getDisplayName(brokerageAccountType, managementType, null);
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        StringResource title = displayName.getWithInvesting().getTitle();
        Intrinsics.checkNotNull(resources);
        String string2 = title.getText(resources).toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return string2;
    }
}
