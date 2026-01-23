package advisory.proto.p008v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: GetManagedPortfolioResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JF\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Ladvisory/proto/v1/ManagedPortfolio;", "state", "Ladvisory/proto/v1/AccountState;", "disclosure_text", "default_breakdown_unit", "Ladvisory/proto/v1/BreakdownUnit;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/ManagedPortfolio;Ladvisory/proto/v1/AccountState;Ljava/lang/String;Ladvisory/proto/v1/BreakdownUnit;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getPortfolio", "()Ladvisory/proto/v1/ManagedPortfolio;", "getState", "()Ladvisory/proto/v1/AccountState;", "getDisclosure_text", "getDefault_breakdown_unit", "()Ladvisory/proto/v1/BreakdownUnit;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetManagedPortfolioResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetManagedPortfolioResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.BreakdownUnit#ADAPTER", jsonName = "defaultBreakdownUnit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final BreakdownUnit default_breakdown_unit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureText", schemaIndex = 3, tag = 4)
    private final String disclosure_text;

    @WireField(adapter = "advisory.proto.v1.ManagedPortfolio#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ManagedPortfolio portfolio;

    @WireField(adapter = "advisory.proto.v1.AccountState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountState state;

    public GetManagedPortfolioResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4458newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetManagedPortfolioResponse(String str, ManagedPortfolio managedPortfolio, AccountState accountState, String str2, BreakdownUnit breakdownUnit, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : managedPortfolio, (i & 4) != 0 ? AccountState.STATE_UNSPECIFIED : accountState, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? BreakdownUnit.UNIT_UNSPECIFIED : breakdownUnit, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ManagedPortfolio getPortfolio() {
        return this.portfolio;
    }

    public final AccountState getState() {
        return this.state;
    }

    public final String getDisclosure_text() {
        return this.disclosure_text;
    }

    public final BreakdownUnit getDefault_breakdown_unit() {
        return this.default_breakdown_unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetManagedPortfolioResponse(String account_number, ManagedPortfolio managedPortfolio, AccountState state, String str, BreakdownUnit default_breakdown_unit, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(default_breakdown_unit, "default_breakdown_unit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.portfolio = managedPortfolio;
        this.state = state;
        this.disclosure_text = str;
        this.default_breakdown_unit = default_breakdown_unit;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4458newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetManagedPortfolioResponse)) {
            return false;
        }
        GetManagedPortfolioResponse getManagedPortfolioResponse = (GetManagedPortfolioResponse) other;
        return Intrinsics.areEqual(unknownFields(), getManagedPortfolioResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getManagedPortfolioResponse.account_number) && Intrinsics.areEqual(this.portfolio, getManagedPortfolioResponse.portfolio) && this.state == getManagedPortfolioResponse.state && Intrinsics.areEqual(this.disclosure_text, getManagedPortfolioResponse.disclosure_text) && this.default_breakdown_unit == getManagedPortfolioResponse.default_breakdown_unit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        ManagedPortfolio managedPortfolio = this.portfolio;
        int iHashCode2 = (((iHashCode + (managedPortfolio != null ? managedPortfolio.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        String str = this.disclosure_text;
        int iHashCode3 = ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.default_breakdown_unit.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        ManagedPortfolio managedPortfolio = this.portfolio;
        if (managedPortfolio != null) {
            arrayList.add("portfolio=" + managedPortfolio);
        }
        arrayList.add("state=" + this.state);
        String str = this.disclosure_text;
        if (str != null) {
            arrayList.add("disclosure_text=" + Internal.sanitize(str));
        }
        arrayList.add("default_breakdown_unit=" + this.default_breakdown_unit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetManagedPortfolioResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetManagedPortfolioResponse copy$default(GetManagedPortfolioResponse getManagedPortfolioResponse, String str, ManagedPortfolio managedPortfolio, AccountState accountState, String str2, BreakdownUnit breakdownUnit, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getManagedPortfolioResponse.account_number;
        }
        if ((i & 2) != 0) {
            managedPortfolio = getManagedPortfolioResponse.portfolio;
        }
        if ((i & 4) != 0) {
            accountState = getManagedPortfolioResponse.state;
        }
        if ((i & 8) != 0) {
            str2 = getManagedPortfolioResponse.disclosure_text;
        }
        if ((i & 16) != 0) {
            breakdownUnit = getManagedPortfolioResponse.default_breakdown_unit;
        }
        if ((i & 32) != 0) {
            byteString = getManagedPortfolioResponse.unknownFields();
        }
        BreakdownUnit breakdownUnit2 = breakdownUnit;
        ByteString byteString2 = byteString;
        return getManagedPortfolioResponse.copy(str, managedPortfolio, accountState, str2, breakdownUnit2, byteString2);
    }

    public final GetManagedPortfolioResponse copy(String account_number, ManagedPortfolio portfolio, AccountState state, String disclosure_text, BreakdownUnit default_breakdown_unit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(default_breakdown_unit, "default_breakdown_unit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetManagedPortfolioResponse(account_number, portfolio, state, disclosure_text, default_breakdown_unit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetManagedPortfolioResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetManagedPortfolioResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetManagedPortfolioResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetManagedPortfolioResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getPortfolio() != null) {
                    size += ManagedPortfolio.ADAPTER.encodedSizeWithTag(2, value.getPortfolio());
                }
                if (value.getState() != AccountState.STATE_UNSPECIFIED) {
                    size += AccountState.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure_text());
                return value.getDefault_breakdown_unit() != BreakdownUnit.UNIT_UNSPECIFIED ? iEncodedSizeWithTag + BreakdownUnit.ADAPTER.encodedSizeWithTag(5, value.getDefault_breakdown_unit()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetManagedPortfolioResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getPortfolio() != null) {
                    ManagedPortfolio.ADAPTER.encodeWithTag(writer, 2, (int) value.getPortfolio());
                }
                if (value.getState() != AccountState.STATE_UNSPECIFIED) {
                    AccountState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_text());
                if (value.getDefault_breakdown_unit() != BreakdownUnit.UNIT_UNSPECIFIED) {
                    BreakdownUnit.ADAPTER.encodeWithTag(writer, 5, (int) value.getDefault_breakdown_unit());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetManagedPortfolioResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDefault_breakdown_unit() != BreakdownUnit.UNIT_UNSPECIFIED) {
                    BreakdownUnit.ADAPTER.encodeWithTag(writer, 5, (int) value.getDefault_breakdown_unit());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_text());
                if (value.getState() != AccountState.STATE_UNSPECIFIED) {
                    AccountState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getPortfolio() != null) {
                    ManagedPortfolio.ADAPTER.encodeWithTag(writer, 2, (int) value.getPortfolio());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetManagedPortfolioResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountState accountStateDecode = AccountState.STATE_UNSPECIFIED;
                BreakdownUnit breakdownUnit = BreakdownUnit.UNIT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ManagedPortfolio managedPortfolioDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                BreakdownUnit breakdownUnitDecode = breakdownUnit;
                while (true) {
                    AccountState accountState = accountStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetManagedPortfolioResponse(strDecode2, managedPortfolioDecode, accountState, strDecode, breakdownUnitDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            managedPortfolioDecode = ManagedPortfolio.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                accountStateDecode = AccountState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                breakdownUnitDecode = BreakdownUnit.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetManagedPortfolioResponse redact(GetManagedPortfolioResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ManagedPortfolio portfolio = value.getPortfolio();
                return GetManagedPortfolioResponse.copy$default(value, null, portfolio != null ? ManagedPortfolio.ADAPTER.redact(portfolio) : null, null, null, null, ByteString.EMPTY, 29, null);
            }
        };
    }
}
