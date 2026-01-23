package yoda.service.dashboard;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
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

/* compiled from: DepositInfo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/DepositInfo;", "Lcom/squareup/wire/Message;", "", "deposit_amount", "", "projection_values", "Lyoda/service/dashboard/ProjectedValues;", "unknownFields", "Lokio/ByteString;", "<init>", "(DLyoda/service/dashboard/ProjectedValues;Lokio/ByteString;)V", "getDeposit_amount", "()D", "getProjection_values", "()Lyoda/service/dashboard/ProjectedValues;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DepositInfo extends Message {

    @JvmField
    public static final ProtoAdapter<DepositInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double deposit_amount;

    @WireField(adapter = "yoda.service.dashboard.ProjectedValues#ADAPTER", jsonName = "projectionValues", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ProjectedValues projection_values;

    public DepositInfo() {
        this(0.0d, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30090newBuilder();
    }

    public final double getDeposit_amount() {
        return this.deposit_amount;
    }

    public final ProjectedValues getProjection_values() {
        return this.projection_values;
    }

    public /* synthetic */ DepositInfo(double d, ProjectedValues projectedValues, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : projectedValues, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositInfo(double d, ProjectedValues projectedValues, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deposit_amount = d;
        this.projection_values = projectedValues;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30090newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositInfo)) {
            return false;
        }
        DepositInfo depositInfo = (DepositInfo) other;
        return Intrinsics.areEqual(unknownFields(), depositInfo.unknownFields()) && this.deposit_amount == depositInfo.deposit_amount && Intrinsics.areEqual(this.projection_values, depositInfo.projection_values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Double.hashCode(this.deposit_amount)) * 37;
        ProjectedValues projectedValues = this.projection_values;
        int iHashCode2 = iHashCode + (projectedValues != null ? projectedValues.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deposit_amount=" + this.deposit_amount);
        ProjectedValues projectedValues = this.projection_values;
        if (projectedValues != null) {
            arrayList.add("projection_values=" + projectedValues);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositInfo copy$default(DepositInfo depositInfo, double d, ProjectedValues projectedValues, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = depositInfo.deposit_amount;
        }
        if ((i & 2) != 0) {
            projectedValues = depositInfo.projection_values;
        }
        if ((i & 4) != 0) {
            byteString = depositInfo.unknownFields();
        }
        return depositInfo.copy(d, projectedValues, byteString);
    }

    public final DepositInfo copy(double deposit_amount, ProjectedValues projection_values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositInfo(deposit_amount, projection_values, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.DepositInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Double.valueOf(value.getDeposit_amount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getDeposit_amount()));
                }
                return value.getProjection_values() != null ? size + ProjectedValues.ADAPTER.encodedSizeWithTag(2, value.getProjection_values()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Double.valueOf(value.getDeposit_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getDeposit_amount()));
                }
                if (value.getProjection_values() != null) {
                    ProjectedValues.ADAPTER.encodeWithTag(writer, 2, (int) value.getProjection_values());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getProjection_values() != null) {
                    ProjectedValues.ADAPTER.encodeWithTag(writer, 2, (int) value.getProjection_values());
                }
                if (Double.valueOf(value.getDeposit_amount()).equals(Double.valueOf(0.0d))) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getDeposit_amount()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositInfo redact(DepositInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ProjectedValues projection_values = value.getProjection_values();
                return DepositInfo.copy$default(value, 0.0d, projection_values != null ? ProjectedValues.ADAPTER.redact(projection_values) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                ProjectedValues projectedValuesDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositInfo(dDoubleValue, projectedValuesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        projectedValuesDecode = ProjectedValues.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
