package com.robinhood.utils.http;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthTokens.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/http/AuthTokens;", "", "<init>", "()V", "TYPE_BEARER", "", "formatToken", "tokenType", "unformattedToken", "lib-utils-http"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AuthTokens {
    public static final AuthTokens INSTANCE = new AuthTokens();
    public static final String TYPE_BEARER = "Bearer";

    private AuthTokens() {
    }

    @JvmStatic
    public static final String formatToken(String tokenType, String unformattedToken) {
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(unformattedToken, "unformattedToken");
        return tokenType + PlaceholderUtils.XXShortPlaceholderText + unformattedToken;
    }
}
