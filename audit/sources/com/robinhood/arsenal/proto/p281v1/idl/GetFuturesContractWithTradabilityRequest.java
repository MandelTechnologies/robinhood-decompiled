package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.rosetta.i18n.Affiliate;
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

/* compiled from: GetFuturesContractWithTradabilityRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequest;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "affiliate", "Lcom/robinhood/rosetta/i18n/Affiliate;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/i18n/Affiliate;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/Affiliate;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GetFuturesContractWithTradabilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesContractWithTradabilityRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Affiliate#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Affiliate affiliate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    public GetFuturesContractWithTradabilityRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20160newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ GetFuturesContractWithTradabilityRequest(String str, Affiliate affiliate, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Affiliate.AFFILIATE_UNSPECIFIED : affiliate, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Affiliate getAffiliate() {
        return this.affiliate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesContractWithTradabilityRequest(String contract_id, Affiliate affiliate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.affiliate = affiliate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20160newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesContractWithTradabilityRequest)) {
            return false;
        }
        GetFuturesContractWithTradabilityRequest getFuturesContractWithTradabilityRequest = (GetFuturesContractWithTradabilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesContractWithTradabilityRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, getFuturesContractWithTradabilityRequest.contract_id) && this.affiliate == getFuturesContractWithTradabilityRequest.affiliate;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.affiliate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("affiliate=" + this.affiliate);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesContractWithTradabilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFuturesContractWithTradabilityRequest copy$default(GetFuturesContractWithTradabilityRequest getFuturesContractWithTradabilityRequest, String str, Affiliate affiliate, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFuturesContractWithTradabilityRequest.contract_id;
        }
        if ((i & 2) != 0) {
            affiliate = getFuturesContractWithTradabilityRequest.affiliate;
        }
        if ((i & 4) != 0) {
            byteString = getFuturesContractWithTradabilityRequest.unknownFields();
        }
        return getFuturesContractWithTradabilityRequest.copy(str, affiliate, byteString);
    }

    public final GetFuturesContractWithTradabilityRequest copy(String contract_id, Affiliate affiliate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesContractWithTradabilityRequest(contract_id, affiliate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesContractWithTradabilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesContractWithTradabilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.GetFuturesContractWithTradabilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesContractWithTradabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                return value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED ? size + Affiliate.ADAPTER.encodedSizeWithTag(2, value.getAffiliate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesContractWithTradabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesContractWithTradabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractWithTradabilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Affiliate affiliateDecode = Affiliate.AFFILIATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFuturesContractWithTradabilityRequest(strDecode, affiliateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            affiliateDecode = Affiliate.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractWithTradabilityRequest redact(GetFuturesContractWithTradabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFuturesContractWithTradabilityRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
