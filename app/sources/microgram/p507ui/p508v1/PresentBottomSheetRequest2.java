package microgram.p507ui.p508v1;

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

/* compiled from: PresentBottomSheetRequest.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"microgram/ui/v1/PresentBottomSheetRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/ui/v1/PresentBottomSheetRequest;", "metadataAdapter", "", "", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.ui.v1.PresentBottomSheetRequest$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes23.dex */
public final class PresentBottomSheetRequest2 extends ProtoAdapter<PresentBottomSheetRequest> {

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    PresentBottomSheetRequest2(FieldEncoding fieldEncoding, KClass<PresentBottomSheetRequest> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/microgram.ui.v1.PresentBottomSheetRequest", syntax, (Object) null, "microgram/microgram/ui/v1/launch_service.proto");
        this.metadataAdapter = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.PresentBottomSheetRequest$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PresentBottomSheetRequest2.metadataAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getMetadataAdapter() {
        return (ProtoAdapter) this.metadataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(PresentBottomSheetRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
        }
        if (value.getInitial_screen_data() != null) {
            size += BottomSheetContent.ADAPTER.encodedSizeWithTag(2, value.getInitial_screen_data());
        }
        return size + getMetadataAdapter().encodedSizeWithTag(3, value.getMetadata());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PresentBottomSheetRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
        }
        if (value.getInitial_screen_data() != null) {
            BottomSheetContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getInitial_screen_data());
        }
        getMetadataAdapter().encodeWithTag(writer, 3, (int) value.getMetadata());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PresentBottomSheetRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getMetadataAdapter().encodeWithTag(writer, 3, (int) value.getMetadata());
        if (value.getInitial_screen_data() != null) {
            BottomSheetContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getInitial_screen_data());
        }
        if (Intrinsics.areEqual(value.getIdentifier(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PresentBottomSheetRequest decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        BottomSheetContent bottomSheetContentDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new PresentBottomSheetRequest(strDecode, bottomSheetContentDecode, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                bottomSheetContentDecode = BottomSheetContent.ADAPTER.decode(reader);
            } else if (iNextTag == 3) {
                linkedHashMap.putAll(getMetadataAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PresentBottomSheetRequest redact(PresentBottomSheetRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BottomSheetContent initial_screen_data = value.getInitial_screen_data();
        return PresentBottomSheetRequest.copy$default(value, null, initial_screen_data != null ? BottomSheetContent.ADAPTER.redact(initial_screen_data) : null, null, ByteString.EMPTY, 5, null);
    }
}
