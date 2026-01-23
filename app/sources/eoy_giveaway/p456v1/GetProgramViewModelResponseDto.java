package eoy_giveaway.p456v1;

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
import eoy_giveaway.p456v1.GetProgramViewModelResponse;
import eoy_giveaway.p456v1.GetProgramViewModelResponseDto;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetProgramViewModelResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,+-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u00060"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Leoy_giveaway/v1/GetProgramViewModelResponse;", "Landroid/os/Parcelable;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;", "surrogate", "<init>", "(Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;)V", "", "canvas_url", "", "show_overlay", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "close_button_location", "calendar_button_location", "show_pending_gift_indicator", "(Ljava/lang/String;ZLeoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Z)V", "toProto", "()Leoy_giveaway/v1/GetProgramViewModelResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;", "getCanvas_url", "getShow_overlay", "()Z", "getClose_button_location", "()Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "getCalendar_button_location", "getShow_pending_gift_indicator", "Companion", "Surrogate", "CloseButtonLocationDto", "Serializer", "MultibindingModule", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class GetProgramViewModelResponseDto implements Dto3<GetProgramViewModelResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetProgramViewModelResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetProgramViewModelResponseDto, GetProgramViewModelResponse>> binaryBase64Serializer$delegate;
    private static final GetProgramViewModelResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetProgramViewModelResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetProgramViewModelResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCanvas_url() {
        return this.surrogate.getCanvas_url();
    }

    public final boolean getShow_overlay() {
        return this.surrogate.getShow_overlay();
    }

    public final CloseButtonLocationDto getClose_button_location() {
        return this.surrogate.getClose_button_location();
    }

    public final CloseButtonLocationDto getCalendar_button_location() {
        return this.surrogate.getCalendar_button_location();
    }

    public final boolean getShow_pending_gift_indicator() {
        return this.surrogate.getShow_pending_gift_indicator();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetProgramViewModelResponseDto(java.lang.String r2, boolean r3, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r4, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L16
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto$Companion r4 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.INSTANCE
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r4 = r4.getZeroValue()
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L20
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto$Companion r5 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.INSTANCE
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r5 = r5.getZeroValue()
        L20:
            r7 = r7 & 16
            if (r7 == 0) goto L2b
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L31
        L2b:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L31:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eoy_giveaway.p456v1.GetProgramViewModelResponseDto.<init>(java.lang.String, boolean, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetProgramViewModelResponseDto(String canvas_url, boolean z, CloseButtonLocationDto close_button_location, CloseButtonLocationDto calendar_button_location, boolean z2) {
        this(new Surrogate(canvas_url, z, close_button_location, calendar_button_location, z2));
        Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
        Intrinsics.checkNotNullParameter(close_button_location, "close_button_location");
        Intrinsics.checkNotNullParameter(calendar_button_location, "calendar_button_location");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetProgramViewModelResponse toProto() {
        return new GetProgramViewModelResponse(this.surrogate.getCanvas_url(), this.surrogate.getShow_overlay(), (GetProgramViewModelResponse.CloseButtonLocation) this.surrogate.getClose_button_location().toProto(), (GetProgramViewModelResponse.CloseButtonLocation) this.surrogate.getCalendar_button_location().toProto(), this.surrogate.getShow_pending_gift_indicator(), null, 32, null);
    }

    public String toString() {
        return "[GetProgramViewModelResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetProgramViewModelResponseDto) && Intrinsics.areEqual(((GetProgramViewModelResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetProgramViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010+R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b0\u0010$\u001a\u0004\b/\u0010'¨\u00063"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;", "", "", "canvas_url", "", "show_overlay", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "close_button_location", "calendar_button_location", "show_pending_gift_indicator", "<init>", "(Ljava/lang/String;ZLeoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLeoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$eoy_giveaway_v1_externalRelease", "(Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCanvas_url", "getCanvas_url$annotations", "()V", "Z", "getShow_overlay", "()Z", "getShow_overlay$annotations", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "getClose_button_location", "()Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "getClose_button_location$annotations", "getCalendar_button_location", "getCalendar_button_location$annotations", "getShow_pending_gift_indicator", "getShow_pending_gift_indicator$annotations", "Companion", "$serializer", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CloseButtonLocationDto calendar_button_location;
        private final String canvas_url;
        private final CloseButtonLocationDto close_button_location;
        private final boolean show_overlay;
        private final boolean show_pending_gift_indicator;

        public Surrogate() {
            this((String) null, false, (CloseButtonLocationDto) null, (CloseButtonLocationDto) null, false, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.canvas_url, surrogate.canvas_url) && this.show_overlay == surrogate.show_overlay && this.close_button_location == surrogate.close_button_location && this.calendar_button_location == surrogate.calendar_button_location && this.show_pending_gift_indicator == surrogate.show_pending_gift_indicator;
        }

        public int hashCode() {
            return (((((((this.canvas_url.hashCode() * 31) + Boolean.hashCode(this.show_overlay)) * 31) + this.close_button_location.hashCode()) * 31) + this.calendar_button_location.hashCode()) * 31) + Boolean.hashCode(this.show_pending_gift_indicator);
        }

        public String toString() {
            return "Surrogate(canvas_url=" + this.canvas_url + ", show_overlay=" + this.show_overlay + ", close_button_location=" + this.close_button_location + ", calendar_button_location=" + this.calendar_button_location + ", show_pending_gift_indicator=" + this.show_pending_gift_indicator + ")";
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetProgramViewModelResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, CloseButtonLocationDto closeButtonLocationDto, CloseButtonLocationDto closeButtonLocationDto2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            this.canvas_url = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.show_overlay = false;
            } else {
                this.show_overlay = z;
            }
            if ((i & 4) == 0) {
                this.close_button_location = CloseButtonLocationDto.INSTANCE.getZeroValue();
            } else {
                this.close_button_location = closeButtonLocationDto;
            }
            if ((i & 8) == 0) {
                this.calendar_button_location = CloseButtonLocationDto.INSTANCE.getZeroValue();
            } else {
                this.calendar_button_location = closeButtonLocationDto2;
            }
            if ((i & 16) == 0) {
                this.show_pending_gift_indicator = false;
            } else {
                this.show_pending_gift_indicator = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$eoy_giveaway_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.canvas_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.canvas_url);
            }
            boolean z = self.show_overlay;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            CloseButtonLocationDto closeButtonLocationDto = self.close_button_location;
            CloseButtonLocationDto.Companion companion = CloseButtonLocationDto.INSTANCE;
            if (closeButtonLocationDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CloseButtonLocationDto.Serializer.INSTANCE, self.close_button_location);
            }
            if (self.calendar_button_location != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CloseButtonLocationDto.Serializer.INSTANCE, self.calendar_button_location);
            }
            boolean z2 = self.show_pending_gift_indicator;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 4, z2);
            }
        }

        public Surrogate(String canvas_url, boolean z, CloseButtonLocationDto close_button_location, CloseButtonLocationDto calendar_button_location, boolean z2) {
            Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
            Intrinsics.checkNotNullParameter(close_button_location, "close_button_location");
            Intrinsics.checkNotNullParameter(calendar_button_location, "calendar_button_location");
            this.canvas_url = canvas_url;
            this.show_overlay = z;
            this.close_button_location = close_button_location;
            this.calendar_button_location = calendar_button_location;
            this.show_pending_gift_indicator = z2;
        }

        public final String getCanvas_url() {
            return this.canvas_url;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, boolean r3, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r4, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L16
                eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto$Companion r4 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.INSTANCE
                eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r4 = r4.getZeroValue()
            L16:
                r8 = r7 & 8
                if (r8 == 0) goto L20
                eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto$Companion r5 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.INSTANCE
                eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r5 = r5.getZeroValue()
            L20:
                r7 = r7 & 16
                if (r7 == 0) goto L2b
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L31
            L2b:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L31:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eoy_giveaway.p456v1.GetProgramViewModelResponseDto.Surrogate.<init>(java.lang.String, boolean, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final boolean getShow_overlay() {
            return this.show_overlay;
        }

        public final CloseButtonLocationDto getClose_button_location() {
            return this.close_button_location;
        }

        public final CloseButtonLocationDto getCalendar_button_location() {
            return this.calendar_button_location;
        }

        public final boolean getShow_pending_gift_indicator() {
            return this.show_pending_gift_indicator;
        }
    }

    /* compiled from: GetProgramViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto;", "Leoy_giveaway/v1/GetProgramViewModelResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Leoy_giveaway/v1/GetProgramViewModelResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetProgramViewModelResponseDto, GetProgramViewModelResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetProgramViewModelResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetProgramViewModelResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetProgramViewModelResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetProgramViewModelResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetProgramViewModelResponse> getProtoAdapter() {
            return GetProgramViewModelResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetProgramViewModelResponseDto getZeroValue() {
            return GetProgramViewModelResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetProgramViewModelResponseDto fromProto(GetProgramViewModelResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String canvas_url = proto.getCanvas_url();
            boolean show_overlay = proto.getShow_overlay();
            CloseButtonLocationDto.Companion companion = CloseButtonLocationDto.INSTANCE;
            return new GetProgramViewModelResponseDto(new Surrogate(canvas_url, show_overlay, companion.fromProto(proto.getClose_button_location()), companion.fromProto(proto.getCalendar_button_location()), proto.getShow_pending_gift_indicator()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: eoy_giveaway.v1.GetProgramViewModelResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetProgramViewModelResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetProgramViewModelResponseDto(null, false, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetProgramViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "Lcom/robinhood/idl/EnumDto;", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LOCATION_UNSPECIFIED", "HIDDEN", "LEFT", "RIGHT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CloseButtonLocationDto implements Dto2<GetProgramViewModelResponse.CloseButtonLocation>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CloseButtonLocationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CloseButtonLocationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CloseButtonLocationDto, GetProgramViewModelResponse.CloseButtonLocation>> binaryBase64Serializer$delegate;
        public static final CloseButtonLocationDto LOCATION_UNSPECIFIED = new LOCATION_UNSPECIFIED("LOCATION_UNSPECIFIED", 0);
        public static final CloseButtonLocationDto HIDDEN = new HIDDEN("HIDDEN", 1);
        public static final CloseButtonLocationDto LEFT = new LEFT("LEFT", 2);
        public static final CloseButtonLocationDto RIGHT = new RIGHT("RIGHT", 3);

        private static final /* synthetic */ CloseButtonLocationDto[] $values() {
            return new CloseButtonLocationDto[]{LOCATION_UNSPECIFIED, HIDDEN, LEFT, RIGHT};
        }

        public /* synthetic */ CloseButtonLocationDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CloseButtonLocationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CloseButtonLocationDto(String str, int i) {
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"eoy_giveaway/v1/GetProgramViewModelResponseDto.CloseButtonLocationDto.LOCATION_UNSPECIFIED", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "toProto", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOCATION_UNSPECIFIED extends CloseButtonLocationDto {
            LOCATION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetProgramViewModelResponse.CloseButtonLocation toProto() {
                return GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED;
            }
        }

        static {
            CloseButtonLocationDto[] closeButtonLocationDtoArr$values = $values();
            $VALUES = closeButtonLocationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(closeButtonLocationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetProgramViewModelResponseDto.CloseButtonLocationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"eoy_giveaway/v1/GetProgramViewModelResponseDto.CloseButtonLocationDto.HIDDEN", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "toProto", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIDDEN extends CloseButtonLocationDto {
            HIDDEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetProgramViewModelResponse.CloseButtonLocation toProto() {
                return GetProgramViewModelResponse.CloseButtonLocation.HIDDEN;
            }
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"eoy_giveaway/v1/GetProgramViewModelResponseDto.CloseButtonLocationDto.LEFT", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "toProto", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEFT extends CloseButtonLocationDto {
            LEFT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetProgramViewModelResponse.CloseButtonLocation toProto() {
                return GetProgramViewModelResponse.CloseButtonLocation.LEFT;
            }
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"eoy_giveaway/v1/GetProgramViewModelResponseDto.CloseButtonLocationDto.RIGHT", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "toProto", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RIGHT extends CloseButtonLocationDto {
            RIGHT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetProgramViewModelResponse.CloseButtonLocation toProto() {
                return GetProgramViewModelResponse.CloseButtonLocation.RIGHT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CloseButtonLocationDto, GetProgramViewModelResponse.CloseButtonLocation> {

            /* compiled from: GetProgramViewModelResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetProgramViewModelResponse.CloseButtonLocation.values().length];
                    try {
                        iArr[GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetProgramViewModelResponse.CloseButtonLocation.HIDDEN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GetProgramViewModelResponse.CloseButtonLocation.LEFT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GetProgramViewModelResponse.CloseButtonLocation.RIGHT.ordinal()] = 4;
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

            public final KSerializer<CloseButtonLocationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CloseButtonLocationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CloseButtonLocationDto> getBinaryBase64Serializer() {
                return (KSerializer) CloseButtonLocationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetProgramViewModelResponse.CloseButtonLocation> getProtoAdapter() {
                return GetProgramViewModelResponse.CloseButtonLocation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CloseButtonLocationDto getZeroValue() {
                return CloseButtonLocationDto.LOCATION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CloseButtonLocationDto fromProto(GetProgramViewModelResponse.CloseButtonLocation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CloseButtonLocationDto.LOCATION_UNSPECIFIED;
                }
                if (i == 2) {
                    return CloseButtonLocationDto.HIDDEN;
                }
                if (i == 3) {
                    return CloseButtonLocationDto.LEFT;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CloseButtonLocationDto.RIGHT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetProgramViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Serializer implements KSerializer<CloseButtonLocationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CloseButtonLocationDto, GetProgramViewModelResponse.CloseButtonLocation> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/eoy_giveaway.v1.GetProgramViewModelResponse.CloseButtonLocation", CloseButtonLocationDto.getEntries(), CloseButtonLocationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CloseButtonLocationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CloseButtonLocationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CloseButtonLocationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CloseButtonLocationDto valueOf(String str) {
            return (CloseButtonLocationDto) Enum.valueOf(CloseButtonLocationDto.class, str);
        }

        public static CloseButtonLocationDto[] values() {
            return (CloseButtonLocationDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GetProgramViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto;", "<init>", "()V", "surrogateSerializer", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<GetProgramViewModelResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/eoy_giveaway.v1.GetProgramViewModelResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetProgramViewModelResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetProgramViewModelResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetProgramViewModelResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetProgramViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "eoy_giveaway.v1.GetProgramViewModelResponseDto";
        }
    }
}
