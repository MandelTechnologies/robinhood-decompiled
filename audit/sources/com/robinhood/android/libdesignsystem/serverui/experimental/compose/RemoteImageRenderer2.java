package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.store.AsyncResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RemoteImageRenderer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$1$1", m3645f = "RemoteImageRenderer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class RemoteImageRenderer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Serializable> $imageData$delegate;
    final /* synthetic */ SnapshotState<AsyncResult<byte[]>> $microgramResult$delegate;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteImageRenderer2(String str, SnapshotState<AsyncResult<byte[]>> snapshotState, SnapshotState<Serializable> snapshotState2, Continuation<? super RemoteImageRenderer2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$microgramResult$delegate = snapshotState;
        this.$imageData$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteImageRenderer2(this.$url, this.$microgramResult$delegate, this.$imageData$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteImageRenderer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SnapshotState<Serializable> snapshotState = this.$imageData$delegate;
        if (RemoteImageRenderer.SduiAspectRemoteImage$lambda$14$lambda$7(this.$microgramResult$delegate) instanceof AsyncResult.Success) {
            ?? r0 = (byte[]) RemoteImageRenderer.SduiAspectRemoteImage$lambda$14$lambda$7(this.$microgramResult$delegate).getSuccessValue();
            str = r0;
            if (r0 == 0) {
                str = this.$url;
            }
        } else {
            str = null;
        }
        snapshotState.setValue(str);
        return Unit.INSTANCE;
    }
}
