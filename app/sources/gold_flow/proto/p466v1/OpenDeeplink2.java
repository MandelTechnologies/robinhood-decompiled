package gold_flow.proto.p466v1;

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

/* compiled from: OpenDeeplink.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"gold_flow/proto/v1/OpenDeeplink$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lgold_flow/proto/v1/OpenDeeplink;", "generic_argsAdapter", "", "", "getGeneric_argsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "generic_argsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: gold_flow.proto.v1.OpenDeeplink$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class OpenDeeplink2 extends ProtoAdapter<OpenDeeplink> {

    /* renamed from: generic_argsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy generic_argsAdapter;

    OpenDeeplink2(FieldEncoding fieldEncoding, KClass<OpenDeeplink> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/gold_flow.proto.v1.OpenDeeplink", syntax, (Object) null, "microgram/contracts/gold_flow/proto/v1/router.proto");
        this.generic_argsAdapter = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.OpenDeeplink$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenDeeplink2.generic_argsAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter generic_argsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getGeneric_argsAdapter() {
        return (ProtoAdapter) this.generic_argsAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(OpenDeeplink value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getDeeplink_uri(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDeeplink_uri());
        }
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            size += PresentationType.ADAPTER.encodedSizeWithTag(2, value.getPresentation_type());
        }
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            size += TransitionAnimation.ADAPTER.encodedSizeWithTag(3, value.getTransition_animation());
        }
        return size + getGeneric_argsAdapter().encodedSizeWithTag(4, value.getGeneric_args()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getShould_open_externally());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, OpenDeeplink value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getDeeplink_uri(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDeeplink_uri());
        }
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            PresentationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresentation_type());
        }
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            TransitionAnimation.ADAPTER.encodeWithTag(writer, 3, (int) value.getTransition_animation());
        }
        getGeneric_argsAdapter().encodeWithTag(writer, 4, (int) value.getGeneric_args());
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShould_open_externally());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, OpenDeeplink value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShould_open_externally());
        getGeneric_argsAdapter().encodeWithTag(writer, 4, (int) value.getGeneric_args());
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            TransitionAnimation.ADAPTER.encodeWithTag(writer, 3, (int) value.getTransition_animation());
        }
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            PresentationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresentation_type());
        }
        if (Intrinsics.areEqual(value.getDeeplink_uri(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDeeplink_uri());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public OpenDeeplink decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        PresentationType presentationTypeDecode = PresentationType.PRESENTATION_UNSPECIFIED;
        TransitionAnimation transitionAnimation = TransitionAnimation.ANIMATION_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        Boolean boolDecode = null;
        String strDecode = "";
        TransitionAnimation transitionAnimationDecode = transitionAnimation;
        while (true) {
            PresentationType presentationType = presentationTypeDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag == -1) {
                    return new OpenDeeplink(strDecode, presentationType, transitionAnimationDecode, linkedHashMap, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
                if (iNextTag == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iNextTag == 2) {
                    try {
                        presentationTypeDecode = PresentationType.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else if (iNextTag == 3) {
                    try {
                        transitionAnimationDecode = TransitionAnimation.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                } else if (iNextTag == 4) {
                    linkedHashMap.putAll(getGeneric_argsAdapter().decode(reader));
                } else if (iNextTag == 5) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else {
                    reader.readUnknownField(iNextTag);
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public OpenDeeplink redact(OpenDeeplink value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return OpenDeeplink.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
    }
}
