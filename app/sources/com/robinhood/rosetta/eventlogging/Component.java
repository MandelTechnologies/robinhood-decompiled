package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.Component;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Component.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Component;", "Lcom/squareup/wire/Message;", "", "component_type", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Ljava/lang/String;Lokio/ByteString;)V", "getComponent_type", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getIdentifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ComponentType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Component extends Message {

    @JvmField
    public static final ProtoAdapter<Component> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component$ComponentType#ADAPTER", jsonName = "componentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ComponentType component_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String identifier;

    public Component() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24133newBuilder();
    }

    public final ComponentType getComponent_type() {
        return this.component_type;
    }

    public /* synthetic */ Component(ComponentType componentType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ComponentType.COMPONENT_TYPE_UNSPECIFIED : componentType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Component(ComponentType component_type, String identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(component_type, "component_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.component_type = component_type;
        this.identifier = identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24133newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Component)) {
            return false;
        }
        Component component = (Component) other;
        return Intrinsics.areEqual(unknownFields(), component.unknownFields()) && this.component_type == component.component_type && Intrinsics.areEqual(this.identifier, component.identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.component_type.hashCode()) * 37) + this.identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("component_type=" + this.component_type);
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Component{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Component copy$default(Component component, ComponentType componentType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            componentType = component.component_type;
        }
        if ((i & 2) != 0) {
            str = component.identifier;
        }
        if ((i & 4) != 0) {
            byteString = component.unknownFields();
        }
        return component.copy(componentType, str, byteString);
    }

    public final Component copy(ComponentType component_type, String identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(component_type, "component_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Component(component_type, identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Component.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Component>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Component$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Component value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getComponent_type() != Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED) {
                    size += Component.ComponentType.ADAPTER.encodedSizeWithTag(1, value.getComponent_type());
                }
                return !Intrinsics.areEqual(value.getIdentifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIdentifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Component value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getComponent_type() != Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED) {
                    Component.ComponentType.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent_type());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Component value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                }
                if (value.getComponent_type() != Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED) {
                    Component.ComponentType.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Component decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Component.ComponentType componentTypeDecode = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Component(componentTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            componentTypeDecode = Component.ComponentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Component redact(Component value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Component.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Component.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bÏ\u0002\b\u0086\u0081\u0002\u0018\u0000 Ò\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002Ò\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002¨\u0006Ó\u0002"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COMPONENT_TYPE_UNSPECIFIED", "LOADING_PLACEHOLDER", "MAP", "QR_CODE", "INLINE_DEFINITION", "PUSH_NOTIFICATION", "MENU_ITEM", "EDUCATION_TOUR_TOOLTIP", "NEW_PRODUCT_CARD", "BALANCE_SECTION", "SHORTCUTS_FIRST_TIME_POPUP", "ACCOUNT_SWITCHER", "ACCOUNT_SWITCHER_BOTTOM_SHEET", "HOLDING_ROW", "PRICE_CHART", "RECURRING_ROW", "EXPLORE_ROW", "NOTIFICATION_CARD", "NOTIFICATION_CARD_STACK", "NOTIFICATION_COMPLETION_CARD", "SIDEBAR", "LIST_ROW", "LIST_HEADER", "SECTION_HEADER", "TOGGLE", "CARD", "SUCCESS_TOAST", "INFO_TAG", "FX_CONVERSION_TOOLTIP", "HERO_CARD", "TEXT_VIEW", "SEGMENTED_CONTROL", "TRADING_TRENDS_CHART", "SEGMENT", "TABLE", "HOLDING_SECTION", "SLIDER", "SCRUB_BAR", "STICKY_BOTTOM_SHEET", "LIVE_ACTIVITY", "BADGE", "STAKING_SECTION", "ADVANCED_ALERT_SETTINGS", "PRICE_ALERT_EDITOR", "ALERT_SETTING_ROW", "ALERT_SETTING_TOGGLE", "PRICE_ALERT_TYPE_SELECTOR", "CANCEL_ERROR_ALERT", "ERROR_ALERT", "ALERT", "ERROR_LOADING", "CANCEL_CONFIRMATION_ALERT", "ENABLE_PUSH_NOTIFICATIONS_ALERT", "CX_PHONE_UNAVAILABLE_ALERT", "CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET", "CX_CHAT_STATUS_BANNER", "CX_CHATBOT_BANNER", "UPDATE_EMPLOYER_INFO_ALERT", "DD_MANUAL_SETUP_ALERT", "EARLY_PAY_ENABLE_CONFIRMATION_ALERT", "EARLY_PAY_DISABLE_CONFIRMATION_ALERT", "EARLY_PAY_TOGGLE_LIMIT_ALERT", "ALERT_SHEET", "CX_CALL_STATUS_BANNER", "CONTACT_SIGNIN_BANNER", "INFO_BANNER", "HERO_BANNER", "STATUS_BANNER", "VERIFY_DEBIT_CARD_BANNER", "UPDATE_INVESTOR_PROFILE_BANNER", "ACCOUNT_CENTER_UPSELL_BANNER", "ADD_TO_LIST_BOTTOM_SHEET", "FEEDBACK_BOTTOM_SHEET", "DATE_PICKER_BOTTOM_SHEET", "BOTTOM_SHEET", "PASSKEY_ENROLLMENT_BOTTOM_SHEET", "KEYCHAIN_LOGIN_BOTTOM_SHEET", "GOLD_UPSELL_HOOK_DIALOG", "DONE_BUTTON", "CONTINUE_BUTTON", "BUTTON", "SKIP_BUTTON", "FILTERS_BUTTON", "ASSET_TICKER_BUTTON", "LINK_BUTTON", "BACK_BUTTON", "REVIEW_BUTTON", "RADIO_BUTTON", "DATE_RANGE_BUTTON", "CLOSE_BUTTON", "CANCEL_BUTTON", "DELETE_BUTTON", "NOT_YET_BUTTON", "HELP_BUTTON", "RECURRING_INVESTMENTS_BUTTON", "ASSET_CARD", "REDEMPTION_CARD", "RECOMMENDATIONS_BROWSE_CARD", "CRYPTO_NOTIFICATION_CARD", "SCREENER_PRESET_CARD", "BREAKING_NEWS_BANNER", "LIST_CHIP_GRID", "LIST_CAROUSEL", "CAROUSEL", "CHIP_GRID", "LIST_CHIP", "CHIP", "RECURRING_SUMMARY_DIALOG", "CALENDAR_DATE_PICKER", "SEARCH_RESULT_ROW", "ASSET_ROW", "ROW", "HISTORY_ROW", "RECENT_SEARCH_ROW", "L2E_ONBOARDING", "TEXT_FIELD", "SEARCH_BAR", "ERROR_TOAST", "HIDE_CX_CALL_STATUS_BANNER_TOAST", "ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST", "CX_CALL_ASSIGNED_TOAST", "MICROPHONE_PERMISSION_DIALOG", "PERMISSION_SETTINGS_DIALOG", "PROCESSING_ERROR_TOAST", "PERMISSION_ERROR_TOAST", "VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET", "CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET", "UPDATE_LIST_TOAST", "DD_SWITCHER_ENTRY_POINT", "SAFETY_LABEL_INFO_TAG", "TOOLTIP", "PERFORMANCE_SECTION", "STATS_SECTION", "GRAPH_SECTION", "POSITION_SECTION", "RESEARCH_REPORT_SECTION", "EARNINGS_SECTION", "PEOPLE_ALSO_VIEW_SECTION", "TRADE_BAR", "ETP_COMPOSITION_SECTION", "ABOUT_SECTION", "ANALYST_RATINGS_SECTION", "RELATED_LISTS_SECTION", "SHAREHOLDER_QA_SECTION", "HISTORY_SECTION", "ADVANCED_CHART", "UPCOMING_ACTIVITY_SECTION", "TAB", "NEWS_ROW", "HERO_NEWS_ROW", "VIDEO_ROW", "HERO_VIDEO_ROW", "FEATURE_CARD", "FEATURE_DISCOVERY_WIDGET", "MARKET_UPDATES", "MARKET_INDICATOR", "DIRECT_DEPOSIT_OPTION_ROW", "SETUP_DIRECT_DEPOSIT_ROW", "DEPOSIT_ROW", "WITHDRAW_ROW", "RECURRING_DEPOSITS_ROW", "PAY_BY_CHECK_ROW", "TRANSFER_ROW", "DROPDOWN_OPTION", "RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG", "PAYCHECK_SECTION", "DEBIT_CARD_KYC_BANNER", "ACH_TRANSFER_OPTION_CARD", "CRYPTO_TRANSFERS_ROW", "WIRE_TRANSFER_ROW", "WIRE_UPSELL", "TRANSFER_REWARD_PILL", "EARLY_PAY_TOGGLE", "EARLY_PAY_FAQ_ROW", "LIST_HERO", "LIST_ASSET_ROW", "LIST_CONTACTS", "LIST_VIDEO", "OPTION_INSTRUMENT_ROW", "OPTION_UNTRADABLE_INFO_BAR", "OPTION_NO_MARKETDATA_MESSAGE", "OPTION_PNL_CHART", "OPTION_CHAIN_STOCK_CHART", "OPTION_PENDING_ORDER_ROW", "OPTION_WATCHLIST_ITEM_ROW", "OPTION_ORDER_FORM_TYPE_SELECTOR", "OPTION_ORDER_FORM_TYPE_GEAR", "OPTION_ORDER_CONFIGURATION_SWITCH", "OPTION_ORDER_CONFIGURATION_ROW", "OPTION_UNTRADABLE_DIALOG", "OPTION_PCO_DIALOG", "OPTION_EXPIRATION_DIALOG", "OPTION_WATCHLIST_WELCOME_SHEET", "OPTION_PENDING_ORDER_DIALOG", "NO_POSITIONS_AVAILABLE_BOTTOM_SHEET", "STRATEGY_INTRO_CARD", "STRATEGY_SUMMARY_CARD", "OPTION_ORDER_MARKETABILITY_BANNER", "OPTION_ORDER_MARKETABILITY_TAG", "ROLLING_CASH_ACCOUNT_BOTTOM_SHEET", "STRATEGY_BUILDER_CARD", "OPTION_STRATEGY_CHAIN_BOTTOM_SHEET", "STRATEGY_ROW", "OPTION_SIMULATED_RETURNS_SLIDER", "OPTION_SIMULATED_RETURNS_CHART", "OPTION_ORDER_BID_ASK_BAR", "INDEX_OPTION_PCO_DIALOG", "OPTION_INSTRUMENT_PILL", "OPTION_DISPLAY_MODE_CARD", "RECURRING_FREQUENCY_ROW", "RECURRING_PAYMENT_METHOD_ROW", "RECURRING_HUB_ROW", "RECURRING_START_DATE_ROW", "RECURRING_AMOUNT_ROW", "REWARD_CLAIM_CERTIFICATE", "MERCHANT_REWARD_CAROUSEL", "MERCHANT_REWARD_OFFER_DETAIL", "MERCHANT_REWARD_STATE_EXPLANATION", "MERCHANT_REWARD_OFFER_CARD", "POST_REWARD_CLAIM_UPSELL_DIALOG", "ORDER_KIND_ROW", "ADD_ACCOUNT", "ORDER_TYPE_PICKER", "ACCOUNT_PCO_DIALOG", "INVESTMENT_BASKET_TOGGLE", "INVESTMENT_ADDED_TOAST", "BASKET_FULL_TOAST", "PERFORMANCE_CHART", "PERFORMANCE_CHART_SETTINGS", "SPAN_SELECTOR", "DAY_TRADE_COUNTER_ROW", "DAY_TRADE_COUNTER_GRAPHIC", "LEARNING_LESSON_CARD", "LEARNING_LESSON_ROW", "LEARNING_SECTION", "LEARNING_ENTRY_POINT", "LEARNING_MATCHING_EXERCISE", "LEARNING_MATCHING_EXERCISE_ENTITY", "LEARNING_MATCHING_EXERCISE_BUCKET", "LEARNING_FEEDBACK", "LEARNING_INTERSTITIAL", "LEARNING_QUIZ_CONTINUE_HINT", "EDUCATION_TOUR_CARD", "TRANSFER_DETAILS_ROW", "RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG", "RHY_CAROUSEL", "RHY_HOME_CARD", "RHY_HOME_STATUS_BANNER", "HOME_ATM_FINDER", "RHY_DD_UPSELL_POST_TRANSFER", "BACKUP_COVERAGE_TOGGLE", "FLAT_CASHBACK_BOTTOM_SHEET", "RHY_REFERRAL_CASH_OFFER_CARD", "RHY_WAITLIST_UPSELL_CARD", "RHY_WAITLIST_WAITING_CARD", "RHY_WAITLIST_CAT", "RHY_MIGRATION_BOTTOM_SHEET", "RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET", "RHY_TURBOTAX_OFFER_BUTTON_RHY", "RHY_TURBOTAX_OFFER_BUTTON_NON_RHY", "REFERRAL_BANNER", "ACCOUNT_CENTER_REFERRAL_ENTRY_POINT", "SWEEP_DISABLE_DIALOG", "SWEEP_PAUSED_DIALOG", "VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", "CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", "SWEPT_CASH_BALANCE_EXPLANATION_DIALOG", "CASH_SWEEP_ALREADY_ENABLED_DIALOG", "CASH_SWEEP_SECTION", "SLIP_SETTING_CARD", "LINK_DEBIT_CARD_BANNER", "SHAREHOLDER_LIST_SECTION", "MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET", "MARGIN_REQUIREMENT_SECTION", "IRA_TAX_WITHHOLDING_BOTTOM_SHEET", "ACCOUNT_SELECTOR", "BIOMETRIC_AUTH_BUTTON", "PORTFOLIO_TABLE_COLUMN_HEADING", "ASSET_DISPLAY_VALUE_DIALOG", "BUYING_POWER_ROW", "PORTFOLIO_CHART", "GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET", "GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET", "ASSET_SELECTOR", "PNL_CHART", "PNL_SETTINGS", "PNL_DETAIL_BOTTOM_SHEET", "REALIZED_GAIN_LOSS_SECTION", "FUTURES_TRADE_BAR", "FUTURES_LIST_SORT_BOTTOM_SHEET", "LADDER_NUX", "CASH_BALANCES_HOME_SECTION", "CORTEX_DIGEST_SECTION", "PILL", "EDUCATION_ROW", "NEWS_SECTION", "PENDING_ORDER_ROW", "PENDING_ORDER_SECTION", "TOKENIZED_STOCK_HOLDING_ROW", "TOKENIZED_STOCK_HOLDING_SECTION", "PERPETUALS_HOLDING_SECTION", "OPEN_POSITION_SUMMARY", "OPEN_POSITIONS_SECTION", "PENDING_ORDERS_SECTION", "EXPLORE_SECTION", "PNL_SECTION", "OPTION_PROFIT_AND_LOSS_CARD", "OPTION_PROFIT_AND_LOSS_SLIDER", "COMPANY_FINANCIALS_CHART", "CORTEX_DIGEST_UPSELL_SECTION", "COMPANY_FINANCIALS_SECTION", "WATCHLIST_ROW", "RETURNS_CHART", "SELECT_MENU", "OPTIONS_STATUS_SECTION", "FX_SWITCHER", "PROXY_VOTE_SECTION", "EVENT_CONTRACT_TRADE_OVERLAY_DIALOG", "OPTION_L3_ENTRYPOINT_TAG", "CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET", "DASHBOARD_PILL", "FEED_POST_ROW", "ACTIVITY_ITEM_ROW", "CONCIERGE_PLUS_UPSELL_BANNER", "RECURRING_INVESTMENTS_EQUITY_NUX", "EVENT_CONTRACT_COMBO_LEG", "EVENT_CONTRACT_STRIKE_PICKER", "INTEREST_SECTION", "CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ComponentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ComponentType[] $VALUES;
        public static final ComponentType ABOUT_SECTION;
        public static final ComponentType ACCOUNT_CENTER_REFERRAL_ENTRY_POINT;
        public static final ComponentType ACCOUNT_CENTER_UPSELL_BANNER;
        public static final ComponentType ACCOUNT_PCO_DIALOG;
        public static final ComponentType ACCOUNT_SELECTOR;
        public static final ComponentType ACCOUNT_SWITCHER;
        public static final ComponentType ACCOUNT_SWITCHER_BOTTOM_SHEET;
        public static final ComponentType ACH_TRANSFER_OPTION_CARD;
        public static final ComponentType ACTIVITY_ITEM_ROW;

        @JvmField
        public static final ProtoAdapter<ComponentType> ADAPTER;
        public static final ComponentType ADD_ACCOUNT;
        public static final ComponentType ADD_TO_LIST_BOTTOM_SHEET;
        public static final ComponentType ADVANCED_ALERT_SETTINGS;
        public static final ComponentType ADVANCED_CHART;
        public static final ComponentType ALERT;
        public static final ComponentType ALERT_SETTING_ROW;
        public static final ComponentType ALERT_SETTING_TOGGLE;
        public static final ComponentType ALERT_SHEET;
        public static final ComponentType ANALYST_RATINGS_SECTION;
        public static final ComponentType ASSET_CARD;
        public static final ComponentType ASSET_DISPLAY_VALUE_DIALOG;
        public static final ComponentType ASSET_ROW;
        public static final ComponentType ASSET_SELECTOR;
        public static final ComponentType ASSET_TICKER_BUTTON;
        public static final ComponentType BACKUP_COVERAGE_TOGGLE;
        public static final ComponentType BACK_BUTTON;
        public static final ComponentType BADGE;
        public static final ComponentType BALANCE_SECTION;
        public static final ComponentType BASKET_FULL_TOAST;
        public static final ComponentType BIOMETRIC_AUTH_BUTTON;
        public static final ComponentType BOTTOM_SHEET;
        public static final ComponentType BREAKING_NEWS_BANNER;
        public static final ComponentType BUTTON;
        public static final ComponentType BUYING_POWER_ROW;
        public static final ComponentType CALENDAR_DATE_PICKER;
        public static final ComponentType CANCEL_BUTTON;
        public static final ComponentType CANCEL_CONFIRMATION_ALERT;
        public static final ComponentType CANCEL_ERROR_ALERT;
        public static final ComponentType CARD;
        public static final ComponentType CAROUSEL;
        public static final ComponentType CASH_BALANCES_HOME_SECTION;
        public static final ComponentType CASH_SWEEP_ALREADY_ENABLED_DIALOG;
        public static final ComponentType CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG;
        public static final ComponentType CASH_SWEEP_SECTION;
        public static final ComponentType CHIP;
        public static final ComponentType CHIP_GRID;
        public static final ComponentType CLOSE_BUTTON;
        public static final ComponentType COMPANY_FINANCIALS_CHART;
        public static final ComponentType COMPANY_FINANCIALS_SECTION;
        public static final ComponentType COMPONENT_TYPE_UNSPECIFIED;
        public static final ComponentType CONCIERGE_PLUS_UPSELL_BANNER;
        public static final ComponentType CONTACT_SIGNIN_BANNER;
        public static final ComponentType CONTINUE_BUTTON;
        public static final ComponentType CORTEX_DIGEST_SECTION;
        public static final ComponentType CORTEX_DIGEST_UPSELL_SECTION;
        public static final ComponentType CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET;
        public static final ComponentType CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET;
        public static final ComponentType CRYPTO_NOTIFICATION_CARD;
        public static final ComponentType CRYPTO_TRANSFERS_ROW;
        public static final ComponentType CX_CALL_ASSIGNED_TOAST;
        public static final ComponentType CX_CALL_STATUS_BANNER;
        public static final ComponentType CX_CHATBOT_BANNER;
        public static final ComponentType CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET;
        public static final ComponentType CX_CHAT_STATUS_BANNER;
        public static final ComponentType CX_PHONE_UNAVAILABLE_ALERT;
        public static final ComponentType CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ComponentType DASHBOARD_PILL;
        public static final ComponentType DATE_PICKER_BOTTOM_SHEET;
        public static final ComponentType DATE_RANGE_BUTTON;
        public static final ComponentType DAY_TRADE_COUNTER_GRAPHIC;
        public static final ComponentType DAY_TRADE_COUNTER_ROW;
        public static final ComponentType DD_MANUAL_SETUP_ALERT;
        public static final ComponentType DD_SWITCHER_ENTRY_POINT;
        public static final ComponentType DEBIT_CARD_KYC_BANNER;
        public static final ComponentType DELETE_BUTTON;
        public static final ComponentType DEPOSIT_ROW;
        public static final ComponentType DIRECT_DEPOSIT_OPTION_ROW;
        public static final ComponentType DONE_BUTTON;
        public static final ComponentType DROPDOWN_OPTION;
        public static final ComponentType EARLY_PAY_DISABLE_CONFIRMATION_ALERT;
        public static final ComponentType EARLY_PAY_ENABLE_CONFIRMATION_ALERT;
        public static final ComponentType EARLY_PAY_FAQ_ROW;
        public static final ComponentType EARLY_PAY_TOGGLE;
        public static final ComponentType EARLY_PAY_TOGGLE_LIMIT_ALERT;
        public static final ComponentType EARNINGS_SECTION;
        public static final ComponentType EDUCATION_ROW;
        public static final ComponentType EDUCATION_TOUR_CARD;
        public static final ComponentType EDUCATION_TOUR_TOOLTIP;
        public static final ComponentType ENABLE_PUSH_NOTIFICATIONS_ALERT;
        public static final ComponentType ERROR_ALERT;
        public static final ComponentType ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST;
        public static final ComponentType ERROR_LOADING;
        public static final ComponentType ERROR_TOAST;
        public static final ComponentType ETP_COMPOSITION_SECTION;
        public static final ComponentType EVENT_CONTRACT_COMBO_LEG;
        public static final ComponentType EVENT_CONTRACT_STRIKE_PICKER;
        public static final ComponentType EVENT_CONTRACT_TRADE_OVERLAY_DIALOG;
        public static final ComponentType EXPLORE_ROW;
        public static final ComponentType EXPLORE_SECTION;
        public static final ComponentType FEATURE_CARD;
        public static final ComponentType FEATURE_DISCOVERY_WIDGET;
        public static final ComponentType FEEDBACK_BOTTOM_SHEET;
        public static final ComponentType FEED_POST_ROW;
        public static final ComponentType FILTERS_BUTTON;
        public static final ComponentType FLAT_CASHBACK_BOTTOM_SHEET;
        public static final ComponentType FUTURES_LIST_SORT_BOTTOM_SHEET;
        public static final ComponentType FUTURES_TRADE_BAR;
        public static final ComponentType FX_CONVERSION_TOOLTIP;
        public static final ComponentType FX_SWITCHER;
        public static final ComponentType GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET;
        public static final ComponentType GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET;
        public static final ComponentType GOLD_UPSELL_HOOK_DIALOG;
        public static final ComponentType GRAPH_SECTION;
        public static final ComponentType HELP_BUTTON;
        public static final ComponentType HERO_BANNER;
        public static final ComponentType HERO_CARD;
        public static final ComponentType HERO_NEWS_ROW;
        public static final ComponentType HERO_VIDEO_ROW;
        public static final ComponentType HIDE_CX_CALL_STATUS_BANNER_TOAST;
        public static final ComponentType HISTORY_ROW;
        public static final ComponentType HISTORY_SECTION;
        public static final ComponentType HOLDING_ROW;
        public static final ComponentType HOLDING_SECTION;
        public static final ComponentType HOME_ATM_FINDER;
        public static final ComponentType INDEX_OPTION_PCO_DIALOG;
        public static final ComponentType INFO_BANNER;
        public static final ComponentType INFO_TAG;
        public static final ComponentType INLINE_DEFINITION;
        public static final ComponentType INTEREST_SECTION;
        public static final ComponentType INVESTMENT_ADDED_TOAST;
        public static final ComponentType INVESTMENT_BASKET_TOGGLE;
        public static final ComponentType IRA_TAX_WITHHOLDING_BOTTOM_SHEET;
        public static final ComponentType KEYCHAIN_LOGIN_BOTTOM_SHEET;
        public static final ComponentType L2E_ONBOARDING;
        public static final ComponentType LADDER_NUX;
        public static final ComponentType LEARNING_ENTRY_POINT;
        public static final ComponentType LEARNING_FEEDBACK;
        public static final ComponentType LEARNING_INTERSTITIAL;
        public static final ComponentType LEARNING_LESSON_CARD;
        public static final ComponentType LEARNING_LESSON_ROW;
        public static final ComponentType LEARNING_MATCHING_EXERCISE;
        public static final ComponentType LEARNING_MATCHING_EXERCISE_BUCKET;
        public static final ComponentType LEARNING_MATCHING_EXERCISE_ENTITY;
        public static final ComponentType LEARNING_QUIZ_CONTINUE_HINT;
        public static final ComponentType LEARNING_SECTION;
        public static final ComponentType LINK_BUTTON;
        public static final ComponentType LINK_DEBIT_CARD_BANNER;
        public static final ComponentType LIST_ASSET_ROW;
        public static final ComponentType LIST_CAROUSEL;
        public static final ComponentType LIST_CHIP;
        public static final ComponentType LIST_CHIP_GRID;
        public static final ComponentType LIST_CONTACTS;
        public static final ComponentType LIST_HEADER;
        public static final ComponentType LIST_HERO;
        public static final ComponentType LIST_ROW;
        public static final ComponentType LIST_VIDEO;
        public static final ComponentType LIVE_ACTIVITY;
        public static final ComponentType LOADING_PLACEHOLDER;
        public static final ComponentType MAP;
        public static final ComponentType MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET;
        public static final ComponentType MARGIN_REQUIREMENT_SECTION;
        public static final ComponentType MARKET_INDICATOR;
        public static final ComponentType MARKET_UPDATES;
        public static final ComponentType MENU_ITEM;
        public static final ComponentType MERCHANT_REWARD_CAROUSEL;
        public static final ComponentType MERCHANT_REWARD_OFFER_CARD;
        public static final ComponentType MERCHANT_REWARD_OFFER_DETAIL;
        public static final ComponentType MERCHANT_REWARD_STATE_EXPLANATION;
        public static final ComponentType MICROPHONE_PERMISSION_DIALOG;
        public static final ComponentType NEWS_ROW;
        public static final ComponentType NEWS_SECTION;
        public static final ComponentType NEW_PRODUCT_CARD;
        public static final ComponentType NOTIFICATION_CARD;
        public static final ComponentType NOTIFICATION_CARD_STACK;
        public static final ComponentType NOTIFICATION_COMPLETION_CARD;
        public static final ComponentType NOT_YET_BUTTON;
        public static final ComponentType NO_POSITIONS_AVAILABLE_BOTTOM_SHEET;
        public static final ComponentType OPEN_POSITIONS_SECTION;
        public static final ComponentType OPEN_POSITION_SUMMARY;
        public static final ComponentType OPTIONS_STATUS_SECTION;
        public static final ComponentType OPTION_CHAIN_STOCK_CHART;
        public static final ComponentType OPTION_DISPLAY_MODE_CARD;
        public static final ComponentType OPTION_EXPIRATION_DIALOG;
        public static final ComponentType OPTION_INSTRUMENT_PILL;
        public static final ComponentType OPTION_INSTRUMENT_ROW;
        public static final ComponentType OPTION_L3_ENTRYPOINT_TAG;
        public static final ComponentType OPTION_NO_MARKETDATA_MESSAGE;
        public static final ComponentType OPTION_ORDER_BID_ASK_BAR;
        public static final ComponentType OPTION_ORDER_CONFIGURATION_ROW;
        public static final ComponentType OPTION_ORDER_CONFIGURATION_SWITCH;
        public static final ComponentType OPTION_ORDER_FORM_TYPE_GEAR;
        public static final ComponentType OPTION_ORDER_FORM_TYPE_SELECTOR;
        public static final ComponentType OPTION_ORDER_MARKETABILITY_BANNER;
        public static final ComponentType OPTION_ORDER_MARKETABILITY_TAG;
        public static final ComponentType OPTION_PCO_DIALOG;
        public static final ComponentType OPTION_PENDING_ORDER_DIALOG;
        public static final ComponentType OPTION_PENDING_ORDER_ROW;
        public static final ComponentType OPTION_PNL_CHART;
        public static final ComponentType OPTION_PROFIT_AND_LOSS_CARD;
        public static final ComponentType OPTION_PROFIT_AND_LOSS_SLIDER;
        public static final ComponentType OPTION_SIMULATED_RETURNS_CHART;
        public static final ComponentType OPTION_SIMULATED_RETURNS_SLIDER;
        public static final ComponentType OPTION_STRATEGY_CHAIN_BOTTOM_SHEET;
        public static final ComponentType OPTION_UNTRADABLE_DIALOG;
        public static final ComponentType OPTION_UNTRADABLE_INFO_BAR;
        public static final ComponentType OPTION_WATCHLIST_ITEM_ROW;
        public static final ComponentType OPTION_WATCHLIST_WELCOME_SHEET;
        public static final ComponentType ORDER_KIND_ROW;
        public static final ComponentType ORDER_TYPE_PICKER;
        public static final ComponentType PASSKEY_ENROLLMENT_BOTTOM_SHEET;
        public static final ComponentType PAYCHECK_SECTION;
        public static final ComponentType PAY_BY_CHECK_ROW;
        public static final ComponentType PENDING_ORDERS_SECTION;
        public static final ComponentType PENDING_ORDER_ROW;
        public static final ComponentType PENDING_ORDER_SECTION;
        public static final ComponentType PEOPLE_ALSO_VIEW_SECTION;
        public static final ComponentType PERFORMANCE_CHART;
        public static final ComponentType PERFORMANCE_CHART_SETTINGS;
        public static final ComponentType PERFORMANCE_SECTION;
        public static final ComponentType PERMISSION_ERROR_TOAST;
        public static final ComponentType PERMISSION_SETTINGS_DIALOG;
        public static final ComponentType PERPETUALS_HOLDING_SECTION;
        public static final ComponentType PILL;
        public static final ComponentType PNL_CHART;
        public static final ComponentType PNL_DETAIL_BOTTOM_SHEET;
        public static final ComponentType PNL_SECTION;
        public static final ComponentType PNL_SETTINGS;
        public static final ComponentType PORTFOLIO_CHART;
        public static final ComponentType PORTFOLIO_TABLE_COLUMN_HEADING;
        public static final ComponentType POSITION_SECTION;
        public static final ComponentType POST_REWARD_CLAIM_UPSELL_DIALOG;
        public static final ComponentType PRICE_ALERT_EDITOR;
        public static final ComponentType PRICE_ALERT_TYPE_SELECTOR;
        public static final ComponentType PRICE_CHART;
        public static final ComponentType PROCESSING_ERROR_TOAST;
        public static final ComponentType PROXY_VOTE_SECTION;
        public static final ComponentType PUSH_NOTIFICATION;
        public static final ComponentType QR_CODE;
        public static final ComponentType RADIO_BUTTON;
        public static final ComponentType REALIZED_GAIN_LOSS_SECTION;
        public static final ComponentType RECENT_SEARCH_ROW;
        public static final ComponentType RECOMMENDATIONS_BROWSE_CARD;
        public static final ComponentType RECURRING_AMOUNT_ROW;
        public static final ComponentType RECURRING_DEPOSITS_ROW;
        public static final ComponentType RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG;
        public static final ComponentType RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG;
        public static final ComponentType RECURRING_FREQUENCY_ROW;
        public static final ComponentType RECURRING_HUB_ROW;
        public static final ComponentType RECURRING_INVESTMENTS_BUTTON;
        public static final ComponentType RECURRING_INVESTMENTS_EQUITY_NUX;
        public static final ComponentType RECURRING_PAYMENT_METHOD_ROW;
        public static final ComponentType RECURRING_ROW;
        public static final ComponentType RECURRING_START_DATE_ROW;
        public static final ComponentType RECURRING_SUMMARY_DIALOG;
        public static final ComponentType REDEMPTION_CARD;
        public static final ComponentType REFERRAL_BANNER;
        public static final ComponentType RELATED_LISTS_SECTION;
        public static final ComponentType RESEARCH_REPORT_SECTION;
        public static final ComponentType RETURNS_CHART;
        public static final ComponentType REVIEW_BUTTON;
        public static final ComponentType REWARD_CLAIM_CERTIFICATE;
        public static final ComponentType RHY_CAROUSEL;
        public static final ComponentType RHY_DD_UPSELL_POST_TRANSFER;
        public static final ComponentType RHY_HOME_CARD;
        public static final ComponentType RHY_HOME_STATUS_BANNER;
        public static final ComponentType RHY_MIGRATION_BOTTOM_SHEET;
        public static final ComponentType RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET;
        public static final ComponentType RHY_REFERRAL_CASH_OFFER_CARD;
        public static final ComponentType RHY_TURBOTAX_OFFER_BUTTON_NON_RHY;
        public static final ComponentType RHY_TURBOTAX_OFFER_BUTTON_RHY;
        public static final ComponentType RHY_WAITLIST_CAT;
        public static final ComponentType RHY_WAITLIST_UPSELL_CARD;
        public static final ComponentType RHY_WAITLIST_WAITING_CARD;
        public static final ComponentType ROLLING_CASH_ACCOUNT_BOTTOM_SHEET;
        public static final ComponentType ROW;
        public static final ComponentType SAFETY_LABEL_INFO_TAG;
        public static final ComponentType SCREENER_PRESET_CARD;
        public static final ComponentType SCRUB_BAR;
        public static final ComponentType SEARCH_BAR;
        public static final ComponentType SEARCH_RESULT_ROW;
        public static final ComponentType SECTION_HEADER;
        public static final ComponentType SEGMENT;
        public static final ComponentType SEGMENTED_CONTROL;
        public static final ComponentType SELECT_MENU;
        public static final ComponentType SETUP_DIRECT_DEPOSIT_ROW;
        public static final ComponentType SHAREHOLDER_LIST_SECTION;
        public static final ComponentType SHAREHOLDER_QA_SECTION;
        public static final ComponentType SHORTCUTS_FIRST_TIME_POPUP;
        public static final ComponentType SIDEBAR;
        public static final ComponentType SKIP_BUTTON;
        public static final ComponentType SLIDER;
        public static final ComponentType SLIP_SETTING_CARD;
        public static final ComponentType SPAN_SELECTOR;
        public static final ComponentType STAKING_SECTION;
        public static final ComponentType STATS_SECTION;
        public static final ComponentType STATUS_BANNER;
        public static final ComponentType STICKY_BOTTOM_SHEET;
        public static final ComponentType STRATEGY_BUILDER_CARD;
        public static final ComponentType STRATEGY_INTRO_CARD;
        public static final ComponentType STRATEGY_ROW;
        public static final ComponentType STRATEGY_SUMMARY_CARD;
        public static final ComponentType SUCCESS_TOAST;
        public static final ComponentType SWEEP_DISABLE_DIALOG;
        public static final ComponentType SWEEP_PAUSED_DIALOG;
        public static final ComponentType SWEPT_CASH_BALANCE_EXPLANATION_DIALOG;
        public static final ComponentType TAB;
        public static final ComponentType TABLE;
        public static final ComponentType TEXT_FIELD;
        public static final ComponentType TEXT_VIEW;
        public static final ComponentType TOGGLE;
        public static final ComponentType TOKENIZED_STOCK_HOLDING_ROW;
        public static final ComponentType TOKENIZED_STOCK_HOLDING_SECTION;
        public static final ComponentType TOOLTIP;
        public static final ComponentType TRADE_BAR;
        public static final ComponentType TRADING_TRENDS_CHART;
        public static final ComponentType TRANSFER_DETAILS_ROW;
        public static final ComponentType TRANSFER_REWARD_PILL;
        public static final ComponentType TRANSFER_ROW;
        public static final ComponentType UPCOMING_ACTIVITY_SECTION;
        public static final ComponentType UPDATE_EMPLOYER_INFO_ALERT;
        public static final ComponentType UPDATE_INVESTOR_PROFILE_BANNER;
        public static final ComponentType UPDATE_LIST_TOAST;
        public static final ComponentType VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET;
        public static final ComponentType VERIFY_DEBIT_CARD_BANNER;
        public static final ComponentType VIDEO_ROW;
        public static final ComponentType VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET;
        public static final ComponentType WATCHLIST_ROW;
        public static final ComponentType WIRE_TRANSFER_ROW;
        public static final ComponentType WIRE_UPSELL;
        public static final ComponentType WITHDRAW_ROW;
        private final int value;

        private static final /* synthetic */ ComponentType[] $values() {
            return new ComponentType[]{COMPONENT_TYPE_UNSPECIFIED, LOADING_PLACEHOLDER, MAP, QR_CODE, INLINE_DEFINITION, PUSH_NOTIFICATION, MENU_ITEM, EDUCATION_TOUR_TOOLTIP, NEW_PRODUCT_CARD, BALANCE_SECTION, SHORTCUTS_FIRST_TIME_POPUP, ACCOUNT_SWITCHER, ACCOUNT_SWITCHER_BOTTOM_SHEET, HOLDING_ROW, PRICE_CHART, RECURRING_ROW, EXPLORE_ROW, NOTIFICATION_CARD, NOTIFICATION_CARD_STACK, NOTIFICATION_COMPLETION_CARD, SIDEBAR, LIST_ROW, LIST_HEADER, SECTION_HEADER, TOGGLE, CARD, SUCCESS_TOAST, INFO_TAG, FX_CONVERSION_TOOLTIP, HERO_CARD, TEXT_VIEW, SEGMENTED_CONTROL, TRADING_TRENDS_CHART, SEGMENT, TABLE, HOLDING_SECTION, SLIDER, SCRUB_BAR, STICKY_BOTTOM_SHEET, LIVE_ACTIVITY, BADGE, STAKING_SECTION, ADVANCED_ALERT_SETTINGS, PRICE_ALERT_EDITOR, ALERT_SETTING_ROW, ALERT_SETTING_TOGGLE, PRICE_ALERT_TYPE_SELECTOR, CANCEL_ERROR_ALERT, ERROR_ALERT, ALERT, ERROR_LOADING, CANCEL_CONFIRMATION_ALERT, ENABLE_PUSH_NOTIFICATIONS_ALERT, CX_PHONE_UNAVAILABLE_ALERT, CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET, CX_CHAT_STATUS_BANNER, CX_CHATBOT_BANNER, UPDATE_EMPLOYER_INFO_ALERT, DD_MANUAL_SETUP_ALERT, EARLY_PAY_ENABLE_CONFIRMATION_ALERT, EARLY_PAY_DISABLE_CONFIRMATION_ALERT, EARLY_PAY_TOGGLE_LIMIT_ALERT, ALERT_SHEET, CX_CALL_STATUS_BANNER, CONTACT_SIGNIN_BANNER, INFO_BANNER, HERO_BANNER, STATUS_BANNER, VERIFY_DEBIT_CARD_BANNER, UPDATE_INVESTOR_PROFILE_BANNER, ACCOUNT_CENTER_UPSELL_BANNER, ADD_TO_LIST_BOTTOM_SHEET, FEEDBACK_BOTTOM_SHEET, DATE_PICKER_BOTTOM_SHEET, BOTTOM_SHEET, PASSKEY_ENROLLMENT_BOTTOM_SHEET, KEYCHAIN_LOGIN_BOTTOM_SHEET, GOLD_UPSELL_HOOK_DIALOG, DONE_BUTTON, CONTINUE_BUTTON, BUTTON, SKIP_BUTTON, FILTERS_BUTTON, ASSET_TICKER_BUTTON, LINK_BUTTON, BACK_BUTTON, REVIEW_BUTTON, RADIO_BUTTON, DATE_RANGE_BUTTON, CLOSE_BUTTON, CANCEL_BUTTON, DELETE_BUTTON, NOT_YET_BUTTON, HELP_BUTTON, RECURRING_INVESTMENTS_BUTTON, ASSET_CARD, REDEMPTION_CARD, RECOMMENDATIONS_BROWSE_CARD, CRYPTO_NOTIFICATION_CARD, SCREENER_PRESET_CARD, BREAKING_NEWS_BANNER, LIST_CHIP_GRID, LIST_CAROUSEL, CAROUSEL, CHIP_GRID, LIST_CHIP, CHIP, RECURRING_SUMMARY_DIALOG, CALENDAR_DATE_PICKER, SEARCH_RESULT_ROW, ASSET_ROW, ROW, HISTORY_ROW, RECENT_SEARCH_ROW, L2E_ONBOARDING, TEXT_FIELD, SEARCH_BAR, ERROR_TOAST, HIDE_CX_CALL_STATUS_BANNER_TOAST, ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST, CX_CALL_ASSIGNED_TOAST, MICROPHONE_PERMISSION_DIALOG, PERMISSION_SETTINGS_DIALOG, PROCESSING_ERROR_TOAST, PERMISSION_ERROR_TOAST, VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET, CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET, UPDATE_LIST_TOAST, DD_SWITCHER_ENTRY_POINT, SAFETY_LABEL_INFO_TAG, TOOLTIP, PERFORMANCE_SECTION, STATS_SECTION, GRAPH_SECTION, POSITION_SECTION, RESEARCH_REPORT_SECTION, EARNINGS_SECTION, PEOPLE_ALSO_VIEW_SECTION, TRADE_BAR, ETP_COMPOSITION_SECTION, ABOUT_SECTION, ANALYST_RATINGS_SECTION, RELATED_LISTS_SECTION, SHAREHOLDER_QA_SECTION, HISTORY_SECTION, ADVANCED_CHART, UPCOMING_ACTIVITY_SECTION, TAB, NEWS_ROW, HERO_NEWS_ROW, VIDEO_ROW, HERO_VIDEO_ROW, FEATURE_CARD, FEATURE_DISCOVERY_WIDGET, MARKET_UPDATES, MARKET_INDICATOR, DIRECT_DEPOSIT_OPTION_ROW, SETUP_DIRECT_DEPOSIT_ROW, DEPOSIT_ROW, WITHDRAW_ROW, RECURRING_DEPOSITS_ROW, PAY_BY_CHECK_ROW, TRANSFER_ROW, DROPDOWN_OPTION, RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG, PAYCHECK_SECTION, DEBIT_CARD_KYC_BANNER, ACH_TRANSFER_OPTION_CARD, CRYPTO_TRANSFERS_ROW, WIRE_TRANSFER_ROW, WIRE_UPSELL, TRANSFER_REWARD_PILL, EARLY_PAY_TOGGLE, EARLY_PAY_FAQ_ROW, LIST_HERO, LIST_ASSET_ROW, LIST_CONTACTS, LIST_VIDEO, OPTION_INSTRUMENT_ROW, OPTION_UNTRADABLE_INFO_BAR, OPTION_NO_MARKETDATA_MESSAGE, OPTION_PNL_CHART, OPTION_CHAIN_STOCK_CHART, OPTION_PENDING_ORDER_ROW, OPTION_WATCHLIST_ITEM_ROW, OPTION_ORDER_FORM_TYPE_SELECTOR, OPTION_ORDER_FORM_TYPE_GEAR, OPTION_ORDER_CONFIGURATION_SWITCH, OPTION_ORDER_CONFIGURATION_ROW, OPTION_UNTRADABLE_DIALOG, OPTION_PCO_DIALOG, OPTION_EXPIRATION_DIALOG, OPTION_WATCHLIST_WELCOME_SHEET, OPTION_PENDING_ORDER_DIALOG, NO_POSITIONS_AVAILABLE_BOTTOM_SHEET, STRATEGY_INTRO_CARD, STRATEGY_SUMMARY_CARD, OPTION_ORDER_MARKETABILITY_BANNER, OPTION_ORDER_MARKETABILITY_TAG, ROLLING_CASH_ACCOUNT_BOTTOM_SHEET, STRATEGY_BUILDER_CARD, OPTION_STRATEGY_CHAIN_BOTTOM_SHEET, STRATEGY_ROW, OPTION_SIMULATED_RETURNS_SLIDER, OPTION_SIMULATED_RETURNS_CHART, OPTION_ORDER_BID_ASK_BAR, INDEX_OPTION_PCO_DIALOG, OPTION_INSTRUMENT_PILL, OPTION_DISPLAY_MODE_CARD, RECURRING_FREQUENCY_ROW, RECURRING_PAYMENT_METHOD_ROW, RECURRING_HUB_ROW, RECURRING_START_DATE_ROW, RECURRING_AMOUNT_ROW, REWARD_CLAIM_CERTIFICATE, MERCHANT_REWARD_CAROUSEL, MERCHANT_REWARD_OFFER_DETAIL, MERCHANT_REWARD_STATE_EXPLANATION, MERCHANT_REWARD_OFFER_CARD, POST_REWARD_CLAIM_UPSELL_DIALOG, ORDER_KIND_ROW, ADD_ACCOUNT, ORDER_TYPE_PICKER, ACCOUNT_PCO_DIALOG, INVESTMENT_BASKET_TOGGLE, INVESTMENT_ADDED_TOAST, BASKET_FULL_TOAST, PERFORMANCE_CHART, PERFORMANCE_CHART_SETTINGS, SPAN_SELECTOR, DAY_TRADE_COUNTER_ROW, DAY_TRADE_COUNTER_GRAPHIC, LEARNING_LESSON_CARD, LEARNING_LESSON_ROW, LEARNING_SECTION, LEARNING_ENTRY_POINT, LEARNING_MATCHING_EXERCISE, LEARNING_MATCHING_EXERCISE_ENTITY, LEARNING_MATCHING_EXERCISE_BUCKET, LEARNING_FEEDBACK, LEARNING_INTERSTITIAL, LEARNING_QUIZ_CONTINUE_HINT, EDUCATION_TOUR_CARD, TRANSFER_DETAILS_ROW, RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG, RHY_CAROUSEL, RHY_HOME_CARD, RHY_HOME_STATUS_BANNER, HOME_ATM_FINDER, RHY_DD_UPSELL_POST_TRANSFER, BACKUP_COVERAGE_TOGGLE, FLAT_CASHBACK_BOTTOM_SHEET, RHY_REFERRAL_CASH_OFFER_CARD, RHY_WAITLIST_UPSELL_CARD, RHY_WAITLIST_WAITING_CARD, RHY_WAITLIST_CAT, RHY_MIGRATION_BOTTOM_SHEET, RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET, RHY_TURBOTAX_OFFER_BUTTON_RHY, RHY_TURBOTAX_OFFER_BUTTON_NON_RHY, REFERRAL_BANNER, ACCOUNT_CENTER_REFERRAL_ENTRY_POINT, SWEEP_DISABLE_DIALOG, SWEEP_PAUSED_DIALOG, VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET, CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG, SWEPT_CASH_BALANCE_EXPLANATION_DIALOG, CASH_SWEEP_ALREADY_ENABLED_DIALOG, CASH_SWEEP_SECTION, SLIP_SETTING_CARD, LINK_DEBIT_CARD_BANNER, SHAREHOLDER_LIST_SECTION, MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET, MARGIN_REQUIREMENT_SECTION, IRA_TAX_WITHHOLDING_BOTTOM_SHEET, ACCOUNT_SELECTOR, BIOMETRIC_AUTH_BUTTON, PORTFOLIO_TABLE_COLUMN_HEADING, ASSET_DISPLAY_VALUE_DIALOG, BUYING_POWER_ROW, PORTFOLIO_CHART, GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET, GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET, ASSET_SELECTOR, PNL_CHART, PNL_SETTINGS, PNL_DETAIL_BOTTOM_SHEET, REALIZED_GAIN_LOSS_SECTION, FUTURES_TRADE_BAR, FUTURES_LIST_SORT_BOTTOM_SHEET, LADDER_NUX, CASH_BALANCES_HOME_SECTION, CORTEX_DIGEST_SECTION, PILL, EDUCATION_ROW, NEWS_SECTION, PENDING_ORDER_ROW, PENDING_ORDER_SECTION, TOKENIZED_STOCK_HOLDING_ROW, TOKENIZED_STOCK_HOLDING_SECTION, PERPETUALS_HOLDING_SECTION, OPEN_POSITION_SUMMARY, OPEN_POSITIONS_SECTION, PENDING_ORDERS_SECTION, EXPLORE_SECTION, PNL_SECTION, OPTION_PROFIT_AND_LOSS_CARD, OPTION_PROFIT_AND_LOSS_SLIDER, COMPANY_FINANCIALS_CHART, CORTEX_DIGEST_UPSELL_SECTION, COMPANY_FINANCIALS_SECTION, WATCHLIST_ROW, RETURNS_CHART, SELECT_MENU, OPTIONS_STATUS_SECTION, FX_SWITCHER, PROXY_VOTE_SECTION, EVENT_CONTRACT_TRADE_OVERLAY_DIALOG, OPTION_L3_ENTRYPOINT_TAG, CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET, DASHBOARD_PILL, FEED_POST_ROW, ACTIVITY_ITEM_ROW, CONCIERGE_PLUS_UPSELL_BANNER, RECURRING_INVESTMENTS_EQUITY_NUX, EVENT_CONTRACT_COMBO_LEG, EVENT_CONTRACT_STRIKE_PICKER, INTEREST_SECTION, CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET};
        }

        @JvmStatic
        public static final ComponentType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ComponentType> getEntries() {
            return $ENTRIES;
        }

        private ComponentType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ComponentType componentType = new ComponentType("COMPONENT_TYPE_UNSPECIFIED", 0, 0);
            COMPONENT_TYPE_UNSPECIFIED = componentType;
            LOADING_PLACEHOLDER = new ComponentType("LOADING_PLACEHOLDER", 1, 59);
            MAP = new ComponentType("MAP", 2, 60);
            QR_CODE = new ComponentType("QR_CODE", 3, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
            INLINE_DEFINITION = new ComponentType("INLINE_DEFINITION", 4, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
            PUSH_NOTIFICATION = new ComponentType("PUSH_NOTIFICATION", 5, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
            MENU_ITEM = new ComponentType("MENU_ITEM", 6, 192);
            EDUCATION_TOUR_TOOLTIP = new ComponentType("EDUCATION_TOUR_TOOLTIP", 7, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
            NEW_PRODUCT_CARD = new ComponentType("NEW_PRODUCT_CARD", 8, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
            BALANCE_SECTION = new ComponentType("BALANCE_SECTION", 9, 202);
            SHORTCUTS_FIRST_TIME_POPUP = new ComponentType("SHORTCUTS_FIRST_TIME_POPUP", 10, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
            ACCOUNT_SWITCHER = new ComponentType("ACCOUNT_SWITCHER", 11, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
            ACCOUNT_SWITCHER_BOTTOM_SHEET = new ComponentType("ACCOUNT_SWITCHER_BOTTOM_SHEET", 12, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
            HOLDING_ROW = new ComponentType("HOLDING_ROW", 13, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
            PRICE_CHART = new ComponentType("PRICE_CHART", 14, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
            RECURRING_ROW = new ComponentType("RECURRING_ROW", 15, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
            EXPLORE_ROW = new ComponentType("EXPLORE_ROW", 16, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            NOTIFICATION_CARD = new ComponentType("NOTIFICATION_CARD", 17, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
            NOTIFICATION_CARD_STACK = new ComponentType("NOTIFICATION_CARD_STACK", 18, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            NOTIFICATION_COMPLETION_CARD = new ComponentType("NOTIFICATION_COMPLETION_CARD", 19, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            SIDEBAR = new ComponentType("SIDEBAR", 20, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
            LIST_ROW = new ComponentType("LIST_ROW", 21, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            LIST_HEADER = new ComponentType("LIST_HEADER", 22, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
            SECTION_HEADER = new ComponentType("SECTION_HEADER", 23, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            TOGGLE = new ComponentType("TOGGLE", 24, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
            CARD = new ComponentType("CARD", 25, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            SUCCESS_TOAST = new ComponentType("SUCCESS_TOAST", 26, EnumC7081g.f2779x59907a3d);
            INFO_TAG = new ComponentType("INFO_TAG", 27, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            FX_CONVERSION_TOOLTIP = new ComponentType("FX_CONVERSION_TOOLTIP", 28, 255);
            HERO_CARD = new ComponentType("HERO_CARD", 29, 256);
            TEXT_VIEW = new ComponentType("TEXT_VIEW", 30, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
            SEGMENTED_CONTROL = new ComponentType("SEGMENTED_CONTROL", 31, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
            TRADING_TRENDS_CHART = new ComponentType("TRADING_TRENDS_CHART", 32, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
            SEGMENT = new ComponentType("SEGMENT", 33, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
            TABLE = new ComponentType("TABLE", 34, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
            HOLDING_SECTION = new ComponentType("HOLDING_SECTION", 35, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
            SLIDER = new ComponentType("SLIDER", 36, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
            SCRUB_BAR = new ComponentType("SCRUB_BAR", 37, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
            STICKY_BOTTOM_SHEET = new ComponentType("STICKY_BOTTOM_SHEET", 38, 283);
            LIVE_ACTIVITY = new ComponentType("LIVE_ACTIVITY", 39, EnumC7081g.f2777x89a9e432);
            BADGE = new ComponentType("BADGE", 40, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            STAKING_SECTION = new ComponentType("STAKING_SECTION", 41, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            ADVANCED_ALERT_SETTINGS = new ComponentType("ADVANCED_ALERT_SETTINGS", 42, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
            PRICE_ALERT_EDITOR = new ComponentType("PRICE_ALERT_EDITOR", 43, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
            ALERT_SETTING_ROW = new ComponentType("ALERT_SETTING_ROW", 44, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
            ALERT_SETTING_TOGGLE = new ComponentType("ALERT_SETTING_TOGGLE", 45, 200);
            PRICE_ALERT_TYPE_SELECTOR = new ComponentType("PRICE_ALERT_TYPE_SELECTOR", 46, 225);
            CANCEL_ERROR_ALERT = new ComponentType("CANCEL_ERROR_ALERT", 47, 6);
            ERROR_ALERT = new ComponentType("ERROR_ALERT", 48, 22);
            ALERT = new ComponentType("ALERT", 49, 114);
            ERROR_LOADING = new ComponentType("ERROR_LOADING", 50, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
            CANCEL_CONFIRMATION_ALERT = new ComponentType("CANCEL_CONFIRMATION_ALERT", 51, 5);
            ENABLE_PUSH_NOTIFICATIONS_ALERT = new ComponentType("ENABLE_PUSH_NOTIFICATIONS_ALERT", 52, 10);
            CX_PHONE_UNAVAILABLE_ALERT = new ComponentType("CX_PHONE_UNAVAILABLE_ALERT", 53, 7);
            CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET = new ComponentType("CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET", 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            CX_CHAT_STATUS_BANNER = new ComponentType("CX_CHAT_STATUS_BANNER", 55, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
            CX_CHATBOT_BANNER = new ComponentType("CX_CHATBOT_BANNER", 56, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
            UPDATE_EMPLOYER_INFO_ALERT = new ComponentType("UPDATE_EMPLOYER_INFO_ALERT", 57, 17);
            DD_MANUAL_SETUP_ALERT = new ComponentType("DD_MANUAL_SETUP_ALERT", 58, 35);
            EARLY_PAY_ENABLE_CONFIRMATION_ALERT = new ComponentType("EARLY_PAY_ENABLE_CONFIRMATION_ALERT", 59, 63);
            EARLY_PAY_DISABLE_CONFIRMATION_ALERT = new ComponentType("EARLY_PAY_DISABLE_CONFIRMATION_ALERT", 60, 64);
            EARLY_PAY_TOGGLE_LIMIT_ALERT = new ComponentType("EARLY_PAY_TOGGLE_LIMIT_ALERT", 61, 65);
            ALERT_SHEET = new ComponentType("ALERT_SHEET", 62, 54);
            CX_CALL_STATUS_BANNER = new ComponentType("CX_CALL_STATUS_BANNER", 63, 8);
            CONTACT_SIGNIN_BANNER = new ComponentType("CONTACT_SIGNIN_BANNER", 64, 50);
            INFO_BANNER = new ComponentType("INFO_BANNER", 65, 51);
            HERO_BANNER = new ComponentType("HERO_BANNER", 66, 52);
            STATUS_BANNER = new ComponentType("STATUS_BANNER", 67, 53);
            VERIFY_DEBIT_CARD_BANNER = new ComponentType("VERIFY_DEBIT_CARD_BANNER", 68, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            UPDATE_INVESTOR_PROFILE_BANNER = new ComponentType("UPDATE_INVESTOR_PROFILE_BANNER", 69, 224);
            ACCOUNT_CENTER_UPSELL_BANNER = new ComponentType("ACCOUNT_CENTER_UPSELL_BANNER", 70, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            ADD_TO_LIST_BOTTOM_SHEET = new ComponentType("ADD_TO_LIST_BOTTOM_SHEET", 71, 14);
            FEEDBACK_BOTTOM_SHEET = new ComponentType("FEEDBACK_BOTTOM_SHEET", 72, 26);
            DATE_PICKER_BOTTOM_SHEET = new ComponentType("DATE_PICKER_BOTTOM_SHEET", 73, 38);
            BOTTOM_SHEET = new ComponentType("BOTTOM_SHEET", 74, 76);
            PASSKEY_ENROLLMENT_BOTTOM_SHEET = new ComponentType("PASSKEY_ENROLLMENT_BOTTOM_SHEET", 75, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
            KEYCHAIN_LOGIN_BOTTOM_SHEET = new ComponentType("KEYCHAIN_LOGIN_BOTTOM_SHEET", 76, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
            GOLD_UPSELL_HOOK_DIALOG = new ComponentType("GOLD_UPSELL_HOOK_DIALOG", 77, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            DONE_BUTTON = new ComponentType("DONE_BUTTON", 78, 18);
            CONTINUE_BUTTON = new ComponentType("CONTINUE_BUTTON", 79, 19);
            BUTTON = new ComponentType("BUTTON", 80, 20);
            SKIP_BUTTON = new ComponentType("SKIP_BUTTON", 81, 21);
            FILTERS_BUTTON = new ComponentType("FILTERS_BUTTON", 82, 23);
            ASSET_TICKER_BUTTON = new ComponentType("ASSET_TICKER_BUTTON", 83, 32);
            LINK_BUTTON = new ComponentType("LINK_BUTTON", 84, 34);
            BACK_BUTTON = new ComponentType("BACK_BUTTON", 85, 37);
            REVIEW_BUTTON = new ComponentType("REVIEW_BUTTON", 86, 39);
            RADIO_BUTTON = new ComponentType("RADIO_BUTTON", 87, 61);
            DATE_RANGE_BUTTON = new ComponentType("DATE_RANGE_BUTTON", 88, 72);
            CLOSE_BUTTON = new ComponentType("CLOSE_BUTTON", 89, 73);
            CANCEL_BUTTON = new ComponentType("CANCEL_BUTTON", 90, 74);
            DELETE_BUTTON = new ComponentType("DELETE_BUTTON", 91, 75);
            NOT_YET_BUTTON = new ComponentType("NOT_YET_BUTTON", 92, EnumC7081g.f2773x8d9721ad);
            HELP_BUTTON = new ComponentType("HELP_BUTTON", 93, EnumC7081g.f2780x600b66fe);
            RECURRING_INVESTMENTS_BUTTON = new ComponentType("RECURRING_INVESTMENTS_BUTTON", 94, 40);
            ASSET_CARD = new ComponentType("ASSET_CARD", 95, 31);
            REDEMPTION_CARD = new ComponentType("REDEMPTION_CARD", 96, 89);
            RECOMMENDATIONS_BROWSE_CARD = new ComponentType("RECOMMENDATIONS_BROWSE_CARD", 97, 144);
            CRYPTO_NOTIFICATION_CARD = new ComponentType("CRYPTO_NOTIFICATION_CARD", 98, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            SCREENER_PRESET_CARD = new ComponentType("SCREENER_PRESET_CARD", 99, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
            BREAKING_NEWS_BANNER = new ComponentType("BREAKING_NEWS_BANNER", 100, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
            LIST_CHIP_GRID = new ComponentType("LIST_CHIP_GRID", 101, 2);
            LIST_CAROUSEL = new ComponentType("LIST_CAROUSEL", 102, 3);
            CAROUSEL = new ComponentType("CAROUSEL", 103, 25);
            CHIP_GRID = new ComponentType("CHIP_GRID", 104, 70);
            LIST_CHIP = new ComponentType("LIST_CHIP", 105, 33);
            CHIP = new ComponentType("CHIP", 106, 68);
            RECURRING_SUMMARY_DIALOG = new ComponentType("RECURRING_SUMMARY_DIALOG", 107, 41);
            CALENDAR_DATE_PICKER = new ComponentType("CALENDAR_DATE_PICKER", 108, 77);
            SEARCH_RESULT_ROW = new ComponentType("SEARCH_RESULT_ROW", 109, 49);
            ASSET_ROW = new ComponentType("ASSET_ROW", 110, 69);
            ROW = new ComponentType("ROW", 111, 71);
            HISTORY_ROW = new ComponentType("HISTORY_ROW", 112, 117);
            RECENT_SEARCH_ROW = new ComponentType("RECENT_SEARCH_ROW", 113, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
            L2E_ONBOARDING = new ComponentType("L2E_ONBOARDING", 114, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
            TEXT_FIELD = new ComponentType("TEXT_FIELD", 115, 47);
            SEARCH_BAR = new ComponentType("SEARCH_BAR", 116, 48);
            ERROR_TOAST = new ComponentType("ERROR_TOAST", 117, 4);
            HIDE_CX_CALL_STATUS_BANNER_TOAST = new ComponentType("HIDE_CX_CALL_STATUS_BANNER_TOAST", 118, 9);
            ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST = new ComponentType("ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST", 119, 11);
            CX_CALL_ASSIGNED_TOAST = new ComponentType("CX_CALL_ASSIGNED_TOAST", 120, 12);
            MICROPHONE_PERMISSION_DIALOG = new ComponentType("MICROPHONE_PERMISSION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            PERMISSION_SETTINGS_DIALOG = new ComponentType("PERMISSION_SETTINGS_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 131);
            PROCESSING_ERROR_TOAST = new ComponentType("PROCESSING_ERROR_TOAST", 123, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            PERMISSION_ERROR_TOAST = new ComponentType("PERMISSION_ERROR_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
            VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET = new ComponentType("VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET", 125, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
            CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET = new ComponentType("CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
            UPDATE_LIST_TOAST = new ComponentType("UPDATE_LIST_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 13);
            DD_SWITCHER_ENTRY_POINT = new ComponentType("DD_SWITCHER_ENTRY_POINT", 128, 36);
            SAFETY_LABEL_INFO_TAG = new ComponentType("SAFETY_LABEL_INFO_TAG", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 95);
            TOOLTIP = new ComponentType("TOOLTIP", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 96);
            PERFORMANCE_SECTION = new ComponentType("PERFORMANCE_SECTION", 131, 97);
            STATS_SECTION = new ComponentType("STATS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 98);
            GRAPH_SECTION = new ComponentType("GRAPH_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 99);
            POSITION_SECTION = new ComponentType("POSITION_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 100);
            RESEARCH_REPORT_SECTION = new ComponentType("RESEARCH_REPORT_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 101);
            EARNINGS_SECTION = new ComponentType("EARNINGS_SECTION", 136, 102);
            PEOPLE_ALSO_VIEW_SECTION = new ComponentType("PEOPLE_ALSO_VIEW_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 103);
            TRADE_BAR = new ComponentType("TRADE_BAR", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 104);
            ETP_COMPOSITION_SECTION = new ComponentType("ETP_COMPOSITION_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 106);
            ABOUT_SECTION = new ComponentType("ABOUT_SECTION", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 107);
            ANALYST_RATINGS_SECTION = new ComponentType("ANALYST_RATINGS_SECTION", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 111);
            RELATED_LISTS_SECTION = new ComponentType("RELATED_LISTS_SECTION", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 112);
            SHAREHOLDER_QA_SECTION = new ComponentType("SHAREHOLDER_QA_SECTION", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
            HISTORY_SECTION = new ComponentType("HISTORY_SECTION", 144, 156);
            ADVANCED_CHART = new ComponentType("ADVANCED_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
            UPCOMING_ACTIVITY_SECTION = new ComponentType("UPCOMING_ACTIVITY_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
            TAB = new ComponentType("TAB", 147, 116);
            NEWS_ROW = new ComponentType("NEWS_ROW", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 27);
            HERO_NEWS_ROW = new ComponentType("HERO_NEWS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 28);
            VIDEO_ROW = new ComponentType("VIDEO_ROW", 150, 29);
            HERO_VIDEO_ROW = new ComponentType("HERO_VIDEO_ROW", 151, 30);
            FEATURE_CARD = new ComponentType("FEATURE_CARD", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
            FEATURE_DISCOVERY_WIDGET = new ComponentType("FEATURE_DISCOVERY_WIDGET", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
            MARKET_UPDATES = new ComponentType("MARKET_UPDATES", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
            MARKET_INDICATOR = new ComponentType("MARKET_INDICATOR", 155, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
            DIRECT_DEPOSIT_OPTION_ROW = new ComponentType("DIRECT_DEPOSIT_OPTION_ROW", 156, 16);
            SETUP_DIRECT_DEPOSIT_ROW = new ComponentType("SETUP_DIRECT_DEPOSIT_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 15);
            DEPOSIT_ROW = new ComponentType("DEPOSIT_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 90);
            WITHDRAW_ROW = new ComponentType("WITHDRAW_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 91);
            RECURRING_DEPOSITS_ROW = new ComponentType("RECURRING_DEPOSITS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 92);
            PAY_BY_CHECK_ROW = new ComponentType("PAY_BY_CHECK_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 93);
            TRANSFER_ROW = new ComponentType("TRANSFER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 109);
            DROPDOWN_OPTION = new ComponentType("DROPDOWN_OPTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 110);
            RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG = new ComponentType("RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 167);
            PAYCHECK_SECTION = new ComponentType("PAYCHECK_SECTION", 165, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
            DEBIT_CARD_KYC_BANNER = new ComponentType("DEBIT_CARD_KYC_BANNER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 188);
            ACH_TRANSFER_OPTION_CARD = new ComponentType("ACH_TRANSFER_OPTION_CARD", 167, 201);
            CRYPTO_TRANSFERS_ROW = new ComponentType("CRYPTO_TRANSFERS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
            WIRE_TRANSFER_ROW = new ComponentType("WIRE_TRANSFER_ROW", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
            WIRE_UPSELL = new ComponentType("WIRE_UPSELL", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
            TRANSFER_REWARD_PILL = new ComponentType("TRANSFER_REWARD_PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
            EARLY_PAY_TOGGLE = new ComponentType("EARLY_PAY_TOGGLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 66);
            EARLY_PAY_FAQ_ROW = new ComponentType("EARLY_PAY_FAQ_ROW", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 67);
            LIST_HERO = new ComponentType("LIST_HERO", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 1);
            LIST_ASSET_ROW = new ComponentType("LIST_ASSET_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 24);
            LIST_CONTACTS = new ComponentType("LIST_CONTACTS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 108);
            LIST_VIDEO = new ComponentType("LIST_VIDEO", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 113);
            OPTION_INSTRUMENT_ROW = new ComponentType("OPTION_INSTRUMENT_ROW", EnumC7081g.f2773x8d9721ad, 78);
            OPTION_UNTRADABLE_INFO_BAR = new ComponentType("OPTION_UNTRADABLE_INFO_BAR", EnumC7081g.f2780x600b66fe, 79);
            OPTION_NO_MARKETDATA_MESSAGE = new ComponentType("OPTION_NO_MARKETDATA_MESSAGE", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 80);
            OPTION_PNL_CHART = new ComponentType("OPTION_PNL_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 81);
            OPTION_CHAIN_STOCK_CHART = new ComponentType("OPTION_CHAIN_STOCK_CHART", 182, 88);
            OPTION_PENDING_ORDER_ROW = new ComponentType("OPTION_PENDING_ORDER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 118);
            OPTION_WATCHLIST_ITEM_ROW = new ComponentType("OPTION_WATCHLIST_ITEM_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 119);
            OPTION_ORDER_FORM_TYPE_SELECTOR = new ComponentType("OPTION_ORDER_FORM_TYPE_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, 120);
            OPTION_ORDER_FORM_TYPE_GEAR = new ComponentType("OPTION_ORDER_FORM_TYPE_GEAR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            OPTION_ORDER_CONFIGURATION_SWITCH = new ComponentType("OPTION_ORDER_CONFIGURATION_SWITCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            OPTION_ORDER_CONFIGURATION_ROW = new ComponentType("OPTION_ORDER_CONFIGURATION_ROW", 188, 123);
            OPTION_UNTRADABLE_DIALOG = new ComponentType("OPTION_UNTRADABLE_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 125);
            OPTION_PCO_DIALOG = new ComponentType("OPTION_PCO_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            OPTION_EXPIRATION_DIALOG = new ComponentType("OPTION_EXPIRATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            OPTION_WATCHLIST_WELCOME_SHEET = new ComponentType("OPTION_WATCHLIST_WELCOME_SHEET", 192, 128);
            OPTION_PENDING_ORDER_DIALOG = new ComponentType("OPTION_PENDING_ORDER_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            NO_POSITIONS_AVAILABLE_BOTTOM_SHEET = new ComponentType("NO_POSITIONS_AVAILABLE_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, 136);
            STRATEGY_INTRO_CARD = new ComponentType("STRATEGY_INTRO_CARD", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
            STRATEGY_SUMMARY_CARD = new ComponentType("STRATEGY_SUMMARY_CARD", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
            OPTION_ORDER_MARKETABILITY_BANNER = new ComponentType("OPTION_ORDER_MARKETABILITY_BANNER", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 150);
            OPTION_ORDER_MARKETABILITY_TAG = new ComponentType("OPTION_ORDER_MARKETABILITY_TAG", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151);
            ROLLING_CASH_ACCOUNT_BOTTOM_SHEET = new ComponentType("ROLLING_CASH_ACCOUNT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
            STRATEGY_BUILDER_CARD = new ComponentType("STRATEGY_BUILDER_CARD", 200, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
            OPTION_STRATEGY_CHAIN_BOTTOM_SHEET = new ComponentType("OPTION_STRATEGY_CHAIN_BOTTOM_SHEET", 201, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
            STRATEGY_ROW = new ComponentType("STRATEGY_ROW", 202, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            OPTION_SIMULATED_RETURNS_SLIDER = new ComponentType("OPTION_SIMULATED_RETURNS_SLIDER", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            OPTION_SIMULATED_RETURNS_CHART = new ComponentType("OPTION_SIMULATED_RETURNS_CHART", 204, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
            OPTION_ORDER_BID_ASK_BAR = new ComponentType("OPTION_ORDER_BID_ASK_BAR", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            INDEX_OPTION_PCO_DIALOG = new ComponentType("INDEX_OPTION_PCO_DIALOG", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
            OPTION_INSTRUMENT_PILL = new ComponentType("OPTION_INSTRUMENT_PILL", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
            OPTION_DISPLAY_MODE_CARD = new ComponentType("OPTION_DISPLAY_MODE_CARD", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
            RECURRING_FREQUENCY_ROW = new ComponentType("RECURRING_FREQUENCY_ROW", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 42);
            RECURRING_PAYMENT_METHOD_ROW = new ComponentType("RECURRING_PAYMENT_METHOD_ROW", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 43);
            RECURRING_HUB_ROW = new ComponentType("RECURRING_HUB_ROW", 211, 44);
            RECURRING_START_DATE_ROW = new ComponentType("RECURRING_START_DATE_ROW", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
            RECURRING_AMOUNT_ROW = new ComponentType("RECURRING_AMOUNT_ROW", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
            REWARD_CLAIM_CERTIFICATE = new ComponentType("REWARD_CLAIM_CERTIFICATE", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, 94);
            MERCHANT_REWARD_CAROUSEL = new ComponentType("MERCHANT_REWARD_CAROUSEL", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 182);
            MERCHANT_REWARD_OFFER_DETAIL = new ComponentType("MERCHANT_REWARD_OFFER_DETAIL", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
            MERCHANT_REWARD_STATE_EXPLANATION = new ComponentType("MERCHANT_REWARD_STATE_EXPLANATION", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            MERCHANT_REWARD_OFFER_CARD = new ComponentType("MERCHANT_REWARD_OFFER_CARD", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
            POST_REWARD_CLAIM_UPSELL_DIALOG = new ComponentType("POST_REWARD_CLAIM_UPSELL_DIALOG", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
            ORDER_KIND_ROW = new ComponentType("ORDER_KIND_ROW", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 45);
            ADD_ACCOUNT = new ComponentType("ADD_ACCOUNT", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, 46);
            ORDER_TYPE_PICKER = new ComponentType("ORDER_TYPE_PICKER", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, 105);
            ACCOUNT_PCO_DIALOG = new ComponentType("ACCOUNT_PCO_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            INVESTMENT_BASKET_TOGGLE = new ComponentType("INVESTMENT_BASKET_TOGGLE", 224, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
            INVESTMENT_ADDED_TOAST = new ComponentType("INVESTMENT_ADDED_TOAST", 225, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
            BASKET_FULL_TOAST = new ComponentType("BASKET_FULL_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
            PERFORMANCE_CHART = new ComponentType("PERFORMANCE_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
            PERFORMANCE_CHART_SETTINGS = new ComponentType("PERFORMANCE_CHART_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
            SPAN_SELECTOR = new ComponentType("SPAN_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
            DAY_TRADE_COUNTER_ROW = new ComponentType("DAY_TRADE_COUNTER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
            DAY_TRADE_COUNTER_GRAPHIC = new ComponentType("DAY_TRADE_COUNTER_GRAPHIC", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            LEARNING_LESSON_CARD = new ComponentType("LEARNING_LESSON_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 55);
            LEARNING_LESSON_ROW = new ComponentType("LEARNING_LESSON_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 56);
            LEARNING_SECTION = new ComponentType("LEARNING_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 57);
            LEARNING_ENTRY_POINT = new ComponentType("LEARNING_ENTRY_POINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 62);
            LEARNING_MATCHING_EXERCISE = new ComponentType("LEARNING_MATCHING_EXERCISE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, 82);
            LEARNING_MATCHING_EXERCISE_ENTITY = new ComponentType("LEARNING_MATCHING_EXERCISE_ENTITY", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 83);
            LEARNING_MATCHING_EXERCISE_BUCKET = new ComponentType("LEARNING_MATCHING_EXERCISE_BUCKET", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 84);
            LEARNING_FEEDBACK = new ComponentType("LEARNING_FEEDBACK", 239, 85);
            LEARNING_INTERSTITIAL = new ComponentType("LEARNING_INTERSTITIAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 86);
            LEARNING_QUIZ_CONTINUE_HINT = new ComponentType("LEARNING_QUIZ_CONTINUE_HINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 87);
            EDUCATION_TOUR_CARD = new ComponentType("EDUCATION_TOUR_CARD", EnumC7081g.f2778x3356acf6, 115);
            TRANSFER_DETAILS_ROW = new ComponentType("TRANSFER_DETAILS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 58);
            RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG = new ComponentType("RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.f2778x3356acf6);
            RHY_CAROUSEL = new ComponentType("RHY_CAROUSEL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
            RHY_HOME_CARD = new ComponentType("RHY_HOME_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
            RHY_HOME_STATUS_BANNER = new ComponentType("RHY_HOME_STATUS_BANNER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
            HOME_ATM_FINDER = new ComponentType("HOME_ATM_FINDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 147);
            RHY_DD_UPSELL_POST_TRANSFER = new ComponentType("RHY_DD_UPSELL_POST_TRANSFER", EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
            BACKUP_COVERAGE_TOGGLE = new ComponentType("BACKUP_COVERAGE_TOGGLE", 250, 211);
            FLAT_CASHBACK_BOTTOM_SHEET = new ComponentType("FLAT_CASHBACK_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
            RHY_REFERRAL_CASH_OFFER_CARD = new ComponentType("RHY_REFERRAL_CASH_OFFER_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 250);
            RHY_WAITLIST_UPSELL_CARD = new ComponentType("RHY_WAITLIST_UPSELL_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
            RHY_WAITLIST_WAITING_CARD = new ComponentType("RHY_WAITLIST_WAITING_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
            RHY_WAITLIST_CAT = new ComponentType("RHY_WAITLIST_CAT", 255, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
            RHY_MIGRATION_BOTTOM_SHEET = new ComponentType("RHY_MIGRATION_BOTTOM_SHEET", 256, 155);
            RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET = new ComponentType("RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            RHY_TURBOTAX_OFFER_BUTTON_RHY = new ComponentType("RHY_TURBOTAX_OFFER_BUTTON_RHY", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
            RHY_TURBOTAX_OFFER_BUTTON_NON_RHY = new ComponentType("RHY_TURBOTAX_OFFER_BUTTON_NON_RHY", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
            REFERRAL_BANNER = new ComponentType("REFERRAL_BANNER", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
            ACCOUNT_CENTER_REFERRAL_ENTRY_POINT = new ComponentType("ACCOUNT_CENTER_REFERRAL_ENTRY_POINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            SWEEP_DISABLE_DIALOG = new ComponentType("SWEEP_DISABLE_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
            SWEEP_PAUSED_DIALOG = new ComponentType("SWEEP_PAUSED_DIALOG", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET = new ComponentType("VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
            CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG = new ComponentType("CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
            SWEPT_CASH_BALANCE_EXPLANATION_DIALOG = new ComponentType("SWEPT_CASH_BALANCE_EXPLANATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
            CASH_SWEEP_ALREADY_ENABLED_DIALOG = new ComponentType("CASH_SWEEP_ALREADY_ENABLED_DIALOG", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
            CASH_SWEEP_SECTION = new ComponentType("CASH_SWEEP_SECTION", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 204);
            SLIP_SETTING_CARD = new ComponentType("SLIP_SETTING_CARD", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
            LINK_DEBIT_CARD_BANNER = new ComponentType("LINK_DEBIT_CARD_BANNER", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 165);
            SHAREHOLDER_LIST_SECTION = new ComponentType("SHAREHOLDER_LIST_SECTION", 271, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
            MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET = new ComponentType("MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
            MARGIN_REQUIREMENT_SECTION = new ComponentType("MARGIN_REQUIREMENT_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 239);
            IRA_TAX_WITHHOLDING_BOTTOM_SHEET = new ComponentType("IRA_TAX_WITHHOLDING_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
            ACCOUNT_SELECTOR = new ComponentType("ACCOUNT_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
            BIOMETRIC_AUTH_BUTTON = new ComponentType("BIOMETRIC_AUTH_BUTTON", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
            PORTFOLIO_TABLE_COLUMN_HEADING = new ComponentType("PORTFOLIO_TABLE_COLUMN_HEADING", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
            ASSET_DISPLAY_VALUE_DIALOG = new ComponentType("ASSET_DISPLAY_VALUE_DIALOG", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
            BUYING_POWER_ROW = new ComponentType("BUYING_POWER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            PORTFOLIO_CHART = new ComponentType("PORTFOLIO_CHART", 280, 280);
            GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET = new ComponentType("GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
            GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET = new ComponentType("GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
            ASSET_SELECTOR = new ComponentType("ASSET_SELECTOR", 283, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
            PNL_CHART = new ComponentType("PNL_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
            PNL_SETTINGS = new ComponentType("PNL_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 271);
            PNL_DETAIL_BOTTOM_SHEET = new ComponentType("PNL_DETAIL_BOTTOM_SHEET", EnumC7081g.f2777x89a9e432, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
            REALIZED_GAIN_LOSS_SECTION = new ComponentType("REALIZED_GAIN_LOSS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
            FUTURES_TRADE_BAR = new ComponentType("FUTURES_TRADE_BAR", 288, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
            FUTURES_LIST_SORT_BOTTOM_SHEET = new ComponentType("FUTURES_LIST_SORT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
            LADDER_NUX = new ComponentType("LADDER_NUX", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
            CASH_BALANCES_HOME_SECTION = new ComponentType("CASH_BALANCES_HOME_SECTION", EnumC7081g.f2776x87e624cb, 288);
            CORTEX_DIGEST_SECTION = new ComponentType("CORTEX_DIGEST_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.f2776x87e624cb);
            PILL = new ComponentType("PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
            EDUCATION_ROW = new ComponentType("EDUCATION_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
            NEWS_SECTION = new ComponentType("NEWS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
            PENDING_ORDER_ROW = new ComponentType("PENDING_ORDER_ROW", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
            PENDING_ORDER_SECTION = new ComponentType("PENDING_ORDER_SECTION", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
            TOKENIZED_STOCK_HOLDING_ROW = new ComponentType("TOKENIZED_STOCK_HOLDING_ROW", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
            TOKENIZED_STOCK_HOLDING_SECTION = new ComponentType("TOKENIZED_STOCK_HOLDING_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
            PERPETUALS_HOLDING_SECTION = new ComponentType("PERPETUALS_HOLDING_SECTION", 300, 300);
            OPEN_POSITION_SUMMARY = new ComponentType("OPEN_POSITION_SUMMARY", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
            OPEN_POSITIONS_SECTION = new ComponentType("OPEN_POSITIONS_SECTION", 302, 302);
            PENDING_ORDERS_SECTION = new ComponentType("PENDING_ORDERS_SECTION", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
            EXPLORE_SECTION = new ComponentType("EXPLORE_SECTION", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
            PNL_SECTION = new ComponentType("PNL_SECTION", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
            OPTION_PROFIT_AND_LOSS_CARD = new ComponentType("OPTION_PROFIT_AND_LOSS_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
            OPTION_PROFIT_AND_LOSS_SLIDER = new ComponentType("OPTION_PROFIT_AND_LOSS_SLIDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
            COMPANY_FINANCIALS_CHART = new ComponentType("COMPANY_FINANCIALS_CHART", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
            CORTEX_DIGEST_UPSELL_SECTION = new ComponentType("CORTEX_DIGEST_UPSELL_SECTION", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
            COMPANY_FINANCIALS_SECTION = new ComponentType("COMPANY_FINANCIALS_SECTION", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
            WATCHLIST_ROW = new ComponentType("WATCHLIST_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
            RETURNS_CHART = new ComponentType("RETURNS_CHART", EnumC7081g.f2774x74902ae0, EnumC7081g.f2774x74902ae0);
            SELECT_MENU = new ComponentType("SELECT_MENU", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
            OPTIONS_STATUS_SECTION = new ComponentType("OPTIONS_STATUS_SECTION", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
            FX_SWITCHER = new ComponentType("FX_SWITCHER", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
            PROXY_VOTE_SECTION = new ComponentType("PROXY_VOTE_SECTION", 316, 316);
            EVENT_CONTRACT_TRADE_OVERLAY_DIALOG = new ComponentType("EVENT_CONTRACT_TRADE_OVERLAY_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            OPTION_L3_ENTRYPOINT_TAG = new ComponentType("OPTION_L3_ENTRYPOINT_TAG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
            CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET = new ComponentType("CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET", EnumC7081g.f2781x2ba65ba3, EnumC7081g.f2781x2ba65ba3);
            DASHBOARD_PILL = new ComponentType("DASHBOARD_PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
            FEED_POST_ROW = new ComponentType("FEED_POST_ROW", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
            ACTIVITY_ITEM_ROW = new ComponentType("ACTIVITY_ITEM_ROW", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
            CONCIERGE_PLUS_UPSELL_BANNER = new ComponentType("CONCIERGE_PLUS_UPSELL_BANNER", EnumC7081g.f2775xbcb7e6f3, EnumC7081g.f2775xbcb7e6f3);
            RECURRING_INVESTMENTS_EQUITY_NUX = new ComponentType("RECURRING_INVESTMENTS_EQUITY_NUX", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            EVENT_CONTRACT_COMBO_LEG = new ComponentType("EVENT_CONTRACT_COMBO_LEG", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
            EVENT_CONTRACT_STRIKE_PICKER = new ComponentType("EVENT_CONTRACT_STRIKE_PICKER", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
            INTEREST_SECTION = new ComponentType("INTEREST_SECTION", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
            CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET = new ComponentType("CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
            ComponentType[] componentTypeArr$values = $values();
            $VALUES = componentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(componentTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComponentType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ComponentType>(orCreateKotlinClass, syntax, componentType) { // from class: com.robinhood.rosetta.eventlogging.Component$ComponentType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Component.ComponentType fromValue(int value) {
                    return Component.ComponentType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Component.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Component$ComponentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ComponentType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ComponentType.COMPONENT_TYPE_UNSPECIFIED;
                    case 1:
                        return ComponentType.LIST_HERO;
                    case 2:
                        return ComponentType.LIST_CHIP_GRID;
                    case 3:
                        return ComponentType.LIST_CAROUSEL;
                    case 4:
                        return ComponentType.ERROR_TOAST;
                    case 5:
                        return ComponentType.CANCEL_CONFIRMATION_ALERT;
                    case 6:
                        return ComponentType.CANCEL_ERROR_ALERT;
                    case 7:
                        return ComponentType.CX_PHONE_UNAVAILABLE_ALERT;
                    case 8:
                        return ComponentType.CX_CALL_STATUS_BANNER;
                    case 9:
                        return ComponentType.HIDE_CX_CALL_STATUS_BANNER_TOAST;
                    case 10:
                        return ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT;
                    case 11:
                        return ComponentType.ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST;
                    case 12:
                        return ComponentType.CX_CALL_ASSIGNED_TOAST;
                    case 13:
                        return ComponentType.UPDATE_LIST_TOAST;
                    case 14:
                        return ComponentType.ADD_TO_LIST_BOTTOM_SHEET;
                    case 15:
                        return ComponentType.SETUP_DIRECT_DEPOSIT_ROW;
                    case 16:
                        return ComponentType.DIRECT_DEPOSIT_OPTION_ROW;
                    case 17:
                        return ComponentType.UPDATE_EMPLOYER_INFO_ALERT;
                    case 18:
                        return ComponentType.DONE_BUTTON;
                    case 19:
                        return ComponentType.CONTINUE_BUTTON;
                    case 20:
                        return ComponentType.BUTTON;
                    case 21:
                        return ComponentType.SKIP_BUTTON;
                    case 22:
                        return ComponentType.ERROR_ALERT;
                    case 23:
                        return ComponentType.FILTERS_BUTTON;
                    case 24:
                        return ComponentType.LIST_ASSET_ROW;
                    case 25:
                        return ComponentType.CAROUSEL;
                    case 26:
                        return ComponentType.FEEDBACK_BOTTOM_SHEET;
                    case 27:
                        return ComponentType.NEWS_ROW;
                    case 28:
                        return ComponentType.HERO_NEWS_ROW;
                    case 29:
                        return ComponentType.VIDEO_ROW;
                    case 30:
                        return ComponentType.HERO_VIDEO_ROW;
                    case 31:
                        return ComponentType.ASSET_CARD;
                    case 32:
                        return ComponentType.ASSET_TICKER_BUTTON;
                    case 33:
                        return ComponentType.LIST_CHIP;
                    case 34:
                        return ComponentType.LINK_BUTTON;
                    case 35:
                        return ComponentType.DD_MANUAL_SETUP_ALERT;
                    case 36:
                        return ComponentType.DD_SWITCHER_ENTRY_POINT;
                    case 37:
                        return ComponentType.BACK_BUTTON;
                    case 38:
                        return ComponentType.DATE_PICKER_BOTTOM_SHEET;
                    case 39:
                        return ComponentType.REVIEW_BUTTON;
                    case 40:
                        return ComponentType.RECURRING_INVESTMENTS_BUTTON;
                    case 41:
                        return ComponentType.RECURRING_SUMMARY_DIALOG;
                    case 42:
                        return ComponentType.RECURRING_FREQUENCY_ROW;
                    case 43:
                        return ComponentType.RECURRING_PAYMENT_METHOD_ROW;
                    case 44:
                        return ComponentType.RECURRING_HUB_ROW;
                    case 45:
                        return ComponentType.ORDER_KIND_ROW;
                    case 46:
                        return ComponentType.ADD_ACCOUNT;
                    case 47:
                        return ComponentType.TEXT_FIELD;
                    case 48:
                        return ComponentType.SEARCH_BAR;
                    case 49:
                        return ComponentType.SEARCH_RESULT_ROW;
                    case 50:
                        return ComponentType.CONTACT_SIGNIN_BANNER;
                    case 51:
                        return ComponentType.INFO_BANNER;
                    case 52:
                        return ComponentType.HERO_BANNER;
                    case 53:
                        return ComponentType.STATUS_BANNER;
                    case 54:
                        return ComponentType.ALERT_SHEET;
                    case 55:
                        return ComponentType.LEARNING_LESSON_CARD;
                    case 56:
                        return ComponentType.LEARNING_LESSON_ROW;
                    case 57:
                        return ComponentType.LEARNING_SECTION;
                    case 58:
                        return ComponentType.TRANSFER_DETAILS_ROW;
                    case 59:
                        return ComponentType.LOADING_PLACEHOLDER;
                    case 60:
                        return ComponentType.MAP;
                    case 61:
                        return ComponentType.RADIO_BUTTON;
                    case 62:
                        return ComponentType.LEARNING_ENTRY_POINT;
                    case 63:
                        return ComponentType.EARLY_PAY_ENABLE_CONFIRMATION_ALERT;
                    case 64:
                        return ComponentType.EARLY_PAY_DISABLE_CONFIRMATION_ALERT;
                    case 65:
                        return ComponentType.EARLY_PAY_TOGGLE_LIMIT_ALERT;
                    case 66:
                        return ComponentType.EARLY_PAY_TOGGLE;
                    case 67:
                        return ComponentType.EARLY_PAY_FAQ_ROW;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return ComponentType.CHIP;
                    case 69:
                        return ComponentType.ASSET_ROW;
                    case 70:
                        return ComponentType.CHIP_GRID;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return ComponentType.ROW;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return ComponentType.DATE_RANGE_BUTTON;
                    case 73:
                        return ComponentType.CLOSE_BUTTON;
                    case 74:
                        return ComponentType.CANCEL_BUTTON;
                    case 75:
                        return ComponentType.DELETE_BUTTON;
                    case 76:
                        return ComponentType.BOTTOM_SHEET;
                    case 77:
                        return ComponentType.CALENDAR_DATE_PICKER;
                    case 78:
                        return ComponentType.OPTION_INSTRUMENT_ROW;
                    case 79:
                        return ComponentType.OPTION_UNTRADABLE_INFO_BAR;
                    case 80:
                        return ComponentType.OPTION_NO_MARKETDATA_MESSAGE;
                    case 81:
                        return ComponentType.OPTION_PNL_CHART;
                    case 82:
                        return ComponentType.LEARNING_MATCHING_EXERCISE;
                    case 83:
                        return ComponentType.LEARNING_MATCHING_EXERCISE_ENTITY;
                    case 84:
                        return ComponentType.LEARNING_MATCHING_EXERCISE_BUCKET;
                    case 85:
                        return ComponentType.LEARNING_FEEDBACK;
                    case 86:
                        return ComponentType.LEARNING_INTERSTITIAL;
                    case 87:
                        return ComponentType.LEARNING_QUIZ_CONTINUE_HINT;
                    case 88:
                        return ComponentType.OPTION_CHAIN_STOCK_CHART;
                    case 89:
                        return ComponentType.REDEMPTION_CARD;
                    case 90:
                        return ComponentType.DEPOSIT_ROW;
                    case 91:
                        return ComponentType.WITHDRAW_ROW;
                    case 92:
                        return ComponentType.RECURRING_DEPOSITS_ROW;
                    case 93:
                        return ComponentType.PAY_BY_CHECK_ROW;
                    case 94:
                        return ComponentType.REWARD_CLAIM_CERTIFICATE;
                    case 95:
                        return ComponentType.SAFETY_LABEL_INFO_TAG;
                    case 96:
                        return ComponentType.TOOLTIP;
                    case 97:
                        return ComponentType.PERFORMANCE_SECTION;
                    case 98:
                        return ComponentType.STATS_SECTION;
                    case 99:
                        return ComponentType.GRAPH_SECTION;
                    case 100:
                        return ComponentType.POSITION_SECTION;
                    case 101:
                        return ComponentType.RESEARCH_REPORT_SECTION;
                    case 102:
                        return ComponentType.EARNINGS_SECTION;
                    case 103:
                        return ComponentType.PEOPLE_ALSO_VIEW_SECTION;
                    case 104:
                        return ComponentType.TRADE_BAR;
                    case 105:
                        return ComponentType.ORDER_TYPE_PICKER;
                    case 106:
                        return ComponentType.ETP_COMPOSITION_SECTION;
                    case 107:
                        return ComponentType.ABOUT_SECTION;
                    case 108:
                        return ComponentType.LIST_CONTACTS;
                    case 109:
                        return ComponentType.TRANSFER_ROW;
                    case 110:
                        return ComponentType.DROPDOWN_OPTION;
                    case 111:
                        return ComponentType.ANALYST_RATINGS_SECTION;
                    case 112:
                        return ComponentType.RELATED_LISTS_SECTION;
                    case 113:
                        return ComponentType.LIST_VIDEO;
                    case 114:
                        return ComponentType.ALERT;
                    case 115:
                        return ComponentType.EDUCATION_TOUR_CARD;
                    case 116:
                        return ComponentType.TAB;
                    case 117:
                        return ComponentType.HISTORY_ROW;
                    case 118:
                        return ComponentType.OPTION_PENDING_ORDER_ROW;
                    case 119:
                        return ComponentType.OPTION_WATCHLIST_ITEM_ROW;
                    case 120:
                        return ComponentType.OPTION_ORDER_FORM_TYPE_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return ComponentType.OPTION_ORDER_FORM_TYPE_GEAR;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return ComponentType.OPTION_ORDER_CONFIGURATION_SWITCH;
                    case 123:
                        return ComponentType.OPTION_ORDER_CONFIGURATION_ROW;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return ComponentType.ACCOUNT_PCO_DIALOG;
                    case 125:
                        return ComponentType.OPTION_UNTRADABLE_DIALOG;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return ComponentType.OPTION_PCO_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return ComponentType.OPTION_EXPIRATION_DIALOG;
                    case 128:
                        return ComponentType.OPTION_WATCHLIST_WELCOME_SHEET;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return ComponentType.OPTION_PENDING_ORDER_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return ComponentType.MICROPHONE_PERMISSION_DIALOG;
                    case 131:
                        return ComponentType.PERMISSION_SETTINGS_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return ComponentType.PROCESSING_ERROR_TOAST;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return ComponentType.PERMISSION_ERROR_TOAST;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return ComponentType.VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return ComponentType.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET;
                    case 136:
                        return ComponentType.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return ComponentType.STRATEGY_INTRO_CARD;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return ComponentType.STRATEGY_SUMMARY_CARD;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return ComponentType.QR_CODE;
                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                        return ComponentType.SHAREHOLDER_QA_SECTION;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return ComponentType.RHY_CAROUSEL;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return ComponentType.RHY_HOME_CARD;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return ComponentType.RHY_HOME_STATUS_BANNER;
                    case 144:
                        return ComponentType.RECOMMENDATIONS_BROWSE_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return ComponentType.RECURRING_START_DATE_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return ComponentType.RECURRING_AMOUNT_ROW;
                    case 147:
                        return ComponentType.HOME_ATM_FINDER;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return ComponentType.FEATURE_CARD;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return ComponentType.FEATURE_DISCOVERY_WIDGET;
                    case 150:
                        return ComponentType.OPTION_ORDER_MARKETABILITY_BANNER;
                    case 151:
                        return ComponentType.OPTION_ORDER_MARKETABILITY_TAG;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return ComponentType.RHY_WAITLIST_UPSELL_CARD;
                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                        return ComponentType.RHY_WAITLIST_WAITING_CARD;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return ComponentType.RHY_WAITLIST_CAT;
                    case 155:
                        return ComponentType.RHY_MIGRATION_BOTTOM_SHEET;
                    case 156:
                        return ComponentType.HISTORY_SECTION;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return ComponentType.REFERRAL_BANNER;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        return ComponentType.SWEEP_DISABLE_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return ComponentType.SLIP_SETTING_CARD;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return ComponentType.SWEEP_PAUSED_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return ComponentType.VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return ComponentType.CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return ComponentType.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return ComponentType.CASH_SWEEP_ALREADY_ENABLED_DIALOG;
                    case 165:
                        return ComponentType.LINK_DEBIT_CARD_BANNER;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return ComponentType.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET;
                    case 167:
                        return ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return ComponentType.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return ComponentType.CX_CHAT_STATUS_BANNER;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return ComponentType.INLINE_DEFINITION;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return ComponentType.SHAREHOLDER_LIST_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return ComponentType.PUSH_NOTIFICATION;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return ComponentType.PAYCHECK_SECTION;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return ComponentType.INVESTMENT_BASKET_TOGGLE;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return ComponentType.INVESTMENT_ADDED_TOAST;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return ComponentType.BASKET_FULL_TOAST;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return ComponentType.MARKET_UPDATES;
                    case f2773x8d9721ad:
                        return ComponentType.NOT_YET_BUTTON;
                    case f2780x600b66fe:
                        return ComponentType.HELP_BUTTON;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return ComponentType.MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        return ComponentType.RHY_DD_UPSELL_POST_TRANSFER;
                    case 182:
                        return ComponentType.MERCHANT_REWARD_CAROUSEL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return ComponentType.MERCHANT_REWARD_OFFER_DETAIL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return ComponentType.MERCHANT_REWARD_STATE_EXPLANATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                        return ComponentType.MERCHANT_REWARD_OFFER_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return ComponentType.IRA_TAX_WITHHOLDING_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return ComponentType.RECENT_SEARCH_ROW;
                    case 188:
                        return ComponentType.DEBIT_CARD_KYC_BANNER;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return ComponentType.STRATEGY_BUILDER_CARD;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return ComponentType.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return ComponentType.STRATEGY_ROW;
                    case 192:
                        return ComponentType.MENU_ITEM;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                        return ComponentType.EDUCATION_TOUR_TOOLTIP;
                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                        return ComponentType.NEW_PRODUCT_CARD;
                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                        return ComponentType.ADVANCED_ALERT_SETTINGS;
                    case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                        return ComponentType.PRICE_ALERT_EDITOR;
                    case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                        return ComponentType.PASSKEY_ENROLLMENT_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_ARROW_UP_VALUE:
                        return ComponentType.KEYCHAIN_LOGIN_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_CANCEL_VALUE:
                        return ComponentType.ALERT_SETTING_ROW;
                    case 200:
                        return ComponentType.ALERT_SETTING_TOGGLE;
                    case 201:
                        return ComponentType.ACH_TRANSFER_OPTION_CARD;
                    case 202:
                        return ComponentType.BALANCE_SECTION;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return ComponentType.BIOMETRIC_AUTH_BUTTON;
                    case 204:
                        return ComponentType.CASH_SWEEP_SECTION;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return ComponentType.MARKET_INDICATOR;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return ComponentType.ACCOUNT_SELECTOR;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return ComponentType.PERFORMANCE_CHART;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return ComponentType.PERFORMANCE_CHART_SETTINGS;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return ComponentType.L2E_ONBOARDING;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return ComponentType.VERIFY_DEBIT_CARD_BANNER;
                    case 211:
                        return ComponentType.BACKUP_COVERAGE_TOGGLE;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return ComponentType.SPAN_SELECTOR;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return ComponentType.SHORTCUTS_FIRST_TIME_POPUP;
                    case SDK_ASSET_ICON_PIN_VALUE:
                        return ComponentType.ACCOUNT_SWITCHER;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return ComponentType.ACCOUNT_SWITCHER_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return ComponentType.CRYPTO_NOTIFICATION_CARD;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return ComponentType.HOLDING_ROW;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return ComponentType.PRICE_CHART;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return ComponentType.RECURRING_ROW;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return ComponentType.EXPLORE_ROW;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return ComponentType.NOTIFICATION_CARD;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return ComponentType.NOTIFICATION_CARD_STACK;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return ComponentType.NOTIFICATION_COMPLETION_CARD;
                    case 224:
                        return ComponentType.UPDATE_INVESTOR_PROFILE_BANNER;
                    case 225:
                        return ComponentType.PRICE_ALERT_TYPE_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return ComponentType.SIDEBAR;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return ComponentType.FLAT_CASHBACK_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return ComponentType.LIST_ROW;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return ComponentType.PORTFOLIO_TABLE_COLUMN_HEADING;
                    case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                        return ComponentType.ASSET_DISPLAY_VALUE_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        return ComponentType.LIST_HEADER;
                    case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                        return ComponentType.SECTION_HEADER;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                        return ComponentType.RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                        return ComponentType.RHY_TURBOTAX_OFFER_BUTTON_RHY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                        return ComponentType.RHY_TURBOTAX_OFFER_BUTTON_NON_RHY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                        return ComponentType.BUYING_POWER_ROW;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                        return ComponentType.CX_CHATBOT_BANNER;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        return ComponentType.SCREENER_PRESET_CARD;
                    case 239:
                        return ComponentType.MARGIN_REQUIREMENT_SECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        return ComponentType.ACCOUNT_CENTER_REFERRAL_ENTRY_POINT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        return ComponentType.CRYPTO_TRANSFERS_ROW;
                    case f2778x3356acf6:
                        return ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        return ComponentType.TOGGLE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        return ComponentType.ACCOUNT_CENTER_UPSELL_BANNER;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                        return ComponentType.CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                        return ComponentType.WIRE_TRANSFER_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        return ComponentType.WIRE_UPSELL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                        return ComponentType.GOLD_UPSELL_HOOK_DIALOG;
                    case f2779x59907a3d:
                        return ComponentType.SUCCESS_TOAST;
                    case 250:
                        return ComponentType.RHY_REFERRAL_CASH_OFFER_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        return ComponentType.POST_REWARD_CLAIM_UPSELL_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                        return ComponentType.INFO_TAG;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                        return ComponentType.DAY_TRADE_COUNTER_ROW;
                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                        return ComponentType.DAY_TRADE_COUNTER_GRAPHIC;
                    case 255:
                        return ComponentType.FX_CONVERSION_TOOLTIP;
                    case 256:
                        return ComponentType.HERO_CARD;
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        return ComponentType.OPTION_SIMULATED_RETURNS_SLIDER;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        return ComponentType.OPTION_SIMULATED_RETURNS_CHART;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        return ComponentType.TEXT_VIEW;
                    case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                        return ComponentType.SEGMENTED_CONTROL;
                    case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                        return ComponentType.OPTION_ORDER_BID_ASK_BAR;
                    case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                        return ComponentType.TRADING_TRENDS_CHART;
                    case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                        return ComponentType.SEGMENT;
                    case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                        return ComponentType.TABLE;
                    case SDK_ASSET_HEADER_SHIELD_VALUE:
                        return ComponentType.ERROR_LOADING;
                    case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                        return ComponentType.HOLDING_SECTION;
                    case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                        return ComponentType.GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET;
                    case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                        return ComponentType.GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET;
                    case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                        return ComponentType.ASSET_SELECTOR;
                    case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                        return ComponentType.PNL_CHART;
                    case 271:
                        return ComponentType.PNL_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                        return ComponentType.PNL_DETAIL_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                        return ComponentType.REALIZED_GAIN_LOSS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                        return ComponentType.ADVANCED_CHART;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                        return ComponentType.UPCOMING_ACTIVITY_SECTION;
                    case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                        return ComponentType.FUTURES_TRADE_BAR;
                    case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                        return ComponentType.FUTURES_LIST_SORT_BOTTOM_SHEET;
                    case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                        return ComponentType.INDEX_OPTION_PCO_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                        return ComponentType.TRANSFER_REWARD_PILL;
                    case 280:
                        return ComponentType.PORTFOLIO_CHART;
                    case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                        return ComponentType.SLIDER;
                    case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                        return ComponentType.SCRUB_BAR;
                    case 283:
                        return ComponentType.STICKY_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                        return ComponentType.OPTION_INSTRUMENT_PILL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                        return ComponentType.OPTION_DISPLAY_MODE_CARD;
                    case f2777x89a9e432:
                        return ComponentType.LIVE_ACTIVITY;
                    case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                        return ComponentType.BREAKING_NEWS_BANNER;
                    case 288:
                        return ComponentType.CASH_BALANCES_HOME_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                        return ComponentType.LADDER_NUX;
                    case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                        return ComponentType.BADGE;
                    case f2776x87e624cb:
                        return ComponentType.CORTEX_DIGEST_SECTION;
                    case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                        return ComponentType.STAKING_SECTION;
                    case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                        return ComponentType.PILL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                        return ComponentType.EDUCATION_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                        return ComponentType.NEWS_SECTION;
                    case SDK_ASSET_LOADING_INDICATOR_VALUE:
                        return ComponentType.PENDING_ORDER_ROW;
                    case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                        return ComponentType.PENDING_ORDER_SECTION;
                    case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                        return ComponentType.TOKENIZED_STOCK_HOLDING_ROW;
                    case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                        return ComponentType.TOKENIZED_STOCK_HOLDING_SECTION;
                    case 300:
                        return ComponentType.PERPETUALS_HOLDING_SECTION;
                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                        return ComponentType.OPEN_POSITION_SUMMARY;
                    case 302:
                        return ComponentType.OPEN_POSITIONS_SECTION;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                        return ComponentType.PENDING_ORDERS_SECTION;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                        return ComponentType.EXPLORE_SECTION;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                        return ComponentType.PNL_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                        return ComponentType.OPTION_PROFIT_AND_LOSS_CARD;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                        return ComponentType.OPTION_PROFIT_AND_LOSS_SLIDER;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                        return ComponentType.COMPANY_FINANCIALS_CHART;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                        return ComponentType.CORTEX_DIGEST_UPSELL_SECTION;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                        return ComponentType.COMPANY_FINANCIALS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                        return ComponentType.WATCHLIST_ROW;
                    case f2774x74902ae0:
                        return ComponentType.RETURNS_CHART;
                    case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                        return ComponentType.SELECT_MENU;
                    case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                        return ComponentType.OPTIONS_STATUS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                        return ComponentType.FX_SWITCHER;
                    case 316:
                        return ComponentType.PROXY_VOTE_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                        return ComponentType.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                        return ComponentType.OPTION_L3_ENTRYPOINT_TAG;
                    case f2781x2ba65ba3:
                        return ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                        return ComponentType.DASHBOARD_PILL;
                    case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                        return ComponentType.FEED_POST_ROW;
                    case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                        return ComponentType.ACTIVITY_ITEM_ROW;
                    case f2775xbcb7e6f3:
                        return ComponentType.CONCIERGE_PLUS_UPSELL_BANNER;
                    case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                        return ComponentType.RECURRING_INVESTMENTS_EQUITY_NUX;
                    case SDK_ASSET_ICON_REPORT_VALUE:
                        return ComponentType.EVENT_CONTRACT_COMBO_LEG;
                    case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                        return ComponentType.EVENT_CONTRACT_STRIKE_PICKER;
                    case SDK_ASSET_ICON_UPLOAD_VALUE:
                        return ComponentType.INTEREST_SECTION;
                    case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                        return ComponentType.CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET;
                    default:
                        return null;
                }
            }
        }

        public static ComponentType valueOf(String str) {
            return (ComponentType) Enum.valueOf(ComponentType.class, str);
        }

        public static ComponentType[] values() {
            return (ComponentType[]) $VALUES.clone();
        }
    }
}
