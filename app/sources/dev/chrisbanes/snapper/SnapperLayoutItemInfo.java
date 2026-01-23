package dev.chrisbanes.snapper;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: SnapperFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, m3636d2 = {"Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "", "()V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getIndex", "()I", "offset", "getOffset", "size", "getSize", "toString", "", "lib_release"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class SnapperLayoutItemInfo {
    public abstract int getIndex();

    public abstract int getOffset();

    public abstract int getSize();

    public String toString() {
        return "SnapperLayoutItemInfo(index=" + getIndex() + ", offset=" + getOffset() + ", size=" + getSize() + ")";
    }
}
