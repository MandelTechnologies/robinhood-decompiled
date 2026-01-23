package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.util.notification.RhGcmListenerService;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ReturnDriverDigestItem.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;", "Lcom/squareup/wire/Message;", "", "ticker", "", "security_name", RhGcmListenerService.EXTRA_CATEGORY, "change_pct", "", "weight", ErrorBundle.DETAIL_ENTRY, "instrument_type", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "instrument_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentType;Ljava/lang/String;Lokio/ByteString;)V", "getTicker", "()Ljava/lang/String;", "getSecurity_name", "getCategory", "getChange_pct", "()F", "getWeight", "getDetails", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentType;", "getInstrument_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ReturnDriverDigestItem extends Message {

    @JvmField
    public static final ProtoAdapter<ReturnDriverDigestItem> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "changePct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float change_pct;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "securityName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String security_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ticker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final float weight;

    public ReturnDriverDigestItem() {
        this(null, null, null, 0.0f, 0.0f, null, null, null, null, 511, null);
    }

    public /* synthetic */ ReturnDriverDigestItem(String str, String str2, String str3, float f, float f2, String str4, InstrumentType instrumentType, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? 0.0f : f2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22163newBuilder();
    }

    public final String getTicker() {
        return this.ticker;
    }

    public final String getSecurity_name() {
        return this.security_name;
    }

    public final String getCategory() {
        return this.category;
    }

    public final float getChange_pct() {
        return this.change_pct;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final String getDetails() {
        return this.details;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnDriverDigestItem(String ticker, String security_name, String category, float f, float f2, String details, InstrumentType instrument_type, String instrument_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(security_name, "security_name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ticker = ticker;
        this.security_name = security_name;
        this.category = category;
        this.change_pct = f;
        this.weight = f2;
        this.details = details;
        this.instrument_type = instrument_type;
        this.instrument_id = instrument_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22163newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReturnDriverDigestItem)) {
            return false;
        }
        ReturnDriverDigestItem returnDriverDigestItem = (ReturnDriverDigestItem) other;
        return Intrinsics.areEqual(unknownFields(), returnDriverDigestItem.unknownFields()) && Intrinsics.areEqual(this.ticker, returnDriverDigestItem.ticker) && Intrinsics.areEqual(this.security_name, returnDriverDigestItem.security_name) && Intrinsics.areEqual(this.category, returnDriverDigestItem.category) && this.change_pct == returnDriverDigestItem.change_pct && this.weight == returnDriverDigestItem.weight && Intrinsics.areEqual(this.details, returnDriverDigestItem.details) && this.instrument_type == returnDriverDigestItem.instrument_type && Intrinsics.areEqual(this.instrument_id, returnDriverDigestItem.instrument_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.ticker.hashCode()) * 37) + this.security_name.hashCode()) * 37) + this.category.hashCode()) * 37) + Float.hashCode(this.change_pct)) * 37) + Float.hashCode(this.weight)) * 37) + this.details.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + this.instrument_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ticker=" + Internal.sanitize(this.ticker));
        arrayList.add("security_name=" + Internal.sanitize(this.security_name));
        arrayList.add("category=" + Internal.sanitize(this.category));
        arrayList.add("change_pct=" + this.change_pct);
        arrayList.add("weight=" + this.weight);
        arrayList.add("details=" + Internal.sanitize(this.details));
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReturnDriverDigestItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReturnDriverDigestItem copy$default(ReturnDriverDigestItem returnDriverDigestItem, String str, String str2, String str3, float f, float f2, String str4, InstrumentType instrumentType, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnDriverDigestItem.ticker;
        }
        if ((i & 2) != 0) {
            str2 = returnDriverDigestItem.security_name;
        }
        if ((i & 4) != 0) {
            str3 = returnDriverDigestItem.category;
        }
        if ((i & 8) != 0) {
            f = returnDriverDigestItem.change_pct;
        }
        if ((i & 16) != 0) {
            f2 = returnDriverDigestItem.weight;
        }
        if ((i & 32) != 0) {
            str4 = returnDriverDigestItem.details;
        }
        if ((i & 64) != 0) {
            instrumentType = returnDriverDigestItem.instrument_type;
        }
        if ((i & 128) != 0) {
            str5 = returnDriverDigestItem.instrument_id;
        }
        if ((i & 256) != 0) {
            byteString = returnDriverDigestItem.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        InstrumentType instrumentType2 = instrumentType;
        float f3 = f2;
        String str8 = str3;
        return returnDriverDigestItem.copy(str, str2, str8, f, f3, str7, instrumentType2, str6, byteString2);
    }

    public final ReturnDriverDigestItem copy(String ticker, String security_name, String category, float change_pct, float weight, String details, InstrumentType instrument_type, String instrument_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(security_name, "security_name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReturnDriverDigestItem(ticker, security_name, category, change_pct, weight, details, instrument_type, instrument_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReturnDriverDigestItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReturnDriverDigestItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.ReturnDriverDigestItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReturnDriverDigestItem value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTicker());
                }
                if (!Intrinsics.areEqual(value.getSecurity_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSecurity_name());
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCategory());
                }
                if (!Float.valueOf(value.getChange_pct()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getChange_pct()));
                }
                if (!Float.valueOf(value.getWeight()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getWeight()));
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDetails());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(7, value.getInstrument_type());
                }
                return !Intrinsics.areEqual(value.getInstrument_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getInstrument_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReturnDriverDigestItem value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTicker());
                }
                if (!Intrinsics.areEqual(value.getSecurity_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecurity_name());
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCategory());
                }
                if (!Float.valueOf(value.getChange_pct()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getChange_pct()));
                }
                if (!Float.valueOf(value.getWeight()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getWeight()));
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDetails());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstrument_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReturnDriverDigestItem value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstrument_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDetails());
                }
                if (!Float.valueOf(value.getWeight()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getWeight()));
                }
                if (!Float.valueOf(value.getChange_pct()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getChange_pct()));
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getSecurity_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecurity_name());
                }
                if (Intrinsics.areEqual(value.getTicker(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTicker());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReturnDriverDigestItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                InstrumentType instrumentTypeDecode = instrumentType;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 5:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ReturnDriverDigestItem(strDecode5, strDecode, strDecode2, fFloatValue, fFloatValue2, strDecode3, instrumentTypeDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReturnDriverDigestItem redact(ReturnDriverDigestItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ReturnDriverDigestItem.copy$default(value, null, null, null, 0.0f, 0.0f, null, null, null, ByteString.EMPTY, 255, null);
            }
        };
    }
}
