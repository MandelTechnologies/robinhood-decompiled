package com.robinhood.shared.order.type.util;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: TimeInForceUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\r\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u000f\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/OrderTimeInForce;", "getSupportedTimeInForceValues", "()Lkotlinx/collections/immutable/ImmutableList;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "description", "(Lcom/robinhood/models/db/OrderTimeInForce;Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "(Lcom/robinhood/models/db/OrderTimeInForce;)Lcom/robinhood/utils/resource/StringResource;", "displayName", "getLowerCaseDisplayName", "lowerCaseDisplayName", "getShortDisplayName", "shortDisplayName", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.util.TimeInForceUtilKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TimeInForceUtil2 {

    /* compiled from: TimeInForceUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.util.TimeInForceUtilKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImmutableList<OrderTimeInForce> getSupportedTimeInForceValues() {
        return extensions2.persistentListOf(OrderTimeInForce.GTC, OrderTimeInForce.GFD);
    }

    public static final StringResource getDisplayName(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_good_til_canceled, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_good_for_day, new Object[0]);
        }
        throw new IllegalStateException((orderTimeInForce.name() + " display name not supported").toString());
    }

    public static final StringResource getLowerCaseDisplayName(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_good_til_canceled_lowercase, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_good_for_day_lowercase, new Object[0]);
        }
        throw new IllegalStateException((orderTimeInForce.name() + " display name not supported").toString());
    }

    public static final StringResource getShortDisplayName(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_gtc, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_gfd, new Object[0]);
        }
        throw new IllegalStateException((orderTimeInForce.name() + " short display name not supported").toString());
    }

    public static final StringResource description(OrderTimeInForce orderTimeInForce, Clock clock) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_gtc_description, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_tif_gfd_description, ZonedDateTime.now(clock.withZone(ZoneId.m3448of("UTC"))).plusDays(1L).truncatedTo(ChronoUnit.DAYS).mo3460b(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm z", Locale.getDefault(Locale.Category.FORMAT))));
        }
        throw new IllegalStateException((orderTimeInForce.name() + " display name not supported").toString());
    }
}
