package com.robinhood.shared.common.lib.formats.currency;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.crypto.CurrencyDefinition;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyFormatModel.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 F2\u00020\u0001:\u0003EFGB¥\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J´\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÀ\u0001¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0007HÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0014\u0010)R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c¨\u0006H"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "", "symbolFormatModel", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;", "showCurrencySymbol", "", "minimumFractionDigits", "", "maximumFractionDigits", "minimumIntegerDigits", "isGroupingUsed", "isDecimalSeparatorAlwaysShown", "roundingMode", "Ljava/math/RoundingMode;", "locale", "Ljava/util/Locale;", "forceCurrencyFormatter", "lowPrecision", "smallAmountFormatter", "forceHideDecimalSeparator", "isSignedAlwaysShown", "showPlusSign", "showMinusSign", "<init>", "(Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;ZIIIZZLjava/math/RoundingMode;Ljava/util/Locale;ZZZZLjava/lang/Boolean;ZZ)V", "getSymbolFormatModel", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;", "getShowCurrencySymbol", "()Z", "getMinimumFractionDigits", "()I", "getMaximumFractionDigits", "getMinimumIntegerDigits", "getRoundingMode", "()Ljava/math/RoundingMode;", "getLocale", "()Ljava/util/Locale;", "getForceCurrencyFormatter", "getLowPrecision", "getSmallAmountFormatter", "getForceHideDecimalSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowPlusSign", "getShowMinusSign", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "copy$lib_formats_currency_externalDebug", "(Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;ZIIIZZLjava/math/RoundingMode;Ljava/util/Locale;ZZZZLjava/lang/Boolean;ZZ)Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "equals", "other", "hashCode", "toString", "", "CurrencySymbolPosition", "Companion", "SymbolFormatModel", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class CurrencyFormatModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean forceCurrencyFormatter;
    private final boolean forceHideDecimalSeparator;
    private final boolean isDecimalSeparatorAlwaysShown;
    private final boolean isGroupingUsed;
    private final Boolean isSignedAlwaysShown;
    private final Locale locale;
    private final boolean lowPrecision;
    private final int maximumFractionDigits;
    private final int minimumFractionDigits;
    private final int minimumIntegerDigits;
    private final RoundingMode roundingMode;
    private final boolean showCurrencySymbol;
    private final boolean showMinusSign;
    private final boolean showPlusSign;
    private final boolean smallAmountFormatter;
    private final SymbolFormatModel symbolFormatModel;

    /* renamed from: component1, reason: from getter */
    public final SymbolFormatModel getSymbolFormatModel() {
        return this.symbolFormatModel;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getForceCurrencyFormatter() {
        return this.forceCurrencyFormatter;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getLowPrecision() {
        return this.lowPrecision;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getSmallAmountFormatter() {
        return this.smallAmountFormatter;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getForceHideDecimalSeparator() {
        return this.forceHideDecimalSeparator;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsSignedAlwaysShown() {
        return this.isSignedAlwaysShown;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowPlusSign() {
        return this.showPlusSign;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowMinusSign() {
        return this.showMinusSign;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowCurrencySymbol() {
        return this.showCurrencySymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinimumFractionDigits() {
        return this.minimumFractionDigits;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinimumIntegerDigits() {
        return this.minimumIntegerDigits;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsGroupingUsed() {
        return this.isGroupingUsed;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsDecimalSeparatorAlwaysShown() {
        return this.isDecimalSeparatorAlwaysShown;
    }

    /* renamed from: component8, reason: from getter */
    public final RoundingMode getRoundingMode() {
        return this.roundingMode;
    }

    /* renamed from: component9, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    public final CurrencyFormatModel copy$lib_formats_currency_externalDebug(SymbolFormatModel symbolFormatModel, boolean showCurrencySymbol, int minimumFractionDigits, int maximumFractionDigits, int minimumIntegerDigits, boolean isGroupingUsed, boolean isDecimalSeparatorAlwaysShown, RoundingMode roundingMode, Locale locale, boolean forceCurrencyFormatter, boolean lowPrecision, boolean smallAmountFormatter, boolean forceHideDecimalSeparator, Boolean isSignedAlwaysShown, boolean showPlusSign, boolean showMinusSign) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new CurrencyFormatModel(symbolFormatModel, showCurrencySymbol, minimumFractionDigits, maximumFractionDigits, minimumIntegerDigits, isGroupingUsed, isDecimalSeparatorAlwaysShown, roundingMode, locale, forceCurrencyFormatter, lowPrecision, smallAmountFormatter, forceHideDecimalSeparator, isSignedAlwaysShown, showPlusSign, showMinusSign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyFormatModel)) {
            return false;
        }
        CurrencyFormatModel currencyFormatModel = (CurrencyFormatModel) other;
        return Intrinsics.areEqual(this.symbolFormatModel, currencyFormatModel.symbolFormatModel) && this.showCurrencySymbol == currencyFormatModel.showCurrencySymbol && this.minimumFractionDigits == currencyFormatModel.minimumFractionDigits && this.maximumFractionDigits == currencyFormatModel.maximumFractionDigits && this.minimumIntegerDigits == currencyFormatModel.minimumIntegerDigits && this.isGroupingUsed == currencyFormatModel.isGroupingUsed && this.isDecimalSeparatorAlwaysShown == currencyFormatModel.isDecimalSeparatorAlwaysShown && this.roundingMode == currencyFormatModel.roundingMode && Intrinsics.areEqual(this.locale, currencyFormatModel.locale) && this.forceCurrencyFormatter == currencyFormatModel.forceCurrencyFormatter && this.lowPrecision == currencyFormatModel.lowPrecision && this.smallAmountFormatter == currencyFormatModel.smallAmountFormatter && this.forceHideDecimalSeparator == currencyFormatModel.forceHideDecimalSeparator && Intrinsics.areEqual(this.isSignedAlwaysShown, currencyFormatModel.isSignedAlwaysShown) && this.showPlusSign == currencyFormatModel.showPlusSign && this.showMinusSign == currencyFormatModel.showMinusSign;
    }

    public int hashCode() {
        SymbolFormatModel symbolFormatModel = this.symbolFormatModel;
        int iHashCode = (((((((((((((((((((((((((symbolFormatModel == null ? 0 : symbolFormatModel.hashCode()) * 31) + Boolean.hashCode(this.showCurrencySymbol)) * 31) + Integer.hashCode(this.minimumFractionDigits)) * 31) + Integer.hashCode(this.maximumFractionDigits)) * 31) + Integer.hashCode(this.minimumIntegerDigits)) * 31) + Boolean.hashCode(this.isGroupingUsed)) * 31) + Boolean.hashCode(this.isDecimalSeparatorAlwaysShown)) * 31) + this.roundingMode.hashCode()) * 31) + this.locale.hashCode()) * 31) + Boolean.hashCode(this.forceCurrencyFormatter)) * 31) + Boolean.hashCode(this.lowPrecision)) * 31) + Boolean.hashCode(this.smallAmountFormatter)) * 31) + Boolean.hashCode(this.forceHideDecimalSeparator)) * 31;
        Boolean bool = this.isSignedAlwaysShown;
        return ((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPlusSign)) * 31) + Boolean.hashCode(this.showMinusSign);
    }

    public String toString() {
        return "CurrencyFormatModel(symbolFormatModel=" + this.symbolFormatModel + ", showCurrencySymbol=" + this.showCurrencySymbol + ", minimumFractionDigits=" + this.minimumFractionDigits + ", maximumFractionDigits=" + this.maximumFractionDigits + ", minimumIntegerDigits=" + this.minimumIntegerDigits + ", isGroupingUsed=" + this.isGroupingUsed + ", isDecimalSeparatorAlwaysShown=" + this.isDecimalSeparatorAlwaysShown + ", roundingMode=" + this.roundingMode + ", locale=" + this.locale + ", forceCurrencyFormatter=" + this.forceCurrencyFormatter + ", lowPrecision=" + this.lowPrecision + ", smallAmountFormatter=" + this.smallAmountFormatter + ", forceHideDecimalSeparator=" + this.forceHideDecimalSeparator + ", isSignedAlwaysShown=" + this.isSignedAlwaysShown + ", showPlusSign=" + this.showPlusSign + ", showMinusSign=" + this.showMinusSign + ")";
    }

    public CurrencyFormatModel(SymbolFormatModel symbolFormatModel, boolean z, int i, int i2, int i3, boolean z2, boolean z3, RoundingMode roundingMode, Locale locale, boolean z4, boolean z5, boolean z6, boolean z7, Boolean bool, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.symbolFormatModel = symbolFormatModel;
        this.showCurrencySymbol = z;
        this.minimumFractionDigits = i;
        this.maximumFractionDigits = i2;
        this.minimumIntegerDigits = i3;
        this.isGroupingUsed = z2;
        this.isDecimalSeparatorAlwaysShown = z3;
        this.roundingMode = roundingMode;
        this.locale = locale;
        this.forceCurrencyFormatter = z4;
        this.lowPrecision = z5;
        this.smallAmountFormatter = z6;
        this.forceHideDecimalSeparator = z7;
        this.isSignedAlwaysShown = bool;
        this.showPlusSign = z8;
        this.showMinusSign = z9;
    }

    public final SymbolFormatModel getSymbolFormatModel() {
        return this.symbolFormatModel;
    }

    public final boolean getShowCurrencySymbol() {
        return this.showCurrencySymbol;
    }

    public final int getMinimumFractionDigits() {
        return this.minimumFractionDigits;
    }

    public final int getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    public final int getMinimumIntegerDigits() {
        return this.minimumIntegerDigits;
    }

    public final boolean isGroupingUsed() {
        return this.isGroupingUsed;
    }

    public final boolean isDecimalSeparatorAlwaysShown() {
        return this.isDecimalSeparatorAlwaysShown;
    }

    public /* synthetic */ CurrencyFormatModel(SymbolFormatModel symbolFormatModel, boolean z, int i, int i2, int i3, boolean z2, boolean z3, RoundingMode roundingMode, Locale locale, boolean z4, boolean z5, boolean z6, boolean z7, Boolean bool, boolean z8, boolean z9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(symbolFormatModel, z, i, i2, (i4 & 16) != 0 ? 1 : i3, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? false : z3, (i4 & 128) != 0 ? RoundingMode.HALF_DOWN : roundingMode, (i4 & 256) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale, (i4 & 512) != 0 ? false : z4, (i4 & 1024) != 0 ? false : z5, (i4 & 2048) != 0 ? false : z6, (i4 & 4096) != 0 ? false : z7, (i4 & 8192) != 0 ? null : bool, (i4 & 16384) != 0 ? false : z8, (i4 & 32768) != 0 ? false : z9);
    }

    public final RoundingMode getRoundingMode() {
        return this.roundingMode;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final boolean getForceCurrencyFormatter() {
        return this.forceCurrencyFormatter;
    }

    public final boolean getLowPrecision() {
        return this.lowPrecision;
    }

    public final boolean getSmallAmountFormatter() {
        return this.smallAmountFormatter;
    }

    public final boolean getForceHideDecimalSeparator() {
        return this.forceHideDecimalSeparator;
    }

    public final Boolean isSignedAlwaysShown() {
        return this.isSignedAlwaysShown;
    }

    public final boolean getShowPlusSign() {
        return this.showPlusSign;
    }

    public final boolean getShowMinusSign() {
        return this.showMinusSign;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyFormatModel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT_SPACED", "RIGHT", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencySymbolPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencySymbolPosition[] $VALUES;
        public static final CurrencySymbolPosition LEFT = new CurrencySymbolPosition("LEFT", 0);
        public static final CurrencySymbolPosition RIGHT_SPACED = new CurrencySymbolPosition("RIGHT_SPACED", 1);
        public static final CurrencySymbolPosition RIGHT = new CurrencySymbolPosition("RIGHT", 2);

        private static final /* synthetic */ CurrencySymbolPosition[] $values() {
            return new CurrencySymbolPosition[]{LEFT, RIGHT_SPACED, RIGHT};
        }

        public static EnumEntries<CurrencySymbolPosition> getEntries() {
            return $ENTRIES;
        }

        private CurrencySymbolPosition(String str, int i) {
        }

        static {
            CurrencySymbolPosition[] currencySymbolPositionArr$values = $values();
            $VALUES = currencySymbolPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencySymbolPositionArr$values);
        }

        public static CurrencySymbolPosition valueOf(String str) {
            return (CurrencySymbolPosition) Enum.valueOf(CurrencySymbolPosition.class, str);
        }

        public static CurrencySymbolPosition[] values() {
            return (CurrencySymbolPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: CurrencyFormatModel.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\tJT\u0010\u0019\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J©\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0002\u0010\"J2\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "symbol", "", "isFiatCurrency", "", "amount", "Ljava/math/BigDecimal;", "showCurrencySymbol", "isGroupingUsed", "minimumFractionDigits", "", "maximumFractionDigits", "isSpaced", "isDecimalSeparatorAlwaysShown", "roundingMode", "Ljava/math/RoundingMode;", "locale", "Ljava/util/Locale;", "forceCurrencyFormatter", "forceHideDecimalSeparator", "fromAmount", "fromCurrencyAmount", "currencyDefinition", "Lcom/robinhood/models/crypto/CurrencyDefinition;", "isSignedAlwaysShown", "showPlusSign", "showMinusSign", "lowPrecision", "smallAmountFormatter", "(Lcom/robinhood/models/crypto/CurrencyDefinition;Ljava/math/BigDecimal;ZZIIZZLjava/math/RoundingMode;Ljava/util/Locale;ZLjava/lang/Boolean;ZZZZ)Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "fromCurrencyForFiatPriceFormat", "signed", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CurrencyFormatModel create$default(Companion companion, String str, boolean z, BigDecimal bigDecimal, boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, RoundingMode roundingMode, Locale locale, boolean z6, boolean z7, int i3, Object obj) {
            boolean z8;
            boolean z9;
            Companion companion2;
            String str2;
            boolean z10;
            BigDecimal bigDecimal2;
            boolean z11 = (i3 & 8) != 0 ? true : z2;
            boolean z12 = (i3 & 16) != 0 ? true : z3;
            int iScale = (i3 & 32) != 0 ? bigDecimal.scale() : i;
            int iScale2 = (i3 & 64) != 0 ? bigDecimal.scale() : i2;
            boolean z13 = (i3 & 128) != 0 ? true : z4;
            if ((i3 & 256) != 0) {
                z8 = bigDecimal.scale() != 0;
            } else {
                z8 = z5;
            }
            RoundingMode roundingMode2 = (i3 & 512) != 0 ? RoundingMode.HALF_DOWN : roundingMode;
            Locale cryptoLocale = (i3 & 1024) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale;
            boolean z14 = (i3 & 2048) != 0 ? false : z6;
            if ((i3 & 4096) != 0) {
                z9 = false;
                str2 = str;
                z10 = z;
                bigDecimal2 = bigDecimal;
                companion2 = companion;
            } else {
                z9 = z7;
                companion2 = companion;
                str2 = str;
                z10 = z;
                bigDecimal2 = bigDecimal;
            }
            return companion2.create(str2, z10, bigDecimal2, z11, z12, iScale, iScale2, z13, z8, roundingMode2, cryptoLocale, z14, z9);
        }

        public final CurrencyFormatModel create(String symbol, boolean isFiatCurrency, BigDecimal amount, boolean showCurrencySymbol, boolean isGroupingUsed, int minimumFractionDigits, int maximumFractionDigits, boolean isSpaced, boolean isDecimalSeparatorAlwaysShown, RoundingMode roundingMode, Locale locale, boolean forceCurrencyFormatter, boolean forceHideDecimalSeparator) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new CurrencyFormatModel(SymbolFormatModel.INSTANCE.create(symbol, isFiatCurrency, showCurrencySymbol, isSpaced), showCurrencySymbol, minimumFractionDigits, maximumFractionDigits, 0, isGroupingUsed, isDecimalSeparatorAlwaysShown, roundingMode, locale, forceCurrencyFormatter, false, false, forceHideDecimalSeparator, null, false, false, 60432, null);
        }

        public static /* synthetic */ CurrencyFormatModel fromAmount$default(Companion companion, BigDecimal bigDecimal, boolean z, boolean z2, int i, int i2, boolean z3, RoundingMode roundingMode, Locale locale, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                z = true;
            }
            if ((i3 & 4) != 0) {
                z2 = true;
            }
            if ((i3 & 8) != 0) {
                i = bigDecimal.scale();
            }
            if ((i3 & 16) != 0) {
                i2 = bigDecimal.scale();
            }
            if ((i3 & 32) != 0) {
                z3 = bigDecimal.scale() != 0;
            }
            if ((i3 & 64) != 0) {
                roundingMode = RoundingMode.HALF_DOWN;
            }
            if ((i3 & 128) != 0) {
                locale = CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale();
            }
            return companion.fromAmount(bigDecimal, z, z2, i, i2, z3, roundingMode, locale);
        }

        public final CurrencyFormatModel fromAmount(BigDecimal amount, boolean showCurrencySymbol, boolean isGroupingUsed, int minimumFractionDigits, int maximumFractionDigits, boolean isDecimalSeparatorAlwaysShown, RoundingMode roundingMode, Locale locale) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new CurrencyFormatModel(null, showCurrencySymbol, minimumFractionDigits, maximumFractionDigits, 0, isGroupingUsed, isDecimalSeparatorAlwaysShown, roundingMode, locale, false, false, false, false, null, false, false, 65040, null);
        }

        public static /* synthetic */ CurrencyFormatModel fromCurrencyAmount$default(Companion companion, CurrencyDefinition currencyDefinition, BigDecimal bigDecimal, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, RoundingMode roundingMode, Locale locale, boolean z5, Boolean bool, boolean z6, boolean z7, boolean z8, boolean z9, int i3, Object obj) {
            boolean z10;
            boolean z11;
            Companion companion2;
            CurrencyDefinition currencyDefinition2;
            BigDecimal bigDecimal2;
            boolean z12 = (i3 & 4) != 0 ? true : z;
            boolean z13 = (i3 & 8) != 0 ? true : z2;
            int iScale = (i3 & 16) != 0 ? bigDecimal.scale() : i;
            int decimalScale = (i3 & 32) != 0 ? currencyDefinition.getDecimalScale() : i2;
            boolean z14 = (i3 & 64) != 0 ? true : z3;
            if ((i3 & 128) != 0) {
                z10 = bigDecimal.scale() != 0;
            } else {
                z10 = z4;
            }
            RoundingMode roundingMode2 = (i3 & 256) != 0 ? RoundingMode.HALF_DOWN : roundingMode;
            Locale cryptoLocale = (i3 & 512) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale;
            boolean z15 = (i3 & 1024) != 0 ? false : z5;
            Boolean bool2 = (i3 & 2048) != 0 ? null : bool;
            boolean z16 = (i3 & 4096) != 0 ? false : z6;
            boolean z17 = (i3 & 8192) != 0 ? false : z7;
            boolean z18 = (i3 & 16384) != 0 ? false : z8;
            if ((i3 & 32768) != 0) {
                z11 = false;
                currencyDefinition2 = currencyDefinition;
                bigDecimal2 = bigDecimal;
                companion2 = companion;
            } else {
                z11 = z9;
                companion2 = companion;
                currencyDefinition2 = currencyDefinition;
                bigDecimal2 = bigDecimal;
            }
            return companion2.fromCurrencyAmount(currencyDefinition2, bigDecimal2, z12, z13, iScale, decimalScale, z14, z10, roundingMode2, cryptoLocale, z15, bool2, z16, z17, z18, z11);
        }

        public final CurrencyFormatModel fromCurrencyAmount(CurrencyDefinition currencyDefinition, BigDecimal amount, boolean showCurrencySymbol, boolean isGroupingUsed, int minimumFractionDigits, int maximumFractionDigits, boolean isSpaced, boolean isDecimalSeparatorAlwaysShown, RoundingMode roundingMode, Locale locale, boolean forceCurrencyFormatter, Boolean isSignedAlwaysShown, boolean showPlusSign, boolean showMinusSign, boolean lowPrecision, boolean smallAmountFormatter) {
            Intrinsics.checkNotNullParameter(currencyDefinition, "currencyDefinition");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new CurrencyFormatModel(SymbolFormatModel.Companion.fromCurrency$default(SymbolFormatModel.INSTANCE, currencyDefinition, showCurrencySymbol, isSpaced, null, 8, null), showCurrencySymbol, minimumFractionDigits, maximumFractionDigits, 0, isGroupingUsed, isDecimalSeparatorAlwaysShown, roundingMode, locale, forceCurrencyFormatter, lowPrecision, smallAmountFormatter, false, isSignedAlwaysShown, showPlusSign, showMinusSign, 4112, null);
        }

        public static /* synthetic */ CurrencyFormatModel fromCurrencyForFiatPriceFormat$default(Companion companion, CurrencyDefinition currencyDefinition, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            if ((i2 & 16) != 0) {
                z3 = false;
            }
            return companion.fromCurrencyForFiatPriceFormat(currencyDefinition, i, z, z2, z3);
        }

        public final CurrencyFormatModel fromCurrencyForFiatPriceFormat(CurrencyDefinition currencyDefinition, int minimumFractionDigits, boolean signed, boolean showPlusSign, boolean showMinusSign) {
            Intrinsics.checkNotNullParameter(currencyDefinition, "currencyDefinition");
            return new CurrencyFormatModel(SymbolFormatModel.Companion.fromCurrency$default(SymbolFormatModel.INSTANCE, currencyDefinition, true, true, null, 8, null), true, minimumFractionDigits, currencyDefinition.getDecimalScale(), 0, true, true, null, null, false, false, false, false, Boolean.valueOf(signed), showPlusSign, showMinusSign, 8080, null);
        }
    }

    /* compiled from: CurrencyFormatModel.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÂ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;", "", "symbol", "", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;)V", "getSymbol", "()Ljava/lang/String;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SymbolFormatModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencySymbolPosition currencySymbolPosition;
        private final String symbol;

        public /* synthetic */ SymbolFormatModel(String str, CurrencySymbolPosition currencySymbolPosition, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, currencySymbolPosition);
        }

        private final SymbolFormatModel copy(String symbol, CurrencySymbolPosition currencySymbolPosition) {
            return new SymbolFormatModel(symbol, currencySymbolPosition);
        }

        static /* synthetic */ SymbolFormatModel copy$default(SymbolFormatModel symbolFormatModel, String str, CurrencySymbolPosition currencySymbolPosition, int i, Object obj) {
            if ((i & 1) != 0) {
                str = symbolFormatModel.symbol;
            }
            if ((i & 2) != 0) {
                currencySymbolPosition = symbolFormatModel.currencySymbolPosition;
            }
            return symbolFormatModel.copy(str, currencySymbolPosition);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final CurrencySymbolPosition getCurrencySymbolPosition() {
            return this.currencySymbolPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SymbolFormatModel)) {
                return false;
            }
            SymbolFormatModel symbolFormatModel = (SymbolFormatModel) other;
            return Intrinsics.areEqual(this.symbol, symbolFormatModel.symbol) && this.currencySymbolPosition == symbolFormatModel.currencySymbolPosition;
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.currencySymbolPosition.hashCode();
        }

        public String toString() {
            return "SymbolFormatModel(symbol=" + this.symbol + ", currencySymbolPosition=" + this.currencySymbolPosition + ")";
        }

        private SymbolFormatModel(String str, CurrencySymbolPosition currencySymbolPosition) {
            this.symbol = str;
            this.currencySymbolPosition = currencySymbolPosition;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final CurrencySymbolPosition getCurrencySymbolPosition() {
            return this.currencySymbolPosition;
        }

        /* compiled from: CurrencyFormatModel.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ*\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$SymbolFormatModel;", "symbol", "", "isFiatCurrency", "", "showCurrencySymbol", "isSpaced", "fromCurrency", "currencyDefinition", "Lcom/robinhood/models/crypto/CurrencyDefinition;", "locale", "Ljava/util/Locale;", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SymbolFormatModel create(String symbol, boolean isFiatCurrency, boolean showCurrencySymbol, boolean isSpaced) {
                CurrencySymbolPosition currencySymbolPosition;
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!showCurrencySymbol) {
                    return null;
                }
                if (isFiatCurrency) {
                    currencySymbolPosition = CurrencySymbolPosition.LEFT;
                } else if (isSpaced) {
                    currencySymbolPosition = CurrencySymbolPosition.RIGHT_SPACED;
                } else {
                    currencySymbolPosition = CurrencySymbolPosition.RIGHT;
                }
                return new SymbolFormatModel(symbol, currencySymbolPosition, defaultConstructorMarker);
            }

            public static /* synthetic */ SymbolFormatModel fromCurrency$default(Companion companion, CurrencyDefinition currencyDefinition, boolean z, boolean z2, Locale locale, int i, Object obj) {
                if ((i & 8) != 0) {
                    locale = CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale();
                }
                return companion.fromCurrency(currencyDefinition, z, z2, locale);
            }

            public final SymbolFormatModel fromCurrency(CurrencyDefinition currencyDefinition, boolean showCurrencySymbol, boolean isSpaced, Locale locale) {
                Intrinsics.checkNotNullParameter(currencyDefinition, "currencyDefinition");
                Intrinsics.checkNotNullParameter(locale, "locale");
                return create(currencyDefinition.getCurrencySymbol(locale), currencyDefinition.isFiatCurrency(), showCurrencySymbol, isSpaced);
            }
        }
    }
}
