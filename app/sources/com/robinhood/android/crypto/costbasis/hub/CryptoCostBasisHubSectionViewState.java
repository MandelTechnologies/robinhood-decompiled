package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoCostBasisHubViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;", "", "section", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "bannerMarkdownContent", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "isLoadingMore", "hideShowMore", "hideSection", "<init>", "(Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLkotlinx/collections/immutable/ImmutableList;ZZZ)V", "getSection", "()Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "getBannerMarkdownContent", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getHideShowMore", "getHideSection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisHubSectionViewState {
    public static final int $stable = StringResource.$stable;
    private final String bannerMarkdownContent;
    private final boolean hideSection;
    private final boolean hideShowMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final ImmutableList<CostBasisRow> rows;
    private final CryptoCostBasisHubSection section;
    private final StringResource title;

    public static /* synthetic */ CryptoCostBasisHubSectionViewState copy$default(CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState, CryptoCostBasisHubSection cryptoCostBasisHubSection, String str, StringResource stringResource, boolean z, ImmutableList immutableList, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCostBasisHubSection = cryptoCostBasisHubSectionViewState.section;
        }
        if ((i & 2) != 0) {
            str = cryptoCostBasisHubSectionViewState.bannerMarkdownContent;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoCostBasisHubSectionViewState.title;
        }
        if ((i & 8) != 0) {
            z = cryptoCostBasisHubSectionViewState.isLoading;
        }
        if ((i & 16) != 0) {
            immutableList = cryptoCostBasisHubSectionViewState.rows;
        }
        if ((i & 32) != 0) {
            z2 = cryptoCostBasisHubSectionViewState.isLoadingMore;
        }
        if ((i & 64) != 0) {
            z3 = cryptoCostBasisHubSectionViewState.hideShowMore;
        }
        if ((i & 128) != 0) {
            z4 = cryptoCostBasisHubSectionViewState.hideSection;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        ImmutableList immutableList2 = immutableList;
        boolean z7 = z2;
        return cryptoCostBasisHubSectionViewState.copy(cryptoCostBasisHubSection, str, stringResource, z, immutableList2, z7, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoCostBasisHubSection getSection() {
        return this.section;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBannerMarkdownContent() {
        return this.bannerMarkdownContent;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<CostBasisRow> component5() {
        return this.rows;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHideShowMore() {
        return this.hideShowMore;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHideSection() {
        return this.hideSection;
    }

    public final CryptoCostBasisHubSectionViewState copy(CryptoCostBasisHubSection section, String bannerMarkdownContent, StringResource title, boolean isLoading, ImmutableList<CostBasisRow> rows, boolean isLoadingMore, boolean hideShowMore, boolean hideSection) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new CryptoCostBasisHubSectionViewState(section, bannerMarkdownContent, title, isLoading, rows, isLoadingMore, hideShowMore, hideSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisHubSectionViewState)) {
            return false;
        }
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState = (CryptoCostBasisHubSectionViewState) other;
        return this.section == cryptoCostBasisHubSectionViewState.section && Intrinsics.areEqual(this.bannerMarkdownContent, cryptoCostBasisHubSectionViewState.bannerMarkdownContent) && Intrinsics.areEqual(this.title, cryptoCostBasisHubSectionViewState.title) && this.isLoading == cryptoCostBasisHubSectionViewState.isLoading && Intrinsics.areEqual(this.rows, cryptoCostBasisHubSectionViewState.rows) && this.isLoadingMore == cryptoCostBasisHubSectionViewState.isLoadingMore && this.hideShowMore == cryptoCostBasisHubSectionViewState.hideShowMore && this.hideSection == cryptoCostBasisHubSectionViewState.hideSection;
    }

    public int hashCode() {
        int iHashCode = this.section.hashCode() * 31;
        String str = this.bannerMarkdownContent;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.rows.hashCode()) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hideShowMore)) * 31) + Boolean.hashCode(this.hideSection);
    }

    public String toString() {
        return "CryptoCostBasisHubSectionViewState(section=" + this.section + ", bannerMarkdownContent=" + this.bannerMarkdownContent + ", title=" + this.title + ", isLoading=" + this.isLoading + ", rows=" + this.rows + ", isLoadingMore=" + this.isLoadingMore + ", hideShowMore=" + this.hideShowMore + ", hideSection=" + this.hideSection + ")";
    }

    public CryptoCostBasisHubSectionViewState(CryptoCostBasisHubSection section, String str, StringResource title, boolean z, ImmutableList<CostBasisRow> rows, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.section = section;
        this.bannerMarkdownContent = str;
        this.title = title;
        this.isLoading = z;
        this.rows = rows;
        this.isLoadingMore = z2;
        this.hideShowMore = z3;
        this.hideSection = z4;
    }

    public /* synthetic */ CryptoCostBasisHubSectionViewState(CryptoCostBasisHubSection cryptoCostBasisHubSection, String str, StringResource stringResource, boolean z, ImmutableList immutableList, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoCostBasisHubSection, (i & 2) != 0 ? null : str, stringResource, z, immutableList, z2, z3, z4);
    }

    public final CryptoCostBasisHubSection getSection() {
        return this.section;
    }

    public final String getBannerMarkdownContent() {
        return this.bannerMarkdownContent;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<CostBasisRow> getRows() {
        return this.rows;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean getHideShowMore() {
        return this.hideShowMore;
    }

    public final boolean getHideSection() {
        return this.hideSection;
    }
}
