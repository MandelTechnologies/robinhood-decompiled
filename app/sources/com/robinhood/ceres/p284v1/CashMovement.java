package com.robinhood.ceres.p284v1;

import com.robinhood.utils.buildconfig.BuildFlavors;
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

/* compiled from: CashMovement.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashMovement;", "Lcom/squareup/wire/Message;", "", "amount", "", BuildFlavors.EXTERNAL, "", "accounting_type", "Lcom/robinhood/ceres/v1/AccountingType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/ceres/v1/AccountingType;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "getExternal", "()Z", "getAccounting_type", "()Lcom/robinhood/ceres/v1/AccountingType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashMovement extends Message {

    @JvmField
    public static final ProtoAdapter<CashMovement> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountingType#ADAPTER", jsonName = "accountingType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountingType accounting_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean external;

    public CashMovement() {
        this(null, false, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20273newBuilder();
    }

    public final String getAmount() {
        return this.amount;
    }

    public /* synthetic */ CashMovement(String str, boolean z, AccountingType accountingType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? AccountingType.ACCOUNTING_TYPE_UNSPECIFIED : accountingType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getExternal() {
        return this.external;
    }

    public final AccountingType getAccounting_type() {
        return this.accounting_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashMovement(String amount, boolean z, AccountingType accounting_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accounting_type, "accounting_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount = amount;
        this.external = z;
        this.accounting_type = accounting_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20273newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashMovement)) {
            return false;
        }
        CashMovement cashMovement = (CashMovement) other;
        return Intrinsics.areEqual(unknownFields(), cashMovement.unknownFields()) && Intrinsics.areEqual(this.amount, cashMovement.amount) && this.external == cashMovement.external && this.accounting_type == cashMovement.accounting_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.amount.hashCode()) * 37) + Boolean.hashCode(this.external)) * 37) + this.accounting_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("external=" + this.external);
        arrayList.add("accounting_type=" + this.accounting_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashMovement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashMovement copy$default(CashMovement cashMovement, String str, boolean z, AccountingType accountingType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashMovement.amount;
        }
        if ((i & 2) != 0) {
            z = cashMovement.external;
        }
        if ((i & 4) != 0) {
            accountingType = cashMovement.accounting_type;
        }
        if ((i & 8) != 0) {
            byteString = cashMovement.unknownFields();
        }
        return cashMovement.copy(str, z, accountingType, byteString);
    }

    public final CashMovement copy(String amount, boolean external, AccountingType accounting_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accounting_type, "accounting_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashMovement(amount, external, accounting_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashMovement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashMovement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CashMovement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount());
                }
                if (value.getExternal()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getExternal()));
                }
                return value.getAccounting_type() != AccountingType.ACCOUNTING_TYPE_UNSPECIFIED ? size + AccountingType.ADAPTER.encodedSizeWithTag(3, value.getAccounting_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                }
                if (value.getExternal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getExternal()));
                }
                if (value.getAccounting_type() != AccountingType.ACCOUNTING_TYPE_UNSPECIFIED) {
                    AccountingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccounting_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccounting_type() != AccountingType.ACCOUNTING_TYPE_UNSPECIFIED) {
                    AccountingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccounting_type());
                }
                if (value.getExternal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getExternal()));
                }
                if (Intrinsics.areEqual(value.getAmount(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashMovement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountingType accountingTypeDecode = AccountingType.ACCOUNTING_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CashMovement(strDecode, zBooleanValue, accountingTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        try {
                            accountingTypeDecode = AccountingType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashMovement redact(CashMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CashMovement.copy$default(value, null, false, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
