package io.ktor.serialization;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: ContentConverter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", m3645f = "ContentConverter.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$result$2, reason: use source file name */
/* loaded from: classes14.dex */
final class ContentConverter4 extends ContinuationImpl7 implements Function2<Object, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ByteReadChannelJVM $body;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentConverter4(ByteReadChannelJVM byteReadChannelJVM, Continuation<? super ContentConverter4> continuation) {
        super(2, continuation);
        this.$body = byteReadChannelJVM;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentConverter4 contentConverter4 = new ContentConverter4(this.$body, continuation);
        contentConverter4.L$0 = obj;
        return contentConverter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return ((ContentConverter4) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(this.L$0 != null || this.$body.isClosedForRead());
    }
}
