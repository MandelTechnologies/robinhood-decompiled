package com.robinhood.android.optionschain.sbschain.table.util;

import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableViewState;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionLegBundleReplaceHelper.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002\u001a4\u0010\r\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a<\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u001a'\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"getLegBundlesToReplace", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getSingleLegBundleToReplace", "tableRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Lazy;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "dragTarget", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionLegDragTarget;", "draggedOverIndex", "getMultiLegBundlesToReplace", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget$OptionSpreadDragTarget;", "quoteIndex", "tryReplaceLegBundle", "", "targetRowState", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "oldLegBundleWithRowIndex", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "legBundleToRemove", "", "legBundleToAdd", "isSingleLegReplace", "getSpreadDragTargetIndex", "startIndexWithoutQuoteRow", "indexOffset", "(Ljava/lang/Integer;II)I", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.util.OptionLegBundleReplaceHelperKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionLegBundleReplaceHelper {

    /* compiled from: OptionLegBundleReplaceHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.util.OptionLegBundleReplaceHelperKt$WhenMappings */
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

    public static final OptionLegBundlesToReplace getLegBundlesToReplace(OptionSideBySideChainTableViewState optionSideBySideChainTableViewState, int i) {
        Intrinsics.checkNotNullParameter(optionSideBySideChainTableViewState, "<this>");
        if (optionSideBySideChainTableViewState.getDragTarget() == null || optionSideBySideChainTableViewState.getDragTarget().getLegBundlesWithRowIndex().isEmpty() || i == optionSideBySideChainTableViewState.getDragTarget().getDragStartRowIndex() || optionSideBySideChainTableViewState.getQuoteIndex() == null) {
            return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
        }
        DragTarget dragTarget = optionSideBySideChainTableViewState.getDragTarget();
        if (dragTarget instanceof DragTarget.OptionLegDragTarget) {
            return getSingleLegBundleToReplace(optionSideBySideChainTableViewState.getTableRowStates(), (DragTarget.OptionLegDragTarget) optionSideBySideChainTableViewState.getDragTarget(), i);
        }
        if (!(dragTarget instanceof DragTarget.OptionSpreadDragTarget)) {
            throw new NoWhenBranchMatchedException();
        }
        return getMultiLegBundlesToReplace(optionSideBySideChainTableViewState.getTableRowStates(), (DragTarget.OptionSpreadDragTarget) optionSideBySideChainTableViewState.getDragTarget(), i, optionSideBySideChainTableViewState.getQuoteIndex().intValue());
    }

    private static final OptionLegBundlesToReplace getSingleLegBundleToReplace(ImmutableList<? extends Lazy<? extends TableRowState>> immutableList, DragTarget.OptionLegDragTarget optionLegDragTarget, int i) {
        TableRowState tableRowState;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Lazy lazy = (Lazy) CollectionsKt.getOrNull(immutableList, i);
        if (lazy == null || (tableRowState = (TableRowState) lazy.getValue()) == null) {
            return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
        }
        if (tableRowState instanceof TableRowState.InstrumentRow) {
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) CollectionsKt.singleOrNull((List) optionLegDragTarget.getLegBundlesWithRowIndex());
            if (optionLegBundleWithRowIndex == null) {
                return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
            }
            if (!tryReplaceLegBundle((TableRowState.InstrumentRow) tableRowState, optionLegBundleWithRowIndex, arrayList, arrayList2, true)) {
                return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
            }
            return new OptionLegBundlesToReplace(extensions2.toPersistentList(arrayList2), extensions2.toPersistentList(arrayList));
        }
        if (!(tableRowState instanceof TableRowState.Header) && !(tableRowState instanceof TableRowState.UnderlyingQuoteRow) && !Intrinsics.areEqual(tableRowState, TableRowState.DisclosureRow.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
    }

    private static final OptionLegBundlesToReplace getMultiLegBundlesToReplace(ImmutableList<? extends Lazy<? extends TableRowState>> immutableList, DragTarget.OptionSpreadDragTarget optionSpreadDragTarget, int i, int i2) {
        TableRowState tableRowState;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OptionLegBundleWithRowIndex optionLegBundleWithRowIndex : optionSpreadDragTarget.getLegBundlesWithRowIndex()) {
            Lazy lazy = (Lazy) CollectionsKt.getOrNull(immutableList, getSpreadDragTargetIndex(optionLegBundleWithRowIndex.getRowIndexWithoutQuoteRow(), i - optionSpreadDragTarget.getDragStartRowIndex(), i2));
            if (lazy == null || (tableRowState = (TableRowState) lazy.getValue()) == null) {
                return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
            }
            if (tableRowState instanceof TableRowState.InstrumentRow) {
                if (!tryReplaceLegBundle((TableRowState.InstrumentRow) tableRowState, optionLegBundleWithRowIndex, arrayList, arrayList2, false)) {
                    return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
                }
            } else {
                if (!(tableRowState instanceof TableRowState.Header) && !(tableRowState instanceof TableRowState.UnderlyingQuoteRow) && !Intrinsics.areEqual(tableRowState, TableRowState.DisclosureRow.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return OptionLegBundlesToReplace.INSTANCE.getEMPTY();
            }
        }
        return new OptionLegBundlesToReplace(extensions2.toPersistentList(arrayList2), extensions2.toPersistentList(arrayList));
    }

    private static final boolean tryReplaceLegBundle(TableRowState.InstrumentRow instrumentRow, OptionLegBundleWithRowIndex optionLegBundleWithRowIndex, List<OptionLegBundleWithRowIndex> list, List<OptionLegBundleWithRowIndex> list2, boolean z) {
        OptionLegBundle legBundle;
        OrderSide orderSide;
        OptionConfigurationBundle optionConfigurationBundle = optionLegBundleWithRowIndex.getLegBundle().getOptionConfigurationBundle();
        TableCellState.BidAsk bidAskCell = instrumentRow.getBidAskCell(optionConfigurationBundle.getOptionContractType(), optionConfigurationBundle.getOptionSide());
        OptionLegBundleWithRowIndex legBundleWithRowIndex = bidAskCell.getLegBundleWithRowIndex();
        if (legBundleWithRowIndex == null || (legBundle = legBundleWithRowIndex.getLegBundle()) == null) {
            return false;
        }
        OrderSide optionSide = legBundle.getOptionConfigurationBundle().getOptionSide();
        OptionContractType optionContractType = legBundle.getOptionConfigurationBundle().getOptionContractType();
        int i = WhenMappings.$EnumSwitchMapping$0[optionSide.ordinal()];
        if (i == 1) {
            orderSide = OrderSide.SELL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderSide = OrderSide.BUY;
        }
        if (bidAskCell.getDisableType() != null) {
            return false;
        }
        if (z && (bidAskCell.isSelected() || instrumentRow.getBidAskCell(optionContractType, orderSide).isSelected())) {
            return false;
        }
        OptionLegBundleWithRowIndex legBundleWithRowIndex2 = bidAskCell.getLegBundleWithRowIndex();
        list.add(optionLegBundleWithRowIndex);
        list2.add(legBundleWithRowIndex2);
        return true;
    }

    public static final int getSpreadDragTargetIndex(Integer num, int i, int i2) {
        if (num == null) {
            return -1;
        }
        int iIntValue = num.intValue() + i;
        return iIntValue >= i2 ? iIntValue + 1 : iIntValue;
    }
}
