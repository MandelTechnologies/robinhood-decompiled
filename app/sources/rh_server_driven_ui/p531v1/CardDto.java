package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.BorderDto;
import rh_server_driven_ui.p531v1.Card;
import rh_server_driven_ui.p531v1.CardDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: CardDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000521345B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Card;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/CardDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/CardDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", "content", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "", "background_color_opacity", "", "corner_radius", "Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "outline", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Float;Ljava/lang/Integer;Lrh_server_driven_ui/v1/CardDto$OutlineDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Card;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/CardDto$Surrogate;", "getContent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color_opacity", "()Ljava/lang/Float;", "getCorner_radius", "()Ljava/lang/Integer;", "getOutline", "()Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "Companion", "Surrogate", "OutlineDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class CardDto implements Dto3<Card>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CardDto, Card>> binaryBase64Serializer$delegate;
    private static final CardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UIComponentDto getContent() {
        return this.surrogate.getContent();
    }

    public final ThemedColorDto getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final Float getBackground_color_opacity() {
        return this.surrogate.getBackground_color_opacity();
    }

    public final Integer getCorner_radius() {
        return this.surrogate.getCorner_radius();
    }

    public final OutlineDto getOutline() {
        return this.surrogate.getOutline();
    }

    public /* synthetic */ CardDto(UIComponentDto uIComponentDto, ThemedColorDto themedColorDto, Float f, Integer num, OutlineDto outlineDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : outlineDto);
    }

    public CardDto(UIComponentDto uIComponentDto, ThemedColorDto themedColorDto, Float f, Integer num, OutlineDto outlineDto) {
        this(new Surrogate(uIComponentDto, themedColorDto, f, num, outlineDto));
    }

    @Override // com.robinhood.idl.Dto
    public Card toProto() {
        UIComponentDto content = this.surrogate.getContent();
        UIComponent proto = content != null ? content.toProto() : null;
        ThemedColorDto background_color = this.surrogate.getBackground_color();
        ThemedColor proto2 = background_color != null ? background_color.toProto() : null;
        Float background_color_opacity = this.surrogate.getBackground_color_opacity();
        Integer corner_radius = this.surrogate.getCorner_radius();
        OutlineDto outline = this.surrogate.getOutline();
        return new Card(proto, proto2, background_color_opacity, corner_radius, outline != null ? outline.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[CardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CardDto) && Intrinsics.areEqual(((CardDto) other).surrogate, this.surrogate);
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
    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R1\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R1\u0010\r\u001a\u0013\u0018\u00010\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010,\u001a\u0004\b6\u00107R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010,\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "content", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "background_color_opacity", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "corner_radius", "Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "outline", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Float;Ljava/lang/Integer;Lrh_server_driven_ui/v1/CardDto$OutlineDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Float;Ljava/lang/Integer;Lrh_server_driven_ui/v1/CardDto$OutlineDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/CardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getContent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getContent$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "Ljava/lang/Float;", "getBackground_color_opacity", "()Ljava/lang/Float;", "getBackground_color_opacity$annotations", "Ljava/lang/Integer;", "getCorner_radius", "()Ljava/lang/Integer;", "getCorner_radius$annotations", "Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "getOutline", "()Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "getOutline$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto background_color;
        private final Float background_color_opacity;
        private final UIComponentDto content;
        private final Integer corner_radius;
        private final OutlineDto outline;

        public Surrogate() {
            this((UIComponentDto) null, (ThemedColorDto) null, (Float) null, (Integer) null, (OutlineDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual((Object) this.background_color_opacity, (Object) surrogate.background_color_opacity) && Intrinsics.areEqual(this.corner_radius, surrogate.corner_radius) && Intrinsics.areEqual(this.outline, surrogate.outline);
        }

        public int hashCode() {
            UIComponentDto uIComponentDto = this.content;
            int iHashCode = (uIComponentDto == null ? 0 : uIComponentDto.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.background_color;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            Float f = this.background_color_opacity;
            int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.corner_radius;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            OutlineDto outlineDto = this.outline;
            return iHashCode4 + (outlineDto != null ? outlineDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(content=" + this.content + ", background_color=" + this.background_color + ", background_color_opacity=" + this.background_color_opacity + ", corner_radius=" + this.corner_radius + ", outline=" + this.outline + ")";
        }

        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CardDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CardDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, ThemedColorDto themedColorDto, Float f, Integer num, OutlineDto outlineDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.content = null;
            } else {
                this.content = uIComponentDto;
            }
            if ((i & 2) == 0) {
                this.background_color = null;
            } else {
                this.background_color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.background_color_opacity = null;
            } else {
                this.background_color_opacity = f;
            }
            if ((i & 8) == 0) {
                this.corner_radius = null;
            } else {
                this.corner_radius = num;
            }
            if ((i & 16) == 0) {
                this.outline = null;
            } else {
                this.outline = outlineDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UIComponentDto uIComponentDto = self.content;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            ThemedColorDto themedColorDto = self.background_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            Float f = self.background_color_opacity;
            if (f != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, f);
            }
            Integer num = self.corner_radius;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            OutlineDto outlineDto = self.outline;
            if (outlineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, OutlineDto.Serializer.INSTANCE, outlineDto);
            }
        }

        public Surrogate(UIComponentDto uIComponentDto, ThemedColorDto themedColorDto, Float f, Integer num, OutlineDto outlineDto) {
            this.content = uIComponentDto;
            this.background_color = themedColorDto;
            this.background_color_opacity = f;
            this.corner_radius = num;
            this.outline = outlineDto;
        }

        public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, ThemedColorDto themedColorDto, Float f, Integer num, OutlineDto outlineDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : outlineDto);
        }

        public final UIComponentDto getContent() {
            return this.content;
        }

        public final ThemedColorDto getBackground_color() {
            return this.background_color;
        }

        public final Float getBackground_color_opacity() {
            return this.background_color_opacity;
        }

        public final Integer getCorner_radius() {
            return this.corner_radius;
        }

        public final OutlineDto getOutline() {
            return this.outline;
        }
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/CardDto;", "Lrh_server_driven_ui/v1/Card;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/CardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CardDto, Card> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CardDto> getBinaryBase64Serializer() {
            return (KSerializer) CardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Card> getProtoAdapter() {
            return Card.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CardDto getZeroValue() {
            return CardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CardDto fromProto(Card proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UIComponent content = proto.getContent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = content != null ? UIComponentDto.INSTANCE.fromProto(content) : null;
            ThemedColor background_color = proto.getBackground_color();
            ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
            Float background_color_opacity = proto.getBackground_color_opacity();
            Integer corner_radius = proto.getCorner_radius();
            Card.Outline outline = proto.getOutline();
            return new CardDto(new Surrogate(uIComponentDtoFromProto, themedColorDtoFromProto, background_color_opacity, corner_radius, outline != null ? OutlineDto.INSTANCE.fromProto(outline) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.CardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CardDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Card$Outline;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;)V", "", "has_shadow", "Lrh_server_driven_ui/v1/BorderDto;", "border", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/BorderDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Card$Outline;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;", "getBorder", "()Lrh_server_driven_ui/v1/BorderDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OutlineDto implements Dto3<Card.Outline>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OutlineDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OutlineDto, Card.Outline>> binaryBase64Serializer$delegate;
        private static final OutlineDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OutlineDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OutlineDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BorderDto getBorder() {
            return this.surrogate.getBorder();
        }

        public OutlineDto(Boolean bool, BorderDto borderDto) {
            this(new Surrogate(bool, borderDto));
        }

        public /* synthetic */ OutlineDto(Boolean bool, BorderDto borderDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : borderDto);
        }

        @Override // com.robinhood.idl.Dto
        public Card.Outline toProto() {
            Boolean has_shadow = this.surrogate.getHas_shadow();
            BorderDto border = this.surrogate.getBorder();
            return new Card.Outline(has_shadow, border != null ? border.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[OutlineDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OutlineDto) && Intrinsics.areEqual(((OutlineDto) other).surrogate, this.surrogate);
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
        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;", "", "", "has_shadow", "Lrh_server_driven_ui/v1/BorderDto;", "border", "<init>", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/BorderDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lrh_server_driven_ui/v1/BorderDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getHas_shadow", "()Ljava/lang/Boolean;", "getHas_shadow$annotations", "()V", "Lrh_server_driven_ui/v1/BorderDto;", "getBorder", "()Lrh_server_driven_ui/v1/BorderDto;", "getBorder$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BorderDto border;
            private final Boolean has_shadow;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((Boolean) null, (BorderDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.has_shadow, surrogate.has_shadow) && Intrinsics.areEqual(this.border, surrogate.border);
            }

            public int hashCode() {
                Boolean bool = this.has_shadow;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                BorderDto borderDto = this.border;
                return iHashCode + (borderDto != null ? borderDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(has_shadow=" + this.has_shadow + ", border=" + this.border + ")";
            }

            /* compiled from: CardDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CardDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, Boolean bool, BorderDto borderDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.has_shadow = null;
                } else {
                    this.has_shadow = bool;
                }
                if ((i & 2) == 0) {
                    this.border = null;
                } else {
                    this.border = borderDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Boolean bool = self.has_shadow;
                if (bool != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, bool);
                }
                BorderDto borderDto = self.border;
                if (borderDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, BorderDto.Serializer.INSTANCE, borderDto);
                }
            }

            public Surrogate(Boolean bool, BorderDto borderDto) {
                this.has_shadow = bool;
                this.border = borderDto;
            }

            public /* synthetic */ Surrogate(Boolean bool, BorderDto borderDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : borderDto);
            }

            public final Boolean getHas_shadow() {
                return this.has_shadow;
            }

            public final BorderDto getBorder() {
                return this.border;
            }
        }

        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "Lrh_server_driven_ui/v1/Card$Outline;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<OutlineDto, Card.Outline> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OutlineDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OutlineDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OutlineDto> getBinaryBase64Serializer() {
                return (KSerializer) OutlineDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Card.Outline> getProtoAdapter() {
                return Card.Outline.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OutlineDto getZeroValue() {
                return OutlineDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OutlineDto fromProto(Card.Outline proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Boolean has_shadow = proto.getHas_shadow();
                Border border = proto.getBorder();
                return new OutlineDto(new Surrogate(has_shadow, border != null ? BorderDto.INSTANCE.fromProto(border) : null), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.CardDto$OutlineDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardDto.OutlineDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OutlineDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CardDto$OutlineDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/CardDto$OutlineDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<OutlineDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Card.Outline", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OutlineDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OutlineDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OutlineDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$OutlineDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.CardDto$OutlineDto";
            }
        }
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CardDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/CardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<CardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Card", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/CardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.CardDto";
        }
    }
}
