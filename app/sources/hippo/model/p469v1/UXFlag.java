package hippo.model.p469v1;

import com.plaid.internal.EnumC7081g;
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
import p479j$.time.Instant;

/* compiled from: UXFlag.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJe\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m3636d2 = {"Lhippo/model/v1/UXFlag;", "Lcom/squareup/wire/Message;", "", "Lhippo/model/v1/UXFlagName;", "name", "", "value", "Lhippo/model/v1/UXFlagType;", "flag_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lhippo/model/v1/UXFlagMetadata;", "metadata", "Lokio/ByteString;", "unknownFields", "<init>", "(Lhippo/model/v1/UXFlagName;Ljava/lang/String;Lhippo/model/v1/UXFlagType;Lj$/time/Instant;Lj$/time/Instant;Lhippo/model/v1/UXFlagMetadata;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lhippo/model/v1/UXFlagName;Ljava/lang/String;Lhippo/model/v1/UXFlagType;Lj$/time/Instant;Lj$/time/Instant;Lhippo/model/v1/UXFlagMetadata;Lokio/ByteString;)Lhippo/model/v1/UXFlag;", "Lhippo/model/v1/UXFlagName;", "getName", "()Lhippo/model/v1/UXFlagName;", "Ljava/lang/String;", "getValue", "Lhippo/model/v1/UXFlagType;", "getFlag_type", "()Lhippo/model/v1/UXFlagType;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Lhippo/model/v1/UXFlagMetadata;", "getMetadata", "()Lhippo/model/v1/UXFlagMetadata;", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class UXFlag extends Message {

    @JvmField
    public static final ProtoAdapter<UXFlag> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "hippo.model.v1.UXFlagType#ADAPTER", jsonName = "flagType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final UXFlagType flag_type;

    @WireField(adapter = "hippo.model.v1.UXFlagMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final UXFlagMetadata metadata;

    @WireField(adapter = "hippo.model.v1.UXFlagName#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UXFlagName name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String value;

    public UXFlag() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28257newBuilder();
    }

    public final UXFlagName getName() {
        return this.name;
    }

    public /* synthetic */ UXFlag(UXFlagName uXFlagName, String str, UXFlagType uXFlagType, Instant instant, Instant instant2, UXFlagMetadata uXFlagMetadata, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UXFlagName.UX_FLAG_NAME_UNSPECIFIED : uXFlagName, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? UXFlagType.UX_FLAG_TYPE_UNSPECIFIED : uXFlagType, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : uXFlagMetadata, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getValue() {
        return this.value;
    }

    public final UXFlagType getFlag_type() {
        return this.flag_type;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final UXFlagMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXFlag(UXFlagName name, String value, UXFlagType flag_type, Instant instant, Instant instant2, UXFlagMetadata uXFlagMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(flag_type, "flag_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.value = value;
        this.flag_type = flag_type;
        this.created_at = instant;
        this.updated_at = instant2;
        this.metadata = uXFlagMetadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28257newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UXFlag)) {
            return false;
        }
        UXFlag uXFlag = (UXFlag) other;
        return Intrinsics.areEqual(unknownFields(), uXFlag.unknownFields()) && this.name == uXFlag.name && Intrinsics.areEqual(this.value, uXFlag.value) && this.flag_type == uXFlag.flag_type && Intrinsics.areEqual(this.created_at, uXFlag.created_at) && Intrinsics.areEqual(this.updated_at, uXFlag.updated_at) && Intrinsics.areEqual(this.metadata, uXFlag.metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.value.hashCode()) * 37) + this.flag_type.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        UXFlagMetadata uXFlagMetadata = this.metadata;
        int iHashCode4 = iHashCode3 + (uXFlagMetadata != null ? uXFlagMetadata.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        arrayList.add("value=" + Internal.sanitize(this.value));
        arrayList.add("flag_type=" + this.flag_type);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        UXFlagMetadata uXFlagMetadata = this.metadata;
        if (uXFlagMetadata != null) {
            arrayList.add("metadata=" + uXFlagMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UXFlag{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UXFlag copy$default(UXFlag uXFlag, UXFlagName uXFlagName, String str, UXFlagType uXFlagType, Instant instant, Instant instant2, UXFlagMetadata uXFlagMetadata, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uXFlagName = uXFlag.name;
        }
        if ((i & 2) != 0) {
            str = uXFlag.value;
        }
        if ((i & 4) != 0) {
            uXFlagType = uXFlag.flag_type;
        }
        if ((i & 8) != 0) {
            instant = uXFlag.created_at;
        }
        if ((i & 16) != 0) {
            instant2 = uXFlag.updated_at;
        }
        if ((i & 32) != 0) {
            uXFlagMetadata = uXFlag.metadata;
        }
        if ((i & 64) != 0) {
            byteString = uXFlag.unknownFields();
        }
        UXFlagMetadata uXFlagMetadata2 = uXFlagMetadata;
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        UXFlagType uXFlagType2 = uXFlagType;
        return uXFlag.copy(uXFlagName, str, uXFlagType2, instant, instant3, uXFlagMetadata2, byteString2);
    }

    public final UXFlag copy(UXFlagName name, String value, UXFlagType flag_type, Instant created_at, Instant updated_at, UXFlagMetadata metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(flag_type, "flag_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UXFlag(name, value, flag_type, created_at, updated_at, metadata, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UXFlag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UXFlag>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.UXFlag$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UXFlag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getName() != UXFlagName.UX_FLAG_NAME_UNSPECIFIED) {
                    size += UXFlagName.ADAPTER.encodedSizeWithTag(1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue());
                }
                if (value.getFlag_type() != UXFlagType.UX_FLAG_TYPE_UNSPECIFIED) {
                    size += UXFlagType.ADAPTER.encodedSizeWithTag(3, value.getFlag_type());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getUpdated_at());
                }
                return value.getMetadata() != null ? size + UXFlagMetadata.ADAPTER.encodedSizeWithTag(6, value.getMetadata()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UXFlag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getName() != UXFlagName.UX_FLAG_NAME_UNSPECIFIED) {
                    UXFlagName.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (value.getFlag_type() != UXFlagType.UX_FLAG_TYPE_UNSPECIFIED) {
                    UXFlagType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFlag_type());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getMetadata() != null) {
                    UXFlagMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getMetadata());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UXFlag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMetadata() != null) {
                    UXFlagMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getMetadata());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getFlag_type() != UXFlagType.UX_FLAG_TYPE_UNSPECIFIED) {
                    UXFlagType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFlag_type());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (value.getName() != UXFlagName.UX_FLAG_NAME_UNSPECIFIED) {
                    UXFlagName.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UXFlag decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                UXFlagName uXFlagNameDecode = UXFlagName.UX_FLAG_NAME_UNSPECIFIED;
                UXFlagType uXFlagType = UXFlagType.UX_FLAG_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                UXFlagMetadata uXFlagMetadataDecode = null;
                String strDecode = "";
                UXFlagType uXFlagTypeDecode = uXFlagType;
                while (true) {
                    UXFlagName uXFlagName = uXFlagNameDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        uXFlagNameDecode = UXFlagName.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        uXFlagTypeDecode = UXFlagType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 5:
                                    instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 6:
                                    uXFlagMetadataDecode = UXFlagMetadata.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new UXFlag(uXFlagName, strDecode, uXFlagTypeDecode, instantDecode, instantDecode2, uXFlagMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UXFlag redact(UXFlag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                UXFlagMetadata metadata = value.getMetadata();
                return UXFlag.copy$default(value, null, null, null, instantRedact, instantRedact2, metadata != null ? UXFlagMetadata.ADAPTER.redact(metadata) : null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
