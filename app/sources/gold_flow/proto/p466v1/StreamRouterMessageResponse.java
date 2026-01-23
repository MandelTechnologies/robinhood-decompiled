package gold_flow.proto.p466v1;

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

/* compiled from: StreamRouterMessageResponse.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016Jd\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponse;", "Lcom/squareup/wire/Message;", "", "result", "Lgold_flow/proto/v1/Result;", "push_screen", "Lgold_flow/proto/v1/PushScreen;", "dismiss_screen", "Lgold_flow/proto/v1/DismissScreen;", "dismiss_all", "Lgold_flow/proto/v1/DismissAll;", "open_deeplink", "Lgold_flow/proto/v1/OpenDeeplink;", "on_subscribe", "Lgold_flow/proto/v1/OnSubscribe;", "on_complete", "Lgold_flow/proto/v1/OnComplete;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold_flow/proto/v1/Result;Lgold_flow/proto/v1/PushScreen;Lgold_flow/proto/v1/DismissScreen;Lgold_flow/proto/v1/DismissAll;Lgold_flow/proto/v1/OpenDeeplink;Lgold_flow/proto/v1/OnSubscribe;Lgold_flow/proto/v1/OnComplete;Lokio/ByteString;)V", "getResult", "()Lgold_flow/proto/v1/Result;", "getPush_screen", "()Lgold_flow/proto/v1/PushScreen;", "getDismiss_screen", "()Lgold_flow/proto/v1/DismissScreen;", "getDismiss_all", "()Lgold_flow/proto/v1/DismissAll;", "getOpen_deeplink", "()Lgold_flow/proto/v1/OpenDeeplink;", "getOn_subscribe", "()Lgold_flow/proto/v1/OnSubscribe;", "getOn_complete", "()Lgold_flow/proto/v1/OnComplete;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamRouterMessageResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamRouterMessageResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.DismissAll#ADAPTER", jsonName = "dismissAll", oneofName = "router_message", schemaIndex = 3, tag = 4)
    private final DismissAll dismiss_all;

    @WireField(adapter = "gold_flow.proto.v1.DismissScreen#ADAPTER", jsonName = "dismissScreen", oneofName = "router_message", schemaIndex = 2, tag = 3)
    private final DismissScreen dismiss_screen;

    @WireField(adapter = "gold_flow.proto.v1.OnComplete#ADAPTER", jsonName = "onComplete", oneofName = "router_message", schemaIndex = 6, tag = 7)
    private final OnComplete on_complete;

    @WireField(adapter = "gold_flow.proto.v1.OnSubscribe#ADAPTER", jsonName = "onSubscribe", oneofName = "router_message", schemaIndex = 5, tag = 6)
    private final OnSubscribe on_subscribe;

    @WireField(adapter = "gold_flow.proto.v1.OpenDeeplink#ADAPTER", jsonName = "openDeeplink", oneofName = "router_message", schemaIndex = 4, tag = 5)
    private final OpenDeeplink open_deeplink;

    @WireField(adapter = "gold_flow.proto.v1.PushScreen#ADAPTER", jsonName = "pushScreen", oneofName = "router_message", schemaIndex = 1, tag = 2)
    private final PushScreen push_screen;

    @WireField(adapter = "gold_flow.proto.v1.Result#ADAPTER", schemaIndex = 0, tag = 1)
    private final Result result;

    public StreamRouterMessageResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28198newBuilder();
    }

    public final Result getResult() {
        return this.result;
    }

    public final PushScreen getPush_screen() {
        return this.push_screen;
    }

    public final DismissScreen getDismiss_screen() {
        return this.dismiss_screen;
    }

    public final DismissAll getDismiss_all() {
        return this.dismiss_all;
    }

    public final OpenDeeplink getOpen_deeplink() {
        return this.open_deeplink;
    }

    public final OnSubscribe getOn_subscribe() {
        return this.on_subscribe;
    }

    public final OnComplete getOn_complete() {
        return this.on_complete;
    }

    public /* synthetic */ StreamRouterMessageResponse(Result result, PushScreen pushScreen, DismissScreen dismissScreen, DismissAll dismissAll, OpenDeeplink openDeeplink, OnSubscribe onSubscribe, OnComplete onComplete, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : pushScreen, (i & 4) != 0 ? null : dismissScreen, (i & 8) != 0 ? null : dismissAll, (i & 16) != 0 ? null : openDeeplink, (i & 32) != 0 ? null : onSubscribe, (i & 64) != 0 ? null : onComplete, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamRouterMessageResponse(Result result, PushScreen pushScreen, DismissScreen dismissScreen, DismissAll dismissAll, OpenDeeplink openDeeplink, OnSubscribe onSubscribe, OnComplete onComplete, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.result = result;
        this.push_screen = pushScreen;
        this.dismiss_screen = dismissScreen;
        this.dismiss_all = dismissAll;
        this.open_deeplink = openDeeplink;
        this.on_subscribe = onSubscribe;
        this.on_complete = onComplete;
        if (Internal.countNonNull(pushScreen, dismissScreen, dismissAll, openDeeplink, onSubscribe, onComplete) > 1) {
            throw new IllegalArgumentException("At most one of push_screen, dismiss_screen, dismiss_all, open_deeplink, on_subscribe, on_complete may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28198newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamRouterMessageResponse)) {
            return false;
        }
        StreamRouterMessageResponse streamRouterMessageResponse = (StreamRouterMessageResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamRouterMessageResponse.unknownFields()) && Intrinsics.areEqual(this.result, streamRouterMessageResponse.result) && Intrinsics.areEqual(this.push_screen, streamRouterMessageResponse.push_screen) && Intrinsics.areEqual(this.dismiss_screen, streamRouterMessageResponse.dismiss_screen) && Intrinsics.areEqual(this.dismiss_all, streamRouterMessageResponse.dismiss_all) && Intrinsics.areEqual(this.open_deeplink, streamRouterMessageResponse.open_deeplink) && Intrinsics.areEqual(this.on_subscribe, streamRouterMessageResponse.on_subscribe) && Intrinsics.areEqual(this.on_complete, streamRouterMessageResponse.on_complete);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Result result = this.result;
        int iHashCode2 = (iHashCode + (result != null ? result.hashCode() : 0)) * 37;
        PushScreen pushScreen = this.push_screen;
        int iHashCode3 = (iHashCode2 + (pushScreen != null ? pushScreen.hashCode() : 0)) * 37;
        DismissScreen dismissScreen = this.dismiss_screen;
        int iHashCode4 = (iHashCode3 + (dismissScreen != null ? dismissScreen.hashCode() : 0)) * 37;
        DismissAll dismissAll = this.dismiss_all;
        int iHashCode5 = (iHashCode4 + (dismissAll != null ? dismissAll.hashCode() : 0)) * 37;
        OpenDeeplink openDeeplink = this.open_deeplink;
        int iHashCode6 = (iHashCode5 + (openDeeplink != null ? openDeeplink.hashCode() : 0)) * 37;
        OnSubscribe onSubscribe = this.on_subscribe;
        int iHashCode7 = (iHashCode6 + (onSubscribe != null ? onSubscribe.hashCode() : 0)) * 37;
        OnComplete onComplete = this.on_complete;
        int iHashCode8 = iHashCode7 + (onComplete != null ? onComplete.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        PushScreen pushScreen = this.push_screen;
        if (pushScreen != null) {
            arrayList.add("push_screen=" + pushScreen);
        }
        DismissScreen dismissScreen = this.dismiss_screen;
        if (dismissScreen != null) {
            arrayList.add("dismiss_screen=" + dismissScreen);
        }
        DismissAll dismissAll = this.dismiss_all;
        if (dismissAll != null) {
            arrayList.add("dismiss_all=" + dismissAll);
        }
        OpenDeeplink openDeeplink = this.open_deeplink;
        if (openDeeplink != null) {
            arrayList.add("open_deeplink=" + openDeeplink);
        }
        OnSubscribe onSubscribe = this.on_subscribe;
        if (onSubscribe != null) {
            arrayList.add("on_subscribe=" + onSubscribe);
        }
        OnComplete onComplete = this.on_complete;
        if (onComplete != null) {
            arrayList.add("on_complete=" + onComplete);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamRouterMessageResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamRouterMessageResponse copy(Result result, PushScreen push_screen, DismissScreen dismiss_screen, DismissAll dismiss_all, OpenDeeplink open_deeplink, OnSubscribe on_subscribe, OnComplete on_complete, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamRouterMessageResponse(result, push_screen, dismiss_screen, dismiss_all, open_deeplink, on_subscribe, on_complete, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamRouterMessageResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamRouterMessageResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamRouterMessageResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamRouterMessageResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Result.ADAPTER.encodedSizeWithTag(1, value.getResult()) + PushScreen.ADAPTER.encodedSizeWithTag(2, value.getPush_screen()) + DismissScreen.ADAPTER.encodedSizeWithTag(3, value.getDismiss_screen()) + DismissAll.ADAPTER.encodedSizeWithTag(4, value.getDismiss_all()) + OpenDeeplink.ADAPTER.encodedSizeWithTag(5, value.getOpen_deeplink()) + OnSubscribe.ADAPTER.encodedSizeWithTag(6, value.getOn_subscribe()) + OnComplete.ADAPTER.encodedSizeWithTag(7, value.getOn_complete());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamRouterMessageResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Result.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
                PushScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getPush_screen());
                DismissScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getDismiss_screen());
                DismissAll.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_all());
                OpenDeeplink.ADAPTER.encodeWithTag(writer, 5, (int) value.getOpen_deeplink());
                OnSubscribe.ADAPTER.encodeWithTag(writer, 6, (int) value.getOn_subscribe());
                OnComplete.ADAPTER.encodeWithTag(writer, 7, (int) value.getOn_complete());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamRouterMessageResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OnComplete.ADAPTER.encodeWithTag(writer, 7, (int) value.getOn_complete());
                OnSubscribe.ADAPTER.encodeWithTag(writer, 6, (int) value.getOn_subscribe());
                OpenDeeplink.ADAPTER.encodeWithTag(writer, 5, (int) value.getOpen_deeplink());
                DismissAll.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_all());
                DismissScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getDismiss_screen());
                PushScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getPush_screen());
                Result.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamRouterMessageResponse redact(StreamRouterMessageResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Result result = value.getResult();
                Result resultRedact = result != null ? Result.ADAPTER.redact(result) : null;
                PushScreen push_screen = value.getPush_screen();
                PushScreen pushScreenRedact = push_screen != null ? PushScreen.ADAPTER.redact(push_screen) : null;
                DismissScreen dismiss_screen = value.getDismiss_screen();
                DismissScreen dismissScreenRedact = dismiss_screen != null ? DismissScreen.ADAPTER.redact(dismiss_screen) : null;
                DismissAll dismiss_all = value.getDismiss_all();
                DismissAll dismissAllRedact = dismiss_all != null ? DismissAll.ADAPTER.redact(dismiss_all) : null;
                OpenDeeplink open_deeplink = value.getOpen_deeplink();
                OpenDeeplink openDeeplinkRedact = open_deeplink != null ? OpenDeeplink.ADAPTER.redact(open_deeplink) : null;
                OnSubscribe on_subscribe = value.getOn_subscribe();
                OnSubscribe onSubscribeRedact = on_subscribe != null ? OnSubscribe.ADAPTER.redact(on_subscribe) : null;
                OnComplete on_complete = value.getOn_complete();
                return value.copy(resultRedact, pushScreenRedact, dismissScreenRedact, dismissAllRedact, openDeeplinkRedact, onSubscribeRedact, on_complete != null ? OnComplete.ADAPTER.redact(on_complete) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamRouterMessageResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Result resultDecode = null;
                PushScreen pushScreenDecode = null;
                DismissScreen dismissScreenDecode = null;
                DismissAll dismissAllDecode = null;
                OpenDeeplink openDeeplinkDecode = null;
                OnSubscribe onSubscribeDecode = null;
                OnComplete onCompleteDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                resultDecode = Result.ADAPTER.decode(reader);
                                break;
                            case 2:
                                pushScreenDecode = PushScreen.ADAPTER.decode(reader);
                                break;
                            case 3:
                                dismissScreenDecode = DismissScreen.ADAPTER.decode(reader);
                                break;
                            case 4:
                                dismissAllDecode = DismissAll.ADAPTER.decode(reader);
                                break;
                            case 5:
                                openDeeplinkDecode = OpenDeeplink.ADAPTER.decode(reader);
                                break;
                            case 6:
                                onSubscribeDecode = OnSubscribe.ADAPTER.decode(reader);
                                break;
                            case 7:
                                onCompleteDecode = OnComplete.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamRouterMessageResponse(resultDecode, pushScreenDecode, dismissScreenDecode, dismissAllDecode, openDeeplinkDecode, onSubscribeDecode, onCompleteDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
