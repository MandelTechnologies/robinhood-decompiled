package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
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

/* compiled from: DebitCardSCAEventData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventData;", "Lcom/squareup/wire/Message;", "", "type", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "relationship_id", "duration", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getType", "()Ljava/lang/String;", "getTransfer_id", "getRelationship_id", "getDuration", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DebitCardSCAEventData extends Message {

    @JvmField
    public static final ProtoAdapter<DebitCardSCAEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String relationship_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String transfer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    public DebitCardSCAEventData() {
        this(null, null, null, 0, null, 31, null);
    }

    public /* synthetic */ DebitCardSCAEventData(String str, String str2, String str3, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24189newBuilder();
    }

    public final String getType() {
        return this.type;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final String getRelationship_id() {
        return this.relationship_id;
    }

    public final int getDuration() {
        return this.duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardSCAEventData(String type2, String transfer_id, String relationship_id, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.transfer_id = transfer_id;
        this.relationship_id = relationship_id;
        this.duration = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24189newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DebitCardSCAEventData)) {
            return false;
        }
        DebitCardSCAEventData debitCardSCAEventData = (DebitCardSCAEventData) other;
        return Intrinsics.areEqual(unknownFields(), debitCardSCAEventData.unknownFields()) && Intrinsics.areEqual(this.type, debitCardSCAEventData.type) && Intrinsics.areEqual(this.transfer_id, debitCardSCAEventData.transfer_id) && Intrinsics.areEqual(this.relationship_id, debitCardSCAEventData.relationship_id) && this.duration == debitCardSCAEventData.duration;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.transfer_id.hashCode()) * 37) + this.relationship_id.hashCode()) * 37) + Integer.hashCode(this.duration);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("relationship_id=" + Internal.sanitize(this.relationship_id));
        arrayList.add("duration=" + this.duration);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DebitCardSCAEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DebitCardSCAEventData copy$default(DebitCardSCAEventData debitCardSCAEventData, String str, String str2, String str3, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = debitCardSCAEventData.type;
        }
        if ((i2 & 2) != 0) {
            str2 = debitCardSCAEventData.transfer_id;
        }
        if ((i2 & 4) != 0) {
            str3 = debitCardSCAEventData.relationship_id;
        }
        if ((i2 & 8) != 0) {
            i = debitCardSCAEventData.duration;
        }
        if ((i2 & 16) != 0) {
            byteString = debitCardSCAEventData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return debitCardSCAEventData.copy(str, str2, str4, i, byteString2);
    }

    public final DebitCardSCAEventData copy(String type2, String transfer_id, String relationship_id, int duration, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DebitCardSCAEventData(type2, transfer_id, relationship_id, duration, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DebitCardSCAEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DebitCardSCAEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DebitCardSCAEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DebitCardSCAEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRelationship_id());
                }
                return value.getDuration() != 0 ? size + ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getDuration())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DebitCardSCAEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRelationship_id());
                }
                if (value.getDuration() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDuration()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DebitCardSCAEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDuration() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRelationship_id());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                }
                if (Intrinsics.areEqual(value.getType(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DebitCardSCAEventData redact(DebitCardSCAEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DebitCardSCAEventData.copy$default(value, null, null, null, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DebitCardSCAEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                int iIntValue = 0;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DebitCardSCAEventData(strDecode, strDecode3, strDecode2, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
