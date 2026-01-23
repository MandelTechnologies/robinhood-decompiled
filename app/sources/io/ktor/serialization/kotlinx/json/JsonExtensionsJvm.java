package io.ktor.serialization.kotlinx.json;

import io.ktor.serialization.kotlinx.SerializerLookup;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.jvm.javaio.BlockingKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JvmStreams;

/* compiled from: JsonExtensionsJvm.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m3636d2 = {"deserializeSequence", "Lkotlin/sequences/Sequence;", "", "format", "Lkotlinx/serialization/json/Json;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "(Lkotlinx/serialization/json/Json;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-serialization-kotlinx-json"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonExtensionsJvm {

    /* compiled from: JsonExtensionsJvm.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", m3645f = "JsonExtensionsJvm.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2 */
    static final class C456042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Sequence<? extends Object>>, Object> {
        final /* synthetic */ ByteReadChannelJVM $content;
        final /* synthetic */ Json $format;
        final /* synthetic */ TypeInfo $typeInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C456042(ByteReadChannelJVM byteReadChannelJVM, TypeInfo typeInfo, Json json, Continuation<? super C456042> continuation) {
            super(2, continuation);
            this.$content = byteReadChannelJVM;
            this.$typeInfo = typeInfo;
            this.$format = json;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C456042(this.$content, this.$typeInfo, this.$format, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Sequence<? extends Object>> continuation) {
            return ((C456042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JvmStreams.decodeToSequence$default(this.$format, BlockingKt.toInputStream$default(this.$content, null, 1, null), SerializerLookup.serializerForTypeInfo(this.$format.getSerializersModule(), KotlinxSerializationJsonExtensions4.argumentTypeInfo(this.$typeInfo)), null, 4, null);
        }
    }

    public static final Object deserializeSequence(Json json, ByteReadChannelJVM byteReadChannelJVM, TypeInfo typeInfo, Continuation<? super Sequence<? extends Object>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C456042(byteReadChannelJVM, typeInfo, json, null), continuation);
    }
}
