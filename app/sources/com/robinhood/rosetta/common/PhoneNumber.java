package com.robinhood.rosetta.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: PhoneNumber.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/common/PhoneNumber;", "Lcom/squareup/wire/Message;", "", "country_code", "", "national_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(IJLokio/ByteString;)V", "getCountry_code", "()I", "getNational_number", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PhoneNumber extends Message {

    @JvmField
    public static final ProtoAdapter<PhoneNumber> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "countryCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "nationalNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long national_number;

    public PhoneNumber() {
        this(0, 0L, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23986newBuilder();
    }

    public final int getCountry_code() {
        return this.country_code;
    }

    public final long getNational_number() {
        return this.national_number;
    }

    public /* synthetic */ PhoneNumber(int i, long j, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumber(int i, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.country_code = i;
        this.national_number = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23986newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) other;
        return Intrinsics.areEqual(unknownFields(), phoneNumber.unknownFields()) && this.country_code == phoneNumber.country_code && this.national_number == phoneNumber.national_number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.country_code)) * 37) + Long.hashCode(this.national_number);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("country_code=" + this.country_code);
        arrayList.add("national_number=" + this.national_number);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhoneNumber{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PhoneNumber copy$default(PhoneNumber phoneNumber, int i, long j, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = phoneNumber.country_code;
        }
        if ((i2 & 2) != 0) {
            j = phoneNumber.national_number;
        }
        if ((i2 & 4) != 0) {
            byteString = phoneNumber.unknownFields();
        }
        return phoneNumber.copy(i, j, byteString);
    }

    public final PhoneNumber copy(int country_code, long national_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PhoneNumber(country_code, national_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PhoneNumber.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PhoneNumber>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.PhoneNumber$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PhoneNumber value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCountry_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getCountry_code()));
                }
                return value.getNational_number() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getNational_number())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PhoneNumber value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCountry_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCountry_code()));
                }
                if (value.getNational_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getNational_number()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PhoneNumber value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNational_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getNational_number()));
                }
                if (value.getCountry_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCountry_code()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PhoneNumber redact(PhoneNumber value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PhoneNumber.copy$default(value, 0, 0L, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PhoneNumber decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                long jLongValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PhoneNumber(iIntValue, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
