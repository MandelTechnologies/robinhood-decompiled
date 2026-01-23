package contracts.crypto.rewards.proto.p430v1;

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
import messaging.proto.badge.p484v1.GetBadgeDataResponse;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Button;

/* compiled from: GetHomeRewardsButtonResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponse;", "Lcom/squareup/wire/Message;", "", "button", "Lrh_server_driven_ui/v1/Button;", "countdown_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Button;Lmessaging/proto/badge/v1/GetBadgeDataResponse;Lokio/ByteString;)V", "getButton", "()Lrh_server_driven_ui/v1/Button;", "getCountdown_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetHomeRewardsButtonResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetHomeRewardsButtonResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Button button;

    @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse#ADAPTER", jsonName = "countdownBadge", schemaIndex = 1, tag = 2)
    private final GetBadgeDataResponse countdown_badge;

    public GetHomeRewardsButtonResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27642newBuilder();
    }

    public final Button getButton() {
        return this.button;
    }

    public final GetBadgeDataResponse getCountdown_badge() {
        return this.countdown_badge;
    }

    public /* synthetic */ GetHomeRewardsButtonResponse(Button button, GetBadgeDataResponse getBadgeDataResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : button, (i & 2) != 0 ? null : getBadgeDataResponse, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHomeRewardsButtonResponse(Button button, GetBadgeDataResponse getBadgeDataResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.button = button;
        this.countdown_badge = getBadgeDataResponse;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27642newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetHomeRewardsButtonResponse)) {
            return false;
        }
        GetHomeRewardsButtonResponse getHomeRewardsButtonResponse = (GetHomeRewardsButtonResponse) other;
        return Intrinsics.areEqual(unknownFields(), getHomeRewardsButtonResponse.unknownFields()) && Intrinsics.areEqual(this.button, getHomeRewardsButtonResponse.button) && Intrinsics.areEqual(this.countdown_badge, getHomeRewardsButtonResponse.countdown_badge);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Button button = this.button;
        int iHashCode2 = (iHashCode + (button != null ? button.hashCode() : 0)) * 37;
        GetBadgeDataResponse getBadgeDataResponse = this.countdown_badge;
        int iHashCode3 = iHashCode2 + (getBadgeDataResponse != null ? getBadgeDataResponse.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        GetBadgeDataResponse getBadgeDataResponse = this.countdown_badge;
        if (getBadgeDataResponse != null) {
            arrayList.add("countdown_badge=" + getBadgeDataResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetHomeRewardsButtonResponse{", "}", 0, null, null, 56, null);
    }

    public final GetHomeRewardsButtonResponse copy(Button button, GetBadgeDataResponse countdown_badge, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetHomeRewardsButtonResponse(button, countdown_badge, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetHomeRewardsButtonResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetHomeRewardsButtonResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.rewards.proto.v1.GetHomeRewardsButtonResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetHomeRewardsButtonResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getButton() != null) {
                    size += Button.ADAPTER.encodedSizeWithTag(1, value.getButton());
                }
                return size + GetBadgeDataResponse.ADAPTER.encodedSizeWithTag(2, value.getCountdown_badge());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetHomeRewardsButtonResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
                }
                GetBadgeDataResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getCountdown_badge());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetHomeRewardsButtonResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetBadgeDataResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getCountdown_badge());
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetHomeRewardsButtonResponse redact(GetHomeRewardsButtonResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Button button = value.getButton();
                Button buttonRedact = button != null ? Button.ADAPTER.redact(button) : null;
                GetBadgeDataResponse countdown_badge = value.getCountdown_badge();
                return value.copy(buttonRedact, countdown_badge != null ? GetBadgeDataResponse.ADAPTER.redact(countdown_badge) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetHomeRewardsButtonResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Button buttonDecode = null;
                GetBadgeDataResponse getBadgeDataResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetHomeRewardsButtonResponse(buttonDecode, getBadgeDataResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        buttonDecode = Button.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        getBadgeDataResponseDecode = GetBadgeDataResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
