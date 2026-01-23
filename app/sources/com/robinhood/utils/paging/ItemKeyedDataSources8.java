package com.robinhood.utils.paging;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ItemKeyedDataSources.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/paging/ItemKeyedLoadResult;", "ValueT", "", "<init>", "()V", WebsocketGatewayConstants.DATA_KEY, "", "getData", "()Ljava/util/List;", "Initial", "Page", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult$Initial;", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult$Page;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.paging.ItemKeyedLoadResult, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class ItemKeyedDataSources8<ValueT> {
    public /* synthetic */ ItemKeyedDataSources8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<ValueT> getData();

    private ItemKeyedDataSources8() {
    }

    /* compiled from: ItemKeyedDataSources.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/paging/ItemKeyedLoadResult$Initial;", "ValueT", "", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult;", WebsocketGatewayConstants.DATA_KEY, "", "position", "", "totalCount", "<init>", "(Ljava/util/List;II)V", "getData", "()Ljava/util/List;", "getPosition", "()I", "getTotalCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.paging.ItemKeyedLoadResult$Initial, reason: from toString */
    public static final /* data */ class Initial<ValueT> extends ItemKeyedDataSources8<ValueT> {
        private final List<ValueT> data;
        private final int position;
        private final int totalCount;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initial copy$default(Initial initial, List list, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                list = initial.data;
            }
            if ((i3 & 2) != 0) {
                i = initial.position;
            }
            if ((i3 & 4) != 0) {
                i2 = initial.totalCount;
            }
            return initial.copy(list, i, i2);
        }

        public final List<ValueT> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public final Initial<ValueT> copy(List<? extends ValueT> data, int position, int totalCount) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Initial<>(data, position, totalCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initial)) {
                return false;
            }
            Initial initial = (Initial) other;
            return Intrinsics.areEqual(this.data, initial.data) && this.position == initial.position && this.totalCount == initial.totalCount;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.totalCount);
        }

        public String toString() {
            return "Initial(data=" + this.data + ", position=" + this.position + ", totalCount=" + this.totalCount + ")";
        }

        @Override // com.robinhood.utils.paging.ItemKeyedDataSources8
        public List<ValueT> getData() {
            return this.data;
        }

        public final int getPosition() {
            return this.position;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Initial(List<? extends ValueT> data, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.position = i;
            this.totalCount = i2;
        }
    }

    /* compiled from: ItemKeyedDataSources.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/paging/ItemKeyedLoadResult$Page;", "ValueT", "", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult;", WebsocketGatewayConstants.DATA_KEY, "", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.paging.ItemKeyedLoadResult$Page, reason: from toString */
    public static final /* data */ class Page<ValueT> extends ItemKeyedDataSources8<ValueT> {
        private final List<ValueT> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Page copy$default(Page page, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = page.data;
            }
            return page.copy(list);
        }

        public final List<ValueT> component1() {
            return this.data;
        }

        public final Page<ValueT> copy(List<? extends ValueT> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Page<>(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Page) && Intrinsics.areEqual(this.data, ((Page) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Page(data=" + this.data + ")";
        }

        @Override // com.robinhood.utils.paging.ItemKeyedDataSources8
        public List<ValueT> getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Page(List<? extends ValueT> data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }
}
