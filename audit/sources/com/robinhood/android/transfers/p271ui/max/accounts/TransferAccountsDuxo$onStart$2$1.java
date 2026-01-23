package com.robinhood.android.transfers.p271ui.max.accounts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$2$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class TransferAccountsDuxo$onStart$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TransferAccount> $accounts;
    final /* synthetic */ MatchaTreatment $matchaTreatment;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TransferAccountsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountsDuxo$onStart$2$1(List<TransferAccount> list, TransferAccountsDuxo transferAccountsDuxo, MatchaTreatment matchaTreatment, Continuation<? super TransferAccountsDuxo$onStart$2$1> continuation) {
        super(2, continuation);
        this.$accounts = list;
        this.this$0 = transferAccountsDuxo;
        this.$matchaTreatment = matchaTreatment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferAccountsDuxo$onStart$2$1 transferAccountsDuxo$onStart$2$1 = new TransferAccountsDuxo$onStart$2$1(this.$accounts, this.this$0, this.$matchaTreatment, continuation);
        transferAccountsDuxo$onStart$2$1.L$0 = obj;
        return transferAccountsDuxo$onStart$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransferAccountsDuxo$onStart$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:18:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<TransferAccount> list = this.$accounts;
            Intrinsics.checkNotNull(list);
            List<TransferAccount> list2 = list;
            TransferAccountsDuxo transferAccountsDuxo = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1((TransferAccount) it2.next(), transferAccountsDuxo, null), 3, null));
            }
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            collection = (Collection) this.L$0;
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) obj;
            if (tuples2 != null) {
                collection.add(tuples2);
            }
            if (it.hasNext()) {
                Deferred deferred = (Deferred) it.next();
                this.L$0 = collection;
                this.L$1 = it;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Tuples2 tuples22 = (Tuples2) obj;
                if (tuples22 != null) {
                }
                if (it.hasNext()) {
                    List<Tuples2> list3 = (List) collection;
                    TransferAccountsDuxo transferAccountsDuxo2 = this.this$0;
                    MatchaTreatment matchaTreatment = this.$matchaTreatment;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (Tuples2 tuples23 : list3) {
                        TransferAccount transferAccount = (TransferAccount) tuples23.component1();
                        arrayList3.add(new TransferAccountsViewState.AccountTransferDisplayData(transferAccount, MatchaServiceFeeDisplayMapper.INSTANCE.getDisplayText(transferAccount, (ApiServiceFeeParams) tuples23.component2(), transferAccountsDuxo2.selecting, matchaTreatment)));
                    }
                    this.this$0.applyMutation(new C307211(arrayList3, null));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$2$1$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$2$1$1 */
    static final class C307211 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
        final /* synthetic */ List<TransferAccountsViewState.AccountTransferDisplayData> $accountDisplay;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307211(List<TransferAccountsViewState.AccountTransferDisplayData> list, Continuation<? super C307211> continuation) {
            super(2, continuation);
            this.$accountDisplay = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307211 c307211 = new C307211(this.$accountDisplay, continuation);
            c307211.L$0 = obj;
            return c307211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
            return ((C307211) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, null, false, null, this.$accountDisplay, null, false, false, null, null, false, false, null, false, false, false, false, null, null, 2097087, null);
        }
    }
}
