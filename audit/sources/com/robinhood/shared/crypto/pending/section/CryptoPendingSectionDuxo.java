package com.robinhood.shared.crypto.pending.section;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualMarginEdit;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import com.robinhood.crypto.perpetuals.store.PerpetualHistoryStore;
import com.robinhood.crypto.perpetuals.store.PerpetualMarginEditHistoryStore;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferHistoryItem;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfig;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoPendingSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00014BY\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0002J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0!H\u0002J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\"0!H\u0002J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\"0!H\u0002J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\"0!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010,\u001a\u00020-*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u00020-*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0018\u00102\u001a\u00020-*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "perpetualsHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore;", "perpetualsMarginEditHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore;Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/app/type/AppType;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "fetchCryptoOrders", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "fetchCryptoTransfers", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "fetchPerpetualPendingOrders", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "fetchPerpetualPendingMarginEdits", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "fetchStakingHistoryItems", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "shouldFetchCrypto", "", "getShouldFetchCrypto", "(Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;)Z", "shouldFetchPerpetuals", "getShouldFetchPerpetuals", "shouldFetchStakingHistoryItems", "getShouldFetchStakingHistoryItems", "Companion", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoPendingSectionDuxo extends BaseDuxo<CryptoPendingSectionDataState, CryptoPendingSectionViewState> implements HasArgs<CryptoPendingSectionConfig> {
    private static final int PENDING_ORDERS_FETCH_COUNT = 6;
    private final AppType appType;
    private final CryptoOrderStore cryptoOrderStore;
    private final CryptoStakingStore cryptoStakingStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final PerpetualHistoryStore perpetualsHistoryStore;
    private final PerpetualMarginEditHistoryStore perpetualsMarginEditHistoryStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoPendingSectionConfig getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoPendingSectionConfig) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPendingSectionDuxo(CryptoOrderStore cryptoOrderStore, CryptoTransfersStore cryptoTransfersStore, CryptoStakingStore cryptoStakingStore, PerpetualHistoryStore perpetualsHistoryStore, PerpetualMarginEditHistoryStore perpetualsMarginEditHistoryStore, RegionGateProvider regionGateProvider, AppType appType, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoPendingSectionStateProvider stateProvider) {
        super(new CryptoPendingSectionDataState((CryptoPendingSectionConfig) INSTANCE.getArgs(savedStateHandle), appType, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(perpetualsHistoryStore, "perpetualsHistoryStore");
        Intrinsics.checkNotNullParameter(perpetualsMarginEditHistoryStore, "perpetualsMarginEditHistoryStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoOrderStore = cryptoOrderStore;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.perpetualsHistoryStore = perpetualsHistoryStore;
        this.perpetualsMarginEditHistoryStore = perpetualsMarginEditHistoryStore;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C377491(null));
    }

    /* compiled from: CryptoPendingSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000C\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J^\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006#"}, m3636d2 = {"com/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo$onCreate$TransformData", "", "pendingOrders", "", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "pendingTransfers", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "perpetualOrders", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "perpetualMarginEdits", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "pendingStakingHistoryItems", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPendingOrders", "()Ljava/util/List;", "getPendingTransfers", "getPerpetualOrders", "getPerpetualMarginEdits", "getPendingStakingHistoryItems", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo$onCreate$TransformData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransformData {
        private final List<UiCryptoOrder> pendingOrders;
        private final List<CryptoStakingHistoryItem> pendingStakingHistoryItems;
        private final List<CryptoTransferHistoryItem> pendingTransfers;
        private final List<UiPerpetualMarginEdit> perpetualMarginEdits;
        private final List<UiPerpetualOrderDetails> perpetualOrders;

        public static /* synthetic */ TransformData copy$default(TransformData transformData, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
            if ((i & 1) != 0) {
                list = transformData.pendingOrders;
            }
            if ((i & 2) != 0) {
                list2 = transformData.pendingTransfers;
            }
            if ((i & 4) != 0) {
                list3 = transformData.perpetualOrders;
            }
            if ((i & 8) != 0) {
                list4 = transformData.perpetualMarginEdits;
            }
            if ((i & 16) != 0) {
                list5 = transformData.pendingStakingHistoryItems;
            }
            List list6 = list5;
            List list7 = list3;
            return transformData.copy(list, list2, list7, list4, list6);
        }

        public final List<UiCryptoOrder> component1() {
            return this.pendingOrders;
        }

        public final List<CryptoTransferHistoryItem> component2() {
            return this.pendingTransfers;
        }

        public final List<UiPerpetualOrderDetails> component3() {
            return this.perpetualOrders;
        }

        public final List<UiPerpetualMarginEdit> component4() {
            return this.perpetualMarginEdits;
        }

        public final List<CryptoStakingHistoryItem> component5() {
            return this.pendingStakingHistoryItems;
        }

        public final TransformData copy(List<UiCryptoOrder> pendingOrders, List<CryptoTransferHistoryItem> pendingTransfers, List<UiPerpetualOrderDetails> perpetualOrders, List<UiPerpetualMarginEdit> perpetualMarginEdits, List<CryptoStakingHistoryItem> pendingStakingHistoryItems) {
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(pendingTransfers, "pendingTransfers");
            Intrinsics.checkNotNullParameter(perpetualOrders, "perpetualOrders");
            Intrinsics.checkNotNullParameter(perpetualMarginEdits, "perpetualMarginEdits");
            Intrinsics.checkNotNullParameter(pendingStakingHistoryItems, "pendingStakingHistoryItems");
            return new TransformData(pendingOrders, pendingTransfers, perpetualOrders, perpetualMarginEdits, pendingStakingHistoryItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformData)) {
                return false;
            }
            TransformData transformData = (TransformData) other;
            return Intrinsics.areEqual(this.pendingOrders, transformData.pendingOrders) && Intrinsics.areEqual(this.pendingTransfers, transformData.pendingTransfers) && Intrinsics.areEqual(this.perpetualOrders, transformData.perpetualOrders) && Intrinsics.areEqual(this.perpetualMarginEdits, transformData.perpetualMarginEdits) && Intrinsics.areEqual(this.pendingStakingHistoryItems, transformData.pendingStakingHistoryItems);
        }

        public int hashCode() {
            return (((((((this.pendingOrders.hashCode() * 31) + this.pendingTransfers.hashCode()) * 31) + this.perpetualOrders.hashCode()) * 31) + this.perpetualMarginEdits.hashCode()) * 31) + this.pendingStakingHistoryItems.hashCode();
        }

        public String toString() {
            return "TransformData(pendingOrders=" + this.pendingOrders + ", pendingTransfers=" + this.pendingTransfers + ", perpetualOrders=" + this.perpetualOrders + ", perpetualMarginEdits=" + this.perpetualMarginEdits + ", pendingStakingHistoryItems=" + this.pendingStakingHistoryItems + ")";
        }

        public TransformData(List<UiCryptoOrder> pendingOrders, List<CryptoTransferHistoryItem> pendingTransfers, List<UiPerpetualOrderDetails> perpetualOrders, List<UiPerpetualMarginEdit> perpetualMarginEdits, List<CryptoStakingHistoryItem> pendingStakingHistoryItems) {
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(pendingTransfers, "pendingTransfers");
            Intrinsics.checkNotNullParameter(perpetualOrders, "perpetualOrders");
            Intrinsics.checkNotNullParameter(perpetualMarginEdits, "perpetualMarginEdits");
            Intrinsics.checkNotNullParameter(pendingStakingHistoryItems, "pendingStakingHistoryItems");
            this.pendingOrders = pendingOrders;
            this.pendingTransfers = pendingTransfers;
            this.perpetualOrders = perpetualOrders;
            this.perpetualMarginEdits = perpetualMarginEdits;
            this.pendingStakingHistoryItems = pendingStakingHistoryItems;
        }

        public final List<UiCryptoOrder> getPendingOrders() {
            return this.pendingOrders;
        }

        public final List<CryptoTransferHistoryItem> getPendingTransfers() {
            return this.pendingTransfers;
        }

        public final List<UiPerpetualOrderDetails> getPerpetualOrders() {
            return this.perpetualOrders;
        }

        public final List<UiPerpetualMarginEdit> getPerpetualMarginEdits() {
            return this.perpetualMarginEdits;
        }

        public final List<CryptoStakingHistoryItem> getPendingStakingHistoryItems() {
            return this.pendingStakingHistoryItems;
        }
    }

    /* compiled from: CryptoPendingSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1", m3645f = "CryptoPendingSectionDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1 */
    static final class C377491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C377491(Continuation<? super C377491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPendingSectionDuxo.this.new C377491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(CryptoPendingSectionDuxo.this.fetchCryptoOrders(), CryptoPendingSectionDuxo.this.fetchCryptoTransfers(), CryptoPendingSectionDuxo.this.fetchPerpetualPendingOrders(), CryptoPendingSectionDuxo.this.fetchPerpetualPendingMarginEdits(), CryptoPendingSectionDuxo.this.fetchStakingHistoryItems(), AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CryptoPendingSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoPendingSectionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function6<List<? extends UiCryptoOrder>, List<? extends CryptoTransferHistoryItem>, List<? extends UiPerpetualOrderDetails>, List<? extends UiPerpetualMarginEdit>, List<? extends CryptoStakingHistoryItem>, Continuation<? super TransformData>, Object>, ContinuationImpl6 {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(6, TransformData.class, "<init>", "<init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiCryptoOrder> list, List<? extends CryptoTransferHistoryItem> list2, List<? extends UiPerpetualOrderDetails> list3, List<? extends UiPerpetualMarginEdit> list4, List<? extends CryptoStakingHistoryItem> list5, Continuation<? super TransformData> continuation) {
                return invoke2((List<UiCryptoOrder>) list, (List<CryptoTransferHistoryItem>) list2, (List<UiPerpetualOrderDetails>) list3, (List<UiPerpetualMarginEdit>) list4, (List<CryptoStakingHistoryItem>) list5, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiCryptoOrder> list, List<CryptoTransferHistoryItem> list2, List<UiPerpetualOrderDetails> list3, List<UiPerpetualMarginEdit> list4, List<CryptoStakingHistoryItem> list5, Continuation<? super TransformData> continuation) {
                return C377491.invokeSuspend$lambda$0(list, list2, list3, list4, list5, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(List list, List list2, List list3, List list4, List list5, Continuation continuation) {
            return new TransformData(list, list2, list3, list4, list5);
        }

        /* compiled from: CryptoPendingSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0000*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "com/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo$onCreate$TransformData"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1$4", m3645f = "CryptoPendingSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<TransformData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPendingSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoPendingSectionDuxo cryptoPendingSectionDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPendingSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransformData transformData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(transformData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPendingSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1$4$1", m3645f = "CryptoPendingSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPendingSectionDataState, Continuation<? super CryptoPendingSectionDataState>, Object> {
                final /* synthetic */ TransformData $data;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TransformData transformData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$data = transformData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPendingSectionDataState cryptoPendingSectionDataState, Continuation<? super CryptoPendingSectionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPendingSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoPendingSectionDataState.copy$default((CryptoPendingSectionDataState) this.L$0, null, null, this.$data.getPendingOrders(), this.$data.getPendingTransfers(), this.$data.getPerpetualOrders(), this.$data.getPerpetualMarginEdits(), this.$data.getPendingStakingHistoryItems(), 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((TransformData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<UiCryptoOrder>> fetchCryptoOrders() {
        Companion companion = INSTANCE;
        if (getShouldFetchCrypto((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this))) {
            return this.cryptoOrderStore.streamLatestPendingUiCryptoOrders(6, CryptoPendingSectionConfig2.getLocation((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this)));
        }
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<CryptoTransferHistoryItem>> fetchCryptoTransfers() {
        Companion companion = INSTANCE;
        if (getShouldFetchCrypto((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this))) {
            CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore;
            UUID currencyPairId = CryptoPendingSectionConfig2.getCurrencyPairId((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this));
            return cryptoTransfersStore.streamPendingTransfers(currencyPairId != null ? currencyPairId.toString() : null, 6, true);
        }
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<UiPerpetualOrderDetails>> fetchPerpetualPendingOrders() {
        if (!getShouldFetchPerpetuals((CryptoPendingSectionConfig) INSTANCE.getArgs((HasArgs) this))) {
            return FlowKt.flowOf(CollectionsKt.emptyList());
        }
        return FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null), new C37748x8318db53(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<UiPerpetualMarginEdit>> fetchPerpetualPendingMarginEdits() {
        if (!getShouldFetchPerpetuals((CryptoPendingSectionConfig) INSTANCE.getArgs((HasArgs) this))) {
            return FlowKt.flowOf(CollectionsKt.emptyList());
        }
        return FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null), new C37747xcf099c29(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<CryptoStakingHistoryItem>> fetchStakingHistoryItems() {
        Companion companion = INSTANCE;
        if (getShouldFetchStakingHistoryItems((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this))) {
            CryptoStakingStore cryptoStakingStore = this.cryptoStakingStore;
            UUID currencyPairId = CryptoPendingSectionConfig2.getCurrencyPairId((CryptoPendingSectionConfig) companion.getArgs((HasArgs) this));
            return cryptoStakingStore.streamLatestPendingHistoryItems(currencyPairId != null ? currencyPairId.toString() : null, 6, true);
        }
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }

    private final boolean getShouldFetchCrypto(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        if (Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.All.INSTANCE) || Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.Crypto.INSTANCE) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.CurrencyPairId)) {
            return true;
        }
        if ((cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.PerpetualContractId) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.Perpetuals)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getShouldFetchPerpetuals(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        if (this.appType != AppType.RHC) {
            return false;
        }
        if (Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.All.INSTANCE) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.PerpetualContractId) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.Perpetuals)) {
            return true;
        }
        if (Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.Crypto.INSTANCE) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.CurrencyPairId)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getShouldFetchStakingHistoryItems(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        if (Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.All.INSTANCE) || Intrinsics.areEqual(cryptoPendingSectionConfig, CryptoPendingSectionConfig.Crypto.INSTANCE) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.CurrencyPairId)) {
            return true;
        }
        if ((cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.PerpetualContractId) || (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.Perpetuals)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: CryptoPendingSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "<init>", "()V", "PENDING_ORDERS_FETCH_COUNT", "", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoPendingSectionDuxo, CryptoPendingSectionConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoPendingSectionConfig getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoPendingSectionConfig) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoPendingSectionConfig getArgs(CryptoPendingSectionDuxo cryptoPendingSectionDuxo) {
            return (CryptoPendingSectionConfig) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoPendingSectionDuxo);
        }
    }
}
