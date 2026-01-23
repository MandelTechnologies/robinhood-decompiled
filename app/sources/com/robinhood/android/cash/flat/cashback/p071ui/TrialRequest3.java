package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.TrialRequest;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TrialRequest.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0000\u001a\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"MERCHANT_OFFER_ID_IDENTIFIER", "", "DD_CONTEXT", "getTrialOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "offers", "", "getTrialEligibility", "Lcom/robinhood/android/cash/flat/cashback/ui/TrialRequest;", "offerId", "Ljava/util/UUID;", "accessSource", "Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.TrialRequestKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TrialRequest3 {
    public static final String DD_CONTEXT = "DD";
    public static final String MERCHANT_OFFER_ID_IDENTIFIER = "associated-offer-id";

    /* compiled from: TrialRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.TrialRequestKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrialRequest2.values().length];
            try {
                iArr[TrialRequest2.AUTOMATIC_DIRECT_DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrialRequest2.MANUAL_DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrialRequest2.RECURRING_ACH_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MerchantOfferV2 getTrialOffer(ProductMarketingContent content, List<MerchantOfferV2> offers) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(offers, "offers");
        Iterator<T> it = content.getFeatures().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ProductMarketingContent.Feature) next).getIdentifier(), "associated-offer-id")) {
                break;
            }
        }
        ProductMarketingContent.Feature feature = (ProductMarketingContent.Feature) next;
        String strValueOf = String.valueOf(feature != null ? feature.getDescription() : null);
        Iterator<T> it2 = offers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(String.valueOf(((MerchantOfferV2) next2).getGlobalOfferId()), strValueOf)) {
                obj = next2;
                break;
            }
        }
        return (MerchantOfferV2) obj;
    }

    public static final TrialRequest getTrialEligibility(UUID uuid, TrialRequest2 accessSource) {
        Intrinsics.checkNotNullParameter(accessSource, "accessSource");
        int i = WhenMappings.$EnumSwitchMapping$0[accessSource.ordinal()];
        if (i == 1 || i == 2) {
            return uuid != null ? new TrialRequest.Eligible(uuid) : TrialRequest.Ineligible.INSTANCE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TrialRequest.Ineligible.INSTANCE;
    }
}
