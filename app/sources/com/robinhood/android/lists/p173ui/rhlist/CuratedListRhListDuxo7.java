package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState2;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$sortList$curatedListObs$2, reason: use source file name */
/* loaded from: classes8.dex */
final class CuratedListRhListDuxo7<T> implements Consumer {
    final /* synthetic */ CuratedListRhListDuxo this$0;

    CuratedListRhListDuxo7(CuratedListRhListDuxo curatedListRhListDuxo) {
        this.this$0 = curatedListRhListDuxo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState accept$lambda$0(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, CuratedListRhListViewState2.Loading.INSTANCE, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048573, null);
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Disposable disposable) {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$sortList$curatedListObs$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo7.accept$lambda$0((CuratedListRhListViewState) obj);
            }
        });
    }
}
