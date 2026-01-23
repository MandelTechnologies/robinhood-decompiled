package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.DeepLinkActionDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.PriceChartDataDto;
import rh_server_driven_ui.p531v1.SubDisplayTextDto;

/* compiled from: CursorDataDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/CursorData;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;)V", "Lrh_server_driven_ui/v1/DisplayTextDto;", AnnotatedPrivateKey.LABEL, "secondary_label", "tertiary_label", "quaternary_label", "primary_value", "Lrh_server_driven_ui/v1/SubDisplayTextDto;", "secondary_value", "tertiary_value", "quaternary_value", "Lrh_server_driven_ui/v1/PriceChartDataDto;", "price_chart_data", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "action", "(Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/PriceChartDataDto;Lrh_server_driven_ui/v1/DeepLinkActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/CursorData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CursorDataDto implements Dto3<CursorData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CursorDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CursorDataDto, CursorData>> binaryBase64Serializer$delegate;
    private static final CursorDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CursorDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CursorDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CursorDataDto(DisplayTextDto displayTextDto, DisplayTextDto displayTextDto2, DisplayTextDto displayTextDto3, DisplayTextDto displayTextDto4, DisplayTextDto displayTextDto5, SubDisplayTextDto subDisplayTextDto, SubDisplayTextDto subDisplayTextDto2, SubDisplayTextDto subDisplayTextDto3, PriceChartDataDto priceChartDataDto, DeepLinkActionDto deepLinkActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : displayTextDto, (i & 2) != 0 ? null : displayTextDto2, (i & 4) != 0 ? null : displayTextDto3, (i & 8) != 0 ? null : displayTextDto4, (i & 16) != 0 ? null : displayTextDto5, (i & 32) != 0 ? null : subDisplayTextDto, (i & 64) != 0 ? null : subDisplayTextDto2, (i & 128) != 0 ? null : subDisplayTextDto3, (i & 256) != 0 ? null : priceChartDataDto, (i & 512) != 0 ? null : deepLinkActionDto);
    }

    public CursorDataDto(DisplayTextDto displayTextDto, DisplayTextDto displayTextDto2, DisplayTextDto displayTextDto3, DisplayTextDto displayTextDto4, DisplayTextDto displayTextDto5, SubDisplayTextDto subDisplayTextDto, SubDisplayTextDto subDisplayTextDto2, SubDisplayTextDto subDisplayTextDto3, PriceChartDataDto priceChartDataDto, DeepLinkActionDto deepLinkActionDto) {
        this(new Surrogate(displayTextDto, displayTextDto2, displayTextDto3, displayTextDto4, displayTextDto5, subDisplayTextDto, subDisplayTextDto2, subDisplayTextDto3, priceChartDataDto, deepLinkActionDto));
    }

    @Override // com.robinhood.idl.Dto
    public CursorData toProto() {
        DisplayTextDto label = this.surrogate.getLabel();
        DisplayText proto = label != null ? label.toProto() : null;
        DisplayTextDto secondary_label = this.surrogate.getSecondary_label();
        DisplayText proto2 = secondary_label != null ? secondary_label.toProto() : null;
        DisplayTextDto tertiary_label = this.surrogate.getTertiary_label();
        DisplayText proto3 = tertiary_label != null ? tertiary_label.toProto() : null;
        DisplayTextDto quaternary_label = this.surrogate.getQuaternary_label();
        DisplayText proto4 = quaternary_label != null ? quaternary_label.toProto() : null;
        DisplayTextDto primary_value = this.surrogate.getPrimary_value();
        DisplayText proto5 = primary_value != null ? primary_value.toProto() : null;
        SubDisplayTextDto secondary_value = this.surrogate.getSecondary_value();
        SubDisplayText proto6 = secondary_value != null ? secondary_value.toProto() : null;
        SubDisplayTextDto tertiary_value = this.surrogate.getTertiary_value();
        SubDisplayText proto7 = tertiary_value != null ? tertiary_value.toProto() : null;
        SubDisplayTextDto quaternary_value = this.surrogate.getQuaternary_value();
        SubDisplayText proto8 = quaternary_value != null ? quaternary_value.toProto() : null;
        PriceChartDataDto price_chart_data = this.surrogate.getPrice_chart_data();
        PriceChartData proto9 = price_chart_data != null ? price_chart_data.toProto() : null;
        DeepLinkActionDto action = this.surrogate.getAction();
        return new CursorData(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, action != null ? action.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[CursorDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CursorDataDto) && Intrinsics.areEqual(((CursorDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: CursorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b=\u0010-\u001a\u0004\b<\u00108R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;", "", "Lrh_server_driven_ui/v1/DisplayTextDto;", AnnotatedPrivateKey.LABEL, "secondary_label", "tertiary_label", "quaternary_label", "primary_value", "Lrh_server_driven_ui/v1/SubDisplayTextDto;", "secondary_value", "tertiary_value", "quaternary_value", "Lrh_server_driven_ui/v1/PriceChartDataDto;", "price_chart_data", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "action", "<init>", "(Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/PriceChartDataDto;Lrh_server_driven_ui/v1/DeepLinkActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/SubDisplayTextDto;Lrh_server_driven_ui/v1/PriceChartDataDto;Lrh_server_driven_ui/v1/DeepLinkActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DisplayTextDto;", "getLabel", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "getLabel$annotations", "()V", "getSecondary_label", "getSecondary_label$annotations", "getTertiary_label", "getTertiary_label$annotations", "getQuaternary_label", "getQuaternary_label$annotations", "getPrimary_value", "getPrimary_value$annotations", "Lrh_server_driven_ui/v1/SubDisplayTextDto;", "getSecondary_value", "()Lrh_server_driven_ui/v1/SubDisplayTextDto;", "getSecondary_value$annotations", "getTertiary_value", "getTertiary_value$annotations", "getQuaternary_value", "getQuaternary_value$annotations", "Lrh_server_driven_ui/v1/PriceChartDataDto;", "getPrice_chart_data", "()Lrh_server_driven_ui/v1/PriceChartDataDto;", "getPrice_chart_data$annotations", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "getAction", "()Lrh_server_driven_ui/v1/DeepLinkActionDto;", "getAction$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DeepLinkActionDto action;
        private final DisplayTextDto label;
        private final PriceChartDataDto price_chart_data;
        private final DisplayTextDto primary_value;
        private final DisplayTextDto quaternary_label;
        private final SubDisplayTextDto quaternary_value;
        private final DisplayTextDto secondary_label;
        private final SubDisplayTextDto secondary_value;
        private final DisplayTextDto tertiary_label;
        private final SubDisplayTextDto tertiary_value;

        public Surrogate() {
            this((DisplayTextDto) null, (DisplayTextDto) null, (DisplayTextDto) null, (DisplayTextDto) null, (DisplayTextDto) null, (SubDisplayTextDto) null, (SubDisplayTextDto) null, (SubDisplayTextDto) null, (PriceChartDataDto) null, (DeepLinkActionDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.label, surrogate.label) && Intrinsics.areEqual(this.secondary_label, surrogate.secondary_label) && Intrinsics.areEqual(this.tertiary_label, surrogate.tertiary_label) && Intrinsics.areEqual(this.quaternary_label, surrogate.quaternary_label) && Intrinsics.areEqual(this.primary_value, surrogate.primary_value) && Intrinsics.areEqual(this.secondary_value, surrogate.secondary_value) && Intrinsics.areEqual(this.tertiary_value, surrogate.tertiary_value) && Intrinsics.areEqual(this.quaternary_value, surrogate.quaternary_value) && Intrinsics.areEqual(this.price_chart_data, surrogate.price_chart_data) && Intrinsics.areEqual(this.action, surrogate.action);
        }

        public int hashCode() {
            DisplayTextDto displayTextDto = this.label;
            int iHashCode = (displayTextDto == null ? 0 : displayTextDto.hashCode()) * 31;
            DisplayTextDto displayTextDto2 = this.secondary_label;
            int iHashCode2 = (iHashCode + (displayTextDto2 == null ? 0 : displayTextDto2.hashCode())) * 31;
            DisplayTextDto displayTextDto3 = this.tertiary_label;
            int iHashCode3 = (iHashCode2 + (displayTextDto3 == null ? 0 : displayTextDto3.hashCode())) * 31;
            DisplayTextDto displayTextDto4 = this.quaternary_label;
            int iHashCode4 = (iHashCode3 + (displayTextDto4 == null ? 0 : displayTextDto4.hashCode())) * 31;
            DisplayTextDto displayTextDto5 = this.primary_value;
            int iHashCode5 = (iHashCode4 + (displayTextDto5 == null ? 0 : displayTextDto5.hashCode())) * 31;
            SubDisplayTextDto subDisplayTextDto = this.secondary_value;
            int iHashCode6 = (iHashCode5 + (subDisplayTextDto == null ? 0 : subDisplayTextDto.hashCode())) * 31;
            SubDisplayTextDto subDisplayTextDto2 = this.tertiary_value;
            int iHashCode7 = (iHashCode6 + (subDisplayTextDto2 == null ? 0 : subDisplayTextDto2.hashCode())) * 31;
            SubDisplayTextDto subDisplayTextDto3 = this.quaternary_value;
            int iHashCode8 = (iHashCode7 + (subDisplayTextDto3 == null ? 0 : subDisplayTextDto3.hashCode())) * 31;
            PriceChartDataDto priceChartDataDto = this.price_chart_data;
            int iHashCode9 = (iHashCode8 + (priceChartDataDto == null ? 0 : priceChartDataDto.hashCode())) * 31;
            DeepLinkActionDto deepLinkActionDto = this.action;
            return iHashCode9 + (deepLinkActionDto != null ? deepLinkActionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(label=" + this.label + ", secondary_label=" + this.secondary_label + ", tertiary_label=" + this.tertiary_label + ", quaternary_label=" + this.quaternary_label + ", primary_value=" + this.primary_value + ", secondary_value=" + this.secondary_value + ", tertiary_value=" + this.tertiary_value + ", quaternary_value=" + this.quaternary_value + ", price_chart_data=" + this.price_chart_data + ", action=" + this.action + ")";
        }

        /* compiled from: CursorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CursorDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DisplayTextDto displayTextDto, DisplayTextDto displayTextDto2, DisplayTextDto displayTextDto3, DisplayTextDto displayTextDto4, DisplayTextDto displayTextDto5, SubDisplayTextDto subDisplayTextDto, SubDisplayTextDto subDisplayTextDto2, SubDisplayTextDto subDisplayTextDto3, PriceChartDataDto priceChartDataDto, DeepLinkActionDto deepLinkActionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.label = null;
            } else {
                this.label = displayTextDto;
            }
            if ((i & 2) == 0) {
                this.secondary_label = null;
            } else {
                this.secondary_label = displayTextDto2;
            }
            if ((i & 4) == 0) {
                this.tertiary_label = null;
            } else {
                this.tertiary_label = displayTextDto3;
            }
            if ((i & 8) == 0) {
                this.quaternary_label = null;
            } else {
                this.quaternary_label = displayTextDto4;
            }
            if ((i & 16) == 0) {
                this.primary_value = null;
            } else {
                this.primary_value = displayTextDto5;
            }
            if ((i & 32) == 0) {
                this.secondary_value = null;
            } else {
                this.secondary_value = subDisplayTextDto;
            }
            if ((i & 64) == 0) {
                this.tertiary_value = null;
            } else {
                this.tertiary_value = subDisplayTextDto2;
            }
            if ((i & 128) == 0) {
                this.quaternary_value = null;
            } else {
                this.quaternary_value = subDisplayTextDto3;
            }
            if ((i & 256) == 0) {
                this.price_chart_data = null;
            } else {
                this.price_chart_data = priceChartDataDto;
            }
            if ((i & 512) == 0) {
                this.action = null;
            } else {
                this.action = deepLinkActionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DisplayTextDto displayTextDto = self.label;
            if (displayTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DisplayTextDto.Serializer.INSTANCE, displayTextDto);
            }
            DisplayTextDto displayTextDto2 = self.secondary_label;
            if (displayTextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DisplayTextDto.Serializer.INSTANCE, displayTextDto2);
            }
            DisplayTextDto displayTextDto3 = self.tertiary_label;
            if (displayTextDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DisplayTextDto.Serializer.INSTANCE, displayTextDto3);
            }
            DisplayTextDto displayTextDto4 = self.quaternary_label;
            if (displayTextDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DisplayTextDto.Serializer.INSTANCE, displayTextDto4);
            }
            DisplayTextDto displayTextDto5 = self.primary_value;
            if (displayTextDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DisplayTextDto.Serializer.INSTANCE, displayTextDto5);
            }
            SubDisplayTextDto subDisplayTextDto = self.secondary_value;
            if (subDisplayTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SubDisplayTextDto.Serializer.INSTANCE, subDisplayTextDto);
            }
            SubDisplayTextDto subDisplayTextDto2 = self.tertiary_value;
            if (subDisplayTextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SubDisplayTextDto.Serializer.INSTANCE, subDisplayTextDto2);
            }
            SubDisplayTextDto subDisplayTextDto3 = self.quaternary_value;
            if (subDisplayTextDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SubDisplayTextDto.Serializer.INSTANCE, subDisplayTextDto3);
            }
            PriceChartDataDto priceChartDataDto = self.price_chart_data;
            if (priceChartDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, PriceChartDataDto.Serializer.INSTANCE, priceChartDataDto);
            }
            DeepLinkActionDto deepLinkActionDto = self.action;
            if (deepLinkActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DeepLinkActionDto.Serializer.INSTANCE, deepLinkActionDto);
            }
        }

        public Surrogate(DisplayTextDto displayTextDto, DisplayTextDto displayTextDto2, DisplayTextDto displayTextDto3, DisplayTextDto displayTextDto4, DisplayTextDto displayTextDto5, SubDisplayTextDto subDisplayTextDto, SubDisplayTextDto subDisplayTextDto2, SubDisplayTextDto subDisplayTextDto3, PriceChartDataDto priceChartDataDto, DeepLinkActionDto deepLinkActionDto) {
            this.label = displayTextDto;
            this.secondary_label = displayTextDto2;
            this.tertiary_label = displayTextDto3;
            this.quaternary_label = displayTextDto4;
            this.primary_value = displayTextDto5;
            this.secondary_value = subDisplayTextDto;
            this.tertiary_value = subDisplayTextDto2;
            this.quaternary_value = subDisplayTextDto3;
            this.price_chart_data = priceChartDataDto;
            this.action = deepLinkActionDto;
        }

        public /* synthetic */ Surrogate(DisplayTextDto displayTextDto, DisplayTextDto displayTextDto2, DisplayTextDto displayTextDto3, DisplayTextDto displayTextDto4, DisplayTextDto displayTextDto5, SubDisplayTextDto subDisplayTextDto, SubDisplayTextDto subDisplayTextDto2, SubDisplayTextDto subDisplayTextDto3, PriceChartDataDto priceChartDataDto, DeepLinkActionDto deepLinkActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : displayTextDto, (i & 2) != 0 ? null : displayTextDto2, (i & 4) != 0 ? null : displayTextDto3, (i & 8) != 0 ? null : displayTextDto4, (i & 16) != 0 ? null : displayTextDto5, (i & 32) != 0 ? null : subDisplayTextDto, (i & 64) != 0 ? null : subDisplayTextDto2, (i & 128) != 0 ? null : subDisplayTextDto3, (i & 256) != 0 ? null : priceChartDataDto, (i & 512) != 0 ? null : deepLinkActionDto);
        }

        public final DisplayTextDto getLabel() {
            return this.label;
        }

        public final DisplayTextDto getSecondary_label() {
            return this.secondary_label;
        }

        public final DisplayTextDto getTertiary_label() {
            return this.tertiary_label;
        }

        public final DisplayTextDto getQuaternary_label() {
            return this.quaternary_label;
        }

        public final DisplayTextDto getPrimary_value() {
            return this.primary_value;
        }

        public final SubDisplayTextDto getSecondary_value() {
            return this.secondary_value;
        }

        public final SubDisplayTextDto getTertiary_value() {
            return this.tertiary_value;
        }

        public final SubDisplayTextDto getQuaternary_value() {
            return this.quaternary_value;
        }

        public final PriceChartDataDto getPrice_chart_data() {
            return this.price_chart_data;
        }

        public final DeepLinkActionDto getAction() {
            return this.action;
        }
    }

    /* compiled from: CursorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/CursorDataDto;", "Lrh_server_driven_ui/v1/CursorData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/CursorDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CursorDataDto, CursorData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CursorDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CursorDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CursorDataDto> getBinaryBase64Serializer() {
            return (KSerializer) CursorDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CursorData> getProtoAdapter() {
            return CursorData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CursorDataDto getZeroValue() {
            return CursorDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CursorDataDto fromProto(CursorData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DisplayText label = proto.getLabel();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DisplayTextDto displayTextDtoFromProto = label != null ? DisplayTextDto.INSTANCE.fromProto(label) : null;
            DisplayText secondary_label = proto.getSecondary_label();
            DisplayTextDto displayTextDtoFromProto2 = secondary_label != null ? DisplayTextDto.INSTANCE.fromProto(secondary_label) : null;
            DisplayText tertiary_label = proto.getTertiary_label();
            DisplayTextDto displayTextDtoFromProto3 = tertiary_label != null ? DisplayTextDto.INSTANCE.fromProto(tertiary_label) : null;
            DisplayText quaternary_label = proto.getQuaternary_label();
            DisplayTextDto displayTextDtoFromProto4 = quaternary_label != null ? DisplayTextDto.INSTANCE.fromProto(quaternary_label) : null;
            DisplayText primary_value = proto.getPrimary_value();
            DisplayTextDto displayTextDtoFromProto5 = primary_value != null ? DisplayTextDto.INSTANCE.fromProto(primary_value) : null;
            SubDisplayText secondary_value = proto.getSecondary_value();
            SubDisplayTextDto subDisplayTextDtoFromProto = secondary_value != null ? SubDisplayTextDto.INSTANCE.fromProto(secondary_value) : null;
            SubDisplayText tertiary_value = proto.getTertiary_value();
            SubDisplayTextDto subDisplayTextDtoFromProto2 = tertiary_value != null ? SubDisplayTextDto.INSTANCE.fromProto(tertiary_value) : null;
            SubDisplayText quaternary_value = proto.getQuaternary_value();
            SubDisplayTextDto subDisplayTextDtoFromProto3 = quaternary_value != null ? SubDisplayTextDto.INSTANCE.fromProto(quaternary_value) : null;
            PriceChartData price_chart_data = proto.getPrice_chart_data();
            PriceChartDataDto priceChartDataDtoFromProto = price_chart_data != null ? PriceChartDataDto.INSTANCE.fromProto(price_chart_data) : null;
            DeepLinkAction action = proto.getAction();
            return new CursorDataDto(new Surrogate(displayTextDtoFromProto, displayTextDtoFromProto2, displayTextDtoFromProto3, displayTextDtoFromProto4, displayTextDtoFromProto5, subDisplayTextDtoFromProto, subDisplayTextDtoFromProto2, subDisplayTextDtoFromProto3, priceChartDataDtoFromProto, action != null ? DeepLinkActionDto.INSTANCE.fromProto(action) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.CursorDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CursorDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CursorDataDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CursorDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CursorDataDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/CursorDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CursorDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.CursorData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CursorDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CursorDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CursorDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CursorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.CursorDataDto";
        }
    }
}
