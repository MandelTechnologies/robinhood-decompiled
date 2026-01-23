package io.ktor.serialization.kotlinx;

import io.ktor.http.content.OutgoingContent;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lio/ktor/http/content/OutgoingContent;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$fromExtension$2", m3645f = "KotlinxSerializationConverter.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$fromExtension$2, reason: use source file name */
/* loaded from: classes14.dex */
final class KotlinxSerializationConverter3 extends ContinuationImpl7 implements Function2<OutgoingContent, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    KotlinxSerializationConverter3(Continuation<? super KotlinxSerializationConverter3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KotlinxSerializationConverter3 kotlinxSerializationConverter3 = new KotlinxSerializationConverter3(continuation);
        kotlinxSerializationConverter3.L$0 = obj;
        return kotlinxSerializationConverter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OutgoingContent outgoingContent, Continuation<? super Boolean> continuation) {
        return ((KotlinxSerializationConverter3) create(outgoingContent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((OutgoingContent) this.L$0) != null);
    }
}
