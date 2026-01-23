package com.robinhood.android.common.options.order;

import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionUnderlier;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: OptionOrderContextFactory.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final class OptionOrderContextFactory$create$equityInstrumentsObs$1<T, R> implements Function {
    final /* synthetic */ OptionOrderContextFactory this$0;

    OptionOrderContextFactory$create$equityInstrumentsObs$1(OptionOrderContextFactory optionOrderContextFactory) {
        this.this$0 = optionOrderContextFactory;
    }

    @Override // io.reactivex.functions.Function
    public final ObservableSource<? extends Map<UUID, Instrument>> apply(List<OptionOrderContext.LegContext> legContexts) {
        Intrinsics.checkNotNullParameter(legContexts, "legContexts");
        Sequence sequenceAsSequence = CollectionsKt.asSequence(legContexts);
        final OptionOrderContextFactory optionOrderContextFactory = this.this$0;
        return Observable.combineLatest(SequencesKt.asIterable(SequencesKt.map(sequenceAsSequence, new Function1() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$equityInstrumentsObs$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderContextFactory$create$equityInstrumentsObs$1.apply$lambda$1(optionOrderContextFactory, (OptionOrderContext.LegContext) obj);
            }
        })), new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$equityInstrumentsObs$1.2
            @Override // io.reactivex.functions.Function
            public final Map<UUID, Instrument> apply(Object[] instruments) {
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Sequence sequenceAsSequence2 = ArraysKt.asSequence(instruments);
                Intrinsics.checkNotNull(sequenceAsSequence2, "null cannot be cast to non-null type kotlin.sequences.Sequence<kotlin.collections.List<com.robinhood.models.db.Instrument>>");
                Sequence sequenceFlattenSequenceOfIterable = SequencesKt.flattenSequenceOfIterable(sequenceAsSequence2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (T t : sequenceFlattenSequenceOfIterable) {
                    linkedHashMap.put(((Instrument) t).getId(), t);
                }
                return linkedHashMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable apply$lambda$1(OptionOrderContextFactory optionOrderContextFactory, OptionOrderContext.LegContext legContext) {
        Intrinsics.checkNotNullParameter(legContext, "legContext");
        return optionOrderContextFactory.equityInstrumentStore.getInstruments(legContext.getRequestContext().getOptionInstrument().getOptionUnderliers(), new Function1() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$equityInstrumentsObs$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderContextFactory$create$equityInstrumentsObs$1.apply$lambda$1$lambda$0((OptionUnderlier) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID apply$lambda$1$lambda$0(OptionUnderlier it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstrumentId();
    }
}
