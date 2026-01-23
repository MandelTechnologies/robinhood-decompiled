package com.robinhood.websocket.p410dx;

import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.WebsocketConnectionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;

/* compiled from: DxWebsocketConnectionManager.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxWebsocketConnectionManager;", "Lcom/robinhood/websocket/WebsocketConnectionManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "okHttpClient", "Lokhttp3/OkHttpClient;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lokhttp3/OkHttpClient;)V", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DxWebsocketConnectionManager extends WebsocketConnectionManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxWebsocketConnectionManager(@RootCoroutineScope CoroutineScope rootCoroutineScope, OkHttpClient okHttpClient) {
        super(DxConstants.INSTANCE.getCONFIGURATION(), rootCoroutineScope, okHttpClient, null, 8, null);
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
    }
}
