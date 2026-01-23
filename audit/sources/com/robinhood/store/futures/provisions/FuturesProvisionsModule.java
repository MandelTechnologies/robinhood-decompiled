package com.robinhood.store.futures.provisions;

import com.robinhood.android.lib.account.futures.FuturesAccountProvider;
import com.robinhood.store.futures.RealFuturesAccountProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesProvisionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule;", "", "<init>", "()V", "provideFuturesAccountProvider", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "provider", "Lcom/robinhood/store/futures/RealFuturesAccountProvider;", "lib-futures-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesProvisionsModule {
    public final FuturesAccountProvider provideFuturesAccountProvider(RealFuturesAccountProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }
}
