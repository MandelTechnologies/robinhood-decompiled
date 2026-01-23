package com.robinhood.contentful.model;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

/* compiled from: AssetDetail.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/contentful/model/GenericDetail;", "Lcom/robinhood/contentful/model/AssetDetail;", "size", "", "<init>", "(I)V", "getSize", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class GenericDetail extends AssetDetail {
    private final int size;

    public static /* synthetic */ GenericDetail copy$default(GenericDetail genericDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = genericDetail.size;
        }
        return genericDetail.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final GenericDetail copy(int size) {
        return new GenericDetail(size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericDetail) && this.size == ((GenericDetail) other).size;
    }

    public int hashCode() {
        return Integer.hashCode(this.size);
    }

    public String toString() {
        return "GenericDetail(size=" + this.size + ")";
    }

    @Override // com.robinhood.contentful.model.AssetDetail
    public int getSize() {
        return this.size;
    }

    public GenericDetail(int i) {
        super(null);
        this.size = i;
    }
}
