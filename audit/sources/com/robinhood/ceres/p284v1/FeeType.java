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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FeeType.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeType;", "Lcom/squareup/wire/Message;", "", "id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfo;", "created_at", "updated_at", "created_by_alias", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfo;", "getCreated_at", "getUpdated_at", "getCreated_by_alias", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeType extends Message {

    @JvmField
    public static final ProtoAdapter<FeeType> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdByAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String created_by_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeTypeInfo#ADAPTER", jsonName = "feeTypeInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeeTypeInfo fee_type_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String updated_at;

    public FeeType() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ FeeType(String str, FeeTypeInfo feeTypeInfo, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfo, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20303newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final FeeTypeInfo getFee_type_info() {
        return this.fee_type_info;
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
    public FeeType(String id, FeeTypeInfo feeTypeInfo, String created_at, String updated_at, String created_by_alias, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.fee_type_info = feeTypeInfo;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by_alias = created_by_alias;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20303newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeType)) {
            return false;
        }
        FeeType feeType = (FeeType) other;
        return Intrinsics.areEqual(unknownFields(), feeType.unknownFields()) && Intrinsics.areEqual(this.id, feeType.id) && Intrinsics.areEqual(this.fee_type_info, feeType.fee_type_info) && Intrinsics.areEqual(this.created_at, feeType.created_at) && Intrinsics.areEqual(this.updated_at, feeType.updated_at) && Intrinsics.areEqual(this.created_by_alias, feeType.created_by_alias);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        FeeTypeInfo feeTypeInfo = this.fee_type_info;
        int iHashCode2 = ((((((iHashCode + (feeTypeInfo != null ? feeTypeInfo.hashCode() : 0)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.created_by_alias.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        FeeTypeInfo feeTypeInfo = this.fee_type_info;
        if (feeTypeInfo != null) {
            arrayList.add("fee_type_info=" + feeTypeInfo);
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("created_by_alias=" + Internal.sanitize(this.created_by_alias));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeType{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeType copy$default(FeeType feeType, String str, FeeTypeInfo feeTypeInfo, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeType.id;
        }
        if ((i & 2) != 0) {
            feeTypeInfo = feeType.fee_type_info;
        }
        if ((i & 4) != 0) {
            str2 = feeType.created_at;
        }
        if ((i & 8) != 0) {
            str3 = feeType.updated_at;
        }
        if ((i & 16) != 0) {
            str4 = feeType.created_by_alias;
        }
        if ((i & 32) != 0) {
            byteString = feeType.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return feeType.copy(str, feeTypeInfo, str2, str3, str5, byteString2);
    }

    public final FeeType copy(String id, FeeTypeInfo fee_type_info, String created_at, String updated_at, String created_by_alias, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeType(id, fee_type_info, created_at, updated_at, created_by_alias, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FeeType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getFee_type_info() != null) {
                    size += FeeTypeInfo.ADAPTER.encodedSizeWithTag(2, value.getFee_type_info());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUpdated_at());
                }
                return !Intrinsics.areEqual(value.getCreated_by_alias(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCreated_by_alias()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getFee_type_info() != null) {
                    FeeTypeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_type_info());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCreated_by_alias());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCreated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getFee_type_info() != null) {
                    FeeTypeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_type_info());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeType redact(FeeType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeTypeInfo fee_type_info = value.getFee_type_info();
                return FeeType.copy$default(value, null, fee_type_info != null ? FeeTypeInfo.ADAPTER.redact(fee_type_info) : null, null, null, null, ByteString.EMPTY, 29, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                FeeTypeInfo feeTypeInfoDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeType(strDecode, feeTypeInfoDecode, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        feeTypeInfoDecode = FeeTypeInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
