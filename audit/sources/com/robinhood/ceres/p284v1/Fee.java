package com.robinhood.ceres.p284v1;

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

/* compiled from: Fee.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/ceres/v1/Fee;", "Lcom/squareup/wire/Message;", "", "id", "", "fee_info", "Lcom/robinhood/ceres/v1/FeeInfo;", "created_at", "updated_at", "created_by_alias", "updated_by_alias", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getFee_info", "()Lcom/robinhood/ceres/v1/FeeInfo;", "getCreated_at", "getUpdated_at", "getCreated_by_alias", "getUpdated_by_alias", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Fee extends Message {

    @JvmField
    public static final ProtoAdapter<Fee> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdByAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String created_by_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeInfo#ADAPTER", jsonName = "feeInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeeInfo fee_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedByAlias", schemaIndex = 5, tag = 6)
    private final String updated_by_alias;

    public Fee() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ Fee(String str, FeeInfo feeInfo, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeInfo, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20297newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final FeeInfo getFee_info() {
        return this.fee_info;
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

    public final String getUpdated_by_alias() {
        return this.updated_by_alias;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fee(String id, FeeInfo feeInfo, String created_at, String updated_at, String created_by_alias, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.fee_info = feeInfo;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by_alias = created_by_alias;
        this.updated_by_alias = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20297newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) other;
        return Intrinsics.areEqual(unknownFields(), fee.unknownFields()) && Intrinsics.areEqual(this.id, fee.id) && Intrinsics.areEqual(this.fee_info, fee.fee_info) && Intrinsics.areEqual(this.created_at, fee.created_at) && Intrinsics.areEqual(this.updated_at, fee.updated_at) && Intrinsics.areEqual(this.created_by_alias, fee.created_by_alias) && Intrinsics.areEqual(this.updated_by_alias, fee.updated_by_alias);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        FeeInfo feeInfo = this.fee_info;
        int iHashCode2 = (((((((iHashCode + (feeInfo != null ? feeInfo.hashCode() : 0)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.created_by_alias.hashCode()) * 37;
        String str = this.updated_by_alias;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        FeeInfo feeInfo = this.fee_info;
        if (feeInfo != null) {
            arrayList.add("fee_info=" + feeInfo);
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("created_by_alias=" + Internal.sanitize(this.created_by_alias));
        String str = this.updated_by_alias;
        if (str != null) {
            arrayList.add("updated_by_alias=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Fee{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Fee copy$default(Fee fee, String str, FeeInfo feeInfo, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fee.id;
        }
        if ((i & 2) != 0) {
            feeInfo = fee.fee_info;
        }
        if ((i & 4) != 0) {
            str2 = fee.created_at;
        }
        if ((i & 8) != 0) {
            str3 = fee.updated_at;
        }
        if ((i & 16) != 0) {
            str4 = fee.created_by_alias;
        }
        if ((i & 32) != 0) {
            str5 = fee.updated_by_alias;
        }
        if ((i & 64) != 0) {
            byteString = fee.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str2;
        return fee.copy(str, feeInfo, str8, str3, str7, str6, byteString2);
    }

    public final Fee copy(String id, FeeInfo fee_info, String created_at, String updated_at, String created_by_alias, String updated_by_alias, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Fee(id, fee_info, created_at, updated_at, created_by_alias, updated_by_alias, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Fee.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Fee>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.Fee$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Fee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getFee_info() != null) {
                    size += FeeInfo.ADAPTER.encodedSizeWithTag(2, value.getFee_info());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCreated_by_alias());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getUpdated_by_alias());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Fee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getFee_info() != null) {
                    FeeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_info());
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
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUpdated_by_alias());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Fee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getUpdated_by_alias());
                if (!Intrinsics.areEqual(value.getCreated_by_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCreated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getFee_info() != null) {
                    FeeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_info());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Fee redact(Fee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeInfo fee_info = value.getFee_info();
                return Fee.copy$default(value, null, fee_info != null ? FeeInfo.ADAPTER.redact(fee_info) : null, null, null, null, null, ByteString.EMPTY, 61, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Fee decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                FeeInfo feeInfoDecode = null;
                String strDecode4 = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                feeInfoDecode = FeeInfo.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Fee(strDecode, feeInfoDecode, strDecode5, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
