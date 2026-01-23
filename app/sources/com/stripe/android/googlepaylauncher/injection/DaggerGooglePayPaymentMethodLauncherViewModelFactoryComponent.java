package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.Config;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayRepository2;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory2;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent {
    public static GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Config googlePayConfig;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder googlePayConfig(Config config) {
            this.googlePayConfig = (Config) Preconditions.checkNotNull(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public GooglePayPaymentMethodLauncherViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.enableLogging, Boolean.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.stripeAccountIdProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.googlePayConfig, Config.class);
            return new GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.googlePayConfig);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContractV2.Args args;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private SavedStateHandle savedStateHandle;

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder args(GooglePayPaymentMethodLauncherContractV2.Args args) {
            this.args = (GooglePayPaymentMethodLauncherContractV2.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.args, GooglePayPaymentMethodLauncherContractV2.Args.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, this.args, this.savedStateHandle);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
        private final GooglePayPaymentMethodLauncherContractV2.Args args;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final SavedStateHandle savedStateHandle;

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, GooglePayPaymentMethodLauncherContractV2.Args args, SavedStateHandle savedStateHandle) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
            this.args = args;
            this.savedStateHandle = savedStateHandle;
        }

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.publishableKeyProvider, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeAccountIdProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((PaymentsClient) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.providePaymentsClientProvider.get(), options(), this.args, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeApiRepository(), (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.googlePayJsonFactoryProvider.get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.defaultGooglePayRepositoryProvider.get(), this.savedStateHandle);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl implements GooglePayPaymentMethodLauncherViewModelFactoryComponent {
        private Provider<PaymentsClientFactory> bindsPaymentsClientFactoryProvider;
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<GooglePayRepository2> defaultGooglePayRepositoryProvider;
        private Provider<PaymentsClientFactory2> defaultPaymentsClientFactoryProvider;
        private Provider<Boolean> enableLoggingProvider;
        private Provider<Config> googlePayConfigProvider;
        private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private final Set<String> productUsage;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentsClient> providePaymentsClientProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Provider<Function0<String>> publishableKeyProvider2;
        private final Function0<String> stripeAccountIdProvider;
        private Provider<Function0<String>> stripeAccountIdProvider2;

        private GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, Config config) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = this;
            this.publishableKeyProvider = function0;
            this.stripeAccountIdProvider = function02;
            this.context = context;
            this.productUsage = set;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, function02, set, config);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, Config config) {
            this.googlePayConfigProvider = InstanceFactory.create(config);
            Factory factoryCreate = InstanceFactory.create(context);
            this.contextProvider = factoryCreate;
            DefaultPaymentsClientFactory_Factory defaultPaymentsClientFactory_FactoryCreate = DefaultPaymentsClientFactory_Factory.create(factoryCreate);
            this.defaultPaymentsClientFactoryProvider = defaultPaymentsClientFactory_FactoryCreate;
            Provider<PaymentsClientFactory> provider = DoubleCheck.provider((Provider) defaultPaymentsClientFactory_FactoryCreate);
            this.bindsPaymentsClientFactoryProvider = provider;
            this.providePaymentsClientProvider = DoubleCheck.provider((Provider) C42541x4898f21f.create(this.googlePayConfigProvider, provider));
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Factory factoryCreate2 = InstanceFactory.create(bool);
            this.enableLoggingProvider = factoryCreate2;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, factoryCreate2));
            this.publishableKeyProvider2 = InstanceFactory.create(function0);
            Factory factoryCreate3 = InstanceFactory.create(function02);
            this.stripeAccountIdProvider2 = factoryCreate3;
            this.googlePayJsonFactoryProvider = DoubleCheck.provider((Provider) GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, factoryCreate3, this.googlePayConfigProvider));
            this.defaultGooglePayRepositoryProvider = DoubleCheck.provider((Provider) DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, this.provideLoggerProvider));
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent
        public GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubcomponentBuilder() {
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl);
        }
    }
}
