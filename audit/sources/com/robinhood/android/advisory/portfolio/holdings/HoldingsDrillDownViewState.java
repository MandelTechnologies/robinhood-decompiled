package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HoldingsDrillDownViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\"#R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0002$%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "amountTabTitle", "getAmountTabTitle", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "allocationRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;", "getAllocationRows", "()Lkotlinx/collections/immutable/ImmutableList;", "classificationTabs", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "getClassificationTabs", "showAmounts", "", "getShowAmounts", "()Z", "showClassificationTabs", "getShowClassificationTabs", "disclosureBottomSheet", "Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "getDisclosureBottomSheet", "()Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "Loading", "Loaded", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState$Loading;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface HoldingsDrillDownViewState {
    String getAccountNumber();

    ImmutableList<AllocationRowData> getAllocationRows();

    StringResource getAmountTabTitle();

    AssetClass3 getAssetClassRegion();

    ImmutableList<HoldingsDrillDownViewState3> getClassificationTabs();

    DisclosureBottomSheet getDisclosureBottomSheet();

    boolean getShowAmounts();

    boolean getShowClassificationTabs();

    StringResource getTitle();

    /* compiled from: HoldingsDrillDownViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static StringResource getTitle(HoldingsDrillDownViewState holdingsDrillDownViewState) {
            return StringResource.INSTANCE.invoke(C9151R.string.portfolio_empty_text, new Object[0]);
        }

        public static StringResource getAmountTabTitle(HoldingsDrillDownViewState holdingsDrillDownViewState) {
            return StringResource.INSTANCE.invoke(C9151R.string.portfolio_empty_text, new Object[0]);
        }
    }

    /* compiled from: HoldingsDrillDownViewState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState$Loading;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;)V", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "allocationRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;", "getAllocationRows", "()Lkotlinx/collections/immutable/ImmutableList;", "classificationTabs", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "getClassificationTabs", "showAmounts", "", "getShowAmounts", "()Z", "showClassificationTabs", "getShowClassificationTabs", "disclosureBottomSheet", "Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "getDisclosureBottomSheet", "()Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loading implements HoldingsDrillDownViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final AssetClass3 assetClassRegion;
        private final DisclosureBottomSheet disclosureBottomSheet;
        private final boolean showAmounts;
        private final boolean showClassificationTabs;
        private final StringResource title;

        public static /* synthetic */ Loading copy$default(Loading loading, AssetClass3 assetClass3, int i, Object obj) {
            if ((i & 1) != 0) {
                assetClass3 = loading.assetClassRegion;
            }
            return loading.copy(assetClass3);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        public final Loading copy(AssetClass3 assetClassRegion) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            return new Loading(assetClassRegion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.assetClassRegion == ((Loading) other).assetClassRegion;
        }

        public int hashCode() {
            return this.assetClassRegion.hashCode();
        }

        public String toString() {
            return "Loading(assetClassRegion=" + this.assetClassRegion + ")";
        }

        public Loading(AssetClass3 assetClassRegion) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            this.assetClassRegion = assetClassRegion;
            this.title = StringResource.INSTANCE.invoke("------ -------");
            this.accountNumber = "";
            this.showAmounts = true;
            this.showClassificationTabs = true;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public StringResource getAmountTabTitle() {
            return DefaultImpls.getAmountTabTitle(this);
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public StringResource getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public ImmutableList<AllocationRowData> getAllocationRows() {
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                ((PrimitiveIterators6) it).nextInt();
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                arrayList.add(new AllocationRowData(uuidRandomUUID, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, "----- --- -----", new BigDecimal("0.1"), OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, "--------", AssetClass5.UNSPECIFIED, false, 128, null));
            }
            return extensions2.toPersistentList(arrayList);
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public ImmutableList<HoldingsDrillDownViewState3> getClassificationTabs() {
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                AssetClass3 assetClass3 = AssetClass3.UNSPECIFIED;
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke("----" + CollectionsKt.joinToString$default(RangesKt.until(0, iNextInt), "", null, null, 0, null, new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState$Loading$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HoldingsDrillDownViewState.Loading._get_classificationTabs_$lambda$2$lambda$1(((Integer) obj).intValue());
                    }
                }, 30, null));
                StringResource stringResourceInvoke2 = companion.invoke("-------- --------------- -----------");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                arrayList.add(new HoldingsDrillDownViewState3.AssetRegionTabData(assetClass3, stringResourceInvoke, stringResourceInvoke2, ZERO));
            }
            return extensions2.toPersistentList(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence _get_classificationTabs_$lambda$2$lambda$1(int i) {
            return "--";
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public boolean getShowAmounts() {
            return this.showAmounts;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public boolean getShowClassificationTabs() {
            return this.showClassificationTabs;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public DisclosureBottomSheet getDisclosureBottomSheet() {
            return this.disclosureBottomSheet;
        }
    }

    /* compiled from: HoldingsDrillDownViewState.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "title", "Lcom/robinhood/utils/resource/StringResource;", "amountTabTitle", "accountNumber", "", "allocationRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;", "classificationTabs", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "showAmounts", "", "showClassificationTabs", "disclosureBottomSheet", "Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;)V", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAmountTabTitle", "getAccountNumber", "()Ljava/lang/String;", "getAllocationRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getClassificationTabs", "getShowAmounts", "()Z", "getShowClassificationTabs", "getDisclosureBottomSheet", "()Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements HoldingsDrillDownViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ImmutableList<AllocationRowData> allocationRows;
        private final StringResource amountTabTitle;
        private final AssetClass3 assetClassRegion;
        private final ImmutableList<HoldingsDrillDownViewState3> classificationTabs;
        private final DisclosureBottomSheet disclosureBottomSheet;
        private final boolean showAmounts;
        private final boolean showClassificationTabs;
        private final StringResource title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AssetClass3 assetClass3, StringResource stringResource, StringResource stringResource2, String str, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, DisclosureBottomSheet disclosureBottomSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                assetClass3 = loaded.assetClassRegion;
            }
            if ((i & 2) != 0) {
                stringResource = loaded.title;
            }
            if ((i & 4) != 0) {
                stringResource2 = loaded.amountTabTitle;
            }
            if ((i & 8) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 16) != 0) {
                immutableList = loaded.allocationRows;
            }
            if ((i & 32) != 0) {
                immutableList2 = loaded.classificationTabs;
            }
            if ((i & 64) != 0) {
                z = loaded.showAmounts;
            }
            if ((i & 128) != 0) {
                z2 = loaded.showClassificationTabs;
            }
            if ((i & 256) != 0) {
                disclosureBottomSheet = loaded.disclosureBottomSheet;
            }
            boolean z3 = z2;
            DisclosureBottomSheet disclosureBottomSheet2 = disclosureBottomSheet;
            ImmutableList immutableList3 = immutableList2;
            boolean z4 = z;
            ImmutableList immutableList4 = immutableList;
            StringResource stringResource3 = stringResource2;
            return loaded.copy(assetClass3, stringResource, stringResource3, str, immutableList4, immutableList3, z4, z3, disclosureBottomSheet2);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getAmountTabTitle() {
            return this.amountTabTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ImmutableList<AllocationRowData> component5() {
            return this.allocationRows;
        }

        public final ImmutableList<HoldingsDrillDownViewState3> component6() {
            return this.classificationTabs;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowAmounts() {
            return this.showAmounts;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowClassificationTabs() {
            return this.showClassificationTabs;
        }

        /* renamed from: component9, reason: from getter */
        public final DisclosureBottomSheet getDisclosureBottomSheet() {
            return this.disclosureBottomSheet;
        }

        public final Loaded copy(AssetClass3 assetClassRegion, StringResource title, StringResource amountTabTitle, String accountNumber, ImmutableList<AllocationRowData> allocationRows, ImmutableList<? extends HoldingsDrillDownViewState3> classificationTabs, boolean showAmounts, boolean showClassificationTabs, DisclosureBottomSheet disclosureBottomSheet) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amountTabTitle, "amountTabTitle");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(allocationRows, "allocationRows");
            Intrinsics.checkNotNullParameter(classificationTabs, "classificationTabs");
            return new Loaded(assetClassRegion, title, amountTabTitle, accountNumber, allocationRows, classificationTabs, showAmounts, showClassificationTabs, disclosureBottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.assetClassRegion == loaded.assetClassRegion && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.amountTabTitle, loaded.amountTabTitle) && Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.allocationRows, loaded.allocationRows) && Intrinsics.areEqual(this.classificationTabs, loaded.classificationTabs) && this.showAmounts == loaded.showAmounts && this.showClassificationTabs == loaded.showClassificationTabs && Intrinsics.areEqual(this.disclosureBottomSheet, loaded.disclosureBottomSheet);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.assetClassRegion.hashCode() * 31) + this.title.hashCode()) * 31) + this.amountTabTitle.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.allocationRows.hashCode()) * 31) + this.classificationTabs.hashCode()) * 31) + Boolean.hashCode(this.showAmounts)) * 31) + Boolean.hashCode(this.showClassificationTabs)) * 31;
            DisclosureBottomSheet disclosureBottomSheet = this.disclosureBottomSheet;
            return iHashCode + (disclosureBottomSheet == null ? 0 : disclosureBottomSheet.hashCode());
        }

        public String toString() {
            return "Loaded(assetClassRegion=" + this.assetClassRegion + ", title=" + this.title + ", amountTabTitle=" + this.amountTabTitle + ", accountNumber=" + this.accountNumber + ", allocationRows=" + this.allocationRows + ", classificationTabs=" + this.classificationTabs + ", showAmounts=" + this.showAmounts + ", showClassificationTabs=" + this.showClassificationTabs + ", disclosureBottomSheet=" + this.disclosureBottomSheet + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(AssetClass3 assetClassRegion, StringResource title, StringResource amountTabTitle, String accountNumber, ImmutableList<AllocationRowData> allocationRows, ImmutableList<? extends HoldingsDrillDownViewState3> classificationTabs, boolean z, boolean z2, DisclosureBottomSheet disclosureBottomSheet) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amountTabTitle, "amountTabTitle");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(allocationRows, "allocationRows");
            Intrinsics.checkNotNullParameter(classificationTabs, "classificationTabs");
            this.assetClassRegion = assetClassRegion;
            this.title = title;
            this.amountTabTitle = amountTabTitle;
            this.accountNumber = accountNumber;
            this.allocationRows = allocationRows;
            this.classificationTabs = classificationTabs;
            this.showAmounts = z;
            this.showClassificationTabs = z2;
            this.disclosureBottomSheet = disclosureBottomSheet;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public StringResource getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public StringResource getAmountTabTitle() {
            return this.amountTabTitle;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public ImmutableList<AllocationRowData> getAllocationRows() {
            return this.allocationRows;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public ImmutableList<HoldingsDrillDownViewState3> getClassificationTabs() {
            return this.classificationTabs;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public boolean getShowAmounts() {
            return this.showAmounts;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public boolean getShowClassificationTabs() {
            return this.showClassificationTabs;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState
        public DisclosureBottomSheet getDisclosureBottomSheet() {
            return this.disclosureBottomSheet;
        }
    }
}
