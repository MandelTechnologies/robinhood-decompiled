package com.robinhood.android.advisory.portfolio.restrictstocks;

import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;", "", "isUpdating", "", "()Z", "assetId", "", "getAssetId", "()Ljava/lang/String;", "assetName", "getAssetName", "assetSymbol", "getAssetSymbol", "metaText", "Lcom/robinhood/utils/resource/StringResource;", "getMetaText", "()Lcom/robinhood/utils/resource/StringResource;", "RestrictedStockRowData", "ManagedPortfolioRowData", "SearchResultRowData", "SearchResultStatus", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$ManagedPortfolioRowData;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$RestrictedStockRowData;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultRowData;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData, reason: use source file name */
/* loaded from: classes7.dex */
public interface RestrictStocksViewState3 {
    String getAssetId();

    String getAssetName();

    String getAssetSymbol();

    StringResource getMetaText();

    boolean isUpdating();

    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$RestrictedStockRowData;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;", "isUpdating", "", "assetId", "", "assetName", "assetSymbol", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getAssetId", "()Ljava/lang/String;", "getAssetName", "getAssetSymbol", "metaText", "Lcom/robinhood/utils/resource/StringResource;", "getMetaText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData$RestrictedStockRowData, reason: from toString */
    public static final /* data */ class RestrictedStockRowData implements RestrictStocksViewState3 {
        public static final int $stable = 0;
        private final String assetId;
        private final String assetName;
        private final String assetSymbol;
        private final boolean isUpdating;

        public static /* synthetic */ RestrictedStockRowData copy$default(RestrictedStockRowData restrictedStockRowData, boolean z, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = restrictedStockRowData.isUpdating;
            }
            if ((i & 2) != 0) {
                str = restrictedStockRowData.assetId;
            }
            if ((i & 4) != 0) {
                str2 = restrictedStockRowData.assetName;
            }
            if ((i & 8) != 0) {
                str3 = restrictedStockRowData.assetSymbol;
            }
            return restrictedStockRowData.copy(z, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final RestrictedStockRowData copy(boolean isUpdating, String assetId, String assetName, String assetSymbol) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            return new RestrictedStockRowData(isUpdating, assetId, assetName, assetSymbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestrictedStockRowData)) {
                return false;
            }
            RestrictedStockRowData restrictedStockRowData = (RestrictedStockRowData) other;
            return this.isUpdating == restrictedStockRowData.isUpdating && Intrinsics.areEqual(this.assetId, restrictedStockRowData.assetId) && Intrinsics.areEqual(this.assetName, restrictedStockRowData.assetName) && Intrinsics.areEqual(this.assetSymbol, restrictedStockRowData.assetSymbol);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isUpdating) * 31) + this.assetId.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.assetSymbol.hashCode();
        }

        public String toString() {
            return "RestrictedStockRowData(isUpdating=" + this.isUpdating + ", assetId=" + this.assetId + ", assetName=" + this.assetName + ", assetSymbol=" + this.assetSymbol + ")";
        }

        public RestrictedStockRowData(boolean z, String assetId, String assetName, String assetSymbol) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            this.isUpdating = z;
            this.assetId = assetId;
            this.assetName = assetName;
            this.assetSymbol = assetSymbol;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public boolean isUpdating() {
            return this.isUpdating;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetId() {
            return this.assetId;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetName() {
            return this.assetName;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetSymbol() {
            return this.assetSymbol;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public StringResource getMetaText() {
            return StringResource.INSTANCE.invoke(C9151R.string.restrict_stocks_allow_button, new Object[0]);
        }
    }

    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$ManagedPortfolioRowData;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;", "isUpdating", "", "assetId", "", "assetName", "assetSymbol", "allocationPercentageString", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getAssetId", "()Ljava/lang/String;", "getAssetName", "getAssetSymbol", "getAllocationPercentageString", "metaText", "Lcom/robinhood/utils/resource/StringResource;", "getMetaText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData$ManagedPortfolioRowData, reason: from toString */
    public static final /* data */ class ManagedPortfolioRowData implements RestrictStocksViewState3 {
        public static final int $stable = 0;
        private final String allocationPercentageString;
        private final String assetId;
        private final String assetName;
        private final String assetSymbol;
        private final boolean isUpdating;

        public static /* synthetic */ ManagedPortfolioRowData copy$default(ManagedPortfolioRowData managedPortfolioRowData, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = managedPortfolioRowData.isUpdating;
            }
            if ((i & 2) != 0) {
                str = managedPortfolioRowData.assetId;
            }
            if ((i & 4) != 0) {
                str2 = managedPortfolioRowData.assetName;
            }
            if ((i & 8) != 0) {
                str3 = managedPortfolioRowData.assetSymbol;
            }
            if ((i & 16) != 0) {
                str4 = managedPortfolioRowData.allocationPercentageString;
            }
            String str5 = str4;
            String str6 = str2;
            return managedPortfolioRowData.copy(z, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAllocationPercentageString() {
            return this.allocationPercentageString;
        }

        public final ManagedPortfolioRowData copy(boolean isUpdating, String assetId, String assetName, String assetSymbol, String allocationPercentageString) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            Intrinsics.checkNotNullParameter(allocationPercentageString, "allocationPercentageString");
            return new ManagedPortfolioRowData(isUpdating, assetId, assetName, assetSymbol, allocationPercentageString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManagedPortfolioRowData)) {
                return false;
            }
            ManagedPortfolioRowData managedPortfolioRowData = (ManagedPortfolioRowData) other;
            return this.isUpdating == managedPortfolioRowData.isUpdating && Intrinsics.areEqual(this.assetId, managedPortfolioRowData.assetId) && Intrinsics.areEqual(this.assetName, managedPortfolioRowData.assetName) && Intrinsics.areEqual(this.assetSymbol, managedPortfolioRowData.assetSymbol) && Intrinsics.areEqual(this.allocationPercentageString, managedPortfolioRowData.allocationPercentageString);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isUpdating) * 31) + this.assetId.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + this.allocationPercentageString.hashCode();
        }

        public String toString() {
            return "ManagedPortfolioRowData(isUpdating=" + this.isUpdating + ", assetId=" + this.assetId + ", assetName=" + this.assetName + ", assetSymbol=" + this.assetSymbol + ", allocationPercentageString=" + this.allocationPercentageString + ")";
        }

        public ManagedPortfolioRowData(boolean z, String assetId, String assetName, String assetSymbol, String allocationPercentageString) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            Intrinsics.checkNotNullParameter(allocationPercentageString, "allocationPercentageString");
            this.isUpdating = z;
            this.assetId = assetId;
            this.assetName = assetName;
            this.assetSymbol = assetSymbol;
            this.allocationPercentageString = allocationPercentageString;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public boolean isUpdating() {
            return this.isUpdating;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetId() {
            return this.assetId;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetName() {
            return this.assetName;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final String getAllocationPercentageString() {
            return this.allocationPercentageString;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public StringResource getMetaText() {
            return StringResource.INSTANCE.invoke(this.allocationPercentageString);
        }
    }

    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultRowData;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;", "isUpdating", "", "assetId", "", "assetName", "assetSymbol", "status", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultStatus;", "percentageInPortfolioString", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultStatus;Ljava/lang/String;)V", "()Z", "getAssetId", "()Ljava/lang/String;", "getAssetName", "getAssetSymbol", "getStatus", "()Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultStatus;", "getPercentageInPortfolioString", "metaText", "Lcom/robinhood/utils/resource/StringResource;", "getMetaText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData$SearchResultRowData, reason: from toString */
    public static final /* data */ class SearchResultRowData implements RestrictStocksViewState3 {
        public static final int $stable = 0;
        private final String assetId;
        private final String assetName;
        private final String assetSymbol;
        private final boolean isUpdating;
        private final String percentageInPortfolioString;
        private final SearchResultStatus status;

        /* compiled from: RestrictStocksViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData$SearchResultRowData$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SearchResultStatus.values().length];
                try {
                    iArr[SearchResultStatus.IN_MANAGED_PORTFOLIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SearchResultStatus.NOT_IN_MANAGED_PORTFOLIO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SearchResultStatus.ALREADY_RESTRICTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SearchResultStatus.CONTROL_ASSET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ SearchResultRowData copy$default(SearchResultRowData searchResultRowData, boolean z, String str, String str2, String str3, SearchResultStatus searchResultStatus, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = searchResultRowData.isUpdating;
            }
            if ((i & 2) != 0) {
                str = searchResultRowData.assetId;
            }
            if ((i & 4) != 0) {
                str2 = searchResultRowData.assetName;
            }
            if ((i & 8) != 0) {
                str3 = searchResultRowData.assetSymbol;
            }
            if ((i & 16) != 0) {
                searchResultStatus = searchResultRowData.status;
            }
            if ((i & 32) != 0) {
                str4 = searchResultRowData.percentageInPortfolioString;
            }
            SearchResultStatus searchResultStatus2 = searchResultStatus;
            String str5 = str4;
            return searchResultRowData.copy(z, str, str2, str3, searchResultStatus2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component5, reason: from getter */
        public final SearchResultStatus getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPercentageInPortfolioString() {
            return this.percentageInPortfolioString;
        }

        public final SearchResultRowData copy(boolean isUpdating, String assetId, String assetName, String assetSymbol, SearchResultStatus status, String percentageInPortfolioString) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(percentageInPortfolioString, "percentageInPortfolioString");
            return new SearchResultRowData(isUpdating, assetId, assetName, assetSymbol, status, percentageInPortfolioString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchResultRowData)) {
                return false;
            }
            SearchResultRowData searchResultRowData = (SearchResultRowData) other;
            return this.isUpdating == searchResultRowData.isUpdating && Intrinsics.areEqual(this.assetId, searchResultRowData.assetId) && Intrinsics.areEqual(this.assetName, searchResultRowData.assetName) && Intrinsics.areEqual(this.assetSymbol, searchResultRowData.assetSymbol) && this.status == searchResultRowData.status && Intrinsics.areEqual(this.percentageInPortfolioString, searchResultRowData.percentageInPortfolioString);
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.isUpdating) * 31) + this.assetId.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + this.status.hashCode()) * 31) + this.percentageInPortfolioString.hashCode();
        }

        public String toString() {
            return "SearchResultRowData(isUpdating=" + this.isUpdating + ", assetId=" + this.assetId + ", assetName=" + this.assetName + ", assetSymbol=" + this.assetSymbol + ", status=" + this.status + ", percentageInPortfolioString=" + this.percentageInPortfolioString + ")";
        }

        public SearchResultRowData(boolean z, String assetId, String assetName, String assetSymbol, SearchResultStatus status, String percentageInPortfolioString) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(percentageInPortfolioString, "percentageInPortfolioString");
            this.isUpdating = z;
            this.assetId = assetId;
            this.assetName = assetName;
            this.assetSymbol = assetSymbol;
            this.status = status;
            this.percentageInPortfolioString = percentageInPortfolioString;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public boolean isUpdating() {
            return this.isUpdating;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetId() {
            return this.assetId;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetName() {
            return this.assetName;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final SearchResultStatus getStatus() {
            return this.status;
        }

        public /* synthetic */ SearchResultRowData(boolean z, String str, String str2, String str3, SearchResultStatus searchResultStatus, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, str3, searchResultStatus, (i & 32) != 0 ? "" : str4);
        }

        public final String getPercentageInPortfolioString() {
            return this.percentageInPortfolioString;
        }

        @Override // com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3
        public StringResource getMetaText() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.status.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(this.percentageInPortfolioString);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C9151R.string.asset_not_in_portfolio, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C9151R.string.asset_already_restricted, new Object[0]);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C9151R.string.control_asset, new Object[0]);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IN_MANAGED_PORTFOLIO", "NOT_IN_MANAGED_PORTFOLIO", "ALREADY_RESTRICTED", "CONTROL_ASSET", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksRowData$SearchResultStatus */
    public static final class SearchResultStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SearchResultStatus[] $VALUES;
        public static final SearchResultStatus IN_MANAGED_PORTFOLIO = new SearchResultStatus("IN_MANAGED_PORTFOLIO", 0);
        public static final SearchResultStatus NOT_IN_MANAGED_PORTFOLIO = new SearchResultStatus("NOT_IN_MANAGED_PORTFOLIO", 1);
        public static final SearchResultStatus ALREADY_RESTRICTED = new SearchResultStatus("ALREADY_RESTRICTED", 2);
        public static final SearchResultStatus CONTROL_ASSET = new SearchResultStatus("CONTROL_ASSET", 3);

        private static final /* synthetic */ SearchResultStatus[] $values() {
            return new SearchResultStatus[]{IN_MANAGED_PORTFOLIO, NOT_IN_MANAGED_PORTFOLIO, ALREADY_RESTRICTED, CONTROL_ASSET};
        }

        public static EnumEntries<SearchResultStatus> getEntries() {
            return $ENTRIES;
        }

        private SearchResultStatus(String str, int i) {
        }

        static {
            SearchResultStatus[] searchResultStatusArr$values = $values();
            $VALUES = searchResultStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(searchResultStatusArr$values);
        }

        public static SearchResultStatus valueOf(String str) {
            return (SearchResultStatus) Enum.valueOf(SearchResultStatus.class, str);
        }

        public static SearchResultStatus[] values() {
            return (SearchResultStatus[]) $VALUES.clone();
        }
    }
}
