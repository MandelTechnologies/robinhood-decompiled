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
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.InfoTag;
import rh_server_driven_ui.p531v1.InfoTagDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: InfoTagDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000565789B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006:"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/InfoTag;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;)V", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "type", "logging_identifier", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color_override", "text_color_override", "", "prefers_icon_on_right", "Lrh_server_driven_ui/v1/ActionDto;", "action", "(Ljava/lang/String;Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZLrh_server_driven_ui/v1/ActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/InfoTag;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;", "getLabel", "getType", "()Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "getLogging_identifier", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getBackground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getText_color_override", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "Companion", "Surrogate", "TypeDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class InfoTagDto implements Dto3<InfoTag>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InfoTagDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InfoTagDto, InfoTag>> binaryBase64Serializer$delegate;
    private static final InfoTagDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InfoTagDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InfoTagDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final TypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final ThemedColorDto getBackground_color_override() {
        return this.surrogate.getBackground_color_override();
    }

    public final ThemedColorDto getText_color_override() {
        return this.surrogate.getText_color_override();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InfoTagDto(java.lang.String r2, rh_server_driven_ui.v1.InfoTagDto.TypeDto r3, java.lang.String r4, rh_server_driven_ui.p531v1.IconDto r5, rh_server_driven_ui.p531v1.ThemedColorDto r6, rh_server_driven_ui.p531v1.ThemedColorDto r7, boolean r8, rh_server_driven_ui.p531v1.ActionDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            rh_server_driven_ui.v1.InfoTagDto$TypeDto$Companion r3 = rh_server_driven_ui.v1.InfoTagDto.TypeDto.INSTANCE
            rh_server_driven_ui.v1.InfoTagDto$TypeDto r3 = r3.getZeroValue()
        L10:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L16
            r4 = r0
        L16:
            r11 = r10 & 8
            if (r11 == 0) goto L1b
            r5 = r0
        L1b:
            r11 = r10 & 16
            if (r11 == 0) goto L20
            r6 = r0
        L20:
            r11 = r10 & 32
            if (r11 == 0) goto L25
            r7 = r0
        L25:
            r11 = r10 & 64
            if (r11 == 0) goto L2a
            r8 = 0
        L2a:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L38
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L41
        L38:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L41:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.InfoTagDto.<init>(java.lang.String, rh_server_driven_ui.v1.InfoTagDto$TypeDto, java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, boolean, rh_server_driven_ui.v1.ActionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoTagDto(String label, TypeDto type2, String str, IconDto iconDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, ActionDto actionDto) {
        this(new Surrogate(label, type2, str, iconDto, themedColorDto, themedColorDto2, z, actionDto));
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InfoTag toProto() {
        String label = this.surrogate.getLabel();
        InfoTag.Type type2 = (InfoTag.Type) this.surrogate.getType().toProto();
        String logging_identifier = this.surrogate.getLogging_identifier();
        IconDto icon = this.surrogate.getIcon();
        Icon icon2 = icon != null ? (Icon) icon.toProto() : null;
        ThemedColorDto background_color_override = this.surrogate.getBackground_color_override();
        ThemedColor proto = background_color_override != null ? background_color_override.toProto() : null;
        ThemedColorDto text_color_override = this.surrogate.getText_color_override();
        ThemedColor proto2 = text_color_override != null ? text_color_override.toProto() : null;
        boolean prefers_icon_on_right = this.surrogate.getPrefers_icon_on_right();
        ActionDto action = this.surrogate.getAction();
        return new InfoTag(label, type2, logging_identifier, icon2, proto, proto2, prefers_icon_on_right, action != null ? action.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[InfoTagDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InfoTagDto) && Intrinsics.areEqual(((InfoTagDto) other).surrogate, this.surrogate);
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
    /* compiled from: InfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCBa\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bi\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b8\u0010*\u001a\u0004\b6\u00107R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b:\u0010*\u001a\u0004\b9\u00107R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\b>\u0010*\u001a\u0004\b<\u0010=R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010?\u0012\u0004\bB\u0010*\u001a\u0004\b@\u0010A¨\u0006E"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;", "", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "type", "logging_identifier", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color_override", "text_color_override", "", "prefers_icon_on_right", "Lrh_server_driven_ui/v1/ActionDto;", "action", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZLrh_server_driven_ui/v1/ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZLrh_server_driven_ui/v1/ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "getType", "()Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "getType$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color_override$annotations", "getText_color_override", "getText_color_override$annotations", "Z", "getPrefers_icon_on_right", "()Z", "getPrefers_icon_on_right$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final ThemedColorDto background_color_override;
        private final IconDto icon;
        private final String label;
        private final String logging_identifier;
        private final boolean prefers_icon_on_right;
        private final ThemedColorDto text_color_override;
        private final TypeDto type;

        public Surrogate() {
            this((String) null, (TypeDto) null, (String) null, (IconDto) null, (ThemedColorDto) null, (ThemedColorDto) null, false, (ActionDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.label, surrogate.label) && this.type == surrogate.type && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && this.icon == surrogate.icon && Intrinsics.areEqual(this.background_color_override, surrogate.background_color_override) && Intrinsics.areEqual(this.text_color_override, surrogate.text_color_override) && this.prefers_icon_on_right == surrogate.prefers_icon_on_right && Intrinsics.areEqual(this.action, surrogate.action);
        }

        public int hashCode() {
            int iHashCode = ((this.label.hashCode() * 31) + this.type.hashCode()) * 31;
            String str = this.logging_identifier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            IconDto iconDto = this.icon;
            int iHashCode3 = (iHashCode2 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            ThemedColorDto themedColorDto = this.background_color_override;
            int iHashCode4 = (iHashCode3 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.text_color_override;
            int iHashCode5 = (((iHashCode4 + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31) + Boolean.hashCode(this.prefers_icon_on_right)) * 31;
            ActionDto actionDto = this.action;
            return iHashCode5 + (actionDto != null ? actionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(label=" + this.label + ", type=" + this.type + ", logging_identifier=" + this.logging_identifier + ", icon=" + this.icon + ", background_color_override=" + this.background_color_override + ", text_color_override=" + this.text_color_override + ", prefers_icon_on_right=" + this.prefers_icon_on_right + ", action=" + this.action + ")";
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InfoTagDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TypeDto typeDto, String str2, IconDto iconDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.label = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 4) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str2;
            }
            if ((i & 8) == 0) {
                this.icon = null;
            } else {
                this.icon = iconDto;
            }
            if ((i & 16) == 0) {
                this.background_color_override = null;
            } else {
                this.background_color_override = themedColorDto;
            }
            if ((i & 32) == 0) {
                this.text_color_override = null;
            } else {
                this.text_color_override = themedColorDto2;
            }
            if ((i & 64) == 0) {
                this.prefers_icon_on_right = false;
            } else {
                this.prefers_icon_on_right = z;
            }
            if ((i & 128) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 0, self.label);
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TypeDto.Serializer.INSTANCE, self.type);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            IconDto iconDto = self.icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IconDto.Serializer.INSTANCE, iconDto);
            }
            ThemedColorDto themedColorDto = self.background_color_override;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.text_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            boolean z = self.prefers_icon_on_right;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ActionDto.Serializer.INSTANCE, actionDto);
            }
        }

        public Surrogate(String label, TypeDto type2, String str, IconDto iconDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, ActionDto actionDto) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.label = label;
            this.type = type2;
            this.logging_identifier = str;
            this.icon = iconDto;
            this.background_color_override = themedColorDto;
            this.text_color_override = themedColorDto2;
            this.prefers_icon_on_right = z;
            this.action = actionDto;
        }

        public final String getLabel() {
            return this.label;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, rh_server_driven_ui.v1.InfoTagDto.TypeDto r3, java.lang.String r4, rh_server_driven_ui.p531v1.IconDto r5, rh_server_driven_ui.p531v1.ThemedColorDto r6, rh_server_driven_ui.p531v1.ThemedColorDto r7, boolean r8, rh_server_driven_ui.p531v1.ActionDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r11 = r10 & 2
                if (r11 == 0) goto L10
                rh_server_driven_ui.v1.InfoTagDto$TypeDto$Companion r3 = rh_server_driven_ui.v1.InfoTagDto.TypeDto.INSTANCE
                rh_server_driven_ui.v1.InfoTagDto$TypeDto r3 = r3.getZeroValue()
            L10:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L16
                r4 = r0
            L16:
                r11 = r10 & 8
                if (r11 == 0) goto L1b
                r5 = r0
            L1b:
                r11 = r10 & 16
                if (r11 == 0) goto L20
                r6 = r0
            L20:
                r11 = r10 & 32
                if (r11 == 0) goto L25
                r7 = r0
            L25:
                r11 = r10 & 64
                if (r11 == 0) goto L2a
                r8 = 0
            L2a:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L38
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L41
            L38:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L41:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.InfoTagDto.Surrogate.<init>(java.lang.String, rh_server_driven_ui.v1.InfoTagDto$TypeDto, java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.ThemedColorDto, rh_server_driven_ui.v1.ThemedColorDto, boolean, rh_server_driven_ui.v1.ActionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final ThemedColorDto getBackground_color_override() {
            return this.background_color_override;
        }

        public final ThemedColorDto getText_color_override() {
            return this.text_color_override;
        }

        public final boolean getPrefers_icon_on_right() {
            return this.prefers_icon_on_right;
        }

        public final ActionDto getAction() {
            return this.action;
        }
    }

    /* compiled from: InfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/InfoTagDto;", "Lrh_server_driven_ui/v1/InfoTag;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/InfoTagDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InfoTagDto, InfoTag> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InfoTagDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InfoTagDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InfoTagDto> getBinaryBase64Serializer() {
            return (KSerializer) InfoTagDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InfoTag> getProtoAdapter() {
            return InfoTag.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InfoTagDto getZeroValue() {
            return InfoTagDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InfoTagDto fromProto(InfoTag proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String label = proto.getLabel();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getType());
            String logging_identifier = proto.getLogging_identifier();
            Icon icon = proto.getIcon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDto iconDtoFromProto = icon != null ? IconDto.INSTANCE.fromProto(icon) : null;
            ThemedColor background_color_override = proto.getBackground_color_override();
            ThemedColorDto themedColorDtoFromProto = background_color_override != null ? ThemedColorDto.INSTANCE.fromProto(background_color_override) : null;
            ThemedColor text_color_override = proto.getText_color_override();
            ThemedColorDto themedColorDtoFromProto2 = text_color_override != null ? ThemedColorDto.INSTANCE.fromProto(text_color_override) : null;
            boolean prefers_icon_on_right = proto.getPrefers_icon_on_right();
            Action action = proto.getAction();
            return new InfoTagDto(new Surrogate(label, typeDtoFromProto, logging_identifier, iconDtoFromProto, themedColorDtoFromProto, themedColorDtoFromProto2, prefers_icon_on_right, action != null ? ActionDto.INSTANCE.fromProto(action) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.InfoTagDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InfoTagDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InfoTagDto(null, null, null, null, null, null, false, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/InfoTag$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "TYPE_ALERT", "TYPE_INFORM", "TYPE_INLINE", "TYPE_GOLD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<InfoTag.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, InfoTag.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto TYPE_ALERT = new TYPE_ALERT("TYPE_ALERT", 1);
        public static final TypeDto TYPE_INFORM = new TYPE_INFORM("TYPE_INFORM", 2);
        public static final TypeDto TYPE_INLINE = new TYPE_INLINE("TYPE_INLINE", 3);
        public static final TypeDto TYPE_GOLD = new TYPE_GOLD("TYPE_GOLD", 4);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, TYPE_ALERT, TYPE_INFORM, TYPE_INLINE, TYPE_GOLD};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/InfoTagDto.TypeDto.TYPE_UNSPECIFIED", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "toProto", "Lrh_server_driven_ui/v1/InfoTag$Type;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InfoTag.Type toProto() {
                return InfoTag.Type.TYPE_UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.InfoTagDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InfoTagDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/InfoTagDto.TypeDto.TYPE_ALERT", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "toProto", "Lrh_server_driven_ui/v1/InfoTag$Type;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_ALERT extends TypeDto {
            TYPE_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InfoTag.Type toProto() {
                return InfoTag.Type.TYPE_ALERT;
            }
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/InfoTagDto.TypeDto.TYPE_INFORM", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "toProto", "Lrh_server_driven_ui/v1/InfoTag$Type;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_INFORM extends TypeDto {
            TYPE_INFORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InfoTag.Type toProto() {
                return InfoTag.Type.TYPE_INFORM;
            }
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/InfoTagDto.TypeDto.TYPE_INLINE", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "toProto", "Lrh_server_driven_ui/v1/InfoTag$Type;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_INLINE extends TypeDto {
            TYPE_INLINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InfoTag.Type toProto() {
                return InfoTag.Type.TYPE_INLINE;
            }
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/InfoTagDto.TypeDto.TYPE_GOLD", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "toProto", "Lrh_server_driven_ui/v1/InfoTag$Type;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_GOLD extends TypeDto {
            TYPE_GOLD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InfoTag.Type toProto() {
                return InfoTag.Type.TYPE_GOLD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "Lrh_server_driven_ui/v1/InfoTag$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, InfoTag.Type> {

            /* compiled from: InfoTagDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InfoTag.Type.values().length];
                    try {
                        iArr[InfoTag.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InfoTag.Type.TYPE_ALERT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InfoTag.Type.TYPE_INFORM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[InfoTag.Type.TYPE_INLINE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[InfoTag.Type.TYPE_GOLD.ordinal()] = 5;
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

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InfoTag.Type> getProtoAdapter() {
                return InfoTag.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(InfoTag.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TypeDto.TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TypeDto.TYPE_ALERT;
                }
                if (i == 3) {
                    return TypeDto.TYPE_INFORM;
                }
                if (i == 4) {
                    return TypeDto.TYPE_INLINE;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return TypeDto.TYPE_GOLD;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/InfoTagDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, InfoTag.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.InfoTag.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: InfoTagDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/InfoTagDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/InfoTagDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<InfoTagDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.InfoTag", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InfoTagDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InfoTagDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InfoTagDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTagDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.InfoTagDto";
        }
    }
}
