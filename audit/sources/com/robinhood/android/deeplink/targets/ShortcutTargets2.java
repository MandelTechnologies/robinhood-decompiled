package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.deeplink.targets.util.Navigators;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.p320db.TransferDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShortcutTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/ShortcutDepositDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.targets.ShortcutDepositDeeplinkTarget, reason: use source file name */
/* loaded from: classes2.dex */
public final class ShortcutTargets2 extends DeeplinkTarget4 {
    public static final ShortcutTargets2 INSTANCE = new ShortcutTargets2();
    public static final int $stable = 8;

    private ShortcutTargets2() {
        super(DeepLinkPath.SHORTCUT_DEPOSIT.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigators.getWatchlistScreenIntent(deeplinkContext.getNavigator(), deeplinkContext.getContext(), WatchListIntentKey2.BANKING), Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new Transfer(new TransferContext.Normal(TransferDirection.DEPOSIT, null, null, 6, null)), null, false, 12, null)};
    }
}
