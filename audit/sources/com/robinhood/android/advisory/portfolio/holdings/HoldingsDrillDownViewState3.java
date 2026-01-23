package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HoldingsDrillDownViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "", "name", "Lcom/robinhood/utils/resource/StringResource;", "getName", "()Lcom/robinhood/utils/resource/StringResource;", "description", "getDescription", "percentage", "Ljava/math/BigDecimal;", "getPercentage", "()Ljava/math/BigDecimal;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "AssetRegionTabData", "SubAssetCategoryTabData", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData$AssetRegionTabData;", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData$SubAssetCategoryTabData;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.ClassificationTabData, reason: use source file name */
/* loaded from: classes7.dex */
public interface HoldingsDrillDownViewState3 {
    StringResource getDescription();

    String getLoggingIdentifier();

    StringResource getName();

    BigDecimal getPercentage();

    /* compiled from: HoldingsDrillDownViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData$AssetRegionTabData;", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "name", "Lcom/robinhood/utils/resource/StringResource;", "description", "percentage", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;)V", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "getName", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getPercentage", "()Ljava/math/BigDecimal;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.holdings.ClassificationTabData$AssetRegionTabData, reason: from toString */
    public static final /* data */ class AssetRegionTabData implements HoldingsDrillDownViewState3 {
        public static final int $stable = 8;
        private final AssetClass3 assetClassRegion;
        private final StringResource description;
        private final StringResource name;
        private final BigDecimal percentage;

        public static /* synthetic */ AssetRegionTabData copy$default(AssetRegionTabData assetRegionTabData, AssetClass3 assetClass3, StringResource stringResource, StringResource stringResource2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                assetClass3 = assetRegionTabData.assetClassRegion;
            }
            if ((i & 2) != 0) {
                stringResource = assetRegionTabData.name;
            }
            if ((i & 4) != 0) {
                stringResource2 = assetRegionTabData.description;
            }
            if ((i & 8) != 0) {
                bigDecimal = assetRegionTabData.percentage;
            }
            return assetRegionTabData.copy(assetClass3, stringResource, stringResource2, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getPercentage() {
            return this.percentage;
        }

        public final AssetRegionTabData copy(AssetClass3 assetClassRegion, StringResource name, StringResource description, BigDecimal percentage) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            return new AssetRegionTabData(assetClassRegion, name, description, percentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetRegionTabData)) {
                return false;
            }
            AssetRegionTabData assetRegionTabData = (AssetRegionTabData) other;
            return this.assetClassRegion == assetRegionTabData.assetClassRegion && Intrinsics.areEqual(this.name, assetRegionTabData.name) && Intrinsics.areEqual(this.description, assetRegionTabData.description) && Intrinsics.areEqual(this.percentage, assetRegionTabData.percentage);
        }

        public int hashCode() {
            return (((((this.assetClassRegion.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.percentage.hashCode();
        }

        public String toString() {
            return "AssetRegionTabData(assetClassRegion=" + this.assetClassRegion + ", name=" + this.name + ", description=" + this.description + ", percentage=" + this.percentage + ")";
        }

        public AssetRegionTabData(AssetClass3 assetClassRegion, StringResource name, StringResource description, BigDecimal percentage) {
            Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            this.assetClassRegion = assetClassRegion;
            this.name = name;
            this.description = description;
            this.percentage = percentage;
        }

        public final AssetClass3 getAssetClassRegion() {
            return this.assetClassRegion;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public StringResource getName() {
            return this.name;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public StringResource getDescription() {
            return this.description;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public BigDecimal getPercentage() {
            return this.percentage;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public String getLoggingIdentifier() {
            return ApiRenderablePlatforms.VERSIONS_ALL;
        }
    }

    /* compiled from: HoldingsDrillDownViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData$SubAssetCategoryTabData;", "Lcom/robinhood/android/advisory/portfolio/holdings/ClassificationTabData;", "subAssetClassCategory", "Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", "name", "Lcom/robinhood/utils/resource/StringResource;", "description", "percentage", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;)V", "getSubAssetClassCategory", "()Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", "getName", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getPercentage", "()Ljava/math/BigDecimal;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.holdings.ClassificationTabData$SubAssetCategoryTabData, reason: from toString */
    public static final /* data */ class SubAssetCategoryTabData implements HoldingsDrillDownViewState3 {
        public static final int $stable = 8;
        private final StringResource description;
        private final StringResource name;
        private final BigDecimal percentage;
        private final AssetClass5 subAssetClassCategory;

        public static /* synthetic */ SubAssetCategoryTabData copy$default(SubAssetCategoryTabData subAssetCategoryTabData, AssetClass5 assetClass5, StringResource stringResource, StringResource stringResource2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                assetClass5 = subAssetCategoryTabData.subAssetClassCategory;
            }
            if ((i & 2) != 0) {
                stringResource = subAssetCategoryTabData.name;
            }
            if ((i & 4) != 0) {
                stringResource2 = subAssetCategoryTabData.description;
            }
            if ((i & 8) != 0) {
                bigDecimal = subAssetCategoryTabData.percentage;
            }
            return subAssetCategoryTabData.copy(assetClass5, stringResource, stringResource2, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetClass5 getSubAssetClassCategory() {
            return this.subAssetClassCategory;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getPercentage() {
            return this.percentage;
        }

        public final SubAssetCategoryTabData copy(AssetClass5 subAssetClassCategory, StringResource name, StringResource description, BigDecimal percentage) {
            Intrinsics.checkNotNullParameter(subAssetClassCategory, "subAssetClassCategory");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            return new SubAssetCategoryTabData(subAssetClassCategory, name, description, percentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubAssetCategoryTabData)) {
                return false;
            }
            SubAssetCategoryTabData subAssetCategoryTabData = (SubAssetCategoryTabData) other;
            return this.subAssetClassCategory == subAssetCategoryTabData.subAssetClassCategory && Intrinsics.areEqual(this.name, subAssetCategoryTabData.name) && Intrinsics.areEqual(this.description, subAssetCategoryTabData.description) && Intrinsics.areEqual(this.percentage, subAssetCategoryTabData.percentage);
        }

        public int hashCode() {
            return (((((this.subAssetClassCategory.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.percentage.hashCode();
        }

        public String toString() {
            return "SubAssetCategoryTabData(subAssetClassCategory=" + this.subAssetClassCategory + ", name=" + this.name + ", description=" + this.description + ", percentage=" + this.percentage + ")";
        }

        public SubAssetCategoryTabData(AssetClass5 subAssetClassCategory, StringResource name, StringResource description, BigDecimal percentage) {
            Intrinsics.checkNotNullParameter(subAssetClassCategory, "subAssetClassCategory");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            this.subAssetClassCategory = subAssetClassCategory;
            this.name = name;
            this.description = description;
            this.percentage = percentage;
        }

        public final AssetClass5 getSubAssetClassCategory() {
            return this.subAssetClassCategory;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public StringResource getName() {
            return this.name;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public StringResource getDescription() {
            return this.description;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public BigDecimal getPercentage() {
            return this.percentage;
        }

        @Override // com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3
        public String getLoggingIdentifier() {
            return this.subAssetClassCategory.getServerValue();
        }
    }
}
