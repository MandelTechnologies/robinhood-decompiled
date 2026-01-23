package com.robinhood.utils.p408rx.transformer;

import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CharSequenceToBigDecimalTransformer.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/rx/transformer/CharSequenceToBigDecimalTransformer;", "Lio/reactivex/ObservableTransformer;", "", "Lcom/robinhood/utils/Optional;", "Ljava/math/BigDecimal;", "<init>", "()V", "apply", "Lio/reactivex/ObservableSource;", "upstream", "Lio/reactivex/Observable;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CharSequenceToBigDecimalTransformer implements ObservableTransformer<CharSequence, Optional<? extends BigDecimal>> {
    public static final CharSequenceToBigDecimalTransformer INSTANCE = new CharSequenceToBigDecimalTransformer();

    private CharSequenceToBigDecimalTransformer() {
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource<Optional<? extends BigDecimal>> apply(Observable<CharSequence> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        ObservableSource map = upstream.map(new Function() { // from class: com.robinhood.utils.rx.transformer.CharSequenceToBigDecimalTransformer.apply.1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(CharSequence charSequence) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                return Optional3.asOptional(BigDecimals7.toBigDecimalOrNull(charSequence));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
