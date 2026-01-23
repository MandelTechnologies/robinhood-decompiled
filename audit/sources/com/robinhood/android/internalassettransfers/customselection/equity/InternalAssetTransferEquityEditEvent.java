package com.robinhood.android.internalassettransfers.customselection.equity;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEquityEditEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent;", "", "ShareSelectionMade", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent$ShareSelectionMade;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferEquityEditEvent {

    /* compiled from: InternalAssetTransferEquityEditEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent$ShareSelectionMade;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent;", "instrumentId", "Ljava/util/UUID;", "shareSelection", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;)V", "getInstrumentId", "()Ljava/util/UUID;", "getShareSelection", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareSelectionMade implements InternalAssetTransferEquityEditEvent {
        public static final int $stable = 8;
        private final UUID instrumentId;
        private final ShareSelection shareSelection;

        public static /* synthetic */ ShareSelectionMade copy$default(ShareSelectionMade shareSelectionMade, UUID uuid, ShareSelection shareSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = shareSelectionMade.instrumentId;
            }
            if ((i & 2) != 0) {
                shareSelection = shareSelectionMade.shareSelection;
            }
            return shareSelectionMade.copy(uuid, shareSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final ShareSelection getShareSelection() {
            return this.shareSelection;
        }

        public final ShareSelectionMade copy(UUID instrumentId, ShareSelection shareSelection) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(shareSelection, "shareSelection");
            return new ShareSelectionMade(instrumentId, shareSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareSelectionMade)) {
                return false;
            }
            ShareSelectionMade shareSelectionMade = (ShareSelectionMade) other;
            return Intrinsics.areEqual(this.instrumentId, shareSelectionMade.instrumentId) && Intrinsics.areEqual(this.shareSelection, shareSelectionMade.shareSelection);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.shareSelection.hashCode();
        }

        public String toString() {
            return "ShareSelectionMade(instrumentId=" + this.instrumentId + ", shareSelection=" + this.shareSelection + ")";
        }

        public ShareSelectionMade(UUID instrumentId, ShareSelection shareSelection) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(shareSelection, "shareSelection");
            this.instrumentId = instrumentId;
            this.shareSelection = shareSelection;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final ShareSelection getShareSelection() {
            return this.shareSelection;
        }
    }
}
