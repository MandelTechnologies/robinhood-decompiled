package com.robinhood.android.portfolio.pnl.p214db;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ProfitAndLossTradeItem.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u0010,J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b6\u0010/J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b8\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010*J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u0010*JÆ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b?\u0010*J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010$J\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010,R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bN\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u00101R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bS\u0010,R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bT\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bU\u0010/R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bV\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bW\u0010/R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bX\u0010/R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bY\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\b[\u0010:R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b\\\u0010*R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b]\u0010*¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "id", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "assetClass", "", "symbol", "j$/time/Instant", "closeTimestamp", "displayName", "Lcom/robinhood/models/util/Money;", "realizedReturn", "Ljava/math/BigDecimal;", "realizedReturnPercentage", "firstExecutionTimeStamp", "quantity", "openingAmount", "closingAmount", "openAveragePrice", "closeAveragePrice", "detailDisplayName", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "orderDetails", "requestSymbol", "nextCursor", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/portfolio/api/AssetClass;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lj$/time/Instant;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/android/models/portfolio/api/AssetClass;", "component3", "()Ljava/lang/String;", "component4", "()Lj$/time/Instant;", "component5", "component6", "()Lcom/robinhood/models/util/Money;", "component7", "()Ljava/math/BigDecimal;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "component16", "component17", "copy", "(Ljava/util/UUID;Lcom/robinhood/android/models/portfolio/api/AssetClass;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lj$/time/Instant;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "getAssetClass", "Ljava/lang/String;", "getSymbol", "Lj$/time/Instant;", "getCloseTimestamp", "getDisplayName", "Lcom/robinhood/models/util/Money;", "getRealizedReturn", "Ljava/math/BigDecimal;", "getRealizedReturnPercentage", "getFirstExecutionTimeStamp", "getQuantity", "getOpeningAmount", "getClosingAmount", "getOpenAveragePrice", "getCloseAveragePrice", "getDetailDisplayName", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "getOrderDetails", "getRequestSymbol", "getNextCursor", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfitAndLossTradeItem implements Parcelable {
    public static final Parcelable.Creator<ProfitAndLossTradeItem> CREATOR = new Creator();
    private final AssetClass assetClass;
    private final Money closeAveragePrice;
    private final Instant closeTimestamp;
    private final Money closingAmount;
    private final String detailDisplayName;
    private final String displayName;
    private final Instant firstExecutionTimeStamp;
    private final UUID id;
    private final String nextCursor;
    private final Money openAveragePrice;
    private final Money openingAmount;
    private final ProfitAndLossOrderDetails orderDetails;
    private final BigDecimal quantity;
    private final Money realizedReturn;
    private final BigDecimal realizedReturnPercentage;
    private final String requestSymbol;
    private final String symbol;

    /* compiled from: ProfitAndLossTradeItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfitAndLossTradeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitAndLossTradeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfitAndLossTradeItem((UUID) parcel.readSerializable(), AssetClass.valueOf(parcel.readString()), parcel.readString(), (Instant) parcel.readSerializable(), parcel.readString(), (Money) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (Instant) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (Money) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), (Money) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), (Money) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), (Money) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), parcel.readString(), (ProfitAndLossOrderDetails) parcel.readParcelable(ProfitAndLossTradeItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitAndLossTradeItem[] newArray(int i) {
            return new ProfitAndLossTradeItem[i];
        }
    }

    public static /* synthetic */ ProfitAndLossTradeItem copy$default(ProfitAndLossTradeItem profitAndLossTradeItem, UUID uuid, AssetClass assetClass, String str, Instant instant, String str2, Money money, BigDecimal bigDecimal, Instant instant2, BigDecimal bigDecimal2, Money money2, Money money3, Money money4, Money money5, String str3, ProfitAndLossOrderDetails profitAndLossOrderDetails, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        UUID uuid2;
        ProfitAndLossTradeItem profitAndLossTradeItem2;
        ProfitAndLossOrderDetails profitAndLossOrderDetails2;
        AssetClass assetClass2;
        String str8;
        Instant instant3;
        String str9;
        Money money6;
        BigDecimal bigDecimal3;
        Instant instant4;
        BigDecimal bigDecimal4;
        Money money7;
        Money money8;
        Money money9;
        Money money10;
        String str10;
        UUID uuid3 = (i & 1) != 0 ? profitAndLossTradeItem.id : uuid;
        AssetClass assetClass3 = (i & 2) != 0 ? profitAndLossTradeItem.assetClass : assetClass;
        String str11 = (i & 4) != 0 ? profitAndLossTradeItem.symbol : str;
        Instant instant5 = (i & 8) != 0 ? profitAndLossTradeItem.closeTimestamp : instant;
        String str12 = (i & 16) != 0 ? profitAndLossTradeItem.displayName : str2;
        Money money11 = (i & 32) != 0 ? profitAndLossTradeItem.realizedReturn : money;
        BigDecimal bigDecimal5 = (i & 64) != 0 ? profitAndLossTradeItem.realizedReturnPercentage : bigDecimal;
        Instant instant6 = (i & 128) != 0 ? profitAndLossTradeItem.firstExecutionTimeStamp : instant2;
        BigDecimal bigDecimal6 = (i & 256) != 0 ? profitAndLossTradeItem.quantity : bigDecimal2;
        Money money12 = (i & 512) != 0 ? profitAndLossTradeItem.openingAmount : money2;
        Money money13 = (i & 1024) != 0 ? profitAndLossTradeItem.closingAmount : money3;
        Money money14 = (i & 2048) != 0 ? profitAndLossTradeItem.openAveragePrice : money4;
        Money money15 = (i & 4096) != 0 ? profitAndLossTradeItem.closeAveragePrice : money5;
        String str13 = (i & 8192) != 0 ? profitAndLossTradeItem.detailDisplayName : str3;
        UUID uuid4 = uuid3;
        ProfitAndLossOrderDetails profitAndLossOrderDetails3 = (i & 16384) != 0 ? profitAndLossTradeItem.orderDetails : profitAndLossOrderDetails;
        String str14 = (i & 32768) != 0 ? profitAndLossTradeItem.requestSymbol : str4;
        if ((i & 65536) != 0) {
            str7 = str14;
            str6 = profitAndLossTradeItem.nextCursor;
            profitAndLossOrderDetails2 = profitAndLossOrderDetails3;
            assetClass2 = assetClass3;
            str8 = str11;
            instant3 = instant5;
            str9 = str12;
            money6 = money11;
            bigDecimal3 = bigDecimal5;
            instant4 = instant6;
            bigDecimal4 = bigDecimal6;
            money7 = money12;
            money8 = money13;
            money9 = money14;
            money10 = money15;
            str10 = str13;
            uuid2 = uuid4;
            profitAndLossTradeItem2 = profitAndLossTradeItem;
        } else {
            str6 = str5;
            str7 = str14;
            uuid2 = uuid4;
            profitAndLossTradeItem2 = profitAndLossTradeItem;
            profitAndLossOrderDetails2 = profitAndLossOrderDetails3;
            assetClass2 = assetClass3;
            str8 = str11;
            instant3 = instant5;
            str9 = str12;
            money6 = money11;
            bigDecimal3 = bigDecimal5;
            instant4 = instant6;
            bigDecimal4 = bigDecimal6;
            money7 = money12;
            money8 = money13;
            money9 = money14;
            money10 = money15;
            str10 = str13;
        }
        return profitAndLossTradeItem2.copy(uuid2, assetClass2, str8, instant3, str9, money6, bigDecimal3, instant4, bigDecimal4, money7, money8, money9, money10, str10, profitAndLossOrderDetails2, str7, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getOpeningAmount() {
        return this.openingAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final Money getClosingAmount() {
        return this.closingAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final Money getOpenAveragePrice() {
        return this.openAveragePrice;
    }

    /* renamed from: component13, reason: from getter */
    public final Money getCloseAveragePrice() {
        return this.closeAveragePrice;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDetailDisplayName() {
        return this.detailDisplayName;
    }

    /* renamed from: component15, reason: from getter */
    public final ProfitAndLossOrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    /* renamed from: component16, reason: from getter */
    public final String getRequestSymbol() {
        return this.requestSymbol;
    }

    /* renamed from: component17, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* renamed from: component2, reason: from getter */
    public final AssetClass getAssetClass() {
        return this.assetClass;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getCloseTimestamp() {
        return this.closeTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getRealizedReturn() {
        return this.realizedReturn;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getRealizedReturnPercentage() {
        return this.realizedReturnPercentage;
    }

    /* renamed from: component8, reason: from getter */
    public final Instant getFirstExecutionTimeStamp() {
        return this.firstExecutionTimeStamp;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final ProfitAndLossTradeItem copy(UUID id, AssetClass assetClass, String symbol, Instant closeTimestamp, String displayName, Money realizedReturn, BigDecimal realizedReturnPercentage, Instant firstExecutionTimeStamp, BigDecimal quantity, Money openingAmount, Money closingAmount, Money openAveragePrice, Money closeAveragePrice, String detailDisplayName, ProfitAndLossOrderDetails orderDetails, String requestSymbol, String nextCursor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(closeTimestamp, "closeTimestamp");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(realizedReturnPercentage, "realizedReturnPercentage");
        Intrinsics.checkNotNullParameter(firstExecutionTimeStamp, "firstExecutionTimeStamp");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(closingAmount, "closingAmount");
        Intrinsics.checkNotNullParameter(closeAveragePrice, "closeAveragePrice");
        Intrinsics.checkNotNullParameter(detailDisplayName, "detailDisplayName");
        return new ProfitAndLossTradeItem(id, assetClass, symbol, closeTimestamp, displayName, realizedReturn, realizedReturnPercentage, firstExecutionTimeStamp, quantity, openingAmount, closingAmount, openAveragePrice, closeAveragePrice, detailDisplayName, orderDetails, requestSymbol, nextCursor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossTradeItem)) {
            return false;
        }
        ProfitAndLossTradeItem profitAndLossTradeItem = (ProfitAndLossTradeItem) other;
        return Intrinsics.areEqual(this.id, profitAndLossTradeItem.id) && this.assetClass == profitAndLossTradeItem.assetClass && Intrinsics.areEqual(this.symbol, profitAndLossTradeItem.symbol) && Intrinsics.areEqual(this.closeTimestamp, profitAndLossTradeItem.closeTimestamp) && Intrinsics.areEqual(this.displayName, profitAndLossTradeItem.displayName) && Intrinsics.areEqual(this.realizedReturn, profitAndLossTradeItem.realizedReturn) && Intrinsics.areEqual(this.realizedReturnPercentage, profitAndLossTradeItem.realizedReturnPercentage) && Intrinsics.areEqual(this.firstExecutionTimeStamp, profitAndLossTradeItem.firstExecutionTimeStamp) && Intrinsics.areEqual(this.quantity, profitAndLossTradeItem.quantity) && Intrinsics.areEqual(this.openingAmount, profitAndLossTradeItem.openingAmount) && Intrinsics.areEqual(this.closingAmount, profitAndLossTradeItem.closingAmount) && Intrinsics.areEqual(this.openAveragePrice, profitAndLossTradeItem.openAveragePrice) && Intrinsics.areEqual(this.closeAveragePrice, profitAndLossTradeItem.closeAveragePrice) && Intrinsics.areEqual(this.detailDisplayName, profitAndLossTradeItem.detailDisplayName) && Intrinsics.areEqual(this.orderDetails, profitAndLossTradeItem.orderDetails) && Intrinsics.areEqual(this.requestSymbol, profitAndLossTradeItem.requestSymbol) && Intrinsics.areEqual(this.nextCursor, profitAndLossTradeItem.nextCursor);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.assetClass.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.closeTimestamp.hashCode()) * 31) + this.displayName.hashCode()) * 31;
        Money money = this.realizedReturn;
        int iHashCode2 = (((((((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.realizedReturnPercentage.hashCode()) * 31) + this.firstExecutionTimeStamp.hashCode()) * 31) + this.quantity.hashCode()) * 31;
        Money money2 = this.openingAmount;
        int iHashCode3 = (((iHashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31) + this.closingAmount.hashCode()) * 31;
        Money money3 = this.openAveragePrice;
        int iHashCode4 = (((((iHashCode3 + (money3 == null ? 0 : money3.hashCode())) * 31) + this.closeAveragePrice.hashCode()) * 31) + this.detailDisplayName.hashCode()) * 31;
        ProfitAndLossOrderDetails profitAndLossOrderDetails = this.orderDetails;
        int iHashCode5 = (iHashCode4 + (profitAndLossOrderDetails == null ? 0 : profitAndLossOrderDetails.hashCode())) * 31;
        String str = this.requestSymbol;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextCursor;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ProfitAndLossTradeItem(id=" + this.id + ", assetClass=" + this.assetClass + ", symbol=" + this.symbol + ", closeTimestamp=" + this.closeTimestamp + ", displayName=" + this.displayName + ", realizedReturn=" + this.realizedReturn + ", realizedReturnPercentage=" + this.realizedReturnPercentage + ", firstExecutionTimeStamp=" + this.firstExecutionTimeStamp + ", quantity=" + this.quantity + ", openingAmount=" + this.openingAmount + ", closingAmount=" + this.closingAmount + ", openAveragePrice=" + this.openAveragePrice + ", closeAveragePrice=" + this.closeAveragePrice + ", detailDisplayName=" + this.detailDisplayName + ", orderDetails=" + this.orderDetails + ", requestSymbol=" + this.requestSymbol + ", nextCursor=" + this.nextCursor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeString(this.assetClass.name());
        dest.writeString(this.symbol);
        dest.writeSerializable(this.closeTimestamp);
        dest.writeString(this.displayName);
        dest.writeParcelable(this.realizedReturn, flags);
        dest.writeSerializable(this.realizedReturnPercentage);
        dest.writeSerializable(this.firstExecutionTimeStamp);
        dest.writeSerializable(this.quantity);
        dest.writeParcelable(this.openingAmount, flags);
        dest.writeParcelable(this.closingAmount, flags);
        dest.writeParcelable(this.openAveragePrice, flags);
        dest.writeParcelable(this.closeAveragePrice, flags);
        dest.writeString(this.detailDisplayName);
        dest.writeParcelable(this.orderDetails, flags);
        dest.writeString(this.requestSymbol);
        dest.writeString(this.nextCursor);
    }

    public ProfitAndLossTradeItem(UUID id, AssetClass assetClass, String symbol, Instant closeTimestamp, String displayName, Money money, BigDecimal realizedReturnPercentage, Instant firstExecutionTimeStamp, BigDecimal quantity, Money money2, Money closingAmount, Money money3, Money closeAveragePrice, String detailDisplayName, ProfitAndLossOrderDetails profitAndLossOrderDetails, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(closeTimestamp, "closeTimestamp");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(realizedReturnPercentage, "realizedReturnPercentage");
        Intrinsics.checkNotNullParameter(firstExecutionTimeStamp, "firstExecutionTimeStamp");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(closingAmount, "closingAmount");
        Intrinsics.checkNotNullParameter(closeAveragePrice, "closeAveragePrice");
        Intrinsics.checkNotNullParameter(detailDisplayName, "detailDisplayName");
        this.id = id;
        this.assetClass = assetClass;
        this.symbol = symbol;
        this.closeTimestamp = closeTimestamp;
        this.displayName = displayName;
        this.realizedReturn = money;
        this.realizedReturnPercentage = realizedReturnPercentage;
        this.firstExecutionTimeStamp = firstExecutionTimeStamp;
        this.quantity = quantity;
        this.openingAmount = money2;
        this.closingAmount = closingAmount;
        this.openAveragePrice = money3;
        this.closeAveragePrice = closeAveragePrice;
        this.detailDisplayName = detailDisplayName;
        this.orderDetails = profitAndLossOrderDetails;
        this.requestSymbol = str;
        this.nextCursor = str2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final AssetClass getAssetClass() {
        return this.assetClass;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Instant getCloseTimestamp() {
        return this.closeTimestamp;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Money getRealizedReturn() {
        return this.realizedReturn;
    }

    public final BigDecimal getRealizedReturnPercentage() {
        return this.realizedReturnPercentage;
    }

    public final Instant getFirstExecutionTimeStamp() {
        return this.firstExecutionTimeStamp;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final Money getOpeningAmount() {
        return this.openingAmount;
    }

    public final Money getClosingAmount() {
        return this.closingAmount;
    }

    public final Money getOpenAveragePrice() {
        return this.openAveragePrice;
    }

    public final Money getCloseAveragePrice() {
        return this.closeAveragePrice;
    }

    public final String getDetailDisplayName() {
        return this.detailDisplayName;
    }

    public final ProfitAndLossOrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final String getRequestSymbol() {
        return this.requestSymbol;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }
}
