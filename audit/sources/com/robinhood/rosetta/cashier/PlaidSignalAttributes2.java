package com.robinhood.rosetta.cashier;

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
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PlaidSignalAttributes.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/rosetta/cashier/PlaidSignalAttributes$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "core_attributesAdapter", "", "", "getCore_attributesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "core_attributesAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.cashier.PlaidSignalAttributes$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class PlaidSignalAttributes2 extends ProtoAdapter<PlaidSignalAttributes> {

    /* renamed from: core_attributesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy core_attributesAdapter;

    PlaidSignalAttributes2(FieldEncoding fieldEncoding, KClass<PlaidSignalAttributes> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.cashier.PlaidSignalAttributes", syntax, (Object) null, "rosetta/rosetta/cashier/activity.proto");
        this.core_attributesAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidSignalAttributes$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSignalAttributes2.core_attributesAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter core_attributesAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getCore_attributesAdapter() {
        return (ProtoAdapter) this.core_attributesAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(PlaidSignalAttributes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getBank_initiated_return_risk_score() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getBank_initiated_return_risk_score()));
        }
        if (value.getBank_initiated_return_risk_tier() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getBank_initiated_return_risk_tier()));
        }
        if (value.getCustomer_initiated_return_risk_score() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCustomer_initiated_return_risk_score()));
        }
        if (value.getCustomer_initiated_return_risk_tier() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getCustomer_initiated_return_risk_tier()));
        }
        return size + getCore_attributesAdapter().encodedSizeWithTag(5, value.getCore_attributes());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PlaidSignalAttributes value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getBank_initiated_return_risk_score() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getBank_initiated_return_risk_score()));
        }
        if (value.getBank_initiated_return_risk_tier() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBank_initiated_return_risk_tier()));
        }
        if (value.getCustomer_initiated_return_risk_score() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCustomer_initiated_return_risk_score()));
        }
        if (value.getCustomer_initiated_return_risk_tier() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCustomer_initiated_return_risk_tier()));
        }
        getCore_attributesAdapter().encodeWithTag(writer, 5, (int) value.getCore_attributes());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PlaidSignalAttributes value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getCore_attributesAdapter().encodeWithTag(writer, 5, (int) value.getCore_attributes());
        if (value.getCustomer_initiated_return_risk_tier() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCustomer_initiated_return_risk_tier()));
        }
        if (value.getCustomer_initiated_return_risk_score() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCustomer_initiated_return_risk_score()));
        }
        if (value.getBank_initiated_return_risk_tier() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBank_initiated_return_risk_tier()));
        }
        if (value.getBank_initiated_return_risk_score() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getBank_initiated_return_risk_score()));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public PlaidSignalAttributes decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new PlaidSignalAttributes(iIntValue, iIntValue2, iIntValue3, iIntValue4, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
            } else if (iNextTag == 2) {
                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
            } else if (iNextTag == 3) {
                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
            } else if (iNextTag == 4) {
                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
            } else if (iNextTag == 5) {
                linkedHashMap.putAll(getCore_attributesAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PlaidSignalAttributes redact(PlaidSignalAttributes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return PlaidSignalAttributes.copy$default(value, 0, 0, 0, 0, null, ByteString.EMPTY, 31, null);
    }
}
