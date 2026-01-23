package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: FuturesCashTransfer.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransfer;", "Lcom/squareup/wire/Message;", "", "id", "", "account_id", "rhd_account_number", "requested_amount", "Lcom/robinhood/rosetta/common/Money;", "actual_amount", "direction", "Lcom/robinhood/ceres/v1/CashTransferDirection;", "initiator_id", "created_at", "updated_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/ceres/v1/CashTransferDirection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getRhd_account_number", "getRequested_amount", "()Lcom/robinhood/rosetta/common/Money;", "getActual_amount", "getDirection", "()Lcom/robinhood/ceres/v1/CashTransferDirection;", "getInitiator_id", "getCreated_at", "getUpdated_at", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesCashTransfer extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesCashTransfer> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "actualAmount", schemaIndex = 4, tag = 5)
    private final Money actual_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String created_at;

    @WireField(adapter = "com.robinhood.ceres.v1.CashTransferDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CashTransferDirection direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initiatorId", schemaIndex = 6, tag = 7)
    private final String initiator_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "requestedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money requested_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhdAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhd_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String updated_at;

    public FuturesCashTransfer() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ FuturesCashTransfer(String str, String str2, String str3, Money money, Money money2, CashTransferDirection cashTransferDirection, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? CashTransferDirection.CASH_TRANSFER_DIRECTION_UNSPECIFIED : cashTransferDirection, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20319newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getRhd_account_number() {
        return this.rhd_account_number;
    }

    public final Money getRequested_amount() {
        return this.requested_amount;
    }

    public final Money getActual_amount() {
        return this.actual_amount;
    }

    public final CashTransferDirection getDirection() {
        return this.direction;
    }

    public final String getInitiator_id() {
        return this.initiator_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesCashTransfer(String id, String account_id, String rhd_account_number, Money money, Money money2, CashTransferDirection direction, String str, String created_at, String updated_at, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.rhd_account_number = rhd_account_number;
        this.requested_amount = money;
        this.actual_amount = money2;
        this.direction = direction;
        this.initiator_id = str;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20319newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesCashTransfer)) {
            return false;
        }
        FuturesCashTransfer futuresCashTransfer = (FuturesCashTransfer) other;
        return Intrinsics.areEqual(unknownFields(), futuresCashTransfer.unknownFields()) && Intrinsics.areEqual(this.id, futuresCashTransfer.id) && Intrinsics.areEqual(this.account_id, futuresCashTransfer.account_id) && Intrinsics.areEqual(this.rhd_account_number, futuresCashTransfer.rhd_account_number) && Intrinsics.areEqual(this.requested_amount, futuresCashTransfer.requested_amount) && Intrinsics.areEqual(this.actual_amount, futuresCashTransfer.actual_amount) && this.direction == futuresCashTransfer.direction && Intrinsics.areEqual(this.initiator_id, futuresCashTransfer.initiator_id) && Intrinsics.areEqual(this.created_at, futuresCashTransfer.created_at) && Intrinsics.areEqual(this.updated_at, futuresCashTransfer.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.rhd_account_number.hashCode()) * 37;
        Money money = this.requested_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.actual_amount;
        int iHashCode3 = (((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.direction.hashCode()) * 37;
        String str = this.initiator_id;
        int iHashCode4 = ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("rhd_account_number=" + Internal.sanitize(this.rhd_account_number));
        Money money = this.requested_amount;
        if (money != null) {
            arrayList.add("requested_amount=" + money);
        }
        Money money2 = this.actual_amount;
        if (money2 != null) {
            arrayList.add("actual_amount=" + money2);
        }
        arrayList.add("direction=" + this.direction);
        String str = this.initiator_id;
        if (str != null) {
            arrayList.add("initiator_id=" + Internal.sanitize(str));
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesCashTransfer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesCashTransfer copy$default(FuturesCashTransfer futuresCashTransfer, String str, String str2, String str3, Money money, Money money2, CashTransferDirection cashTransferDirection, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresCashTransfer.id;
        }
        if ((i & 2) != 0) {
            str2 = futuresCashTransfer.account_id;
        }
        if ((i & 4) != 0) {
            str3 = futuresCashTransfer.rhd_account_number;
        }
        if ((i & 8) != 0) {
            money = futuresCashTransfer.requested_amount;
        }
        if ((i & 16) != 0) {
            money2 = futuresCashTransfer.actual_amount;
        }
        if ((i & 32) != 0) {
            cashTransferDirection = futuresCashTransfer.direction;
        }
        if ((i & 64) != 0) {
            str4 = futuresCashTransfer.initiator_id;
        }
        if ((i & 128) != 0) {
            str5 = futuresCashTransfer.created_at;
        }
        if ((i & 256) != 0) {
            str6 = futuresCashTransfer.updated_at;
        }
        if ((i & 512) != 0) {
            byteString = futuresCashTransfer.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        Money money3 = money2;
        CashTransferDirection cashTransferDirection2 = cashTransferDirection;
        return futuresCashTransfer.copy(str, str2, str3, money, money3, cashTransferDirection2, str8, str9, str7, byteString2);
    }

    public final FuturesCashTransfer copy(String id, String account_id, String rhd_account_number, Money requested_amount, Money actual_amount, CashTransferDirection direction, String initiator_id, String created_at, String updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesCashTransfer(id, account_id, rhd_account_number, requested_amount, actual_amount, direction, initiator_id, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesCashTransfer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesCashTransfer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesCashTransfer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesCashTransfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhd_account_number());
                }
                if (value.getRequested_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getRequested_amount());
                }
                int iEncodedSizeWithTag = size + Money.ADAPTER.encodedSizeWithTag(5, value.getActual_amount());
                if (value.getDirection() != CashTransferDirection.CASH_TRANSFER_DIRECTION_UNSPECIFIED) {
                    iEncodedSizeWithTag += CashTransferDirection.ADAPTER.encodedSizeWithTag(6, value.getDirection());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getInitiator_id());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(8, value.getCreated_at());
                }
                return !Intrinsics.areEqual(value.getUpdated_at(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(9, value.getUpdated_at()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesCashTransfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhd_account_number());
                }
                if (value.getRequested_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequested_amount());
                }
                Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getActual_amount());
                if (value.getDirection() != CashTransferDirection.CASH_TRANSFER_DIRECTION_UNSPECIFIED) {
                    CashTransferDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getDirection());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getInitiator_id());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesCashTransfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getInitiator_id());
                if (value.getDirection() != CashTransferDirection.CASH_TRANSFER_DIRECTION_UNSPECIFIED) {
                    CashTransferDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getDirection());
                }
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getActual_amount());
                if (value.getRequested_amount() != null) {
                    protoAdapter2.encodeWithTag(writer, 4, (int) value.getRequested_amount());
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getRhd_account_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesCashTransfer decode(ProtoReader reader) throws IOException {
                CashTransferDirection cashTransferDirection;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CashTransferDirection cashTransferDirection2 = CashTransferDirection.CASH_TRANSFER_DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode5 = null;
                CashTransferDirection cashTransferDirectionDecode = cashTransferDirection2;
                String strDecode6 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                try {
                                    cashTransferDirectionDecode = CashTransferDirection.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    cashTransferDirection = cashTransferDirectionDecode;
                                    str = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                cashTransferDirection = cashTransferDirectionDecode;
                                str = strDecode6;
                                break;
                        }
                        strDecode6 = str;
                        cashTransferDirectionDecode = cashTransferDirection;
                    } else {
                        return new FuturesCashTransfer(strDecode6, strDecode, strDecode2, moneyDecode, moneyDecode2, cashTransferDirectionDecode, strDecode5, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesCashTransfer redact(FuturesCashTransfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money requested_amount = value.getRequested_amount();
                Money moneyRedact = requested_amount != null ? Money.ADAPTER.redact(requested_amount) : null;
                Money actual_amount = value.getActual_amount();
                return FuturesCashTransfer.copy$default(value, null, null, null, moneyRedact, actual_amount != null ? Money.ADAPTER.redact(actual_amount) : null, null, null, null, null, ByteString.EMPTY, 487, null);
            }
        };
    }
}
