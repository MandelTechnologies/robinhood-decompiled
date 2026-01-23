package com.robinhood.android.lib.margin.hub.store;

import com.robinhood.models.serverdriven.experimental.api.MarginRequirementPollableColumnIdentifier;
import com.robinhood.models.serverdriven.experimental.api.ScreenerAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginRequirementPollableLabelDataProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/store/MarginRequirementPollableLabelDataProvider;", "", "streamRowData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerAction;", "accountNumber", "", "rowIdentifier", "columnIdentifier", "Lcom/robinhood/models/serverdriven/experimental/api/MarginRequirementPollableColumnIdentifier;", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginRequirementPollableLabelDataProvider {
    Flow<UIComponent<ScreenerAction>> streamRowData(String accountNumber, String rowIdentifier, MarginRequirementPollableColumnIdentifier columnIdentifier);
}
