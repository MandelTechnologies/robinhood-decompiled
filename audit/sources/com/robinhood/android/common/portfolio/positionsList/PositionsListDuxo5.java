package com.robinhood.android.common.portfolio.positionsList;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: PositionsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onReorder$1", m3645f = "PositionsListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 192}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onReorder$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PositionsListDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ long $delay;
    final /* synthetic */ PositionInstrumentType $instrumentType;
    final /* synthetic */ List<PositionsV2.PositionListItemV2> $positionItems;
    final /* synthetic */ PositionsLocation $positionsLocation;
    Object L$0;
    int label;
    final /* synthetic */ PositionsListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsListDuxo5(PositionsListDuxo positionsListDuxo, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, List<PositionsV2.PositionListItemV2> list, long j, Continuation<? super PositionsListDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = positionsListDuxo;
        this.$accountNumber = str;
        this.$instrumentType = positionInstrumentType;
        this.$positionsLocation = positionsLocation;
        this.$positionItems = list;
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsListDuxo5(this.this$0, this.$accountNumber, this.$instrumentType, this.$positionsLocation, this.$positionItems, this.$delay, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsListDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r13.refreshPositions(r4, r5, r6, r12) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Job job;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        Job job2 = null;
        try {
        } catch (Exception e) {
            th = e;
            job2 = r1;
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                PositionsV2Store positionsV2Store = this.this$0.positionsV2Store;
                String str = this.$accountNumber;
                PositionInstrumentType positionInstrumentType = this.$instrumentType;
                PositionsLocation positionsLocation = this.$positionsLocation;
                List<PositionsV2.PositionListItemV2> list = this.$positionItems;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PositionsV2.PositionListItemV2) it.next()).getInstrumentId());
                }
                Job jobM22791reorderPositions9VgGkz4 = positionsV2Store.m22791reorderPositions9VgGkz4(str, positionInstrumentType, positionsLocation, arrayList, this.$delay);
                try {
                    this.L$0 = jobM22791reorderPositions9VgGkz4;
                    this.label = 1;
                    if (jobM22791reorderPositions9VgGkz4.join(this) != coroutine_suspended) {
                        job = jobM22791reorderPositions9VgGkz4;
                    }
                    return coroutine_suspended;
                } catch (Exception e2) {
                    e = e2;
                    job2 = jobM22791reorderPositions9VgGkz4;
                    th = e;
                    if ((th instanceof CancellationException) && job2 != null) {
                        job2.cancel((CancellationException) th);
                    }
                    return Unit.INSTANCE;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job3 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = job3;
                this.this$0.applyMutation(new C115792(this.$positionItems, null));
                return Unit.INSTANCE;
            }
            Job job4 = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            job = job4;
        }
        PositionsV2Store positionsV2Store2 = this.this$0.positionsV2Store;
        String str2 = this.$accountNumber;
        PositionInstrumentType positionInstrumentType2 = this.$instrumentType;
        PositionsLocation positionsLocation2 = this.$positionsLocation;
        this.L$0 = job;
        this.label = 2;
        r1 = job;
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onReorder$1$2", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onReorder$1$2 */
    static final class C115792 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
        final /* synthetic */ List<PositionsV2.PositionListItemV2> $positionItems;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115792(List<PositionsV2.PositionListItemV2> list, Continuation<? super C115792> continuation) {
            super(2, continuation);
            this.$positionItems = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115792 c115792 = new C115792(this.$positionItems, continuation);
            c115792.L$0 = obj;
            return c115792;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
            return ((C115792) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, null, null, extensions2.toImmutableList(this.$positionItems), false, false, false, false, false, 4031, null);
        }
    }
}
