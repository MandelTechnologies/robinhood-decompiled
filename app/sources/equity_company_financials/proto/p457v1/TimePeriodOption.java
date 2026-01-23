package equity_company_financials.proto.p457v1;

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

/* compiled from: TimePeriodOption.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lequity_company_financials/proto/v1/TimePeriodOption;", "Lcom/squareup/wire/Message;", "", "time_period_type", "", "time_period_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTime_period_type", "()Ljava/lang/String;", "getTime_period_label", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TimePeriodOption extends Message {

    @JvmField
    public static final ProtoAdapter<TimePeriodOption> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timePeriodLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String time_period_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timePeriodType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String time_period_type;

    public TimePeriodOption() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TimePeriodOption(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28009newBuilder();
    }

    public final String getTime_period_type() {
        return this.time_period_type;
    }

    public final String getTime_period_label() {
        return this.time_period_label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePeriodOption(String time_period_type, String time_period_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(time_period_type, "time_period_type");
        Intrinsics.checkNotNullParameter(time_period_label, "time_period_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.time_period_type = time_period_type;
        this.time_period_label = time_period_label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28009newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimePeriodOption)) {
            return false;
        }
        TimePeriodOption timePeriodOption = (TimePeriodOption) other;
        return Intrinsics.areEqual(unknownFields(), timePeriodOption.unknownFields()) && Intrinsics.areEqual(this.time_period_type, timePeriodOption.time_period_type) && Intrinsics.areEqual(this.time_period_label, timePeriodOption.time_period_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.time_period_type.hashCode()) * 37) + this.time_period_label.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("time_period_type=" + Internal.sanitize(this.time_period_type));
        arrayList.add("time_period_label=" + Internal.sanitize(this.time_period_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimePeriodOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TimePeriodOption copy$default(TimePeriodOption timePeriodOption, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timePeriodOption.time_period_type;
        }
        if ((i & 2) != 0) {
            str2 = timePeriodOption.time_period_label;
        }
        if ((i & 4) != 0) {
            byteString = timePeriodOption.unknownFields();
        }
        return timePeriodOption.copy(str, str2, byteString);
    }

    public final TimePeriodOption copy(String time_period_type, String time_period_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(time_period_type, "time_period_type");
        Intrinsics.checkNotNullParameter(time_period_label, "time_period_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimePeriodOption(time_period_type, time_period_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimePeriodOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimePeriodOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_company_financials.proto.v1.TimePeriodOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimePeriodOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTime_period_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTime_period_type());
                }
                return !Intrinsics.areEqual(value.getTime_period_label(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTime_period_label()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimePeriodOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTime_period_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTime_period_type());
                }
                if (!Intrinsics.areEqual(value.getTime_period_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTime_period_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimePeriodOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTime_period_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTime_period_label());
                }
                if (Intrinsics.areEqual(value.getTime_period_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTime_period_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimePeriodOption redact(TimePeriodOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TimePeriodOption.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimePeriodOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TimePeriodOption(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
