package billy_mays.service.p023v1;

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

/* compiled from: GetGoldEarningsFeaturesResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JJ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponse;", "Lcom/squareup/wire/Message;", "", "gold_sweep_interest_earnings_rate", "Lbilly_mays/service/v1/GoldEarningsFeature;", "gold_deposit_boost_earnings_rate", "has_boosted_apy", "", "boosted_rate_information", "Lbilly_mays/service/v1/BoostedRateInformation;", "deposit_boost_information", "Lbilly_mays/service/v1/DepositBoostInformation;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbilly_mays/service/v1/GoldEarningsFeature;Lbilly_mays/service/v1/GoldEarningsFeature;ZLbilly_mays/service/v1/BoostedRateInformation;Lbilly_mays/service/v1/DepositBoostInformation;Lokio/ByteString;)V", "getGold_sweep_interest_earnings_rate", "()Lbilly_mays/service/v1/GoldEarningsFeature;", "getGold_deposit_boost_earnings_rate", "getHas_boosted_apy", "()Z", "getBoosted_rate_information", "()Lbilly_mays/service/v1/BoostedRateInformation;", "getDeposit_boost_information", "()Lbilly_mays/service/v1/DepositBoostInformation;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetGoldEarningsFeaturesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetGoldEarningsFeaturesResponse> ADAPTER;

    @WireField(adapter = "billy_mays.service.v1.BoostedRateInformation#ADAPTER", jsonName = "boostedRateInformation", schemaIndex = 3, tag = 4)
    private final BoostedRateInformation boosted_rate_information;

    @WireField(adapter = "billy_mays.service.v1.DepositBoostInformation#ADAPTER", jsonName = "depositBoostInformation", schemaIndex = 4, tag = 5)
    private final DepositBoostInformation deposit_boost_information;

    @WireField(adapter = "billy_mays.service.v1.GoldEarningsFeature#ADAPTER", jsonName = "goldDepositBoostEarningsRate", schemaIndex = 1, tag = 2)
    private final GoldEarningsFeature gold_deposit_boost_earnings_rate;

    @WireField(adapter = "billy_mays.service.v1.GoldEarningsFeature#ADAPTER", jsonName = "goldSweepInterestEarningsRate", schemaIndex = 0, tag = 1)
    private final GoldEarningsFeature gold_sweep_interest_earnings_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasBoostedApy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean has_boosted_apy;

    public GetGoldEarningsFeaturesResponse() {
        this(null, null, false, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8547newBuilder();
    }

    public final GoldEarningsFeature getGold_sweep_interest_earnings_rate() {
        return this.gold_sweep_interest_earnings_rate;
    }

    public final GoldEarningsFeature getGold_deposit_boost_earnings_rate() {
        return this.gold_deposit_boost_earnings_rate;
    }

    public final boolean getHas_boosted_apy() {
        return this.has_boosted_apy;
    }

    public final BoostedRateInformation getBoosted_rate_information() {
        return this.boosted_rate_information;
    }

    public final DepositBoostInformation getDeposit_boost_information() {
        return this.deposit_boost_information;
    }

    public /* synthetic */ GetGoldEarningsFeaturesResponse(GoldEarningsFeature goldEarningsFeature, GoldEarningsFeature goldEarningsFeature2, boolean z, BoostedRateInformation boostedRateInformation, DepositBoostInformation depositBoostInformation, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldEarningsFeature, (i & 2) != 0 ? null : goldEarningsFeature2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : boostedRateInformation, (i & 16) != 0 ? null : depositBoostInformation, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGoldEarningsFeaturesResponse(GoldEarningsFeature goldEarningsFeature, GoldEarningsFeature goldEarningsFeature2, boolean z, BoostedRateInformation boostedRateInformation, DepositBoostInformation depositBoostInformation, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.gold_sweep_interest_earnings_rate = goldEarningsFeature;
        this.gold_deposit_boost_earnings_rate = goldEarningsFeature2;
        this.has_boosted_apy = z;
        this.boosted_rate_information = boostedRateInformation;
        this.deposit_boost_information = depositBoostInformation;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8547newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetGoldEarningsFeaturesResponse)) {
            return false;
        }
        GetGoldEarningsFeaturesResponse getGoldEarningsFeaturesResponse = (GetGoldEarningsFeaturesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getGoldEarningsFeaturesResponse.unknownFields()) && Intrinsics.areEqual(this.gold_sweep_interest_earnings_rate, getGoldEarningsFeaturesResponse.gold_sweep_interest_earnings_rate) && Intrinsics.areEqual(this.gold_deposit_boost_earnings_rate, getGoldEarningsFeaturesResponse.gold_deposit_boost_earnings_rate) && this.has_boosted_apy == getGoldEarningsFeaturesResponse.has_boosted_apy && Intrinsics.areEqual(this.boosted_rate_information, getGoldEarningsFeaturesResponse.boosted_rate_information) && Intrinsics.areEqual(this.deposit_boost_information, getGoldEarningsFeaturesResponse.deposit_boost_information);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GoldEarningsFeature goldEarningsFeature = this.gold_sweep_interest_earnings_rate;
        int iHashCode2 = (iHashCode + (goldEarningsFeature != null ? goldEarningsFeature.hashCode() : 0)) * 37;
        GoldEarningsFeature goldEarningsFeature2 = this.gold_deposit_boost_earnings_rate;
        int iHashCode3 = (((iHashCode2 + (goldEarningsFeature2 != null ? goldEarningsFeature2.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_boosted_apy)) * 37;
        BoostedRateInformation boostedRateInformation = this.boosted_rate_information;
        int iHashCode4 = (iHashCode3 + (boostedRateInformation != null ? boostedRateInformation.hashCode() : 0)) * 37;
        DepositBoostInformation depositBoostInformation = this.deposit_boost_information;
        int iHashCode5 = iHashCode4 + (depositBoostInformation != null ? depositBoostInformation.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GoldEarningsFeature goldEarningsFeature = this.gold_sweep_interest_earnings_rate;
        if (goldEarningsFeature != null) {
            arrayList.add("gold_sweep_interest_earnings_rate=" + goldEarningsFeature);
        }
        GoldEarningsFeature goldEarningsFeature2 = this.gold_deposit_boost_earnings_rate;
        if (goldEarningsFeature2 != null) {
            arrayList.add("gold_deposit_boost_earnings_rate=" + goldEarningsFeature2);
        }
        arrayList.add("has_boosted_apy=" + this.has_boosted_apy);
        BoostedRateInformation boostedRateInformation = this.boosted_rate_information;
        if (boostedRateInformation != null) {
            arrayList.add("boosted_rate_information=" + boostedRateInformation);
        }
        DepositBoostInformation depositBoostInformation = this.deposit_boost_information;
        if (depositBoostInformation != null) {
            arrayList.add("deposit_boost_information=" + depositBoostInformation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetGoldEarningsFeaturesResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetGoldEarningsFeaturesResponse copy$default(GetGoldEarningsFeaturesResponse getGoldEarningsFeaturesResponse, GoldEarningsFeature goldEarningsFeature, GoldEarningsFeature goldEarningsFeature2, boolean z, BoostedRateInformation boostedRateInformation, DepositBoostInformation depositBoostInformation, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            goldEarningsFeature = getGoldEarningsFeaturesResponse.gold_sweep_interest_earnings_rate;
        }
        if ((i & 2) != 0) {
            goldEarningsFeature2 = getGoldEarningsFeaturesResponse.gold_deposit_boost_earnings_rate;
        }
        if ((i & 4) != 0) {
            z = getGoldEarningsFeaturesResponse.has_boosted_apy;
        }
        if ((i & 8) != 0) {
            boostedRateInformation = getGoldEarningsFeaturesResponse.boosted_rate_information;
        }
        if ((i & 16) != 0) {
            depositBoostInformation = getGoldEarningsFeaturesResponse.deposit_boost_information;
        }
        if ((i & 32) != 0) {
            byteString = getGoldEarningsFeaturesResponse.unknownFields();
        }
        DepositBoostInformation depositBoostInformation2 = depositBoostInformation;
        ByteString byteString2 = byteString;
        return getGoldEarningsFeaturesResponse.copy(goldEarningsFeature, goldEarningsFeature2, z, boostedRateInformation, depositBoostInformation2, byteString2);
    }

    public final GetGoldEarningsFeaturesResponse copy(GoldEarningsFeature gold_sweep_interest_earnings_rate, GoldEarningsFeature gold_deposit_boost_earnings_rate, boolean has_boosted_apy, BoostedRateInformation boosted_rate_information, DepositBoostInformation deposit_boost_information, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetGoldEarningsFeaturesResponse(gold_sweep_interest_earnings_rate, gold_deposit_boost_earnings_rate, has_boosted_apy, boosted_rate_information, deposit_boost_information, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetGoldEarningsFeaturesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetGoldEarningsFeaturesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: billy_mays.service.v1.GetGoldEarningsFeaturesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetGoldEarningsFeaturesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<GoldEarningsFeature> protoAdapter = GoldEarningsFeature.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getGold_sweep_interest_earnings_rate()) + protoAdapter.encodedSizeWithTag(2, value.getGold_deposit_boost_earnings_rate());
                if (value.getHas_boosted_apy()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getHas_boosted_apy()));
                }
                return iEncodedSizeWithTag + BoostedRateInformation.ADAPTER.encodedSizeWithTag(4, value.getBoosted_rate_information()) + DepositBoostInformation.ADAPTER.encodedSizeWithTag(5, value.getDeposit_boost_information());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetGoldEarningsFeaturesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<GoldEarningsFeature> protoAdapter = GoldEarningsFeature.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getGold_sweep_interest_earnings_rate());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getGold_deposit_boost_earnings_rate());
                if (value.getHas_boosted_apy()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_boosted_apy()));
                }
                BoostedRateInformation.ADAPTER.encodeWithTag(writer, 4, (int) value.getBoosted_rate_information());
                DepositBoostInformation.ADAPTER.encodeWithTag(writer, 5, (int) value.getDeposit_boost_information());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetGoldEarningsFeaturesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DepositBoostInformation.ADAPTER.encodeWithTag(writer, 5, (int) value.getDeposit_boost_information());
                BoostedRateInformation.ADAPTER.encodeWithTag(writer, 4, (int) value.getBoosted_rate_information());
                if (value.getHas_boosted_apy()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_boosted_apy()));
                }
                ProtoAdapter<GoldEarningsFeature> protoAdapter = GoldEarningsFeature.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getGold_deposit_boost_earnings_rate());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getGold_sweep_interest_earnings_rate());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetGoldEarningsFeaturesResponse redact(GetGoldEarningsFeaturesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldEarningsFeature gold_sweep_interest_earnings_rate = value.getGold_sweep_interest_earnings_rate();
                GoldEarningsFeature goldEarningsFeatureRedact = gold_sweep_interest_earnings_rate != null ? GoldEarningsFeature.ADAPTER.redact(gold_sweep_interest_earnings_rate) : null;
                GoldEarningsFeature gold_deposit_boost_earnings_rate = value.getGold_deposit_boost_earnings_rate();
                GoldEarningsFeature goldEarningsFeatureRedact2 = gold_deposit_boost_earnings_rate != null ? GoldEarningsFeature.ADAPTER.redact(gold_deposit_boost_earnings_rate) : null;
                BoostedRateInformation boosted_rate_information = value.getBoosted_rate_information();
                BoostedRateInformation boostedRateInformationRedact = boosted_rate_information != null ? BoostedRateInformation.ADAPTER.redact(boosted_rate_information) : null;
                DepositBoostInformation deposit_boost_information = value.getDeposit_boost_information();
                return GetGoldEarningsFeaturesResponse.copy$default(value, goldEarningsFeatureRedact, goldEarningsFeatureRedact2, false, boostedRateInformationRedact, deposit_boost_information != null ? DepositBoostInformation.ADAPTER.redact(deposit_boost_information) : null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetGoldEarningsFeaturesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GoldEarningsFeature goldEarningsFeatureDecode = null;
                BoostedRateInformation boostedRateInformationDecode = null;
                DepositBoostInformation depositBoostInformationDecode = null;
                boolean zBooleanValue = false;
                GoldEarningsFeature goldEarningsFeatureDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetGoldEarningsFeaturesResponse(goldEarningsFeatureDecode, goldEarningsFeatureDecode2, zBooleanValue, boostedRateInformationDecode, depositBoostInformationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        goldEarningsFeatureDecode = GoldEarningsFeature.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        goldEarningsFeatureDecode2 = GoldEarningsFeature.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        boostedRateInformationDecode = BoostedRateInformation.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        depositBoostInformationDecode = DepositBoostInformation.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
