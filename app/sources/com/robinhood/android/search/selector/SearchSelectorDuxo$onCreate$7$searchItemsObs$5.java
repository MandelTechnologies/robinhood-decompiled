package com.robinhood.android.search.selector;

import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: SearchSelectorDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class SearchSelectorDuxo$onCreate$7$searchItemsObs$5<T, R> implements Function {
    final /* synthetic */ Sequence<Instrument> $equityInstruments;

    SearchSelectorDuxo$onCreate$7$searchItemsObs$5(Sequence<Instrument> sequence) {
        this.$equityInstruments = sequence;
    }

    @Override // io.reactivex.functions.Function
    public final List<SearchSelectorViewState3.SecurityRow.CompanyFinancialsResultItem> apply(final Set<String> supportedIds) {
        Intrinsics.checkNotNullParameter(supportedIds, "supportedIds");
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(this.$equityInstruments, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$searchItemsObs$5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SearchSelectorDuxo$onCreate$7$searchItemsObs$5.apply$lambda$0(supportedIds, (Instrument) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$searchItemsObs$5$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorDuxo$onCreate$7$searchItemsObs$5.apply$lambda$1((Instrument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apply$lambda$0(Set set, Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.getId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchSelectorViewState3.SecurityRow.CompanyFinancialsResultItem apply$lambda$1(Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SearchSelectorViewState3.SecurityRow.CompanyFinancialsResultItem(it);
    }
}
