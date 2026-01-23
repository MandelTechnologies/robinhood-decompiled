package com.stripe.android.payments.bankaccount.p416di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p416di.CollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewModel;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.SharedFlow2;

/* loaded from: classes22.dex */
public final class DaggerCollectBankAccountComponent {
    public static CollectBankAccountComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements CollectBankAccountComponent.Builder {
        private Application application;
        private CollectBankAccountContract.Args configuration;
        private SavedStateHandle savedStateHandle;
        private SharedFlow2<CollectBankAccountViewEffect> viewEffect;

        private Builder() {
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public /* bridge */ /* synthetic */ CollectBankAccountComponent.Builder viewEffect(SharedFlow2 sharedFlow2) {
            return viewEffect((SharedFlow2<CollectBankAccountViewEffect>) sharedFlow2);
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder viewEffect(SharedFlow2<CollectBankAccountViewEffect> sharedFlow2) {
            this.viewEffect = (SharedFlow2) Preconditions.checkNotNull(sharedFlow2);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder configuration(CollectBankAccountContract.Args args) {
            this.configuration = (CollectBankAccountContract.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public CollectBankAccountComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.viewEffect, SharedFlow2.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.configuration, CollectBankAccountContract.Args.class);
            return new CollectBankAccountComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.application, this.viewEffect, this.savedStateHandle, this.configuration);
        }
    }

    private static final class CollectBankAccountComponentImpl implements CollectBankAccountComponent {
        private final Application application;
        private final CollectBankAccountComponentImpl collectBankAccountComponentImpl;
        private final CollectBankAccountContract.Args configuration;
        private Provider<Logger> provideLoggerProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final SavedStateHandle savedStateHandle;
        private final SharedFlow2<CollectBankAccountViewEffect> viewEffect;

        private CollectBankAccountComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, SharedFlow2<CollectBankAccountViewEffect> sharedFlow2, SavedStateHandle savedStateHandle, CollectBankAccountContract.Args args) {
            this.collectBankAccountComponentImpl = this;
            this.configuration = args;
            this.viewEffect = sharedFlow2;
            this.application = application;
            this.savedStateHandle = savedStateHandle;
            initialize(coroutineContextModule, coreCommonModule, application, sharedFlow2, savedStateHandle, args);
        }

        private Context context() {
            return CollectBankAccountModule_ProvidesAppContextFactory.providesAppContext(this.application);
        }

        private Function0<String> namedFunction0OfString() {
            return CollectBankAccountModule_ProvidePublishableKeyFactory.providePublishableKey(this.configuration);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.get(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private CreateFinancialConnectionsSession createFinancialConnectionsSession() {
            return new CreateFinancialConnectionsSession(stripeApiRepository());
        }

        private AttachFinancialConnectionsSession attachFinancialConnectionsSession() {
            return new AttachFinancialConnectionsSession(stripeApiRepository());
        }

        private RetrieveStripeIntent retrieveStripeIntent() {
            return new RetrieveStripeIntent(stripeApiRepository());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, SharedFlow2<CollectBankAccountViewEffect> sharedFlow2, SavedStateHandle savedStateHandle, CollectBankAccountContract.Args args) {
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, CollectBankAccountModule_ProvidesEnableLoggingFactory.create()));
        }

        @Override // com.stripe.android.payments.bankaccount.p416di.CollectBankAccountComponent
        public CollectBankAccountViewModel getViewModel() {
            return new CollectBankAccountViewModel(this.configuration, this.viewEffect, createFinancialConnectionsSession(), attachFinancialConnectionsSession(), retrieveStripeIntent(), this.savedStateHandle, this.provideLoggerProvider.get());
        }
    }
}
