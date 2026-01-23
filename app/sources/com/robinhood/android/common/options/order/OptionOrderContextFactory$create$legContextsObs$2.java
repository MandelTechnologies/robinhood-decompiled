package com.robinhood.android.common.options.order;

import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.models.p355ui.OptionLegBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionOrderContextFactory.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final class OptionOrderContextFactory$create$legContextsObs$2<T, R> implements Function {
    final /* synthetic */ ImmutableList<OptionLegBundle> $legBundles;
    final /* synthetic */ OptionOrderContextFactory this$0;

    OptionOrderContextFactory$create$legContextsObs$2(ImmutableList<OptionLegBundle> immutableList, OptionOrderContextFactory optionOrderContextFactory) {
        this.$legBundles = immutableList;
        this.this$0 = optionOrderContextFactory;
    }

    @Override // io.reactivex.functions.Function
    public final ObservableSource<? extends List<OptionOrderContext.LegContext>> apply(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Sequence sequenceAsSequence = CollectionsKt.asSequence(this.$legBundles);
        final OptionOrderContextFactory optionOrderContextFactory = this.this$0;
        return Observable.combineLatest(SequencesKt.asIterable(SequencesKt.map(sequenceAsSequence, new Function1() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$legContextsObs$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderContextFactory$create$legContextsObs$2.apply$lambda$0(optionOrderContextFactory, accountNumber, (OptionLegBundle) obj);
            }
        })), new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$legContextsObs$2.2
            @Override // io.reactivex.functions.Function
            public final List<OptionOrderContext.LegContext> apply(Object[] legs) {
                Intrinsics.checkNotNullParameter(legs, "legs");
                List<OptionOrderContext.LegContext> listAsList = ArraysKt.asList(legs);
                Intrinsics.checkNotNull(listAsList, "null cannot be cast to non-null type kotlin.collections.List<com.robinhood.android.common.options.order.OptionOrderContext.LegContext>");
                return listAsList;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable apply$lambda$0(OptionOrderContextFactory optionOrderContextFactory, String str, OptionLegBundle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(str);
        return optionOrderContextFactory.createForLeg(str, it);
    }
}
