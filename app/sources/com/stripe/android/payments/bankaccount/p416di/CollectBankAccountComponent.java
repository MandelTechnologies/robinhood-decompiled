package com.stripe.android.payments.bankaccount.p416di;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewModel;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: CollectBankAccountComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;", "", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "getViewModel", "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "viewModel", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface CollectBankAccountComponent {

    /* compiled from: CollectBankAccountComponent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "viewEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Builder {
        Builder application(Application application);

        CollectBankAccountComponent build();

        Builder configuration(CollectBankAccountContract.Args configuration);

        Builder savedStateHandle(SavedStateHandle savedStateHandle);

        Builder viewEffect(SharedFlow2<CollectBankAccountViewEffect> application);
    }

    CollectBankAccountViewModel getViewModel();
}
