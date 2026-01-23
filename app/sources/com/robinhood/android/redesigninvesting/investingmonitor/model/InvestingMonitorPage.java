package com.robinhood.android.redesigninvesting.investingmonitor.model;

import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: InvestingMonitorPage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "", "tabTitle", "", "assets", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/models/db/CuratedList;)V", "getTabTitle", "()Ljava/lang/String;", "getAssets", "()Lkotlinx/collections/immutable/PersistentList;", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestingMonitorPage {
    public static final int $stable = 8;
    private final ImmutableList3<InvestingMonitorAsset> assets;
    private final CuratedList curatedList;
    private final String tabTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestingMonitorPage copy$default(InvestingMonitorPage investingMonitorPage, String str, ImmutableList3 immutableList3, CuratedList curatedList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investingMonitorPage.tabTitle;
        }
        if ((i & 2) != 0) {
            immutableList3 = investingMonitorPage.assets;
        }
        if ((i & 4) != 0) {
            curatedList = investingMonitorPage.curatedList;
        }
        return investingMonitorPage.copy(str, immutableList3, curatedList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    public final ImmutableList3<InvestingMonitorAsset> component2() {
        return this.assets;
    }

    /* renamed from: component3, reason: from getter */
    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    public final InvestingMonitorPage copy(String tabTitle, ImmutableList3<InvestingMonitorAsset> assets, CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(tabTitle, "tabTitle");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        return new InvestingMonitorPage(tabTitle, assets, curatedList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestingMonitorPage)) {
            return false;
        }
        InvestingMonitorPage investingMonitorPage = (InvestingMonitorPage) other;
        return Intrinsics.areEqual(this.tabTitle, investingMonitorPage.tabTitle) && Intrinsics.areEqual(this.assets, investingMonitorPage.assets) && Intrinsics.areEqual(this.curatedList, investingMonitorPage.curatedList);
    }

    public int hashCode() {
        return (((this.tabTitle.hashCode() * 31) + this.assets.hashCode()) * 31) + this.curatedList.hashCode();
    }

    public String toString() {
        return "InvestingMonitorPage(tabTitle=" + this.tabTitle + ", assets=" + this.assets + ", curatedList=" + this.curatedList + ")";
    }

    public InvestingMonitorPage(String tabTitle, ImmutableList3<InvestingMonitorAsset> assets, CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(tabTitle, "tabTitle");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        this.tabTitle = tabTitle;
        this.assets = assets;
        this.curatedList = curatedList;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public final ImmutableList3<InvestingMonitorAsset> getAssets() {
        return this.assets;
    }

    public final CuratedList getCuratedList() {
        return this.curatedList;
    }
}
