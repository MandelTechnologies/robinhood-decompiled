package com.plaid.link.result;

import android.content.Intent;
import com.plaid.link.OpenPlaidLink;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/plaid/link/result/LinkResultHandler;", "", "onSuccess", "Lkotlin/Function1;", "Lcom/plaid/link/result/LinkSuccess;", "", "onExit", "Lcom/plaid/link/result/LinkExit;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onActivityResult", "", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public class LinkResultHandler {
    private final Function1<LinkExit, Unit> onExit;
    private final Function1<LinkSuccess, Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkResultHandler(Function1<? super LinkSuccess, Unit> onSuccess, Function1<? super LinkExit, Unit> onExit) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        this.onSuccess = onSuccess;
        this.onExit = onExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 3364) {
            return false;
        }
        LinkResult result = new OpenPlaidLink().parseResult(resultCode, data);
        if (result instanceof LinkSuccess) {
            this.onSuccess.invoke(result);
            return true;
        }
        if (!(result instanceof LinkExit)) {
            return true;
        }
        this.onExit.invoke(result);
        return true;
    }
}
