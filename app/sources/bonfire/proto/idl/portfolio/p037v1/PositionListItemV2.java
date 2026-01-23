package bonfire.proto.idl.portfolio.p037v1;

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

/* compiled from: PositionListItemV2.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2;", "Lcom/squareup/wire/Message;", "", "account_number", "", "instrument_id", "polling_rate", "", "instrument_type", "deeplink", "metadata", "Lbonfire/proto/idl/portfolio/v1/PositionMetadata;", "swiping_behaviors", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionMetadata;Ljava/util/List;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInstrument_id", "getPolling_rate", "()F", "getInstrument_type", "getDeeplink", "getMetadata", "()Lbonfire/proto/idl/portfolio/v1/PositionMetadata;", "getSwiping_behaviors", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionListItemV2 extends Message {

    @JvmField
    public static final ProtoAdapter<PositionListItemV2> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String instrument_type;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final PositionMetadata metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float polling_rate;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionSwipeBehavior#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<PositionSwipeBehavior> swiping_behaviors;

    public PositionListItemV2() {
        this(null, null, 0.0f, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ PositionListItemV2(String str, String str2, float f, String str3, String str4, PositionMetadata positionMetadata, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : positionMetadata, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9030newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final float getPolling_rate() {
        return this.polling_rate;
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final PositionMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionListItemV2(String account_number, String instrument_id, float f, String instrument_type, String deeplink, PositionMetadata positionMetadata, List<PositionSwipeBehavior> swiping_behaviors, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.instrument_id = instrument_id;
        this.polling_rate = f;
        this.instrument_type = instrument_type;
        this.deeplink = deeplink;
        this.metadata = positionMetadata;
        this.swiping_behaviors = Internal.immutableCopyOf("swiping_behaviors", swiping_behaviors);
    }

    public final List<PositionSwipeBehavior> getSwiping_behaviors() {
        return this.swiping_behaviors;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9030newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionListItemV2)) {
            return false;
        }
        PositionListItemV2 positionListItemV2 = (PositionListItemV2) other;
        return Intrinsics.areEqual(unknownFields(), positionListItemV2.unknownFields()) && Intrinsics.areEqual(this.account_number, positionListItemV2.account_number) && Intrinsics.areEqual(this.instrument_id, positionListItemV2.instrument_id) && this.polling_rate == positionListItemV2.polling_rate && Intrinsics.areEqual(this.instrument_type, positionListItemV2.instrument_type) && Intrinsics.areEqual(this.deeplink, positionListItemV2.deeplink) && Intrinsics.areEqual(this.metadata, positionListItemV2.metadata) && Intrinsics.areEqual(this.swiping_behaviors, positionListItemV2.swiping_behaviors);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + Float.hashCode(this.polling_rate)) * 37) + this.instrument_type.hashCode()) * 37) + this.deeplink.hashCode()) * 37;
        PositionMetadata positionMetadata = this.metadata;
        int iHashCode2 = ((iHashCode + (positionMetadata != null ? positionMetadata.hashCode() : 0)) * 37) + this.swiping_behaviors.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("polling_rate=" + this.polling_rate);
        arrayList.add("instrument_type=" + Internal.sanitize(this.instrument_type));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        PositionMetadata positionMetadata = this.metadata;
        if (positionMetadata != null) {
            arrayList.add("metadata=" + positionMetadata);
        }
        if (!this.swiping_behaviors.isEmpty()) {
            arrayList.add("swiping_behaviors=" + this.swiping_behaviors);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionListItemV2{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PositionListItemV2 copy$default(PositionListItemV2 positionListItemV2, String str, String str2, float f, String str3, String str4, PositionMetadata positionMetadata, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionListItemV2.account_number;
        }
        if ((i & 2) != 0) {
            str2 = positionListItemV2.instrument_id;
        }
        if ((i & 4) != 0) {
            f = positionListItemV2.polling_rate;
        }
        if ((i & 8) != 0) {
            str3 = positionListItemV2.instrument_type;
        }
        if ((i & 16) != 0) {
            str4 = positionListItemV2.deeplink;
        }
        if ((i & 32) != 0) {
            positionMetadata = positionListItemV2.metadata;
        }
        if ((i & 64) != 0) {
            list = positionListItemV2.swiping_behaviors;
        }
        if ((i & 128) != 0) {
            byteString = positionListItemV2.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        String str5 = str4;
        PositionMetadata positionMetadata2 = positionMetadata;
        return positionListItemV2.copy(str, str2, f, str3, str5, positionMetadata2, list2, byteString2);
    }

    public final PositionListItemV2 copy(String account_number, String instrument_id, float polling_rate, String instrument_type, String deeplink, PositionMetadata metadata, List<PositionSwipeBehavior> swiping_behaviors, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionListItemV2(account_number, instrument_id, polling_rate, instrument_type, deeplink, metadata, swiping_behaviors, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionListItemV2.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionListItemV2>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.PositionListItemV2$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionListItemV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (!Float.valueOf(value.getPolling_rate()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getPolling_rate()));
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDeeplink());
                }
                if (value.getMetadata() != null) {
                    size += PositionMetadata.ADAPTER.encodedSizeWithTag(6, value.getMetadata());
                }
                return size + PositionSwipeBehavior.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getSwiping_behaviors());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionListItemV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (!Float.valueOf(value.getPolling_rate()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getPolling_rate()));
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeeplink());
                }
                if (value.getMetadata() != null) {
                    PositionMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getMetadata());
                }
                PositionSwipeBehavior.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getSwiping_behaviors());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionListItemV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PositionSwipeBehavior.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getSwiping_behaviors());
                if (value.getMetadata() != null) {
                    PositionMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getMetadata());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (!Float.valueOf(value.getPolling_rate()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getPolling_rate()));
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionListItemV2 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                float fFloatValue = 0.0f;
                PositionMetadata positionMetadataDecode = null;
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
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                positionMetadataDecode = PositionMetadata.ADAPTER.decode(reader);
                                break;
                            case 7:
                                arrayList.add(PositionSwipeBehavior.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PositionListItemV2(strDecode, strDecode3, fFloatValue, strDecode4, strDecode2, positionMetadataDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionListItemV2 redact(PositionListItemV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PositionMetadata metadata = value.getMetadata();
                return PositionListItemV2.copy$default(value, null, null, 0.0f, null, null, metadata != null ? PositionMetadata.ADAPTER.redact(metadata) : null, Internal.m26823redactElements(value.getSwiping_behaviors(), PositionSwipeBehavior.ADAPTER), ByteString.EMPTY, 31, null);
            }
        };
    }
}
