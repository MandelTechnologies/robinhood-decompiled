package gold_flow.proto.p466v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PresentRouterMetadata.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JC\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010 R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadata;", "Lcom/squareup/wire/Message;", "", "screen_logging_identifier", "", "presentation_type", "Lgold_flow/proto/v1/PresentationType;", "custom_back_action", "Lgold_flow/proto/v1/Action;", "dismiss_on_custom_back_action", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Lokio/ByteString;)V", "getScreen_logging_identifier", "()Ljava/lang/String;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationType;", "getCustom_back_action", "()Lgold_flow/proto/v1/Action;", "getDismiss_on_custom_back_action", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/PresentRouterMetadata;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PresentRouterMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<PresentRouterMetadata> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.Action#ADAPTER", jsonName = "customBackAction", schemaIndex = 2, tag = 5)
    private final Action custom_back_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dismissOnCustomBackAction", schemaIndex = 3, tag = 6)
    private final Boolean dismiss_on_custom_back_action;

    @WireField(adapter = "gold_flow.proto.v1.PresentationType#ADAPTER", jsonName = "presentationType", schemaIndex = 1, tag = 2)
    private final PresentationType presentation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenLoggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screen_logging_identifier;

    public PresentRouterMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28179newBuilder();
    }

    public final String getScreen_logging_identifier() {
        return this.screen_logging_identifier;
    }

    public /* synthetic */ PresentRouterMetadata(String str, PresentationType presentationType, Action action, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : presentationType, (i & 4) != 0 ? null : action, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PresentationType getPresentation_type() {
        return this.presentation_type;
    }

    public final Action getCustom_back_action() {
        return this.custom_back_action;
    }

    public final Boolean getDismiss_on_custom_back_action() {
        return this.dismiss_on_custom_back_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentRouterMetadata(String screen_logging_identifier, PresentationType presentationType, Action action, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen_logging_identifier, "screen_logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_logging_identifier = screen_logging_identifier;
        this.presentation_type = presentationType;
        this.custom_back_action = action;
        this.dismiss_on_custom_back_action = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28179newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PresentRouterMetadata)) {
            return false;
        }
        PresentRouterMetadata presentRouterMetadata = (PresentRouterMetadata) other;
        return Intrinsics.areEqual(unknownFields(), presentRouterMetadata.unknownFields()) && Intrinsics.areEqual(this.screen_logging_identifier, presentRouterMetadata.screen_logging_identifier) && this.presentation_type == presentRouterMetadata.presentation_type && Intrinsics.areEqual(this.custom_back_action, presentRouterMetadata.custom_back_action) && Intrinsics.areEqual(this.dismiss_on_custom_back_action, presentRouterMetadata.dismiss_on_custom_back_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.screen_logging_identifier.hashCode()) * 37;
        PresentationType presentationType = this.presentation_type;
        int iHashCode2 = (iHashCode + (presentationType != null ? presentationType.hashCode() : 0)) * 37;
        Action action = this.custom_back_action;
        int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        Boolean bool = this.dismiss_on_custom_back_action;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen_logging_identifier=" + Internal.sanitize(this.screen_logging_identifier));
        PresentationType presentationType = this.presentation_type;
        if (presentationType != null) {
            arrayList.add("presentation_type=" + presentationType);
        }
        Action action = this.custom_back_action;
        if (action != null) {
            arrayList.add("custom_back_action=" + action);
        }
        Boolean bool = this.dismiss_on_custom_back_action;
        if (bool != null) {
            arrayList.add("dismiss_on_custom_back_action=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PresentRouterMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PresentRouterMetadata copy$default(PresentRouterMetadata presentRouterMetadata, String str, PresentationType presentationType, Action action, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentRouterMetadata.screen_logging_identifier;
        }
        if ((i & 2) != 0) {
            presentationType = presentRouterMetadata.presentation_type;
        }
        if ((i & 4) != 0) {
            action = presentRouterMetadata.custom_back_action;
        }
        if ((i & 8) != 0) {
            bool = presentRouterMetadata.dismiss_on_custom_back_action;
        }
        if ((i & 16) != 0) {
            byteString = presentRouterMetadata.unknownFields();
        }
        ByteString byteString2 = byteString;
        Action action2 = action;
        return presentRouterMetadata.copy(str, presentationType, action2, bool, byteString2);
    }

    public final PresentRouterMetadata copy(String screen_logging_identifier, PresentationType presentation_type, Action custom_back_action, Boolean dismiss_on_custom_back_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen_logging_identifier, "screen_logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PresentRouterMetadata(screen_logging_identifier, presentation_type, custom_back_action, dismiss_on_custom_back_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentRouterMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PresentRouterMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.PresentRouterMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PresentRouterMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreen_logging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen_logging_identifier());
                }
                return size + PresentationType.ADAPTER.encodedSizeWithTag(2, value.getPresentation_type()) + Action.ADAPTER.encodedSizeWithTag(5, value.getCustom_back_action()) + ProtoAdapter.BOOL.encodedSizeWithTag(6, value.getDismiss_on_custom_back_action());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PresentRouterMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreen_logging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_logging_identifier());
                }
                PresentationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresentation_type());
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_back_action());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getDismiss_on_custom_back_action());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PresentRouterMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getDismiss_on_custom_back_action());
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_back_action());
                PresentationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresentation_type());
                if (Intrinsics.areEqual(value.getScreen_logging_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_logging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PresentRouterMetadata redact(PresentRouterMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action custom_back_action = value.getCustom_back_action();
                return PresentRouterMetadata.copy$default(value, null, null, custom_back_action != null ? Action.ADAPTER.redact(custom_back_action) : null, null, ByteString.EMPTY, 11, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PresentRouterMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                PresentationType presentationTypeDecode = null;
                Action actionDecode = null;
                Boolean boolDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PresentRouterMetadata(str, presentationTypeDecode, actionDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                try {
                                    presentationTypeDecode = PresentationType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 5) {
                                actionDecode = Action.ADAPTER.decode(reader);
                            } else if (iNextTag == 6) {
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }
}
