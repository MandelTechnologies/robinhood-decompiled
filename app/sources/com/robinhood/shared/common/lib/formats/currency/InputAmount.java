package com.robinhood.shared.common.lib.formats.currency;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputAmount.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "", "amount", "Ljava/math/BigDecimal;", "type", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount$Type;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/shared/common/lib/formats/currency/InputAmount$Type;)V", "getAmount", "()Ljava/math/BigDecimal;", "getType", "()Lcom/robinhood/shared/common/lib/formats/currency/InputAmount$Type;", "isFractional", "", "format", "", "model", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Type", "Companion", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class InputAmount {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigDecimal amount;
    private final Type type;

    /* compiled from: InputAmount.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.INTEGER_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BLANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.FRACTIONAL_AMOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ZERO_AND_SEPARATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InputAmount copy$default(InputAmount inputAmount, BigDecimal bigDecimal, Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = inputAmount.amount;
        }
        if ((i & 2) != 0) {
            type2 = inputAmount.type;
        }
        return inputAmount.copy(bigDecimal, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final InputAmount copy(BigDecimal amount, Type type2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new InputAmount(amount, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputAmount)) {
            return false;
        }
        InputAmount inputAmount = (InputAmount) other;
        return Intrinsics.areEqual(this.amount, inputAmount.amount) && this.type == inputAmount.type;
    }

    public int hashCode() {
        return (this.amount.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "InputAmount(amount=" + this.amount + ", type=" + this.type + ")";
    }

    public InputAmount(BigDecimal amount, Type type2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.amount = amount;
        this.type = type2;
    }

    public /* synthetic */ InputAmount(BigDecimal bigDecimal, Type type2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BigDecimal.ZERO : bigDecimal, type2);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InputAmount.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/InputAmount$Type;", "", "<init>", "(Ljava/lang/String;I)V", "INTEGER_AMOUNT", "FRACTIONAL_AMOUNT", "BLANK", "ZERO", "ZERO_AND_SEPARATOR", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INTEGER_AMOUNT = new Type("INTEGER_AMOUNT", 0);
        public static final Type FRACTIONAL_AMOUNT = new Type("FRACTIONAL_AMOUNT", 1);
        public static final Type BLANK = new Type("BLANK", 2);
        public static final Type ZERO = new Type("ZERO", 3);
        public static final Type ZERO_AND_SEPARATOR = new Type("ZERO_AND_SEPARATOR", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{INTEGER_AMOUNT, FRACTIONAL_AMOUNT, BLANK, ZERO, ZERO_AND_SEPARATOR};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final boolean isFractional() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String format(CurrencyFormatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()] == 2) {
            return "";
        }
        return CurrencyFormatCache.getCurrencyFormat(model.copy$lib_formats_currency_externalDebug((65471 & 1) != 0 ? model.symbolFormatModel : null, (65471 & 2) != 0 ? model.showCurrencySymbol : false, (65471 & 4) != 0 ? model.minimumFractionDigits : 0, (65471 & 8) != 0 ? model.maximumFractionDigits : 0, (65471 & 16) != 0 ? model.minimumIntegerDigits : 0, (65471 & 32) != 0 ? model.isGroupingUsed : false, (65471 & 64) != 0 ? model.isDecimalSeparatorAlwaysShown : isFractional() && !model.getForceHideDecimalSeparator(), (65471 & 128) != 0 ? model.roundingMode : null, (65471 & 256) != 0 ? model.locale : null, (65471 & 512) != 0 ? model.forceCurrencyFormatter : false, (65471 & 1024) != 0 ? model.lowPrecision : false, (65471 & 2048) != 0 ? model.smallAmountFormatter : false, (65471 & 4096) != 0 ? model.forceHideDecimalSeparator : false, (65471 & 8192) != 0 ? model.isSignedAlwaysShown : null, (65471 & 16384) != 0 ? model.showPlusSign : false, (65471 & 32768) != 0 ? model.showMinusSign : false)).format(this.amount);
    }

    /* compiled from: InputAmount.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/InputAmount$Companion;", "", "<init>", "()V", "fromAmount", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "amount", "Ljava/math/BigDecimal;", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final InputAmount fromAmount(BigDecimal amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            if (Intrinsics.areEqual(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(amount), zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimal.ZERO))) {
                return new InputAmount(null, Type.ZERO, 1, 0 == true ? 1 : 0);
            }
            if (amount.scale() > 0) {
                return new InputAmount(amount, Type.FRACTIONAL_AMOUNT);
            }
            return new InputAmount(amount, Type.INTEGER_AMOUNT);
        }
    }
}
