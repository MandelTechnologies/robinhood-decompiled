package com.robinhood.rosetta.eventlogging;

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

/* compiled from: Machine.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Machine;", "Lcom/squareup/wire/Message;", "", "model", "", "cpu", "processor_speed", "", "core_count", "", "os", "os_version", "physical_memory", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getModel", "()Ljava/lang/String;", "getCpu", "getProcessor_speed", "()F", "getCore_count", "()I", "getOs", "getOs_version", "getPhysical_memory", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Machine extends Message {

    @JvmField
    public static final ProtoAdapter<Machine> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "coreCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int core_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String cpu;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String os;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "physicalMemory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int physical_memory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "processorSpeed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float processor_speed;

    public Machine() {
        this(null, null, 0.0f, 0, null, null, 0, null, 255, null);
    }

    public /* synthetic */ Machine(String str, String str2, float f, int i, String str3, String str4, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24375newBuilder();
    }

    public final String getModel() {
        return this.model;
    }

    public final String getCpu() {
        return this.cpu;
    }

    public final float getProcessor_speed() {
        return this.processor_speed;
    }

    public final int getCore_count() {
        return this.core_count;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final int getPhysical_memory() {
        return this.physical_memory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Machine(String model, String cpu, float f, int i, String os, String os_version, int i2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(cpu, "cpu");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.model = model;
        this.cpu = cpu;
        this.processor_speed = f;
        this.core_count = i;
        this.os = os;
        this.os_version = os_version;
        this.physical_memory = i2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24375newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Machine)) {
            return false;
        }
        Machine machine = (Machine) other;
        return Intrinsics.areEqual(unknownFields(), machine.unknownFields()) && Intrinsics.areEqual(this.model, machine.model) && Intrinsics.areEqual(this.cpu, machine.cpu) && this.processor_speed == machine.processor_speed && this.core_count == machine.core_count && Intrinsics.areEqual(this.os, machine.os) && Intrinsics.areEqual(this.os_version, machine.os_version) && this.physical_memory == machine.physical_memory;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.model.hashCode()) * 37) + this.cpu.hashCode()) * 37) + Float.hashCode(this.processor_speed)) * 37) + Integer.hashCode(this.core_count)) * 37) + this.os.hashCode()) * 37) + this.os_version.hashCode()) * 37) + Integer.hashCode(this.physical_memory);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("model=" + Internal.sanitize(this.model));
        arrayList.add("cpu=" + Internal.sanitize(this.cpu));
        arrayList.add("processor_speed=" + this.processor_speed);
        arrayList.add("core_count=" + this.core_count);
        arrayList.add("os=" + Internal.sanitize(this.os));
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("physical_memory=" + this.physical_memory);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Machine{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Machine copy$default(Machine machine, String str, String str2, float f, int i, String str3, String str4, int i2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = machine.model;
        }
        if ((i3 & 2) != 0) {
            str2 = machine.cpu;
        }
        if ((i3 & 4) != 0) {
            f = machine.processor_speed;
        }
        if ((i3 & 8) != 0) {
            i = machine.core_count;
        }
        if ((i3 & 16) != 0) {
            str3 = machine.os;
        }
        if ((i3 & 32) != 0) {
            str4 = machine.os_version;
        }
        if ((i3 & 64) != 0) {
            i2 = machine.physical_memory;
        }
        if ((i3 & 128) != 0) {
            byteString = machine.unknownFields();
        }
        int i4 = i2;
        ByteString byteString2 = byteString;
        String str5 = str3;
        String str6 = str4;
        return machine.copy(str, str2, f, i, str5, str6, i4, byteString2);
    }

    public final Machine copy(String model, String cpu, float processor_speed, int core_count, String os, String os_version, int physical_memory, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(cpu, "cpu");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Machine(model, cpu, processor_speed, core_count, os, os_version, physical_memory, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Machine.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Machine>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Machine$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Machine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getModel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getModel());
                }
                if (!Intrinsics.areEqual(value.getCpu(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCpu());
                }
                if (!Float.valueOf(value.getProcessor_speed()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getProcessor_speed()));
                }
                if (value.getCore_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getCore_count()));
                }
                if (!Intrinsics.areEqual(value.getOs(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOs());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getOs_version());
                }
                return value.getPhysical_memory() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getPhysical_memory())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Machine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getModel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel());
                }
                if (!Intrinsics.areEqual(value.getCpu(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCpu());
                }
                if (!Float.valueOf(value.getProcessor_speed()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getProcessor_speed()));
                }
                if (value.getCore_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCore_count()));
                }
                if (!Intrinsics.areEqual(value.getOs(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOs());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOs_version());
                }
                if (value.getPhysical_memory() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getPhysical_memory()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Machine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPhysical_memory() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getPhysical_memory()));
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getOs(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOs());
                }
                if (value.getCore_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCore_count()));
                }
                if (!Float.valueOf(value.getProcessor_speed()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getProcessor_speed()));
                }
                if (!Intrinsics.areEqual(value.getCpu(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCpu());
                }
                if (Intrinsics.areEqual(value.getModel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Machine redact(Machine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Machine.copy$default(value, null, null, 0.0f, 0, null, null, 0, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Machine decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 4:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Machine(strDecode, strDecode3, fFloatValue, iIntValue, strDecode4, strDecode2, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
