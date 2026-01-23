package com.robinhood.ceres.p284v1;

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

/* compiled from: FeeSchedule.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeSchedule;", "Lcom/squareup/wire/Message;", "", "id", "", "fee_schedule_name", "description", "fees", "", "Lcom/robinhood/ceres/v1/Fee;", "created_at", "updated_at", "created_by_alias", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getFee_schedule_name", "getDescription", "getCreated_at", "getUpdated_at", "getCreated_by_alias", "getFees", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeSchedule extends Message {

    @JvmField
    public static final ProtoAdapter<FeeSchedule> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdByAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String created_by_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeScheduleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fee_schedule_name;

    @WireField(adapter = "com.robinhood.ceres.v1.Fee#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Fee> fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String updated_at;

    public FeeSchedule() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ FeeSchedule(String str, String str2, String str3, List list, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20301newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getFee_schedule_name() {
        return this.fee_schedule_name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final String getCreated_by_alias() {
        return this.created_by_alias;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeSchedule(String id, String fee_schedule_name, String description, List<Fee> fees, String created_at, String updated_at, String created_by_alias, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fee_schedule_name, "fee_schedule_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.fee_schedule_name = fee_schedule_name;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by_alias = created_by_alias;
        this.fees = Internal.immutableCopyOf("fees", fees);
    }

    public final List<Fee> getFees() {
        return this.fees;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20301newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeSchedule)) {
            return false;
        }
        FeeSchedule feeSchedule = (FeeSchedule) other;
        return Intrinsics.areEqual(unknownFields(), feeSchedule.unknownFields()) && Intrinsics.areEqual(this.id, feeSchedule.id) && Intrinsics.areEqual(this.fee_schedule_name, feeSchedule.fee_schedule_name) && Intrinsics.areEqual(this.description, feeSchedule.description) && Intrinsics.areEqual(this.fees, feeSchedule.fees) && Intrinsics.areEqual(this.created_at, feeSchedule.created_at) && Intrinsics.areEqual(this.updated_at, feeSchedule.updated_at) && Intrinsics.areEqual(this.created_by_alias, feeSchedule.created_by_alias);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.fee_schedule_name.hashCode()) * 37) + this.description.hashCode()) * 37) + this.fees.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.created_by_alias.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("fee_schedule_name=" + Internal.sanitize(this.fee_schedule_name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        if (!this.fees.isEmpty()) {
            arrayList.add("fees=" + this.fees);
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("created_by_alias=" + Internal.sanitize(this.created_by_alias));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeSchedule{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeSchedule copy$default(FeeSchedule feeSchedule, String str, String str2, String str3, List list, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeSchedule.id;
        }
        if ((i & 2) != 0) {
            str2 = feeSchedule.fee_schedule_name;
        }
        if ((i & 4) != 0) {
            str3 = feeSchedule.description;
        }
        if ((i & 8) != 0) {
            list = feeSchedule.fees;
        }
        if ((i & 16) != 0) {
            str4 = feeSchedule.created_at;
        }
        if ((i & 32) != 0) {
            str5 = feeSchedule.updated_at;
        }
        if ((i & 64) != 0) {
            str6 = feeSchedule.created_by_alias;
        }
        if ((i & 128) != 0) {
            byteString = feeSchedule.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return feeSchedule.copy(str, str2, str3, list, str8, str9, str7, byteString2);
    }

    public final FeeSchedule copy(String id, String fee_schedule_name, String description, List<Fee> fees, String created_at, String updated_at, String created_by_alias, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fee_schedule_name, "fee_schedule_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeSchedule(id, fee_schedule_name, description, fees, created_at, updated_at, created_by_alias, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeSchedule.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeSchedule>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FeeSchedule$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeSchedule value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getFee_schedule_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFee_schedule_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                int iEncodedSizeWithTag = size + Fee.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getFees());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getUpdated_at());
                }
                return !Intrinsics.areEqual(value.getCreated_by_alias(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCreated_by_alias()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeSchedule value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getFee_schedule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFee_schedule_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                Fee.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFees());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCreated_by_alias());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeSchedule value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCreated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                Fee.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFees());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getFee_schedule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFee_schedule_name());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeSchedule decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
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
                                arrayList.add(Fee.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FeeSchedule(strDecode, strDecode2, strDecode3, arrayList, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeSchedule redact(FeeSchedule value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeeSchedule.copy$default(value, null, null, null, Internal.m26823redactElements(value.getFees(), Fee.ADAPTER), null, null, null, ByteString.EMPTY, 119, null);
            }
        };
    }
}
