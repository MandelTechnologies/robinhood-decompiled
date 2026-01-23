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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.p508v1.MicrogramUiTypeDto;

/* compiled from: EmbeddedSectionReadyResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponse;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;)V", "", "screen_type", "identifier", "encoded_initial_content", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "microgram_ui_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;)V", "toProto", "()Lmicrogram/ui/v1/EmbeddedSectionReadyResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;", "getIdentifier", "getEncoded_initial_content", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class EmbeddedSectionReadyResponseDto implements Dto3<EmbeddedSectionReadyResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EmbeddedSectionReadyResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EmbeddedSectionReadyResponseDto, EmbeddedSectionReadyResponse>> binaryBase64Serializer$delegate;
    private static final EmbeddedSectionReadyResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EmbeddedSectionReadyResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EmbeddedSectionReadyResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final String getEncoded_initial_content() {
        return this.surrogate.getEncoded_initial_content();
    }

    public final MicrogramUiTypeDto getMicrogram_ui_type() {
        return this.surrogate.getMicrogram_ui_type();
    }

    public /* synthetic */ EmbeddedSectionReadyResponseDto(String str, String str2, String str3, MicrogramUiTypeDto microgramUiTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? MicrogramUiTypeDto.INSTANCE.getZeroValue() : microgramUiTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedSectionReadyResponseDto(String screen_type, String identifier, String encoded_initial_content, MicrogramUiTypeDto microgram_ui_type) {
        this(new Surrogate(screen_type, identifier, encoded_initial_content, microgram_ui_type));
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EmbeddedSectionReadyResponse toProto() {
        return new EmbeddedSectionReadyResponse(this.surrogate.getScreen_type(), this.surrogate.getIdentifier(), this.surrogate.getEncoded_initial_content(), (MicrogramUiType) this.surrogate.getMicrogram_ui_type().toProto(), null, 16, null);
    }

    public String toString() {
        return "[EmbeddedSectionReadyResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EmbeddedSectionReadyResponseDto) && Intrinsics.areEqual(((EmbeddedSectionReadyResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: EmbeddedSectionReadyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;", "", "", "screen_type", "identifier", "encoded_initial_content", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "microgram_ui_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen_type", "getScreen_type$annotations", "()V", "getIdentifier", "getIdentifier$annotations", "getEncoded_initial_content", "getEncoded_initial_content$annotations", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiTypeDto;", "getMicrogram_ui_type$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String encoded_initial_content;
        private final String identifier;
        private final MicrogramUiTypeDto microgram_ui_type;
        private final String screen_type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (MicrogramUiTypeDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.screen_type, surrogate.screen_type) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.encoded_initial_content, surrogate.encoded_initial_content) && this.microgram_ui_type == surrogate.microgram_ui_type;
        }

        public int hashCode() {
            return (((((this.screen_type.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.encoded_initial_content.hashCode()) * 31) + this.microgram_ui_type.hashCode();
        }

        public String toString() {
            return "Surrogate(screen_type=" + this.screen_type + ", identifier=" + this.identifier + ", encoded_initial_content=" + this.encoded_initial_content + ", microgram_ui_type=" + this.microgram_ui_type + ")";
        }

        /* compiled from: EmbeddedSectionReadyResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EmbeddedSectionReadyResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, MicrogramUiTypeDto microgramUiTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.screen_type = "";
            } else {
                this.screen_type = str;
            }
            if ((i & 2) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str2;
            }
            if ((i & 4) == 0) {
                this.encoded_initial_content = "";
            } else {
                this.encoded_initial_content = str3;
            }
            if ((i & 8) == 0) {
                this.microgram_ui_type = MicrogramUiTypeDto.INSTANCE.getZeroValue();
            } else {
                this.microgram_ui_type = microgramUiTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.screen_type, "")) {
                output.encodeStringElement(serialDesc, 0, self.screen_type);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 1, self.identifier);
            }
            if (!Intrinsics.areEqual(self.encoded_initial_content, "")) {
                output.encodeStringElement(serialDesc, 2, self.encoded_initial_content);
            }
            if (self.microgram_ui_type != MicrogramUiTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MicrogramUiTypeDto.Serializer.INSTANCE, self.microgram_ui_type);
            }
        }

        public Surrogate(String screen_type, String identifier, String encoded_initial_content, MicrogramUiTypeDto microgram_ui_type) {
            Intrinsics.checkNotNullParameter(screen_type, "screen_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
            this.screen_type = screen_type;
            this.identifier = identifier;
            this.encoded_initial_content = encoded_initial_content;
            this.microgram_ui_type = microgram_ui_type;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, MicrogramUiTypeDto microgramUiTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? MicrogramUiTypeDto.INSTANCE.getZeroValue() : microgramUiTypeDto);
        }

        public final String getScreen_type() {
            return this.screen_type;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getEncoded_initial_content() {
            return this.encoded_initial_content;
        }

        public final MicrogramUiTypeDto getMicrogram_ui_type() {
            return this.microgram_ui_type;
        }
    }

    /* compiled from: EmbeddedSectionReadyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EmbeddedSectionReadyResponseDto, EmbeddedSectionReadyResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EmbeddedSectionReadyResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EmbeddedSectionReadyResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EmbeddedSectionReadyResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) EmbeddedSectionReadyResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EmbeddedSectionReadyResponse> getProtoAdapter() {
            return EmbeddedSectionReadyResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EmbeddedSectionReadyResponseDto getZeroValue() {
            return EmbeddedSectionReadyResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EmbeddedSectionReadyResponseDto fromProto(EmbeddedSectionReadyResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EmbeddedSectionReadyResponseDto(new Surrogate(proto.getScreen_type(), proto.getIdentifier(), proto.getEncoded_initial_content(), MicrogramUiTypeDto.INSTANCE.fromProto(proto.getMicrogram_ui_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.EmbeddedSectionReadyResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmbeddedSectionReadyResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EmbeddedSectionReadyResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EmbeddedSectionReadyResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<EmbeddedSectionReadyResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.EmbeddedSectionReadyResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EmbeddedSectionReadyResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EmbeddedSectionReadyResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EmbeddedSectionReadyResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EmbeddedSectionReadyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "microgram.ui.v1.EmbeddedSectionReadyResponseDto";
        }
    }
}
