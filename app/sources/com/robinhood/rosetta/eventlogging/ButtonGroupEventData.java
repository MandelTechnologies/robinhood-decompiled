package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ButtonGroupEventData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;", "Lcom/squareup/wire/Message;", "", "button_group_title", "", "button_title", "button_description", "entity_id", "tag", "entity_type", "additional_info", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfo;Lokio/ByteString;)V", "getButton_group_title", "()Ljava/lang/String;", "getButton_title", "getButton_description", "getEntity_id", "getTag", "getEntity_type", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ButtonGroupEventData extends Message {

    @JvmField
    public static final ProtoAdapter<ButtonGroupEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ButtonGroupEventDataAdditionalInfo#ADAPTER", jsonName = "additionalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ButtonGroupEventDataAdditionalInfo additional_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String button_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonGroupTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String button_group_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String tag;

    public ButtonGroupEventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ ButtonGroupEventData(String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : buttonGroupEventDataAdditionalInfo, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24037newBuilder();
    }

    public final String getButton_group_title() {
        return this.button_group_title;
    }

    public final String getButton_title() {
        return this.button_title;
    }

    public final String getButton_description() {
        return this.button_description;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final ButtonGroupEventDataAdditionalInfo getAdditional_info() {
        return this.additional_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonGroupEventData(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.button_group_title = button_group_title;
        this.button_title = button_title;
        this.button_description = button_description;
        this.entity_id = entity_id;
        this.tag = tag;
        this.entity_type = entity_type;
        this.additional_info = buttonGroupEventDataAdditionalInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24037newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ButtonGroupEventData)) {
            return false;
        }
        ButtonGroupEventData buttonGroupEventData = (ButtonGroupEventData) other;
        return Intrinsics.areEqual(unknownFields(), buttonGroupEventData.unknownFields()) && Intrinsics.areEqual(this.button_group_title, buttonGroupEventData.button_group_title) && Intrinsics.areEqual(this.button_title, buttonGroupEventData.button_title) && Intrinsics.areEqual(this.button_description, buttonGroupEventData.button_description) && Intrinsics.areEqual(this.entity_id, buttonGroupEventData.entity_id) && Intrinsics.areEqual(this.tag, buttonGroupEventData.tag) && Intrinsics.areEqual(this.entity_type, buttonGroupEventData.entity_type) && Intrinsics.areEqual(this.additional_info, buttonGroupEventData.additional_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.button_group_title.hashCode()) * 37) + this.button_title.hashCode()) * 37) + this.button_description.hashCode()) * 37) + this.entity_id.hashCode()) * 37) + this.tag.hashCode()) * 37) + this.entity_type.hashCode()) * 37;
        ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo = this.additional_info;
        int iHashCode2 = iHashCode + (buttonGroupEventDataAdditionalInfo != null ? buttonGroupEventDataAdditionalInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("button_group_title=" + Internal.sanitize(this.button_group_title));
        arrayList.add("button_title=" + Internal.sanitize(this.button_title));
        arrayList.add("button_description=" + Internal.sanitize(this.button_description));
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        arrayList.add("entity_type=" + Internal.sanitize(this.entity_type));
        ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo = this.additional_info;
        if (buttonGroupEventDataAdditionalInfo != null) {
            arrayList.add("additional_info=" + buttonGroupEventDataAdditionalInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonGroupEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ButtonGroupEventData copy$default(ButtonGroupEventData buttonGroupEventData, String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonGroupEventData.button_group_title;
        }
        if ((i & 2) != 0) {
            str2 = buttonGroupEventData.button_title;
        }
        if ((i & 4) != 0) {
            str3 = buttonGroupEventData.button_description;
        }
        if ((i & 8) != 0) {
            str4 = buttonGroupEventData.entity_id;
        }
        if ((i & 16) != 0) {
            str5 = buttonGroupEventData.tag;
        }
        if ((i & 32) != 0) {
            str6 = buttonGroupEventData.entity_type;
        }
        if ((i & 64) != 0) {
            buttonGroupEventDataAdditionalInfo = buttonGroupEventData.additional_info;
        }
        if ((i & 128) != 0) {
            byteString = buttonGroupEventData.unknownFields();
        }
        ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo2 = buttonGroupEventDataAdditionalInfo;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        return buttonGroupEventData.copy(str, str2, str3, str4, str7, str8, buttonGroupEventDataAdditionalInfo2, byteString2);
    }

    public final ButtonGroupEventData copy(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfo additional_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ButtonGroupEventData(button_group_title, button_title, button_description, entity_id, tag, entity_type, additional_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ButtonGroupEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ButtonGroupEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ButtonGroupEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ButtonGroupEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getButton_group_title());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTag());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEntity_type());
                }
                return value.getAdditional_info() != null ? size + ButtonGroupEventDataAdditionalInfo.ADAPTER.encodedSizeWithTag(7, value.getAdditional_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ButtonGroupEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getButton_group_title());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTag());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEntity_type());
                }
                if (value.getAdditional_info() != null) {
                    ButtonGroupEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdditional_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ButtonGroupEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAdditional_info() != null) {
                    ButtonGroupEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTag());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getButton_title());
                }
                if (Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getButton_group_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ButtonGroupEventData redact(ButtonGroupEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ButtonGroupEventDataAdditionalInfo additional_info = value.getAdditional_info();
                return ButtonGroupEventData.copy$default(value, null, null, null, null, null, null, additional_info != null ? ButtonGroupEventDataAdditionalInfo.ADAPTER.redact(additional_info) : null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ButtonGroupEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfoDecode = null;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                buttonGroupEventDataAdditionalInfoDecode = ButtonGroupEventDataAdditionalInfo.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ButtonGroupEventData(strDecode, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, buttonGroupEventDataAdditionalInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
