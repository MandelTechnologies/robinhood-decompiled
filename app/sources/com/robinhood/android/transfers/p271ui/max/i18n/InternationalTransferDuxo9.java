package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m3636d2 = {"toInitialState", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "Lcom/robinhood/models/db/TransferDirection;", "defaultUkExternalTransferAccountId", "", "amount", "Ljava/math/BigDecimal;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxoKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferDuxo9 {

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InternationalTransferDataState toInitialState$default(TransferDirection transferDirection, String str, BigDecimal bigDecimal, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal = null;
        }
        return toInitialState(transferDirection, str, bigDecimal, entryPoint);
    }

    public static final InternationalTransferDataState toInitialState(TransferDirection transferDirection, String str, BigDecimal bigDecimal, MAXTransferContext.EntryPoint entryPoint) {
        Currency currency;
        char c;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(transferDirection, "<this>");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        BigDecimal bigDecimalCleanAmount = InternationalTransferCurrencyUtils.cleanAmount(bigDecimal);
        if (bigDecimalCleanAmount != null) {
            if (bigDecimalCleanAmount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
            tuples2M3642to = Tuples4.m3642to(new Money(Currencies.USD, bigDecimalCleanAmount), "$" + decimalFormat.format(bigDecimalCleanAmount));
        } else {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[transferDirection.ordinal()];
            if (i == 1) {
                currency = Currencies.GBP;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                currency = Currencies.USD;
            }
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal2);
            Money money = new Money(currency, bigDecimal2);
            int i2 = iArr[transferDirection.ordinal()];
            if (i2 == 1) {
                c = 163;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c = TickerInputView.CURRENCY_SYMBOL;
            }
            tuples2M3642to = Tuples4.m3642to(money, new String(new char[]{c, '0'}));
        }
        return new InternationalTransferDataState(null, (Money) tuples2M3642to.component1(), null, null, (String) tuples2M3642to.component2(), false, TransferMode.EDIT, true, null, false, null, false, null, null, null, str, null, transferDirection, null, null, entryPoint, null, null, 7174413, null);
    }
}
