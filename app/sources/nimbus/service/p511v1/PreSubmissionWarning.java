package nimbus.service.p511v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: PreSubmissionWarning.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarning;", "Lcom/squareup/wire/Message;", "", "is_blocking", "", "warning_type", "Lnimbus/service/v1/PreSubmissionWarningType;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLnimbus/service/v1/PreSubmissionWarningType;Lokio/ByteString;)V", "()Z", "getWarning_type", "()Lnimbus/service/v1/PreSubmissionWarningType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PreSubmissionWarning extends Message {

    @JvmField
    public static final ProtoAdapter<PreSubmissionWarning> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isBlocking", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_blocking;

    @WireField(adapter = "nimbus.service.v1.PreSubmissionWarningType#ADAPTER", jsonName = "warningType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PreSubmissionWarningType warning_type;

    public PreSubmissionWarning() {
        this(false, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29377newBuilder();
    }

    /* renamed from: is_blocking, reason: from getter */
    public final boolean getIs_blocking() {
        return this.is_blocking;
    }

    public final PreSubmissionWarningType getWarning_type() {
        return this.warning_type;
    }

    public /* synthetic */ PreSubmissionWarning(boolean z, PreSubmissionWarningType preSubmissionWarningType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : preSubmissionWarningType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSubmissionWarning(boolean z, PreSubmissionWarningType preSubmissionWarningType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_blocking = z;
        this.warning_type = preSubmissionWarningType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29377newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PreSubmissionWarning)) {
            return false;
        }
        PreSubmissionWarning preSubmissionWarning = (PreSubmissionWarning) other;
        return Intrinsics.areEqual(unknownFields(), preSubmissionWarning.unknownFields()) && this.is_blocking == preSubmissionWarning.is_blocking && Intrinsics.areEqual(this.warning_type, preSubmissionWarning.warning_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_blocking)) * 37;
        PreSubmissionWarningType preSubmissionWarningType = this.warning_type;
        int iHashCode2 = iHashCode + (preSubmissionWarningType != null ? preSubmissionWarningType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_blocking=" + this.is_blocking);
        PreSubmissionWarningType preSubmissionWarningType = this.warning_type;
        if (preSubmissionWarningType != null) {
            arrayList.add("warning_type=" + preSubmissionWarningType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreSubmissionWarning{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PreSubmissionWarning copy$default(PreSubmissionWarning preSubmissionWarning, boolean z, PreSubmissionWarningType preSubmissionWarningType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preSubmissionWarning.is_blocking;
        }
        if ((i & 2) != 0) {
            preSubmissionWarningType = preSubmissionWarning.warning_type;
        }
        if ((i & 4) != 0) {
            byteString = preSubmissionWarning.unknownFields();
        }
        return preSubmissionWarning.copy(z, preSubmissionWarningType, byteString);
    }

    public final PreSubmissionWarning copy(boolean is_blocking, PreSubmissionWarningType warning_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PreSubmissionWarning(is_blocking, warning_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreSubmissionWarning.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PreSubmissionWarning>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.PreSubmissionWarning$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PreSubmissionWarning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_blocking()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_blocking()));
                }
                return value.getWarning_type() != null ? size + PreSubmissionWarningType.ADAPTER.encodedSizeWithTag(2, value.getWarning_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PreSubmissionWarning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_blocking()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_blocking()));
                }
                if (value.getWarning_type() != null) {
                    PreSubmissionWarningType.ADAPTER.encodeWithTag(writer, 2, (int) value.getWarning_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PreSubmissionWarning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getWarning_type() != null) {
                    PreSubmissionWarningType.ADAPTER.encodeWithTag(writer, 2, (int) value.getWarning_type());
                }
                if (value.getIs_blocking()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_blocking()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionWarning redact(PreSubmissionWarning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PreSubmissionWarningType warning_type = value.getWarning_type();
                return PreSubmissionWarning.copy$default(value, false, warning_type != null ? PreSubmissionWarningType.ADAPTER.redact(warning_type) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionWarning decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                PreSubmissionWarningType preSubmissionWarningTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PreSubmissionWarning(zBooleanValue, preSubmissionWarningTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        preSubmissionWarningTypeDecode = PreSubmissionWarningType.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
