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

/* compiled from: SuccessfulAccountCreationResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;", "Lcom/squareup/wire/Message;", "", "account", "Lcom/robinhood/ceres/v1/FuturesAccount;", "sub_accounts", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccount;Ljava/util/List;Lokio/ByteString;)V", "getAccount", "()Lcom/robinhood/ceres/v1/FuturesAccount;", "getSub_accounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SuccessfulAccountCreationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SuccessfulAccountCreationResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesAccount account;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesAccount#ADAPTER", jsonName = "subAccounts", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<FuturesAccount> sub_accounts;

    public SuccessfulAccountCreationResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20422newBuilder();
    }

    public final FuturesAccount getAccount() {
        return this.account;
    }

    public /* synthetic */ SuccessfulAccountCreationResponse(FuturesAccount futuresAccount, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresAccount, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessfulAccountCreationResponse(FuturesAccount futuresAccount, List<FuturesAccount> sub_accounts, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account = futuresAccount;
        this.sub_accounts = Internal.immutableCopyOf("sub_accounts", sub_accounts);
    }

    public final List<FuturesAccount> getSub_accounts() {
        return this.sub_accounts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20422newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SuccessfulAccountCreationResponse)) {
            return false;
        }
        SuccessfulAccountCreationResponse successfulAccountCreationResponse = (SuccessfulAccountCreationResponse) other;
        return Intrinsics.areEqual(unknownFields(), successfulAccountCreationResponse.unknownFields()) && Intrinsics.areEqual(this.account, successfulAccountCreationResponse.account) && Intrinsics.areEqual(this.sub_accounts, successfulAccountCreationResponse.sub_accounts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FuturesAccount futuresAccount = this.account;
        int iHashCode2 = ((iHashCode + (futuresAccount != null ? futuresAccount.hashCode() : 0)) * 37) + this.sub_accounts.hashCode();
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
        if (!this.sub_accounts.isEmpty()) {
            arrayList.add("sub_accounts=" + this.sub_accounts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuccessfulAccountCreationResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessfulAccountCreationResponse copy$default(SuccessfulAccountCreationResponse successfulAccountCreationResponse, FuturesAccount futuresAccount, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresAccount = successfulAccountCreationResponse.account;
        }
        if ((i & 2) != 0) {
            list = successfulAccountCreationResponse.sub_accounts;
        }
        if ((i & 4) != 0) {
            byteString = successfulAccountCreationResponse.unknownFields();
        }
        return successfulAccountCreationResponse.copy(futuresAccount, list, byteString);
    }

    public final SuccessfulAccountCreationResponse copy(FuturesAccount account, List<FuturesAccount> sub_accounts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SuccessfulAccountCreationResponse(account, sub_accounts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SuccessfulAccountCreationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SuccessfulAccountCreationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.SuccessfulAccountCreationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SuccessfulAccountCreationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount() != null) {
                    size += FuturesAccount.ADAPTER.encodedSizeWithTag(1, value.getAccount());
                }
                return size + FuturesAccount.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSub_accounts());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SuccessfulAccountCreationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount() != null) {
                    FuturesAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
                FuturesAccount.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSub_accounts());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SuccessfulAccountCreationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<FuturesAccount> protoAdapter = FuturesAccount.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getSub_accounts());
                if (value.getAccount() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SuccessfulAccountCreationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                FuturesAccount futuresAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SuccessfulAccountCreationResponse(futuresAccountDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        futuresAccountDecode = FuturesAccount.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(FuturesAccount.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SuccessfulAccountCreationResponse redact(SuccessfulAccountCreationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesAccount account = value.getAccount();
                return value.copy(account != null ? FuturesAccount.ADAPTER.redact(account) : null, Internal.m26823redactElements(value.getSub_accounts(), FuturesAccount.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
