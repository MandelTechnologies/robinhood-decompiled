package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: RecsRetirementPortfolioContent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J*\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0015H&¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onRowExpanded", "", "assetId", "Ljava/util/UUID;", "onRowCollapsed", "onLearnMoreClicked", "allocation", "", "title", "", ResourceTypes.COLOR, "onProspectusClicked", "prospectus", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$Prospectus;", "onContinueClicked", "assetIds", "", "allocationMap", "", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioCallbacks, reason: use source file name */
/* loaded from: classes11.dex */
public interface RecsRetirementPortfolioContent3 extends SduiActionHandler<GenericAction> {
    void onContinueClicked(List<UUID> assetIds, Map<UUID, Float> allocationMap);

    void onLearnMoreClicked(UUID assetId, float allocation, String title, String color);

    void onProspectusClicked(ApiRecsRetirementPortfolio.Prospectus prospectus);

    void onRowCollapsed();

    void onRowExpanded(UUID assetId);
}
