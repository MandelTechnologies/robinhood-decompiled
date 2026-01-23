package com.robinhood.trader.clearcache;

import com.robinhood.shared.clearcache.CacheClearManager;
import kotlin.Metadata;

/* compiled from: ClearCacheModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/trader/clearcache/ClearCacheModule;", "", "<init>", "()V", "bindCacheClearManager", "Lcom/robinhood/shared/clearcache/CacheClearManager;", "realCacheClearManager", "Lcom/robinhood/trader/clearcache/RealCacheClearManager;", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ClearCacheModule {
    public abstract CacheClearManager bindCacheClearManager(RealCacheClearManager realCacheClearManager);
}
