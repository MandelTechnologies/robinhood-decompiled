package com.robinhood.android.event.gamedetail;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "eventContractIds", "", "positionContractIds"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2 extends ContinuationImpl7 implements Function3<List<? extends UUID>, Set<? extends UUID>, Continuation<? super Set<? extends UUID>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2(Continuation<? super GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Set<? extends UUID> set, Continuation<? super Set<? extends UUID>> continuation) {
        return invoke2((List<UUID>) list, (Set<UUID>) set, (Continuation<? super Set<UUID>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Set<UUID> set, Continuation<? super Set<UUID>> continuation) {
        GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2 gameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2 = new GameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2(continuation);
        gameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2.L$0 = list;
        gameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2.L$1 = set;
        return gameDetailDuxo$onCreate$1$allContractIdsForGameFlow$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CollectionsKt.toSet(CollectionsKt.plus((Collection) this.L$0, (Iterable) this.L$1));
    }
}
