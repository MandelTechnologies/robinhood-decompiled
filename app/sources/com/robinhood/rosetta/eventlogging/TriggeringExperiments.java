package com.robinhood.rosetta.eventlogging;

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

/* compiled from: TriggeringExperiments.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TriggeringExperiments;", "Lcom/squareup/wire/Message;", "", "experiment_name", "", "variant", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getExperiment_name", "()Ljava/lang/String;", "getVariant", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TriggeringExperiments extends Message {

    @JvmField
    public static final ProtoAdapter<TriggeringExperiments> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "experimentName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String experiment_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String variant;

    public TriggeringExperiments() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TriggeringExperiments(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24589newBuilder();
    }

    public final String getExperiment_name() {
        return this.experiment_name;
    }

    public final String getVariant() {
        return this.variant;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggeringExperiments(String experiment_name, String variant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(experiment_name, "experiment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.experiment_name = experiment_name;
        this.variant = variant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24589newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TriggeringExperiments)) {
            return false;
        }
        TriggeringExperiments triggeringExperiments = (TriggeringExperiments) other;
        return Intrinsics.areEqual(unknownFields(), triggeringExperiments.unknownFields()) && Intrinsics.areEqual(this.experiment_name, triggeringExperiments.experiment_name) && Intrinsics.areEqual(this.variant, triggeringExperiments.variant);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.experiment_name.hashCode()) * 37) + this.variant.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("experiment_name=" + Internal.sanitize(this.experiment_name));
        arrayList.add("variant=" + Internal.sanitize(this.variant));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggeringExperiments{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TriggeringExperiments copy$default(TriggeringExperiments triggeringExperiments, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggeringExperiments.experiment_name;
        }
        if ((i & 2) != 0) {
            str2 = triggeringExperiments.variant;
        }
        if ((i & 4) != 0) {
            byteString = triggeringExperiments.unknownFields();
        }
        return triggeringExperiments.copy(str, str2, byteString);
    }

    public final TriggeringExperiments copy(String experiment_name, String variant, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(experiment_name, "experiment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TriggeringExperiments(experiment_name, variant, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TriggeringExperiments.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TriggeringExperiments>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TriggeringExperiments$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TriggeringExperiments value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getExperiment_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExperiment_name());
                }
                return !Intrinsics.areEqual(value.getVariant(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVariant()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TriggeringExperiments value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getExperiment_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExperiment_name());
                }
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariant());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TriggeringExperiments value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariant());
                }
                if (Intrinsics.areEqual(value.getExperiment_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExperiment_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TriggeringExperiments redact(TriggeringExperiments value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TriggeringExperiments.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TriggeringExperiments decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TriggeringExperiments(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
