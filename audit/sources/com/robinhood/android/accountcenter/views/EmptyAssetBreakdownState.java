package com.robinhood.android.accountcenter.views;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0016HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/EmptyAssetBreakdownState;", "", "assetId", "", "description", "Lcom/robinhood/models/serverdriven/db/RichText;", "curatedLists", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;Ljava/util/List;)V", "getAssetId", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getCuratedLists", "()Ljava/util/List;", "showCuratedLists", "", "getShowCuratedLists", "()Z", "curatedListRowCount", "", "getCuratedListRowCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class EmptyAssetBreakdownState {
    public static final int $stable = 8;
    private final String assetId;
    private final int curatedListRowCount;
    private final List<CuratedListChipItem> curatedLists;
    private final RichText description;
    private final boolean showCuratedLists;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmptyAssetBreakdownState copy$default(EmptyAssetBreakdownState emptyAssetBreakdownState, String str, RichText richText, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emptyAssetBreakdownState.assetId;
        }
        if ((i & 2) != 0) {
            richText = emptyAssetBreakdownState.description;
        }
        if ((i & 4) != 0) {
            list = emptyAssetBreakdownState.curatedLists;
        }
        return emptyAssetBreakdownState.copy(str, richText, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getDescription() {
        return this.description;
    }

    public final List<CuratedListChipItem> component3() {
        return this.curatedLists;
    }

    public final EmptyAssetBreakdownState copy(String assetId, RichText description, List<CuratedListChipItem> curatedLists) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
        return new EmptyAssetBreakdownState(assetId, description, curatedLists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyAssetBreakdownState)) {
            return false;
        }
        EmptyAssetBreakdownState emptyAssetBreakdownState = (EmptyAssetBreakdownState) other;
        return Intrinsics.areEqual(this.assetId, emptyAssetBreakdownState.assetId) && Intrinsics.areEqual(this.description, emptyAssetBreakdownState.description) && Intrinsics.areEqual(this.curatedLists, emptyAssetBreakdownState.curatedLists);
    }

    public int hashCode() {
        return (((this.assetId.hashCode() * 31) + this.description.hashCode()) * 31) + this.curatedLists.hashCode();
    }

    public String toString() {
        return "EmptyAssetBreakdownState(assetId=" + this.assetId + ", description=" + this.description + ", curatedLists=" + this.curatedLists + ")";
    }

    public EmptyAssetBreakdownState(String assetId, RichText description, List<CuratedListChipItem> curatedLists) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
        this.assetId = assetId;
        this.description = description;
        this.curatedLists = curatedLists;
        this.showCuratedLists = !curatedLists.isEmpty();
        this.curatedListRowCount = curatedLists.size() >= 3 ? curatedLists.size() < 6 ? 2 : 3 : 1;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final RichText getDescription() {
        return this.description;
    }

    public final List<CuratedListChipItem> getCuratedLists() {
        return this.curatedLists;
    }

    public final boolean getShowCuratedLists() {
        return this.showCuratedLists;
    }

    public final int getCuratedListRowCount() {
        return this.curatedListRowCount;
    }
}
