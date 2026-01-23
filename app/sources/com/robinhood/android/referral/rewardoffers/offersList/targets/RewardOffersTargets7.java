package com.robinhood.android.referral.rewardoffers.offersList.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardOffersTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getIntent2", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardoffers.offersList.targets.RewardOffersTargetsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOffersTargets7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent2(DeeplinkTarget2 deeplinkTarget2) {
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter("id");
        UUID uuid = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        }
        UUID uuid2 = uuid;
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new RewardOfferIntentKey.Platform(deeplinkTarget2.getUri().getQueryParameter("source"), null, uuid2, false, false, deeplinkTarget2.getUri().getQueryParameter("initial_source"), 26, null), null, false, 12, null)};
    }
}
