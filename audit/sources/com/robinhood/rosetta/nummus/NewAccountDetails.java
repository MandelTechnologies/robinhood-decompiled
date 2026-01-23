package com.robinhood.rosetta.nummus;

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
import rosetta.nummus.CryptoCustodian;

/* compiled from: NewAccountDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/NewAccountDetails;", "Lcom/squareup/wire/Message;", "", "custodian", "Lrosetta/nummus/CryptoCustodian;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/CryptoCustodian;Lokio/ByteString;)V", "getCustodian", "()Lrosetta/nummus/CryptoCustodian;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class NewAccountDetails extends Message {

    @JvmField
    public static final ProtoAdapter<NewAccountDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.nummus.CryptoCustodian#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CryptoCustodian custodian;

    /* JADX WARN: Multi-variable type inference failed */
    public NewAccountDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24735newBuilder();
    }

    public final CryptoCustodian getCustodian() {
        return this.custodian;
    }

    public /* synthetic */ NewAccountDetails(CryptoCustodian cryptoCustodian, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED : cryptoCustodian, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAccountDetails(CryptoCustodian custodian, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(custodian, "custodian");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.custodian = custodian;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24735newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NewAccountDetails)) {
            return false;
        }
        NewAccountDetails newAccountDetails = (NewAccountDetails) other;
        return Intrinsics.areEqual(unknownFields(), newAccountDetails.unknownFields()) && this.custodian == newAccountDetails.custodian;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.custodian.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("custodian=" + this.custodian);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewAccountDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NewAccountDetails copy$default(NewAccountDetails newAccountDetails, CryptoCustodian cryptoCustodian, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCustodian = newAccountDetails.custodian;
        }
        if ((i & 2) != 0) {
            byteString = newAccountDetails.unknownFields();
        }
        return newAccountDetails.copy(cryptoCustodian, byteString);
    }

    public final NewAccountDetails copy(CryptoCustodian custodian, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(custodian, "custodian");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NewAccountDetails(custodian, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NewAccountDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NewAccountDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.NewAccountDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NewAccountDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getCustodian() != CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED ? size + CryptoCustodian.ADAPTER.encodedSizeWithTag(1, value.getCustodian()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NewAccountDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCustodian() != CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED) {
                    CryptoCustodian.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustodian());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NewAccountDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCustodian() != CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED) {
                    CryptoCustodian.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustodian());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NewAccountDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CryptoCustodian cryptoCustodianDecode = CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NewAccountDetails(cryptoCustodianDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            cryptoCustodianDecode = CryptoCustodian.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NewAccountDetails redact(NewAccountDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NewAccountDetails.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
