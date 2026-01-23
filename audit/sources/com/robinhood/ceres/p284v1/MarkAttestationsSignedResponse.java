package com.robinhood.ceres.p284v1;

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

/* compiled from: MarkAttestationsSignedResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponse;", "Lcom/squareup/wire/Message;", "", "account", "Lcom/robinhood/ceres/v1/FuturesAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccount;Lokio/ByteString;)V", "getAccount", "()Lcom/robinhood/ceres/v1/FuturesAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MarkAttestationsSignedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<MarkAttestationsSignedResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesAccount account;

    /* JADX WARN: Multi-variable type inference failed */
    public MarkAttestationsSignedResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20393newBuilder();
    }

    public final FuturesAccount getAccount() {
        return this.account;
    }

    public /* synthetic */ MarkAttestationsSignedResponse(FuturesAccount futuresAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresAccount, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAttestationsSignedResponse(FuturesAccount futuresAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account = futuresAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20393newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarkAttestationsSignedResponse)) {
            return false;
        }
        MarkAttestationsSignedResponse markAttestationsSignedResponse = (MarkAttestationsSignedResponse) other;
        return Intrinsics.areEqual(unknownFields(), markAttestationsSignedResponse.unknownFields()) && Intrinsics.areEqual(this.account, markAttestationsSignedResponse.account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FuturesAccount futuresAccount = this.account;
        int iHashCode2 = iHashCode + (futuresAccount != null ? futuresAccount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FuturesAccount futuresAccount = this.account;
        if (futuresAccount != null) {
            arrayList.add("account=" + futuresAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarkAttestationsSignedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarkAttestationsSignedResponse copy$default(MarkAttestationsSignedResponse markAttestationsSignedResponse, FuturesAccount futuresAccount, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresAccount = markAttestationsSignedResponse.account;
        }
        if ((i & 2) != 0) {
            byteString = markAttestationsSignedResponse.unknownFields();
        }
        return markAttestationsSignedResponse.copy(futuresAccount, byteString);
    }

    public final MarkAttestationsSignedResponse copy(FuturesAccount account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarkAttestationsSignedResponse(account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarkAttestationsSignedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarkAttestationsSignedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.MarkAttestationsSignedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarkAttestationsSignedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAccount() != null ? size + FuturesAccount.ADAPTER.encodedSizeWithTag(1, value.getAccount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarkAttestationsSignedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount() != null) {
                    FuturesAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarkAttestationsSignedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount() != null) {
                    FuturesAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarkAttestationsSignedResponse redact(MarkAttestationsSignedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesAccount account = value.getAccount();
                return value.copy(account != null ? FuturesAccount.ADAPTER.redact(account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarkAttestationsSignedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FuturesAccount futuresAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarkAttestationsSignedResponse(futuresAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        futuresAccountDecode = FuturesAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
