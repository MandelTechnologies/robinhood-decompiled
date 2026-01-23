package com.robinhood.android.retirement.p239ui.contributions;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;

/* compiled from: Contributions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsHeaderCallbacks;", "onBackClicked", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface Contributions2 extends SduiActionHandler<GenericAction>, CombinedContributionHeader4 {
    void onBackClicked();
}
