package com.robinhood.contentful.model;

import android.util.Size;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDetail.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/contentful/model/ImageDetail;", "Lcom/robinhood/contentful/model/AssetDetail;", "size", "", "dimensions", "Landroid/util/Size;", "<init>", "(ILandroid/util/Size;)V", "getSize", "()I", "getDimensions", "()Landroid/util/Size;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ImageDetail extends AssetDetail {
    private final Size dimensions;
    private final int size;

    public static /* synthetic */ ImageDetail copy$default(ImageDetail imageDetail, int i, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = imageDetail.size;
        }
        if ((i2 & 2) != 0) {
            size = imageDetail.dimensions;
        }
        return imageDetail.copy(i, size);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final Size getDimensions() {
        return this.dimensions;
    }

    public final ImageDetail copy(int size, @Json(name = "image") Size dimensions) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        return new ImageDetail(size, dimensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDetail)) {
            return false;
        }
        ImageDetail imageDetail = (ImageDetail) other;
        return this.size == imageDetail.size && Intrinsics.areEqual(this.dimensions, imageDetail.dimensions);
    }

    public int hashCode() {
        return (Integer.hashCode(this.size) * 31) + this.dimensions.hashCode();
    }

    public String toString() {
        return "ImageDetail(size=" + this.size + ", dimensions=" + this.dimensions + ")";
    }

    @Override // com.robinhood.contentful.model.AssetDetail
    public int getSize() {
        return this.size;
    }

    public final Size getDimensions() {
        return this.dimensions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetail(int i, @Json(name = "image") Size dimensions) {
        super(null);
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.size = i;
        this.dimensions = dimensions;
    }
}
