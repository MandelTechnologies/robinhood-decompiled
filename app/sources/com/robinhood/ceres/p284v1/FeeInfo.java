package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Date;
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

/* compiled from: FeeInfo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JX\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfo;", "Lcom/squareup/wire/Message;", "", "root_symbol", "", "fee_amount", "Lcom/robinhood/rosetta/common/Money;", "effective_from_date", "Lcom/robinhood/rosetta/common/Date;", "effective_through_date", "id", "fee_scheme", "Lcom/robinhood/ceres/v1/FeeScheme;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeScheme;Lokio/ByteString;)V", "getRoot_symbol", "()Ljava/lang/String;", "getFee_amount", "()Lcom/robinhood/rosetta/common/Money;", "getEffective_from_date", "()Lcom/robinhood/rosetta/common/Date;", "getEffective_through_date", "getId", "getFee_scheme", "()Lcom/robinhood/ceres/v1/FeeScheme;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeInfo extends Message {

    @JvmField
    public static final ProtoAdapter<FeeInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "effectiveFromDate", schemaIndex = 2, tag = 3)
    private final Date effective_from_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "effectiveThroughDate", schemaIndex = 3, tag = 4)
    private final Date effective_through_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "feeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money fee_amount;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeScheme#ADAPTER", jsonName = "feeScheme", schemaIndex = 5, tag = 6)
    private final FeeScheme fee_scheme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rootSymbol", schemaIndex = 0, tag = 1)
    private final String root_symbol;

    public FeeInfo() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20299newBuilder();
    }

    public final String getRoot_symbol() {
        return this.root_symbol;
    }

    public final Money getFee_amount() {
        return this.fee_amount;
    }

    public final Date getEffective_from_date() {
        return this.effective_from_date;
    }

    public final Date getEffective_through_date() {
        return this.effective_through_date;
    }

    public final String getId() {
        return this.id;
    }

    public final FeeScheme getFee_scheme() {
        return this.fee_scheme;
    }

    public /* synthetic */ FeeInfo(String str, Money money, Date date, Date date2, String str2, FeeScheme feeScheme, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : date2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : feeScheme, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeInfo(String str, Money money, Date date, Date date2, String str2, FeeScheme feeScheme, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.root_symbol = str;
        this.fee_amount = money;
        this.effective_from_date = date;
        this.effective_through_date = date2;
        this.id = str2;
        this.fee_scheme = feeScheme;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20299newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeInfo)) {
            return false;
        }
        FeeInfo feeInfo = (FeeInfo) other;
        return Intrinsics.areEqual(unknownFields(), feeInfo.unknownFields()) && Intrinsics.areEqual(this.root_symbol, feeInfo.root_symbol) && Intrinsics.areEqual(this.fee_amount, feeInfo.fee_amount) && Intrinsics.areEqual(this.effective_from_date, feeInfo.effective_from_date) && Intrinsics.areEqual(this.effective_through_date, feeInfo.effective_through_date) && Intrinsics.areEqual(this.id, feeInfo.id) && this.fee_scheme == feeInfo.fee_scheme;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.root_symbol;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.fee_amount;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Date date = this.effective_from_date;
        int iHashCode4 = (iHashCode3 + (date != null ? date.hashCode() : 0)) * 37;
        Date date2 = this.effective_through_date;
        int iHashCode5 = (iHashCode4 + (date2 != null ? date2.hashCode() : 0)) * 37;
        String str2 = this.id;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FeeScheme feeScheme = this.fee_scheme;
        int iHashCode7 = iHashCode6 + (feeScheme != null ? feeScheme.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.root_symbol;
        if (str != null) {
            arrayList.add("root_symbol=" + Internal.sanitize(str));
        }
        Money money = this.fee_amount;
        if (money != null) {
            arrayList.add("fee_amount=" + money);
        }
        Date date = this.effective_from_date;
        if (date != null) {
            arrayList.add("effective_from_date=" + date);
        }
        Date date2 = this.effective_through_date;
        if (date2 != null) {
            arrayList.add("effective_through_date=" + date2);
        }
        String str2 = this.id;
        if (str2 != null) {
            arrayList.add("id=" + Internal.sanitize(str2));
        }
        FeeScheme feeScheme = this.fee_scheme;
        if (feeScheme != null) {
            arrayList.add("fee_scheme=" + feeScheme);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeInfo copy$default(FeeInfo feeInfo, String str, Money money, Date date, Date date2, String str2, FeeScheme feeScheme, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeInfo.root_symbol;
        }
        if ((i & 2) != 0) {
            money = feeInfo.fee_amount;
        }
        if ((i & 4) != 0) {
            date = feeInfo.effective_from_date;
        }
        if ((i & 8) != 0) {
            date2 = feeInfo.effective_through_date;
        }
        if ((i & 16) != 0) {
            str2 = feeInfo.id;
        }
        if ((i & 32) != 0) {
            feeScheme = feeInfo.fee_scheme;
        }
        if ((i & 64) != 0) {
            byteString = feeInfo.unknownFields();
        }
        FeeScheme feeScheme2 = feeScheme;
        ByteString byteString2 = byteString;
        String str3 = str2;
        Date date3 = date;
        return feeInfo.copy(str, money, date3, date2, str3, feeScheme2, byteString2);
    }

    public final FeeInfo copy(String root_symbol, Money fee_amount, Date effective_from_date, Date effective_through_date, String id, FeeScheme fee_scheme, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeInfo(root_symbol, fee_amount, effective_from_date, effective_through_date, id, fee_scheme, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FeeInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getRoot_symbol());
                if (value.getFee_amount() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(2, value.getFee_amount());
                }
                ProtoAdapter<Date> protoAdapter2 = Date.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.getEffective_from_date()) + protoAdapter2.encodedSizeWithTag(4, value.getEffective_through_date()) + protoAdapter.encodedSizeWithTag(5, value.getId()) + FeeScheme.ADAPTER.encodedSizeWithTag(6, value.getFee_scheme());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRoot_symbol());
                if (value.getFee_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_amount());
                }
                ProtoAdapter<Date> protoAdapter2 = Date.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getEffective_from_date());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getEffective_through_date());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getId());
                FeeScheme.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_scheme());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FeeScheme.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_scheme());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getId());
                ProtoAdapter<Date> protoAdapter2 = Date.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getEffective_through_date());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getEffective_from_date());
                if (value.getFee_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getFee_amount());
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRoot_symbol());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeInfo redact(FeeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money fee_amount = value.getFee_amount();
                Money moneyRedact = fee_amount != null ? Money.ADAPTER.redact(fee_amount) : null;
                Date effective_from_date = value.getEffective_from_date();
                Date dateRedact = effective_from_date != null ? Date.ADAPTER.redact(effective_from_date) : null;
                Date effective_through_date = value.getEffective_through_date();
                return FeeInfo.copy$default(value, null, moneyRedact, dateRedact, effective_through_date != null ? Date.ADAPTER.redact(effective_through_date) : null, null, null, ByteString.EMPTY, 49, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Money moneyDecode = null;
                Date dateDecode = null;
                Date dateDecode2 = null;
                String strDecode2 = null;
                FeeScheme feeSchemeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 4:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    feeSchemeDecode = FeeScheme.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FeeInfo(strDecode, moneyDecode, dateDecode, dateDecode2, strDecode2, feeSchemeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
