package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardAccountRangeRepository.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\rJ \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository;", "", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface CardAccountRangeRepository {

    /* compiled from: CardAccountRangeRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Factory {
    }

    Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation);

    StateFlow<Boolean> getLoading();
}
