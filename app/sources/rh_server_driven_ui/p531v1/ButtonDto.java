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
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonStateDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ButtonDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000545678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0016J`\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00069"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Button;", "Landroid/os/Parcelable;", "surrogate", "Lrh_server_driven_ui/v1/ButtonDto$Surrogate;", "<init>", "(Lrh_server_driven_ui/v1/ButtonDto$Surrogate;)V", "action", "Lrh_server_driven_ui/v1/ActionDto;", AnnotatedPrivateKey.LABEL, "", "type", "Lrh_server_driven_ui/v1/ButtonTypeDto;", "icon", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "logging_identifier", "tint_color", "Lrh_server_driven_ui/v1/ThemedColorDto;", "text_color", "state", "Lrh_server_driven_ui/v1/ButtonStateDto;", "(Lrh_server_driven_ui/v1/ActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ButtonStateDto;)V", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getLabel", "()Ljava/lang/String;", "getType", "()Lrh_server_driven_ui/v1/ButtonTypeDto;", "getIcon", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "getLogging_identifier", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getText_color", "getState", "()Lrh_server_driven_ui/v1/ButtonStateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ButtonIconDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class ButtonDto implements Dto3<Button>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ButtonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ButtonDto, Button>> binaryBase64Serializer$delegate;
    private static final ButtonDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ButtonDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final ButtonTypeDto getType() {
        return this.surrogate.getType();
    }

    public final ButtonIconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final ThemedColorDto getTint_color() {
        return this.surrogate.getTint_color();
    }

    public final ThemedColorDto getText_color() {
        return this.surrogate.getText_color();
    }

    public final ButtonStateDto getState() {
        return this.surrogate.getState();
    }

    public /* synthetic */ ButtonDto(ActionDto actionDto, String str, ButtonTypeDto buttonTypeDto, ButtonIconDto buttonIconDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto buttonStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ButtonTypeDto.INSTANCE.getZeroValue() : buttonTypeDto, (i & 8) != 0 ? null : buttonIconDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : themedColorDto, (i & 64) != 0 ? null : themedColorDto2, (i & 128) != 0 ? ButtonStateDto.INSTANCE.getZeroValue() : buttonStateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonDto(ActionDto actionDto, String label, ButtonTypeDto type2, ButtonIconDto buttonIconDto, String str, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto state) {
        this(new Surrogate(actionDto, label, type2, buttonIconDto, str, themedColorDto, themedColorDto2, state));
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public static /* synthetic */ ButtonDto copy$default(ButtonDto buttonDto, ActionDto actionDto, String str, ButtonTypeDto buttonTypeDto, ButtonIconDto buttonIconDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto buttonStateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            actionDto = buttonDto.surrogate.getAction();
        }
        if ((i & 2) != 0) {
            str = buttonDto.surrogate.getLabel();
        }
        if ((i & 4) != 0) {
            buttonTypeDto = buttonDto.surrogate.getType();
        }
        if ((i & 8) != 0) {
            buttonIconDto = buttonDto.surrogate.getIcon();
        }
        if ((i & 16) != 0) {
            str2 = buttonDto.surrogate.getLogging_identifier();
        }
        if ((i & 32) != 0) {
            themedColorDto = buttonDto.surrogate.getTint_color();
        }
        if ((i & 64) != 0) {
            themedColorDto2 = buttonDto.surrogate.getText_color();
        }
        if ((i & 128) != 0) {
            buttonStateDto = buttonDto.surrogate.getState();
        }
        ThemedColorDto themedColorDto3 = themedColorDto2;
        ButtonStateDto buttonStateDto2 = buttonStateDto;
        String str3 = str2;
        ThemedColorDto themedColorDto4 = themedColorDto;
        return buttonDto.copy(actionDto, str, buttonTypeDto, buttonIconDto, str3, themedColorDto4, themedColorDto3, buttonStateDto2);
    }

    public final ButtonDto copy(ActionDto action, String label, ButtonTypeDto type2, ButtonIconDto icon, String logging_identifier, ThemedColorDto tint_color, ThemedColorDto text_color, ButtonStateDto state) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        return new ButtonDto(new Surrogate(action, label, type2, icon, logging_identifier, tint_color, text_color, state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Button toProto() {
        ActionDto action = this.surrogate.getAction();
        Action proto = action != null ? action.toProto() : null;
        String label = this.surrogate.getLabel();
        ButtonType buttonType = (ButtonType) this.surrogate.getType().toProto();
        ButtonIconDto icon = this.surrogate.getIcon();
        Button.ButtonIcon proto2 = icon != null ? icon.toProto() : null;
        String logging_identifier = this.surrogate.getLogging_identifier();
        ThemedColorDto tint_color = this.surrogate.getTint_color();
        ThemedColor proto3 = tint_color != null ? tint_color.toProto() : null;
        ThemedColorDto text_color = this.surrogate.getText_color();
        return new Button(proto, label, buttonType, proto2, logging_identifier, proto3, text_color != null ? text_color.toProto() : null, (ButtonState) this.surrogate.getState().toProto(), null, 256, null);
    }

    public String toString() {
        return "[ButtonDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ButtonDto) && Intrinsics.areEqual(((ButtonDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBa\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010,\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010,\u001a\u0004\b5\u00106R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b9\u0010,\u001a\u0004\b8\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b?\u0010,\u001a\u0004\b>\u0010<R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bC\u0010,\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ActionDto;", "action", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/ButtonTypeDto;", "type", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "icon", "logging_identifier", "Lrh_server_driven_ui/v1/ThemedColorDto;", "tint_color", "text_color", "Lrh_server_driven_ui/v1/ButtonStateDto;", "state", "<init>", "(Lrh_server_driven_ui/v1/ActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ButtonStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ButtonStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "()V", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "Lrh_server_driven_ui/v1/ButtonTypeDto;", "getType", "()Lrh_server_driven_ui/v1/ButtonTypeDto;", "getType$annotations", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "getIcon", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "getIcon$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint_color$annotations", "getText_color", "getText_color$annotations", "Lrh_server_driven_ui/v1/ButtonStateDto;", "getState", "()Lrh_server_driven_ui/v1/ButtonStateDto;", "getState$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final ButtonIconDto icon;
        private final String label;
        private final String logging_identifier;
        private final ButtonStateDto state;
        private final ThemedColorDto text_color;
        private final ThemedColorDto tint_color;
        private final ButtonTypeDto type;

        public Surrogate() {
            this((ActionDto) null, (String) null, (ButtonTypeDto) null, (ButtonIconDto) null, (String) null, (ThemedColorDto) null, (ThemedColorDto) null, (ButtonStateDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.action, surrogate.action) && Intrinsics.areEqual(this.label, surrogate.label) && this.type == surrogate.type && Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.tint_color, surrogate.tint_color) && Intrinsics.areEqual(this.text_color, surrogate.text_color) && this.state == surrogate.state;
        }

        public int hashCode() {
            ActionDto actionDto = this.action;
            int iHashCode = (((((actionDto == null ? 0 : actionDto.hashCode()) * 31) + this.label.hashCode()) * 31) + this.type.hashCode()) * 31;
            ButtonIconDto buttonIconDto = this.icon;
            int iHashCode2 = (iHashCode + (buttonIconDto == null ? 0 : buttonIconDto.hashCode())) * 31;
            String str = this.logging_identifier;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ThemedColorDto themedColorDto = this.tint_color;
            int iHashCode4 = (iHashCode3 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.text_color;
            return ((iHashCode4 + (themedColorDto2 != null ? themedColorDto2.hashCode() : 0)) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "Surrogate(action=" + this.action + ", label=" + this.label + ", type=" + this.type + ", icon=" + this.icon + ", logging_identifier=" + this.logging_identifier + ", tint_color=" + this.tint_color + ", text_color=" + this.text_color + ", state=" + this.state + ")";
        }

        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ButtonDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ButtonDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ActionDto actionDto, String str, ButtonTypeDto buttonTypeDto, ButtonIconDto buttonIconDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto buttonStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
            if ((i & 2) == 0) {
                this.label = "";
            } else {
                this.label = str;
            }
            if ((i & 4) == 0) {
                this.type = ButtonTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = buttonTypeDto;
            }
            if ((i & 8) == 0) {
                this.icon = null;
            } else {
                this.icon = buttonIconDto;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str2;
            }
            if ((i & 32) == 0) {
                this.tint_color = null;
            } else {
                this.tint_color = themedColorDto;
            }
            if ((i & 64) == 0) {
                this.text_color = null;
            } else {
                this.text_color = themedColorDto2;
            }
            if ((i & 128) == 0) {
                this.state = ButtonStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = buttonStateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ActionDto.Serializer.INSTANCE, actionDto);
            }
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 1, self.label);
            }
            if (self.type != ButtonTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ButtonTypeDto.Serializer.INSTANCE, self.type);
            }
            ButtonIconDto buttonIconDto = self.icon;
            if (buttonIconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ButtonIconDto.Serializer.INSTANCE, buttonIconDto);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            ThemedColorDto themedColorDto = self.tint_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.text_color;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            if (self.state != ButtonStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, ButtonStateDto.Serializer.INSTANCE, self.state);
            }
        }

        public Surrogate(ActionDto actionDto, String label, ButtonTypeDto type2, ButtonIconDto buttonIconDto, String str, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto state) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.action = actionDto;
            this.label = label;
            this.type = type2;
            this.icon = buttonIconDto;
            this.logging_identifier = str;
            this.tint_color = themedColorDto;
            this.text_color = themedColorDto2;
            this.state = state;
        }

        public final ActionDto getAction() {
            return this.action;
        }

        public final String getLabel() {
            return this.label;
        }

        public /* synthetic */ Surrogate(ActionDto actionDto, String str, ButtonTypeDto buttonTypeDto, ButtonIconDto buttonIconDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ButtonStateDto buttonStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : actionDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ButtonTypeDto.INSTANCE.getZeroValue() : buttonTypeDto, (i & 8) != 0 ? null : buttonIconDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : themedColorDto, (i & 64) != 0 ? null : themedColorDto2, (i & 128) != 0 ? ButtonStateDto.INSTANCE.getZeroValue() : buttonStateDto);
        }

        public final ButtonTypeDto getType() {
            return this.type;
        }

        public final ButtonIconDto getIcon() {
            return this.icon;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final ThemedColorDto getTint_color() {
            return this.tint_color;
        }

        public final ThemedColorDto getText_color() {
            return this.text_color;
        }

        public final ButtonStateDto getState() {
            return this.state;
        }
    }

    /* compiled from: ButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ButtonDto;", "Lrh_server_driven_ui/v1/Button;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ButtonDto, Button> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ButtonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ButtonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ButtonDto> getBinaryBase64Serializer() {
            return (KSerializer) ButtonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Button> getProtoAdapter() {
            return Button.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ButtonDto getZeroValue() {
            return ButtonDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ButtonDto fromProto(Button proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Action action = proto.getAction();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
            String label = proto.getLabel();
            ButtonTypeDto buttonTypeDtoFromProto = ButtonTypeDto.INSTANCE.fromProto(proto.getType());
            Button.ButtonIcon icon = proto.getIcon();
            ButtonIconDto buttonIconDtoFromProto = icon != null ? ButtonIconDto.INSTANCE.fromProto(icon) : null;
            String logging_identifier = proto.getLogging_identifier();
            ThemedColor tint_color = proto.getTint_color();
            ThemedColorDto themedColorDtoFromProto = tint_color != null ? ThemedColorDto.INSTANCE.fromProto(tint_color) : null;
            ThemedColor text_color = proto.getText_color();
            return new ButtonDto(new Surrogate(actionDtoFromProto, label, buttonTypeDtoFromProto, buttonIconDtoFromProto, logging_identifier, themedColorDtoFromProto, text_color != null ? ThemedColorDto.INSTANCE.fromProto(text_color) : null, ButtonStateDto.INSTANCE.fromProto(proto.getState())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ButtonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ButtonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ButtonDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Button$ButtonIcon;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;)V", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "position", "(Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Button$ButtonIcon;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getPosition", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "Companion", "Surrogate", "PositionDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ButtonIconDto implements Dto3<Button.ButtonIcon>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ButtonIconDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ButtonIconDto, Button.ButtonIcon>> binaryBase64Serializer$delegate;
        private static final ButtonIconDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ButtonIconDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ButtonIconDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final IconDto getIcon() {
            return this.surrogate.getIcon();
        }

        public final PositionDto getPosition() {
            return this.surrogate.getPosition();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ButtonIconDto(IconDto icon, PositionDto position) {
            this(new Surrogate(icon, position));
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(position, "position");
        }

        public /* synthetic */ ButtonIconDto(IconDto iconDto, PositionDto positionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 2) != 0 ? PositionDto.INSTANCE.getZeroValue() : positionDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Button.ButtonIcon toProto() {
            return new Button.ButtonIcon((Icon) this.surrogate.getIcon().toProto(), (Button.ButtonIcon.Position) this.surrogate.getPosition().toProto(), null, 4, null);
        }

        public String toString() {
            return "[ButtonIconDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ButtonIconDto) && Intrinsics.areEqual(((ButtonIconDto) other).surrogate, this.surrogate);
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
        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;", "", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "position", "<init>", "(Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "()V", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "getPosition", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "getPosition$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final IconDto icon;
            private final PositionDto position;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((IconDto) null, (PositionDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.icon == surrogate.icon && this.position == surrogate.position;
            }

            public int hashCode() {
                return (this.icon.hashCode() * 31) + this.position.hashCode();
            }

            public String toString() {
                return "Surrogate(icon=" + this.icon + ", position=" + this.position + ")";
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ButtonDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, IconDto iconDto, PositionDto positionDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.icon = (i & 1) == 0 ? IconDto.INSTANCE.getZeroValue() : iconDto;
                if ((i & 2) == 0) {
                    this.position = PositionDto.INSTANCE.getZeroValue();
                } else {
                    this.position = positionDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, IconDto.Serializer.INSTANCE, self.icon);
                }
                if (self.position != PositionDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, PositionDto.Serializer.INSTANCE, self.position);
                }
            }

            public Surrogate(IconDto icon, PositionDto position) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(position, "position");
                this.icon = icon;
                this.position = position;
            }

            public final IconDto getIcon() {
                return this.icon;
            }

            public /* synthetic */ Surrogate(IconDto iconDto, PositionDto positionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 2) != 0 ? PositionDto.INSTANCE.getZeroValue() : positionDto);
            }

            public final PositionDto getPosition() {
                return this.position;
            }
        }

        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "Lrh_server_driven_ui/v1/Button$ButtonIcon;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ButtonIconDto, Button.ButtonIcon> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ButtonIconDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonIconDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonIconDto> getBinaryBase64Serializer() {
                return (KSerializer) ButtonIconDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Button.ButtonIcon> getProtoAdapter() {
                return Button.ButtonIcon.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonIconDto getZeroValue() {
                return ButtonIconDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonIconDto fromProto(Button.ButtonIcon proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ButtonIconDto(new Surrogate(IconDto.INSTANCE.fromProto(proto.getIcon()), PositionDto.INSTANCE.fromProto(proto.getPosition())), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ButtonDto$ButtonIconDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ButtonDto.ButtonIconDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ButtonIconDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_UNSPECIFIED", "POSITION_LEFT", "POSITION_RIGHT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class PositionDto implements Dto2<Button.ButtonIcon.Position>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PositionDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<PositionDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<PositionDto, Button.ButtonIcon.Position>> binaryBase64Serializer$delegate;
            public static final PositionDto POSITION_UNSPECIFIED = new POSITION_UNSPECIFIED("POSITION_UNSPECIFIED", 0);
            public static final PositionDto POSITION_LEFT = new POSITION_LEFT("POSITION_LEFT", 1);
            public static final PositionDto POSITION_RIGHT = new POSITION_RIGHT("POSITION_RIGHT", 2);

            private static final /* synthetic */ PositionDto[] $values() {
                return new PositionDto[]{POSITION_UNSPECIFIED, POSITION_LEFT, POSITION_RIGHT};
            }

            public /* synthetic */ PositionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<PositionDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/ButtonDto.ButtonIconDto.PositionDto.POSITION_UNSPECIFIED", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class POSITION_UNSPECIFIED extends PositionDto {
                POSITION_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Button.ButtonIcon.Position toProto() {
                    return Button.ButtonIcon.Position.POSITION_UNSPECIFIED;
                }
            }

            private PositionDto(String str, int i) {
            }

            static {
                PositionDto[] positionDtoArr$values = $values();
                $VALUES = positionDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(positionDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ButtonDto$ButtonIconDto$PositionDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ButtonDto.ButtonIconDto.PositionDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/ButtonDto.ButtonIconDto.PositionDto.POSITION_LEFT", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class POSITION_LEFT extends PositionDto {
                POSITION_LEFT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Button.ButtonIcon.Position toProto() {
                    return Button.ButtonIcon.Position.POSITION_LEFT;
                }
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/ButtonDto.ButtonIconDto.PositionDto.POSITION_RIGHT", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class POSITION_RIGHT extends PositionDto {
                POSITION_RIGHT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Button.ButtonIcon.Position toProto() {
                    return Button.ButtonIcon.Position.POSITION_RIGHT;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<PositionDto, Button.ButtonIcon.Position> {

                /* compiled from: ButtonDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Button.ButtonIcon.Position.values().length];
                        try {
                            iArr[Button.ButtonIcon.Position.POSITION_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Button.ButtonIcon.Position.POSITION_LEFT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Button.ButtonIcon.Position.POSITION_RIGHT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<PositionDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<PositionDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<PositionDto> getBinaryBase64Serializer() {
                    return (KSerializer) PositionDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Button.ButtonIcon.Position> getProtoAdapter() {
                    return Button.ButtonIcon.Position.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public PositionDto getZeroValue() {
                    return PositionDto.POSITION_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public PositionDto fromProto(Button.ButtonIcon.Position proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return PositionDto.POSITION_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return PositionDto.POSITION_LEFT;
                    }
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return PositionDto.POSITION_RIGHT;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ButtonDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$PositionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<PositionDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<PositionDto, Button.ButtonIcon.Position> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Button.ButtonIcon.Position", PositionDto.getEntries(), PositionDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public PositionDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (PositionDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, PositionDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static PositionDto valueOf(String str) {
                return (PositionDto) Enum.valueOf(PositionDto.class, str);
            }

            public static PositionDto[] values() {
                return (PositionDto[]) $VALUES.clone();
            }
        }

        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<ButtonIconDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Button.ButtonIcon", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ButtonIconDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ButtonIconDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ButtonIconDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: ButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.ButtonDto$ButtonIconDto";
            }
        }
    }

    /* compiled from: ButtonDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ButtonDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ButtonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Button", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ButtonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ButtonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ButtonDto";
        }
    }
}
