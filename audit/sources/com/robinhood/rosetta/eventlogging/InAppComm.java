package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: InAppComm.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppComm;", "Lcom/squareup/wire/Message;", "", "receipt_unique_identifier", "", "title", "text", "location", "load_id", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "can_passively_dismiss", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getReceipt_unique_identifier", "()Ljava/lang/String;", "getTitle", "getText", "getLocation", "getLoad_id", "getDisclosure", "getCan_passively_dismiss", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InAppComm extends Message {

    @JvmField
    public static final ProtoAdapter<InAppComm> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "canPassivelyDismiss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean can_passively_dismiss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String load_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "receiptUniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String receipt_unique_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public InAppComm() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ InAppComm(String str, String str2, String str3, String str4, String str5, String str6, Boolean r8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r8, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24309newBuilder();
    }

    public final String getReceipt_unique_identifier() {
        return this.receipt_unique_identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getText() {
        return this.text;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getLoad_id() {
        return this.load_id;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final Boolean getCan_passively_dismiss() {
        return this.can_passively_dismiss;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppComm(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, Boolean can_passively_dismiss, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.receipt_unique_identifier = receipt_unique_identifier;
        this.title = title;
        this.text = text;
        this.location = location;
        this.load_id = load_id;
        this.disclosure = disclosure;
        this.can_passively_dismiss = can_passively_dismiss;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24309newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InAppComm)) {
            return false;
        }
        InAppComm inAppComm = (InAppComm) other;
        return Intrinsics.areEqual(unknownFields(), inAppComm.unknownFields()) && Intrinsics.areEqual(this.receipt_unique_identifier, inAppComm.receipt_unique_identifier) && Intrinsics.areEqual(this.title, inAppComm.title) && Intrinsics.areEqual(this.text, inAppComm.text) && Intrinsics.areEqual(this.location, inAppComm.location) && Intrinsics.areEqual(this.load_id, inAppComm.load_id) && Intrinsics.areEqual(this.disclosure, inAppComm.disclosure) && this.can_passively_dismiss == inAppComm.can_passively_dismiss;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.receipt_unique_identifier.hashCode()) * 37) + this.title.hashCode()) * 37) + this.text.hashCode()) * 37) + this.location.hashCode()) * 37) + this.load_id.hashCode()) * 37) + this.disclosure.hashCode()) * 37) + this.can_passively_dismiss.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("receipt_unique_identifier=" + Internal.sanitize(this.receipt_unique_identifier));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("location=" + Internal.sanitize(this.location));
        arrayList.add("load_id=" + Internal.sanitize(this.load_id));
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        arrayList.add("can_passively_dismiss=" + this.can_passively_dismiss);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppComm{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InAppComm copy$default(InAppComm inAppComm, String str, String str2, String str3, String str4, String str5, String str6, Boolean r7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppComm.receipt_unique_identifier;
        }
        if ((i & 2) != 0) {
            str2 = inAppComm.title;
        }
        if ((i & 4) != 0) {
            str3 = inAppComm.text;
        }
        if ((i & 8) != 0) {
            str4 = inAppComm.location;
        }
        if ((i & 16) != 0) {
            str5 = inAppComm.load_id;
        }
        if ((i & 32) != 0) {
            str6 = inAppComm.disclosure;
        }
        if ((i & 64) != 0) {
            r7 = inAppComm.can_passively_dismiss;
        }
        if ((i & 128) != 0) {
            byteString = inAppComm.unknownFields();
        }
        Boolean r9 = r7;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        return inAppComm.copy(str, str2, str3, str4, str7, str8, r9, byteString2);
    }

    public final InAppComm copy(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, Boolean can_passively_dismiss, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InAppComm(receipt_unique_identifier, title, text, location, load_id, disclosure, can_passively_dismiss, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InAppComm.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InAppComm>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.InAppComm$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InAppComm value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getReceipt_unique_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getReceipt_unique_identifier());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getText());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDisclosure());
                }
                return value.getCan_passively_dismiss() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(7, value.getCan_passively_dismiss()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InAppComm value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getReceipt_unique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReceipt_unique_identifier());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisclosure());
                }
                if (value.getCan_passively_dismiss() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getCan_passively_dismiss());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InAppComm value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCan_passively_dismiss() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getCan_passively_dismiss());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisclosure());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getReceipt_unique_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReceipt_unique_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InAppComm decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    Boolean r4 = booleanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        booleanDecode = Boolean.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new InAppComm(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, r4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InAppComm redact(InAppComm value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InAppComm.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
