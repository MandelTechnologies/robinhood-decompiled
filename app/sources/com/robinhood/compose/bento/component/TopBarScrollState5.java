package com.robinhood.compose.bento.component;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TopBarScrollState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$2$1$1", m3645f = "TopBarScrollState.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$2$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class TopBarScrollState5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Integer> $scrollPosition$delegate;
    final /* synthetic */ SnapshotState<Integer> $topBarHeight$delegate;
    final /* synthetic */ TopBarScrollState $topBarScrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopBarScrollState5(TopBarScrollState topBarScrollState, SnapshotState4<Integer> snapshotState4, SnapshotState<Integer> snapshotState, Continuation<? super TopBarScrollState5> continuation) {
        super(2, continuation);
        this.$topBarScrollState = topBarScrollState;
        this.$scrollPosition$delegate = snapshotState4;
        this.$topBarHeight$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopBarScrollState5(this.$topBarScrollState, this.$scrollPosition$delegate, this.$topBarHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopBarScrollState5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$topBarScrollState.setValue(TopBarScrollState3.deriveTopBarValue(TopBarScrollState3.C325342.invoke$lambda$2(this.$scrollPosition$delegate), TopBarScrollState3.C325342.invoke$lambda$4(this.$topBarHeight$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
