package bff_money_movement.service.p019v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
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

/* compiled from: TransferValidationErrorDetails.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"bff_money_movement/service/v1/TransferValidationErrorDetails$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "markdown_actionsAdapter", "", "", "Lbff_money_movement/service/v1/TransferAction;", "getMarkdown_actionsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "markdown_actionsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: bff_money_movement.service.v1.TransferValidationErrorDetails$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes.dex */
public final class TransferValidationErrorDetails2 extends ProtoAdapter<TransferValidationErrorDetails> {

    /* renamed from: markdown_actionsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy markdown_actionsAdapter;

    TransferValidationErrorDetails2(FieldEncoding fieldEncoding, KClass<TransferValidationErrorDetails> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/bff_money_movement.service.v1.TransferValidationErrorDetails", syntax, (Object) null, "bff-money-movement/bff_money_movement/proto/v1/common.proto");
        this.markdown_actionsAdapter = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.TransferValidationErrorDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferValidationErrorDetails2.markdown_actionsAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, TransferAction>> getMarkdown_actionsAdapter() {
        return (ProtoAdapter) this.markdown_actionsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter markdown_actionsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, TransferAction.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(TransferValidationErrorDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getTitle(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
        }
        if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
        }
        return size + getMarkdown_actionsAdapter().encodedSizeWithTag(3, value.getMarkdown_actions()) + TransferButton.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getButtons());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, TransferValidationErrorDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getTitle(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
        }
        if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
        }
        getMarkdown_actionsAdapter().encodeWithTag(writer, 3, (int) value.getMarkdown_actions());
        TransferButton.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getButtons());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, TransferValidationErrorDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        TransferButton.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getButtons());
        getMarkdown_actionsAdapter().encodeWithTag(writer, 3, (int) value.getMarkdown_actions());
        if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
        }
        if (Intrinsics.areEqual(value.getTitle(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public TransferValidationErrorDetails decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = "";
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new TransferValidationErrorDetails(strDecode, strDecode2, linkedHashMap, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 3) {
                linkedHashMap.putAll(getMarkdown_actionsAdapter().decode(reader));
            } else if (iNextTag == 4) {
                arrayList.add(TransferButton.ADAPTER.decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TransferValidationErrorDetails redact(TransferValidationErrorDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return TransferValidationErrorDetails.copy$default(value, null, null, Internal.m26824redactElements(value.getMarkdown_actions(), TransferAction.ADAPTER), Internal.m26823redactElements(value.getButtons(), TransferButton.ADAPTER), ByteString.EMPTY, 3, null);
    }
}
