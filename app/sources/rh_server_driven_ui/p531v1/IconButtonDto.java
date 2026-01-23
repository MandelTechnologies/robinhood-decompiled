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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonStateDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.IconButton;
import rh_server_driven_ui.p531v1.IconButtonDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IconButtonDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005;:<=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b9\u00108¨\u0006?"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/IconButton;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ButtonTypeDto;", "type", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "size", "Lrh_server_driven_ui/v1/ActionDto;", "action", "Lrh_server_driven_ui/v1/ButtonStateDto;", "state", "", "logging_identifier", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "foreground_color", "(Lrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ButtonStateDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Lrh_server_driven_ui/v1/IconButton;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;", "getType", "()Lrh_server_driven_ui/v1/ButtonTypeDto;", "getSize", "()Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getState", "()Lrh_server_driven_ui/v1/ButtonStateDto;", "getLogging_identifier", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getForeground_color", "Companion", "Surrogate", "SizeDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class IconButtonDto implements Dto3<IconButton>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IconButtonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IconButtonDto, IconButton>> binaryBase64Serializer$delegate;
    private static final IconButtonDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IconButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IconButtonDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ButtonTypeDto getType() {
        return this.surrogate.getType();
    }

    public final SizeDto getSize() {
        return this.surrogate.getSize();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final ButtonStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final ThemedColorDto getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final ThemedColorDto getForeground_color() {
        return this.surrogate.getForeground_color();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IconButtonDto(rh_server_driven_ui.p531v1.ButtonTypeDto r2, rh_server_driven_ui.v1.IconButtonDto.SizeDto r3, rh_server_driven_ui.p531v1.ActionDto r4, rh_server_driven_ui.p531v1.ButtonStateDto r5, java.lang.String r6, rh_server_driven_ui.p531v1.IconDto r7, rh_server_driven_ui.p531v1.ThemedColorDto r8, rh_server_driven_ui.p531v1.ThemedColorDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            rh_server_driven_ui.v1.ButtonTypeDto$Companion r2 = rh_server_driven_ui.p531v1.ButtonTypeDto.INSTANCE
            rh_server_driven_ui.v1.ButtonTypeDto r2 = r2.getZeroValue()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L14
            rh_server_driven_ui.v1.IconButtonDto$SizeDto$Companion r3 = rh_server_driven_ui.v1.IconButtonDto.SizeDto.INSTANCE
            rh_server_driven_ui.v1.IconButtonDto$SizeDto r3 = r3.getZeroValue()
        L14:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L1a
            r4 = r0
        L1a:
            r11 = r10 & 8
            if (r11 == 0) goto L24
            rh_server_driven_ui.v1.ButtonStateDto$Companion r5 = rh_server_driven_ui.p531v1.ButtonStateDto.INSTANCE
            rh_server_driven_ui.v1.ButtonStateDto r5 = r5.getZeroValue()
        L24:
            r11 = r10 & 16
            if (r11 == 0) goto L29
            r6 = r0
        L29:
            r11 = r10 & 32
            if (r11 == 0) goto L33
            rh_server_driven_ui.v1.IconDto$Companion r7 = rh_server_driven_ui.p531v1.IconDto.INSTANCE
            rh_server_driven_ui.v1.IconDto r7 = r7.getZeroValue()
        L33:
            r11 = r10 & 64
            if (r11 == 0) goto L38
            r8 = r0
        L38:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L46
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4f
        L46:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.IconButtonDto.<init>(rh_server_driven_ui.v1.ButtonTypeDto, rh_server_driven_ui.v1.IconButtonDto$SizeDto, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.ButtonStateDto, java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonDto(ButtonTypeDto type2, SizeDto size, ActionDto actionDto, ButtonStateDto state, String str, IconDto icon, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2) {
        this(new Surrogate(type2, size, actionDto, state, str, icon, themedColorDto, themedColorDto2));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IconButton toProto() {
        ButtonType buttonType = (ButtonType) this.surrogate.getType().toProto();
        IconButton.Size size = (IconButton.Size) this.surrogate.getSize().toProto();
        ActionDto action = this.surrogate.getAction();
        Action proto = action != null ? action.toProto() : null;
        ButtonState buttonState = (ButtonState) this.surrogate.getState().toProto();
        String logging_identifier = this.surrogate.getLogging_identifier();
        Icon icon = (Icon) this.surrogate.getIcon().toProto();
        ThemedColorDto background_color = this.surrogate.getBackground_color();
        ThemedColor proto2 = background_color != null ? background_color.toProto() : null;
        ThemedColorDto foreground_color = this.surrogate.getForeground_color();
        return new IconButton(buttonType, size, proto, buttonState, logging_identifier, icon, proto2, foreground_color != null ? foreground_color.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[IconButtonDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IconButtonDto) && Intrinsics.areEqual(((IconButtonDto) other).surrogate, this.surrogate);
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
    /* compiled from: IconButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b<\u0010-\u001a\u0004\b;\u0010\"R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u0010-\u001a\u0004\bB\u0010CR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bF\u0010-\u001a\u0004\bE\u0010C¨\u0006I"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ButtonTypeDto;", "type", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "size", "Lrh_server_driven_ui/v1/ActionDto;", "action", "Lrh_server_driven_ui/v1/ButtonStateDto;", "state", "", "logging_identifier", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "foreground_color", "<init>", "(Lrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ButtonStateDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ButtonTypeDto;Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ButtonStateDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ButtonTypeDto;", "getType", "()Lrh_server_driven_ui/v1/ButtonTypeDto;", "getType$annotations", "()V", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "getSize", "()Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "getSize$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "Lrh_server_driven_ui/v1/ButtonStateDto;", "getState", "()Lrh_server_driven_ui/v1/ButtonStateDto;", "getState$annotations", "Ljava/lang/String;", "getLogging_identifier", "getLogging_identifier$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "getForeground_color", "getForeground_color$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final ThemedColorDto background_color;
        private final ThemedColorDto foreground_color;
        private final IconDto icon;
        private final String logging_identifier;
        private final SizeDto size;
        private final ButtonStateDto state;
        private final ButtonTypeDto type;

        public Surrogate() {
            this((ButtonTypeDto) null, (SizeDto) null, (ActionDto) null, (ButtonStateDto) null, (String) null, (IconDto) null, (ThemedColorDto) null, (ThemedColorDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && this.size == surrogate.size && Intrinsics.areEqual(this.action, surrogate.action) && this.state == surrogate.state && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && this.icon == surrogate.icon && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.foreground_color, surrogate.foreground_color);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.size.hashCode()) * 31;
            ActionDto actionDto = this.action;
            int iHashCode2 = (((iHashCode + (actionDto == null ? 0 : actionDto.hashCode())) * 31) + this.state.hashCode()) * 31;
            String str = this.logging_identifier;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.icon.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.background_color;
            int iHashCode4 = (iHashCode3 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.foreground_color;
            return iHashCode4 + (themedColorDto2 != null ? themedColorDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", size=" + this.size + ", action=" + this.action + ", state=" + this.state + ", logging_identifier=" + this.logging_identifier + ", icon=" + this.icon + ", background_color=" + this.background_color + ", foreground_color=" + this.foreground_color + ")";
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IconButtonDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ButtonTypeDto buttonTypeDto, SizeDto sizeDto, ActionDto actionDto, ButtonStateDto buttonStateDto, String str, IconDto iconDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? ButtonTypeDto.INSTANCE.getZeroValue() : buttonTypeDto;
            if ((i & 2) == 0) {
                this.size = SizeDto.INSTANCE.getZeroValue();
            } else {
                this.size = sizeDto;
            }
            if ((i & 4) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
            if ((i & 8) == 0) {
                this.state = ButtonStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = buttonStateDto;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str;
            }
            if ((i & 32) == 0) {
                this.icon = IconDto.INSTANCE.getZeroValue();
            } else {
                this.icon = iconDto;
            }
            if ((i & 64) == 0) {
                this.background_color = null;
            } else {
                this.background_color = themedColorDto;
            }
            if ((i & 128) == 0) {
                this.foreground_color = null;
            } else {
                this.foreground_color = themedColorDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != ButtonTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ButtonTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.size != SizeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SizeDto.Serializer.INSTANCE, self.size);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, actionDto);
            }
            if (self.state != ButtonStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ButtonStateDto.Serializer.INSTANCE, self.state);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, IconDto.Serializer.INSTANCE, self.icon);
            }
            ThemedColorDto themedColorDto = self.background_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.foreground_color;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
        }

        public Surrogate(ButtonTypeDto type2, SizeDto size, ActionDto actionDto, ButtonStateDto state, String str, IconDto icon, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.type = type2;
            this.size = size;
            this.action = actionDto;
            this.state = state;
            this.logging_identifier = str;
            this.icon = icon;
            this.background_color = themedColorDto;
            this.foreground_color = themedColorDto2;
        }

        public final ButtonTypeDto getType() {
            return this.type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(rh_server_driven_ui.p531v1.ButtonTypeDto r2, rh_server_driven_ui.v1.IconButtonDto.SizeDto r3, rh_server_driven_ui.p531v1.ActionDto r4, rh_server_driven_ui.p531v1.ButtonStateDto r5, java.lang.String r6, rh_server_driven_ui.p531v1.IconDto r7, rh_server_driven_ui.p531v1.ThemedColorDto r8, rh_server_driven_ui.p531v1.ThemedColorDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                rh_server_driven_ui.v1.ButtonTypeDto$Companion r2 = rh_server_driven_ui.p531v1.ButtonTypeDto.INSTANCE
                rh_server_driven_ui.v1.ButtonTypeDto r2 = r2.getZeroValue()
            La:
                r11 = r10 & 2
                if (r11 == 0) goto L14
                rh_server_driven_ui.v1.IconButtonDto$SizeDto$Companion r3 = rh_server_driven_ui.v1.IconButtonDto.SizeDto.INSTANCE
                rh_server_driven_ui.v1.IconButtonDto$SizeDto r3 = r3.getZeroValue()
            L14:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L1a
                r4 = r0
            L1a:
                r11 = r10 & 8
                if (r11 == 0) goto L24
                rh_server_driven_ui.v1.ButtonStateDto$Companion r5 = rh_server_driven_ui.p531v1.ButtonStateDto.INSTANCE
                rh_server_driven_ui.v1.ButtonStateDto r5 = r5.getZeroValue()
            L24:
                r11 = r10 & 16
                if (r11 == 0) goto L29
                r6 = r0
            L29:
                r11 = r10 & 32
                if (r11 == 0) goto L33
                rh_server_driven_ui.v1.IconDto$Companion r7 = rh_server_driven_ui.p531v1.IconDto.INSTANCE
                rh_server_driven_ui.v1.IconDto r7 = r7.getZeroValue()
            L33:
                r11 = r10 & 64
                if (r11 == 0) goto L38
                r8 = r0
            L38:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L46
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4f
            L46:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.IconButtonDto.Surrogate.<init>(rh_server_driven_ui.v1.ButtonTypeDto, rh_server_driven_ui.v1.IconButtonDto$SizeDto, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.ButtonStateDto, java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SizeDto getSize() {
            return this.size;
        }

        public final ActionDto getAction() {
            return this.action;
        }

        public final ButtonStateDto getState() {
            return this.state;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final ThemedColorDto getBackground_color() {
            return this.background_color;
        }

        public final ThemedColorDto getForeground_color() {
            return this.foreground_color;
        }
    }

    /* compiled from: IconButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/IconButtonDto;", "Lrh_server_driven_ui/v1/IconButton;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/IconButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IconButtonDto, IconButton> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconButtonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconButtonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconButtonDto> getBinaryBase64Serializer() {
            return (KSerializer) IconButtonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IconButton> getProtoAdapter() {
            return IconButton.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconButtonDto getZeroValue() {
            return IconButtonDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconButtonDto fromProto(IconButton proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ButtonTypeDto buttonTypeDtoFromProto = ButtonTypeDto.INSTANCE.fromProto(proto.getType());
            SizeDto sizeDtoFromProto = SizeDto.INSTANCE.fromProto(proto.getSize());
            Action action = proto.getAction();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
            ButtonStateDto buttonStateDtoFromProto = ButtonStateDto.INSTANCE.fromProto(proto.getState());
            String logging_identifier = proto.getLogging_identifier();
            IconDto iconDtoFromProto = IconDto.INSTANCE.fromProto(proto.getIcon());
            ThemedColor background_color = proto.getBackground_color();
            ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
            ThemedColor foreground_color = proto.getForeground_color();
            return new IconButtonDto(new Surrogate(buttonTypeDtoFromProto, sizeDtoFromProto, actionDtoFromProto, buttonStateDtoFromProto, logging_identifier, iconDtoFromProto, themedColorDtoFromProto, foreground_color != null ? ThemedColorDto.INSTANCE.fromProto(foreground_color) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.IconButtonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IconButtonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IconButtonDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IconButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/IconButton$Size;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_UNSPECIFIED", "SIZE_TINY", "SIZE_SMALL", "SIZE_MEDIUM", "SIZE_LARGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SizeDto implements Dto2<IconButton.Size>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SizeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SizeDto, IconButton.Size>> binaryBase64Serializer$delegate;
        public static final SizeDto SIZE_UNSPECIFIED = new SIZE_UNSPECIFIED("SIZE_UNSPECIFIED", 0);
        public static final SizeDto SIZE_TINY = new SIZE_TINY("SIZE_TINY", 1);
        public static final SizeDto SIZE_SMALL = new SIZE_SMALL("SIZE_SMALL", 2);
        public static final SizeDto SIZE_MEDIUM = new SIZE_MEDIUM("SIZE_MEDIUM", 3);
        public static final SizeDto SIZE_LARGE = new SIZE_LARGE("SIZE_LARGE", 4);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{SIZE_UNSPECIFIED, SIZE_TINY, SIZE_SMALL, SIZE_MEDIUM, SIZE_LARGE};
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

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/IconButtonDto.SizeDto.SIZE_UNSPECIFIED", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/IconButton$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_UNSPECIFIED extends SizeDto {
            SIZE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IconButton.Size toProto() {
                return IconButton.Size.SIZE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.IconButtonDto$SizeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IconButtonDto.SizeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/IconButtonDto.SizeDto.SIZE_TINY", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/IconButton$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_TINY extends SizeDto {
            SIZE_TINY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IconButton.Size toProto() {
                return IconButton.Size.SIZE_TINY;
            }
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/IconButtonDto.SizeDto.SIZE_SMALL", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/IconButton$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_SMALL extends SizeDto {
            SIZE_SMALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IconButton.Size toProto() {
                return IconButton.Size.SIZE_SMALL;
            }
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/IconButtonDto.SizeDto.SIZE_MEDIUM", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/IconButton$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_MEDIUM extends SizeDto {
            SIZE_MEDIUM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IconButton.Size toProto() {
                return IconButton.Size.SIZE_MEDIUM;
            }
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/IconButtonDto.SizeDto.SIZE_LARGE", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "toProto", "Lrh_server_driven_ui/v1/IconButton$Size;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIZE_LARGE extends SizeDto {
            SIZE_LARGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IconButton.Size toProto() {
                return IconButton.Size.SIZE_LARGE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$SizeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "Lrh_server_driven_ui/v1/IconButton$Size;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SizeDto, IconButton.Size> {

            /* compiled from: IconButtonDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IconButton.Size.values().length];
                    try {
                        iArr[IconButton.Size.SIZE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IconButton.Size.SIZE_TINY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[IconButton.Size.SIZE_SMALL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[IconButton.Size.SIZE_MEDIUM.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[IconButton.Size.SIZE_LARGE.ordinal()] = 5;
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
            public ProtoAdapter<IconButton.Size> getProtoAdapter() {
                return IconButton.Size.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto getZeroValue() {
                return SizeDto.SIZE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SizeDto fromProto(IconButton.Size proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SizeDto.SIZE_UNSPECIFIED;
                }
                if (i == 2) {
                    return SizeDto.SIZE_TINY;
                }
                if (i == 3) {
                    return SizeDto.SIZE_SMALL;
                }
                if (i == 4) {
                    return SizeDto.SIZE_MEDIUM;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return SizeDto.SIZE_LARGE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: IconButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$SizeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<SizeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SizeDto, IconButton.Size> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.IconButton.Size", SizeDto.getEntries(), SizeDto.INSTANCE.getZeroValue());

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

    /* compiled from: IconButtonDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconButtonDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/IconButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<IconButtonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.IconButton", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IconButtonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IconButtonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IconButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IconButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.IconButtonDto";
        }
    }
}
