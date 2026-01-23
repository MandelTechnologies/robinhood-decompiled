package com.robinhood.android.event.detail.duel;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.markdown.compose.MarkdownText4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailDuelContractsHeader.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JY\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;", "", "contractMetadata", "", "contractDisplayShortName", "contractOpenInterest", MarkdownText4.TagImageUrl, "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "contractDisplayYesBidPriceInCents", "deltas", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getContractMetadata", "()Ljava/lang/String;", "getContractDisplayShortName", "getContractOpenInterest", "getImageUrl", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getContractDisplayYesBidPriceInCents", "getDeltas", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DuelEventContractUiDetail {
    public static final int $stable = 0;
    private final DayNightColor contractColor;
    private final String contractDisplayShortName;
    private final String contractDisplayYesBidPriceInCents;
    private final String contractMetadata;
    private final String contractOpenInterest;
    private final ImmutableList<Delta> deltas;
    private final String imageUrl;

    public static /* synthetic */ DuelEventContractUiDetail copy$default(DuelEventContractUiDetail duelEventContractUiDetail, String str, String str2, String str3, String str4, DayNightColor dayNightColor, String str5, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duelEventContractUiDetail.contractMetadata;
        }
        if ((i & 2) != 0) {
            str2 = duelEventContractUiDetail.contractDisplayShortName;
        }
        if ((i & 4) != 0) {
            str3 = duelEventContractUiDetail.contractOpenInterest;
        }
        if ((i & 8) != 0) {
            str4 = duelEventContractUiDetail.imageUrl;
        }
        if ((i & 16) != 0) {
            dayNightColor = duelEventContractUiDetail.contractColor;
        }
        if ((i & 32) != 0) {
            str5 = duelEventContractUiDetail.contractDisplayYesBidPriceInCents;
        }
        if ((i & 64) != 0) {
            immutableList = duelEventContractUiDetail.deltas;
        }
        String str6 = str5;
        ImmutableList immutableList2 = immutableList;
        DayNightColor dayNightColor2 = dayNightColor;
        String str7 = str3;
        return duelEventContractUiDetail.copy(str, str2, str7, str4, dayNightColor2, str6, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContractMetadata() {
        return this.contractMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContractDisplayShortName() {
        return this.contractDisplayShortName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContractOpenInterest() {
        return this.contractOpenInterest;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final DayNightColor getContractColor() {
        return this.contractColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContractDisplayYesBidPriceInCents() {
        return this.contractDisplayYesBidPriceInCents;
    }

    public final ImmutableList<Delta> component7() {
        return this.deltas;
    }

    public final DuelEventContractUiDetail copy(String contractMetadata, String contractDisplayShortName, String contractOpenInterest, String imageUrl, DayNightColor contractColor, String contractDisplayYesBidPriceInCents, ImmutableList<Delta> deltas) {
        Intrinsics.checkNotNullParameter(contractDisplayShortName, "contractDisplayShortName");
        Intrinsics.checkNotNullParameter(contractOpenInterest, "contractOpenInterest");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(contractColor, "contractColor");
        Intrinsics.checkNotNullParameter(deltas, "deltas");
        return new DuelEventContractUiDetail(contractMetadata, contractDisplayShortName, contractOpenInterest, imageUrl, contractColor, contractDisplayYesBidPriceInCents, deltas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuelEventContractUiDetail)) {
            return false;
        }
        DuelEventContractUiDetail duelEventContractUiDetail = (DuelEventContractUiDetail) other;
        return Intrinsics.areEqual(this.contractMetadata, duelEventContractUiDetail.contractMetadata) && Intrinsics.areEqual(this.contractDisplayShortName, duelEventContractUiDetail.contractDisplayShortName) && Intrinsics.areEqual(this.contractOpenInterest, duelEventContractUiDetail.contractOpenInterest) && Intrinsics.areEqual(this.imageUrl, duelEventContractUiDetail.imageUrl) && Intrinsics.areEqual(this.contractColor, duelEventContractUiDetail.contractColor) && Intrinsics.areEqual(this.contractDisplayYesBidPriceInCents, duelEventContractUiDetail.contractDisplayYesBidPriceInCents) && Intrinsics.areEqual(this.deltas, duelEventContractUiDetail.deltas);
    }

    public int hashCode() {
        String str = this.contractMetadata;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.contractDisplayShortName.hashCode()) * 31) + this.contractOpenInterest.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.contractColor.hashCode()) * 31;
        String str2 = this.contractDisplayYesBidPriceInCents;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.deltas.hashCode();
    }

    public String toString() {
        return "DuelEventContractUiDetail(contractMetadata=" + this.contractMetadata + ", contractDisplayShortName=" + this.contractDisplayShortName + ", contractOpenInterest=" + this.contractOpenInterest + ", imageUrl=" + this.imageUrl + ", contractColor=" + this.contractColor + ", contractDisplayYesBidPriceInCents=" + this.contractDisplayYesBidPriceInCents + ", deltas=" + this.deltas + ")";
    }

    public DuelEventContractUiDetail(String str, String contractDisplayShortName, String contractOpenInterest, String imageUrl, DayNightColor contractColor, String str2, ImmutableList<Delta> deltas) {
        Intrinsics.checkNotNullParameter(contractDisplayShortName, "contractDisplayShortName");
        Intrinsics.checkNotNullParameter(contractOpenInterest, "contractOpenInterest");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(contractColor, "contractColor");
        Intrinsics.checkNotNullParameter(deltas, "deltas");
        this.contractMetadata = str;
        this.contractDisplayShortName = contractDisplayShortName;
        this.contractOpenInterest = contractOpenInterest;
        this.imageUrl = imageUrl;
        this.contractColor = contractColor;
        this.contractDisplayYesBidPriceInCents = str2;
        this.deltas = deltas;
    }

    public final String getContractMetadata() {
        return this.contractMetadata;
    }

    public final String getContractDisplayShortName() {
        return this.contractDisplayShortName;
    }

    public final String getContractOpenInterest() {
        return this.contractOpenInterest;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final DayNightColor getContractColor() {
        return this.contractColor;
    }

    public final String getContractDisplayYesBidPriceInCents() {
        return this.contractDisplayYesBidPriceInCents;
    }

    public final ImmutableList<Delta> getDeltas() {
        return this.deltas;
    }
}
