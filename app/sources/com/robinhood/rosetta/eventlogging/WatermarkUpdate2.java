package com.robinhood.rosetta.eventlogging;

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
import p479j$.time.Instant;

/* compiled from: WatermarkUpdate.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WatermarkUpdate$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "publisher_metadataAdapter", "", "", "getPublisher_metadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "publisher_metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.eventlogging.WatermarkUpdate$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes19.dex */
public final class WatermarkUpdate2 extends ProtoAdapter<WatermarkUpdate> {

    /* renamed from: publisher_metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy publisher_metadataAdapter;

    WatermarkUpdate2(FieldEncoding fieldEncoding, KClass<WatermarkUpdate> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.event_logging.WatermarkUpdate", syntax, (Object) null, "data-platform/data_platform/proto/watermark.proto");
        this.publisher_metadataAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WatermarkUpdate$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkUpdate2.publisher_metadataAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getPublisher_metadataAdapter() {
        return (ProtoAdapter) this.publisher_metadataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter publisher_metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(WatermarkUpdate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getTable_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTable_name());
        }
        if (value.getWatermark_utc() != null) {
            size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getWatermark_utc());
        }
        if (value.getPublished_at_utc() != null) {
            size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getPublished_at_utc());
        }
        return size + getPublisher_metadataAdapter().encodedSizeWithTag(4, value.getPublisher_metadata());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, WatermarkUpdate value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getTable_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTable_name());
        }
        if (value.getWatermark_utc() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getWatermark_utc());
        }
        if (value.getPublished_at_utc() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPublished_at_utc());
        }
        getPublisher_metadataAdapter().encodeWithTag(writer, 4, (int) value.getPublisher_metadata());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, WatermarkUpdate value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getPublisher_metadataAdapter().encodeWithTag(writer, 4, (int) value.getPublisher_metadata());
        if (value.getPublished_at_utc() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPublished_at_utc());
        }
        if (value.getWatermark_utc() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getWatermark_utc());
        }
        if (Intrinsics.areEqual(value.getTable_name(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTable_name());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public WatermarkUpdate decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        Instant instantDecode = null;
        Instant instantDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new WatermarkUpdate(strDecode, instantDecode, instantDecode2, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                instantDecode = ProtoAdapter.INSTANT.decode(reader);
            } else if (iNextTag == 3) {
                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
            } else if (iNextTag == 4) {
                linkedHashMap.putAll(getPublisher_metadataAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public WatermarkUpdate redact(WatermarkUpdate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Instant watermark_utc = value.getWatermark_utc();
        Instant instantRedact = watermark_utc != null ? ProtoAdapter.INSTANT.redact(watermark_utc) : null;
        Instant published_at_utc = value.getPublished_at_utc();
        return WatermarkUpdate.copy$default(value, null, instantRedact, published_at_utc != null ? ProtoAdapter.INSTANT.redact(published_at_utc) : null, null, ByteString.EMPTY, 9, null);
    }
}
