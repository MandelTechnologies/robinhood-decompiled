package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerComponentGetStartedDetails.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetails;", "Lcom/squareup/wire/Message;", "", "total_investments_header", "", "total_investments_amount", "header", "subtitle", "button_text", "action", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAction;Lokio/ByteString;)V", "getTotal_investments_header", "()Ljava/lang/String;", "getTotal_investments_amount", "getHeader", "getSubtitle", "getButton_text", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentGetStartedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentGetStartedDetails> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InvestmentsTrackerAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalInvestmentsAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String total_investments_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalInvestmentsHeader", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String total_investments_header;

    public InvestmentsTrackerComponentGetStartedDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentGetStartedDetails(String str, String str2, String str3, String str4, String str5, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? InvestmentsTrackerAction.ACTION_UNSPECIFIED : investmentsTrackerAction, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8458newBuilder();
    }

    public final String getTotal_investments_header() {
        return this.total_investments_header;
    }

    public final String getTotal_investments_amount() {
        return this.total_investments_amount;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getButton_text() {
        return this.button_text;
    }

    public final InvestmentsTrackerAction getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentGetStartedDetails(String total_investments_header, String total_investments_amount, String header, String subtitle, String button_text, InvestmentsTrackerAction action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(total_investments_header, "total_investments_header");
        Intrinsics.checkNotNullParameter(total_investments_amount, "total_investments_amount");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_investments_header = total_investments_header;
        this.total_investments_amount = total_investments_amount;
        this.header = header;
        this.subtitle = subtitle;
        this.button_text = button_text;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8458newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentGetStartedDetails)) {
            return false;
        }
        InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails = (InvestmentsTrackerComponentGetStartedDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentGetStartedDetails.unknownFields()) && Intrinsics.areEqual(this.total_investments_header, investmentsTrackerComponentGetStartedDetails.total_investments_header) && Intrinsics.areEqual(this.total_investments_amount, investmentsTrackerComponentGetStartedDetails.total_investments_amount) && Intrinsics.areEqual(this.header, investmentsTrackerComponentGetStartedDetails.header) && Intrinsics.areEqual(this.subtitle, investmentsTrackerComponentGetStartedDetails.subtitle) && Intrinsics.areEqual(this.button_text, investmentsTrackerComponentGetStartedDetails.button_text) && this.action == investmentsTrackerComponentGetStartedDetails.action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.total_investments_header.hashCode()) * 37) + this.total_investments_amount.hashCode()) * 37) + this.header.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.button_text.hashCode()) * 37) + this.action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_investments_header=" + Internal.sanitize(this.total_investments_header));
        arrayList.add("total_investments_amount=" + Internal.sanitize(this.total_investments_amount));
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("button_text=" + Internal.sanitize(this.button_text));
        arrayList.add("action=" + this.action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentGetStartedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentGetStartedDetails copy$default(InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails, String str, String str2, String str3, String str4, String str5, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentGetStartedDetails.total_investments_header;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentGetStartedDetails.total_investments_amount;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentGetStartedDetails.header;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerComponentGetStartedDetails.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = investmentsTrackerComponentGetStartedDetails.button_text;
        }
        if ((i & 32) != 0) {
            investmentsTrackerAction = investmentsTrackerComponentGetStartedDetails.action;
        }
        if ((i & 64) != 0) {
            byteString = investmentsTrackerComponentGetStartedDetails.unknownFields();
        }
        InvestmentsTrackerAction investmentsTrackerAction2 = investmentsTrackerAction;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return investmentsTrackerComponentGetStartedDetails.copy(str, str2, str7, str4, str6, investmentsTrackerAction2, byteString2);
    }

    public final InvestmentsTrackerComponentGetStartedDetails copy(String total_investments_header, String total_investments_amount, String header, String subtitle, String button_text, InvestmentsTrackerAction action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(total_investments_header, "total_investments_header");
        Intrinsics.checkNotNullParameter(total_investments_amount, "total_investments_amount");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentGetStartedDetails(total_investments_header, total_investments_amount, header, subtitle, button_text, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentGetStartedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentGetStartedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentGetStartedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentGetStartedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTotal_investments_header(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTotal_investments_header());
                }
                if (!Intrinsics.areEqual(value.getTotal_investments_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_investments_amount());
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getButton_text());
                }
                return value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED ? size + InvestmentsTrackerAction.ADAPTER.encodedSizeWithTag(6, value.getAction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentGetStartedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTotal_investments_header(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTotal_investments_header());
                }
                if (!Intrinsics.areEqual(value.getTotal_investments_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_investments_amount());
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getButton_text());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 6, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentGetStartedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 6, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getButton_text());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getTotal_investments_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_investments_amount());
                }
                if (Intrinsics.areEqual(value.getTotal_investments_header(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTotal_investments_header());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentGetStartedDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerAction investmentsTrackerActionDecode = InvestmentsTrackerAction.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    InvestmentsTrackerAction investmentsTrackerAction = investmentsTrackerActionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        investmentsTrackerActionDecode = InvestmentsTrackerAction.ADAPTER.decode(reader);
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
                            return new InvestmentsTrackerComponentGetStartedDetails(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, investmentsTrackerAction, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentGetStartedDetails redact(InvestmentsTrackerComponentGetStartedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentGetStartedDetails.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
