package com.robinhood.transfers.api.accounts;

import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DDBrokerageRoutingDetailsResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/api/accounts/DDBrokerageRoutingDetailsResponse;", "", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/DirectDepositToBrokeragePageAction;", "footer_content", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getFooter_content", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DDBrokerageRoutingDetailsResponse {
    private final List<UIComponent<DirectDepositToBrokeragePageAction>> content;
    private final List<UIComponent<DirectDepositToBrokeragePageAction>> footer_content;

    /* JADX WARN: Multi-variable type inference failed */
    public DDBrokerageRoutingDetailsResponse(List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> content, List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> footer_content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer_content, "footer_content");
        this.content = content;
        this.footer_content = footer_content;
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> getContent() {
        return this.content;
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> getFooter_content() {
        return this.footer_content;
    }
}
