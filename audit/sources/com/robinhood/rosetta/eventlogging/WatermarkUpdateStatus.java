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

/* compiled from: WatermarkUpdateStatus.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateStatus;", "Lcom/squareup/wire/Message;", "", "watermark_update", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "success", "", "error_message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;ZLjava/lang/String;Lokio/ByteString;)V", "getWatermark_update", "()Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "getSuccess", "()Z", "getError_message", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WatermarkUpdateStatus extends Message {

    @JvmField
    public static final ProtoAdapter<WatermarkUpdateStatus> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean success;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WatermarkUpdate#ADAPTER", jsonName = "watermarkUpdate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final WatermarkUpdate watermark_update;

    public WatermarkUpdateStatus() {
        this(null, false, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24607newBuilder();
    }

    public final WatermarkUpdate getWatermark_update() {
        return this.watermark_update;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public /* synthetic */ WatermarkUpdateStatus(WatermarkUpdate watermarkUpdate, boolean z, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : watermarkUpdate, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkUpdateStatus(WatermarkUpdate watermarkUpdate, boolean z, String error_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.watermark_update = watermarkUpdate;
        this.success = z;
        this.error_message = error_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24607newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WatermarkUpdateStatus)) {
            return false;
        }
        WatermarkUpdateStatus watermarkUpdateStatus = (WatermarkUpdateStatus) other;
        return Intrinsics.areEqual(unknownFields(), watermarkUpdateStatus.unknownFields()) && Intrinsics.areEqual(this.watermark_update, watermarkUpdateStatus.watermark_update) && this.success == watermarkUpdateStatus.success && Intrinsics.areEqual(this.error_message, watermarkUpdateStatus.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        WatermarkUpdate watermarkUpdate = this.watermark_update;
        int iHashCode2 = ((((iHashCode + (watermarkUpdate != null ? watermarkUpdate.hashCode() : 0)) * 37) + java.lang.Boolean.hashCode(this.success)) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        WatermarkUpdate watermarkUpdate = this.watermark_update;
        if (watermarkUpdate != null) {
            arrayList.add("watermark_update=" + watermarkUpdate);
        }
        arrayList.add("success=" + this.success);
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "WatermarkUpdateStatus{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WatermarkUpdateStatus copy$default(WatermarkUpdateStatus watermarkUpdateStatus, WatermarkUpdate watermarkUpdate, boolean z, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            watermarkUpdate = watermarkUpdateStatus.watermark_update;
        }
        if ((i & 2) != 0) {
            z = watermarkUpdateStatus.success;
        }
        if ((i & 4) != 0) {
            str = watermarkUpdateStatus.error_message;
        }
        if ((i & 8) != 0) {
            byteString = watermarkUpdateStatus.unknownFields();
        }
        return watermarkUpdateStatus.copy(watermarkUpdate, z, str, byteString);
    }

    public final WatermarkUpdateStatus copy(WatermarkUpdate watermark_update, boolean success, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WatermarkUpdateStatus(watermark_update, success, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WatermarkUpdateStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WatermarkUpdateStatus>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WatermarkUpdateStatus$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WatermarkUpdateStatus value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getWatermark_update() != null) {
                    size += WatermarkUpdate.ADAPTER.encodedSizeWithTag(1, value.getWatermark_update());
                }
                if (value.getSuccess()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getSuccess()));
                }
                return !Intrinsics.areEqual(value.getError_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WatermarkUpdateStatus value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getWatermark_update() != null) {
                    WatermarkUpdate.ADAPTER.encodeWithTag(writer, 1, (int) value.getWatermark_update());
                }
                if (value.getSuccess()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getSuccess()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WatermarkUpdateStatus value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                if (value.getSuccess()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getSuccess()));
                }
                if (value.getWatermark_update() != null) {
                    WatermarkUpdate.ADAPTER.encodeWithTag(writer, 1, (int) value.getWatermark_update());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WatermarkUpdateStatus redact(WatermarkUpdateStatus value) {
                Intrinsics.checkNotNullParameter(value, "value");
                WatermarkUpdate watermark_update = value.getWatermark_update();
                return WatermarkUpdateStatus.copy$default(value, watermark_update != null ? WatermarkUpdate.ADAPTER.redact(watermark_update) : null, false, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WatermarkUpdateStatus decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                WatermarkUpdate watermarkUpdateDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WatermarkUpdateStatus(watermarkUpdateDecode, zBooleanValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        watermarkUpdateDecode = WatermarkUpdate.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
