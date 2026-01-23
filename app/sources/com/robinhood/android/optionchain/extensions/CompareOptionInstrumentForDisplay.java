package com.robinhood.android.optionchain.extensions;

import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.utils.datetime.LocalDates;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: CompareOptionInstrumentForDisplay.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, m3636d2 = {"compareOptionInstrumentForDisplay", "", "optionInstrument1", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument2", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionchain.extensions.CompareOptionInstrumentForDisplayKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CompareOptionInstrumentForDisplay {

    /* compiled from: CompareOptionInstrumentForDisplay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionchain.extensions.CompareOptionInstrumentForDisplayKt$WhenMappings */
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

    public static final int compareOptionInstrumentForDisplay(OptionInstrument optionInstrument1, OptionInstrument optionInstrument2) {
        Intrinsics.checkNotNullParameter(optionInstrument1, "optionInstrument1");
        Intrinsics.checkNotNullParameter(optionInstrument2, "optionInstrument2");
        OptionContractType contractType = optionInstrument1.getContractType();
        if (contractType != optionInstrument2.getContractType()) {
            int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i == 1) {
                return -1;
            }
            if (i == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal strikePrice = optionInstrument1.getStrikePrice();
        BigDecimal strikePrice2 = optionInstrument2.getStrikePrice();
        if (!Intrinsics.areEqual(strikePrice, strikePrice2)) {
            return strikePrice2.compareTo(strikePrice) > 0 ? 1 : -1;
        }
        LocalDate localDateCurrentDateInEst$default = LocalDates.currentDateInEst$default(null, 1, null);
        LocalDate expirationDate = optionInstrument1.getExpirationDate();
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        return Intrinsics.compare(localDateCurrentDateInEst$default.until(expirationDate, chronoUnit), localDateCurrentDateInEst$default.until(optionInstrument2.getExpirationDate(), chronoUnit));
    }
}
