package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.CurrencyType;
import rosetta.mainst.InstrumentState;

/* compiled from: CurrencyDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R-\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"com/robinhood/rosetta/mainst/CurrencyDetails$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "crypto_metadataAdapter", "", "", "getCrypto_metadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "crypto_metadataAdapter$delegate", "Lkotlin/Lazy;", "state_by_regionAdapter", "Lrosetta/mainst/InstrumentState;", "getState_by_regionAdapter", "state_by_regionAdapter$delegate", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.mainst.CurrencyDetails$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class CurrencyDetails2 extends ProtoAdapter<CurrencyDetails> {

    /* renamed from: crypto_metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy crypto_metadataAdapter;

    /* renamed from: state_by_regionAdapter$delegate, reason: from kotlin metadata */
    private final Lazy state_by_regionAdapter;

    CurrencyDetails2(FieldEncoding fieldEncoding, KClass<CurrencyDetails> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.mainst.CurrencyDetails", syntax, (Object) null, "rosetta/rosetta/mainst/mainst.proto");
        this.crypto_metadataAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyDetails2.crypto_metadataAdapter_delegate$lambda$0();
            }
        });
        this.state_by_regionAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyDetails2.state_by_regionAdapter_delegate$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter crypto_metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getCrypto_metadataAdapter() {
        return (ProtoAdapter) this.crypto_metadataAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, InstrumentState>> getState_by_regionAdapter() {
        return (ProtoAdapter) this.state_by_regionAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter state_by_regionAdapter_delegate$lambda$1() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, InstrumentState.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(CurrencyDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getCode(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCode());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
        }
        if (!Intrinsics.areEqual(value.getBrand_color(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBrand_color());
        }
        if (value.getCurrency_type() != CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
            size += CurrencyType.ADAPTER.encodedSizeWithTag(4, value.getCurrency_type());
        }
        if (value.getIncrement() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getIncrement());
        }
        int iEncodedSizeWithTag = size + getCrypto_metadataAdapter().encodedSizeWithTag(6, value.getCrypto_metadata());
        if (value.getCreated_at() != null) {
            iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(7, value.getCreated_at());
        }
        if (value.getUpdated_at() != null) {
            iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(8, value.getUpdated_at());
        }
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            iEncodedSizeWithTag += InstrumentState.ADAPTER.encodedSizeWithTag(9, value.getState());
        }
        return iEncodedSizeWithTag + getState_by_regionAdapter().encodedSizeWithTag(10, value.getState_by_region());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, CurrencyDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getCode(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCode());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (!Intrinsics.areEqual(value.getBrand_color(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBrand_color());
        }
        if (value.getCurrency_type() != CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
            CurrencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency_type());
        }
        if (value.getIncrement() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getIncrement());
        }
        getCrypto_metadataAdapter().encodeWithTag(writer, 6, (int) value.getCrypto_metadata());
        if (value.getCreated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getCreated_at());
        }
        if (value.getUpdated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpdated_at());
        }
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            InstrumentState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        getState_by_regionAdapter().encodeWithTag(writer, 10, (int) value.getState_by_region());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, CurrencyDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getState_by_regionAdapter().encodeWithTag(writer, 10, (int) value.getState_by_region());
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            InstrumentState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        if (value.getUpdated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpdated_at());
        }
        if (value.getCreated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getCreated_at());
        }
        getCrypto_metadataAdapter().encodeWithTag(writer, 6, (int) value.getCrypto_metadata());
        if (value.getIncrement() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getIncrement());
        }
        if (value.getCurrency_type() != CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
            CurrencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency_type());
        }
        if (!Intrinsics.areEqual(value.getBrand_color(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBrand_color());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (Intrinsics.areEqual(value.getCode(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCode());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public CurrencyDetails decode(ProtoReader reader) throws IOException {
        InstrumentState instrumentState;
        String str;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(reader, "reader");
        CurrencyType currencyType = CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InstrumentState instrumentState2 = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = strDecode;
        Decimal decimalDecode = null;
        Time timeDecode = null;
        Time timeDecode2 = null;
        InstrumentState instrumentStateDecode = instrumentState2;
        String strDecode3 = strDecode2;
        CurrencyType currencyTypeDecode = currencyType;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        linkedHashMap = linkedHashMap2;
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        linkedHashMap = linkedHashMap2;
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        linkedHashMap = linkedHashMap2;
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        instrumentState = instrumentStateDecode;
                        str = strDecode3;
                        try {
                            currencyTypeDecode = CurrencyType.ADAPTER.decode(reader);
                            linkedHashMap = linkedHashMap2;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            linkedHashMap = linkedHashMap2;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                        strDecode3 = str;
                        instrumentStateDecode = instrumentState;
                        break;
                    case 5:
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 6:
                        instrumentState = instrumentStateDecode;
                        str = strDecode3;
                        linkedHashMap2.putAll(getCrypto_metadataAdapter().decode(reader));
                        linkedHashMap = linkedHashMap2;
                        strDecode3 = str;
                        instrumentStateDecode = instrumentState;
                        break;
                    case 7:
                        timeDecode = Time.ADAPTER.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 8:
                        timeDecode2 = Time.ADAPTER.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 9:
                        try {
                            instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                            linkedHashMap = linkedHashMap2;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            instrumentState = instrumentStateDecode;
                            str = strDecode3;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    case 10:
                        linkedHashMap3.putAll(getState_by_regionAdapter().decode(reader));
                        instrumentState = instrumentStateDecode;
                        str = strDecode3;
                        linkedHashMap = linkedHashMap2;
                        strDecode3 = str;
                        instrumentStateDecode = instrumentState;
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        instrumentState = instrumentStateDecode;
                        str = strDecode3;
                        linkedHashMap = linkedHashMap2;
                        strDecode3 = str;
                        instrumentStateDecode = instrumentState;
                        break;
                }
                linkedHashMap2 = linkedHashMap;
            } else {
                return new CurrencyDetails(strDecode3, strDecode, strDecode2, currencyTypeDecode, decimalDecode, linkedHashMap2, timeDecode, timeDecode2, instrumentStateDecode, linkedHashMap3, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CurrencyDetails redact(CurrencyDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Decimal increment = value.getIncrement();
        Decimal decimalRedact = increment != null ? Decimal.ADAPTER.redact(increment) : null;
        Time created_at = value.getCreated_at();
        Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
        Time updated_at = value.getUpdated_at();
        return CurrencyDetails.copy$default(value, null, null, null, null, decimalRedact, null, timeRedact, updated_at != null ? Time.ADAPTER.redact(updated_at) : null, null, null, ByteString.EMPTY, 815, null);
    }
}
