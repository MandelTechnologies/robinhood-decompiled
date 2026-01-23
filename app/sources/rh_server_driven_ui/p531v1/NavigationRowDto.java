package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
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
import rh_server_driven_ui.p531v1.MetaElementDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.StartElementDto;

/* compiled from: NavigationRowDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/NavigationRow;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;)V", "Lrh_server_driven_ui/v1/RenderableTextDto;", "title", "subtitle", "Lrh_server_driven_ui/v1/ActionDto;", "action", "", "is_disabled", "", "logging_identifier", "Lrh_server_driven_ui/v1/StartElementDto;", "start", "Lrh_server_driven_ui/v1/MetaElementDto;", Constants.REFERRER_API_META, "(Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/StartElementDto;Lrh_server_driven_ui/v1/MetaElementDto;)V", "toProto", "()Lrh_server_driven_ui/v1/NavigationRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;", "getTitle", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getSubtitle", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "()Z", "getLogging_identifier", "getStart", "()Lrh_server_driven_ui/v1/StartElementDto;", "getMeta", "()Lrh_server_driven_ui/v1/MetaElementDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class NavigationRowDto implements Dto3<NavigationRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NavigationRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NavigationRowDto, NavigationRow>> binaryBase64Serializer$delegate;
    private static final NavigationRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NavigationRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NavigationRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final RenderableTextDto getTitle() {
        return this.surrogate.getTitle();
    }

    public final RenderableTextDto getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final boolean is_disabled() {
        return this.surrogate.getIs_disabled();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final StartElementDto getStart() {
        return this.surrogate.getStart();
    }

    public final MetaElementDto getMeta() {
        return this.surrogate.getMeta();
    }

    public /* synthetic */ NavigationRowDto(RenderableTextDto renderableTextDto, RenderableTextDto renderableTextDto2, ActionDto actionDto, boolean z, String str, StartElementDto startElementDto, MetaElementDto metaElementDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renderableTextDto, (i & 2) != 0 ? null : renderableTextDto2, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : startElementDto, (i & 64) != 0 ? null : metaElementDto);
    }

    public NavigationRowDto(RenderableTextDto renderableTextDto, RenderableTextDto renderableTextDto2, ActionDto actionDto, boolean z, String str, StartElementDto startElementDto, MetaElementDto metaElementDto) {
        this(new Surrogate(renderableTextDto, renderableTextDto2, actionDto, z, str, startElementDto, metaElementDto));
    }

    @Override // com.robinhood.idl.Dto
    public NavigationRow toProto() {
        RenderableTextDto title = this.surrogate.getTitle();
        RenderableText proto = title != null ? title.toProto() : null;
        RenderableTextDto subtitle = this.surrogate.getSubtitle();
        RenderableText proto2 = subtitle != null ? subtitle.toProto() : null;
        ActionDto action = this.surrogate.getAction();
        Action proto3 = action != null ? action.toProto() : null;
        boolean is_disabled = this.surrogate.getIs_disabled();
        String logging_identifier = this.surrogate.getLogging_identifier();
        StartElementDto start = this.surrogate.getStart();
        StartElement proto4 = start != null ? start.toProto() : null;
        MetaElementDto meta = this.surrogate.getMeta();
        return new NavigationRow(proto, proto2, proto3, is_disabled, logging_identifier, proto4, meta != null ? meta.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[NavigationRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NavigationRowDto) && Intrinsics.areEqual(((NavigationRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: NavigationRowDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010*\u001a\u0004\b\b\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010 R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010*\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;", "", "Lrh_server_driven_ui/v1/RenderableTextDto;", "title", "subtitle", "Lrh_server_driven_ui/v1/ActionDto;", "action", "", "is_disabled", "", "logging_identifier", "Lrh_server_driven_ui/v1/StartElementDto;", "start", "Lrh_server_driven_ui/v1/MetaElementDto;", Constants.REFERRER_API_META, "<init>", "(Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/StartElementDto;Lrh_server_driven_ui/v1/MetaElementDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/ActionDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/StartElementDto;Lrh_server_driven_ui/v1/MetaElementDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/RenderableTextDto;", "getTitle", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "Z", "()Z", "is_disabled$annotations", "Ljava/lang/String;", "getLogging_identifier", "getLogging_identifier$annotations", "Lrh_server_driven_ui/v1/StartElementDto;", "getStart", "()Lrh_server_driven_ui/v1/StartElementDto;", "getStart$annotations", "Lrh_server_driven_ui/v1/MetaElementDto;", "getMeta", "()Lrh_server_driven_ui/v1/MetaElementDto;", "getMeta$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final boolean is_disabled;
        private final String logging_identifier;
        private final MetaElementDto meta;
        private final StartElementDto start;
        private final RenderableTextDto subtitle;
        private final RenderableTextDto title;

        public Surrogate() {
            this((RenderableTextDto) null, (RenderableTextDto) null, (ActionDto) null, false, (String) null, (StartElementDto) null, (MetaElementDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.action, surrogate.action) && this.is_disabled == surrogate.is_disabled && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.start, surrogate.start) && Intrinsics.areEqual(this.meta, surrogate.meta);
        }

        public int hashCode() {
            RenderableTextDto renderableTextDto = this.title;
            int iHashCode = (renderableTextDto == null ? 0 : renderableTextDto.hashCode()) * 31;
            RenderableTextDto renderableTextDto2 = this.subtitle;
            int iHashCode2 = (iHashCode + (renderableTextDto2 == null ? 0 : renderableTextDto2.hashCode())) * 31;
            ActionDto actionDto = this.action;
            int iHashCode3 = (((iHashCode2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31) + Boolean.hashCode(this.is_disabled)) * 31;
            String str = this.logging_identifier;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            StartElementDto startElementDto = this.start;
            int iHashCode5 = (iHashCode4 + (startElementDto == null ? 0 : startElementDto.hashCode())) * 31;
            MetaElementDto metaElementDto = this.meta;
            return iHashCode5 + (metaElementDto != null ? metaElementDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", is_disabled=" + this.is_disabled + ", logging_identifier=" + this.logging_identifier + ", start=" + this.start + ", meta=" + this.meta + ")";
        }

        /* compiled from: NavigationRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NavigationRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, RenderableTextDto renderableTextDto, RenderableTextDto renderableTextDto2, ActionDto actionDto, boolean z, String str, StartElementDto startElementDto, MetaElementDto metaElementDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = renderableTextDto;
            }
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = renderableTextDto2;
            }
            if ((i & 4) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
            if ((i & 8) == 0) {
                this.is_disabled = false;
            } else {
                this.is_disabled = z;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str;
            }
            if ((i & 32) == 0) {
                this.start = null;
            } else {
                this.start = startElementDto;
            }
            if ((i & 64) == 0) {
                this.meta = null;
            } else {
                this.meta = metaElementDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            RenderableTextDto renderableTextDto = self.title;
            if (renderableTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, RenderableTextDto.Serializer.INSTANCE, renderableTextDto);
            }
            RenderableTextDto renderableTextDto2 = self.subtitle;
            if (renderableTextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, RenderableTextDto.Serializer.INSTANCE, renderableTextDto2);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, actionDto);
            }
            boolean z = self.is_disabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            StartElementDto startElementDto = self.start;
            if (startElementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StartElementDto.Serializer.INSTANCE, startElementDto);
            }
            MetaElementDto metaElementDto = self.meta;
            if (metaElementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MetaElementDto.Serializer.INSTANCE, metaElementDto);
            }
        }

        public Surrogate(RenderableTextDto renderableTextDto, RenderableTextDto renderableTextDto2, ActionDto actionDto, boolean z, String str, StartElementDto startElementDto, MetaElementDto metaElementDto) {
            this.title = renderableTextDto;
            this.subtitle = renderableTextDto2;
            this.action = actionDto;
            this.is_disabled = z;
            this.logging_identifier = str;
            this.start = startElementDto;
            this.meta = metaElementDto;
        }

        public /* synthetic */ Surrogate(RenderableTextDto renderableTextDto, RenderableTextDto renderableTextDto2, ActionDto actionDto, boolean z, String str, StartElementDto startElementDto, MetaElementDto metaElementDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : renderableTextDto, (i & 2) != 0 ? null : renderableTextDto2, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : startElementDto, (i & 64) != 0 ? null : metaElementDto);
        }

        public final RenderableTextDto getTitle() {
            return this.title;
        }

        public final RenderableTextDto getSubtitle() {
            return this.subtitle;
        }

        public final ActionDto getAction() {
            return this.action;
        }

        /* renamed from: is_disabled, reason: from getter */
        public final boolean getIs_disabled() {
            return this.is_disabled;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final StartElementDto getStart() {
            return this.start;
        }

        public final MetaElementDto getMeta() {
            return this.meta;
        }
    }

    /* compiled from: NavigationRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/NavigationRowDto;", "Lrh_server_driven_ui/v1/NavigationRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/NavigationRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NavigationRowDto, NavigationRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NavigationRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationRowDto> getBinaryBase64Serializer() {
            return (KSerializer) NavigationRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NavigationRow> getProtoAdapter() {
            return NavigationRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationRowDto getZeroValue() {
            return NavigationRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationRowDto fromProto(NavigationRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            RenderableText title = proto.getTitle();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RenderableTextDto renderableTextDtoFromProto = title != null ? RenderableTextDto.INSTANCE.fromProto(title) : null;
            RenderableText subtitle = proto.getSubtitle();
            RenderableTextDto renderableTextDtoFromProto2 = subtitle != null ? RenderableTextDto.INSTANCE.fromProto(subtitle) : null;
            Action action = proto.getAction();
            ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
            boolean is_disabled = proto.getIs_disabled();
            String logging_identifier = proto.getLogging_identifier();
            StartElement start = proto.getStart();
            StartElementDto startElementDtoFromProto = start != null ? StartElementDto.INSTANCE.fromProto(start) : null;
            MetaElement meta = proto.getMeta();
            return new NavigationRowDto(new Surrogate(renderableTextDtoFromProto, renderableTextDtoFromProto2, actionDtoFromProto, is_disabled, logging_identifier, startElementDtoFromProto, meta != null ? MetaElementDto.INSTANCE.fromProto(meta) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.NavigationRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NavigationRowDto(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NavigationRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/NavigationRowDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/NavigationRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<NavigationRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.NavigationRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NavigationRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NavigationRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NavigationRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NavigationRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.NavigationRowDto";
        }
    }
}
