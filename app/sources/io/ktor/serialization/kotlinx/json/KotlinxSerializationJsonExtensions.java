package io.ktor.serialization.kotlinx.json;

import com.plaid.internal.EnumC7081g;
import io.ktor.http.ContentTypes2;
import io.ktor.http.ContentTypes3;
import io.ktor.http.content.ChannelWriterContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.serialization.ContentConvertException2;
import io.ktor.serialization.kotlinx.KotlinxSerializationExtension;
import io.ktor.serialization.kotlinx.SerializerLookup;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.ByteWriteChannel2;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J9\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017JC\u0010\u0012\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001c2\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m3636d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "format", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "jsonArraySymbolsMap", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "deserialize", "", "charset", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serialize", "Lio/ktor/http/content/OutgoingContent;", "contentType", "Lio/ktor/http/ContentType;", "value", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "serializer", "Lkotlinx/serialization/KSerializer;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Ljava/nio/charset/Charset;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-serialization-kotlinx-json"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KotlinxSerializationJsonExtensions implements KotlinxSerializationExtension {
    private final Json format;
    private final Map<Charset, KotlinxSerializationJsonExtensions2> jsonArraySymbolsMap;

    /* compiled from: KotlinxSerializationJsonExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", m3645f = "KotlinxSerializationJsonExtensions.kt", m3646l = {66}, m3647m = "deserialize")
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1 */
    static final class C456061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C456061(Continuation<? super C456061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.deserialize(null, null, null, this);
        }
    }

    /* compiled from: KotlinxSerializationJsonExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", m3645f = "KotlinxSerializationJsonExtensions.kt", m3646l = {80, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 89}, m3647m = "serialize")
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3 */
    static final class C456083<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C456083(Continuation<? super C456083> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.serialize((Flow) null, (KSerializer) null, (Charset) null, (ByteWriteChannel) null, this);
        }
    }

    public KotlinxSerializationJsonExtensions(Json format2) {
        Intrinsics.checkNotNullParameter(format2, "format");
        this.format = format2;
        this.jsonArraySymbolsMap = new LinkedHashMap();
    }

    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public Object serialize(ContentTypes2 contentTypes2, Charset charset, TypeInfo typeInfo, Object obj, Continuation<? super OutgoingContent> continuation) {
        if (!Intrinsics.areEqual(charset, Charsets.UTF_8) || !Intrinsics.areEqual(typeInfo.getType(), Reflection.getOrCreateKotlinClass(Flow.class))) {
            return null;
        }
        return new ChannelWriterContent(new C456072(obj, SerializerLookup.serializerForTypeInfo(this.format.getSerializersModule(), KotlinxSerializationJsonExtensions4.argumentTypeInfo(typeInfo)), charset, null), ContentTypes3.withCharsetIfNeeded(contentTypes2, charset), null, null, 12, null);
    }

    /* compiled from: KotlinxSerializationJsonExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ByteWriteChannel;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", m3645f = "KotlinxSerializationJsonExtensions.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2 */
    static final class C456072 extends ContinuationImpl7 implements Function2<ByteWriteChannel, Continuation<? super Unit>, Object> {
        final /* synthetic */ Charset $charset;
        final /* synthetic */ KSerializer<?> $serializer;
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C456072(Object obj, KSerializer<?> kSerializer, Charset charset, Continuation<? super C456072> continuation) {
            super(2, continuation);
            this.$value = obj;
            this.$serializer = kSerializer;
            this.$charset = charset;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C456072 c456072 = KotlinxSerializationJsonExtensions.this.new C456072(this.$value, this.$serializer, this.$charset, continuation);
            c456072.L$0 = obj;
            return c456072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
            return ((C456072) create(byteWriteChannel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ByteWriteChannel byteWriteChannel = (ByteWriteChannel) this.L$0;
                KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions = KotlinxSerializationJsonExtensions.this;
                Object obj2 = this.$value;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                KSerializer<?> kSerializer = this.$serializer;
                Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                Charset charset = this.$charset;
                this.label = 1;
                if (kotlinxSerializationJsonExtensions.serialize((Flow) obj2, kSerializer, charset, byteWriteChannel, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deserialize(Charset charset, TypeInfo typeInfo, ByteReadChannelJVM byteReadChannelJVM, Continuation<Object> continuation) throws ContentConvertException2 {
        C456061 c456061;
        if (continuation instanceof C456061) {
            c456061 = (C456061) continuation;
            int i = c456061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456061.label = i - Integer.MIN_VALUE;
            } else {
                c456061 = new C456061(continuation);
            }
        }
        Object obj = c456061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456061.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(charset, Charsets.UTF_8) || !Intrinsics.areEqual(typeInfo.getType(), Reflection.getOrCreateKotlinClass(Sequence.class))) {
                return null;
            }
            Json json = this.format;
            c456061.label = 1;
            Object objDeserializeSequence = JsonExtensionsJvm.deserializeSequence(json, byteReadChannelJVM, typeInfo, c456061);
            return objDeserializeSequence == coroutine_suspended ? coroutine_suspended : objDeserializeSequence;
        } catch (Throwable th) {
            throw new ContentConvertException2("Illegal input: " + th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (io.ktor.utils.p478io.ByteWriteChannel2.writeFully(r2, r1, r4) != r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object serialize(Flow<? extends T> flow, KSerializer<T> kSerializer, Charset charset, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        C456083 c456083;
        Flow flow2;
        KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions;
        Charset charset2;
        KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions2;
        KSerializer<T> kSerializer2;
        ByteWriteChannel byteWriteChannel2;
        KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions22;
        ByteWriteChannel byteWriteChannel3 = byteWriteChannel;
        if (continuation instanceof C456083) {
            c456083 = (C456083) continuation;
            int i = c456083.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456083.label = i - Integer.MIN_VALUE;
            } else {
                c456083 = new C456083(continuation);
            }
        }
        Object obj = c456083.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456083.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Map<Charset, KotlinxSerializationJsonExtensions2> map = this.jsonArraySymbolsMap;
            KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions23 = map.get(charset);
            if (kotlinxSerializationJsonExtensions23 == null) {
                kotlinxSerializationJsonExtensions23 = new KotlinxSerializationJsonExtensions2(charset);
                map.put(charset, kotlinxSerializationJsonExtensions23);
            }
            KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions24 = kotlinxSerializationJsonExtensions23;
            byte[] beginArray = kotlinxSerializationJsonExtensions24.getBeginArray();
            c456083.L$0 = this;
            flow2 = flow;
            c456083.L$1 = flow2;
            c456083.L$2 = kSerializer;
            c456083.L$3 = charset;
            c456083.L$4 = byteWriteChannel3;
            c456083.L$5 = kotlinxSerializationJsonExtensions24;
            c456083.label = 1;
            if (ByteWriteChannel2.writeFully(byteWriteChannel3, beginArray, c456083) != coroutine_suspended) {
                kotlinxSerializationJsonExtensions = this;
                charset2 = charset;
                kotlinxSerializationJsonExtensions2 = kotlinxSerializationJsonExtensions24;
                kSerializer2 = kSerializer;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions25 = (KotlinxSerializationJsonExtensions2) c456083.L$5;
            byteWriteChannel3 = (ByteWriteChannel) c456083.L$4;
            Charset charset3 = (Charset) c456083.L$3;
            KSerializer<T> kSerializer3 = (KSerializer) c456083.L$2;
            flow2 = (Flow) c456083.L$1;
            KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions3 = (KotlinxSerializationJsonExtensions) c456083.L$0;
            ResultKt.throwOnFailure(obj);
            kotlinxSerializationJsonExtensions2 = kotlinxSerializationJsonExtensions25;
            charset2 = charset3;
            kSerializer2 = kSerializer3;
            kotlinxSerializationJsonExtensions = kotlinxSerializationJsonExtensions3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            kotlinxSerializationJsonExtensions22 = (KotlinxSerializationJsonExtensions2) c456083.L$1;
            byteWriteChannel2 = (ByteWriteChannel) c456083.L$0;
            ResultKt.throwOnFailure(obj);
            byte[] endArray = kotlinxSerializationJsonExtensions22.getEndArray();
            c456083.L$0 = null;
            c456083.L$1 = null;
            c456083.label = 3;
        }
        ByteWriteChannel byteWriteChannel4 = byteWriteChannel3;
        Collect7 collect7 = new Collect7(byteWriteChannel4, kotlinxSerializationJsonExtensions2, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
        c456083.L$0 = byteWriteChannel4;
        c456083.L$1 = kotlinxSerializationJsonExtensions2;
        c456083.L$2 = null;
        c456083.L$3 = null;
        c456083.L$4 = null;
        c456083.L$5 = null;
        c456083.label = 2;
        if (flow2.collect(collect7, c456083) != coroutine_suspended) {
            byteWriteChannel2 = byteWriteChannel4;
            kotlinxSerializationJsonExtensions22 = kotlinxSerializationJsonExtensions2;
            byte[] endArray2 = kotlinxSerializationJsonExtensions22.getEndArray();
            c456083.L$0 = null;
            c456083.L$1 = null;
            c456083.label = 3;
        }
        return coroutine_suspended;
    }
}
