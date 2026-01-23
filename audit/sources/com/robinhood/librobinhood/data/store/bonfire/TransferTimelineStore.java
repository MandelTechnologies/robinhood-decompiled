package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: TransferTimelineStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferTimelineStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferTimelineStore$GetTransferTimelineRequestArgs;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$DynamicPostTransferTimeline;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "GetTransferTimelineRequestArgs", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TransferTimelineStore extends Store {
    private final Endpoint<GetTransferTimelineRequestArgs, Response<ApiPostTransferPage.DynamicPostTransferTimeline>> endpoint;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTimelineStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TransferTimelineStore2(this, null), getLogoutKillswitch(), new TransferTimelineStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: TransferTimelineStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferTimelineStore$GetTransferTimelineRequestArgs;", "", "transferId", "", "entryPoint", "", "<init>", "(Ljava/lang/String;I)V", "getTransferId", "()Ljava/lang/String;", "getEntryPoint", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetTransferTimelineRequestArgs {
        private final int entryPoint;
        private final String transferId;

        public static /* synthetic */ GetTransferTimelineRequestArgs copy$default(GetTransferTimelineRequestArgs getTransferTimelineRequestArgs, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = getTransferTimelineRequestArgs.transferId;
            }
            if ((i2 & 2) != 0) {
                i = getTransferTimelineRequestArgs.entryPoint;
            }
            return getTransferTimelineRequestArgs.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEntryPoint() {
            return this.entryPoint;
        }

        public final GetTransferTimelineRequestArgs copy(String transferId, int entryPoint) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            return new GetTransferTimelineRequestArgs(transferId, entryPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetTransferTimelineRequestArgs)) {
                return false;
            }
            GetTransferTimelineRequestArgs getTransferTimelineRequestArgs = (GetTransferTimelineRequestArgs) other;
            return Intrinsics.areEqual(this.transferId, getTransferTimelineRequestArgs.transferId) && this.entryPoint == getTransferTimelineRequestArgs.entryPoint;
        }

        public int hashCode() {
            return (this.transferId.hashCode() * 31) + Integer.hashCode(this.entryPoint);
        }

        public String toString() {
            return "GetTransferTimelineRequestArgs(transferId=" + this.transferId + ", entryPoint=" + this.entryPoint + ")";
        }

        public GetTransferTimelineRequestArgs(String transferId, int i) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
            this.entryPoint = i;
        }

        public /* synthetic */ GetTransferTimelineRequestArgs(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        public final String getTransferId() {
            return this.transferId;
        }

        public final int getEntryPoint() {
            return this.entryPoint;
        }
    }

    public final Endpoint<GetTransferTimelineRequestArgs, Response<ApiPostTransferPage.DynamicPostTransferTimeline>> getEndpoint() {
        return this.endpoint;
    }
}
