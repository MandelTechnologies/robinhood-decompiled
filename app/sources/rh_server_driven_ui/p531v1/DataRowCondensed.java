package rh_server_driven_ui.p531v1;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DataRowCondensed.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowCondensed;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "label_icon", "Lrh_server_driven_ui/v1/IconWithAction;", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconWithAction;Ljava/lang/String;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getLabel_icon", "()Lrh_server_driven_ui/v1/IconWithAction;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DataRowCondensed extends Message {

    @JvmField
    public static final ProtoAdapter<DataRowCondensed> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "rh_server_driven_ui.v1.IconWithAction#ADAPTER", jsonName = "labelIcon", schemaIndex = 1, tag = 2)
    private final IconWithAction label_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    public DataRowCondensed() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DataRowCondensed(String str, IconWithAction iconWithAction, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : iconWithAction, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29711newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final IconWithAction getLabel_icon() {
        return this.label_icon;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRowCondensed(String label, IconWithAction iconWithAction, String value, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.label_icon = iconWithAction;
        this.value = value;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29711newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DataRowCondensed)) {
            return false;
        }
        DataRowCondensed dataRowCondensed = (DataRowCondensed) other;
        return Intrinsics.areEqual(unknownFields(), dataRowCondensed.unknownFields()) && Intrinsics.areEqual(this.label, dataRowCondensed.label) && Intrinsics.areEqual(this.label_icon, dataRowCondensed.label_icon) && Intrinsics.areEqual(this.value, dataRowCondensed.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37;
        IconWithAction iconWithAction = this.label_icon;
        int iHashCode2 = ((iHashCode + (iconWithAction != null ? iconWithAction.hashCode() : 0)) * 37) + this.value.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        IconWithAction iconWithAction = this.label_icon;
        if (iconWithAction != null) {
            arrayList.add("label_icon=" + iconWithAction);
        }
        arrayList.add("value=" + Internal.sanitize(this.value));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DataRowCondensed{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DataRowCondensed copy$default(DataRowCondensed dataRowCondensed, String str, IconWithAction iconWithAction, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataRowCondensed.label;
        }
        if ((i & 2) != 0) {
            iconWithAction = dataRowCondensed.label_icon;
        }
        if ((i & 4) != 0) {
            str2 = dataRowCondensed.value;
        }
        if ((i & 8) != 0) {
            byteString = dataRowCondensed.unknownFields();
        }
        return dataRowCondensed.copy(str, iconWithAction, str2, byteString);
    }

    public final DataRowCondensed copy(String label, IconWithAction label_icon, String value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DataRowCondensed(label, label_icon, value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DataRowCondensed.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DataRowCondensed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.DataRowCondensed$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DataRowCondensed value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                int iEncodedSizeWithTag = size + IconWithAction.ADAPTER.encodedSizeWithTag(2, value.getLabel_icon());
                return !Intrinsics.areEqual(value.getValue(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DataRowCondensed value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                IconWithAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getLabel_icon());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DataRowCondensed value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                IconWithAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getLabel_icon());
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DataRowCondensed redact(DataRowCondensed value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IconWithAction label_icon = value.getLabel_icon();
                return DataRowCondensed.copy$default(value, null, label_icon != null ? IconWithAction.ADAPTER.redact(label_icon) : null, null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DataRowCondensed decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IconWithAction iconWithActionDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DataRowCondensed(strDecode, iconWithActionDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iconWithActionDecode = IconWithAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
