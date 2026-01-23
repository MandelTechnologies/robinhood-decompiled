package com.stripe.android.payments.core.injection;

import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory */
/* loaded from: classes22.dex */
public final class C42602x9e4b19e0 implements Factory<MessageVersionRegistry> {

    /* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory$InstanceHolder */
    private static final class InstanceHolder {
        private static final C42602x9e4b19e0 INSTANCE = new C42602x9e4b19e0();
    }

    @Override // javax.inject.Provider
    public MessageVersionRegistry get() {
        return provideMessageVersionRegistry();
    }

    public static C42602x9e4b19e0 create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessageVersionRegistry provideMessageVersionRegistry() {
        return (MessageVersionRegistry) Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.INSTANCE.provideMessageVersionRegistry());
    }
}
