package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.models.api.bonfire.ApiWithholdingStatus;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.WithholdingStatus2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$backupWithholdingStatusEndpoint$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {69, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$backupWithholdingStatusEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderBackupWithholdingStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends UUID>, Continuation<? super Optional<? extends WithholdingStatus>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderBackupWithholdingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderBackupWithholdingStore2(TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super TraderBackupWithholdingStore2> continuation) {
        super(2, continuation);
        this.this$0 = traderBackupWithholdingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderBackupWithholdingStore2 traderBackupWithholdingStore2 = new TraderBackupWithholdingStore2(this.this$0, continuation);
        traderBackupWithholdingStore2.L$0 = obj;
        return traderBackupWithholdingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends UUID> tuples2, Continuation<? super Optional<? extends WithholdingStatus>> continuation) {
        return invoke2((Tuples2<String, UUID>) tuples2, (Continuation<? super Optional<WithholdingStatus>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, UUID> tuples2, Continuation<? super Optional<WithholdingStatus>> continuation) {
        return ((TraderBackupWithholdingStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                return Optional3.asOptional(WithholdingStatus2.toDbModel((ApiWithholdingStatus) obj, str2));
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            return Optional3.asOptional(WithholdingStatus2.toDbModel((ApiWithholdingStatus) obj, str));
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str3 = (String) tuples2.component1();
        UUID uuid = (UUID) tuples2.component2();
        if (uuid != null) {
            BackupWithholdingApi backupWithholdingApi = this.this$0.bonfireApi;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.L$0 = str3;
            this.label = 1;
            obj = backupWithholdingApi.getTaxWithholdingStatusV2(string2, this);
            if (obj != coroutine_suspended) {
                str2 = str3;
                return Optional3.asOptional(WithholdingStatus2.toDbModel((ApiWithholdingStatus) obj, str2));
            }
        } else {
            BackupWithholdingApi backupWithholdingApi2 = this.this$0.bonfireApi;
            this.L$0 = str3;
            this.label = 2;
            obj = backupWithholdingApi2.getTaxWithholdingStatus(null, this);
            if (obj != coroutine_suspended) {
                str = str3;
                return Optional3.asOptional(WithholdingStatus2.toDbModel((ApiWithholdingStatus) obj, str));
            }
        }
        return coroutine_suspended;
    }
}
