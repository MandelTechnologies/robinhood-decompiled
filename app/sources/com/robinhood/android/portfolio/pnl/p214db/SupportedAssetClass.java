package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportedAssetClass.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "", "assetClass", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "hasData", "", "<init>", "(Lcom/robinhood/android/models/portfolio/api/AssetClass;Z)V", "getAssetClass", "()Lcom/robinhood/android/models/portfolio/api/AssetClass;", "getHasData", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SupportedAssetClass {
    private final AssetClass assetClass;
    private final boolean hasData;

    public static /* synthetic */ SupportedAssetClass copy$default(SupportedAssetClass supportedAssetClass, AssetClass assetClass, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClass = supportedAssetClass.assetClass;
        }
        if ((i & 2) != 0) {
            z = supportedAssetClass.hasData;
        }
        return supportedAssetClass.copy(assetClass, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetClass getAssetClass() {
        return this.assetClass;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    public final SupportedAssetClass copy(AssetClass assetClass, boolean hasData) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        return new SupportedAssetClass(assetClass, hasData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedAssetClass)) {
            return false;
        }
        SupportedAssetClass supportedAssetClass = (SupportedAssetClass) other;
        return this.assetClass == supportedAssetClass.assetClass && this.hasData == supportedAssetClass.hasData;
    }

    public int hashCode() {
        return (this.assetClass.hashCode() * 31) + Boolean.hashCode(this.hasData);
    }

    public String toString() {
        return "SupportedAssetClass(assetClass=" + this.assetClass + ", hasData=" + this.hasData + ")";
    }

    public SupportedAssetClass(AssetClass assetClass, boolean z) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        this.assetClass = assetClass;
        this.hasData = z;
    }

    public final AssetClass getAssetClass() {
        return this.assetClass;
    }

    public final boolean getHasData() {
        return this.hasData;
    }
}
