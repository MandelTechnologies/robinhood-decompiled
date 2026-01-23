package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CharSequenceToPriceTransformer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/CharSequenceToPriceTransformer;", "Lio/reactivex/ObservableTransformer;", "", "Lcom/robinhood/utils/Optional;", "Ljava/math/BigDecimal;", "<init>", "()V", "numberFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "apply", "Lio/reactivex/ObservableSource;", "upstream", "Lio/reactivex/Observable;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CharSequenceToPriceTransformer implements ObservableTransformer<CharSequence, Optional<? extends BigDecimal>> {
    public static final CharSequenceToPriceTransformer INSTANCE = new CharSequenceToPriceTransformer();
    private static final NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
    public static final int $stable = 8;

    private CharSequenceToPriceTransformer() {
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource<Optional<? extends BigDecimal>> apply(Observable<CharSequence> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        ObservableSource map = upstream.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.CharSequenceToPriceTransformer.apply.1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(CharSequence charSequence) {
                Object objM28550constructorimpl;
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                CharSequenceToPriceTransformer charSequenceToPriceTransformer = CharSequenceToPriceTransformer.INSTANCE;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    NumberFormat numberFormat2 = CharSequenceToPriceTransformer.numberFormat;
                    String string2 = charSequence.toString();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < string2.length(); i++) {
                        char cCharAt = string2.charAt(i);
                        if (cCharAt != '$') {
                            sb.append(cCharAt);
                        }
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(numberFormat2.parse(sb.toString()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    objM28550constructorimpl = null;
                }
                Number number = (Number) objM28550constructorimpl;
                return Optional3.asOptional(number != null ? BigDecimals7.toBigDecimal(number) : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
