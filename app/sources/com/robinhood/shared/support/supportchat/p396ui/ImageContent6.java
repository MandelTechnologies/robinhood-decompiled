package com.robinhood.shared.support.supportchat.p396ui;

import android.graphics.Bitmap;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: ImageContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.support.supportchat.ui.ImageContentKt$Image$2$1", m3645f = "ImageContent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.support.supportchat.ui.ImageContentKt$Image$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ImageContent6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ SnapshotState<Object> $imageSource$delegate;
    final /* synthetic */ HttpUrl $imageUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageContent6(HttpUrl httpUrl, Bitmap bitmap, SnapshotState<Object> snapshotState, Continuation<? super ImageContent6> continuation) {
        super(2, continuation);
        this.$imageUrl = httpUrl;
        this.$bitmap = bitmap;
        this.$imageSource$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageContent6(this.$imageUrl, this.$bitmap, this.$imageSource$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageContent6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SnapshotState<Object> snapshotState = this.$imageSource$delegate;
        Object obj2 = this.$imageUrl;
        if (obj2 == null) {
            obj2 = this.$bitmap;
        }
        ImageContent5.Image$lambda$15(snapshotState, obj2);
        return Unit.INSTANCE;
    }
}
