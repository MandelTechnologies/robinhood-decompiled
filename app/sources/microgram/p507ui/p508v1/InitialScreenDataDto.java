package microgram.p507ui.p508v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import microgram.p507ui.p508v1.MicrogramUiTypeDto;
import microgram.p507ui.p508v1.ThemeDto;

/* compiled from: InitialScreenDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/InitialScreenData;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;)V", "", "router_identifier", "Lmicrogram/ui/v1/ThemeDto;", "theme", "screen_type", "screen_identifier", "encoded_initial_content", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "microgram_ui_type", "(Ljava/lang/String;Lmicrogram/ui/v1/ThemeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;)V", "toProto", "()Lmicrogram/ui/v1/InitialScreenData;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;", "getRouter_identifier", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getScreen_type", "getScreen_identifier", "getEncoded_initial_content", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class InitialScreenDataDto implements Dto3<InitialScreenData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InitialScreenDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InitialScreenDataDto, InitialScreenData>> binaryBase64Serializer$delegate;
    private static final InitialScreenDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InitialScreenDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InitialScreenDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRouter_identifier() {
        return this.surrogate.getRouter_identifier();
    }

    public final ThemeDto getTheme() {
        return this.surrogate.getTheme();
    }

    public final String getScreen_type() {
        return this.surrogate.getScreen_type();
    }

    public final String getScreen_identifier() {
        return this.surrogate.getScreen_identifier();
    }

    public final String getEncoded_initial_content() {
        return this.surrogate.getEncoded_initial_content();
    }

    public final MicrogramUiTypeDto getMicrogram_ui_type() {
        return this.surrogate.getMicrogram_ui_type();
    }

    public /* synthetic */ InitialScreenDataDto(String str, ThemeDto themeDto, String str2, String str3, String str4, MicrogramUiTypeDto microgramUiTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? MicrogramUiTypeDto.INSTANCE.getZeroValue() : microgramUiTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InitialScreenDataDto(String router_identifier, ThemeDto themeDto, String screen_type, String screen_identifier, String encoded_initial_content, MicrogramUiTypeDto microgram_ui_type) {
        this(new Surrogate(router_identifier, themeDto, screen_type, screen_identifier, encoded_initial_content, microgram_ui_type));
        Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InitialScreenData toProto() {
        String router_identifier = this.surrogate.getRouter_identifier();
        ThemeDto theme = this.surrogate.getTheme();
        return new InitialScreenData(router_identifier, theme != null ? theme.toProto() : null, this.surrogate.getScreen_type(), this.surrogate.getScreen_identifier(), this.surrogate.getEncoded_initial_content(), (MicrogramUiType) this.surrogate.getMicrogram_ui_type().toProto(), null, 64, null);
    }

    public String toString() {
        return "[InitialScreenDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InitialScreenDataDto) && Intrinsics.areEqual(((InitialScreenDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: InitialScreenDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\u001cR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;", "", "", "router_identifier", "Lmicrogram/ui/v1/ThemeDto;", "theme", "screen_type", "screen_identifier", "encoded_initial_content", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "microgram_ui_type", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/ThemeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/ui/v1/ThemeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRouter_identifier", "getRouter_identifier$annotations", "()V", "Lmicrogram/ui/v1/ThemeDto;", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getTheme$annotations", "getScreen_type", "getScreen_type$annotations", "getScreen_identifier", "getScreen_identifier$annotations", "getEncoded_initial_content", "getEncoded_initial_content$annotations", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiTypeDto;", "getMicrogram_ui_type$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String encoded_initial_content;
        private final MicrogramUiTypeDto microgram_ui_type;
        private final String router_identifier;
        private final String screen_identifier;
        private final String screen_type;
        private final ThemeDto theme;

        public Surrogate() {
            this((String) null, (ThemeDto) null, (String) null, (String) null, (String) null, (MicrogramUiTypeDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.router_identifier, surrogate.router_identifier) && Intrinsics.areEqual(this.theme, surrogate.theme) && Intrinsics.areEqual(this.screen_type, surrogate.screen_type) && Intrinsics.areEqual(this.screen_identifier, surrogate.screen_identifier) && Intrinsics.areEqual(this.encoded_initial_content, surrogate.encoded_initial_content) && this.microgram_ui_type == surrogate.microgram_ui_type;
        }

        public int hashCode() {
            int iHashCode = this.router_identifier.hashCode() * 31;
            ThemeDto themeDto = this.theme;
            return ((((((((iHashCode + (themeDto == null ? 0 : themeDto.hashCode())) * 31) + this.screen_type.hashCode()) * 31) + this.screen_identifier.hashCode()) * 31) + this.encoded_initial_content.hashCode()) * 31) + this.microgram_ui_type.hashCode();
        }

        public String toString() {
            return "Surrogate(router_identifier=" + this.router_identifier + ", theme=" + this.theme + ", screen_type=" + this.screen_type + ", screen_identifier=" + this.screen_identifier + ", encoded_initial_content=" + this.encoded_initial_content + ", microgram_ui_type=" + this.microgram_ui_type + ")";
        }

        /* compiled from: InitialScreenDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InitialScreenDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ThemeDto themeDto, String str2, String str3, String str4, MicrogramUiTypeDto microgramUiTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.router_identifier = "";
            } else {
                this.router_identifier = str;
            }
            if ((i & 2) == 0) {
                this.theme = null;
            } else {
                this.theme = themeDto;
            }
            if ((i & 4) == 0) {
                this.screen_type = "";
            } else {
                this.screen_type = str2;
            }
            if ((i & 8) == 0) {
                this.screen_identifier = "";
            } else {
                this.screen_identifier = str3;
            }
            if ((i & 16) == 0) {
                this.encoded_initial_content = "";
            } else {
                this.encoded_initial_content = str4;
            }
            if ((i & 32) == 0) {
                this.microgram_ui_type = MicrogramUiTypeDto.INSTANCE.getZeroValue();
            } else {
                this.microgram_ui_type = microgramUiTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.router_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.router_identifier);
            }
            ThemeDto themeDto = self.theme;
            if (themeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemeDto.Serializer.INSTANCE, themeDto);
            }
            if (!Intrinsics.areEqual(self.screen_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.screen_type);
            }
            if (!Intrinsics.areEqual(self.screen_identifier, "")) {
                output.encodeStringElement(serialDesc, 3, self.screen_identifier);
            }
            if (!Intrinsics.areEqual(self.encoded_initial_content, "")) {
                output.encodeStringElement(serialDesc, 4, self.encoded_initial_content);
            }
            if (self.microgram_ui_type != MicrogramUiTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, MicrogramUiTypeDto.Serializer.INSTANCE, self.microgram_ui_type);
            }
        }

        public Surrogate(String router_identifier, ThemeDto themeDto, String screen_type, String screen_identifier, String encoded_initial_content, MicrogramUiTypeDto microgram_ui_type) {
            Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
            Intrinsics.checkNotNullParameter(screen_type, "screen_type");
            Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
            this.router_identifier = router_identifier;
            this.theme = themeDto;
            this.screen_type = screen_type;
            this.screen_identifier = screen_identifier;
            this.encoded_initial_content = encoded_initial_content;
            this.microgram_ui_type = microgram_ui_type;
        }

        public /* synthetic */ Surrogate(String str, ThemeDto themeDto, String str2, String str3, String str4, MicrogramUiTypeDto microgramUiTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? MicrogramUiTypeDto.INSTANCE.getZeroValue() : microgramUiTypeDto);
        }

        public final String getRouter_identifier() {
            return this.router_identifier;
        }

        public final ThemeDto getTheme() {
            return this.theme;
        }

        public final String getScreen_type() {
            return this.screen_type;
        }

        public final String getScreen_identifier() {
            return this.screen_identifier;
        }

        public final String getEncoded_initial_content() {
            return this.encoded_initial_content;
        }

        public final MicrogramUiTypeDto getMicrogram_ui_type() {
            return this.microgram_ui_type;
        }
    }

    /* compiled from: InitialScreenDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lmicrogram/ui/v1/InitialScreenData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/InitialScreenDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InitialScreenDataDto, InitialScreenData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitialScreenDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InitialScreenDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InitialScreenDataDto> getBinaryBase64Serializer() {
            return (KSerializer) InitialScreenDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InitialScreenData> getProtoAdapter() {
            return InitialScreenData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InitialScreenDataDto getZeroValue() {
            return InitialScreenDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InitialScreenDataDto fromProto(InitialScreenData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String router_identifier = proto.getRouter_identifier();
            Theme theme = proto.getTheme();
            return new InitialScreenDataDto(new Surrogate(router_identifier, theme != null ? ThemeDto.INSTANCE.fromProto(theme) : null, proto.getScreen_type(), proto.getScreen_identifier(), proto.getEncoded_initial_content(), MicrogramUiTypeDto.INSTANCE.fromProto(proto.getMicrogram_ui_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.InitialScreenDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialScreenDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InitialScreenDataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InitialScreenDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/InitialScreenDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<InitialScreenDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.InitialScreenData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InitialScreenDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InitialScreenDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InitialScreenDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InitialScreenDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "microgram.ui.v1.InitialScreenDataDto";
        }
    }
}
