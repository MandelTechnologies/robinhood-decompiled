package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ImageDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;

/* compiled from: ActivityFeedRowDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ActivityFeedRow;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;)V", "", "id", "Lrh_server_driven_ui/v1/RenderableTextDto;", "content", "Lrh_server_driven_ui/v1/ActionDto;", "action", "", "is_read", "Lrh_server_driven_ui/v1/ImageDto;", "image", "relative_time_label", "logging_identifier", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLrh_server_driven_ui/v1/ImageDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/ActivityFeedRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class ActivityFeedRowDto implements Dto3<ActivityFeedRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActivityFeedRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActivityFeedRowDto, ActivityFeedRow>> binaryBase64Serializer$delegate;
    private static final ActivityFeedRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActivityFeedRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActivityFeedRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ ActivityFeedRowDto(String str, RenderableTextDto renderableTextDto, ActionDto actionDto, boolean z, ImageDto imageDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : renderableTextDto, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : imageDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityFeedRowDto(String id, RenderableTextDto renderableTextDto, ActionDto actionDto, boolean z, ImageDto imageDto, String relative_time_label, String str) {
        this(new Surrogate(id, renderableTextDto, actionDto, z, imageDto, relative_time_label, str));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(relative_time_label, "relative_time_label");
    }

    @Override // com.robinhood.idl.Dto
    public ActivityFeedRow toProto() {
        String id = this.surrogate.getId();
        RenderableTextDto content = this.surrogate.getContent();
        RenderableText proto = content != null ? content.toProto() : null;
        ActionDto action = this.surrogate.getAction();
        Action proto2 = action != null ? action.toProto() : null;
        boolean is_read = this.surrogate.getIs_read();
        ImageDto image = this.surrogate.getImage();
        return new ActivityFeedRow(id, proto, proto2, is_read, image != null ? image.toProto() : null, this.surrogate.getRelative_time_label(), this.surrogate.getLogging_identifier(), null, 128, null);
    }

    public String toString() {
        return "[ActivityFeedRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActivityFeedRowDto) && Intrinsics.areEqual(((ActivityFeedRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActivityFeedRowDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u0010(\u001a\u0004\b\t\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010(\u001a\u0004\b5\u00106R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b9\u0010(\u001a\u0004\b8\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010\u001f¨\u0006>"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;", "", "", "id", "Lrh_server_driven_ui/v1/RenderableTextDto;", "content", "Lrh_server_driven_ui/v1/ActionDto;", "action", "", "is_read", "Lrh_server_driven_ui/v1/ImageDto;", "image", "relative_time_label", "logging_identifier", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLrh_server_driven_ui/v1/ImageDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLrh_server_driven_ui/v1/ImageDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lrh_server_driven_ui/v1/RenderableTextDto;", "getContent", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getContent$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "Z", "()Z", "is_read$annotations", "Lrh_server_driven_ui/v1/ImageDto;", "getImage", "()Lrh_server_driven_ui/v1/ImageDto;", "getImage$annotations", "getRelative_time_label", "getRelative_time_label$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final RenderableTextDto content;
        private final String id;
        private final ImageDto image;
        private final boolean is_read;
        private final String logging_identifier;
        private final String relative_time_label;

        public Surrogate() {
            this((String) null, (RenderableTextDto) null, (ActionDto) null, false, (ImageDto) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.action, surrogate.action) && this.is_read == surrogate.is_read && Intrinsics.areEqual(this.image, surrogate.image) && Intrinsics.areEqual(this.relative_time_label, surrogate.relative_time_label) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            RenderableTextDto renderableTextDto = this.content;
            int iHashCode2 = (iHashCode + (renderableTextDto == null ? 0 : renderableTextDto.hashCode())) * 31;
            ActionDto actionDto = this.action;
            int iHashCode3 = (((iHashCode2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31) + Boolean.hashCode(this.is_read)) * 31;
            ImageDto imageDto = this.image;
            int iHashCode4 = (((iHashCode3 + (imageDto == null ? 0 : imageDto.hashCode())) * 31) + this.relative_time_label.hashCode()) * 31;
            String str = this.logging_identifier;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", content=" + this.content + ", action=" + this.action + ", is_read=" + this.is_read + ", image=" + this.image + ", relative_time_label=" + this.relative_time_label + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: ActivityFeedRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActivityFeedRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, RenderableTextDto renderableTextDto, ActionDto actionDto, boolean z, ImageDto imageDto, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.content = null;
            } else {
                this.content = renderableTextDto;
            }
            if ((i & 4) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
            if ((i & 8) == 0) {
                this.is_read = false;
            } else {
                this.is_read = z;
            }
            if ((i & 16) == 0) {
                this.image = null;
            } else {
                this.image = imageDto;
            }
            if ((i & 32) == 0) {
                this.relative_time_label = "";
            } else {
                this.relative_time_label = str2;
            }
            if ((i & 64) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            RenderableTextDto renderableTextDto = self.content;
            if (renderableTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, RenderableTextDto.Serializer.INSTANCE, renderableTextDto);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, actionDto);
            }
            boolean z = self.is_read;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            ImageDto imageDto = self.image;
            if (imageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ImageDto.Serializer.INSTANCE, imageDto);
            }
            if (!Intrinsics.areEqual(self.relative_time_label, "")) {
                output.encodeStringElement(serialDesc, 5, self.relative_time_label);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String id, RenderableTextDto renderableTextDto, ActionDto actionDto, boolean z, ImageDto imageDto, String relative_time_label, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(relative_time_label, "relative_time_label");
            this.id = id;
            this.content = renderableTextDto;
            this.action = actionDto;
            this.is_read = z;
            this.image = imageDto;
            this.relative_time_label = relative_time_label;
            this.logging_identifier = str;
        }

        public /* synthetic */ Surrogate(String str, RenderableTextDto renderableTextDto, ActionDto actionDto, boolean z, ImageDto imageDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : renderableTextDto, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : imageDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? null : str3);
        }

        public final String getId() {
            return this.id;
        }

        public final RenderableTextDto getContent() {
            return this.content;
        }

        public final ActionDto getAction() {
            return this.action;
        }

        /* renamed from: is_read, reason: from getter */
        public final boolean getIs_read() {
            return this.is_read;
        }

        public final ImageDto getImage() {
            return this.image;
        }

        public final String getRelative_time_label() {
            return this.relative_time_label;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: ActivityFeedRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "Lrh_server_driven_ui/v1/ActivityFeedRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActivityFeedRowDto, ActivityFeedRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActivityFeedRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivityFeedRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivityFeedRowDto> getBinaryBase64Serializer() {
            return (KSerializer) ActivityFeedRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActivityFeedRow> getProtoAdapter() {
            return ActivityFeedRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivityFeedRowDto getZeroValue() {
            return ActivityFeedRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivityFeedRowDto fromProto(ActivityFeedRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            RenderableText content = proto.getContent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RenderableTextDto renderableTextDtoFromProto = content != null ? RenderableTextDto.INSTANCE.fromProto(content) : null;
            Action action = proto.getAction();
            ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
            boolean is_read = proto.getIs_read();
            Image image = proto.getImage();
            return new ActivityFeedRowDto(new Surrogate(id, renderableTextDtoFromProto, actionDtoFromProto, is_read, image != null ? ImageDto.INSTANCE.fromProto(image) : null, proto.getRelative_time_label(), proto.getLogging_identifier()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ActivityFeedRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityFeedRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ActivityFeedRowDto(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActivityFeedRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ActivityFeedRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActivityFeedRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ActivityFeedRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActivityFeedRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActivityFeedRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActivityFeedRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActivityFeedRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ActivityFeedRowDto";
        }
    }
}
