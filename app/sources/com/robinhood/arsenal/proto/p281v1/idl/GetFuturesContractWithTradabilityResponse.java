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

/* compiled from: GetFuturesContractWithTradabilityResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponse;", "Lcom/squareup/wire/Message;", "", "contract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "affiliate", "Lcom/robinhood/rosetta/i18n/Affiliate;", "tradability_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;Lcom/robinhood/rosetta/i18n/Affiliate;Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;Lokio/ByteString;)V", "getContract", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/Affiliate;", "getTradability_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GetFuturesContractWithTradabilityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesContractWithTradabilityResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Affiliate#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Affiliate affiliate;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesContract#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesContract contract;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.TradabilityInfo#ADAPTER", jsonName = "tradabilityInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TradabilityInfo tradability_info;

    public GetFuturesContractWithTradabilityResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20161newBuilder();
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final Affiliate getAffiliate() {
        return this.affiliate;
    }

    public /* synthetic */ GetFuturesContractWithTradabilityResponse(FuturesContract futuresContract, Affiliate affiliate, TradabilityInfo tradabilityInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresContract, (i & 2) != 0 ? Affiliate.AFFILIATE_UNSPECIFIED : affiliate, (i & 4) != 0 ? null : tradabilityInfo, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TradabilityInfo getTradability_info() {
        return this.tradability_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesContractWithTradabilityResponse(FuturesContract futuresContract, Affiliate affiliate, TradabilityInfo tradabilityInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract = futuresContract;
        this.affiliate = affiliate;
        this.tradability_info = tradabilityInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20161newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesContractWithTradabilityResponse)) {
            return false;
        }
        GetFuturesContractWithTradabilityResponse getFuturesContractWithTradabilityResponse = (GetFuturesContractWithTradabilityResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesContractWithTradabilityResponse.unknownFields()) && Intrinsics.areEqual(this.contract, getFuturesContractWithTradabilityResponse.contract) && this.affiliate == getFuturesContractWithTradabilityResponse.affiliate && Intrinsics.areEqual(this.tradability_info, getFuturesContractWithTradabilityResponse.tradability_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FuturesContract futuresContract = this.contract;
        int iHashCode2 = (((iHashCode + (futuresContract != null ? futuresContract.hashCode() : 0)) * 37) + this.affiliate.hashCode()) * 37;
        TradabilityInfo tradabilityInfo = this.tradability_info;
        int iHashCode3 = iHashCode2 + (tradabilityInfo != null ? tradabilityInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FuturesContract futuresContract = this.contract;
        if (futuresContract != null) {
            arrayList.add("contract=" + futuresContract);
        }
        arrayList.add("affiliate=" + this.affiliate);
        TradabilityInfo tradabilityInfo = this.tradability_info;
        if (tradabilityInfo != null) {
            arrayList.add("tradability_info=" + tradabilityInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesContractWithTradabilityResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFuturesContractWithTradabilityResponse copy$default(GetFuturesContractWithTradabilityResponse getFuturesContractWithTradabilityResponse, FuturesContract futuresContract, Affiliate affiliate, TradabilityInfo tradabilityInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresContract = getFuturesContractWithTradabilityResponse.contract;
        }
        if ((i & 2) != 0) {
            affiliate = getFuturesContractWithTradabilityResponse.affiliate;
        }
        if ((i & 4) != 0) {
            tradabilityInfo = getFuturesContractWithTradabilityResponse.tradability_info;
        }
        if ((i & 8) != 0) {
            byteString = getFuturesContractWithTradabilityResponse.unknownFields();
        }
        return getFuturesContractWithTradabilityResponse.copy(futuresContract, affiliate, tradabilityInfo, byteString);
    }

    public final GetFuturesContractWithTradabilityResponse copy(FuturesContract contract, Affiliate affiliate, TradabilityInfo tradability_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesContractWithTradabilityResponse(contract, affiliate, tradability_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesContractWithTradabilityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesContractWithTradabilityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.GetFuturesContractWithTradabilityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesContractWithTradabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContract() != null) {
                    size += FuturesContract.ADAPTER.encodedSizeWithTag(1, value.getContract());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    size += Affiliate.ADAPTER.encodedSizeWithTag(2, value.getAffiliate());
                }
                return value.getTradability_info() != null ? size + TradabilityInfo.ADAPTER.encodedSizeWithTag(3, value.getTradability_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesContractWithTradabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContract() != null) {
                    FuturesContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                if (value.getTradability_info() != null) {
                    TradabilityInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getTradability_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesContractWithTradabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTradability_info() != null) {
                    TradabilityInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getTradability_info());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                if (value.getContract() != null) {
                    FuturesContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractWithTradabilityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Affiliate affiliateDecode = Affiliate.AFFILIATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesContract futuresContractDecode = null;
                TradabilityInfo tradabilityInfoDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFuturesContractWithTradabilityResponse(futuresContractDecode, affiliateDecode, tradabilityInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        futuresContractDecode = FuturesContract.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            affiliateDecode = Affiliate.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        tradabilityInfoDecode = TradabilityInfo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractWithTradabilityResponse redact(GetFuturesContractWithTradabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesContract contract = value.getContract();
                FuturesContract futuresContractRedact = contract != null ? FuturesContract.ADAPTER.redact(contract) : null;
                TradabilityInfo tradability_info = value.getTradability_info();
                return GetFuturesContractWithTradabilityResponse.copy$default(value, futuresContractRedact, null, tradability_info != null ? TradabilityInfo.ADAPTER.redact(tradability_info) : null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
