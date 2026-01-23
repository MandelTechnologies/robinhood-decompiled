package advisory.proto.p008v1;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
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

/* compiled from: AdvisoryFeeData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeData;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "value", SduiAlert.BOTTOM_SHEET_TAG, "Ladvisory/proto/v1/AdvisoryFeeBottomSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryFeeBottomSheet;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getBottom_sheet", "()Ladvisory/proto/v1/AdvisoryFeeBottomSheet;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryFeeData extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryFeeData> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.AdvisoryFeeBottomSheet#ADAPTER", jsonName = "bottomSheet", schemaIndex = 2, tag = 3)
    private final AdvisoryFeeBottomSheet bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String value;

    public AdvisoryFeeData() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdvisoryFeeData(String str, String str2, AdvisoryFeeBottomSheet advisoryFeeBottomSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : advisoryFeeBottomSheet, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4378newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final AdvisoryFeeBottomSheet getBottom_sheet() {
        return this.bottom_sheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFeeData(String label, String value, AdvisoryFeeBottomSheet advisoryFeeBottomSheet, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.value = value;
        this.bottom_sheet = advisoryFeeBottomSheet;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4378newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryFeeData)) {
            return false;
        }
        AdvisoryFeeData advisoryFeeData = (AdvisoryFeeData) other;
        return Intrinsics.areEqual(unknownFields(), advisoryFeeData.unknownFields()) && Intrinsics.areEqual(this.label, advisoryFeeData.label) && Intrinsics.areEqual(this.value, advisoryFeeData.value) && Intrinsics.areEqual(this.bottom_sheet, advisoryFeeData.bottom_sheet);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37) + this.value.hashCode()) * 37;
        AdvisoryFeeBottomSheet advisoryFeeBottomSheet = this.bottom_sheet;
        int iHashCode2 = iHashCode + (advisoryFeeBottomSheet != null ? advisoryFeeBottomSheet.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("value=" + Internal.sanitize(this.value));
        AdvisoryFeeBottomSheet advisoryFeeBottomSheet = this.bottom_sheet;
        if (advisoryFeeBottomSheet != null) {
            arrayList.add("bottom_sheet=" + advisoryFeeBottomSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryFeeData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryFeeData copy$default(AdvisoryFeeData advisoryFeeData, String str, String str2, AdvisoryFeeBottomSheet advisoryFeeBottomSheet, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryFeeData.label;
        }
        if ((i & 2) != 0) {
            str2 = advisoryFeeData.value;
        }
        if ((i & 4) != 0) {
            advisoryFeeBottomSheet = advisoryFeeData.bottom_sheet;
        }
        if ((i & 8) != 0) {
            byteString = advisoryFeeData.unknownFields();
        }
        return advisoryFeeData.copy(str, str2, advisoryFeeBottomSheet, byteString);
    }

    public final AdvisoryFeeData copy(String label, String value, AdvisoryFeeBottomSheet bottom_sheet, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryFeeData(label, value, bottom_sheet, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryFeeData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryFeeData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryFeeData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryFeeData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue());
                }
                return size + AdvisoryFeeBottomSheet.ADAPTER.encodedSizeWithTag(3, value.getBottom_sheet());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryFeeData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                }
                AdvisoryFeeBottomSheet.ADAPTER.encodeWithTag(writer, 3, (int) value.getBottom_sheet());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryFeeData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryFeeBottomSheet.ADAPTER.encodeWithTag(writer, 3, (int) value.getBottom_sheet());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFeeData redact(AdvisoryFeeData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryFeeBottomSheet bottom_sheet = value.getBottom_sheet();
                return AdvisoryFeeData.copy$default(value, null, null, bottom_sheet != null ? AdvisoryFeeBottomSheet.ADAPTER.redact(bottom_sheet) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFeeData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdvisoryFeeBottomSheet advisoryFeeBottomSheetDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryFeeData(strDecode, strDecode2, advisoryFeeBottomSheetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        advisoryFeeBottomSheetDecode = AdvisoryFeeBottomSheet.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
