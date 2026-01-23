package com.robinhood.android.retirement.partnerships.details;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
import kotlin.Metadata;

/* compiled from: RetirementPartnershipsDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailScreenCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementPartnershipDetailAction;", "onRefreshClick", "", "onBackClick", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementPartnershipsDetailScreen3 extends SduiActionHandler<RetirementPartnershipDetailAction> {
    void onBackClick();

    void onRefreshClick();
}
