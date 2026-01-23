package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* renamed from: com.stripe.android.payments.core.injection.Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory */
/* loaded from: classes22.dex */
public final class C42604x3d138ab7 implements Factory<InitChallengeRepository> {
    public static InitChallengeRepository providesInitChallengeRepository(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Application application, Stripe3ds2TransactionContract.Args args, CoroutineContext coroutineContext) {
        return (InitChallengeRepository) Preconditions.checkNotNullFromProvides(stripe3dsTransactionViewModelModule.providesInitChallengeRepository(application, args, coroutineContext));
    }
}
