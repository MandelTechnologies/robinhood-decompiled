package com.robinhood.shared.trade.crypto.p397ui.tooltip;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTooltipData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "type", "Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getType", "()Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTooltipData {
    public static final int $stable = StringResource.$stable;
    private final StringResource text;
    private final Type type;

    public static /* synthetic */ CryptoOrderTooltipData copy$default(CryptoOrderTooltipData cryptoOrderTooltipData, StringResource stringResource, Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoOrderTooltipData.text;
        }
        if ((i & 2) != 0) {
            type2 = cryptoOrderTooltipData.type;
        }
        return cryptoOrderTooltipData.copy(stringResource, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final CryptoOrderTooltipData copy(StringResource text, Type type2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new CryptoOrderTooltipData(text, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTooltipData)) {
            return false;
        }
        CryptoOrderTooltipData cryptoOrderTooltipData = (CryptoOrderTooltipData) other;
        return Intrinsics.areEqual(this.text, cryptoOrderTooltipData.text) && this.type == cryptoOrderTooltipData.type;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "CryptoOrderTooltipData(text=" + this.text + ", type=" + this.type + ")";
    }

    public CryptoOrderTooltipData(StringResource text, Type type2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.text = text;
        this.type = type2;
    }

    public final StringResource getText() {
        return this.text;
    }

    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderTooltipData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;", "", "<init>", "(Ljava/lang/String;I)V", "EU_ADVANCED_ORDERS", "TAX_LOT_ORDERS", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EU_ADVANCED_ORDERS = new Type("EU_ADVANCED_ORDERS", 0);
        public static final Type TAX_LOT_ORDERS = new Type("TAX_LOT_ORDERS", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{EU_ADVANCED_ORDERS, TAX_LOT_ORDERS};
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
}
