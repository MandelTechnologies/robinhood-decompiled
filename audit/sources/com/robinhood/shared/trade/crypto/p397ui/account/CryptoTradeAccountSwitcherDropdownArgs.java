package com.robinhood.shared.trade.crypto.p397ui.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.OrderSide;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeAccountSwitcherDropdownArgs.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "source", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs$Source;", "side", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs$Source;Lcom/robinhood/models/db/OrderSide;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs$Source;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Source", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTradeAccountSwitcherDropdownArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoTradeAccountSwitcherDropdownArgs> CREATOR = new Creator();
    private final UUID currencyPairId;
    private final OrderSide side;
    private final Source source;

    /* compiled from: CryptoTradeAccountSwitcherDropdownArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoTradeAccountSwitcherDropdownArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradeAccountSwitcherDropdownArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTradeAccountSwitcherDropdownArgs((UUID) parcel.readSerializable(), Source.valueOf(parcel.readString()), OrderSide.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradeAccountSwitcherDropdownArgs[] newArray(int i) {
            return new CryptoTradeAccountSwitcherDropdownArgs[i];
        }
    }

    public static /* synthetic */ CryptoTradeAccountSwitcherDropdownArgs copy$default(CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs, UUID uuid, Source source, OrderSide orderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoTradeAccountSwitcherDropdownArgs.currencyPairId;
        }
        if ((i & 2) != 0) {
            source = cryptoTradeAccountSwitcherDropdownArgs.source;
        }
        if ((i & 4) != 0) {
            orderSide = cryptoTradeAccountSwitcherDropdownArgs.side;
        }
        return cryptoTradeAccountSwitcherDropdownArgs.copy(uuid, source, orderSide);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    public final CryptoTradeAccountSwitcherDropdownArgs copy(UUID currencyPairId, Source source, OrderSide side) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(side, "side");
        return new CryptoTradeAccountSwitcherDropdownArgs(currencyPairId, source, side);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradeAccountSwitcherDropdownArgs)) {
            return false;
        }
        CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs = (CryptoTradeAccountSwitcherDropdownArgs) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoTradeAccountSwitcherDropdownArgs.currencyPairId) && this.source == cryptoTradeAccountSwitcherDropdownArgs.source && this.side == cryptoTradeAccountSwitcherDropdownArgs.side;
    }

    public int hashCode() {
        return (((this.currencyPairId.hashCode() * 31) + this.source.hashCode()) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "CryptoTradeAccountSwitcherDropdownArgs(currencyPairId=" + this.currencyPairId + ", source=" + this.source + ", side=" + this.side + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeString(this.source.name());
        dest.writeString(this.side.name());
    }

    public CryptoTradeAccountSwitcherDropdownArgs(UUID currencyPairId, Source source, OrderSide side) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(side, "side");
        this.currencyPairId = currencyPairId;
        this.source = source;
        this.side = side;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final Source getSource() {
        return this.source;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTradeAccountSwitcherDropdownArgs.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs$Source;", "", "<init>", "(Ljava/lang/String;I)V", "QUOTE_ORDER", "ORDER", "TAX_LOT_ORDER", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source QUOTE_ORDER = new Source("QUOTE_ORDER", 0);
        public static final Source ORDER = new Source("ORDER", 1);
        public static final Source TAX_LOT_ORDER = new Source("TAX_LOT_ORDER", 2);

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{QUOTE_ORDER, ORDER, TAX_LOT_ORDER};
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i) {
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
