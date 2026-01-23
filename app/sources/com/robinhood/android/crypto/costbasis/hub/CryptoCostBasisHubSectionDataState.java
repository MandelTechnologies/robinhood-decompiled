package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CryptoCostBasisHubDataState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÂ\u0003J\u000e\u0010.\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b/J\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\b5J\u0012\u00106\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b7\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0002\b9Jb\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00078F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;", "", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "section", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", ErrorBundle.DETAIL_ENTRY, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/ui/transfer/UiCostBasisDetails;", "isLoadingMore", "", "cursor", "", "hasFetchedAll", "bannerMarkdown", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "<init>", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/staticcontent/model/OtherMarkdown;)V", "getSection$feature_crypto_cost_basis_externalDebug", "()Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "getDetails$feature_crypto_cost_basis_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "isLoadingMore$feature_crypto_cost_basis_externalDebug", "()Z", "getCursor$feature_crypto_cost_basis_externalDebug", "()Ljava/lang/String;", "getHasFetchedAll$feature_crypto_cost_basis_externalDebug", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBannerMarkdown$feature_crypto_cost_basis_externalDebug", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "isLoading", "hideSection", "getHideSection", "hideShowMore", "getHideShowMore", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "placeholderRows", "Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "getPlaceholderRows", "rows", "getRows", "component1", "component2", "component2$feature_crypto_cost_basis_externalDebug", "component3", "component3$feature_crypto_cost_basis_externalDebug", "component4", "component4$feature_crypto_cost_basis_externalDebug", "component5", "component5$feature_crypto_cost_basis_externalDebug", "component6", "component6$feature_crypto_cost_basis_externalDebug", "component7", "component7$feature_crypto_cost_basis_externalDebug", "copy", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/staticcontent/model/OtherMarkdown;)Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;", "equals", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisHubSectionDataState {
    public static final int $stable = 8;
    private final OtherMarkdown bannerMarkdown;
    private final String cursor;
    private final ImmutableList<UiCostBasisDetails> details;
    private final Boolean hasFetchedAll;
    private final boolean isLoadingMore;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final CryptoCostBasisHubSection section;

    /* compiled from: CryptoCostBasisHubDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCostBasisHubSection.values().length];
            try {
                iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final LocalizedDateTimeFormatter getLocalizedDateTimeFormatter() {
        return this.localizedDateTimeFormatter;
    }

    public static /* synthetic */ CryptoCostBasisHubSectionDataState copy$default(CryptoCostBasisHubSectionDataState cryptoCostBasisHubSectionDataState, LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubSection cryptoCostBasisHubSection, ImmutableList immutableList, boolean z, String str, Boolean bool, OtherMarkdown otherMarkdown, int i, Object obj) {
        if ((i & 1) != 0) {
            localizedDateTimeFormatter = cryptoCostBasisHubSectionDataState.localizedDateTimeFormatter;
        }
        if ((i & 2) != 0) {
            cryptoCostBasisHubSection = cryptoCostBasisHubSectionDataState.section;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoCostBasisHubSectionDataState.details;
        }
        if ((i & 8) != 0) {
            z = cryptoCostBasisHubSectionDataState.isLoadingMore;
        }
        if ((i & 16) != 0) {
            str = cryptoCostBasisHubSectionDataState.cursor;
        }
        if ((i & 32) != 0) {
            bool = cryptoCostBasisHubSectionDataState.hasFetchedAll;
        }
        if ((i & 64) != 0) {
            otherMarkdown = cryptoCostBasisHubSectionDataState.bannerMarkdown;
        }
        Boolean bool2 = bool;
        OtherMarkdown otherMarkdown2 = otherMarkdown;
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        return cryptoCostBasisHubSectionDataState.copy(localizedDateTimeFormatter, cryptoCostBasisHubSection, immutableList2, z, str2, bool2, otherMarkdown2);
    }

    /* renamed from: component2$feature_crypto_cost_basis_externalDebug, reason: from getter */
    public final CryptoCostBasisHubSection getSection() {
        return this.section;
    }

    public final ImmutableList<UiCostBasisDetails> component3$feature_crypto_cost_basis_externalDebug() {
        return this.details;
    }

    /* renamed from: component4$feature_crypto_cost_basis_externalDebug, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component5$feature_crypto_cost_basis_externalDebug, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component6$feature_crypto_cost_basis_externalDebug, reason: from getter */
    public final Boolean getHasFetchedAll() {
        return this.hasFetchedAll;
    }

    /* renamed from: component7$feature_crypto_cost_basis_externalDebug, reason: from getter */
    public final OtherMarkdown getBannerMarkdown() {
        return this.bannerMarkdown;
    }

    public final CryptoCostBasisHubSectionDataState copy(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubSection section, ImmutableList<UiCostBasisDetails> details, boolean isLoadingMore, String cursor, Boolean hasFetchedAll, OtherMarkdown bannerMarkdown) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(section, "section");
        return new CryptoCostBasisHubSectionDataState(localizedDateTimeFormatter, section, details, isLoadingMore, cursor, hasFetchedAll, bannerMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisHubSectionDataState)) {
            return false;
        }
        CryptoCostBasisHubSectionDataState cryptoCostBasisHubSectionDataState = (CryptoCostBasisHubSectionDataState) other;
        return Intrinsics.areEqual(this.localizedDateTimeFormatter, cryptoCostBasisHubSectionDataState.localizedDateTimeFormatter) && this.section == cryptoCostBasisHubSectionDataState.section && Intrinsics.areEqual(this.details, cryptoCostBasisHubSectionDataState.details) && this.isLoadingMore == cryptoCostBasisHubSectionDataState.isLoadingMore && Intrinsics.areEqual(this.cursor, cryptoCostBasisHubSectionDataState.cursor) && Intrinsics.areEqual(this.hasFetchedAll, cryptoCostBasisHubSectionDataState.hasFetchedAll) && Intrinsics.areEqual(this.bannerMarkdown, cryptoCostBasisHubSectionDataState.bannerMarkdown);
    }

    public int hashCode() {
        int iHashCode = ((this.localizedDateTimeFormatter.hashCode() * 31) + this.section.hashCode()) * 31;
        ImmutableList<UiCostBasisDetails> immutableList = this.details;
        int iHashCode2 = (((iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31;
        String str = this.cursor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasFetchedAll;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        OtherMarkdown otherMarkdown = this.bannerMarkdown;
        return iHashCode4 + (otherMarkdown != null ? otherMarkdown.hashCode() : 0);
    }

    public String toString() {
        return "CryptoCostBasisHubSectionDataState(localizedDateTimeFormatter=" + this.localizedDateTimeFormatter + ", section=" + this.section + ", details=" + this.details + ", isLoadingMore=" + this.isLoadingMore + ", cursor=" + this.cursor + ", hasFetchedAll=" + this.hasFetchedAll + ", bannerMarkdown=" + this.bannerMarkdown + ")";
    }

    public CryptoCostBasisHubSectionDataState(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubSection section, ImmutableList<UiCostBasisDetails> immutableList, boolean z, String str, Boolean bool, OtherMarkdown otherMarkdown) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(section, "section");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.section = section;
        this.details = immutableList;
        this.isLoadingMore = z;
        this.cursor = str;
        this.hasFetchedAll = bool;
        this.bannerMarkdown = otherMarkdown;
    }

    public /* synthetic */ CryptoCostBasisHubSectionDataState(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubSection cryptoCostBasisHubSection, ImmutableList immutableList, boolean z, String str, Boolean bool, OtherMarkdown otherMarkdown, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localizedDateTimeFormatter, cryptoCostBasisHubSection, (i & 4) != 0 ? null : immutableList, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : otherMarkdown);
    }

    public final CryptoCostBasisHubSection getSection$feature_crypto_cost_basis_externalDebug() {
        return this.section;
    }

    public final ImmutableList<UiCostBasisDetails> getDetails$feature_crypto_cost_basis_externalDebug() {
        return this.details;
    }

    public final boolean isLoadingMore$feature_crypto_cost_basis_externalDebug() {
        return this.isLoadingMore;
    }

    public final String getCursor$feature_crypto_cost_basis_externalDebug() {
        return this.cursor;
    }

    public final Boolean getHasFetchedAll$feature_crypto_cost_basis_externalDebug() {
        return this.hasFetchedAll;
    }

    public final OtherMarkdown getBannerMarkdown$feature_crypto_cost_basis_externalDebug() {
        return this.bannerMarkdown;
    }

    public final boolean isLoading() {
        return this.details == null;
    }

    public final boolean getHideSection() {
        ImmutableList<UiCostBasisDetails> immutableList = this.details;
        return immutableList != null && immutableList.isEmpty();
    }

    public final boolean getHideShowMore() {
        ImmutableList<UiCostBasisDetails> immutableList;
        return !Intrinsics.areEqual(this.hasFetchedAll, Boolean.FALSE) || isLoading() || (immutableList = this.details) == null || immutableList.isEmpty();
    }

    public final StringResource getTitle() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.section.ordinal()];
        if (i2 == 1) {
            i = C12782R.string.crypto_cost_basis_hub_section_sold_in_2025;
        } else if (i2 == 2) {
            i = C12782R.string.crypto_cost_basis_hub_section_missing_details;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C12782R.string.crypto_cost_basis_hub_section_confirmed;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final ImmutableList<CostBasisRow> getPlaceholderRows() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.section.ordinal()];
        int i2 = 0;
        if (i == 1) {
            ArrayList arrayList = new ArrayList(3);
            while (i2 < 3) {
                arrayList.add(new CostBasisRow("placeholder_sold_2025_" + i2, null, "---", "-----", "", "-----------------------", 2, null));
                i2++;
            }
            return extensions2.toPersistentList(arrayList);
        }
        if (i == 2) {
            ArrayList arrayList2 = new ArrayList(3);
            while (i2 < 3) {
                arrayList2.add(new CostBasisRow("placeholder_missing_" + i2, null, "---", "-----", "", "-----------------------", 2, null));
                i2++;
            }
            return extensions2.toPersistentList(arrayList2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(5);
        while (i2 < 5) {
            arrayList3.add(new CostBasisRow("placeholder_confirmed_" + i2, null, "---", "-----", "", "------------", 2, null));
            i2++;
        }
        return extensions2.toPersistentList(arrayList3);
    }

    public final ImmutableList<CostBasisRow> getRows() {
        ImmutableList<UiCostBasisDetails> immutableList = this.details;
        if (immutableList != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<UiCostBasisDetails> it = immutableList.iterator();
            while (it.hasNext()) {
                arrayList.add(CryptoCostBasisHubDataState3.toRow(it.next(), this.localizedDateTimeFormatter));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
            if (persistentList != null) {
                return persistentList;
            }
        }
        return extensions2.persistentListOf();
    }
}
