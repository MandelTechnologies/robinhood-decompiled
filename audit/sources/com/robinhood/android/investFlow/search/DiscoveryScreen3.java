package com.robinhood.android.investFlow.search;

import com.robinhood.android.investFlow.search.item.DiscoveryItems;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;

/* compiled from: DiscoveryScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoveryCallbacks;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onRetryClicked", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.DiscoveryCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface DiscoveryScreen3 extends DiscoveryItems, SduiActionHandler<GenericAction> {
    void onRetryClicked();
}
