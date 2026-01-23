package com.robinhood.utils;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes21.dex */
public final class LogoutKillswitch_Factory implements Factory<LogoutKillswitch> {
    private final Provider<CoroutineScope> rootScopeProvider;

    private LogoutKillswitch_Factory(Provider<CoroutineScope> provider) {
        this.rootScopeProvider = provider;
    }

    @Override // javax.inject.Provider
    public LogoutKillswitch get() {
        return newInstance(this.rootScopeProvider.get());
    }

    public static LogoutKillswitch_Factory create(Provider<CoroutineScope> provider) {
        return new LogoutKillswitch_Factory(provider);
    }

    public static LogoutKillswitch newInstance(CoroutineScope coroutineScope) {
        return new LogoutKillswitch(coroutineScope);
    }
}
