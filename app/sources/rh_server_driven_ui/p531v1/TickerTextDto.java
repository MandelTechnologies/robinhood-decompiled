package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
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
import rh_server_driven_ui.p531v1.FontDto;
import rh_server_driven_ui.p531v1.TextAlignmentDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.TickerText;
import rh_server_driven_ui.p531v1.TickerTextDto;

/* compiled from: TickerTextDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005A@BCDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u00100R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010\u001f¨\u0006E"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TickerText;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "initial_value", "end_value", "Lrh_server_driven_ui/v1/FontDto;", "font", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", "animation_duration", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "text_alignment", "", "decimals_count", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "currency_code", "", "suffix", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrh_server_driven_ui/v1/FontDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/TextAlignmentDto;ILrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/TickerText;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;", "getInitial_value", "()Lcom/robinhood/idl/IdlDecimal;", "getEnd_value", "getFont", "()Lrh_server_driven_ui/v1/FontDto;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getAnimation_duration", "()F", "getText_alignment", "()Lrh_server_driven_ui/v1/TextAlignmentDto;", "getDecimals_count", "getCurrency_code", "()Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "getSuffix", "Companion", "Surrogate", "CurrencyDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class TickerTextDto implements Dto3<TickerText>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TickerTextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TickerTextDto, TickerText>> binaryBase64Serializer$delegate;
    private static final TickerTextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TickerTextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TickerTextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getInitial_value() {
        return this.surrogate.getInitial_value();
    }

    public final IdlDecimal getEnd_value() {
        return this.surrogate.getEnd_value();
    }

    public final FontDto getFont() {
        return this.surrogate.getFont();
    }

    public final TextStyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public final ThemedColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final float getAnimation_duration() {
        return this.surrogate.getAnimation_duration();
    }

    public final TextAlignmentDto getText_alignment() {
        return this.surrogate.getText_alignment();
    }

    public final int getDecimals_count() {
        return this.surrogate.getDecimals_count();
    }

    public final CurrencyDto getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public final String getSuffix() {
        return this.surrogate.getSuffix();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TickerTextDto(com.robinhood.idl.IdlDecimal r2, com.robinhood.idl.IdlDecimal r3, rh_server_driven_ui.p531v1.FontDto r4, rh_server_driven_ui.p531v1.TextStyleDto r5, rh_server_driven_ui.p531v1.ThemedColorDto r6, float r7, rh_server_driven_ui.p531v1.TextAlignmentDto r8, int r9, rh_server_driven_ui.v1.TickerTextDto.CurrencyDto r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            java.lang.String r0 = ""
            if (r13 == 0) goto Lb
            com.robinhood.idl.IdlDecimal r2 = new com.robinhood.idl.IdlDecimal
            r2.<init>(r0)
        Lb:
            r13 = r12 & 2
            if (r13 == 0) goto L14
            com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
            r3.<init>(r0)
        L14:
            r13 = r12 & 4
            if (r13 == 0) goto L1e
            rh_server_driven_ui.v1.FontDto$Companion r4 = rh_server_driven_ui.p531v1.FontDto.INSTANCE
            rh_server_driven_ui.v1.FontDto r4 = r4.getZeroValue()
        L1e:
            r13 = r12 & 8
            if (r13 == 0) goto L28
            rh_server_driven_ui.v1.TextStyleDto$Companion r5 = rh_server_driven_ui.p531v1.TextStyleDto.INSTANCE
            rh_server_driven_ui.v1.TextStyleDto r5 = r5.getZeroValue()
        L28:
            r13 = r12 & 16
            r0 = 0
            if (r13 == 0) goto L2e
            r6 = r0
        L2e:
            r13 = r12 & 32
            if (r13 == 0) goto L33
            r7 = 0
        L33:
            r13 = r12 & 64
            if (r13 == 0) goto L3d
            rh_server_driven_ui.v1.TextAlignmentDto$Companion r8 = rh_server_driven_ui.p531v1.TextAlignmentDto.INSTANCE
            rh_server_driven_ui.v1.TextAlignmentDto r8 = r8.getZeroValue()
        L3d:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L42
            r9 = 0
        L42:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L47
            r10 = r0
        L47:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L57
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L62
        L57:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L62:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TickerTextDto.<init>(com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, rh_server_driven_ui.v1.FontDto, rh_server_driven_ui.v1.TextStyleDto, rh_server_driven_ui.v1.ThemedColorDto, float, rh_server_driven_ui.v1.TextAlignmentDto, int, rh_server_driven_ui.v1.TickerTextDto$CurrencyDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TickerTextDto(IdlDecimal initial_value, IdlDecimal end_value, FontDto font, TextStyleDto style, ThemedColorDto themedColorDto, float f, TextAlignmentDto text_alignment, int i, CurrencyDto currencyDto, String str) {
        this(new Surrogate(initial_value, end_value, font, style, themedColorDto, f, text_alignment, i, currencyDto, str));
        Intrinsics.checkNotNullParameter(initial_value, "initial_value");
        Intrinsics.checkNotNullParameter(end_value, "end_value");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text_alignment, "text_alignment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TickerText toProto() {
        String stringValue = this.surrogate.getInitial_value().getStringValue();
        String stringValue2 = this.surrogate.getEnd_value().getStringValue();
        Font font = (Font) this.surrogate.getFont().toProto();
        TextStyle textStyle = (TextStyle) this.surrogate.getStyle().toProto();
        ThemedColorDto color = this.surrogate.getColor();
        ThemedColor proto = color != null ? color.toProto() : null;
        float animation_duration = this.surrogate.getAnimation_duration();
        TextAlignment textAlignment = (TextAlignment) this.surrogate.getText_alignment().toProto();
        int decimals_count = this.surrogate.getDecimals_count();
        CurrencyDto currency_code = this.surrogate.getCurrency_code();
        return new TickerText(stringValue, stringValue2, font, textStyle, proto, animation_duration, textAlignment, decimals_count, currency_code != null ? (TickerText.Currency) currency_code.toProto() : null, this.surrogate.getSuffix(), null, 1024, null);
    }

    public String toString() {
        return "[TickerTextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TickerTextDto) && Intrinsics.areEqual(((TickerTextDto) other).surrogate, this.surrogate);
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
    /* compiled from: TickerTextDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b*\b\u0083\b\u0018\u0000 V2\u00020\u0001:\u0002WVB\u00ad\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0013¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB{\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b7\u00105\u001a\u0004\b6\u00103R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b;\u00105\u001a\u0004\b9\u0010:R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b?\u00105\u001a\u0004\b=\u0010>R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bC\u00105\u001a\u0004\bA\u0010BR/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bG\u00105\u001a\u0004\bE\u0010FR \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010H\u0012\u0004\bK\u00105\u001a\u0004\bI\u0010JR/\u0010\u0015\u001a\u00110\u0013¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010L\u0012\u0004\bN\u00105\u001a\u0004\bM\u0010,R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010O\u0012\u0004\bR\u00105\u001a\u0004\bP\u0010QR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010S\u0012\u0004\bU\u00105\u001a\u0004\bT\u0010*¨\u0006X"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "initial_value", "end_value", "Lrh_server_driven_ui/v1/FontDto;", "font", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "animation_duration", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "text_alignment", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "decimals_count", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "currency_code", "", "suffix", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrh_server_driven_ui/v1/FontDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/TextAlignmentDto;ILrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrh_server_driven_ui/v1/FontDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/TextAlignmentDto;ILrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getInitial_value", "()Lcom/robinhood/idl/IdlDecimal;", "getInitial_value$annotations", "()V", "getEnd_value", "getEnd_value$annotations", "Lrh_server_driven_ui/v1/FontDto;", "getFont", "()Lrh_server_driven_ui/v1/FontDto;", "getFont$annotations", "Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "F", "getAnimation_duration", "()F", "getAnimation_duration$annotations", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "getText_alignment", "()Lrh_server_driven_ui/v1/TextAlignmentDto;", "getText_alignment$annotations", "I", "getDecimals_count", "getDecimals_count$annotations", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "getCurrency_code", "()Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "getCurrency_code$annotations", "Ljava/lang/String;", "getSuffix", "getSuffix$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float animation_duration;
        private final ThemedColorDto color;
        private final CurrencyDto currency_code;
        private final int decimals_count;
        private final IdlDecimal end_value;
        private final FontDto font;
        private final IdlDecimal initial_value;
        private final TextStyleDto style;
        private final String suffix;
        private final TextAlignmentDto text_alignment;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (FontDto) null, (TextStyleDto) null, (ThemedColorDto) null, 0.0f, (TextAlignmentDto) null, 0, (CurrencyDto) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.initial_value, surrogate.initial_value) && Intrinsics.areEqual(this.end_value, surrogate.end_value) && this.font == surrogate.font && this.style == surrogate.style && Intrinsics.areEqual(this.color, surrogate.color) && Float.compare(this.animation_duration, surrogate.animation_duration) == 0 && this.text_alignment == surrogate.text_alignment && this.decimals_count == surrogate.decimals_count && this.currency_code == surrogate.currency_code && Intrinsics.areEqual(this.suffix, surrogate.suffix);
        }

        public int hashCode() {
            int iHashCode = ((((((this.initial_value.hashCode() * 31) + this.end_value.hashCode()) * 31) + this.font.hashCode()) * 31) + this.style.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.color;
            int iHashCode2 = (((((((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + Float.hashCode(this.animation_duration)) * 31) + this.text_alignment.hashCode()) * 31) + Integer.hashCode(this.decimals_count)) * 31;
            CurrencyDto currencyDto = this.currency_code;
            int iHashCode3 = (iHashCode2 + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31;
            String str = this.suffix;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(initial_value=" + this.initial_value + ", end_value=" + this.end_value + ", font=" + this.font + ", style=" + this.style + ", color=" + this.color + ", animation_duration=" + this.animation_duration + ", text_alignment=" + this.text_alignment + ", decimals_count=" + this.decimals_count + ", currency_code=" + this.currency_code + ", suffix=" + this.suffix + ")";
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TickerTextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, FontDto fontDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, float f, TextAlignmentDto textAlignmentDto, int i2, CurrencyDto currencyDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.initial_value = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.end_value = new IdlDecimal("");
            } else {
                this.end_value = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.font = FontDto.INSTANCE.getZeroValue();
            } else {
                this.font = fontDto;
            }
            if ((i & 8) == 0) {
                this.style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.style = textStyleDto;
            }
            if ((i & 16) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
            if ((i & 32) == 0) {
                this.animation_duration = 0.0f;
            } else {
                this.animation_duration = f;
            }
            if ((i & 64) == 0) {
                this.text_alignment = TextAlignmentDto.INSTANCE.getZeroValue();
            } else {
                this.text_alignment = textAlignmentDto;
            }
            if ((i & 128) == 0) {
                this.decimals_count = 0;
            } else {
                this.decimals_count = i2;
            }
            if ((i & 256) == 0) {
                this.currency_code = null;
            } else {
                this.currency_code = currencyDto;
            }
            if ((i & 512) == 0) {
                this.suffix = null;
            } else {
                this.suffix = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.initial_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.initial_value);
            }
            if (!Intrinsics.areEqual(self.end_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.end_value);
            }
            if (self.font != FontDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, FontDto.Serializer.INSTANCE, self.font);
            }
            if (self.style != TextStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TextStyleDto.Serializer.INSTANCE, self.style);
            }
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (Float.compare(self.animation_duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 5, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.animation_duration));
            }
            if (self.text_alignment != TextAlignmentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TextAlignmentDto.Serializer.INSTANCE, self.text_alignment);
            }
            int i = self.decimals_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            CurrencyDto currencyDto = self.currency_code;
            if (currencyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, CurrencyDto.Serializer.INSTANCE, currencyDto);
            }
            String str = self.suffix;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(IdlDecimal initial_value, IdlDecimal end_value, FontDto font, TextStyleDto style, ThemedColorDto themedColorDto, float f, TextAlignmentDto text_alignment, int i, CurrencyDto currencyDto, String str) {
            Intrinsics.checkNotNullParameter(initial_value, "initial_value");
            Intrinsics.checkNotNullParameter(end_value, "end_value");
            Intrinsics.checkNotNullParameter(font, "font");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(text_alignment, "text_alignment");
            this.initial_value = initial_value;
            this.end_value = end_value;
            this.font = font;
            this.style = style;
            this.color = themedColorDto;
            this.animation_duration = f;
            this.text_alignment = text_alignment;
            this.decimals_count = i;
            this.currency_code = currencyDto;
            this.suffix = str;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.idl.IdlDecimal r2, com.robinhood.idl.IdlDecimal r3, rh_server_driven_ui.p531v1.FontDto r4, rh_server_driven_ui.p531v1.TextStyleDto r5, rh_server_driven_ui.p531v1.ThemedColorDto r6, float r7, rh_server_driven_ui.p531v1.TextAlignmentDto r8, int r9, rh_server_driven_ui.v1.TickerTextDto.CurrencyDto r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                java.lang.String r0 = ""
                if (r13 == 0) goto Lb
                com.robinhood.idl.IdlDecimal r2 = new com.robinhood.idl.IdlDecimal
                r2.<init>(r0)
            Lb:
                r13 = r12 & 2
                if (r13 == 0) goto L14
                com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                r3.<init>(r0)
            L14:
                r13 = r12 & 4
                if (r13 == 0) goto L1e
                rh_server_driven_ui.v1.FontDto$Companion r4 = rh_server_driven_ui.p531v1.FontDto.INSTANCE
                rh_server_driven_ui.v1.FontDto r4 = r4.getZeroValue()
            L1e:
                r13 = r12 & 8
                if (r13 == 0) goto L28
                rh_server_driven_ui.v1.TextStyleDto$Companion r5 = rh_server_driven_ui.p531v1.TextStyleDto.INSTANCE
                rh_server_driven_ui.v1.TextStyleDto r5 = r5.getZeroValue()
            L28:
                r13 = r12 & 16
                r0 = 0
                if (r13 == 0) goto L2e
                r6 = r0
            L2e:
                r13 = r12 & 32
                if (r13 == 0) goto L33
                r7 = 0
            L33:
                r13 = r12 & 64
                if (r13 == 0) goto L3d
                rh_server_driven_ui.v1.TextAlignmentDto$Companion r8 = rh_server_driven_ui.p531v1.TextAlignmentDto.INSTANCE
                rh_server_driven_ui.v1.TextAlignmentDto r8 = r8.getZeroValue()
            L3d:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L42
                r9 = 0
            L42:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L47
                r10 = r0
            L47:
                r12 = r12 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L57
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L62
            L57:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L62:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TickerTextDto.Surrogate.<init>(com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, rh_server_driven_ui.v1.FontDto, rh_server_driven_ui.v1.TextStyleDto, rh_server_driven_ui.v1.ThemedColorDto, float, rh_server_driven_ui.v1.TextAlignmentDto, int, rh_server_driven_ui.v1.TickerTextDto$CurrencyDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getInitial_value() {
            return this.initial_value;
        }

        public final IdlDecimal getEnd_value() {
            return this.end_value;
        }

        public final FontDto getFont() {
            return this.font;
        }

        public final TextStyleDto getStyle() {
            return this.style;
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }

        public final float getAnimation_duration() {
            return this.animation_duration;
        }

        public final TextAlignmentDto getText_alignment() {
            return this.text_alignment;
        }

        public final int getDecimals_count() {
            return this.decimals_count;
        }

        public final CurrencyDto getCurrency_code() {
            return this.currency_code;
        }

        public final String getSuffix() {
            return this.suffix;
        }
    }

    /* compiled from: TickerTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TickerTextDto;", "Lrh_server_driven_ui/v1/TickerText;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TickerTextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TickerTextDto, TickerText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TickerTextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TickerTextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TickerTextDto> getBinaryBase64Serializer() {
            return (KSerializer) TickerTextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TickerText> getProtoAdapter() {
            return TickerText.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TickerTextDto getZeroValue() {
            return TickerTextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TickerTextDto fromProto(TickerText proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getInitial_value());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getEnd_value());
            FontDto fontDtoFromProto = FontDto.INSTANCE.fromProto(proto.getFont());
            TextStyleDto textStyleDtoFromProto = TextStyleDto.INSTANCE.fromProto(proto.getStyle());
            ThemedColor color = proto.getColor();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null;
            float animation_duration = proto.getAnimation_duration();
            TextAlignmentDto textAlignmentDtoFromProto = TextAlignmentDto.INSTANCE.fromProto(proto.getText_alignment());
            int decimals_count = proto.getDecimals_count();
            TickerText.Currency currency_code = proto.getCurrency_code();
            return new TickerTextDto(new Surrogate(idlDecimal, idlDecimal2, fontDtoFromProto, textStyleDtoFromProto, themedColorDtoFromProto, animation_duration, textAlignmentDtoFromProto, decimals_count, currency_code != null ? CurrencyDto.INSTANCE.fromProto(currency_code) : null, proto.getSuffix()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TickerTextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TickerTextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TickerTextDto(null, null, null, null, null, 0.0f, null, 0, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TickerTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TickerText$Currency;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENCY_UNSPECIFIED", "USD", "GBP", "EUR", "SGD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyDto implements Dto2<TickerText.Currency>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurrencyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyDto, TickerText.Currency>> binaryBase64Serializer$delegate;
        public static final CurrencyDto CURRENCY_UNSPECIFIED = new CURRENCY_UNSPECIFIED("CURRENCY_UNSPECIFIED", 0);
        public static final CurrencyDto USD = new USD("USD", 1);
        public static final CurrencyDto GBP = new GBP("GBP", 2);
        public static final CurrencyDto EUR = new EUR("EUR", 3);
        public static final CurrencyDto SGD = new SGD("SGD", 4);

        private static final /* synthetic */ CurrencyDto[] $values() {
            return new CurrencyDto[]{CURRENCY_UNSPECIFIED, USD, GBP, EUR, SGD};
        }

        public /* synthetic */ CurrencyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurrencyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TickerTextDto.CurrencyDto.CURRENCY_UNSPECIFIED", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "toProto", "Lrh_server_driven_ui/v1/TickerText$Currency;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_UNSPECIFIED extends CurrencyDto {
            CURRENCY_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TickerText.Currency toProto() {
                return TickerText.Currency.CURRENCY_UNSPECIFIED;
            }
        }

        private CurrencyDto(String str, int i) {
        }

        static {
            CurrencyDto[] currencyDtoArr$values = $values();
            $VALUES = currencyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TickerTextDto$CurrencyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TickerTextDto.CurrencyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TickerTextDto.CurrencyDto.USD", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "toProto", "Lrh_server_driven_ui/v1/TickerText$Currency;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USD extends CurrencyDto {
            USD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TickerText.Currency toProto() {
                return TickerText.Currency.USD;
            }
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TickerTextDto.CurrencyDto.GBP", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "toProto", "Lrh_server_driven_ui/v1/TickerText$Currency;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GBP extends CurrencyDto {
            GBP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TickerText.Currency toProto() {
                return TickerText.Currency.GBP;
            }
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TickerTextDto.CurrencyDto.EUR", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "toProto", "Lrh_server_driven_ui/v1/TickerText$Currency;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EUR extends CurrencyDto {
            EUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TickerText.Currency toProto() {
                return TickerText.Currency.EUR;
            }
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TickerTextDto.CurrencyDto.SGD", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "toProto", "Lrh_server_driven_ui/v1/TickerText$Currency;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SGD extends CurrencyDto {
            SGD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TickerText.Currency toProto() {
                return TickerText.Currency.SGD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "Lrh_server_driven_ui/v1/TickerText$Currency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurrencyDto, TickerText.Currency> {

            /* compiled from: TickerTextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TickerText.Currency.values().length];
                    try {
                        iArr[TickerText.Currency.CURRENCY_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TickerText.Currency.USD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TickerText.Currency.GBP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TickerText.Currency.EUR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TickerText.Currency.SGD.ordinal()] = 5;
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

            public final KSerializer<CurrencyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TickerText.Currency> getProtoAdapter() {
                return TickerText.Currency.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyDto getZeroValue() {
                return CurrencyDto.CURRENCY_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyDto fromProto(TickerText.Currency proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurrencyDto.CURRENCY_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurrencyDto.USD;
                }
                if (i == 3) {
                    return CurrencyDto.GBP;
                }
                if (i == 4) {
                    return CurrencyDto.EUR;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurrencyDto.SGD;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TickerTextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TickerTextDto$CurrencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurrencyDto, TickerText.Currency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TickerText.Currency", CurrencyDto.getEntries(), CurrencyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurrencyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurrencyDto valueOf(String str) {
            return (CurrencyDto) Enum.valueOf(CurrencyDto.class, str);
        }

        public static CurrencyDto[] values() {
            return (CurrencyDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TickerTextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TickerTextDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TickerTextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TickerTextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TickerText", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TickerTextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TickerTextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TickerTextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TickerTextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerTextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TickerTextDto";
        }
    }
}
