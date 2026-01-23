package search_coprocessor.p542v1;

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
import search_coprocessor.p542v1.SportCarousel;

/* compiled from: SportCarousel.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"search_coprocessor/v1/SportCarousel$Event$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lsearch_coprocessor/v1/SportCarousel$Event;", "contract_id_to_aux_descriptionAdapter", "", "", "getContract_id_to_aux_descriptionAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "contract_id_to_aux_descriptionAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: search_coprocessor.v1.SportCarousel$Event$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes28.dex */
public final class SportCarousel3 extends ProtoAdapter<SportCarousel.Event> {

    /* renamed from: contract_id_to_aux_descriptionAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_aux_descriptionAdapter;

    SportCarousel3(FieldEncoding fieldEncoding, KClass<SportCarousel.Event> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/search_coprocessor.v1.SportCarousel.Event", syntax, (Object) null, "microgram/contracts/search_coprocessor/proto/v1/search_highlights.proto");
        this.contract_id_to_aux_descriptionAdapter = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.SportCarousel$Event$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportCarousel3.contract_id_to_aux_descriptionAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_aux_descriptionAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getContract_id_to_aux_descriptionAdapter() {
        return (ProtoAdapter) this.contract_id_to_aux_descriptionAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(SportCarousel.Event value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getId(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
        }
        return size + getContract_id_to_aux_descriptionAdapter().encodedSizeWithTag(2, value.getContract_id_to_aux_description());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, SportCarousel.Event value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
        }
        getContract_id_to_aux_descriptionAdapter().encodeWithTag(writer, 2, (int) value.getContract_id_to_aux_description());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, SportCarousel.Event value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getContract_id_to_aux_descriptionAdapter().encodeWithTag(writer, 2, (int) value.getContract_id_to_aux_description());
        if (Intrinsics.areEqual(value.getId(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public SportCarousel.Event decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new SportCarousel.Event(strDecode, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                linkedHashMap.putAll(getContract_id_to_aux_descriptionAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public SportCarousel.Event redact(SportCarousel.Event value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return SportCarousel.Event.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }
}
