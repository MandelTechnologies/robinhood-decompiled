package com.robinhood.android.feature.livetrivia.composable;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$4$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SpinningCoinGridComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $columns;
    final /* synthetic */ SnapshotState<Boolean> $isDragging;
    final /* synthetic */ int $rows;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<SpinningCoinGridComposable> $spinDirection;
    final /* synthetic */ SnapshotState<Tuples2<Integer, Integer>> $touchedCircle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpinningCoinGridComposable6(CoroutineScope coroutineScope, int i, int i2, SnapshotState<Boolean> snapshotState, SnapshotState<SpinningCoinGridComposable> snapshotState2, SnapshotState<Tuples2<Integer, Integer>> snapshotState3, Continuation<? super SpinningCoinGridComposable6> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$columns = i;
        this.$rows = i2;
        this.$isDragging = snapshotState;
        this.$spinDirection = snapshotState2;
        this.$touchedCircle = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpinningCoinGridComposable6(this.$scope, this.$columns, this.$rows, this.$isDragging, this.$spinDirection, this.$touchedCircle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpinningCoinGridComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SpinningCoinGridComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$4$1$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$4$1$1 */
    static final class C167711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $columns;
        final /* synthetic */ SnapshotState<Boolean> $isDragging;
        final /* synthetic */ int $rows;
        final /* synthetic */ SnapshotState<SpinningCoinGridComposable> $spinDirection;
        final /* synthetic */ SnapshotState<Tuples2<Integer, Integer>> $touchedCircle;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167711(int i, int i2, SnapshotState<Boolean> snapshotState, SnapshotState<SpinningCoinGridComposable> snapshotState2, SnapshotState<Tuples2<Integer, Integer>> snapshotState3, Continuation<? super C167711> continuation) {
            super(2, continuation);
            this.$columns = i;
            this.$rows = i2;
            this.$isDragging = snapshotState;
            this.$spinDirection = snapshotState2;
            this.$touchedCircle = snapshotState3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167711(this.$columns, this.$rows, this.$isDragging, this.$spinDirection, this.$touchedCircle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r13) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(100, r13) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:12:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:19:0x007a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b9 -> B:27:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            int i3;
            int i4;
            SnapshotState<SpinningCoinGridComposable> snapshotState;
            SnapshotState<Tuples2<Integer, Integer>> snapshotState2;
            int i5;
            int i6;
            SpinningCoinGridComposable spinningCoinGridComposable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                i = (this.$columns * this.$rows) / 3;
                i2 = i;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 1;
            } else if (i7 == 1) {
                i2 = this.I$0;
                ResultKt.throwOnFailure(obj);
                if (!this.$isDragging.getValue().booleanValue()) {
                    int iNextInt = Random.INSTANCE.nextInt(this.$rows, i2);
                    int i8 = this.$rows;
                    i3 = i8;
                    i4 = this.$columns;
                    snapshotState = this.$spinDirection;
                    snapshotState2 = this.$touchedCircle;
                    i5 = iNextInt;
                    i = i2;
                    i6 = 0;
                    if (i6 < i5) {
                    }
                    i2 = i;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 1;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = this.I$4;
                i4 = this.I$3;
                i3 = this.I$2;
                i5 = this.I$1;
                int i9 = this.I$0;
                snapshotState2 = (SnapshotState) this.L$1;
                snapshotState = (SnapshotState) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i9;
                i6++;
                if (i6 < i5) {
                    Random.Companion companion = Random.INSTANCE;
                    int iNextInt2 = companion.nextInt(0, i3);
                    int iNextInt3 = companion.nextInt(0, i4);
                    if (companion.nextBoolean()) {
                        spinningCoinGridComposable = SpinningCoinGridComposable.HORIZONTAL;
                    } else {
                        spinningCoinGridComposable = SpinningCoinGridComposable.VERTICAL;
                    }
                    snapshotState.setValue(spinningCoinGridComposable);
                    snapshotState2.setValue(Tuples4.m3642to(boxing.boxInt(iNextInt2), boxing.boxInt(iNextInt3)));
                    this.L$0 = snapshotState;
                    this.L$1 = snapshotState2;
                    this.I$0 = i;
                    this.I$1 = i5;
                    this.I$2 = i3;
                    this.I$3 = i4;
                    this.I$4 = i6;
                    this.label = 2;
                }
                i2 = i;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 1;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C167711(this.$columns, this.$rows, this.$isDragging, this.$spinDirection, this.$touchedCircle, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
