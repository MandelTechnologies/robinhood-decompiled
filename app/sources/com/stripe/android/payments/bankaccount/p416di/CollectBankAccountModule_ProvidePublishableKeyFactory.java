package com.stripe.android.payments.bankaccount.p416di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class CollectBankAccountModule_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    public static Function0<String> providePublishableKey(CollectBankAccountContract.Args args) {
        return (Function0) Preconditions.checkNotNullFromProvides(CollectBankAccountModule.INSTANCE.providePublishableKey(args));
    }
}
