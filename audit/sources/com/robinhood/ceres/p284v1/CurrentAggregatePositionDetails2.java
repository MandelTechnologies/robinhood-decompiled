package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
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

/* compiled from: CurrentAggregatePositionDetails.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"com/robinhood/ceres/v1/CurrentAggregatePositionDetails$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetails;", "contract_id_to_position_details_mapAdapter", "", "", "Lcom/robinhood/ceres/v1/PositionDetails;", "getContract_id_to_position_details_mapAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "contract_id_to_position_details_mapAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.ceres.v1.CurrentAggregatePositionDetails$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes15.dex */
public final class CurrentAggregatePositionDetails2 extends ProtoAdapter<CurrentAggregatePositionDetails> {

    /* renamed from: contract_id_to_position_details_mapAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_position_details_mapAdapter;

    CurrentAggregatePositionDetails2(FieldEncoding fieldEncoding, KClass<CurrentAggregatePositionDetails> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/ceres.service.CurrentAggregatePositionDetails", syntax, (Object) null, "ceres/ceres/proto/v1/stream.proto");
        this.contract_id_to_position_details_mapAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CurrentAggregatePositionDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrentAggregatePositionDetails2.contract_id_to_position_details_mapAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_position_details_mapAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, PositionDetails.ADAPTER);
    }

    private final ProtoAdapter<Map<String, PositionDetails>> getContract_id_to_position_details_mapAdapter() {
        return (ProtoAdapter) this.contract_id_to_position_details_mapAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(CurrentAggregatePositionDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.unknownFields().size() + getContract_id_to_position_details_mapAdapter().encodedSizeWithTag(1, value.getContract_id_to_position_details_map()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getClosed_contract_id());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, CurrentAggregatePositionDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        getContract_id_to_position_details_mapAdapter().encodeWithTag(writer, 1, (int) value.getContract_id_to_position_details_map());
        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClosed_contract_id());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, CurrentAggregatePositionDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClosed_contract_id());
        getContract_id_to_position_details_mapAdapter().encodeWithTag(writer, 1, (int) value.getContract_id_to_position_details_map());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public CurrentAggregatePositionDetails decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new CurrentAggregatePositionDetails(linkedHashMap, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                linkedHashMap.putAll(getContract_id_to_position_details_mapAdapter().decode(reader));
            } else if (iNextTag == 2) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CurrentAggregatePositionDetails redact(CurrentAggregatePositionDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CurrentAggregatePositionDetails.copy$default(value, Internal.m26824redactElements(value.getContract_id_to_position_details_map(), PositionDetails.ADAPTER), null, ByteString.EMPTY, 2, null);
    }
}
