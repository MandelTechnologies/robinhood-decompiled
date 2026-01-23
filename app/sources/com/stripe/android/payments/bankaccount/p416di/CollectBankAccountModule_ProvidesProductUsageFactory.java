package com.stripe.android.payments.bankaccount.p416di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes22.dex */
public final class CollectBankAccountModule_ProvidesProductUsageFactory implements Factory<Set<String>> {
    public static Set<String> providesProductUsage() {
        return (Set) Preconditions.checkNotNullFromProvides(CollectBankAccountModule.INSTANCE.providesProductUsage());
    }
}
