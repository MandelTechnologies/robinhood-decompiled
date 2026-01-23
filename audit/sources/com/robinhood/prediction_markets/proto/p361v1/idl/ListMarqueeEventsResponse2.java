package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: ListMarqueeEventsResponse.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"com/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponse;", "nav_id_to_marquee_eventsAdapter", "", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/MarqueeEventsList;", "getNav_id_to_marquee_eventsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "nav_id_to_marquee_eventsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ListMarqueeEventsResponse$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class ListMarqueeEventsResponse2 extends ProtoAdapter<ListMarqueeEventsResponse> {

    /* renamed from: nav_id_to_marquee_eventsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy nav_id_to_marquee_eventsAdapter;

    ListMarqueeEventsResponse2(FieldEncoding fieldEncoding, KClass<ListMarqueeEventsResponse> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/prediction_markets.v1.ListMarqueeEventsResponse", syntax, (Object) null, "prediction-markets/prediction_markets/proto/v1/public/service.proto");
        this.nav_id_to_marquee_eventsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ListMarqueeEventsResponse$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListMarqueeEventsResponse2.nav_id_to_marquee_eventsAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, MarqueeEventsList>> getNav_id_to_marquee_eventsAdapter() {
        return (ProtoAdapter) this.nav_id_to_marquee_eventsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter nav_id_to_marquee_eventsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, MarqueeEventsList.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ListMarqueeEventsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.unknownFields().size() + getNav_id_to_marquee_eventsAdapter().encodedSizeWithTag(1, value.getNav_id_to_marquee_events());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ListMarqueeEventsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        getNav_id_to_marquee_eventsAdapter().encodeWithTag(writer, 1, (int) value.getNav_id_to_marquee_events());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ListMarqueeEventsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getNav_id_to_marquee_eventsAdapter().encodeWithTag(writer, 1, (int) value.getNav_id_to_marquee_events());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public ListMarqueeEventsResponse decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new ListMarqueeEventsResponse(linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                linkedHashMap.putAll(getNav_id_to_marquee_eventsAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ListMarqueeEventsResponse redact(ListMarqueeEventsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.copy(Internal.m26824redactElements(value.getNav_id_to_marquee_events(), MarqueeEventsList.ADAPTER), ByteString.EMPTY);
    }
}
