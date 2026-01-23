package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: CreateTransferDisclosure.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onInfoButtonClicked", "", "action", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "onLinkClicked", "url", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureCallbacks, reason: use source file name */
/* loaded from: classes9.dex */
public interface CreateTransferDisclosure2 extends SduiActionHandler<GenericAction> {
    void onInfoButtonClicked(CreateTransferDisclosure.Action action);

    void onLinkClicked(String url);
}
