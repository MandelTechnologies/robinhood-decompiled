package yoda.service.dashboard;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: YearlyProjectedValues.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lyoda/service/dashboard/YearlyProjectedValues;", "Lcom/squareup/wire/Message;", "", "values", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getValues", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class YearlyProjectedValues extends Message {

    @JvmField
    public static final ProtoAdapter<YearlyProjectedValues> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.PACKED, schemaIndex = 0, tag = 1)
    private final List<Double> values;

    /* JADX WARN: Multi-variable type inference failed */
    public YearlyProjectedValues() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30112newBuilder();
    }

    public /* synthetic */ YearlyProjectedValues(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearlyProjectedValues(List<Double> values, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.values = Internal.immutableCopyOf("values", values);
    }

    public final List<Double> getValues() {
        return this.values;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30112newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof YearlyProjectedValues)) {
            return false;
        }
        YearlyProjectedValues yearlyProjectedValues = (YearlyProjectedValues) other;
        return Intrinsics.areEqual(unknownFields(), yearlyProjectedValues.unknownFields()) && Intrinsics.areEqual(this.values, yearlyProjectedValues.values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.values.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.values.isEmpty()) {
            arrayList.add("values=" + this.values);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "YearlyProjectedValues{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YearlyProjectedValues copy$default(YearlyProjectedValues yearlyProjectedValues, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yearlyProjectedValues.values;
        }
        if ((i & 2) != 0) {
            byteString = yearlyProjectedValues.unknownFields();
        }
        return yearlyProjectedValues.copy(list, byteString);
    }

    public final YearlyProjectedValues copy(List<Double> values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new YearlyProjectedValues(values, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(YearlyProjectedValues.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<YearlyProjectedValues>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.YearlyProjectedValues$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(YearlyProjectedValues value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.DOUBLE.asPacked().encodedSizeWithTag(1, value.getValues());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, YearlyProjectedValues value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.DOUBLE.asPacked().encodeWithTag(writer, 1, (int) value.getValues());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, YearlyProjectedValues value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.DOUBLE.asPacked().encodeWithTag(writer, 1, (int) value.getValues());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public YearlyProjectedValues redact(YearlyProjectedValues value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return YearlyProjectedValues.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public YearlyProjectedValues decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                List listEmptyList = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        break;
                    }
                    if (iNextTag == 1) {
                        if (listEmptyList == null) {
                            listEmptyList = new ArrayList((int) RangesKt.coerceAtMost(reader.nextFieldMinLengthInBytes() / 8, 2147483647L));
                        }
                        listEmptyList.add(ProtoAdapter.DOUBLE.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
                ByteString byteStringEndMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(jBeginMessage);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                return new YearlyProjectedValues(listEmptyList, byteStringEndMessageAndGetUnknownFields);
            }
        };
    }
}
