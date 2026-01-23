package com.robinhood.shared.trade.crypto.format;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: CryptoTimeInForceFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/models/db/OrderTimeInForce;", "orderTimeInForce", "j$/time/Instant", "currentTime", "Lcom/robinhood/utils/resource/StringResource;", "getExpiryFormattedDateStringResource", "(Lcom/robinhood/models/db/OrderTimeInForce;Lj$/time/Instant;)Lcom/robinhood/utils/resource/StringResource;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.format.CryptoTimeInForceFormatterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTimeInForceFormatter {

    /* compiled from: CryptoTimeInForceFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.format.CryptoTimeInForceFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderTimeInForce.IOC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderTimeInForce.OPG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderTimeInForce.FOK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getExpiryFormattedDateStringResource(OrderTimeInForce orderTimeInForce, Instant currentTime) {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C40095R.string.crypto_order_price_order_expiry_label;
        switch (WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()]) {
            case 1:
                objInvoke = companion.invoke(C40095R.string.crypto_trade_create_time_in_force_gfd_summary_tomorrow, InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) currentTime));
                break;
            case 2:
                Instant instantPlus = currentTime.plus((TemporalAmount) Days.m3991of(7));
                Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                objInvoke = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus);
                break;
            case 3:
                Instant instantPlus2 = currentTime.plus((TemporalAmount) Days.m3991of(30));
                Intrinsics.checkNotNullExpressionValue(instantPlus2, "plus(...)");
                objInvoke = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus2);
                break;
            case 4:
                Instant instantPlus3 = currentTime.plus((TemporalAmount) Days.m3991of(90));
                Intrinsics.checkNotNullExpressionValue(instantPlus3, "plus(...)");
                objInvoke = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus3);
                break;
            case 5:
                throw new IllegalStateException("OrderTimeInForce IOC not supported");
            case 6:
                throw new IllegalStateException("OrderTimeInForce OPG not supported");
            case 7:
                throw new IllegalStateException("OrderTimeInForce FOK not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.invoke(i, objInvoke);
    }
}
