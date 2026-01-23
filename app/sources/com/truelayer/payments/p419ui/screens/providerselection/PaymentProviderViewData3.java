package com.truelayer.payments.p419ui.screens.providerselection;

import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentProviderViewData.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, m3636d2 = {"intoViewData", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "Lcom/truelayer/payments/core/domain/payments/Branch;", "isRecommended", "", "parent", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.PaymentProviderViewDataKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentProviderViewData3 {
    public static final PaymentProviderViewData intoViewData(PaymentProvider paymentProvider, boolean z) {
        Intrinsics.checkNotNullParameter(paymentProvider, "<this>");
        String id = paymentProvider.getId();
        String displayName = paymentProvider.getDisplayName();
        String iconUri = paymentProvider.getIconUri();
        String logoUri = paymentProvider.getLogoUri();
        String extendedIcon = paymentProvider.getExtendedIcon();
        String countryCode = paymentProvider.getCountryCode();
        float order = paymentProvider.getOrder();
        String strSearchNormalizeLowercase = StringExtensions.searchNormalizeLowercase(paymentProvider.getDisplayName());
        List<String> searchAliases = paymentProvider.getSearchAliases();
        List<String> searchAliases2 = paymentProvider.getSearchAliases();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(searchAliases2, 10));
        Iterator<T> it = searchAliases2.iterator();
        while (it.hasNext()) {
            arrayList.add(StringExtensions.searchNormalizeLowercase((String) it.next()));
        }
        return new PaymentProviderViewData(id, displayName, iconUri, logoUri, extendedIcon, countryCode, order, strSearchNormalizeLowercase, searchAliases, arrayList, z, paymentProvider.getHasUserPriming(), paymentProvider.getAvailability(), null);
    }

    public static final PaymentProviderViewData intoViewData(Branch branch, boolean z, PaymentProvider parent) {
        Intrinsics.checkNotNullParameter(branch, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        String id = branch.getId();
        String name = branch.getName();
        String iconUri = parent.getIconUri();
        String logoUri = parent.getLogoUri();
        String extendedIcon = parent.getExtendedIcon();
        String countryCode = parent.getCountryCode();
        float order = parent.getOrder();
        String strSearchNormalizeLowercase = StringExtensions.searchNormalizeLowercase(branch.getName());
        List<String> searchAliases = branch.getSearchAliases();
        List<String> searchAliases2 = branch.getSearchAliases();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(searchAliases2, 10));
        Iterator<T> it = searchAliases2.iterator();
        while (it.hasNext()) {
            arrayList.add(StringExtensions.searchNormalizeLowercase((String) it.next()));
        }
        return new PaymentProviderViewData(id, name, iconUri, logoUri, extendedIcon, countryCode, order, strSearchNormalizeLowercase, searchAliases, arrayList, z, parent.getHasUserPriming(), parent.getAvailability(), parent.getId());
    }
}
