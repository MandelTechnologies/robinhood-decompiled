package com.robinhood.store.supportchat.salesforce;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SalesforceCoreClientFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "appContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "configProvider", "Lcom/robinhood/store/supportchat/salesforce/SalesforceConfigProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SalesforceCoreClientFactory_Factory implements Factory<SalesforceCoreClientFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> appContext;
    private final Provider<SalesforceConfigProvider> configProvider;

    @JvmStatic
    public static final SalesforceCoreClientFactory_Factory create(Provider<Context> provider, Provider<SalesforceConfigProvider> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SalesforceCoreClientFactory newInstance(Context context, SalesforceConfigProvider salesforceConfigProvider) {
        return INSTANCE.newInstance(context, salesforceConfigProvider);
    }

    public SalesforceCoreClientFactory_Factory(Provider<Context> appContext, Provider<SalesforceConfigProvider> configProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.appContext = appContext;
        this.configProvider = configProvider;
    }

    @Override // javax.inject.Provider
    public SalesforceCoreClientFactory get() {
        Companion companion = INSTANCE;
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        SalesforceConfigProvider salesforceConfigProvider = this.configProvider.get();
        Intrinsics.checkNotNullExpressionValue(salesforceConfigProvider, "get(...)");
        return companion.newInstance(context, salesforceConfigProvider);
    }

    /* compiled from: SalesforceCoreClientFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory_Factory;", "appContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "configProvider", "Lcom/robinhood/store/supportchat/salesforce/SalesforceConfigProvider;", "newInstance", "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SalesforceCoreClientFactory_Factory create(Provider<Context> appContext, Provider<SalesforceConfigProvider> configProvider) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(configProvider, "configProvider");
            return new SalesforceCoreClientFactory_Factory(appContext, configProvider);
        }

        @JvmStatic
        public final SalesforceCoreClientFactory newInstance(Context appContext, SalesforceConfigProvider configProvider) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(configProvider, "configProvider");
            return new SalesforceCoreClientFactory(appContext, configProvider);
        }
    }
}
