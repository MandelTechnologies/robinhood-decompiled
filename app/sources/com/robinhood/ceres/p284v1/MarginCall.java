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

/* compiled from: MarginCall.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCall;", "Lcom/squareup/wire/Message;", "", "id", "", "rhs_account_number", "rhd_account_number", "days_aged", "", "amount_start_of_day", "outstanding_margin_call_amount", "non_displayable_outstanding_margin_call_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getRhs_account_number", "getRhd_account_number", "getDays_aged", "()I", "getAmount_start_of_day", "getOutstanding_margin_call_amount", "getNon_displayable_outstanding_margin_call_amount", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MarginCall extends Message {

    @JvmField
    public static final ProtoAdapter<MarginCall> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "amountStartOfDay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String amount_start_of_day;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "daysAged", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int days_aged;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nonDisplayableOutstandingMarginCallAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String non_displayable_outstanding_margin_call_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "outstandingMarginCallAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String outstanding_margin_call_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhdAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhd_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rhs_account_number;

    public MarginCall() {
        this(null, null, null, 0, null, null, null, null, 255, null);
    }

    public /* synthetic */ MarginCall(String str, String str2, String str3, int i, String str4, String str5, String str6, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20390newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getRhd_account_number() {
        return this.rhd_account_number;
    }

    public final int getDays_aged() {
        return this.days_aged;
    }

    public final String getAmount_start_of_day() {
        return this.amount_start_of_day;
    }

    public final String getOutstanding_margin_call_amount() {
        return this.outstanding_margin_call_amount;
    }

    public final String getNon_displayable_outstanding_margin_call_amount() {
        return this.non_displayable_outstanding_margin_call_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginCall(String id, String rhs_account_number, String rhd_account_number, int i, String amount_start_of_day, String outstanding_margin_call_amount, String non_displayable_outstanding_margin_call_amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
        Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.rhs_account_number = rhs_account_number;
        this.rhd_account_number = rhd_account_number;
        this.days_aged = i;
        this.amount_start_of_day = amount_start_of_day;
        this.outstanding_margin_call_amount = outstanding_margin_call_amount;
        this.non_displayable_outstanding_margin_call_amount = non_displayable_outstanding_margin_call_amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20390newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginCall)) {
            return false;
        }
        MarginCall marginCall = (MarginCall) other;
        return Intrinsics.areEqual(unknownFields(), marginCall.unknownFields()) && Intrinsics.areEqual(this.id, marginCall.id) && Intrinsics.areEqual(this.rhs_account_number, marginCall.rhs_account_number) && Intrinsics.areEqual(this.rhd_account_number, marginCall.rhd_account_number) && this.days_aged == marginCall.days_aged && Intrinsics.areEqual(this.amount_start_of_day, marginCall.amount_start_of_day) && Intrinsics.areEqual(this.outstanding_margin_call_amount, marginCall.outstanding_margin_call_amount) && Intrinsics.areEqual(this.non_displayable_outstanding_margin_call_amount, marginCall.non_displayable_outstanding_margin_call_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.rhd_account_number.hashCode()) * 37) + Integer.hashCode(this.days_aged)) * 37) + this.amount_start_of_day.hashCode()) * 37) + this.outstanding_margin_call_amount.hashCode()) * 37) + this.non_displayable_outstanding_margin_call_amount.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("rhd_account_number=" + Internal.sanitize(this.rhd_account_number));
        arrayList.add("days_aged=" + this.days_aged);
        arrayList.add("amount_start_of_day=" + Internal.sanitize(this.amount_start_of_day));
        arrayList.add("outstanding_margin_call_amount=" + Internal.sanitize(this.outstanding_margin_call_amount));
        arrayList.add("non_displayable_outstanding_margin_call_amount=" + Internal.sanitize(this.non_displayable_outstanding_margin_call_amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginCall{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginCall copy$default(MarginCall marginCall, String str, String str2, String str3, int i, String str4, String str5, String str6, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marginCall.id;
        }
        if ((i2 & 2) != 0) {
            str2 = marginCall.rhs_account_number;
        }
        if ((i2 & 4) != 0) {
            str3 = marginCall.rhd_account_number;
        }
        if ((i2 & 8) != 0) {
            i = marginCall.days_aged;
        }
        if ((i2 & 16) != 0) {
            str4 = marginCall.amount_start_of_day;
        }
        if ((i2 & 32) != 0) {
            str5 = marginCall.outstanding_margin_call_amount;
        }
        if ((i2 & 64) != 0) {
            str6 = marginCall.non_displayable_outstanding_margin_call_amount;
        }
        if ((i2 & 128) != 0) {
            byteString = marginCall.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return marginCall.copy(str, str2, str3, i, str8, str9, str7, byteString2);
    }

    public final MarginCall copy(String id, String rhs_account_number, String rhd_account_number, int days_aged, String amount_start_of_day, String outstanding_margin_call_amount, String non_displayable_outstanding_margin_call_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
        Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginCall(id, rhs_account_number, rhd_account_number, days_aged, amount_start_of_day, outstanding_margin_call_amount, non_displayable_outstanding_margin_call_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginCall.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginCall>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.MarginCall$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginCall value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhd_account_number());
                }
                if (value.getDays_aged() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getDays_aged()));
                }
                if (!Intrinsics.areEqual(value.getAmount_start_of_day(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAmount_start_of_day());
                }
                if (!Intrinsics.areEqual(value.getOutstanding_margin_call_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getOutstanding_margin_call_amount());
                }
                return !Intrinsics.areEqual(value.getNon_displayable_outstanding_margin_call_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getNon_displayable_outstanding_margin_call_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginCall value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhd_account_number());
                }
                if (value.getDays_aged() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDays_aged()));
                }
                if (!Intrinsics.areEqual(value.getAmount_start_of_day(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAmount_start_of_day());
                }
                if (!Intrinsics.areEqual(value.getOutstanding_margin_call_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOutstanding_margin_call_amount());
                }
                if (!Intrinsics.areEqual(value.getNon_displayable_outstanding_margin_call_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNon_displayable_outstanding_margin_call_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginCall value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNon_displayable_outstanding_margin_call_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNon_displayable_outstanding_margin_call_amount());
                }
                if (!Intrinsics.areEqual(value.getOutstanding_margin_call_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOutstanding_margin_call_amount());
                }
                if (!Intrinsics.areEqual(value.getAmount_start_of_day(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAmount_start_of_day());
                }
                if (value.getDays_aged() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDays_aged()));
                }
                if (!Intrinsics.areEqual(value.getRhd_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhd_account_number());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginCall redact(MarginCall value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginCall.copy$default(value, null, null, null, 0, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginCall decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                int iIntValue = 0;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MarginCall(strDecode, strDecode6, strDecode2, iIntValue, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
