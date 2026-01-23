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
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.TextInput;
import rh_server_driven_ui.p531v1.TextInputDto;

/* compiled from: TextInputDto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000eDCEFGHIJKLMNOPB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0099\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0006\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u00109R\u0011\u0010\u0010\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b:\u0010$R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b;\u00109R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b>\u0010$R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006Q"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TextInput;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextInputDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$Surrogate;)V", "Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "state", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "size", "", "placeholder_text", "", "is_disabled", AnnotatedPrivateKey.LABEL, "hide_label", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "toolbar", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "keyboard_type", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "autocorrection_type", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "autocapitalization_type", "activate_keyboard_on_appear", "identifier", "Lrh_server_driven_ui/v1/IconDto;", "leading_icon", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "formatter", "(Lrh_server_driven_ui/v1/TextInputDto$StateDto;Lrh_server_driven_ui/v1/TextInputDto$SizeDto;Ljava/lang/String;ZLjava/lang/String;ZLrh_server_driven_ui/v1/TextInputDto$ToolbarDto;Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;)V", "toProto", "()Lrh_server_driven_ui/v1/TextInput;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextInputDto$Surrogate;", "getState", "()Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "getSize", "()Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "getPlaceholder_text", "()Z", "getLabel", "getHide_label", "getKeyboard_type", "()Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "getIdentifier", "getLeading_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getFormatter", "()Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "Companion", "Surrogate", "FormatterDto", "StateDto", "PlaceholderFormatterDto", "ValidCharactersDto", "CurrencyFormatterDto", "ToolbarDto", "SizeDto", "KeyboardTypeDto", "AutoCorrectionTypeDto", "AutoCapitalizationTypeDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TextInputDto implements Dto3<TextInput>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TextInputDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TextInputDto, TextInput>> binaryBase64Serializer$delegate;
    private static final TextInputDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TextInputDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TextInputDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final SizeDto getSize() {
        return this.surrogate.getSize();
    }

    public final String getPlaceholder_text() {
        return this.surrogate.getPlaceholder_text();
    }

    public final boolean is_disabled() {
        return this.surrogate.getIs_disabled();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final boolean getHide_label() {
        return this.surrogate.getHide_label();
    }

    public final KeyboardTypeDto getKeyboard_type() {
        return this.surrogate.getKeyboard_type();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final IconDto getLeading_icon() {
        return this.surrogate.getLeading_icon();
    }

    public final FormatterDto getFormatter() {
        if (this.surrogate.getPlaceholder_formatter() != null) {
            return new FormatterDto.PlaceholderFormatter(this.surrogate.getPlaceholder_formatter());
        }
        if (this.surrogate.getCurrency_formatter() != null) {
            return new FormatterDto.CurrencyFormatter(this.surrogate.getCurrency_formatter());
        }
        return null;
    }

    public /* synthetic */ TextInputDto(StateDto stateDto, SizeDto sizeDto, String str, boolean z, String str2, boolean z2, ToolbarDto toolbarDto, KeyboardTypeDto keyboardTypeDto, AutoCorrectionTypeDto autoCorrectionTypeDto, AutoCapitalizationTypeDto autoCapitalizationTypeDto, boolean z3, String str3, IconDto iconDto, FormatterDto formatterDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateDto, (i & 2) != 0 ? SizeDto.INSTANCE.getZeroValue() : sizeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? ToolbarDto.INSTANCE.getZeroValue() : toolbarDto, (i & 128) != 0 ? KeyboardTypeDto.INSTANCE.getZeroValue() : keyboardTypeDto, (i & 256) != 0 ? AutoCorrectionTypeDto.INSTANCE.getZeroValue() : autoCorrectionTypeDto, (i & 512) != 0 ? AutoCapitalizationTypeDto.INSTANCE.getZeroValue() : autoCapitalizationTypeDto, (i & 1024) == 0 ? z3 : false, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 8192) != 0 ? null : formatterDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputDto(StateDto stateDto, SizeDto size, String placeholder_text, boolean z, String label, boolean z2, ToolbarDto toolbar, KeyboardTypeDto keyboard_type, AutoCorrectionTypeDto autocorrection_type, AutoCapitalizationTypeDto autocapitalization_type, boolean z3, String identifier, IconDto leading_icon, FormatterDto formatterDto) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placeholder_text, "placeholder_text");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(keyboard_type, "keyboard_type");
        Intrinsics.checkNotNullParameter(autocorrection_type, "autocorrection_type");
        Intrinsics.checkNotNullParameter(autocapitalization_type, "autocapitalization_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(leading_icon, "leading_icon");
        FormatterDto.PlaceholderFormatter placeholderFormatter = formatterDto instanceof FormatterDto.PlaceholderFormatter ? (FormatterDto.PlaceholderFormatter) formatterDto : null;
        PlaceholderFormatterDto value = placeholderFormatter != null ? placeholderFormatter.getValue() : null;
        FormatterDto.CurrencyFormatter currencyFormatter = formatterDto instanceof FormatterDto.CurrencyFormatter ? (FormatterDto.CurrencyFormatter) formatterDto : null;
        this(new Surrogate(stateDto, size, placeholder_text, z, label, z2, toolbar, keyboard_type, autocorrection_type, autocapitalization_type, z3, identifier, leading_icon, value, currencyFormatter != null ? currencyFormatter.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TextInput toProto() {
        StateDto state = this.surrogate.getState();
        TextInput.State proto = state != null ? state.toProto() : null;
        TextInput.Size size = (TextInput.Size) this.surrogate.getSize().toProto();
        String placeholder_text = this.surrogate.getPlaceholder_text();
        boolean is_disabled = this.surrogate.getIs_disabled();
        String label = this.surrogate.getLabel();
        boolean hide_label = this.surrogate.getHide_label();
        TextInput.Toolbar toolbar = (TextInput.Toolbar) this.surrogate.getToolbar().toProto();
        TextInput.KeyboardType keyboardType = (TextInput.KeyboardType) this.surrogate.getKeyboard_type().toProto();
        TextInput.AutoCorrectionType autoCorrectionType = (TextInput.AutoCorrectionType) this.surrogate.getAutocorrection_type().toProto();
        TextInput.AutoCapitalizationType autoCapitalizationType = (TextInput.AutoCapitalizationType) this.surrogate.getAutocapitalization_type().toProto();
        boolean activate_keyboard_on_appear = this.surrogate.getActivate_keyboard_on_appear();
        String identifier = this.surrogate.getIdentifier();
        Icon icon = (Icon) this.surrogate.getLeading_icon().toProto();
        PlaceholderFormatterDto placeholder_formatter = this.surrogate.getPlaceholder_formatter();
        TextInput.PlaceholderFormatter proto2 = placeholder_formatter != null ? placeholder_formatter.toProto() : null;
        CurrencyFormatterDto currency_formatter = this.surrogate.getCurrency_formatter();
        return new TextInput(proto, size, placeholder_text, is_disabled, label, hide_label, toolbar, keyboardType, autoCorrectionType, autoCapitalizationType, activate_keyboard_on_appear, identifier, proto2, currency_formatter != null ? currency_formatter.toProto() : null, icon, null, 32768, null);
    }

    public String toString() {
        return "[TextInputDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TextInputDto) && Intrinsics.areEqual(((TextInputDto) other).surrogate, this.surrogate);
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
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b@\b\u0083\b\u0018\u0000 f2\u00020\u0001:\u0002gfB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB«\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b;\u00107\u001a\u0004\b9\u0010:R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\b>\u00107\u001a\u0004\b=\u0010-R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bA\u00107\u001a\u0004\b\t\u0010@R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010-R \u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bE\u00107\u001a\u0004\bD\u0010@R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bI\u00107\u001a\u0004\bG\u0010HR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010J\u0012\u0004\bM\u00107\u001a\u0004\bK\u0010LR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010N\u0012\u0004\bQ\u00107\u001a\u0004\bO\u0010PR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010R\u0012\u0004\bU\u00107\u001a\u0004\bS\u0010TR \u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010?\u0012\u0004\bW\u00107\u001a\u0004\bV\u0010@R \u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010<\u0012\u0004\bY\u00107\u001a\u0004\bX\u0010-R \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u0012\u0004\b]\u00107\u001a\u0004\b[\u0010\\R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010^\u0012\u0004\ba\u00107\u001a\u0004\b_\u0010`R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010b\u0012\u0004\be\u00107\u001a\u0004\bc\u0010d¨\u0006h"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$Surrogate;", "", "Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "state", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "size", "", "placeholder_text", "", "is_disabled", AnnotatedPrivateKey.LABEL, "hide_label", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "toolbar", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "keyboard_type", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "autocorrection_type", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "autocapitalization_type", "activate_keyboard_on_appear", "identifier", "Lrh_server_driven_ui/v1/IconDto;", "leading_icon", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "placeholder_formatter", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "currency_formatter", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$StateDto;Lrh_server_driven_ui/v1/TextInputDto$SizeDto;Ljava/lang/String;ZLjava/lang/String;ZLrh_server_driven_ui/v1/TextInputDto$ToolbarDto;Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/TextInputDto$StateDto;Lrh_server_driven_ui/v1/TextInputDto$SizeDto;Ljava/lang/String;ZLjava/lang/String;ZLrh_server_driven_ui/v1/TextInputDto$ToolbarDto;Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;ZLjava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextInputDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "getState", "()Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "getState$annotations", "()V", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "getSize", "()Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "getSize$annotations", "Ljava/lang/String;", "getPlaceholder_text", "getPlaceholder_text$annotations", "Z", "()Z", "is_disabled$annotations", "getLabel", "getLabel$annotations", "getHide_label", "getHide_label$annotations", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "getToolbar", "()Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "getToolbar$annotations", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "getKeyboard_type", "()Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "getKeyboard_type$annotations", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "getAutocorrection_type", "()Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "getAutocorrection_type$annotations", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "getAutocapitalization_type", "()Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "getAutocapitalization_type$annotations", "getActivate_keyboard_on_appear", "getActivate_keyboard_on_appear$annotations", "getIdentifier", "getIdentifier$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getLeading_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getLeading_icon$annotations", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "getPlaceholder_formatter", "()Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "getPlaceholder_formatter$annotations", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "getCurrency_formatter", "()Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "getCurrency_formatter$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean activate_keyboard_on_appear;
        private final AutoCapitalizationTypeDto autocapitalization_type;
        private final AutoCorrectionTypeDto autocorrection_type;
        private final CurrencyFormatterDto currency_formatter;
        private final boolean hide_label;
        private final String identifier;
        private final boolean is_disabled;
        private final KeyboardTypeDto keyboard_type;
        private final String label;
        private final IconDto leading_icon;
        private final PlaceholderFormatterDto placeholder_formatter;
        private final String placeholder_text;
        private final SizeDto size;
        private final StateDto state;
        private final ToolbarDto toolbar;

        public Surrogate() {
            this((StateDto) null, (SizeDto) null, (String) null, false, (String) null, false, (ToolbarDto) null, (KeyboardTypeDto) null, (AutoCorrectionTypeDto) null, (AutoCapitalizationTypeDto) null, false, (String) null, (IconDto) null, (PlaceholderFormatterDto) null, (CurrencyFormatterDto) null, 32767, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.state, surrogate.state) && this.size == surrogate.size && Intrinsics.areEqual(this.placeholder_text, surrogate.placeholder_text) && this.is_disabled == surrogate.is_disabled && Intrinsics.areEqual(this.label, surrogate.label) && this.hide_label == surrogate.hide_label && this.toolbar == surrogate.toolbar && this.keyboard_type == surrogate.keyboard_type && this.autocorrection_type == surrogate.autocorrection_type && this.autocapitalization_type == surrogate.autocapitalization_type && this.activate_keyboard_on_appear == surrogate.activate_keyboard_on_appear && Intrinsics.areEqual(this.identifier, surrogate.identifier) && this.leading_icon == surrogate.leading_icon && Intrinsics.areEqual(this.placeholder_formatter, surrogate.placeholder_formatter) && Intrinsics.areEqual(this.currency_formatter, surrogate.currency_formatter);
        }

        public int hashCode() {
            StateDto stateDto = this.state;
            int iHashCode = (((((((((((((((((((((((((stateDto == null ? 0 : stateDto.hashCode()) * 31) + this.size.hashCode()) * 31) + this.placeholder_text.hashCode()) * 31) + Boolean.hashCode(this.is_disabled)) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.hide_label)) * 31) + this.toolbar.hashCode()) * 31) + this.keyboard_type.hashCode()) * 31) + this.autocorrection_type.hashCode()) * 31) + this.autocapitalization_type.hashCode()) * 31) + Boolean.hashCode(this.activate_keyboard_on_appear)) * 31) + this.identifier.hashCode()) * 31) + this.leading_icon.hashCode()) * 31;
            PlaceholderFormatterDto placeholderFormatterDto = this.placeholder_formatter;
            int iHashCode2 = (iHashCode + (placeholderFormatterDto == null ? 0 : placeholderFormatterDto.hashCode())) * 31;
            CurrencyFormatterDto currencyFormatterDto = this.currency_formatter;
            return iHashCode2 + (currencyFormatterDto != null ? currencyFormatterDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", size=" + this.size + ", placeholder_text=" + this.placeholder_text + ", is_disabled=" + this.is_disabled + ", label=" + this.label + ", hide_label=" + this.hide_label + ", toolbar=" + this.toolbar + ", keyboard_type=" + this.keyboard_type + ", autocorrection_type=" + this.autocorrection_type + ", autocapitalization_type=" + this.autocapitalization_type + ", activate_keyboard_on_appear=" + this.activate_keyboard_on_appear + ", identifier=" + this.identifier + ", leading_icon=" + this.leading_icon + ", placeholder_formatter=" + this.placeholder_formatter + ", currency_formatter=" + this.currency_formatter + ")";
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TextInputDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, StateDto stateDto, SizeDto sizeDto, String str, boolean z, String str2, boolean z2, ToolbarDto toolbarDto, KeyboardTypeDto keyboardTypeDto, AutoCorrectionTypeDto autoCorrectionTypeDto, AutoCapitalizationTypeDto autoCapitalizationTypeDto, boolean z3, String str3, IconDto iconDto, PlaceholderFormatterDto placeholderFormatterDto, CurrencyFormatterDto currencyFormatterDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.state = null;
            } else {
                this.state = stateDto;
            }
            if ((i & 2) == 0) {
                this.size = SizeDto.INSTANCE.getZeroValue();
            } else {
                this.size = sizeDto;
            }
            if ((i & 4) == 0) {
                this.placeholder_text = "";
            } else {
                this.placeholder_text = str;
            }
            if ((i & 8) == 0) {
                this.is_disabled = false;
            } else {
                this.is_disabled = z;
            }
            if ((i & 16) == 0) {
                this.label = "";
            } else {
                this.label = str2;
            }
            if ((i & 32) == 0) {
                this.hide_label = false;
            } else {
                this.hide_label = z2;
            }
            if ((i & 64) == 0) {
                this.toolbar = ToolbarDto.INSTANCE.getZeroValue();
            } else {
                this.toolbar = toolbarDto;
            }
            if ((i & 128) == 0) {
                this.keyboard_type = KeyboardTypeDto.INSTANCE.getZeroValue();
            } else {
                this.keyboard_type = keyboardTypeDto;
            }
            if ((i & 256) == 0) {
                this.autocorrection_type = AutoCorrectionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.autocorrection_type = autoCorrectionTypeDto;
            }
            if ((i & 512) == 0) {
                this.autocapitalization_type = AutoCapitalizationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.autocapitalization_type = autoCapitalizationTypeDto;
            }
            if ((i & 1024) == 0) {
                this.activate_keyboard_on_appear = false;
            } else {
                this.activate_keyboard_on_appear = z3;
            }
            if ((i & 2048) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str3;
            }
            this.leading_icon = (i & 4096) == 0 ? IconDto.INSTANCE.getZeroValue() : iconDto;
            if ((i & 8192) == 0) {
                this.placeholder_formatter = null;
            } else {
                this.placeholder_formatter = placeholderFormatterDto;
            }
            if ((i & 16384) == 0) {
                this.currency_formatter = null;
            } else {
                this.currency_formatter = currencyFormatterDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            StateDto stateDto = self.state;
            if (stateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StateDto.Serializer.INSTANCE, stateDto);
            }
            if (self.size != SizeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SizeDto.Serializer.INSTANCE, self.size);
            }
            if (!Intrinsics.areEqual(self.placeholder_text, "")) {
                output.encodeStringElement(serialDesc, 2, self.placeholder_text);
            }
            boolean z = self.is_disabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 4, self.label);
            }
            boolean z2 = self.hide_label;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
            if (self.toolbar != ToolbarDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, ToolbarDto.Serializer.INSTANCE, self.toolbar);
            }
            if (self.keyboard_type != KeyboardTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, KeyboardTypeDto.Serializer.INSTANCE, self.keyboard_type);
            }
            if (self.autocorrection_type != AutoCorrectionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, AutoCorrectionTypeDto.Serializer.INSTANCE, self.autocorrection_type);
            }
            if (self.autocapitalization_type != AutoCapitalizationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, AutoCapitalizationTypeDto.Serializer.INSTANCE, self.autocapitalization_type);
            }
            boolean z3 = self.activate_keyboard_on_appear;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 10, z3);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 11, self.identifier);
            }
            if (self.leading_icon != IconDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, IconDto.Serializer.INSTANCE, self.leading_icon);
            }
            PlaceholderFormatterDto placeholderFormatterDto = self.placeholder_formatter;
            if (placeholderFormatterDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, PlaceholderFormatterDto.Serializer.INSTANCE, placeholderFormatterDto);
            }
            CurrencyFormatterDto currencyFormatterDto = self.currency_formatter;
            if (currencyFormatterDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, CurrencyFormatterDto.Serializer.INSTANCE, currencyFormatterDto);
            }
        }

        public Surrogate(StateDto stateDto, SizeDto size, String placeholder_text, boolean z, String label, boolean z2, ToolbarDto toolbar, KeyboardTypeDto keyboard_type, AutoCorrectionTypeDto autocorrection_type, AutoCapitalizationTypeDto autocapitalization_type, boolean z3, String identifier, IconDto leading_icon, PlaceholderFormatterDto placeholderFormatterDto, CurrencyFormatterDto currencyFormatterDto) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(placeholder_text, "placeholder_text");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            Intrinsics.checkNotNullParameter(keyboard_type, "keyboard_type");
            Intrinsics.checkNotNullParameter(autocorrection_type, "autocorrection_type");
            Intrinsics.checkNotNullParameter(autocapitalization_type, "autocapitalization_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(leading_icon, "leading_icon");
            this.state = stateDto;
            this.size = size;
            this.placeholder_text = placeholder_text;
            this.is_disabled = z;
            this.label = label;
            this.hide_label = z2;
            this.toolbar = toolbar;
            this.keyboard_type = keyboard_type;
            this.autocorrection_type = autocorrection_type;
            this.autocapitalization_type = autocapitalization_type;
            this.activate_keyboard_on_appear = z3;
            this.identifier = identifier;
            this.leading_icon = leading_icon;
            this.placeholder_formatter = placeholderFormatterDto;
            this.currency_formatter = currencyFormatterDto;
        }

        public final StateDto getState() {
            return this.state;
        }

        public final SizeDto getSize() {
            return this.size;
        }

        public /* synthetic */ Surrogate(StateDto stateDto, SizeDto sizeDto, String str, boolean z, String str2, boolean z2, ToolbarDto toolbarDto, KeyboardTypeDto keyboardTypeDto, AutoCorrectionTypeDto autoCorrectionTypeDto, AutoCapitalizationTypeDto autoCapitalizationTypeDto, boolean z3, String str3, IconDto iconDto, PlaceholderFormatterDto placeholderFormatterDto, CurrencyFormatterDto currencyFormatterDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stateDto, (i & 2) != 0 ? SizeDto.INSTANCE.getZeroValue() : sizeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? ToolbarDto.INSTANCE.getZeroValue() : toolbarDto, (i & 128) != 0 ? KeyboardTypeDto.INSTANCE.getZeroValue() : keyboardTypeDto, (i & 256) != 0 ? AutoCorrectionTypeDto.INSTANCE.getZeroValue() : autoCorrectionTypeDto, (i & 512) != 0 ? AutoCapitalizationTypeDto.INSTANCE.getZeroValue() : autoCapitalizationTypeDto, (i & 1024) == 0 ? z3 : false, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 8192) != 0 ? null : placeholderFormatterDto, (i & 16384) != 0 ? null : currencyFormatterDto);
        }

        public final String getPlaceholder_text() {
            return this.placeholder_text;
        }

        /* renamed from: is_disabled, reason: from getter */
        public final boolean getIs_disabled() {
            return this.is_disabled;
        }

        public final String getLabel() {
            return this.label;
        }

        public final boolean getHide_label() {
            return this.hide_label;
        }

        public final ToolbarDto getToolbar() {
            return this.toolbar;
        }

        public final KeyboardTypeDto getKeyboard_type() {
            return this.keyboard_type;
        }

        public final AutoCorrectionTypeDto getAutocorrection_type() {
            return this.autocorrection_type;
        }

        public final AutoCapitalizationTypeDto getAutocapitalization_type() {
            return this.autocapitalization_type;
        }

        public final boolean getActivate_keyboard_on_appear() {
            return this.activate_keyboard_on_appear;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final IconDto getLeading_icon() {
            return this.leading_icon;
        }

        public final PlaceholderFormatterDto getPlaceholder_formatter() {
            return this.placeholder_formatter;
        }

        public final CurrencyFormatterDto getCurrency_formatter() {
            return this.currency_formatter;
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto;", "Lrh_server_driven_ui/v1/TextInput;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TextInputDto, TextInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TextInputDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextInputDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextInputDto> getBinaryBase64Serializer() {
            return (KSerializer) TextInputDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TextInput> getProtoAdapter() {
            return TextInput.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextInputDto getZeroValue() {
            return TextInputDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextInputDto fromProto(TextInput proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TextInput.State state = proto.getState();
            DefaultConstructorMarker defaultConstructorMarker = null;
            StateDto stateDtoFromProto = state != null ? StateDto.INSTANCE.fromProto(state) : null;
            SizeDto sizeDtoFromProto = SizeDto.INSTANCE.fromProto(proto.getSize());
            String placeholder_text = proto.getPlaceholder_text();
            boolean is_disabled = proto.getIs_disabled();
            String label = proto.getLabel();
            boolean hide_label = proto.getHide_label();
            ToolbarDto toolbarDtoFromProto = ToolbarDto.INSTANCE.fromProto(proto.getToolbar());
            KeyboardTypeDto keyboardTypeDtoFromProto = KeyboardTypeDto.INSTANCE.fromProto(proto.getKeyboard_type());
            AutoCorrectionTypeDto autoCorrectionTypeDtoFromProto = AutoCorrectionTypeDto.INSTANCE.fromProto(proto.getAutocorrection_type());
            AutoCapitalizationTypeDto autoCapitalizationTypeDtoFromProto = AutoCapitalizationTypeDto.INSTANCE.fromProto(proto.getAutocapitalization_type());
            boolean activate_keyboard_on_appear = proto.getActivate_keyboard_on_appear();
            String identifier = proto.getIdentifier();
            IconDto iconDtoFromProto = IconDto.INSTANCE.fromProto(proto.getLeading_icon());
            TextInput.PlaceholderFormatter placeholder_formatter = proto.getPlaceholder_formatter();
            PlaceholderFormatterDto placeholderFormatterDtoFromProto = placeholder_formatter != null ? PlaceholderFormatterDto.INSTANCE.fromProto(placeholder_formatter) : null;
            TextInput.CurrencyFormatter currency_formatter = proto.getCurrency_formatter();
            return new TextInputDto(new Surrogate(stateDtoFromProto, sizeDtoFromProto, placeholder_text, is_disabled, label, hide_label, toolbarDtoFromProto, keyboardTypeDtoFromProto, autoCorrectionTypeDtoFromProto, autoCapitalizationTypeDtoFromProto, activate_keyboard_on_appear, identifier, iconDtoFromProto, placeholderFormatterDtoFromProto, currency_formatter != null ? CurrencyFormatterDto.INSTANCE.fromProto(currency_formatter) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextInputDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TextInputDto(null, null, null, false, null, false, null, null, null, null, false, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PlaceholderFormatter", "CurrencyFormatter", "Companion", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto$CurrencyFormatter;", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto$PlaceholderFormatter;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static abstract class FormatterDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ FormatterDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FormatterDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$FormatterDto$PlaceholderFormatter;", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "getValue", "()Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaceholderFormatter extends FormatterDto {
            private final PlaceholderFormatterDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaceholderFormatter) && Intrinsics.areEqual(this.value, ((PlaceholderFormatter) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaceholderFormatter(value=" + this.value + ")";
            }

            public final PlaceholderFormatterDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaceholderFormatter(PlaceholderFormatterDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$FormatterDto$CurrencyFormatter;", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "getValue", "()Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrencyFormatter extends FormatterDto {
            private final CurrencyFormatterDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurrencyFormatter) && Intrinsics.areEqual(this.value, ((CurrencyFormatter) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CurrencyFormatter(value=" + this.value + ")";
            }

            public final CurrencyFormatterDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CurrencyFormatter(CurrencyFormatterDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$FormatterDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "Lrh_server_driven_ui/v1/TextInput;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<FormatterDto, TextInput> {
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
            public ProtoAdapter<TextInput> getProtoAdapter() {
                return TextInput.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FormatterDto fromProto(TextInput proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPlaceholder_formatter() != null) {
                    return new PlaceholderFormatter(PlaceholderFormatterDto.INSTANCE.fromProto(proto.getPlaceholder_formatter()));
                }
                if (proto.getCurrency_formatter() != null) {
                    return new CurrencyFormatter(CurrencyFormatterDto.INSTANCE.fromProto(proto.getCurrency_formatter()));
                }
                return null;
            }
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TextInput$State;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;)V", "", "text", "(Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/TextInput$State;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;", "getText", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto3<TextInput.State>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, TextInput.State>> binaryBase64Serializer$delegate;
        private static final StateDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ StateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private StateDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getText() {
            return this.surrogate.getText();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateDto(String text) {
            this(new Surrogate(text));
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public /* synthetic */ StateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public TextInput.State toProto() {
            return new TextInput.State(this.surrogate.getText(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[StateDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof StateDto) && Intrinsics.areEqual(((StateDto) other).surrogate, this.surrogate);
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
        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String text;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.text, ((Surrogate) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Surrogate(text=" + this.text + ")";
            }

            /* compiled from: TextInputDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TextInputDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.text = "";
                } else {
                    this.text = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.text, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.text);
            }

            public Surrogate(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "Lrh_server_driven_ui/v1/TextInput$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<StateDto, TextInput.State> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getBinaryBase64Serializer() {
                return (KSerializer) StateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.State> getProtoAdapter() {
                return TextInput.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(TextInput.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new StateDto(new Surrogate(proto.getText()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new StateDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$StateDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextInputDto$StateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TextInput.State", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public StateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new StateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$StateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.TextInputDto$StateDto";
            }
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;)V", "", "max_length", "", "format", "placeholder_character", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "valid_characters", "(ILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;)V", "toProto", "()Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;", "getMax_length", "getFormat", "getPlaceholder_character", "getValid_characters", "()Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class PlaceholderFormatterDto implements Dto3<TextInput.PlaceholderFormatter>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PlaceholderFormatterDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PlaceholderFormatterDto, TextInput.PlaceholderFormatter>> binaryBase64Serializer$delegate;
        private static final PlaceholderFormatterDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PlaceholderFormatterDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PlaceholderFormatterDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final int getMax_length() {
            return this.surrogate.getMax_length();
        }

        public final String getFormat() {
            return this.surrogate.getFormat();
        }

        public final String getPlaceholder_character() {
            return this.surrogate.getPlaceholder_character();
        }

        public final ValidCharactersDto getValid_characters() {
            return this.surrogate.getValid_characters();
        }

        public /* synthetic */ PlaceholderFormatterDto(int i, String str, String str2, ValidCharactersDto validCharactersDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? ValidCharactersDto.INSTANCE.getZeroValue() : validCharactersDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PlaceholderFormatterDto(int i, String format2, String placeholder_character, ValidCharactersDto valid_characters) {
            this(new Surrogate(i, format2, placeholder_character, valid_characters));
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(placeholder_character, "placeholder_character");
            Intrinsics.checkNotNullParameter(valid_characters, "valid_characters");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public TextInput.PlaceholderFormatter toProto() {
            return new TextInput.PlaceholderFormatter(this.surrogate.getMax_length(), this.surrogate.getFormat(), this.surrogate.getPlaceholder_character(), (TextInput.ValidCharacters) this.surrogate.getValid_characters().toProto(), null, 16, null);
        }

        public String toString() {
            return "[PlaceholderFormatterDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PlaceholderFormatterDto) && Intrinsics.areEqual(((PlaceholderFormatterDto) other).surrogate, this.surrogate);
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
        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B>\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001cR \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001cR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b/\u0010&\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "max_length", "", "format", "placeholder_character", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "valid_characters", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMax_length", "getMax_length$annotations", "()V", "Ljava/lang/String;", "getFormat", "getFormat$annotations", "getPlaceholder_character", "getPlaceholder_character$annotations", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "getValid_characters", "()Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "getValid_characters$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String format;
            private final int max_length;
            private final String placeholder_character;
            private final ValidCharactersDto valid_characters;

            public Surrogate() {
                this(0, (String) null, (String) null, (ValidCharactersDto) null, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.max_length == surrogate.max_length && Intrinsics.areEqual(this.format, surrogate.format) && Intrinsics.areEqual(this.placeholder_character, surrogate.placeholder_character) && this.valid_characters == surrogate.valid_characters;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.max_length) * 31) + this.format.hashCode()) * 31) + this.placeholder_character.hashCode()) * 31) + this.valid_characters.hashCode();
            }

            public String toString() {
                return "Surrogate(max_length=" + this.max_length + ", format=" + this.format + ", placeholder_character=" + this.placeholder_character + ", valid_characters=" + this.valid_characters + ")";
            }

            /* compiled from: TextInputDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TextInputDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, int i2, String str, String str2, ValidCharactersDto validCharactersDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.max_length = (i & 1) == 0 ? 0 : i2;
                if ((i & 2) == 0) {
                    this.format = "";
                } else {
                    this.format = str;
                }
                if ((i & 4) == 0) {
                    this.placeholder_character = "";
                } else {
                    this.placeholder_character = str2;
                }
                if ((i & 8) == 0) {
                    this.valid_characters = ValidCharactersDto.INSTANCE.getZeroValue();
                } else {
                    this.valid_characters = validCharactersDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                int i = self.max_length;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                if (!Intrinsics.areEqual(self.format, "")) {
                    output.encodeStringElement(serialDesc, 1, self.format);
                }
                if (!Intrinsics.areEqual(self.placeholder_character, "")) {
                    output.encodeStringElement(serialDesc, 2, self.placeholder_character);
                }
                if (self.valid_characters != ValidCharactersDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 3, ValidCharactersDto.Serializer.INSTANCE, self.valid_characters);
                }
            }

            public Surrogate(int i, String format2, String placeholder_character, ValidCharactersDto valid_characters) {
                Intrinsics.checkNotNullParameter(format2, "format");
                Intrinsics.checkNotNullParameter(placeholder_character, "placeholder_character");
                Intrinsics.checkNotNullParameter(valid_characters, "valid_characters");
                this.max_length = i;
                this.format = format2;
                this.placeholder_character = placeholder_character;
                this.valid_characters = valid_characters;
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, ValidCharactersDto validCharactersDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? ValidCharactersDto.INSTANCE.getZeroValue() : validCharactersDto);
            }

            public final int getMax_length() {
                return this.max_length;
            }

            public final String getFormat() {
                return this.format;
            }

            public final String getPlaceholder_character() {
                return this.placeholder_character;
            }

            public final ValidCharactersDto getValid_characters() {
                return this.valid_characters;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PlaceholderFormatterDto, TextInput.PlaceholderFormatter> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlaceholderFormatterDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlaceholderFormatterDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlaceholderFormatterDto> getBinaryBase64Serializer() {
                return (KSerializer) PlaceholderFormatterDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.PlaceholderFormatter> getProtoAdapter() {
                return TextInput.PlaceholderFormatter.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlaceholderFormatterDto getZeroValue() {
                return PlaceholderFormatterDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlaceholderFormatterDto fromProto(TextInput.PlaceholderFormatter proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PlaceholderFormatterDto(new Surrogate(proto.getMax_length(), proto.getFormat(), proto.getPlaceholder_character(), ValidCharactersDto.INSTANCE.fromProto(proto.getValid_characters())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$PlaceholderFormatterDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.PlaceholderFormatterDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PlaceholderFormatterDto(0, null, null, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PlaceholderFormatterDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TextInput.PlaceholderFormatter", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PlaceholderFormatterDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PlaceholderFormatterDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PlaceholderFormatterDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$PlaceholderFormatterDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.TextInputDto$PlaceholderFormatterDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "VALID_CHARACTERS_UNSPECIFIED", "VALID_CHARACTERS_ALPHANUMERIC", "VALID_CHARACTERS_NUMERIC", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class ValidCharactersDto implements Dto2<TextInput.ValidCharacters>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ValidCharactersDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ValidCharactersDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ValidCharactersDto, TextInput.ValidCharacters>> binaryBase64Serializer$delegate;
        public static final ValidCharactersDto VALID_CHARACTERS_UNSPECIFIED = new VALID_CHARACTERS_UNSPECIFIED("VALID_CHARACTERS_UNSPECIFIED", 0);
        public static final ValidCharactersDto VALID_CHARACTERS_ALPHANUMERIC = new VALID_CHARACTERS_ALPHANUMERIC("VALID_CHARACTERS_ALPHANUMERIC", 1);
        public static final ValidCharactersDto VALID_CHARACTERS_NUMERIC = new VALID_CHARACTERS_NUMERIC("VALID_CHARACTERS_NUMERIC", 2);

        private static final /* synthetic */ ValidCharactersDto[] $values() {
            return new ValidCharactersDto[]{VALID_CHARACTERS_UNSPECIFIED, VALID_CHARACTERS_ALPHANUMERIC, VALID_CHARACTERS_NUMERIC};
        }

        public /* synthetic */ ValidCharactersDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ValidCharactersDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ValidCharactersDto.VALID_CHARACTERS_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VALID_CHARACTERS_UNSPECIFIED extends ValidCharactersDto {
            VALID_CHARACTERS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.ValidCharacters toProto() {
                return TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED;
            }
        }

        private ValidCharactersDto(String str, int i) {
        }

        static {
            ValidCharactersDto[] validCharactersDtoArr$values = $values();
            $VALUES = validCharactersDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(validCharactersDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$ValidCharactersDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.ValidCharactersDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ValidCharactersDto.VALID_CHARACTERS_ALPHANUMERIC", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VALID_CHARACTERS_ALPHANUMERIC extends ValidCharactersDto {
            VALID_CHARACTERS_ALPHANUMERIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.ValidCharacters toProto() {
                return TextInput.ValidCharacters.VALID_CHARACTERS_ALPHANUMERIC;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ValidCharactersDto.VALID_CHARACTERS_NUMERIC", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VALID_CHARACTERS_NUMERIC extends ValidCharactersDto {
            VALID_CHARACTERS_NUMERIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.ValidCharacters toProto() {
                return TextInput.ValidCharacters.VALID_CHARACTERS_NUMERIC;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ValidCharactersDto, TextInput.ValidCharacters> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.ValidCharacters.values().length];
                    try {
                        iArr[TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.ValidCharacters.VALID_CHARACTERS_ALPHANUMERIC.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.ValidCharacters.VALID_CHARACTERS_NUMERIC.ordinal()] = 3;
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

            public final KSerializer<ValidCharactersDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ValidCharactersDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ValidCharactersDto> getBinaryBase64Serializer() {
                return (KSerializer) ValidCharactersDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.ValidCharacters> getProtoAdapter() {
                return TextInput.ValidCharacters.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValidCharactersDto getZeroValue() {
                return ValidCharactersDto.VALID_CHARACTERS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValidCharactersDto fromProto(TextInput.ValidCharacters proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ValidCharactersDto.VALID_CHARACTERS_UNSPECIFIED;
                }
                if (i == 2) {
                    return ValidCharactersDto.VALID_CHARACTERS_ALPHANUMERIC;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ValidCharactersDto.VALID_CHARACTERS_NUMERIC;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$ValidCharactersDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ValidCharactersDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ValidCharactersDto, TextInput.ValidCharacters> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.ValidCharacters", ValidCharactersDto.getEntries(), ValidCharactersDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ValidCharactersDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ValidCharactersDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ValidCharactersDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ValidCharactersDto valueOf(String str) {
            return (ValidCharactersDto) Enum.valueOf(ValidCharactersDto.class, str);
        }

        public static ValidCharactersDto[] values() {
            return (ValidCharactersDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;)V", "", "currency_code", "(Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;", "getCurrency_code", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class CurrencyFormatterDto implements Dto3<TextInput.CurrencyFormatter>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CurrencyFormatterDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyFormatterDto, TextInput.CurrencyFormatter>> binaryBase64Serializer$delegate;
        private static final CurrencyFormatterDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CurrencyFormatterDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyFormatterDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getCurrency_code() {
            return this.surrogate.getCurrency_code();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CurrencyFormatterDto(String currency_code) {
            this(new Surrogate(currency_code));
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        }

        public /* synthetic */ CurrencyFormatterDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public TextInput.CurrencyFormatter toProto() {
            return new TextInput.CurrencyFormatter(this.surrogate.getCurrency_code(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[CurrencyFormatterDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CurrencyFormatterDto) && Intrinsics.areEqual(((CurrencyFormatterDto) other).surrogate, this.surrogate);
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
        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;", "", "", "currency_code", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_code", "getCurrency_code$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String currency_code;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.currency_code, ((Surrogate) other).currency_code);
            }

            public int hashCode() {
                return this.currency_code.hashCode();
            }

            public String toString() {
                return "Surrogate(currency_code=" + this.currency_code + ")";
            }

            /* compiled from: TextInputDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TextInputDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.currency_code = "";
                } else {
                    this.currency_code = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.currency_code, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.currency_code);
            }

            public Surrogate(String currency_code) {
                Intrinsics.checkNotNullParameter(currency_code, "currency_code");
                this.currency_code = currency_code;
            }

            public final String getCurrency_code() {
                return this.currency_code;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CurrencyFormatterDto, TextInput.CurrencyFormatter> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyFormatterDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyFormatterDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyFormatterDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyFormatterDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.CurrencyFormatter> getProtoAdapter() {
                return TextInput.CurrencyFormatter.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyFormatterDto getZeroValue() {
                return CurrencyFormatterDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyFormatterDto fromProto(TextInput.CurrencyFormatter proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CurrencyFormatterDto(new Surrogate(proto.getCurrency_code()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$CurrencyFormatterDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.CurrencyFormatterDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CurrencyFormatterDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyFormatterDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TextInput.CurrencyFormatter", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyFormatterDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyFormatterDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CurrencyFormatterDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$CurrencyFormatterDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.TextInputDto$CurrencyFormatterDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TOOLBAR_UNSPECIFIED", "TOOLBAR_DEFAULT", "TOOLBAR_NONE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ToolbarDto implements Dto2<TextInput.Toolbar>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolbarDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ToolbarDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ToolbarDto, TextInput.Toolbar>> binaryBase64Serializer$delegate;
        public static final ToolbarDto TOOLBAR_UNSPECIFIED = new TOOLBAR_UNSPECIFIED("TOOLBAR_UNSPECIFIED", 0);
        public static final ToolbarDto TOOLBAR_DEFAULT = new TOOLBAR_DEFAULT("TOOLBAR_DEFAULT", 1);
        public static final ToolbarDto TOOLBAR_NONE = new TOOLBAR_NONE("TOOLBAR_NONE", 2);

        private static final /* synthetic */ ToolbarDto[] $values() {
            return new ToolbarDto[]{TOOLBAR_UNSPECIFIED, TOOLBAR_DEFAULT, TOOLBAR_NONE};
        }

        public /* synthetic */ ToolbarDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ToolbarDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ToolbarDto.TOOLBAR_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLBAR_UNSPECIFIED extends ToolbarDto {
            TOOLBAR_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Toolbar toProto() {
                return TextInput.Toolbar.TOOLBAR_UNSPECIFIED;
            }
        }

        private ToolbarDto(String str, int i) {
        }

        static {
            ToolbarDto[] toolbarDtoArr$values = $values();
            $VALUES = toolbarDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolbarDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$ToolbarDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.ToolbarDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ToolbarDto.TOOLBAR_DEFAULT", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLBAR_DEFAULT extends ToolbarDto {
            TOOLBAR_DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Toolbar toProto() {
                return TextInput.Toolbar.TOOLBAR_DEFAULT;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.ToolbarDto.TOOLBAR_NONE", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLBAR_NONE extends ToolbarDto {
            TOOLBAR_NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Toolbar toProto() {
                return TextInput.Toolbar.TOOLBAR_NONE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ToolbarDto, TextInput.Toolbar> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.Toolbar.values().length];
                    try {
                        iArr[TextInput.Toolbar.TOOLBAR_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.Toolbar.TOOLBAR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.Toolbar.TOOLBAR_NONE.ordinal()] = 3;
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

            public final KSerializer<ToolbarDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolbarDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolbarDto> getBinaryBase64Serializer() {
                return (KSerializer) ToolbarDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.Toolbar> getProtoAdapter() {
                return TextInput.Toolbar.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolbarDto getZeroValue() {
                return ToolbarDto.TOOLBAR_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolbarDto fromProto(TextInput.Toolbar proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ToolbarDto.TOOLBAR_UNSPECIFIED;
                }
                if (i == 2) {
                    return ToolbarDto.TOOLBAR_DEFAULT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ToolbarDto.TOOLBAR_NONE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$ToolbarDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<ToolbarDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ToolbarDto, TextInput.Toolbar> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.Toolbar", ToolbarDto.getEntries(), ToolbarDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ToolbarDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ToolbarDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ToolbarDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ToolbarDto valueOf(String str) {
            return (ToolbarDto) Enum.valueOf(ToolbarDto.class, str);
        }

        public static ToolbarDto[] values() {
            return (ToolbarDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$Size;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_UNSPECIFIED", "SIZE_HERO", "SIZE_REGULAR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SizeDto implements Dto2<TextInput.Size>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SizeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SizeDto, TextInput.Size>> binaryBase64Serializer$delegate;
        public static final SizeDto SIZE_UNSPECIFIED = new SIZE_UNSPECIFIED("SIZE_UNSPECIFIED", 0);
        public static final SizeDto SIZE_HERO = new SIZE_HERO("SIZE_HERO", 1);
        public static final SizeDto SIZE_REGULAR = new SIZE_REGULAR("SIZE_REGULAR", 2);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{SIZE_UNSPECIFIED, SIZE_HERO, SIZE_REGULAR};
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

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.SizeDto.SIZE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_UNSPECIFIED extends SizeDto {
            SIZE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Size toProto() {
                return TextInput.Size.SIZE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$SizeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.SizeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.SizeDto.SIZE_HERO", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_HERO extends SizeDto {
            SIZE_HERO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Size toProto() {
                return TextInput.Size.SIZE_HERO;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.SizeDto.SIZE_REGULAR", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_REGULAR extends SizeDto {
            SIZE_REGULAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.Size toProto() {
                return TextInput.Size.SIZE_REGULAR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$SizeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "Lrh_server_driven_ui/v1/TextInput$Size;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SizeDto, TextInput.Size> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.Size.values().length];
                    try {
                        iArr[TextInput.Size.SIZE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.Size.SIZE_HERO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.Size.SIZE_REGULAR.ordinal()] = 3;
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
            public ProtoAdapter<TextInput.Size> getProtoAdapter() {
                return TextInput.Size.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto getZeroValue() {
                return SizeDto.SIZE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto fromProto(TextInput.Size proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SizeDto.SIZE_UNSPECIFIED;
                }
                if (i == 2) {
                    return SizeDto.SIZE_HERO;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return SizeDto.SIZE_REGULAR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$SizeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$SizeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<SizeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SizeDto, TextInput.Size> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.Size", SizeDto.getEntries(), SizeDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "KEYBOARD_TYPE_UNSPECIFIED", "KEYBOARD_TYPE_NATIVE", "KEYBOARD_TYPE_EMAIL", "KEYBOARD_TYPE_DECIMAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class KeyboardTypeDto implements Dto2<TextInput.KeyboardType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ KeyboardTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<KeyboardTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<KeyboardTypeDto, TextInput.KeyboardType>> binaryBase64Serializer$delegate;
        public static final KeyboardTypeDto KEYBOARD_TYPE_UNSPECIFIED = new KEYBOARD_TYPE_UNSPECIFIED("KEYBOARD_TYPE_UNSPECIFIED", 0);
        public static final KeyboardTypeDto KEYBOARD_TYPE_NATIVE = new KEYBOARD_TYPE_NATIVE("KEYBOARD_TYPE_NATIVE", 1);
        public static final KeyboardTypeDto KEYBOARD_TYPE_EMAIL = new KEYBOARD_TYPE_EMAIL("KEYBOARD_TYPE_EMAIL", 2);
        public static final KeyboardTypeDto KEYBOARD_TYPE_DECIMAL = new KEYBOARD_TYPE_DECIMAL("KEYBOARD_TYPE_DECIMAL", 3);

        private static final /* synthetic */ KeyboardTypeDto[] $values() {
            return new KeyboardTypeDto[]{KEYBOARD_TYPE_UNSPECIFIED, KEYBOARD_TYPE_NATIVE, KEYBOARD_TYPE_EMAIL, KEYBOARD_TYPE_DECIMAL};
        }

        public /* synthetic */ KeyboardTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<KeyboardTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class KEYBOARD_TYPE_UNSPECIFIED extends KeyboardTypeDto {
            KEYBOARD_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.KeyboardType toProto() {
                return TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED;
            }
        }

        private KeyboardTypeDto(String str, int i) {
        }

        static {
            KeyboardTypeDto[] keyboardTypeDtoArr$values = $values();
            $VALUES = keyboardTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(keyboardTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$KeyboardTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.KeyboardTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_NATIVE", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class KEYBOARD_TYPE_NATIVE extends KeyboardTypeDto {
            KEYBOARD_TYPE_NATIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.KeyboardType toProto() {
                return TextInput.KeyboardType.KEYBOARD_TYPE_NATIVE;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_EMAIL", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class KEYBOARD_TYPE_EMAIL extends KeyboardTypeDto {
            KEYBOARD_TYPE_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.KeyboardType toProto() {
                return TextInput.KeyboardType.KEYBOARD_TYPE_EMAIL;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_DECIMAL", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class KEYBOARD_TYPE_DECIMAL extends KeyboardTypeDto {
            KEYBOARD_TYPE_DECIMAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.KeyboardType toProto() {
                return TextInput.KeyboardType.KEYBOARD_TYPE_DECIMAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<KeyboardTypeDto, TextInput.KeyboardType> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.KeyboardType.values().length];
                    try {
                        iArr[TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.KeyboardType.KEYBOARD_TYPE_NATIVE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.KeyboardType.KEYBOARD_TYPE_EMAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TextInput.KeyboardType.KEYBOARD_TYPE_DECIMAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<KeyboardTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<KeyboardTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<KeyboardTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) KeyboardTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.KeyboardType> getProtoAdapter() {
                return TextInput.KeyboardType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public KeyboardTypeDto getZeroValue() {
                return KeyboardTypeDto.KEYBOARD_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public KeyboardTypeDto fromProto(TextInput.KeyboardType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return KeyboardTypeDto.KEYBOARD_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return KeyboardTypeDto.KEYBOARD_TYPE_NATIVE;
                }
                if (i == 3) {
                    return KeyboardTypeDto.KEYBOARD_TYPE_EMAIL;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return KeyboardTypeDto.KEYBOARD_TYPE_DECIMAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$KeyboardTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<KeyboardTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<KeyboardTypeDto, TextInput.KeyboardType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.KeyboardType", KeyboardTypeDto.getEntries(), KeyboardTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public KeyboardTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (KeyboardTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, KeyboardTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static KeyboardTypeDto valueOf(String str) {
            return (KeyboardTypeDto) Enum.valueOf(KeyboardTypeDto.class, str);
        }

        public static KeyboardTypeDto[] values() {
            return (KeyboardTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO_CORRECTION_TYPE_UNSPECIFIED", "AUTO_CORRECTION_TYPE_DEFAULT", "AUTO_CORRECTION_TYPE_NO", "AUTO_CORRECTION_TYPE_YES", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AutoCorrectionTypeDto implements Dto2<TextInput.AutoCorrectionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AutoCorrectionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AutoCorrectionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AutoCorrectionTypeDto, TextInput.AutoCorrectionType>> binaryBase64Serializer$delegate;
        public static final AutoCorrectionTypeDto AUTO_CORRECTION_TYPE_UNSPECIFIED = new AUTO_CORRECTION_TYPE_UNSPECIFIED("AUTO_CORRECTION_TYPE_UNSPECIFIED", 0);
        public static final AutoCorrectionTypeDto AUTO_CORRECTION_TYPE_DEFAULT = new AUTO_CORRECTION_TYPE_DEFAULT("AUTO_CORRECTION_TYPE_DEFAULT", 1);
        public static final AutoCorrectionTypeDto AUTO_CORRECTION_TYPE_NO = new AUTO_CORRECTION_TYPE_NO("AUTO_CORRECTION_TYPE_NO", 2);
        public static final AutoCorrectionTypeDto AUTO_CORRECTION_TYPE_YES = new AUTO_CORRECTION_TYPE_YES("AUTO_CORRECTION_TYPE_YES", 3);

        private static final /* synthetic */ AutoCorrectionTypeDto[] $values() {
            return new AutoCorrectionTypeDto[]{AUTO_CORRECTION_TYPE_UNSPECIFIED, AUTO_CORRECTION_TYPE_DEFAULT, AUTO_CORRECTION_TYPE_NO, AUTO_CORRECTION_TYPE_YES};
        }

        public /* synthetic */ AutoCorrectionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AutoCorrectionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CORRECTION_TYPE_UNSPECIFIED extends AutoCorrectionTypeDto {
            AUTO_CORRECTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCorrectionType toProto() {
                return TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED;
            }
        }

        private AutoCorrectionTypeDto(String str, int i) {
        }

        static {
            AutoCorrectionTypeDto[] autoCorrectionTypeDtoArr$values = $values();
            $VALUES = autoCorrectionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(autoCorrectionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$AutoCorrectionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.AutoCorrectionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_DEFAULT", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CORRECTION_TYPE_DEFAULT extends AutoCorrectionTypeDto {
            AUTO_CORRECTION_TYPE_DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCorrectionType toProto() {
                return TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_DEFAULT;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_NO", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CORRECTION_TYPE_NO extends AutoCorrectionTypeDto {
            AUTO_CORRECTION_TYPE_NO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCorrectionType toProto() {
                return TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_NO;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_YES", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CORRECTION_TYPE_YES extends AutoCorrectionTypeDto {
            AUTO_CORRECTION_TYPE_YES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCorrectionType toProto() {
                return TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_YES;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AutoCorrectionTypeDto, TextInput.AutoCorrectionType> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.AutoCorrectionType.values().length];
                    try {
                        iArr[TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_NO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_YES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AutoCorrectionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AutoCorrectionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AutoCorrectionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AutoCorrectionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.AutoCorrectionType> getProtoAdapter() {
                return TextInput.AutoCorrectionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AutoCorrectionTypeDto getZeroValue() {
                return AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AutoCorrectionTypeDto fromProto(TextInput.AutoCorrectionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_DEFAULT;
                }
                if (i == 3) {
                    return AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_NO;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AutoCorrectionTypeDto.AUTO_CORRECTION_TYPE_YES;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$AutoCorrectionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<AutoCorrectionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AutoCorrectionTypeDto, TextInput.AutoCorrectionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.AutoCorrectionType", AutoCorrectionTypeDto.getEntries(), AutoCorrectionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AutoCorrectionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AutoCorrectionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AutoCorrectionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AutoCorrectionTypeDto valueOf(String str) {
            return (AutoCorrectionTypeDto) Enum.valueOf(AutoCorrectionTypeDto.class, str);
        }

        public static AutoCorrectionTypeDto[] values() {
            return (AutoCorrectionTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO_CAPITALIZATION_TYPE_UNSPECIFIED", "AUTO_CAPITALIZATION_TYPE_NONE", "AUTO_CAPITALIZATION_TYPE_WORDS", "AUTO_CAPITALIZATION_TYPE_SENTENCES", "AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AutoCapitalizationTypeDto implements Dto2<TextInput.AutoCapitalizationType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AutoCapitalizationTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AutoCapitalizationTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AutoCapitalizationTypeDto, TextInput.AutoCapitalizationType>> binaryBase64Serializer$delegate;
        public static final AutoCapitalizationTypeDto AUTO_CAPITALIZATION_TYPE_UNSPECIFIED = new AUTO_CAPITALIZATION_TYPE_UNSPECIFIED("AUTO_CAPITALIZATION_TYPE_UNSPECIFIED", 0);
        public static final AutoCapitalizationTypeDto AUTO_CAPITALIZATION_TYPE_NONE = new AUTO_CAPITALIZATION_TYPE_NONE("AUTO_CAPITALIZATION_TYPE_NONE", 1);
        public static final AutoCapitalizationTypeDto AUTO_CAPITALIZATION_TYPE_WORDS = new AUTO_CAPITALIZATION_TYPE_WORDS("AUTO_CAPITALIZATION_TYPE_WORDS", 2);
        public static final AutoCapitalizationTypeDto AUTO_CAPITALIZATION_TYPE_SENTENCES = new AUTO_CAPITALIZATION_TYPE_SENTENCES("AUTO_CAPITALIZATION_TYPE_SENTENCES", 3);
        public static final AutoCapitalizationTypeDto AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS = new AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS("AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS", 4);

        private static final /* synthetic */ AutoCapitalizationTypeDto[] $values() {
            return new AutoCapitalizationTypeDto[]{AUTO_CAPITALIZATION_TYPE_UNSPECIFIED, AUTO_CAPITALIZATION_TYPE_NONE, AUTO_CAPITALIZATION_TYPE_WORDS, AUTO_CAPITALIZATION_TYPE_SENTENCES, AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS};
        }

        public /* synthetic */ AutoCapitalizationTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AutoCapitalizationTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AutoCapitalizationTypeDto(String str, int i) {
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CAPITALIZATION_TYPE_UNSPECIFIED extends AutoCapitalizationTypeDto {
            AUTO_CAPITALIZATION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCapitalizationType toProto() {
                return TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
            }
        }

        static {
            AutoCapitalizationTypeDto[] autoCapitalizationTypeDtoArr$values = $values();
            $VALUES = autoCapitalizationTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(autoCapitalizationTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextInputDto$AutoCapitalizationTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextInputDto.AutoCapitalizationTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_NONE", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CAPITALIZATION_TYPE_NONE extends AutoCapitalizationTypeDto {
            AUTO_CAPITALIZATION_TYPE_NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCapitalizationType toProto() {
                return TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_NONE;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_WORDS", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CAPITALIZATION_TYPE_WORDS extends AutoCapitalizationTypeDto {
            AUTO_CAPITALIZATION_TYPE_WORDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCapitalizationType toProto() {
                return TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_WORDS;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_SENTENCES", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CAPITALIZATION_TYPE_SENTENCES extends AutoCapitalizationTypeDto {
            AUTO_CAPITALIZATION_TYPE_SENTENCES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCapitalizationType toProto() {
                return TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_SENTENCES;
            }
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TextInputDto.AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "toProto", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS extends AutoCapitalizationTypeDto {
            AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TextInput.AutoCapitalizationType toProto() {
                return TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AutoCapitalizationTypeDto, TextInput.AutoCapitalizationType> {

            /* compiled from: TextInputDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextInput.AutoCapitalizationType.values().length];
                    try {
                        iArr[TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_WORDS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_SENTENCES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS.ordinal()] = 5;
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

            public final KSerializer<AutoCapitalizationTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AutoCapitalizationTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AutoCapitalizationTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AutoCapitalizationTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TextInput.AutoCapitalizationType> getProtoAdapter() {
                return TextInput.AutoCapitalizationType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AutoCapitalizationTypeDto getZeroValue() {
                return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AutoCapitalizationTypeDto fromProto(TextInput.AutoCapitalizationType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_NONE;
                }
                if (i == 3) {
                    return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_WORDS;
                }
                if (i == 4) {
                    return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_SENTENCES;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return AutoCapitalizationTypeDto.AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TextInputDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto$AutoCapitalizationTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<AutoCapitalizationTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AutoCapitalizationTypeDto, TextInput.AutoCapitalizationType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextInput.AutoCapitalizationType", AutoCapitalizationTypeDto.getEntries(), AutoCapitalizationTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AutoCapitalizationTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AutoCapitalizationTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AutoCapitalizationTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AutoCapitalizationTypeDto valueOf(String str) {
            return (AutoCapitalizationTypeDto) Enum.valueOf(AutoCapitalizationTypeDto.class, str);
        }

        public static AutoCapitalizationTypeDto[] values() {
            return (AutoCapitalizationTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextInputDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextInputDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TextInputDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TextInput", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TextInputDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TextInputDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TextInputDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TextInputDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInputDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TextInputDto";
        }
    }
}
