package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/CaretType;", "", "<init>", "(Ljava/lang/String;I)V", "DOUBLE_UP", "UP", "DOWN", "DOUBLE_DOWN", "getSignedSteps", "Ljava/math/BigDecimal;", "focusedText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CaretType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaretType[] $VALUES;
    public static final CaretType DOUBLE_UP = new CaretType("DOUBLE_UP", 0);

    /* renamed from: UP */
    public static final CaretType f4168UP = new CaretType("UP", 1);
    public static final CaretType DOWN = new CaretType("DOWN", 2);
    public static final CaretType DOUBLE_DOWN = new CaretType("DOUBLE_DOWN", 3);

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CaretType.values().length];
            try {
                iArr[CaretType.DOUBLE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaretType.f4168UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaretType.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CaretType.DOUBLE_DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderFormDataState.FocusedText.values().length];
            try {
                iArr2[FuturesOrderFormDataState.FocusedText.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FuturesOrderFormDataState.FocusedText.LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FuturesOrderFormDataState.FocusedText.STOP_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ CaretType[] $values() {
        return new CaretType[]{DOUBLE_UP, f4168UP, DOWN, DOUBLE_DOWN};
    }

    public static EnumEntries<CaretType> getEntries() {
        return $ENTRIES;
    }

    private CaretType(String str, int i) {
    }

    static {
        CaretType[] caretTypeArr$values = $values();
        $VALUES = caretTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(caretTypeArr$values);
    }

    public final BigDecimal getSignedSteps(FuturesOrderFormDataState.FocusedText focusedText) {
        Intrinsics.checkNotNullParameter(focusedText, "focusedText");
        int i = WhenMappings.$EnumSwitchMapping$1[focusedText.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return new BigDecimal(5);
            }
            if (i2 == 2) {
                return new BigDecimal(1);
            }
            if (i2 == 3) {
                return new BigDecimal(-1);
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new BigDecimal(-5);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i3 == 1) {
            return new BigDecimal(4);
        }
        if (i3 == 2) {
            return new BigDecimal(1);
        }
        if (i3 == 3) {
            return new BigDecimal(-1);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new BigDecimal(-4);
    }

    public static CaretType valueOf(String str) {
        return (CaretType) Enum.valueOf(CaretType.class, str);
    }

    public static CaretType[] values() {
        return (CaretType[]) $VALUES.clone();
    }
}
