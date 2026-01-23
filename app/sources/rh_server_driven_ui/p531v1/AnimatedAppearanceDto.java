package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AnimatedAppearance;
import rh_server_driven_ui.p531v1.AnimatedAppearanceDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AnimatedAppearanceDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t7689:;<=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b5\u0010.¨\u0006?"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", "content", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "initial_state", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "animation_data", "", "identifier", "Lrh_server_driven_ui/v1/ActionDto;", "on_completion", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "final_state", "disappearing_animation_data", "disappeared_state", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedAppearance;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;", "getContent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getInitial_state", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "getAnimation_data", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "getIdentifier", "getFinal_state", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "getDisappearing_animation_data", "getDisappeared_state", "Companion", "Surrogate", "InitialStateDto", "FinalStateDto", "TranslationDto", "AnimationDataDto", "CurveDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class AnimatedAppearanceDto implements Dto3<AnimatedAppearance>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AnimatedAppearanceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AnimatedAppearanceDto, AnimatedAppearance>> binaryBase64Serializer$delegate;
    private static final AnimatedAppearanceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AnimatedAppearanceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AnimatedAppearanceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UIComponentDto getContent() {
        return this.surrogate.getContent();
    }

    public final InitialStateDto getInitial_state() {
        return this.surrogate.getInitial_state();
    }

    public final AnimationDataDto getAnimation_data() {
        return this.surrogate.getAnimation_data();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final FinalStateDto getFinal_state() {
        return this.surrogate.getFinal_state();
    }

    public final AnimationDataDto getDisappearing_animation_data() {
        return this.surrogate.getDisappearing_animation_data();
    }

    public final InitialStateDto getDisappeared_state() {
        return this.surrogate.getDisappeared_state();
    }

    public /* synthetic */ AnimatedAppearanceDto(UIComponentDto uIComponentDto, InitialStateDto initialStateDto, AnimationDataDto animationDataDto, String str, ActionDto actionDto, FinalStateDto finalStateDto, AnimationDataDto animationDataDto2, InitialStateDto initialStateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : initialStateDto, (i & 4) != 0 ? null : animationDataDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : actionDto, (i & 32) != 0 ? null : finalStateDto, (i & 64) != 0 ? null : animationDataDto2, (i & 128) != 0 ? null : initialStateDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedAppearanceDto(UIComponentDto uIComponentDto, InitialStateDto initialStateDto, AnimationDataDto animationDataDto, String identifier, ActionDto actionDto, FinalStateDto finalStateDto, AnimationDataDto animationDataDto2, InitialStateDto initialStateDto2) {
        this(new Surrogate(uIComponentDto, initialStateDto, animationDataDto, identifier, actionDto, finalStateDto, animationDataDto2, initialStateDto2));
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.robinhood.idl.Dto
    public AnimatedAppearance toProto() {
        UIComponentDto content = this.surrogate.getContent();
        UIComponent proto = content != null ? content.toProto() : null;
        InitialStateDto initial_state = this.surrogate.getInitial_state();
        AnimatedAppearance.InitialState proto2 = initial_state != null ? initial_state.toProto() : null;
        AnimationDataDto animation_data = this.surrogate.getAnimation_data();
        AnimatedAppearance.AnimationData proto3 = animation_data != null ? animation_data.toProto() : null;
        String identifier = this.surrogate.getIdentifier();
        ActionDto on_completion = this.surrogate.getOn_completion();
        Action proto4 = on_completion != null ? on_completion.toProto() : null;
        FinalStateDto final_state = this.surrogate.getFinal_state();
        AnimatedAppearance.FinalState proto5 = final_state != null ? final_state.toProto() : null;
        AnimationDataDto disappearing_animation_data = this.surrogate.getDisappearing_animation_data();
        AnimatedAppearance.AnimationData proto6 = disappearing_animation_data != null ? disappearing_animation_data.toProto() : null;
        InitialStateDto disappeared_state = this.surrogate.getDisappeared_state();
        return new AnimatedAppearance(proto, proto2, proto3, identifier, proto4, proto5, proto6, disappeared_state != null ? disappeared_state.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[AnimatedAppearanceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AnimatedAppearanceDto) && Intrinsics.areEqual(((AnimatedAppearanceDto) other).surrogate, this.surrogate);
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
    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010,\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010,\u001a\u0004\b=\u0010>R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00101\u0012\u0004\bA\u0010,\u001a\u0004\b@\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010-\u0012\u0004\bC\u0010,\u001a\u0004\bB\u0010/¨\u0006F"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "content", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "initial_state", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "animation_data", "", "identifier", "Lrh_server_driven_ui/v1/ActionDto;", "on_completion", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "final_state", "disappearing_animation_data", "disappeared_state", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getContent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getContent$annotations", "()V", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "getInitial_state", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "getInitial_state$annotations", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "getAnimation_data", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "getAnimation_data$annotations", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getOn_completion", "()Lrh_server_driven_ui/v1/ActionDto;", "getOn_completion$annotations", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "getFinal_state", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "getFinal_state$annotations", "getDisappearing_animation_data", "getDisappearing_animation_data$annotations", "getDisappeared_state", "getDisappeared_state$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AnimationDataDto animation_data;
        private final UIComponentDto content;
        private final InitialStateDto disappeared_state;
        private final AnimationDataDto disappearing_animation_data;
        private final FinalStateDto final_state;
        private final String identifier;
        private final InitialStateDto initial_state;
        private final ActionDto on_completion;

        public Surrogate() {
            this((UIComponentDto) null, (InitialStateDto) null, (AnimationDataDto) null, (String) null, (ActionDto) null, (FinalStateDto) null, (AnimationDataDto) null, (InitialStateDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.initial_state, surrogate.initial_state) && Intrinsics.areEqual(this.animation_data, surrogate.animation_data) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.on_completion, surrogate.on_completion) && Intrinsics.areEqual(this.final_state, surrogate.final_state) && Intrinsics.areEqual(this.disappearing_animation_data, surrogate.disappearing_animation_data) && Intrinsics.areEqual(this.disappeared_state, surrogate.disappeared_state);
        }

        public int hashCode() {
            UIComponentDto uIComponentDto = this.content;
            int iHashCode = (uIComponentDto == null ? 0 : uIComponentDto.hashCode()) * 31;
            InitialStateDto initialStateDto = this.initial_state;
            int iHashCode2 = (iHashCode + (initialStateDto == null ? 0 : initialStateDto.hashCode())) * 31;
            AnimationDataDto animationDataDto = this.animation_data;
            int iHashCode3 = (((iHashCode2 + (animationDataDto == null ? 0 : animationDataDto.hashCode())) * 31) + this.identifier.hashCode()) * 31;
            ActionDto actionDto = this.on_completion;
            int iHashCode4 = (iHashCode3 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            FinalStateDto finalStateDto = this.final_state;
            int iHashCode5 = (iHashCode4 + (finalStateDto == null ? 0 : finalStateDto.hashCode())) * 31;
            AnimationDataDto animationDataDto2 = this.disappearing_animation_data;
            int iHashCode6 = (iHashCode5 + (animationDataDto2 == null ? 0 : animationDataDto2.hashCode())) * 31;
            InitialStateDto initialStateDto2 = this.disappeared_state;
            return iHashCode6 + (initialStateDto2 != null ? initialStateDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(content=" + this.content + ", initial_state=" + this.initial_state + ", animation_data=" + this.animation_data + ", identifier=" + this.identifier + ", on_completion=" + this.on_completion + ", final_state=" + this.final_state + ", disappearing_animation_data=" + this.disappearing_animation_data + ", disappeared_state=" + this.disappeared_state + ")";
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AnimatedAppearanceDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, InitialStateDto initialStateDto, AnimationDataDto animationDataDto, String str, ActionDto actionDto, FinalStateDto finalStateDto, AnimationDataDto animationDataDto2, InitialStateDto initialStateDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.content = null;
            } else {
                this.content = uIComponentDto;
            }
            if ((i & 2) == 0) {
                this.initial_state = null;
            } else {
                this.initial_state = initialStateDto;
            }
            if ((i & 4) == 0) {
                this.animation_data = null;
            } else {
                this.animation_data = animationDataDto;
            }
            if ((i & 8) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str;
            }
            if ((i & 16) == 0) {
                this.on_completion = null;
            } else {
                this.on_completion = actionDto;
            }
            if ((i & 32) == 0) {
                this.final_state = null;
            } else {
                this.final_state = finalStateDto;
            }
            if ((i & 64) == 0) {
                this.disappearing_animation_data = null;
            } else {
                this.disappearing_animation_data = animationDataDto2;
            }
            if ((i & 128) == 0) {
                this.disappeared_state = null;
            } else {
                this.disappeared_state = initialStateDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UIComponentDto uIComponentDto = self.content;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            InitialStateDto initialStateDto = self.initial_state;
            if (initialStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, InitialStateDto.Serializer.INSTANCE, initialStateDto);
            }
            AnimationDataDto animationDataDto = self.animation_data;
            if (animationDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AnimationDataDto.Serializer.INSTANCE, animationDataDto);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 3, self.identifier);
            }
            ActionDto actionDto = self.on_completion;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ActionDto.Serializer.INSTANCE, actionDto);
            }
            FinalStateDto finalStateDto = self.final_state;
            if (finalStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FinalStateDto.Serializer.INSTANCE, finalStateDto);
            }
            AnimationDataDto animationDataDto2 = self.disappearing_animation_data;
            if (animationDataDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, AnimationDataDto.Serializer.INSTANCE, animationDataDto2);
            }
            InitialStateDto initialStateDto2 = self.disappeared_state;
            if (initialStateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, InitialStateDto.Serializer.INSTANCE, initialStateDto2);
            }
        }

        public Surrogate(UIComponentDto uIComponentDto, InitialStateDto initialStateDto, AnimationDataDto animationDataDto, String identifier, ActionDto actionDto, FinalStateDto finalStateDto, AnimationDataDto animationDataDto2, InitialStateDto initialStateDto2) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.content = uIComponentDto;
            this.initial_state = initialStateDto;
            this.animation_data = animationDataDto;
            this.identifier = identifier;
            this.on_completion = actionDto;
            this.final_state = finalStateDto;
            this.disappearing_animation_data = animationDataDto2;
            this.disappeared_state = initialStateDto2;
        }

        public final UIComponentDto getContent() {
            return this.content;
        }

        public final InitialStateDto getInitial_state() {
            return this.initial_state;
        }

        public final AnimationDataDto getAnimation_data() {
            return this.animation_data;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, InitialStateDto initialStateDto, AnimationDataDto animationDataDto, String str, ActionDto actionDto, FinalStateDto finalStateDto, AnimationDataDto animationDataDto2, InitialStateDto initialStateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : initialStateDto, (i & 4) != 0 ? null : animationDataDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : actionDto, (i & 32) != 0 ? null : finalStateDto, (i & 64) != 0 ? null : animationDataDto2, (i & 128) != 0 ? null : initialStateDto2);
        }

        public final ActionDto getOn_completion() {
            return this.on_completion;
        }

        public final FinalStateDto getFinal_state() {
            return this.final_state;
        }

        public final AnimationDataDto getDisappearing_animation_data() {
            return this.disappearing_animation_data;
        }

        public final InitialStateDto getDisappeared_state() {
            return this.disappeared_state;
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AnimatedAppearanceDto, AnimatedAppearance> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AnimatedAppearanceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AnimatedAppearanceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AnimatedAppearanceDto> getBinaryBase64Serializer() {
            return (KSerializer) AnimatedAppearanceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AnimatedAppearance> getProtoAdapter() {
            return AnimatedAppearance.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AnimatedAppearanceDto getZeroValue() {
            return AnimatedAppearanceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AnimatedAppearanceDto fromProto(AnimatedAppearance proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UIComponent content = proto.getContent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = content != null ? UIComponentDto.INSTANCE.fromProto(content) : null;
            AnimatedAppearance.InitialState initial_state = proto.getInitial_state();
            InitialStateDto initialStateDtoFromProto = initial_state != null ? InitialStateDto.INSTANCE.fromProto(initial_state) : null;
            AnimatedAppearance.AnimationData animation_data = proto.getAnimation_data();
            AnimationDataDto animationDataDtoFromProto = animation_data != null ? AnimationDataDto.INSTANCE.fromProto(animation_data) : null;
            String identifier = proto.getIdentifier();
            Action on_completion = proto.getOn_completion();
            ActionDto actionDtoFromProto = on_completion != null ? ActionDto.INSTANCE.fromProto(on_completion) : null;
            AnimatedAppearance.FinalState final_state = proto.getFinal_state();
            FinalStateDto finalStateDtoFromProto = final_state != null ? FinalStateDto.INSTANCE.fromProto(final_state) : null;
            AnimatedAppearance.AnimationData disappearing_animation_data = proto.getDisappearing_animation_data();
            AnimationDataDto animationDataDtoFromProto2 = disappearing_animation_data != null ? AnimationDataDto.INSTANCE.fromProto(disappearing_animation_data) : null;
            AnimatedAppearance.InitialState disappeared_state = proto.getDisappeared_state();
            return new AnimatedAppearanceDto(new Surrogate(uIComponentDtoFromProto, initialStateDtoFromProto, animationDataDtoFromProto, identifier, actionDtoFromProto, finalStateDtoFromProto, animationDataDtoFromProto2, disappeared_state != null ? InitialStateDto.INSTANCE.fromProto(disappeared_state) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimatedAppearanceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AnimatedAppearanceDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;)V", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "translation_x", "translation_y", "", "scale", "rotation", "opacity", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;", "getTranslation_x", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "getTranslation_y", "getScale", "()Ljava/lang/Double;", "getOpacity", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InitialStateDto implements Dto3<AnimatedAppearance.InitialState>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<InitialStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InitialStateDto, AnimatedAppearance.InitialState>> binaryBase64Serializer$delegate;
        private static final InitialStateDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ InitialStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private InitialStateDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TranslationDto getTranslation_x() {
            return this.surrogate.getTranslation_x();
        }

        public final TranslationDto getTranslation_y() {
            return this.surrogate.getTranslation_y();
        }

        public final Double getScale() {
            return this.surrogate.getScale();
        }

        public final Double getOpacity() {
            return this.surrogate.getOpacity();
        }

        public /* synthetic */ InitialStateDto(TranslationDto translationDto, TranslationDto translationDto2, Double d, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : translationDto, (i & 2) != 0 ? null : translationDto2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3);
        }

        public InitialStateDto(TranslationDto translationDto, TranslationDto translationDto2, Double d, Double d2, Double d3) {
            this(new Surrogate(translationDto, translationDto2, d, d2, d3));
        }

        @Override // com.robinhood.idl.Dto
        public AnimatedAppearance.InitialState toProto() {
            TranslationDto translation_x = this.surrogate.getTranslation_x();
            AnimatedAppearance.Translation proto = translation_x != null ? translation_x.toProto() : null;
            TranslationDto translation_y = this.surrogate.getTranslation_y();
            return new AnimatedAppearance.InitialState(proto, translation_y != null ? translation_y.toProto() : null, this.surrogate.getScale(), this.surrogate.getRotation(), this.surrogate.getOpacity(), null, 32, null);
        }

        public String toString() {
            return "[InitialStateDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof InitialStateDto) && Intrinsics.areEqual(((InitialStateDto) other).surrogate, this.surrogate);
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
        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254Bp\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R1\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R1\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010.R1\u0010\u000b\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010.¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;", "", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "translation_x", "translation_y", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "scale", "rotation", "opacity", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "getTranslation_x", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "getTranslation_x$annotations", "()V", "getTranslation_y", "getTranslation_y$annotations", "Ljava/lang/Double;", "getScale", "()Ljava/lang/Double;", "getScale$annotations", "getRotation", "getRotation$annotations", "getOpacity", "getOpacity$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double opacity;
            private final Double rotation;
            private final Double scale;
            private final TranslationDto translation_x;
            private final TranslationDto translation_y;

            public Surrogate() {
                this((TranslationDto) null, (TranslationDto) null, (Double) null, (Double) null, (Double) null, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.translation_x, surrogate.translation_x) && Intrinsics.areEqual(this.translation_y, surrogate.translation_y) && Intrinsics.areEqual((Object) this.scale, (Object) surrogate.scale) && Intrinsics.areEqual((Object) this.rotation, (Object) surrogate.rotation) && Intrinsics.areEqual((Object) this.opacity, (Object) surrogate.opacity);
            }

            public int hashCode() {
                TranslationDto translationDto = this.translation_x;
                int iHashCode = (translationDto == null ? 0 : translationDto.hashCode()) * 31;
                TranslationDto translationDto2 = this.translation_y;
                int iHashCode2 = (iHashCode + (translationDto2 == null ? 0 : translationDto2.hashCode())) * 31;
                Double d = this.scale;
                int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
                Double d2 = this.rotation;
                int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
                Double d3 = this.opacity;
                return iHashCode4 + (d3 != null ? d3.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(translation_x=" + this.translation_x + ", translation_y=" + this.translation_y + ", scale=" + this.scale + ", rotation=" + this.rotation + ", opacity=" + this.opacity + ")";
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return AnimatedAppearanceDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, TranslationDto translationDto, TranslationDto translationDto2, Double d, Double d2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.translation_x = null;
                } else {
                    this.translation_x = translationDto;
                }
                if ((i & 2) == 0) {
                    this.translation_y = null;
                } else {
                    this.translation_y = translationDto2;
                }
                if ((i & 4) == 0) {
                    this.scale = null;
                } else {
                    this.scale = d;
                }
                if ((i & 8) == 0) {
                    this.rotation = null;
                } else {
                    this.rotation = d2;
                }
                if ((i & 16) == 0) {
                    this.opacity = null;
                } else {
                    this.opacity = d3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                TranslationDto translationDto = self.translation_x;
                if (translationDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, TranslationDto.Serializer.INSTANCE, translationDto);
                }
                TranslationDto translationDto2 = self.translation_y;
                if (translationDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, TranslationDto.Serializer.INSTANCE, translationDto2);
                }
                Double d = self.scale;
                if (d != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, d);
                }
                Double d2 = self.rotation;
                if (d2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, d2);
                }
                Double d3 = self.opacity;
                if (d3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, d3);
                }
            }

            public Surrogate(TranslationDto translationDto, TranslationDto translationDto2, Double d, Double d2, Double d3) {
                this.translation_x = translationDto;
                this.translation_y = translationDto2;
                this.scale = d;
                this.rotation = d2;
                this.opacity = d3;
            }

            public /* synthetic */ Surrogate(TranslationDto translationDto, TranslationDto translationDto2, Double d, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : translationDto, (i & 2) != 0 ? null : translationDto2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3);
            }

            public final TranslationDto getTranslation_x() {
                return this.translation_x;
            }

            public final TranslationDto getTranslation_y() {
                return this.translation_y;
            }

            public final Double getScale() {
                return this.scale;
            }

            public final Double getRotation() {
                return this.rotation;
            }

            public final Double getOpacity() {
                return this.opacity;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<InitialStateDto, AnimatedAppearance.InitialState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InitialStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InitialStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InitialStateDto> getBinaryBase64Serializer() {
                return (KSerializer) InitialStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AnimatedAppearance.InitialState> getProtoAdapter() {
                return AnimatedAppearance.InitialState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InitialStateDto getZeroValue() {
                return InitialStateDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InitialStateDto fromProto(AnimatedAppearance.InitialState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                AnimatedAppearance.Translation translation_x = proto.getTranslation_x();
                DefaultConstructorMarker defaultConstructorMarker = null;
                TranslationDto translationDtoFromProto = translation_x != null ? TranslationDto.INSTANCE.fromProto(translation_x) : null;
                AnimatedAppearance.Translation translation_y = proto.getTranslation_y();
                return new InitialStateDto(new Surrogate(translationDtoFromProto, translation_y != null ? TranslationDto.INSTANCE.fromProto(translation_y) : null, proto.getScale(), proto.getRotation(), proto.getOpacity()), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$InitialStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedAppearanceDto.InitialStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new InitialStateDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<InitialStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance.InitialState", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InitialStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public InitialStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new InitialStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.AnimatedAppearanceDto$InitialStateDto";
            }
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;)V", "", "opacity", "(Ljava/lang/Double;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;", "getOpacity", "()Ljava/lang/Double;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FinalStateDto implements Dto3<AnimatedAppearance.FinalState>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<FinalStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FinalStateDto, AnimatedAppearance.FinalState>> binaryBase64Serializer$delegate;
        private static final FinalStateDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ FinalStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private FinalStateDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final Double getOpacity() {
            return this.surrogate.getOpacity();
        }

        public FinalStateDto(Double d) {
            this(new Surrogate(d));
        }

        public /* synthetic */ FinalStateDto(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public AnimatedAppearance.FinalState toProto() {
            return new AnimatedAppearance.FinalState(this.surrogate.getOpacity(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[FinalStateDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof FinalStateDto) && Intrinsics.areEqual(((FinalStateDto) other).surrogate, this.surrogate);
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
        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\"\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "opacity", "<init>", "(Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getOpacity", "()Ljava/lang/Double;", "getOpacity$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double opacity;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((Double) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual((Object) this.opacity, (Object) ((Surrogate) other).opacity);
            }

            public int hashCode() {
                Double d = this.opacity;
                if (d == null) {
                    return 0;
                }
                return d.hashCode();
            }

            public String toString() {
                return "Surrogate(opacity=" + this.opacity + ")";
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return AnimatedAppearanceDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, Double d, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.opacity = null;
                } else {
                    this.opacity = d;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Double d = self.opacity;
                if (d != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, d);
                }
            }

            public Surrogate(Double d) {
                this.opacity = d;
            }

            public /* synthetic */ Surrogate(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : d);
            }

            public final Double getOpacity() {
                return this.opacity;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<FinalStateDto, AnimatedAppearance.FinalState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FinalStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FinalStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FinalStateDto> getBinaryBase64Serializer() {
                return (KSerializer) FinalStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AnimatedAppearance.FinalState> getProtoAdapter() {
                return AnimatedAppearance.FinalState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FinalStateDto getZeroValue() {
                return FinalStateDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FinalStateDto fromProto(AnimatedAppearance.FinalState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new FinalStateDto(new Surrogate(proto.getOpacity()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$FinalStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedAppearanceDto.FinalStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new FinalStateDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<FinalStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance.FinalState", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FinalStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public FinalStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new FinalStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$FinalStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.AnimatedAppearanceDto$FinalStateDto";
            }
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;)V", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "value", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;", "getValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "Companion", "Surrogate", "ValueDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TranslationDto implements Dto3<AnimatedAppearance.Translation>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TranslationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TranslationDto, AnimatedAppearance.Translation>> binaryBase64Serializer$delegate;
        private static final TranslationDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TranslationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TranslationDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ValueDto getValue() {
            if (this.surrogate.getAbsolute() != null) {
                return new ValueDto.Absolute(this.surrogate.getAbsolute().doubleValue());
            }
            if (this.surrogate.getPercentage() != null) {
                return new ValueDto.Percentage(this.surrogate.getPercentage().doubleValue());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TranslationDto(ValueDto valueDto) {
            ValueDto.Absolute absolute = valueDto instanceof ValueDto.Absolute ? (ValueDto.Absolute) valueDto : null;
            Double dValueOf = absolute != null ? Double.valueOf(absolute.getValue()) : null;
            ValueDto.Percentage percentage = valueDto instanceof ValueDto.Percentage ? (ValueDto.Percentage) valueDto : null;
            this(new Surrogate(dValueOf, percentage != null ? Double.valueOf(percentage.getValue()) : null));
        }

        public /* synthetic */ TranslationDto(ValueDto valueDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : valueDto);
        }

        @Override // com.robinhood.idl.Dto
        public AnimatedAppearance.Translation toProto() {
            return new AnimatedAppearance.Translation(this.surrogate.getAbsolute(), this.surrogate.getPercentage(), null, 4, null);
        }

        public String toString() {
            return "[TranslationDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TranslationDto) && Intrinsics.areEqual(((TranslationDto) other).surrogate, this.surrogate);
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
        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B=\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "absolute", "percentage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAbsolute", "()Ljava/lang/Double;", "getAbsolute$annotations", "()V", "getPercentage", "getPercentage$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double absolute;
            private final Double percentage;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((Double) null, (Double) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual((Object) this.absolute, (Object) surrogate.absolute) && Intrinsics.areEqual((Object) this.percentage, (Object) surrogate.percentage);
            }

            public int hashCode() {
                Double d = this.absolute;
                int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
                Double d2 = this.percentage;
                return iHashCode + (d2 != null ? d2.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(absolute=" + this.absolute + ", percentage=" + this.percentage + ")";
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return AnimatedAppearanceDto7.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, Double d, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.absolute = null;
                } else {
                    this.absolute = d;
                }
                if ((i & 2) == 0) {
                    this.percentage = null;
                } else {
                    this.percentage = d2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Double d = self.absolute;
                if (d != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, d);
                }
                Double d2 = self.percentage;
                if (d2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, d2);
                }
            }

            public Surrogate(Double d, Double d2) {
                this.absolute = d;
                this.percentage = d2;
            }

            public /* synthetic */ Surrogate(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
            }

            public final Double getAbsolute() {
                return this.absolute;
            }

            public final Double getPercentage() {
                return this.percentage;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TranslationDto, AnimatedAppearance.Translation> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TranslationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TranslationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TranslationDto> getBinaryBase64Serializer() {
                return (KSerializer) TranslationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AnimatedAppearance.Translation> getProtoAdapter() {
                return AnimatedAppearance.Translation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TranslationDto getZeroValue() {
                return TranslationDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TranslationDto fromProto(AnimatedAppearance.Translation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TranslationDto(new Surrogate(proto.getAbsolute(), proto.getPercentage()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$TranslationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedAppearanceDto.TranslationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TranslationDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Absolute", "Percentage", "Companion", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto$Absolute;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto$Percentage;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class ValueDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ ValueDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ValueDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto$Absolute;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "()D", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Absolute extends ValueDto {
                private final double value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Absolute) && Double.compare(this.value, ((Absolute) other).value) == 0;
                }

                public int hashCode() {
                    return Double.hashCode(this.value);
                }

                public String toString() {
                    return "Absolute(value=" + this.value + ")";
                }

                public final double getValue() {
                    return this.value;
                }

                public Absolute(double d) {
                    super(null);
                    this.value = d;
                }
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto$Percentage;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "()D", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Percentage extends ValueDto {
                private final double value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Percentage) && Double.compare(this.value, ((Percentage) other).value) == 0;
                }

                public int hashCode() {
                    return Double.hashCode(this.value);
                }

                public String toString() {
                    return "Percentage(value=" + this.value + ")";
                }

                public final double getValue() {
                    return this.value;
                }

                public Percentage(double d) {
                    super(null);
                    this.value = d;
                }
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$ValueDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<ValueDto, AnimatedAppearance.Translation> {
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
                public ProtoAdapter<AnimatedAppearance.Translation> getProtoAdapter() {
                    return AnimatedAppearance.Translation.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ValueDto fromProto(AnimatedAppearance.Translation proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getAbsolute() != null) {
                        return new Absolute(proto.getAbsolute().doubleValue());
                    }
                    if (proto.getPercentage() != null) {
                        return new Percentage(proto.getPercentage().doubleValue());
                    }
                    return null;
                }
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TranslationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance.Translation", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TranslationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TranslationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TranslationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$TranslationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.AnimatedAppearanceDto$TranslationDto";
            }
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;)V", "", "duration", "delay", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "curve", "(Ljava/lang/Double;DLrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;", "getDuration", "()Ljava/lang/Double;", "getDelay", "()D", "getCurve", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AnimationDataDto implements Dto3<AnimatedAppearance.AnimationData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AnimationDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AnimationDataDto, AnimatedAppearance.AnimationData>> binaryBase64Serializer$delegate;
        private static final AnimationDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AnimationDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AnimationDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final Double getDuration() {
            return this.surrogate.getDuration();
        }

        public final double getDelay() {
            return this.surrogate.getDelay();
        }

        public final CurveDto getCurve() {
            return this.surrogate.getCurve();
        }

        public /* synthetic */ AnimationDataDto(Double d, double d2, CurveDto curveDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? CurveDto.INSTANCE.getZeroValue() : curveDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AnimationDataDto(Double d, double d2, CurveDto curve) {
            this(new Surrogate(d, d2, curve));
            Intrinsics.checkNotNullParameter(curve, "curve");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public AnimatedAppearance.AnimationData toProto() {
            return new AnimatedAppearance.AnimationData(this.surrogate.getDuration(), this.surrogate.getDelay(), (AnimatedAppearance.Curve) this.surrogate.getCurve().toProto(), null, 8, null);
        }

        public String toString() {
            return "[AnimationDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AnimationDataDto) && Intrinsics.areEqual(((AnimationDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BE\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "duration", "delay", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "curve", "<init>", "(Ljava/lang/Double;DLrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;DLrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getDuration", "()Ljava/lang/Double;", "getDuration$annotations", "()V", "D", "getDelay", "()D", "getDelay$annotations", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "getCurve", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "getCurve$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CurveDto curve;
            private final double delay;
            private final Double duration;

            public Surrogate() {
                this((Double) null, 0.0d, (CurveDto) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual((Object) this.duration, (Object) surrogate.duration) && Double.compare(this.delay, surrogate.delay) == 0 && this.curve == surrogate.curve;
            }

            public int hashCode() {
                Double d = this.duration;
                return ((((d == null ? 0 : d.hashCode()) * 31) + Double.hashCode(this.delay)) * 31) + this.curve.hashCode();
            }

            public String toString() {
                return "Surrogate(duration=" + this.duration + ", delay=" + this.delay + ", curve=" + this.curve + ")";
            }

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return AnimatedAppearanceDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, Double d, double d2, CurveDto curveDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.duration = (i & 1) == 0 ? null : d;
                if ((i & 2) == 0) {
                    this.delay = 0.0d;
                } else {
                    this.delay = d2;
                }
                if ((i & 4) == 0) {
                    this.curve = CurveDto.INSTANCE.getZeroValue();
                } else {
                    this.curve = curveDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Double d = self.duration;
                if (d != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, d);
                }
                if (Double.compare(self.delay, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.delay));
                }
                if (self.curve != CurveDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, CurveDto.Serializer.INSTANCE, self.curve);
                }
            }

            public Surrogate(Double d, double d2, CurveDto curve) {
                Intrinsics.checkNotNullParameter(curve, "curve");
                this.duration = d;
                this.delay = d2;
                this.curve = curve;
            }

            public final Double getDuration() {
                return this.duration;
            }

            public final double getDelay() {
                return this.delay;
            }

            public final CurveDto getCurve() {
                return this.curve;
            }

            public /* synthetic */ Surrogate(Double d, double d2, CurveDto curveDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? CurveDto.INSTANCE.getZeroValue() : curveDto);
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<AnimationDataDto, AnimatedAppearance.AnimationData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AnimationDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AnimationDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AnimationDataDto> getBinaryBase64Serializer() {
                return (KSerializer) AnimationDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AnimatedAppearance.AnimationData> getProtoAdapter() {
                return AnimatedAppearance.AnimationData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AnimationDataDto getZeroValue() {
                return AnimationDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AnimationDataDto fromProto(AnimatedAppearance.AnimationData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new AnimationDataDto(new Surrogate(proto.getDuration(), proto.getDelay(), CurveDto.INSTANCE.fromProto(proto.getCurve())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$AnimationDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedAppearanceDto.AnimationDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AnimationDataDto(null, 0.0d, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AnimationDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance.AnimationData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AnimationDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AnimationDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AnimationDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.AnimatedAppearanceDto$AnimationDataDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURVE_UNSPECIFIED", "CURVE_DEFAULT", "CURVE_DECELERATION", "CURVE_ACCELERATION", "CURVE_EXPANSION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurveDto implements Dto2<AnimatedAppearance.Curve>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurveDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurveDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurveDto, AnimatedAppearance.Curve>> binaryBase64Serializer$delegate;
        public static final CurveDto CURVE_UNSPECIFIED = new CURVE_UNSPECIFIED("CURVE_UNSPECIFIED", 0);
        public static final CurveDto CURVE_DEFAULT = new CURVE_DEFAULT("CURVE_DEFAULT", 1);
        public static final CurveDto CURVE_DECELERATION = new CURVE_DECELERATION("CURVE_DECELERATION", 2);
        public static final CurveDto CURVE_ACCELERATION = new CURVE_ACCELERATION("CURVE_ACCELERATION", 3);
        public static final CurveDto CURVE_EXPANSION = new CURVE_EXPANSION("CURVE_EXPANSION", 4);

        private static final /* synthetic */ CurveDto[] $values() {
            return new CurveDto[]{CURVE_UNSPECIFIED, CURVE_DEFAULT, CURVE_DECELERATION, CURVE_ACCELERATION, CURVE_EXPANSION};
        }

        public /* synthetic */ CurveDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurveDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/AnimatedAppearanceDto.CurveDto.CURVE_UNSPECIFIED", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "toProto", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURVE_UNSPECIFIED extends CurveDto {
            CURVE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AnimatedAppearance.Curve toProto() {
                return AnimatedAppearance.Curve.CURVE_UNSPECIFIED;
            }
        }

        private CurveDto(String str, int i) {
        }

        static {
            CurveDto[] curveDtoArr$values = $values();
            $VALUES = curveDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(curveDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedAppearanceDto$CurveDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedAppearanceDto.CurveDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/AnimatedAppearanceDto.CurveDto.CURVE_DEFAULT", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "toProto", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURVE_DEFAULT extends CurveDto {
            CURVE_DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AnimatedAppearance.Curve toProto() {
                return AnimatedAppearance.Curve.CURVE_DEFAULT;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/AnimatedAppearanceDto.CurveDto.CURVE_DECELERATION", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "toProto", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURVE_DECELERATION extends CurveDto {
            CURVE_DECELERATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AnimatedAppearance.Curve toProto() {
                return AnimatedAppearance.Curve.CURVE_DECELERATION;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/AnimatedAppearanceDto.CurveDto.CURVE_ACCELERATION", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "toProto", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURVE_ACCELERATION extends CurveDto {
            CURVE_ACCELERATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AnimatedAppearance.Curve toProto() {
                return AnimatedAppearance.Curve.CURVE_ACCELERATION;
            }
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/AnimatedAppearanceDto.CurveDto.CURVE_EXPANSION", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "toProto", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURVE_EXPANSION extends CurveDto {
            CURVE_EXPANSION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AnimatedAppearance.Curve toProto() {
                return AnimatedAppearance.Curve.CURVE_EXPANSION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurveDto, AnimatedAppearance.Curve> {

            /* compiled from: AnimatedAppearanceDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AnimatedAppearance.Curve.values().length];
                    try {
                        iArr[AnimatedAppearance.Curve.CURVE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AnimatedAppearance.Curve.CURVE_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AnimatedAppearance.Curve.CURVE_DECELERATION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AnimatedAppearance.Curve.CURVE_ACCELERATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AnimatedAppearance.Curve.CURVE_EXPANSION.ordinal()] = 5;
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

            public final KSerializer<CurveDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurveDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurveDto> getBinaryBase64Serializer() {
                return (KSerializer) CurveDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AnimatedAppearance.Curve> getProtoAdapter() {
                return AnimatedAppearance.Curve.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurveDto getZeroValue() {
                return CurveDto.CURVE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurveDto fromProto(AnimatedAppearance.Curve proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurveDto.CURVE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurveDto.CURVE_DEFAULT;
                }
                if (i == 3) {
                    return CurveDto.CURVE_DECELERATION;
                }
                if (i == 4) {
                    return CurveDto.CURVE_ACCELERATION;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurveDto.CURVE_EXPANSION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AnimatedAppearanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$CurveDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurveDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurveDto, AnimatedAppearance.Curve> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance.Curve", CurveDto.getEntries(), CurveDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurveDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurveDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurveDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurveDto valueOf(String str) {
            return (CurveDto) Enum.valueOf(CurveDto.class, str);
        }

        public static CurveDto[] values() {
            return (CurveDto[]) $VALUES.clone();
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AnimatedAppearanceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedAppearance", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AnimatedAppearanceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AnimatedAppearanceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AnimatedAppearanceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AnimatedAppearanceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearanceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.AnimatedAppearanceDto";
        }
    }
}
