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

/* compiled from: PerceivedLoadingTimeEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020!H\u0016JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "Lcom/squareup/wire/Message;", "", "loading_duration", "", "total_duration", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "has_loading_at_exit", "", "number_of_unique_elements", "", "number_of_unique_elements_at_exit", "unknownFields", "Lokio/ByteString;", "<init>", "(JJLcom/robinhood/rosetta/eventlogging/Screen;ZIILokio/ByteString;)V", "getLoading_duration", "()J", "getTotal_duration", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getHas_loading_at_exit", "()Z", "getNumber_of_unique_elements", "()I", "getNumber_of_unique_elements_at_exit", "newBuilder", "equals", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerceivedLoadingTimeEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PerceivedLoadingTimeEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasLoadingAtExit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean has_loading_at_exit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "loadingDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long loading_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfUniqueElements", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int number_of_unique_elements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfUniqueElementsAtExit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int number_of_unique_elements_at_exit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Screen screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "totalDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long total_duration;

    public PerceivedLoadingTimeEventData() {
        this(0L, 0L, null, false, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24470newBuilder();
    }

    public final long getLoading_duration() {
        return this.loading_duration;
    }

    public final long getTotal_duration() {
        return this.total_duration;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final boolean getHas_loading_at_exit() {
        return this.has_loading_at_exit;
    }

    public final int getNumber_of_unique_elements() {
        return this.number_of_unique_elements;
    }

    public final int getNumber_of_unique_elements_at_exit() {
        return this.number_of_unique_elements_at_exit;
    }

    public /* synthetic */ PerceivedLoadingTimeEventData(long j, long j2, Screen screen, boolean z, int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? null : screen, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceivedLoadingTimeEventData(long j, long j2, Screen screen, boolean z, int i, int i2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.loading_duration = j;
        this.total_duration = j2;
        this.screen = screen;
        this.has_loading_at_exit = z;
        this.number_of_unique_elements = i;
        this.number_of_unique_elements_at_exit = i2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24470newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerceivedLoadingTimeEventData)) {
            return false;
        }
        PerceivedLoadingTimeEventData perceivedLoadingTimeEventData = (PerceivedLoadingTimeEventData) other;
        return Intrinsics.areEqual(unknownFields(), perceivedLoadingTimeEventData.unknownFields()) && this.loading_duration == perceivedLoadingTimeEventData.loading_duration && this.total_duration == perceivedLoadingTimeEventData.total_duration && Intrinsics.areEqual(this.screen, perceivedLoadingTimeEventData.screen) && this.has_loading_at_exit == perceivedLoadingTimeEventData.has_loading_at_exit && this.number_of_unique_elements == perceivedLoadingTimeEventData.number_of_unique_elements && this.number_of_unique_elements_at_exit == perceivedLoadingTimeEventData.number_of_unique_elements_at_exit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Long.hashCode(this.loading_duration)) * 37) + Long.hashCode(this.total_duration)) * 37;
        Screen screen = this.screen;
        int iHashCode2 = ((((((iHashCode + (screen != null ? screen.hashCode() : 0)) * 37) + java.lang.Boolean.hashCode(this.has_loading_at_exit)) * 37) + Integer.hashCode(this.number_of_unique_elements)) * 37) + Integer.hashCode(this.number_of_unique_elements_at_exit);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("loading_duration=" + this.loading_duration);
        arrayList.add("total_duration=" + this.total_duration);
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        arrayList.add("has_loading_at_exit=" + this.has_loading_at_exit);
        arrayList.add("number_of_unique_elements=" + this.number_of_unique_elements);
        arrayList.add("number_of_unique_elements_at_exit=" + this.number_of_unique_elements_at_exit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerceivedLoadingTimeEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerceivedLoadingTimeEventData copy$default(PerceivedLoadingTimeEventData perceivedLoadingTimeEventData, long j, long j2, Screen screen, boolean z, int i, int i2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = perceivedLoadingTimeEventData.loading_duration;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = perceivedLoadingTimeEventData.total_duration;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            screen = perceivedLoadingTimeEventData.screen;
        }
        return perceivedLoadingTimeEventData.copy(j3, j4, screen, (i3 & 8) != 0 ? perceivedLoadingTimeEventData.has_loading_at_exit : z, (i3 & 16) != 0 ? perceivedLoadingTimeEventData.number_of_unique_elements : i, (i3 & 32) != 0 ? perceivedLoadingTimeEventData.number_of_unique_elements_at_exit : i2, (i3 & 64) != 0 ? perceivedLoadingTimeEventData.unknownFields() : byteString);
    }

    public final PerceivedLoadingTimeEventData copy(long loading_duration, long total_duration, Screen screen, boolean has_loading_at_exit, int number_of_unique_elements, int number_of_unique_elements_at_exit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerceivedLoadingTimeEventData(loading_duration, total_duration, screen, has_loading_at_exit, number_of_unique_elements, number_of_unique_elements_at_exit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerceivedLoadingTimeEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerceivedLoadingTimeEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerceivedLoadingTimeEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLoading_duration() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getLoading_duration()));
                }
                if (value.getTotal_duration() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getTotal_duration()));
                }
                if (value.getScreen() != null) {
                    size += Screen.ADAPTER.encodedSizeWithTag(3, value.getScreen());
                }
                if (value.getHas_loading_at_exit()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, java.lang.Boolean.valueOf(value.getHas_loading_at_exit()));
                }
                if (value.getNumber_of_unique_elements() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getNumber_of_unique_elements()));
                }
                return value.getNumber_of_unique_elements_at_exit() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getNumber_of_unique_elements_at_exit())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerceivedLoadingTimeEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLoading_duration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getLoading_duration()));
                }
                if (value.getTotal_duration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTotal_duration()));
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 3, (int) value.getScreen());
                }
                if (value.getHas_loading_at_exit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getHas_loading_at_exit()));
                }
                if (value.getNumber_of_unique_elements() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getNumber_of_unique_elements()));
                }
                if (value.getNumber_of_unique_elements_at_exit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getNumber_of_unique_elements_at_exit()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerceivedLoadingTimeEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNumber_of_unique_elements_at_exit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getNumber_of_unique_elements_at_exit()));
                }
                if (value.getNumber_of_unique_elements() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getNumber_of_unique_elements()));
                }
                if (value.getHas_loading_at_exit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getHas_loading_at_exit()));
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 3, (int) value.getScreen());
                }
                if (value.getTotal_duration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTotal_duration()));
                }
                if (value.getLoading_duration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getLoading_duration()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerceivedLoadingTimeEventData redact(PerceivedLoadingTimeEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Screen screen = value.getScreen();
                return PerceivedLoadingTimeEventData.copy$default(value, 0L, 0L, screen != null ? Screen.ADAPTER.redact(screen) : null, false, 0, 0, ByteString.EMPTY, 59, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerceivedLoadingTimeEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Screen screenDecode = null;
                long jLongValue = 0;
                long jLongValue2 = 0;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                int iIntValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 2:
                                jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 3:
                                screenDecode = Screen.ADAPTER.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PerceivedLoadingTimeEventData(jLongValue, jLongValue2, screenDecode, zBooleanValue, iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
