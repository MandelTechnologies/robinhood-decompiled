package com.robinhood.idl.serialization.uri;

import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.SerialFormat3;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKinds4;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Tagged;
import kotlinx.serialization.internal.Tagged2;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilders3;

/* compiled from: UriFormat.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002 !B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f2\u0006\u0010\r\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\u000eJ)\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0013J7\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f2\u0006\u0010\r\u001a\u0002H\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0002\u0010\u0018J'\u0010\u0019\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\u00112\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/idl/serialization/uri/UriFormat;", "Lkotlinx/serialization/StringFormat;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "<init>", "(Lkotlinx/serialization/modules/SerializersModule;)V", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeToString", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromString", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "string", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "encodeToUri", "Landroid/net/Uri;", "baseUri", PlaceTypes.ROUTE, "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "decodeFromUri", "uri", "(Lkotlinx/serialization/DeserializationStrategy;Landroid/net/Uri;)Ljava/lang/Object;", "parseQueryString", "", "", "query", "UriEncoder", "UriDecoder", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class UriFormat implements SerialFormat3 {
    private final SerializersModule serializersModule;

    /* JADX WARN: Multi-variable type inference failed */
    public UriFormat() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UriFormat(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "serializersModule");
        this.serializersModule = serializersModule;
    }

    public /* synthetic */ UriFormat(SerializersModule serializersModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SerializersModuleBuilders3.EmptySerializersModule() : serializersModule);
    }

    @Override // kotlinx.serialization.SerialFormat
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.SerialFormat3
    public <T> String encodeToString(KSerializer3<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        UriEncoder uriEncoder = new UriEncoder();
        uriEncoder.encodeSerializableValue(serializer, value);
        return uriEncoder.buildQueryString();
    }

    @Override // kotlinx.serialization.SerialFormat3
    public <T> T decodeFromString(KSerializer2<? extends T> deserializer, String string2) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string2, "string");
        return (T) new UriDecoder(this, parseQueryString(string2), "").decodeSerializableValue(deserializer);
    }

    public final <T> Uri encodeToUri(KSerializer3<? super T> serializer, T value, Uri baseUri, String route) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(baseUri, "baseUri");
        Intrinsics.checkNotNullParameter(route, "route");
        String strEncodeToString = encodeToString(serializer, value);
        Uri.Builder builderBuildUpon = baseUri.buildUpon();
        String host = baseUri.getHost();
        if (host == null || host.length() == 0) {
            builderBuildUpon.authority(route);
        } else {
            builderBuildUpon.appendPath(route);
        }
        builderBuildUpon.encodedQuery(strEncodeToString);
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    public final <T> T decodeFromUri(KSerializer2<? extends T> deserializer, Uri uri) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String query = uri.getQuery();
        if (query == null) {
            query = "";
        }
        return (T) decodeFromString(deserializer, query);
    }

    private final Map<String, List<String>> parseQueryString(String query) {
        if (StringsKt.isBlank(query)) {
            return MapsKt.emptyMap();
        }
        List listSplit$default = StringsKt.split$default((CharSequence) query, new char[]{'&'}, false, 0, 6, (Object) null);
        ArrayList<Tuples2> arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new char[]{'='}, false, 2, 2, (Object) null);
            Tuples2 tuples2M3642to = listSplit$default2.size() == 2 ? Tuples4.m3642to(Uri.decode((String) listSplit$default2.get(0)), Uri.decode((String) listSplit$default2.get(1))) : null;
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Tuples2 tuples2 : arrayList) {
            Object first = tuples2.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "<get-first>(...)");
            String str = (String) first;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((String) tuples2.getSecond());
        }
        return linkedHashMap;
    }

    /* compiled from: UriFormat.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0018H\u0002R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/idl/serialization/uri/UriFormat$UriEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "<init>", "(Lcom/robinhood/idl/serialization/uri/UriFormat;)V", "queryParams", "", "", "", "currentDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "buildQueryString", "encodeTaggedValue", "", "tag", "value", "", "encodeTaggedNull", "encodeTaggedEnum", "enumDescriptor", "ordinal", "", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "composeName", "parentName", "childName", "getSerialNameOrElementName", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class UriEncoder extends Tagged2 {
        private SerialDescriptor currentDescriptor;
        private final Map<String, List<String>> queryParams = new LinkedHashMap();
        private final SerializersModule serializersModule;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged4
        public void encodeTaggedNull(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
        }

        public UriEncoder() {
            this.serializersModule = UriFormat.this.getSerializersModule();
        }

        @Override // kotlinx.serialization.internal.Tagged4, kotlinx.serialization.encoding.Encoding4
        public SerializersModule getSerializersModule() {
            return this.serializersModule;
        }

        public final String buildQueryString() {
            Map<String, List<String>> map = this.queryParams;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (String str : value) {
                    arrayList2.add(Uri.encode(key) + "=" + Uri.encode(str));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            return CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged4
        public void encodeTaggedValue(String tag, Object value) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(value, "value");
            Map<String, List<String>> map = this.queryParams;
            List<String> arrayList = map.get(tag);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(tag, arrayList);
            }
            arrayList.add(value.toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged4
        public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int ordinal) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
            String elementName = enumDescriptor.getElementName(ordinal);
            Map<String, List<String>> map = this.queryParams;
            List<String> arrayList = map.get(tag);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(tag, arrayList);
            }
            arrayList.add(elementName);
        }

        @Override // kotlinx.serialization.internal.Tagged4, kotlinx.serialization.encoding.Encoding4
        public Encoding3 beginStructure(SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.currentDescriptor = descriptor;
            return this;
        }

        @Override // kotlinx.serialization.internal.Tagged2
        protected String composeName(String parentName, String childName) {
            String serialNameOrElementName;
            Intrinsics.checkNotNullParameter(parentName, "parentName");
            Intrinsics.checkNotNullParameter(childName, "childName");
            if (parentName.length() > 0 && new Regex("\\d+").matches(childName)) {
                return parentName;
            }
            SerialDescriptor serialDescriptor = this.currentDescriptor;
            if (serialDescriptor != null) {
                int elementsCount = serialDescriptor.getElementsCount();
                int i = 0;
                while (true) {
                    if (i >= elementsCount) {
                        serialNameOrElementName = childName;
                        break;
                    }
                    if (Intrinsics.areEqual(serialDescriptor.getElementName(i), childName)) {
                        serialNameOrElementName = getSerialNameOrElementName(serialDescriptor, i);
                        break;
                    }
                    i++;
                }
                if (serialNameOrElementName != null) {
                    childName = serialNameOrElementName;
                }
            }
            if (parentName.length() == 0) {
                return childName;
            }
            return parentName + "." + childName;
        }

        private final String getSerialNameOrElementName(SerialDescriptor descriptor, int index) {
            try {
                for (Annotation annotation : descriptor.getElementAnnotations(index)) {
                    if (annotation instanceof SerialName) {
                        return ((SerialName) annotation).value();
                    }
                }
            } catch (Exception unused) {
            }
            return descriptor.getElementName(index);
        }
    }

    /* compiled from: UriFormat.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'H\u0014J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010)\u001a\u00020\u0017H\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010+\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020'H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0004H\u0002J\u0018\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020'2\u0006\u00102\u001a\u00020\u000eH\u0002J\u0018\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0014R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/idl/serialization/uri/UriFormat$UriDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "queryParams", "", "", "", "parentContext", "<init>", "(Lcom/robinhood/idl/serialization/uri/UriFormat;Ljava/util/Map;Ljava/lang/String;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "currentIndex", "", "collectionIndex", "currentCollectionTag", "decodeTaggedValue", "", "tag", "decodeTaggedString", "findValueForTag", "decodeTaggedBoolean", "", "decodeTaggedByte", "", "decodeTaggedShort", "", "decodeTaggedInt", "decodeTaggedLong", "", "decodeTaggedFloat", "", "decodeTaggedDouble", "", "decodeTaggedChar", "", "decodeTaggedEnum", "enumDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeTaggedNotNullMark", "decodeNotNullMark", "decodeCollectionSize", "descriptor", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeElementIndex", "hasNestedParameters", "prefix", "getSerialNameOrElementName", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "composeName", "parentName", "childName", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class UriDecoder extends Tagged {
        private int collectionIndex;
        private String currentCollectionTag;
        private int currentIndex;
        private final String parentContext;
        private final Map<String, List<String>> queryParams;
        private final SerializersModule serializersModule;
        final /* synthetic */ UriFormat this$0;

        @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
        public boolean decodeNotNullMark() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UriDecoder(UriFormat uriFormat, Map<String, ? extends List<String>> queryParams, String parentContext) {
            Intrinsics.checkNotNullParameter(queryParams, "queryParams");
            Intrinsics.checkNotNullParameter(parentContext, "parentContext");
            this.this$0 = uriFormat;
            this.queryParams = queryParams;
            this.parentContext = parentContext;
            this.serializersModule = uriFormat.getSerializersModule();
        }

        public /* synthetic */ UriDecoder(UriFormat uriFormat, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uriFormat, map, (i & 2) != 0 ? "" : str);
        }

        @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2, kotlinx.serialization.encoding.Decoding
        public SerializersModule getSerializersModule() {
            return this.serializersModule;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public Object decodeTaggedValue(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag != null) {
                return strFindValueForTag;
            }
            throw new SerializationExceptions2("Missing parameter: " + tag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public String decodeTaggedString(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag != null) {
                return strFindValueForTag;
            }
            throw new SerializationExceptions2("Missing parameter: " + tag);
        }

        private final String findValueForTag(String tag) {
            if (this.parentContext.length() != 0) {
                tag = this.parentContext + "." + tag;
            }
            String str = this.currentCollectionTag;
            if (str != null) {
                List<String> list = this.queryParams.get(str);
                if (list == null || this.collectionIndex >= list.size()) {
                    return null;
                }
                String str2 = list.get(this.collectionIndex);
                this.collectionIndex++;
                return str2;
            }
            List<String> list2 = this.queryParams.get(tag);
            if (list2 != null) {
                return (String) CollectionsKt.first((List) list2);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public boolean decodeTaggedBoolean(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(strFindValueForTag);
            if (booleanStrictOrNull != null) {
                return booleanStrictOrNull.booleanValue();
            }
            throw new SerializationExceptions2("Invalid boolean value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public byte decodeTaggedByte(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Byte byteOrNull = StringsKt.toByteOrNull(strFindValueForTag);
            if (byteOrNull != null) {
                return byteOrNull.byteValue();
            }
            throw new SerializationExceptions2("Invalid byte value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public short decodeTaggedShort(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Short shortOrNull = StringsKt.toShortOrNull(strFindValueForTag);
            if (shortOrNull != null) {
                return shortOrNull.shortValue();
            }
            throw new SerializationExceptions2("Invalid short value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public int decodeTaggedInt(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Integer intOrNull = StringsKt.toIntOrNull(strFindValueForTag);
            if (intOrNull != null) {
                return intOrNull.intValue();
            }
            throw new SerializationExceptions2("Invalid int value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public long decodeTaggedLong(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Long longOrNull = StringsKt.toLongOrNull(strFindValueForTag);
            if (longOrNull != null) {
                return longOrNull.longValue();
            }
            throw new SerializationExceptions2("Invalid long value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public float decodeTaggedFloat(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Float floatOrNull = StringsKt.toFloatOrNull(strFindValueForTag);
            if (floatOrNull != null) {
                return floatOrNull.floatValue();
            }
            throw new SerializationExceptions2("Invalid float value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public double decodeTaggedDouble(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            Double doubleOrNull = StringsKt.toDoubleOrNull(strFindValueForTag);
            if (doubleOrNull != null) {
                return doubleOrNull.doubleValue();
            }
            throw new SerializationExceptions2("Invalid double value for " + tag + ": " + strFindValueForTag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public char decodeTaggedChar(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            if (strFindValueForTag.length() != 1) {
                throw new SerializationExceptions2("Invalid char value for " + tag + ": " + strFindValueForTag);
            }
            return strFindValueForTag.charAt(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
            String strFindValueForTag = findValueForTag(tag);
            if (strFindValueForTag == null) {
                throw new SerializationExceptions2("Missing parameter: " + tag);
            }
            int elementsCount = enumDescriptor.getElementsCount();
            for (int i = 0; i < elementsCount; i++) {
                if (Intrinsics.areEqual(enumDescriptor.getElementName(i), strFindValueForTag)) {
                    return i;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.Tagged3
        public boolean decodeTaggedNotNullMark(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return findValueForTag(tag) != null;
        }

        @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding
        public int decodeCollectionSize(SerialDescriptor descriptor) {
            String currentTag;
            String str;
            List<String> list;
            String str2;
            String str3;
            List<String> list2;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            try {
                currentTag = getCurrentTag();
                if (this.parentContext.length() == 0) {
                    str = currentTag;
                } else {
                    str = this.parentContext + "." + currentTag;
                }
                int elementIndex = descriptor.getElementIndex(currentTag);
                ArrayList arrayList = new ArrayList();
                if (elementIndex != -1) {
                    String serialNameOrElementName = getSerialNameOrElementName(descriptor, elementIndex);
                    String elementName = descriptor.getElementName(elementIndex);
                    if (this.parentContext.length() == 0) {
                        str2 = serialNameOrElementName;
                    } else {
                        str2 = this.parentContext + "." + serialNameOrElementName;
                    }
                    if (this.parentContext.length() == 0) {
                        str3 = elementName;
                    } else {
                        str3 = this.parentContext + "." + elementName;
                    }
                    List<String> list3 = this.queryParams.get(str2);
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                    if (!Intrinsics.areEqual(serialNameOrElementName, elementName) && (list2 = this.queryParams.get(str3)) != null) {
                        arrayList.addAll(list2);
                    }
                    if (!arrayList.isEmpty()) {
                        this.currentCollectionTag = str2;
                        this.collectionIndex = 0;
                        Map<String, List<String>> map = this.queryParams;
                        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.List<kotlin.String>>");
                        TypeIntrinsics.asMutableMap(map).put(str2, arrayList);
                        return arrayList.size();
                    }
                }
                list = this.queryParams.get(str);
            } catch (Exception unused) {
            }
            if (list != null) {
                this.currentCollectionTag = str;
                this.collectionIndex = 0;
                return list.size();
            }
            List<String> list4 = this.queryParams.get(currentTag);
            if (list4 != null) {
                this.currentCollectionTag = currentTag;
                this.collectionIndex = 0;
                return list4.size();
            }
            return -1;
        }

        @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
        public Decoding beginStructure(SerialDescriptor descriptor) {
            String str;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            String currentTag = "";
            if (Intrinsics.areEqual(descriptor.getKind(), SerialKinds4.LIST.INSTANCE)) {
                try {
                    currentTag = getCurrentTag();
                } catch (Exception unused) {
                }
                if (this.parentContext.length() == 0) {
                    str = currentTag;
                } else {
                    str = this.parentContext + "." + currentTag;
                }
                if (this.queryParams.containsKey(str)) {
                    this.currentCollectionTag = str;
                    this.collectionIndex = 0;
                } else if (this.queryParams.containsKey(currentTag)) {
                    this.currentCollectionTag = currentTag;
                    this.collectionIndex = 0;
                }
                return this;
            }
            try {
                currentTag = getCurrentTag();
            } catch (Exception unused2) {
            }
            if (this.parentContext.length() != 0) {
                if (currentTag.length() == 0) {
                    currentTag = this.parentContext;
                } else {
                    currentTag = this.parentContext + "." + currentTag;
                }
            }
            return new UriDecoder(this.this$0, this.queryParams, currentTag);
        }

        @Override // kotlinx.serialization.encoding.Decoding
        public int decodeElementIndex(SerialDescriptor descriptor) {
            List<String> list;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (Intrinsics.areEqual(descriptor.getKind(), SerialKinds4.LIST.INSTANCE)) {
                String str = this.currentCollectionTag;
                if (str == null || (list = this.queryParams.get(str)) == null || this.collectionIndex >= list.size()) {
                    return -1;
                }
                return this.collectionIndex;
            }
            while (this.currentIndex < descriptor.getElementsCount()) {
                String serialNameOrElementName = getSerialNameOrElementName(descriptor, this.currentIndex);
                if (this.parentContext.length() != 0) {
                    serialNameOrElementName = this.parentContext + "." + serialNameOrElementName;
                }
                boolean zContainsKey = this.queryParams.containsKey(serialNameOrElementName);
                boolean zHasNestedParameters = hasNestedParameters(serialNameOrElementName);
                if (zContainsKey || zHasNestedParameters) {
                    int i = this.currentIndex;
                    this.currentIndex = i + 1;
                    return i;
                }
                if (descriptor.isElementOptional(this.currentIndex)) {
                    this.currentIndex++;
                } else {
                    int i2 = this.currentIndex;
                    this.currentIndex = i2 + 1;
                    return i2;
                }
            }
            return -1;
        }

        private final boolean hasNestedParameters(String prefix) {
            Set<String> setKeySet = this.queryParams.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return false;
            }
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default((String) it.next(), prefix + ".", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        private final String getSerialNameOrElementName(SerialDescriptor descriptor, int index) {
            try {
                for (Annotation annotation : descriptor.getElementAnnotations(index)) {
                    if (annotation instanceof SerialName) {
                        return ((SerialName) annotation).value();
                    }
                }
            } catch (Exception unused) {
            }
            return descriptor.getElementName(index);
        }

        @Override // kotlinx.serialization.internal.Tagged
        protected String composeName(String parentName, String childName) {
            Intrinsics.checkNotNullParameter(parentName, "parentName");
            Intrinsics.checkNotNullParameter(childName, "childName");
            if (parentName.length() == 0) {
                return childName;
            }
            return parentName + "." + childName;
        }
    }
}
