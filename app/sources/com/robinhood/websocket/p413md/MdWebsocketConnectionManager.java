package com.robinhood.websocket.p413md;

import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.WebsocketConnectionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: MdWebsocketConnectionManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdWebsocketConnectionManager;", "Lcom/robinhood/websocket/WebsocketConnectionManager;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "okHttpClient", "Lokhttp3/OkHttpClient;", "<init>", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lkotlinx/coroutines/CoroutineScope;Lokhttp3/OkHttpClient;)V", "buildRequest", "Lokhttp3/Request;", "url", "", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MdWebsocketConnectionManager extends WebsocketConnectionManager {
    private final AuthTokenManager authTokenManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MdWebsocketConnectionManager(AuthTokenManager authTokenManager, @RootCoroutineScope CoroutineScope rootCoroutineScope, OkHttpClient okHttpClient) {
        super(MdConstants.INSTANCE.getCONFIGURATION(), rootCoroutineScope, okHttpClient, null, 8, null);
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.authTokenManager = authTokenManager;
    }

    @Override // com.robinhood.websocket.WebsocketConnectionManager
    protected Request buildRequest(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Request.Builder().url(url).addHeader("Authorization", MdConstants.INSTANCE.getAuthorizationHeaderValue(this.authTokenManager.getRawAuthToken())).addHeader(MdConstants.CALLER_HEADER, MdConstants.CALLER_VALUE).build();
    }
}
