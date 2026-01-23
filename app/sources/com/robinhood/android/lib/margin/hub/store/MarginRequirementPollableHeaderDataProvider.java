package com.robinhood.android.lib.margin.hub.store;

import com.robinhood.models.serverdriven.experimental.api.ScreenerAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginRequirementPollableHeaderDataProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/store/MarginRequirementPollableHeaderDataProvider;", "", "streamHeaderData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerAction;", "accountNumber", "", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginRequirementPollableHeaderDataProvider {
    Flow<UIComponent<ScreenerAction>> streamHeaderData(String accountNumber);
}
