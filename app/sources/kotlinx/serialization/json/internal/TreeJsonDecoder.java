package kotlinx.serialization.json.internal;

import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.PolymorphicSerializer2;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKinds;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.descriptors.SerialKinds3;
import kotlinx.serialization.descriptors.SerialKinds4;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.Tagged;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement4;
import kotlinx.serialization.json.JsonElement5;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: TreeJsonDecoder.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010.\u001a\u00020!H\u0014¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b6\u00105J\u0017\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bK\u0010\u0016J\u001f\u0010N\u001a\u00020M2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010L\u001a\u00020!H\u0014¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020M2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0001\u0003abc¨\u0006d"}, m3636d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonPrimitive;", "literal", "primitive", "tag", "", "unparsedPrimitive", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "currentObject", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "renderTagStack", "(Ljava/lang/String;)Ljava/lang/String;", "decodeJsonElement", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "currentElement", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "decodeTaggedEnum", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeTaggedNull", "(Ljava/lang/String;)Ljava/lang/Void;", "decodeTaggedNotNullMark", "(Ljava/lang/String;)Z", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/String;)B", "", "decodeTaggedShort", "(Ljava/lang/String;)S", "decodeTaggedInt", "(Ljava/lang/String;)I", "", "decodeTaggedLong", "(Ljava/lang/String;)J", "", "decodeTaggedFloat", "(Ljava/lang/String;)F", "", "decodeTaggedDouble", "(Ljava/lang/String;)D", "", "decodeTaggedChar", "(Ljava/lang/String;)C", "decodeTaggedString", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "decodeTaggedInline", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "getValue", "Ljava/lang/String;", "getPolymorphicDiscriminator", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, reason: use source file name */
/* loaded from: classes14.dex */
abstract class TreeJsonDecoder extends Tagged implements JsonDecoder {

    @JvmField
    protected final JsonConfiguration configuration;
    private final Json json;
    private final String polymorphicDiscriminator;
    private final JsonElement value;

    public /* synthetic */ TreeJsonDecoder(Json json, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }

    @Override // kotlinx.serialization.internal.Tagged
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract JsonElement currentElement(String tag);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public Void decodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public abstract JsonElement getValue();

    public /* synthetic */ TreeJsonDecoder(Json json, JsonElement jsonElement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.json;
    }

    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    private TreeJsonDecoder(Json json, JsonElement jsonElement, String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2, kotlinx.serialization.encoding.Decoding
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    protected final JsonElement currentObject() {
        JsonElement jsonElementCurrentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (jsonElementCurrentElement = currentElement(currentTagOrNull)) == null) ? getValue() : jsonElementCurrentElement;
    }

