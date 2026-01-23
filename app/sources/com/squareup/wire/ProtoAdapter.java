package com.squareup.wire;

import com.robinhood.utils.http.ContentEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapterKt;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.reflection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ProtoAdapter.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 g*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002fgBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\r\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0011B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0012B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0013B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0015B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0016B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0017BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0018J\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u00100J\u001f\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u00103J\u001d\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u00108J\u001d\u00104\u001a\u0002052\u0006\u00106\u001a\u0002092\u0006\u0010,\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J'\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010<J'\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002092\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010=J\u001b\u00104\u001a\u0002052\u0006\u0010>\u001a\u00020?2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010@J\u0013\u00104\u001a\u00020A2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010EJ\u001b\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00020KH&¢\u0006\u0002\u0010LJ\u0015\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00020MH\u0016¢\u0006\u0002\u0010NJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010O\u001a\u00020A¢\u0006\u0002\u0010PJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010O\u001a\u00020D¢\u0006\u0002\u0010QJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010R\u001a\u00020S¢\u0006\u0002\u0010TJ\u001c\u0010U\u001a\u0002052\u0006\u0010J\u001a\u00020K2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000WJ\u001c\u0010U\u001a\u0002052\u0006\u0010J\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000WJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010F\u001a\u00020X¢\u0006\u0002\u0010YJ\u0015\u0010Z\u001a\u00020\b2\u0006\u0010,\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010[J\u0019\u0010\\\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010]\u001a\u00020^H\u0000¢\u0006\u0002\b_J\u0012\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0000J\u0012\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\"\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0014\u0010b\u001a\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, m3636d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "type", "Lkotlin/reflect/KClass;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", ContentEncoding.IDENTITY, "sourceFile", "<init>", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "getType", "()Lkotlin/reflect/KClass;", "getTypeUrl", "()Ljava/lang/String;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "getIdentity", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSourceFile", "packedAdapter", "", "getPackedAdapter$wire_runtime", "()Lcom/squareup/wire/ProtoAdapter;", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "redact", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "encodedSize", "", "(Ljava/lang/Object;)I", "encodedSizeWithTag", "tag", "(ILjava/lang/Object;)I", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "sink", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "encodeByteString", "Lokio/ByteString;", "(Ljava/lang/Object;)Lokio/ByteString;", "stream", "Ljava/io/OutputStream;", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(Lokio/ByteString;)Ljava/lang/Object;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)Ljava/lang/Object;", "tryDecode", "destination", "", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "withLabel", AnnotatedPrivateKey.LABEL, "Lcom/squareup/wire/WireField$Label;", "withLabel$wire_runtime", "asPacked", "asRepeated", "isStruct", "", "isStruct$wire_runtime", "()Z", "EnumConstantNotFoundException", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class ProtoAdapter<E> {

    @JvmField
    public static final ProtoAdapter<Boolean> BOOL;

    @JvmField
    public static final ProtoAdapter<Boolean> BOOL_VALUE;

    @JvmField
    public static final ProtoAdapter<ByteString> BYTES;

    @JvmField
    public static final ProtoAdapter<ByteString> BYTES_VALUE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final ProtoAdapter<Double> DOUBLE;

    @JvmField
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;

    @JvmField
    public static final ProtoAdapter<Double> DOUBLE_VALUE;

    @JvmField
    public static final ProtoAdapter<Duration> DURATION;

    @JvmField
    public static final ProtoAdapter<Unit> EMPTY;

    @JvmField
    public static final ProtoAdapter<Integer> FIXED32;

    @JvmField
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;

    @JvmField
    public static final ProtoAdapter<Long> FIXED64;

    @JvmField
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;

    @JvmField
    public static final ProtoAdapter<Float> FLOAT;

    @JvmField
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;

    @JvmField
    public static final ProtoAdapter<Float> FLOAT_VALUE;

    @JvmField
    public static final ProtoAdapter<Instant> INSTANT;

    @JvmField
    public static final ProtoAdapter<Integer> INT32;

    @JvmField
    public static final ProtoAdapter<int[]> INT32_ARRAY;

    @JvmField
    public static final ProtoAdapter<Integer> INT32_VALUE;

    @JvmField
    public static final ProtoAdapter<Long> INT64;

    @JvmField
    public static final ProtoAdapter<long[]> INT64_ARRAY;

    @JvmField
    public static final ProtoAdapter<Long> INT64_VALUE;

    @JvmField
    public static final ProtoAdapter<Integer> SFIXED32;

    @JvmField
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;

    @JvmField
    public static final ProtoAdapter<Long> SFIXED64;

    @JvmField
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;

    @JvmField
    public static final ProtoAdapter<Integer> SINT32;

    @JvmField
    public static final ProtoAdapter<int[]> SINT32_ARRAY;

    @JvmField
    public static final ProtoAdapter<Long> SINT64;

    @JvmField
    public static final ProtoAdapter<long[]> SINT64_ARRAY;

    @JvmField
    public static final ProtoAdapter<String> STRING;

    @JvmField
    public static final ProtoAdapter<String> STRING_VALUE;

    @JvmField
    public static final ProtoAdapter<List<?>> STRUCT_LIST;

    @JvmField
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;

    @JvmField
    public static final ProtoAdapter STRUCT_NULL;

    @JvmField
    public static final ProtoAdapter<Object> STRUCT_VALUE;

    @JvmField
    public static final ProtoAdapter<Integer> UINT32;

    @JvmField
    public static final ProtoAdapter<int[]> UINT32_ARRAY;

    @JvmField
    public static final ProtoAdapter<Integer> UINT32_VALUE;

    @JvmField
    public static final ProtoAdapter<Long> UINT64;

    @JvmField
    public static final ProtoAdapter<long[]> UINT64_ARRAY;

    @JvmField
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final KClass<?> type;
    private final String typeUrl;

    @JvmStatic
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m) {
        return INSTANCE.get((Companion) m);
    }

    @JvmStatic
    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return INSTANCE.get(cls);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str, ClassLoader classLoader) {
        return INSTANCE.get(str, classLoader);
    }

    @JvmStatic
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    @JvmStatic
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return INSTANCE.newMessageAdapter(cls, str);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return INSTANCE.newMessageAdapter(cls, str, syntax);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        return INSTANCE.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public abstract E decode(ProtoReader reader) throws IOException;

    public abstract void encode(ProtoWriter writer, E value) throws IOException;

    public abstract int encodedSize(E value);

    public abstract E redact(E value);

    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding() == fieldEncoding2) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, (KClass<?>) kClass, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    /* renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final KClass<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type2) {
        this(fieldEncoding, (KClass<?>) JvmClassMapping.getKotlinClass(type2));
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type2, String str) {
        this(fieldEncoding, (KClass<?>) JvmClassMapping.getKotlinClass(type2), str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type2, String str, Syntax syntax) {
        this(fieldEncoding, (KClass<?>) JvmClassMapping.getKotlinClass(type2), str, syntax);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type2, String str, Syntax syntax, E e) {
        this(fieldEncoding, (KClass<?>) JvmClassMapping.getKotlinClass(type2), str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass) {
        this(fieldEncoding, kClass, (String) null, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str) {
        this(fieldEncoding, kClass, str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax) {
        this(fieldEncoding, kClass, str, syntax, (Object) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e) {
        this(fieldEncoding, kClass, str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type2, String str, Syntax syntax, E e, String str2) {
        this(fieldEncoding, (KClass<?>) JvmClassMapping.getKotlinClass(type2), str, syntax, e, str2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    public final void encode(OutputStream stream, E value) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(stream));
        encode(bufferedSinkBuffer, (BufferedSink) value);
        bufferedSinkBuffer.emit();
    }

    public E decode(ProtoReader32 reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return decode(reader.asProtoReader());
    }

    public final E decode(InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return decode(Okio.buffer(Okio.source(stream)));
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public final boolean isStruct$wire_runtime() {
        return Intrinsics.areEqual(this, STRUCT_MAP) || Intrinsics.areEqual(this, STRUCT_LIST) || Intrinsics.areEqual(this, STRUCT_VALUE) || Intrinsics.areEqual(this, STRUCT_NULL);
    }

    /* compiled from: ProtoAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0007\u0010\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "value", "", "type", "Lkotlin/reflect/KClass;", "<init>", "(ILkotlin/reflect/KClass;)V", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        @JvmField
        public final int value;

        public EnumConstantNotFoundException(int i, KClass<?> kClass) {
            Class javaClass;
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown enum tag ");
            sb.append(i);
            sb.append(" for ");
            sb.append((kClass == null || (javaClass = JvmClassMapping.getJavaClass(kClass)) == null) ? null : javaClass.getName());
            super(sb.toString());
            this.value = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, Class<?> type2) {
            this(i, (KClass<?>) JvmClassMapping.getKotlinClass(type2));
            Intrinsics.checkNotNullParameter(type2, "type");
        }
    }

    /* compiled from: ProtoAdapter.kt */
    @Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0012\u0010\u0016J_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0012\u0010\u0019Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0012\u0010\u001cJ-\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\b\b\u0001\u0010\u001e*\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b \u0010!J/\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0010\b\u0001\u0010\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00028\u0001H\u0007¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u0014H\u0007¢\u0006\u0004\b#\u0010&J%\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b#\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010*R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010*R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010*R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010*R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010*R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010*R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010*R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010*R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010*R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010*R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010*R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010*R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010*R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010*R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010*R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010*R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010*R&\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010*R \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010Q0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010*R\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010*R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010*R\u001c\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010*R\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010*R\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010*R\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010*R\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010*R\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010*R\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010*R\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010*R\u001e\u0010a\u001a\f\u0012\b\u0012\u00060_j\u0002``0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010*R\u001e\u0010d\u001a\f\u0012\b\u0012\u00060bj\u0002`c0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010*¨\u0006f"}, m3636d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "<init>", "()V", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "newMapAdapter", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/lang/Class;", "type", "newMessageAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/ProtoAdapter;", "", "typeUrl", "(Ljava/lang/Class;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Syntax;", "syntax", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)Lcom/squareup/wire/ProtoAdapter;", "Ljava/lang/ClassLoader;", "classLoader", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/wire/EnumAdapter;", "newEnumAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/EnumAdapter;", "message", "get", "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "adapterString", "(Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "INT32", "", "INT32_ARRAY", "UINT32", "UINT32_ARRAY", "SINT32", "SINT32_ARRAY", "FIXED32", "FIXED32_ARRAY", "SFIXED32", "SFIXED32_ARRAY", "", "INT64", "", "INT64_ARRAY", "UINT64", "UINT64_ARRAY", "SINT64", "SINT64_ARRAY", "FIXED64", "FIXED64_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "", "FLOAT", "", "FLOAT_ARRAY", "", "DOUBLE", "", "DOUBLE_ARRAY", "Lokio/ByteString;", "BYTES", "STRING", "", "EMPTY", "STRUCT_MAP", "", "STRUCT_LIST", "", "STRUCT_NULL", "STRUCT_VALUE", "DOUBLE_VALUE", "FLOAT_VALUE", "INT64_VALUE", "UINT64_VALUE", "INT32_VALUE", "UINT32_VALUE", "BOOL_VALUE", "STRING_VALUE", "BYTES_VALUE", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "DURATION", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "INSTANT", "UnsupportedTypeProtoAdapter", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return reflection.createRuntimeMessageAdapter$default(type2, null, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type2, String typeUrl) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            return reflection.createRuntimeMessageAdapter$default(type2, typeUrl, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type2, String typeUrl, Syntax syntax) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return reflection.createRuntimeMessageAdapter$default(type2, typeUrl, syntax, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type2, String typeUrl, Syntax syntax, ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return reflection.createRuntimeMessageAdapter$default(type2, typeUrl, syntax, classLoader, false, 16, null);
        }

        @JvmStatic
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new RuntimeEnumAdapter(type2);
        }

        @JvmStatic
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return get(message.getClass());
        }

        @JvmStatic
        public final <M> ProtoAdapter<M> get(Class<M> type2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(type2, "type");
            try {
                Object obj = type2.getField("ADAPTER").get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + type2.getName() + "#ADAPTER", e);
            } catch (NoSuchFieldException e2) {
                throw new IllegalArgumentException("failed to access " + type2.getName() + "#ADAPTER", e2);
            }
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString, ClassLoader classLoader) throws IllegalAccessException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            try {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) adapterString, '#', 0, false, 6, (Object) null);
                String strSubstring = adapterString.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = adapterString.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("failed to access " + adapterString, e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("failed to access " + adapterString, e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException("failed to access " + adapterString, e3);
            }
        }

        /* compiled from: ProtoAdapter.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion$UnsupportedTypeProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "redact", "value", "encodedSize", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void encodedSize(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        @JvmStatic
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }
    }

    public int encodedSizeWithTag(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.INSTANCE.tagSize$wire_runtime(tag);
    }

    public void encode(ReverseProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt.C424531(this, value));
    }

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> protoAdapterCommonBool = ProtoAdapterKt.commonBool();
        BOOL = protoAdapterCommonBool;
        ProtoAdapter<Integer> protoAdapterCommonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = protoAdapterCommonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonInt32);
        ProtoAdapter<Integer> protoAdapterCommonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = protoAdapterCommonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonUint32);
        ProtoAdapter<Integer> protoAdapterCommonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = protoAdapterCommonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSint32);
        ProtoAdapter<Integer> protoAdapterCommonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = protoAdapterCommonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonFixed32);
        ProtoAdapter<Integer> protoAdapterCommonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = protoAdapterCommonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSfixed32);
        ProtoAdapter<Long> protoAdapterCommonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = protoAdapterCommonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonInt64);
        ProtoAdapter<Long> protoAdapterCommonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = protoAdapterCommonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonUint64);
        ProtoAdapter<Long> protoAdapterCommonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = protoAdapterCommonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSint64);
        ProtoAdapter<Long> protoAdapterCommonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = protoAdapterCommonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonFixed64);
        ProtoAdapter<Long> protoAdapterCommonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = protoAdapterCommonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSfixed64);
        FloatProtoAdapter floatProtoAdapterCommonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = floatProtoAdapterCommonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapterCommonFloat);
        DoubleProtoAdapter doubleProtoAdapterCommonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = doubleProtoAdapterCommonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(doubleProtoAdapterCommonDouble);
        ProtoAdapter<ByteString> protoAdapterCommonBytes = ProtoAdapterKt.commonBytes();
        BYTES = protoAdapterCommonBytes;
        ProtoAdapter<String> protoAdapterCommonString = ProtoAdapterKt.commonString();
        STRING = protoAdapterCommonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(doubleProtoAdapterCommonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(floatProtoAdapterCommonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public void encodeWithTag(ProtoWriter writer, int tag, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            writer.writeTag(tag, getFieldEncoding());
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(value));
            }
            encode(writer, (ProtoWriter) value);
        }
    }

    public void encodeWithTag(ReverseProtoWriter writer, int tag, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, (ReverseProtoWriter) value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, (ReverseProtoWriter) value);
            }
            writer.writeTag(tag, getFieldEncoding());
        }
    }

    public final void encode(BufferedSink sink, E value) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, (ReverseProtoWriter) value);
        reverseProtoWriter.writeTo(sink);
    }

    public final byte[] encode(E value) throws IOException {
        Buffer buffer = new Buffer();
        encode((BufferedSink) buffer, (Buffer) value);
        return buffer.readByteArray();
    }

    public final ByteString encodeByteString(E value) throws IOException {
        Buffer buffer = new Buffer();
        encode((BufferedSink) buffer, (Buffer) value);
        return buffer.readByteString();
    }

    public final E decode(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader322.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader322.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(BufferedSource source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        return decode(new ProtoReader(source));
    }

    public final void tryDecode(ProtoReader reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    public final void tryDecode(ProtoReader32 reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(decode(reader));
        }
    }

    public String toString(E value) {
        return String.valueOf(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }
}
