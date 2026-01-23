package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchViewState;", "", "searchText", "", "isMultiuserUi", "", "toolbarSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "tags", "", "Lcom/robinhood/android/matcha/ui/search/ProfileTag;", "rows", "Lcom/robinhood/android/matcha/ui/search/Row;", "incentivesBanner", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchBannerViewState;", "incentiveAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/utils/resource/StringResource;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/matcha/ui/search/MatchaSearchBannerViewState;Ljava/math/BigDecimal;)V", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "()Z", "getToolbarSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getTags", "()Ljava/util/List;", "getRows", "getIncentivesBanner", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchBannerViewState;", "getIncentiveAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaSearchViewState {
    public static final int $stable = 8;
    private final BigDecimal incentiveAmount;
    private final MatchaSearchViewState2 incentivesBanner;
    private final boolean isMultiuserUi;
    private final List<MatchaSearchViewState4> rows;
    private String searchText;
    private final List<ProfileTag> tags;
    private final StringResource toolbarSubtitle;

    public static /* synthetic */ MatchaSearchViewState copy$default(MatchaSearchViewState matchaSearchViewState, String str, boolean z, StringResource stringResource, List list, List list2, MatchaSearchViewState2 matchaSearchViewState2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchaSearchViewState.searchText;
        }
        if ((i & 2) != 0) {
            z = matchaSearchViewState.isMultiuserUi;
        }
        if ((i & 4) != 0) {
            stringResource = matchaSearchViewState.toolbarSubtitle;
        }
        if ((i & 8) != 0) {
            list = matchaSearchViewState.tags;
        }
        if ((i & 16) != 0) {
            list2 = matchaSearchViewState.rows;
        }
        if ((i & 32) != 0) {
            matchaSearchViewState2 = matchaSearchViewState.incentivesBanner;
        }
        if ((i & 64) != 0) {
            bigDecimal = matchaSearchViewState.incentiveAmount;
        }
        MatchaSearchViewState2 matchaSearchViewState22 = matchaSearchViewState2;
        BigDecimal bigDecimal2 = bigDecimal;
        List list3 = list2;
        StringResource stringResource2 = stringResource;
        return matchaSearchViewState.copy(str, z, stringResource2, list, list3, matchaSearchViewState22, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMultiuserUi() {
        return this.isMultiuserUi;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final List<ProfileTag> component4() {
        return this.tags;
    }

    public final List<MatchaSearchViewState4> component5() {
        return this.rows;
    }

    /* renamed from: component6, reason: from getter */
    public final MatchaSearchViewState2 getIncentivesBanner() {
        return this.incentivesBanner;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final MatchaSearchViewState copy(String searchText, boolean isMultiuserUi, StringResource toolbarSubtitle, List<ProfileTag> tags, List<? extends MatchaSearchViewState4> rows, MatchaSearchViewState2 incentivesBanner, BigDecimal incentiveAmount) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(incentivesBanner, "incentivesBanner");
        return new MatchaSearchViewState(searchText, isMultiuserUi, toolbarSubtitle, tags, rows, incentivesBanner, incentiveAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaSearchViewState)) {
            return false;
        }
        MatchaSearchViewState matchaSearchViewState = (MatchaSearchViewState) other;
        return Intrinsics.areEqual(this.searchText, matchaSearchViewState.searchText) && this.isMultiuserUi == matchaSearchViewState.isMultiuserUi && Intrinsics.areEqual(this.toolbarSubtitle, matchaSearchViewState.toolbarSubtitle) && Intrinsics.areEqual(this.tags, matchaSearchViewState.tags) && Intrinsics.areEqual(this.rows, matchaSearchViewState.rows) && Intrinsics.areEqual(this.incentivesBanner, matchaSearchViewState.incentivesBanner) && Intrinsics.areEqual(this.incentiveAmount, matchaSearchViewState.incentiveAmount);
    }

    public int hashCode() {
        String str = this.searchText;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isMultiuserUi)) * 31;
        StringResource stringResource = this.toolbarSubtitle;
        int iHashCode2 = (((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.tags.hashCode()) * 31) + this.rows.hashCode()) * 31) + this.incentivesBanner.hashCode()) * 31;
        BigDecimal bigDecimal = this.incentiveAmount;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "MatchaSearchViewState(searchText=" + this.searchText + ", isMultiuserUi=" + this.isMultiuserUi + ", toolbarSubtitle=" + this.toolbarSubtitle + ", tags=" + this.tags + ", rows=" + this.rows + ", incentivesBanner=" + this.incentivesBanner + ", incentiveAmount=" + this.incentiveAmount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaSearchViewState(String str, boolean z, StringResource stringResource, List<ProfileTag> tags, List<? extends MatchaSearchViewState4> rows, MatchaSearchViewState2 incentivesBanner, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(incentivesBanner, "incentivesBanner");
        this.searchText = str;
        this.isMultiuserUi = z;
        this.toolbarSubtitle = stringResource;
        this.tags = tags;
        this.rows = rows;
        this.incentivesBanner = incentivesBanner;
        this.incentiveAmount = bigDecimal;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MatchaSearchViewState(String str, boolean z, StringResource stringResource, List list, List list2, MatchaSearchViewState2 matchaSearchViewState2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimal2;
        MatchaSearchViewState2 matchaSearchViewState22;
        List list3;
        List list4;
        StringResource stringResource2;
        str = (i & 1) != 0 ? null : str;
        if ((i & 4) != 0) {
            bigDecimal2 = bigDecimal;
            matchaSearchViewState22 = matchaSearchViewState2;
            list3 = list2;
            list4 = list;
            stringResource2 = null;
        } else {
            bigDecimal2 = bigDecimal;
            matchaSearchViewState22 = matchaSearchViewState2;
            list3 = list2;
            list4 = list;
            stringResource2 = stringResource;
        }
        this(str, z, stringResource2, list4, list3, matchaSearchViewState22, bigDecimal2);
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final void setSearchText(String str) {
        this.searchText = str;
    }

    public final boolean isMultiuserUi() {
        return this.isMultiuserUi;
    }

    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final List<ProfileTag> getTags() {
        return this.tags;
    }

    public final List<MatchaSearchViewState4> getRows() {
        return this.rows;
    }

    public final MatchaSearchViewState2 getIncentivesBanner() {
        return this.incentivesBanner;
    }

    public final BigDecimal getIncentiveAmount() {
        return this.incentiveAmount;
    }
}
