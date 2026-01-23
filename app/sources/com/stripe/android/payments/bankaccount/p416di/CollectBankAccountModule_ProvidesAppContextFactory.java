package com.stripe.android.payments.bankaccount.p416di;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes22.dex */
public final class CollectBankAccountModule_ProvidesAppContextFactory implements Factory<Context> {
    public static Context providesAppContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(CollectBankAccountModule.INSTANCE.providesAppContext(application));
    }
}
