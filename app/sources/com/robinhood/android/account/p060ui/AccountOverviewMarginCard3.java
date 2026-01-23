package com.robinhood.android.account.p060ui;

import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AccountOverviewMarginCard.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionCallbacks;", "", "onSwitchToMarginAccountClicked", "", "inputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "showMarginTerminologyDialog", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.MarginSectionCallbacks, reason: use source file name */
/* loaded from: classes24.dex */
public interface AccountOverviewMarginCard3 {
    void onSwitchToMarginAccountClicked(Map<String, ? extends JsonPrimitive<?>> inputParams);

    void showMarginTerminologyDialog();
}
