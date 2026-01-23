package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CuratedListRhListDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$curatedListCurrencyPairIdsObs$1, reason: use source file name */
/* loaded from: classes8.dex */
final class CuratedListRhListDuxo3<T, R> implements Function {
    public static final CuratedListRhListDuxo3<T, R> INSTANCE = new CuratedListRhListDuxo3<>();

    CuratedListRhListDuxo3() {
    }

    @Override // io.reactivex.functions.Function
    public final List<UUID> apply(List<? extends CuratedListEligible> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(list), new Function1<Object, Boolean>() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$curatedListCurrencyPairIdsObs$1$apply$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof CryptoCuratedListEligible);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return SequencesKt.toList(SequencesKt.map(sequenceFilter, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$curatedListCurrencyPairIdsObs$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo3.apply$lambda$0((CryptoCuratedListEligible) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID apply$lambda$0(CryptoCuratedListEligible it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCuratedListItem().getId();
    }
}
