package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import accio.service.p003v1.LinkedAccountDto;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetAccioAccountResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: GetAccioAccounts.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"getAccioAccounts", "", "Laccio/service/v1/LinkedAccountDto;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "ids", "", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.GetAccioAccountsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class GetAccioAccounts {

    /* compiled from: GetAccioAccounts.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Laccio/service/v1/LinkedAccountDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.GetAccioAccountsKt$getAccioAccounts$2", m3645f = "GetAccioAccounts.kt", m3646l = {31}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.GetAccioAccountsKt$getAccioAccounts$2 */
    static final class C304942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends LinkedAccountDto>>, Object> {
        final /* synthetic */ List<String> $ids;
        final /* synthetic */ BffMoneyMovementService $this_getAccioAccounts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C304942(List<String> list, BffMoneyMovementService bffMoneyMovementService, Continuation<? super C304942> continuation) {
            super(2, continuation);
            this.$ids = list;
            this.$this_getAccioAccounts = bffMoneyMovementService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304942 c304942 = new C304942(this.$ids, this.$this_getAccioAccounts, continuation);
            c304942.L$0 = obj;
            return c304942;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LinkedAccountDto>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<LinkedAccountDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<LinkedAccountDto>> continuation) {
            return ((C304942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<String> list = this.$ids;
                BffMoneyMovementService bffMoneyMovementService = this.$this_getAccioAccounts;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetAccioAccounts2(bffMoneyMovementService, (String) it.next(), null), 3, null));
                }
                this.label = 1;
                obj = Await2.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List listFilterNotNull = CollectionsKt.filterNotNull((Iterable) obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listFilterNotNull.iterator();
            while (it2.hasNext()) {
                LinkedAccountDto account = ((GetAccioAccountResponseDto) it2.next()).getAccount();
                if (account != null) {
                    arrayList2.add(account);
                }
            }
            return arrayList2;
        }
    }

    public static final Object getAccioAccounts(BffMoneyMovementService bffMoneyMovementService, List<String> list, Continuation<? super List<LinkedAccountDto>> continuation) {
        return CoroutineScope2.coroutineScope(new C304942(list, bffMoneyMovementService, null), continuation);
    }
}
