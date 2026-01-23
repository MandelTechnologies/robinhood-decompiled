package com.robinhood.android.navigation.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AddIntentFlagAndDeepLinkData.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"addIntentFlagAndDeepLinkData", "", "from", "Landroid/content/Intent;", "intents", "", "shouldClearTop", "", "(Landroid/content/Intent;[Landroid/content/Intent;Z)V", "feature-deep-link-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.deeplink.AddIntentFlagAndDeepLinkDataKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AddIntentFlagAndDeepLinkData {
    public static final void addIntentFlagAndDeepLinkData(Intent from, Intent[] intents, boolean z) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(intents, "intents");
        Intent intent = (Intent) ArraysKt.last(intents);
        String action = intent.getAction();
        if (action == null || StringsKt.isBlank(action)) {
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK, from.getData());
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK_NONCE, UUID.randomUUID().toString());
            Uri data = from.getData();
            if (!Intrinsics.areEqual(data != null ? data.getScheme() : null, DeeplinkConfig.INSTANCE.getScheme())) {
                parcelable = DeepLinkOrigin.AppLink.INSTANCE;
            } else {
                parcelable = (DeepLinkOrigin) from.getParcelableExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN);
            }
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, parcelable);
        }
        ((Intent) ArraysKt.first(intents)).addFlags(z ? 335544320 : 268435456);
    }
}
