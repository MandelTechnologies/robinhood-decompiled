package com.robinhood.rosetta.cashier;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PlaidIdentityUpdateDetails.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "Lcom/squareup/wire/Message;", "", "user_uuid", "", "relationship_master_id", "fields_changed", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getUser_uuid", "()Ljava/lang/String;", "getRelationship_master_id", "getFields_changed", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PlaidIdentityUpdateDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidIdentityUpdateDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fieldsChanged", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> fields_changed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relationshipMasterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String relationship_master_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_uuid;

    public PlaidIdentityUpdateDetails() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ PlaidIdentityUpdateDetails(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23972newBuilder();
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getRelationship_master_id() {
        return this.relationship_master_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidIdentityUpdateDetails(String user_uuid, String relationship_master_id, List<String> fields_changed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_uuid = user_uuid;
        this.relationship_master_id = relationship_master_id;
        this.fields_changed = Internal.immutableCopyOf("fields_changed", fields_changed);
    }

    public final List<String> getFields_changed() {
        return this.fields_changed;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23972newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidIdentityUpdateDetails)) {
            return false;
        }
        PlaidIdentityUpdateDetails plaidIdentityUpdateDetails = (PlaidIdentityUpdateDetails) other;
        return Intrinsics.areEqual(unknownFields(), plaidIdentityUpdateDetails.unknownFields()) && Intrinsics.areEqual(this.user_uuid, plaidIdentityUpdateDetails.user_uuid) && Intrinsics.areEqual(this.relationship_master_id, plaidIdentityUpdateDetails.relationship_master_id) && Intrinsics.areEqual(this.fields_changed, plaidIdentityUpdateDetails.fields_changed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.user_uuid.hashCode()) * 37) + this.relationship_master_id.hashCode()) * 37) + this.fields_changed.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("relationship_master_id=" + Internal.sanitize(this.relationship_master_id));
        if (!this.fields_changed.isEmpty()) {
            arrayList.add("fields_changed=" + Internal.sanitize(this.fields_changed));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidIdentityUpdateDetails{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaidIdentityUpdateDetails copy$default(PlaidIdentityUpdateDetails plaidIdentityUpdateDetails, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidIdentityUpdateDetails.user_uuid;
        }
        if ((i & 2) != 0) {
            str2 = plaidIdentityUpdateDetails.relationship_master_id;
        }
        if ((i & 4) != 0) {
            list = plaidIdentityUpdateDetails.fields_changed;
        }
        if ((i & 8) != 0) {
            byteString = plaidIdentityUpdateDetails.unknownFields();
        }
        return plaidIdentityUpdateDetails.copy(str, str2, list, byteString);
    }

    public final PlaidIdentityUpdateDetails copy(String user_uuid, String relationship_master_id, List<String> fields_changed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidIdentityUpdateDetails(user_uuid, relationship_master_id, fields_changed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidIdentityUpdateDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidIdentityUpdateDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidIdentityUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRelationship_master_id());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.getFields_changed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidIdentityUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRelationship_master_id());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, (int) value.getFields_changed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidIdentityUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getFields_changed());
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getRelationship_master_id());
                }
                if (Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUser_uuid());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIdentityUpdateDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidIdentityUpdateDetails(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIdentityUpdateDetails redact(PlaidIdentityUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaidIdentityUpdateDetails.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
