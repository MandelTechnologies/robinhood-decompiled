package com.robinhood.store.shareprefs;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderFormTimeInForce.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "", "<init>", "(Ljava/lang/String;I)V", "IOC", "GTD", "FOK", EducationTourScreenNames.UNSPECIFIED_SCREEN, "toFuturesTimeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class OrderFormTimeInForce {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderFormTimeInForce[] $VALUES;
    public static final OrderFormTimeInForce IOC = new OrderFormTimeInForce("IOC", 0);
    public static final OrderFormTimeInForce GTD = new OrderFormTimeInForce("GTD", 1);
    public static final OrderFormTimeInForce FOK = new OrderFormTimeInForce("FOK", 2);
    public static final OrderFormTimeInForce UNSPECIFIED = new OrderFormTimeInForce(EducationTourScreenNames.UNSPECIFIED_SCREEN, 3);

    /* compiled from: OrderFormTimeInForce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderFormTimeInForce.values().length];
            try {
                iArr[OrderFormTimeInForce.IOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFormTimeInForce.GTD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFormTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderFormTimeInForce.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OrderFormTimeInForce[] $values() {
        return new OrderFormTimeInForce[]{IOC, GTD, FOK, UNSPECIFIED};
    }

    public static EnumEntries<OrderFormTimeInForce> getEntries() {
        return $ENTRIES;
    }

    private OrderFormTimeInForce(String str, int i) {
    }

    static {
        OrderFormTimeInForce[] orderFormTimeInForceArr$values = $values();
        $VALUES = orderFormTimeInForceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderFormTimeInForceArr$values);
    }

    public final FuturesTimeInForce toFuturesTimeInForce() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return FuturesTimeInForce.IOC;
        }
        if (i == 2) {
            return FuturesTimeInForce.GTD;
        }
        if (i == 3) {
            return FuturesTimeInForce.FOK;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static OrderFormTimeInForce valueOf(String str) {
        return (OrderFormTimeInForce) Enum.valueOf(OrderFormTimeInForce.class, str);
    }

    public static OrderFormTimeInForce[] values() {
        return (OrderFormTimeInForce[]) $VALUES.clone();
    }
}
