package com.robinhood.android.gold.hub.boost;

import com.robinhood.android.gold.lib.hub.api.ApiGoldSweepHub;
import com.robinhood.android.gold.lib.hub.api.ApiSweepHubRowData;
import com.robinhood.android.gold.lib.hub.api.GoldSegmentedControl;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostSweepHubViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u001f\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;", "", "sweepHubData", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;", "currentTab", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;)V", "getSweepHubData", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;", "getCurrentTab", "()Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "showSegmentedControl", "", "getShowSegmentedControl", "()Z", "isOnJointTab", "rowsToShow", "", "Lcom/robinhood/android/gold/lib/hub/api/ApiSweepHubRowData;", "getRowsToShow", "()Ljava/util/List;", "disclosureMarkdownToShow", "", "getDisclosureMarkdownToShow", "()Ljava/lang/String;", "ctaToShow", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getCtaToShow", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldDepositBoostSweepHubViewState {
    public static final int $stable = 8;
    private final Button<GenericAction> ctaToShow;
    private final GoldDepositBoostTab currentTab;
    private final String disclosureMarkdownToShow;
    private final boolean isOnJointTab;
    private final List<ApiSweepHubRowData> rowsToShow;
    private final boolean showSegmentedControl;
    private final ApiGoldSweepHub sweepHubData;

    /* JADX WARN: Multi-variable type inference failed */
    public GoldDepositBoostSweepHubViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GoldDepositBoostSweepHubViewState copy$default(GoldDepositBoostSweepHubViewState goldDepositBoostSweepHubViewState, ApiGoldSweepHub apiGoldSweepHub, GoldDepositBoostTab goldDepositBoostTab, int i, Object obj) {
        if ((i & 1) != 0) {
            apiGoldSweepHub = goldDepositBoostSweepHubViewState.sweepHubData;
        }
        if ((i & 2) != 0) {
            goldDepositBoostTab = goldDepositBoostSweepHubViewState.currentTab;
        }
        return goldDepositBoostSweepHubViewState.copy(apiGoldSweepHub, goldDepositBoostTab);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiGoldSweepHub getSweepHubData() {
        return this.sweepHubData;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldDepositBoostTab getCurrentTab() {
        return this.currentTab;
    }

    public final GoldDepositBoostSweepHubViewState copy(ApiGoldSweepHub sweepHubData, GoldDepositBoostTab currentTab) {
        Intrinsics.checkNotNullParameter(currentTab, "currentTab");
        return new GoldDepositBoostSweepHubViewState(sweepHubData, currentTab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDepositBoostSweepHubViewState)) {
            return false;
        }
        GoldDepositBoostSweepHubViewState goldDepositBoostSweepHubViewState = (GoldDepositBoostSweepHubViewState) other;
        return Intrinsics.areEqual(this.sweepHubData, goldDepositBoostSweepHubViewState.sweepHubData) && this.currentTab == goldDepositBoostSweepHubViewState.currentTab;
    }

    public int hashCode() {
        ApiGoldSweepHub apiGoldSweepHub = this.sweepHubData;
        return ((apiGoldSweepHub == null ? 0 : apiGoldSweepHub.hashCode()) * 31) + this.currentTab.hashCode();
    }

    public String toString() {
        return "GoldDepositBoostSweepHubViewState(sweepHubData=" + this.sweepHubData + ", currentTab=" + this.currentTab + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoldDepositBoostSweepHubViewState(ApiGoldSweepHub apiGoldSweepHub, GoldDepositBoostTab currentTab) {
        List<ApiSweepHubRowData> rows;
        String disclosureMarkdown;
        List<GoldSegmentedControl> segmentedControl;
        Intrinsics.checkNotNullParameter(currentTab, "currentTab");
        this.sweepHubData = apiGoldSweepHub;
        this.currentTab = currentTab;
        Button<GenericAction> cta = null;
        boolean z = false;
        boolean z2 = ((apiGoldSweepHub != null ? apiGoldSweepHub.getSegmentedControl() : null) == null || (segmentedControl = apiGoldSweepHub.getSegmentedControl()) == null || segmentedControl.size() != 2) ? false : true;
        this.showSegmentedControl = z2;
        if (z2 && currentTab == GoldDepositBoostTab.JOINT) {
            z = true;
        }
        this.isOnJointTab = z;
        if (z) {
            rows = apiGoldSweepHub != null ? apiGoldSweepHub.getJointAccountRows() : null;
        } else if (apiGoldSweepHub != null) {
            rows = apiGoldSweepHub.getRows();
        }
        this.rowsToShow = rows;
        if (z) {
            disclosureMarkdown = apiGoldSweepHub != null ? apiGoldSweepHub.getJointAccountDisclosureMarkdown() : null;
        } else if (apiGoldSweepHub != null) {
            disclosureMarkdown = apiGoldSweepHub.getDisclosureMarkdown();
        }
        this.disclosureMarkdownToShow = disclosureMarkdown;
        if (z) {
            if (apiGoldSweepHub != null) {
                cta = apiGoldSweepHub.getJointAccountCta();
            }
        } else if (apiGoldSweepHub != null) {
            cta = apiGoldSweepHub.getCta();
        }
        this.ctaToShow = cta;
    }

    public final ApiGoldSweepHub getSweepHubData() {
        return this.sweepHubData;
    }

    public /* synthetic */ GoldDepositBoostSweepHubViewState(ApiGoldSweepHub apiGoldSweepHub, GoldDepositBoostTab goldDepositBoostTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiGoldSweepHub, (i & 2) != 0 ? GoldDepositBoostTab.INDIVIDUAL : goldDepositBoostTab);
    }

    public final GoldDepositBoostTab getCurrentTab() {
        return this.currentTab;
    }

    public final boolean getShowSegmentedControl() {
        return this.showSegmentedControl;
    }

    public final List<ApiSweepHubRowData> getRowsToShow() {
        return this.rowsToShow;
    }

    public final String getDisclosureMarkdownToShow() {
        return this.disclosureMarkdownToShow;
    }

    public final Button<GenericAction> getCtaToShow() {
        return this.ctaToShow;
    }
}
