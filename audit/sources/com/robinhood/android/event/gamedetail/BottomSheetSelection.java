package com.robinhood.android.event.gamedetail;

import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetSelection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "", "ContractOption", "Position", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection$ContractOption;", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection$Position;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface BottomSheetSelection {

    /* compiled from: BottomSheetSelection.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/BottomSheetSelection$ContractOption;", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "<init>", "(Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;)V", "getData", "()Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractOption implements BottomSheetSelection {
        public static final int $stable = 8;
        private final ContractOptionData data;

        public static /* synthetic */ ContractOption copy$default(ContractOption contractOption, ContractOptionData contractOptionData, int i, Object obj) {
            if ((i & 1) != 0) {
                contractOptionData = contractOption.data;
            }
            return contractOption.copy(contractOptionData);
        }

        /* renamed from: component1, reason: from getter */
        public final ContractOptionData getData() {
            return this.data;
        }

        public final ContractOption copy(ContractOptionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ContractOption(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContractOption) && Intrinsics.areEqual(this.data, ((ContractOption) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ContractOption(data=" + this.data + ")";
        }

        public ContractOption(ContractOptionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final ContractOptionData getData() {
            return this.data;
        }
    }

    /* compiled from: BottomSheetSelection.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/BottomSheetSelection$Position;", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Position implements BottomSheetSelection {
        public static final int $stable = 8;
        private final UUID contractId;

        public static /* synthetic */ Position copy$default(Position position, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = position.contractId;
            }
            return position.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final Position copy(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new Position(contractId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Position) && Intrinsics.areEqual(this.contractId, ((Position) other).contractId);
        }

        public int hashCode() {
            return this.contractId.hashCode();
        }

        public String toString() {
            return "Position(contractId=" + this.contractId + ")";
        }

        public Position(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.contractId = contractId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }
}
