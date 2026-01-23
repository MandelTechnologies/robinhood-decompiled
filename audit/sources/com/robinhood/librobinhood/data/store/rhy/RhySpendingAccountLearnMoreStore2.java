package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiRhySpendingAccountLearnMore;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhySpendingAccountLearnMoreStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhySpendingAccountLearnMoreStore$endpoint$1", m3645f = "RhySpendingAccountLearnMoreStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhySpendingAccountLearnMoreStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhySpendingAccountLearnMoreStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends Boolean>, Continuation<? super RhySpendingAccountLearnMore>, Object> {
    final /* synthetic */ RhyBonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhySpendingAccountLearnMoreStore2(RhyBonfireApi rhyBonfireApi, Continuation<? super RhySpendingAccountLearnMoreStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = rhyBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhySpendingAccountLearnMoreStore2 rhySpendingAccountLearnMoreStore2 = new RhySpendingAccountLearnMoreStore2(this.$bonfireApi, continuation);
        rhySpendingAccountLearnMoreStore2.L$0 = obj;
        return rhySpendingAccountLearnMoreStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends Boolean> tuples2, Continuation<? super RhySpendingAccountLearnMore> continuation) {
        return invoke2((Tuples2<UUID, Boolean>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, Boolean> tuples2, Continuation<? super RhySpendingAccountLearnMore> continuation) {
        return ((RhySpendingAccountLearnMoreStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid2 = (UUID) tuples2.component1();
            boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
            RhyBonfireApi rhyBonfireApi = this.$bonfireApi;
            this.L$0 = uuid2;
            this.label = 1;
            obj = rhyBonfireApi.getRhySpendingAccountLearnMore(zBooleanValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuid2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return RhySpendingAccountLearnMore2.toDbModel((ApiRhySpendingAccountLearnMore) obj, uuid);
    }
}
