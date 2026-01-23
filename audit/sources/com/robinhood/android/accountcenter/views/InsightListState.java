package com.robinhood.android.accountcenter.views;

import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/InsightListState;", "", "displayText", "", "infoDisplayTitle", "Lcom/robinhood/models/serverdriven/db/RichText;", "infoDisplayDescription", "insightList", "", "Lcom/robinhood/android/accountcenter/views/InsightItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;Ljava/util/List;)V", "getDisplayText", "()Ljava/lang/String;", "getInfoDisplayTitle", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getInfoDisplayDescription", "getInsightList", "()Ljava/util/List;", "showInfoIcon", "", "getShowInfoIcon", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class InsightListState {
    public static final int $stable = 8;
    private final String displayText;
    private final RichText infoDisplayDescription;
    private final RichText infoDisplayTitle;
    private final List<InsightItem> insightList;
    private final boolean showInfoIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsightListState copy$default(InsightListState insightListState, String str, RichText richText, RichText richText2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insightListState.displayText;
        }
        if ((i & 2) != 0) {
            richText = insightListState.infoDisplayTitle;
        }
        if ((i & 4) != 0) {
            richText2 = insightListState.infoDisplayDescription;
        }
        if ((i & 8) != 0) {
            list = insightListState.insightList;
        }
        return insightListState.copy(str, richText, richText2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getInfoDisplayTitle() {
        return this.infoDisplayTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final RichText getInfoDisplayDescription() {
        return this.infoDisplayDescription;
    }

    public final List<InsightItem> component4() {
        return this.insightList;
    }

    public final InsightListState copy(String displayText, RichText infoDisplayTitle, RichText infoDisplayDescription, List<InsightItem> insightList) {
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        return new InsightListState(displayText, infoDisplayTitle, infoDisplayDescription, insightList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightListState)) {
            return false;
        }
        InsightListState insightListState = (InsightListState) other;
        return Intrinsics.areEqual(this.displayText, insightListState.displayText) && Intrinsics.areEqual(this.infoDisplayTitle, insightListState.infoDisplayTitle) && Intrinsics.areEqual(this.infoDisplayDescription, insightListState.infoDisplayDescription) && Intrinsics.areEqual(this.insightList, insightListState.insightList);
    }

    public int hashCode() {
        String str = this.displayText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RichText richText = this.infoDisplayTitle;
        int iHashCode2 = (iHashCode + (richText == null ? 0 : richText.hashCode())) * 31;
        RichText richText2 = this.infoDisplayDescription;
        return ((iHashCode2 + (richText2 != null ? richText2.hashCode() : 0)) * 31) + this.insightList.hashCode();
    }

    public String toString() {
        return "InsightListState(displayText=" + this.displayText + ", infoDisplayTitle=" + this.infoDisplayTitle + ", infoDisplayDescription=" + this.infoDisplayDescription + ", insightList=" + this.insightList + ")";
    }

    public InsightListState(String str, RichText richText, RichText richText2, List<InsightItem> insightList) {
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        this.displayText = str;
        this.infoDisplayTitle = richText;
        this.infoDisplayDescription = richText2;
        this.insightList = insightList;
        this.showInfoIcon = (richText == null && richText2 == null) ? false : true;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final RichText getInfoDisplayTitle() {
        return this.infoDisplayTitle;
    }

    public final RichText getInfoDisplayDescription() {
        return this.infoDisplayDescription;
    }

    public /* synthetic */ InsightListState(String str, RichText richText, RichText richText2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, richText, richText2, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<InsightItem> getInsightList() {
        return this.insightList;
    }

    public final boolean getShowInfoIcon() {
        return this.showInfoIcon;
    }
}
