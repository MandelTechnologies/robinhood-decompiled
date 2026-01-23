package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TableCell.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$1$1", m3645f = "TableCell.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class TableCell4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onHighlightAnimationPlayed;
    final /* synthetic */ SnapshotState<Boolean> $playBackgroundAnimation$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $showHighlight;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TableCell4(boolean z, CoroutineScope coroutineScope, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Continuation<? super TableCell4> continuation) {
        super(2, continuation);
        this.$showHighlight = z;
        this.$scope = coroutineScope;
        this.$onHighlightAnimationPlayed = function0;
        this.$playBackgroundAnimation$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TableCell4(this.$showHighlight, this.$scope, this.$onHighlightAnimationPlayed, this.$playBackgroundAnimation$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TableCell4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$showHighlight) {
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C246271(this.$onHighlightAnimationPlayed, this.$playBackgroundAnimation$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TableCell.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$1$1$1", m3645f = "TableCell.kt", m3646l = {167}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$1$1$1 */
    static final class C246271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onHighlightAnimationPlayed;
        final /* synthetic */ SnapshotState<Boolean> $playBackgroundAnimation$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246271(Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Continuation<? super C246271> continuation) {
            super(2, continuation);
            this.$onHighlightAnimationPlayed = function0;
            this.$playBackgroundAnimation$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C246271(this.$onHighlightAnimationPlayed, this.$playBackgroundAnimation$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C246271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TableCell3.TableBidAskCell$lambda$6(this.$playBackgroundAnimation$delegate, true);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TableCell3.TableBidAskCell$lambda$6(this.$playBackgroundAnimation$delegate, false);
            Function0<Unit> function0 = this.$onHighlightAnimationPlayed;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
