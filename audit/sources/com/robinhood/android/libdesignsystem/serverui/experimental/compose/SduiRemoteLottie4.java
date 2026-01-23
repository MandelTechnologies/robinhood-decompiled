package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import dispatch.core.Suspend;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiRemoteLottie.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$SduiRemoteLottie$4$1", m3645f = "SduiRemoteLottie.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$SduiRemoteLottie$4$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiRemoteLottie4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<String> $jsonString$delegate;
    final /* synthetic */ MicrogramResourceLoader $loader;
    final /* synthetic */ String $lottieUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiRemoteLottie4(MicrogramResourceLoader microgramResourceLoader, String str, SnapshotState<String> snapshotState, Continuation<? super SduiRemoteLottie4> continuation) {
        super(2, continuation);
        this.$loader = microgramResourceLoader;
        this.$lottieUrl = str;
        this.$jsonString$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiRemoteLottie4(this.$loader, this.$lottieUrl, this.$jsonString$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiRemoteLottie4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SduiRemoteLottie.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$SduiRemoteLottie$4$1$1", m3645f = "SduiRemoteLottie.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$SduiRemoteLottie$4$1$1 */
    static final class C207611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<String> $jsonString$delegate;
        final /* synthetic */ MicrogramResourceLoader $loader;
        final /* synthetic */ String $lottieUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207611(MicrogramResourceLoader microgramResourceLoader, String str, SnapshotState<String> snapshotState, Continuation<? super C207611> continuation) {
            super(2, continuation);
            this.$loader = microgramResourceLoader;
            this.$lottieUrl = str;
            this.$jsonString$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C207611(this.$loader, this.$lottieUrl, this.$jsonString$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C207611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                byte[] bArrLoad = this.$loader.load(this.$lottieUrl);
                SnapshotState<String> snapshotState = this.$jsonString$delegate;
                if (bArrLoad != null) {
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    str = new String(bArrLoad, UTF_8);
                } else {
                    str = null;
                }
                snapshotState.setValue(str);
            } catch (IOException unused) {
                this.$jsonString$delegate.setValue(null);
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
            C207611 c207611 = new C207611(this.$loader, this.$lottieUrl, this.$jsonString$delegate, null);
            this.label = 1;
            if (Suspend.withIO$default(null, c207611, this, 1, null) == coroutine_suspended) {
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
