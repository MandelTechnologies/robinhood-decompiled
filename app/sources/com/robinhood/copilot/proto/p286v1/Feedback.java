package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.i18n.Locality;
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
import p479j$.time.Instant;

/* compiled from: Feedback.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u009f\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J¥\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b-\u0010$R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010$R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b/\u0010$R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b0\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b7\u0010$R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b8\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/Feedback;", "Lcom/squareup/wire/Message;", "", "", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "feedback_timestamp", "type", MatchaQrCodeDuxo6.USER_ID_KEY, "reaction", "", "reasons", "ticker", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "instrument_type", "Lcom/robinhood/rosetta/i18n/Locality;", "locality", "composite_feedback_id", "freeform_feedback", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentType;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentType;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/Feedback;", "Ljava/lang/String;", "getInstrument_id", "Lj$/time/Instant;", "getGeneration_timestamp", "()Lj$/time/Instant;", "getFeedback_timestamp", "getType", "getUser_id", "getReaction", "getTicker", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentType;", "Lcom/robinhood/rosetta/i18n/Locality;", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getComposite_feedback_id", "getFreeform_feedback", "Ljava/util/List;", "getReasons", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Feedback extends Message {

    @JvmField
    public static final ProtoAdapter<Feedback> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "compositeFeedbackId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String composite_feedback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "feedbackTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant feedback_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "freeformFeedback", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String freeform_feedback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generationTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant generation_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String reaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> reasons;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String ticker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String user_id;

    public Feedback() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ Feedback(String str, Instant instant, Instant instant2, String str2, String str3, String str4, List list, String str5, InstrumentType instrumentType, Locality locality, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) == 0 ? instant2 : null, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 512) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 1024) != 0 ? "" : str6, (i & 2048) == 0 ? str7 : "", (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22101newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final Instant getGeneration_timestamp() {
        return this.generation_timestamp;
    }

    public final Instant getFeedback_timestamp() {
        return this.feedback_timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public final String getTicker() {
        return this.ticker;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final String getComposite_feedback_id() {
        return this.composite_feedback_id;
    }

    public final String getFreeform_feedback() {
        return this.freeform_feedback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback(String instrument_id, Instant instant, Instant instant2, String type2, String user_id, String reaction, List<String> reasons, String ticker, InstrumentType instrument_type, Locality locality, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.generation_timestamp = instant;
        this.feedback_timestamp = instant2;
        this.type = type2;
        this.user_id = user_id;
        this.reaction = reaction;
        this.ticker = ticker;
        this.instrument_type = instrument_type;
        this.locality = locality;
        this.composite_feedback_id = composite_feedback_id;
        this.freeform_feedback = freeform_feedback;
        this.reasons = Internal.immutableCopyOf("reasons", reasons);
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22101newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) other;
        return Intrinsics.areEqual(unknownFields(), feedback.unknownFields()) && Intrinsics.areEqual(this.instrument_id, feedback.instrument_id) && Intrinsics.areEqual(this.generation_timestamp, feedback.generation_timestamp) && Intrinsics.areEqual(this.feedback_timestamp, feedback.feedback_timestamp) && Intrinsics.areEqual(this.type, feedback.type) && Intrinsics.areEqual(this.user_id, feedback.user_id) && Intrinsics.areEqual(this.reaction, feedback.reaction) && Intrinsics.areEqual(this.reasons, feedback.reasons) && Intrinsics.areEqual(this.ticker, feedback.ticker) && this.instrument_type == feedback.instrument_type && this.locality == feedback.locality && Intrinsics.areEqual(this.composite_feedback_id, feedback.composite_feedback_id) && Intrinsics.areEqual(this.freeform_feedback, feedback.freeform_feedback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37;
        Instant instant = this.generation_timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.feedback_timestamp;
        int iHashCode3 = ((((((((((((((((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.type.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.reaction.hashCode()) * 37) + this.reasons.hashCode()) * 37) + this.ticker.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.composite_feedback_id.hashCode()) * 37) + this.freeform_feedback.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        Instant instant = this.generation_timestamp;
        if (instant != null) {
            arrayList.add("generation_timestamp=" + instant);
        }
        Instant instant2 = this.feedback_timestamp;
        if (instant2 != null) {
            arrayList.add("feedback_timestamp=" + instant2);
        }
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("reaction=" + Internal.sanitize(this.reaction));
        if (!this.reasons.isEmpty()) {
            arrayList.add("reasons=" + Internal.sanitize(this.reasons));
        }
        arrayList.add("ticker=" + Internal.sanitize(this.ticker));
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("locality=" + this.locality);
        arrayList.add("composite_feedback_id=" + Internal.sanitize(this.composite_feedback_id));
        arrayList.add("freeform_feedback=" + Internal.sanitize(this.freeform_feedback));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Feedback{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Feedback copy$default(Feedback feedback, String str, Instant instant, Instant instant2, String str2, String str3, String str4, List list, String str5, InstrumentType instrumentType, Locality locality, String str6, String str7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedback.instrument_id;
        }
        return feedback.copy(str, (i & 2) != 0 ? feedback.generation_timestamp : instant, (i & 4) != 0 ? feedback.feedback_timestamp : instant2, (i & 8) != 0 ? feedback.type : str2, (i & 16) != 0 ? feedback.user_id : str3, (i & 32) != 0 ? feedback.reaction : str4, (i & 64) != 0 ? feedback.reasons : list, (i & 128) != 0 ? feedback.ticker : str5, (i & 256) != 0 ? feedback.instrument_type : instrumentType, (i & 512) != 0 ? feedback.locality : locality, (i & 1024) != 0 ? feedback.composite_feedback_id : str6, (i & 2048) != 0 ? feedback.freeform_feedback : str7, (i & 4096) != 0 ? feedback.unknownFields() : byteString);
    }

    public final Feedback copy(String instrument_id, Instant generation_timestamp, Instant feedback_timestamp, String type2, String user_id, String reaction, List<String> reasons, String ticker, InstrumentType instrument_type, Locality locality, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Feedback(instrument_id, generation_timestamp, feedback_timestamp, type2, user_id, reaction, reasons, ticker, instrument_type, locality, composite_feedback_id, freeform_feedback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Feedback.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Feedback>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.Feedback$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Feedback value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (value.getGeneration_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getGeneration_timestamp());
                }
                if (value.getFeedback_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getFeedback_timestamp());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getType());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getReasons());
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getTicker());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += InstrumentType.ADAPTER.encodedSizeWithTag(9, value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    iEncodedSizeWithTag += Locality.ADAPTER.encodedSizeWithTag(10, value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(11, value.getComposite_feedback_id());
                }
                return !Intrinsics.areEqual(value.getFreeform_feedback(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(12, value.getFreeform_feedback()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Feedback value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getGeneration_timestamp());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getFeedback_timestamp());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getReasons());
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getTicker());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 10, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getComposite_feedback_id());
                }
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getFreeform_feedback());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Feedback value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getFreeform_feedback());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getComposite_feedback_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 10, (int) value.getLocality());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTicker());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getReasons());
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getReaction());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getFeedback_timestamp());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getGeneration_timestamp());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Feedback decode(ProtoReader reader) throws IOException {
                Locality locality;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                Locality locality2 = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InstrumentType instrumentTypeDecode = instrumentType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Locality localityDecode = locality2;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 3:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                locality = localityDecode;
                                str = strDecode7;
                                str2 = strDecode;
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                locality = localityDecode;
                                str = strDecode7;
                                str2 = strDecode;
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                try {
                                    localityDecode = Locality.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    locality = localityDecode;
                                    str = strDecode7;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                locality = localityDecode;
                                str = strDecode7;
                                str2 = strDecode;
                                break;
                        }
                        localityDecode = locality;
                        strDecode7 = str;
                        strDecode = str2;
                    } else {
                        return new Feedback(strDecode7, instantDecode, instantDecode2, strDecode, strDecode2, strDecode3, arrayList, strDecode4, instrumentTypeDecode, localityDecode, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Feedback redact(Feedback value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant generation_timestamp = value.getGeneration_timestamp();
                Instant instantRedact = generation_timestamp != null ? ProtoAdapter.INSTANT.redact(generation_timestamp) : null;
                Instant feedback_timestamp = value.getFeedback_timestamp();
                return Feedback.copy$default(value, null, instantRedact, feedback_timestamp != null ? ProtoAdapter.INSTANT.redact(feedback_timestamp) : null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 4089, null);
            }
        };
    }
}
