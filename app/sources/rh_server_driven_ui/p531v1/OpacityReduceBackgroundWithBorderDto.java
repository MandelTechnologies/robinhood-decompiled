package rh_server_driven_ui.p531v1;

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
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.OpacityReduceBackgroundWithBorder;
import rh_server_driven_ui.p531v1.OpacityReduceBackgroundWithBorderDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007)(*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006/"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "highlight_color", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "highlight_animation", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;)V", "toProto", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getHighlight_color", "getHighlight_animation", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "Companion", "Surrogate", "HighlightAnimationDto", "MoveUpwardDto", "MoveDownwardDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class OpacityReduceBackgroundWithBorderDto implements Dto3<OpacityReduceBackgroundWithBorder>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OpacityReduceBackgroundWithBorderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OpacityReduceBackgroundWithBorderDto, OpacityReduceBackgroundWithBorder>> binaryBase64Serializer$delegate;
    private static final OpacityReduceBackgroundWithBorderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OpacityReduceBackgroundWithBorderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OpacityReduceBackgroundWithBorderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ThemedColorDto getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final ThemedColorDto getHighlight_color() {
        return this.surrogate.getHighlight_color();
    }

    public final HighlightAnimationDto getHighlight_animation() {
        if (this.surrogate.getMove_upward() != null) {
            return new HighlightAnimationDto.MoveUpward(this.surrogate.getMove_upward());
        }
        if (this.surrogate.getMove_downward() != null) {
            return new HighlightAnimationDto.MoveDownward(this.surrogate.getMove_downward());
        }
        return null;
    }

    public /* synthetic */ OpacityReduceBackgroundWithBorderDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, HighlightAnimationDto highlightAnimationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : highlightAnimationDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OpacityReduceBackgroundWithBorderDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, HighlightAnimationDto highlightAnimationDto) {
        HighlightAnimationDto.MoveUpward moveUpward = highlightAnimationDto instanceof HighlightAnimationDto.MoveUpward ? (HighlightAnimationDto.MoveUpward) highlightAnimationDto : null;
        MoveUpwardDto value = moveUpward != null ? moveUpward.getValue() : null;
        HighlightAnimationDto.MoveDownward moveDownward = highlightAnimationDto instanceof HighlightAnimationDto.MoveDownward ? (HighlightAnimationDto.MoveDownward) highlightAnimationDto : null;
        this(new Surrogate(themedColorDto, themedColorDto2, value, moveDownward != null ? moveDownward.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public OpacityReduceBackgroundWithBorder toProto() {
        ThemedColorDto background_color = this.surrogate.getBackground_color();
        ThemedColor proto = background_color != null ? background_color.toProto() : null;
        ThemedColorDto highlight_color = this.surrogate.getHighlight_color();
        ThemedColor proto2 = highlight_color != null ? highlight_color.toProto() : null;
        MoveUpwardDto move_upward = this.surrogate.getMove_upward();
        OpacityReduceBackgroundWithBorder.MoveUpward proto3 = move_upward != null ? move_upward.toProto() : null;
        MoveDownwardDto move_downward = this.surrogate.getMove_downward();
        return new OpacityReduceBackgroundWithBorder(proto, proto2, proto3, move_downward != null ? move_downward.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[OpacityReduceBackgroundWithBorderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OpacityReduceBackgroundWithBorderDto) && Intrinsics.areEqual(((OpacityReduceBackgroundWithBorderDto) other).surrogate, this.surrogate);
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
    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "highlight_color", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "move_upward", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "move_downward", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "()V", "getHighlight_color", "getHighlight_color$annotations", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "getMove_upward", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "getMove_upward$annotations", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "getMove_downward", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "getMove_downward$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto background_color;
        private final ThemedColorDto highlight_color;
        private final MoveDownwardDto move_downward;
        private final MoveUpwardDto move_upward;

        public Surrogate() {
            this((ThemedColorDto) null, (ThemedColorDto) null, (MoveUpwardDto) null, (MoveDownwardDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.highlight_color, surrogate.highlight_color) && Intrinsics.areEqual(this.move_upward, surrogate.move_upward) && Intrinsics.areEqual(this.move_downward, surrogate.move_downward);
        }

        public int hashCode() {
            ThemedColorDto themedColorDto = this.background_color;
            int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
            ThemedColorDto themedColorDto2 = this.highlight_color;
            int iHashCode2 = (iHashCode + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
            MoveUpwardDto moveUpwardDto = this.move_upward;
            int iHashCode3 = (iHashCode2 + (moveUpwardDto == null ? 0 : moveUpwardDto.hashCode())) * 31;
            MoveDownwardDto moveDownwardDto = this.move_downward;
            return iHashCode3 + (moveDownwardDto != null ? moveDownwardDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(background_color=" + this.background_color + ", highlight_color=" + this.highlight_color + ", move_upward=" + this.move_upward + ", move_downward=" + this.move_downward + ")";
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OpacityReduceBackgroundWithBorderDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, MoveUpwardDto moveUpwardDto, MoveDownwardDto moveDownwardDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.background_color = null;
            } else {
                this.background_color = themedColorDto;
            }
            if ((i & 2) == 0) {
                this.highlight_color = null;
            } else {
                this.highlight_color = themedColorDto2;
            }
            if ((i & 4) == 0) {
                this.move_upward = null;
            } else {
                this.move_upward = moveUpwardDto;
            }
            if ((i & 8) == 0) {
                this.move_downward = null;
            } else {
                this.move_downward = moveDownwardDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ThemedColorDto themedColorDto = self.background_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.highlight_color;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            MoveUpwardDto moveUpwardDto = self.move_upward;
            if (moveUpwardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoveUpwardDto.Serializer.INSTANCE, moveUpwardDto);
            }
            MoveDownwardDto moveDownwardDto = self.move_downward;
            if (moveDownwardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoveDownwardDto.Serializer.INSTANCE, moveDownwardDto);
            }
        }

        public Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, MoveUpwardDto moveUpwardDto, MoveDownwardDto moveDownwardDto) {
            this.background_color = themedColorDto;
            this.highlight_color = themedColorDto2;
            this.move_upward = moveUpwardDto;
            this.move_downward = moveDownwardDto;
        }

        public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, MoveUpwardDto moveUpwardDto, MoveDownwardDto moveDownwardDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : moveUpwardDto, (i & 8) != 0 ? null : moveDownwardDto);
        }

        public final ThemedColorDto getBackground_color() {
            return this.background_color;
        }

        public final ThemedColorDto getHighlight_color() {
            return this.highlight_color;
        }

        public final MoveUpwardDto getMove_upward() {
            return this.move_upward;
        }

        public final MoveDownwardDto getMove_downward() {
            return this.move_downward;
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OpacityReduceBackgroundWithBorderDto, OpacityReduceBackgroundWithBorder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OpacityReduceBackgroundWithBorderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpacityReduceBackgroundWithBorderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpacityReduceBackgroundWithBorderDto> getBinaryBase64Serializer() {
            return (KSerializer) OpacityReduceBackgroundWithBorderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OpacityReduceBackgroundWithBorder> getProtoAdapter() {
            return OpacityReduceBackgroundWithBorder.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpacityReduceBackgroundWithBorderDto getZeroValue() {
            return OpacityReduceBackgroundWithBorderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpacityReduceBackgroundWithBorderDto fromProto(OpacityReduceBackgroundWithBorder proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ThemedColor background_color = proto.getBackground_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
            ThemedColor highlight_color = proto.getHighlight_color();
            ThemedColorDto themedColorDtoFromProto2 = highlight_color != null ? ThemedColorDto.INSTANCE.fromProto(highlight_color) : null;
            OpacityReduceBackgroundWithBorder.MoveUpward move_upward = proto.getMove_upward();
            MoveUpwardDto moveUpwardDtoFromProto = move_upward != null ? MoveUpwardDto.INSTANCE.fromProto(move_upward) : null;
            OpacityReduceBackgroundWithBorder.MoveDownward move_downward = proto.getMove_downward();
            return new OpacityReduceBackgroundWithBorderDto(new Surrogate(themedColorDtoFromProto, themedColorDtoFromProto2, moveUpwardDtoFromProto, move_downward != null ? MoveDownwardDto.INSTANCE.fromProto(move_downward) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpacityReduceBackgroundWithBorderDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OpacityReduceBackgroundWithBorderDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "MoveUpward", "MoveDownward", "Companion", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto$MoveDownward;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto$MoveUpward;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class HighlightAnimationDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ HighlightAnimationDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HighlightAnimationDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto$MoveUpward;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "getValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MoveUpward extends HighlightAnimationDto {
            private final MoveUpwardDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MoveUpward) && Intrinsics.areEqual(this.value, ((MoveUpward) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MoveUpward(value=" + this.value + ")";
            }

            public final MoveUpwardDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveUpward(MoveUpwardDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto$MoveDownward;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "getValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MoveDownward extends HighlightAnimationDto {
            private final MoveDownwardDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MoveDownward) && Intrinsics.areEqual(this.value, ((MoveDownward) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MoveDownward(value=" + this.value + ")";
            }

            public final MoveDownwardDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveDownward(MoveDownwardDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$HighlightAnimationDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<HighlightAnimationDto, OpacityReduceBackgroundWithBorder> {
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
            public ProtoAdapter<OpacityReduceBackgroundWithBorder> getProtoAdapter() {
                return OpacityReduceBackgroundWithBorder.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HighlightAnimationDto fromProto(OpacityReduceBackgroundWithBorder proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getMove_upward() != null) {
                    return new MoveUpward(MoveUpwardDto.INSTANCE.fromProto(proto.getMove_upward()));
                }
                if (proto.getMove_downward() != null) {
                    return new MoveDownward(MoveDownwardDto.INSTANCE.fromProto(proto.getMove_downward()));
                }
                return null;
            }
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate;)V", "()V", "toProto", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MoveUpwardDto implements Dto3<OpacityReduceBackgroundWithBorder.MoveUpward>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MoveUpwardDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MoveUpwardDto, OpacityReduceBackgroundWithBorder.MoveUpward>> binaryBase64Serializer$delegate;
        private static final MoveUpwardDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MoveUpwardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MoveUpwardDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public MoveUpwardDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public OpacityReduceBackgroundWithBorder.MoveUpward toProto() {
            return new OpacityReduceBackgroundWithBorder.MoveUpward(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[MoveUpwardDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MoveUpwardDto) && Intrinsics.areEqual(((MoveUpwardDto) other).surrogate, this.surrogate);
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
        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpacityReduceBackgroundWithBorderDto.MoveUpwardDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1039894398;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto.MoveUpwardDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<MoveUpwardDto, OpacityReduceBackgroundWithBorder.MoveUpward> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MoveUpwardDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MoveUpwardDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MoveUpwardDto> getBinaryBase64Serializer() {
                return (KSerializer) MoveUpwardDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OpacityReduceBackgroundWithBorder.MoveUpward> getProtoAdapter() {
                return OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MoveUpwardDto getZeroValue() {
                return MoveUpwardDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MoveUpwardDto fromProto(OpacityReduceBackgroundWithBorder.MoveUpward proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new MoveUpwardDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpacityReduceBackgroundWithBorderDto.MoveUpwardDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MoveUpwardDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MoveUpwardDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder.MoveUpward", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MoveUpwardDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MoveUpwardDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MoveUpwardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveUpwardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveUpwardDto";
            }
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate;)V", "()V", "toProto", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MoveDownwardDto implements Dto3<OpacityReduceBackgroundWithBorder.MoveDownward>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MoveDownwardDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MoveDownwardDto, OpacityReduceBackgroundWithBorder.MoveDownward>> binaryBase64Serializer$delegate;
        private static final MoveDownwardDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MoveDownwardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MoveDownwardDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public MoveDownwardDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public OpacityReduceBackgroundWithBorder.MoveDownward toProto() {
            return new OpacityReduceBackgroundWithBorder.MoveDownward(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[MoveDownwardDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MoveDownwardDto) && Intrinsics.areEqual(((MoveDownwardDto) other).surrogate, this.surrogate);
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
        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpacityReduceBackgroundWithBorderDto.MoveDownwardDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 257602907;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto.MoveDownwardDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<MoveDownwardDto, OpacityReduceBackgroundWithBorder.MoveDownward> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MoveDownwardDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MoveDownwardDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MoveDownwardDto> getBinaryBase64Serializer() {
                return (KSerializer) MoveDownwardDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OpacityReduceBackgroundWithBorder.MoveDownward> getProtoAdapter() {
                return OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MoveDownwardDto getZeroValue() {
                return MoveDownwardDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MoveDownwardDto fromProto(OpacityReduceBackgroundWithBorder.MoveDownward proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new MoveDownwardDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpacityReduceBackgroundWithBorderDto.MoveDownwardDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MoveDownwardDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MoveDownwardDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder.MoveDownward", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MoveDownwardDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MoveDownwardDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MoveDownwardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MoveDownwardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto$MoveDownwardDto";
            }
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OpacityReduceBackgroundWithBorderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OpacityReduceBackgroundWithBorderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OpacityReduceBackgroundWithBorderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OpacityReduceBackgroundWithBorderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorderDto";
        }
    }
}
