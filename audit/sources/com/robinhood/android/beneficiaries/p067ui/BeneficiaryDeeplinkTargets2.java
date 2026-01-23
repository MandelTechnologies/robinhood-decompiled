package com.robinhood.android.beneficiaries.p067ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a(\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "isBeneficiaryFlow", "", "(Lcom/robinhood/android/deeplink/DeeplinkContext;Z)[Landroid/content/Intent;", "processBeneficiariesIntent", "context", "Landroid/content/Context;", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryDeeplinkTargets2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2, boolean z) {
        return new Intent[]{processBeneficiariesIntent(deeplinkTarget2.getContext(), deeplinkTarget2.getUri(), z, deeplinkTarget2.getNavigator())};
    }

    private static final Intent processBeneficiariesIntent(Context context, Uri uri, boolean z, Navigator navigator) {
        FragmentKey list;
        String queryParameter = uri.getQueryParameter("account_number");
        String queryParameter2 = uri.getQueryParameter("beneficiary_id");
        UUID uuid = null;
        if (queryParameter2 != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (z) {
            if (queryParameter != null) {
                list = new BeneficiariesFragmentKey.UpdateBeneficiary(queryParameter, uuid);
            } else {
                list = BeneficiariesFragmentKey.SelectAccount.INSTANCE;
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (queryParameter == null) {
                list = BeneficiariesFragmentKey.SelectAccount.INSTANCE;
            } else if (uuid != null) {
                list = new BeneficiariesFragmentKey.Detail(queryParameter, uuid);
            } else {
                list = new BeneficiariesFragmentKey.List(queryParameter);
            }
        }
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, list, false, false, false, null, false, true, false, false, false, null, false, 7796, null);
    }
}
