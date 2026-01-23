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

/* compiled from: FeeTypeWithFees.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFees;", "Lcom/squareup/wire/Message;", "", "fee_type_id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfo;", "fee_schedule_id", "fees", "", "Lcom/robinhood/ceres/v1/Fee;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfo;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getFee_type_id", "()Ljava/lang/String;", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfo;", "getFee_schedule_id", "getFees", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeTypeWithFees extends Message {

    @JvmField
    public static final ProtoAdapter<FeeTypeWithFees> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeScheduleId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String fee_schedule_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeTypeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String fee_type_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeTypeInfo#ADAPTER", jsonName = "feeTypeInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeeTypeInfo fee_type_info;

    @WireField(adapter = "com.robinhood.ceres.v1.Fee#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Fee> fees;

    public FeeTypeWithFees() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ FeeTypeWithFees(String str, FeeTypeInfo feeTypeInfo, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfo, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20306newBuilder();
    }

    public final String getFee_type_id() {
        return this.fee_type_id;
    }

    public final FeeTypeInfo getFee_type_info() {
        return this.fee_type_info;
    }

    public final String getFee_schedule_id() {
        return this.fee_schedule_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeTypeWithFees(String fee_type_id, FeeTypeInfo feeTypeInfo, String fee_schedule_id, List<Fee> fees, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
        Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fee_type_id = fee_type_id;
        this.fee_type_info = feeTypeInfo;
        this.fee_schedule_id = fee_schedule_id;
        this.fees = Internal.immutableCopyOf("fees", fees);
    }

    public final List<Fee> getFees() {
        return this.fees;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20306newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeTypeWithFees)) {
            return false;
        }
        FeeTypeWithFees feeTypeWithFees = (FeeTypeWithFees) other;
        return Intrinsics.areEqual(unknownFields(), feeTypeWithFees.unknownFields()) && Intrinsics.areEqual(this.fee_type_id, feeTypeWithFees.fee_type_id) && Intrinsics.areEqual(this.fee_type_info, feeTypeWithFees.fee_type_info) && Intrinsics.areEqual(this.fee_schedule_id, feeTypeWithFees.fee_schedule_id) && Intrinsics.areEqual(this.fees, feeTypeWithFees.fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.fee_type_id.hashCode()) * 37;
        FeeTypeInfo feeTypeInfo = this.fee_type_info;
        int iHashCode2 = ((((iHashCode + (feeTypeInfo != null ? feeTypeInfo.hashCode() : 0)) * 37) + this.fee_schedule_id.hashCode()) * 37) + this.fees.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("fee_type_id=" + Internal.sanitize(this.fee_type_id));
        FeeTypeInfo feeTypeInfo = this.fee_type_info;
        if (feeTypeInfo != null) {
            arrayList.add("fee_type_info=" + feeTypeInfo);
        }
        arrayList.add("fee_schedule_id=" + Internal.sanitize(this.fee_schedule_id));
        if (!this.fees.isEmpty()) {
            arrayList.add("fees=" + this.fees);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeTypeWithFees{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeTypeWithFees copy$default(FeeTypeWithFees feeTypeWithFees, String str, FeeTypeInfo feeTypeInfo, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTypeWithFees.fee_type_id;
        }
        if ((i & 2) != 0) {
            feeTypeInfo = feeTypeWithFees.fee_type_info;
        }
        if ((i & 4) != 0) {
            str2 = feeTypeWithFees.fee_schedule_id;
        }
        if ((i & 8) != 0) {
            list = feeTypeWithFees.fees;
        }
        if ((i & 16) != 0) {
            byteString = feeTypeWithFees.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return feeTypeWithFees.copy(str, feeTypeInfo, str3, list, byteString2);
    }

    public final FeeTypeWithFees copy(String fee_type_id, FeeTypeInfo fee_type_info, String fee_schedule_id, List<Fee> fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
        Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeTypeWithFees(fee_type_id, fee_type_info, fee_schedule_id, fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTypeWithFees.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeTypeWithFees>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FeeTypeWithFees$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeTypeWithFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFee_type_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFee_type_id());
                }
                if (value.getFee_type_info() != null) {
                    size += FeeTypeInfo.ADAPTER.encodedSizeWithTag(2, value.getFee_type_info());
                }
                if (!Intrinsics.areEqual(value.getFee_schedule_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFee_schedule_id());
                }
                return size + Fee.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getFees());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeTypeWithFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFee_type_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFee_type_id());
                }
                if (value.getFee_type_info() != null) {
                    FeeTypeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_type_info());
                }
                if (!Intrinsics.areEqual(value.getFee_schedule_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFee_schedule_id());
                }
                Fee.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFees());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeTypeWithFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Fee.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFees());
                if (!Intrinsics.areEqual(value.getFee_schedule_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFee_schedule_id());
                }
                if (value.getFee_type_info() != null) {
                    FeeTypeInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_type_info());
                }
                if (Intrinsics.areEqual(value.getFee_type_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFee_type_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeTypeWithFees decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                FeeTypeInfo feeTypeInfoDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeTypeWithFees(strDecode, feeTypeInfoDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        feeTypeInfoDecode = FeeTypeInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(Fee.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTypeWithFees redact(FeeTypeWithFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeTypeInfo fee_type_info = value.getFee_type_info();
                return FeeTypeWithFees.copy$default(value, null, fee_type_info != null ? FeeTypeInfo.ADAPTER.redact(fee_type_info) : null, null, Internal.m26823redactElements(value.getFees(), Fee.ADAPTER), ByteString.EMPTY, 5, null);
            }
        };
    }
}
