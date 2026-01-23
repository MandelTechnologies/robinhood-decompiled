package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: AdvisoryInsightTwoBarChartComparison.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "Lcom/squareup/wire/Message;", "", "new_label", "", "new_value", "new_value_label", "old_label", "old_value", "old_value_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNew_label", "()Ljava/lang/String;", "getNew_value", "getNew_value_label", "getOld_label", "getOld_value", "getOld_value_label", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryInsightTwoBarChartComparison extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightTwoBarChartComparison> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String new_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String new_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newValueLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String new_value_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String old_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String old_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldValueLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String old_value_label;

    public AdvisoryInsightTwoBarChartComparison() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ AdvisoryInsightTwoBarChartComparison(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4404newBuilder();
    }

    public final String getNew_label() {
        return this.new_label;
    }

    public final String getNew_value() {
        return this.new_value;
    }

    public final String getNew_value_label() {
        return this.new_value_label;
    }

    public final String getOld_label() {
        return this.old_label;
    }

    public final String getOld_value() {
        return this.old_value;
    }

    public final String getOld_value_label() {
        return this.old_value_label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightTwoBarChartComparison(String new_label, String new_value, String new_value_label, String old_label, String old_value, String old_value_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(new_label, "new_label");
        Intrinsics.checkNotNullParameter(new_value, "new_value");
        Intrinsics.checkNotNullParameter(new_value_label, "new_value_label");
        Intrinsics.checkNotNullParameter(old_label, "old_label");
        Intrinsics.checkNotNullParameter(old_value, "old_value");
        Intrinsics.checkNotNullParameter(old_value_label, "old_value_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.new_label = new_label;
        this.new_value = new_value;
        this.new_value_label = new_value_label;
        this.old_label = old_label;
        this.old_value = old_value;
        this.old_value_label = old_value_label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4404newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightTwoBarChartComparison)) {
            return false;
        }
        AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison = (AdvisoryInsightTwoBarChartComparison) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightTwoBarChartComparison.unknownFields()) && Intrinsics.areEqual(this.new_label, advisoryInsightTwoBarChartComparison.new_label) && Intrinsics.areEqual(this.new_value, advisoryInsightTwoBarChartComparison.new_value) && Intrinsics.areEqual(this.new_value_label, advisoryInsightTwoBarChartComparison.new_value_label) && Intrinsics.areEqual(this.old_label, advisoryInsightTwoBarChartComparison.old_label) && Intrinsics.areEqual(this.old_value, advisoryInsightTwoBarChartComparison.old_value) && Intrinsics.areEqual(this.old_value_label, advisoryInsightTwoBarChartComparison.old_value_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.new_label.hashCode()) * 37) + this.new_value.hashCode()) * 37) + this.new_value_label.hashCode()) * 37) + this.old_label.hashCode()) * 37) + this.old_value.hashCode()) * 37) + this.old_value_label.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("new_label=" + Internal.sanitize(this.new_label));
        arrayList.add("new_value=" + Internal.sanitize(this.new_value));
        arrayList.add("new_value_label=" + Internal.sanitize(this.new_value_label));
        arrayList.add("old_label=" + Internal.sanitize(this.old_label));
        arrayList.add("old_value=" + Internal.sanitize(this.old_value));
        arrayList.add("old_value_label=" + Internal.sanitize(this.old_value_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightTwoBarChartComparison{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightTwoBarChartComparison copy$default(AdvisoryInsightTwoBarChartComparison advisoryInsightTwoBarChartComparison, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightTwoBarChartComparison.new_label;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightTwoBarChartComparison.new_value;
        }
        if ((i & 4) != 0) {
            str3 = advisoryInsightTwoBarChartComparison.new_value_label;
        }
        if ((i & 8) != 0) {
            str4 = advisoryInsightTwoBarChartComparison.old_label;
        }
        if ((i & 16) != 0) {
            str5 = advisoryInsightTwoBarChartComparison.old_value;
        }
        if ((i & 32) != 0) {
            str6 = advisoryInsightTwoBarChartComparison.old_value_label;
        }
        if ((i & 64) != 0) {
            byteString = advisoryInsightTwoBarChartComparison.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return advisoryInsightTwoBarChartComparison.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final AdvisoryInsightTwoBarChartComparison copy(String new_label, String new_value, String new_value_label, String old_label, String old_value, String old_value_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(new_label, "new_label");
        Intrinsics.checkNotNullParameter(new_value, "new_value");
        Intrinsics.checkNotNullParameter(new_value_label, "new_value_label");
        Intrinsics.checkNotNullParameter(old_label, "old_label");
        Intrinsics.checkNotNullParameter(old_value, "old_value");
        Intrinsics.checkNotNullParameter(old_value_label, "old_value_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightTwoBarChartComparison(new_label, new_value, new_value_label, old_label, old_value, old_value_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightTwoBarChartComparison.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightTwoBarChartComparison>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightTwoBarChartComparison$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightTwoBarChartComparison value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNew_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNew_label());
                }
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNew_value());
                }
                if (!Intrinsics.areEqual(value.getNew_value_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNew_value_label());
                }
                if (!Intrinsics.areEqual(value.getOld_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOld_label());
                }
                if (!Intrinsics.areEqual(value.getOld_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOld_value());
                }
                return !Intrinsics.areEqual(value.getOld_value_label(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getOld_value_label()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightTwoBarChartComparison value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNew_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNew_label());
                }
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_value());
                }
                if (!Intrinsics.areEqual(value.getNew_value_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_value_label());
                }
                if (!Intrinsics.areEqual(value.getOld_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOld_label());
                }
                if (!Intrinsics.areEqual(value.getOld_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOld_value());
                }
                if (!Intrinsics.areEqual(value.getOld_value_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOld_value_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightTwoBarChartComparison value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOld_value_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOld_value_label());
                }
                if (!Intrinsics.areEqual(value.getOld_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOld_value());
                }
                if (!Intrinsics.areEqual(value.getOld_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOld_label());
                }
                if (!Intrinsics.areEqual(value.getNew_value_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_value_label());
                }
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_value());
                }
                if (Intrinsics.areEqual(value.getNew_label(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNew_label());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightTwoBarChartComparison redact(AdvisoryInsightTwoBarChartComparison value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryInsightTwoBarChartComparison.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightTwoBarChartComparison decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryInsightTwoBarChartComparison(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
