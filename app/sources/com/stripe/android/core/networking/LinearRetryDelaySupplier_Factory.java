package com.stripe.android.core.networking;

import dagger.internal.Factory;

/* loaded from: classes10.dex */
public final class LinearRetryDelaySupplier_Factory implements Factory<LinearRetryDelaySupplier> {

    private static final class InstanceHolder {
        private static final LinearRetryDelaySupplier_Factory INSTANCE = new LinearRetryDelaySupplier_Factory();
    }

    @Override // javax.inject.Provider
    public LinearRetryDelaySupplier get() {
        return newInstance();
    }

    public static LinearRetryDelaySupplier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LinearRetryDelaySupplier newInstance() {
        return new LinearRetryDelaySupplier();
    }
}
