package com.robinhood.education;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.Screen;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: CryptoLearnAndEarnLoggingData.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÂ\u0003J!\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\r\u001a\u00060\u0003j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "Landroid/os/Parcelable;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "source", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;)V", "rewardAmount", "Ljava/math/BigDecimal;", "getRewardAmount", "()Ljava/math/BigDecimal;", "eventContext", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "rewardContext", "getRewardContext", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CryptoLearnAndEarnLoggingData implements Parcelable {
    public static final Parcelable.Creator<CryptoLearnAndEarnLoggingData> CREATOR = new Creator();
    private final Context context;
    private final String source;

    /* compiled from: CryptoLearnAndEarnLoggingData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoLearnAndEarnLoggingData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoLearnAndEarnLoggingData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoLearnAndEarnLoggingData((Context) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoLearnAndEarnLoggingData[] newArray(int i) {
            return new CryptoLearnAndEarnLoggingData[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    private final String getSource() {
        return this.source;
    }

    public static /* synthetic */ CryptoLearnAndEarnLoggingData copy$default(CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData, Context context, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            context = cryptoLearnAndEarnLoggingData.context;
        }
        if ((i & 2) != 0) {
            str = cryptoLearnAndEarnLoggingData.source;
        }
        return cryptoLearnAndEarnLoggingData.copy(context, str);
    }

    public final CryptoLearnAndEarnLoggingData copy(Context context, String source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CryptoLearnAndEarnLoggingData(context, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoLearnAndEarnLoggingData)) {
            return false;
        }
        CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData = (CryptoLearnAndEarnLoggingData) other;
        return Intrinsics.areEqual(this.context, cryptoLearnAndEarnLoggingData.context) && Intrinsics.areEqual(this.source, cryptoLearnAndEarnLoggingData.source);
    }

    public int hashCode() {
        return (this.context.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "CryptoLearnAndEarnLoggingData(context=" + this.context + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.context);
        dest.writeString(this.source);
    }

    public CryptoLearnAndEarnLoggingData(Context context, String source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        this.context = context;
        this.source = source;
    }

    private final BigDecimal getRewardAmount() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(1L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public final Context getEventContext() {
        return Context.copy$default(this.context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, new Screen(null, this.source, null, null, 13, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getRewardContext() {
        Context eventContext = getEventContext();
        String string2 = getRewardAmount().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Currency currency = Currency.USD;
        ByteString byteString = null;
        String str = null;
        double d = 0.0d;
        Money money = null;
        Boolean r9 = null;
        String str2 = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
        ByteString byteString2 = null;
        return Context.copy$default(eventContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RewardContext(str, new Money(string2, currency, currency, byteString, 8, null), d, money, 0 == true ? 1 : 0, r9, str2, byteString2, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1048577, -1, -1, -1, -1, 16383, null);
    }
}
