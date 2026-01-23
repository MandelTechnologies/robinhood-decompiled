package com.robinhood.shared.crypto.pending.section;

import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualMarginEdit;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import com.robinhood.crypto.perpetuals.values.UiPerpetualMarginEditValues;
import com.robinhood.crypto.perpetuals.values.UiPerpetualOrderDetailValues;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferHistoryItem;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.pending.rows.PendingData;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: CryptoPendingSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002CDBg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010.\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b1J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÀ\u0003¢\u0006\u0002\b3J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÀ\u0003¢\u0006\u0002\b5J\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÀ\u0003¢\u0006\u0002\b7J\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007HÀ\u0003¢\u0006\u0002\b9J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÀ\u0003¢\u0006\u0002\b;Jm\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0001J\u0013\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+R\u0014\u0010,\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState;", "", "config", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "pendingOrders", "", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "pendingTransfers", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "perpetualOrders", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "perpetualMarginEdits", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "pendingStakingHistoryItems", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "<init>", "(Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;Lcom/robinhood/shared/app/type/AppType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getConfig$lib_pending_section_externalDebug", "()Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "getAppType$lib_pending_section_externalDebug", "()Lcom/robinhood/shared/app/type/AppType;", "getPendingOrders$lib_pending_section_externalDebug", "()Ljava/util/List;", "getPendingTransfers$lib_pending_section_externalDebug", "getPerpetualOrders$lib_pending_section_externalDebug", "getPerpetualMarginEdits$lib_pending_section_externalDebug", "getPendingStakingHistoryItems$lib_pending_section_externalDebug", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "pendingItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "getPendingItems", "()Lkotlinx/collections/immutable/ImmutableList;", "pendingOrdersData", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getPendingOrdersData$lib_pending_section_externalDebug", "isShowMoreVisible", "", "()Z", "shouldDisplayCurrencyCode", "getShouldDisplayCurrencyCode", "component1", "component1$lib_pending_section_externalDebug", "component2", "component2$lib_pending_section_externalDebug", "component3", "component3$lib_pending_section_externalDebug", "component4", "component4$lib_pending_section_externalDebug", "component5", "component5$lib_pending_section_externalDebug", "component6", "component6$lib_pending_section_externalDebug", "component7", "component7$lib_pending_section_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "", "PendingItem", "Companion", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoPendingSectionDataState {
    private static final int PENDING_ORDERS_DISPLAY_COUNT = 5;
    private final AppType appType;
    private final CryptoPendingSectionConfig config;
    private final List<UiCryptoOrder> pendingOrders;
    private final List<CryptoStakingHistoryItem> pendingStakingHistoryItems;
    private final List<CryptoTransferHistoryItem> pendingTransfers;
    private final List<UiPerpetualMarginEdit> perpetualMarginEdits;
    private final List<UiPerpetualOrderDetails> perpetualOrders;
    public static final int $stable = 8;

    public static /* synthetic */ CryptoPendingSectionDataState copy$default(CryptoPendingSectionDataState cryptoPendingSectionDataState, CryptoPendingSectionConfig cryptoPendingSectionConfig, AppType appType, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoPendingSectionConfig = cryptoPendingSectionDataState.config;
        }
        if ((i & 2) != 0) {
            appType = cryptoPendingSectionDataState.appType;
        }
        if ((i & 4) != 0) {
            list = cryptoPendingSectionDataState.pendingOrders;
        }
        if ((i & 8) != 0) {
            list2 = cryptoPendingSectionDataState.pendingTransfers;
        }
        if ((i & 16) != 0) {
            list3 = cryptoPendingSectionDataState.perpetualOrders;
        }
        if ((i & 32) != 0) {
            list4 = cryptoPendingSectionDataState.perpetualMarginEdits;
        }
        if ((i & 64) != 0) {
            list5 = cryptoPendingSectionDataState.pendingStakingHistoryItems;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list3;
        List list9 = list;
        return cryptoPendingSectionDataState.copy(cryptoPendingSectionConfig, appType, list9, list2, list8, list6, list7);
    }

    /* renamed from: component1$lib_pending_section_externalDebug, reason: from getter */
    public final CryptoPendingSectionConfig getConfig() {
        return this.config;
    }

    /* renamed from: component2$lib_pending_section_externalDebug, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    public final List<UiCryptoOrder> component3$lib_pending_section_externalDebug() {
        return this.pendingOrders;
    }

    public final List<CryptoTransferHistoryItem> component4$lib_pending_section_externalDebug() {
        return this.pendingTransfers;
    }

    public final List<UiPerpetualOrderDetails> component5$lib_pending_section_externalDebug() {
        return this.perpetualOrders;
    }

    public final List<UiPerpetualMarginEdit> component6$lib_pending_section_externalDebug() {
        return this.perpetualMarginEdits;
    }

    public final List<CryptoStakingHistoryItem> component7$lib_pending_section_externalDebug() {
        return this.pendingStakingHistoryItems;
    }

    public final CryptoPendingSectionDataState copy(CryptoPendingSectionConfig config, AppType appType, List<UiCryptoOrder> pendingOrders, List<CryptoTransferHistoryItem> pendingTransfers, List<UiPerpetualOrderDetails> perpetualOrders, List<UiPerpetualMarginEdit> perpetualMarginEdits, List<CryptoStakingHistoryItem> pendingStakingHistoryItems) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(pendingTransfers, "pendingTransfers");
        Intrinsics.checkNotNullParameter(perpetualOrders, "perpetualOrders");
        Intrinsics.checkNotNullParameter(perpetualMarginEdits, "perpetualMarginEdits");
        Intrinsics.checkNotNullParameter(pendingStakingHistoryItems, "pendingStakingHistoryItems");
        return new CryptoPendingSectionDataState(config, appType, pendingOrders, pendingTransfers, perpetualOrders, perpetualMarginEdits, pendingStakingHistoryItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPendingSectionDataState)) {
            return false;
        }
        CryptoPendingSectionDataState cryptoPendingSectionDataState = (CryptoPendingSectionDataState) other;
        return Intrinsics.areEqual(this.config, cryptoPendingSectionDataState.config) && this.appType == cryptoPendingSectionDataState.appType && Intrinsics.areEqual(this.pendingOrders, cryptoPendingSectionDataState.pendingOrders) && Intrinsics.areEqual(this.pendingTransfers, cryptoPendingSectionDataState.pendingTransfers) && Intrinsics.areEqual(this.perpetualOrders, cryptoPendingSectionDataState.perpetualOrders) && Intrinsics.areEqual(this.perpetualMarginEdits, cryptoPendingSectionDataState.perpetualMarginEdits) && Intrinsics.areEqual(this.pendingStakingHistoryItems, cryptoPendingSectionDataState.pendingStakingHistoryItems);
    }

    public int hashCode() {
        return (((((((((((this.config.hashCode() * 31) + this.appType.hashCode()) * 31) + this.pendingOrders.hashCode()) * 31) + this.pendingTransfers.hashCode()) * 31) + this.perpetualOrders.hashCode()) * 31) + this.perpetualMarginEdits.hashCode()) * 31) + this.pendingStakingHistoryItems.hashCode();
    }

    public String toString() {
        return "CryptoPendingSectionDataState(config=" + this.config + ", appType=" + this.appType + ", pendingOrders=" + this.pendingOrders + ", pendingTransfers=" + this.pendingTransfers + ", perpetualOrders=" + this.perpetualOrders + ", perpetualMarginEdits=" + this.perpetualMarginEdits + ", pendingStakingHistoryItems=" + this.pendingStakingHistoryItems + ")";
    }

    public CryptoPendingSectionDataState(CryptoPendingSectionConfig config, AppType appType, List<UiCryptoOrder> pendingOrders, List<CryptoTransferHistoryItem> pendingTransfers, List<UiPerpetualOrderDetails> perpetualOrders, List<UiPerpetualMarginEdit> perpetualMarginEdits, List<CryptoStakingHistoryItem> pendingStakingHistoryItems) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(pendingTransfers, "pendingTransfers");
        Intrinsics.checkNotNullParameter(perpetualOrders, "perpetualOrders");
        Intrinsics.checkNotNullParameter(perpetualMarginEdits, "perpetualMarginEdits");
        Intrinsics.checkNotNullParameter(pendingStakingHistoryItems, "pendingStakingHistoryItems");
        this.config = config;
        this.appType = appType;
        this.pendingOrders = pendingOrders;
        this.pendingTransfers = pendingTransfers;
        this.perpetualOrders = perpetualOrders;
        this.perpetualMarginEdits = perpetualMarginEdits;
        this.pendingStakingHistoryItems = pendingStakingHistoryItems;
    }

    public final CryptoPendingSectionConfig getConfig$lib_pending_section_externalDebug() {
        return this.config;
    }

    public final AppType getAppType$lib_pending_section_externalDebug() {
        return this.appType;
    }

    public /* synthetic */ CryptoPendingSectionDataState(CryptoPendingSectionConfig cryptoPendingSectionConfig, AppType appType, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoPendingSectionConfig, appType, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3, (i & 32) != 0 ? CollectionsKt.emptyList() : list4, (i & 64) != 0 ? CollectionsKt.emptyList() : list5);
    }

    public final List<UiCryptoOrder> getPendingOrders$lib_pending_section_externalDebug() {
        return this.pendingOrders;
    }

    public final List<CryptoTransferHistoryItem> getPendingTransfers$lib_pending_section_externalDebug() {
        return this.pendingTransfers;
    }

    public final List<UiPerpetualOrderDetails> getPerpetualOrders$lib_pending_section_externalDebug() {
        return this.perpetualOrders;
    }

    public final List<UiPerpetualMarginEdit> getPerpetualMarginEdits$lib_pending_section_externalDebug() {
        return this.perpetualMarginEdits;
    }

    public final List<CryptoStakingHistoryItem> getPendingStakingHistoryItems$lib_pending_section_externalDebug() {
        return this.pendingStakingHistoryItems;
    }

    public final StringResource getTitle() {
        return StringResource.INSTANCE.invoke(C37751R.string.crypto_pending_header_title, new Object[0]);
    }

    private final ImmutableList<PendingItem> getPendingItems() {
        Sequence map = SequencesKt.map(CollectionsKt.asSequence(this.pendingOrders), new Function1() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPendingSectionDataState._get_pendingItems_$lambda$0(this.f$0, (UiCryptoOrder) obj);
            }
        });
        List<CryptoTransferHistoryItem> list = this.pendingTransfers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingItem.Transfer((CryptoTransferHistoryItem) it.next(), getShouldDisplayCurrencyCode()));
        }
        Sequence sequencePlus = SequencesKt.plus(map, (Iterable) arrayList);
        List<UiPerpetualOrderDetails> list2 = this.perpetualOrders;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new PendingItem.PerpetualOrder((UiPerpetualOrderDetails) it2.next()));
        }
        Sequence sequencePlus2 = SequencesKt.plus(sequencePlus, (Iterable) arrayList2);
        List<UiPerpetualMarginEdit> list3 = this.perpetualMarginEdits;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new PendingItem.PerpetualMarginEdit((UiPerpetualMarginEdit) it3.next()));
        }
        Sequence sequencePlus3 = SequencesKt.plus(sequencePlus2, (Iterable) arrayList3);
        List<CryptoStakingHistoryItem> list4 = this.pendingStakingHistoryItems;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new PendingItem.StakingHistoryItem((CryptoStakingHistoryItem) it4.next(), getShouldDisplayCurrencyCode()));
        }
        return extensions2.toImmutableList(SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.plus(sequencePlus3, (Iterable) arrayList4), new Comparator() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState$special$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((CryptoPendingSectionDataState.PendingItem) t2).getSortTimestamp(), ((CryptoPendingSectionDataState.PendingItem) t).getSortTimestamp());
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PendingItem.Order _get_pendingItems_$lambda$0(CryptoPendingSectionDataState cryptoPendingSectionDataState, UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
        return new PendingItem.Order(uiCryptoOrder, cryptoPendingSectionDataState.getShouldDisplayCurrencyCode(), cryptoPendingSectionDataState.appType);
    }

    public final ImmutableList<PendingData> getPendingOrdersData$lib_pending_section_externalDebug() {
        ImmutableList<PendingItem> pendingItems = getPendingItems();
        ArrayList arrayList = new ArrayList();
        Iterator<PendingItem> it = pendingItems.iterator();
        while (it.hasNext()) {
            PendingData uiPendingData = it.next().getUiPendingData();
            if (uiPendingData != null) {
                arrayList.add(uiPendingData);
            }
        }
        return extensions2.toImmutableList(CollectionsKt.take(arrayList, 5));
    }

    public final boolean isShowMoreVisible() {
        return getPendingItems().size() > 5;
    }

    private final boolean getShouldDisplayCurrencyCode() {
        return CryptoPendingSectionConfig2.getCurrencyPairId(this.config) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoPendingSectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "Order", "Transfer", "PerpetualOrder", "PerpetualMarginEdit", "StakingHistoryItem", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Order;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualMarginEdit;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualOrder;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$StakingHistoryItem;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Transfer;", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    interface PendingItem {
        Instant getSortTimestamp();

        PendingData getUiPendingData();

        /* compiled from: CryptoPendingSectionDataState.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Order;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", WebsocketGatewayConstants.DATA_KEY, "", "shouldDisplayCurrencyCode", "Lcom/robinhood/shared/app/type/AppType;", "appType", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZLcom/robinhood/shared/app/type/AppType;)V", "component1", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component2", "()Z", "component3", "()Lcom/robinhood/shared/app/type/AppType;", "copy", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZLcom/robinhood/shared/app/type/AppType;)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Order;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "Z", "Lcom/robinhood/shared/app/type/AppType;", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Order implements PendingItem {
            public static final int $stable = 8;
            private final AppType appType;
            private final UiCryptoOrder data;
            private final boolean shouldDisplayCurrencyCode;

            /* compiled from: CryptoPendingSectionDataState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderSide.values().length];
                    try {
                        iArr[OrderSide.BUY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderSide.SELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final UiCryptoOrder getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            private final boolean getShouldDisplayCurrencyCode() {
                return this.shouldDisplayCurrencyCode;
            }

            /* renamed from: component3, reason: from getter */
            private final AppType getAppType() {
                return this.appType;
            }

            public static /* synthetic */ Order copy$default(Order order, UiCryptoOrder uiCryptoOrder, boolean z, AppType appType, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCryptoOrder = order.data;
                }
                if ((i & 2) != 0) {
                    z = order.shouldDisplayCurrencyCode;
                }
                if ((i & 4) != 0) {
                    appType = order.appType;
                }
                return order.copy(uiCryptoOrder, z, appType);
            }

            public final Order copy(UiCryptoOrder data, boolean shouldDisplayCurrencyCode, AppType appType) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(appType, "appType");
                return new Order(data, shouldDisplayCurrencyCode, appType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Order)) {
                    return false;
                }
                Order order = (Order) other;
                return Intrinsics.areEqual(this.data, order.data) && this.shouldDisplayCurrencyCode == order.shouldDisplayCurrencyCode && this.appType == order.appType;
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + Boolean.hashCode(this.shouldDisplayCurrencyCode)) * 31) + this.appType.hashCode();
            }

            public String toString() {
                return "Order(data=" + this.data + ", shouldDisplayCurrencyCode=" + this.shouldDisplayCurrencyCode + ", appType=" + this.appType + ")";
            }

            public Order(UiCryptoOrder data, boolean z, AppType appType) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(appType, "appType");
                this.data = data;
                this.shouldDisplayCurrencyCode = z;
                this.appType = appType;
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public Instant getSortTimestamp() {
                return this.data.getCryptoOrder().getUpdatedAt();
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public PendingData getUiPendingData() {
                int i;
                UiCryptoOrder uiCryptoOrder = this.data;
                PendingData.Type type2 = PendingData.Type.ORDER;
                UUID id = uiCryptoOrder.getId();
                StringResource stringResourceTypeText = !this.shouldDisplayCurrencyCode ? UiCryptoOrders.typeText(uiCryptoOrder, this.appType) : UiCryptoOrders.getGetHistoryTitle(uiCryptoOrder);
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                if (i2 == 1) {
                    i = C37751R.string.crypto_pending_orders_row_buy_order_quantity;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C37751R.string.crypto_pending_orders_row_sell_order_quantity;
                }
                return new PendingData(type2, id, stringResourceTypeText, companion.invoke(i, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrency(), uiCryptoOrder.getCryptoOrder().getQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null)), UiCryptoOrders.getOrderEndPrimaryText(uiCryptoOrder), UiCryptoOrders.getOrderEndSecondaryText(uiCryptoOrder));
            }
        }

        /* compiled from: CryptoPendingSectionDataState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Transfer;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", WebsocketGatewayConstants.DATA_KEY, "", "shouldDisplayCurrencyCode", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;Z)V", "component1", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "component2", "()Z", "copy", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;Z)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$Transfer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "Z", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Transfer implements PendingItem {
            public static final int $stable = 8;
            private final CryptoTransferHistoryItem data;
            private final boolean shouldDisplayCurrencyCode;

            /* compiled from: CryptoPendingSectionDataState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Money.Direction.values().length];
                    try {
                        iArr[Money.Direction.CREDIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Money.Direction.DEBIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final CryptoTransferHistoryItem getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            private final boolean getShouldDisplayCurrencyCode() {
                return this.shouldDisplayCurrencyCode;
            }

            public static /* synthetic */ Transfer copy$default(Transfer transfer, CryptoTransferHistoryItem cryptoTransferHistoryItem, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoTransferHistoryItem = transfer.data;
                }
                if ((i & 2) != 0) {
                    z = transfer.shouldDisplayCurrencyCode;
                }
                return transfer.copy(cryptoTransferHistoryItem, z);
            }

            public final Transfer copy(CryptoTransferHistoryItem data, boolean shouldDisplayCurrencyCode) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new Transfer(data, shouldDisplayCurrencyCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Transfer)) {
                    return false;
                }
                Transfer transfer = (Transfer) other;
                return Intrinsics.areEqual(this.data, transfer.data) && this.shouldDisplayCurrencyCode == transfer.shouldDisplayCurrencyCode;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.shouldDisplayCurrencyCode);
            }

            public String toString() {
                return "Transfer(data=" + this.data + ", shouldDisplayCurrencyCode=" + this.shouldDisplayCurrencyCode + ")";
            }

            public Transfer(CryptoTransferHistoryItem data, boolean z) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this.shouldDisplayCurrencyCode = z;
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public Instant getSortTimestamp() {
                return this.data.getInitiatedAt();
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public PendingData getUiPendingData() {
                int i;
                StringResource stringResourceInvoke;
                StringResource stringResourceInvoke2;
                String amountSubtitle;
                int i2;
                CryptoTransferHistoryItem cryptoTransferHistoryItem = this.data;
                PendingData.Type type2 = PendingData.Type.TRANSFER;
                UUID id = cryptoTransferHistoryItem.getId();
                if (this.shouldDisplayCurrencyCode) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    int i3 = WhenMappings.$EnumSwitchMapping$0[cryptoTransferHistoryItem.getDirection().ordinal()];
                    if (i3 == 1) {
                        i2 = C37751R.string.crypto_pending_transfer_received_title_with_asset_currency_code;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = C37751R.string.crypto_pending_transfer_sent_title_with_asset_currency_code;
                    }
                    stringResourceInvoke = companion.invoke(i2, cryptoTransferHistoryItem.getCurrencyCode());
                } else {
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    int i4 = WhenMappings.$EnumSwitchMapping$0[cryptoTransferHistoryItem.getDirection().ordinal()];
                    if (i4 == 1) {
                        i = C37751R.string.crypto_pending_transfer_received_title;
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = C37751R.string.crypto_pending_transfer_sent_title;
                    }
                    stringResourceInvoke = companion2.invoke(i, new Object[0]);
                }
                StringResource stringResource = stringResourceInvoke;
                if (cryptoTransferHistoryItem.getStateString() == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(C37751R.string.crypto_pending_transfer_start_secondary_text, cryptoTransferHistoryItem.getSubtitle(), cryptoTransferHistoryItem.getStateString())) == null) {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(cryptoTransferHistoryItem.getSubtitle());
                }
                StringResource stringResource2 = stringResourceInvoke2;
                StringResource.Companion companion3 = StringResource.INSTANCE;
                StringResource stringResourceInvoke3 = companion3.invoke(cryptoTransferHistoryItem.getAmountDisplayString());
                GoldDepositBoostTransferDetail goldDepositBoost = cryptoTransferHistoryItem.getGoldDepositBoost();
                if (goldDepositBoost == null || (amountSubtitle = goldDepositBoost.getBadgeText()) == null) {
                    amountSubtitle = cryptoTransferHistoryItem.getAmountSubtitle();
                }
                return new PendingData(type2, id, stringResource, stringResource2, stringResourceInvoke3, amountSubtitle != null ? companion3.invoke(amountSubtitle) : null);
            }
        }

        /* compiled from: CryptoPendingSectionDataState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualOrder;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)V", "component1", "()Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "copy", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualOrder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PerpetualOrder implements PendingItem {
            public static final int $stable = 8;
            private final UiPerpetualOrderDetails data;

            /* renamed from: component1, reason: from getter */
            private final UiPerpetualOrderDetails getData() {
                return this.data;
            }

            public static /* synthetic */ PerpetualOrder copy$default(PerpetualOrder perpetualOrder, UiPerpetualOrderDetails uiPerpetualOrderDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiPerpetualOrderDetails = perpetualOrder.data;
                }
                return perpetualOrder.copy(uiPerpetualOrderDetails);
            }

            public final PerpetualOrder copy(UiPerpetualOrderDetails data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new PerpetualOrder(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerpetualOrder) && Intrinsics.areEqual(this.data, ((PerpetualOrder) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "PerpetualOrder(data=" + this.data + ")";
            }

            public PerpetualOrder(UiPerpetualOrderDetails data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public Instant getSortTimestamp() {
                return this.data.getInitiatedAt();
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public PendingData getUiPendingData() {
                String historyRowValueText;
                String pendingHistoryRowSecondaryValueText;
                UiPerpetualOrderDetails uiPerpetualOrderDetails = this.data;
                StringResource historyRowLabelText = UiPerpetualOrderDetailValues.getHistoryRowLabelText(uiPerpetualOrderDetails);
                if (historyRowLabelText == null || (historyRowValueText = UiPerpetualOrderDetailValues.getHistoryRowValueText(uiPerpetualOrderDetails)) == null || (pendingHistoryRowSecondaryValueText = UiPerpetualOrderDetailValues.getPendingHistoryRowSecondaryValueText(uiPerpetualOrderDetails)) == null) {
                    return null;
                }
                PendingData.Type type2 = PendingData.Type.PERPETUAL_ORDER;
                UUID orderId = uiPerpetualOrderDetails.getOrderDetails().getOrderId();
                StringResource pendingHistoryRowSecondaryLabelText = UiPerpetualOrderDetailValues.getPendingHistoryRowSecondaryLabelText(uiPerpetualOrderDetails);
                StringResource.Companion companion = StringResource.INSTANCE;
                return new PendingData(type2, orderId, historyRowLabelText, pendingHistoryRowSecondaryLabelText, companion.invoke(historyRowValueText), companion.invoke(pendingHistoryRowSecondaryValueText));
            }
        }

        /* compiled from: CryptoPendingSectionDataState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualMarginEdit;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;)V", "component1", "()Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "copy", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$PerpetualMarginEdit;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PerpetualMarginEdit implements PendingItem {
            public static final int $stable = 8;
            private final UiPerpetualMarginEdit data;

            /* renamed from: component1, reason: from getter */
            private final UiPerpetualMarginEdit getData() {
                return this.data;
            }

            public static /* synthetic */ PerpetualMarginEdit copy$default(PerpetualMarginEdit perpetualMarginEdit, UiPerpetualMarginEdit uiPerpetualMarginEdit, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiPerpetualMarginEdit = perpetualMarginEdit.data;
                }
                return perpetualMarginEdit.copy(uiPerpetualMarginEdit);
            }

            public final PerpetualMarginEdit copy(UiPerpetualMarginEdit data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new PerpetualMarginEdit(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerpetualMarginEdit) && Intrinsics.areEqual(this.data, ((PerpetualMarginEdit) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "PerpetualMarginEdit(data=" + this.data + ")";
            }

            public PerpetualMarginEdit(UiPerpetualMarginEdit data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public Instant getSortTimestamp() {
                return this.data.getMarginEdit().getUpdatedAt();
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public PendingData getUiPendingData() {
                UiPerpetualMarginEdit uiPerpetualMarginEdit = this.data;
                return new PendingData(PendingData.Type.PERPETUAL_MARGIN_EDIT, uiPerpetualMarginEdit.getMarginEdit().getOrderId(), UiPerpetualMarginEditValues.getHistoryRowLabelText(uiPerpetualMarginEdit), UiPerpetualMarginEditValues.getPendingHistoryRowSecondaryLabelText(uiPerpetualMarginEdit), StringResource.INSTANCE.invoke(UiPerpetualMarginEditValues.getHistoryRowValueText(this.data)), null);
            }
        }

        /* compiled from: CryptoPendingSectionDataState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$StakingHistoryItem;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem;", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", WebsocketGatewayConstants.DATA_KEY, "", "shouldDisplayCurrencyCode", "<init>", "(Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;Z)V", "component1", "()Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "component2", "()Z", "copy", "(Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;Z)Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDataState$PendingItem$StakingHistoryItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "Z", "j$/time/Instant", "getSortTimestamp", "()Lj$/time/Instant;", "sortTimestamp", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "getUiPendingData", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "uiPendingData", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StakingHistoryItem implements PendingItem {
            public static final int $stable = 8;
            private final CryptoStakingHistoryItem data;
            private final boolean shouldDisplayCurrencyCode;

            /* renamed from: component1, reason: from getter */
            private final CryptoStakingHistoryItem getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            private final boolean getShouldDisplayCurrencyCode() {
                return this.shouldDisplayCurrencyCode;
            }

            public static /* synthetic */ StakingHistoryItem copy$default(StakingHistoryItem stakingHistoryItem, CryptoStakingHistoryItem cryptoStakingHistoryItem, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoStakingHistoryItem = stakingHistoryItem.data;
                }
                if ((i & 2) != 0) {
                    z = stakingHistoryItem.shouldDisplayCurrencyCode;
                }
                return stakingHistoryItem.copy(cryptoStakingHistoryItem, z);
            }

            public final StakingHistoryItem copy(CryptoStakingHistoryItem data, boolean shouldDisplayCurrencyCode) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new StakingHistoryItem(data, shouldDisplayCurrencyCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StakingHistoryItem)) {
                    return false;
                }
                StakingHistoryItem stakingHistoryItem = (StakingHistoryItem) other;
                return Intrinsics.areEqual(this.data, stakingHistoryItem.data) && this.shouldDisplayCurrencyCode == stakingHistoryItem.shouldDisplayCurrencyCode;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.shouldDisplayCurrencyCode);
            }

            public String toString() {
                return "StakingHistoryItem(data=" + this.data + ", shouldDisplayCurrencyCode=" + this.shouldDisplayCurrencyCode + ")";
            }

            public StakingHistoryItem(CryptoStakingHistoryItem data, boolean z) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this.shouldDisplayCurrencyCode = z;
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public Instant getSortTimestamp() {
                return this.data.getUpdatedAt();
            }

            @Override // com.robinhood.shared.crypto.pending.section.CryptoPendingSectionDataState.PendingItem
            public PendingData getUiPendingData() {
                CryptoStakingHistoryItem cryptoStakingHistoryItem = this.data;
                PendingData.Type type2 = PendingData.Type.STAKING;
                UUID id = this.data.getId();
                StringResource.Companion companion = StringResource.INSTANCE;
                return new PendingData(type2, id, companion.invoke(cryptoStakingHistoryItem.getHistoryViewModel().getTitle()), companion.invoke(cryptoStakingHistoryItem.getHistoryViewModel().getAmountSubtitle()), companion.invoke(cryptoStakingHistoryItem.getHistoryViewModel().getAmountDisplayString()), null);
            }
        }
    }
}
