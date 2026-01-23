package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import rosetta.mainst.InstrumentType;

/* compiled from: InstrumentInfoV2.kt */
@kotlin.Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JV\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "type", "Lrosetta/mainst/InstrumentType;", "equity_details", "Lcom/robinhood/rosetta/mainst/EquityDetails;", "option_details", "Lcom/robinhood/rosetta/mainst/OptionDetails;", "currency_details", "Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/InstrumentType;Lcom/robinhood/rosetta/mainst/EquityDetails;Lcom/robinhood/rosetta/mainst/OptionDetails;Lcom/robinhood/rosetta/mainst/CurrencyDetails;Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getType", "()Lrosetta/mainst/InstrumentType;", "getEquity_details", "()Lcom/robinhood/rosetta/mainst/EquityDetails;", "getOption_details", "()Lcom/robinhood/rosetta/mainst/OptionDetails;", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class InstrumentInfoV2 extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentInfoV2> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.CurrencyDetails#ADAPTER", jsonName = "currencyDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 4, tag = 5)
    private final CurrencyDetails currency_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.CurrencyPairDetails#ADAPTER", jsonName = "currencyPairDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 5, tag = 6)
    private final CurrencyPairDetails currency_pair_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.EquityDetails#ADAPTER", jsonName = "equityDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 2, tag = 3)
    private final EquityDetails equity_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OptionDetails#ADAPTER", jsonName = "optionDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 3, tag = 4)
    private final OptionDetails option_details;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InstrumentType type;

    public InstrumentInfoV2() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24668newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final InstrumentType getType() {
        return this.type;
    }

    public /* synthetic */ InstrumentInfoV2(UUID uuid, InstrumentType instrumentType, EquityDetails equityDetails, OptionDetails optionDetails, CurrencyDetails currencyDetails, CurrencyPairDetails currencyPairDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 4) != 0 ? null : equityDetails, (i & 8) != 0 ? null : optionDetails, (i & 16) != 0 ? null : currencyDetails, (i & 32) != 0 ? null : currencyPairDetails, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EquityDetails getEquity_details() {
        return this.equity_details;
    }

    public final OptionDetails getOption_details() {
        return this.option_details;
    }

    public final CurrencyDetails getCurrency_details() {
        return this.currency_details;
    }

    public final CurrencyPairDetails getCurrency_pair_details() {
        return this.currency_pair_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentInfoV2(UUID uuid, InstrumentType type2, EquityDetails equityDetails, OptionDetails optionDetails, CurrencyDetails currencyDetails, CurrencyPairDetails currencyPairDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.type = type2;
        this.equity_details = equityDetails;
        this.option_details = optionDetails;
        this.currency_details = currencyDetails;
        this.currency_pair_details = currencyPairDetails;
        if (Internal.countNonNull(equityDetails, optionDetails, currencyDetails, currencyPairDetails, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of equity_details, option_details, currency_details, currency_pair_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24668newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentInfoV2)) {
            return false;
        }
        InstrumentInfoV2 instrumentInfoV2 = (InstrumentInfoV2) other;
        return Intrinsics.areEqual(unknownFields(), instrumentInfoV2.unknownFields()) && Intrinsics.areEqual(this.id, instrumentInfoV2.id) && this.type == instrumentInfoV2.type && Intrinsics.areEqual(this.equity_details, instrumentInfoV2.equity_details) && Intrinsics.areEqual(this.option_details, instrumentInfoV2.option_details) && Intrinsics.areEqual(this.currency_details, instrumentInfoV2.currency_details) && Intrinsics.areEqual(this.currency_pair_details, instrumentInfoV2.currency_pair_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.type.hashCode()) * 37;
        EquityDetails equityDetails = this.equity_details;
        int iHashCode3 = (iHashCode2 + (equityDetails != null ? equityDetails.hashCode() : 0)) * 37;
        OptionDetails optionDetails = this.option_details;
        int iHashCode4 = (iHashCode3 + (optionDetails != null ? optionDetails.hashCode() : 0)) * 37;
        CurrencyDetails currencyDetails = this.currency_details;
        int iHashCode5 = (iHashCode4 + (currencyDetails != null ? currencyDetails.hashCode() : 0)) * 37;
        CurrencyPairDetails currencyPairDetails = this.currency_pair_details;
        int iHashCode6 = iHashCode5 + (currencyPairDetails != null ? currencyPairDetails.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        arrayList.add("type=" + this.type);
        EquityDetails equityDetails = this.equity_details;
        if (equityDetails != null) {
            arrayList.add("equity_details=" + equityDetails);
        }
        OptionDetails optionDetails = this.option_details;
        if (optionDetails != null) {
            arrayList.add("option_details=" + optionDetails);
        }
        CurrencyDetails currencyDetails = this.currency_details;
        if (currencyDetails != null) {
            arrayList.add("currency_details=" + currencyDetails);
        }
        CurrencyPairDetails currencyPairDetails = this.currency_pair_details;
        if (currencyPairDetails != null) {
            arrayList.add("currency_pair_details=" + currencyPairDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentInfoV2{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InstrumentInfoV2 copy$default(InstrumentInfoV2 instrumentInfoV2, UUID uuid, InstrumentType instrumentType, EquityDetails equityDetails, OptionDetails optionDetails, CurrencyDetails currencyDetails, CurrencyPairDetails currencyPairDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = instrumentInfoV2.id;
        }
        if ((i & 2) != 0) {
            instrumentType = instrumentInfoV2.type;
        }
        if ((i & 4) != 0) {
            equityDetails = instrumentInfoV2.equity_details;
        }
        if ((i & 8) != 0) {
            optionDetails = instrumentInfoV2.option_details;
        }
        if ((i & 16) != 0) {
            currencyDetails = instrumentInfoV2.currency_details;
        }
        if ((i & 32) != 0) {
            currencyPairDetails = instrumentInfoV2.currency_pair_details;
        }
        if ((i & 64) != 0) {
            byteString = instrumentInfoV2.unknownFields();
        }
        CurrencyPairDetails currencyPairDetails2 = currencyPairDetails;
        ByteString byteString2 = byteString;
        CurrencyDetails currencyDetails2 = currencyDetails;
        EquityDetails equityDetails2 = equityDetails;
        return instrumentInfoV2.copy(uuid, instrumentType, equityDetails2, optionDetails, currencyDetails2, currencyPairDetails2, byteString2);
    }

    public final InstrumentInfoV2 copy(UUID id, InstrumentType type2, EquityDetails equity_details, OptionDetails option_details, CurrencyDetails currency_details, CurrencyPairDetails currency_pair_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentInfoV2(id, type2, equity_details, option_details, currency_details, currency_pair_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentInfoV2.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentInfoV2>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.InstrumentInfoV2$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentInfoV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                return size + EquityDetails.ADAPTER.encodedSizeWithTag(3, value.getEquity_details()) + OptionDetails.ADAPTER.encodedSizeWithTag(4, value.getOption_details()) + CurrencyDetails.ADAPTER.encodedSizeWithTag(5, value.getCurrency_details()) + CurrencyPairDetails.ADAPTER.encodedSizeWithTag(6, value.getCurrency_pair_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentInfoV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                EquityDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_details());
                OptionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getOption_details());
                CurrencyDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_details());
                CurrencyPairDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getCurrency_pair_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentInfoV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CurrencyPairDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getCurrency_pair_details());
                CurrencyDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_details());
                OptionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getOption_details());
                EquityDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_details());
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentInfoV2 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentTypeDecode = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                UUID uuidDecode = null;
                EquityDetails equityDetailsDecode = null;
                OptionDetails optionDetailsDecode = null;
                CurrencyDetails currencyDetailsDecode = null;
                CurrencyPairDetails currencyPairDetailsDecode = null;
                while (true) {
                    InstrumentType instrumentType = instrumentTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    uuidDecode = UUID.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    equityDetailsDecode = EquityDetails.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    optionDetailsDecode = OptionDetails.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    currencyDetailsDecode = CurrencyDetails.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    currencyPairDetailsDecode = CurrencyPairDetails.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new InstrumentInfoV2(uuidDecode, instrumentType, equityDetailsDecode, optionDetailsDecode, currencyDetailsDecode, currencyPairDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentInfoV2 redact(InstrumentInfoV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                EquityDetails equity_details = value.getEquity_details();
                EquityDetails equityDetailsRedact = equity_details != null ? EquityDetails.ADAPTER.redact(equity_details) : null;
                OptionDetails option_details = value.getOption_details();
                OptionDetails optionDetailsRedact = option_details != null ? OptionDetails.ADAPTER.redact(option_details) : null;
                CurrencyDetails currency_details = value.getCurrency_details();
                CurrencyDetails currencyDetailsRedact = currency_details != null ? CurrencyDetails.ADAPTER.redact(currency_details) : null;
                CurrencyPairDetails currency_pair_details = value.getCurrency_pair_details();
                return InstrumentInfoV2.copy$default(value, uuidRedact, null, equityDetailsRedact, optionDetailsRedact, currencyDetailsRedact, currency_pair_details != null ? CurrencyPairDetails.ADAPTER.redact(currency_pair_details) : null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
