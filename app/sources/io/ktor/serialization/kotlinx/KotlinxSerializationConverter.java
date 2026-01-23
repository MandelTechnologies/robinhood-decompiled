package io.ktor.serialization.kotlinx;

import com.plaid.internal.EnumC7081g;
import io.ktor.http.ContentTypes2;
import io.ktor.http.ContentTypes3;
import io.ktor.http.content.ByteArrayContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.serialization.ContentConvertException2;
import io.ktor.serialization.ContentConverter;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Input3;
import io.ktor.utils.p478io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerialFormat2;
import kotlinx.serialization.SerialFormat3;
import kotlinx.serialization.SerializationExceptions2;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m3636d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "Lkotlinx/serialization/SerialFormat;", "format", "<init>", "(Lkotlinx/serialization/SerialFormat;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "Lio/ktor/http/ContentType;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "serializeContent", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/SerialFormat;Ljava/lang/Object;Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lio/ktor/http/content/OutgoingContent;", "serializeNullable", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/SerialFormat;", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extensions", "Ljava/util/List;", "ktor-serialization-kotlinx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KotlinxSerializationConverter implements ContentConverter {
    private final List<KotlinxSerializationExtension> extensions;
    private final SerialFormat format;

    /* compiled from: KotlinxSerializationConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", m3645f = "KotlinxSerializationConverter.kt", m3646l = {74, 78}, m3647m = "deserialize")
    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1 */
    static final class C456021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C456021(Continuation<? super C456021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.deserialize(null, null, null, this);
        }
    }

    /* compiled from: KotlinxSerializationConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", m3645f = "KotlinxSerializationConverter.kt", m3646l = {59}, m3647m = "serializeNullable")
    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$1 */
    static final class C456031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C456031(Continuation<? super C456031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.serializeNullable(null, null, null, null, this);
        }
    }

    public KotlinxSerializationConverter(SerialFormat format2) {
        Intrinsics.checkNotNullParameter(format2, "format");
        this.format = format2;
        this.extensions = ExtensionsKt.extensions(format2);
        if ((format2 instanceof SerialFormat2) || (format2 instanceof SerialFormat3)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format2 + " is not supported.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object serializeNullable(ContentTypes2 contentTypes2, Charset charset, final TypeInfo typeInfo, final Object obj, Continuation<? super OutgoingContent> continuation) {
        C456031 c456031;
        final ContentTypes2 contentTypes22;
        final Charset charset2;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        TypeInfo typeInfo2;
        Object obj2;
        KSerializer<?> kSerializerGuessSerializer;
        if (continuation instanceof C456031) {
            c456031 = (C456031) continuation;
            int i = c456031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456031.label = i - Integer.MIN_VALUE;
            } else {
                c456031 = new C456031(continuation);
            }
        }
        Object objFirstOrNull = c456031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            final Flow flowAsFlow = FlowKt.asFlow(this.extensions);
            contentTypes22 = contentTypes2;
            charset2 = charset;
            Flow<OutgoingContent> flow = new Flow<OutgoingContent>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super OutgoingContent> flowCollector, Continuation continuation2) {
                    Object objCollect = flowAsFlow.collect(new C456012(flowCollector, contentTypes22, charset2, typeInfo, obj), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
                @SourceDebugExtension
                /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2 */
                public static final class C456012<T> implements FlowCollector {
                    final /* synthetic */ Charset $charset$inlined;
                    final /* synthetic */ ContentTypes2 $contentType$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ TypeInfo $typeInfo$inlined;
                    final /* synthetic */ Object $value$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", m3645f = "KotlinxSerializationConverter.kt", m3646l = {224, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                    @SourceDebugExtension
                    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C456012.this.emit(null, this);
                        }
                    }

                    public C456012(FlowCollector flowCollector, ContentTypes2 contentTypes2, Charset charset, TypeInfo typeInfo, Object obj) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$contentType$inlined = contentTypes2;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$value$inlined = obj;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
                    
                        if (r10.emit(r11, r6) == r0) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        AnonymousClass1 anonymousClass12 = anonymousClass1;
                        Object obj2 = anonymousClass12.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass12.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                            ContentTypes2 contentTypes2 = this.$contentType$inlined;
                            Charset charset = this.$charset$inlined;
                            TypeInfo typeInfo = this.$typeInfo$inlined;
                            Object obj3 = this.$value$inlined;
                            anonymousClass12.L$0 = flowCollector2;
                            anonymousClass12.label = 1;
                            Object objSerialize = ((KotlinxSerializationExtension) obj).serialize(contentTypes2, charset, typeInfo, obj3, anonymousClass12);
                            if (objSerialize != coroutine_suspended) {
                                obj2 = objSerialize;
                                flowCollector = flowCollector2;
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector3 = (FlowCollector) anonymousClass12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = flowCollector3;
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 2;
                    }
                }
            };
            KotlinxSerializationConverter3 kotlinxSerializationConverter3 = new KotlinxSerializationConverter3(null);
            c456031.L$0 = this;
            c456031.L$1 = contentTypes22;
            c456031.L$2 = charset2;
            c456031.L$3 = typeInfo;
            c456031.L$4 = obj;
            c456031.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, kotlinxSerializationConverter3, c456031);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinxSerializationConverter = this;
            typeInfo2 = typeInfo;
            obj2 = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = c456031.L$4;
            typeInfo2 = (TypeInfo) c456031.L$3;
            Charset charset3 = (Charset) c456031.L$2;
            ContentTypes2 contentTypes23 = (ContentTypes2) c456031.L$1;
            KotlinxSerializationConverter kotlinxSerializationConverter2 = (KotlinxSerializationConverter) c456031.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            contentTypes22 = contentTypes23;
            charset2 = charset3;
            obj2 = obj3;
            kotlinxSerializationConverter = kotlinxSerializationConverter2;
        }
        OutgoingContent outgoingContent = (OutgoingContent) objFirstOrNull;
        if (outgoingContent != null) {
            return outgoingContent;
        }
        try {
            kSerializerGuessSerializer = SerializerLookup.serializerForTypeInfo(kotlinxSerializationConverter.format.getSerializersModule(), typeInfo2);
        } catch (SerializationExceptions2 unused) {
            kSerializerGuessSerializer = SerializerLookup.guessSerializer(obj2, kotlinxSerializationConverter.format.getSerializersModule());
        }
        return kotlinxSerializationConverter.serializeContent(kSerializerGuessSerializer, kotlinxSerializationConverter.format, obj2, contentTypes22, charset2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:32:0x00bc, B:34:0x00c3, B:38:0x00d3, B:40:0x00d7, B:42:0x00e4, B:43:0x0103), top: B:46:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:32:0x00bc, B:34:0x00c3, B:38:0x00d3, B:40:0x00d7, B:42:0x00e4, B:43:0x0103), top: B:46:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deserialize(final Charset charset, final TypeInfo typeInfo, final ByteReadChannelJVM byteReadChannelJVM, Continuation<Object> continuation) throws ContentConvertException2 {
        C456021 c456021;
        ByteReadChannelJVM byteReadChannelJVM2;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        Charset charset2;
        KSerializer<?> kSerializer;
        SerialFormat serialFormat;
        if (continuation instanceof C456021) {
            c456021 = (C456021) continuation;
            int i = c456021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456021.label = i - Integer.MIN_VALUE;
            } else {
                c456021 = new C456021(continuation);
            }
        }
        C456021 c4560212 = c456021;
        Object objFirstOrNull = c4560212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4560212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            final Flow flowAsFlow = FlowKt.asFlow(this.extensions);
            Flow<Object> flow = new Flow<Object>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation2) {
                    Object objCollect = flowAsFlow.collect(new C456002(flowCollector, charset, typeInfo, byteReadChannelJVM), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
                @SourceDebugExtension
                /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2 */
                public static final class C456002<T> implements FlowCollector {
                    final /* synthetic */ Charset $charset$inlined;
                    final /* synthetic */ ByteReadChannelJVM $content$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ TypeInfo $typeInfo$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", m3645f = "KotlinxSerializationConverter.kt", m3646l = {224, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                    @SourceDebugExtension
                    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C456002.this.emit(null, this);
                        }
                    }

                    public C456002(FlowCollector flowCollector, Charset charset, TypeInfo typeInfo, ByteReadChannelJVM byteReadChannelJVM) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$content$inlined = byteReadChannelJVM;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                    
                        if (r9.emit(r10, r0) == r1) goto L22;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                            Charset charset = this.$charset$inlined;
                            TypeInfo typeInfo = this.$typeInfo$inlined;
                            ByteReadChannelJVM byteReadChannelJVM = this.$content$inlined;
                            anonymousClass1.L$0 = flowCollector2;
                            anonymousClass1.label = 1;
                            Object objDeserialize = ((KotlinxSerializationExtension) obj).deserialize(charset, typeInfo, byteReadChannelJVM, anonymousClass1);
                            if (objDeserialize != coroutine_suspended) {
                                obj2 = objDeserialize;
                                flowCollector = flowCollector2;
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = flowCollector3;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }
            };
            KotlinxSerializationConverter2 kotlinxSerializationConverter2 = new KotlinxSerializationConverter2(byteReadChannelJVM, null);
            c4560212.L$0 = this;
            c4560212.L$1 = charset;
            c4560212.L$2 = typeInfo;
            c4560212.L$3 = byteReadChannelJVM;
            c4560212.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, kotlinxSerializationConverter2, c4560212);
            if (objFirstOrNull != coroutine_suspended) {
                byteReadChannelJVM2 = byteReadChannelJVM;
                kotlinxSerializationConverter = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = (KSerializer) c4560212.L$2;
            charset2 = (Charset) c4560212.L$1;
            kotlinxSerializationConverter = (KotlinxSerializationConverter) c4560212.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            ByteReadPacket byteReadPacket = (ByteReadPacket) objFirstOrNull;
            try {
                serialFormat = kotlinxSerializationConverter.format;
                if (!(serialFormat instanceof SerialFormat3)) {
                    return ((SerialFormat3) serialFormat).decodeFromString(kSerializer, StringsKt.readText$default(byteReadPacket, charset2, 0, 2, null));
                }
                if (serialFormat instanceof SerialFormat2) {
                    return ((SerialFormat2) serialFormat).decodeFromByteArray(kSerializer, StringsKt.readBytes$default(byteReadPacket, 0, 1, null));
                }
                Input3.discard(byteReadPacket);
                throw new IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
            } catch (Throwable th) {
                throw new ContentConvertException2("Illegal input: " + th.getMessage(), th);
            }
        }
        ByteReadChannelJVM byteReadChannelJVM3 = (ByteReadChannelJVM) c4560212.L$3;
        typeInfo = (TypeInfo) c4560212.L$2;
        charset = (Charset) c4560212.L$1;
        KotlinxSerializationConverter kotlinxSerializationConverter3 = (KotlinxSerializationConverter) c4560212.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        byteReadChannelJVM2 = byteReadChannelJVM3;
        kotlinxSerializationConverter = kotlinxSerializationConverter3;
        if (!kotlinxSerializationConverter.extensions.isEmpty() && (objFirstOrNull != null || byteReadChannelJVM2.isClosedForRead())) {
            return objFirstOrNull;
        }
        KSerializer<?> kSerializerSerializerForTypeInfo = SerializerLookup.serializerForTypeInfo(kotlinxSerializationConverter.format.getSerializersModule(), typeInfo);
        c4560212.L$0 = kotlinxSerializationConverter;
        c4560212.L$1 = charset;
        c4560212.L$2 = kSerializerSerializerForTypeInfo;
        c4560212.L$3 = null;
        c4560212.label = 2;
        objFirstOrNull = ByteReadChannelJVM.DefaultImpls.readRemaining$default(byteReadChannelJVM2, 0L, c4560212, 1, null);
        if (objFirstOrNull != coroutine_suspended) {
            charset2 = charset;
            kSerializer = kSerializerSerializerForTypeInfo;
            ByteReadPacket byteReadPacket2 = (ByteReadPacket) objFirstOrNull;
            serialFormat = kotlinxSerializationConverter.format;
            if (!(serialFormat instanceof SerialFormat3)) {
            }
        }
        return coroutine_suspended;
    }

    private final OutgoingContent.ByteArrayContent serializeContent(KSerializer<?> serializer, SerialFormat format2, Object value, ContentTypes2 contentType, Charset charset) {
        if (format2 instanceof SerialFormat3) {
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new TextContent(((SerialFormat3) format2).encodeToString(serializer, value), ContentTypes3.withCharsetIfNeeded(contentType, charset), null, 4, null);
        }
        if (format2 instanceof SerialFormat2) {
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new ByteArrayContent(((SerialFormat2) format2).encodeToByteArray(serializer, value), contentType, null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + format2).toString());
    }
}
