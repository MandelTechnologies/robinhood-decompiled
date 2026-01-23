package com.robinhood.android.options.comboorders.detail.components.actionrows;

import android.content.res.Resources;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrderLeg;
import com.robinhood.android.options.comboorders.detail.components.actionrows.ActionRow;
import com.robinhood.android.options.comboorders.detail.extensions.UiComboOrders;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.historydetail.C23150R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ComboOrderDetailActionRowsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\"\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "reduceActionRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow;", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "documents", "", "Lcom/robinhood/models/db/Document;", "reduceComboOrderLegToActionRow", "uiComboOrderLeg", "Lcom/robinhood/android/options/combo/ui/UiComboOrderLeg;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ComboOrderDetailActionRowsStateProvider implements StateProvider<ComboOrderDetailActionRowsDataState, ComboOrderDetailActionRowsViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: ComboOrderDetailActionRowsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiComboOrder.InstrumentType.values().length];
            try {
                iArr[ApiComboOrder.InstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiComboOrder.InstrumentType.OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComboOrderDetailActionRowsStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public ComboOrderDetailActionRowsViewState reduce(ComboOrderDetailActionRowsDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableList<ActionRow> immutableListReduceActionRows = reduceActionRows(dataState.getUiComboOrder(), dataState.getDocuments());
        UiComboOrder uiComboOrder = dataState.getUiComboOrder();
        return new ComboOrderDetailActionRowsViewState(immutableListReduceActionRows, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiComboOrder != null ? UiComboOrders.getComboOrderDetailContext(uiComboOrder) : null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16375, null));
    }

    private final ImmutableList<ActionRow> reduceActionRows(UiComboOrder uiComboOrder, List<Document> documents) throws Resources.NotFoundException {
        List listSortedWith;
        List<UiComboOrderLeg> legs;
        ArrayList arrayList = new ArrayList();
        Document tradeConfirmation = null;
        if (uiComboOrder == null || (legs = uiComboOrder.getLegs()) == null) {
            listSortedWith = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                ActionRow actionRowReduceComboOrderLegToActionRow = reduceComboOrderLegToActionRow((UiComboOrderLeg) it.next(), uiComboOrder, this.resources);
                if (actionRowReduceComboOrderLegToActionRow != null) {
                    arrayList2.add(actionRowReduceComboOrderLegToActionRow);
                }
            }
            listSortedWith = CollectionsKt.sortedWith(arrayList2, ActionRow.ActionRowType.INSTANCE.getComparator());
        }
        List list = listSortedWith;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (documents != null && uiComboOrder != null) {
            tradeConfirmation = uiComboOrder.getTradeConfirmation(documents);
        }
        Document document = tradeConfirmation;
        if (document != null) {
            String string2 = this.resources.getString(C23150R.string.option_order_detail_view_trade_confirmation_action);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new ActionRow(string2, new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), ActionRow.ActionRowType.VIEW_TRADE_CONFIRMATION));
        }
        return extensions2.toImmutableList(arrayList);
    }

    private final ActionRow reduceComboOrderLegToActionRow(UiComboOrderLeg uiComboOrderLeg, UiComboOrder uiComboOrder, Resources resources) throws Resources.NotFoundException {
        UUID tradableChainId;
        String accountNumber = uiComboOrder.getComboOrder().getAccountNumber();
        UUID equityInstrumentId = uiComboOrder.getComboOrder().getEquityInstrumentId();
        String symbol = uiComboOrder.getInstrument().getSymbol();
        int i = WhenMappings.$EnumSwitchMapping$0[uiComboOrderLeg.getLeg().getInstrumentType().ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C23150R.string.option_order_view_equity_label, symbol);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new ActionRow(string2, new LegacyFragmentKey.EquityInstrumentDetail(equityInstrumentId, null, accountNumber, InstrumentDetailSource.COMBO_ORDER, false, 18, null), ActionRow.ActionRowType.VIEW_EQUITY);
        }
        if (i != 2 || (tradableChainId = uiComboOrder.getInstrument().getTradableChainId()) == null) {
            return null;
        }
        OptionChainIdLaunchMode.SingleChainId singleChainId = new OptionChainIdLaunchMode.SingleChainId(tradableChainId);
        String string3 = resources.getString(C23150R.string.option_order_view_chain_label, symbol);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new ActionRow(string3, new OptionChainIntentKey(equityInstrumentId, singleChainId, extensions2.toImmutableList(uiComboOrder.getUiComboOrderOptionLegs()), (OptionOrderFilter) null, accountNumber, (String) null, 40, (DefaultConstructorMarker) null), ActionRow.ActionRowType.VIEW_EQUITY_OPTION);
    }
}
