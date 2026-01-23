package com.robinhood.android.internalassettransfers.customselection;

import android.content.Context;
import androidx.compose.p011ui.state.ToggleableState;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MarginInvestingStateDto;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.InternalAssetTransferInfoBannerViewState;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternalAssetTransferCustomSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferCustomSelectionStateProvider implements StateProvider<InternalAssetTransferCustomSelectionDataState, InternalAssetTransferCustomSelectionViewState> {
    public static final int $stable = 8;
    private final Context context;

    /* compiled from: InternalAssetTransferCustomSelectionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f174On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InternalAssetTransferCustomSelectionStateProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[EDGE_INSN: B:95:0x005a->B:13:0x005a BREAK  A[LOOP:0: B:6:0x002f->B:96:?]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d A[LOOP:1: B:68:0x0147->B:70:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InternalAssetTransferCustomSelectionViewState reduce(InternalAssetTransferCustomSelectionDataState dataState) {
        boolean z;
        StringResource stringResource;
        boolean z2;
        ToggleableState toggleableState;
        Object objValueOf;
        int i;
        boolean z3;
        boolean z4;
        Iterator<E> it;
        ImmutableList immutableList;
        Iterator<E> it2;
        ImmutableList immutableList2;
        boolean z5;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiAssets nontransferableUiModel = UiAssets3.toNontransferableUiModel(dataState.getEligibleAssets());
        InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState = new InternalAssetTransferInfoBannerViewState(InternalAssetTransferInfoBannerViewState.InfoBannerState.HasIneligibleAssets.INSTANCE, nontransferableUiModel);
        Map<UUID, BigDecimal> equities = dataState.getAssetSelection().getEquities();
        if (equities.isEmpty()) {
            z = Intrinsics.areEqual(dataState.getAssetSelection().getCash(), BigDecimal.ZERO);
        } else {
            Iterator<Map.Entry<UUID, BigDecimal>> it3 = equities.entrySet().iterator();
            while (it3.hasNext()) {
                if (it3.next().getValue().compareTo(BigDecimal.ZERO) > 0) {
                    break;
                }
            }
            if (Intrinsics.areEqual(dataState.getAssetSelection().getCash(), BigDecimal.ZERO)) {
            }
        }
        BigDecimal availableCash = dataState.getEligibleAssets().getAvailableCash();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        boolean z6 = availableCash.compareTo(bigDecimal) < 0;
        GetMultiAccountEligibilityResponseDto sinkEligibility = dataState.getSinkEligibility();
        GetMultiAccountEligibilityResponseDto sinkEligibility2 = dataState.getSinkEligibility();
        boolean z7 = (sinkEligibility2 != null ? sinkEligibility2.getMargin_investing_state() : null) == MarginInvestingStateDto.MARGIN_INVESTING_STATE_ENABLED;
        if (sinkEligibility == null || !z6 || sinkEligibility.is_eligible() || z7) {
            stringResource = null;
            z2 = false;
        } else {
            stringResource = null;
            z2 = true;
        }
        StringResource stringResourceInvoke = z2 ? StringResource.INSTANCE.invoke(C18977R.string.non_transferable, new Object[0]) : stringResource;
        UiAssets transferableUiModel = UiAssets3.toTransferableUiModel(dataState.getEligibleAssets());
        ImmutableList immutableList3 = extensions2.toImmutableList(InternalAssetTransferCustomSelectionStateProvider3.getEquityRows(dataState));
        BigDecimal cash = dataState.getAssetSelection().getCash();
        if (Intrinsics.areEqual(cash, bigDecimal)) {
            toggleableState = ToggleableState.Off;
        } else {
            toggleableState = Intrinsics.areEqual(cash, transferableUiModel.getCash()) ? ToggleableState.f174On : ToggleableState.Indeterminate;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
        if (i2 == 1) {
            objValueOf = Integer.valueOf(C18977R.string.internal_asset_transfer_cash_selection_cash_quantity_all);
        } else if (i2 == 2) {
            objValueOf = Integer.valueOf(C18977R.string.internal_asset_transfer_cash_selection_cash_quantity_partially);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objValueOf = stringResource;
        }
        if (transferableUiModel.getCash().compareTo(bigDecimal) < 0) {
            i = C18977R.string.internal_asset_transfer_custom_selection_margin_primary_text;
        } else {
            i = C18977R.string.internal_asset_transfer_custom_selection_cash_primary_text;
        }
        String string2 = this.context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (transferableUiModel.getCash().compareTo(bigDecimal) != 0) {
            z3 = true;
            if (StringsKt.contains((CharSequence) string2, (CharSequence) dataState.getSearchTextValue(), true)) {
                z4 = true;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
            it = immutableList3.iterator();
            while (it.hasNext()) {
                arrayList.add(com.robinhood.utils.extensions.StringsKt.toUuid(((EquityRow) it.next()).getInstrumentId()));
                internalAssetTransferInfoBannerViewState = internalAssetTransferInfoBannerViewState;
            }
            InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState2 = internalAssetTransferInfoBannerViewState;
            immutableList = extensions2.toImmutableList(arrayList);
            if (immutableList3 == null && immutableList3.isEmpty()) {
                immutableList2 = immutableList;
                if (z3) {
                }
            } else {
                it2 = immutableList3.iterator();
                while (it2.hasNext()) {
                    immutableList2 = immutableList;
                    if (((EquityRow) it2.next()).getCheckboxState() != ToggleableState.f174On) {
                        break;
                    }
                    immutableList = immutableList2;
                }
                immutableList2 = immutableList;
                z5 = (z3 || toggleableState == ToggleableState.f174On) ? z4 : false;
            }
            return new InternalAssetTransferCustomSelectionViewState(transferableUiModel, nontransferableUiModel, nontransferableUiModel.getAssetsCount() <= 0 ? internalAssetTransferInfoBannerViewState2 : null, immutableList3, z, dataState.getSearchTextValue(), cash, dataState.getLoading(), z2, stringResourceInvoke, toggleableState, objValueOf, string2, z3, immutableList2, z5);
        }
        z3 = true;
        z4 = z3;
        z3 = false;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
        it = immutableList3.iterator();
        while (it.hasNext()) {
        }
        InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState22 = internalAssetTransferInfoBannerViewState;
        immutableList = extensions2.toImmutableList(arrayList2);
        if (immutableList3 == null) {
            it2 = immutableList3.iterator();
            while (it2.hasNext()) {
            }
            immutableList2 = immutableList;
            if (z3) {
            }
        }
        return new InternalAssetTransferCustomSelectionViewState(transferableUiModel, nontransferableUiModel, nontransferableUiModel.getAssetsCount() <= 0 ? internalAssetTransferInfoBannerViewState22 : null, immutableList3, z, dataState.getSearchTextValue(), cash, dataState.getLoading(), z2, stringResourceInvoke, toggleableState, objValueOf, string2, z3, immutableList2, z5);
    }
}
