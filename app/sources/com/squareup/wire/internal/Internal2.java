package com.squareup.wire.internal;

import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.internal.progressionUtil;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: Internal.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000f\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\r\u0010\u0013\u001a/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u000e\u001aA\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0012\u001aA\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0012\u001a#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a!\u0010#\u001a\u00020\"2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$\u001a)\u0010)\u001a\u00060'j\u0002`(2\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020+2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010,\u001a\u00020+2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b,\u0010.\u001a!\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00101\u001a+\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00103\u001aM\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f2\b\u00104\u001a\u0004\u0018\u00010\u001f2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00106\u001a\u0015\u00107\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b7\u00108\u001a\u001b\u00107\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b7\u0010:\u001a\u0015\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b<\u00108\u001a\u001d\u0010>\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t¢\u0006\u0004\b>\u0010?\u001a\u0015\u0010@\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b@\u00108\u001a%\u0010F\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bF\u0010G\u001a%\u0010H\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bH\u0010G\u001a%\u0010I\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bI\u0010G\u001a%\u0010J\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bJ\u0010G\u001a%\u0010K\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bK\u0010G\u001a%\u0010M\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bM\u0010N\u001a%\u0010O\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bO\u0010N\u001a%\u0010P\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bP\u0010N\u001a%\u0010Q\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bQ\u0010N\u001a%\u0010R\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bR\u0010N\u001a%\u0010T\u001a\u00020+2\u0006\u0010B\u001a\u00020S2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bT\u0010U\u001a%\u0010W\u001a\u00020+2\u0006\u0010B\u001a\u00020V2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bW\u0010X\u001a\u0015\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b\\\u0010]\u001a\u0015\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\b\\\u0010_\u001a\u0015\u0010`\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b`\u0010a\u001a\u0015\u0010`\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\b`\u0010b\u001a\u0015\u0010d\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bd\u0010e\u001a\u0015\u0010d\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bd\u0010f\u001a\u0015\u0010h\u001a\u00020g2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bh\u0010i\u001a\u0015\u0010h\u001a\u00020g2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bh\u0010j\u001a\u0015\u0010k\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bk\u0010a\u001a\u0015\u0010k\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bk\u0010b\u001a\u0015\u0010l\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bl\u0010e\u001a\u0015\u0010l\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bl\u0010f\u001a\u0015\u0010m\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bm\u0010a\u001a\u0015\u0010m\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bm\u0010b\u001a\u0015\u0010n\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bn\u0010e\u001a\u0015\u0010n\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bn\u0010f\u001a\u0015\u0010o\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bo\u0010a\u001a\u0015\u0010o\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bo\u0010b\u001a\u0015\u0010p\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bp\u0010e\u001a\u0015\u0010p\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bp\u0010f\u001a\u0015\u0010q\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bq\u0010a\u001a\u0015\u0010q\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bq\u0010b\u001a\u0015\u0010r\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\br\u0010e\u001a\u0015\u0010r\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\br\u0010f\u001a!\u0010v\u001a\u00020\"*\u00060sj\u0002`t2\b\u0010u\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bv\u0010w\u001a\u0017\u0010x\u001a\u00020/*\u00060sj\u0002`tH\u0000¢\u0006\u0004\bx\u0010y\u001a!\u0010v\u001a\u00020\"*\u00060zj\u0002`{2\b\u0010u\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bv\u0010|\u001a\u0017\u0010x\u001a\u00020/*\u00060zj\u0002`{H\u0000¢\u0006\u0004\bx\u0010}\"\u0014\u0010~\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010\u007f\"$\u0010\u0083\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0080\u0001*\u00020\u001f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, m3636d2 = {"T", "", "newMutableList", "()Ljava/util/List;", "K", "V", "", "newMutableMap", "()Ljava/util/Map;", "", "name", "", "list", "copyOf", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "", "map", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;)Ljava/util/Map;", "immutableCopyOf", "immutableCopyOfMapWithStructValues", "value", "immutableCopyOfStruct", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "-redactElements", "(Ljava/util/List;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/List;", "redactElements", "(Ljava/util/Map;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/Map;", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "args", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "missingRequiredFields", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "", "checkElementsNotNull", "(Ljava/util/List;)V", "(Ljava/util/Map;)V", "", "countNonNull", "(Ljava/lang/Object;Ljava/lang/Object;)I", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I", "d", "rest", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "values", "(Ljava/util/List;)Ljava/lang/String;", "oneOfName", "boxedOneOfClassName", "fieldName", "boxedOneOfKeyFieldName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "boxedOneOfKeysFieldName", "", ResourceTypes.ARRAY, "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "tag", "encodeArray_int32", "([ILcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint32", "encodeArray_sint32", "encodeArray_fixed32", "encodeArray_sfixed32", "", "encodeArray_int64", "([JLcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint64", "encodeArray_sint64", "encodeArray_fixed64", "encodeArray_sfixed64", "", "encodeArray_float", "([FLcom/squareup/wire/ReverseProtoWriter;I)V", "", "encodeArray_double", "([DLcom/squareup/wire/ReverseProtoWriter;I)V", "Lcom/squareup/wire/ProtoReader32;", "reader", "", "decodePrimitive_double", "(Lcom/squareup/wire/ProtoReader32;)D", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)D", "decodePrimitive_fixed32", "(Lcom/squareup/wire/ProtoReader32;)I", "(Lcom/squareup/wire/ProtoReader;)I", "", "decodePrimitive_fixed64", "(Lcom/squareup/wire/ProtoReader32;)J", "(Lcom/squareup/wire/ProtoReader;)J", "", "decodePrimitive_float", "(Lcom/squareup/wire/ProtoReader32;)F", "(Lcom/squareup/wire/ProtoReader;)F", "decodePrimitive_int32", "decodePrimitive_int64", "decodePrimitive_sfixed32", "decodePrimitive_sfixed64", "decodePrimitive_sint32", "decodePrimitive_sint64", "decodePrimitive_uint32", "decodePrimitive_uint64", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "other", "commonEquals", "(Lj$/time/Instant;Ljava/lang/Object;)Z", "commonHashCode", "(Lj$/time/Instant;)I", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "(Lj$/time/Duration;Ljava/lang/Object;)Z", "(Lj$/time/Duration;)I", "ESCAPED_CHARS", "Ljava/lang/String;", "Lkotlin/reflect/KClass;", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)Lkotlin/reflect/KClass;", "typeName", "wire-runtime"}, m3637k = 5, m3638mv = {2, 0, 0}, m3640xi = 48, m3641xs = "com/squareup/wire/internal/Internal")
@SourceDebugExtension
/* renamed from: com.squareup.wire.internal.Internal__InternalKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class Internal2 {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(CollectionsKt.emptyList());
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    @Deprecated
    public static final <T> List<T> copyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(list);
        return Internal.copyOf(list);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return new MutableOnWriteList(list);
        }
        return new ArrayList(list);
    }

    @Deprecated
    public static final <K, V> Map<K, V> copyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(map);
        return Internal.copyOf(map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LinkedHashMap(map);
    }

    public static final <T> List<T> immutableCopyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (!immutableList.contains(null)) {
            return immutableList;
        }
        throw new IllegalArgumentException((name + ".contains(null)").toString());
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNull(setKeySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (setKeySet.contains(null)) {
            throw new IllegalArgumentException((name + ".containsKey(null)").toString());
        }
        Collection<V> collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNull(collectionValues, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (!collectionValues.contains(null)) {
            Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
            return mapUnmodifiableMap;
        }
        throw new IllegalArgumentException((name + ".containsValue(null)").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException((name + ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        Intrinsics.checkNotNull(mapUnmodifiableMap, "null cannot be cast to non-null type kotlin.collections.Map<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues, V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues>");
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(String name, T t) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (t == null || (t instanceof Boolean) || (t instanceof Double) || (t instanceof String)) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            T t2 = (T) Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(t2, "unmodifiableList(...)");
            return t2;
        }
        if (t instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
            }
            T t3 = (T) Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(t3, "unmodifiableMap(...)");
            return t3;
        }
        throw new IllegalArgumentException("struct value " + name + " must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + getTypeName$Internal__InternalKt(t) + ": " + t);
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return Reflection.getOrCreateKotlinClass(obj.getClass());
    }

    @JvmName
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m26825redactElements(List<? extends T> list, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && Intrinsics.areEqual(obj, obj2);
        }
        return true;
    }

    public static final IllegalStateException missingRequiredFields(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int progressionLastElement = progressionUtil.getProgressionLastElement(0, args.length - 1, 2);
        String str = "";
        if (progressionLastElement >= 0) {
            while (true) {
                if (args[i] == null) {
                    if (sb.length() > 0) {
                        str = Constants.RequestParamsKeys.SESSION_ID_KEY;
                    }
                    sb.append("\n  ");
                    sb.append(args[i + 1]);
                }
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        throw new IllegalStateException("Required field" + str + " not set:" + string2);
    }

    public static final void checkElementsNotNull(List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                throw new NullPointerException("Element at index " + i + " is null");
            }
        }
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        int i = obj != null ? 1 : 0;
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }

    public static final String sanitize(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (StringsKt.contains$default((CharSequence) ESCAPED_CHARS, cCharAt, false, 2, (Object) null)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: Internal.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2 */
    /* synthetic */ class C424592 extends FunctionReferenceImpl implements Function1<String, String> {
        public static final C424592 INSTANCE = new C424592();

        C424592() {
            super(1, Internal2.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Internal.sanitize(p0);
        }
    }

    public static final String sanitize(List<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return CollectionsKt.joinToString$default(values, null, "[", "]", 0, null, C424592.INSTANCE, 25, null);
    }

    public static final String boxedOneOfClassName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        if (oneOfName.length() <= 0) {
            return oneOfName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) CharsKt.titlecase(oneOfName.charAt(0)));
        String strSubstring = oneOfName.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final String boxedOneOfKeyFieldName(String oneOfName, String fieldName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        String upperCase = (oneOfName + "_keys").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final void encodeArray_int32(int[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeSignedVarint32$wire_runtime(array2[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeVarint32(array2[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint32(int[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(array2[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeFixed32(array2[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed32(array2, writer, i);
    }

    public static final void encodeArray_int64(long[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeVarint64(array2[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_int64(array2, writer, i);
    }

    public static final void encodeArray_sint64(long[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(array2[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeFixed64(array2[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed64(long[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed64(array2, writer, i);
    }

    public static final void encodeArray_float(float[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(array2[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_double(double[] array2, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array2.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array2.length - 1; -1 < length; length--) {
            writer.writeFixed64(Double.doubleToLongBits(array2[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final double decodePrimitive_double(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final double decodePrimitive_double(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_fixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_fixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final float decodePrimitive_float(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_int32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_int64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final int decodePrimitive_sint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final long decodePrimitive_sint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_uint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_uint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return (Long.hashCode(instant.getEpochSecond()) * 31) + Integer.hashCode(instant.getNano());
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    public static final int commonHashCode(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return (Long.hashCode(duration.getSeconds()) * 31) + Integer.hashCode(duration.getNano());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m26826redactElements(Map<K, ? extends V> map, ProtoAdapter<V> adapter) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }
}
