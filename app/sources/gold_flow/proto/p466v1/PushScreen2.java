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

/* compiled from: PushScreen.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"gold_flow/proto/v1/PushScreen$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lgold_flow/proto/v1/PushScreen;", "generic_argsAdapter", "", "", "getGeneric_argsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "generic_argsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: gold_flow.proto.v1.PushScreen$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class PushScreen2 extends ProtoAdapter<PushScreen> {

    /* renamed from: generic_argsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy generic_argsAdapter;

    PushScreen2(FieldEncoding fieldEncoding, KClass<PushScreen> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/gold_flow.proto.v1.PushScreen", syntax, (Object) null, "microgram/contracts/gold_flow/proto/v1/router.proto");
        this.generic_argsAdapter = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.PushScreen$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PushScreen2.generic_argsAdapter_delegate$lambda$0();
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
    public int encodedSize(PushScreen value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getScreen() != GoldFlowScreen.SCREEN_UNSPECIFIED) {
            size += GoldFlowScreen.ADAPTER.encodedSizeWithTag(1, value.getScreen());
        }
        int iEncodedSizeWithTag = size + getGeneric_argsAdapter().encodedSizeWithTag(2, value.getGeneric_args());
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            iEncodedSizeWithTag += PresentationType.ADAPTER.encodedSizeWithTag(3, value.getPresentation_type());
        }
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            iEncodedSizeWithTag += TransitionAnimation.ADAPTER.encodedSizeWithTag(4, value.getTransition_animation());
        }
        return iEncodedSizeWithTag + Action.ADAPTER.encodedSizeWithTag(5, value.getCustom_back_action()) + ProtoAdapter.BOOL.encodedSizeWithTag(6, value.getDismiss_on_custom_back_action());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PushScreen value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getScreen() != GoldFlowScreen.SCREEN_UNSPECIFIED) {
            GoldFlowScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
        }
        getGeneric_argsAdapter().encodeWithTag(writer, 2, (int) value.getGeneric_args());
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            PresentationType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPresentation_type());
        }
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            TransitionAnimation.ADAPTER.encodeWithTag(writer, 4, (int) value.getTransition_animation());
        }
        Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_back_action());
        ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getDismiss_on_custom_back_action());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PushScreen value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getDismiss_on_custom_back_action());
        Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_back_action());
        if (value.getTransition_animation() != TransitionAnimation.ANIMATION_UNSPECIFIED) {
            TransitionAnimation.ADAPTER.encodeWithTag(writer, 4, (int) value.getTransition_animation());
        }
        if (value.getPresentation_type() != PresentationType.PRESENTATION_UNSPECIFIED) {
            PresentationType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPresentation_type());
        }
        getGeneric_argsAdapter().encodeWithTag(writer, 2, (int) value.getGeneric_args());
        if (value.getScreen() != GoldFlowScreen.SCREEN_UNSPECIFIED) {
            GoldFlowScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public PushScreen decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        GoldFlowScreen goldFlowScreenDecode = GoldFlowScreen.SCREEN_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PresentationType presentationType = PresentationType.PRESENTATION_UNSPECIFIED;
        TransitionAnimation transitionAnimation = TransitionAnimation.ANIMATION_UNSPECIFIED;
        long jBeginMessage = reader.beginMessage();
        Action actionDecode = null;
        Boolean boolDecode = null;
        TransitionAnimation transitionAnimationDecode = transitionAnimation;
        PresentationType presentationTypeDecode = presentationType;
        while (true) {
            GoldFlowScreen goldFlowScreen = goldFlowScreenDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                goldFlowScreenDecode = GoldFlowScreen.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            linkedHashMap.putAll(getGeneric_argsAdapter().decode(reader));
                            break;
                        case 3:
                            try {
                                presentationTypeDecode = PresentationType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 4:
                            try {
                                transitionAnimationDecode = TransitionAnimation.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 5:
                            actionDecode = Action.ADAPTER.decode(reader);
                            break;
                        case 6:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                } else {
                    return new PushScreen(goldFlowScreen, linkedHashMap, presentationTypeDecode, transitionAnimationDecode, actionDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PushScreen redact(PushScreen value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Action custom_back_action = value.getCustom_back_action();
        return PushScreen.copy$default(value, null, null, null, null, custom_back_action != null ? Action.ADAPTER.redact(custom_back_action) : null, null, ByteString.EMPTY, 47, null);
    }
}
