package com.robinhood.android.equities.eventupdates;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.paging.compose.LazyPagingItems;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: EquityEventUpdatesScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1", m3645f = "EquityEventUpdatesScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $cutoffIndex$delegate;
    final /* synthetic */ SnapshotIntState2 $lastCheckedCount$delegate;
    final /* synthetic */ LazyPagingItems<EquityEventUpdateDto> $pagingItems;
    final /* synthetic */ Instant $recentCutoff;
    final /* synthetic */ SnapshotState<Boolean> $showRecentHeader$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1(LazyPagingItems<EquityEventUpdateDto> lazyPagingItems, Instant instant, SnapshotState<Boolean> snapshotState, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, Continuation<? super EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1> continuation) {
        super(2, continuation);
        this.$pagingItems = lazyPagingItems;
        this.$recentCutoff = instant;
        this.$showRecentHeader$delegate = snapshotState;
        this.$cutoffIndex$delegate = snapshotIntState2;
        this.$lastCheckedCount$delegate = snapshotIntState22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1(this.$pagingItems, this.$recentCutoff, this.$showRecentHeader$delegate, this.$cutoffIndex$delegate, this.$lastCheckedCount$delegate, continuation);
        equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1.L$0 = obj;
        return equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String created_at;
        Instant instantM28550constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$5(this.$showRecentHeader$delegate) && EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(this.$cutoffIndex$delegate) == -1 && this.$pagingItems.getItemCount() > this.$lastCheckedCount$delegate.getIntValue()) {
                LazyPagingItems<EquityEventUpdateDto> lazyPagingItems = this.$pagingItems;
                EquityEventUpdateDto equityEventUpdateDtoPeek = lazyPagingItems.peek(lazyPagingItems.getItemCount() - 1);
                if (equityEventUpdateDtoPeek != null && (created_at = equityEventUpdateDtoPeek.getCreated_at()) != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        instantM28550constructorimpl = Result.m28550constructorimpl(Instant.parse(created_at));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        instantM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    instant = Result.m28555isFailureimpl(instantM28550constructorimpl) ? null : instantM28550constructorimpl;
                }
                if (instant != null && instant.isAfter(this.$recentCutoff)) {
                    EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$6(this.$showRecentHeader$delegate, false);
                } else {
                    SnapshotIntState2 snapshotIntState2 = this.$cutoffIndex$delegate;
                    LazyPagingItems<EquityEventUpdateDto> lazyPagingItems2 = this.$pagingItems;
                    Instant instant = this.$recentCutoff;
                    Intrinsics.checkNotNull(instant);
                    snapshotIntState2.setIntValue(EquityEventUpdatesScreenKt.binarySearchCutoff(lazyPagingItems2, instant, this.$lastCheckedCount$delegate.getIntValue()));
                }
                this.$lastCheckedCount$delegate.setIntValue(this.$pagingItems.getItemCount());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
