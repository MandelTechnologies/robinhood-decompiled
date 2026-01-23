package gold.proto.p464v1;

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

/* compiled from: GetSageFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponse;", "Lcom/squareup/wire/Message;", "", "splash", "Lgold/proto/v1/GoldSageSplash;", "timeline", "Lgold/proto/v1/GoldSageTimeline;", "application", "Lgold/proto/v1/GoldSageStartApplication;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold/proto/v1/GoldSageSplash;Lgold/proto/v1/GoldSageTimeline;Lgold/proto/v1/GoldSageStartApplication;Lokio/ByteString;)V", "getSplash", "()Lgold/proto/v1/GoldSageSplash;", "getTimeline", "()Lgold/proto/v1/GoldSageTimeline;", "getApplication", "()Lgold/proto/v1/GoldSageStartApplication;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetSageFlowResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetSageFlowResponse> ADAPTER;

    @WireField(adapter = "gold.proto.v1.GoldSageStartApplication#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final GoldSageStartApplication application;

    @WireField(adapter = "gold.proto.v1.GoldSageSplash#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GoldSageSplash splash;

    @WireField(adapter = "gold.proto.v1.GoldSageTimeline#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final GoldSageTimeline timeline;

    public GetSageFlowResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28124newBuilder();
    }

    public final GoldSageSplash getSplash() {
        return this.splash;
    }

    public final GoldSageTimeline getTimeline() {
        return this.timeline;
    }

    public final GoldSageStartApplication getApplication() {
        return this.application;
    }

    public /* synthetic */ GetSageFlowResponse(GoldSageSplash goldSageSplash, GoldSageTimeline goldSageTimeline, GoldSageStartApplication goldSageStartApplication, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldSageSplash, (i & 2) != 0 ? null : goldSageTimeline, (i & 4) != 0 ? null : goldSageStartApplication, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSageFlowResponse(GoldSageSplash goldSageSplash, GoldSageTimeline goldSageTimeline, GoldSageStartApplication goldSageStartApplication, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.splash = goldSageSplash;
        this.timeline = goldSageTimeline;
        this.application = goldSageStartApplication;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28124newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSageFlowResponse)) {
            return false;
        }
        GetSageFlowResponse getSageFlowResponse = (GetSageFlowResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSageFlowResponse.unknownFields()) && Intrinsics.areEqual(this.splash, getSageFlowResponse.splash) && Intrinsics.areEqual(this.timeline, getSageFlowResponse.timeline) && Intrinsics.areEqual(this.application, getSageFlowResponse.application);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GoldSageSplash goldSageSplash = this.splash;
        int iHashCode2 = (iHashCode + (goldSageSplash != null ? goldSageSplash.hashCode() : 0)) * 37;
        GoldSageTimeline goldSageTimeline = this.timeline;
        int iHashCode3 = (iHashCode2 + (goldSageTimeline != null ? goldSageTimeline.hashCode() : 0)) * 37;
        GoldSageStartApplication goldSageStartApplication = this.application;
        int iHashCode4 = iHashCode3 + (goldSageStartApplication != null ? goldSageStartApplication.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GoldSageSplash goldSageSplash = this.splash;
        if (goldSageSplash != null) {
            arrayList.add("splash=" + goldSageSplash);
        }
        GoldSageTimeline goldSageTimeline = this.timeline;
        if (goldSageTimeline != null) {
            arrayList.add("timeline=" + goldSageTimeline);
        }
        GoldSageStartApplication goldSageStartApplication = this.application;
        if (goldSageStartApplication != null) {
            arrayList.add("application=" + goldSageStartApplication);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSageFlowResponse{", "}", 0, null, null, 56, null);
    }

    public final GetSageFlowResponse copy(GoldSageSplash splash, GoldSageTimeline timeline, GoldSageStartApplication application, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSageFlowResponse(splash, timeline, application, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSageFlowResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSageFlowResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GetSageFlowResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSageFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSplash() != null) {
                    size += GoldSageSplash.ADAPTER.encodedSizeWithTag(1, value.getSplash());
                }
                if (value.getTimeline() != null) {
                    size += GoldSageTimeline.ADAPTER.encodedSizeWithTag(2, value.getTimeline());
                }
                return value.getApplication() != null ? size + GoldSageStartApplication.ADAPTER.encodedSizeWithTag(3, value.getApplication()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSageFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSplash() != null) {
                    GoldSageSplash.ADAPTER.encodeWithTag(writer, 1, (int) value.getSplash());
                }
                if (value.getTimeline() != null) {
                    GoldSageTimeline.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimeline());
                }
                if (value.getApplication() != null) {
                    GoldSageStartApplication.ADAPTER.encodeWithTag(writer, 3, (int) value.getApplication());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSageFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getApplication() != null) {
                    GoldSageStartApplication.ADAPTER.encodeWithTag(writer, 3, (int) value.getApplication());
                }
                if (value.getTimeline() != null) {
                    GoldSageTimeline.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimeline());
                }
                if (value.getSplash() != null) {
                    GoldSageSplash.ADAPTER.encodeWithTag(writer, 1, (int) value.getSplash());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSageFlowResponse redact(GetSageFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldSageSplash splash = value.getSplash();
                GoldSageSplash goldSageSplashRedact = splash != null ? GoldSageSplash.ADAPTER.redact(splash) : null;
                GoldSageTimeline timeline = value.getTimeline();
                GoldSageTimeline goldSageTimelineRedact = timeline != null ? GoldSageTimeline.ADAPTER.redact(timeline) : null;
                GoldSageStartApplication application = value.getApplication();
                return value.copy(goldSageSplashRedact, goldSageTimelineRedact, application != null ? GoldSageStartApplication.ADAPTER.redact(application) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetSageFlowResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GoldSageSplash goldSageSplashDecode = null;
                GoldSageTimeline goldSageTimelineDecode = null;
                GoldSageStartApplication goldSageStartApplicationDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSageFlowResponse(goldSageSplashDecode, goldSageTimelineDecode, goldSageStartApplicationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        goldSageSplashDecode = GoldSageSplash.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        goldSageTimelineDecode = GoldSageTimeline.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        goldSageStartApplicationDecode = GoldSageStartApplication.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
