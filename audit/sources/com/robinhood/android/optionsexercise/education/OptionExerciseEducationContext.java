package com.robinhood.android.optionsexercise.education;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionExerciseEducationContext.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002;:B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010-\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0011\u0010/\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0011\u00101\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/db/Quote;", "equityQuote", "Ljava/math/BigDecimal;", "optionQuoteBidPrice", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "j$/time/Instant", "lastUpdated", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "lateCloseState", "<init>", "(Lcom/robinhood/models/db/Quote;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionInstrument;Lj$/time/Instant;Lcom/robinhood/models/db/OptionChain$LateCloseState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/db/Quote;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "Ljava/math/BigDecimal;", "getOptionQuoteBidPrice", "()Ljava/math/BigDecimal;", "Lcom/robinhood/models/db/OptionInstrument;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "Lj$/time/Instant;", "getLastUpdated", "()Lj$/time/Instant;", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "getLateCloseState", "()Lcom/robinhood/models/db/OptionChain$LateCloseState;", "Lcom/robinhood/models/util/Money;", "getEquityPrice", "()Lcom/robinhood/models/util/Money;", "equityPrice", "getStrikePrice", "strikePrice", "getIntrinsicValue", "intrinsicValue", "getPremium", "premium", "getExtrinsicValue", "extrinsicValue", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext$OtmWarningType;", "getShowOtmWarning", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext$OtmWarningType;", "showOtmWarning", "", "getShowHighPremiumWarning", "()Z", "showHighPremiumWarning", "Companion", "OtmWarningType", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseEducationContext implements Parcelable {
    private final Quote equityQuote;
    private final Instant lastUpdated;
    private final OptionChain.LateCloseState lateCloseState;
    private final OptionInstrument optionInstrument;
    private final BigDecimal optionQuoteBidPrice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionExerciseEducationContext> CREATOR = new Creator();
    private static final BigDecimal ALMOST_OTM_EPSILON = new BigDecimal("0.02");
    private static final BigDecimal HIGH_PREMIUM_EPSILON = new BigDecimal("0.1");

    /* compiled from: OptionExerciseEducationContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionExerciseEducationContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionExerciseEducationContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionExerciseEducationContext((Quote) parcel.readParcelable(OptionExerciseEducationContext.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (OptionInstrument) parcel.readParcelable(OptionExerciseEducationContext.class.getClassLoader()), (Instant) parcel.readSerializable(), OptionChain.LateCloseState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionExerciseEducationContext[] newArray(int i) {
            return new OptionExerciseEducationContext[i];
        }
    }

    /* compiled from: OptionExerciseEducationContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.equityQuote, flags);
        dest.writeSerializable(this.optionQuoteBidPrice);
        dest.writeParcelable(this.optionInstrument, flags);
        dest.writeSerializable(this.lastUpdated);
        dest.writeString(this.lateCloseState.name());
    }

    public OptionExerciseEducationContext(Quote equityQuote, BigDecimal optionQuoteBidPrice, OptionInstrument optionInstrument, Instant lastUpdated, OptionChain.LateCloseState lateCloseState) {
        Intrinsics.checkNotNullParameter(equityQuote, "equityQuote");
        Intrinsics.checkNotNullParameter(optionQuoteBidPrice, "optionQuoteBidPrice");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
        Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
        this.equityQuote = equityQuote;
        this.optionQuoteBidPrice = optionQuoteBidPrice;
        this.optionInstrument = optionInstrument;
        this.lastUpdated = lastUpdated;
        this.lateCloseState = lateCloseState;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final BigDecimal getOptionQuoteBidPrice() {
        return this.optionQuoteBidPrice;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final Instant getLastUpdated() {
        return this.lastUpdated;
    }

    public final OptionChain.LateCloseState getLateCloseState() {
        return this.lateCloseState;
    }

    public final Money getEquityPrice() {
        return this.equityQuote.getLastTradePrice();
    }

    public final Money getStrikePrice() {
        return Money3.toMoney(this.optionInstrument.getStrikePrice(), Currencies.USD);
    }

    public final Money getIntrinsicValue() {
        OptionContractType contractType = this.optionInstrument.getContractType();
        Currency currency = Currencies.USD;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Money money = new Money(currency, ZERO);
        int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == 1) {
            return money.max(getEquityPrice().minus(getStrikePrice()));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return money.max(getStrikePrice().minus(getEquityPrice()));
    }

    public final Money getPremium() {
        return Money3.toMoney(this.optionQuoteBidPrice, Currencies.USD);
    }

    public final Money getExtrinsicValue() {
        return getPremium().minus(getIntrinsicValue());
    }

    public final OtmWarningType getShowOtmWarning() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.optionInstrument.getContractType().ordinal()];
        if (i == 1) {
            if (getStrikePrice().compareTo(getEquityPrice()) >= 0) {
                return OtmWarningType.OTM;
            }
            Money strikePrice = getStrikePrice();
            Money equityPrice = getEquityPrice();
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalSubtract = ONE.subtract(ALMOST_OTM_EPSILON);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return strikePrice.compareTo(equityPrice.times(bigDecimalSubtract)) >= 0 ? OtmWarningType.ALMOST_OTM : OtmWarningType.NOT_OTM;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (getStrikePrice().compareTo(getEquityPrice()) <= 0) {
            return OtmWarningType.OTM;
        }
        Money strikePrice2 = getStrikePrice();
        Money equityPrice2 = getEquityPrice();
        BigDecimal ONE2 = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
        BigDecimal bigDecimalAdd = ONE2.add(ALMOST_OTM_EPSILON);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return strikePrice2.compareTo(equityPrice2.times(bigDecimalAdd)) <= 0 ? OtmWarningType.ALMOST_OTM : OtmWarningType.NOT_OTM;
    }

    public final boolean getShowHighPremiumWarning() {
        return getExtrinsicValue().div(getPremium()).compareTo(HIGH_PREMIUM_EPSILON) >= 0;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionExerciseEducationContext.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext$OtmWarningType;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_OTM", "ALMOST_OTM", "OTM", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OtmWarningType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OtmWarningType[] $VALUES;
        public static final OtmWarningType NOT_OTM = new OtmWarningType("NOT_OTM", 0);
        public static final OtmWarningType ALMOST_OTM = new OtmWarningType("ALMOST_OTM", 1);
        public static final OtmWarningType OTM = new OtmWarningType("OTM", 2);

        private static final /* synthetic */ OtmWarningType[] $values() {
            return new OtmWarningType[]{NOT_OTM, ALMOST_OTM, OTM};
        }

        public static EnumEntries<OtmWarningType> getEntries() {
            return $ENTRIES;
        }

        private OtmWarningType(String str, int i) {
        }

        static {
            OtmWarningType[] otmWarningTypeArr$values = $values();
            $VALUES = otmWarningTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(otmWarningTypeArr$values);
        }

        public static OtmWarningType valueOf(String str) {
            return (OtmWarningType) Enum.valueOf(OtmWarningType.class, str);
        }

        public static OtmWarningType[] values() {
            return (OtmWarningType[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionExerciseEducationContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext$Companion;", "", "<init>", "()V", "ALMOST_OTM_EPSILON", "Ljava/math/BigDecimal;", "getALMOST_OTM_EPSILON", "()Ljava/math/BigDecimal;", "HIGH_PREMIUM_EPSILON", "getHIGH_PREMIUM_EPSILON", "from", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "lateCloseState", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BigDecimal getALMOST_OTM_EPSILON() {
            return OptionExerciseEducationContext.ALMOST_OTM_EPSILON;
        }

        public final BigDecimal getHIGH_PREMIUM_EPSILON() {
            return OptionExerciseEducationContext.HIGH_PREMIUM_EPSILON;
        }

        public final OptionExerciseEducationContext from(OptionInstrument optionInstrument, OptionQuote optionQuote, Quote equityQuote, OptionChain.LateCloseState lateCloseState) {
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            Intrinsics.checkNotNullParameter(optionQuote, "optionQuote");
            Intrinsics.checkNotNullParameter(equityQuote, "equityQuote");
            Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
            return new OptionExerciseEducationContext(equityQuote, optionQuote.getBidPrice().getUnsignedValue(), optionInstrument, (Instant) ComparisonsKt.maxOf(equityQuote.getReceivedAt(), optionQuote.getReceivedAt()), lateCloseState);
        }
    }
}
