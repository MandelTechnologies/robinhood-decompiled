package com.robinhood.utils.paging;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterlacedDataSource.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/utils/paging/BeginningLoad;", "ValueT", "", WebsocketGatewayConstants.DATA_KEY, "", "totalCount", "", "<init>", "(Ljava/util/List;I)V", "getData", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final /* data */ class BeginningLoad<ValueT> {
    private final List<ValueT> data;
    private final int totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeginningLoad copy$default(BeginningLoad beginningLoad, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = beginningLoad.data;
        }
        if ((i2 & 2) != 0) {
            i = beginningLoad.totalCount;
        }
        return beginningLoad.copy(list, i);
    }

    public final List<ValueT> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final BeginningLoad<ValueT> copy(List<? extends ValueT> data, int totalCount) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new BeginningLoad<>(data, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeginningLoad)) {
            return false;
        }
        BeginningLoad beginningLoad = (BeginningLoad) other;
        return Intrinsics.areEqual(this.data, beginningLoad.data) && this.totalCount == beginningLoad.totalCount;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Integer.hashCode(this.totalCount);
    }

    public String toString() {
        return "BeginningLoad(data=" + this.data + ", totalCount=" + this.totalCount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginningLoad(List<? extends ValueT> data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.totalCount = i;
    }

    public final List<ValueT> getData() {
        return this.data;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
