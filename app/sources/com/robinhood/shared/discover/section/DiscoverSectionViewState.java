package com.robinhood.shared.discover.section;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoverSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;", "", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "chips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "cards", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "rowList", "Lcom/robinhood/shared/discover/section/DiscoverRow;", "title", "", "description", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "isLoading", "", "<init>", "(Lcom/robinhood/models/api/CryptoTradingOptionStyle;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "getChips", "()Lkotlinx/collections/immutable/ImmutableList;", "getCards", "getRowList", "getTitle", "()Ljava/lang/String;", "getDescription", "getDisclosure", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DiscoverSectionViewState {
    public static final int $stable = InstrumentPreviewCard4.$stable | CryptoChipsComposable.$stable;
    private final ImmutableList<InstrumentPreviewCard4> cards;
    private final ImmutableList<CryptoChipsComposable> chips;
    private final String description;
    private final String disclosure;
    private final boolean isLoading;
    private final ImmutableList<DiscoverRow> rowList;
    private final ApiCryptoTradingOptions3 style;
    private final String title;

    public static /* synthetic */ DiscoverSectionViewState copy$default(DiscoverSectionViewState discoverSectionViewState, ApiCryptoTradingOptions3 apiCryptoTradingOptions3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiCryptoTradingOptions3 = discoverSectionViewState.style;
        }
        if ((i & 2) != 0) {
            immutableList = discoverSectionViewState.chips;
        }
        if ((i & 4) != 0) {
            immutableList2 = discoverSectionViewState.cards;
        }
        if ((i & 8) != 0) {
            immutableList3 = discoverSectionViewState.rowList;
        }
        if ((i & 16) != 0) {
            str = discoverSectionViewState.title;
        }
        if ((i & 32) != 0) {
            str2 = discoverSectionViewState.description;
        }
        if ((i & 64) != 0) {
            str3 = discoverSectionViewState.disclosure;
        }
        if ((i & 128) != 0) {
            z = discoverSectionViewState.isLoading;
        }
        String str4 = str3;
        boolean z2 = z;
        String str5 = str;
        String str6 = str2;
        return discoverSectionViewState.copy(apiCryptoTradingOptions3, immutableList, immutableList2, immutableList3, str5, str6, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCryptoTradingOptions3 getStyle() {
        return this.style;
    }

    public final ImmutableList<CryptoChipsComposable> component2() {
        return this.chips;
    }

    public final ImmutableList<InstrumentPreviewCard4> component3() {
        return this.cards;
    }

    public final ImmutableList<DiscoverRow> component4() {
        return this.rowList;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final DiscoverSectionViewState copy(ApiCryptoTradingOptions3 style, ImmutableList<? extends CryptoChipsComposable> chips, ImmutableList<? extends InstrumentPreviewCard4> cards, ImmutableList<? extends DiscoverRow> rowList, String title, String description, String disclosure, boolean isLoading) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new DiscoverSectionViewState(style, chips, cards, rowList, title, description, disclosure, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverSectionViewState)) {
            return false;
        }
        DiscoverSectionViewState discoverSectionViewState = (DiscoverSectionViewState) other;
        return this.style == discoverSectionViewState.style && Intrinsics.areEqual(this.chips, discoverSectionViewState.chips) && Intrinsics.areEqual(this.cards, discoverSectionViewState.cards) && Intrinsics.areEqual(this.rowList, discoverSectionViewState.rowList) && Intrinsics.areEqual(this.title, discoverSectionViewState.title) && Intrinsics.areEqual(this.description, discoverSectionViewState.description) && Intrinsics.areEqual(this.disclosure, discoverSectionViewState.disclosure) && this.isLoading == discoverSectionViewState.isLoading;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        ImmutableList<CryptoChipsComposable> immutableList = this.chips;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        ImmutableList<InstrumentPreviewCard4> immutableList2 = this.cards;
        int iHashCode3 = (iHashCode2 + (immutableList2 == null ? 0 : immutableList2.hashCode())) * 31;
        ImmutableList<DiscoverRow> immutableList3 = this.rowList;
        int iHashCode4 = (iHashCode3 + (immutableList3 == null ? 0 : immutableList3.hashCode())) * 31;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclosure;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "DiscoverSectionViewState(style=" + this.style + ", chips=" + this.chips + ", cards=" + this.cards + ", rowList=" + this.rowList + ", title=" + this.title + ", description=" + this.description + ", disclosure=" + this.disclosure + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverSectionViewState(ApiCryptoTradingOptions3 style, ImmutableList<? extends CryptoChipsComposable> immutableList, ImmutableList<? extends InstrumentPreviewCard4> immutableList2, ImmutableList<? extends DiscoverRow> immutableList3, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
        this.chips = immutableList;
        this.cards = immutableList2;
        this.rowList = immutableList3;
        this.title = str;
        this.description = str2;
        this.disclosure = str3;
        this.isLoading = z;
    }

    public final ApiCryptoTradingOptions3 getStyle() {
        return this.style;
    }

    public final ImmutableList<CryptoChipsComposable> getChips() {
        return this.chips;
    }

    public final ImmutableList<InstrumentPreviewCard4> getCards() {
        return this.cards;
    }

    public final ImmutableList<DiscoverRow> getRowList() {
        return this.rowList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