    public final String renderTagStack(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
    public Decoding beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentObject = currentObject();
        SerialKinds3 kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, SerialKinds4.LIST.INSTANCE) || (kind instanceof SerialKinds)) {
            Json json = getJson();
            String serialName = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonElement2) {
                return new TreeJsonDecoder4(json, (JsonElement2) jsonElementCurrentObject);
            }
            throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement2.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        if (!Intrinsics.areEqual(kind, SerialKinds4.MAP.INSTANCE)) {
            Json json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonElement6) {
                return new TreeJsonDecoder3(json2, (JsonElement6) jsonElementCurrentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement6.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName2 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        Json json3 = getJson();
        SerialDescriptor serialDescriptorCarrierDescriptor = WriteMode2.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        SerialKinds3 kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof SerialKinds2) || Intrinsics.areEqual(kind2, SerialKinds3.ENUM.INSTANCE)) {
            Json json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonElement6) {
                return new TreeJsonDecoder5(json4, (JsonElement6) jsonElementCurrentObject);
            }
            throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement6.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName3 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptions4.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
        }
        Json json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (jsonElementCurrentObject instanceof JsonElement2) {
            return new TreeJsonDecoder4(json5, (JsonElement2) jsonElementCurrentObject);
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement2.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName4 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
    public <T> T decodeSerializableValue(KSerializer2<? extends T> deserializer) {
        JsonElement7 jsonPrimitive;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strClassDiscriminator = Polymorphic2.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), getJson());
        JsonElement jsonElementDecodeJsonElement = decodeJsonElement();
        String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (jsonElementDecodeJsonElement instanceof JsonElement6) {
            JsonElement6 jsonElement6 = (JsonElement6) jsonElementDecodeJsonElement;
            JsonElement jsonElement = (JsonElement) jsonElement6.get((Object) strClassDiscriminator);
            try {
                KSerializer2 kSerializer2FindPolymorphicSerializer = PolymorphicSerializer2.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) == null) ? null : JsonElement3.getContentOrNull(jsonPrimitive));
                Intrinsics.checkNotNull(kSerializer2FindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) TreeJsonDecoder6.readPolymorphicJson(getJson(), strClassDiscriminator, jsonElement6, kSerializer2FindPolymorphicSerializer);
            } catch (SerializationExceptions2 e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                throw JsonExceptions4.JsonDecodingException(-1, message, jsonElement6.toString());
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement6.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementDecodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), jsonElementDecodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonElement5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public boolean decodeTaggedBoolean(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                Boolean booleanOrNull = JsonElement3.getBooleanOrNull(jsonElement7);
                if (booleanOrNull == null) {
                    unparsedPrimitive(jsonElement7, InquiryField.BooleanField.TYPE, tag);
                    throw new ExceptionsH();
                }
                return booleanOrNull.booleanValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, InquiryField.BooleanField.TYPE, tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of " + InquiryField.BooleanField.TYPE + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public byte decodeTaggedByte(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                int i = JsonElement3.getInt(jsonElement7);
                Byte bValueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
                if (bValueOf == null) {
                    unparsedPrimitive(jsonElement7, "byte", tag);
                    throw new ExceptionsH();
                }
                return bValueOf.byteValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "byte", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of byte at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public char decodeTaggedChar(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                return StringsKt.single(jsonElement7.getContent());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "char", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of char at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public double decodeTaggedDouble(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                double d = JsonElement3.getDouble(jsonElement7);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return d;
                }
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw JsonExceptions4.InvalidFloatingPointDecoded(Double.valueOf(d), tag, currentObject().toString());
                }
                return d;
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "double", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of double at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public float decodeTaggedFloat(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                float f = JsonElement3.getFloat(jsonElement7);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return f;
                }
                if (Float.isInfinite(f) || Float.isNaN(f)) {
                    throw JsonExceptions4.InvalidFloatingPointDecoded(Float.valueOf(f), tag, currentObject().toString());
                }
                return f;
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "float", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of float at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public int decodeTaggedInt(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                return JsonElement3.getInt(jsonElement7);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "int", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of int at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public long decodeTaggedLong(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                return JsonElement3.getLong(jsonElement7);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "long", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of long at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public short decodeTaggedShort(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            try {
                int i = JsonElement3.getInt(jsonElement7);
                Short shValueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
                if (shValueOf == null) {
                    unparsedPrimitive(jsonElement7, "short", tag);
                    throw new ExceptionsH();
                }
                return shValueOf.shortValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonElement7, "short", tag);
                throw new ExceptionsH();
            }
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of short at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    private final Void unparsedPrimitive(JsonElement7 literal, String primitive, String tag) {
        StringBuilder sb;
        String str;
        if (StringsKt.startsWith$default(primitive, Constants.RequestParamsKeys.PACKAGE_NAME_KEY, false, 2, (Object) null)) {
            sb = new StringBuilder();
            str = "an ";
        } else {
            sb = new StringBuilder();
            str = "a ";
        }
        sb.append(str);
        sb.append(primitive);
        throw JsonExceptions4.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + sb.toString() + " value at element: " + renderTagStack(tag), currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = getJson();
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonElement7) {
            return JsonNamesMap.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonElement7) jsonElementCurrentElement).getContent(), null, 4, null);
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public boolean decodeTaggedNotNullMark(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonElement5.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public String decodeTaggedString(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonElement7) {
            JsonElement7 jsonElement7 = (JsonElement7) jsonElementCurrentElement;
            if (!(jsonElement7 instanceof JsonElement4)) {
                throw JsonExceptions4.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
            }
            JsonElement4 jsonElement4 = (JsonElement4) jsonElement7;
            if (!jsonElement4.getIsString() && !getJson().getConfiguration().getIsLenient()) {
                throw JsonExceptions4.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", currentObject().toString());
            }
            return jsonElement4.getContent();
        }
        throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of string at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.Tagged3
    public Decoding2 decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoder2.isUnsignedNumber(inlineDescriptor)) {
            Json json = getJson();
            JsonElement jsonElementCurrentElement = currentElement(tag);
            String serialName = inlineDescriptor.getSerialName();
            if (jsonElementCurrentElement instanceof JsonElement7) {
                return new StreamingJsonDecoder2(StringJsonLexer2.StringJsonLexer(json, ((JsonElement7) jsonElementCurrentElement).getContent()), getJson());
            }
            throw JsonExceptions4.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement7.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
        }
        return super.decodeTaggedInline((TreeJsonDecoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.Tagged3, kotlinx.serialization.encoding.Decoding2
    public Decoding2 decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new TreeJsonDecoder2(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }
}
