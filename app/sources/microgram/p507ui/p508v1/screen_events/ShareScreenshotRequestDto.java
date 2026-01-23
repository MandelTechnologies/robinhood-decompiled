package microgram.p507ui.p508v1.screen_events;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.screen_events.FrameDto;

/* compiled from: ShareScreenshotRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005)(*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequest;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;)V", "", "share_sheet_title", "share_sheet_subtitle", "custom_share_content", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "component_item", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;)V", "toProto", "()Lmicrogram/ui/v1/screen_events/ShareScreenshotRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;", "getShare_sheet_title", "getShare_sheet_subtitle", "getCustom_share_content", "getComponent_item", "()Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "Companion", "Surrogate", "ComponentItemDto", "Serializer", "MultibindingModule", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class ShareScreenshotRequestDto implements Dto3<ShareScreenshotRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ShareScreenshotRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ShareScreenshotRequestDto, ShareScreenshotRequest>> binaryBase64Serializer$delegate;
    private static final ShareScreenshotRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ShareScreenshotRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ShareScreenshotRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getShare_sheet_title() {
        return this.surrogate.getShare_sheet_title();
    }

    public final String getShare_sheet_subtitle() {
        return this.surrogate.getShare_sheet_subtitle();
    }

    public final String getCustom_share_content() {
        return this.surrogate.getCustom_share_content();
    }

    public final ComponentItemDto getComponent_item() {
        if (this.surrogate.getComponent_item_identifier() != null) {
            return new ComponentItemDto.ComponentItemIdentifier(this.surrogate.getComponent_item_identifier());
        }
        if (this.surrogate.getScreenshot_frame() != null) {
            return new ComponentItemDto.ScreenshotFrame(this.surrogate.getScreenshot_frame());
        }
        return null;
    }

    public /* synthetic */ ShareScreenshotRequestDto(String str, String str2, String str3, ComponentItemDto componentItemDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : componentItemDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareScreenshotRequestDto(String str, String str2, String str3, ComponentItemDto componentItemDto) {
        ComponentItemDto.ComponentItemIdentifier componentItemIdentifier = componentItemDto instanceof ComponentItemDto.ComponentItemIdentifier ? (ComponentItemDto.ComponentItemIdentifier) componentItemDto : null;
        String value = componentItemIdentifier != null ? componentItemIdentifier.getValue() : null;
        ComponentItemDto.ScreenshotFrame screenshotFrame = componentItemDto instanceof ComponentItemDto.ScreenshotFrame ? (ComponentItemDto.ScreenshotFrame) componentItemDto : null;
        this(new Surrogate(str, str2, str3, value, screenshotFrame != null ? screenshotFrame.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public ShareScreenshotRequest toProto() {
        String share_sheet_title = this.surrogate.getShare_sheet_title();
        String share_sheet_subtitle = this.surrogate.getShare_sheet_subtitle();
        String custom_share_content = this.surrogate.getCustom_share_content();
        String component_item_identifier = this.surrogate.getComponent_item_identifier();
        FrameDto screenshot_frame = this.surrogate.getScreenshot_frame();
        return new ShareScreenshotRequest(component_item_identifier, screenshot_frame != null ? screenshot_frame.toProto() : null, share_sheet_title, share_sheet_subtitle, custom_share_content, null, 32, null);
    }

    public String toString() {
        return "[ShareScreenshotRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ShareScreenshotRequestDto) && Intrinsics.areEqual(((ShareScreenshotRequestDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShareScreenshotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;", "", "", "share_sheet_title", "share_sheet_subtitle", "custom_share_content", "component_item_identifier", "Lmicrogram/ui/v1/screen_events/FrameDto;", "screenshot_frame", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/screen_events/FrameDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/screen_events/FrameDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_screen_events_externalRelease", "(Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShare_sheet_title", "getShare_sheet_title$annotations", "()V", "getShare_sheet_subtitle", "getShare_sheet_subtitle$annotations", "getCustom_share_content", "getCustom_share_content$annotations", "getComponent_item_identifier", "getComponent_item_identifier$annotations", "Lmicrogram/ui/v1/screen_events/FrameDto;", "getScreenshot_frame", "()Lmicrogram/ui/v1/screen_events/FrameDto;", "getScreenshot_frame$annotations", "Companion", "$serializer", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String component_item_identifier;
        private final String custom_share_content;
        private final FrameDto screenshot_frame;
        private final String share_sheet_subtitle;
        private final String share_sheet_title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (FrameDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.share_sheet_title, surrogate.share_sheet_title) && Intrinsics.areEqual(this.share_sheet_subtitle, surrogate.share_sheet_subtitle) && Intrinsics.areEqual(this.custom_share_content, surrogate.custom_share_content) && Intrinsics.areEqual(this.component_item_identifier, surrogate.component_item_identifier) && Intrinsics.areEqual(this.screenshot_frame, surrogate.screenshot_frame);
        }

        public int hashCode() {
            String str = this.share_sheet_title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.share_sheet_subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.custom_share_content;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.component_item_identifier;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            FrameDto frameDto = this.screenshot_frame;
            return iHashCode4 + (frameDto != null ? frameDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(share_sheet_title=" + this.share_sheet_title + ", share_sheet_subtitle=" + this.share_sheet_subtitle + ", custom_share_content=" + this.custom_share_content + ", component_item_identifier=" + this.component_item_identifier + ", screenshot_frame=" + this.screenshot_frame + ")";
        }

        /* compiled from: ShareScreenshotRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ShareScreenshotRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, FrameDto frameDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.share_sheet_title = null;
            } else {
                this.share_sheet_title = str;
            }
            if ((i & 2) == 0) {
                this.share_sheet_subtitle = null;
            } else {
                this.share_sheet_subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.custom_share_content = null;
            } else {
                this.custom_share_content = str3;
            }
            if ((i & 8) == 0) {
                this.component_item_identifier = null;
            } else {
                this.component_item_identifier = str4;
            }
            if ((i & 16) == 0) {
                this.screenshot_frame = null;
            } else {
                this.screenshot_frame = frameDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_screen_events_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.share_sheet_title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.share_sheet_subtitle;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.custom_share_content;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.component_item_identifier;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str4);
            }
            FrameDto frameDto = self.screenshot_frame;
            if (frameDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, FrameDto.Serializer.INSTANCE, frameDto);
            }
        }

        public Surrogate(String str, String str2, String str3, String str4, FrameDto frameDto) {
            this.share_sheet_title = str;
            this.share_sheet_subtitle = str2;
            this.custom_share_content = str3;
            this.component_item_identifier = str4;
            this.screenshot_frame = frameDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, FrameDto frameDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : frameDto);
        }

        public final String getShare_sheet_title() {
            return this.share_sheet_title;
        }

        public final String getShare_sheet_subtitle() {
            return this.share_sheet_subtitle;
        }

        public final String getCustom_share_content() {
            return this.custom_share_content;
        }

        public final String getComponent_item_identifier() {
            return this.component_item_identifier;
        }

        public final FrameDto getScreenshot_frame() {
            return this.screenshot_frame;
        }
    }

    /* compiled from: ShareScreenshotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ShareScreenshotRequestDto, ShareScreenshotRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ShareScreenshotRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ShareScreenshotRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ShareScreenshotRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ShareScreenshotRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ShareScreenshotRequest> getProtoAdapter() {
            return ShareScreenshotRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ShareScreenshotRequestDto getZeroValue() {
            return ShareScreenshotRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ShareScreenshotRequestDto fromProto(ShareScreenshotRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String share_sheet_title = proto.getShare_sheet_title();
            String share_sheet_subtitle = proto.getShare_sheet_subtitle();
            String custom_share_content = proto.getCustom_share_content();
            String component_item_identifier = proto.getComponent_item_identifier();
            Frame screenshot_frame = proto.getScreenshot_frame();
            return new ShareScreenshotRequestDto(new Surrogate(share_sheet_title, share_sheet_subtitle, custom_share_content, component_item_identifier, screenshot_frame != null ? FrameDto.INSTANCE.fromProto(screenshot_frame) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.screen_events.ShareScreenshotRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareScreenshotRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ShareScreenshotRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ShareScreenshotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ComponentItemIdentifier", "ScreenshotFrame", "Companion", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto$ComponentItemIdentifier;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto$ScreenshotFrame;", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ComponentItemDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ComponentItemDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ComponentItemDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ShareScreenshotRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto$ComponentItemIdentifier;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ComponentItemIdentifier extends ComponentItemDto {
            private final String value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ComponentItemIdentifier) && Intrinsics.areEqual(this.value, ((ComponentItemIdentifier) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ComponentItemIdentifier(value=" + this.value + ")";
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComponentItemIdentifier(String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ShareScreenshotRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto$ScreenshotFrame;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "Lmicrogram/ui/v1/screen_events/FrameDto;", "value", "<init>", "(Lmicrogram/ui/v1/screen_events/FrameDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/screen_events/FrameDto;", "getValue", "()Lmicrogram/ui/v1/screen_events/FrameDto;", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenshotFrame extends ComponentItemDto {
            private final FrameDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ScreenshotFrame) && Intrinsics.areEqual(this.value, ((ScreenshotFrame) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ScreenshotFrame(value=" + this.value + ")";
            }

            public final FrameDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenshotFrame(FrameDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ShareScreenshotRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$ComponentItemDto;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ComponentItemDto, ShareScreenshotRequest> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ShareScreenshotRequest> getProtoAdapter() {
                return ShareScreenshotRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentItemDto fromProto(ShareScreenshotRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getComponent_item_identifier() != null) {
                    return new ComponentItemIdentifier(proto.getComponent_item_identifier());
                }
                if (proto.getScreenshot_frame() != null) {
                    return new ScreenshotFrame(FrameDto.INSTANCE.fromProto(proto.getScreenshot_frame()));
                }
                return null;
            }
        }
    }

    /* compiled from: ShareScreenshotRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ShareScreenshotRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.screen_events.ShareScreenshotRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ShareScreenshotRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ShareScreenshotRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ShareScreenshotRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ShareScreenshotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "microgram.ui.v1.screen_events.ShareScreenshotRequestDto";
        }
    }
}
