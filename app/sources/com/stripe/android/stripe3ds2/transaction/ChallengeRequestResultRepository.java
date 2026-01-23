package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ChallengeRequestResultRepository.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;", "", "get", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "challengeRequestData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ChallengeRequestResultRepository {
    Object get(ChallengeRequestExecutor.Config config, ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation);
}
