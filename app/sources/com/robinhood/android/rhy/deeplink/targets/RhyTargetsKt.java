package com.robinhood.android.rhy.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.rhyonboarding.contracts.RhyPostAccountOpenIntentKey;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.utils.extensions.StringsKt;
import java.util.EnumSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\b"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "getIntent2", "getPostSignupIntents", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyTargetsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new LegacyIntentKey.RhyMerchantRewards(null, 1, 0 == true ? 1 : 0), null, false, 12, null)};
    }

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
        if (uuid2 == null) {
            Navigator navigator = deeplinkTarget2.getNavigator();
            Context context = deeplinkTarget2.getContext();
            EnumSet enumSetOf = EnumSet.of(AllHistoryFragmentKey.Filter.ALL);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AllHistoryFragmentKey(enumSetOf, EnumSet.of(HistoryTransactionType.MERCHANT_REWARD), null, null, false, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.MERCHANT_REWARD, uuid2, null, false, 12, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getPostSignupIntents(DeeplinkTarget2 deeplinkTarget2) {
        Uri uri;
        try {
            uri = Uri.parse(deeplinkTarget2.getUri().getQueryParameter("exit_deep_link_override"));
        } catch (Throwable unused) {
            uri = null;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new RhyPostAccountOpenIntentKey(uri), null, false, 12, null)};
    }
}
