package com.robinhood.android.feature.livetrivia.composable;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$3$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SpinningCoinGridComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> $initializedItems;
    final /* synthetic */ SnapshotState<Boolean> $revealFinished$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<SpinningCoinGridComposable> $spinDirection;
    final /* synthetic */ SnapshotState<Tuples2<Integer, Integer>> $touchedCircle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpinningCoinGridComposable5(SnapshotState<SpinningCoinGridComposable> snapshotState, CoroutineScope coroutineScope, SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> snapshotStateMap, SnapshotState<Tuples2<Integer, Integer>> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super SpinningCoinGridComposable5> continuation) {
        super(2, continuation);
        this.$spinDirection = snapshotState;
        this.$scope = coroutineScope;
        this.$initializedItems = snapshotStateMap;
        this.$touchedCircle = snapshotState2;
        this.$revealFinished$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpinningCoinGridComposable5(this.$spinDirection, this.$scope, this.$initializedItems, this.$touchedCircle, this.$revealFinished$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpinningCoinGridComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$spinDirection.setValue(SpinningCoinGridComposable.HORIZONTAL);
        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C167701(this.$initializedItems, this.$touchedCircle, this.$revealFinished$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SpinningCoinGridComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$3$1$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$3$1$1 */
    static final class C167701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> $initializedItems;
        final /* synthetic */ SnapshotState<Boolean> $revealFinished$delegate;
        final /* synthetic */ SnapshotState<Tuples2<Integer, Integer>> $touchedCircle;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167701(SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> snapshotStateMap, SnapshotState<Tuples2<Integer, Integer>> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super C167701> continuation) {
            super(2, continuation);
            this.$initializedItems = snapshotStateMap;
            this.$touchedCircle = snapshotState;
            this.$revealFinished$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167701(this.$initializedItems, this.$touchedCircle, this.$revealFinished$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(300, r9) == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SnapshotState<Tuples2<Integer, Integer>> snapshotState;
            SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> snapshotStateMap;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$2;
                    snapshotState = (SnapshotState) this.L$1;
                    snapshotStateMap = (SnapshotStateMap) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Tuples2 tuples2 = (Tuples2) it.next();
                        int iIntValue = ((Number) tuples2.component1()).intValue();
                        int iIntValue2 = ((Number) tuples2.component2()).intValue();
                        snapshotStateMap.put(Tuples4.m3642to(boxing.boxInt(iIntValue), boxing.boxInt(iIntValue2)), boxing.boxBoolean(true));
                        snapshotState.setValue(Tuples4.m3642to(boxing.boxInt(iIntValue), boxing.boxInt(iIntValue2)));
                        this.L$0 = snapshotStateMap;
                        this.L$1 = snapshotState;
                        this.L$2 = it;
                        this.label = 2;
                        if (DelayKt.delay(50L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    SpinningCoinGridComposable2.SpinningCoinGridComposable_Kz89ssw$lambda$5(this.$revealFinished$delegate, true);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = SpinningCoinGridComposable2.SPIRAL_REVEAL_ORDER;
            SnapshotStateMap<Tuples2<Integer, Integer>, Boolean> snapshotStateMap2 = this.$initializedItems;
            snapshotState = this.$touchedCircle;
            snapshotStateMap = snapshotStateMap2;
            it = list.iterator();
            while (it.hasNext()) {
            }
            SpinningCoinGridComposable2.SpinningCoinGridComposable_Kz89ssw$lambda$5(this.$revealFinished$delegate, true);
            return Unit.INSTANCE;
        }
    }
}
