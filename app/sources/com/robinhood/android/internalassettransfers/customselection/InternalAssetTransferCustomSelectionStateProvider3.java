package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.p011ui.state.ToggleableState;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferCustomSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getEquityRows", "", "Lcom/robinhood/android/internalassettransfers/customselection/EquityRow;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionStateProviderKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferCustomSelectionStateProvider3 {
    public static final List<EquityRow> getEquityRows(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState) {
        ToggleableState toggleableState;
        Object specificShares;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(internalAssetTransferCustomSelectionDataState, "<this>");
        List<UiEligibleAsset> equities = UiAssets3.toTransferableUiModel(internalAssetTransferCustomSelectionDataState.getEligibleAssets()).getEquities();
        ArrayList<UiEligibleAsset> arrayList = new ArrayList();
        for (Object obj : equities) {
            UiEligibleAsset uiEligibleAsset = (UiEligibleAsset) obj;
            String symbol = uiEligibleAsset.getSymbol();
            Locale locale = Locale.ROOT;
            String lowerCase = symbol.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = internalAssetTransferCustomSelectionDataState.getSearchTextValue().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                String lowerCase3 = uiEligibleAsset.getInstrumentName().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = internalAssetTransferCustomSelectionDataState.getSearchTextValue().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (UiEligibleAsset uiEligibleAsset2 : arrayList) {
            BigDecimal bigDecimal = internalAssetTransferCustomSelectionDataState.getAssetSelection().getEquities().get(com.robinhood.utils.extensions.StringsKt.toUuid(uiEligibleAsset2.getInstrumentId()));
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            if (Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO)) {
                toggleableState = ToggleableState.Off;
            } else {
                toggleableState = Intrinsics.areEqual(bigDecimal, uiEligibleAsset2.getShares()) ? ToggleableState.f174On : ToggleableState.Indeterminate;
            }
            ToggleableState toggleableState2 = toggleableState;
            if (Intrinsics.areEqual(bigDecimal, uiEligibleAsset2.getShares())) {
                specificShares = ShareSelection.AllShares.INSTANCE;
            } else {
                Intrinsics.checkNotNull(bigDecimal);
                specificShares = new ShareSelection.SpecificShares(bigDecimal);
            }
            String instrumentId = uiEligibleAsset2.getInstrumentId();
            String symbol2 = uiEligibleAsset2.getSymbol();
            String instrumentName = uiEligibleAsset2.getInstrumentName();
            if (Intrinsics.areEqual(specificShares, ShareSelection.AllShares.INSTANCE)) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_custom_selection_all_shares, new Object[0]);
            } else {
                if (!(specificShares instanceof ShareSelection.SpecificShares)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShareSelection.SpecificShares specificShares2 = (ShareSelection.SpecificShares) specificShares;
                if (Intrinsics.areEqual(specificShares2.getShares(), BigDecimal.ONE)) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_custom_selection_shares_singular_text, new Object[0]);
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_custom_selection_shares_plural_text, specificShares2.getShares().toString());
                }
            }
            arrayList2.add(new EquityRow(instrumentId, symbol2, instrumentName, toggleableState2, stringResourceInvoke));
        }
        return CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionStateProviderKt$getEquityRows$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((EquityRow) t).getTitle(), ((EquityRow) t2).getTitle());
            }
        });
    }
}
