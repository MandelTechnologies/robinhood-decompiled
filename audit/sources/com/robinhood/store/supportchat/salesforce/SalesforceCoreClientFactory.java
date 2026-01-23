package com.robinhood.store.supportchat.salesforce;

import android.content.Context;
import com.salesforce.android.smi.core.CoreClient;
import com.salesforce.android.smi.core.CoreConfiguration;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SalesforceCoreClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "", "appContext", "Landroid/content/Context;", "configProvider", "Lcom/robinhood/store/supportchat/salesforce/SalesforceConfigProvider;", "<init>", "(Landroid/content/Context;Lcom/robinhood/store/supportchat/salesforce/SalesforceConfigProvider;)V", "createCoreClient", "Lcom/salesforce/android/smi/core/CoreClient;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SalesforceCoreClientFactory {
    private final Context appContext;
    private final SalesforceConfigProvider configProvider;

    public SalesforceCoreClientFactory(Context appContext, SalesforceConfigProvider configProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.appContext = appContext;
        this.configProvider = configProvider;
    }

    public final CoreClient createCoreClient() throws IOException {
        InputStream inputStreamOpen = this.appContext.getAssets().open(this.configProvider.getSalesforceConfigAssetFilename());
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return CoreClient.INSTANCE.getFactory().create(this.appContext, CoreConfiguration.Companion.fromInputStream$default(CoreConfiguration.INSTANCE, inputStreamOpen, true, null, 4, null));
    }
}
