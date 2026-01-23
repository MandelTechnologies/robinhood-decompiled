package com.robinhood.android.acatsin.assets;

import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAssetListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState$Loaded;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState$Loading;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsInAssetListViewState {

    /* compiled from: AcatsInAssetListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState$Loading;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AcatsInAssetListViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1959111843;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AcatsInAssetListViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState$Loaded;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "title", "", "subtitle", "assetTypes", "", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse$AcatsListAssetType;", "assetRows", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse$AcatsListPageRow;", "assetChipsVisible", "", "selectedAssetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAssetTypes", "()Ljava/util/List;", "getAssetRows", "getAssetChipsVisible", "()Z", "getSelectedAssetType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AcatsInAssetListViewState {
        public static final int $stable = 8;
        private final boolean assetChipsVisible;
        private final List<AcatsListPageResponse.AcatsListPageRow> assetRows;
        private final List<AcatsListPageResponse.AcatsListAssetType> assetTypes;
        private final ApiAcatsTransfer.Asset.AssetType selectedAssetType;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, List list, List list2, boolean z, ApiAcatsTransfer.Asset.AssetType assetType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.subtitle;
            }
            if ((i & 4) != 0) {
                list = loaded.assetTypes;
            }
            if ((i & 8) != 0) {
                list2 = loaded.assetRows;
            }
            if ((i & 16) != 0) {
                z = loaded.assetChipsVisible;
            }
            if ((i & 32) != 0) {
                assetType = loaded.selectedAssetType;
            }
            boolean z2 = z;
            ApiAcatsTransfer.Asset.AssetType assetType2 = assetType;
            return loaded.copy(str, str2, list, list2, z2, assetType2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<AcatsListPageResponse.AcatsListAssetType> component3() {
            return this.assetTypes;
        }

        public final List<AcatsListPageResponse.AcatsListPageRow> component4() {
            return this.assetRows;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAssetChipsVisible() {
            return this.assetChipsVisible;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiAcatsTransfer.Asset.AssetType getSelectedAssetType() {
            return this.selectedAssetType;
        }

        public final Loaded copy(String title, String subtitle, List<AcatsListPageResponse.AcatsListAssetType> assetTypes, List<AcatsListPageResponse.AcatsListPageRow> assetRows, boolean assetChipsVisible, ApiAcatsTransfer.Asset.AssetType selectedAssetType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
            Intrinsics.checkNotNullParameter(assetRows, "assetRows");
            return new Loaded(title, subtitle, assetTypes, assetRows, assetChipsVisible, selectedAssetType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.assetTypes, loaded.assetTypes) && Intrinsics.areEqual(this.assetRows, loaded.assetRows) && this.assetChipsVisible == loaded.assetChipsVisible && this.selectedAssetType == loaded.selectedAssetType;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.assetTypes.hashCode()) * 31) + this.assetRows.hashCode()) * 31) + Boolean.hashCode(this.assetChipsVisible)) * 31;
            ApiAcatsTransfer.Asset.AssetType assetType = this.selectedAssetType;
            return iHashCode + (assetType == null ? 0 : assetType.hashCode());
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", assetTypes=" + this.assetTypes + ", assetRows=" + this.assetRows + ", assetChipsVisible=" + this.assetChipsVisible + ", selectedAssetType=" + this.selectedAssetType + ")";
        }

        public Loaded(String title, String subtitle, List<AcatsListPageResponse.AcatsListAssetType> assetTypes, List<AcatsListPageResponse.AcatsListPageRow> assetRows, boolean z, ApiAcatsTransfer.Asset.AssetType assetType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
            Intrinsics.checkNotNullParameter(assetRows, "assetRows");
            this.title = title;
            this.subtitle = subtitle;
            this.assetTypes = assetTypes;
            this.assetRows = assetRows;
            this.assetChipsVisible = z;
            this.selectedAssetType = assetType;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<AcatsListPageResponse.AcatsListAssetType> getAssetTypes() {
            return this.assetTypes;
        }

        public final List<AcatsListPageResponse.AcatsListPageRow> getAssetRows() {
            return this.assetRows;
        }

        public final boolean getAssetChipsVisible() {
            return this.assetChipsVisible;
        }

        public final ApiAcatsTransfer.Asset.AssetType getSelectedAssetType() {
            return this.selectedAssetType;
        }
    }
}
