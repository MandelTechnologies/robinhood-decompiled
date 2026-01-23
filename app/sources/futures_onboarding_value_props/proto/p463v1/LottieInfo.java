package futures_onboarding_value_props.proto.p463v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import futures_onboarding_value_props.proto.p463v1.LottieInfo;
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

/* compiled from: LottieInfo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\bH\u0016JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "Lcom/squareup/wire/Message;", "", "play_once_and_hold_final_frame", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "loop_section", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "light_mode_url", "", "dark_mode_url", "light_mode_name", "dark_mode_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPlay_once_and_hold_final_frame", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "getLoop_section", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "getLight_mode_url", "()Ljava/lang/String;", "getDark_mode_url", "getLight_mode_name", "getDark_mode_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "PlayOnceAndHoldFinalFrame", "LoopSection", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LottieInfo extends Message {

    @JvmField
    public static final ProtoAdapter<LottieInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkModeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String dark_mode_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkModeUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String dark_mode_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightModeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String light_mode_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightModeUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String light_mode_url;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.LottieInfo$LoopSection#ADAPTER", jsonName = "loopSection", oneofName = "playback_type", schemaIndex = 1, tag = 2)
    private final LoopSection loop_section;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.LottieInfo$PlayOnceAndHoldFinalFrame#ADAPTER", jsonName = "playOnceAndHoldFinalFrame", oneofName = "playback_type", schemaIndex = 0, tag = 1)
    private final PlayOnceAndHoldFinalFrame play_once_and_hold_final_frame;

    public LottieInfo() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ LottieInfo(PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame, LoopSection loopSection, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : playOnceAndHoldFinalFrame, (i & 2) != 0 ? null : loopSection, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28111newBuilder();
    }

    public final PlayOnceAndHoldFinalFrame getPlay_once_and_hold_final_frame() {
        return this.play_once_and_hold_final_frame;
    }

    public final LoopSection getLoop_section() {
        return this.loop_section;
    }

    public final String getLight_mode_url() {
        return this.light_mode_url;
    }

    public final String getDark_mode_url() {
        return this.dark_mode_url;
    }

    public final String getLight_mode_name() {
        return this.light_mode_name;
    }

    public final String getDark_mode_name() {
        return this.dark_mode_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieInfo(PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame, LoopSection loopSection, String light_mode_url, String dark_mode_url, String light_mode_name, String dark_mode_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
        Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
        Intrinsics.checkNotNullParameter(light_mode_name, "light_mode_name");
        Intrinsics.checkNotNullParameter(dark_mode_name, "dark_mode_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.play_once_and_hold_final_frame = playOnceAndHoldFinalFrame;
        this.loop_section = loopSection;
        this.light_mode_url = light_mode_url;
        this.dark_mode_url = dark_mode_url;
        this.light_mode_name = light_mode_name;
        this.dark_mode_name = dark_mode_name;
        if (Internal.countNonNull(playOnceAndHoldFinalFrame, loopSection) > 1) {
            throw new IllegalArgumentException("At most one of play_once_and_hold_final_frame, loop_section may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28111newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LottieInfo)) {
            return false;
        }
        LottieInfo lottieInfo = (LottieInfo) other;
        return Intrinsics.areEqual(unknownFields(), lottieInfo.unknownFields()) && Intrinsics.areEqual(this.play_once_and_hold_final_frame, lottieInfo.play_once_and_hold_final_frame) && Intrinsics.areEqual(this.loop_section, lottieInfo.loop_section) && Intrinsics.areEqual(this.light_mode_url, lottieInfo.light_mode_url) && Intrinsics.areEqual(this.dark_mode_url, lottieInfo.dark_mode_url) && Intrinsics.areEqual(this.light_mode_name, lottieInfo.light_mode_name) && Intrinsics.areEqual(this.dark_mode_name, lottieInfo.dark_mode_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame = this.play_once_and_hold_final_frame;
        int iHashCode2 = (iHashCode + (playOnceAndHoldFinalFrame != null ? playOnceAndHoldFinalFrame.hashCode() : 0)) * 37;
        LoopSection loopSection = this.loop_section;
        int iHashCode3 = ((((((((iHashCode2 + (loopSection != null ? loopSection.hashCode() : 0)) * 37) + this.light_mode_url.hashCode()) * 37) + this.dark_mode_url.hashCode()) * 37) + this.light_mode_name.hashCode()) * 37) + this.dark_mode_name.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame = this.play_once_and_hold_final_frame;
        if (playOnceAndHoldFinalFrame != null) {
            arrayList.add("play_once_and_hold_final_frame=" + playOnceAndHoldFinalFrame);
        }
        LoopSection loopSection = this.loop_section;
        if (loopSection != null) {
            arrayList.add("loop_section=" + loopSection);
        }
        arrayList.add("light_mode_url=" + Internal.sanitize(this.light_mode_url));
        arrayList.add("dark_mode_url=" + Internal.sanitize(this.dark_mode_url));
        arrayList.add("light_mode_name=" + Internal.sanitize(this.light_mode_name));
        arrayList.add("dark_mode_name=" + Internal.sanitize(this.dark_mode_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LottieInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LottieInfo copy$default(LottieInfo lottieInfo, PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame, LoopSection loopSection, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            playOnceAndHoldFinalFrame = lottieInfo.play_once_and_hold_final_frame;
        }
        if ((i & 2) != 0) {
            loopSection = lottieInfo.loop_section;
        }
        if ((i & 4) != 0) {
            str = lottieInfo.light_mode_url;
        }
        if ((i & 8) != 0) {
            str2 = lottieInfo.dark_mode_url;
        }
        if ((i & 16) != 0) {
            str3 = lottieInfo.light_mode_name;
        }
        if ((i & 32) != 0) {
            str4 = lottieInfo.dark_mode_name;
        }
        if ((i & 64) != 0) {
            byteString = lottieInfo.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        String str7 = str;
        return lottieInfo.copy(playOnceAndHoldFinalFrame, loopSection, str7, str2, str6, str5, byteString2);
    }

    public final LottieInfo copy(PlayOnceAndHoldFinalFrame play_once_and_hold_final_frame, LoopSection loop_section, String light_mode_url, String dark_mode_url, String light_mode_name, String dark_mode_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
        Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
        Intrinsics.checkNotNullParameter(light_mode_name, "light_mode_name");
        Intrinsics.checkNotNullParameter(dark_mode_name, "dark_mode_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LottieInfo(play_once_and_hold_final_frame, loop_section, light_mode_url, dark_mode_url, light_mode_name, dark_mode_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LottieInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LottieInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.LottieInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LottieInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER.encodedSizeWithTag(1, value.getPlay_once_and_hold_final_frame()) + LottieInfo.LoopSection.ADAPTER.encodedSizeWithTag(2, value.getLoop_section());
                if (!Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLight_mode_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDark_mode_url());
                }
                if (!Intrinsics.areEqual(value.getLight_mode_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLight_mode_name());
                }
                return !Intrinsics.areEqual(value.getDark_mode_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDark_mode_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LottieInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLight_mode_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDark_mode_url());
                }
                if (!Intrinsics.areEqual(value.getLight_mode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLight_mode_name());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDark_mode_name());
                }
                LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlay_once_and_hold_final_frame());
                LottieInfo.LoopSection.ADAPTER.encodeWithTag(writer, 2, (int) value.getLoop_section());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LottieInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LottieInfo.LoopSection.ADAPTER.encodeWithTag(writer, 2, (int) value.getLoop_section());
                LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlay_once_and_hold_final_frame());
                if (!Intrinsics.areEqual(value.getDark_mode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDark_mode_name());
                }
                if (!Intrinsics.areEqual(value.getLight_mode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLight_mode_name());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDark_mode_url());
                }
                if (Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLight_mode_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LottieInfo redact(LottieInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LottieInfo.PlayOnceAndHoldFinalFrame play_once_and_hold_final_frame = value.getPlay_once_and_hold_final_frame();
                LottieInfo.PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrameRedact = play_once_and_hold_final_frame != null ? LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER.redact(play_once_and_hold_final_frame) : null;
                LottieInfo.LoopSection loop_section = value.getLoop_section();
                return LottieInfo.copy$default(value, playOnceAndHoldFinalFrameRedact, loop_section != null ? LottieInfo.LoopSection.ADAPTER.redact(loop_section) : null, null, null, null, null, ByteString.EMPTY, 60, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LottieInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                LottieInfo.PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrameDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                LottieInfo.LoopSection loopSectionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                playOnceAndHoldFinalFrameDecode = LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER.decode(reader);
                                break;
                            case 2:
                                loopSectionDecode = LottieInfo.LoopSection.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new LottieInfo(playOnceAndHoldFinalFrameDecode, loopSectionDecode, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: LottieInfo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PlayOnceAndHoldFinalFrame extends Message {

        @JvmField
        public static final ProtoAdapter<PlayOnceAndHoldFinalFrame> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public PlayOnceAndHoldFinalFrame() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28113newBuilder();
        }

        public /* synthetic */ PlayOnceAndHoldFinalFrame(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayOnceAndHoldFinalFrame(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28113newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof PlayOnceAndHoldFinalFrame) && Intrinsics.areEqual(unknownFields(), ((PlayOnceAndHoldFinalFrame) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "PlayOnceAndHoldFinalFrame{}";
        }

        public final PlayOnceAndHoldFinalFrame copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PlayOnceAndHoldFinalFrame(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlayOnceAndHoldFinalFrame.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PlayOnceAndHoldFinalFrame>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.LottieInfo$PlayOnceAndHoldFinalFrame$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LottieInfo.PlayOnceAndHoldFinalFrame value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LottieInfo.PlayOnceAndHoldFinalFrame value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LottieInfo.PlayOnceAndHoldFinalFrame value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LottieInfo.PlayOnceAndHoldFinalFrame redact(LottieInfo.PlayOnceAndHoldFinalFrame value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public LottieInfo.PlayOnceAndHoldFinalFrame decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new LottieInfo.PlayOnceAndHoldFinalFrame(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: LottieInfo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "Lcom/squareup/wire/Message;", "", "start_frame", "", "end_frame", "unknownFields", "Lokio/ByteString;", "<init>", "(IILokio/ByteString;)V", "getStart_frame", "()I", "getEnd_frame", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoopSection extends Message {

        @JvmField
        public static final ProtoAdapter<LoopSection> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "endFrame", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int end_frame;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "startFrame", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int start_frame;

        public LoopSection() {
            this(0, 0, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28112newBuilder();
        }

        public final int getStart_frame() {
            return this.start_frame;
        }

        public final int getEnd_frame() {
            return this.end_frame;
        }

        public /* synthetic */ LoopSection(int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoopSection(int i, int i2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.start_frame = i;
            this.end_frame = i2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28112newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LoopSection)) {
                return false;
            }
            LoopSection loopSection = (LoopSection) other;
            return Intrinsics.areEqual(unknownFields(), loopSection.unknownFields()) && this.start_frame == loopSection.start_frame && this.end_frame == loopSection.end_frame;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.start_frame)) * 37) + Integer.hashCode(this.end_frame);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("start_frame=" + this.start_frame);
            arrayList.add("end_frame=" + this.end_frame);
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoopSection{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ LoopSection copy$default(LoopSection loopSection, int i, int i2, ByteString byteString, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = loopSection.start_frame;
            }
            if ((i3 & 2) != 0) {
                i2 = loopSection.end_frame;
            }
            if ((i3 & 4) != 0) {
                byteString = loopSection.unknownFields();
            }
            return loopSection.copy(i, i2, byteString);
        }

        public final LoopSection copy(int start_frame, int end_frame, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new LoopSection(start_frame, end_frame, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LoopSection.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<LoopSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.LottieInfo$LoopSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LottieInfo.LoopSection value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getStart_frame() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getStart_frame()));
                    }
                    return value.getEnd_frame() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getEnd_frame())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LottieInfo.LoopSection value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getStart_frame() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getStart_frame()));
                    }
                    if (value.getEnd_frame() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getEnd_frame()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LottieInfo.LoopSection value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getEnd_frame() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getEnd_frame()));
                    }
                    if (value.getStart_frame() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getStart_frame()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LottieInfo.LoopSection redact(LottieInfo.LoopSection value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return LottieInfo.LoopSection.copy$default(value, 0, 0, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public LottieInfo.LoopSection decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    int iIntValue2 = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LottieInfo.LoopSection(iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 2) {
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
