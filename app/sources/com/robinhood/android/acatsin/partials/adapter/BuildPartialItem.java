package com.robinhood.android.acatsin.partials.adapter;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildPartialItem.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "areItemsTheSame", "", "other", "areContentsTheSame", "Header", "AddAsset", "Asset", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Asset;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Header;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class BuildPartialItem {
    public static final int $stable = 0;
    private final int viewType;

    public /* synthetic */ BuildPartialItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract boolean areContentsTheSame(BuildPartialItem other);

    public abstract boolean areItemsTheSame(BuildPartialItem other);

    private BuildPartialItem(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: BuildPartialItem.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Header;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "stringRes", "", "<init>", "(I)V", "getStringRes", "()I", "areItemsTheSame", "", "other", "areContentsTheSame", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Header extends BuildPartialItem {
        public static final int $stable = 0;
        private final int stringRes;

        public Header(int i) {
            super(0, null);
            this.stringRes = i;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areItemsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            Header header = other instanceof Header ? (Header) other : null;
            return header != null && this.stringRes == header.stringRes;
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areContentsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return areItemsTheSame(other);
        }
    }

    /* compiled from: BuildPartialItem.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "stringRes", "", "type", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "isMarginSupported", "", "<init>", "(ILcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;Z)V", "getStringRes", "()I", "getType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "()Z", "areItemsTheSame", "other", "areContentsTheSame", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AddAsset extends BuildPartialItem {
        public static final int $stable = 0;
        private final boolean isMarginSupported;
        private final int stringRes;
        private final ApiAcatsTransfer.Asset.AssetType type;

        public /* synthetic */ AddAsset(int i, ApiAcatsTransfer.Asset.AssetType assetType, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, assetType, (i2 & 4) != 0 ? false : z);
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public final ApiAcatsTransfer.Asset.AssetType getType() {
            return this.type;
        }

        /* renamed from: isMarginSupported, reason: from getter */
        public final boolean getIsMarginSupported() {
            return this.isMarginSupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddAsset(int i, ApiAcatsTransfer.Asset.AssetType type2, boolean z) {
            super(1, null);
            Intrinsics.checkNotNullParameter(type2, "type");
            this.stringRes = i;
            this.type = type2;
            this.isMarginSupported = z;
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areItemsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            AddAsset addAsset = other instanceof AddAsset ? (AddAsset) other : null;
            return addAsset != null && this.stringRes == addAsset.stringRes && this.type == addAsset.type;
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areContentsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return areItemsTheSame(other);
        }
    }

    /* compiled from: BuildPartialItem.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Asset;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;)V", "getAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "areItemsTheSame", "", "other", "areContentsTheSame", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Asset extends BuildPartialItem {
        public static final int $stable = 0;
        private final UiAcatsAsset asset;

        public final UiAcatsAsset getAsset() {
            return this.asset;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Asset(UiAcatsAsset asset) {
            super(2, null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areItemsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            Asset asset = other instanceof Asset ? (Asset) other : null;
            if (asset == null) {
                return false;
            }
            return Intrinsics.areEqual(this.asset, asset.asset);
        }

        @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialItem
        public boolean areContentsTheSame(BuildPartialItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return areItemsTheSame(other);
        }
    }
}
