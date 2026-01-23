package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: SetAddedIndicators.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicators;", "Lcom/squareup/wire/Message;", "", "added_indicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getAdded_indicators", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetAddedIndicators extends Message {

    @JvmField
    public static final ProtoAdapter<SetAddedIndicators> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorState#ADAPTER", jsonName = "addedIndicators", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<IndicatorState> added_indicators;

    /* JADX WARN: Multi-variable type inference failed */
    public SetAddedIndicators() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8647newBuilder();
    }

    public /* synthetic */ SetAddedIndicators(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddedIndicators(List<IndicatorState> added_indicators, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(added_indicators, "added_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.added_indicators = Internal.immutableCopyOf("added_indicators", added_indicators);
    }

    public final List<IndicatorState> getAdded_indicators() {
        return this.added_indicators;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8647newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetAddedIndicators)) {
            return false;
        }
        SetAddedIndicators setAddedIndicators = (SetAddedIndicators) other;
        return Intrinsics.areEqual(unknownFields(), setAddedIndicators.unknownFields()) && Intrinsics.areEqual(this.added_indicators, setAddedIndicators.added_indicators);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.added_indicators.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.added_indicators.isEmpty()) {
            arrayList.add("added_indicators=" + this.added_indicators);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAddedIndicators{", "}", 0, null, null, 56, null);
    }

    public final SetAddedIndicators copy(List<IndicatorState> added_indicators, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(added_indicators, "added_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetAddedIndicators(added_indicators, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetAddedIndicators.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetAddedIndicators>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetAddedIndicators$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetAddedIndicators value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + IndicatorState.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getAdded_indicators());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetAddedIndicators value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAdded_indicators());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetAddedIndicators value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IndicatorState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAdded_indicators());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetAddedIndicators decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetAddedIndicators(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(IndicatorState.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetAddedIndicators redact(SetAddedIndicators value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getAdded_indicators(), IndicatorState.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
