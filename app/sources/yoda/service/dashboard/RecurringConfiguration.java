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
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RecurringConfiguration.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfiguration;", "Lcom/squareup/wire/Message;", "", "deposit_frequency", "Lyoda/service/dashboard/ProjectionFrequency;", "deposits", "", "Lyoda/service/dashboard/DepositInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lyoda/service/dashboard/ProjectionFrequency;Ljava/util/List;Lokio/ByteString;)V", "getDeposit_frequency", "()Lyoda/service/dashboard/ProjectionFrequency;", "getDeposits", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RecurringConfiguration extends Message {

    @JvmField
    public static final ProtoAdapter<RecurringConfiguration> ADAPTER;

    @WireField(adapter = "yoda.service.dashboard.ProjectionFrequency#ADAPTER", jsonName = "depositFrequency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ProjectionFrequency deposit_frequency;

    @WireField(adapter = "yoda.service.dashboard.DepositInfo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<DepositInfo> deposits;

    public RecurringConfiguration() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30108newBuilder();
    }

    public final ProjectionFrequency getDeposit_frequency() {
        return this.deposit_frequency;
    }

    public /* synthetic */ RecurringConfiguration(ProjectionFrequency projectionFrequency, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED : projectionFrequency, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringConfiguration(ProjectionFrequency deposit_frequency, List<DepositInfo> deposits, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(deposits, "deposits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deposit_frequency = deposit_frequency;
        this.deposits = Internal.immutableCopyOf("deposits", deposits);
    }

    public final List<DepositInfo> getDeposits() {
        return this.deposits;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30108newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RecurringConfiguration)) {
            return false;
        }
        RecurringConfiguration recurringConfiguration = (RecurringConfiguration) other;
        return Intrinsics.areEqual(unknownFields(), recurringConfiguration.unknownFields()) && this.deposit_frequency == recurringConfiguration.deposit_frequency && Intrinsics.areEqual(this.deposits, recurringConfiguration.deposits);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.deposit_frequency.hashCode()) * 37) + this.deposits.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deposit_frequency=" + this.deposit_frequency);
        if (!this.deposits.isEmpty()) {
            arrayList.add("deposits=" + this.deposits);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringConfiguration{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringConfiguration copy$default(RecurringConfiguration recurringConfiguration, ProjectionFrequency projectionFrequency, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            projectionFrequency = recurringConfiguration.deposit_frequency;
        }
        if ((i & 2) != 0) {
            list = recurringConfiguration.deposits;
        }
        if ((i & 4) != 0) {
            byteString = recurringConfiguration.unknownFields();
        }
        return recurringConfiguration.copy(projectionFrequency, list, byteString);
    }

    public final RecurringConfiguration copy(ProjectionFrequency deposit_frequency, List<DepositInfo> deposits, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(deposits, "deposits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RecurringConfiguration(deposit_frequency, deposits, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecurringConfiguration.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RecurringConfiguration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.RecurringConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecurringConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDeposit_frequency() != ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED) {
                    size += ProjectionFrequency.ADAPTER.encodedSizeWithTag(1, value.getDeposit_frequency());
                }
                return size + DepositInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getDeposits());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecurringConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDeposit_frequency() != ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED) {
                    ProjectionFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_frequency());
                }
                DepositInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDeposits());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecurringConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DepositInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDeposits());
                if (value.getDeposit_frequency() != ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED) {
                    ProjectionFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_frequency());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringConfiguration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ProjectionFrequency projectionFrequencyDecode = ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RecurringConfiguration(projectionFrequencyDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            projectionFrequencyDecode = ProjectionFrequency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(DepositInfo.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringConfiguration redact(RecurringConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RecurringConfiguration.copy$default(value, null, Internal.m26823redactElements(value.getDeposits(), DepositInfo.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
