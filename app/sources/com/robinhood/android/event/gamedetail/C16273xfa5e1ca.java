package com.robinhood.android.event.gamedetail;

import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "sixBoxContractIds", "playerPropsContractIds", "prepacksContractIds"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$contractGroupIdsForAmericanOddsFlow$1$4", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$contractGroupIdsForAmericanOddsFlow$1$4 */
/* loaded from: classes3.dex */
final class C16273xfa5e1ca extends ContinuationImpl7 implements Function4<Set<? extends UUID>, Set<? extends UUID>, Set<? extends UUID>, Continuation<? super Set<? extends UUID>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    C16273xfa5e1ca(Continuation<? super C16273xfa5e1ca> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends UUID> set, Set<? extends UUID> set2, Set<? extends UUID> set3, Continuation<? super Set<? extends UUID>> continuation) {
        return invoke2((Set<UUID>) set, (Set<UUID>) set2, (Set<UUID>) set3, (Continuation<? super Set<UUID>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<UUID> set, Set<UUID> set2, Set<UUID> set3, Continuation<? super Set<UUID>> continuation) {
        C16273xfa5e1ca c16273xfa5e1ca = new C16273xfa5e1ca(continuation);
        c16273xfa5e1ca.L$0 = set;
        c16273xfa5e1ca.L$1 = set2;
        c16273xfa5e1ca.L$2 = set3;
        return c16273xfa5e1ca.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Set set = (Set) this.L$0;
        Set set2 = (Set) this.L$1;
        return SetsKt.plus(SetsKt.plus(set, (Iterable) set2), (Iterable) this.L$2);
    }
}
