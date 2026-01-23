package com.robinhood.android.equities.eventupdates;

import androidx.compose.foundation.lazy.LazyListState;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: EquityEventUpdatesScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1", m3645f = "EquityEventUpdatesScreen.kt", m3646l = {86}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ LazyPagingItems<EquityEventUpdateDto> $pagingItems;
    final /* synthetic */ Instant $recentCutoff;
    final /* synthetic */ SnapshotState<Boolean> $showRecentHeader$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1(LazyPagingItems<EquityEventUpdateDto> lazyPagingItems, Instant instant, LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1> continuation) {
        super(2, continuation);
        this.$pagingItems = lazyPagingItems;
        this.$recentCutoff = instant;
        this.$listState = lazyListState;
        this.$showRecentHeader$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1 equityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1(this.$pagingItems, this.$recentCutoff, this.$listState, this.$showRecentHeader$delegate, continuation);
        equityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1.L$0 = obj;
        return equityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String created_at;
        Instant instantM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$pagingItems.getItemCount() > 0) {
                EquityEventUpdateDto equityEventUpdateDtoPeek = this.$pagingItems.peek(0);
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
                    EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$6(this.$showRecentHeader$delegate, true);
                    LazyListState lazyListState = this.$listState;
                    this.label = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
