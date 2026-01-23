package com.robinhood.android.p148fx.tooltip;

import com.robinhood.models.p325fx.p326db.FxRate;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxState;", "", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "Success", "Error", "Loading", "Lcom/robinhood/android/fx/tooltip/FxState$Error;", "Lcom/robinhood/android/fx/tooltip/FxState$Loading;", "Lcom/robinhood/android/fx/tooltip/FxState$Success;", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface FxState {
    String getErrorMessage();

    /* compiled from: FxState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxState$Success;", "Lcom/robinhood/android/fx/tooltip/FxState;", "usdAmount", "Lcom/robinhood/models/util/Money;", "rate", "Lcom/robinhood/models/fx/db/FxRate;", "isStale", "", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/db/FxRate;Z)V", "getUsdAmount", "()Lcom/robinhood/models/util/Money;", "getRate", "()Lcom/robinhood/models/fx/db/FxRate;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements FxState {
        public static final int $stable = 8;
        private final boolean isStale;
        private final FxRate rate;
        private final Money usdAmount;

        public static /* synthetic */ Success copy$default(Success success, Money money, FxRate fxRate, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                money = success.usdAmount;
            }
            if ((i & 2) != 0) {
                fxRate = success.rate;
            }
            if ((i & 4) != 0) {
                z = success.isStale;
            }
            return success.copy(money, fxRate, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getUsdAmount() {
            return this.usdAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final FxRate getRate() {
            return this.rate;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        public final Success copy(Money usdAmount, FxRate rate, boolean isStale) {
            Intrinsics.checkNotNullParameter(usdAmount, "usdAmount");
            Intrinsics.checkNotNullParameter(rate, "rate");
            return new Success(usdAmount, rate, isStale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.usdAmount, success.usdAmount) && Intrinsics.areEqual(this.rate, success.rate) && this.isStale == success.isStale;
        }

        public int hashCode() {
            return (((this.usdAmount.hashCode() * 31) + this.rate.hashCode()) * 31) + Boolean.hashCode(this.isStale);
        }

        public String toString() {
            return "Success(usdAmount=" + this.usdAmount + ", rate=" + this.rate + ", isStale=" + this.isStale + ")";
        }

        public Success(Money usdAmount, FxRate rate, boolean z) {
            Intrinsics.checkNotNullParameter(usdAmount, "usdAmount");
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.usdAmount = usdAmount;
            this.rate = rate;
            this.isStale = z;
        }

        @Override // com.robinhood.android.p148fx.tooltip.FxState
        public String getErrorMessage() {
            return DefaultImpls.getErrorMessage(this);
        }

        public final Money getUsdAmount() {
            return this.usdAmount;
        }

        public final FxRate getRate() {
            return this.rate;
        }

        public final boolean isStale() {
            return this.isStale;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FxState.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxState$Error;", "Lcom/robinhood/android/fx/tooltip/FxState;", "", "<init>", "(Ljava/lang/String;I)V", "NullQuote", "NullUsdAmount", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements FxState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error NullQuote = new Error("NullQuote", 0);
        public static final Error NullUsdAmount = new Error("NullUsdAmount", 1);

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{NullQuote, NullUsdAmount};
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i) {
        }

        @Override // com.robinhood.android.p148fx.tooltip.FxState
        public String getErrorMessage() {
            return DefaultImpls.getErrorMessage(this);
        }

        static {
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorArr$values);
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* compiled from: FxState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxState$Loading;", "Lcom/robinhood/android/fx/tooltip/FxState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements FxState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1920353478;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.android.p148fx.tooltip.FxState
        public String getErrorMessage() {
            return DefaultImpls.getErrorMessage(this);
        }
    }

    /* compiled from: FxState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static String getErrorMessage(FxState fxState) {
            return ((fxState instanceof Success) && ((Success) fxState).isStale()) ? "FX rate is stale" : fxState == Error.NullQuote ? "FX quote is null" : fxState == Error.NullUsdAmount ? "USD amount is null" : "";
        }
    }
}
