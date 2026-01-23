package com.robinhood.android.options.comboorders.detail.components.legs;

import android.content.res.Resources;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrderLeg;
import com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsRowViewState;
import com.robinhood.android.options.comboorders.detail.extensions.UiComboOrderLegs;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ComboOrderDetailLegsSectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "reduceLegRow", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState;", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ComboOrderDetailLegsSectionStateProvider implements StateProvider<ComboOrderDetailLegsSectionDataState, ComboOrderDetailLegsSectionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: ComboOrderDetailLegsSectionStateProvider.kt */
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

    public ComboOrderDetailLegsSectionStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public ComboOrderDetailLegsSectionViewState reduce(ComboOrderDetailLegsSectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new ComboOrderDetailLegsSectionViewState(reduceLegRow(dataState.getUiComboOrder()));
    }

    private final ImmutableList<ComboOrderDetailLegsRowViewState> reduceLegRow(UiComboOrder uiComboOrder) {
        ArrayList arrayList = new ArrayList();
        if (uiComboOrder != null) {
            for (UiComboOrderLeg uiComboOrderLeg : uiComboOrder.getLegs()) {
                String historyDetailLegRowTitleString = UiComboOrderLegs.getHistoryDetailLegRowTitleString(uiComboOrderLeg, this.resources);
                String historyDetailLegRowSubtitleString = UiComboOrderLegs.getHistoryDetailLegRowSubtitleString(uiComboOrderLeg, this.resources);
                String notationalString = UiComboOrderLegs.getNotationalString(uiComboOrderLeg, uiComboOrder.getComboOrder().getDerivedState());
                int i = WhenMappings.$EnumSwitchMapping$0[uiComboOrderLeg.getLeg().getInstrumentType().ordinal()];
                if (i == 1) {
                    arrayList.add(new ComboOrderDetailLegsRowViewState(historyDetailLegRowTitleString, historyDetailLegRowSubtitleString, notationalString, ComboOrderDetailLegsRowViewState.ComboOrderDetailLegsAssetType.EQUITY));
                } else if (i == 2) {
                    arrayList.add(new ComboOrderDetailLegsRowViewState(historyDetailLegRowTitleString, historyDetailLegRowSubtitleString, notationalString, ComboOrderDetailLegsRowViewState.ComboOrderDetailLegsAssetType.EQUITY_OPTION));
                }
            }
        }
        return extensions2.toImmutableList(arrayList);
    }
}
