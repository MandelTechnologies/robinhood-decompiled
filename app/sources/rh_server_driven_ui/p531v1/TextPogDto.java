package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import rh_server_driven_ui.p531v1.TextPog;
import rh_server_driven_ui.p531v1.TextPogDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: TextPogDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005/.012B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010-¨\u00063"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TextPog;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextPogDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextPogDto$Surrogate;)V", "", "text", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "size", "Lrh_server_driven_ui/v1/ThemedColorDto;", "foreground_color_override", "background_color_override", "", "has_border", "is_disabled", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextPogDto$SizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZZ)V", "toProto", "()Lrh_server_driven_ui/v1/TextPog;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextPogDto$Surrogate;", "getText", "getSize", "()Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color_override", "getHas_border", "()Z", "Companion", "Surrogate", "SizeDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TextPogDto implements Dto3<TextPog>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TextPogDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TextPogDto, TextPog>> binaryBase64Serializer$delegate;
    private static final TextPogDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TextPogDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TextPogDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getText() {
        return this.surrogate.getText();
    }

    public final SizeDto getSize() {
        return this.surrogate.getSize();
    }

    public final ThemedColorDto getForeground_color_override() {
        return this.surrogate.getForeground_color_override();
    }

    public final ThemedColorDto getBackground_color_override() {
        return this.surrogate.getBackground_color_override();
    }

    public final boolean getHas_border() {
        return this.surrogate.getHas_border();
    }

    public final boolean is_disabled() {
        return this.surrogate.getIs_disabled();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TextPogDto(java.lang.String r2, rh_server_driven_ui.v1.TextPogDto.SizeDto r3, rh_server_driven_ui.p531v1.ThemedColorDto r4, rh_server_driven_ui.p531v1.ThemedColorDto r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            rh_server_driven_ui.v1.TextPogDto$SizeDto$Companion r3 = rh_server_driven_ui.v1.TextPogDto.SizeDto.INSTANCE
            rh_server_driven_ui.v1.TextPogDto$SizeDto r3 = r3.getZeroValue()
        L10:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L21
            r6 = r0
        L21:
            r8 = r8 & 32
            if (r8 == 0) goto L2d
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L34
        L2d:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TextPogDto.<init>(java.lang.String, rh_server_driven_ui.v1.TextPogDto$SizeDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextPogDto(String text, SizeDto size, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, boolean z2) {
        this(new Surrogate(text, size, themedColorDto, themedColorDto2, z, z2));
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TextPog toProto() {
        String text = this.surrogate.getText();
        TextPog.Size size = (TextPog.Size) this.surrogate.getSize().toProto();
        ThemedColorDto foreground_color_override = this.surrogate.getForeground_color_override();
        ThemedColor proto = foreground_color_override != null ? foreground_color_override.toProto() : null;
        ThemedColorDto background_color_override = this.surrogate.getBackground_color_override();
        return new TextPog(text, size, proto, background_color_override != null ? background_color_override.toProto() : null, this.surrogate.getHas_border(), this.surrogate.getIs_disabled(), null, 64, null);
    }

    public String toString() {
        return "[TextPogDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TextPogDto) && Intrinsics.areEqual(((TextPogDto) other).surrogate, this.surrogate);
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
    /* compiled from: TextPogDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010-R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b5\u0010&\u001a\u0004\b\u000b\u00103¨\u00068"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$Surrogate;", "", "", "text", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "size", "Lrh_server_driven_ui/v1/ThemedColorDto;", "foreground_color_override", "background_color_override", "", "has_border", "is_disabled", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextPogDto$SizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/TextPogDto$SizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextPogDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "getSize", "()Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "getSize$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getForeground_color_override$annotations", "getBackground_color_override", "getBackground_color_override$annotations", "Z", "getHas_border", "()Z", "getHas_border$annotations", "is_disabled$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto background_color_override;
        private final ThemedColorDto foreground_color_override;
        private final boolean has_border;
        private final boolean is_disabled;
        private final SizeDto size;
        private final String text;

        public Surrogate() {
            this((String) null, (SizeDto) null, (ThemedColorDto) null, (ThemedColorDto) null, false, false, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.text, surrogate.text) && this.size == surrogate.size && Intrinsics.areEqual(this.foreground_color_override, surrogate.foreground_color_override) && Intrinsics.areEqual(this.background_color_override, surrogate.background_color_override) && this.has_border == surrogate.has_border && this.is_disabled == surrogate.is_disabled;
        }

        public int hashCode() {
            int iHashCode = ((this.text.hashCode() * 31) + this.size.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.foreground_color_override;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.background_color_override;
            return ((((iHashCode2 + (themedColorDto2 != null ? themedColorDto2.hashCode() : 0)) * 31) + Boolean.hashCode(this.has_border)) * 31) + Boolean.hashCode(this.is_disabled);
        }

        public String toString() {
            return "Surrogate(text=" + this.text + ", size=" + this.size + ", foreground_color_override=" + this.foreground_color_override + ", background_color_override=" + this.background_color_override + ", has_border=" + this.has_border + ", is_disabled=" + this.is_disabled + ")";
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextPogDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TextPogDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SizeDto sizeDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            this.text = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.size = SizeDto.INSTANCE.getZeroValue();
            } else {
                this.size = sizeDto;
            }
            if ((i & 4) == 0) {
                this.foreground_color_override = null;
            } else {
                this.foreground_color_override = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.background_color_override = null;
            } else {
                this.background_color_override = themedColorDto2;
            }
            if ((i & 16) == 0) {
                this.has_border = false;
            } else {
                this.has_border = z;
            }
            if ((i & 32) == 0) {
                this.is_disabled = false;
            } else {
                this.is_disabled = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.text, "")) {
                output.encodeStringElement(serialDesc, 0, self.text);
            }
            if (self.size != SizeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SizeDto.Serializer.INSTANCE, self.size);
            }
            ThemedColorDto themedColorDto = self.foreground_color_override;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.background_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            boolean z = self.has_border;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            boolean z2 = self.is_disabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
        }

        public Surrogate(String text, SizeDto size, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(size, "size");
            this.text = text;
            this.size = size;
            this.foreground_color_override = themedColorDto;
            this.background_color_override = themedColorDto2;
            this.has_border = z;
            this.is_disabled = z2;
        }

        public final String getText() {
            return this.text;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, rh_server_driven_ui.v1.TextPogDto.SizeDto r3, rh_server_driven_ui.p531v1.ThemedColorDto r4, rh_server_driven_ui.p531v1.ThemedColorDto r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                rh_server_driven_ui.v1.TextPogDto$SizeDto$Companion r3 = rh_server_driven_ui.v1.TextPogDto.SizeDto.INSTANCE
                rh_server_driven_ui.v1.TextPogDto$SizeDto r3 = r3.getZeroValue()
            L10:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L16
                r4 = r0
            L16:
                r9 = r8 & 8
                if (r9 == 0) goto L1b
                r5 = r0
            L1b:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L21
                r6 = r0
            L21:
                r8 = r8 & 32
                if (r8 == 0) goto L2d
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L34
            L2d:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L34:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TextPogDto.Surrogate.<init>(java.lang.String, rh_server_driven_ui.v1.TextPogDto$SizeDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SizeDto getSize() {
            return this.size;
        }

        public final ThemedColorDto getForeground_color_override() {
            return this.foreground_color_override;
        }

        public final ThemedColorDto getBackground_color_override() {
            return this.background_color_override;
        }

        public final boolean getHas_border() {
            return this.has_border;
        }

        /* renamed from: is_disabled, reason: from getter */
        public final boolean getIs_disabled() {
            return this.is_disabled;
        }
    }

    /* compiled from: TextPogDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextPogDto;", "Lrh_server_driven_ui/v1/TextPog;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextPogDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TextPogDto, TextPog> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TextPogDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextPogDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextPogDto> getBinaryBase64Serializer() {
            return (KSerializer) TextPogDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TextPog> getProtoAdapter() {
            return TextPog.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextPogDto getZeroValue() {
            return TextPogDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextPogDto fromProto(TextPog proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String text = proto.getText();
            SizeDto sizeDtoFromProto = SizeDto.INSTANCE.fromProto(proto.getSize());
            ThemedColor foreground_color_override = proto.getForeground_color_override();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = foreground_color_override != null ? ThemedColorDto.INSTANCE.fromProto(foreground_color_override) : null;
            ThemedColor background_color_override = proto.getBackground_color_override();
            return new TextPogDto(new Surrogate(text, sizeDtoFromProto, themedColorDtoFromProto, background_color_override != null ? ThemedColorDto.INSTANCE.fromProto(background_color_override) : null, proto.getHas_border(), proto.getIs_disabled()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextPogDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextPogDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TextPogDto(null, null, null, null, false, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextPogDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextPog$Size;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_UNSPECIFIED", "SIZE_EXTRA_SMALL", "SIZE_SMALL", "SIZE_LARGE", "SIZE_EXTRA_LARGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SizeDto implements Dto2<TextPog.Size>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SizeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SizeDto, TextPog.Size>> binaryBase64Serializer$delegate;
        public static final SizeDto SIZE_UNSPECIFIED = new SIZE_UNSPECIFIED("SIZE_UNSPECIFIED", 0);
        public static final SizeDto SIZE_EXTRA_SMALL = new SIZE_EXTRA_SMALL("SIZE_EXTRA_SMALL", 1);
        public static final SizeDto SIZE_SMALL = new SIZE_SMALL("SIZE_SMALL", 2);
        public static final SizeDto SIZE_LARGE = new SIZE_LARGE("SIZE_LARGE", 3);
        public static final SizeDto SIZE_EXTRA_LARGE = new SIZE_EXTRA_LARGE("SIZE_EXTRA_LARGE", 4);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{SIZE_UNSPECIFIED, SIZE_EXTRA_SMALL, SIZE_SMALL, SIZE_LARGE, SIZE_EXTRA_LARGE};
        }

        public /* synthetic */ SizeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SizeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextPogDto.SizeDto.SIZE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextPog$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_UNSPECIFIED extends SizeDto {
            SIZE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextPog.Size toProto() {
                return TextPog.Size.SIZE_UNSPECIFIED;
            }
        }

        private SizeDto(String str, int i) {
        }

        static {
            SizeDto[] sizeDtoArr$values = $values();
            $VALUES = sizeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextPogDto$SizeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextPogDto.SizeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextPogDto.SizeDto.SIZE_EXTRA_SMALL", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextPog$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_EXTRA_SMALL extends SizeDto {
            SIZE_EXTRA_SMALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextPog.Size toProto() {
                return TextPog.Size.SIZE_EXTRA_SMALL;
            }
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextPogDto.SizeDto.SIZE_SMALL", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextPog$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_SMALL extends SizeDto {
            SIZE_SMALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextPog.Size toProto() {
                return TextPog.Size.SIZE_SMALL;
            }
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextPogDto.SizeDto.SIZE_LARGE", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextPog$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_LARGE extends SizeDto {
            SIZE_LARGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextPog.Size toProto() {
                return TextPog.Size.SIZE_LARGE;
            }
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextPogDto.SizeDto.SIZE_EXTRA_LARGE", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextPog$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_EXTRA_LARGE extends SizeDto {
            SIZE_EXTRA_LARGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextPog.Size toProto() {
                return TextPog.Size.SIZE_EXTRA_LARGE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$SizeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "Lrh_server_driven_ui/v1/TextPog$Size;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SizeDto, TextPog.Size> {

            /* compiled from: TextPogDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextPog.Size.values().length];
                    try {
                        iArr[TextPog.Size.SIZE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextPog.Size.SIZE_EXTRA_SMALL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextPog.Size.SIZE_SMALL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TextPog.Size.SIZE_LARGE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TextPog.Size.SIZE_EXTRA_LARGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SizeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SizeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SizeDto> getBinaryBase64Serializer() {
                return (KSerializer) SizeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextPog.Size> getProtoAdapter() {
                return TextPog.Size.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto getZeroValue() {
                return SizeDto.SIZE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto fromProto(TextPog.Size proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SizeDto.SIZE_UNSPECIFIED;
                }
                if (i == 2) {
                    return SizeDto.SIZE_EXTRA_SMALL;
                }
                if (i == 3) {
                    return SizeDto.SIZE_SMALL;
                }
                if (i == 4) {
                    return SizeDto.SIZE_LARGE;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return SizeDto.SIZE_EXTRA_LARGE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextPogDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$SizeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<SizeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SizeDto, TextPog.Size> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextPog.Size", SizeDto.getEntries(), SizeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SizeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SizeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SizeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TextPogDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextPogDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextPogDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TextPogDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TextPog", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TextPogDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TextPogDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TextPogDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TextPogDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPogDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TextPogDto";
        }
    }
}
