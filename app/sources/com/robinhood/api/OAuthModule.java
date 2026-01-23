package com.robinhood.api;

import android.content.SharedPreferences;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.vault.Vault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OAuthModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/OAuthModule;", "", "<init>", "()V", "provideOAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "vault", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class OAuthModule {
    public static final OAuthModule INSTANCE = new OAuthModule();

    private OAuthModule() {
    }

    public final MoshiSecurePreference<OAuthToken> provideOAuthTokenPref(Vault vault, @UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        return new MoshiSecurePreference<>(vault, preferences, "secure_oauth_token", moshi.adapter(new TypeToken<OAuthToken>() { // from class: com.robinhood.api.OAuthModule$provideOAuthTokenPref$$inlined$getAdapter$1
        }.getType()));
    }
}
