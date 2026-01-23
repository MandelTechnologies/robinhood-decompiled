package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.QuoteType;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuoteTypeDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/QuoteType;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/QuoteType;)Lcom/robinhood/utils/resource/StringResource;", "lowercaseShortDisplayName", "getLowercaseShortDisplayName", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.QuoteTypeDisplayNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class QuoteTypeDisplayNames {

    /* compiled from: QuoteTypeDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.QuoteTypeDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuoteType.values().length];
            try {
                iArr[QuoteType.ASK_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuoteType.BID_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuoteType.LIMIT_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuoteType.STOP_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(QuoteType quoteType) {
        Intrinsics.checkNotNullParameter(quoteType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[quoteType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_ask_price_label, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_bid_price_label, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_limit_price_label, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_details_stop_price_label, new Object[0]);
    }

    public static final StringResource getLowercaseShortDisplayName(QuoteType quoteType) {
        Intrinsics.checkNotNullParameter(quoteType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[quoteType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_ask_price_lowercase_short_label, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_bid_price_lowercase_short_label, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_limit_price_lowercase_short_label, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_details_stop_price_lowercase_short_label, new Object[0]);
    }
}
