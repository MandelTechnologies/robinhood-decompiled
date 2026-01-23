package com.robinhood.android.navigation.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkResolverActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity;", "Lcom/robinhood/android/navigation/deeplink/BaseDeeplinkResolverActivity;", "<init>", "()V", "injectedDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "getInjectedDeepLinkResolver", "()Lcom/robinhood/android/navigation/DeepLinkResolver;", "setInjectedDeepLinkResolver", "(Lcom/robinhood/android/navigation/DeepLinkResolver;)V", "deepLinkResolver", "getDeepLinkResolver", "Companion", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DeeplinkResolverActivity extends BaseDeeplinkResolverActivity {
    public static final String KEY_CURRENT_SCARLET_THEME = "currentScarletTheme";
    public static final String KEY_SHOULD_CLEAR_TOP_OVERRIDE = "shouldClearTopOverride";
    public DeepLinkResolver injectedDeepLinkResolver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final DeepLinkResolver getInjectedDeepLinkResolver() {
        DeepLinkResolver deepLinkResolver = this.injectedDeepLinkResolver;
        if (deepLinkResolver != null) {
            return deepLinkResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injectedDeepLinkResolver");
        return null;
    }

    public final void setInjectedDeepLinkResolver(DeepLinkResolver deepLinkResolver) {
        Intrinsics.checkNotNullParameter(deepLinkResolver, "<set-?>");
        this.injectedDeepLinkResolver = deepLinkResolver;
    }

    @Override // com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity
    protected DeepLinkResolver getDeepLinkResolver() {
        return getInjectedDeepLinkResolver();
    }

    /* compiled from: DeeplinkResolverActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$DeepLinkResolver;", "<init>", "()V", "KEY_SHOULD_CLEAR_TOP_OVERRIDE", "", "KEY_CURRENT_SCARLET_THEME", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<DeepLinkIntentKey.DeepLinkResolver> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DeepLinkIntentKey.DeepLinkResolver key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DeeplinkResolverActivity.class);
            intent.setData(key.getUri());
            intent.putExtra(DeeplinkResolverActivity.KEY_SHOULD_CLEAR_TOP_OVERRIDE, key.getShouldClearTopOverride());
            intent.putExtra(DeeplinkResolverActivity.KEY_CURRENT_SCARLET_THEME, key.getCurrentScarletTheme());
            return intent;
        }
    }
}
