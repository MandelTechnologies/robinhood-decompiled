package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.models.p320db.CuratedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/CuratedList;", "optionsSupported", "", "curatedLists"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$curatedListFlow$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$curatedListFlow$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListDuxo3 extends ContinuationImpl7 implements Function3<Boolean, List<? extends CuratedList>, Continuation<? super List<? extends CuratedList>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    CuratedListDuxo3(Continuation<? super CuratedListDuxo3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, List<? extends CuratedList> list, Continuation<? super List<? extends CuratedList>> continuation) {
        return invoke(bool.booleanValue(), (List<CuratedList>) list, (Continuation<? super List<CuratedList>>) continuation);
    }

    public final Object invoke(boolean z, List<CuratedList> list, Continuation<? super List<CuratedList>> continuation) {
        CuratedListDuxo3 curatedListDuxo3 = new CuratedListDuxo3(continuation);
        curatedListDuxo3.Z$0 = z;
        curatedListDuxo3.L$0 = list;
        return curatedListDuxo3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.Z$0;
        List list = (List) this.L$0;
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((CuratedList) obj2).isOptionsWatchlist()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
