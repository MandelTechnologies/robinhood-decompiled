package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import com.robinhood.store.AsyncResult;
import dispatch.core.Suspend;
import java.io.IOException;
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
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$2$1", m3645f = "RemoteImageRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class RemoteImageRenderer3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MicrogramResourceLoader $loader;
    final /* synthetic */ SnapshotState<AsyncResult<byte[]>> $microgramResult$delegate;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteImageRenderer3(MicrogramResourceLoader microgramResourceLoader, String str, SnapshotState<AsyncResult<byte[]>> snapshotState, Continuation<? super RemoteImageRenderer3> continuation) {
        super(2, continuation);
        this.$loader = microgramResourceLoader;
        this.$url = str;
        this.$microgramResult$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteImageRenderer3(this.$loader, this.$url, this.$microgramResult$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteImageRenderer3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RemoteImageRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$2$1$1", m3645f = "RemoteImageRenderer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$SduiAspectRemoteImage$1$2$1$1 */
    static final class C207101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramResourceLoader $loader;
        final /* synthetic */ SnapshotState<AsyncResult<byte[]>> $microgramResult$delegate;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207101(MicrogramResourceLoader microgramResourceLoader, String str, SnapshotState<AsyncResult<byte[]>> snapshotState, Continuation<? super C207101> continuation) {
            super(2, continuation);
            this.$loader = microgramResourceLoader;
            this.$url = str;
            this.$microgramResult$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C207101(this.$loader, this.$url, this.$microgramResult$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C207101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                byte[] bArrLoad = this.$loader.load(this.$url);
                if (bArrLoad != null) {
                    this.$microgramResult$delegate.setValue(new AsyncResult.Success(bArrLoad));
                }
            } catch (IOException unused) {
                this.$microgramResult$delegate.setValue(new AsyncResult.Success(null));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C207101 c207101 = new C207101(this.$loader, this.$url, this.$microgramResult$delegate, null);
            this.label = 1;
            if (Suspend.withIO$default(null, c207101, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
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
