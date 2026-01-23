package bonfire.proto.idl.margin.p036v1;

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

/* compiled from: GetMultiAccountEligibilityResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "context", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "is_eligible", "", "margin_investing_state", "Lbonfire/proto/idl/margin/v1/MarginInvestingState;", "ineligibility_content", "Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;ZLbonfire/proto/idl/margin/v1/MarginInvestingState;Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModel;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getContext", "()Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "()Z", "getMargin_investing_state", "()Lbonfire/proto/idl/margin/v1/MarginInvestingState;", "getIneligibility_content", "()Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModel;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetMultiAccountEligibilityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMultiAccountEligibilityResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MultiAccountEligibilityContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MultiAccountEligibilityContext context;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MultiAccountIneligibilityContentModel#ADAPTER", jsonName = "ineligibilityContent", schemaIndex = 4, tag = 5)
    private final MultiAccountIneligibilityContentModel ineligibility_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_eligible;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginInvestingState#ADAPTER", jsonName = "marginInvestingState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MarginInvestingState margin_investing_state;

    public GetMultiAccountEligibilityResponse() {
        this(null, null, false, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9007newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetMultiAccountEligibilityResponse(String str, MultiAccountEligibilityContext multiAccountEligibilityContext, boolean z, MarginInvestingState marginInvestingState, MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED : multiAccountEligibilityContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED : marginInvestingState, (i & 16) != 0 ? null : multiAccountIneligibilityContentModel, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MultiAccountEligibilityContext getContext() {
        return this.context;
    }

    /* renamed from: is_eligible, reason: from getter */
    public final boolean getIs_eligible() {
        return this.is_eligible;
    }

    public final MarginInvestingState getMargin_investing_state() {
        return this.margin_investing_state;
    }

    public final MultiAccountIneligibilityContentModel getIneligibility_content() {
        return this.ineligibility_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMultiAccountEligibilityResponse(String account_number, MultiAccountEligibilityContext context, boolean z, MarginInvestingState margin_investing_state, MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(margin_investing_state, "margin_investing_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.context = context;
        this.is_eligible = z;
        this.margin_investing_state = margin_investing_state;
        this.ineligibility_content = multiAccountIneligibilityContentModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9007newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMultiAccountEligibilityResponse)) {
            return false;
        }
        GetMultiAccountEligibilityResponse getMultiAccountEligibilityResponse = (GetMultiAccountEligibilityResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMultiAccountEligibilityResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getMultiAccountEligibilityResponse.account_number) && this.context == getMultiAccountEligibilityResponse.context && this.is_eligible == getMultiAccountEligibilityResponse.is_eligible && this.margin_investing_state == getMultiAccountEligibilityResponse.margin_investing_state && Intrinsics.areEqual(this.ineligibility_content, getMultiAccountEligibilityResponse.ineligibility_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.context.hashCode()) * 37) + Boolean.hashCode(this.is_eligible)) * 37) + this.margin_investing_state.hashCode()) * 37;
        MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel = this.ineligibility_content;
        int iHashCode2 = iHashCode + (multiAccountIneligibilityContentModel != null ? multiAccountIneligibilityContentModel.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("context=" + this.context);
        arrayList.add("is_eligible=" + this.is_eligible);
        arrayList.add("margin_investing_state=" + this.margin_investing_state);
        MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel = this.ineligibility_content;
        if (multiAccountIneligibilityContentModel != null) {
            arrayList.add("ineligibility_content=" + multiAccountIneligibilityContentModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMultiAccountEligibilityResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetMultiAccountEligibilityResponse copy$default(GetMultiAccountEligibilityResponse getMultiAccountEligibilityResponse, String str, MultiAccountEligibilityContext multiAccountEligibilityContext, boolean z, MarginInvestingState marginInvestingState, MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMultiAccountEligibilityResponse.account_number;
        }
        if ((i & 2) != 0) {
            multiAccountEligibilityContext = getMultiAccountEligibilityResponse.context;
        }
        if ((i & 4) != 0) {
            z = getMultiAccountEligibilityResponse.is_eligible;
        }
        if ((i & 8) != 0) {
            marginInvestingState = getMultiAccountEligibilityResponse.margin_investing_state;
        }
        if ((i & 16) != 0) {
            multiAccountIneligibilityContentModel = getMultiAccountEligibilityResponse.ineligibility_content;
        }
        if ((i & 32) != 0) {
            byteString = getMultiAccountEligibilityResponse.unknownFields();
        }
        MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel2 = multiAccountIneligibilityContentModel;
        ByteString byteString2 = byteString;
        return getMultiAccountEligibilityResponse.copy(str, multiAccountEligibilityContext, z, marginInvestingState, multiAccountIneligibilityContentModel2, byteString2);
    }

    public final GetMultiAccountEligibilityResponse copy(String account_number, MultiAccountEligibilityContext context, boolean is_eligible, MarginInvestingState margin_investing_state, MultiAccountIneligibilityContentModel ineligibility_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(margin_investing_state, "margin_investing_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMultiAccountEligibilityResponse(account_number, context, is_eligible, margin_investing_state, ineligibility_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMultiAccountEligibilityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMultiAccountEligibilityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMultiAccountEligibilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getContext() != MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED) {
                    size += MultiAccountEligibilityContext.ADAPTER.encodedSizeWithTag(2, value.getContext());
                }
                if (value.getIs_eligible()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getMargin_investing_state() != MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED) {
                    size += MarginInvestingState.ADAPTER.encodedSizeWithTag(4, value.getMargin_investing_state());
                }
                return size + MultiAccountIneligibilityContentModel.ADAPTER.encodedSizeWithTag(5, value.getIneligibility_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMultiAccountEligibilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getContext() != MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED) {
                    MultiAccountEligibilityContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                }
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getMargin_investing_state() != MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED) {
                    MarginInvestingState.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_investing_state());
                }
                MultiAccountIneligibilityContentModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getIneligibility_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMultiAccountEligibilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MultiAccountIneligibilityContentModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getIneligibility_content());
                if (value.getMargin_investing_state() != MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED) {
                    MarginInvestingState.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_investing_state());
                }
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getContext() != MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED) {
                    MultiAccountEligibilityContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetMultiAccountEligibilityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MultiAccountEligibilityContext multiAccountEligibilityContextDecode = MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
                MarginInvestingState marginInvestingState = MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModelDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                MarginInvestingState marginInvestingStateDecode = marginInvestingState;
                while (true) {
                    MultiAccountEligibilityContext multiAccountEligibilityContext = multiAccountEligibilityContextDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetMultiAccountEligibilityResponse(strDecode, multiAccountEligibilityContext, zBooleanValue, marginInvestingStateDecode, multiAccountIneligibilityContentModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                multiAccountEligibilityContextDecode = MultiAccountEligibilityContext.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 4) {
                            try {
                                marginInvestingStateDecode = MarginInvestingState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 5) {
                            multiAccountIneligibilityContentModelDecode = MultiAccountIneligibilityContentModel.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMultiAccountEligibilityResponse redact(GetMultiAccountEligibilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MultiAccountIneligibilityContentModel ineligibility_content = value.getIneligibility_content();
                return GetMultiAccountEligibilityResponse.copy$default(value, null, null, false, null, ineligibility_content != null ? MultiAccountIneligibilityContentModel.ADAPTER.redact(ineligibility_content) : null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
