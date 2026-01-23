package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CatpayOrderEventData.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J`\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "Lcom/squareup/wire/Message;", "", "session_id", "", "step", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;", "funding_source", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;", "error", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderError;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;", "client", "Lcom/robinhood/rosetta/eventlogging/CatpayClient;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;Lcom/robinhood/rosetta/eventlogging/CatpayOrderError;Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;Lcom/robinhood/rosetta/eventlogging/CatpayClient;Lokio/ByteString;)V", "getSession_id", "()Ljava/lang/String;", "getStep", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;", "getFunding_source", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;", "getError", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderError;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;", "getClient", "()Lcom/robinhood/rosetta/eventlogging/CatpayClient;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CatpayOrderStep", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayOrderEventData extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayOrderEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayClient#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final CatpayClient client;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderError#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CatpayOrderError error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayFundingSource#ADAPTER", jsonName = "fundingSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CatpayFundingSource funding_source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CatpayOrderMeta meta;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CatpayOrderPayload payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderEventData$CatpayOrderStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CatpayOrderStep step;

    public CatpayOrderEventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24057newBuilder();
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public /* synthetic */ CatpayOrderEventData(String str, CatpayOrderStep catpayOrderStep, CatpayOrderPayload catpayOrderPayload, CatpayFundingSource catpayFundingSource, CatpayOrderError catpayOrderError, CatpayOrderMeta catpayOrderMeta, CatpayClient catpayClient, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CatpayOrderStep.FLOW_STEP_UNSPECIFIED : catpayOrderStep, (i & 4) != 0 ? null : catpayOrderPayload, (i & 8) != 0 ? null : catpayFundingSource, (i & 16) != 0 ? null : catpayOrderError, (i & 32) != 0 ? null : catpayOrderMeta, (i & 64) != 0 ? null : catpayClient, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CatpayOrderStep getStep() {
        return this.step;
    }

    public final CatpayOrderPayload getPayload() {
        return this.payload;
    }

    public final CatpayFundingSource getFunding_source() {
        return this.funding_source;
    }

    public final CatpayOrderError getError() {
        return this.error;
    }

    public final CatpayOrderMeta getMeta() {
        return this.meta;
    }

    public final CatpayClient getClient() {
        return this.client;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayOrderEventData(String session_id, CatpayOrderStep step, CatpayOrderPayload catpayOrderPayload, CatpayFundingSource catpayFundingSource, CatpayOrderError catpayOrderError, CatpayOrderMeta catpayOrderMeta, CatpayClient catpayClient, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.session_id = session_id;
        this.step = step;
        this.payload = catpayOrderPayload;
        this.funding_source = catpayFundingSource;
        this.error = catpayOrderError;
        this.meta = catpayOrderMeta;
        this.client = catpayClient;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24057newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayOrderEventData)) {
            return false;
        }
        CatpayOrderEventData catpayOrderEventData = (CatpayOrderEventData) other;
        return Intrinsics.areEqual(unknownFields(), catpayOrderEventData.unknownFields()) && Intrinsics.areEqual(this.session_id, catpayOrderEventData.session_id) && this.step == catpayOrderEventData.step && Intrinsics.areEqual(this.payload, catpayOrderEventData.payload) && Intrinsics.areEqual(this.funding_source, catpayOrderEventData.funding_source) && Intrinsics.areEqual(this.error, catpayOrderEventData.error) && Intrinsics.areEqual(this.meta, catpayOrderEventData.meta) && Intrinsics.areEqual(this.client, catpayOrderEventData.client);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.session_id.hashCode()) * 37) + this.step.hashCode()) * 37;
        CatpayOrderPayload catpayOrderPayload = this.payload;
        int iHashCode2 = (iHashCode + (catpayOrderPayload != null ? catpayOrderPayload.hashCode() : 0)) * 37;
        CatpayFundingSource catpayFundingSource = this.funding_source;
        int iHashCode3 = (iHashCode2 + (catpayFundingSource != null ? catpayFundingSource.hashCode() : 0)) * 37;
        CatpayOrderError catpayOrderError = this.error;
        int iHashCode4 = (iHashCode3 + (catpayOrderError != null ? catpayOrderError.hashCode() : 0)) * 37;
        CatpayOrderMeta catpayOrderMeta = this.meta;
        int iHashCode5 = (iHashCode4 + (catpayOrderMeta != null ? catpayOrderMeta.hashCode() : 0)) * 37;
        CatpayClient catpayClient = this.client;
        int iHashCode6 = iHashCode5 + (catpayClient != null ? catpayClient.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("step=" + this.step);
        CatpayOrderPayload catpayOrderPayload = this.payload;
        if (catpayOrderPayload != null) {
            arrayList.add("payload=" + catpayOrderPayload);
        }
        CatpayFundingSource catpayFundingSource = this.funding_source;
        if (catpayFundingSource != null) {
            arrayList.add("funding_source=" + catpayFundingSource);
        }
        CatpayOrderError catpayOrderError = this.error;
        if (catpayOrderError != null) {
            arrayList.add("error=" + catpayOrderError);
        }
        CatpayOrderMeta catpayOrderMeta = this.meta;
        if (catpayOrderMeta != null) {
            arrayList.add("meta=" + catpayOrderMeta);
        }
        CatpayClient catpayClient = this.client;
        if (catpayClient != null) {
            arrayList.add("client=" + catpayClient);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayOrderEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CatpayOrderEventData copy$default(CatpayOrderEventData catpayOrderEventData, String str, CatpayOrderStep catpayOrderStep, CatpayOrderPayload catpayOrderPayload, CatpayFundingSource catpayFundingSource, CatpayOrderError catpayOrderError, CatpayOrderMeta catpayOrderMeta, CatpayClient catpayClient, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catpayOrderEventData.session_id;
        }
        if ((i & 2) != 0) {
            catpayOrderStep = catpayOrderEventData.step;
        }
        if ((i & 4) != 0) {
            catpayOrderPayload = catpayOrderEventData.payload;
        }
        if ((i & 8) != 0) {
            catpayFundingSource = catpayOrderEventData.funding_source;
        }
        if ((i & 16) != 0) {
            catpayOrderError = catpayOrderEventData.error;
        }
        if ((i & 32) != 0) {
            catpayOrderMeta = catpayOrderEventData.meta;
        }
        if ((i & 64) != 0) {
            catpayClient = catpayOrderEventData.client;
        }
        if ((i & 128) != 0) {
            byteString = catpayOrderEventData.unknownFields();
        }
        CatpayClient catpayClient2 = catpayClient;
        ByteString byteString2 = byteString;
        CatpayOrderError catpayOrderError2 = catpayOrderError;
        CatpayOrderMeta catpayOrderMeta2 = catpayOrderMeta;
        return catpayOrderEventData.copy(str, catpayOrderStep, catpayOrderPayload, catpayFundingSource, catpayOrderError2, catpayOrderMeta2, catpayClient2, byteString2);
    }

    public final CatpayOrderEventData copy(String session_id, CatpayOrderStep step, CatpayOrderPayload payload, CatpayFundingSource funding_source, CatpayOrderError error, CatpayOrderMeta meta, CatpayClient client, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayOrderEventData(session_id, step, payload, funding_source, error, meta, client, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayOrderEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayOrderEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSession_id());
                }
                if (value.getStep() != CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED) {
                    size += CatpayOrderEventData.CatpayOrderStep.ADAPTER.encodedSizeWithTag(2, value.getStep());
                }
                if (value.getPayload() != null) {
                    size += CatpayOrderPayload.ADAPTER.encodedSizeWithTag(3, value.getPayload());
                }
                if (value.getFunding_source() != null) {
                    size += CatpayFundingSource.ADAPTER.encodedSizeWithTag(4, value.getFunding_source());
                }
                if (value.getError() != null) {
                    size += CatpayOrderError.ADAPTER.encodedSizeWithTag(5, value.getError());
                }
                if (value.getMeta() != null) {
                    size += CatpayOrderMeta.ADAPTER.encodedSizeWithTag(6, value.getMeta());
                }
                return value.getClient() != null ? size + CatpayClient.ADAPTER.encodedSizeWithTag(7, value.getClient()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
                }
                if (value.getStep() != CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED) {
                    CatpayOrderEventData.CatpayOrderStep.ADAPTER.encodeWithTag(writer, 2, (int) value.getStep());
                }
                if (value.getPayload() != null) {
                    CatpayOrderPayload.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayload());
                }
                if (value.getFunding_source() != null) {
                    CatpayFundingSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getFunding_source());
                }
                if (value.getError() != null) {
                    CatpayOrderError.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                if (value.getMeta() != null) {
                    CatpayOrderMeta.ADAPTER.encodeWithTag(writer, 6, (int) value.getMeta());
                }
                if (value.getClient() != null) {
                    CatpayClient.ADAPTER.encodeWithTag(writer, 7, (int) value.getClient());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getClient() != null) {
                    CatpayClient.ADAPTER.encodeWithTag(writer, 7, (int) value.getClient());
                }
                if (value.getMeta() != null) {
                    CatpayOrderMeta.ADAPTER.encodeWithTag(writer, 6, (int) value.getMeta());
                }
                if (value.getError() != null) {
                    CatpayOrderError.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                if (value.getFunding_source() != null) {
                    CatpayFundingSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getFunding_source());
                }
                if (value.getPayload() != null) {
                    CatpayOrderPayload.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayload());
                }
                if (value.getStep() != CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED) {
                    CatpayOrderEventData.CatpayOrderStep.ADAPTER.encodeWithTag(writer, 2, (int) value.getStep());
                }
                if (Intrinsics.areEqual(value.getSession_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CatpayOrderEventData.CatpayOrderStep catpayOrderStepDecode = CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CatpayOrderPayload catpayOrderPayloadDecode = null;
                CatpayFundingSource catpayFundingSourceDecode = null;
                CatpayOrderError catpayOrderErrorDecode = null;
                CatpayOrderMeta catpayOrderMetaDecode = null;
                CatpayClient catpayClientDecode = null;
                String strDecode = "";
                while (true) {
                    CatpayOrderEventData.CatpayOrderStep catpayOrderStep = catpayOrderStepDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        catpayOrderStepDecode = CatpayOrderEventData.CatpayOrderStep.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    catpayOrderPayloadDecode = CatpayOrderPayload.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    catpayFundingSourceDecode = CatpayFundingSource.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    catpayOrderErrorDecode = CatpayOrderError.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    catpayOrderMetaDecode = CatpayOrderMeta.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    catpayClientDecode = CatpayClient.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new CatpayOrderEventData(strDecode, catpayOrderStep, catpayOrderPayloadDecode, catpayFundingSourceDecode, catpayOrderErrorDecode, catpayOrderMetaDecode, catpayClientDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderEventData redact(CatpayOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CatpayOrderPayload payload = value.getPayload();
                CatpayOrderPayload catpayOrderPayloadRedact = payload != null ? CatpayOrderPayload.ADAPTER.redact(payload) : null;
                CatpayFundingSource funding_source = value.getFunding_source();
                CatpayFundingSource catpayFundingSourceRedact = funding_source != null ? CatpayFundingSource.ADAPTER.redact(funding_source) : null;
                CatpayOrderError error = value.getError();
                CatpayOrderError catpayOrderErrorRedact = error != null ? CatpayOrderError.ADAPTER.redact(error) : null;
                CatpayOrderMeta meta = value.getMeta();
                CatpayOrderMeta catpayOrderMetaRedact = meta != null ? CatpayOrderMeta.ADAPTER.redact(meta) : null;
                CatpayClient client = value.getClient();
                return CatpayOrderEventData.copy$default(value, null, null, catpayOrderPayloadRedact, catpayFundingSourceRedact, catpayOrderErrorRedact, catpayOrderMetaRedact, client != null ? CatpayClient.ADAPTER.redact(client) : null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 #2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FLOW_STEP_UNSPECIFIED", "SELECT_ASSET_SCREEN_READY", "SELECT_ASSET", "SELECT_FUNDING_SOURCE", "AMOUNT_INPUT_SCREEN_READY", "AMOUNT_INPUT_ERROR", "SELECT_NETWORK", "REVIEW", "REVIEW_ERROR", "REVIEW_SUCCESS", "REVIEW_CONTINUE", "SUBMIT", "SUBMIT_ERROR", "SUBMIT_SUCCESS", "MFA_START", "MFA_ERROR", "MFA_SUCCESS", "ENROLLMENT_START", "ENROLLMENT_ERROR", "ENROLLMENT_SUCCESS", "CONFIRM_WALLET_ADDRESS", "LOGIN", "UNAVAILABLE", "FIAT_3DS_START", "FIAT_3DS_SUCCESS", "FIAT_3DS_FAILURE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayOrderStep implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayOrderStep[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CatpayOrderStep> ADAPTER;
        public static final CatpayOrderStep AMOUNT_INPUT_ERROR;
        public static final CatpayOrderStep AMOUNT_INPUT_SCREEN_READY;
        public static final CatpayOrderStep CONFIRM_WALLET_ADDRESS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CatpayOrderStep ENROLLMENT_ERROR;
        public static final CatpayOrderStep ENROLLMENT_START;
        public static final CatpayOrderStep ENROLLMENT_SUCCESS;
        public static final CatpayOrderStep FIAT_3DS_FAILURE;
        public static final CatpayOrderStep FIAT_3DS_START;
        public static final CatpayOrderStep FIAT_3DS_SUCCESS;
        public static final CatpayOrderStep FLOW_STEP_UNSPECIFIED;
        public static final CatpayOrderStep LOGIN;
        public static final CatpayOrderStep MFA_ERROR;
        public static final CatpayOrderStep MFA_START;
        public static final CatpayOrderStep MFA_SUCCESS;
        public static final CatpayOrderStep REVIEW;
        public static final CatpayOrderStep REVIEW_CONTINUE;
        public static final CatpayOrderStep REVIEW_ERROR;
        public static final CatpayOrderStep REVIEW_SUCCESS;
        public static final CatpayOrderStep SELECT_ASSET;
        public static final CatpayOrderStep SELECT_ASSET_SCREEN_READY;
        public static final CatpayOrderStep SELECT_FUNDING_SOURCE;
        public static final CatpayOrderStep SELECT_NETWORK;
        public static final CatpayOrderStep SUBMIT;
        public static final CatpayOrderStep SUBMIT_ERROR;
        public static final CatpayOrderStep SUBMIT_SUCCESS;
        public static final CatpayOrderStep UNAVAILABLE;
        private final int value;

        private static final /* synthetic */ CatpayOrderStep[] $values() {
            return new CatpayOrderStep[]{FLOW_STEP_UNSPECIFIED, SELECT_ASSET_SCREEN_READY, SELECT_ASSET, SELECT_FUNDING_SOURCE, AMOUNT_INPUT_SCREEN_READY, AMOUNT_INPUT_ERROR, SELECT_NETWORK, REVIEW, REVIEW_ERROR, REVIEW_SUCCESS, REVIEW_CONTINUE, SUBMIT, SUBMIT_ERROR, SUBMIT_SUCCESS, MFA_START, MFA_ERROR, MFA_SUCCESS, ENROLLMENT_START, ENROLLMENT_ERROR, ENROLLMENT_SUCCESS, CONFIRM_WALLET_ADDRESS, LOGIN, UNAVAILABLE, FIAT_3DS_START, FIAT_3DS_SUCCESS, FIAT_3DS_FAILURE};
        }

        @JvmStatic
        public static final CatpayOrderStep fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CatpayOrderStep> getEntries() {
            return $ENTRIES;
        }

        private CatpayOrderStep(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CatpayOrderStep catpayOrderStep = new CatpayOrderStep("FLOW_STEP_UNSPECIFIED", 0, 0);
            FLOW_STEP_UNSPECIFIED = catpayOrderStep;
            SELECT_ASSET_SCREEN_READY = new CatpayOrderStep("SELECT_ASSET_SCREEN_READY", 1, 1);
            SELECT_ASSET = new CatpayOrderStep("SELECT_ASSET", 2, 2);
            SELECT_FUNDING_SOURCE = new CatpayOrderStep("SELECT_FUNDING_SOURCE", 3, 3);
            AMOUNT_INPUT_SCREEN_READY = new CatpayOrderStep("AMOUNT_INPUT_SCREEN_READY", 4, 4);
            AMOUNT_INPUT_ERROR = new CatpayOrderStep("AMOUNT_INPUT_ERROR", 5, 5);
            SELECT_NETWORK = new CatpayOrderStep("SELECT_NETWORK", 6, 6);
            REVIEW = new CatpayOrderStep("REVIEW", 7, 7);
            REVIEW_ERROR = new CatpayOrderStep("REVIEW_ERROR", 8, 8);
            REVIEW_SUCCESS = new CatpayOrderStep("REVIEW_SUCCESS", 9, 9);
            REVIEW_CONTINUE = new CatpayOrderStep("REVIEW_CONTINUE", 10, 10);
            SUBMIT = new CatpayOrderStep("SUBMIT", 11, 11);
            SUBMIT_ERROR = new CatpayOrderStep("SUBMIT_ERROR", 12, 12);
            SUBMIT_SUCCESS = new CatpayOrderStep("SUBMIT_SUCCESS", 13, 13);
            MFA_START = new CatpayOrderStep("MFA_START", 14, 14);
            MFA_ERROR = new CatpayOrderStep("MFA_ERROR", 15, 15);
            MFA_SUCCESS = new CatpayOrderStep("MFA_SUCCESS", 16, 16);
            ENROLLMENT_START = new CatpayOrderStep("ENROLLMENT_START", 17, 17);
            ENROLLMENT_ERROR = new CatpayOrderStep("ENROLLMENT_ERROR", 18, 18);
            ENROLLMENT_SUCCESS = new CatpayOrderStep("ENROLLMENT_SUCCESS", 19, 19);
            CONFIRM_WALLET_ADDRESS = new CatpayOrderStep("CONFIRM_WALLET_ADDRESS", 20, 20);
            LOGIN = new CatpayOrderStep("LOGIN", 21, 21);
            UNAVAILABLE = new CatpayOrderStep("UNAVAILABLE", 22, 22);
            FIAT_3DS_START = new CatpayOrderStep("FIAT_3DS_START", 23, 23);
            FIAT_3DS_SUCCESS = new CatpayOrderStep("FIAT_3DS_SUCCESS", 24, 24);
            FIAT_3DS_FAILURE = new CatpayOrderStep("FIAT_3DS_FAILURE", 25, 25);
            CatpayOrderStep[] catpayOrderStepArr$values = $values();
            $VALUES = catpayOrderStepArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayOrderStepArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayOrderStep.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CatpayOrderStep>(orCreateKotlinClass, syntax, catpayOrderStep) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderEventData$CatpayOrderStep$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayOrderEventData.CatpayOrderStep fromValue(int value) {
                    return CatpayOrderEventData.CatpayOrderStep.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayOrderEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CatpayOrderStep fromValue(int value) {
                switch (value) {
                    case 0:
                        return CatpayOrderStep.FLOW_STEP_UNSPECIFIED;
                    case 1:
                        return CatpayOrderStep.SELECT_ASSET_SCREEN_READY;
                    case 2:
                        return CatpayOrderStep.SELECT_ASSET;
                    case 3:
                        return CatpayOrderStep.SELECT_FUNDING_SOURCE;
                    case 4:
                        return CatpayOrderStep.AMOUNT_INPUT_SCREEN_READY;
                    case 5:
                        return CatpayOrderStep.AMOUNT_INPUT_ERROR;
                    case 6:
                        return CatpayOrderStep.SELECT_NETWORK;
                    case 7:
                        return CatpayOrderStep.REVIEW;
                    case 8:
                        return CatpayOrderStep.REVIEW_ERROR;
                    case 9:
                        return CatpayOrderStep.REVIEW_SUCCESS;
                    case 10:
                        return CatpayOrderStep.REVIEW_CONTINUE;
                    case 11:
                        return CatpayOrderStep.SUBMIT;
                    case 12:
                        return CatpayOrderStep.SUBMIT_ERROR;
                    case 13:
                        return CatpayOrderStep.SUBMIT_SUCCESS;
                    case 14:
                        return CatpayOrderStep.MFA_START;
                    case 15:
                        return CatpayOrderStep.MFA_ERROR;
                    case 16:
                        return CatpayOrderStep.MFA_SUCCESS;
                    case 17:
                        return CatpayOrderStep.ENROLLMENT_START;
                    case 18:
                        return CatpayOrderStep.ENROLLMENT_ERROR;
                    case 19:
                        return CatpayOrderStep.ENROLLMENT_SUCCESS;
                    case 20:
                        return CatpayOrderStep.CONFIRM_WALLET_ADDRESS;
                    case 21:
                        return CatpayOrderStep.LOGIN;
                    case 22:
                        return CatpayOrderStep.UNAVAILABLE;
                    case 23:
                        return CatpayOrderStep.FIAT_3DS_START;
                    case 24:
                        return CatpayOrderStep.FIAT_3DS_SUCCESS;
                    case 25:
                        return CatpayOrderStep.FIAT_3DS_FAILURE;
                    default:
                        return null;
                }
            }
        }

        public static CatpayOrderStep valueOf(String str) {
            return (CatpayOrderStep) Enum.valueOf(CatpayOrderStep.class, str);
        }

        public static CatpayOrderStep[] values() {
            return (CatpayOrderStep[]) $VALUES.clone();
        }
    }
}
