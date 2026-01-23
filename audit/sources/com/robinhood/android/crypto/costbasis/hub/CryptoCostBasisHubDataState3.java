package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.CostBasisStatusDto;
import p479j$.time.Instant;

/* compiled from: CryptoCostBasisHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\b"}, m3636d2 = {"toRow", "Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "Lcom/robinhood/models/crypto/ui/transfer/UiCostBasisDetails;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "updateRowIfExists", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;", "updatedDetails", "feature-crypto-cost-basis_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDataStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubDataState3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CostBasisRow toRow(UiCostBasisDetails uiCostBasisDetails, LocalizedDateTimeFormatter localizedDateTimeFormatter) {
        String source_id = uiCostBasisDetails.getResponse().getSource_id();
        String account_id = uiCostBasisDetails.getResponse().getAccount_id();
        String currency_code = uiCostBasisDetails.getResponse().getCurrency_code();
        BigDecimal bigDecimalOrNull = uiCostBasisDetails.getResponse().getDeposit_amount().toBigDecimalOrNull();
        String currency$default = bigDecimalOrNull != null ? CurrencyDefinitions.formatCurrency$default(uiCostBasisDetails.getCurrencyPair().getAssetCurrency(), bigDecimalOrNull, false, false, null, 0, null, null, false, false, false, false, 2024, null) : null;
        if (currency$default == null) {
            currency$default = "";
        }
        String str = currency$default;
        String status_display_text = uiCostBasisDetails.getResponse().getStatus_display_text();
        Instant deposit_date = uiCostBasisDetails.getResponse().getDeposit_date();
        return new CostBasisRow(source_id, account_id, currency_code, str, status_display_text, deposit_date != null ? localizedDateTimeFormatter.format(deposit_date, LocalizedDateTimeFormatter.Format.MediumDate.INSTANCE) : null);
    }

    public static final CryptoCostBasisHubSectionDataState updateRowIfExists(CryptoCostBasisHubSectionDataState cryptoCostBasisHubSectionDataState, final UiCostBasisDetails updatedDetails) {
        List arrayList;
        Intrinsics.checkNotNullParameter(cryptoCostBasisHubSectionDataState, "<this>");
        Intrinsics.checkNotNullParameter(updatedDetails, "updatedDetails");
        Iterator<CostBasisRow> it = cryptoCostBasisHubSectionDataState.getRows().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), updatedDetails.getResponse().getSource_id())) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return cryptoCostBasisHubSectionDataState;
        }
        CostBasisStatusDto status = updatedDetails.getResponse().getStatus();
        ImmutableList<UiCostBasisDetails> details$feature_crypto_cost_basis_externalDebug = cryptoCostBasisHubSectionDataState.getDetails$feature_crypto_cost_basis_externalDebug();
        if (details$feature_crypto_cost_basis_externalDebug == null || (arrayList = CollectionsKt.toMutableList((Collection) details$feature_crypto_cost_basis_externalDebug)) == null) {
            arrayList = new ArrayList();
        }
        if (status != cryptoCostBasisHubSectionDataState.getSection$feature_crypto_cost_basis_externalDebug().getStatus()) {
            arrayList.removeIf(new Predicate() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDataStateKt.updateRowIfExists.1
                @Override // java.util.function.Predicate
                public final boolean test(UiCostBasisDetails it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Intrinsics.areEqual(it2.getResponse().getSource_id(), updatedDetails.getResponse().getSource_id());
                }
            });
        } else {
            arrayList.set(i, updatedDetails);
        }
        return CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubSectionDataState, null, null, extensions2.toImmutableList(arrayList), false, null, null, null, 123, null);
    }
}
