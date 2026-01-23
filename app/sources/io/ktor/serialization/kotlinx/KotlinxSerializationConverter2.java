package io.ktor.serialization.kotlinx;

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

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", m3645f = "KotlinxSerializationConverter.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2, reason: use source file name */
/* loaded from: classes14.dex */
final class KotlinxSerializationConverter2 extends ContinuationImpl7 implements Function2<Object, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ByteReadChannelJVM $content;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationConverter2(ByteReadChannelJVM byteReadChannelJVM, Continuation<? super KotlinxSerializationConverter2> continuation) {
        super(2, continuation);
        this.$content = byteReadChannelJVM;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KotlinxSerializationConverter2 kotlinxSerializationConverter2 = new KotlinxSerializationConverter2(this.$content, continuation);
        kotlinxSerializationConverter2.L$0 = obj;
        return kotlinxSerializationConverter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return ((KotlinxSerializationConverter2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(this.L$0 != null || this.$content.isClosedForRead());
    }
}
