package com.robinhood.librobinhood.data.store;

import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.api.bonfire.ApiWithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "<destruct>", "Lkotlin/Pair;", "", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$withholdingAmountEndpoint$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {108}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$withholdingAmountEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderBackupWithholdingStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends List<? extends UUID>>, Continuation<? super WithholdingAmount>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderBackupWithholdingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderBackupWithholdingStore6(TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super TraderBackupWithholdingStore6> continuation) {
        super(2, continuation);
        this.this$0 = traderBackupWithholdingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderBackupWithholdingStore6 traderBackupWithholdingStore6 = new TraderBackupWithholdingStore6(this.this$0, continuation);
        traderBackupWithholdingStore6.L$0 = obj;
        return traderBackupWithholdingStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends List<? extends UUID>> tuples2, Continuation<? super WithholdingAmount> continuation) {
        return invoke2((Tuples2<String, ? extends List<UUID>>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ? extends List<UUID>> tuples2, Continuation<? super WithholdingAmount> continuation) {
        return ((TraderBackupWithholdingStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str = (String) tuples2.component1();
            List list = (List) tuples2.component2();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String string2 = ((UUID) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    if (!StringsKt.isBlank(string2)) {
                        BackupWithholdingApi backupWithholdingApi = this.this$0.bonfireApi;
                        CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(list);
                        this.label = 1;
                        obj = backupWithholdingApi.getTaxWithholdingAmount(commaSeparatedList, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return new WithholdingAmount(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), null, null, 4, null);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WithholdingAmount2.toDbModel((ApiWithholdingAmount) obj);
    }
}
