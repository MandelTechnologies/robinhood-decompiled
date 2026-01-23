package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import kotlin.Metadata;

/* compiled from: DirectDepositTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.targets.DirectDepositTargetsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DirectDepositTargets3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new DirectDepositShimKey(true, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, false, 12, null)};
    }
}
