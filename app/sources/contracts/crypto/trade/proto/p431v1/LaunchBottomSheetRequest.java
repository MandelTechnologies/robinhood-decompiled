package contracts.crypto.trade.proto.p431v1;

import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: LaunchBottomSheetRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequest;", "Lcom/squareup/wire/Message;", "", "bottom_sheet_type", "Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "source", "Lcontracts/crypto/trade/proto/v1/Source;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetType;Lcom/robinhood/rosetta/eventlogging/Screen;Lcontracts/crypto/trade/proto/v1/Source;Lokio/ByteString;)V", "getBottom_sheet_type", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getSource", "()Lcontracts/crypto/trade/proto/v1/Source;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class LaunchBottomSheetRequest extends Message {

    @JvmField
    public static final ProtoAdapter<LaunchBottomSheetRequest> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType#ADAPTER", jsonName = "bottomSheetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BottomSheetType bottom_sheet_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Screen screen;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source#ADAPTER", schemaIndex = 2, tag = 3)
    private final Source source;

    public LaunchBottomSheetRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27670newBuilder();
    }

    public final BottomSheetType getBottom_sheet_type() {
        return this.bottom_sheet_type;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final Source getSource() {
        return this.source;
    }

    public /* synthetic */ LaunchBottomSheetRequest(BottomSheetType bottomSheetType, Screen screen, Source source, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomSheetType, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : source, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchBottomSheetRequest(BottomSheetType bottomSheetType, Screen screen, Source source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bottom_sheet_type = bottomSheetType;
        this.screen = screen;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27670newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LaunchBottomSheetRequest)) {
            return false;
        }
        LaunchBottomSheetRequest launchBottomSheetRequest = (LaunchBottomSheetRequest) other;
        return Intrinsics.areEqual(unknownFields(), launchBottomSheetRequest.unknownFields()) && Intrinsics.areEqual(this.bottom_sheet_type, launchBottomSheetRequest.bottom_sheet_type) && Intrinsics.areEqual(this.screen, launchBottomSheetRequest.screen) && Intrinsics.areEqual(this.source, launchBottomSheetRequest.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BottomSheetType bottomSheetType = this.bottom_sheet_type;
        int iHashCode2 = (iHashCode + (bottomSheetType != null ? bottomSheetType.hashCode() : 0)) * 37;
        Screen screen = this.screen;
        int iHashCode3 = (iHashCode2 + (screen != null ? screen.hashCode() : 0)) * 37;
        Source source = this.source;
        int iHashCode4 = iHashCode3 + (source != null ? source.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BottomSheetType bottomSheetType = this.bottom_sheet_type;
        if (bottomSheetType != null) {
            arrayList.add("bottom_sheet_type=" + bottomSheetType);
        }
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LaunchBottomSheetRequest{", "}", 0, null, null, 56, null);
    }

    public final LaunchBottomSheetRequest copy(BottomSheetType bottom_sheet_type, Screen screen, Source source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LaunchBottomSheetRequest(bottom_sheet_type, screen, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LaunchBottomSheetRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LaunchBottomSheetRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.LaunchBottomSheetRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LaunchBottomSheetRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBottom_sheet_type() != null) {
                    size += BottomSheetType.ADAPTER.encodedSizeWithTag(1, value.getBottom_sheet_type());
                }
                if (value.getScreen() != null) {
                    size += Screen.ADAPTER.encodedSizeWithTag(2, value.getScreen());
                }
                return size + Source.ADAPTER.encodedSizeWithTag(3, value.getSource());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LaunchBottomSheetRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBottom_sheet_type() != null) {
                    BottomSheetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_type());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                Source.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LaunchBottomSheetRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Source.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource());
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                if (value.getBottom_sheet_type() != null) {
                    BottomSheetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LaunchBottomSheetRequest redact(LaunchBottomSheetRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetType bottom_sheet_type = value.getBottom_sheet_type();
                BottomSheetType bottomSheetTypeRedact = bottom_sheet_type != null ? BottomSheetType.ADAPTER.redact(bottom_sheet_type) : null;
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                Source source = value.getSource();
                return value.copy(bottomSheetTypeRedact, screenRedact, source != null ? Source.ADAPTER.redact(source) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LaunchBottomSheetRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BottomSheetType bottomSheetTypeDecode = null;
                Screen screenDecode = null;
                Source sourceDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LaunchBottomSheetRequest(bottomSheetTypeDecode, screenDecode, sourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        bottomSheetTypeDecode = BottomSheetType.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        screenDecode = Screen.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        sourceDecode = Source.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
