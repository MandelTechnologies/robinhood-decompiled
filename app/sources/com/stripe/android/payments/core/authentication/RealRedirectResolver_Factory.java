package com.stripe.android.payments.core.authentication;

import dagger.internal.Factory;

/* loaded from: classes22.dex */
public final class RealRedirectResolver_Factory implements Factory<RedirectResolver2> {

    private static final class InstanceHolder {
        private static final RealRedirectResolver_Factory INSTANCE = new RealRedirectResolver_Factory();
    }

    @Override // javax.inject.Provider
    public RedirectResolver2 get() {
        return newInstance();
    }

    public static RealRedirectResolver_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RedirectResolver2 newInstance() {
        return new RedirectResolver2();
    }
}
