package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: GetFullWithdrawalSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/GetFullWithdrawalSummaryResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "title", "subtitle", "breakdown", "", "Ladvisory/proto/v1/WithdrawalSummaryItem;", "amount_received", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/WithdrawalSummaryItem;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getAmount_received", "()Ladvisory/proto/v1/WithdrawalSummaryItem;", "getDisclosure", "getBreakdown", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetFullWithdrawalSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFullWithdrawalSummaryResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.WithdrawalSummaryItem#ADAPTER", jsonName = "amountReceived", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final WithdrawalSummaryItem amount_received;

    @WireField(adapter = "advisory.proto.v1.WithdrawalSummaryItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<WithdrawalSummaryItem> breakdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetFullWithdrawalSummaryResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetFullWithdrawalSummaryResponse(String str, String str2, String str3, List list, WithdrawalSummaryItem withdrawalSummaryItem, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : withdrawalSummaryItem, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4450newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final WithdrawalSummaryItem getAmount_received() {
        return this.amount_received;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFullWithdrawalSummaryResponse(String account_number, String title, String subtitle, List<WithdrawalSummaryItem> breakdown, WithdrawalSummaryItem withdrawalSummaryItem, String disclosure, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.title = title;
        this.subtitle = subtitle;
        this.amount_received = withdrawalSummaryItem;
        this.disclosure = disclosure;
        this.breakdown = Internal.immutableCopyOf("breakdown", breakdown);
    }

    public final List<WithdrawalSummaryItem> getBreakdown() {
        return this.breakdown;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4450newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFullWithdrawalSummaryResponse)) {
            return false;
        }
        GetFullWithdrawalSummaryResponse getFullWithdrawalSummaryResponse = (GetFullWithdrawalSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFullWithdrawalSummaryResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getFullWithdrawalSummaryResponse.account_number) && Intrinsics.areEqual(this.title, getFullWithdrawalSummaryResponse.title) && Intrinsics.areEqual(this.subtitle, getFullWithdrawalSummaryResponse.subtitle) && Intrinsics.areEqual(this.breakdown, getFullWithdrawalSummaryResponse.breakdown) && Intrinsics.areEqual(this.amount_received, getFullWithdrawalSummaryResponse.amount_received) && Intrinsics.areEqual(this.disclosure, getFullWithdrawalSummaryResponse.disclosure);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.breakdown.hashCode()) * 37;
        WithdrawalSummaryItem withdrawalSummaryItem = this.amount_received;
        int iHashCode2 = ((iHashCode + (withdrawalSummaryItem != null ? withdrawalSummaryItem.hashCode() : 0)) * 37) + this.disclosure.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.breakdown.isEmpty()) {
            arrayList.add("breakdown=" + this.breakdown);
        }
        WithdrawalSummaryItem withdrawalSummaryItem = this.amount_received;
        if (withdrawalSummaryItem != null) {
            arrayList.add("amount_received=" + withdrawalSummaryItem);
        }
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFullWithdrawalSummaryResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFullWithdrawalSummaryResponse copy$default(GetFullWithdrawalSummaryResponse getFullWithdrawalSummaryResponse, String str, String str2, String str3, List list, WithdrawalSummaryItem withdrawalSummaryItem, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFullWithdrawalSummaryResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getFullWithdrawalSummaryResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = getFullWithdrawalSummaryResponse.subtitle;
        }
        if ((i & 8) != 0) {
            list = getFullWithdrawalSummaryResponse.breakdown;
        }
        if ((i & 16) != 0) {
            withdrawalSummaryItem = getFullWithdrawalSummaryResponse.amount_received;
        }
        if ((i & 32) != 0) {
            str4 = getFullWithdrawalSummaryResponse.disclosure;
        }
        if ((i & 64) != 0) {
            byteString = getFullWithdrawalSummaryResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        WithdrawalSummaryItem withdrawalSummaryItem2 = withdrawalSummaryItem;
        String str6 = str3;
        return getFullWithdrawalSummaryResponse.copy(str, str2, str6, list, withdrawalSummaryItem2, str5, byteString2);
    }

    public final GetFullWithdrawalSummaryResponse copy(String account_number, String title, String subtitle, List<WithdrawalSummaryItem> breakdown, WithdrawalSummaryItem amount_received, String disclosure, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFullWithdrawalSummaryResponse(account_number, title, subtitle, breakdown, amount_received, disclosure, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFullWithdrawalSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFullWithdrawalSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetFullWithdrawalSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFullWithdrawalSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                ProtoAdapter<WithdrawalSummaryItem> protoAdapter = WithdrawalSummaryItem.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getBreakdown());
                if (value.getAmount_received() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getAmount_received());
                }
                return !Intrinsics.areEqual(value.getDisclosure(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDisclosure()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFullWithdrawalSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                ProtoAdapter<WithdrawalSummaryItem> protoAdapter = WithdrawalSummaryItem.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getBreakdown());
                if (value.getAmount_received() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getAmount_received());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisclosure());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFullWithdrawalSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisclosure());
                }
                if (value.getAmount_received() != null) {
                    WithdrawalSummaryItem.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount_received());
                }
                WithdrawalSummaryItem.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getBreakdown());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFullWithdrawalSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                WithdrawalSummaryItem withdrawalSummaryItemDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(WithdrawalSummaryItem.ADAPTER.decode(reader));
                                break;
                            case 5:
                                withdrawalSummaryItemDecode = WithdrawalSummaryItem.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetFullWithdrawalSummaryResponse(strDecode, strDecode4, strDecode2, arrayList, withdrawalSummaryItemDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFullWithdrawalSummaryResponse redact(GetFullWithdrawalSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<WithdrawalSummaryItem> breakdown = value.getBreakdown();
                ProtoAdapter<WithdrawalSummaryItem> protoAdapter = WithdrawalSummaryItem.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(breakdown, protoAdapter);
                WithdrawalSummaryItem amount_received = value.getAmount_received();
                return GetFullWithdrawalSummaryResponse.copy$default(value, null, null, null, listM26823redactElements, amount_received != null ? protoAdapter.redact(amount_received) : null, null, ByteString.EMPTY, 39, null);
            }
        };
    }
}
