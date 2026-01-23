package com.robinhood.android.compose.maps;

import kotlin.Metadata;

/* compiled from: BentoMapStyle.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/compose/maps/MapStyle;", "", "rawJsonResourceId", "", "<init>", "(I)V", "getRawJsonResourceId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-maps_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MapStyle {
    public static final int $stable = 0;
    private final int rawJsonResourceId;

    public static /* synthetic */ MapStyle copy$default(MapStyle mapStyle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mapStyle.rawJsonResourceId;
        }
        return mapStyle.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRawJsonResourceId() {
        return this.rawJsonResourceId;
    }

    public final MapStyle copy(int rawJsonResourceId) {
        return new MapStyle(rawJsonResourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapStyle) && this.rawJsonResourceId == ((MapStyle) other).rawJsonResourceId;
    }

    public int hashCode() {
        return Integer.hashCode(this.rawJsonResourceId);
    }

    public String toString() {
        return "MapStyle(rawJsonResourceId=" + this.rawJsonResourceId + ")";
    }

    public MapStyle(int i) {
        this.rawJsonResourceId = i;
    }

    public final int getRawJsonResourceId() {
        return this.rawJsonResourceId;
    }
}
