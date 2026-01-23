package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.ApiRequest_Options_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class DaggerPaymentLauncherViewModelFactoryComponent {
    public static PaymentLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements PaymentLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Boolean includePaymentSheetNextHandlers;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder includePaymentSheetNextHandlers(boolean z) {
            this.includePaymentSheetNextHandlers = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public PaymentLauncherViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.enableLogging, Boolean.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.stripeAccountIdProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.includePaymentSheetNextHandlers, Boolean.class);
            return new PaymentLauncherViewModelFactoryComponentImpl(new PaymentLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.includePaymentSheetNextHandlers);
        }
    }

    private static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
        private Boolean isPaymentIntent;
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private SavedStateHandle savedStateHandle;

        private PaymentLauncherViewModelSubcomponentBuilder(PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl) {
            this.paymentLauncherViewModelFactoryComponentImpl = paymentLauncherViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder isPaymentIntent(boolean z) {
            this.isPaymentIntent = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.isPaymentIntent, Boolean.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new PaymentLauncherViewModelSubcomponentImpl(this.paymentLauncherViewModelFactoryComponentImpl, this.isPaymentIntent, this.savedStateHandle);
        }
    }

    private static final class PaymentLauncherViewModelSubcomponentImpl implements PaymentLauncherViewModelSubcomponent {
        private final Boolean isPaymentIntent;
        private Provider<ApiRequest.Options> optionsProvider;
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl;
        private final SavedStateHandle savedStateHandle;

        private PaymentLauncherViewModelSubcomponentImpl(PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl, Boolean bool, SavedStateHandle savedStateHandle) {
            this.paymentLauncherViewModelSubcomponentImpl = this;
            this.paymentLauncherViewModelFactoryComponentImpl = paymentLauncherViewModelFactoryComponentImpl;
            this.isPaymentIntent = bool;
            this.savedStateHandle = savedStateHandle;
            initialize(bool, savedStateHandle);
        }

        private void initialize(Boolean bool, SavedStateHandle savedStateHandle) {
            this.optionsProvider = ApiRequest_Options_Factory.create(this.paymentLauncherViewModelFactoryComponentImpl.publishableKeyProvider2, this.paymentLauncherViewModelFactoryComponentImpl.stripeAccountIdProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent
        public PaymentLauncherViewModel getViewModel() {
            return new PaymentLauncherViewModel(this.isPaymentIntent.booleanValue(), this.paymentLauncherViewModelFactoryComponentImpl.stripeApiRepository(), (PaymentNextActionHandlerRegistry) this.paymentLauncherViewModelFactoryComponentImpl.providePaymentNextActionHandlerRegistryProvider.get(), (DefaultReturnUrl) this.paymentLauncherViewModelFactoryComponentImpl.provideDefaultReturnUrlProvider.get(), this.optionsProvider, (Map) this.paymentLauncherViewModelFactoryComponentImpl.provideThreeDs1IntentReturnUrlMapProvider.get(), DoubleCheck.lazy(this.paymentLauncherViewModelFactoryComponentImpl.paymentIntentFlowResultProcessorProvider), DoubleCheck.lazy(this.paymentLauncherViewModelFactoryComponentImpl.setupIntentFlowResultProcessorProvider), this.paymentLauncherViewModelFactoryComponentImpl.defaultAnalyticsRequestExecutor(), this.paymentLauncherViewModelFactoryComponentImpl.paymentAnalyticsRequestFactory(), (CoroutineContext) this.paymentLauncherViewModelFactoryComponentImpl.provideUIContextProvider.get(), this.savedStateHandle, this.paymentLauncherViewModelFactoryComponentImpl.namedBoolean());
        }
    }

    private static final class PaymentLauncherViewModelFactoryComponentImpl implements PaymentLauncherViewModelFactoryComponent {
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<Boolean> enableLoggingProvider;
        private Provider<Boolean> includePaymentSheetNextHandlersProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
        private final PaymentLauncherModule paymentLauncherModule;
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private final Set<String> productUsage;
        private Provider<Set<String>> productUsageProvider;
        private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;
        private Provider<Boolean> provideIsInstantAppProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentNextActionHandlerRegistry> providePaymentNextActionHandlerRegistryProvider;
        private Provider<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;
        private Provider<CoroutineContext> provideUIContextProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Provider<Function0<String>> publishableKeyProvider2;
        private Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
        private Provider<Function0<String>> stripeAccountIdProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private PaymentLauncherViewModelFactoryComponentImpl(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, Boolean bool2) {
            this.paymentLauncherViewModelFactoryComponentImpl = this;
            this.context = context;
            this.publishableKeyProvider = function0;
            this.productUsage = set;
            this.paymentLauncherModule = paymentLauncherModule;
            initialize(paymentLauncherModule, coroutineContextModule, coreCommonModule, context, bool, function0, function02, set, bool2);
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean namedBoolean() {
            return this.paymentLauncherModule.provideIsInstantApp(this.context);
        }

        private void initialize(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, Boolean bool2) {
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Factory factoryCreate = InstanceFactory.create(bool);
            this.enableLoggingProvider = factoryCreate;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, factoryCreate));
            this.contextProvider = InstanceFactory.create(context);
            this.provideUIContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            this.provideThreeDs1IntentReturnUrlMapProvider = DoubleCheck.provider((Provider) PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModule));
            this.publishableKeyProvider2 = InstanceFactory.create(function0);
            Factory factoryCreate2 = InstanceFactory.create(set);
            this.productUsageProvider = factoryCreate2;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, factoryCreate2);
            this.provideIsInstantAppProvider = PaymentLauncherModule_ProvideIsInstantAppFactory.create(paymentLauncherModule, this.contextProvider);
            Factory factoryCreate3 = InstanceFactory.create(bool2);
            this.includePaymentSheetNextHandlersProvider = factoryCreate3;
            this.providePaymentNextActionHandlerRegistryProvider = DoubleCheck.provider((Provider) C42600xce15ca5e.create(paymentLauncherModule, this.contextProvider, this.enableLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.provideThreeDs1IntentReturnUrlMapProvider, this.paymentAnalyticsRequestFactoryProvider, this.publishableKeyProvider2, this.productUsageProvider, this.provideIsInstantAppProvider, factoryCreate3));
            this.provideDefaultReturnUrlProvider = DoubleCheck.provider((Provider) PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModule, this.contextProvider));
            this.stripeAccountIdProvider = InstanceFactory.create(function02);
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            StripeApiRepository_Factory stripeApiRepository_FactoryCreate = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, defaultAnalyticsRequestExecutor_FactoryCreate, this.provideLoggerProvider);
            this.stripeApiRepositoryProvider = stripeApiRepository_FactoryCreate;
            this.paymentIntentFlowResultProcessorProvider = DoubleCheck.provider((Provider) PaymentIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, stripeApiRepository_FactoryCreate, this.provideLoggerProvider, this.provideWorkContextProvider));
            this.setupIntentFlowResultProcessorProvider = DoubleCheck.provider((Provider) SetupIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider));
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent
        public PaymentLauncherViewModelSubcomponent.Builder getViewModelSubcomponentBuilder() {
            return new PaymentLauncherViewModelSubcomponentBuilder(this.paymentLauncherViewModelFactoryComponentImpl);
        }
    }
}
