package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.core.networking.LinearRetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor2;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class DaggerStripe3ds2TransactionViewModelFactoryComponent {
    public static Stripe3ds2TransactionViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements Stripe3ds2TransactionViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder isInstantApp(boolean z) {
            this.isInstantApp = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Stripe3ds2TransactionViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.enableLogging, Boolean.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.isInstantApp, Boolean.class);
            return new Stripe3ds2TransactionViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.productUsage, this.isInstantApp);
        }
    }

    private static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
        private Application application;
        private Stripe3ds2TransactionContract.Args args;
        private SavedStateHandle savedStateHandle;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;

        private Stripe3ds2TransactionViewModelSubcomponentBuilder(Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl) {
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = stripe3ds2TransactionViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder args(Stripe3ds2TransactionContract.Args args) {
            this.args = (Stripe3ds2TransactionContract.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.args, Stripe3ds2TransactionContract.Args.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            return new Stripe3ds2TransactionViewModelSubcomponentImpl(this.stripe3ds2TransactionViewModelFactoryComponentImpl, new Stripe3dsTransactionViewModelModule(), this.args, this.savedStateHandle, this.application);
        }
    }

    private static final class Stripe3ds2TransactionViewModelSubcomponentImpl implements Stripe3ds2TransactionViewModelSubcomponent {
        private final Application application;
        private final Stripe3ds2TransactionContract.Args args;
        private final SavedStateHandle savedStateHandle;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;
        private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl;
        private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

        private Stripe3ds2TransactionViewModelSubcomponentImpl(Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl, Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Stripe3ds2TransactionContract.Args args, SavedStateHandle savedStateHandle, Application application) {
            this.stripe3ds2TransactionViewModelSubcomponentImpl = this;
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = stripe3ds2TransactionViewModelFactoryComponentImpl;
            this.args = args;
            this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModule;
            this.application = application;
            this.savedStateHandle = savedStateHandle;
        }

        private InitChallengeRepository initChallengeRepository() {
            return C42604x3d138ab7.providesInitChallengeRepository(this.stripe3dsTransactionViewModelModule, this.application, this.args, (CoroutineContext) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideWorkContextProvider.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent
        public Stripe3ds2TransactionViewModel getViewModel() {
            return new Stripe3ds2TransactionViewModel(this.args, this.stripe3ds2TransactionViewModelFactoryComponentImpl.stripeApiRepository(), this.stripe3ds2TransactionViewModelFactoryComponentImpl.defaultAnalyticsRequestExecutor(), this.stripe3ds2TransactionViewModelFactoryComponentImpl.paymentAnalyticsRequestFactory(), (StripeThreeDs2Service) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideStripeThreeDs2ServiceProvider.get(), (MessageVersionRegistry) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideMessageVersionRegistryProvider.get(), (Stripe3ds2ChallengeResultProcessor) this.stripe3ds2TransactionViewModelFactoryComponentImpl.defaultStripe3ds2ChallengeResultProcessorProvider.get(), initChallengeRepository(), (CoroutineContext) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideWorkContextProvider.get(), this.savedStateHandle, this.stripe3ds2TransactionViewModelFactoryComponentImpl.isInstantApp.booleanValue());
        }
    }

    private static final class Stripe3ds2TransactionViewModelFactoryComponentImpl implements Stripe3ds2TransactionViewModelFactoryComponent {
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<Stripe3ds2ChallengeResultProcessor2> defaultStripe3ds2ChallengeResultProcessorProvider;
        private Provider<Boolean> enableLoggingProvider;
        private final Boolean isInstantApp;
        private Provider<LinearRetryDelaySupplier> linearRetryDelaySupplierProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final Set<String> productUsage;
        private Provider<Set<String>> productUsageProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<MessageVersionRegistry> provideMessageVersionRegistryProvider;
        private Provider<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Provider<Function0<String>> publishableKeyProvider2;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private Stripe3ds2TransactionViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Set<String> set, Boolean bool2) {
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = this;
            this.context = context;
            this.publishableKeyProvider = function0;
            this.productUsage = set;
            this.isInstantApp = bool2;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, set, bool2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Set<String> set, Boolean bool2) {
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Factory factoryCreate = InstanceFactory.create(bool);
            this.enableLoggingProvider = factoryCreate;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, factoryCreate));
            Factory factoryCreate2 = InstanceFactory.create(context);
            this.contextProvider = factoryCreate2;
            this.provideStripeThreeDs2ServiceProvider = DoubleCheck.provider((Provider) C42603xd3c74c43.create(factoryCreate2, this.enableLoggingProvider, this.provideWorkContextProvider));
            this.provideMessageVersionRegistryProvider = DoubleCheck.provider((Provider) C42602x9e4b19e0.create());
            this.publishableKeyProvider2 = InstanceFactory.create(function0);
            Factory factoryCreate3 = InstanceFactory.create(set);
            this.productUsageProvider = factoryCreate3;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, factoryCreate3);
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, defaultAnalyticsRequestExecutor_FactoryCreate, this.provideLoggerProvider);
            Provider<LinearRetryDelaySupplier> provider = DoubleCheck.provider((Provider) LinearRetryDelaySupplier_Factory.create());
            this.linearRetryDelaySupplierProvider = provider;
            this.defaultStripe3ds2ChallengeResultProcessorProvider = DoubleCheck.provider((Provider) DefaultStripe3ds2ChallengeResultProcessor_Factory.create(this.stripeApiRepositoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, provider, this.provideLoggerProvider, this.provideWorkContextProvider));
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent
        public Stripe3ds2TransactionViewModelSubcomponent.Builder getSubcomponentBuilder() {
            return new Stripe3ds2TransactionViewModelSubcomponentBuilder(this.stripe3ds2TransactionViewModelFactoryComponentImpl);
        }
    }
}
