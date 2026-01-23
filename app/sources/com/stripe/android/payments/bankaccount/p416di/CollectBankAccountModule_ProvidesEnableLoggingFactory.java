package com.stripe.android.payments.bankaccount.p416di;

import dagger.internal.Factory;

/* loaded from: classes22.dex */
public final class CollectBankAccountModule_ProvidesEnableLoggingFactory implements Factory<Boolean> {

    private static final class InstanceHolder {
        private static final CollectBankAccountModule_ProvidesEnableLoggingFactory INSTANCE = new CollectBankAccountModule_ProvidesEnableLoggingFactory();
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static CollectBankAccountModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CollectBankAccountModule.INSTANCE.providesEnableLogging();
    }
}
