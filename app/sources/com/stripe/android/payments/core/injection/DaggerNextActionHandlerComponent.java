package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry_Factory;
import com.stripe.android.payments.core.authentication.NoOpIntentNextActionHandler;
import com.stripe.android.payments.core.authentication.NoOpIntentNextActionHandler_Factory;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.RealRedirectResolver_Factory;
import com.stripe.android.payments.core.authentication.SourceNextActionHandler;
import com.stripe.android.payments.core.authentication.SourceNextActionHandler_Factory;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler_Factory;
import com.stripe.android.payments.core.authentication.VoucherNextActionHandler;
import com.stripe.android.payments.core.authentication.VoucherNextActionHandler_Factory;
import com.stripe.android.payments.core.authentication.WebIntentNextActionHandler;
import com.stripe.android.payments.core.authentication.WebIntentNextActionHandler_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler_Factory;
import com.stripe.android.payments.core.injection.NextActionHandlerComponent;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes22.dex */
public final class DaggerNextActionHandlerComponent {
    public static NextActionHandlerComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements NextActionHandlerComponent.Builder {
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private Boolean includePaymentSheetNextActionHandlers;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Map<String, String> threeDs1IntentReturnUrlMap;
        private CoroutineContext uiContext;
        private CoroutineContext workContext;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public /* bridge */ /* synthetic */ NextActionHandlerComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public /* bridge */ /* synthetic */ NextActionHandlerComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public /* bridge */ /* synthetic */ NextActionHandlerComponent.Builder threeDs1IntentReturnUrlMap(Map map) {
            return threeDs1IntentReturnUrlMap((Map<String, String>) map);
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) Preconditions.checkNotNull(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder workContext(CoroutineContext coroutineContext) {
            this.workContext = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder uiContext(CoroutineContext coroutineContext) {
            this.uiContext = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder threeDs1IntentReturnUrlMap(Map<String, String> map) {
            this.threeDs1IntentReturnUrlMap = (Map) Preconditions.checkNotNull(map);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder isInstantApp(boolean z) {
            this.isInstantApp = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public Builder includePaymentSheetNextActionHandlers(boolean z) {
            this.includePaymentSheetNextActionHandlers = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent.Builder
        public NextActionHandlerComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            Preconditions.checkBuilderRequirement(this.enableLogging, Boolean.class);
            Preconditions.checkBuilderRequirement(this.workContext, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.uiContext, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.threeDs1IntentReturnUrlMap, Map.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.isInstantApp, Boolean.class);
            Preconditions.checkBuilderRequirement(this.includePaymentSheetNextActionHandlers, Boolean.class);
            return new NextActionHandlerComponentImpl(new WeChatPayNextActionHandlerModule(), new CoreCommonModule(), this.context, this.analyticsRequestFactory, this.enableLogging, this.workContext, this.uiContext, this.threeDs1IntentReturnUrlMap, this.publishableKeyProvider, this.productUsage, this.isInstantApp, this.includePaymentSheetNextActionHandlers);
        }
    }

    private static final class NextActionHandlerComponentImpl implements NextActionHandlerComponent {
        private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
        private Provider<Context> contextProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultPaymentNextActionHandlerRegistry> defaultPaymentNextActionHandlerRegistryProvider;
        private Provider<Boolean> enableLoggingProvider;
        private Provider<Boolean> includePaymentSheetNextActionHandlersProvider;

        /* renamed from: intentAuthenticatorMapMapOfClassOfAndPaymentNextActionHandlerOfStripeIntentProvider */
        private Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>> f6420xd882722;
        private Provider<Boolean> isInstantAppProvider;
        private final NextActionHandlerComponentImpl nextActionHandlerComponentImpl;
        private Provider<NoOpIntentNextActionHandler> noOpIntentNextActionHandlerProvider;
        private Provider<Set<String>> productUsageProvider;
        private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentAuthConfig> providePaymentAuthConfigProvider;
        private Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> providePaymentBrowserAuthStarterFactoryProvider;
        private Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> providePaymentRelayStarterFactoryProvider;
        private Provider<PaymentNextActionHandler<StripeIntent>> provideWeChatNextActionHandler$payments_core_releaseProvider;
        private Provider<Function0<String>> publishableKeyProvider;
        private Provider<SourceNextActionHandler> sourceNextActionHandlerProvider;
        private Provider<Stripe3DS2NextActionHandler> stripe3DS2NextActionHandlerProvider;
        private Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
        private Provider<CoroutineContext> uiContextProvider;
        private Provider<UnsupportedNextActionHandler> unsupportedNextActionHandlerProvider;
        private Provider<VoucherNextActionHandler> voucherNextActionHandlerProvider;
        private Provider<WebIntentNextActionHandler> webIntentNextActionHandlerProvider;
        private Provider<CoroutineContext> workContextProvider;

        private NextActionHandlerComponentImpl(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, CoreCommonModule coreCommonModule, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, Function0<String> function0, Set<String> set, Boolean bool2, Boolean bool3) {
            this.nextActionHandlerComponentImpl = this;
            initialize(weChatPayNextActionHandlerModule, coreCommonModule, context, paymentAnalyticsRequestFactory, bool, coroutineContext, coroutineContext2, map, function0, set, bool2, bool3);
        }

        private void initialize(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, CoreCommonModule coreCommonModule, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, Function0<String> function0, Set<String> set, Boolean bool2, Boolean bool3) {
            DelegateFactory delegateFactory = new DelegateFactory();
            this.defaultPaymentNextActionHandlerRegistryProvider = delegateFactory;
            Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> provider = DoubleCheck.provider((Provider) C42599x94a494e8.create(delegateFactory));
            this.providePaymentRelayStarterFactoryProvider = provider;
            this.noOpIntentNextActionHandlerProvider = DoubleCheck.provider((Provider) NoOpIntentNextActionHandler_Factory.create(provider));
            Factory factoryCreate = InstanceFactory.create(context);
            this.contextProvider = factoryCreate;
            Provider<DefaultReturnUrl> provider2 = DoubleCheck.provider((Provider) NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory.create(factoryCreate));
            this.provideDefaultReturnUrlProvider = provider2;
            this.providePaymentBrowserAuthStarterFactoryProvider = DoubleCheck.provider((Provider) C42598xe959d869.create(this.defaultPaymentNextActionHandlerRegistryProvider, provider2));
            Factory factoryCreate2 = InstanceFactory.create(bool);
            this.enableLoggingProvider = factoryCreate2;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, factoryCreate2));
            Factory factoryCreate3 = InstanceFactory.create(coroutineContext);
            this.workContextProvider = factoryCreate3;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, factoryCreate3);
            this.analyticsRequestFactoryProvider = InstanceFactory.create(paymentAnalyticsRequestFactory);
            this.uiContextProvider = InstanceFactory.create(coroutineContext2);
            this.publishableKeyProvider = InstanceFactory.create(function0);
            Factory factoryCreate4 = InstanceFactory.create(bool2);
            this.isInstantAppProvider = factoryCreate4;
            this.sourceNextActionHandlerProvider = DoubleCheck.provider((Provider) SourceNextActionHandler_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.providePaymentRelayStarterFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, this.publishableKeyProvider, factoryCreate4));
            Provider<UnsupportedNextActionHandler> provider3 = DoubleCheck.provider((Provider) UnsupportedNextActionHandler_Factory.create(this.providePaymentRelayStarterFactoryProvider));
            this.unsupportedNextActionHandlerProvider = provider3;
            this.provideWeChatNextActionHandler$payments_core_releaseProvider = C42605xef1d3027.create(weChatPayNextActionHandlerModule, provider3);
            Factory factoryCreate5 = InstanceFactory.create(map);
            this.threeDs1IntentReturnUrlMapProvider = factoryCreate5;
            Provider<WebIntentNextActionHandler> provider4 = DoubleCheck.provider((Provider) WebIntentNextActionHandler_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, factoryCreate5, this.publishableKeyProvider, this.isInstantAppProvider, this.provideDefaultReturnUrlProvider, RealRedirectResolver_Factory.create()));
            this.webIntentNextActionHandlerProvider = provider4;
            this.voucherNextActionHandlerProvider = DoubleCheck.provider((Provider) VoucherNextActionHandler_Factory.create(provider4, this.noOpIntentNextActionHandlerProvider, this.contextProvider));
            this.providePaymentAuthConfigProvider = DoubleCheck.provider((Provider) C42601x700f45a1.create());
            Factory factoryCreate6 = InstanceFactory.create(set);
            this.productUsageProvider = factoryCreate6;
            this.stripe3DS2NextActionHandlerProvider = DoubleCheck.provider((Provider) Stripe3DS2NextActionHandler_Factory.create(this.providePaymentAuthConfigProvider, this.enableLoggingProvider, this.publishableKeyProvider, factoryCreate6));
            this.f6420xd882722 = MapFactory.builder(11).put((MapFactory.Builder) StripeIntent.NextActionData.WeChatPayRedirect.class, (Provider) this.provideWeChatNextActionHandler$payments_core_releaseProvider).put((MapFactory.Builder) StripeIntent.NextActionData.SdkData.Use3DS1.class, (Provider) this.webIntentNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.RedirectToUrl.class, (Provider) this.webIntentNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.AlipayRedirect.class, (Provider) this.webIntentNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.DisplayMultibancoDetails.class, (Provider) this.voucherNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.DisplayOxxoDetails.class, (Provider) this.voucherNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.DisplayKonbiniDetails.class, (Provider) this.voucherNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.DisplayBoletoDetails.class, (Provider) this.voucherNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.CashAppRedirect.class, (Provider) this.webIntentNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.SwishRedirect.class, (Provider) this.webIntentNextActionHandlerProvider).put((MapFactory.Builder) StripeIntent.NextActionData.SdkData.Use3DS2.class, (Provider) this.stripe3DS2NextActionHandlerProvider).build();
            Factory factoryCreate7 = InstanceFactory.create(bool3);
            this.includePaymentSheetNextActionHandlersProvider = factoryCreate7;
            DelegateFactory.setDelegate(this.defaultPaymentNextActionHandlerRegistryProvider, DoubleCheck.provider((Provider) DefaultPaymentNextActionHandlerRegistry_Factory.create(this.noOpIntentNextActionHandlerProvider, this.sourceNextActionHandlerProvider, this.f6420xd882722, factoryCreate7, this.contextProvider)));
        }

        @Override // com.stripe.android.payments.core.injection.NextActionHandlerComponent
        public DefaultPaymentNextActionHandlerRegistry getRegistry() {
            return this.defaultPaymentNextActionHandlerRegistryProvider.get();
        }
    }
}
