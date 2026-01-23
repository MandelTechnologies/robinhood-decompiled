package com.robinhood.store.supportchat.salesforce;

import kotlin.Metadata;

/* compiled from: ProdSalesforceConfigProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/ProdSalesforceConfigProvider;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceConfigProvider;", "<init>", "()V", "getSalesforceConfigAssetFilename", "", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ProdSalesforceConfigProvider implements SalesforceConfigProvider {
    @Override // com.robinhood.store.supportchat.salesforce.SalesforceConfigProvider
    public String getSalesforceConfigAssetFilename() {
        return "salesforce_prod_messaging_config.json";
    }
}
